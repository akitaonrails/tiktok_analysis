package com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.topsinglecard;

import X.C03H5;
import X.C0PF8;
import X.C0PFU;
import X.C0PHI;
import X.C0PLT;
import X.C13IQ;
import X.C13LE;
import X.C2097608Jq;
import X.C642740PIy;
import X.C656300Poi;
import X.InterfaceC1891350zJl;
import X.InterfaceC594520NTm;
import X.InterfaceC655050Pmh;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchAdTopPhotoSingleCardProtocol implements ISearchCardProtocol<SearchMixFeed>, C0PF8 {
    public final C642740PIy LL = new C0PHI<SearchMixFeed>() { // from class: X.0PIy
        public final C642240PHa LIZIZ = new C642240PHa(true, false, 1, false, false, false, false, false, false, false, null, null, 15476);
        public final C642750PIz LIZJ = C642750PIz.LIZ;

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
        return new SearchAdTopPhotoSingleCardAssem();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C0PHI<SearchMixFeed> getConfig() {
        return this.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final boolean Hd1(InterfaceC594520NTm interfaceC594520NTm) {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        AwemeSearchAdModel searchAdInfo;
        Integer num;
        Integer num2;
        C0PLT c0plt = (C0PLT) interfaceC594520NTm;
        if (c0plt.getFeedType() != 109 || (aweme = c0plt.getAweme()) == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return false;
        }
        AwemeSearchAdModel searchAdInfo2 = awemeRawAd.getSearchAdInfo();
        if ((searchAdInfo2 == null || (num2 = searchAdInfo2.searchFormatType) == null || num2.intValue() != 24) && ((searchAdInfo = awemeRawAd.getSearchAdInfo()) == null || (num = searchAdInfo.searchFormatType) == null || num.intValue() != 38)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC655050Pmh U42(InterfaceC594520NTm interfaceC594520NTm) {
        return new C656300Poi(((C0PLT) interfaceC594520NTm).getAweme(), C2097608Jq.LJIIJ(new Pair("ad_card_info", "top_single_photo_card")));
    }
}
