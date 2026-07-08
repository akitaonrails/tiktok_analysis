package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentTextSticker extends NLESegmentSticker {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentTextSticker(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public void clearRichContentResource() {
        NLEEditorJniJNI.NLESegmentTextSticker_clearRichContentResource(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentTextSticker_clone = NLEEditorJniJNI.NLESegmentTextSticker_clone(this.swigCPtr, this);
        if (jNLESegmentTextSticker_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentTextSticker_clone, true);
    }

    public NLEStyRecognizedWord getCommonRecognizedWord() {
        long jNLESegmentTextSticker_getCommonRecognizedWord = NLEEditorJniJNI.NLESegmentTextSticker_getCommonRecognizedWord(this.swigCPtr, this);
        if (jNLESegmentTextSticker_getCommonRecognizedWord == 0) {
            return null;
        }
        return new NLEStyRecognizedWord(jNLESegmentTextSticker_getCommonRecognizedWord, true);
    }

    public String getContent() {
        return NLEEditorJniJNI.NLESegmentTextSticker_getContent(this.swigCPtr, this);
    }

    public boolean getIsRichtext() {
        return NLEEditorJniJNI.NLESegmentTextSticker_getIsRichtext(this.swigCPtr, this);
    }

    public String getRichContent() {
        return NLEEditorJniJNI.NLESegmentTextSticker_getRichContent(this.swigCPtr, this);
    }

    public VecNLEResourceNodeSPtr getRichContentResources() {
        return new VecNLEResourceNodeSPtr(NLEEditorJniJNI.NLESegmentTextSticker_getRichContentResources(this.swigCPtr, this), true);
    }

    public NLEStyText getStyle() {
        long jNLESegmentTextSticker_getStyle = NLEEditorJniJNI.NLESegmentTextSticker_getStyle(this.swigCPtr, this);
        if (jNLESegmentTextSticker_getStyle == 0) {
            return null;
        }
        return new NLEStyText(jNLESegmentTextSticker_getStyle, true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public NLEResType getType() {
        return NLEResType.swigToEnum(NLEEditorJniJNI.NLESegmentTextSticker_getType(this.swigCPtr, this));
    }

    public boolean hasContent() {
        return NLEEditorJniJNI.NLESegmentTextSticker_hasContent(this.swigCPtr, this);
    }

    public boolean hasIsRichtext() {
        return NLEEditorJniJNI.NLESegmentTextSticker_hasIsRichtext(this.swigCPtr, this);
    }

    public boolean hasRichContent() {
        return NLEEditorJniJNI.NLESegmentTextSticker_hasRichContent(this.swigCPtr, this);
    }

    public String toEffectJson() {
        return NLEEditorJniJNI.NLESegmentTextSticker_toEffectJson(this.swigCPtr, this);
    }

    public NLESegmentTextSticker() {
        this(NLEEditorJniJNI.new_NLESegmentTextSticker__SWIG_0(), true);
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

    public NLESegmentTextSticker(String str) {
        this(NLEEditorJniJNI.new_NLESegmentTextSticker__SWIG_1(str), true);
    }

    public static NLESegmentTextSticker dynamicCast(NLENode nLENode) {
        long jNLESegmentTextSticker_dynamicCast = NLEEditorJniJNI.NLESegmentTextSticker_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentTextSticker_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentTextSticker(jNLESegmentTextSticker_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentTextSticker nLESegmentTextSticker) {
        if (nLESegmentTextSticker == null) {
            return 0L;
        }
        return nLESegmentTextSticker.swigCPtr;
    }

    public void addRichContentResource(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLESegmentTextSticker_addRichContentResource(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public boolean removeRichContentResource(NLEResourceNode nLEResourceNode) {
        return NLEEditorJniJNI.NLESegmentTextSticker_removeRichContentResource(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    public void setCommonRecognizedWord(NLEStyRecognizedWord nLEStyRecognizedWord) {
        NLEEditorJniJNI.NLESegmentTextSticker_setCommonRecognizedWord(this.swigCPtr, this, NLEStyRecognizedWord.getCPtr(nLEStyRecognizedWord), nLEStyRecognizedWord);
    }

    public void setContent(String str) {
        NLEEditorJniJNI.NLESegmentTextSticker_setContent(this.swigCPtr, this, str);
    }

    public void setEffectSDKJsonString(String str) {
        NLEEditorJniJNI.NLESegmentTextSticker_setEffectSDKJsonString(this.swigCPtr, this, str);
    }

    public void setIsRichtext(boolean z) {
        NLEEditorJniJNI.NLESegmentTextSticker_setIsRichtext(this.swigCPtr, this, z);
    }

    public void setRichContent(String str) {
        NLEEditorJniJNI.NLESegmentTextSticker_setRichContent(this.swigCPtr, this, str);
    }

    public void setStyle(NLEStyText nLEStyText) {
        NLEEditorJniJNI.NLESegmentTextSticker_setStyle(this.swigCPtr, this, NLEStyText.getCPtr(nLEStyText), nLEStyText);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentTextSticker(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentTextSticker_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
