package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEChromaChannel extends NLETimeSpaceNode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEChromaChannel(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLEChromaChannel_clone = NLEEditorJniJNI.NLEChromaChannel_clone(this.swigCPtr, this);
        if (jNLEChromaChannel_clone == 0) {
            return null;
        }
        return new NLENode(jNLEChromaChannel_clone, true);
    }

    public NLESegmentChromaChannel getSegment() {
        long jNLEChromaChannel_getSegment = NLEEditorJniJNI.NLEChromaChannel_getSegment(this.swigCPtr, this);
        if (jNLEChromaChannel_getSegment == 0) {
            return null;
        }
        return new NLESegmentChromaChannel(jNLEChromaChannel_getSegment, true);
    }

    public NLEChromaChannel() {
        this(NLEEditorJniJNI.new_NLEChromaChannel(), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo130clone() {
        return mo130clone();
    }

    public static NLEChromaChannel dynamicCast(NLENode nLENode) {
        long jNLEChromaChannel_dynamicCast = NLEEditorJniJNI.NLEChromaChannel_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLEChromaChannel_dynamicCast == 0) {
            return null;
        }
        return new NLEChromaChannel(jNLEChromaChannel_dynamicCast, true);
    }

    public static long getCPtr(NLEChromaChannel nLEChromaChannel) {
        if (nLEChromaChannel == null) {
            return 0L;
        }
        return nLEChromaChannel.swigCPtr;
    }

    public void setSegment(NLESegmentChromaChannel nLESegmentChromaChannel) {
        NLEEditorJniJNI.NLEChromaChannel_setSegment(this.swigCPtr, this, NLESegmentChromaChannel.getCPtr(nLESegmentChromaChannel), nLESegmentChromaChannel);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEChromaChannel(long j, boolean z) {
        super(NLEEditorJniJNI.NLEChromaChannel_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
