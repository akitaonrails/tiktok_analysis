package com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.hybrid;

import X.C03H5;
import X.C0PHI;
import X.C0PK8;
import X.C0PKB;
import X.C0PLT;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C641500PEe;
import X.InterfaceC1891350zJl;
import X.InterfaceC594520NTm;
import X.InterfaceC650540PfQ;
import X.InterfaceC655050Pmh;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchSingleAdHybridProtocol implements ISearchCardProtocol<SearchMixFeed>, InterfaceC650540PfQ {
    public final C19719912Dl LL = C13LE.LIZ(SearchMixFeed.class);
    public final C0PKB LLILLJJLI = new C0PHI<SearchMixFeed>() { // from class: X.0PKB
        public final C642240PHa LIZIZ = new C642240PHa(true, true, 0, false, false, false, false, true, false, false, null, null, 15380);
        public final C0PKA LIZJ = C0PKA.LIZ;

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
            AwemeRawAd awemeRawAd;
            AwemeSearchAdModel searchAdInfo;
            C0PLT c0plt = (C0PLT) interfaceC594520NTm;
            Aweme aweme = c0plt.getAweme();
            if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && (searchAdInfo = awemeRawAd.getSearchAdInfo()) != null && Intrinsics.LJFF(searchAdInfo.canShowInDetailPage, Boolean.TRUE)) {
                return Collections.singletonList(c0plt.getAweme());
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

    @Override // X.InterfaceC650540PfQ
    public final boolean mm() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final ReusedUIAssem<? extends C03H5> IM2() {
        return new SearchAdHybridContentAssem(C0PK8.SINGLE_AD);
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
        if (((C0PLT) interfaceC594520NTm).getFeedType() == 115) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC655050Pmh U42(InterfaceC594520NTm interfaceC594520NTm) {
        return new C641500PEe((SearchMixFeed) interfaceC594520NTm);
    }
}
