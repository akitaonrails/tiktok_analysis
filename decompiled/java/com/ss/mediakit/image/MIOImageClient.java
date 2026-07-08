package com.ss.mediakit.image;

import X.C1C7U;
import X.C2188811AlT;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.mediakit.image.MIOImageClient;
import com.ss.mediakit.image.MIOImageResponse;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.mediakit.medialoader.AVMDLDataLoaderListener;
import com.ss.mediakit.medialoader.AVMDLDataLoaderNotifyInfo;
import com.ss.mediakit.medialoader.AVMDLLog;
import com.ss.mediakit.net.AVMDLDNSParser;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class MIOImageClient implements AVMDLDataLoaderListener, IMIOImageClient {
    public final Map<String, MIOImageRequest> imageRequests;
    public AVMDLDataLoader innerDataLoader;
    public volatile ScheduledExecutorService streamExecutor;
    public final Map<String, MIOImageRequest> streamingRequests;
    public final AtomicInteger taskIdGenerator;
    public final ReentrantReadWriteLock.WriteLock writeLock;

    public static class ClientHolder {
        public static final MIOImageClient INSTANCE = new MIOImageClient();
    }

    @Override // com.ss.mediakit.medialoader.AVMDLDataLoaderListener
    public String getCheckSumInfo(String str) {
        return null;
    }

    @Override // com.ss.mediakit.medialoader.AVMDLDataLoaderListener
    public long getInt64Value(int i, long j) {
        return 0L;
    }

    @Override // com.ss.mediakit.medialoader.AVMDLDataLoaderListener
    public String getStringValue(int i, long j, String str) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.concurrent.ScheduledExecutorService getStreamExecutor() {
        /*
            r6 = this;
            java.util.concurrent.ScheduledExecutorService r0 = r6.streamExecutor
            if (r0 == 0) goto L5
            return r0
        L5:
            monitor-enter(r6)
            java.util.concurrent.ScheduledExecutorService r0 = r6.streamExecutor     // Catch: java.lang.Throwable -> L47
            if (r0 != 0) goto L43
            com.ss.mediakit.medialoader.AVMDLDataLoader r1 = r6.innerDataLoader     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto L22
            r0 = 115(0x73, float:1.61E-43)
            long r4 = r1.getLongValue(r0)     // Catch: java.lang.Throwable -> L47
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L22
            r1 = 64
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L22
            int r3 = (int) r4     // Catch: java.lang.Throwable -> L47
            goto L23
        L22:
            r3 = 4
        L23:
            X.1BzI r0 = new X.1BzI     // Catch: java.lang.Throwable -> L47
            r0.<init>()     // Catch: java.lang.Throwable -> L47
            java.util.concurrent.ScheduledExecutorService r0 = X.C786410Ut5.g4(r3, r0)     // Catch: java.lang.Throwable -> L47
            r6.streamExecutor = r0     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = "MIO_IMG"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L47
            java.lang.String r0 = "create stream executor, thread num: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L47
            r1.append(r3)     // Catch: java.lang.Throwable -> L47
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L47
            com.ss.mediakit.medialoader.AVMDLLog.d(r2, r0)     // Catch: java.lang.Throwable -> L47
        L43:
            java.util.concurrent.ScheduledExecutorService r0 = r6.streamExecutor     // Catch: java.lang.Throwable -> L47
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L47
            return r0
        L47:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L47
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L47
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.mediakit.image.MIOImageClient.getStreamExecutor():java.util.concurrent.ScheduledExecutorService");
    }

    @Override // com.ss.mediakit.image.IMIOImageClient
    public boolean isMIORunning() {
        AVMDLDataLoader aVMDLDataLoader = this.innerDataLoader;
        return aVMDLDataLoader != null && aVMDLDataLoader.isRunning();
    }

    public int nextGlobalTaskId() {
        return this.taskIdGenerator.getAndIncrement();
    }

    public MIOImageClient() {
        this.taskIdGenerator = new AtomicInteger(0);
        this.imageRequests = new ConcurrentHashMap();
        this.streamingRequests = new ConcurrentHashMap();
        this.writeLock = new ReentrantReadWriteLock().writeLock();
    }

    public void notifyMDLStart() {
        AVMDLDataLoader aVMDLDataLoader = AVMDLDataLoader.getInstance();
        this.innerDataLoader = aVMDLDataLoader;
        aVMDLDataLoader.setListener(108, this);
        AVMDLLog.d("MIO_IMG", "receive mdl start notification");
    }

    public static MIOImageClient getInstance() {
        return ClientHolder.INSTANCE;
    }

    public static /* synthetic */ Thread lambda$getStreamExecutor$0(Runnable runnable) {
        BPEAThread bPEAThread = new BPEAThread(runnable, "mio-img-stream");
        bPEAThread.setDaemon(true);
        return bPEAThread;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0078 A[PHI: r5
      0x0078: PHI (r5v2 com.ss.mediakit.image.MIOImageRequest) = (r5v1 com.ss.mediakit.image.MIOImageRequest), (r5v5 com.ss.mediakit.image.MIOImageRequest) binds: [B:13:0x006a, B:15:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void onRequestFinish(final com.ss.mediakit.medialoader.AVMDLDataLoaderNotifyInfo r9) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.mediakit.image.MIOImageClient.onRequestFinish(com.ss.mediakit.medialoader.AVMDLDataLoaderNotifyInfo):void");
    }

    private void onStreamComplete(AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo) {
        if (aVMDLDataLoaderNotifyInfo == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(aVMDLDataLoaderNotifyInfo.strParam);
            String string = JSONObjectProtectorUtils.getString(jSONObject, "task_id");
            final String strOptString = jSONObject.optString("task_log");
            if (TextUtils.isEmpty(string)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("stream complete, task_id empty. info: ");
                sbLIZ.append(aVMDLDataLoaderNotifyInfo.strParam);
                AVMDLLog.d("MIO_IMG", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            this.writeLock.lock();
            try {
                final MIOImageRequest mIOImageRequestRemove = this.streamingRequests.remove(string);
                this.writeLock.unlock();
                if (mIOImageRequestRemove == null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("stream complete, request not find. task_id: ");
                    sbLIZ2.append(string);
                    AVMDLLog.d("MIO_IMG", C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                getStreamExecutor().execute(new Runnable() { // from class: X.1BzJ
                    @Override // java.lang.Runnable
                    public final void run() {
                        MIOImageClient.lambda$onStreamComplete$3(mIOImageRequestRemove, strOptString);
                    }
                });
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("stream complete, dispatched onComplete. task_id: ");
                sbLIZ3.append(string);
                AVMDLLog.d("MIO_IMG", C2188811AlT.LIZIZ(sbLIZ3));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.writeLock.unlock();
                throw th;
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            AVMDLLog.d("MIO_IMG", e.toString());
        }
    }

    private void onStreamReady(AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo) {
        if (aVMDLDataLoaderNotifyInfo == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(aVMDLDataLoaderNotifyInfo.strParam);
            String string = JSONObjectProtectorUtils.getString(jSONObject, "task_id");
            final String strOptString = jSONObject.optString("task_log");
            if (TextUtils.isEmpty(string)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("stream ready, task_id empty. info: ");
                sbLIZ.append(aVMDLDataLoaderNotifyInfo.strParam);
                AVMDLLog.d("MIO_IMG", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            this.writeLock.lock();
            try {
                final MIOImageRequest mIOImageRequestRemove = this.imageRequests.remove(string);
                if (mIOImageRequestRemove != null) {
                    this.streamingRequests.put(string, mIOImageRequestRemove);
                }
                this.writeLock.unlock();
                if (mIOImageRequestRemove == null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("stream ready, request not find. task_id: ");
                    sbLIZ2.append(string);
                    AVMDLLog.d("MIO_IMG", C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                final long j = aVMDLDataLoaderNotifyInfo.parameter;
                final MIONativeInputStream mIONativeInputStream = new MIONativeInputStream(this.innerDataLoader, string, j);
                getStreamExecutor().execute(new Runnable() { // from class: X.1BzH
                    @Override // java.lang.Runnable
                    public final void run() {
                        MIOImageClient.lambda$onStreamReady$2(mIOImageRequestRemove, mIONativeInputStream, j, strOptString);
                    }
                });
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("stream ready, dispatched. task_id: ");
                sbLIZ3.append(string);
                sbLIZ3.append(", len: ");
                sbLIZ3.append(j);
                AVMDLLog.d("MIO_IMG", C2188811AlT.LIZIZ(sbLIZ3));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.writeLock.unlock();
                throw th;
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            AVMDLLog.d("MIO_IMG", e.toString());
        }
    }

    public int addImageRequest(MIOImageRequest mIOImageRequest) {
        if (!isMIORunning()) {
            if (mIOImageRequest != null) {
                mIOImageRequest.onFailure(MIOImageError.MIO_NOT_RUNNING);
            }
            AVMDLLog.d("MIO_IMG", "add request fail. mio not running");
            return -1;
        }
        if (mIOImageRequest == null) {
            AVMDLLog.d("MIO_IMG", "add request fail. request is null");
            return -2;
        }
        String queryString = mIOImageRequest.getQueryString();
        if (TextUtils.isEmpty(queryString)) {
            mIOImageRequest.onFailure(MIOImageError.INVALID_REQUEST_INFO);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("add request fail. query string is empty. task: ");
            sbLIZ.append(mIOImageRequest.getId());
            AVMDLLog.d("MIO_IMG", C2188811AlT.LIZIZ(sbLIZ));
            return -3;
        }
        this.writeLock.lock();
        try {
            if (this.imageRequests.containsKey(mIOImageRequest.getId())) {
                mIOImageRequest.onFailure(MIOImageError.TASK_ALREADY_EXIST);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("add request fail. task ");
                sbLIZ2.append(mIOImageRequest.getId());
                sbLIZ2.append(" already exist");
                AVMDLLog.d("MIO_IMG", C2188811AlT.LIZIZ(sbLIZ2));
                this.writeLock.unlock();
                return -4;
            }
            int iAddImageTask = this.innerDataLoader.addImageTask(queryString);
            if (iAddImageTask < 0) {
                mIOImageRequest.onFailure(MIOImageError.ADD_TASK_FAILED);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("add request fail. task: ");
                sbLIZ3.append(mIOImageRequest.getId());
                sbLIZ3.append(", native error: ");
                sbLIZ3.append(iAddImageTask);
                AVMDLLog.d("MIO_IMG", C2188811AlT.LIZIZ(sbLIZ3));
                this.writeLock.unlock();
                return -5;
            }
            this.imageRequests.put(mIOImageRequest.getId(), mIOImageRequest);
            this.writeLock.unlock();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("add request success. task: ");
            sbLIZ4.append(mIOImageRequest.getId());
            sbLIZ4.append(", query string: ");
            sbLIZ4.append(queryString);
            AVMDLLog.d("MIO_IMG", C2188811AlT.LIZIZ(sbLIZ4));
            return 0;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.writeLock.unlock();
            throw th;
        }
    }

    public int cancelImageRequest(String str) {
        if (!isMIORunning()) {
            AVMDLLog.d("MIO_IMG", "cancel request fail. mio not running");
            return -1;
        }
        if (TextUtils.isEmpty(str)) {
            AVMDLLog.d("MIO_IMG", "cancel request fail. request id is empty");
            return -2;
        }
        this.writeLock.lock();
        try {
            MIOImageRequest mIOImageRequestRemove = this.imageRequests.remove(str);
            boolean z = false;
            if (mIOImageRequestRemove == null) {
                mIOImageRequestRemove = this.streamingRequests.remove(str);
                if (mIOImageRequestRemove != null) {
                    z = true;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("cancel request fail. task ");
                    sbLIZ.append(str);
                    sbLIZ.append(" not exist");
                    AVMDLLog.d("MIO_IMG", C2188811AlT.LIZIZ(sbLIZ));
                    this.writeLock.unlock();
                    return -3;
                }
            }
            int iCancelImageTask = this.innerDataLoader.cancelImageTask(str);
            this.writeLock.unlock();
            if (!z) {
                mIOImageRequestRemove.onFailure(MIOImageError.TASK_CANCELED);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cancel request. task: ");
            sbLIZ2.append(str);
            sbLIZ2.append(", ret: ");
            sbLIZ2.append(iCancelImageTask);
            sbLIZ2.append(", streaming: ");
            sbLIZ2.append(z);
            AVMDLLog.d("MIO_IMG", C2188811AlT.LIZIZ(sbLIZ2));
            return iCancelImageTask;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.writeLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.mediakit.image.IMIOImageClient
    public IMIOImageRequest createImageRequest(MIOImageTaskConfig mIOImageTaskConfig) {
        if (!isMIORunning()) {
            AVMDLLog.d("MIO_IMG", "create image request error. mio not running");
            return null;
        }
        if (mIOImageTaskConfig != null && mIOImageTaskConfig.isValid()) {
            return new MIOImageRequest(mIOImageTaskConfig);
        }
        AVMDLLog.d("MIO_IMG", "create image request error. task config is null or invalid");
        return null;
    }

    @Override // com.ss.mediakit.medialoader.AVMDLDataLoaderListener
    public void onNotify(AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo) {
        if (aVMDLDataLoaderNotifyInfo == null) {
            AVMDLLog.d("MIO_IMG", "onNotify, info is null");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNotify, what: ");
        sbLIZ.append(aVMDLDataLoaderNotifyInfo.what);
        sbLIZ.append(", code: ");
        sbLIZ.append(aVMDLDataLoaderNotifyInfo.code);
        AVMDLLog.d("MIO_IMG", C2188811AlT.LIZIZ(sbLIZ));
        switch (aVMDLDataLoaderNotifyInfo.what) {
            case 1100:
            case 1101:
                onRequestFinish(aVMDLDataLoaderNotifyInfo);
                break;
            case 1102:
            default:
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onNotify, unknown event: ");
                sbLIZ2.append(aVMDLDataLoaderNotifyInfo.what);
                AVMDLLog.d("MIO_IMG", C2188811AlT.LIZIZ(sbLIZ2));
                break;
            case 1103:
                onStreamReady(aVMDLDataLoaderNotifyInfo);
                break;
            case 1104:
                onStreamComplete(aVMDLDataLoaderNotifyInfo);
                break;
        }
    }

    public static /* synthetic */ void lambda$onStreamComplete$3(MIOImageRequest mIOImageRequest, String str) {
        C1C7U.LIZ("MIOImageClient@523e.onStreamComplete$1L");
        MIOImageResponse.Builder builderNewBuilder = MIOImageResponse.newBuilder();
        builderNewBuilder.setCode(0);
        builderNewBuilder.setDetail(str);
        mIOImageRequest.onComplete(builderNewBuilder.build());
        C1C7U.LIZIZ("MIOImageClient@523e.onStreamComplete$1L");
    }

    public static /* synthetic */ void lambda$onRequestFinish$1(MIOImageRequest mIOImageRequest, AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo, String str) {
        C1C7U.LIZ("MIOImageClient@523e.onRequestFinish$1L");
        MIOImageResponse.Builder builderNewBuilder = MIOImageResponse.newBuilder();
        builderNewBuilder.setCode((int) aVMDLDataLoaderNotifyInfo.code);
        builderNewBuilder.setDesc("native error");
        builderNewBuilder.setDetail(str);
        mIOImageRequest.onComplete(builderNewBuilder.build());
        C1C7U.LIZIZ("MIOImageClient@523e.onRequestFinish$1L");
    }

    @Override // com.ss.mediakit.image.IMIOImageClient
    public void setPreDNS(String str, String str2, long j) {
        if (!isMIORunning()) {
            AVMDLLog.d("MIO_IMG", "set pre dns error. mio not running");
            return;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            HashMap map = new HashMap();
            map.put(str, str2);
            AVMDLDNSParser.updateDNSInfo((HashMap<String, String>) map, 0, 5);
            return;
        }
        AVMDLLog.d("MIO_IMG", "set pre dns error. illegal params");
    }

    public static /* synthetic */ void lambda$onStreamReady$2(MIOImageRequest mIOImageRequest, MIONativeInputStream mIONativeInputStream, long j, String str) {
        C1C7U.LIZ("MIOImageClient@523e.onStreamReady$1L");
        MIOImageResponse.Builder builderNewBuilder = MIOImageResponse.newBuilder();
        builderNewBuilder.setCode(0);
        builderNewBuilder.setData(new byte[0]);
        builderNewBuilder.setStream(mIONativeInputStream);
        builderNewBuilder.setLength(j);
        builderNewBuilder.setDetail(str);
        mIOImageRequest.onResponse(builderNewBuilder.build());
        C1C7U.LIZIZ("MIOImageClient@523e.onStreamReady$1L");
    }
}
