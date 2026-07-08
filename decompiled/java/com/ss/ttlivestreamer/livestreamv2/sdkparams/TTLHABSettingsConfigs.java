package com.ss.ttlivestreamer.livestreamv2.sdkparams;

import X.C09CT;
import com.ss.lyrax.ttlh_adapter.settings_param.ABSettingsConfigs;
import com.ss.lyrax.video.CachePoolConfig;
import com.ss.lyrax.video.EffectSequenceCacheConfig;
import com.ss.lyrax.video.MemoryConfig;
import com.ss.lyrax.video.NativeRenderConfig;
import com.ss.lyrax.video.TTLHScopeMonitorSettingsConfig;
import com.ss.lyrax.video.TTLHTarsSdkConfigs;
import com.ss.lyrax.video.TTLHVideoFrameAdjustmentConfig;

/* JADX INFO: loaded from: classes21.dex */
public class TTLHABSettingsConfigs {
    public static final TTLHScopeMonitorSettingsConfig LIZLLL;
    public static final EffectSequenceCacheConfig LJ;
    public static final CachePoolConfig LJFF;
    public static final MemoryConfig LJI;

    @C09CT("frame_adjustment")
    public TTLHVideoFrameAdjustmentConfig videoFrameAdjustment = new TTLHVideoFrameAdjustmentConfig();

    @C09CT("native_render_config")
    public NativeRenderConfig nativeRenderConfig = new NativeRenderConfig();

    @C09CT("enable_render_log")
    public boolean enableRenderLog = false;

    @C09CT("enable_anchor_stable_mode_switch")
    public boolean enableAnchorStableModeSwitch = false;
    public boolean LIZ = true;

    @C09CT("glAllocFailMock")
    public boolean glAllocFailMock = false;

    @C09CT("frame_ratio_phase2_part2")
    public boolean frameRatioPhase2Part2 = false;

    @C09CT("enable_send_video_frame_logs")
    public boolean enableSendVideoFrameLogs = false;

    @C09CT("disable_video_frame_statics_add")
    public boolean disableVideoFrameStaticsAdd = false;

    @C09CT("ttlh_tars_configs")
    public TTLHTarsSdkConfigs tarsSdkConfigs = new TTLHTarsSdkConfigs();

    @C09CT("enable_lyrax_video_source_wrapper")
    public boolean enableLyraxVideoSourceWrapper = false;

    @C09CT("enable_lyrax_video_source_wrapper_linkmic")
    public boolean enableLyraxVideoSourceWrapperLinkmic = false;

    @C09CT("lyrax_video_capture_pipeline_stage")
    public int lyraxVideoCapturePipelineStage = -1;

    @C09CT("enable_video_frame_statics_opt")
    public boolean enableVideoFrameStaticsOpt = false;

    @C09CT("enable_effect_remove_nodes_validation_fix")
    public boolean enableEffectRemoveNodesValidationFix = true;

    @C09CT("video_strategy_active_scene")
    public int videoStrategyActiveScene = 0;

    @C09CT("enable_remove_scene_none")
    public boolean enableRemoveSceneNone = false;

    @C09CT("rtc_app_id_for_test")
    public String rtcAppIdForTest = "";

    @C09CT("enable_down_native_render")
    public boolean enableDownNativeRender = false;

    @C09CT("enable_aoc_local_configs")
    public boolean enableAocLocalConfigs = false;

    @C09CT("enable_audio_encode_config_migration")
    public boolean enableAudioEncodeConfigMigration = false;
    public boolean LIZIZ = false;
    public ABSettingsConfigs LIZJ = new ABSettingsConfigs();

    static {
        TTLHScopeMonitorSettingsConfig tTLHScopeMonitorSettingsConfig = new TTLHScopeMonitorSettingsConfig();
        tTLHScopeMonitorSettingsConfig.enable = true;
        tTLHScopeMonitorSettingsConfig.maxFrames = 100;
        tTLHScopeMonitorSettingsConfig.offsetTime = 2000L;
        tTLHScopeMonitorSettingsConfig.recordConfigs.put(6, 5);
        tTLHScopeMonitorSettingsConfig.recordConfigs.put(7, 6);
        tTLHScopeMonitorSettingsConfig.recordConfigs.put(10, 9);
        tTLHScopeMonitorSettingsConfig.recordConfigs.put(12, 11);
        LIZLLL = tTLHScopeMonitorSettingsConfig;
        LJ = new EffectSequenceCacheConfig();
        LJFF = new CachePoolConfig();
        LJI = new MemoryConfig();
    }

