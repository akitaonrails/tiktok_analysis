package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEMattingStroke extends NLENode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEMattingStroke(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLEMattingStroke_clone = NLEEditorJniJNI.NLEMattingStroke_clone(this.swigCPtr, this);
        if (jNLEMattingStroke_clone == 0) {
            return null;
        }
        return new NLENode(jNLEMattingStroke_clone, true);
    }

    public String getParams() {
        return NLEEditorJniJNI.NLEMattingStroke_getParams(this.swigCPtr, this);
    }

    public NLEResourceNode getStroke() {
        long jNLEMattingStroke_getStroke = NLEEditorJniJNI.NLEMattingStroke_getStroke(this.swigCPtr, this);
        if (jNLEMattingStroke_getStroke == 0) {
            return null;
        }
        return new NLEResourceNode(jNLEMattingStroke_getStroke, true);
    }

    public boolean hasParams() {
        return NLEEditorJniJNI.NLEMattingStroke_hasParams(this.swigCPtr, this);
    }

    public NLEMattingStroke() {
        this(NLEEditorJniJNI.new_NLEMattingStroke(), true);
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

    public static NLEMattingStroke dynamicCast(NLENode nLENode) {
        long jNLEMattingStroke_dynamicCast = NLEEditorJniJNI.NLEMattingStroke_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLEMattingStroke_dynamicCast == 0) {
            return null;
        }
        return new NLEMattingStroke(jNLEMattingStroke_dynamicCast, true);
    }

    public static long getCPtr(NLEMattingStroke nLEMattingStroke) {
        if (nLEMattingStroke == null) {
            return 0L;
        }
        return nLEMattingStroke.swigCPtr;
    }

    public void setParams(String str) {
        NLEEditorJniJNI.NLEMattingStroke_setParams(this.swigCPtr, this, str);
    }

    public void setStroke(NLEResourceNode nLEResourceNode) {
        NLEEditorJniJNI.NLEMattingStroke_setStroke(this.swigCPtr, this, NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEMattingStroke(long j, boolean z) {
        super(NLEEditorJniJNI.NLEMattingStroke_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
