package com.ss.android.ugc.aweme.search.pages.result.bot.component;

import X.C03H5;
import X.C0PF8;
import X.C0PFU;
import X.C0PHI;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C15438062q;
import X.C643240PKw;
import X.C652430PiT;
import X.C652440PiU;
import X.C652590Pij;
import X.InterfaceC1891350zJl;
import X.InterfaceC594520NTm;
import X.InterfaceC652500Pia;
import X.InterfaceC652570Pih;
import X.InterfaceC652790Pj3;
import X.InterfaceC655050Pmh;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchAggregatedCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedSubCardAssem;
import com.ss.android.ugc.aweme.search.pages.result.bot.model.TakoInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS241S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTakoCardProtocol implements ISearchAggregatedCardProtocol, C0PF8 {
    public static final /* synthetic */ int LLILLL = 0;
    public final C643240PKw LL = new C0PHI<SearchMixFeed>() { // from class: X.0PKw
        public final C643230PKv LIZIZ = C643230PKv.LIZ;

        @Override // X.C0PHI
        public final C0PHM LIZLLL() {
            return C0PHM.ALL_COLUMNS;
        }

        @Override // X.C0PHI
        public final C0PBX<SearchMixFeed> LJ() {
            return this.LIZIZ;
        }

        @Override // X.C0PHI
        public final List LIZIZ(InterfaceC594520NTm interfaceC594520NTm, C0PHT c0pht) {
            SearchMixFeed searchMixFeed = (SearchMixFeed) interfaceC594520NTm;
            List<Aweme> awemeList = searchMixFeed.getBot().getAwemeList();
            if (awemeList != null) {
                for (Aweme aweme : awemeList) {
                    int i = C0QDD.LLJI;
                    C653560PkI.LIZ(searchMixFeed.getProviderDocIdStr(), aweme.getAid(), "tikbot", aweme);
                }
                return awemeList;
            }
            return null;
        }
    };
    public final C652440PiU LLILLJJLI = new InterfaceC652790Pj3() { // from class: X.0PiU
        @Override // X.InterfaceC652790Pj3
        public final void LIZ() {
        }

        @Override // X.InterfaceC652790Pj3
        public final String LIZIZ(InterfaceC652500Pia interfaceC652500Pia, Context context) {
            String strLIZJ;
            if (context == null || (strLIZJ = C1843207Ju.LIZJ()) == null || !C123100dR.LIZ(strLIZJ)) {
                return null;
            }
            return C786410Ut5.j4(context.getString(2131849780), Arrays.copyOf(new Object[]{strLIZJ}, 1));
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
    public final ReusedUIAssem IM2() {
        return new SearchTakoCardAssem();
    }

    @Override // X.C0PF8
    public final C0PFU LIZ() {
        return new C0PFU() { // from class: X.0PQB
            @Override // X.C0PFU
            public final Function1<Aweme, Boolean> LIZIZ() {
                return AFwS241S0000000_10.get$arr$(203);
            }

            @Override // X.C0PFU
            public final String getIdentifier() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SearchTakoCard_");
                LifecycleOwner lifecycleOwnerLIZ = C651290Pgd.LIZ();
                sbLIZ.append(lifecycleOwnerLIZ != null ? Integer.valueOf(lifecycleOwnerLIZ.hashCode()) : null);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C13IQ<SearchMixFeed> getDataType() {
        return C13LE.LIZ(SearchMixFeed.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchAggregatedCardProtocol
    public final Class<? extends SearchAggregatedSubCardAssem<? extends ReusedUISlotAssem<? extends C03H5>, ? extends InterfaceC1891350zJl>> Kf0() {
        return SearchTakoSubCardAssem.class;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchAggregatedCardProtocol
    public final /* bridge */ /* synthetic */ InterfaceC652570Pih cW() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C0PHI<SearchMixFeed> getConfig() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final boolean Hd1(InterfaceC594520NTm interfaceC594520NTm) {
        SearchMixFeed searchMixFeed = (SearchMixFeed) interfaceC594520NTm;
        if (!searchMixFeed.isTako()) {
            return false;
        }
        TakoInfo bot = searchMixFeed.getBot();
        if (bot != null && bot.isNewStyle()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC655050Pmh U42(InterfaceC594520NTm interfaceC594520NTm) {
        return new C652590Pij((SearchMixFeed) interfaceC594520NTm);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchAggregatedCardProtocol
    public final List<InterfaceC1891350zJl> cJ1(InterfaceC652500Pia interfaceC652500Pia) {
        List<Aweme> awemeList;
        TakoInfo bot = interfaceC652500Pia.LIZ().getBot();
        if (bot != null && (awemeList = bot.getAwemeList()) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(awemeList, 10));
            Iterator<Aweme> it2 = awemeList.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C652430PiT(interfaceC652500Pia.LIZ(), it2.next()));
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }
}
