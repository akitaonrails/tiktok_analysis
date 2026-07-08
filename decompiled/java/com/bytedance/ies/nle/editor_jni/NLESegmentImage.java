package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentImage extends NLESegment {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentImage(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentImage_clone = NLEEditorJniJNI.NLESegmentImage_clone(this.swigCPtr, this);
        if (jNLESegmentImage_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentImage_clone, true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void copyValueNotMappedToStage() {
        NLEEditorJniJNI.NLESegmentImage_copyValueNotMappedToStage(this.swigCPtr, this);
    }

    public float getAlpha() {
        return NLEEditorJniJNI.NLESegmentImage_getAlpha(this.swigCPtr, this);
    }

    public NLEStyCanvas getCanvasStyle() {
        long jNLESegmentImage_getCanvasStyle = NLEEditorJniJNI.NLESegmentImage_getCanvasStyle(this.swigCPtr, this);
        if (jNLESegmentImage_getCanvasStyle == 0) {
            return null;
        }
        return new NLEStyCanvas(jNLESegmentImage_getCanvasStyle, true);
    }

    public NLEStyClip getClip() {
        long jNLESegmentImage_getClip = NLEEditorJniJNI.NLESegmentImage_getClip(this.swigCPtr, this);
        if (jNLESegmentImage_getClip == 0) {
            return null;
        }
        return new NLEStyClip(jNLESegmentImage_getClip, true);
    }

    public NLEStyCrop getCrop() {
        long jNLESegmentImage_getCrop = NLEEditorJniJNI.NLESegmentImage_getCrop(this.swigCPtr, this);
        if (jNLESegmentImage_getCrop == 0) {
            return null;
        }
        return new NLEStyCrop(jNLESegmentImage_getCrop, true);
    }

    public NLEResourceNode getImageFile() {
        long jNLESegmentImage_getImageFile = NLEEditorJniJNI.NLESegmentImage_getImageFile(this.swigCPtr, this);
        if (jNLESegmentImage_getImageFile == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentImage_getImageFile, true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public NLEResourceNode getResource() {
        long jNLESegmentImage_getResource = NLEEditorJniJNI.NLESegmentImage_getResource(this.swigCPtr, this);
        if (jNLESegmentImage_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentImage_getResource, true);
    }

    public boolean hasAlpha() {
        return NLEEditorJniJNI.NLESegmentImage_hasAlpha(this.swigCPtr, this);
    }

    public NLESegmentImage() {
        this(NLEEditorJniJNI.new_NLESegmentImage(), true);
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

    public static NLESegmentImage dynamicCast(NLENode nLENode) {
        long jNLESegmentImage_dynamicCast = NLEEditorJniJNI.NLESegmentImage_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentImage_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentImage(jNLESegmentImage_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentImage nLESegmentImage) {
        if (nLESegmentImage == null) {
            return 0L;
        }
        return nLESegmentImage.swigCPtr;
    }

    public void setAlpha(float f) {
        NLEEditorJniJNI.NLESegmentImage_setAlpha(this.swigCPtr, this, f);
    }

    public void setCanvasStyle(NLEStyCanvas nLEStyCanvas) {
        NLEEditorJniJNI.NLESegmentImage_setCanvasStyle(this.swigCPtr, this, NLEStyCanvas.getCPtr(nLEStyCanvas), nLEStyCanvas);
    }

    public void setClip(NLEStyClip nLEStyClip) {
        NLEEditorJniJNI.NLESegmentImage_setClip(this.swigCPtr, this, NLEStyClip.getCPtr(nLEStyClip), nLEStyClip);
    }

    public void setCrop(NLEStyCrop nLEStyCrop) {
        NLEEditorJniJNI.NLESegmentImage_setCrop(this.swigCPtr, this, NLEStyCrop.getCPtr(nLEStyCrop), nLEStyCrop);
    }

    public void setImageFile(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLESegmentImage_setImageFile(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentImage(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentImage_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
