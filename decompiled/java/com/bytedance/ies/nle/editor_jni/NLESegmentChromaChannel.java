package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentChromaChannel extends NLESegment {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentChromaChannel(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentChromaChannel_clone = NLEEditorJniJNI.NLESegmentChromaChannel_clone(this.swigCPtr, this);
        if (jNLESegmentChromaChannel_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentChromaChannel_clone, true);
    }

    public long getColor() {
        return NLEEditorJniJNI.NLESegmentChromaChannel_getColor(this.swigCPtr, this);
    }

    public float getEdgeSmooth() {
        return NLEEditorJniJNI.NLESegmentChromaChannel_getEdgeSmooth(this.swigCPtr, this);
    }

    public NLEResourceNode getEffectSDKChroma() {
        long jNLESegmentChromaChannel_getEffectSDKChroma = NLEEditorJniJNI.NLESegmentChromaChannel_getEffectSDKChroma(this.swigCPtr, this);
        if (jNLESegmentChromaChannel_getEffectSDKChroma == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentChromaChannel_getEffectSDKChroma, true);
    }

    public float getIntensity() {
        return NLEEditorJniJNI.NLESegmentChromaChannel_getIntensity(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public NLEResourceNode getResource() {
        long jNLESegmentChromaChannel_getResource = NLEEditorJniJNI.NLESegmentChromaChannel_getResource(this.swigCPtr, this);
        if (jNLESegmentChromaChannel_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentChromaChannel_getResource, true);
    }

    public float getShadow() {
        return NLEEditorJniJNI.NLESegmentChromaChannel_getShadow(this.swigCPtr, this);
    }

    public float getSpill() {
        return NLEEditorJniJNI.NLESegmentChromaChannel_getSpill(this.swigCPtr, this);
    }

    public boolean hasColor() {
        return NLEEditorJniJNI.NLESegmentChromaChannel_hasColor(this.swigCPtr, this);
    }

    public boolean hasEdgeSmooth() {
        return NLEEditorJniJNI.NLESegmentChromaChannel_hasEdgeSmooth(this.swigCPtr, this);
    }

    public boolean hasIntensity() {
        return NLEEditorJniJNI.NLESegmentChromaChannel_hasIntensity(this.swigCPtr, this);
    }

    public boolean hasShadow() {
        return NLEEditorJniJNI.NLESegmentChromaChannel_hasShadow(this.swigCPtr, this);
    }

    public boolean hasSpill() {
        return NLEEditorJniJNI.NLESegmentChromaChannel_hasSpill(this.swigCPtr, this);
    }

    public NLESegmentChromaChannel() {
        this(NLEEditorJniJNI.new_NLESegmentChromaChannel(), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo130clone() {
        return mo130clone();
    }

    public static NLESegmentChromaChannel dynamicCast(NLENode nLENode) {
        long jNLESegmentChromaChannel_dynamicCast = NLEEditorJniJNI.NLESegmentChromaChannel_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentChromaChannel_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentChromaChannel(jNLESegmentChromaChannel_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentChromaChannel nLESegmentChromaChannel) {
        if (nLESegmentChromaChannel == null) {
            return 0L;
        }
        return nLESegmentChromaChannel.swigCPtr;
    }

    public void setColor(long j) {
        NLEEditorJniJNI.NLESegmentChromaChannel_setColor(this.swigCPtr, this, j);
    }

    public void setEdgeSmooth(float f) {
        NLEEditorJniJNI.NLESegmentChromaChannel_setEdgeSmooth(this.swigCPtr, this, f);
    }

    public void setEffectSDKChroma(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLESegmentChromaChannel_setEffectSDKChroma(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setIntensity(float f) {
        NLEEditorJniJNI.NLESegmentChromaChannel_setIntensity(this.swigCPtr, this, f);
    }

    public void setShadow(float f) {
        NLEEditorJniJNI.NLESegmentChromaChannel_setShadow(this.swigCPtr, this, f);
    }

    public void setSpill(float f) {
        NLEEditorJniJNI.NLESegmentChromaChannel_setSpill(this.swigCPtr, this, f);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentChromaChannel(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentChromaChannel_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
