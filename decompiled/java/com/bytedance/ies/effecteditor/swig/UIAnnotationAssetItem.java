package com.bytedance.ies.effecteditor.swig;

/* JADX INFO: loaded from: classes36.dex */
public class UIAnnotationAssetItem extends UIAnnotationAsset {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationAsset, com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectEditorJniJNI.delete_UIAnnotationAssetItem(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationAsset, com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public String getClassName() {
        return EffectEditorJniJNI.UIAnnotationAssetItem_getClassName(this.swigCPtr, this);
    }

    public static String className() {
        return EffectEditorJniJNI.UIAnnotationAssetItem_className();
    }

    public static void injectUIAnnotation() {
        EffectEditorJniJNI.UIAnnotationAssetItem_injectUIAnnotation();
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationAsset, com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public void finalize() {
        delete();
    }

    public static UIAnnotationAssetItem dynamicCast(UIAnnotationBase uIAnnotationBase) {
        long jUIAnnotationAssetItem_dynamicCast__SWIG_0 = EffectEditorJniJNI.UIAnnotationAssetItem_dynamicCast__SWIG_0(UIAnnotationBase.getCPtr(uIAnnotationBase), uIAnnotationBase);
        if (jUIAnnotationAssetItem_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new UIAnnotationAssetItem(jUIAnnotationAssetItem_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(UIAnnotationAssetItem uIAnnotationAssetItem) {
        if (uIAnnotationAssetItem == null) {
            return 0L;
        }
        return uIAnnotationAssetItem.swigCPtr;
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationAsset, com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public UIAnnotationAssetItem(long j, boolean z) {
        super(EffectEditorJniJNI.UIAnnotationAssetItem_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
