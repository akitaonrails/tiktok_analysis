package com.ss.ttlivestreamer.livestreamv2.sdkparams;

import X.C09CT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.ttlh_adapter.push_param.push_base.PushBaseConfigV2;
import com.ss.lyrax.video.OnekeyProcessParams;
import com.ss.lyrax.video.RtcVideoFramePoolConfig;
import com.ss.lyrax.video.SitiConfig;
import com.ss.lyrax.video.TTLHAbnormalDetectConfigParser;
import com.ss.lyrax.video.TTLHSceneDetectConfig;
import com.ss.lyrax.video.TTLHVideoContentReportConfig;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class PushBase {
    public PushBaseConfigV2 LJIJI;

    @C09CT("audioProfile")
    public String audioProfileStr;

    @C09CT("cap_adapted_height")
    public int capAdaptedHeight;

    @C09CT("cap_adapted_width")
    public int capAdaptedWidth;

    @C09CT("enableEventDrivenOpt")
    public boolean enableEventDrivenOpt;

    @C09CT("enableEventDrivenPhase1")
    public boolean enableEventDrivenPhase1;

    @C09CT("enableGameStreamHDAdaptive")
    public boolean enableGameStreamHDAdaptive;

    @C09CT("enableLyraxNetworkQualityOptV3")
    public boolean enableLyraxNetworkQualityOptV3;

    @C09CT("enableStreamHDAdaptive")
    public boolean enableStreamHDAdaptive;

    @C09CT("enable_video_adaptive_for_game_linkmic")
    public boolean enableVideoAdaptiveForGameLinkmic;

    @C09CT("enableVideoPipelineOpt")
    public boolean enableVideoPipelineOpt;

    @C09CT("idcName")
    public String idcName;

    @C09CT("linkmicStreamEnable")
    public boolean linkmicStreamEnable;

    @C09CT("streamName")
    public String streamName;

    @C09CT("vCodec")
    public String vCodec;

    @C09CT("videoEncoderStrategy")
    public JSONObject videoEncoderStrategy;

    @C09CT("videoProfile")
    public String videoProfileStr;

    @C09CT("width")
    public int width = Integer.MAX_VALUE;

    @C09CT("height")
    public int height = Integer.MAX_VALUE;

    @C09CT("cap_adapted_quirks")
    public int capAdaptedQuirks = 1;

    @C09CT("defaultBitrate")
    public int defaultBitrate = -1;

    @C09CT("minBitrate")
    public int minBitrate = -1;

    @C09CT("maxBitrate")
    public int maxBitrate = -1;

    @C09CT("fps")
    public int fps = -1;

    @C09CT("minDenoiseAdaptedResolutionWidth")
    public int minDenoiseAdaptedResolutionWidth = 576;

    @C09CT("minDenoiseAdaptedResolutionHeight")
    public int minDenoiseAdaptedResolutionHeight = 1024;

    @C09CT("minStreamHDAdaptedResolutionWidth")
    public int minStreamHDAdaptedResolutionWidth = 9999;

    @C09CT("minStreamHDAdaptedResolutionHeight")
    public int minStreamHDAdaptedResolutionHeight = 9999;

    @C09CT("enableBFrame")
    public boolean enableBFrame = true;

    @C09CT("gopSec")
    public float gopSec = -1.0f;
    public final SitiConfig LIZ = new SitiConfig();
    public int LIZIZ = -1;

    @C09CT("useHardware")
    public boolean useHardwareEncode = true;
    public int LIZJ = -1;
    public final String LIZLLL = "fdk-aac";
    public int LJ = -1;

    @C09CT("audioSample")
    public int audioSample = -1;

    @C09CT("audioBitrate")
    public int audioBitrate = -1;
    public String LJFF = "";
    public JSONObject LJI = new JSONObject();
    public int LJII = 5000;

    @C09CT("disableAnetFallbackCodeList")
    public JSONArray disableAnetFallbackCodeList = new JSONArray();

    @C09CT("disableAnetFallback")
    public boolean disableAnetFallback = false;
    public final boolean LJIIIIZZ = true;
    public final boolean LJIIIZ = true;
    public int LJIIJ = 1;

    @C09CT("live_gl_version")
    public int liveGlVersion = Integer.MAX_VALUE;

    @C09CT("enableAudioRenderSinkStartOpt")
    public boolean enableAudioRenderSinkStartOpt = true;

    @C09CT("videoDenoise")
    public JSONObject videoDenoiseParams = null;

    @C09CT("videoStreamHD")
    public JSONObject videoStreamHDParams = null;

    @C09CT("enableVideoStreamHD")
    public boolean enableVideoStreamHD = false;

    @C09CT("gameVideoStreamHD")
    public JSONObject gameVideoStreamHDParams = null;

    @C09CT("enableGameVideoStreamHD")
    public boolean enableGameVideoStreamHD = false;

    @C09CT("colorCorrectionSetting")
    public JSONObject colorCorrectionSetting = null;

    @C09CT("enableColorCorrection")
    public boolean enableColorCorrection = false;
    public final boolean LJIIJJI = true;

    @C09CT("enableDenoiseOpt")
    public boolean enableDenoiseOpt = false;

    @C09CT("abnormal_frame_detect")
    public TTLHAbnormalDetectConfigParser videoAbnormalDetectConfig = new TTLHAbnormalDetectConfigParser();

    @C09CT("scene_detect")
    public TTLHSceneDetectConfig ttlhSceneDetectConfig = new TTLHSceneDetectConfig();
    public final RoiMap LJIIL = new RoiMap();
    public final int LJIILIIL = Integer.MAX_VALUE;
    public final OnekeyProcessParams LJIILJJIL = new OnekeyProcessParams();

    @C09CT("enableScreenAudioStereoCapture")
    public boolean enableScreenAudioStereoCapture = true;
    public final int LJIILL = 100;
    public final TTLHVideoContentReportConfig LJIILLIIL = new TTLHVideoContentReportConfig();

    @C09CT("enableMirrorOpt")
    public boolean enableMirrorOpt = false;
    public final RtcVideoFramePoolConfig LJIIZILJ = new RtcVideoFramePoolConfig();

    @C09CT("audioEncFrameLength")
    public int audioEncFrameLength = 10;

    @C09CT("support_low_latency")
    public boolean supportLowLatency = false;

    @C09CT("rtp_token_map")
    public JSONObject rtpTokenMap = null;
    public boolean LJIJ = false;
    public boolean LJIJJ = false;

    public static class Roi {

        @C09CT("roi_asset_dir")
        public String roiAssetDir;

        @C09CT("roi_on")
        public int roiOn;

        @C09CT("roi_qp")
        public int roiQp = -100;

        @C09CT("roi_bitrate_ratio")
        public double roiBitrateRatio = Double.MAX_VALUE;
    }

    public static class RoiMap {
        public Boolean LIZ;

        @C09CT("bytevc0")
        public Roi bytevc0Roi;

        @C09CT("bytevc1")
        public Roi bytevc1Roi;

        @C09CT("hardBytevc1")
        public Roi hardBytevc1Roi;

        @C09CT("hardH264")
        public Roi hardH264Roi;

        @C09CT("roi_hardware")
        public HardwareRoi hardwareRoi;

        @C09CT("roi_stretch")
        public boolean roiStretch;

        @C09CT("x264")
        public Roi x264Roi;

        public final boolean LIZIZ() {
            if (this.LIZ == null) {
                this.LIZ = Boolean.valueOf((this.hardH264Roi == null && this.x264Roi == null && this.bytevc0Roi == null && this.hardBytevc1Roi == null && this.bytevc1Roi == null && this.hardwareRoi == null) ? false : true);
            }
            return this.LIZ.booleanValue();
        }

        public final Roi LIZ(int i, boolean z) {
            String str;
            if (i != 2) {
                if (z) {
                    str = "hardH264";
                } else {
                    str = "bytevc0";
                }
            } else if (z) {
                str = "hardBytevc1";
            } else {
                str = "bytevc1";
            }
            if (str.equals("hardH264")) {
                return this.hardH264Roi;
            }
            if (str.equals("x264")) {
                return this.x264Roi;
            }
            if (str.equals("bytevc0")) {
                return this.bytevc0Roi;
            }
            if (str.equals("hardBytevc1")) {
                return this.hardBytevc1Roi;
            }
            if (str.equals("bytevc1")) {
                return this.bytevc1Roi;
            }
            return null;
        }

        public final void LIZJ(int i, boolean z, Roi roi) {
            String str;
            if (i != 2) {
                if (z) {
                    str = "hardH264";
                } else {
                    str = "bytevc0";
                }
            } else if (z) {
                str = "hardBytevc1";
            } else {
                str = "bytevc1";
            }
            if (str.equals("hardH264")) {
                this.hardH264Roi = roi;
            }
            if (str.equals("x264")) {
                this.x264Roi = roi;
            }
            if (str.equals("bytevc0")) {
                this.bytevc0Roi = roi;
            }
            if (str.equals("hardBytevc1")) {
                this.hardBytevc1Roi = roi;
            }
            if (str.equals("bytevc1")) {
                this.bytevc1Roi = roi;
            }
        }
    }

    public static class HardwareRoi implements Cloneable {

        @C09CT("bias_x")
        public float bias_x;

        @C09CT("bias_y")
        public float bias_y;

        @C09CT("enable")
        public boolean enable;

        @C09CT("showRoi")
        public boolean showRoi;

        @C09CT("scale_x")
        public float scale_x = 1.0f;

        @C09CT("scale_y")
        public float scale_y = 1.0f;

        @C09CT("quality_bias_level")
        public int qualityBiasLevel = -2;

        @C09CT("roi_bitrate_ratio")
        public double roiBitrateRatio = 1.0d;

        /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
        public final HardwareRoi clone() {
            try {
                HardwareRoi hardwareRoi = (HardwareRoi) super.clone();
                hardwareRoi.enable = this.enable;
                hardwareRoi.bias_x = this.bias_x;
                hardwareRoi.bias_y = this.bias_y;
                hardwareRoi.scale_x = this.scale_x;
                hardwareRoi.scale_y = this.scale_y;
                hardwareRoi.qualityBiasLevel = this.qualityBiasLevel;
                hardwareRoi.showRoi = this.showRoi;
                return hardwareRoi;
            } catch (CloneNotSupportedException e) {
                TryCatchGuardChecker.doCheck(e);
                return new HardwareRoi();
            }
        }
    }

    public final int LIZ() {
        int audioBitrate = this.LJIJ ? this.LJIJI.mAudioConfig.getAudioBitrate() : this.audioBitrate;
        this.audioBitrate = audioBitrate;
        if (audioBitrate == -1) {
            this.audioBitrate = 32000;
        }
        return this.audioBitrate;
    }

    public final int LIZIZ() {
        return this.LJIJ ? this.LJIJI.mAudioConfig.getAudioEncFrameLength() : this.audioEncFrameLength;
    }

    public final String LIZJ() {
        return this.LJIJ ? this.LJIJI.mAudioConfig.getAudioProfileStr() : this.audioProfileStr;
    }

    public final int LIZLLL() {
        int audioSample = this.LJIJ ? this.LJIJI.mAudioConfig.getAudioSample() : this.audioSample;
        this.audioSample = audioSample;
        if (audioSample == -1) {
            this.audioSample = 44100;
        }
        return this.audioSample;
    }

    public final JSONObject LJ() {
        return this.LJIJ ? this.LJIJI.mVideoConfig.filterConfig.bmfConfig.getColorCorrectionSetting() : this.colorCorrectionSetting;
    }

    public final int LJFF() {
        int defaultBitrate = this.LJIJ ? this.LJIJI.mVideoConfig.getDefaultBitrate() : this.defaultBitrate;
        this.defaultBitrate = defaultBitrate;
        if (defaultBitrate == -1) {
            this.defaultBitrate = 800000;
        }
        return this.defaultBitrate;
    }

    public final boolean LJI() {
        return this.LJIJ ? this.LJIJI.mCommonConfig.getDisableAnetFallback() : this.disableAnetFallback;
    }

    public final JSONArray LJII() {
        return this.LJIJ ? this.LJIJI.mCommonConfig.getDisableAnetFallbackCodeList() : this.disableAnetFallbackCodeList;
    }

    public final boolean LJIIIIZZ() {
        return this.LJIJ ? this.LJIJI.mAudioConfig.getEnableAudioRenderSinkStartOpt() : this.enableAudioRenderSinkStartOpt;
    }

    public final boolean LJIIIZ() {
        return this.LJIJ ? this.LJIJI.mVideoConfig.encodeConfig.getEnableBFrame() : this.enableBFrame;
    }

    public final boolean LJIIJ() {
        return this.LJIJ ? this.LJIJI.mVideoConfig.filterConfig.bmfConfig.getEnableColorCorrection() : this.enableColorCorrection;
    }

    public final boolean LJIIJJI() {
        return this.LJIJ ? this.LJIJI.mVideoConfig.filterConfig.denoiseConfig.getEnableDenoiseOpt() : this.enableDenoiseOpt;
    }

    public final boolean LJIIL() {
        return this.LJIJ ? this.LJIJI.mCommonConfig.getEnableEventDrivenOpt() : this.enableEventDrivenOpt;
    }

    public final boolean LJIILIIL() {
        return this.LJIJ ? this.LJIJI.mCommonConfig.getEnableEventDrivenPhase1() : this.enableEventDrivenPhase1;
    }

    public final boolean LJIILJJIL() {
        return this.LJIJ ? this.LJIJI.mVideoConfig.filterConfig.bmfConfig.getEnableGameStreamHDAdaptive() : this.enableGameStreamHDAdaptive;
    }

    public final boolean LJIILL() {
        return this.LJIJ ? this.LJIJI.mVideoConfig.filterConfig.bmfConfig.getEnableGameVideoStreamHD() : this.enableGameVideoStreamHD;
    }

    public final boolean LJIILLIIL() {
        return this.LJIJ ? this.LJIJI.mCommonConfig.getEnableLyraxNetworkQualityOptV3() : this.enableLyraxNetworkQualityOptV3;
    }

    public final boolean LJIIZILJ() {
        return this.LJIJ ? this.LJIJI.mVideoConfig.filterConfig.getEnableMirrorOpt() : this.enableMirrorOpt;
    }

    public final boolean LJIJ() {
        return this.LJIJ ? this.LJIJI.mAudioConfig.getEnableScreenAudioStereoCapture() : this.enableScreenAudioStereoCapture;
    }

    public final boolean LJIJI() {
        return this.LJIJ ? this.LJIJI.mVideoConfig.filterConfig.bmfConfig.getEnableStreamHDAdaptive() : this.enableStreamHDAdaptive;
    }

    public final boolean LJIJJ() {
        return this.LJIJ ? this.LJIJI.mVideoConfig.getEnableVideoAdaptiveForGameLinkmic() : this.enableVideoAdaptiveForGameLinkmic;
    }

    public final boolean LJIJJLI() {
        return this.LJIJ ? this.LJIJI.mCommonConfig.getEnableVideoPipelineOpt() : this.enableVideoPipelineOpt;
    }

    public final boolean LJIL() {
        return this.LJIJ ? this.LJIJI.mVideoConfig.filterConfig.bmfConfig.getEnableVideoStreamHD() : this.enableVideoStreamHD;
    }

    public final int LJJ() {
        int fps = this.LJIJ ? this.LJIJI.mVideoConfig.getFps() : this.fps;
        this.fps = fps;
        if (fps == -1) {
            this.fps = 25;
        }
        return this.fps;
    }

    public final JSONObject LJJI() {
        return this.LJIJ ? this.LJIJI.mVideoConfig.filterConfig.bmfConfig.getGameVideoStreamHDParams() : this.gameVideoStreamHDParams;
    }

    public final float LJJIFFI() {
        float gopSec = this.LJIJ ? this.LJIJI.mVideoConfig.encodeConfig.getGopSec() : this.gopSec;
        this.gopSec = gopSec;
        if (gopSec == -1.0f) {
            this.gopSec = 0.0f;
        }
        return this.gopSec;
    }

    public final int LJJII() {
        return this.LJIJ ? this.LJIJI.mVideoConfig.getHeight() : this.height;
    }

    public final String LJJIII() {
        return this.LJIJ ? this.LJIJI.mCommonConfig.getIdcName() : this.idcName;
    }

    public final boolean LJJIIJ() {
        return this.LJIJ ? this.LJIJI.mCommonConfig.getLinkmicStreamEnable() : this.linkmicStreamEnable;
    }

    public final int LJJIIJZLJL() {
        return this.LJIJ ? this.LJIJI.mVideoConfig.renderConfig.getLiveGlVersion() : this.liveGlVersion;
    }

    public final int LJJIIZ() {
        int maxBitrate = this.LJIJ ? this.LJIJI.mVideoConfig.getMaxBitrate() : this.maxBitrate;
        this.maxBitrate = maxBitrate;
        if (maxBitrate == -1) {
            this.maxBitrate = 0;
        }
        return this.maxBitrate;
    }

    public final int LJJIIZI() {
        int minBitrate = this.LJIJ ? this.LJIJI.mVideoConfig.getMinBitrate() : this.minBitrate;
        this.minBitrate = minBitrate;
        if (minBitrate == -1) {
            this.minBitrate = 0;
        }
        return this.minBitrate;
    }

    public final int LJJIJ() {
        return this.LJIJ ? this.LJIJI.mVideoConfig.filterConfig.denoiseConfig.getMinDenoiseAdaptedResolutionHeight() : this.minDenoiseAdaptedResolutionHeight;
    }

    public final int LJJIJIIJI() {
        return this.LJIJ ? this.LJIJI.mVideoConfig.filterConfig.denoiseConfig.getMinDenoiseAdaptedResolutionWidth() : this.minDenoiseAdaptedResolutionWidth;
    }

    public final int LJJIJIIJIL() {
        return this.LJIJ ? this.LJIJI.mVideoConfig.filterConfig.bmfConfig.getMinStreamHDAdaptedResolutionHeight() : this.minStreamHDAdaptedResolutionHeight;
    }

    public final int LJJIJIL() {
        return this.LJIJ ? this.LJIJI.mVideoConfig.filterConfig.bmfConfig.getMinStreamHDAdaptedResolutionWidth() : this.minStreamHDAdaptedResolutionWidth;
    }

    public final String LJJIJL() {
        return this.LJIJ ? this.LJIJI.mCommonConfig.getStreamName() : this.streamName;
    }

    public final TTLHSceneDetectConfig LJJIJLIJ() {
        return this.LJIJ ? this.LJIJI.mVideoConfig.getTtlhSceneDetectConfig() : this.ttlhSceneDetectConfig;
    }

    public final boolean LJJIL() {
        return this.LJIJ ? this.LJIJI.mVideoConfig.encodeConfig.getUseHardwareEncode() : this.useHardwareEncode;
    }

    public final String LJJIZ() {
        return this.LJIJ ? this.LJIJI.mVideoConfig.encodeConfig.getVCodec() : this.vCodec;
    }

    public final TTLHAbnormalDetectConfigParser LJJJ() {
        return this.LJIJ ? this.LJIJI.mVideoConfig.filterConfig.getVideoAbnormalDetectConfig() : this.videoAbnormalDetectConfig;
    }

    public final JSONObject LJJJI() {
        return this.LJIJ ? this.LJIJI.mVideoConfig.filterConfig.denoiseConfig.getVideoDenoiseParams() : this.videoDenoiseParams;
    }

    public final JSONObject LJJJIL() {
        return this.LJIJ ? this.LJIJI.mVideoConfig.encodeConfig.getVideoEncoderStrategy() : this.videoEncoderStrategy;
    }

    public final String LJJJJ() {
        return this.LJIJ ? this.LJIJI.mVideoConfig.getVideoProfileStr() : this.videoProfileStr;
    }

    public final JSONObject LJJJJI() {
        return this.LJIJ ? this.LJIJI.mVideoConfig.filterConfig.bmfConfig.getVideoStreamHDParams() : this.videoStreamHDParams;
    }

    public final int LJJJJIZL() {
        return this.LJIJ ? this.LJIJI.mVideoConfig.getWidth() : this.width;
    }

    public final void LJJJJJ(int i) {
        if (this.LJIJ) {
            this.LJIJI.mAudioConfig.setAudioBitrate(i);
        } else {
            if (this.audioBitrate != -1 && this.LJIJJ) {
                return;
            }
            this.audioBitrate = i;
        }
    }

    public final void LJJJJJL(int i) {
        if (this.LJIJ) {
            this.LJIJI.mAudioConfig.setAudioSample(i);
        } else {
            if (this.audioSample != -1 && this.LJIJJ) {
                return;
            }
            this.audioSample = i;
        }
    }

    public final void LJJJJL(int i) {
        if (this.LJIJ) {
            this.LJIJI.mVideoConfig.setDefaultBitrate(i);
        } else {
            if (this.defaultBitrate != -1 && this.LJIJJ) {
                return;
            }
            this.defaultBitrate = i;
        }
    }

    public final void LJJJJLI(int i) {
        if (this.LJIJ) {
            this.LJIJI.mVideoConfig.setFps(i);
        } else {
            if (this.fps != -1 && this.LJIJJ) {
                return;
            }
            this.fps = i;
        }
    }

    public final void LJJJJLL(float f) {
        if (this.LJIJ) {
            this.LJIJI.mVideoConfig.encodeConfig.setGopSec(f);
        } else {
            if (this.gopSec != -1.0f && this.LJIJJ) {
                return;
            }
            this.gopSec = f;
        }
    }

    public final void LJJJJZ(int i) {
        this.height = i;
        if (this.LJIJ) {
            this.LJIJI.mVideoConfig.setHeight(i);
        }
    }

    public final void LJJJJZI(String str) {
        if (this.LJIJ) {
            this.LJIJI.mCommonConfig.setIdcName(str);
        } else {
            if (this.idcName != null && this.LJIJJ) {
                return;
            }
            this.idcName = str;
        }
    }

    public final void LJJJLIIL(int i) {
        if (this.LJIJ) {
            this.LJIJI.mVideoConfig.setMaxBitrate(i);
        } else {
            if (this.maxBitrate != -1 && this.LJIJJ) {
                return;
            }
            this.maxBitrate = i;
        }
    }

    public final void LJJJLL(int i) {
        if (this.LJIJ) {
            this.LJIJI.mVideoConfig.setMinBitrate(i);
        } else {
            if (this.minBitrate != -1 && this.LJIJJ) {
                return;
            }
            this.minBitrate = i;
        }
    }

    public final void LJJJLZIJ(String str) {
        if (this.LJIJ) {
            this.LJIJI.mCommonConfig.setStreamName(str);
        } else {
            if (this.streamName != null && this.LJIJJ) {
                return;
            }
            this.streamName = str;
        }
    }

    public final void LJJJZ(boolean z) {
        if (this.LJIJ) {
            this.LJIJI.mVideoConfig.encodeConfig.setUseHardwareEncode(z);
        } else {
            if (this.LJIJJ) {
                return;
            }
            this.useHardwareEncode = z;
        }
    }

    public final void LJJL(int i) {
        this.width = i;
        if (this.LJIJ) {
            this.LJIJI.mVideoConfig.setWidth(i);
        }
    }
}
