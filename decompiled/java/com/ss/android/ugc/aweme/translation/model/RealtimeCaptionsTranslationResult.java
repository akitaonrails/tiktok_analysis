package com.ss.android.ugc.aweme.translation.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes32.dex */
public final class RealtimeCaptionsTranslationResult extends BaseResponse {

    @C09CT("ai_lab_time")
    public Integer aiLabTime;

    @C09CT("perf_metrics")
    public PerfMetric perfMetrics;

    @C09CT("webvtt_subtitle")
    public String translatedContent;

    @C09CT("translation_cache_time")
    public Integer translationCacheTime;

    @C09CT("variant")
    public String variant;
}
