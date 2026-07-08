package com.bytedance.ies.effecteditor.swig;

/* JADX INFO: loaded from: classes36.dex */
public class UIAnnotationSliderUIMore extends UIAnnotationUIMore {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationUIMore
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectEditorJniJNI.delete_UIAnnotationSliderUIMore(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationUIMore
    public String getClassName() {
        return EffectEditorJniJNI.UIAnnotationSliderUIMore_getClassName(this.swigCPtr, this);
    }

    public double getCurrentValue() {
        return EffectEditorJniJNI.UIAnnotationSliderUIMore_getCurrentValue(this.swigCPtr, this);
    }

    public double getLastValue() {
        return EffectEditorJniJNI.UIAnnotationSliderUIMore_getLastValue(this.swigCPtr, this);
    }

    public double getMaxValue() {
        return EffectEditorJniJNI.UIAnnotationSliderUIMore_getMaxValue(this.swigCPtr, this);
    }

    public double getMinValue() {
        return EffectEditorJniJNI.UIAnnotationSliderUIMore_getMinValue(this.swigCPtr, this);
    }

    public double getOriginalValue() {
        return EffectEditorJniJNI.UIAnnotationSliderUIMore_getOriginalValue(this.swigCPtr, this);
    }

    public double getStepValue() {
        return EffectEditorJniJNI.UIAnnotationSliderUIMore_getStepValue(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationUIMore
    public UIAnnotationUIType getUIType() {
        return UIAnnotationUIType.swigToEnum(EffectEditorJniJNI.UIAnnotationSliderUIMore_getUIType(this.swigCPtr, this));
    }

    public static String className() {
        return EffectEditorJniJNI.UIAnnotationSliderUIMore_className();
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationUIMore
    public void finalize() {
        delete();
    }

    public static UIAnnotationSliderUIMore dynamicCast(UIAnnotationUIMore uIAnnotationUIMore) {
        long jUIAnnotationSliderUIMore_dynamicCast__SWIG_0 = EffectEditorJniJNI.UIAnnotationSliderUIMore_dynamicCast__SWIG_0(UIAnnotationUIMore.getCPtr(uIAnnotationUIMore), uIAnnotationUIMore);
        if (jUIAnnotationSliderUIMore_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new UIAnnotationSliderUIMore(jUIAnnotationSliderUIMore_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(UIAnnotationSliderUIMore uIAnnotationSliderUIMore) {
        if (uIAnnotationSliderUIMore == null) {
            return 0L;
        }
        return uIAnnotationSliderUIMore.swigCPtr;
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationUIMore
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public UIAnnotationSliderUIMore(long j, boolean z) {
        super(EffectEditorJniJNI.UIAnnotationSliderUIMore_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
