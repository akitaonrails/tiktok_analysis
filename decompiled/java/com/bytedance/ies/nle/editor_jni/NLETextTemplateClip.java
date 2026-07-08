package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLETextTemplateClip extends NLENode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLETextTemplateClip(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLETextTemplateClip_clone = NLEEditorJniJNI.NLETextTemplateClip_clone(this.swigCPtr, this);
        if (jNLETextTemplateClip_clone == 0) {
            return null;
        }
        return new NLENode(jNLETextTemplateClip_clone, true);
    }

    public int getAlignTypeWithoutLimitSize() {
        return NLEEditorJniJNI.NLETextTemplateClip_getAlignTypeWithoutLimitSize(this.swigCPtr, this);
    }

    public String getContent() {
        return NLEEditorJniJNI.NLETextTemplateClip_getContent(this.swigCPtr, this);
    }

    public NLEStyText getContentStyle() {
        long jNLETextTemplateClip_getContentStyle = NLEEditorJniJNI.NLETextTemplateClip_getContentStyle(this.swigCPtr, this);
        if (jNLETextTemplateClip_getContentStyle == 0) {
            return null;
        }
        return new NLEStyText(jNLETextTemplateClip_getContentStyle, true);
    }

    public int getIndex() {
        return NLEEditorJniJNI.NLETextTemplateClip_getIndex(this.swigCPtr, this);
    }

    public boolean hasAlignTypeWithoutLimitSize() {
        return NLEEditorJniJNI.NLETextTemplateClip_hasAlignTypeWithoutLimitSize(this.swigCPtr, this);
    }

    public boolean hasContent() {
        return NLEEditorJniJNI.NLETextTemplateClip_hasContent(this.swigCPtr, this);
    }

    public boolean hasIndex() {
        return NLEEditorJniJNI.NLETextTemplateClip_hasIndex(this.swigCPtr, this);
    }

    public NLETextTemplateClip() {
        this(NLEEditorJniJNI.new_NLETextTemplateClip(), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo130clone() {
        return mo130clone();
    }

    public static NLETextTemplateClip dynamicCast(NLENode nLENode) {
        long jNLETextTemplateClip_dynamicCast = NLEEditorJniJNI.NLETextTemplateClip_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLETextTemplateClip_dynamicCast == 0) {
            return null;
        }
        return new NLETextTemplateClip(jNLETextTemplateClip_dynamicCast, true);
    }

    public static long getCPtr(NLETextTemplateClip nLETextTemplateClip) {
        if (nLETextTemplateClip == null) {
            return 0L;
        }
        return nLETextTemplateClip.swigCPtr;
    }

    public void setAlignTypeWithoutLimitSize(int i) {
        NLEEditorJniJNI.NLETextTemplateClip_setAlignTypeWithoutLimitSize(this.swigCPtr, this, i);
    }

    public void setContent(String str) {
        NLEEditorJniJNI.NLETextTemplateClip_setContent(this.swigCPtr, this, str);
    }

    public void setContentStyle(NLEStyText nLEStyText) {
        NLEEditorJniJNI.NLETextTemplateClip_setContentStyle(this.swigCPtr, this, NLEStyText.getCPtr(nLEStyText), nLEStyText);
    }

    public void setIndex(int i) {
        NLEEditorJniJNI.NLETextTemplateClip_setIndex(this.swigCPtr, this, i);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLETextTemplateClip(long j, boolean z) {
        super(NLEEditorJniJNI.NLETextTemplateClip_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
