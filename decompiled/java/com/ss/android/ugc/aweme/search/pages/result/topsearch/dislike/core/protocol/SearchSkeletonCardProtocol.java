package com.ss.android.ugc.aweme.search.pages.result.topsearch.dislike.core.protocol;

import X.C03H5;
import X.C0PBN;
import X.C0PHI;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C642690PIt;
import X.InterfaceC1891350zJl;
import X.InterfaceC594520NTm;
import X.InterfaceC655050Pmh;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchSkeletonCardProtocol implements ISearchCardProtocol<C0PBN> {
    public final C19719912Dl LL = C13LE.LIZ(C0PBN.class);
    public final C642690PIt LLILLJJLI = new C0PHI<C0PBN>() { // from class: X.0PIt
        public final C0PHM LIZIZ = C0PHM.ONE_COLUMN;
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
    public final String Zm1() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final ReusedUIAssem<? extends C03H5> IM2() {
        return new SearchSkeletonCardAssem();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C0PHI<C0PBN> getConfig() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C13IQ<C0PBN> getDataType() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final /* bridge */ /* synthetic */ boolean Hd1(InterfaceC594520NTm interfaceC594520NTm) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC655050Pmh U42(InterfaceC594520NTm interfaceC594520NTm) {
        return (C0PBN) interfaceC594520NTm;
    }
}
