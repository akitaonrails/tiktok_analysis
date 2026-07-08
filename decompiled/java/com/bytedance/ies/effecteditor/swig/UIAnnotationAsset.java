package com.bytedance.ies.effecteditor.swig;

/* JADX INFO: loaded from: classes36.dex */
public class UIAnnotationAsset extends UIAnnotationBase {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectEditorJniJNI.delete_UIAnnotationAsset(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public String getCallbackType() {
        return EffectEditorJniJNI.UIAnnotationAsset_getCallbackType(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public String getClassName() {
        return EffectEditorJniJNI.UIAnnotationAsset_getClassName(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public UIAnnotationErrorCode refreshAnnotationPreview() {
        return UIAnnotationErrorCode.swigToEnum(EffectEditorJniJNI.UIAnnotationAsset_refreshAnnotationPreview(this.swigCPtr, this));
    }

    public static String className() {
        return EffectEditorJniJNI.UIAnnotationAsset_className();
    }

    public static void injectUIAnnotation() {
        EffectEditorJniJNI.UIAnnotationAsset_injectUIAnnotation();
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public void finalize() {
        delete();
    }

    public static UIAnnotationAsset dynamicCast(UIAnnotationBase uIAnnotationBase) {
        long jUIAnnotationAsset_dynamicCast__SWIG_0 = EffectEditorJniJNI.UIAnnotationAsset_dynamicCast__SWIG_0(UIAnnotationBase.getCPtr(uIAnnotationBase), uIAnnotationBase);
        if (jUIAnnotationAsset_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new UIAnnotationAsset(jUIAnnotationAsset_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(UIAnnotationAsset uIAnnotationAsset) {
        if (uIAnnotationAsset == null) {
            return 0L;
        }
        return uIAnnotationAsset.swigCPtr;
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public void updateValue(EEStdStringVector eEStdStringVector) {
        EffectEditorJniJNI.UIAnnotationAsset_updateValue__SWIG_0(this.swigCPtr, this, EEStdStringVector.getCPtr(eEStdStringVector), eEStdStringVector);
    }

    public UIAnnotationAsset(long j, boolean z) {
        super(EffectEditorJniJNI.UIAnnotationAsset_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationBase
    public void updateValue(EEStdStringVector eEStdStringVector, UIAnnotationUpdateType uIAnnotationUpdateType, UIAnnotationCompletion uIAnnotationCompletion) {
        EffectEditorJniJNI.UIAnnotationAsset_updateValue__SWIG_1(this.swigCPtr, this, EEStdStringVector.getCPtr(eEStdStringVector), eEStdStringVector, uIAnnotationUpdateType.swigValue(), UIAnnotationCompletion.getCPtr(uIAnnotationCompletion), uIAnnotationCompletion);
    }
}
