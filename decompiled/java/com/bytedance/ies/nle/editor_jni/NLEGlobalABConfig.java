package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEGlobalABConfig {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                throw new UnsupportedOperationException("C++ destructor does not have public access");
            }
            this.swigCPtr = 0L;
        }
    }

    public static NLEGlobalABConfig getInstance() {
        return new NLEGlobalABConfig(NLEEditorJniJNI.NLEGlobalABConfig_getInstance(), false);
    }

    public boolean getEnableLockStore() {
        return NLEEditorJniJNI.NLEGlobalABConfig_enableLockStore_get(this.swigCPtr, this);
    }

    public static long getCPtr(NLEGlobalABConfig nLEGlobalABConfig) {
        if (nLEGlobalABConfig == null) {
            return 0L;
        }
        return nLEGlobalABConfig.swigCPtr;
    }

    public void setEnableLockStore(boolean z) {
        NLEEditorJniJNI.NLEGlobalABConfig_enableLockStore_set(this.swigCPtr, this, z);
    }

    public NLEGlobalABConfig(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
