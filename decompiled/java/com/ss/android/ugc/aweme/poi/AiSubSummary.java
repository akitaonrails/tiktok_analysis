package com.ss.android.ugc.aweme.poi;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class AiSubSummary implements Serializable {

    @C09CT("bottom_desc")
    public final String bottomDesc;

    @C09CT("pic_url")
    public final UrlModel picUrl;

    @C09CT("start_ms")
    public final Long startMs;

    @C09CT("sub_summary_text")
    public final String subSummaryText;

    public AiSubSummary() {
        this(null, null, null, null);
    }

    public AiSubSummary(String str, UrlModel urlModel, Long l, String str2) {
        this.bottomDesc = str;
        this.picUrl = urlModel;
        this.startMs = l;
        this.subSummaryText = str2;
    }
}
