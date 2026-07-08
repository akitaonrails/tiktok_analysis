package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentImageSticker extends NLESegmentSticker {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentImageSticker(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentImageSticker_clone = NLEEditorJniJNI.NLESegmentImageSticker_clone(this.swigCPtr, this);
        if (jNLESegmentImageSticker_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentImageSticker_clone, true);
    }

    public NLEStyClip getClip() {
        long jNLESegmentImageSticker_getClip = NLEEditorJniJNI.NLESegmentImageSticker_getClip(this.swigCPtr, this);
        if (jNLESegmentImageSticker_getClip == 0) {
            return null;
        }
        return new NLEStyClip(jNLESegmentImageSticker_getClip, true);
    }

    public NLEStyCrop getCrop() {
        long jNLESegmentImageSticker_getCrop = NLEEditorJniJNI.NLESegmentImageSticker_getCrop(this.swigCPtr, this);
        if (jNLESegmentImageSticker_getCrop == 0) {
            return null;
        }
        return new NLEStyCrop(jNLESegmentImageSticker_getCrop, true);
    }

    public NLEResourceNode getImageFile() {
        long jNLESegmentImageSticker_getImageFile = NLEEditorJniJNI.NLESegmentImageSticker_getImageFile(this.swigCPtr, this);
        if (jNLESegmentImageSticker_getImageFile == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentImageSticker_getImageFile, true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public NLEResourceNode getResource() {
        long jNLESegmentImageSticker_getResource = NLEEditorJniJNI.NLESegmentImageSticker_getResource(this.swigCPtr, this);
        if (jNLESegmentImageSticker_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentImageSticker_getResource, true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public NLEResType getType() {
        return NLEResType.swigToEnum(NLEEditorJniJNI.NLESegmentImageSticker_getType(this.swigCPtr, this));
    }

    public NLESegmentImageSticker() {
        this(NLEEditorJniJNI.new_NLESegmentImageSticker(), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo130clone() {
        return mo130clone();
    }

    public static NLESegmentImageSticker dynamicCast(NLENode nLENode) {
        long jNLESegmentImageSticker_dynamicCast = NLEEditorJniJNI.NLESegmentImageSticker_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentImageSticker_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentImageSticker(jNLESegmentImageSticker_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentImageSticker nLESegmentImageSticker) {
        if (nLESegmentImageSticker == null) {
            return 0L;
        }
        return nLESegmentImageSticker.swigCPtr;
    }

    public void setClip(NLEStyClip nLEStyClip) {
        NLEEditorJniJNI.NLESegmentImageSticker_setClip(this.swigCPtr, this, NLEStyClip.getCPtr(nLEStyClip), nLEStyClip);
    }

    public void setCrop(NLEStyCrop nLEStyCrop) {
        NLEEditorJniJNI.NLESegmentImageSticker_setCrop(this.swigCPtr, this, NLEStyCrop.getCPtr(nLEStyCrop), nLEStyCrop);
    }

    public void setImageFile(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLESegmentImageSticker_setImageFile(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentImageSticker(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentImageSticker_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
