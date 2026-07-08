package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLELogger {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_NLELogger(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void initNativeLogger() {
        NLEEditorJniJNI.NLELogger_initNativeLogger(this.swigCPtr, this);
    }

    public NLELogger() {
        this(NLEEditorJniJNI.new_NLELogger(), true);
    }

    public static NLELogger obtain() {
        long jNLELogger_obtain = NLEEditorJniJNI.NLELogger_obtain();
        if (jNLELogger_obtain == 0) {
            return null;
        }
        return new NLELogger(jNLELogger_obtain, false);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLELogger nLELogger) {
        if (nLELogger == null) {
            return 0L;
        }
        return nLELogger.swigCPtr;
    }

    public void d(String str) {
        NLEEditorJniJNI.NLELogger_d(this.swigCPtr, this, str);
    }

    public void e(String str) {
        NLEEditorJniJNI.NLELogger_e(this.swigCPtr, this, str);
    }

    public void i(String str) {
        NLEEditorJniJNI.NLELogger_i(this.swigCPtr, this, str);
    }

    public void setLogLevel(LogLevel logLevel) {
        NLEEditorJniJNI.NLELogger_setLogLevel(this.swigCPtr, this, logLevel.swigValue());
    }

    public void v(String str) {
        NLEEditorJniJNI.NLELogger_v(this.swigCPtr, this, str);
    }

    public void w(String str) {
        NLEEditorJniJNI.NLELogger_w(this.swigCPtr, this, str);
    }

    public void wtf(String str) {
        NLEEditorJniJNI.NLELogger_wtf(this.swigCPtr, this, str);
    }

    public NLELogger(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void setDelegate(NLELoggerFunc nLELoggerFunc, boolean z) {
        NLEEditorJniJNI.NLELogger_setDelegate(this.swigCPtr, this, NLELoggerFunc.getCPtr(nLELoggerFunc), nLELoggerFunc, z);
    }
}
