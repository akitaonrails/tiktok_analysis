package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEMonitorParamBuilder {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_NLEMonitorParamBuilder(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String buildParamString() {
        return NLEEditorJniJNI.NLEMonitorParamBuilder_buildParamString(this.swigCPtr, this);
    }

    public NLEMonitorParamBuilder() {
        this(NLEEditorJniJNI.new_NLEMonitorParamBuilder(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEMonitorParamBuilder nLEMonitorParamBuilder) {
        if (nLEMonitorParamBuilder == null) {
            return 0L;
        }
        return nLEMonitorParamBuilder.swigCPtr;
    }

    public NLEMonitorParamBuilder(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public NLEMonitorParamBuilder appendParam(String str, String str2) {
        long jNLEMonitorParamBuilder_appendParam = NLEEditorJniJNI.NLEMonitorParamBuilder_appendParam(this.swigCPtr, this, str, str2);
        if (jNLEMonitorParamBuilder_appendParam == 0) {
            return null;
        }
        return new NLEMonitorParamBuilder(jNLEMonitorParamBuilder_appendParam, false);
    }
}
