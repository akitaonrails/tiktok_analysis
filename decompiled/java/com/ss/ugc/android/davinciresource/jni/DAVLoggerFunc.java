package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class DAVLoggerFunc {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_DAVLoggerFunc(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(DAVLoggerFunc dAVLoggerFunc) {
        if (dAVLoggerFunc == null) {
            return 0L;
        }
        return dAVLoggerFunc.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public DAVLoggerFunc(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onLog(DAVLogLevel dAVLogLevel, String str, SWIGTYPE_p_va_list sWIGTYPE_p_va_list) {
        DavinciResourceJniJNI.DAVLoggerFunc_onLog(this.swigCPtr, this, dAVLogLevel.swigValue(), str, SWIGTYPE_p_va_list.getCPtr(sWIGTYPE_p_va_list));
    }
}
