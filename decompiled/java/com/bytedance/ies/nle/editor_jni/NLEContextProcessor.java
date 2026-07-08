package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEContextProcessor {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLETemplateJNI.delete_NLEContextProcessor(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public NLEContextProcessor() {
        this(NLETemplateJNI.new_NLEContextProcessor(), true);
    }

    public static NLEContextProcessor processor() {
        long jNLEContextProcessor_processor = NLETemplateJNI.NLEContextProcessor_processor();
        if (jNLEContextProcessor_processor == 0) {
            return null;
        }
        return new NLEContextProcessor(jNLEContextProcessor_processor, false);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEContextProcessor nLEContextProcessor) {
        if (nLEContextProcessor == null) {
            return 0L;
        }
        return nLEContextProcessor.swigCPtr;
    }

    public String decrypt(String str) {
        return NLETemplateJNI.NLEContextProcessor_decrypt(this.swigCPtr, this, str);
    }

    public String encrypt(String str) {
        return NLETemplateJNI.NLEContextProcessor_encrypt(this.swigCPtr, this, str);
    }

    public void setDelegate(NLEContextProcessorFunc nLEContextProcessorFunc) {
        NLETemplateJNI.NLEContextProcessor_setDelegate(this.swigCPtr, this, NLEContextProcessorFunc.getCPtr(nLEContextProcessorFunc), nLEContextProcessorFunc);
    }

    public NLEContextProcessor(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
