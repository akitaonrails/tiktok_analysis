package com.bytedance.ies.effecteditor.swig;

/* JADX INFO: loaded from: classes36.dex */
public class UIAnnotationAssetUIMore extends UIAnnotationUIMore {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationUIMore
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectEditorJniJNI.delete_UIAnnotationAssetUIMore(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public UIAnnotationAssetUIMoreAlgorithmRequirement getAlgorithmRequirement() {
        long jUIAnnotationAssetUIMore_getAlgorithmRequirement = EffectEditorJniJNI.UIAnnotationAssetUIMore_getAlgorithmRequirement(this.swigCPtr, this);
        if (jUIAnnotationAssetUIMore_getAlgorithmRequirement == 0) {
            return null;
        }
        return new UIAnnotationAssetUIMoreAlgorithmRequirement(jUIAnnotationAssetUIMore_getAlgorithmRequirement, true);
    }

    public UIAnnotationAssetType getAssetType() {
        return UIAnnotationAssetType.swigToEnum(EffectEditorJniJNI.UIAnnotationAssetUIMore_getAssetType(this.swigCPtr, this));
    }

    public UIAnnotationAssetUIMoreAutoCutting getAutoCutting() {
        long jUIAnnotationAssetUIMore_getAutoCutting = EffectEditorJniJNI.UIAnnotationAssetUIMore_getAutoCutting(this.swigCPtr, this);
        if (jUIAnnotationAssetUIMore_getAutoCutting == 0) {
            return null;
        }
        return new UIAnnotationAssetUIMoreAutoCutting(jUIAnnotationAssetUIMore_getAutoCutting, true);
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationUIMore
    public String getClassName() {
        return EffectEditorJniJNI.UIAnnotationAssetUIMore_getClassName(this.swigCPtr, this);
    }

    public EEStdStringVector getCurrentValue() {
        return new EEStdStringVector(EffectEditorJniJNI.UIAnnotationAssetUIMore_getCurrentValue(this.swigCPtr, this), true);
    }

    public String getFrom() {
        return EffectEditorJniJNI.UIAnnotationAssetUIMore_getFrom(this.swigCPtr, this);
    }

    public String getImgKey() {
        return EffectEditorJniJNI.UIAnnotationAssetUIMore_getImgKey(this.swigCPtr, this);
    }

    public EEStdStringVector getLastValue() {
        return new EEStdStringVector(EffectEditorJniJNI.UIAnnotationAssetUIMore_getLastValue(this.swigCPtr, this), true);
    }

    public int getMaxCount() {
        return EffectEditorJniJNI.UIAnnotationAssetUIMore_getMaxCount(this.swigCPtr, this);
    }

    public UIAnnotationAssetUIMoreMaxSize getMaxSize() {
        long jUIAnnotationAssetUIMore_getMaxSize = EffectEditorJniJNI.UIAnnotationAssetUIMore_getMaxSize(this.swigCPtr, this);
        if (jUIAnnotationAssetUIMore_getMaxSize == 0) {
            return null;
        }
        return new UIAnnotationAssetUIMoreMaxSize(jUIAnnotationAssetUIMore_getMaxSize, true);
    }

    public int getMinCount() {
        return EffectEditorJniJNI.UIAnnotationAssetUIMore_getMinCount(this.swigCPtr, this);
    }

    public boolean getNeedGuide() {
        return EffectEditorJniJNI.UIAnnotationAssetUIMore_getNeedGuide(this.swigCPtr, this);
    }

    public boolean getNeedLoading() {
        return EffectEditorJniJNI.UIAnnotationAssetUIMore_getNeedLoading(this.swigCPtr, this);
    }

    public EEStdStringVector getOriginalValue() {
        return new EEStdStringVector(EffectEditorJniJNI.UIAnnotationAssetUIMore_getOriginalValue(this.swigCPtr, this), true);
    }

    public boolean getShowOnStart() {
        return EffectEditorJniJNI.UIAnnotationAssetUIMore_getShowOnStart(this.swigCPtr, this);
    }

    public EEStdStringVector getSuffixes() {
        return new EEStdStringVector(EffectEditorJniJNI.UIAnnotationAssetUIMore_getSuffixes(this.swigCPtr, this), true);
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationUIMore
    public UIAnnotationUIType getUIType() {
        return UIAnnotationUIType.swigToEnum(EffectEditorJniJNI.UIAnnotationAssetUIMore_getUIType(this.swigCPtr, this));
    }

    public static String className() {
        return EffectEditorJniJNI.UIAnnotationAssetUIMore_className();
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationUIMore
    public void finalize() {
        delete();
    }

    public static UIAnnotationAssetUIMore dynamicCast(UIAnnotationUIMore uIAnnotationUIMore) {
        long jUIAnnotationAssetUIMore_dynamicCast__SWIG_0 = EffectEditorJniJNI.UIAnnotationAssetUIMore_dynamicCast__SWIG_0(UIAnnotationUIMore.getCPtr(uIAnnotationUIMore), uIAnnotationUIMore);
        if (jUIAnnotationAssetUIMore_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new UIAnnotationAssetUIMore(jUIAnnotationAssetUIMore_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(UIAnnotationAssetUIMore uIAnnotationAssetUIMore) {
        if (uIAnnotationAssetUIMore == null) {
            return 0L;
        }
        return uIAnnotationAssetUIMore.swigCPtr;
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationUIMore
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public UIAnnotationAssetUIMore(long j, boolean z) {
        super(EffectEditorJniJNI.UIAnnotationAssetUIMore_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
