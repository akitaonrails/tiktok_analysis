package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentAudioLoudnessBalanceFilter extends NLESegmentFilter {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentAudioLoudnessBalanceFilter(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentAudioLoudnessBalanceFilter_clone = NLEEditorJniJNI.NLESegmentAudioLoudnessBalanceFilter_clone(this.swigCPtr, this);
        if (jNLESegmentAudioLoudnessBalanceFilter_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentAudioLoudnessBalanceFilter_clone, true);
    }

    public double getAvgLoudness() {
        return NLEEditorJniJNI.NLESegmentAudioLoudnessBalanceFilter_getAvgLoudness(this.swigCPtr, this);
    }

    public double getPeakLoudness() {
        return NLEEditorJniJNI.NLESegmentAudioLoudnessBalanceFilter_getPeakLoudness(this.swigCPtr, this);
    }

    public double getTargetLoudness() {
        return NLEEditorJniJNI.NLESegmentAudioLoudnessBalanceFilter_getTargetLoudness(this.swigCPtr, this);
    }

    public boolean hasAvgLoudness() {
        return NLEEditorJniJNI.NLESegmentAudioLoudnessBalanceFilter_hasAvgLoudness(this.swigCPtr, this);
    }

    public boolean hasPeakLoudness() {
        return NLEEditorJniJNI.NLESegmentAudioLoudnessBalanceFilter_hasPeakLoudness(this.swigCPtr, this);
    }

    public boolean hasTargetLoudness() {
        return NLEEditorJniJNI.NLESegmentAudioLoudnessBalanceFilter_hasTargetLoudness(this.swigCPtr, this);
    }

    public NLESegmentAudioLoudnessBalanceFilter() {
        this(NLEEditorJniJNI.new_NLESegmentAudioLoudnessBalanceFilter(), true);
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

    public static NLESegmentAudioLoudnessBalanceFilter dynamicCast(NLENode nLENode) {
        long jNLESegmentAudioLoudnessBalanceFilter_dynamicCast = NLEEditorJniJNI.NLESegmentAudioLoudnessBalanceFilter_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentAudioLoudnessBalanceFilter_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentAudioLoudnessBalanceFilter(jNLESegmentAudioLoudnessBalanceFilter_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentAudioLoudnessBalanceFilter nLESegmentAudioLoudnessBalanceFilter) {
        if (nLESegmentAudioLoudnessBalanceFilter == null) {
            return 0L;
        }
        return nLESegmentAudioLoudnessBalanceFilter.swigCPtr;
    }

    public void setAvgLoudness(double d) {
        NLEEditorJniJNI.NLESegmentAudioLoudnessBalanceFilter_setAvgLoudness(this.swigCPtr, this, d);
    }

    public void setPeakLoudness(double d) {
        NLEEditorJniJNI.NLESegmentAudioLoudnessBalanceFilter_setPeakLoudness(this.swigCPtr, this, d);
    }

    public void setTargetLoudness(double d) {
        NLEEditorJniJNI.NLESegmentAudioLoudnessBalanceFilter_setTargetLoudness(this.swigCPtr, this, d);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentAudioLoudnessBalanceFilter(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentAudioLoudnessBalanceFilter_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
