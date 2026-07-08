package com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.hybrid;

import X.C03H5;
import X.C0PHI;
import X.C0PK6;
import X.C0PK8;
import X.C0PLT;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C641500PEe;
import X.InterfaceC1891350zJl;
import X.InterfaceC594520NTm;
import X.InterfaceC655050Pmh;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.ugc.aweme.commercialize.search.brandzone.data.BrandZoneCard;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.hybrid.SearchAdHybridContentAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchAdBrandZoneHybridProtocol implements ISearchCardProtocol<SearchMixFeed> {
    public WeakReference<SearchAdHybridContentAssem> LLILLJJLI;
    public final C19719912Dl LL = C13LE.LIZ(SearchMixFeed.class);
    public final C0PK6 LLILLL = new C0PHI<SearchMixFeed>() { // from class: X.0PK6
        @Override // X.C0PHI
        public final C642240PHa LJFF() {
            return new C642240PHa(true, true, 0, false, false, false, false, true, true, false, null, null, 14364);
        }

        @Override // X.C0PHI
        public final C0PHM LIZLLL() {
            return C0PHM.ALL_COLUMNS;
        }

        @Override // X.C0PHI
        public final C0PBX<SearchMixFeed> LJ() {
            return new C0PBX() { // from class: X.0PK7
                public static final C0PBZ LIZIZ(InterfaceC594520NTm interfaceC594520NTm, Aweme aweme) {
                    BrandZoneCard brandZoneCard = ((SearchMixFeed) interfaceC594520NTm).brandZoneCard;
                    if (brandZoneCard != null) {
                        LinkedHashMap<String, List<Aweme>> dynamicAwemeMaps = brandZoneCard.getDynamicAwemeMaps();
                        int i = 0;
                        if (dynamicAwemeMaps != null && !dynamicAwemeMaps.isEmpty()) {
                            Iterator<T> it2 = dynamicAwemeMaps.values().iterator();
                            while (it2.hasNext()) {
                                int i2 = i + 1;
                                int iIndexOf = ((List) it2.next()).indexOf(aweme);
                                if (iIndexOf != -1) {
                                    if (i == -1) {
                                        return null;
                                    }
                                    return new C640750PBh(i, new C640750PBh(iIndexOf, null, false, 0, 14), false, 0, 12);
                                }
                                i = i2;
                            }
                            return null;
                        }
                    }
                    return new C640750PBh(-1, null, false, 0, 14);
                }

                @Override // X.C0PBX
                public final C0PBZ LIZ(SearchMixFeed searchMixFeed, Aweme aweme, C0PHW c0phw) {
                    return LIZIZ(searchMixFeed, aweme);
                }
            };
        }

        @Override // X.C0PHI
        public final List LIZIZ(InterfaceC594520NTm interfaceC594520NTm, C0PHT c0pht) {
            LinkedHashMap<String, List<Aweme>> dynamicAwemeMaps;
            Collection<List<Aweme>> collectionValues;
            List<? extends Aweme> listLJIJJLI;
            SearchAdHybridContentAssem searchAdHybridContentAssem;
            SearchMixFeed searchMixFeed = (SearchMixFeed) interfaceC594520NTm;
            WeakReference<SearchAdHybridContentAssem> weakReference = this.LIZIZ.LLILLJJLI;
            if (weakReference == null || (searchAdHybridContentAssem = weakReference.get()) == null || (listLJIJJLI = searchAdHybridContentAssem.LLLFFI) == null) {
                BrandZoneCard brandZoneCard = searchMixFeed.brandZoneCard;
                if (brandZoneCard != null && (dynamicAwemeMaps = brandZoneCard.getDynamicAwemeMaps()) != null && (collectionValues = dynamicAwemeMaps.values()) != null) {
                    listLJIJJLI = C15438062q.LJIJJLI(collectionValues);
                    if (listLJIJJLI == null) {
                        return listLJIJJLI;
                    }
                } else {
                    return null;
                }
            }
            if (!listLJIJJLI.isEmpty()) {
                IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
                for (Aweme aweme : listLJIJJLI) {
                    if (iAwemeService != null) {
                        iAwemeService.LLILLL(aweme);
                    }
                }
                return listLJIJJLI;
            }
            return listLJIJJLI;
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
    public final ReusedUIAssem<? extends C03H5> IM2() {
        SearchAdHybridContentAssem searchAdHybridContentAssem = new SearchAdHybridContentAssem(C0PK8.BRAND_HYBRID_AD);
        this.LLILLJJLI = new WeakReference<>(searchAdHybridContentAssem);
        return searchAdHybridContentAssem;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C0PHI<SearchMixFeed> getConfig() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C13IQ<SearchMixFeed> getDataType() {
        return this.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final boolean Hd1(InterfaceC594520NTm interfaceC594520NTm) {
        if (((C0PLT) interfaceC594520NTm).getFeedType() == 116) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC655050Pmh U42(InterfaceC594520NTm interfaceC594520NTm) {
        return new C641500PEe((SearchMixFeed) interfaceC594520NTm);
    }
}
