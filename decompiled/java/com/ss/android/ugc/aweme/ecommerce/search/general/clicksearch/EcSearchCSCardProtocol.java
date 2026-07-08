package com.ss.android.ugc.aweme.ecommerce.search.general.clicksearch;

import X.C03H5;
import X.C0PHI;
import X.C0PKX;
import X.C0PQI;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.InterfaceC1891350zJl;
import X.InterfaceC594520NTm;
import X.InterfaceC655050Pmh;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.ecommerce.search.general.clicksearch.ui.EcSearchCSCardAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchCSCardProtocol implements ISearchCardProtocol<C0PQI> {
    public final C19719912Dl LL = C13LE.LIZ(C0PQI.class);
    public final C0PKX LLILLJJLI = new C0PHI<C0PQI>() { // from class: X.0PKX
        @Override // X.C0PHI
        public final C0PHM LIZLLL() {
            return C0PHM.ALL_COLUMNS;
        }

        @Override // X.C0PHI
        public final List LIZIZ(InterfaceC594520NTm interfaceC594520NTm, C0PHT c0pht) {
            return C13BV.INSTANCE;
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
        return new EcSearchCSCardAssem();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C0PHI<C0PQI> getConfig() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C13IQ<C0PQI> getDataType() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final /* bridge */ /* synthetic */ boolean Hd1(InterfaceC594520NTm interfaceC594520NTm) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC655050Pmh U42(InterfaceC594520NTm interfaceC594520NTm) {
        return (C0PQI) interfaceC594520NTm;
    }
}
