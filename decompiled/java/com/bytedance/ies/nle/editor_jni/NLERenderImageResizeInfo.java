package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLERenderImageResizeInfo extends NLENode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLERenderImageResizeInfo(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLERenderImageResizeInfo_clone = NLEEditorJniJNI.NLERenderImageResizeInfo_clone(this.swigCPtr, this);
        if (jNLERenderImageResizeInfo_clone == 0) {
            return null;
        }
        return new NLENode(jNLERenderImageResizeInfo_clone, true);
    }

    public int getHeight() {
        return NLEEditorJniJNI.NLERenderImageResizeInfo_getHeight(this.swigCPtr, this);
    }

    public NLEResizeAlgorithm getResAlgorithm() {
        return NLEResizeAlgorithm.swigToEnum(NLEEditorJniJNI.NLERenderImageResizeInfo_getResAlgorithm(this.swigCPtr, this));
    }

    public NLEResFillMode getResFillMode() {
        return NLEResFillMode.swigToEnum(NLEEditorJniJNI.NLERenderImageResizeInfo_getResFillMode(this.swigCPtr, this));
    }

    public int getWidth() {
        return NLEEditorJniJNI.NLERenderImageResizeInfo_getWidth(this.swigCPtr, this);
    }

    public boolean hasHeight() {
        return NLEEditorJniJNI.NLERenderImageResizeInfo_hasHeight(this.swigCPtr, this);
    }

    public boolean hasResAlgorithm() {
        return NLEEditorJniJNI.NLERenderImageResizeInfo_hasResAlgorithm(this.swigCPtr, this);
    }

    public boolean hasResFillMode() {
        return NLEEditorJniJNI.NLERenderImageResizeInfo_hasResFillMode(this.swigCPtr, this);
    }

    public boolean hasWidth() {
        return NLEEditorJniJNI.NLERenderImageResizeInfo_hasWidth(this.swigCPtr, this);
    }

    public NLERenderImageResizeInfo() {
        this(NLEEditorJniJNI.new_NLERenderImageResizeInfo(), true);
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

    public static NLERenderImageResizeInfo dynamicCast(NLENode nLENode) {
        long jNLERenderImageResizeInfo_dynamicCast = NLEEditorJniJNI.NLERenderImageResizeInfo_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLERenderImageResizeInfo_dynamicCast == 0) {
            return null;
        }
        return new NLERenderImageResizeInfo(jNLERenderImageResizeInfo_dynamicCast, true);
    }

    public static long getCPtr(NLERenderImageResizeInfo nLERenderImageResizeInfo) {
        if (nLERenderImageResizeInfo == null) {
            return 0L;
        }
        return nLERenderImageResizeInfo.swigCPtr;
    }

    public void setHeight(int i) {
        NLEEditorJniJNI.NLERenderImageResizeInfo_setHeight(this.swigCPtr, this, i);
    }

    public void setResAlgorithm(NLEResizeAlgorithm nLEResizeAlgorithm) {
        NLEEditorJniJNI.NLERenderImageResizeInfo_setResAlgorithm(this.swigCPtr, this, nLEResizeAlgorithm.swigValue());
    }

    public void setResFillMode(NLEResFillMode nLEResFillMode) {
        NLEEditorJniJNI.NLERenderImageResizeInfo_setResFillMode(this.swigCPtr, this, nLEResFillMode.swigValue());
    }

    public void setWidth(int i) {
        NLEEditorJniJNI.NLERenderImageResizeInfo_setWidth(this.swigCPtr, this, i);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLERenderImageResizeInfo(long j, boolean z) {
        super(NLEEditorJniJNI.NLERenderImageResizeInfo_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
