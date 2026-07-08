package com.bytedance.ies.effecteditor.swig;

/* JADX INFO: loaded from: classes36.dex */
public class UIAnnotationTextInput extends UIAnnotationBase {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectEditorJniJNI.delete_UIAnnotationTextInput(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public String getClassName() {
        return EffectEditorJniJNI.UIAnnotationTextInput_getClassName(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public UIAnnotationErrorCode refreshAnnotationPreview() {
        return UIAnnotationErrorCode.swigToEnum(EffectEditorJniJNI.UIAnnotationTextInput_refreshAnnotationPreview(this.swigCPtr, this));
    }

    public static String className() {
        return EffectEditorJniJNI.UIAnnotationTextInput_className();
    }

    public static void injectUIAnnotation() {
        EffectEditorJniJNI.UIAnnotationTextInput_injectUIAnnotation();
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public void finalize() {
        delete();
    }

    public static UIAnnotationTextInput dynamicCast(UIAnnotationBase uIAnnotationBase) {
        long jUIAnnotationTextInput_dynamicCast__SWIG_0 = EffectEditorJniJNI.UIAnnotationTextInput_dynamicCast__SWIG_0(UIAnnotationBase.getCPtr(uIAnnotationBase), uIAnnotationBase);
        if (jUIAnnotationTextInput_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new UIAnnotationTextInput(jUIAnnotationTextInput_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(UIAnnotationTextInput uIAnnotationTextInput) {
        if (uIAnnotationTextInput == null) {
            return 0L;
        }
        return uIAnnotationTextInput.swigCPtr;
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public void updateValue(String str) {
        EffectEditorJniJNI.UIAnnotationTextInput_updateValue__SWIG_0(this.swigCPtr, this, str);
    }

    public UIAnnotationTextInput(long j, boolean z) {
        super(EffectEditorJniJNI.UIAnnotationTextInput_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public void updateValue(String str, UIAnnotationUpdateType uIAnnotationUpdateType, UIAnnotationCompletion uIAnnotationCompletion) {
        EffectEditorJniJNI.UIAnnotationTextInput_updateValue__SWIG_1(this.swigCPtr, this, str, uIAnnotationUpdateType.swigValue(), UIAnnotationCompletion.getCPtr(uIAnnotationCompletion), uIAnnotationCompletion);
    }
}
