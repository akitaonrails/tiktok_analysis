package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLELoggerListener extends NLELoggerFunc {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLELoggerFunc
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLELoggerListener(j);
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
        NLEEditorJniJNI.NLELoggerListener_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEEditorJniJNI.NLELoggerListener_change_ownership(this, this.swigCPtr, true);
    }

    public NLELoggerListener() {
        this(NLEEditorJniJNI.new_NLELoggerListener(), true);
        NLEEditorJniJNI.NLELoggerListener_director_connect(this, this.swigCPtr, true, true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLELoggerFunc
    public void finalize() {
        delete();
    }

    public static long getCPtr(NLELoggerListener nLELoggerListener) {
        if (nLELoggerListener == null) {
            return 0L;
        }
        return nLELoggerListener.swigCPtr;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLELoggerFunc
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLELoggerListener(long j, boolean z) {
        super(NLEEditorJniJNI.NLELoggerListener_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public void onLog(LogLevel logLevel, String str) {
        NLEEditorJniJNI.NLELoggerListener_onLog__SWIG_1(this.swigCPtr, this, logLevel.swigValue(), str);
    }

    public void onLog(LogLevel logLevel, String str, SWIGTYPE_p_va_list sWIGTYPE_p_va_list) {
        if (getClass() == NLELoggerListener.class) {
            NLEEditorJniJNI.NLELoggerListener_onLog__SWIG_0(this.swigCPtr, this, logLevel.swigValue(), str, SWIGTYPE_p_va_list.getCPtr(sWIGTYPE_p_va_list));
        } else {
            NLEEditorJniJNI.NLELoggerListener_onLogSwigExplicitNLELoggerListener__SWIG_0(this.swigCPtr, this, logLevel.swigValue(), str, SWIGTYPE_p_va_list.getCPtr(sWIGTYPE_p_va_list));
        }
    }
}
