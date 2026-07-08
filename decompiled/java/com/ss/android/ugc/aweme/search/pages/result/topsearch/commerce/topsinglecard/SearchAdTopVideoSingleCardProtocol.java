package com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.topsinglecard;

import X.C03H5;
import X.C0PF8;
import X.C0PFU;
import X.C0PHI;
import X.C0PLT;
import X.C1010120cOQ;
import X.C13IQ;
import X.C13LE;
import X.C2097608Jq;
import X.C642650PIp;
import X.C656300Poi;
import X.InterfaceC1891350zJl;
import X.InterfaceC594520NTm;
import X.InterfaceC655050Pmh;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS241S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchAdTopVideoSingleCardProtocol implements ISearchCardProtocol<SearchMixFeed>, C0PF8 {
    public final C642650PIp LL = new C0PHI<SearchMixFeed>() { // from class: X.0PIp
        public final C642240PHa LIZIZ = new C642240PHa(true, false, C1840607Iu.LIZ() ? 1 : 0, false, false, false, false, false, false, false, null, null, 15476);
        public final C642660PIq LIZJ = C642660PIq.LIZ;

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
        return new SearchAdTopVideoSingleCardAssem();
    }

    @Override // X.C0PF8
    public final C0PFU LIZ() {
        return new C0PFU() { // from class: X.0PIw
            @Override // X.C0PFU
            public final Function1<Aweme, Boolean> LIZIZ() {
                return AFwS241S0000000_10.get$arr$(312);
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
            if (C1010120cOQ.LJJIJIIJIL(awemeRawAd)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC655050Pmh U42(InterfaceC594520NTm interfaceC594520NTm) {
        return new C656300Poi(((C0PLT) interfaceC594520NTm).getAweme(), C2097608Jq.LJIIJ(new Pair("ad_card_info", "top_single_video_card")));
    }
}
