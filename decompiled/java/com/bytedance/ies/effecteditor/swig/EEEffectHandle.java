package com.bytedance.ies.effecteditor.swig;

/* JADX INFO: loaded from: classes26.dex */
public class EEEffectHandle {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectEditorJniJNI.delete_EEEffectHandle(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public static EEEffectHandle Instance() {
        long jEEEffectHandle_Instance = EffectEditorJniJNI.EEEffectHandle_Instance();
        if (jEEEffectHandle_Instance == 0) {
            return null;
        }
        return new EEEffectHandle(jEEEffectHandle_Instance, false);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(EEEffectHandle eEEffectHandle) {
        if (eEEffectHandle == null) {
            return 0L;
        }
        return eEEffectHandle.swigCPtr;
    }

    public void setMETEffectHandleGetterPtr(EffectHandleGetter effectHandleGetter) {
        EffectEditorJniJNI.EEEffectHandle_setMETEffectHandleGetterPtr(this.swigCPtr, this, EffectHandleGetter.getCPtr(effectHandleGetter), effectHandleGetter);
    }

    public EEEffectHandle(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
