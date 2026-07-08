package com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.oleproductaggregationcard;

import X.C03H5;
import X.C0PF8;
import X.C0PFU;
import X.C0PHI;
import X.C0PKV;
import X.C0PLM;
import X.C0R12;
import X.C1010120cOQ;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.InterfaceC1891350zJl;
import X.InterfaceC594520NTm;
import X.InterfaceC655050Pmh;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.SearchInflowMultiAdCardStruct;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS241S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchAdOLEProductAggregationCardProtocol implements ISearchCardProtocol<SearchMixFeed>, C0PF8 {
    public final C0PKV LL = new C0PHI<SearchMixFeed>() { // from class: X.0PKV
        public final C642240PHa LIZIZ = new C642240PHa(true, false, 1, false, false, false, false, false, false, false, null, null, 15476);
        public final C0PKU LIZJ = C0PKU.LIZ;

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

        @Override // X.C0PHI
        public final List LIZIZ(InterfaceC594520NTm interfaceC594520NTm, C0PHT c0pht) {
            List<? extends Aweme> list;
            Object objLJJJLL;
            SearchInflowMultiAdCardStruct searchInflowMultiAdCardStruct = ((SearchMixFeedBase) interfaceC594520NTm).multiAdCard;
            if (searchInflowMultiAdCardStruct != null && (list = searchInflowMultiAdCardStruct.awemeList) != null && (objLJJJLL = C13LP.LJJJLL(list)) != null) {
                return Collections.singletonList(objLJJJLL);
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
    public final ReusedUIAssem<? extends C03H5> IM2() {
        return new SearchAdOLEProductAggregationCardAssem();
    }

    @Override // X.C0PF8
    public final C0PFU LIZ() {
        return new C0PFU() { // from class: X.0PLJ
            @Override // X.C0PFU
            public final Function1<Aweme, Boolean> LIZIZ() {
                return AFwS241S0000000_10.get$arr$(306);
            }

            @Override // X.C0PFU
            public final String getIdentifier() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MixFeedFragment_");
                LifecycleOwner lifecycleOwnerLIZ = C651290Pgd.LIZ();
                sbLIZ.append(lifecycleOwnerLIZ != null ? Integer.valueOf(lifecycleOwnerLIZ.hashCode()) : null);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C0PHI<SearchMixFeed> getConfig() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final boolean Hd1(InterfaceC594520NTm interfaceC594520NTm) {
        List<? extends Aweme> list;
        SearchInflowMultiAdCardStruct searchInflowMultiAdCardStruct;
        List<? extends Aweme> list2;
        Aweme aweme;
        SearchMixFeedBase searchMixFeedBase = (SearchMixFeedBase) interfaceC594520NTm;
        SearchInflowMultiAdCardStruct searchInflowMultiAdCardStruct2 = searchMixFeedBase.multiAdCard;
        AwemeRawAd awemeRawAd = null;
        if (searchInflowMultiAdCardStruct2 != null) {
            list = searchInflowMultiAdCardStruct2.awemeList;
        } else {
            list = null;
        }
        if ((list == null || list.isEmpty()) && (searchInflowMultiAdCardStruct = searchMixFeedBase.multiAdCard) != null) {
            searchInflowMultiAdCardStruct.setAwemeList(C0R12.LIZIZ.LJJIFFI(searchInflowMultiAdCardStruct.awemeListRaw));
        }
        if (searchMixFeedBase.getFeedType() != 120) {
            return false;
        }
        SearchInflowMultiAdCardStruct searchInflowMultiAdCardStruct3 = searchMixFeedBase.multiAdCard;
        if (searchInflowMultiAdCardStruct3 != null && (list2 = searchInflowMultiAdCardStruct3.awemeList) != null && (aweme = (Aweme) C13LP.LJJJLL(list2)) != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        }
        if (!C1010120cOQ.LJJIIZI(awemeRawAd)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC655050Pmh U42(InterfaceC594520NTm interfaceC594520NTm) {
        Aweme aweme;
        List<? extends Aweme> list;
        SearchMixFeed searchMixFeed = (SearchMixFeed) interfaceC594520NTm;
        SearchInflowMultiAdCardStruct searchInflowMultiAdCardStruct = searchMixFeed.multiAdCard;
        if (searchInflowMultiAdCardStruct == null || (list = searchInflowMultiAdCardStruct.awemeList) == null || (aweme = (Aweme) C13LP.LJJJLL(list)) == null) {
            aweme = new Aweme();
        }
        return new C0PLM(aweme, searchMixFeed);
    }
}
