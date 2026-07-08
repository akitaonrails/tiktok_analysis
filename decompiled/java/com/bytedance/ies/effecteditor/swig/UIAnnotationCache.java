package com.bytedance.ies.effecteditor.swig;

/* JADX INFO: loaded from: classes36.dex */
public class UIAnnotationCache extends UIAnnotationBase {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectEditorJniJNI.delete_UIAnnotationCache(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public String getClassName() {
        return EffectEditorJniJNI.UIAnnotationCache_getClassName(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public UIAnnotationErrorCode refreshAnnotationPreview() {
        return UIAnnotationErrorCode.swigToEnum(EffectEditorJniJNI.UIAnnotationCache_refreshAnnotationPreview(this.swigCPtr, this));
    }

    public static String className() {
        return EffectEditorJniJNI.UIAnnotationCache_className();
    }

    public static void injectUIAnnotation() {
        EffectEditorJniJNI.UIAnnotationCache_injectUIAnnotation();
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public void finalize() {
        delete();
    }

    public static UIAnnotationCache dynamicCast(UIAnnotationBase uIAnnotationBase) {
        long jUIAnnotationCache_dynamicCast__SWIG_0 = EffectEditorJniJNI.UIAnnotationCache_dynamicCast__SWIG_0(UIAnnotationBase.getCPtr(uIAnnotationBase), uIAnnotationBase);
        if (jUIAnnotationCache_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new UIAnnotationCache(jUIAnnotationCache_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(UIAnnotationCache uIAnnotationCache) {
        if (uIAnnotationCache == null) {
            return 0L;
        }
        return uIAnnotationCache.swigCPtr;
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public void updateValue(String str) {
        EffectEditorJniJNI.UIAnnotationCache_updateValue__SWIG_0(this.swigCPtr, this, str);
    }

    public UIAnnotationCache(long j, boolean z) {
        super(EffectEditorJniJNI.UIAnnotationCache_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public void updateValue(String str, UIAnnotationUpdateType uIAnnotationUpdateType, UIAnnotationCompletion uIAnnotationCompletion) {
        EffectEditorJniJNI.UIAnnotationCache_updateValue__SWIG_1(this.swigCPtr, this, str, uIAnnotationUpdateType.swigValue(), UIAnnotationCompletion.getCPtr(uIAnnotationCompletion), uIAnnotationCompletion);
    }
}
