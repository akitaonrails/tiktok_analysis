package com.ss.android.ugc.aweme.feed.model.commercialize;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class CommerceRerankInfo implements Serializable {

    @C09CT("item_param_for_pitaya")
    public String itemParamForPitaya;

    @C09CT("original_item_gap")
    public Long originalItemGap = -1L;

    public final String getItemParamForPitaya() {
        return this.itemParamForPitaya;
    }

    public final Long getOriginalItemGap() {
        return this.originalItemGap;
    }

    public final void setItemParamForPitaya(String str) {
        this.itemParamForPitaya = str;
    }

    public final void setOriginalItemGap(Long l) {
        this.originalItemGap = l;
    }
}
