package com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.common.protocol;

import X.C03H5;
import X.C0PF8;
import X.C0PFU;
import X.C0PHI;
import X.C0PHK;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C15438062q;
import X.C652450PiV;
import X.C652530Pid;
import X.C652540Pie;
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
import com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.common.ui.AggregatedVideoSubCardAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.model.AggregatedVideo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS241S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class AggregatedVideoCardProtocol implements ISearchAggregatedCardProtocol, C0PF8 {
    public final C0PHK LL = new C0PHI<SearchMixFeed>() { // from class: X.0PHK
        public final C641220PDc LIZIZ = C641220PDc.LIZ;
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

        /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
        @Override // X.C0PHI
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.List LIZIZ(X.InterfaceC594520NTm r6, X.C0PHT r7) {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r6 = (com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed) r6
                com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.model.AggregatedVideo r0 = r6.getAggregatedVideo()
                r4 = 10
                r3 = 1
                if (r0 == 0) goto L39
                java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r0.awemes
                if (r1 == 0) goto L39
                java.util.ArrayList r2 = new java.util.ArrayList
                int r0 = X.C15438062q.LJIJJ(r1, r4)
                r2.<init>(r0)
                java.util.Iterator r1 = r1.iterator()
            L1c:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L30
                java.lang.Object r0 = r1.next()
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
                java.lang.String r0 = r0.getAid()
                r2.add(r0)
                goto L1c
            L30:
                java.lang.String r0 = r7.LIZJ
                boolean r0 = r2.contains(r0)
                if (r0 != r3) goto L39
                goto L82
            L39:
                com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.model.AggregatedVideo r0 = r6.getAggregatedVideo()
                if (r0 == 0) goto L64
                java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r0.awemes
                if (r1 == 0) goto L64
                java.util.ArrayList r2 = new java.util.ArrayList
                int r0 = X.C15438062q.LJIJJ(r1, r4)
                r2.<init>(r0)
                java.util.Iterator r1 = r1.iterator()
            L50:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L7a
                java.lang.Object r0 = r1.next()
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
                java.lang.String r0 = r0.getAid()
                r2.add(r0)
                goto L50
            L64:
                boolean r0 = r6.isEntrance()
                if (r0 != 0) goto L82
                com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.model.AggregatedVideo r0 = r6.getAggregatedVideo()
                if (r0 == 0) goto L8b
                java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r0.awemes
                if (r1 == 0) goto L8b
                r0 = 3
                java.util.List r0 = X.C13LP.LL(r1, r0)
                return r0
            L7a:
                java.lang.String r0 = r7.LJFF
                boolean r0 = r2.contains(r0)
                if (r0 != r3) goto L64
            L82:
                com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.model.AggregatedVideo r0 = r6.getAggregatedVideo()
                if (r0 == 0) goto L8b
                java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r0.awemes
                return r0
            L8b:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C0PHK.LIZIZ(X.0NTm, X.0PHT):java.util.List");
        }
    };
    public final C652450PiV LLILLJJLI = new InterfaceC652790Pj3() { // from class: X.0PiV
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
        return new C0PFU() { // from class: X.0PiW
            @Override // X.C0PFU
            public final Function1<Aweme, Boolean> LIZIZ() {
                return AFwS241S0000000_10.get$arr$(294);
            }

            @Override // X.C0PFU
            public final String getIdentifier() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AggregatedVideoCard_");
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
        return AggregatedVideoSubCardAssem.class;
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
        if (!searchMixFeed.isAggregatedVideo() || (aggregatedVideo = searchMixFeed.getAggregatedVideo()) == null || (list = aggregatedVideo.awemes) == null || list.size() < 3) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC655050Pmh U42(InterfaceC594520NTm interfaceC594520NTm) {
        return new C652540Pie((SearchMixFeed) interfaceC594520NTm);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchAggregatedCardProtocol
    public final List<InterfaceC1891350zJl> cJ1(InterfaceC652500Pia interfaceC652500Pia) {
        List<Aweme> list;
        AggregatedVideo aggregatedVideo = interfaceC652500Pia.LIZ().getAggregatedVideo();
        if (aggregatedVideo != null && (list = aggregatedVideo.awemes) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<Aweme> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C652530Pid(it2.next(), interfaceC652500Pia.LIZ()));
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }
}
