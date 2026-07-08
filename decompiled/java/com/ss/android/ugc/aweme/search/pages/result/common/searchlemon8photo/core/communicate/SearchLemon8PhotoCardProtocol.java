package com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.communicate;

import X.C03H5;
import X.C0PHI;
import X.C0PKE;
import X.C0PLT;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C656820PpY;
import X.InterfaceC1891350zJl;
import X.InterfaceC594520NTm;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.jvm.internal.AFwS241S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchLemon8PhotoCardProtocol implements ISearchCardProtocol<SearchMixFeed> {
    public final C19719912Dl LL = C13LE.LIZ(SearchMixFeed.class);
    public final C0PKE LLILLJJLI = new C0PHI<SearchMixFeed>() { // from class: X.0PKE
        public final C0PHM LIZIZ = C0PHM.ONE_COLUMN;
        public final C642240PHa LIZJ = new C642240PHa(false, false, 1, false, false, false, false, true, false, false, null, null, 15862);

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
    public final String Zm1() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final ReusedUIAssem<? extends C03H5> IM2() {
        return C656820PpY.LIZ(AFwS241S0000000_10.get$arr$(217));
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
        Aweme aweme = ((C0PLT) interfaceC594520NTm).getAweme();
        if (aweme != null && aweme.getAwemeType() == 153) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC655050Pmh U42(X.InterfaceC594520NTm r8) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r8 = (com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed) r8
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r8.getAweme()
            if (r6 == 0) goto L52
            boolean r0 = X.C1840407Is.LIZ()
            r5 = 0
            if (r0 == 0) goto L1b
            int r2 = X.C288710BTh.LIZ()
            if (r2 == 0) goto L4a
            r1 = 2
            if (r2 == r1) goto L38
            r0 = 3
            if (r2 == r0) goto L38
        L1b:
            r0 = r5
        L1c:
            X.0Pn9 r4 = new X.0Pn9
            if (r0 == 0) goto L34
            X.0PLP r3 = new X.0PLP
            int r2 = r0.intValue()
            r0 = 2131100625(0x7f0603d1, float:1.7813637E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2130773228(0x7f0104ec, float:1.7149597E38)
            r3.<init>(r0, r2, r5, r1)
            r5 = r3
        L34:
            r4.<init>(r8, r6, r5)
            return r4
        L38:
            int r0 = X.C288710BTh.LIZ()
            if (r0 != r1) goto L46
            r0 = 2131836381(0x7f113ddd, float:1.9305927E38)
        L41:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L1c
        L46:
            r0 = 2131836382(0x7f113dde, float:1.930593E38)
            goto L41
        L4a:
            r0 = 2131836380(0x7f113ddc, float:1.9305925E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L1c
        L52:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.communicate.SearchLemon8PhotoCardProtocol.U42(X.0NTm):X.0Pmh");
    }
}
