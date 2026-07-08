package com.ss.android.ugc.aweme.simkit.model.superresolution;

import X.C09CT;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.AutoBitrateSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public class SuperResolutionStrategyConfigV2 {

    @C09CT("enable_release_texture_render")
    public boolean enableReleaseTexture;

    @C09CT("enable_sr_in_all_scene")
    public boolean enableSrInAllScene;

    @C09CT("enable_sr_ratio_count")
    public boolean enableSrRatioCount;

    @C09CT("fps_threshold")
    public int fpsThreshold;

    @C09CT("max_quality_diff")
    public float maxQualityDiff;

    @C09CT("restart_sr_time_threshold")
    public int restartSrTimeThreshold;

    @C09CT("sr_ratio_sliding_window_size")
    public int srRatioSlidingWindowSize;

    @C09CT("battery_percent_threshold")
    public float batteryPercentThreshold = 0.2f;

    @C09CT("video_time_percent_threshold")
    public float videoTimePercentThreshold = 0.7f;

    @C09CT("quality_type_duration_threshold")
    public Map<Integer, Long> qualityTypeDurationThreshold = new HashMap();

    @C09CT("resolution_duration_threshold")
    public Map<Integer, Long> resolutionDurationThreshold = new HashMap();

    @C09CT("quality_type_min_duration_threshold")
    public Map<Integer, Long> qualityTypeMinDurationThreshold = new HashMap();

    @C09CT("resolution_min_duration_threshold")
    public Map<Integer, Long> resolutionMinDurationThreshold = new HashMap();

    @C09CT("dash_min_duration_threshold")
    public long dashMinDurationThreshold = 0;

    @C09CT("dash_sr")
    public boolean dashSr = false;

    @C09CT("splash_ad_sr")
    public boolean splashAdSr = false;

    @C09CT("splash_ad_sr_max_width")
    public int splashAdSrMaxWidth = 0;

    @C09CT("splash_ad_sr_max_height")
    public int splashAdSrMaxHeight = 0;

    @C09CT("ad_sr")
    public boolean adSr = false;

    @C09CT("ecom_video_sr")
    public boolean ecomVideoSr = false;

    @C09CT("pgc_sr")
    public boolean pgcSr = false;

    @C09CT("async_init_sr")
    public int asyncInitSr = 1;

    @C09CT("close_sr_for_user_local_videos")
    public boolean closeSrForUserLocalVideos = false;

    @C09CT("consider_bitrate_v2")
    public boolean considerBitrateV2 = false;

    @C09CT("low_bitrate_sr_ver")
    public int lowBitrateSrVer = 0;

    @C09CT("low_bitrate_sr_delay_cnt")
    public int lowBitrateSrDelayCnt = 1;

    @C09CT("low_bitrate_sr_percent_threshold")
    public float lowBitrateSrPercentThreshold = 1.0f;

    @C09CT("sr_bitrate_curve")
    public Map<Float, AutoBitrateSet> srBitrateCurve = new HashMap();

    @C09CT("enable_266_sr")
    public boolean enable266Sr = true;

    @C09CT("only_sr_on_266")
    public boolean onlySrOn266 = false;

    @C09CT("enable_sr_in_specific_scene_map")
    public Map<String, Boolean> enableSrInSpecificSceneMap = null;

    @C09CT("enable_sr_for_vod_scene_tag")
    public List<String> enableSrForVodSceneTagList = null;

    @C09CT("close_sr_in_fast_label")
    public boolean closeSRInFastLabel = false;

    @C09CT("close_sr_inner_threshold")
    public Float closeSRInnerThreshold = Float.valueOf(0.0f);

    @C09CT("consider_biz_ad_priority")
    public int considerBizAdPriority = -1;

    @C09CT("sr_bitrate_curve_lowest_quality")
    public int srBitrateCurveLowestQuality = 0;

    @C09CT("sr_bitrate_curve_fps_threshold")
    public int srBitrateCurveFpsThreshold = 0;

    @C09CT("sr_bitrate_curve_without_1080")
    public boolean srBitrateCurveWithout1080 = false;
}
