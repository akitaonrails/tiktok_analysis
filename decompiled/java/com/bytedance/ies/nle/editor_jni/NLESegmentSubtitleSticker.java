package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentSubtitleSticker extends NLESegmentSticker {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentSubtitleSticker(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentSubtitleSticker_clone = NLEEditorJniJNI.NLESegmentSubtitleSticker_clone(this.swigCPtr, this);
        if (jNLESegmentSubtitleSticker_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentSubtitleSticker_clone, true);
    }

    public String getConnectedAudioSlotUUID() {
        return NLEEditorJniJNI.NLESegmentSubtitleSticker_getConnectedAudioSlotUUID(this.swigCPtr, this);
    }

    public NLEResourceNode getEffectSDKFile() {
        long jNLESegmentSubtitleSticker_getEffectSDKFile = NLEEditorJniJNI.NLESegmentSubtitleSticker_getEffectSDKFile(this.swigCPtr, this);
        if (jNLESegmentSubtitleSticker_getEffectSDKFile == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentSubtitleSticker_getEffectSDKFile, true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public NLEResourceNode getResource() {
        long jNLESegmentSubtitleSticker_getResource = NLEEditorJniJNI.NLESegmentSubtitleSticker_getResource(this.swigCPtr, this);
        if (jNLESegmentSubtitleSticker_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentSubtitleSticker_getResource, true);
    }

    public NLEResourceNode getSRTFile() {
        long jNLESegmentSubtitleSticker_getSRTFile = NLEEditorJniJNI.NLESegmentSubtitleSticker_getSRTFile(this.swigCPtr, this);
        if (jNLESegmentSubtitleSticker_getSRTFile == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentSubtitleSticker_getSRTFile, true);
    }

    public NLEStyText getStyle() {
        long jNLESegmentSubtitleSticker_getStyle = NLEEditorJniJNI.NLESegmentSubtitleSticker_getStyle(this.swigCPtr, this);
        if (jNLESegmentSubtitleSticker_getStyle == 0) {
            return null;
        }
        return new NLEStyText(jNLESegmentSubtitleSticker_getStyle, true);
    }

    public long getTimeClipEnd() {
        return NLEEditorJniJNI.NLESegmentSubtitleSticker_getTimeClipEnd(this.swigCPtr, this);
    }

    public long getTimeClipStart() {
        return NLEEditorJniJNI.NLESegmentSubtitleSticker_getTimeClipStart(this.swigCPtr, this);
    }

    public boolean hasConnectedAudioSlotUUID() {
        return NLEEditorJniJNI.NLESegmentSubtitleSticker_hasConnectedAudioSlotUUID(this.swigCPtr, this);
    }

    public boolean hasTimeClipEnd() {
        return NLEEditorJniJNI.NLESegmentSubtitleSticker_hasTimeClipEnd(this.swigCPtr, this);
    }

    public boolean hasTimeClipStart() {
        return NLEEditorJniJNI.NLESegmentSubtitleSticker_hasTimeClipStart(this.swigCPtr, this);
    }

    public NLESegmentSubtitleSticker() {
        this(NLEEditorJniJNI.new_NLESegmentSubtitleSticker(), true);
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

    public static NLESegmentSubtitleSticker dynamicCast(NLENode nLENode) {
        long jNLESegmentSubtitleSticker_dynamicCast = NLEEditorJniJNI.NLESegmentSubtitleSticker_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentSubtitleSticker_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentSubtitleSticker(jNLESegmentSubtitleSticker_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentSubtitleSticker nLESegmentSubtitleSticker) {
        if (nLESegmentSubtitleSticker == null) {
            return 0L;
        }
        return nLESegmentSubtitleSticker.swigCPtr;
    }

    public void setConnectedAudioSlotUUID(String str) {
        NLEEditorJniJNI.NLESegmentSubtitleSticker_setConnectedAudioSlotUUID(this.swigCPtr, this, str);
    }

    public void setEffectSDKFile(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLESegmentSubtitleSticker_setEffectSDKFile(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setSRTFile(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLESegmentSubtitleSticker_setSRTFile(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setStyle(NLEStyText nLEStyText) {
        NLEEditorJniJNI.NLESegmentSubtitleSticker_setStyle(this.swigCPtr, this, NLEStyText.getCPtr(nLEStyText), nLEStyText);
    }

    public void setTimeClipEnd(long j) {
        NLEEditorJniJNI.NLESegmentSubtitleSticker_setTimeClipEnd(this.swigCPtr, this, j);
    }

    public void setTimeClipStart(long j) {
        NLEEditorJniJNI.NLESegmentSubtitleSticker_setTimeClipStart(this.swigCPtr, this, j);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentSubtitleSticker(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentSubtitleSticker_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
