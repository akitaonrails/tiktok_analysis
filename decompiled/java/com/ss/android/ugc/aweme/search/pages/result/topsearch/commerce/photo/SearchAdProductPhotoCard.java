package com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.photo;

import X.C0PHI;
import X.C0PLT;
import X.C1010120cOQ;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C642680PIs;
import X.C655710Pnl;
import X.C656820PpY;
import X.InterfaceC1891350zJl;
import X.InterfaceC594520NTm;
import X.InterfaceC655050Pmh;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS241S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchAdProductPhotoCard implements ISearchCardProtocol<SearchMixFeed> {
    public final C19719912Dl LL = C13LE.LIZ(SearchMixFeed.class);
    public final C642680PIs LLILLJJLI = new C0PHI<SearchMixFeed>() { // from class: X.0PIs
        public final C0PHM LIZIZ = C0PHM.ONE_COLUMN;
        public final C642240PHa LIZJ = new C642240PHa(false, false, 0, false, false, false, false, false, false, false, null, null, 16375);

        @Override // X.C0PHI
        public final C0PHM LIZLLL() {
            return this.LIZIZ;
        }

        @Override // X.C0PHI
        public final C642240PHa LJFF() {
            return this.LIZJ;
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
        return C656820PpY.LIZ(AFwS241S0000000_10.get$arr$(579));
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
        C0PLT c0plt = (C0PLT) interfaceC594520NTm;
        if (c0plt.getFeedType() == 65280 && C1010120cOQ.LJIL(c0plt.getAweme())) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC655050Pmh U42(InterfaceC594520NTm interfaceC594520NTm) {
        SearchMixFeed searchMixFeed = (SearchMixFeed) interfaceC594520NTm;
        return new C655710Pnl(searchMixFeed, searchMixFeed.getAweme(), C2097608Jq.LJIIJ(new Pair("ad_card_info", "product_photo_card")));
    }
}
