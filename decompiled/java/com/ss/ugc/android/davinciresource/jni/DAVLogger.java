package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class DAVLogger {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_DAVLogger(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DAVLogger() {
        this(DavinciResourceJniJNI.new_DAVLogger(), true);
    }

    public static DAVLogger obtain() {
        long jDAVLogger_obtain = DavinciResourceJniJNI.DAVLogger_obtain();
        if (jDAVLogger_obtain == 0) {
            return null;
        }
        return new DAVLogger(jDAVLogger_obtain, false);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(DAVLogger dAVLogger) {
        if (dAVLogger == null) {
            return 0L;
        }
        return dAVLogger.swigCPtr;
    }

    public void d(String str) {
        DavinciResourceJniJNI.DAVLogger_d(this.swigCPtr, this, str);
    }

    public void e(String str) {
        DavinciResourceJniJNI.DAVLogger_e(this.swigCPtr, this, str);
    }

    public void i(String str) {
        DavinciResourceJniJNI.DAVLogger_i(this.swigCPtr, this, str);
    }

    public void setDelegate(DAVLoggerFunc dAVLoggerFunc) {
        DavinciResourceJniJNI.DAVLogger_setDelegate(this.swigCPtr, this, DAVLoggerFunc.getCPtr(dAVLoggerFunc), dAVLoggerFunc);
    }

    public void setLogLevel(DAVLogLevel dAVLogLevel) {
        DavinciResourceJniJNI.DAVLogger_setLogLevel(this.swigCPtr, this, dAVLogLevel.swigValue());
    }

    public void v(String str) {
        DavinciResourceJniJNI.DAVLogger_v(this.swigCPtr, this, str);
    }

    public void w(String str) {
        DavinciResourceJniJNI.DAVLogger_w(this.swigCPtr, this, str);
    }

    public DAVLogger(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
