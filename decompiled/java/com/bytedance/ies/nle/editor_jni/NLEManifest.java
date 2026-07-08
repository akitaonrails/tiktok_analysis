package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEManifest {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_NLEManifest(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public NLEManifest() {
        this(NLEEditorJniJNI.new_NLEManifest(), true);
    }

    public static void registerNLEModelClass() {
        NLEEditorJniJNI.NLEManifest_registerNLEModelClass();
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEManifest nLEManifest) {
        if (nLEManifest == null) {
            return 0L;
        }
        return nLEManifest.swigCPtr;
    }

    public NLEManifest(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
