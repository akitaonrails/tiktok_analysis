package com.ss.android.ugc.profile.business.ad.platform;

import X.C09CT;
import com.ss.android.ugc.aweme.commerce.LeadsGenModel;
import com.ss.android.ugc.profile.platform.business.header.advanced.AdvancedFeatureBaseData;

/* JADX INFO: loaded from: classes20.dex */
public final class GetQuoteData extends AdvancedFeatureBaseData {
    public static final int $stable = 8;

    @C09CT("leads_gen")
    public LeadsGenModel leadsGen;

    public final LeadsGenModel getLeadsGen() {
        return this.leadsGen;
    }

    public final void setLeadsGen(LeadsGenModel leadsGenModel) {
        this.leadsGen = leadsGenModel;
    }
}
