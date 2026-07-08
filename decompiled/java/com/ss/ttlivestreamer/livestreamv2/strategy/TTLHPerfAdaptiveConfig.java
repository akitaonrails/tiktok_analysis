package com.ss.ttlivestreamer.livestreamv2.strategy;

import X.C09CT;
import X.C216900sZ;
import X.C2188811AlT;
import com.ss.ttlivestreamer.livestreamv2.strategy.EffectModelStrategy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class TTLHPerfAdaptiveConfig {

    @C09CT("downgrade_check_sec")
    public int downGradeCheckSec;

    @C09CT("effect_strategy_resource")
    public EffectResourceStrategy$StrategyConfig effectResourceStrategy;

    @C09CT("enable")
    public boolean enable;

    @C09CT("upgrade_check_sec")
    public int upGradeCheckSec;

    @C09CT("upgrade_min_interval_sec")
    public int upGradeMinIntervalSec = 15;

    @C09CT("downgrade_min_interval_sec")
    public int downGradeMinIntervalSec = 15;

    @C09CT("max_cache_size")
    public int maxCacheSize = 20;

    @C09CT("downgrade_check_min_samples")
    public int downGradeCheckMinSamples = 2;

    @C09CT("upgrade_check_min_samples")
    public int upGradeCheckMinSamples = 3;

    @C09CT("adaptive_default_config")
    public AdaptiveConfig defaultConfig = new AdaptiveConfig();

    @C09CT("adaptive_specific_config")
    public List<AdaptiveConfig> specificConfig = new ArrayList();

    @C09CT("live_video_per_levels")
    public List<Object> liveVideoPerfLevels = new ArrayList();

    @C09CT("live_video_perf_level_limit")
    public List<Object> liveVideoPerfAdaptiveLevelLimits = new ArrayList();

    @C09CT("live_video_strategy")
    public LiveVideoPerfAdaptiveConfig$StrategyConfig liveVideoEncodeStrategy = new Object() { // from class: com.ss.ttlivestreamer.livestreamv2.strategy.LiveVideoPerfAdaptiveConfig$StrategyConfig

        @C09CT("enable")
        public boolean enable;

        @C09CT("priority")
        public int priority;

        @C09CT("video_uppper_level_select_mode")
        public int videoUpLevelMode;

        @C09CT("resolution_limit_size")
        public long resLimitSize = 2147483647L;

        @C09CT("disable_on_anchornet")
        public boolean disableOnAnchorNet = true;

        @C09CT("mode")
        public int mode = 2;

        @C09CT("fps_levels")
        public List<Integer> fpsLevels = new ArrayList();

        @C09CT("upgrade_score_level_map")
        public List<Object> upGradeScoreLevelMap = new ArrayList();

        @C09CT("downgrade_score_level_map")
        public List<Object> downGradeScoreLevelMap = new ArrayList();

        @C09CT("report_excep_log")
        public boolean reportException = true;

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("StrategyConfig{priority=");
            sbLIZ.append(this.priority);
            sbLIZ.append(", mode=");
            sbLIZ.append(this.mode);
            sbLIZ.append(", fpsLevels=");
            sbLIZ.append(this.fpsLevels);
            sbLIZ.append(", videoUpLevelMode=");
            sbLIZ.append(this.videoUpLevelMode);
            sbLIZ.append(", upGradeScoreLevelMap=");
            sbLIZ.append(this.upGradeScoreLevelMap);
            sbLIZ.append(", downGradeScoreLevelMap=");
            sbLIZ.append(this.downGradeScoreLevelMap);
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    };

    @C09CT("linkmic_simulcast_strategy")
    public LinkmicSimulcastStrategy$StrategyConfig linkmicSimulcastStrategy = new Object() { // from class: com.ss.ttlivestreamer.livestreamv2.strategy.LinkmicSimulcastStrategy$StrategyConfig

        @C09CT("enable")
        public boolean enable;

        @C09CT("priority")
        public int priority;

        @C09CT("single")
        public LinkmicSimulcastStrategy$SimulcastModeConfig singleModeConfig = new Object() { // from class: com.ss.ttlivestreamer.livestreamv2.strategy.LinkmicSimulcastStrategy$SimulcastModeConfig

            @C09CT("default_index")
            public int defaultIndex;

            @C09CT("default")
            public String defaultStream;

            @C09CT("level")
            public List<Object> levels = new ArrayList();

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SimulcastModeConfig{defaultStream='");
                sbLIZ.append(this.defaultStream);
                sbLIZ.append('\'');
                sbLIZ.append(", defaultIndex=");
                sbLIZ.append(this.defaultIndex);
                sbLIZ.append(", levels=");
                sbLIZ.append(C216900sZ.LIZIZ(this.levels));
                sbLIZ.append('}');
                return C2188811AlT.LIZIZ(sbLIZ);
            }
        };

        @C09CT("dual")
        public LinkmicSimulcastStrategy$SimulcastModeConfig dualModeConfig = new Object() { // from class: com.ss.ttlivestreamer.livestreamv2.strategy.LinkmicSimulcastStrategy$SimulcastModeConfig

            @C09CT("default_index")
            public int defaultIndex;

            @C09CT("default")
            public String defaultStream;

            @C09CT("level")
            public List<Object> levels = new ArrayList();

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SimulcastModeConfig{defaultStream='");
                sbLIZ.append(this.defaultStream);
                sbLIZ.append('\'');
                sbLIZ.append(", defaultIndex=");
                sbLIZ.append(this.defaultIndex);
                sbLIZ.append(", levels=");
                sbLIZ.append(C216900sZ.LIZIZ(this.levels));
                sbLIZ.append('}');
                return C2188811AlT.LIZIZ(sbLIZ);
            }
        };

        @C09CT("effect_fps_filter")
        public boolean effectFpsFilter = false;

        @C09CT("camera_size_enable")
        public boolean cameraSizeEnable = true;

        @C09CT("camera_fps_enable")
        public boolean cameraFpsEnable = true;

        @C09CT("network_report_default")
        public boolean network_report_default = true;

        @C09CT("fixSingleEncodeBug")
        public boolean fixSingleEncodeBug = true;

        @C09CT("effectSplashBug")
        public boolean effectSplashBug = true;

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("StrategyConfig{priority=");
            sbLIZ.append(this.priority);
            sbLIZ.append(", singleModeConfig=");
            sbLIZ.append(this.singleModeConfig);
            sbLIZ.append(", dualModeConfig=");
            sbLIZ.append(this.dualModeConfig);
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    };

    @C09CT("effect_strategy_face")
    public EffectModelStrategy.StrategyConfig effectFaceStrategy = new EffectModelStrategy.StrategyConfig("effect_face", "face_extra_model_name");

    @C09CT("effect_strategy_matting")
    public EffectModelStrategy.StrategyConfig effectMattingStrategy = new EffectModelStrategy.StrategyConfig("effect_matting", "matting_model_name");

    public static class AdaptiveConfig {

        @C09CT("downgrade_threshold_drop3_linkmic")
        public int downGradeThresHoldDrop3LinkMic;

        @C09CT("downgrade_threshold_drop3_live")
        public int downGradeThresHoldDrop3Live;

        @C09CT("downgrade_threshold_linkmic")
        public int downGradeThresHoldLinkMic;

        @C09CT("downgrade_threshold_live")
        public int downGradeThresHoldLive;

        @C09CT("downgrade_threshold_thermal_linkmic")
        public int downGradeThresHoldThermalLinkMic;

        @C09CT("downgrade_threshold_thermal_live")
        public int downGradeThresHoldThermalLive;

        @C09CT("downgrade_threshold_uifps_linkmic")
        public int downGradeThresHoldUiFpsLinkMic;

        @C09CT("downgrade_threshold_uifps_live")
        public int downGradeThresHoldUiFpsLive;

        @C09CT("overall_score_high_limit")
        public int overallScoreHighLimit;

        @C09CT("overall_score_low_limit")
        public int overallScoreLowLimit;

        @C09CT("upgrade_threshold_drop3_linkmic")
        public int upGradeThresHoldDrop3LinkMic;

        @C09CT("upgrade_threshold_drop3_live")
        public int upGradeThresHoldDrop3Live;

        @C09CT("upgrade_threshold_linkmic")
        public int upGradeThresHoldLinkMic;

        @C09CT("upgrade_threshold_live")
        public int upGradeThresHoldLive;

        @C09CT("upgrade_threshold_thermal_linkmic")
        public int upGradeThresHoldThermalLinkMic;

        @C09CT("upgrade_threshold_thermal_live")
        public int upGradeThresHoldThermalLive;

        @C09CT("upgrade_threshold_uifps_linkmic")
        public int upGradeThresHoldUiFpsLinkMic;

        @C09CT("upgrade_threshold_uifps_live")
        public int upGradeThresHoldUiFpsLive;

        public AdaptiveConfig() {
            this.overallScoreLowLimit = -1;
            this.overallScoreHighLimit = -1;
            this.downGradeThresHoldLive = Integer.MIN_VALUE;
            this.upGradeThresHoldLive = Integer.MAX_VALUE;
            this.downGradeThresHoldLinkMic = Integer.MIN_VALUE;
            this.upGradeThresHoldLinkMic = Integer.MAX_VALUE;
            this.downGradeThresHoldThermalLive = Integer.MIN_VALUE;
            this.upGradeThresHoldThermalLive = Integer.MAX_VALUE;
            this.downGradeThresHoldThermalLinkMic = Integer.MIN_VALUE;
            this.upGradeThresHoldThermalLinkMic = Integer.MAX_VALUE;
            this.downGradeThresHoldUiFpsLive = Integer.MIN_VALUE;
            this.upGradeThresHoldUiFpsLive = Integer.MAX_VALUE;
            this.downGradeThresHoldUiFpsLinkMic = Integer.MIN_VALUE;
            this.upGradeThresHoldUiFpsLinkMic = Integer.MAX_VALUE;
            this.downGradeThresHoldDrop3Live = Integer.MIN_VALUE;
            this.upGradeThresHoldDrop3Live = Integer.MAX_VALUE;
            this.downGradeThresHoldDrop3LinkMic = Integer.MIN_VALUE;
            this.upGradeThresHoldDrop3LinkMic = Integer.MAX_VALUE;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AdaptiveConfig{overallScoreLowLimit=");
            sbLIZ.append(this.overallScoreLowLimit);
            sbLIZ.append(", overallScoreHighLimit=");
            sbLIZ.append(this.overallScoreHighLimit);
            sbLIZ.append(", downGradeThresHoldLive=");
            sbLIZ.append(this.downGradeThresHoldLive);
            sbLIZ.append(", upGradeThresHoldLive=");
            sbLIZ.append(this.upGradeThresHoldLive);
            sbLIZ.append(", downGradeThresHoldLinkMic=");
            sbLIZ.append(this.downGradeThresHoldLinkMic);
            sbLIZ.append(", upGradeThresHoldLinkMic=");
            sbLIZ.append(this.upGradeThresHoldLinkMic);
            sbLIZ.append(", downGradeThresHoldThermalLive=");
            sbLIZ.append(this.downGradeThresHoldThermalLive);
            sbLIZ.append(", upGradeThresHoldThermalLive=");
            sbLIZ.append(this.upGradeThresHoldThermalLive);
            sbLIZ.append(", downGradeThresHoldThermalLinkMic=");
            sbLIZ.append(this.downGradeThresHoldThermalLinkMic);
            sbLIZ.append(", upGradeThresHoldThermalLinkMic=");
            sbLIZ.append(this.upGradeThresHoldThermalLinkMic);
            sbLIZ.append(", downGradeThresHoldUiFpsLive=");
            sbLIZ.append(this.downGradeThresHoldUiFpsLive);
            sbLIZ.append(", upGradeThresHoldUiFpsLive=");
            sbLIZ.append(this.upGradeThresHoldUiFpsLive);
            sbLIZ.append(", downGradeThresHoldUiFpsLinkMic=");
            sbLIZ.append(this.downGradeThresHoldUiFpsLinkMic);
            sbLIZ.append(", upGradeThresHoldUiFpsLinkMic=");
            sbLIZ.append(this.upGradeThresHoldUiFpsLinkMic);
            sbLIZ.append(", downGradeThresHoldDrop3Live=");
            sbLIZ.append(this.downGradeThresHoldDrop3Live);
            sbLIZ.append(", upGradeThresHoldDrop3Live=");
            sbLIZ.append(this.upGradeThresHoldDrop3Live);
            sbLIZ.append(", downGradeThresHoldDrop3LinkMic=");
            sbLIZ.append(this.downGradeThresHoldDrop3LinkMic);
            sbLIZ.append(", upGradeThresHoldDrop3LinkMic=");
            sbLIZ.append(this.upGradeThresHoldDrop3LinkMic);
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public AdaptiveConfig(AdaptiveConfig adaptiveConfig) {
            this.overallScoreLowLimit = -1;
            this.overallScoreHighLimit = -1;
            this.downGradeThresHoldLive = Integer.MIN_VALUE;
            this.upGradeThresHoldLive = Integer.MAX_VALUE;
            this.downGradeThresHoldLinkMic = Integer.MIN_VALUE;
            this.upGradeThresHoldLinkMic = Integer.MAX_VALUE;
            this.downGradeThresHoldThermalLive = Integer.MIN_VALUE;
            this.upGradeThresHoldThermalLive = Integer.MAX_VALUE;
            this.downGradeThresHoldThermalLinkMic = Integer.MIN_VALUE;
            this.upGradeThresHoldThermalLinkMic = Integer.MAX_VALUE;
            this.downGradeThresHoldUiFpsLive = Integer.MIN_VALUE;
            this.upGradeThresHoldUiFpsLive = Integer.MAX_VALUE;
            this.downGradeThresHoldUiFpsLinkMic = Integer.MIN_VALUE;
            this.upGradeThresHoldUiFpsLinkMic = Integer.MAX_VALUE;
            this.downGradeThresHoldDrop3Live = Integer.MIN_VALUE;
            this.upGradeThresHoldDrop3Live = Integer.MAX_VALUE;
            this.downGradeThresHoldDrop3LinkMic = Integer.MIN_VALUE;
            this.upGradeThresHoldDrop3LinkMic = Integer.MAX_VALUE;
            this.overallScoreHighLimit = adaptiveConfig.overallScoreHighLimit;
            this.overallScoreLowLimit = adaptiveConfig.overallScoreLowLimit;
            this.downGradeThresHoldLive = adaptiveConfig.downGradeThresHoldLive;
            this.upGradeThresHoldLive = adaptiveConfig.upGradeThresHoldLive;
            this.downGradeThresHoldLinkMic = adaptiveConfig.downGradeThresHoldLinkMic;
            this.upGradeThresHoldLinkMic = adaptiveConfig.upGradeThresHoldLinkMic;
            this.downGradeThresHoldThermalLive = adaptiveConfig.downGradeThresHoldThermalLive;
            this.upGradeThresHoldThermalLive = adaptiveConfig.upGradeThresHoldThermalLive;
            this.downGradeThresHoldThermalLinkMic = adaptiveConfig.downGradeThresHoldThermalLinkMic;
            this.upGradeThresHoldThermalLinkMic = adaptiveConfig.upGradeThresHoldThermalLinkMic;
            this.downGradeThresHoldUiFpsLive = adaptiveConfig.downGradeThresHoldUiFpsLive;
            this.upGradeThresHoldUiFpsLive = adaptiveConfig.upGradeThresHoldUiFpsLive;
            this.downGradeThresHoldUiFpsLinkMic = adaptiveConfig.downGradeThresHoldUiFpsLinkMic;
            this.upGradeThresHoldUiFpsLinkMic = adaptiveConfig.upGradeThresHoldUiFpsLinkMic;
            this.downGradeThresHoldDrop3Live = adaptiveConfig.downGradeThresHoldDrop3Live;
            this.upGradeThresHoldDrop3Live = adaptiveConfig.upGradeThresHoldDrop3Live;
            this.downGradeThresHoldDrop3LinkMic = adaptiveConfig.downGradeThresHoldDrop3LinkMic;
            this.upGradeThresHoldDrop3LinkMic = adaptiveConfig.upGradeThresHoldDrop3LinkMic;
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.ttlivestreamer.livestreamv2.strategy.LiveVideoPerfAdaptiveConfig$StrategyConfig] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.ss.ttlivestreamer.livestreamv2.strategy.LinkmicSimulcastStrategy$StrategyConfig] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.ss.ttlivestreamer.livestreamv2.strategy.EffectResourceStrategy$StrategyConfig] */
    public TTLHPerfAdaptiveConfig() {
        final String str = "effect_resource";
        this.effectResourceStrategy = new Object(str) { // from class: com.ss.ttlivestreamer.livestreamv2.strategy.EffectResourceStrategy$StrategyConfig

            @C09CT("enable")
            public boolean enable;

            @C09CT("priority")
            public int priority;

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("StrategyConfig{enable=");
                sbLIZ.append(this.enable);
                sbLIZ.append(", priority=");
                sbLIZ.append(this.priority);
                sbLIZ.append('}');
                return C2188811AlT.LIZIZ(sbLIZ);
            }
        };
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTLHPerfAdaptiveConfig{enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", upGradeMinIntervalSec=");
        sbLIZ.append(this.upGradeMinIntervalSec);
        sbLIZ.append(", downGradeMinIntervalSec=");
        sbLIZ.append(this.downGradeMinIntervalSec);
        sbLIZ.append(", maxCacheSize=");
        sbLIZ.append(this.maxCacheSize);
        sbLIZ.append(", downGradeCheckSec=");
        sbLIZ.append(this.downGradeCheckSec);
        sbLIZ.append(", upGradeCheckSec=");
        sbLIZ.append(this.upGradeCheckSec);
        sbLIZ.append(", downGradeCheckMinSamples=");
        sbLIZ.append(this.downGradeCheckMinSamples);
        sbLIZ.append(", upGradeCheckMinSamples=");
        sbLIZ.append(this.upGradeCheckMinSamples);
        sbLIZ.append(", defaultConfig=");
        sbLIZ.append(this.defaultConfig);
        sbLIZ.append(", specificConfig=");
        sbLIZ.append(this.specificConfig);
        sbLIZ.append(", liveVideoEncodeStrategy=");
        sbLIZ.append(this.liveVideoEncodeStrategy);
        sbLIZ.append(", linkmicSimulcastStrategy=");
        sbLIZ.append(this.linkmicSimulcastStrategy);
        sbLIZ.append(", effectFaceStrategy=");
        sbLIZ.append(this.effectFaceStrategy);
        sbLIZ.append(", effectMattingStrategy=");
        sbLIZ.append(this.effectMattingStrategy);
        sbLIZ.append(", effectResourceStrategy=");
        sbLIZ.append(this.effectResourceStrategy);
        sbLIZ.append(", live_video_per_levels=");
        sbLIZ.append(this.liveVideoPerfLevels);
        sbLIZ.append(", live_video_perf_level_limit=");
        sbLIZ.append(this.liveVideoPerfAdaptiveLevelLimits);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
