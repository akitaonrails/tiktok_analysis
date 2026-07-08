package com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.photo;

import X.C0PHI;
import X.C0PLT;
import X.C1010120cOQ;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C642630PIn;
import X.C655710Pnl;
import X.C656820PpY;
import X.InterfaceC1891350zJl;
import X.InterfaceC594520NTm;
import X.InterfaceC655050Pmh;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS241S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchCarouselAdsCardProtocol implements ISearchCardProtocol<SearchMixFeed> {
    public final C19719912Dl LL = C13LE.LIZ(SearchMixFeed.class);
    public final C642630PIn LLILLJJLI = new C0PHI<SearchMixFeed>() { // from class: X.0PIn
        public final C642240PHa LIZIZ = new C642240PHa(true, true, C1840607Iu.LIZ() ? 1 : 0, false, false, false, false, true, false, false, null, null, 15380);
        public final C642640PIo LIZJ = C642640PIo.LIZ;

        @Override // X.C0PHI
        public final C0PHM LIZLLL() {
            return C0PHM.ONE_COLUMN;
        }

        @Override // X.C0PHI
        public final C0PBX<SearchMixFeed> LJ() {
            return this.LIZJ;
        }

        @Override // X.C0PHI
        public final C642240PHa LJFF() {
            return this.LIZIZ;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.C0PHI
        public final List LIZIZ(InterfaceC594520NTm interfaceC594520NTm, C0PHT c0pht) {
            Aweme aweme = ((C0PLT) interfaceC594520NTm).getAweme();
            if (aweme != null) {
                return Collections.singletonList(aweme);
            }
            return null;
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
    public final ReusedUIAssem IM2() {
        return C656820PpY.LIZ(AFwS241S0000000_10.get$arr$(569));
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C0PHI<SearchMixFeed> getConfig() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C13IQ<SearchMixFeed> getDataType() {
        return this.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final boolean Hd1(InterfaceC594520NTm interfaceC594520NTm) {
        Aweme aweme;
        C0PLT c0plt = (C0PLT) interfaceC594520NTm;
        if (c0plt.getFeedType() != 65280 || (aweme = c0plt.getAweme()) == null || !C1010120cOQ.LJJIFFI(aweme)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC655050Pmh U42(InterfaceC594520NTm interfaceC594520NTm) {
        SearchMixFeed searchMixFeed = (SearchMixFeed) interfaceC594520NTm;
        return new C655710Pnl(searchMixFeed, searchMixFeed.getAweme(), C2097608Jq.LJIIJ(new Pair("ad_card_info", "carousel_ads")));
    }
}
