package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentMV extends NLESegment {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentMV(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentMV_clone = NLEEditorJniJNI.NLESegmentMV_clone(this.swigCPtr, this);
        if (jNLESegmentMV_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentMV_clone, true);
    }

    public NLEStyClip getClip() {
        long jNLESegmentMV_getClip = NLEEditorJniJNI.NLESegmentMV_getClip(this.swigCPtr, this);
        if (jNLESegmentMV_getClip == 0) {
            return null;
        }
        return new NLEStyClip(jNLESegmentMV_getClip, true);
    }

    public NLEStyCrop getCrop() {
        long jNLESegmentMV_getCrop = NLEEditorJniJNI.NLESegmentMV_getCrop(this.swigCPtr, this);
        if (jNLESegmentMV_getCrop == 0) {
            return null;
        }
        return new NLEStyCrop(jNLESegmentMV_getCrop, true);
    }

    public long getHeight() {
        return NLEEditorJniJNI.NLESegmentMV_getHeight(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public NLEResourceNode getResource() {
        long jNLESegmentMV_getResource = NLEEditorJniJNI.NLESegmentMV_getResource(this.swigCPtr, this);
        if (jNLESegmentMV_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentMV_getResource, true);
    }

    public NLEResourceNode getSourceFile() {
        long jNLESegmentMV_getSourceFile = NLEEditorJniJNI.NLESegmentMV_getSourceFile(this.swigCPtr, this);
        if (jNLESegmentMV_getSourceFile == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentMV_getSourceFile, true);
    }

    public String getSourceFileType() {
        return NLEEditorJniJNI.NLESegmentMV_getSourceFileType(this.swigCPtr, this);
    }

    public long getTimeClipEnd() {
        return NLEEditorJniJNI.NLESegmentMV_getTimeClipEnd(this.swigCPtr, this);
    }

    public long getTimeClipStart() {
        return NLEEditorJniJNI.NLESegmentMV_getTimeClipStart(this.swigCPtr, this);
    }

    public float getVolume() {
        return NLEEditorJniJNI.NLESegmentMV_getVolume(this.swigCPtr, this);
    }

    public long getWidth() {
        return NLEEditorJniJNI.NLESegmentMV_getWidth(this.swigCPtr, this);
    }

    public boolean hasHeight() {
        return NLEEditorJniJNI.NLESegmentMV_hasHeight(this.swigCPtr, this);
    }

    public boolean hasSourceFileType() {
        return NLEEditorJniJNI.NLESegmentMV_hasSourceFileType(this.swigCPtr, this);
    }

    public boolean hasTimeClipEnd() {
        return NLEEditorJniJNI.NLESegmentMV_hasTimeClipEnd(this.swigCPtr, this);
    }

    public boolean hasTimeClipStart() {
        return NLEEditorJniJNI.NLESegmentMV_hasTimeClipStart(this.swigCPtr, this);
    }

    public boolean hasVolume() {
        return NLEEditorJniJNI.NLESegmentMV_hasVolume(this.swigCPtr, this);
    }

    public boolean hasWidth() {
        return NLEEditorJniJNI.NLESegmentMV_hasWidth(this.swigCPtr, this);
    }

    public NLESegmentMV() {
        this(NLEEditorJniJNI.new_NLESegmentMV(), true);
    }

    public static String getTYPE_AUDIO() {
        return NLEEditorJniJNI.NLESegmentMV_TYPE_AUDIO_get();
    }

    public static String getTYPE_BGIMG() {
        return NLEEditorJniJNI.NLESegmentMV_TYPE_BGIMG_get();
    }

    public static String getTYPE_GIF() {
        return NLEEditorJniJNI.NLESegmentMV_TYPE_GIF_get();
    }

    public static String getTYPE_IMAGE() {
        return NLEEditorJniJNI.NLESegmentMV_TYPE_IMAGE_get();
    }

    public static String getTYPE_RGBA() {
        return NLEEditorJniJNI.NLESegmentMV_TYPE_RGBA_get();
    }

    public static String getTYPE_TEXT() {
        return NLEEditorJniJNI.NLESegmentMV_TYPE_TEXT_get();
    }

    public static String getTYPE_VIDEO() {
        return NLEEditorJniJNI.NLESegmentMV_TYPE_VIDEO_get();
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

    public static NLESegmentMV dynamicCast(NLENode nLENode) {
        long jNLESegmentMV_dynamicCast = NLEEditorJniJNI.NLESegmentMV_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentMV_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentMV(jNLESegmentMV_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentMV nLESegmentMV) {
        if (nLESegmentMV == null) {
            return 0L;
        }
        return nLESegmentMV.swigCPtr;
    }

    public void setClip(NLEStyClip nLEStyClip) {
        NLEEditorJniJNI.NLESegmentMV_setClip(this.swigCPtr, this, NLEStyClip.getCPtr(nLEStyClip), nLEStyClip);
    }

    public void setCrop(NLEStyCrop nLEStyCrop) {
        NLEEditorJniJNI.NLESegmentMV_setCrop(this.swigCPtr, this, NLEStyCrop.getCPtr(nLEStyCrop), nLEStyCrop);
    }

    public void setHeight(long j) {
        NLEEditorJniJNI.NLESegmentMV_setHeight(this.swigCPtr, this, j);
    }

    public void setSourceFile(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLESegmentMV_setSourceFile(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setSourceFileType(String str) {
        NLEEditorJniJNI.NLESegmentMV_setSourceFileType(this.swigCPtr, this, str);
    }

    public void setTimeClipEnd(long j) {
        NLEEditorJniJNI.NLESegmentMV_setTimeClipEnd(this.swigCPtr, this, j);
    }

    public void setTimeClipStart(long j) {
        NLEEditorJniJNI.NLESegmentMV_setTimeClipStart(this.swigCPtr, this, j);
    }

    public void setVolume(float f) {
        NLEEditorJniJNI.NLESegmentMV_setVolume(this.swigCPtr, this, f);
    }

    public void setWidth(long j) {
        NLEEditorJniJNI.NLESegmentMV_setWidth(this.swigCPtr, this, j);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentMV(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentMV_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
