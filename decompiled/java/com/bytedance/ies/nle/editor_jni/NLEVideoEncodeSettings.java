package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEVideoEncodeSettings {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEVideoEncodeSettings(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public NLEAlphaSplitType getAlphaVideoSplitType() {
        return NLEAlphaSplitType.swigToEnum(NLEMediaJniJNI.NLEVideoEncodeSettings_alphaVideoSplitType_get(this.swigCPtr, this));
    }

    public int getBitDepth() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_bitDepth_get(this.swigCPtr, this);
    }

    public NLE_ENCODE_BITRATE_MODE getBitrateMode() {
        return NLE_ENCODE_BITRATE_MODE.swigToEnum(NLEMediaJniJNI.NLEVideoEncodeSettings_bitrateMode_get(this.swigCPtr, this));
    }

    public String getBitrateSettings() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_bitrateSettings_get(this.swigCPtr, this);
    }

    public int getBps() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_bps_get(this.swigCPtr, this);
    }

    public int getColorSpace() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_colorSpace_get(this.swigCPtr, this);
    }

    public NLE_COMPILE_TYPE getCompileType() {
        return NLE_COMPILE_TYPE.swigToEnum(NLEMediaJniJNI.NLEVideoEncodeSettings_compileType_get(this.swigCPtr, this));
    }

    public int getDownloadNetworkSpeed() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_downloadNetworkSpeed_get(this.swigCPtr, this);
    }

    public boolean getEnableAvInterleave() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_enableAvInterleave_get(this.swigCPtr, this);
    }

    public boolean getEnableByteVCRemuxVideo() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_enableByteVCRemuxVideo_get(this.swigCPtr, this);
    }

    public boolean getEnableCloudProcessWithMusic() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_enableCloudProcessWithMusic_get(this.swigCPtr, this);
    }

    public boolean getEnableCopyWithMetadata() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_enableCopyWithMetadata_get(this.swigCPtr, this);
    }

    public boolean getEnableHdr10BitEncode() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_enableHdr10BitEncode_get(this.swigCPtr, this);
    }

    public boolean getEnableHwBufferEncode() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_enableHwBufferEncode_get(this.swigCPtr, this);
    }

    public boolean getEnableInterLeave() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_enableInterLeave_get(this.swigCPtr, this);
    }

    public boolean getEnableInvisibleWatermark() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_enableInvisibleWatermark_get(this.swigCPtr, this);
    }

    public boolean getEnableMainTrackSourceMediaInfo() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_enableMainTrackSourceMediaInfo_get(this.swigCPtr, this);
    }

    public boolean getEnablePseudoLandscape() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_enablePseudoLandscape_get(this.swigCPtr, this);
    }

    public boolean getEnableRemuxVideo() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_enableRemuxVideo_get(this.swigCPtr, this);
    }

    public boolean getEnableRemuxVideoForRotation() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_enableRemuxVideoForRotation_get(this.swigCPtr, this);
    }

    public boolean getEnableRemuxVideoForShoot() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_enableRemuxVideoForShoot_get(this.swigCPtr, this);
    }

    public int getEnableRemuxVideoRes() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_enableRemuxVideoRes_get(this.swigCPtr, this);
    }

    public boolean getEnableUploadDirectly() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_enableUploadDirectly_get(this.swigCPtr, this);
    }

    public boolean getEnableUploadingWhileCompile() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_enableUploadingWhileCompile_get(this.swigCPtr, this);
    }

    public boolean getEnableUploadingWhileCompileCancelWriteFile() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_enableUploadingWhileCompileCancelWriteFile_get(this.swigCPtr, this);
    }

    public boolean getEnableVQScore() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_enableVQScore_get(this.swigCPtr, this);
    }

    public boolean getEnableVideoAndAudioRemux() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_enableVideoAndAudioRemux_get(this.swigCPtr, this);
    }

    public NLE_ENCODE_PROFILE getEncodeProfile() {
        return NLE_ENCODE_PROFILE.swigToEnum(NLEMediaJniJNI.NLEVideoEncodeSettings_encodeProfile_get(this.swigCPtr, this));
    }

    public NLE_ENCODE_STANDARD getEncodeStandard() {
        return NLE_ENCODE_STANDARD.swigToEnum(NLEMediaJniJNI.NLEVideoEncodeSettings_encodeStandard_get(this.swigCPtr, this));
    }

    public long getEndTime() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_endTime_get(this.swigCPtr, this);
    }

    public String getExternalSettingsJsonStr() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_externalSettingsJsonStr_get(this.swigCPtr, this);
    }

    public int getFps() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_fps_get(this.swigCPtr, this);
    }

    public int getGopSize() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_gopSize_get(this.swigCPtr, this);
    }

    public long getHw_video_bps() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_hw_video_bps_get(this.swigCPtr, this);
    }

    public boolean getIgnoreJsonBitrate() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_ignoreJsonBitrate_get(this.swigCPtr, this);
    }

    public float getImageQuality() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_imageQuality_get(this.swigCPtr, this);
    }

    public boolean getIsAudioOnly() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_isAudioOnly_get(this.swigCPtr, this);
    }

    public boolean getIsSupportHWEncoder() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_isSupportHWEncoder_get(this.swigCPtr, this);
    }

    public String getLastCompileHash() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_lastCompileHash_get(this.swigCPtr, this);
    }

    public NLEAudioCompileEncodeSettings getMAudioCompileEncodeSetting() {
        long jNLEVideoEncodeSettings_mAudioCompileEncodeSetting_get = NLEMediaJniJNI.NLEVideoEncodeSettings_mAudioCompileEncodeSetting_get(this.swigCPtr, this);
        if (jNLEVideoEncodeSettings_mAudioCompileEncodeSetting_get == 0) {
            return null;
        }
        return new NLEAudioCompileEncodeSettings(jNLEVideoEncodeSettings_mAudioCompileEncodeSetting_get, true);
    }

    public boolean getMAutoModifyResolution() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_mAutoModifyResolution_get(this.swigCPtr, this);
    }

    public String getMComment() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_mComment_get(this.swigCPtr, this);
    }

    public boolean getMCompileSoftInfo() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_mCompileSoftInfo_get(this.swigCPtr, this);
    }

    public String getMDescription() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_mDescription_get(this.swigCPtr, this);
    }

    public VecInt getMKeyFramePoints() {
        long jNLEVideoEncodeSettings_mKeyFramePoints_get = NLEMediaJniJNI.NLEVideoEncodeSettings_mKeyFramePoints_get(this.swigCPtr, this);
        if (jNLEVideoEncodeSettings_mKeyFramePoints_get == 0) {
            return null;
        }
        return new VecInt(jNLEVideoEncodeSettings_mKeyFramePoints_get, false);
    }

    public boolean getMOptRemuxWithCopy() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_mOptRemuxWithCopy_get(this.swigCPtr, this);
    }

    public boolean getMReEncodeOpt() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_mReEncodeOpt_get(this.swigCPtr, this);
    }

    public boolean getMRecordingMp4() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_mRecordingMp4_get(this.swigCPtr, this);
    }

    public int getMResolutionAlign() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_mResolutionAlign_get(this.swigCPtr, this);
    }

    public boolean getMTransitionKeyframeEnable() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_mTransitionKeyframeEnable_get(this.swigCPtr, this);
    }

    public NLEVideoCompileEncodeSettings getMVideoCompileEncodeSetting() {
        long jNLEVideoEncodeSettings_mVideoCompileEncodeSetting_get = NLEMediaJniJNI.NLEVideoEncodeSettings_mVideoCompileEncodeSetting_get(this.swigCPtr, this);
        if (jNLEVideoEncodeSettings_mVideoCompileEncodeSetting_get == 0) {
            return null;
        }
        return new NLEVideoCompileEncodeSettings(jNLEVideoEncodeSettings_mVideoCompileEncodeSetting_get, true);
    }

    public NLEVideoInvisibleWatermark getMVideoInvisibleWatermark() {
        long jNLEVideoEncodeSettings_mVideoInvisibleWatermark_get = NLEMediaJniJNI.NLEVideoEncodeSettings_mVideoInvisibleWatermark_get(this.swigCPtr, this);
        if (jNLEVideoEncodeSettings_mVideoInvisibleWatermark_get == 0) {
            return null;
        }
        return new NLEVideoInvisibleWatermark(jNLEVideoEncodeSettings_mVideoInvisibleWatermark_get, true);
    }

    public NLEVideoCompileEncodeSettings getMVideoWatermarkCompileEncodeSetting() {
        long jNLEVideoEncodeSettings_mVideoWatermarkCompileEncodeSetting_get = NLEMediaJniJNI.NLEVideoEncodeSettings_mVideoWatermarkCompileEncodeSetting_get(this.swigCPtr, this);
        if (jNLEVideoEncodeSettings_mVideoWatermarkCompileEncodeSetting_get == 0) {
            return null;
        }
        return new NLEVideoCompileEncodeSettings(jNLEVideoEncodeSettings_mVideoWatermarkCompileEncodeSetting_get, true);
    }

    public NLEWatermarkParam getMWatermarkParam() {
        long jNLEVideoEncodeSettings_mWatermarkParam_get = NLEMediaJniJNI.NLEVideoEncodeSettings_mWatermarkParam_get(this.swigCPtr, this);
        if (jNLEVideoEncodeSettings_mWatermarkParam_get == 0) {
            return null;
        }
        return new NLEWatermarkParam(jNLEVideoEncodeSettings_mWatermarkParam_get, true);
    }

    public long getNremuxBitrate() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_nremuxBitrate_get(this.swigCPtr, this);
    }

    public PairIntInt getOutputSize() {
        long jNLEVideoEncodeSettings_outputSize_get = NLEMediaJniJNI.NLEVideoEncodeSettings_outputSize_get(this.swigCPtr, this);
        if (jNLEVideoEncodeSettings_outputSize_get == 0) {
            return null;
        }
        return new PairIntInt(jNLEVideoEncodeSettings_outputSize_get, false);
    }

    public boolean getOverwriteVeMetadata() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_overwriteVeMetadata_get(this.swigCPtr, this);
    }

    public int getRemuxSizeLimit() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_remuxSizeLimit_get(this.swigCPtr, this);
    }

    public int getResizeMode() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_resizeMode_get(this.swigCPtr, this);
    }

    public float getResizeX() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_resizeX_get(this.swigCPtr, this);
    }

    public float getResizeY() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_resizeY_get(this.swigCPtr, this);
    }

    public int getRotate() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_rotate_get(this.swigCPtr, this);
    }

    public boolean getSoftwareDecode() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_softwareDecode_get(this.swigCPtr, this);
    }

    public NLE_VIDEO_SOURCE_TYPE getSourceType() {
        return NLE_VIDEO_SOURCE_TYPE.swigToEnum(NLEMediaJniJNI.NLEVideoEncodeSettings_sourceType_get(this.swigCPtr, this));
    }

    public float getSpeed() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_speed_get(this.swigCPtr, this);
    }

    public long getStartOffset() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_startOffset_get(this.swigCPtr, this);
    }

    public long getStartTime() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_startTime_get(this.swigCPtr, this);
    }

    public int getSwCRF() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_swCRF_get(this.swigCPtr, this);
    }

    public long getSwMaxrate() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_swMaxrate_get(this.swigCPtr, this);
    }

    public NLE_ENCODE_PRESET getSwPreset() {
        return NLE_ENCODE_PRESET.swigToEnum(NLEMediaJniJNI.NLEVideoEncodeSettings_swPreset_get(this.swigCPtr, this));
    }

    public int getSwQP() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_swQP_get(this.swigCPtr, this);
    }

    public float getSwQPOffset() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_swQPOffset_get(this.swigCPtr, this);
    }

    public float getTemplateScore() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_templateScore_get(this.swigCPtr, this);
    }

    public int getVideo720PSuperResolutionStrategy() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_video720PSuperResolutionStrategy_get(this.swigCPtr, this);
    }

    public String getVqscoreModel() {
        return NLEMediaJniJNI.NLEVideoEncodeSettings_vqscoreModel_get(this.swigCPtr, this);
    }

    public PairIntInt getWatermarkSize() {
        long jNLEVideoEncodeSettings_watermarkSize_get = NLEMediaJniJNI.NLEVideoEncodeSettings_watermarkSize_get(this.swigCPtr, this);
        if (jNLEVideoEncodeSettings_watermarkSize_get == 0) {
            return null;
        }
        return new PairIntInt(jNLEVideoEncodeSettings_watermarkSize_get, false);
    }

    public NLEVideoEncodeSettings() {
        this(NLEMediaJniJNI.new_NLEVideoEncodeSettings(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEVideoEncodeSettings nLEVideoEncodeSettings) {
        if (nLEVideoEncodeSettings == null) {
            return 0L;
        }
        return nLEVideoEncodeSettings.swigCPtr;
    }

    public void setAlphaVideoSplitType(NLEAlphaSplitType nLEAlphaSplitType) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_alphaVideoSplitType_set(this.swigCPtr, this, nLEAlphaSplitType.swigValue());
    }

    public void setBitDepth(int i) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_bitDepth_set(this.swigCPtr, this, i);
    }

    public void setBitrateMode(NLE_ENCODE_BITRATE_MODE nle_encode_bitrate_mode) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_bitrateMode_set(this.swigCPtr, this, nle_encode_bitrate_mode.swigValue());
    }

    public void setBitrateSettings(String str) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_bitrateSettings_set(this.swigCPtr, this, str);
    }

    public void setBps(int i) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_bps_set(this.swigCPtr, this, i);
    }

    public void setColorSpace(int i) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_colorSpace_set(this.swigCPtr, this, i);
    }

    public void setCompileType(NLE_COMPILE_TYPE nle_compile_type) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_compileType_set(this.swigCPtr, this, nle_compile_type.swigValue());
    }

    public void setDownloadNetworkSpeed(int i) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_downloadNetworkSpeed_set(this.swigCPtr, this, i);
    }

    public void setEnableAvInterleave(boolean z) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_enableAvInterleave_set(this.swigCPtr, this, z);
    }

    public void setEnableByteVCRemuxVideo(boolean z) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_enableByteVCRemuxVideo_set(this.swigCPtr, this, z);
    }

    public void setEnableCloudProcessWithMusic(boolean z) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_enableCloudProcessWithMusic_set(this.swigCPtr, this, z);
    }

    public void setEnableCopyWithMetadata(boolean z) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_enableCopyWithMetadata_set(this.swigCPtr, this, z);
    }

    public void setEnableHdr10BitEncode(boolean z) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_enableHdr10BitEncode_set(this.swigCPtr, this, z);
    }

    public void setEnableHwBufferEncode(boolean z) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_enableHwBufferEncode_set(this.swigCPtr, this, z);
    }

    public void setEnableInterLeave(boolean z) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_enableInterLeave_set(this.swigCPtr, this, z);
    }

    public void setEnableInvisibleWatermark(boolean z) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_enableInvisibleWatermark_set(this.swigCPtr, this, z);
    }

    public void setEnableMainTrackSourceMediaInfo(boolean z) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_enableMainTrackSourceMediaInfo_set(this.swigCPtr, this, z);
    }

    public void setEnablePseudoLandscape(boolean z) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_enablePseudoLandscape_set(this.swigCPtr, this, z);
    }

    public void setEnableRemuxVideo(boolean z) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_enableRemuxVideo_set(this.swigCPtr, this, z);
    }

    public void setEnableRemuxVideoForRotation(boolean z) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_enableRemuxVideoForRotation_set(this.swigCPtr, this, z);
    }

    public void setEnableRemuxVideoForShoot(boolean z) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_enableRemuxVideoForShoot_set(this.swigCPtr, this, z);
    }

    public void setEnableRemuxVideoRes(int i) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_enableRemuxVideoRes_set(this.swigCPtr, this, i);
    }

    public void setEnableUploadDirectly(boolean z) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_enableUploadDirectly_set(this.swigCPtr, this, z);
    }

    public void setEnableUploadingWhileCompile(boolean z) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_enableUploadingWhileCompile_set(this.swigCPtr, this, z);
    }

    public void setEnableUploadingWhileCompileCancelWriteFile(boolean z) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_enableUploadingWhileCompileCancelWriteFile_set(this.swigCPtr, this, z);
    }

    public void setEnableVQScore(boolean z) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_enableVQScore_set(this.swigCPtr, this, z);
    }

    public void setEnableVideoAndAudioRemux(boolean z) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_enableVideoAndAudioRemux_set(this.swigCPtr, this, z);
    }

    public void setEncodeProfile(NLE_ENCODE_PROFILE nle_encode_profile) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_encodeProfile_set(this.swigCPtr, this, nle_encode_profile.swigValue());
    }

    public void setEncodeStandard(NLE_ENCODE_STANDARD nle_encode_standard) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_encodeStandard_set(this.swigCPtr, this, nle_encode_standard.swigValue());
    }

    public void setEndTime(long j) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_endTime_set(this.swigCPtr, this, j);
    }

    public void setExternalSettingsJsonStr(String str) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_externalSettingsJsonStr_set(this.swigCPtr, this, str);
    }

    public void setFps(int i) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_fps_set(this.swigCPtr, this, i);
    }

    public void setGopSize(int i) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_gopSize_set(this.swigCPtr, this, i);
    }

    public void setHw_video_bps(long j) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_hw_video_bps_set(this.swigCPtr, this, j);
    }

    public void setIgnoreJsonBitrate(boolean z) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_ignoreJsonBitrate_set(this.swigCPtr, this, z);
    }

    public void setImageQuality(float f) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_imageQuality_set(this.swigCPtr, this, f);
    }

    public void setIsAudioOnly(boolean z) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_isAudioOnly_set(this.swigCPtr, this, z);
    }

    public void setIsSupportHWEncoder(boolean z) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_isSupportHWEncoder_set(this.swigCPtr, this, z);
    }

    public void setLastCompileHash(String str) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_lastCompileHash_set(this.swigCPtr, this, str);
    }

    public void setMAudioCompileEncodeSetting(NLEAudioCompileEncodeSettings nLEAudioCompileEncodeSettings) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_mAudioCompileEncodeSetting_set(this.swigCPtr, this, NLEAudioCompileEncodeSettings.getCPtr(nLEAudioCompileEncodeSettings), nLEAudioCompileEncodeSettings);
    }

    public void setMAutoModifyResolution(boolean z) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_mAutoModifyResolution_set(this.swigCPtr, this, z);
    }

    public void setMComment(String str) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_mComment_set(this.swigCPtr, this, str);
    }

    public void setMCompileSoftInfo(boolean z) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_mCompileSoftInfo_set(this.swigCPtr, this, z);
    }

    public void setMDescription(String str) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_mDescription_set(this.swigCPtr, this, str);
    }

    public void setMKeyFramePoints(VecInt vecInt) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_mKeyFramePoints_set(this.swigCPtr, this, VecInt.getCPtr(vecInt), vecInt);
    }

    public void setMOptRemuxWithCopy(boolean z) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_mOptRemuxWithCopy_set(this.swigCPtr, this, z);
    }

    public void setMReEncodeOpt(boolean z) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_mReEncodeOpt_set(this.swigCPtr, this, z);
    }

    public void setMRecordingMp4(boolean z) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_mRecordingMp4_set(this.swigCPtr, this, z);
    }

    public void setMResolutionAlign(int i) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_mResolutionAlign_set(this.swigCPtr, this, i);
    }

    public void setMTransitionKeyframeEnable(boolean z) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_mTransitionKeyframeEnable_set(this.swigCPtr, this, z);
    }

    public void setMVideoCompileEncodeSetting(NLEVideoCompileEncodeSettings nLEVideoCompileEncodeSettings) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_mVideoCompileEncodeSetting_set(this.swigCPtr, this, NLEVideoCompileEncodeSettings.getCPtr(nLEVideoCompileEncodeSettings), nLEVideoCompileEncodeSettings);
    }

    public void setMVideoInvisibleWatermark(NLEVideoInvisibleWatermark nLEVideoInvisibleWatermark) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_mVideoInvisibleWatermark_set(this.swigCPtr, this, NLEVideoInvisibleWatermark.getCPtr(nLEVideoInvisibleWatermark), nLEVideoInvisibleWatermark);
    }

    public void setMVideoWatermarkCompileEncodeSetting(NLEVideoCompileEncodeSettings nLEVideoCompileEncodeSettings) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_mVideoWatermarkCompileEncodeSetting_set(this.swigCPtr, this, NLEVideoCompileEncodeSettings.getCPtr(nLEVideoCompileEncodeSettings), nLEVideoCompileEncodeSettings);
    }

    public void setMWatermarkParam(NLEWatermarkParam nLEWatermarkParam) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_mWatermarkParam_set(this.swigCPtr, this, NLEWatermarkParam.getCPtr(nLEWatermarkParam), nLEWatermarkParam);
    }

    public void setNremuxBitrate(long j) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_nremuxBitrate_set(this.swigCPtr, this, j);
    }

    public void setOutputSize(PairIntInt pairIntInt) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_outputSize_set(this.swigCPtr, this, PairIntInt.getCPtr(pairIntInt), pairIntInt);
    }

    public void setOverwriteVeMetadata(boolean z) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_overwriteVeMetadata_set(this.swigCPtr, this, z);
    }

    public void setRemuxSizeLimit(int i) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_remuxSizeLimit_set(this.swigCPtr, this, i);
    }

    public void setResizeMode(int i) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_resizeMode_set(this.swigCPtr, this, i);
    }

    public void setResizeX(float f) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_resizeX_set(this.swigCPtr, this, f);
    }

    public void setResizeY(float f) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_resizeY_set(this.swigCPtr, this, f);
    }

    public void setRotate(int i) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_rotate_set(this.swigCPtr, this, i);
    }

    public void setSoftwareDecode(boolean z) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_softwareDecode_set(this.swigCPtr, this, z);
    }

    public void setSourceType(NLE_VIDEO_SOURCE_TYPE nle_video_source_type) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_sourceType_set(this.swigCPtr, this, nle_video_source_type.swigValue());
    }

    public void setSpeed(float f) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_speed_set(this.swigCPtr, this, f);
    }

    public void setStartOffset(long j) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_startOffset_set(this.swigCPtr, this, j);
    }

    public void setStartTime(long j) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_startTime_set(this.swigCPtr, this, j);
    }

    public void setSwCRF(int i) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_swCRF_set(this.swigCPtr, this, i);
    }

    public void setSwMaxrate(long j) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_swMaxrate_set(this.swigCPtr, this, j);
    }

    public void setSwPreset(NLE_ENCODE_PRESET nle_encode_preset) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_swPreset_set(this.swigCPtr, this, nle_encode_preset.swigValue());
    }

    public void setSwQP(int i) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_swQP_set(this.swigCPtr, this, i);
    }

    public void setSwQPOffset(float f) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_swQPOffset_set(this.swigCPtr, this, f);
    }

    public void setTemplateScore(float f) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_templateScore_set(this.swigCPtr, this, f);
    }

    public void setVideo720PSuperResolutionStrategy(int i) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_video720PSuperResolutionStrategy_set(this.swigCPtr, this, i);
    }

    public void setVqscoreModel(String str) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_vqscoreModel_set(this.swigCPtr, this, str);
    }

    public void setWatermarkSize(PairIntInt pairIntInt) {
        NLEMediaJniJNI.NLEVideoEncodeSettings_watermarkSize_set(this.swigCPtr, this, PairIntInt.getCPtr(pairIntInt), pairIntInt);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEVideoEncodeSettings(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
