package com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.searchbrand;

import X.C03H5;
import X.C0PF8;
import X.C0PFU;
import X.C0PHI;
import X.C0PLT;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C641490PEd;
import X.C643030PKb;
import X.InterfaceC1891350zJl;
import X.InterfaceC594520NTm;
import X.InterfaceC655050Pmh;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.ugc.aweme.commercialize.search.brandzone.OfficialAccount;
import com.bytedance.ies.ugc.aweme.commercialize.search.brandzone.data.BrandZoneCard;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS241S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchAdBrandZoneProtocol implements ISearchCardProtocol<SearchMixFeed>, C0PF8 {
    public final C19719912Dl LL = C13LE.LIZ(SearchMixFeed.class);
    public final C643030PKb LLILLJJLI = new C0PHI<SearchMixFeed>() { // from class: X.0PKb
        public final C642240PHa LIZIZ = new C642240PHa(true, true, 0, false, false, false, false, true, false, false, null, null, 15380);
        public final C643040PKc LIZJ = C643040PKc.LIZ;

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
            List<Aweme> awemeList;
            ArrayList<Aweme> arrayList = new ArrayList();
            BrandZoneCard brandZoneCard = ((SearchMixFeed) interfaceC594520NTm).brandZoneCard;
            if (brandZoneCard != null) {
                List<Aweme> mainVideos = brandZoneCard.getMainVideos();
                if (mainVideos != null && !mainVideos.isEmpty()) {
                    arrayList.addAll(mainVideos);
                }
                OfficialAccount officialAccount = brandZoneCard.getOfficialAccount();
                if (officialAccount != null && (awemeList = officialAccount.getAwemeList()) != null && !awemeList.isEmpty()) {
                    arrayList.addAll(awemeList);
                }
            }
            if (!arrayList.isEmpty()) {
                IAwemeService iAwemeService = (IAwemeService) ServiceManager.get().getService(IAwemeService.class);
                for (Aweme aweme : arrayList) {
                    if (iAwemeService != null) {
                        iAwemeService.LLILLL(aweme);
                    }
                }
            }
            return arrayList;
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
        return new SearchAdBrandZoneContentAssem();
    }

    @Override // X.C0PF8
    public final C0PFU LIZ() {
        return new C0PFU() { // from class: X.0PKa
            @Override // X.C0PFU
            public final Function1<Aweme, Boolean> LIZIZ() {
                return AFwS241S0000000_10.get$arr$(307);
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
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C13IQ<SearchMixFeed> getDataType() {
        return this.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final boolean Hd1(InterfaceC594520NTm interfaceC594520NTm) {
        if (((C0PLT) interfaceC594520NTm).getFeedType() == 113) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC655050Pmh U42(InterfaceC594520NTm interfaceC594520NTm) {
        return new C641490PEd((SearchMixFeed) interfaceC594520NTm);
    }
}
