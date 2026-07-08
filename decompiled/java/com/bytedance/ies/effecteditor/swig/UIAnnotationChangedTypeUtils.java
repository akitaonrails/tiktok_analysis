package com.bytedance.ies.effecteditor.swig;

/* JADX INFO: loaded from: classes6.dex */
public class UIAnnotationChangedTypeUtils {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                throw new UnsupportedOperationException("C++ destructor does not have public access");
            }
            this.swigCPtr = 0L;
        }
    }

    public static UIAnnotationChangedType fromAssetType(UIAnnotationAssetType uIAnnotationAssetType) {
        return UIAnnotationChangedType.swigToEnum(EffectEditorJniJNI.UIAnnotationChangedTypeUtils_fromAssetType(uIAnnotationAssetType.swigValue()));
    }

    public static long getCPtr(UIAnnotationChangedTypeUtils uIAnnotationChangedTypeUtils) {
        if (uIAnnotationChangedTypeUtils == null) {
            return 0L;
        }
        return uIAnnotationChangedTypeUtils.swigCPtr;
    }

    public UIAnnotationChangedTypeUtils(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
