package com.bytedance.ies.effecteditor.swig;

/* JADX INFO: loaded from: classes36.dex */
public class UIAnnotationTextInputUIMore extends UIAnnotationUIMore {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationUIMore
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectEditorJniJNI.delete_UIAnnotationTextInputUIMore(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationUIMore
    public String getClassName() {
        return EffectEditorJniJNI.UIAnnotationTextInputUIMore_getClassName(this.swigCPtr, this);
    }

    public String getCurrentValue() {
        return EffectEditorJniJNI.UIAnnotationTextInputUIMore_getCurrentValue(this.swigCPtr, this);
    }

    public String getHintText() {
        return EffectEditorJniJNI.UIAnnotationTextInputUIMore_getHintText(this.swigCPtr, this);
    }

    public String getLastValue() {
        return EffectEditorJniJNI.UIAnnotationTextInputUIMore_getLastValue(this.swigCPtr, this);
    }

    public int getMaxCount() {
        return EffectEditorJniJNI.UIAnnotationTextInputUIMore_getMaxCount(this.swigCPtr, this);
    }

    public int getMinCount() {
        return EffectEditorJniJNI.UIAnnotationTextInputUIMore_getMinCount(this.swigCPtr, this);
    }

    public String getOriginalValue() {
        return EffectEditorJniJNI.UIAnnotationTextInputUIMore_getOriginalValue(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationUIMore
    public UIAnnotationUIType getUIType() {
        return UIAnnotationUIType.swigToEnum(EffectEditorJniJNI.UIAnnotationTextInputUIMore_getUIType(this.swigCPtr, this));
    }

    public static String className() {
        return EffectEditorJniJNI.UIAnnotationTextInputUIMore_className();
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationUIMore
    public void finalize() {
        delete();
    }

    public static UIAnnotationTextInputUIMore dynamicCast(UIAnnotationUIMore uIAnnotationUIMore) {
        long jUIAnnotationTextInputUIMore_dynamicCast__SWIG_0 = EffectEditorJniJNI.UIAnnotationTextInputUIMore_dynamicCast__SWIG_0(UIAnnotationUIMore.getCPtr(uIAnnotationUIMore), uIAnnotationUIMore);
        if (jUIAnnotationTextInputUIMore_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new UIAnnotationTextInputUIMore(jUIAnnotationTextInputUIMore_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(UIAnnotationTextInputUIMore uIAnnotationTextInputUIMore) {
        if (uIAnnotationTextInputUIMore == null) {
            return 0L;
        }
        return uIAnnotationTextInputUIMore.swigCPtr;
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationUIMore
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public UIAnnotationTextInputUIMore(long j, boolean z) {
        super(EffectEditorJniJNI.UIAnnotationTextInputUIMore_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
