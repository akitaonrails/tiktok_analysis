package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentPrimaryColorWheelsFilter extends NLESegmentFilter {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentPrimaryColorWheelsFilter(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentPrimaryColorWheelsFilter_clone = NLEEditorJniJNI.NLESegmentPrimaryColorWheelsFilter_clone(this.swigCPtr, this);
        if (jNLESegmentPrimaryColorWheelsFilter_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentPrimaryColorWheelsFilter_clone, true);
    }

    public NLEStyColor getGain() {
        long jNLESegmentPrimaryColorWheelsFilter_getGain = NLEEditorJniJNI.NLESegmentPrimaryColorWheelsFilter_getGain(this.swigCPtr, this);
        if (jNLESegmentPrimaryColorWheelsFilter_getGain == 0) {
            return null;
        }
        return new NLEStyColor(jNLESegmentPrimaryColorWheelsFilter_getGain, true);
    }

    public NLEStyColor getGamma() {
        long jNLESegmentPrimaryColorWheelsFilter_getGamma = NLEEditorJniJNI.NLESegmentPrimaryColorWheelsFilter_getGamma(this.swigCPtr, this);
        if (jNLESegmentPrimaryColorWheelsFilter_getGamma == 0) {
            return null;
        }
        return new NLEStyColor(jNLESegmentPrimaryColorWheelsFilter_getGamma, true);
    }

    public NLEStyColor getLift() {
        long jNLESegmentPrimaryColorWheelsFilter_getLift = NLEEditorJniJNI.NLESegmentPrimaryColorWheelsFilter_getLift(this.swigCPtr, this);
        if (jNLESegmentPrimaryColorWheelsFilter_getLift == 0) {
            return null;
        }
        return new NLEStyColor(jNLESegmentPrimaryColorWheelsFilter_getLift, true);
    }

    public NLEStyColor getOffset() {
        long jNLESegmentPrimaryColorWheelsFilter_getOffset = NLEEditorJniJNI.NLESegmentPrimaryColorWheelsFilter_getOffset(this.swigCPtr, this);
        if (jNLESegmentPrimaryColorWheelsFilter_getOffset == 0) {
            return null;
        }
        return new NLEStyColor(jNLESegmentPrimaryColorWheelsFilter_getOffset, true);
    }

    public String toEffectJsonString() {
        return NLEEditorJniJNI.NLESegmentPrimaryColorWheelsFilter_toEffectJsonString(this.swigCPtr, this);
    }

    public NLESegmentPrimaryColorWheelsFilter() {
        this(NLEEditorJniJNI.new_NLESegmentPrimaryColorWheelsFilter(), true);
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

    public static NLESegmentPrimaryColorWheelsFilter dynamicCast(NLENode nLENode) {
        long jNLESegmentPrimaryColorWheelsFilter_dynamicCast = NLEEditorJniJNI.NLESegmentPrimaryColorWheelsFilter_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentPrimaryColorWheelsFilter_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentPrimaryColorWheelsFilter(jNLESegmentPrimaryColorWheelsFilter_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentPrimaryColorWheelsFilter nLESegmentPrimaryColorWheelsFilter) {
        if (nLESegmentPrimaryColorWheelsFilter == null) {
            return 0L;
        }
        return nLESegmentPrimaryColorWheelsFilter.swigCPtr;
    }

    public void setGain(NLEStyColor nLEStyColor) {
        NLEEditorJniJNI.NLESegmentPrimaryColorWheelsFilter_setGain(this.swigCPtr, this, NLEStyColor.getCPtr(nLEStyColor), nLEStyColor);
    }

    public void setGamma(NLEStyColor nLEStyColor) {
        NLEEditorJniJNI.NLESegmentPrimaryColorWheelsFilter_setGamma(this.swigCPtr, this, NLEStyColor.getCPtr(nLEStyColor), nLEStyColor);
    }

    public void setLift(NLEStyColor nLEStyColor) {
        NLEEditorJniJNI.NLESegmentPrimaryColorWheelsFilter_setLift(this.swigCPtr, this, NLEStyColor.getCPtr(nLEStyColor), nLEStyColor);
    }

    public void setOffset(NLEStyColor nLEStyColor) {
        NLEEditorJniJNI.NLESegmentPrimaryColorWheelsFilter_setOffset(this.swigCPtr, this, NLEStyColor.getCPtr(nLEStyColor), nLEStyColor);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentPrimaryColorWheelsFilter(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentPrimaryColorWheelsFilter_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
