package com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.searchbrand.account;

import X.C1DWF;
import X.C663000PzW;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedSubCardAssem;

/* JADX INFO: loaded from: classes11.dex */
public final class BrandZoneAccountVideoCardWrapperAssem extends SearchAggregatedSubCardAssem<BrandZoneAccountVideoSingleRootAssem, C663000PzW> implements C1DWF {
    public BrandZoneAccountVideoSingleRootAssem LLJIJIL;

    @Override // X.C1DWF
    public final void N6() {
        BrandZoneAccountVideoSingleRootAssem brandZoneAccountVideoSingleRootAssem = this.LLJIJIL;
        if (brandZoneAccountVideoSingleRootAssem != null) {
            brandZoneAccountVideoSingleRootAssem.N6();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedSubCardAssem
    public final ReusedUISlotAssem R5() {
        BrandZoneAccountVideoSingleRootAssem brandZoneAccountVideoSingleRootAssem = new BrandZoneAccountVideoSingleRootAssem();
        this.LLJIJIL = brandZoneAccountVideoSingleRootAssem;
        return brandZoneAccountVideoSingleRootAssem;
    }
}
