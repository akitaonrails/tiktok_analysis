package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLECustomMattingParam extends NLENode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLECustomMattingParam(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLECustomMattingParam_clone = NLEEditorJniJNI.NLECustomMattingParam_clone(this.swigCPtr, this);
        if (jNLECustomMattingParam_clone == 0) {
            return null;
        }
        return new NLENode(jNLECustomMattingParam_clone, true);
    }

    public String getCustomPath() {
        return NLEEditorJniJNI.NLECustomMattingParam_getCustomPath(this.swigCPtr, this);
    }

    public long getRestoreMaskPts() {
        return NLEEditorJniJNI.NLECustomMattingParam_getRestoreMaskPts(this.swigCPtr, this);
    }

    public boolean getReverseTracking() {
        return NLEEditorJniJNI.NLECustomMattingParam_getReverseTracking(this.swigCPtr, this);
    }

    public boolean hasCustomPath() {
        return NLEEditorJniJNI.NLECustomMattingParam_hasCustomPath(this.swigCPtr, this);
    }

    public boolean hasRestoreMaskPts() {
        return NLEEditorJniJNI.NLECustomMattingParam_hasRestoreMaskPts(this.swigCPtr, this);
    }

    public boolean hasReverseTracking() {
        return NLEEditorJniJNI.NLECustomMattingParam_hasReverseTracking(this.swigCPtr, this);
    }

    public NLECustomMattingParam() {
        this(NLEEditorJniJNI.new_NLECustomMattingParam(), true);
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

    public static NLECustomMattingParam dynamicCast(NLENode nLENode) {
        long jNLECustomMattingParam_dynamicCast = NLEEditorJniJNI.NLECustomMattingParam_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLECustomMattingParam_dynamicCast == 0) {
            return null;
        }
        return new NLECustomMattingParam(jNLECustomMattingParam_dynamicCast, true);
    }

    public static long getCPtr(NLECustomMattingParam nLECustomMattingParam) {
        if (nLECustomMattingParam == null) {
            return 0L;
        }
        return nLECustomMattingParam.swigCPtr;
    }

    public void setCustomPath(String str) {
        NLEEditorJniJNI.NLECustomMattingParam_setCustomPath(this.swigCPtr, this, str);
    }

    public void setRestoreMaskPts(long j) {
        NLEEditorJniJNI.NLECustomMattingParam_setRestoreMaskPts(this.swigCPtr, this, j);
    }

    public void setReverseTracking(boolean z) {
        NLEEditorJniJNI.NLECustomMattingParam_setReverseTracking(this.swigCPtr, this, z);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLECustomMattingParam(long j, boolean z) {
        super(NLEEditorJniJNI.NLECustomMattingParam_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
