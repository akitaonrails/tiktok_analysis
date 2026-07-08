package com.ss.android.ugc.aweme.search.arch.v2.biz.rs;

import X.C03H5;
import X.C0PHI;
import X.C0PJ1;
import X.C0PJ4;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C645900PVc;
import X.InterfaceC1891350zJl;
import X.InterfaceC594520NTm;
import X.InterfaceC655050Pmh;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.RelatedWord;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchRSCardSingleProtocol implements ISearchCardProtocol<SearchMixFeed> {
    public final C19719912Dl LL = C13LE.LIZ(SearchMixFeed.class);
    public final C0PJ1 LLILLJJLI = new C0PHI<SearchMixFeed>() { // from class: X.0PJ1
        public final C642240PHa LIZIZ = new C642240PHa(false, false, 0, true, true, false, false, false, false, true, null, null, 13332);

        @Override // X.C0PHI
        public final C0PHM LIZLLL() {
            return C0PHM.ONE_COLUMN;
        }

        @Override // X.C0PHI
        public final C642240PHa LJFF() {
            return this.LIZIZ;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.C0PHI
        public final List LIZIZ(InterfaceC594520NTm interfaceC594520NTm, C0PHT c0pht) {
            List listSingletonList;
            Aweme aweme = ((C0PLT) interfaceC594520NTm).getAweme();
            if (aweme == null || (listSingletonList = Collections.singletonList(aweme)) == null) {
                return C13BV.INSTANCE;
            }
            return listSingletonList;
        }
    };

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final String Zm1() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final ReusedUIAssem<? extends C03H5> IM2() {
        return new SearchRSCardAssem();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final Class<? extends PowerCell<? extends InterfaceC1891350zJl>> T2() {
        return SearchRSCardCell.class;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C0PHI<SearchMixFeed> getConfig() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C13IQ<SearchMixFeed> getDataType() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final boolean Hd1(InterfaceC594520NTm interfaceC594520NTm) {
        List<RelatedWord> relatedWordList;
        SearchMixFeed searchMixFeed = (SearchMixFeed) interfaceC594520NTm;
        if (searchMixFeed.getFeedType() != 37 || !C0PJ4.LIZ() || searchMixFeed.isQrecVirtualEnable() || (relatedWordList = searchMixFeed.getRelatedWordList()) == null || relatedWordList.size() != 6) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC655050Pmh U42(InterfaceC594520NTm interfaceC594520NTm) {
        return new C645900PVc((SearchMixFeed) interfaceC594520NTm);
    }
}
