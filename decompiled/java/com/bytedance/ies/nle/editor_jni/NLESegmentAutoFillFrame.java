package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentAutoFillFrame extends NLESegment {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentAutoFillFrame(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentAutoFillFrame_clone = NLEEditorJniJNI.NLESegmentAutoFillFrame_clone(this.swigCPtr, this);
        if (jNLESegmentAutoFillFrame_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentAutoFillFrame_clone, true);
    }

    public float getAlgScale() {
        return NLEEditorJniJNI.NLESegmentAutoFillFrame_getAlgScale(this.swigCPtr, this);
    }

    public NLEAutoFillAlgType getAutoFillAlgType() {
        return NLEAutoFillAlgType.swigToEnum(NLEEditorJniJNI.NLESegmentAutoFillFrame_getAutoFillAlgType(this.swigCPtr, this));
    }

    public NLEResourceNode getEffectSDKAutoFillFrame() {
        long jNLESegmentAutoFillFrame_getEffectSDKAutoFillFrame = NLEEditorJniJNI.NLESegmentAutoFillFrame_getEffectSDKAutoFillFrame(this.swigCPtr, this);
        if (jNLESegmentAutoFillFrame_getEffectSDKAutoFillFrame == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentAutoFillFrame_getEffectSDKAutoFillFrame, true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public NLEResourceNode getResource() {
        long jNLESegmentAutoFillFrame_getResource = NLEEditorJniJNI.NLESegmentAutoFillFrame_getResource(this.swigCPtr, this);
        if (jNLESegmentAutoFillFrame_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentAutoFillFrame_getResource, true);
    }

    public boolean hasAlgScale() {
        return NLEEditorJniJNI.NLESegmentAutoFillFrame_hasAlgScale(this.swigCPtr, this);
    }

    public boolean hasAutoFillAlgType() {
        return NLEEditorJniJNI.NLESegmentAutoFillFrame_hasAutoFillAlgType(this.swigCPtr, this);
    }

    public NLESegmentAutoFillFrame() {
        this(NLEEditorJniJNI.new_NLESegmentAutoFillFrame(), true);
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

    public static NLESegmentAutoFillFrame dynamicCast(NLENode nLENode) {
        long jNLESegmentAutoFillFrame_dynamicCast = NLEEditorJniJNI.NLESegmentAutoFillFrame_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentAutoFillFrame_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentAutoFillFrame(jNLESegmentAutoFillFrame_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentAutoFillFrame nLESegmentAutoFillFrame) {
        if (nLESegmentAutoFillFrame == null) {
            return 0L;
        }
        return nLESegmentAutoFillFrame.swigCPtr;
    }

    public void setAlgScale(float f) {
        NLEEditorJniJNI.NLESegmentAutoFillFrame_setAlgScale(this.swigCPtr, this, f);
    }

    public void setAutoFillAlgType(NLEAutoFillAlgType nLEAutoFillAlgType) {
        NLEEditorJniJNI.NLESegmentAutoFillFrame_setAutoFillAlgType(this.swigCPtr, this, nLEAutoFillAlgType.swigValue());
    }

    public void setEffectSDKAutoFillFrame(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLESegmentAutoFillFrame_setEffectSDKAutoFillFrame(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentAutoFillFrame(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentAutoFillFrame_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
