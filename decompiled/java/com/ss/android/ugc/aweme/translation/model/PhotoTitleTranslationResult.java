package com.ss.android.ugc.aweme.translation.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;

/* JADX INFO: loaded from: classes32.dex */
public final class PhotoTitleTranslationResult extends BaseResponse {

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("perf_metrics")
    public PerfMetric perfMetrics;

    @C09CT("translated_content")
    public final String translatedContent;

    @C09CT("translation_status_code")
    public final int translationStatusCode;

    @C09CT("variant")
    public final String variant;
}
