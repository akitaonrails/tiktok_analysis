package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLECurveSpeedCalculator {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_NLECurveSpeedCalculator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public double getAveCurveSpeedRatio() {
        return NLEEditorJniJNI.NLECurveSpeedCalculator_getAveCurveSpeedRatio(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    public NLECurveSpeedCalculator(VecNLEPointSPtr vecNLEPointSPtr) {
        this(NLEEditorJniJNI.new_NLECurveSpeedCalculator__SWIG_1(VecNLEPointSPtr.getCPtr(vecNLEPointSPtr), vecNLEPointSPtr), true);
    }

    public static VecNLEPointSPtr generateBezierPathLookupTable(VecNLEPointSPtr vecNLEPointSPtr) {
        return new VecNLEPointSPtr(NLEEditorJniJNI.NLECurveSpeedCalculator_generateBezierPathLookupTable(VecNLEPointSPtr.getCPtr(vecNLEPointSPtr), vecNLEPointSPtr), true);
    }

    public static VecNLEPointSPtr generateThirdBezierPathPoints(VecNLEPointSPtr vecNLEPointSPtr) {
        return new VecNLEPointSPtr(NLEEditorJniJNI.NLECurveSpeedCalculator_generateThirdBezierPathPoints(VecNLEPointSPtr.getCPtr(vecNLEPointSPtr), vecNLEPointSPtr), true);
    }

    public static long getCPtr(NLECurveSpeedCalculator nLECurveSpeedCalculator) {
        if (nLECurveSpeedCalculator == null) {
            return 0L;
        }
        return nLECurveSpeedCalculator.swigCPtr;
    }

    public static VecNLEPointSPtr segmentPToSequenceP(VecNLEPointSPtr vecNLEPointSPtr) {
        return new VecNLEPointSPtr(NLEEditorJniJNI.NLECurveSpeedCalculator_segmentPToSequenceP(VecNLEPointSPtr.getCPtr(vecNLEPointSPtr), vecNLEPointSPtr), true);
    }

    public double getSpeedRatioBySeqDelta(long j) {
        return NLEEditorJniJNI.NLECurveSpeedCalculator_getSpeedRatioBySeqDelta(this.swigCPtr, this, j);
    }

    public long segmentDelToSequenceDel(long j) {
        return NLEEditorJniJNI.NLECurveSpeedCalculator_segmentDelToSequenceDel(this.swigCPtr, this, j);
    }

    public long sequenceDelToSegmentDel(long j) {
        return NLEEditorJniJNI.NLECurveSpeedCalculator_sequenceDelToSegmentDel(this.swigCPtr, this, j);
    }

    public void setRepeatDuration(long j) {
        NLEEditorJniJNI.NLECurveSpeedCalculator_setRepeatDuration(this.swigCPtr, this, j);
    }

    public void setSeqDuration(long j) {
        NLEEditorJniJNI.NLECurveSpeedCalculator_setSeqDuration(this.swigCPtr, this, j);
    }

    public NLECurveSpeedCalculator(VecNLEPointSPtr vecNLEPointSPtr, boolean z) {
        this(NLEEditorJniJNI.new_NLECurveSpeedCalculator__SWIG_0(VecNLEPointSPtr.getCPtr(vecNLEPointSPtr), vecNLEPointSPtr, z), true);
    }

    public static VecNLEPointSPtr recursiveCalculateCubePoint(VecNLEPointSPtr vecNLEPointSPtr, float f) {
        return new VecNLEPointSPtr(NLEEditorJniJNI.NLECurveSpeedCalculator_recursiveCalculateCubePoint(VecNLEPointSPtr.getCPtr(vecNLEPointSPtr), vecNLEPointSPtr, f), true);
    }

    public NLECurveSpeedCalculator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static PairNLEPoint2NLEPoint splitCurvePoints(VecNLEPointSPtr vecNLEPointSPtr, long j, long j2) {
        return new PairNLEPoint2NLEPoint(NLEEditorJniJNI.NLECurveSpeedCalculator_splitCurvePoints(VecNLEPointSPtr.getCPtr(vecNLEPointSPtr), vecNLEPointSPtr, j, j2), true);
    }

    public static NLEPoint getBezierPoint(NLEPoint nLEPoint, NLEPoint nLEPoint2, long j, long j2) {
        long jNLECurveSpeedCalculator_getBezierPoint = NLEEditorJniJNI.NLECurveSpeedCalculator_getBezierPoint(NLEPoint.getCPtr(nLEPoint), nLEPoint, NLEPoint.getCPtr(nLEPoint2), nLEPoint2, j, j2);
        if (jNLECurveSpeedCalculator_getBezierPoint == 0) {
            return null;
        }
        return new NLEPoint(jNLECurveSpeedCalculator_getBezierPoint, true);
    }

    public static NLEPoint calculateCubePoint(float f, NLEPoint nLEPoint, NLEPoint nLEPoint2, NLEPoint nLEPoint3, NLEPoint nLEPoint4) {
        long jNLECurveSpeedCalculator_calculateCubePoint = NLEEditorJniJNI.NLECurveSpeedCalculator_calculateCubePoint(f, NLEPoint.getCPtr(nLEPoint), nLEPoint, NLEPoint.getCPtr(nLEPoint2), nLEPoint2, NLEPoint.getCPtr(nLEPoint3), nLEPoint3, NLEPoint.getCPtr(nLEPoint4), nLEPoint4);
        if (jNLECurveSpeedCalculator_calculateCubePoint == 0) {
            return null;
        }
        return new NLEPoint(jNLECurveSpeedCalculator_calculateCubePoint, true);
    }
}
