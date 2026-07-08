package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEResourceProtocol {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_NLEResourceProtocol(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public UnorderedMapStrStr getParameters() {
        return new UnorderedMapStrStr(NLEEditorJniJNI.NLEResourceProtocol_getParameters(this.swigCPtr, this), true);
    }

    public String getSourceFrom() {
        return NLEEditorJniJNI.NLEResourceProtocol_getSourceFrom(this.swigCPtr, this);
    }

    public String toResourceId() {
        return NLEEditorJniJNI.NLEResourceProtocol_toResourceId(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEResourceProtocol nLEResourceProtocol) {
        if (nLEResourceProtocol == null) {
            return 0L;
        }
        return nLEResourceProtocol.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEResourceProtocol(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
