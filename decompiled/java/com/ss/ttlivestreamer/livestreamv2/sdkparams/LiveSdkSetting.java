package com.ss.ttlivestreamer.livestreamv2.sdkparams;

import X.C09CT;
import com.ss.lyrax.ttlh_adapter.push_param.SDKSettingsConfig;
import com.ss.lyrax.video.LinkMicVideoConfig;
import com.ss.lyrax.video.RenderReportSetting;
import com.ss.lyrax.video.SkipEffectConfig;
import com.ss.lyrax.video.VideoBufferPoolConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class LiveSdkSetting {
    public static final SkipEffectConfig LJIILLIIL = new SkipEffectConfig(1, 360, 640, false);
    public static final RenderReportSetting LJIIZILJ;
    public SDKSettingsConfig LJIILL;

    @C09CT("linkmic_config")
    public JSONObject linkMicConfig;

    @C09CT("Common")
    public CommonParams commonParams = new CommonParams();

    @C09CT("sandbox")
    public SandboxParams sandboxParams = new SandboxParams();

    @C09CT("CaptureBase")
    public CaptureBase captureBase = new CaptureBase();

    @C09CT("PushBase")
    public PushBase mPushBase = new PushBase();

    @C09CT("Interact")
    public VPassInteractCfg mVPassInteractCfg = new VPassInteractCfg();

    @C09CT("psnr_statistics")
    public PsnrStatisics psnrStatisics = new PsnrStatisics();
    public final boolean LIZ = true;
    public final int LIZIZ = 1;
    public final String LIZJ = "opensles";
    public final String LIZLLL = "opensles";
    public final boolean LJ = true;
    public final boolean LJFF = true;
    public final boolean LJI = true;
    public final boolean LJII = true;

    @C09CT("enableNewVideoBufferPool")
    public boolean enableNewVideoBufferPool = false;

    @C09CT("videoBufferPoolConfig")
    public VideoBufferPoolConfig videoBufferPoolConfig = new VideoBufferPoolConfig();

    @C09CT("linkmicVideoConfig")
    public LinkMicVideoConfig linkMicVideoConfig = new LinkMicVideoConfig();

    @C09CT("light_check_strategy")
    public int lightCheckStrategy = 0;

    @C09CT("dark_sync_min_enable")
    public int darkSyncMinEnable = 0;

    @C09CT("linkmic_normal_live_min_fps")
    public int linkmicNormalLiveMinFps = 15;

    @C09CT("compareCameraRealFps")
    public boolean compareCameraRealFps = false;

    @C09CT("ttlh_live_ab_settings")
    public TTLHABSettingsConfigs ttlhABSettingsConfigs = new TTLHABSettingsConfigs();
    public TTLHABSettingsAdaptiveConfigs LJIIIIZZ = new TTLHABSettingsAdaptiveConfigs();
    public final TTLHABSettingsAdaptiveSwitchConfigs LJIIIZ = new TTLHABSettingsAdaptiveSwitchConfigs();

    @C09CT("enable_rounded_corner")
    public boolean enableRoundedCorner = false;

    @C09CT("renderReportOpt")
    public boolean renderReportOpt = false;
    public final boolean LJIIJ = true;

    @C09CT("enable_arch_opt_phase1")
    public boolean enableArchOptPhase1 = false;

    @C09CT("enable_arch_opt_phase2")
    public boolean enableArchOptPhase2 = false;

    @C09CT("pauseFps")
    public int pauseFps = 1;

    @C09CT("ttlh_enable_guest_use_rtc_video_v2")
    public boolean enableGuestUseRTCVideo2 = false;

    @C09CT("autotest_parameters")
    public String autotestParameters = "";

    @C09CT("autotest_rtc_app_id")
    public String autotestRtcAppId = "";

    @C09CT("autotest_access_host")
    public String autotestAccessHost = "";

    @C09CT("autotest_log_sdk_websocket_url")
    public String autotestLogSdkWebsocketUrl = "";

    @C09CT("enable_native_live")
    public boolean enableNativeLive = false;

    @C09CT("enable_lyrax_autotest")
    public boolean enableLyraxAutotest = false;

    @C09CT("enable_new_surface_async")
    public boolean enableNewSurfaceAsync = true;

    @C09CT("ttlh_anchornet_join_room_once")
    public boolean anchorNetNoRoomJoinRoomOnce = false;

    @C09CT("enable_arch_opt_log")
    public boolean enableArchOptLog = false;
    public boolean LJIIJJI = false;
    public boolean LJIIL = false;
    public int LJIILIIL = 30000;
    public boolean LJIILJJIL = false;

    static {
        RenderReportSetting renderReportSetting = new RenderReportSetting();
        renderReportSetting.normalJankThreshold = 84;
        renderReportSetting.seriousJankThreshold = 125;
        renderReportSetting.timerInterval = 60;
        renderReportSetting.maxTimeInTimerInterval = 4;
        renderReportSetting.sampleCount = 2;
        renderReportSetting.enableFrameJankReport = false;
        renderReportSetting.enable2sJankCallback = true;
        LJIIZILJ = renderReportSetting;
    }

    public final boolean LIZ() {
        return this.LJIILJJIL ? this.LJIILL.mCommonConfig.getAnchorNetNoRoomJoinRoomOnce() : this.anchorNetNoRoomJoinRoomOnce;
    }

    public final String LIZIZ() {
        return this.LJIILJJIL ? this.LJIILL.mCommonConfig.getAutotestAccessHost() : this.autotestAccessHost;
    }

    public final String LIZJ() {
        return this.LJIILJJIL ? this.LJIILL.mCommonConfig.getAutotestLogSdkWebsocketUrl() : this.autotestLogSdkWebsocketUrl;
    }

    public final String LIZLLL() {
        return this.LJIILJJIL ? this.LJIILL.mCommonConfig.getAutotestParameters() : this.autotestParameters;
    }

    public final String LJ() {
        return this.LJIILJJIL ? this.LJIILL.mCommonConfig.getAutotestRtcAppId() : this.autotestRtcAppId;
    }

    public final String LJFF() {
        return this.LJIILJJIL ? this.LJIILL.mCommonConfig.getSessionId() : this.commonParams.sessionId;
    }

    public final boolean LJI() {
        return this.LJIILJJIL ? this.LJIILL.mVideoConfig.getCompareCameraRealFps() : this.compareCameraRealFps;
    }

    public final int LJII() {
        return this.LJIILJJIL ? this.LJIILL.mVideoConfig.getDarkSyncMinEnable() : this.darkSyncMinEnable;
    }

    public final boolean LJIIIIZZ() {
        return this.LJIILJJIL ? this.LJIILL.mCommonConfig.getEnableArchOptLog() : this.enableArchOptLog;
    }

    public final boolean LJIIIZ() {
        return this.LJIILJJIL ? this.LJIILL.mCommonConfig.getEnableArchOptPhase1() : this.enableArchOptPhase1;
    }

    public final boolean LJIIJ() {
        return this.LJIILJJIL ? this.LJIILL.mCommonConfig.getEnableArchOptPhase2() : this.enableArchOptPhase2;
    }

    public final boolean LJIIJJI() {
        return this.LJIILJJIL ? this.LJIILL.mCommonConfig.getEnableGuestUseRTCVideo2() : this.enableGuestUseRTCVideo2;
    }

    public final boolean LJIIL() {
        return this.LJIILJJIL ? this.LJIILL.mCommonConfig.getEnableLyraxAutotest() : this.enableLyraxAutotest;
    }

    public final boolean LJIILIIL() {
        return this.LJIILJJIL ? this.LJIILL.mCommonConfig.getEnableNativeLive() : this.enableNativeLive;
    }

    public final boolean LJIILJJIL() {
        return this.LJIILJJIL ? this.LJIILL.mCommonConfig.getEnableNewSurfaceAsync() : this.enableNewSurfaceAsync;
    }

    public final boolean LJIILL() {
        return this.psnrStatisics.enablePsnr;
    }

    public final boolean LJIILLIIL() {
        return this.LJIILJJIL ? this.LJIILL.mVideoConfig.getEnableRoundedCorner() : this.enableRoundedCorner;
    }

    public final int LJIIZILJ() {
        return this.LJIILJJIL ? this.LJIILL.mVideoConfig.getLightCheckStrategy() : this.lightCheckStrategy;
    }

    public final LinkMicVideoConfig LJIJ() {
        return this.LJIILJJIL ? this.LJIILL.mVideoConfig.getLinkMicVideoConfig() : this.linkMicVideoConfig;
    }

    public final int LJIJI() {
        return this.LJIILJJIL ? this.LJIILL.mVideoConfig.getLinkmicNormalLiveMinFps() : this.linkmicNormalLiveMinFps;
    }

    public final int LJIJJ() {
        TTLHABSettingsConfigs tTLHABSettingsConfigs = this.ttlhABSettingsConfigs;
        if (tTLHABSettingsConfigs != null) {
            return tTLHABSettingsConfigs.LJIILJJIL();
        }
        return -1;
    }

    public final int LJIJJLI() {
        return this.LJIILJJIL ? this.LJIILL.mVideoConfig.getPauseFps() : this.pauseFps;
    }

    public final boolean LJIL() {
        return this.LJIILJJIL ? this.LJIILL.mVideoConfig.getRenderReportOpt() : this.renderReportOpt;
    }

    public final VideoBufferPoolConfig LJJ() {
        return this.LJIILJJIL ? this.LJIILL.mVideoConfig.getVideoBufferPoolConfig() : this.videoBufferPoolConfig;
    }
}
