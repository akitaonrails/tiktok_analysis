package com.ss.android.ugc.aweme.translation.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.editpost.ClientTextWrapper;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;

/* JADX INFO: loaded from: classes32.dex */
public final class DescriptionTranslationResult extends BaseResponse {

    @C09CT("format")
    public Integer format;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("perf_metrics")
    public PerfMetric perfMetrics;

    @C09CT("translated_client_text")
    public ClientTextWrapper translatedClientText;

    @C09CT("translated_content")
    public String translatedContent;

    @C09CT("translation_status_code")
    public Integer translationStatusCode;

    @C09CT("variant")
    public String variant;
}
