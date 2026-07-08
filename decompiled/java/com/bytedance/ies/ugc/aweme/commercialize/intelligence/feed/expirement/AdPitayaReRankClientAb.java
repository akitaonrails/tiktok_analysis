package com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.expirement;

import X.C01GW;
import X.C2245611Cut;
import X.C452501pT;
import com.google.gson.n;

/* JADX INFO: loaded from: classes35.dex */
public final class AdPitayaReRankClientAb {
    public static final AdPitayaReRankClientAb INSTANCE = new AdPitayaReRankClientAb();
    public static final AdPitayaReRankClientAbModel DEFAULT = new AdPitayaReRankClientAbModel(false, "tiktok_showtime_ad_gap", "prepare_item_structure", "adjust_items", 15, 8, 30, 30, 2, new n(), 350, false, false, false, false, false, false, false, false, false, false, false, 6, false, false, 0, false);
    public static final C01GW value$delegate = C452501pT.LIZIZ(new C2245611Cut());

    public static final AdPitayaReRankClientAbModel get() {
        return INSTANCE.getValue();
    }

    private final AdPitayaReRankClientAbModel getValue() {
        return (AdPitayaReRankClientAbModel) value$delegate.getValue();
    }
}
