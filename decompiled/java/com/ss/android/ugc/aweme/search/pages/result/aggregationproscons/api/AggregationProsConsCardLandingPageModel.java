package com.ss.android.ugc.aweme.search.pages.result.aggregationproscons.api;

import X.C09CT;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.MultiVideo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AggregationProsConsCardLandingPageModel {

    @C09CT("multi_summary_video_struct")
    public final List<MultiVideo> multiSummaryVideoStruct;

    public AggregationProsConsCardLandingPageModel() {
        this(null);
    }

    public AggregationProsConsCardLandingPageModel(List<MultiVideo> list) {
        this.multiSummaryVideoStruct = list;
    }
}
