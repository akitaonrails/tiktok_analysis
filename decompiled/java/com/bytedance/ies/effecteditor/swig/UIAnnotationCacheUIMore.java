package com.bytedance.ies.effecteditor.swig;

/* JADX INFO: loaded from: classes36.dex */
public class UIAnnotationCacheUIMore extends UIAnnotationUIMore {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationUIMore
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectEditorJniJNI.delete_UIAnnotationCacheUIMore(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationUIMore
    public String getClassName() {
        return EffectEditorJniJNI.UIAnnotationCacheUIMore_getClassName(this.swigCPtr, this);
    }

    public String getCurrentValue() {
        return EffectEditorJniJNI.UIAnnotationCacheUIMore_getCurrentValue(this.swigCPtr, this);
    }

    public String getLastValue() {
        return EffectEditorJniJNI.UIAnnotationCacheUIMore_getLastValue(this.swigCPtr, this);
    }

    public String getOriginalValue() {
        return EffectEditorJniJNI.UIAnnotationCacheUIMore_getOriginalValue(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationUIMore
    public UIAnnotationUIType getUIType() {
        return UIAnnotationUIType.swigToEnum(EffectEditorJniJNI.UIAnnotationCacheUIMore_getUIType(this.swigCPtr, this));
    }

    public static String className() {
        return EffectEditorJniJNI.UIAnnotationCacheUIMore_className();
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationUIMore
    public void finalize() {
        delete();
    }

    public static UIAnnotationCacheUIMore dynamicCast(UIAnnotationUIMore uIAnnotationUIMore) {
        long jUIAnnotationCacheUIMore_dynamicCast__SWIG_0 = EffectEditorJniJNI.UIAnnotationCacheUIMore_dynamicCast__SWIG_0(UIAnnotationUIMore.getCPtr(uIAnnotationUIMore), uIAnnotationUIMore);
        if (jUIAnnotationCacheUIMore_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new UIAnnotationCacheUIMore(jUIAnnotationCacheUIMore_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(UIAnnotationCacheUIMore uIAnnotationCacheUIMore) {
        if (uIAnnotationCacheUIMore == null) {
            return 0L;
        }
        return uIAnnotationCacheUIMore.swigCPtr;
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationUIMore
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public UIAnnotationCacheUIMore(long j, boolean z) {
        super(EffectEditorJniJNI.UIAnnotationCacheUIMore_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
