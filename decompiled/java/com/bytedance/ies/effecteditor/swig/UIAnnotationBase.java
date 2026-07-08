package com.bytedance.ies.effecteditor.swig;

/* JADX INFO: loaded from: classes36.dex */
public class UIAnnotationBase {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectEditorJniJNI.delete_UIAnnotationBase(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String getCallbackJsonString() {
        return EffectEditorJniJNI.UIAnnotationBase_getCallbackJsonString(this.swigCPtr, this);
    }

    public UIAnnotationCategory getCategory() {
        long jUIAnnotationBase_getCategory = EffectEditorJniJNI.UIAnnotationBase_getCategory(this.swigCPtr, this);
        if (jUIAnnotationBase_getCategory == 0) {
            return null;
        }
        return new UIAnnotationCategory(jUIAnnotationBase_getCategory, true);
    }

    public String getClassName() {
        return EffectEditorJniJNI.UIAnnotationBase_getClassName(this.swigCPtr, this);
    }

    public String getName() {
        return EffectEditorJniJNI.UIAnnotationBase_getName(this.swigCPtr, this);
    }

    public UIAnnotationUIMore getUIMore() {
        long jUIAnnotationBase_getUIMore = EffectEditorJniJNI.UIAnnotationBase_getUIMore(this.swigCPtr, this);
        if (jUIAnnotationBase_getUIMore == 0) {
            return null;
        }
        return new UIAnnotationUIMore(jUIAnnotationBase_getUIMore, true);
    }

    public UIAnnotationUIType getUIType() {
        return UIAnnotationUIType.swigToEnum(EffectEditorJniJNI.UIAnnotationBase_getUIType(this.swigCPtr, this));
    }

    public UIAnnotationErrorCode refreshAnnotationPreview() {
        return UIAnnotationErrorCode.swigToEnum(EffectEditorJniJNI.UIAnnotationBase_refreshAnnotationPreview(this.swigCPtr, this));
    }

    public static String className() {
        return EffectEditorJniJNI.UIAnnotationBase_className();
    }

    public static void injectUIAnnotation() {
        EffectEditorJniJNI.UIAnnotationBase_injectUIAnnotation();
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(UIAnnotationBase uIAnnotationBase) {
        if (uIAnnotationBase == null) {
            return 0L;
        }
        return uIAnnotationBase.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public void updateValue(EEStdStringVector eEStdStringVector) {
        EffectEditorJniJNI.UIAnnotationBase_updateValue__SWIG_8(this.swigCPtr, this, EEStdStringVector.getCPtr(eEStdStringVector), eEStdStringVector);
    }

    public void updateValue(double d) {
        EffectEditorJniJNI.UIAnnotationBase_updateValue__SWIG_4(this.swigCPtr, this, d);
    }

    public void updateValue(float f) {
        EffectEditorJniJNI.UIAnnotationBase_updateValue__SWIG_2(this.swigCPtr, this, f);
    }

    public void updateValue(int i) {
        EffectEditorJniJNI.UIAnnotationBase_updateValue__SWIG_0(this.swigCPtr, this, i);
    }

    public void updateValue(String str) {
        EffectEditorJniJNI.UIAnnotationBase_updateValue__SWIG_6(this.swigCPtr, this, str);
    }

    public UIAnnotationBase(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void updateValue(EEStdStringVector eEStdStringVector, UIAnnotationUpdateType uIAnnotationUpdateType, UIAnnotationCompletion uIAnnotationCompletion) {
        EffectEditorJniJNI.UIAnnotationBase_updateValue__SWIG_9(this.swigCPtr, this, EEStdStringVector.getCPtr(eEStdStringVector), eEStdStringVector, uIAnnotationUpdateType.swigValue(), UIAnnotationCompletion.getCPtr(uIAnnotationCompletion), uIAnnotationCompletion);
    }

    public void updateValue(double d, UIAnnotationUpdateType uIAnnotationUpdateType, UIAnnotationCompletion uIAnnotationCompletion) {
        EffectEditorJniJNI.UIAnnotationBase_updateValue__SWIG_5(this.swigCPtr, this, d, uIAnnotationUpdateType.swigValue(), UIAnnotationCompletion.getCPtr(uIAnnotationCompletion), uIAnnotationCompletion);
    }

    public void updateValue(float f, UIAnnotationUpdateType uIAnnotationUpdateType, UIAnnotationCompletion uIAnnotationCompletion) {
        EffectEditorJniJNI.UIAnnotationBase_updateValue__SWIG_3(this.swigCPtr, this, f, uIAnnotationUpdateType.swigValue(), UIAnnotationCompletion.getCPtr(uIAnnotationCompletion), uIAnnotationCompletion);
    }

    public void updateValue(int i, UIAnnotationUpdateType uIAnnotationUpdateType, UIAnnotationCompletion uIAnnotationCompletion) {
        EffectEditorJniJNI.UIAnnotationBase_updateValue__SWIG_1(this.swigCPtr, this, i, uIAnnotationUpdateType.swigValue(), UIAnnotationCompletion.getCPtr(uIAnnotationCompletion), uIAnnotationCompletion);
    }

    public void updateValue(String str, UIAnnotationUpdateType uIAnnotationUpdateType, UIAnnotationCompletion uIAnnotationCompletion) {
        EffectEditorJniJNI.UIAnnotationBase_updateValue__SWIG_7(this.swigCPtr, this, str, uIAnnotationUpdateType.swigValue(), UIAnnotationCompletion.getCPtr(uIAnnotationCompletion), uIAnnotationCompletion);
    }
}
