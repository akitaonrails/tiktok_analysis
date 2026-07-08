package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentEmojiSticker extends NLESegmentSticker {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentEmojiSticker(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentEmojiSticker_clone = NLEEditorJniJNI.NLESegmentEmojiSticker_clone(this.swigCPtr, this);
        if (jNLESegmentEmojiSticker_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentEmojiSticker_clone, true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public NLEResType getType() {
        return NLEResType.swigToEnum(NLEEditorJniJNI.NLESegmentEmojiSticker_getType(this.swigCPtr, this));
    }

    public String getutf8Code() {
        return NLEEditorJniJNI.NLESegmentEmojiSticker_getutf8Code(this.swigCPtr, this);
    }

    public boolean hasutf8Code() {
        return NLEEditorJniJNI.NLESegmentEmojiSticker_hasutf8Code(this.swigCPtr, this);
    }

    public NLESegmentEmojiSticker() {
        this(NLEEditorJniJNI.new_NLESegmentEmojiSticker(), true);
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

    public static NLESegmentEmojiSticker dynamicCast(NLENode nLENode) {
        long jNLESegmentEmojiSticker_dynamicCast = NLEEditorJniJNI.NLESegmentEmojiSticker_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentEmojiSticker_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentEmojiSticker(jNLESegmentEmojiSticker_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentEmojiSticker nLESegmentEmojiSticker) {
        if (nLESegmentEmojiSticker == null) {
            return 0L;
        }
        return nLESegmentEmojiSticker.swigCPtr;
    }

    public void setutf8Code(String str) {
        NLEEditorJniJNI.NLESegmentEmojiSticker_setutf8Code(this.swigCPtr, this, str);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegmentSticker, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentEmojiSticker(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentEmojiSticker_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
