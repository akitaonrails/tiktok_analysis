package com.bytedance.ies.effecteditor.abtest.swig;

/* JADX INFO: loaded from: classes36.dex */
public class EEABTestGetter {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectEditorABTestJniJNI.delete_EEABTestGetter(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void swigDirectorDisconnect() {
        swigSetCMemOwn(false);
        delete();
    }

    public void swigReleaseOwnership() {
        swigSetCMemOwn(false);
        EffectEditorABTestJniJNI.EEABTestGetter_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        EffectEditorABTestJniJNI.EEABTestGetter_change_ownership(this, this.swigCPtr, true);
    }

    public boolean ameAutoRenderEnable() {
        return EffectEditorABTestJniJNI.EEABTestGetter_ameAutoRenderEnable(this.swigCPtr, this);
    }

    public boolean ameDisableFeatureExportOverwrite() {
        return EffectEditorABTestJniJNI.EEABTestGetter_ameDisableFeatureExportOverwrite(this.swigCPtr, this);
    }

    public int ameEEAssetLoadOptimizationType() {
        return EffectEditorABTestJniJNI.EEABTestGetter_ameEEAssetLoadOptimizationType(this.swigCPtr, this);
    }

    public boolean ameEnableEditMode() {
        return EffectEditorABTestJniJNI.EEABTestGetter_ameEnableEditMode(this.swigCPtr, this);
    }

    public boolean ameMakeupMaterialMultiInstantiationViaAMG() {
        return EffectEditorABTestJniJNI.EEABTestGetter_ameMakeupMaterialMultiInstantiationViaAMG(this.swigCPtr, this);
    }

    public boolean ameSupportDynamicAsset() {
        return EffectEditorABTestJniJNI.EEABTestGetter_ameSupportDynamicAsset(this.swigCPtr, this);
    }

    public int ameVFSOptimizationType() {
        return EffectEditorABTestJniJNI.EEABTestGetter_ameVFSOptimizationType(this.swigCPtr, this);
    }

    public boolean enableExportStickerUseEffectForMET() {
        return EffectEditorABTestJniJNI.EEABTestGetter_enableExportStickerUseEffectForMET(this.swigCPtr, this);
    }

    public EEABTestGetter() {
        this(EffectEditorABTestJniJNI.new_EEABTestGetter(), true);
        EffectEditorABTestJniJNI.EEABTestGetter_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(EEABTestGetter eEABTestGetter) {
        if (eEABTestGetter == null) {
            return 0L;
        }
        return eEABTestGetter.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public EEABTestGetter(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
