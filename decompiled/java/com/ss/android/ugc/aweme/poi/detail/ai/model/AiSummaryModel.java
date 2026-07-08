package com.ss.android.ugc.aweme.poi.detail.ai.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AiSummaryModel implements Serializable {

    @C09CT("ai_summary_dimensions")
    public final List<AiSummaryDimension> aiSummaryDimensions;

    public AiSummaryModel() {
        this(null);
    }

    public AiSummaryModel(List<AiSummaryDimension> list) {
        this.aiSummaryDimensions = list;
    }
}
