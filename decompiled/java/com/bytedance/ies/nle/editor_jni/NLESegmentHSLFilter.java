package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentHSLFilter extends NLESegmentFilter {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentHSLFilter(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentHSLFilter_clone = NLEEditorJniJNI.NLESegmentHSLFilter_clone(this.swigCPtr, this);
        if (jNLESegmentHSLFilter_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentHSLFilter_clone, true);
    }

    public NLEHSLColorType getColorType() {
        return NLEHSLColorType.swigToEnum(NLEEditorJniJNI.NLESegmentHSLFilter_getColorType(this.swigCPtr, this));
    }

    public double getHue() {
        return NLEEditorJniJNI.NLESegmentHSLFilter_getHue(this.swigCPtr, this);
    }

    public double getLightness() {
        return NLEEditorJniJNI.NLESegmentHSLFilter_getLightness(this.swigCPtr, this);
    }

    public double getSaturation() {
        return NLEEditorJniJNI.NLESegmentHSLFilter_getSaturation(this.swigCPtr, this);
    }

    public boolean hasColorType() {
        return NLEEditorJniJNI.NLESegmentHSLFilter_hasColorType(this.swigCPtr, this);
    }

    public boolean hasHue() {
        return NLEEditorJniJNI.NLESegmentHSLFilter_hasHue(this.swigCPtr, this);
    }

    public boolean hasLightness() {
        return NLEEditorJniJNI.NLESegmentHSLFilter_hasLightness(this.swigCPtr, this);
    }

    public boolean hasSaturation() {
        return NLEEditorJniJNI.NLESegmentHSLFilter_hasSaturation(this.swigCPtr, this);
    }

    public NLESegmentHSLFilter() {
        this(NLEEditorJniJNI.new_NLESegmentHSLFilter(), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo130clone() {
        return mo130clone();
    }

    public static NLESegmentHSLFilter dynamicCast(NLENode nLENode) {
        long jNLESegmentHSLFilter_dynamicCast = NLEEditorJniJNI.NLESegmentHSLFilter_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentHSLFilter_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentHSLFilter(jNLESegmentHSLFilter_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentHSLFilter nLESegmentHSLFilter) {
        if (nLESegmentHSLFilter == null) {
            return 0L;
        }
        return nLESegmentHSLFilter.swigCPtr;
    }

    public void setColorType(NLEHSLColorType nLEHSLColorType) {
        NLEEditorJniJNI.NLESegmentHSLFilter_setColorType(this.swigCPtr, this, nLEHSLColorType.swigValue());
    }

    public void setHue(double d) {
        NLEEditorJniJNI.NLESegmentHSLFilter_setHue(this.swigCPtr, this, d);
    }

    public void setLightness(double d) {
        NLEEditorJniJNI.NLESegmentHSLFilter_setLightness(this.swigCPtr, this, d);
    }

    public void setSaturation(double d) {
        NLEEditorJniJNI.NLESegmentHSLFilter_setSaturation(this.swigCPtr, this, d);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentHSLFilter(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentHSLFilter_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
