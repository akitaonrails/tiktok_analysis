package com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.mixlive;

import X.C0PHI;
import X.C0PHO;
import X.C13IQ;
import X.C13LE;
import X.C655000Pmc;
import X.C656820PpY;
import X.InterfaceC1891350zJl;
import X.InterfaceC594520NTm;
import X.InterfaceC655050Pmh;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SingleLive;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS241S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMixLiveAdCardProtocol implements ISearchCardProtocol<SearchMixFeed> {
    public final C0PHO LL = new C0PHI<SearchMixFeed>() { // from class: X.0PHO
        public final C642240PHa LIZIZ;
        public final C0PHP LIZJ;

        {
            this.LIZIZ = new C642240PHa(true, true, (C1840607Iu.LIZ() || C07MQ.LIZ) ? 1 : 0, false, false, false, false, true, false, false, null, null, 15380);
            this.LIZJ = C0PHP.LIZ;
        }

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

        @Override // X.C0PHI
        public final List LIZIZ(InterfaceC594520NTm interfaceC594520NTm, C0PHT c0pht) {
            Aweme aweme;
            SingleLive singleLive = ((SearchMixFeedBase) interfaceC594520NTm).singleLive;
            if (singleLive != null && (aweme = singleLive.aweme) != null) {
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
    public final C13IQ<SearchMixFeed> getDataType() {
        return C13LE.LIZ(SearchMixFeed.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final ReusedUIAssem IM2() {
        return C656820PpY.LIZ(AFwS241S0000000_10.get$arr$(546));
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C0PHI<SearchMixFeed> getConfig() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final boolean Hd1(InterfaceC594520NTm interfaceC594520NTm) {
        SingleLive singleLive;
        Aweme aweme;
        SearchMixFeedBase searchMixFeedBase = (SearchMixFeedBase) interfaceC594520NTm;
        if (searchMixFeedBase.getFeedType() != 62 || (singleLive = searchMixFeedBase.singleLive) == null || (aweme = singleLive.aweme) == null || !aweme.isAd()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC655050Pmh U42(InterfaceC594520NTm interfaceC594520NTm) {
        Aweme aweme;
        SearchMixFeed searchMixFeed = (SearchMixFeed) interfaceC594520NTm;
        SingleLive singleLive = searchMixFeed.singleLive;
        if (singleLive != null && (aweme = singleLive.aweme) != null) {
            return new C655000Pmc(searchMixFeed, aweme, null);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
