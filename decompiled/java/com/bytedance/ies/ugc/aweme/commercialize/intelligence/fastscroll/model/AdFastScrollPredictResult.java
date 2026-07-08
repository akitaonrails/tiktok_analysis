package com.bytedance.ies.ugc.aweme.commercialize.intelligence.fastscroll.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public final class AdFastScrollPredictResult implements Serializable {

    @C09CT("ad_item_id")
    public final String itemId;

    @C09CT("predict_score")
    public final double predictScore;

    @C09CT("predict_scroll_status")
    public final int scroll_status;

    public final String getItemId() {
        return this.itemId;
    }

    public final double getPredictScore() {
        return this.predictScore;
    }

    public final int getScroll_status() {
        return this.scroll_status;
    }

    public AdFastScrollPredictResult(String str, int i, double d) {
        this.itemId = str;
        this.scroll_status = i;
        this.predictScore = d;
    }
}
