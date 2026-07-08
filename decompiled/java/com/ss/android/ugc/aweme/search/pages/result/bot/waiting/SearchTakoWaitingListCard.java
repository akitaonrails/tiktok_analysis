package com.ss.android.ugc.aweme.search.pages.result.bot.waiting;

import X.C03H5;
import X.C0PHI;
import X.C0PKH;
import X.C0PLT;
import X.C13IQ;
import X.C13LE;
import X.C643120PKk;
import X.InterfaceC1891350zJl;
import X.InterfaceC594520NTm;
import X.InterfaceC655050Pmh;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.TakoWaitingListCard;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTakoWaitingListCard implements ISearchCardProtocol<SearchMixFeed> {
    public final C0PKH LL = new C0PHI<SearchMixFeed>() { // from class: X.0PKH
        public final C0PHM LIZIZ = C0PHM.ALL_COLUMNS;

        @Override // X.C0PHI
        public final C0PHM LIZLLL() {
            return this.LIZIZ;
        }
    };

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final Class<? extends PowerCell<? extends InterfaceC1891350zJl>> T2() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final String Zm1() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C13IQ<SearchMixFeed> getDataType() {
        return C13LE.LIZ(SearchMixFeed.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final ReusedUIAssem<? extends C03H5> IM2() {
        return new SearchTakoWaitingListAssem();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C0PHI<SearchMixFeed> getConfig() {
        return this.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final boolean Hd1(InterfaceC594520NTm interfaceC594520NTm) {
        if (((C0PLT) interfaceC594520NTm).getFeedType() == 95) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC655050Pmh U42(InterfaceC594520NTm interfaceC594520NTm) {
        SearchMixFeed searchMixFeed = (SearchMixFeed) interfaceC594520NTm;
        TakoWaitingListCard takoWaitingListCard = searchMixFeed.takoWaitingListCard;
        String str = takoWaitingListCard.takoUserAmount;
        String str2 = takoWaitingListCard.imageUrl;
        String providerDocIdStr = searchMixFeed.getProviderDocIdStr();
        if (providerDocIdStr == null) {
            providerDocIdStr = "";
        }
        return new C643120PKk(str, str2, providerDocIdStr);
    }
}
