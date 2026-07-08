package com.ss.ttlivestreamer.core.utils;

import X.C1273730jFb;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Looper;
import android.os.Process;
import android.util.AndroidRuntimeException;
import android.util.Log;
import ci3.a;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.Thread;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class NativeHandlerThread extends a implements Runnable {
    public boolean mIsAlive;
    public final boolean mIsNative;
    public Looper mLooper;
    public final String mName;
    public int mPriority;
    public volatile Thread.State mState;
    public int mTid;

    public static native int nativeCreatePThread(String str, Runnable runnable);

    @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
    public void run() {
        C1C7U.LIZ("NativeHandlerThread@b90d.run");
        com_ss_ttlivestreamer_core_utils_NativeHandlerThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        C1C7U.LIZIZ("NativeHandlerThread@b90d.run");
    }

    @Override // java.lang.Thread
    public synchronized void start() {
        if (this.mIsNative) {
            int iNativeCreatePThread = nativeCreatePThread(this.mName, this);
            if (iNativeCreatePThread != 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("event", "create_thread_fail");
                    jSONObject.put("thread_name", this.mName);
                    jSONObject.put("ret", iNativeCreatePThread);
                    jSONObject.put("current_thread", Monitor.nativeGetThreadCount());
                    jSONObject.put("current_vss", Monitor.nativeGetAppVSSKB());
                    jSONObject.put("current_rss", Monitor.nativeGetAppRSSKB());
                    AVLog.logKibana(6, "NativeHandlerThread", C786410Ut5.J3(jSONObject), null);
                    Thread.sleep(100L);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                throw new AndroidRuntimeException("OOM!", new Exception(C786410Ut5.J3(jSONObject)));
            }
        } else {
            super.start();
        }
    }

    public void com_ss_ttlivestreamer_core_utils_NativeHandlerThread__run$___twin___() {
        if (!this.mIsNative) {
            super.run();
            return;
        }
        this.mIsAlive = true;
        this.mTid = Process.myTid();
        Looper.prepare();
        synchronized (this) {
            try {
                this.mLooper = Looper.myLooper();
                notifyAll();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Process.setThreadPriority(this.mPriority);
        onLooperPrepared();
        this.mState = Thread.State.RUNNABLE;
        Looper.loop();
        this.mTid = -1;
        this.mIsAlive = false;
    }

    @Override // android.os.HandlerThread
    public Looper getLooper() {
        Looper looper;
        if (!this.mIsNative) {
            return super.getLooper();
        }
        synchronized (this) {
            while (true) {
                try {
                    looper = this.mLooper;
                    if (looper == null) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return looper;
    }

    @Override // java.lang.Thread
    public Thread.State getState() {
        return this.mIsNative ? this.mState : super.getState();
    }

    public boolean isThreadAlive() {
        return this.mIsNative ? this.mIsAlive : super.isAlive();
    }

    public void release() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Release Native thread:");
        sbLIZ.append(getName());
        AVLog.ioi("NativeHandlerThread", C2188811AlT.LIZIZ(sbLIZ));
        try {
            getLooper().quitSafely();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            getLooper().quit();
        }
    }

    @Override // android.os.HandlerThread
    public int getThreadId() {
        return this.mTid;
    }

    public NativeHandlerThread(String str) {
        this(str, 0);
    }

    public static void com_ss_ttlivestreamer_core_utils_NativeHandlerThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(NativeHandlerThread nativeHandlerThread) {
        try {
            nativeHandlerThread.com_ss_ttlivestreamer_core_utils_NativeHandlerThread__run$___twin___();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public static void onPThreadCreate(Runnable runnable) {
        if (runnable != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onNativeThreadStart:");
            sbLIZ.append(runnable);
            AVLog.ioi("NativeHandlerThread", C2188811AlT.LIZIZ(sbLIZ));
            try {
                runnable.run();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onNativeThreadStop:");
                sbLIZ2.append(runnable);
                AVLog.ioi("NativeHandlerThread", C2188811AlT.LIZIZ(sbLIZ2));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("onNativeThreadCrash:");
                sbLIZ3.append(Log.getStackTraceString(th));
                AVLog.e("NativeHandlerThread-Crash", C2188811AlT.LIZIZ(sbLIZ3));
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("onNativeThreadCrash: ");
                sbLIZ4.append(th);
                AVLog.logKibana(6, "NativeHandlerThread", C2188811AlT.LIZIZ(sbLIZ4), th);
                throw th;
            }
        }
    }

    public void setThreadName(String str) {
        if (!this.mIsNative) {
            super.setName(str);
            return;
        }
        throw new AndroidRuntimeException("NativeThread not support setThreadName");
    }

    public NativeHandlerThread(String str, int i) {
        super(str, i);
        this.mPriority = 1;
        this.mTid = -1;
        this.mName = str;
        this.mState = Thread.State.NEW;
        boolean z = C1273730jFb.LIZJ;
        this.mIsNative = z;
        if (z && i != 0) {
            this.mPriority = i;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Create a NativeHandlerThread ");
        sbLIZ.append(str);
        AVLog.iod("NativeHandlerThread", C2188811AlT.LIZIZ(sbLIZ));
    }
}
