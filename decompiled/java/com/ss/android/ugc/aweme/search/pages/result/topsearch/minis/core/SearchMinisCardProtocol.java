package com.ss.android.ugc.aweme.search.pages.result.topsearch.minis.core;

import X.C03H5;
import X.C0PHI;
import X.C0PKG;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C645890PVb;
import X.InterfaceC1891350zJl;
import X.InterfaceC594520NTm;
import X.InterfaceC655050Pmh;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.minis.ui.SearchMinisCardAssem;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMinisCardProtocol implements ISearchCardProtocol<SearchMixFeed> {
    public C645890PVb LL;
    public final C19719912Dl LLILLJJLI = C13LE.LIZ(SearchMixFeed.class);
    public final C0PKG LLILLL = new C0PHI<SearchMixFeed>() { // from class: X.0PKG
        public final C0PHM LIZIZ = C0PHM.ALL_COLUMNS;
        public final C642240PHa LIZJ = new C642240PHa(false, false, 0, false, false, false, false, false, false, false, null, null, 16374);

        @Override // X.C0PHI
        public final C0PHM LIZLLL() {
            return this.LIZIZ;
        }

        @Override // X.C0PHI
        public final C642240PHa LJFF() {
            return this.LIZJ;
        }
    };

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final Class<? extends PowerCell<? extends InterfaceC1891350zJl>> T2() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final ReusedUIAssem<? extends C03H5> IM2() {
        return new SearchMinisCardAssem();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0012  */
    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String Zm1() {
        /*
            r3 = this;
            X.0PVb r2 = r3.LL
            r1 = 0
            if (r2 == 0) goto L1d
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r0 = r2.LL
            if (r0 == 0) goto L12
            com.ss.android.ugc.aweme.discover.model.SearchMinis r0 = r0.minis
            if (r0 == 0) goto L10
            java.lang.String r0 = "mini_drama"
            return r0
        L10:
            if (r2 == 0) goto L1d
        L12:
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r0 = r2.LL
            if (r0 == 0) goto L1d
            com.ss.android.ugc.aweme.discover.model.SearchMinis r0 = r0.miniGame
            if (r0 == 0) goto L1d
            java.lang.String r0 = "mini_game"
            return r0
        L1d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.topsearch.minis.core.SearchMinisCardProtocol.Zm1():java.lang.String");
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C0PHI<SearchMixFeed> getConfig() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C13IQ<SearchMixFeed> getDataType() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final boolean Hd1(InterfaceC594520NTm interfaceC594520NTm) {
        SearchMixFeed searchMixFeed = (SearchMixFeed) interfaceC594520NTm;
        if (searchMixFeed.getFeedType() == 84 || searchMixFeed.getFeedType() == 85) {
            if (searchMixFeed.minis != null || searchMixFeed.miniGame != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC655050Pmh U42(InterfaceC594520NTm interfaceC594520NTm) {
        C645890PVb c645890PVb = new C645890PVb((SearchMixFeed) interfaceC594520NTm);
        this.LL = c645890PVb;
        return c645890PVb;
    }
}
