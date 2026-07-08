package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEResourceAV extends NLEResourceNode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEResourceAV(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLEResourceAV_clone = NLEEditorJniJNI.NLEResourceAV_clone(this.swigCPtr, this);
        if (jNLEResourceAV_clone == 0) {
            return null;
        }
        return new NLENode(jNLEResourceAV_clone, true);
    }

    public String getFileInfo() {
        return NLEEditorJniJNI.NLEResourceAV_getFileInfo(this.swigCPtr, this);
    }

    public boolean getHasAudio() {
        return NLEEditorJniJNI.NLEResourceAV_getHasAudio(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceNode
    public long getHeight() {
        return NLEEditorJniJNI.NLEResourceAV_getHeight(this.swigCPtr, this);
    }

    public String getReverseResourceFile() {
        return NLEEditorJniJNI.NLEResourceAV_getReverseResourceFile(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceNode
    public long getWidth() {
        return NLEEditorJniJNI.NLEResourceAV_getWidth(this.swigCPtr, this);
    }

    public boolean hasFileInfo() {
        return NLEEditorJniJNI.NLEResourceAV_hasFileInfo(this.swigCPtr, this);
    }

    public boolean hasHasAudio() {
        return NLEEditorJniJNI.NLEResourceAV_hasHasAudio(this.swigCPtr, this);
    }

    public boolean hasReverseResourceFile() {
        return NLEEditorJniJNI.NLEResourceAV_hasReverseResourceFile(this.swigCPtr, this);
    }

    public NLEResourceAV() {
        this(NLEEditorJniJNI.new_NLEResourceAV(), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceNode, com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo130clone() {
        return mo130clone();
    }

    public static NLEResourceAV dynamicCast(NLENode nLENode) {
        long jNLEResourceAV_dynamicCast = NLEEditorJniJNI.NLEResourceAV_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLEResourceAV_dynamicCast == 0) {
            return null;
        }
        return new NLEResourceAV(jNLEResourceAV_dynamicCast, true);
    }

    public static long getCPtr(NLEResourceAV nLEResourceAV) {
        if (nLEResourceAV == null) {
            return 0L;
        }
        return nLEResourceAV.swigCPtr;
    }

    public void setFileInfo(String str) {
        NLEEditorJniJNI.NLEResourceAV_setFileInfo(this.swigCPtr, this, str);
    }

    public void setHasAudio(boolean z) {
        NLEEditorJniJNI.NLEResourceAV_setHasAudio(this.swigCPtr, this, z);
    }

    public void setReverseResourceFile(String str) {
        NLEEditorJniJNI.NLEResourceAV_setReverseResourceFile(this.swigCPtr, this, str);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceNode, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEResourceAV(long j, boolean z) {
        super(NLEEditorJniJNI.NLEResourceAV_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
