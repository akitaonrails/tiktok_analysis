package com.ss.android.ugc.aweme.search.pages.result.topsearch.mixlive.protocol;

import X.C0PHI;
import X.C0PLP;
import X.C0PLQ;
import X.C0PQ2;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C1840407Is;
import X.C642510PIb;
import X.C655000Pmc;
import X.C656820PpY;
import X.InterfaceC1891350zJl;
import X.InterfaceC594520NTm;
import X.InterfaceC655050Pmh;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveDropsRoomInfo;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SingleLive;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS241S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMixLiveCardProtocol implements ISearchCardProtocol<SearchMixFeed> {
    public final C642510PIb LL = new C0PHI<SearchMixFeed>() { // from class: X.0PIb
        public final C642240PHa LIZIZ;
        public final C642520PIc LIZJ;

        {
            this.LIZIZ = new C642240PHa(true, true, !C07MQ.LIZ ? 0 : 1, false, false, true, true, true, false, false, null, null, 15380);
            this.LIZJ = C642520PIc.LIZ;
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
        return C656820PpY.LIZ(AFwS241S0000000_10.get$arr$(530));
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C0PHI<SearchMixFeed> getConfig() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final boolean Hd1(InterfaceC594520NTm interfaceC594520NTm) {
        Product product;
        Aweme aweme;
        List<Product> productsInfo;
        SearchMixFeedBase searchMixFeedBase = (SearchMixFeedBase) interfaceC594520NTm;
        SingleLive singleLive = searchMixFeedBase.singleLive;
        Aweme aweme2 = null;
        if (singleLive != null && (aweme = singleLive.aweme) != null && (productsInfo = aweme.getProductsInfo()) != null) {
            product = (Product) C13LP.LJJJLL(productsInfo);
        } else {
            product = null;
        }
        SingleLive singleLive2 = searchMixFeedBase.singleLive;
        if (singleLive2 != null) {
            aweme2 = singleLive2.aweme;
        }
        if (searchMixFeedBase.getFeedType() != 62 || searchMixFeedBase.singleLive == null || aweme2 == null || aweme2.isAd() || ((IEcomGeneralSearchService) ServiceManager.get().getService(IEcomGeneralSearchService.class)).LJIIL(product)) {
            return false;
        }
        C0PQ2.LIZ.getClass();
        if (C0PQ2.LIZ(aweme2).LIZ == C0PLQ.CARD_BOTTOM) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC655050Pmh U42(InterfaceC594520NTm interfaceC594520NTm) {
        Aweme aweme;
        LiveRoomStruct newLiveRoomDataExt;
        LiveDropsRoomInfo liveDropsRoomInfo;
        SearchMixFeed searchMixFeed = (SearchMixFeed) interfaceC594520NTm;
        SingleLive singleLive = searchMixFeed.singleLive;
        C0PLP c0plp = null;
        if (singleLive != null && (aweme = singleLive.aweme) != null) {
            if (C1840407Is.LIZ() && (newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme)) != null && (liveDropsRoomInfo = newLiveRoomDataExt.dropsRoomInfo) != null && liveDropsRoomInfo.showDropsTag) {
                c0plp = new C0PLP(R.raw.icon_game_controller_fill, 2131852525, Integer.valueOf(R.attr.a1k), Integer.valueOf(R.attr.a1j));
            }
            return new C655000Pmc(searchMixFeed, aweme, c0plp);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
