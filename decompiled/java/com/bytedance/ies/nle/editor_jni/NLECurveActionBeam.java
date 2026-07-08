package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLECurveActionBeam extends NLENode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLECurveActionBeam(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLECurveActionBeam_clone = NLEEditorJniJNI.NLECurveActionBeam_clone(this.swigCPtr, this);
        if (jNLECurveActionBeam_clone == 0) {
            return null;
        }
        return new NLENode(jNLECurveActionBeam_clone, true);
    }

    public long getCycleTime() {
        return NLEEditorJniJNI.NLECurveActionBeam_getCycleTime(this.swigCPtr, this);
    }

    public boolean hasCycleTime() {
        return NLEEditorJniJNI.NLECurveActionBeam_hasCycleTime(this.swigCPtr, this);
    }

    public NLECurveActionBeam() {
        this(NLEEditorJniJNI.new_NLECurveActionBeam(), true);
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

    public static NLECurveActionBeam dynamicCast(NLENode nLENode) {
        long jNLECurveActionBeam_dynamicCast = NLEEditorJniJNI.NLECurveActionBeam_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLECurveActionBeam_dynamicCast == 0) {
            return null;
        }
        return new NLECurveActionBeam(jNLECurveActionBeam_dynamicCast, true);
    }

    public static long getCPtr(NLECurveActionBeam nLECurveActionBeam) {
        if (nLECurveActionBeam == null) {
            return 0L;
        }
        return nLECurveActionBeam.swigCPtr;
    }

    public void setCycleTime(long j) {
        NLEEditorJniJNI.NLECurveActionBeam_setCycleTime(this.swigCPtr, this, j);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLECurveActionBeam(long j, boolean z) {
        super(NLEEditorJniJNI.NLECurveActionBeam_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
