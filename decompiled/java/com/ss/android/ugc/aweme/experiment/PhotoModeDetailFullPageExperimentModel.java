package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoModeDetailFullPageExperimentModel {

    @C09CT("comment_dur")
    public final long commentPreloadDur;

    @C09CT("degrade_scene")
    public final List<String> degradeScene;

    @C09CT("dig_guide_cnt")
    public final int digGuideCnt;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_bg_opt")
    public final boolean enableBgOpt;

    @C09CT("enable_dark")
    public final boolean enableDarkNew;

    @C09CT("enable_float")
    public final boolean enableFloat;

    @C09CT("enable_jank_opt")
    public final boolean enableJankOpt;

    @C09CT("enable_land_opt")
    public final boolean enableLandOpt;

    @C09CT("enable_music_weaken")
    public final boolean enableMusicWeaken;

    @C09CT("enable_pinch_opt")
    public final boolean enablePinchOpt;

    @C09CT("swipe_fling_threshold")
    public final float flingThreshold;

    @C09CT("dig_guide_delay")
    public final long guideDelay;

    @C09CT("low_end")
    public final int lowEndScore;

    @C09CT("low_end_explore")
    public final int lowEndScoreForExplore;

    @C09CT("page_ext_offset")
    public final float pageExtOffset;

    @C09CT("low_scale_ratio")
    public final float scaleRatio;

    @C09CT("super_low_end")
    public final float superLowEndScore;

    @C09CT("super_low_scale_ratio")
    public final float superScaleRatio;

    public PhotoModeDetailFullPageExperimentModel() {
        this(false, false, false, 0L, 0.0f, 0.0f, false, false, false, false, false, 0, 0L, 0.0f, 0.0f, 0, 0.0f, 0, null, 524287, null);
    }

    public PhotoModeDetailFullPageExperimentModel(boolean z, boolean z2, boolean z3, long j, float f, float f2, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, long j2, float f3, float f4, int i2, float f5, int i3, List<String> list) {
        this.enable = z;
        this.enableFloat = z2;
        this.enableDarkNew = z3;
        this.commentPreloadDur = j;
        this.pageExtOffset = f;
        this.flingThreshold = f2;
        this.enableJankOpt = z4;
        this.enableBgOpt = z5;
        this.enableLandOpt = z6;
        this.enablePinchOpt = z7;
        this.enableMusicWeaken = z8;
        this.digGuideCnt = i;
        this.guideDelay = j2;
        this.scaleRatio = f3;
        this.superScaleRatio = f4;
        this.lowEndScore = i2;
        this.superLowEndScore = f5;
        this.lowEndScoreForExplore = i3;
        this.degradeScene = list;
    }

    public PhotoModeDetailFullPageExperimentModel(boolean z, boolean z2, boolean z3, long j, float f, float f2, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, long j2, float f3, float f4, int i2, float f5, int i3, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? false : z2, (i4 & 4) != 0 ? true : z3, (i4 & 8) != 0 ? 0L : j, (i4 & 16) != 0 ? 0.35f : f, (i4 & 32) != 0 ? 1500.0f : f2, (i4 & 64) != 0 ? false : z4, (i4 & 128) != 0 ? false : z5, (i4 & 256) != 0 ? false : z6, (i4 & 512) != 0 ? false : z7, (i4 & 1024) != 0 ? false : z8, (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? i : 0, (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? 500L : j2, (i4 & 8192) != 0 ? -1.0f : f3, (i4 & 16384) != 0 ? -1.0f : f4, (32768 & i4) != 0 ? -1 : i2, (65536 & i4) != 0 ? -1.0f : f5, (131072 & i4) == 0 ? i3 : -1, (i4 & 262144) != 0 ? C13BV.INSTANCE : list);
    }
}
