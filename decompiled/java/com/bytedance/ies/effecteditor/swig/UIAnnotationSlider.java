package com.bytedance.ies.effecteditor.swig;

/* JADX INFO: loaded from: classes36.dex */
public class UIAnnotationSlider extends UIAnnotationBase {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectEditorJniJNI.delete_UIAnnotationSlider(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public String getClassName() {
        return EffectEditorJniJNI.UIAnnotationSlider_getClassName(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public UIAnnotationErrorCode refreshAnnotationPreview() {
        return UIAnnotationErrorCode.swigToEnum(EffectEditorJniJNI.UIAnnotationSlider_refreshAnnotationPreview(this.swigCPtr, this));
    }

    public static String className() {
        return EffectEditorJniJNI.UIAnnotationSlider_className();
    }

    public static void injectUIAnnotation() {
        EffectEditorJniJNI.UIAnnotationSlider_injectUIAnnotation();
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public void finalize() {
        delete();
    }

    public static UIAnnotationSlider dynamicCast(UIAnnotationBase uIAnnotationBase) {
        long jUIAnnotationSlider_dynamicCast__SWIG_0 = EffectEditorJniJNI.UIAnnotationSlider_dynamicCast__SWIG_0(UIAnnotationBase.getCPtr(uIAnnotationBase), uIAnnotationBase);
        if (jUIAnnotationSlider_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new UIAnnotationSlider(jUIAnnotationSlider_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(UIAnnotationSlider uIAnnotationSlider) {
        if (uIAnnotationSlider == null) {
            return 0L;
        }
        return uIAnnotationSlider.swigCPtr;
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public void updateValue(double d) {
        EffectEditorJniJNI.UIAnnotationSlider_updateValue__SWIG_0(this.swigCPtr, this, d);
    }

    public UIAnnotationSlider(long j, boolean z) {
        super(EffectEditorJniJNI.UIAnnotationSlider_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public void updateValue(double d, UIAnnotationUpdateType uIAnnotationUpdateType, UIAnnotationCompletion uIAnnotationCompletion) {
        EffectEditorJniJNI.UIAnnotationSlider_updateValue__SWIG_1(this.swigCPtr, this, d, uIAnnotationUpdateType.swigValue(), UIAnnotationCompletion.getCPtr(uIAnnotationCompletion), uIAnnotationCompletion);
    }
}
