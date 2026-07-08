package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import X.C786410Ut5;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class FeaturePollExperimentConfig {

    @C09CT("baseline_distribution_cap")
    public final int baselineDistributionCap;

    @C09CT("baseline_enable")
    public final boolean baselineEnable;

    @C09CT("baseline_folded_aids_cap")
    public final int baselineFoldedAidsCap;

    @C09CT("baseline_half_life_ms")
    public final long baselineHalfLifeMs;

    @C09CT("baseline_max_stale_ms")
    public final long baselineMaxStaleMs;

    @C09CT("baseline_max_update_gap_ms")
    public final long baselineMaxUpdateGapMs;

    @C09CT("baseline_real_time_category_fields")
    public final Map<String, String> baselineRealTimeCategoryFields;

    @C09CT("baseline_real_time_numeric_fields")
    public final List<String> baselineRealTimeNumericFields;

    @C09CT("baseline_video_boolean_fields")
    public final Map<String, String> baselineVideoBooleanFields;

    @C09CT("bg_upload_threshold_ms")
    public final long bgUploadThresholdMs;

    @C09CT("interval_ms")
    public final long intervalMs;

    @C09CT("max_real_time_history")
    public final int maxRealTimeHistory;

    @C09CT("open")
    public final boolean open;

    public FeaturePollExperimentConfig() {
        this(false, 0L, 0, 0L, false, 0L, 0L, 0L, 0, 0, null, null, null, 8191, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeaturePollExperimentConfig)) {
            return false;
        }
        FeaturePollExperimentConfig featurePollExperimentConfig = (FeaturePollExperimentConfig) obj;
        return this.open == featurePollExperimentConfig.open && this.intervalMs == featurePollExperimentConfig.intervalMs && this.maxRealTimeHistory == featurePollExperimentConfig.maxRealTimeHistory && this.bgUploadThresholdMs == featurePollExperimentConfig.bgUploadThresholdMs && this.baselineEnable == featurePollExperimentConfig.baselineEnable && this.baselineHalfLifeMs == featurePollExperimentConfig.baselineHalfLifeMs && this.baselineMaxStaleMs == featurePollExperimentConfig.baselineMaxStaleMs && this.baselineMaxUpdateGapMs == featurePollExperimentConfig.baselineMaxUpdateGapMs && this.baselineFoldedAidsCap == featurePollExperimentConfig.baselineFoldedAidsCap && this.baselineDistributionCap == featurePollExperimentConfig.baselineDistributionCap && Intrinsics.LJFF(this.baselineRealTimeNumericFields, featurePollExperimentConfig.baselineRealTimeNumericFields) && Intrinsics.LJFF(this.baselineRealTimeCategoryFields, featurePollExperimentConfig.baselineRealTimeCategoryFields) && Intrinsics.LJFF(this.baselineVideoBooleanFields, featurePollExperimentConfig.baselineVideoBooleanFields);
    }

    public final int hashCode() {
        int iZ2 = ((((((((((((((((((C786410Ut5.Z2(this.open) * 31) + C786410Ut5.Y2(this.intervalMs)) * 31) + this.maxRealTimeHistory) * 31) + C786410Ut5.Y2(this.bgUploadThresholdMs)) * 31) + C786410Ut5.Z2(this.baselineEnable)) * 31) + C786410Ut5.Y2(this.baselineHalfLifeMs)) * 31) + C786410Ut5.Y2(this.baselineMaxStaleMs)) * 31) + C786410Ut5.Y2(this.baselineMaxUpdateGapMs)) * 31) + this.baselineFoldedAidsCap) * 31) + this.baselineDistributionCap) * 31;
        List<String> list = this.baselineRealTimeNumericFields;
        int iHashCode = (iZ2 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, String> map = this.baselineRealTimeCategoryFields;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.baselineVideoBooleanFields;
        return iHashCode2 + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        return "FeaturePollExperimentConfig(open=" + this.open + ", intervalMs=" + this.intervalMs + ", maxRealTimeHistory=" + this.maxRealTimeHistory + ", bgUploadThresholdMs=" + this.bgUploadThresholdMs + ", baselineEnable=" + this.baselineEnable + ", baselineHalfLifeMs=" + this.baselineHalfLifeMs + ", baselineMaxStaleMs=" + this.baselineMaxStaleMs + ", baselineMaxUpdateGapMs=" + this.baselineMaxUpdateGapMs + ", baselineFoldedAidsCap=" + this.baselineFoldedAidsCap + ", baselineDistributionCap=" + this.baselineDistributionCap + ", baselineRealTimeNumericFields=" + this.baselineRealTimeNumericFields + ", baselineRealTimeCategoryFields=" + this.baselineRealTimeCategoryFields + ", baselineVideoBooleanFields=" + this.baselineVideoBooleanFields + ')';
    }

    public FeaturePollExperimentConfig(boolean z, long j, int i, long j2, boolean z2, long j3, long j4, long j5, int i2, int i3, List<String> list, Map<String, String> map, Map<String, String> map2) {
        this.open = z;
        this.intervalMs = j;
        this.maxRealTimeHistory = i;
        this.bgUploadThresholdMs = j2;
        this.baselineEnable = z2;
        this.baselineHalfLifeMs = j3;
        this.baselineMaxStaleMs = j4;
        this.baselineMaxUpdateGapMs = j5;
        this.baselineFoldedAidsCap = i2;
        this.baselineDistributionCap = i3;
        this.baselineRealTimeNumericFields = list;
        this.baselineRealTimeCategoryFields = map;
        this.baselineVideoBooleanFields = map2;
    }

    public FeaturePollExperimentConfig(boolean z, long j, int i, long j2, boolean z2, long j3, long j4, long j5, int i2, int i3, List list, Map map, Map map2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? 300000L : j, (i4 & 4) != 0 ? 4 : i, (i4 & 8) != 0 ? 600000L : j2, (i4 & 16) != 0 ? true : z2, (i4 & 32) != 0 ? 604800000L : j3, (i4 & 64) != 0 ? 2592000000L : j4, (i4 & 128) == 0 ? j5 : 604800000L, (i4 & 256) != 0 ? 128 : i2, (i4 & 512) != 0 ? 32 : i3, (i4 & 1024) != 0 ? C13BV.INSTANCE : list, (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C2097608Jq.LJ() : map, (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? C2097608Jq.LJ() : map2);
    }
}
