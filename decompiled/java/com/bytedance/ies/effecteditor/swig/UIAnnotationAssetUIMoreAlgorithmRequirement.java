package com.bytedance.ies.effecteditor.swig;

/* JADX INFO: loaded from: classes36.dex */
public class UIAnnotationAssetUIMoreAlgorithmRequirement {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectEditorJniJNI.delete_UIAnnotationAssetUIMoreAlgorithmRequirement(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int getAlbumFilter() {
        return EffectEditorJniJNI.UIAnnotationAssetUIMoreAlgorithmRequirement_getAlbumFilter(this.swigCPtr, this);
    }

    public EEStdStringToStringUnorderedMapList getAlgPreprocess() {
        return new EEStdStringToStringUnorderedMapList(EffectEditorJniJNI.UIAnnotationAssetUIMoreAlgorithmRequirement_getAlgPreprocess(this.swigCPtr, this), true);
    }

    public EEStdStringVector getAlgs() {
        return new EEStdStringVector(EffectEditorJniJNI.UIAnnotationAssetUIMoreAlgorithmRequirement_getAlgs(this.swigCPtr, this), true);
    }

    public boolean getNeedAlgPreprocess() {
        return EffectEditorJniJNI.UIAnnotationAssetUIMoreAlgorithmRequirement_getNeedAlgPreprocess(this.swigCPtr, this);
    }

    public String getRelation() {
        return EffectEditorJniJNI.UIAnnotationAssetUIMoreAlgorithmRequirement_getRelation(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(UIAnnotationAssetUIMoreAlgorithmRequirement uIAnnotationAssetUIMoreAlgorithmRequirement) {
        if (uIAnnotationAssetUIMoreAlgorithmRequirement == null) {
            return 0L;
        }
        return uIAnnotationAssetUIMoreAlgorithmRequirement.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public UIAnnotationAssetUIMoreAlgorithmRequirement(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
