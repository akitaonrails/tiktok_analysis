package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentVideo extends NLESegmentAudio {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentAudio, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentVideo(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentAudio, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentVideo_clone = NLEEditorJniJNI.NLESegmentVideo_clone(this.swigCPtr, this);
        if (jNLESegmentVideo_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentVideo_clone, true);
    }

    public float getAlpha() {
        return NLEEditorJniJNI.NLESegmentVideo_getAlpha(this.swigCPtr, this);
    }

    public NLEResourceNode getBlendFile() {
        long jNLESegmentVideo_getBlendFile = NLEEditorJniJNI.NLESegmentVideo_getBlendFile(this.swigCPtr, this);
        if (jNLESegmentVideo_getBlendFile == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentVideo_getBlendFile, true);
    }

    public NLEStyCanvas getCanvasStyle() {
        long jNLESegmentVideo_getCanvasStyle = NLEEditorJniJNI.NLESegmentVideo_getCanvasStyle(this.swigCPtr, this);
        if (jNLESegmentVideo_getCanvasStyle == 0) {
            return null;
        }
        return new NLEStyCanvas(jNLESegmentVideo_getCanvasStyle, true);
    }

    public NLEStyClip getClip() {
        long jNLESegmentVideo_getClip = NLEEditorJniJNI.NLESegmentVideo_getClip(this.swigCPtr, this);
        if (jNLESegmentVideo_getClip == 0) {
            return null;
        }
        return new NLEStyClip(jNLESegmentVideo_getClip, true);
    }

    public NLEStyCrop getCrop() {
        long jNLESegmentVideo_getCrop = NLEEditorJniJNI.NLESegmentVideo_getCrop(this.swigCPtr, this);
        if (jNLESegmentVideo_getCrop == 0) {
            return null;
        }
        return new NLEStyCrop(jNLESegmentVideo_getCrop, true);
    }

    public boolean getEnableAudio() {
        return NLEEditorJniJNI.NLESegmentVideo_getEnableAudio(this.swigCPtr, this);
    }

    public boolean getIgnoreUserSetTimeClipEnd() {
        return NLEEditorJniJNI.NLESegmentVideo_getIgnoreUserSetTimeClipEnd(this.swigCPtr, this);
    }

    public boolean getIsWithEffect() {
        return NLEEditorJniJNI.NLESegmentVideo_getIsWithEffect(this.swigCPtr, this);
    }

    public boolean hasAlpha() {
        return NLEEditorJniJNI.NLESegmentVideo_hasAlpha(this.swigCPtr, this);
    }

    public boolean hasEnableAudio() {
        return NLEEditorJniJNI.NLESegmentVideo_hasEnableAudio(this.swigCPtr, this);
    }

    public boolean hasIgnoreUserSetTimeClipEnd() {
        return NLEEditorJniJNI.NLESegmentVideo_hasIgnoreUserSetTimeClipEnd(this.swigCPtr, this);
    }

    public boolean hasIsWithEffect() {
        return NLEEditorJniJNI.NLESegmentVideo_hasIsWithEffect(this.swigCPtr, this);
    }

    public NLESegmentVideo() {
        this(NLEEditorJniJNI.new_NLESegmentVideo(), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentAudio, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentAudio, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo130clone() {
        return mo130clone();
    }

    public static NLESegmentVideo dynamicCast(NLENode nLENode) {
        long jNLESegmentVideo_dynamicCast = NLEEditorJniJNI.NLESegmentVideo_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentVideo_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentVideo(jNLESegmentVideo_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentVideo nLESegmentVideo) {
        if (nLESegmentVideo == null) {
            return 0L;
        }
        return nLESegmentVideo.swigCPtr;
    }

    public void setAlpha(float f) {
        NLEEditorJniJNI.NLESegmentVideo_setAlpha(this.swigCPtr, this, f);
    }

    public void setBlendFile(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLESegmentVideo_setBlendFile(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setCanvasStyle(NLEStyCanvas nLEStyCanvas) {
        NLEEditorJniJNI.NLESegmentVideo_setCanvasStyle(this.swigCPtr, this, NLEStyCanvas.getCPtr(nLEStyCanvas), nLEStyCanvas);
    }

    public void setClip(NLEStyClip nLEStyClip) {
        NLEEditorJniJNI.NLESegmentVideo_setClip(this.swigCPtr, this, NLEStyClip.getCPtr(nLEStyClip), nLEStyClip);
    }

    public void setCrop(NLEStyCrop nLEStyCrop) {
        NLEEditorJniJNI.NLESegmentVideo_setCrop(this.swigCPtr, this, NLEStyCrop.getCPtr(nLEStyCrop), nLEStyCrop);
    }

    public void setEnableAudio(boolean z) {
        NLEEditorJniJNI.NLESegmentVideo_setEnableAudio(this.swigCPtr, this, z);
    }

    public void setIgnoreUserSetTimeClipEnd(boolean z) {
        NLEEditorJniJNI.NLESegmentVideo_setIgnoreUserSetTimeClipEnd(this.swigCPtr, this, z);
    }

    public void setIsWithEffect(boolean z) {
        NLEEditorJniJNI.NLESegmentVideo_setIsWithEffect(this.swigCPtr, this, z);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentAudio, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentVideo(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentVideo_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
