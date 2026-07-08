package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentInfoSticker extends NLESegmentSticker {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentInfoSticker(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentInfoSticker_clone = NLEEditorJniJNI.NLESegmentInfoSticker_clone(this.swigCPtr, this);
        if (jNLESegmentInfoSticker_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentInfoSticker_clone, true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void copyValueNotMappedToStage() {
        NLEEditorJniJNI.NLESegmentInfoSticker_copyValueNotMappedToStage(this.swigCPtr, this);
    }

    public boolean getAddWithBuffer() {
        return NLEEditorJniJNI.NLESegmentInfoSticker_getAddWithBuffer(this.swigCPtr, this);
    }

    public NLEResourceNode getEffectSDKFile() {
        long jNLESegmentInfoSticker_getEffectSDKFile = NLEEditorJniJNI.NLESegmentInfoSticker_getEffectSDKFile(this.swigCPtr, this);
        if (jNLESegmentInfoSticker_getEffectSDKFile == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentInfoSticker_getEffectSDKFile, true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public NLEResourceNode getResource() {
        long jNLESegmentInfoSticker_getResource = NLEEditorJniJNI.NLESegmentInfoSticker_getResource(this.swigCPtr, this);
        if (jNLESegmentInfoSticker_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentInfoSticker_getResource, true);
    }

    public boolean hasAddWithBuffer() {
        return NLEEditorJniJNI.NLESegmentInfoSticker_hasAddWithBuffer(this.swigCPtr, this);
    }

    public NLESegmentInfoSticker() {
        this(NLEEditorJniJNI.new_NLESegmentInfoSticker(), true);
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

    public static NLESegmentInfoSticker dynamicCast(NLENode nLENode) {
        long jNLESegmentInfoSticker_dynamicCast = NLEEditorJniJNI.NLESegmentInfoSticker_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentInfoSticker_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentInfoSticker(jNLESegmentInfoSticker_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentInfoSticker nLESegmentInfoSticker) {
        if (nLESegmentInfoSticker == null) {
            return 0L;
        }
        return nLESegmentInfoSticker.swigCPtr;
    }

    public void setAddWithBuffer(boolean z) {
        NLEEditorJniJNI.NLESegmentInfoSticker_setAddWithBuffer(this.swigCPtr, this, z);
    }

    public void setEffectSDKFile(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLESegmentInfoSticker_setEffectSDKFile(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentInfoSticker(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentInfoSticker_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
