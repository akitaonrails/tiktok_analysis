package com.bytedance.ies.effecteditor.swig;

/* JADX INFO: loaded from: classes36.dex */
public class UIAnnotationOptionList extends UIAnnotationBase {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectEditorJniJNI.delete_UIAnnotationOptionList(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public String getClassName() {
        return EffectEditorJniJNI.UIAnnotationOptionList_getClassName(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public UIAnnotationErrorCode refreshAnnotationPreview() {
        return UIAnnotationErrorCode.swigToEnum(EffectEditorJniJNI.UIAnnotationOptionList_refreshAnnotationPreview(this.swigCPtr, this));
    }

    public static String className() {
        return EffectEditorJniJNI.UIAnnotationOptionList_className();
    }

    public static void injectUIAnnotation() {
        EffectEditorJniJNI.UIAnnotationOptionList_injectUIAnnotation();
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public void finalize() {
        delete();
    }

    public static UIAnnotationOptionList dynamicCast(UIAnnotationBase uIAnnotationBase) {
        long jUIAnnotationOptionList_dynamicCast__SWIG_0 = EffectEditorJniJNI.UIAnnotationOptionList_dynamicCast__SWIG_0(UIAnnotationBase.getCPtr(uIAnnotationBase), uIAnnotationBase);
        if (jUIAnnotationOptionList_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new UIAnnotationOptionList(jUIAnnotationOptionList_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(UIAnnotationOptionList uIAnnotationOptionList) {
        if (uIAnnotationOptionList == null) {
            return 0L;
        }
        return uIAnnotationOptionList.swigCPtr;
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public void updateValue(EEStdStringVector eEStdStringVector) {
        EffectEditorJniJNI.UIAnnotationOptionList_updateValue__SWIG_0(this.swigCPtr, this, EEStdStringVector.getCPtr(eEStdStringVector), eEStdStringVector);
    }

    public UIAnnotationOptionList(long j, boolean z) {
        super(EffectEditorJniJNI.UIAnnotationOptionList_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public void updateValue(EEStdStringVector eEStdStringVector, UIAnnotationUpdateType uIAnnotationUpdateType, UIAnnotationCompletion uIAnnotationCompletion) {
        EffectEditorJniJNI.UIAnnotationOptionList_updateValue__SWIG_1(this.swigCPtr, this, EEStdStringVector.getCPtr(eEStdStringVector), eEStdStringVector, uIAnnotationUpdateType.swigValue(), UIAnnotationCompletion.getCPtr(uIAnnotationCompletion), uIAnnotationCompletion);
    }
}
