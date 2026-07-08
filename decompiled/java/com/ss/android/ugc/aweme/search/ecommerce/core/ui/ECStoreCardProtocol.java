package com.ss.android.ugc.aweme.search.ecommerce.core.ui;

import X.C0PHI;
import X.C1202104n5;
import X.C13IQ;
import X.C13LE;
import X.EnumC646330PWt;
import X.InterfaceC1891350zJl;
import X.InterfaceC594520NTm;
import X.InterfaceC655050Pmh;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.ecommerce.model.EComShopCardStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ECStoreCardProtocol implements ISearchCardProtocol<SearchMixFeed> {
    public EnumC646330PWt LL = EnumC646330PWt.DEFAULT;

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
    public final C0PHI<SearchMixFeed> getConfig() {
        return new C0PHI<SearchMixFeed>() { // from class: X.0PKu
            public final C643210PKt LIZIZ = C643210PKt.LIZ;
            public final C642240PHa LIZJ = new C642240PHa(true, false, 0, true, true, false, false, false, false, false, null, null, 15380);

            @Override // X.C0PHI
            public final C0PHM LIZLLL() {
                return C0PHM.ALL_COLUMNS;
            }

            @Override // X.C0PHI
            public final C0PBX<SearchMixFeed> LJ() {
                return this.LIZIZ;
            }

            @Override // X.C0PHI
            public final C642240PHa LJFF() {
                return this.LIZJ;
            }

            @Override // X.C0PHI
            public final List LIZIZ(InterfaceC594520NTm interfaceC594520NTm, C0PHT c0pht) {
                Aweme aweme;
                EComShopCardStruct eComShopCardStruct = ((SearchMixFeedBase) interfaceC594520NTm).shopCard;
                if (eComShopCardStruct != null && (aweme = eComShopCardStruct.liveEntity) != null) {
                    return Collections.singletonList(aweme);
                }
                return null;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final ReusedUIAssem IM2() {
        return C1202104n5.LIZ().LJJIIJZLJL(this.LL);
    }

    public static EnumC646330PWt LIZ(SearchMixFeed searchMixFeed) {
        Integer num;
        Integer num2;
        EComShopCardStruct eComShopCardStruct = searchMixFeed.shopCard;
        if (eComShopCardStruct != null) {
            if (eComShopCardStruct.liveEntity != null) {
                if (eComShopCardStruct != null && (num2 = eComShopCardStruct.shopCardLiveStyle) != null) {
                    if (num2.intValue() == 1) {
                        return EnumC646330PWt.LIVE;
                    }
                    if (num2.intValue() == 2) {
                        return EnumC646330PWt.LIVE_V1;
                    }
                    if (num2.intValue() == 3) {
                        return EnumC646330PWt.LIVE_V2;
                    }
                    if (num2.intValue() == 4) {
                        return EnumC646330PWt.LIVE_V3;
                    }
                }
                return EnumC646330PWt.LIVE;
            }
            if (eComShopCardStruct != null && (num = eComShopCardStruct.shopCardCommonStyle) != null && num.intValue() == 2) {
                return EnumC646330PWt.NO_LIVE_NEW;
            }
        }
        return EnumC646330PWt.NO_LIVE;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public boolean Hd1(SearchMixFeed searchMixFeed) {
        if (searchMixFeed.getFeedType() == 94 && searchMixFeed.shopCard != null) {
            EnumC646330PWt enumC646330PWtLIZ = LIZ(searchMixFeed);
            this.LL = enumC646330PWtLIZ;
            if (enumC646330PWtLIZ == EnumC646330PWt.DEFAULT) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC655050Pmh U42(InterfaceC594520NTm interfaceC594520NTm) {
        Aweme aweme;
        SearchMixFeed searchMixFeed = (SearchMixFeed) interfaceC594520NTm;
        EComShopCardStruct eComShopCardStruct = searchMixFeed.shopCard;
        if (eComShopCardStruct != null) {
            aweme = eComShopCardStruct.liveEntity;
        } else {
            aweme = null;
        }
        IEcomGeneralSearchService iEcomGeneralSearchServiceLIZ = C1202104n5.LIZ();
        if (aweme == null) {
            aweme = new Aweme();
        }
        return iEcomGeneralSearchServiceLIZ.LJJIJIIJI(searchMixFeed, aweme, LIZ(searchMixFeed));
    }
}
