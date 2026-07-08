package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GIPRankRewardsSettings {

    @C09CT("indicator")
    public GIPRankPointConfig indicator;

    @C09CT("price_settings")
    public List<RankPriceConfig> priceSettings = new ArrayList();

    @C09CT("rank_requirements")
    public List<GIPRankRequirement> rankRequirements = new ArrayList();
}
