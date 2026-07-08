package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentAudioVoiceBeautifyFilter extends NLESegmentFilter {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentAudioVoiceBeautifyFilter(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentAudioVoiceBeautifyFilter_clone = NLEEditorJniJNI.NLESegmentAudioVoiceBeautifyFilter_clone(this.swigCPtr, this);
        if (jNLESegmentAudioVoiceBeautifyFilter_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentAudioVoiceBeautifyFilter_clone, true);
    }

    public NLESegmentAudioVoiceBeautifyFilter() {
        this(NLEEditorJniJNI.new_NLESegmentAudioVoiceBeautifyFilter(), true);
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

    public static NLESegmentAudioVoiceBeautifyFilter dynamicCast(NLENode nLENode) {
        long jNLESegmentAudioVoiceBeautifyFilter_dynamicCast = NLEEditorJniJNI.NLESegmentAudioVoiceBeautifyFilter_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentAudioVoiceBeautifyFilter_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentAudioVoiceBeautifyFilter(jNLESegmentAudioVoiceBeautifyFilter_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentAudioVoiceBeautifyFilter nLESegmentAudioVoiceBeautifyFilter) {
        if (nLESegmentAudioVoiceBeautifyFilter == null) {
            return 0L;
        }
        return nLESegmentAudioVoiceBeautifyFilter.swigCPtr;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentFilter, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentAudioVoiceBeautifyFilter(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentAudioVoiceBeautifyFilter_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
