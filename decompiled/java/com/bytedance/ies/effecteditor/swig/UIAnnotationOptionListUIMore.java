package com.bytedance.ies.effecteditor.swig;

/* JADX INFO: loaded from: classes36.dex */
public class UIAnnotationOptionListUIMore extends UIAnnotationUIMore {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationUIMore
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectEditorJniJNI.delete_UIAnnotationOptionListUIMore(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public UIAnnotationOptionItemVector getCandidates() {
        return new UIAnnotationOptionItemVector(EffectEditorJniJNI.UIAnnotationOptionListUIMore_getCandidates(this.swigCPtr, this), true);
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationUIMore
    public String getClassName() {
        return EffectEditorJniJNI.UIAnnotationOptionListUIMore_getClassName(this.swigCPtr, this);
    }

    public EEStdStringVector getCurrentValue() {
        return new EEStdStringVector(EffectEditorJniJNI.UIAnnotationOptionListUIMore_getCurrentValue(this.swigCPtr, this), true);
    }

    public EEStdStringVector getLastValue() {
        return new EEStdStringVector(EffectEditorJniJNI.UIAnnotationOptionListUIMore_getLastValue(this.swigCPtr, this), true);
    }

    public String getLokiPanelCategory() {
        return EffectEditorJniJNI.UIAnnotationOptionListUIMore_getLokiPanelCategory(this.swigCPtr, this);
    }

    public String getLokiPanelName() {
        return EffectEditorJniJNI.UIAnnotationOptionListUIMore_getLokiPanelName(this.swigCPtr, this);
    }

    public int getMaxSelection() {
        return EffectEditorJniJNI.UIAnnotationOptionListUIMore_getMaxSelection(this.swigCPtr, this);
    }

    public int getMinSelection() {
        return EffectEditorJniJNI.UIAnnotationOptionListUIMore_getMinSelection(this.swigCPtr, this);
    }

    public String getOptionListKey() {
        return EffectEditorJniJNI.UIAnnotationOptionListUIMore_getOptionListKey(this.swigCPtr, this);
    }

    public String getOptionListName() {
        return EffectEditorJniJNI.UIAnnotationOptionListUIMore_getOptionListName(this.swigCPtr, this);
    }

    public UIAnnotationOptionUIType getOptionUIType() {
        return UIAnnotationOptionUIType.swigToEnum(EffectEditorJniJNI.UIAnnotationOptionListUIMore_getOptionUIType(this.swigCPtr, this));
    }

    public EEStdStringVector getOriginalValue() {
        return new EEStdStringVector(EffectEditorJniJNI.UIAnnotationOptionListUIMore_getOriginalValue(this.swigCPtr, this), true);
    }

    public double getPreferredItemHeight() {
        return EffectEditorJniJNI.UIAnnotationOptionListUIMore_getPreferredItemHeight(this.swigCPtr, this);
    }

    public double getPreferredItemRadius() {
        return EffectEditorJniJNI.UIAnnotationOptionListUIMore_getPreferredItemRadius(this.swigCPtr, this);
    }

    public double getPreferredItemWidth() {
        return EffectEditorJniJNI.UIAnnotationOptionListUIMore_getPreferredItemWidth(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationUIMore
    public UIAnnotationUIType getUIType() {
        return UIAnnotationUIType.swigToEnum(EffectEditorJniJNI.UIAnnotationOptionListUIMore_getUIType(this.swigCPtr, this));
    }

    public static String className() {
        return EffectEditorJniJNI.UIAnnotationOptionListUIMore_className();
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationUIMore
    public void finalize() {
        delete();
    }

    public static UIAnnotationOptionListUIMore dynamicCast(UIAnnotationUIMore uIAnnotationUIMore) {
        long jUIAnnotationOptionListUIMore_dynamicCast__SWIG_0 = EffectEditorJniJNI.UIAnnotationOptionListUIMore_dynamicCast__SWIG_0(UIAnnotationUIMore.getCPtr(uIAnnotationUIMore), uIAnnotationUIMore);
        if (jUIAnnotationOptionListUIMore_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new UIAnnotationOptionListUIMore(jUIAnnotationOptionListUIMore_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(UIAnnotationOptionListUIMore uIAnnotationOptionListUIMore) {
        if (uIAnnotationOptionListUIMore == null) {
            return 0L;
        }
        return uIAnnotationOptionListUIMore.swigCPtr;
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationUIMore
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public UIAnnotationOptionListUIMore(long j, boolean z) {
        super(EffectEditorJniJNI.UIAnnotationOptionListUIMore_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
