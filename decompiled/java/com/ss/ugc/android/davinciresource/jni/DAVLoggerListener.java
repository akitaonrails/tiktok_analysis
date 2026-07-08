package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class DAVLoggerListener extends DAVLoggerFunc {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.ss.ugc.android.davinciresource.jni.DAVLoggerFunc
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                DavinciResourceJniJNI.delete_DAVLoggerListener(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public void swigDirectorDisconnect() {
        swigSetCMemOwn(false);
        delete();
    }

    public void swigReleaseOwnership() {
        swigSetCMemOwn(false);
        DavinciResourceJniJNI.DAVLoggerListener_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        DavinciResourceJniJNI.DAVLoggerListener_change_ownership(this, this.swigCPtr, true);
    }

    public DAVLoggerListener() {
        this(DavinciResourceJniJNI.new_DAVLoggerListener(), true);
        DavinciResourceJniJNI.DAVLoggerListener_director_connect(this, this.swigCPtr, true, true);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVLoggerFunc
    public void finalize() {
        delete();
    }

    public static long getCPtr(DAVLoggerListener dAVLoggerListener) {
        if (dAVLoggerListener == null) {
            return 0L;
        }
        return dAVLoggerListener.swigCPtr;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVLoggerFunc
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public DAVLoggerListener(long j, boolean z) {
        super(DavinciResourceJniJNI.DAVLoggerListener_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public void onLog(DAVLogLevel dAVLogLevel, String str) {
        DavinciResourceJniJNI.DAVLoggerListener_onLog__SWIG_1(this.swigCPtr, this, dAVLogLevel.swigValue(), str);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVLoggerFunc
    public void onLog(DAVLogLevel dAVLogLevel, String str, SWIGTYPE_p_va_list sWIGTYPE_p_va_list) {
        if (getClass() == DAVLoggerListener.class) {
            DavinciResourceJniJNI.DAVLoggerListener_onLog__SWIG_0(this.swigCPtr, this, dAVLogLevel.swigValue(), str, SWIGTYPE_p_va_list.getCPtr(sWIGTYPE_p_va_list));
        } else {
            DavinciResourceJniJNI.DAVLoggerListener_onLogSwigExplicitDAVLoggerListener__SWIG_0(this.swigCPtr, this, dAVLogLevel.swigValue(), str, SWIGTYPE_p_va_list.getCPtr(sWIGTYPE_p_va_list));
        }
    }
}
