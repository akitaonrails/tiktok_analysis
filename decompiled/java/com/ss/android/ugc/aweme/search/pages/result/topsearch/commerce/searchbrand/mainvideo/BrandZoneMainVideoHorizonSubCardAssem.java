package com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.searchbrand.mainvideo;

import X.C1DWF;
import X.C662990PzV;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedSubCardAssem;

/* JADX INFO: loaded from: classes11.dex */
public final class BrandZoneMainVideoHorizonSubCardAssem extends SearchAggregatedSubCardAssem<BrandZoneMainVideoSubRootAssem, C662990PzV> implements C1DWF {
    public BrandZoneMainVideoSubRootAssem LLJIJIL;

    @Override // X.C1DWF
    public final void N6() {
        BrandZoneMainVideoSubRootAssem brandZoneMainVideoSubRootAssem = this.LLJIJIL;
        if (brandZoneMainVideoSubRootAssem != null) {
            brandZoneMainVideoSubRootAssem.N6();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedSubCardAssem
    public final ReusedUISlotAssem R5() {
        BrandZoneMainVideoSubRootAssem brandZoneMainVideoSubRootAssem = new BrandZoneMainVideoSubRootAssem(true);
        this.LLJIJIL = brandZoneMainVideoSubRootAssem;
        return brandZoneMainVideoSubRootAssem;
    }
}
