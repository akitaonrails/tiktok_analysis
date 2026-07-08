package com.ss.android.ugc.aweme.search.ecommerce.core.ui;

import X.EnumC646330PWt;
import X.InterfaceC594520NTm;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;

/* JADX INFO: loaded from: classes11.dex */
public final class ECStoreCardLiveProtocol extends ECStoreCardProtocol {
    @Override // com.ss.android.ugc.aweme.search.ecommerce.core.ui.ECStoreCardProtocol, com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final /* bridge */ /* synthetic */ boolean Hd1(InterfaceC594520NTm interfaceC594520NTm) {
        return Hd1((SearchMixFeed) interfaceC594520NTm);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.core.ui.ECStoreCardProtocol
    /* JADX INFO: renamed from: LIZJ */
    public final boolean Hd1(SearchMixFeed searchMixFeed) {
        if (searchMixFeed.getFeedType() == 94 && searchMixFeed.shopCard != null) {
            EnumC646330PWt enumC646330PWtLIZ = ECStoreCardProtocol.LIZ(searchMixFeed);
            this.LL = enumC646330PWtLIZ;
            if (enumC646330PWtLIZ == EnumC646330PWt.LIVE) {
                return true;
            }
            return false;
        }
        return false;
    }
}
