package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEBezierCurvesPoint extends NLENode {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEBezierCurvesPoint(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLEBezierCurvesPoint_clone = NLEEditorJniJNI.NLEBezierCurvesPoint_clone(this.swigCPtr, this);
        if (jNLEBezierCurvesPoint_clone == 0) {
            return null;
        }
        return new NLENode(jNLEBezierCurvesPoint_clone, true);
    }

    public NLEPoint getAnchor() {
        long jNLEBezierCurvesPoint_getAnchor = NLEEditorJniJNI.NLEBezierCurvesPoint_getAnchor(this.swigCPtr, this);
        if (jNLEBezierCurvesPoint_getAnchor == 0) {
            return null;
        }
        return new NLEPoint(jNLEBezierCurvesPoint_getAnchor, true);
    }

    public NLEPoint getLeftControl() {
        long jNLEBezierCurvesPoint_getLeftControl = NLEEditorJniJNI.NLEBezierCurvesPoint_getLeftControl(this.swigCPtr, this);
        if (jNLEBezierCurvesPoint_getLeftControl == 0) {
            return null;
        }
        return new NLEPoint(jNLEBezierCurvesPoint_getLeftControl, true);
    }

    public NLEPoint getRightControl() {
        long jNLEBezierCurvesPoint_getRightControl = NLEEditorJniJNI.NLEBezierCurvesPoint_getRightControl(this.swigCPtr, this);
        if (jNLEBezierCurvesPoint_getRightControl == 0) {
            return null;
        }
        return new NLEPoint(jNLEBezierCurvesPoint_getRightControl, true);
    }

    public NLEBezierCurvesPoint() {
        this(NLEEditorJniJNI.new_NLEBezierCurvesPoint(), true);
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

    public static NLEBezierCurvesPoint dynamicCast(NLENode nLENode) {
        long jNLEBezierCurvesPoint_dynamicCast = NLEEditorJniJNI.NLEBezierCurvesPoint_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLEBezierCurvesPoint_dynamicCast == 0) {
            return null;
        }
        return new NLEBezierCurvesPoint(jNLEBezierCurvesPoint_dynamicCast, true);
    }

    public static long getCPtr(NLEBezierCurvesPoint nLEBezierCurvesPoint) {
        if (nLEBezierCurvesPoint == null) {
            return 0L;
        }
        return nLEBezierCurvesPoint.swigCPtr;
    }

    public static VecDouble toEffectPoints(VecNLEBezierCurvesPoint vecNLEBezierCurvesPoint) {
        return new VecDouble(NLEEditorJniJNI.NLEBezierCurvesPoint_toEffectPoints(VecNLEBezierCurvesPoint.getCPtr(vecNLEBezierCurvesPoint), vecNLEBezierCurvesPoint), true);
    }

    public void setAnchor(NLEPoint nLEPoint) {
        NLEEditorJniJNI.NLEBezierCurvesPoint_setAnchor(this.swigCPtr, this, NLEPoint.getCPtr(nLEPoint), nLEPoint);
    }

    public void setLeftControl(NLEPoint nLEPoint) {
        NLEEditorJniJNI.NLEBezierCurvesPoint_setLeftControl(this.swigCPtr, this, NLEPoint.getCPtr(nLEPoint), nLEPoint);
    }

    public void setRightControl(NLEPoint nLEPoint) {
        NLEEditorJniJNI.NLEBezierCurvesPoint_setRightControl(this.swigCPtr, this, NLEPoint.getCPtr(nLEPoint), nLEPoint);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEBezierCurvesPoint(long j, boolean z) {
        super(NLEEditorJniJNI.NLEBezierCurvesPoint_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
