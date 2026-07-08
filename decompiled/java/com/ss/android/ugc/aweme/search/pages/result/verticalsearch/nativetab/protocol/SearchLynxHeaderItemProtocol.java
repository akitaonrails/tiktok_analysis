package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.protocol;

import X.C03H5;
import X.C0PHI;
import X.C0PKJ;
import X.C0PVZ;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.InterfaceC1891350zJl;
import X.InterfaceC594520NTm;
import X.InterfaceC655050Pmh;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.photosearch.ui.assem.SearchFakeAssem;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.ui.cell.SearchLynxHeaderItemCell;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchLynxHeaderItemProtocol implements ISearchCardProtocol<C0PVZ> {
    public final C19719912Dl LL = C13LE.LIZ(C0PVZ.class);
    public final C0PKJ LLILLJJLI = new C0PHI<C0PVZ>() { // from class: X.0PKJ
        public final C642240PHa LIZIZ = new C642240PHa(false, false, 0, true, true, false, false, false, false, true, null, null, 13332);

        @Override // X.C0PHI
        public final C0PHM LIZLLL() {
            return C0PHM.ALL_COLUMNS;
        }

        @Override // X.C0PHI
        public final C642240PHa LJFF() {
            return this.LIZIZ;
        }

        @Override // X.C0PHI
        public final List LIZIZ(InterfaceC594520NTm interfaceC594520NTm, C0PHT c0pht) {
            return C13BV.INSTANCE;
        }
    };

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final String Zm1() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final ReusedUIAssem<? extends C03H5> IM2() {
        return new SearchFakeAssem();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final Class<? extends PowerCell<? extends InterfaceC1891350zJl>> T2() {
        return SearchLynxHeaderItemCell.class;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C0PHI<C0PVZ> getConfig() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C13IQ<C0PVZ> getDataType() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final /* bridge */ /* synthetic */ boolean Hd1(InterfaceC594520NTm interfaceC594520NTm) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC655050Pmh U42(InterfaceC594520NTm interfaceC594520NTm) {
        return (C0PVZ) interfaceC594520NTm;
    }
}
