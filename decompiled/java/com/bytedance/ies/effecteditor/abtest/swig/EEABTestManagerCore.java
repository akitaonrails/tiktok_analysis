package com.bytedance.ies.effecteditor.abtest.swig;

/* JADX INFO: loaded from: classes36.dex */
public class EEABTestManagerCore {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectEditorABTestJniJNI.delete_EEABTestManagerCore(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(EEABTestManagerCore eEABTestManagerCore) {
        if (eEABTestManagerCore == null) {
            return 0L;
        }
        return eEABTestManagerCore.swigCPtr;
    }

    public static void registerABTestGetterPtr(EEABTestGetter eEABTestGetter) {
        EffectEditorABTestJniJNI.EEABTestManagerCore_registerABTestGetterPtr(EEABTestGetter.getCPtr(eEABTestGetter), eEABTestGetter);
    }

    public EEABTestManagerCore(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
