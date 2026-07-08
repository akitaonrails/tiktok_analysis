package com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.music.protocol;

import X.C03H5;
import X.C0PF8;
import X.C0PFU;
import X.C0PHI;
import X.C0PHJ;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C15438062q;
import X.C652480PiY;
import X.C652560Pig;
import X.C652580Pii;
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
import com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.common.ui.AggregatedVideoCardAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.model.AggregatedVideo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.music.ui.MusicAggregatedVideoSubCardAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS241S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class MusicAggregatedVideoCardProtocol implements ISearchAggregatedCardProtocol, C0PF8 {
    public final C0PHJ LL = new C0PHI<SearchMixFeed>() { // from class: X.0PHJ
        public final C641210PDb LIZIZ = C641210PDb.LIZ;
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
            List<Aweme> list;
            AggregatedVideo aggregatedVideo = ((SearchMixFeed) interfaceC594520NTm).getAggregatedVideo();
            if (aggregatedVideo == null || (list = aggregatedVideo.awemes) == null) {
                return null;
            }
            return list;
        }
    };
    public final C652480PiY LLILLJJLI = new InterfaceC652790Pj3() { // from class: X.0PiY
        @Override // X.InterfaceC652790Pj3
        public final void LIZ() {
        }

        @Override // X.InterfaceC652790Pj3
        public final String LIZIZ(InterfaceC652500Pia interfaceC652500Pia, Context context) {
            AggregatedVideo aggregatedVideo = interfaceC652500Pia.LIZ().getAggregatedVideo();
            if (aggregatedVideo != null) {
                return aggregatedVideo.title;
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
    public final ReusedUIAssem IM2() {
        return new AggregatedVideoCardAssem();
    }

    @Override // X.C0PF8
    public final C0PFU LIZ() {
        return new C0PFU() { // from class: X.0PiX
            @Override // X.C0PFU
            public final Function1<Aweme, Boolean> LIZIZ() {
                return AFwS241S0000000_10.get$arr$(299);
            }

            @Override // X.C0PFU
            public final String getIdentifier() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MusicAggregatedVideoCardProtocol_");
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
        return MusicAggregatedVideoSubCardAssem.class;
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
        AggregatedVideo aggregatedVideo;
        List<Aweme> list;
        SearchMixFeed searchMixFeed = (SearchMixFeed) interfaceC594520NTm;
        if (!searchMixFeed.isMusicAggregatedVideo() || (aggregatedVideo = searchMixFeed.getAggregatedVideo()) == null || (list = aggregatedVideo.awemes) == null || list.size() < 3) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC655050Pmh U42(InterfaceC594520NTm interfaceC594520NTm) {
        return new C652560Pig((SearchMixFeed) interfaceC594520NTm);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchAggregatedCardProtocol
    public final List<InterfaceC1891350zJl> cJ1(InterfaceC652500Pia interfaceC652500Pia) {
        List<Aweme> list;
        AggregatedVideo aggregatedVideo = interfaceC652500Pia.LIZ().getAggregatedVideo();
        if (aggregatedVideo != null && (list = aggregatedVideo.awemes) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<Aweme> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C652580Pii(it2.next(), interfaceC652500Pia.LIZ()));
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }
}
