package com.bytedance.realx.base;

import X.C1C7U;
import X.C2179971ATj;
import X.C786410Ut5;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes21.dex */
public class ThreadUtils {

    /* JADX INFO: renamed from: com.bytedance.realx.base.ThreadUtils$1CaughtException, reason: invalid class name */
    public class C1CaughtException {
        public Exception e;
    }

    /* JADX INFO: renamed from: com.bytedance.realx.base.ThreadUtils$1Result, reason: invalid class name */
    public class C1Result {
        public V value;
    }

    public interface BlockingOperation {
        void run();
    }

    public static class ThreadChecker {
        public Thread thread = C786410Ut5.u3();

        public void detachThread() {
            this.thread = null;
        }

        public void checkIsOnValidThread() {
            if (this.thread == null) {
                this.thread = C786410Ut5.u3();
            }
            if (C786410Ut5.u3() != this.thread) {
                throw new IllegalStateException("Wrong thread");
            }
        }
    }

    public static void checkIsOnMainThread() {
        if (C786410Ut5.u3() != Looper.getMainLooper().getThread()) {
            throw new IllegalStateException("Not on main thread!");
        }
    }

    public static void awaitUninterruptibly(final CountDownLatch countDownLatch) {
        executeUninterruptibly(new BlockingOperation() { // from class: com.bytedance.realx.base.ThreadUtils.2
            @Override // com.bytedance.realx.base.ThreadUtils.BlockingOperation
            public void run() throws InterruptedException {
                countDownLatch.await();
            }
        });
    }

    public static void executeUninterruptibly(BlockingOperation blockingOperation) {
        boolean z = false;
        while (true) {
            try {
                blockingOperation.run();
                break;
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
                z = true;
            }
        }
        if (z) {
            C786410Ut5.u3().interrupt();
        }
    }

    public static void joinUninterruptibly(final Thread thread) {
        executeUninterruptibly(new BlockingOperation() { // from class: com.bytedance.realx.base.ThreadUtils.1
            @Override // com.bytedance.realx.base.ThreadUtils.BlockingOperation
            public void run() throws InterruptedException {
                ThreadMethodProxy.join(thread);
            }
        });
    }

    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zAwait = false;
        long jElapsedRealtime2 = j;
        boolean z = false;
        while (true) {
            try {
                zAwait = countDownLatch.await(jElapsedRealtime2, TimeUnit.MILLISECONDS);
                if (z) {
                }
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
                jElapsedRealtime2 = j - (SystemClock.elapsedRealtime() - jElapsedRealtime);
                if (jElapsedRealtime2 <= 0) {
                    break;
                }
                z = true;
            }
        }
        C786410Ut5.u3().interrupt();
        return zAwait;
    }

    public static StackTraceElement[] concatStackTraces(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[stackTraceElementArr.length + stackTraceElementArr2.length];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr3, 0, stackTraceElementArr.length);
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, stackTraceElementArr.length, stackTraceElementArr2.length);
        return stackTraceElementArr3;
    }

    public static <V> V invokeAtFrontUninterruptibly(Handler handler, final Callable<V> callable) {
        if (handler.getLooper().getThread() == C786410Ut5.u3()) {
            try {
                return callable.call();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException(e);
            }
        }
        final C1Result c1Result = new C1Result();
        final C1CaughtException c1CaughtException = new C1CaughtException();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        if (!C786410Ut5.LJJZZIII(handler, new Runnable() { // from class: com.bytedance.realx.base.ThreadUtils.3
            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("ThreadUtils@5b8c.invokeAtFrontUninterruptibly$5");
                com_bytedance_realx_base_ThreadUtils$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("ThreadUtils@5b8c.invokeAtFrontUninterruptibly$5");
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [V, java.lang.Object] */
            public void com_bytedance_realx_base_ThreadUtils$3__run$___twin___() {
                try {
                    c1Result.value = callable.call();
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    c1CaughtException.e = e2;
                }
                countDownLatch.countDown();
            }

            public static void com_bytedance_realx_base_ThreadUtils$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                try {
                    anonymousClass3.com_bytedance_realx_base_ThreadUtils$3__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        })) {
            return null;
        }
        awaitUninterruptibly(countDownLatch);
        if (c1CaughtException.e == null) {
            return c1Result.value;
        }
        RuntimeException runtimeException = new RuntimeException(c1CaughtException.e);
        runtimeException.setStackTrace(concatStackTraces(c1CaughtException.e.getStackTrace(), runtimeException.getStackTrace()));
        throw runtimeException;
    }

    public static boolean joinUninterruptibly(Thread thread, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        long jElapsedRealtime2 = j;
        while (jElapsedRealtime2 > 0) {
            try {
                ThreadMethodProxy.join(thread, jElapsedRealtime2);
                break;
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
                jElapsedRealtime2 = j - (SystemClock.elapsedRealtime() - jElapsedRealtime);
                z = true;
            }
        }
        if (z) {
            C786410Ut5.u3().interrupt();
        }
        return !ThreadMethodProxy.isAlive(thread);
    }

    public static void invokeAtFrontUninterruptibly(Handler handler, final Runnable runnable) {
        invokeAtFrontUninterruptibly(handler, new Callable<Void>() { // from class: com.bytedance.realx.base.ThreadUtils.4
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ Void call() {
                C1C7U.LIZ("ThreadUtils@5b8c.invokeAtFrontUninterruptibly$6");
                Void voidCall2 = call2();
                C1C7U.LIZIZ("ThreadUtils@5b8c.invokeAtFrontUninterruptibly$6");
                return voidCall2;
            }

            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
            public Void call2() {
                runnable.run();
                return null;
            }
        });
    }
}
