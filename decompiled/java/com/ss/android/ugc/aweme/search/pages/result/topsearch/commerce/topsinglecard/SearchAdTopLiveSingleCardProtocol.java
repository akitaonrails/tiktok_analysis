package com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.topsinglecard;

import X.C03H5;
import X.C0PF8;
import X.C0PFU;
import X.C0PHI;
import X.C0PKL;
import X.C0PLT;
import X.C1010120cOQ;
import X.C13IQ;
import X.C13LE;
import X.C654810PmJ;
import X.InterfaceC1891350zJl;
import X.InterfaceC594520NTm;
import X.InterfaceC655050Pmh;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchAdTopLiveSingleCardProtocol implements ISearchCardProtocol<SearchMixFeed>, C0PF8 {
    public final C0PKL LL = new C0PHI<SearchMixFeed>() { // from class: X.0PKL
        public final C642240PHa LIZIZ = new C642240PHa(true, false, 1, false, false, false, false, false, false, false, null, null, 15476);
        public final C0PKM LIZJ = C0PKM.LIZ;

        @Override // X.C0PHI
        public final C0PHM LIZLLL() {
            return C0PHM.ALL_COLUMNS;
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

    @Override // X.C0PF8
    public final C0PFU LIZ() {
        return null;
    }

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
        return new SearchAdTopLiveSingleCardAssem();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C0PHI<SearchMixFeed> getConfig() {
        return this.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final boolean Hd1(InterfaceC594520NTm interfaceC594520NTm) {
        AwemeRawAd awemeRawAd;
        C0PLT c0plt = (C0PLT) interfaceC594520NTm;
        if (c0plt.getFeedType() == 109) {
            Aweme aweme = c0plt.getAweme();
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            if (C1010120cOQ.LJJIJIIJI(awemeRawAd)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC655050Pmh U42(InterfaceC594520NTm interfaceC594520NTm) {
        SearchMixFeed searchMixFeed = (SearchMixFeed) interfaceC594520NTm;
        Aweme aweme = searchMixFeed.getAweme();
        if (aweme != null) {
            return new C654810PmJ(aweme, searchMixFeed);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