    public final boolean LIZ() {
        return this.LIZIZ ? this.LIZJ.getDisableVideoFrameStaticsAdd() : this.disableVideoFrameStaticsAdd;
    }

    public final boolean LIZIZ() {
        return this.LIZIZ ? this.LIZJ.getEnableAnchorStableModeSwitch() : this.enableAnchorStableModeSwitch;
    }

    public final boolean LIZJ() {
        return this.LIZIZ ? this.LIZJ.getEnableAocLocalConfigs() : this.enableAocLocalConfigs;
    }

    public final boolean LIZLLL() {
        return this.LIZIZ ? this.LIZJ.getEnableAudioEncodeConfigMigration() : this.enableAudioEncodeConfigMigration;
    }

    public final boolean LJ() {
        return this.LIZIZ ? this.LIZJ.getEnableDownNativeRender() : this.enableDownNativeRender;
    }

    public final boolean LJFF() {
        return this.LIZIZ ? this.LIZJ.getEnableEffectRemoveNodesValidationFix() : this.enableEffectRemoveNodesValidationFix;
    }

    public final boolean LJI() {
        return this.LIZIZ ? this.LIZJ.getEnableLyraxVideoSourceWrapper() : this.enableLyraxVideoSourceWrapper;
    }

    public final boolean LJII() {
        return this.LIZIZ ? this.LIZJ.getEnableLyraxVideoSourceWrapperLinkmic() : this.enableLyraxVideoSourceWrapperLinkmic;
    }

    public final boolean LJIIIIZZ() {
        return this.LIZIZ ? this.LIZJ.getEnableRemoveSceneNone() : this.enableRemoveSceneNone;
    }

    public final boolean LJIIIZ() {
        return this.LIZIZ ? this.LIZJ.getEnableRenderLog() : this.enableRenderLog;
    }

    public final boolean LJIIJ() {
        return this.LIZIZ ? this.LIZJ.getEnableSendVideoFrameLogs() : this.enableSendVideoFrameLogs;
    }

    public final boolean LJIIJJI() {
        return this.LIZIZ ? this.LIZJ.getEnableVideoFrameStaticsOpt() : this.enableVideoFrameStaticsOpt;
    }

    public final boolean LJIIL() {
        return this.LIZIZ ? this.LIZJ.getFrameRatioPhase2Part2() : this.frameRatioPhase2Part2;
    }

    public final boolean LJIILIIL() {
        return this.LIZIZ ? this.LIZJ.getGlAllocFailMock() : this.glAllocFailMock;
    }

    public final int LJIILJJIL() {
        return this.LIZIZ ? this.LIZJ.getLyraxVideoCapturePipelineStage() : this.lyraxVideoCapturePipelineStage;
    }

    public final NativeRenderConfig LJIILL() {
        return this.LIZIZ ? this.LIZJ.getNativeRenderConfig() : this.nativeRenderConfig;
    }

    public final String LJIILLIIL() {
        return this.LIZIZ ? this.LIZJ.getRtcAppIdForTest() : this.rtcAppIdForTest;
    }

    public final TTLHTarsSdkConfigs LJIIZILJ() {
        return this.LIZIZ ? this.LIZJ.getTarsSdkConfigs() : this.tarsSdkConfigs;
    }

    public final TTLHVideoFrameAdjustmentConfig LJIJ() {
        return this.LIZIZ ? this.LIZJ.getVideoFrameAdjustment() : this.videoFrameAdjustment;
    }

    public final int LJIJI() {
        return this.LIZIZ ? this.LIZJ.getVideoStrategyActiveScene() : this.videoStrategyActiveScene;
    }
}
