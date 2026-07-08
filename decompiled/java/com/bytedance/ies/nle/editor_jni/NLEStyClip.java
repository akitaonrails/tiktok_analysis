package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEStyClip extends NLENode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEStyClip(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLEStyClip_clone = NLEEditorJniJNI.NLEStyClip_clone(this.swigCPtr, this);
        if (jNLEStyClip_clone == 0) {
            return null;
        }
        return new NLENode(jNLEStyClip_clone, true);
    }

    public NLEPoint getLeftLower() {
        long jNLEStyClip_getLeftLower = NLEEditorJniJNI.NLEStyClip_getLeftLower(this.swigCPtr, this);
        if (jNLEStyClip_getLeftLower == 0) {
            return null;
        }
        return new NLEPoint(jNLEStyClip_getLeftLower, true);
    }

    public NLEPoint getLeftUpper() {
        long jNLEStyClip_getLeftUpper = NLEEditorJniJNI.NLEStyClip_getLeftUpper(this.swigCPtr, this);
        if (jNLEStyClip_getLeftUpper == 0) {
            return null;
        }
        return new NLEPoint(jNLEStyClip_getLeftUpper, true);
    }

    public NLEPoint getRightLower() {
        long jNLEStyClip_getRightLower = NLEEditorJniJNI.NLEStyClip_getRightLower(this.swigCPtr, this);
        if (jNLEStyClip_getRightLower == 0) {
            return null;
        }
        return new NLEPoint(jNLEStyClip_getRightLower, true);
    }

    public NLEPoint getRightUpper() {
        long jNLEStyClip_getRightUpper = NLEEditorJniJNI.NLEStyClip_getRightUpper(this.swigCPtr, this);
        if (jNLEStyClip_getRightUpper == 0) {
            return null;
        }
        return new NLEPoint(jNLEStyClip_getRightUpper, true);
    }

    public NLEStyClip() {
        this(NLEEditorJniJNI.new_NLEStyClip(), true);
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

    public static NLEStyClip dynamicCast(NLENode nLENode) {
        long jNLEStyClip_dynamicCast = NLEEditorJniJNI.NLEStyClip_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLEStyClip_dynamicCast == 0) {
            return null;
        }
        return new NLEStyClip(jNLEStyClip_dynamicCast, true);
    }

    public static long getCPtr(NLEStyClip nLEStyClip) {
        if (nLEStyClip == null) {
            return 0L;
        }
        return nLEStyClip.swigCPtr;
    }

    public void setLeftLower(NLEPoint nLEPoint) {
        NLEEditorJniJNI.NLEStyClip_setLeftLower(this.swigCPtr, this, NLEPoint.getCPtr(nLEPoint), nLEPoint);
    }

    public void setLeftUpper(NLEPoint nLEPoint) {
        NLEEditorJniJNI.NLEStyClip_setLeftUpper(this.swigCPtr, this, NLEPoint.getCPtr(nLEPoint), nLEPoint);
    }

    public void setRightLower(NLEPoint nLEPoint) {
        NLEEditorJniJNI.NLEStyClip_setRightLower(this.swigCPtr, this, NLEPoint.getCPtr(nLEPoint), nLEPoint);
    }

    public void setRightUpper(NLEPoint nLEPoint) {
        NLEEditorJniJNI.NLEStyClip_setRightUpper(this.swigCPtr, this, NLEPoint.getCPtr(nLEPoint), nLEPoint);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEStyClip(long j, boolean z) {
        super(NLEEditorJniJNI.NLEStyClip_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
