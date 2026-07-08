package com.bytedance.touchpoint.api.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class SearchCoinTaskDetail implements Serializable {

    @C09CT("base_reward_score")
    public final int baseRewardScore;

    @C09CT("biz_key")
    public final String bizKey;

    @C09CT("type_in_extra_reward_score")
    public final int extraRewardScore;

    @C09CT("order")
    public final int order;

    @C09CT("search_count")
    public final int searchCount;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchCoinTaskDetail(order=");
        sbLIZ.append(this.order);
        sbLIZ.append(", searchCount=");
        sbLIZ.append(this.searchCount);
        sbLIZ.append(", baseRewardScore=");
        sbLIZ.append(this.baseRewardScore);
        sbLIZ.append(", extraRewardScore=");
        sbLIZ.append(this.extraRewardScore);
        sbLIZ.append(", bizKey=");
        sbLIZ.append(this.bizKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SearchCoinTaskDetail() {
        this(0, 0, 0, 0, "");
    }

    public SearchCoinTaskDetail(int i, int i2, int i3, int i4, String str) {
        this.order = i;
        this.searchCount = i2;
        this.baseRewardScore = i3;
        this.extraRewardScore = i4;
        this.bizKey = str;
    }
}
