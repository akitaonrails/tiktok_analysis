package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLESegmentAudio extends NLESegment {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLESegmentAudio(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public String changerToEffectJson() {
        return NLEEditorJniJNI.NLESegmentAudio_changerToEffectJson(this.swigCPtr, this);
    }

    public void clearCurveSpeedPoint() {
        NLEEditorJniJNI.NLESegmentAudio_clearCurveSpeedPoint(this.swigCPtr, this);
    }

    public void clearSegCurveSpeedPoint() {
        NLEEditorJniJNI.NLESegmentAudio_clearSegCurveSpeedPoint(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public NLENode mo130clone() {
        long jNLESegmentAudio_clone = NLEEditorJniJNI.NLESegmentAudio_clone(this.swigCPtr, this);
        if (jNLESegmentAudio_clone == 0) {
            return null;
        }
        return new NLENode(jNLESegmentAudio_clone, true);
    }

    public NLEResourceAV getAVFile() {
        long jNLESegmentAudio_getAVFile = NLEEditorJniJNI.NLESegmentAudio_getAVFile(this.swigCPtr, this);
        if (jNLESegmentAudio_getAVFile == 0) {
            return null;
        }
        return new NLEResourceAV(jNLESegmentAudio_getAVFile, true);
    }

    public float getAbsSpeed() {
        return NLEEditorJniJNI.NLESegmentAudio_getAbsSpeed(this.swigCPtr, this);
    }

    public double getBalancedGain() {
        return NLEEditorJniJNI.NLESegmentAudio_getBalancedGain(this.swigCPtr, this);
    }

    public NLEAudioChanger getChanger() {
        return NLEAudioChanger.swigToEnum(NLEEditorJniJNI.NLESegmentAudio_getChanger(this.swigCPtr, this));
    }

    public NLECurveActionBeam getCurveActionBeam() {
        long jNLESegmentAudio_getCurveActionBeam = NLEEditorJniJNI.NLESegmentAudio_getCurveActionBeam(this.swigCPtr, this);
        if (jNLESegmentAudio_getCurveActionBeam == 0) {
            return null;
        }
        return new NLECurveActionBeam(jNLESegmentAudio_getCurveActionBeam, true);
    }

    public double getCurveAveSpeed() {
        return NLEEditorJniJNI.NLESegmentAudio_getCurveAveSpeed(this.swigCPtr, this);
    }

    public VecNLEPointSPtr getCurveSpeedPoints() {
        return new VecNLEPointSPtr(NLEEditorJniJNI.NLESegmentAudio_getCurveSpeedPoints(this.swigCPtr, this), true);
    }

    public NLECurveSpeedType getCurveSpeedType() {
        return NLECurveSpeedType.swigToEnum(NLEEditorJniJNI.NLESegmentAudio_getCurveSpeedType(this.swigCPtr, this));
    }

    public double getDbRange() {
        return NLEEditorJniJNI.NLESegmentAudio_getDbRange(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public long getDuration() {
        return NLEEditorJniJNI.NLESegmentAudio_getDuration(this.swigCPtr, this);
    }

    public long getDurationWithoutCurveSpeed() {
        return NLEEditorJniJNI.NLESegmentAudio_getDurationWithoutCurveSpeed(this.swigCPtr, this);
    }

    public long getFadeInLength() {
        return NLEEditorJniJNI.NLESegmentAudio_getFadeInLength(this.swigCPtr, this);
    }

    public long getFadeOutLength() {
        return NLEEditorJniJNI.NLESegmentAudio_getFadeOutLength(this.swigCPtr, this);
    }

    public boolean getKeepTone() {
        return NLEEditorJniJNI.NLESegmentAudio_getKeepTone(this.swigCPtr, this);
    }

    public NLEResourceNode getPlayResource() {
        long jNLESegmentAudio_getPlayResource = NLEEditorJniJNI.NLESegmentAudio_getPlayResource(this.swigCPtr, this);
        if (jNLESegmentAudio_getPlayResource == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentAudio_getPlayResource, true);
    }

    public long getRawDuration() {
        return NLEEditorJniJNI.NLESegmentAudio_getRawDuration(this.swigCPtr, this);
    }

    public int getRepeatCount() {
        return NLEEditorJniJNI.NLESegmentAudio_getRepeatCount(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment
    public NLEResourceNode getResource() {
        long jNLESegmentAudio_getResource = NLEEditorJniJNI.NLESegmentAudio_getResource(this.swigCPtr, this);
        if (jNLESegmentAudio_getResource == 0) {
            return null;
        }
        return new NLEResourceNode(jNLESegmentAudio_getResource, true);
    }

    public NLEResourceAV getReversedAVFile() {
        long jNLESegmentAudio_getReversedAVFile = NLEEditorJniJNI.NLESegmentAudio_getReversedAVFile(this.swigCPtr, this);
        if (jNLESegmentAudio_getReversedAVFile == 0) {
            return null;
        }
        return new NLEResourceAV(jNLESegmentAudio_getReversedAVFile, true);
    }

    public boolean getRewind() {
        return NLEEditorJniJNI.NLESegmentAudio_getRewind(this.swigCPtr, this);
    }

    public VecNLEPointSPtr getSegCurveSpeedPoints() {
        return new VecNLEPointSPtr(NLEEditorJniJNI.NLESegmentAudio_getSegCurveSpeedPoints(this.swigCPtr, this), true);
    }

    public VecNLEPointSPtr getSeqCurveSpeedPoints() {
        return new VecNLEPointSPtr(NLEEditorJniJNI.NLESegmentAudio_getSeqCurveSpeedPoints(this.swigCPtr, this), true);
    }

    public float getSpeed() {
        return NLEEditorJniJNI.NLESegmentAudio_getSpeed(this.swigCPtr, this);
    }

    public long getTimeClipEnd() {
        return NLEEditorJniJNI.NLESegmentAudio_getTimeClipEnd(this.swigCPtr, this);
    }

    public long getTimeClipStart() {
        return NLEEditorJniJNI.NLESegmentAudio_getTimeClipStart(this.swigCPtr, this);
    }

    public float getVolume() {
        return NLEEditorJniJNI.NLESegmentAudio_getVolume(this.swigCPtr, this);
    }

    public boolean hasBalancedGain() {
        return NLEEditorJniJNI.NLESegmentAudio_hasBalancedGain(this.swigCPtr, this);
    }

    public boolean hasChanger() {
        return NLEEditorJniJNI.NLESegmentAudio_hasChanger(this.swigCPtr, this);
    }

    public boolean hasCurveSpeedType() {
        return NLEEditorJniJNI.NLESegmentAudio_hasCurveSpeedType(this.swigCPtr, this);
    }

    public boolean hasDbRange() {
        return NLEEditorJniJNI.NLESegmentAudio_hasDbRange(this.swigCPtr, this);
    }

    public boolean hasFadeInLength() {
        return NLEEditorJniJNI.NLESegmentAudio_hasFadeInLength(this.swigCPtr, this);
    }

    public boolean hasFadeOutLength() {
        return NLEEditorJniJNI.NLESegmentAudio_hasFadeOutLength(this.swigCPtr, this);
    }

    public boolean hasKeepTone() {
        return NLEEditorJniJNI.NLESegmentAudio_hasKeepTone(this.swigCPtr, this);
    }

    public boolean hasRepeatCount() {
        return NLEEditorJniJNI.NLESegmentAudio_hasRepeatCount(this.swigCPtr, this);
    }

    public boolean hasSpeed() {
        return NLEEditorJniJNI.NLESegmentAudio_hasSpeed(this.swigCPtr, this);
    }

    public boolean hasTimeClipEnd() {
        return NLEEditorJniJNI.NLESegmentAudio_hasTimeClipEnd(this.swigCPtr, this);
    }

    public boolean hasTimeClipStart() {
        return NLEEditorJniJNI.NLESegmentAudio_hasTimeClipStart(this.swigCPtr, this);
    }

    public boolean hasVolume() {
        return NLEEditorJniJNI.NLESegmentAudio_hasVolume(this.swigCPtr, this);
    }

    public NLESegmentAudio() {
        this(NLEEditorJniJNI.new_NLESegmentAudio(), true);
    }

    public static int getREPEAT_INFINITE() {
        return NLEEditorJniJNI.NLESegmentAudio_REPEAT_INFINITE_get();
    }

    public static int getREPEAT_NORMAL() {
        return NLEEditorJniJNI.NLESegmentAudio_REPEAT_NORMAL_get();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo130clone() {
        return mo130clone();
    }

    public static NLESegmentAudio dynamicCast(NLENode nLENode) {
        long jNLESegmentAudio_dynamicCast = NLEEditorJniJNI.NLESegmentAudio_dynamicCast(NLENode.getCPtr(nLENode), nLENode);
        if (jNLESegmentAudio_dynamicCast == 0) {
            return null;
        }
        return new NLESegmentAudio(jNLESegmentAudio_dynamicCast, true);
    }

    public static long getCPtr(NLESegmentAudio nLESegmentAudio) {
        if (nLESegmentAudio == null) {
            return 0L;
        }
        return nLESegmentAudio.swigCPtr;
    }

    public void addCurveSpeedPoint(NLEPoint nLEPoint) {
        NLEEditorJniJNI.NLESegmentAudio_addCurveSpeedPoint(this.swigCPtr, this, NLEPoint.getCPtr(nLEPoint), nLEPoint);
    }

    public void addSegCurveSpeedPoint(NLEPoint nLEPoint) {
        NLEEditorJniJNI.NLESegmentAudio_addSegCurveSpeedPoint(this.swigCPtr, this, NLEPoint.getCPtr(nLEPoint), nLEPoint);
    }

    public boolean removeCurveSpeedPoint(NLEPoint nLEPoint) {
        return NLEEditorJniJNI.NLESegmentAudio_removeCurveSpeedPoint(this.swigCPtr, this, NLEPoint.getCPtr(nLEPoint), nLEPoint);
    }

    public boolean removeSegCurveSpeedPoint(NLEPoint nLEPoint) {
        return NLEEditorJniJNI.NLESegmentAudio_removeSegCurveSpeedPoint(this.swigCPtr, this, NLEPoint.getCPtr(nLEPoint), nLEPoint);
    }

    public void setAVFile(NLEResourceAV nLEResourceAV) {
        NLEEditorJniJNI.NLESegmentAudio_setAVFile(this.swigCPtr, this, NLEResourceAV.getCPtr(nLEResourceAV), nLEResourceAV);
    }

    public void setAbsSpeed(float f) {
        NLEEditorJniJNI.NLESegmentAudio_setAbsSpeed(this.swigCPtr, this, f);
    }

    public void setBalancedGain(double d) {
        NLEEditorJniJNI.NLESegmentAudio_setBalancedGain(this.swigCPtr, this, d);
    }

    public void setChanger(NLEAudioChanger nLEAudioChanger) {
        NLEEditorJniJNI.NLESegmentAudio_setChanger(this.swigCPtr, this, nLEAudioChanger.swigValue());
    }

    public void setCurveActionBeam(NLECurveActionBeam nLECurveActionBeam) {
        NLEEditorJniJNI.NLESegmentAudio_setCurveActionBeam(this.swigCPtr, this, NLECurveActionBeam.getCPtr(nLECurveActionBeam), nLECurveActionBeam);
    }

    public void setCurveSpeedPoints(VecNLEPointSPtr vecNLEPointSPtr) {
        NLEEditorJniJNI.NLESegmentAudio_setCurveSpeedPoints(this.swigCPtr, this, VecNLEPointSPtr.getCPtr(vecNLEPointSPtr), vecNLEPointSPtr);
    }

    public void setCurveSpeedType(NLECurveSpeedType nLECurveSpeedType) {
        NLEEditorJniJNI.NLESegmentAudio_setCurveSpeedType(this.swigCPtr, this, nLECurveSpeedType.swigValue());
    }

    public void setDbRange(double d) {
        NLEEditorJniJNI.NLESegmentAudio_setDbRange(this.swigCPtr, this, d);
    }

    public void setFadeInLength(long j) {
        NLEEditorJniJNI.NLESegmentAudio_setFadeInLength(this.swigCPtr, this, j);
    }

    public void setFadeOutLength(long j) {
        NLEEditorJniJNI.NLESegmentAudio_setFadeOutLength(this.swigCPtr, this, j);
    }

    public void setKeepTone(boolean z) {
        NLEEditorJniJNI.NLESegmentAudio_setKeepTone(this.swigCPtr, this, z);
    }

    public void setRepeatCount(int i) {
        NLEEditorJniJNI.NLESegmentAudio_setRepeatCount(this.swigCPtr, this, i);
    }

    public void setReversedAVFile(NLEResourceAV nLEResourceAV) {
        NLEEditorJniJNI.NLESegmentAudio_setReversedAVFile(this.swigCPtr, this, NLEResourceAV.getCPtr(nLEResourceAV), nLEResourceAV);
    }

    public void setRewind(boolean z) {
        NLEEditorJniJNI.NLESegmentAudio_setRewind(this.swigCPtr, this, z);
    }

    public void setSegCurveSpeedPoints(VecNLEPointSPtr vecNLEPointSPtr) {
        NLEEditorJniJNI.NLESegmentAudio_setSegCurveSpeedPoints(this.swigCPtr, this, VecNLEPointSPtr.getCPtr(vecNLEPointSPtr), vecNLEPointSPtr);
    }

    public void setSpeed(float f) {
        NLEEditorJniJNI.NLESegmentAudio_setSpeed(this.swigCPtr, this, f);
    }

    public void setTimeClipEnd(long j) {
        NLEEditorJniJNI.NLESegmentAudio_setTimeClipEnd(this.swigCPtr, this, j);
    }

    public void setTimeClipStart(long j) {
        NLEEditorJniJNI.NLESegmentAudio_setTimeClipStart(this.swigCPtr, this, j);
    }

    public void setVolume(float f) {
        NLEEditorJniJNI.NLESegmentAudio_setVolume(this.swigCPtr, this, f);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLESegmentAudio(long j, boolean z) {
        super(NLEEditorJniJNI.NLESegmentAudio_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
