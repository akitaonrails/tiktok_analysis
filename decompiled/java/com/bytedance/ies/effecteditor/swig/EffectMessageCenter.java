package com.bytedance.ies.effecteditor.swig;

/* JADX INFO: loaded from: classes26.dex */
public class EffectMessageCenter {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectEditorJniJNI.delete_EffectMessageCenter(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(EffectMessageCenter effectMessageCenter) {
        if (effectMessageCenter == null) {
            return 0L;
        }
        return effectMessageCenter.swigCPtr;
    }

    public EffectMessageCenter(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static void dispatchEffectMessage(long j, int i, int i2, String str) {
        EffectEditorJniJNI.EffectMessageCenter_dispatchEffectMessage(j, i, i2, str);
    }
}
