package com.bytedance.vcloud.strategy.drm;

import X.C1C7U;
import X.C786410Ut5;
import X.C807400Vlq;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes35.dex */
public final class NetworkDispatcher {
    public final Handler mDispatcher;
    public final HandlerThread mDispatcherThread;
    public int mMaxConcurrent;
    public int mMaxRetryCount;
    public int mRetryIntervalMs;
    public int mTimeoutMs;
    public final ExecutorService mWorker;
    public final ArrayDeque<Request<?>> mQueue = new ArrayDeque<>();
    public final HashMap<String, Request<?>> mPendingMap = new HashMap<>();
    public final HashMap<Request<?>, Runnable> mTimeoutMap = new HashMap<>();
    public final Metrics mMetrics = new Metrics();
    public int mRunningCount = 0;
    public volatile boolean mShutdown = false;

    public static final class Metrics {
        public int failureCount;
        public int retryCount;
        public int successCount;
        public int timeoutCount;
        public int totalRequests;

        public Map<String, Object> toMap() {
            HashMap map = new HashMap();
            map.put("drm_preload_request_count", Integer.valueOf(this.totalRequests));
            map.put("drm_preload_success_count", Integer.valueOf(this.successCount));
            map.put("drm_preload_failure_count", Integer.valueOf(this.failureCount));
            map.put("drm_preload_timeout_count", Integer.valueOf(this.timeoutCount));
            map.put("drm_preload_retry_count", Integer.valueOf(this.retryCount));
            return map;
        }

