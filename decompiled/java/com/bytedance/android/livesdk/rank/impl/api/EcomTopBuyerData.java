package com.bytedance.android.livesdk.rank.impl.api;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.EcomRankInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class EcomTopBuyerData {

    @C09CT("anchor_show_contribution")
    public boolean anchorShowContribution;

    @C09CT("anonymous")
    public long anonymous;

    @C09CT("can_show_rank")
    public boolean canShowRank;

    @C09CT("currency")
    public String currency;

    @C09CT("deprecated")
    public boolean deprecated;

    @C09CT("display_config")
    public EcomRankInfo.DisplayConfig displayConfig;

    @C09CT("preview_count")
    public long previewCount;

    @C09CT("ranks")
    public List<EcomRankInfo.Rank> ranks;

    @C09CT("rule_url")
    public String ruleUrl;

    @C09CT("self_info")
    public EcomRankInfo.Rank selfInfo;

    @C09CT("total")
    public long total;

    public EcomTopBuyerData() {
        this(new ArrayList(), null, "", null, 0L, false, "", false, false, 0L, 0L);
    }

    public EcomTopBuyerData(List<EcomRankInfo.Rank> list, EcomRankInfo.Rank rank, String str, EcomRankInfo.DisplayConfig displayConfig, long j, boolean z, String str2, boolean z2, boolean z3, long j2, long j3) {
        this.ranks = list;
        this.selfInfo = rank;
        this.ruleUrl = str;
        this.displayConfig = displayConfig;
        this.anonymous = j;
        this.canShowRank = z;
        this.currency = str2;
        this.anchorShowContribution = z2;
        this.deprecated = z3;
        this.total = j2;
        this.previewCount = j3;
    }
}
