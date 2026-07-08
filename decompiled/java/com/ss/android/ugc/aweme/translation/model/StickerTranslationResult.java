package com.ss.android.ugc.aweme.translation.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class StickerTranslationResult extends BaseResponse {

    @C09CT("log_pb")
    public final LogPbBean lobPb;

    @C09CT("perf_metrics")
    public PerfMetric perfMetrics;

    @C09CT("translated_stickers")
    public final List<TranslatedSticker> translatedStickers;

    @C09CT("variant")
    public final String variant;
}
