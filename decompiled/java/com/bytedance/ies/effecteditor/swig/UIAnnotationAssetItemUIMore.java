package com.bytedance.ies.effecteditor.swig;

/* JADX INFO: loaded from: classes36.dex */
public class UIAnnotationAssetItemUIMore extends UIAnnotationAssetUIMore {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationAssetUIMore, com.bytedance.ies.effecteditor.swig.UIAnnotationUIMore
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectEditorJniJNI.delete_UIAnnotationAssetItemUIMore(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public int getAssetIndex() {
        return EffectEditorJniJNI.UIAnnotationAssetItemUIMore_getAssetIndex(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationAssetUIMore, com.bytedance.ies.effecteditor.swig.UIAnnotationUIMore
    public String getClassName() {
        return EffectEditorJniJNI.UIAnnotationAssetItemUIMore_getClassName(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationAssetUIMore, com.bytedance.ies.effecteditor.swig.UIAnnotationUIMore
    public UIAnnotationUIType getUIType() {
        return UIAnnotationUIType.swigToEnum(EffectEditorJniJNI.UIAnnotationAssetItemUIMore_getUIType(this.swigCPtr, this));
    }

    public static String className() {
        return EffectEditorJniJNI.UIAnnotationAssetItemUIMore_className();
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationAssetUIMore, com.bytedance.ies.effecteditor.swig.UIAnnotationUIMore
    public void finalize() {
        delete();
    }

    public static UIAnnotationAssetItemUIMore dynamicCast(UIAnnotationUIMore uIAnnotationUIMore) {
        long jUIAnnotationAssetItemUIMore_dynamicCast__SWIG_0 = EffectEditorJniJNI.UIAnnotationAssetItemUIMore_dynamicCast__SWIG_0(UIAnnotationUIMore.getCPtr(uIAnnotationUIMore), uIAnnotationUIMore);
        if (jUIAnnotationAssetItemUIMore_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new UIAnnotationAssetItemUIMore(jUIAnnotationAssetItemUIMore_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(UIAnnotationAssetItemUIMore uIAnnotationAssetItemUIMore) {
        if (uIAnnotationAssetItemUIMore == null) {
            return 0L;
        }
        return uIAnnotationAssetItemUIMore.swigCPtr;
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationAssetUIMore, com.bytedance.ies.effecteditor.swig.UIAnnotationUIMore
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public UIAnnotationAssetItemUIMore(long j, boolean z) {
        super(EffectEditorJniJNI.UIAnnotationAssetItemUIMore_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
