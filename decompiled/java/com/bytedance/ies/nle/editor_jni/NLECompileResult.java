package com.bytedance.ies.nle.editor_jni;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes28.dex */
public class NLECompileResult {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLECompileResult(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public NLEAudioXResults getAudioXResult() {
        long jNLECompileResult_audioXResult_get = NLEMediaJniJNI.NLECompileResult_audioXResult_get(this.swigCPtr, this);
        if (jNLECompileResult_audioXResult_get == 0) {
            return null;
        }
        return new NLEAudioXResults(jNLECompileResult_audioXResult_get, false);
    }

    public String getCompileHash() {
        return NLEMediaJniJNI.NLECompileResult_compileHash_get(this.swigCPtr, this);
    }

    public NLECompileLevel getCompileLevel() {
        return NLECompileLevel.swigToEnum(NLEMediaJniJNI.NLECompileResult_compileLevel_get(this.swigCPtr, this));
    }

    public float getCompilePauseTime() {
        return NLEMediaJniJNI.NLECompileResult_compilePauseTime_get(this.swigCPtr, this);
    }

    public double getDecodeFrameAvgTime() {
        return NLEMediaJniJNI.NLECompileResult_decodeFrameAvgTime_get(this.swigCPtr, this);
    }

    public NLECompileResultEncodeBitsType getEncodeBitsType() {
        return NLECompileResultEncodeBitsType.swigToEnum(NLEMediaJniJNI.NLECompileResult_encodeBitsType_get(this.swigCPtr, this));
    }

    public double getEncodeFrameAvgTime() {
        return NLEMediaJniJNI.NLECompileResult_encodeFrameAvgTime_get(this.swigCPtr, this);
    }

    public NLECompileResultEncodeHdrType getEncodeHdrType() {
        return NLECompileResultEncodeHdrType.swigToEnum(NLEMediaJniJNI.NLECompileResult_encodeHdrType_get(this.swigCPtr, this));
    }

    public NLE_ENCODE_STANDARD getEncodeType() {
        return NLE_ENCODE_STANDARD.swigToEnum(NLEMediaJniJNI.NLECompileResult_encodeType_get(this.swigCPtr, this));
    }

    public boolean getIsCompileHardEncode() {
        return NLEMediaJniJNI.NLECompileResult_isCompileHardEncode_get(this.swigCPtr, this);
    }

    public boolean getIsRecordHardEncode() {
        return NLEMediaJniJNI.NLECompileResult_isRecordHardEncode_get(this.swigCPtr, this);
    }

    public boolean getIsReencode() {
        return NLEMediaJniJNI.NLECompileResult_isReencode_get(this.swigCPtr, this);
    }

    public VecNLECompileMediaInfo getMainTrackSourceMediaInfo() {
        long jNLECompileResult_mainTrackSourceMediaInfo_get = NLEMediaJniJNI.NLECompileResult_mainTrackSourceMediaInfo_get(this.swigCPtr, this);
        if (jNLECompileResult_mainTrackSourceMediaInfo_get == 0) {
            return null;
        }
        return new VecNLECompileMediaInfo(jNLECompileResult_mainTrackSourceMediaInfo_get, false);
    }

    public BigInteger getNotRemuxErrorCode() {
        return NLEMediaJniJNI.NLECompileResult_notRemuxErrorCode_get(this.swigCPtr, this);
    }

    public String getOutputVideoPath() {
        return NLEMediaJniJNI.NLECompileResult_outputVideoPath_get(this.swigCPtr, this);
    }

    public double getRenderFrameAvgTime() {
        return NLEMediaJniJNI.NLECompileResult_renderFrameAvgTime_get(this.swigCPtr, this);
    }

    public MapStrStr getRiskyVideoInfo() {
        long jNLECompileResult_riskyVideoInfo_get = NLEMediaJniJNI.NLECompileResult_riskyVideoInfo_get(this.swigCPtr, this);
        if (jNLECompileResult_riskyVideoInfo_get == 0) {
            return null;
        }
        return new MapStrStr(jNLECompileResult_riskyVideoInfo_get, false);
    }

    public NLETransType getTransType() {
        return NLETransType.swigToEnum(NLEMediaJniJNI.NLECompileResult_transType_get(this.swigCPtr, this));
    }

    public NLEUploadParams getUploadParams() {
        long jNLECompileResult_uploadParams_get = NLEMediaJniJNI.NLECompileResult_uploadParams_get(this.swigCPtr, this);
        if (jNLECompileResult_uploadParams_get == 0) {
            return null;
        }
        return new NLEUploadParams(jNLECompileResult_uploadParams_get, false);
    }

    public NLEVQScoreResult getVqscoreResult() {
        long jNLECompileResult_vqscoreResult_get = NLEMediaJniJNI.NLECompileResult_vqscoreResult_get(this.swigCPtr, this);
        if (jNLECompileResult_vqscoreResult_get == 0) {
            return null;
        }
        return new NLEVQScoreResult(jNLECompileResult_vqscoreResult_get, false);
    }

    public NLECompileResult() {
        this(NLEMediaJniJNI.new_NLECompileResult(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLECompileResult nLECompileResult) {
        if (nLECompileResult == null) {
            return 0L;
        }
        return nLECompileResult.swigCPtr;
    }

    public void setAudioXResult(NLEAudioXResults nLEAudioXResults) {
        NLEMediaJniJNI.NLECompileResult_audioXResult_set(this.swigCPtr, this, NLEAudioXResults.getCPtr(nLEAudioXResults), nLEAudioXResults);
    }

    public void setCompileHash(String str) {
        NLEMediaJniJNI.NLECompileResult_compileHash_set(this.swigCPtr, this, str);
    }

    public void setCompileLevel(NLECompileLevel nLECompileLevel) {
        NLEMediaJniJNI.NLECompileResult_compileLevel_set(this.swigCPtr, this, nLECompileLevel.swigValue());
    }

    public void setCompilePauseTime(float f) {
        NLEMediaJniJNI.NLECompileResult_compilePauseTime_set(this.swigCPtr, this, f);
    }

    public void setDecodeFrameAvgTime(double d) {
        NLEMediaJniJNI.NLECompileResult_decodeFrameAvgTime_set(this.swigCPtr, this, d);
    }

    public void setEncodeBitsType(NLECompileResultEncodeBitsType nLECompileResultEncodeBitsType) {
        NLEMediaJniJNI.NLECompileResult_encodeBitsType_set(this.swigCPtr, this, nLECompileResultEncodeBitsType.swigValue());
    }

    public void setEncodeFrameAvgTime(double d) {
        NLEMediaJniJNI.NLECompileResult_encodeFrameAvgTime_set(this.swigCPtr, this, d);
    }

    public void setEncodeHdrType(NLECompileResultEncodeHdrType nLECompileResultEncodeHdrType) {
        NLEMediaJniJNI.NLECompileResult_encodeHdrType_set(this.swigCPtr, this, nLECompileResultEncodeHdrType.swigValue());
    }

    public void setEncodeType(NLE_ENCODE_STANDARD nle_encode_standard) {
        NLEMediaJniJNI.NLECompileResult_encodeType_set(this.swigCPtr, this, nle_encode_standard.swigValue());
    }

    public void setIsCompileHardEncode(boolean z) {
        NLEMediaJniJNI.NLECompileResult_isCompileHardEncode_set(this.swigCPtr, this, z);
    }

    public void setIsRecordHardEncode(boolean z) {
        NLEMediaJniJNI.NLECompileResult_isRecordHardEncode_set(this.swigCPtr, this, z);
    }

    public void setIsReencode(boolean z) {
        NLEMediaJniJNI.NLECompileResult_isReencode_set(this.swigCPtr, this, z);
    }

    public void setMainTrackSourceMediaInfo(VecNLECompileMediaInfo vecNLECompileMediaInfo) {
        NLEMediaJniJNI.NLECompileResult_mainTrackSourceMediaInfo_set(this.swigCPtr, this, VecNLECompileMediaInfo.getCPtr(vecNLECompileMediaInfo), vecNLECompileMediaInfo);
    }

    public void setNotRemuxErrorCode(BigInteger bigInteger) {
        NLEMediaJniJNI.NLECompileResult_notRemuxErrorCode_set(this.swigCPtr, this, bigInteger);
    }

    public void setOutputVideoPath(String str) {
        NLEMediaJniJNI.NLECompileResult_outputVideoPath_set(this.swigCPtr, this, str);
    }

    public void setRenderFrameAvgTime(double d) {
        NLEMediaJniJNI.NLECompileResult_renderFrameAvgTime_set(this.swigCPtr, this, d);
    }

    public void setRiskyVideoInfo(MapStrStr mapStrStr) {
        NLEMediaJniJNI.NLECompileResult_riskyVideoInfo_set(this.swigCPtr, this, MapStrStr.getCPtr(mapStrStr), mapStrStr);
    }

    public void setTransType(NLETransType nLETransType) {
        NLEMediaJniJNI.NLECompileResult_transType_set(this.swigCPtr, this, nLETransType.swigValue());
    }

    public void setUploadParams(NLEUploadParams nLEUploadParams) {
        NLEMediaJniJNI.NLECompileResult_uploadParams_set(this.swigCPtr, this, NLEUploadParams.getCPtr(nLEUploadParams), nLEUploadParams);
    }

    public void setVqscoreResult(NLEVQScoreResult nLEVQScoreResult) {
        NLEMediaJniJNI.NLECompileResult_vqscoreResult_set(this.swigCPtr, this, NLEVQScoreResult.getCPtr(nLEVQScoreResult), nLEVQScoreResult);
    }

    public NLECompileResult(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