        public String toString() {
            return toMap().toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cancelAll$4() {
        C1C7U.LIZ("NetworkDispatcher@e33d.cancelAll$1L");
        Iterator<Request<?>> it2 = this.mQueue.iterator();
        while (it2.hasNext()) {
            dispatchResult(it2.next(), false, null);
        }
        this.mQueue.clear();
        this.mPendingMap.clear();
        C1C7U.LIZIZ("NetworkDispatcher@e33d.cancelAll$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$shutdown$5() {
        C1C7U.LIZ("NetworkDispatcher@e33d.shutdown$1L");
        this.mShutdown = true;
        Iterator<Request<?>> it2 = this.mQueue.iterator();
        while (it2.hasNext()) {
            dispatchResult(it2.next(), false, null);
        }
        this.mQueue.clear();
        this.mPendingMap.clear();
        this.mWorker.shutdownNow();
        this.mDispatcherThread.quitSafely();
        C1C7U.LIZIZ("NetworkDispatcher@e33d.shutdown$1L");
    }

    private void schedule() {
        Request<?> requestSelectHighestPriority;
        if (this.mShutdown) {
            return;
        }
        while (this.mRunningCount < this.mMaxConcurrent && !this.mQueue.isEmpty() && (requestSelectHighestPriority = selectHighestPriority()) != null) {
            this.mQueue.remove(requestSelectHighestPriority);
            String strRequestId = requestSelectHighestPriority.task.requestId();
            if (!TextUtils.isEmpty(strRequestId)) {
                this.mPendingMap.remove(strRequestId);
            }
            this.mRunningCount++;
            executeOnWorker(requestSelectHighestPriority);
        }
    }

    private Request<?> selectHighestPriority() {
        Request<?> request = null;
        for (Request<?> request2 : this.mQueue) {
            if (request == null || request2.compareTo(request) < 0) {
                request = request2;
            }
        }
        return request;
    }

    public void cancelAll() {
        post(new Runnable() { // from class: X.1Cml
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$cancelAll$4();
            }
        });
    }

    public Map<String, Object> getMetrics() {
        if (this.mShutdown) {
            return this.mMetrics.toMap();
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Map<String, Object>[] mapArr = new Map[1];
        post(new Runnable() { // from class: X.1Cmf
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$getMetrics$2(mapArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            C786410Ut5.u3().interrupt();
        }
        Map<String, Object> map = mapArr[0];
        return map == null ? new HashMap() : map;
    }

    public void shutdown() {
        post(new Runnable() { // from class: X.1Cmn
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$shutdown$5();
            }
        });
    }

    public static final class Request<T> implements Comparable<Request<?>> {
        public final NetworkCallback<T> callback;
        public int code = -1;
        public volatile boolean dispatched;
        public int epoch;
        public final CountDownLatch latch;
        public final RequestMetrics metrics;
        public long nextAvailableTime;
        public volatile T result;
        public int retryCount;
        public final NetworkTask<T> task;

        @Override // java.lang.Comparable
        public int compareTo(Request<?> request) {
            return this.task.priority().getOrder() - request.task.priority().getOrder();
        }

        public Request(NetworkTask<T> networkTask, NetworkCallback<T> networkCallback, CountDownLatch countDownLatch) {
            RequestMetrics requestMetrics = new RequestMetrics();
            this.metrics = requestMetrics;
            this.task = networkTask;
            this.callback = networkCallback;
            this.latch = countDownLatch;
            requestMetrics.startTimeMs = System.currentTimeMillis();
        }
    }

    private void cancelTimeout(Request<?> request) {
        Runnable runnableRemove = this.mTimeoutMap.remove(request);
        if (runnableRemove != null) {
            this.mDispatcher.removeCallbacks(runnableRemove);
        }
    }

    private void enqueue(Request<?> request) {
        this.mQueue.offer(request);
        String strRequestId = request.task.requestId();
        if (!TextUtils.isEmpty(strRequestId)) {
            this.mPendingMap.put(strRequestId, request);
        }
    }

    private <T> void executeOnWorker(final Request<T> request) {
        final int i = request.epoch;
        startTimeoutWatchdog(request);
        this.mWorker.execute(new Runnable() { // from class: X.1Cmh
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$executeOnWorker$7(request, i);
            }
        });
    }

    private <T> void handleFailure(Request<T> request) {
        if (request.dispatched) {
            return;
        }
        int i = request.retryCount;
        if (i < this.mMaxRetryCount) {
            int i2 = i + 1;
            request.retryCount = i2;
            this.mMetrics.retryCount++;
            request.metrics.retryCount++;
            long j = ((long) this.mRetryIntervalMs) * (1 << (i2 - 1));
            request.nextAvailableTime = System.currentTimeMillis() + j;
            request.epoch++;
            postDelayedRequeue(request, j);
        } else {
            request.epoch++;
            this.mMetrics.failureCount++;
            RequestMetrics requestMetrics = request.metrics;
            requestMetrics.success = false;
            requestMetrics.endTimeMs = System.currentTimeMillis();
            dispatchResult(request, false, null);
        }
        schedule();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cancel$3(String str) {
        C1C7U.LIZ("NetworkDispatcher@e33d.cancel$1L");
        Iterator<Request<?>> it2 = this.mQueue.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Request<?> next = it2.next();
            if (str.equals(next.task.requestId())) {
                this.mQueue.remove(next);
                this.mPendingMap.remove(str);
                dispatchResult(next, false, null);
                break;
            }
        }
        C1C7U.LIZIZ("NetworkDispatcher@e33d.cancel$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postDelayedRequeue$10(Request request) {
        C1C7U.LIZ("NetworkDispatcher@e33d.postDelayedRequeue$1L$1L");
        enqueue(request);
        schedule();
        C1C7U.LIZIZ("NetworkDispatcher@e33d.postDelayedRequeue$1L$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postDelayedRequeue$11(final Request request) {
        C1C7U.LIZ("NetworkDispatcher@e33d.postDelayedRequeue$1L");
        post(new Runnable() { // from class: X.1Cmi
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$postDelayedRequeue$10(request);
            }
        });
        C1C7U.LIZIZ("NetworkDispatcher@e33d.postDelayedRequeue$1L");
    }

    private void post(Runnable runnable) {
        C786410Ut5.LJJZZIII(this.mDispatcher, runnable);
    }

    private void startTimeoutWatchdog(final Request<?> request) {
        if (this.mTimeoutMs <= 0) {
            return;
        }
        final int i = request.epoch;
        Runnable runnable = new Runnable() { // from class: X.1Cmk
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$startTimeoutWatchdog$9(request, i);
            }
        };
        this.mTimeoutMap.put(request, runnable);
        C786410Ut5.LJLIIL(this.mTimeoutMs, this.mDispatcher, runnable);
    }

    public void cancel(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        post(new Runnable() { // from class: X.1Cmm
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$cancel$3(str);
            }
        });
    }

    public <T> NetworkResult<T> execute(final NetworkTask<T> networkTask) {
        if (this.mShutdown) {
            return null;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Request[] requestArr = new Request[1];
        post(new Runnable() { // from class: X.1Cmc
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$execute$1(networkTask, countDownLatch, requestArr);
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            C786410Ut5.u3().interrupt();
        }
        Request request = requestArr[0];
        if (request == null) {
            return null;
        }
        RequestMetrics requestMetrics = request.metrics;
        if (requestMetrics.success) {
            return NetworkResult.success(request.result, request.metrics);
        }
        return NetworkResult.failure(request.code, requestMetrics);
    }

    private <T> void finish(Request<T> request, NetworkResult<T> networkResult) {
        int i;
        this.mRunningCount--;
        request.metrics.endTimeMs = System.currentTimeMillis();
        if (networkResult != null) {
            if (networkResult.success) {
                request.epoch++;
                this.mMetrics.successCount++;
                request.metrics.success = true;
                request.result = networkResult.data;
                dispatchResult(request, true, networkResult.data);
                schedule();
                return;
            }
            i = networkResult.code;
        } else {
            i = -1;
        }
        request.code = i;
        handleFailure(request);
    }

    private <T> void handleTimeout(Request<T> request, int i) {
        int i2 = request.epoch;
        if (i != i2) {
            return;
        }
        request.epoch = i2 + 1;
        this.mMetrics.timeoutCount++;
        handleFailure(request);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$executeOnWorker$7(final Request request, final int i) {
        final NetworkResult networkResultExecute;
        C1C7U.LIZ("NetworkDispatcher@e33d.executeOnWorker$1L");
        try {
            networkResultExecute = request.task.execute();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            networkResultExecute = null;
        }
        post(new Runnable() { // from class: X.1Cme
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$executeOnWorker$6(i, request, networkResultExecute);
            }
        });
        C1C7U.LIZIZ("NetworkDispatcher@e33d.executeOnWorker$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getMetrics$2(Map[] mapArr, CountDownLatch countDownLatch) {
        C1C7U.LIZ("NetworkDispatcher@e33d.getMetrics$1L");
        mapArr[0] = this.mMetrics.toMap();
        countDownLatch.countDown();
        C1C7U.LIZIZ("NetworkDispatcher@e33d.getMetrics$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startTimeoutWatchdog$8(Request request, int i) {
        C1C7U.LIZ("NetworkDispatcher@e33d.startTimeoutWatchdog$1L$1L");
        handleTimeout(request, i);
        C1C7U.LIZIZ("NetworkDispatcher@e33d.startTimeoutWatchdog$1L$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startTimeoutWatchdog$9(final Request request, final int i) {
        C1C7U.LIZ("NetworkDispatcher@e33d.startTimeoutWatchdog$1L");
        post(new Runnable() { // from class: X.1Cmj
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$startTimeoutWatchdog$8(request, i);
            }
        });
        C1C7U.LIZIZ("NetworkDispatcher@e33d.startTimeoutWatchdog$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$submit$0(NetworkTask networkTask, NetworkCallback networkCallback) {
        C1C7U.LIZ("NetworkDispatcher@e33d.submit$1L");
        enqueue(new Request<>(networkTask, networkCallback, null));
        this.mMetrics.totalRequests++;
        schedule();
        C1C7U.LIZIZ("NetworkDispatcher@e33d.submit$1L");
    }

    private void postDelayedRequeue(final Request<?> request, long j) {
        C786410Ut5.LJLIIL(j, this.mDispatcher, new Runnable() { // from class: X.1Cmg
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$postDelayedRequeue$11(request);
            }
        });
    }

    public <T> void submit(final NetworkTask<T> networkTask, final NetworkCallback<T> networkCallback) {
        if (this.mShutdown) {
            return;
        }
        post(new Runnable() { // from class: X.1Cmd
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$submit$0(networkTask, networkCallback);
            }
        });
    }

    private <T> void dispatchResult(Request<T> request, boolean z, T t) {
        NetworkResult<T> networkResultFailure;
        if (request.dispatched) {
            return;
        }
        request.dispatched = true;
        if (request.callback != null) {
            if (z) {
                networkResultFailure = NetworkResult.success(t, request.metrics);
            } else {
                networkResultFailure = NetworkResult.failure(request.code, request.metrics);
            }
            request.callback.onComplete(networkResultFailure);
        }
        CountDownLatch countDownLatch = request.latch;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$1(NetworkTask networkTask, CountDownLatch countDownLatch, Request[] requestArr) {
        C1C7U.LIZ("NetworkDispatcher@e33d.execute$1L");
        Request request = new Request(networkTask, null, countDownLatch);
        requestArr[0] = request;
        enqueue(request);
        this.mMetrics.totalRequests++;
        schedule();
        C1C7U.LIZIZ("NetworkDispatcher@e33d.execute$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$executeOnWorker$6(int i, Request request, NetworkResult networkResult) {
        C1C7U.LIZ("NetworkDispatcher@e33d.executeOnWorker$1L$1L");
        if (i != request.epoch) {
            cancelTimeout(request);
            this.mRunningCount--;
            schedule();
            C1C7U.LIZIZ("NetworkDispatcher@e33d.executeOnWorker$1L$1L");
            return;
        }
        cancelTimeout(request);
        finish(request, networkResult);
        C1C7U.LIZIZ("NetworkDispatcher@e33d.executeOnWorker$1L$1L");
    }

    public NetworkDispatcher(int i, int i2, int i3, int i4) {
        this.mMaxConcurrent = 3;
        this.mMaxRetryCount = 2;
        this.mRetryIntervalMs = 50;
        this.mTimeoutMs = 5000;
        if (i > 0) {
            this.mMaxConcurrent = i;
        }
        if (i2 >= 0) {
            this.mMaxRetryCount = i2;
        }
        if (i3 >= 0) {
            this.mRetryIntervalMs = i3;
        }
        if (i4 > 0) {
            this.mTimeoutMs = i4;
        }
        this.mWorker = C807400Vlq.LIZ();
        HandlerThread handlerThread = new HandlerThread("NetworkDispatcher");
        this.mDispatcherThread = handlerThread;
        handlerThread.start();
        this.mDispatcher = new BPEAHandler(C786410Ut5.W2(handlerThread));
    }
}
