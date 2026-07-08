package com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.mixedcreativecard;

import X.C03H5;
import X.C0PF8;
import X.C0PFU;
import X.C0PHI;
import X.C0PKO;
import X.C0PLF;
import X.C0PLI;
import X.C0PLK;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C2097608Jq;
import X.InterfaceC1891350zJl;
import X.InterfaceC594520NTm;
import X.InterfaceC655050Pmh;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.search.SearchInflowMultiAdCardStruct;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS241S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchAdMixedCreativeCardProtocol implements ISearchCardProtocol<SearchMixFeed>, C0PF8 {
    public final C0PKO LL = new C0PHI<SearchMixFeed>() { // from class: X.0PKO
        public final C642240PHa LIZIZ = new C642240PHa(true, false, 1, false, false, false, false, false, false, false, null, null, 15476);
        public final C0PKP LIZJ = C0PKP.LIZ;

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

        /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        
            r2 = X.C13LP.LJJJLL(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        
            if (r2 == null) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
        
            return null;
         */
        @Override // X.C0PHI
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.List LIZIZ(X.InterfaceC594520NTm r7, X.C0PHT r8) {
            /*
                r6 = this;
                com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase r7 = (com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase) r7
                com.ss.android.ugc.aweme.feed.model.search.SearchInflowMultiAdCardStruct r0 = r7.multiAdCard
                r5 = 0
                if (r0 == 0) goto L36
                java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> r4 = r0.awemeList
                if (r4 == 0) goto L36
                java.util.Iterator r3 = r4.iterator()
            Lf:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L2c
                java.lang.Object r2 = r3.next()
                r0 = r2
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
                java.lang.String r1 = r8.LIZJ
                if (r0 == 0) goto L37
                java.lang.String r0 = r0.getAid()
            L24:
                boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                if (r0 == 0) goto Lf
                if (r2 != 0) goto L32
            L2c:
                java.lang.Object r2 = X.C13LP.LJJJLL(r4)
                if (r2 == 0) goto L36
            L32:
                java.util.List r5 = java.util.Collections.singletonList(r2)
            L36:
                return r5
            L37:
                r0 = r5
                goto L24
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C0PKO.LIZIZ(X.0NTm, X.0PHT):java.util.List");
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
        return new SearchAdMixedCreativeCardAssem(C0PLI.BIG.getValue());
    }

    @Override // X.C0PF8
    public final C0PFU LIZ() {
        return new C0PFU() { // from class: X.0PLC
            @Override // X.C0PFU
            public final Function1<Aweme, Boolean> LIZIZ() {
                return AFwS241S0000000_10.get$arr$(303);
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
        SearchMixFeed searchMixFeed = (SearchMixFeed) interfaceC594520NTm;
        if (searchMixFeed.getFeedType() == 120) {
            Integer numLIZ = C0PLK.LIZ(searchMixFeed);
            int value = C0PLI.BIG.getValue();
            if (numLIZ != null && numLIZ.intValue() == value) {
                return true;
            }
            return false;
        }
        return false;
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
        return new C0PLF(searchMixFeed, aweme, C2097608Jq.LJIIJ(new Pair("ad_card_info", "MixedCreativeBigCard")));
    }
}
