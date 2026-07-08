package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentBorderSticker extends NLESegmentSticker {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentBorderSticker(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentBorderSticker_clone = NLEEditorJniJNI.NLESegmentBorderSticker_clone(this.swigCPtr, this);
        if (jNLESegmentBorderSticker_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentBorderSticker_clone, true);
    }

    public NLEResourceNode getEffectSDKFile() {
        long jNLESegmentBorderSticker_getEffectSDKFile = NLEEditorJniJNI.NLESegmentBorderSticker_getEffectSDKFile(this.swigCPtr, this);
        if (jNLESegmentBorderSticker_getEffectSDKFile == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentBorderSticker_getEffectSDKFile, true);
    }

    public NLEResourceNode getImageFile() {
        long jNLESegmentBorderSticker_getImageFile = NLEEditorJniJNI.NLESegmentBorderSticker_getImageFile(this.swigCPtr, this);
        if (jNLESegmentBorderSticker_getImageFile == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentBorderSticker_getImageFile, true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public NLEResourceNode getResource() {
        long jNLESegmentBorderSticker_getResource = NLEEditorJniJNI.NLESegmentBorderSticker_getResource(this.swigCPtr, this);
        if (jNLESegmentBorderSticker_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentBorderSticker_getResource, true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public NLEResType getType() {
        return NLEResType.swigToEnum(NLEEditorJniJNI.NLESegmentBorderSticker_getType(this.swigCPtr, this));
    }

    public NLESegmentBorderSticker() {
        this(NLEEditorJniJNI.new_NLESegmentBorderSticker(), true);
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

    public static NLESegmentBorderSticker dynamicCast(NLENode nLENode) {
        long jNLESegmentBorderSticker_dynamicCast = NLEEditorJniJNI.NLESegmentBorderSticker_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentBorderSticker_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentBorderSticker(jNLESegmentBorderSticker_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentBorderSticker nLESegmentBorderSticker) {
        if (nLESegmentBorderSticker == null) {
            return 0L;
        }
        return nLESegmentBorderSticker.swigCPtr;
    }

    public void setEffectSDKFile(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLESegmentBorderSticker_setEffectSDKFile(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setImageFile(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLESegmentBorderSticker_setImageFile(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentBorderSticker(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentBorderSticker_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
