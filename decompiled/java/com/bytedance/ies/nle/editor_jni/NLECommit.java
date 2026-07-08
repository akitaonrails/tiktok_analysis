package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLECommit extends NLENode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLECommit(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLECommit_clone = NLEEditorJniJNI.NLECommit_clone(this.swigCPtr, this);
        if (jNLECommit_clone == 0) {
            return null;
        }
        return new NLENode(jNLECommit_clone, true);
    }

    public String getDescription() {
        return NLEEditorJniJNI.NLECommit_getDescription(this.swigCPtr, this);
    }

    public NLEModel getModel() {
        long jNLECommit_getModel = NLEEditorJniJNI.NLECommit_getModel(this.swigCPtr, this);
        if (jNLECommit_getModel == 0) {
            return null;
        }
        return new NLEModel(jNLECommit_getModel, true);
    }

    public long getTimeStamp() {
        return NLEEditorJniJNI.NLECommit_getTimeStamp(this.swigCPtr, this);
    }

    public long getVersion() {
        return NLEEditorJniJNI.NLECommit_getVersion(this.swigCPtr, this);
    }

    public boolean hasDescription() {
        return NLEEditorJniJNI.NLECommit_hasDescription(this.swigCPtr, this);
    }

    public boolean hasTimeStamp() {
        return NLEEditorJniJNI.NLECommit_hasTimeStamp(this.swigCPtr, this);
    }

    public boolean hasVersion() {
        return NLEEditorJniJNI.NLECommit_hasVersion(this.swigCPtr, this);
    }

    public NLECommit() {
        this(NLEEditorJniJNI.new_NLECommit(), true);
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

    public static NLECommit dynamicCast(NLENode nLENode) {
        long jNLECommit_dynamicCast = NLEEditorJniJNI.NLECommit_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLECommit_dynamicCast == 0) {
            return null;
        }
        return new NLECommit(jNLECommit_dynamicCast, true);
    }

    public static long getCPtr(NLECommit nLECommit) {
        if (nLECommit == null) {
            return 0L;
        }
        return nLECommit.swigCPtr;
    }

    public void setDescription(String str) {
        NLEEditorJniJNI.NLECommit_setDescription(this.swigCPtr, this, str);
    }

    public void setModel(NLEModel nLEModel) {
        NLEEditorJniJNI.NLECommit_setModel(this.swigCPtr, this, NLEModel.getCPtr(nLEModel), nLEModel);
    }

    public void setTimeStamp(long j) {
        NLEEditorJniJNI.NLECommit_setTimeStamp(this.swigCPtr, this, j);
    }

    public void setVersion(long j) {
        NLEEditorJniJNI.NLECommit_setVersion(this.swigCPtr, this, j);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLECommit(long j, boolean z) {
        super(NLEEditorJniJNI.NLECommit_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
