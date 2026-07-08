package com.ss.android.ugc.aweme.ecommerce.search.general.productcard;

import X.C03H5;
import X.C0PHI;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C643090PKh;
import X.C643110PKj;
import X.InterfaceC1891350zJl;
import X.InterfaceC594520NTm;
import X.InterfaceC655050Pmh;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.ecommerce.search.general.productcard.ui.EcSearchProductCardAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.EComSearchStruct;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchProductCardProtocol implements ISearchCardProtocol<SearchMixFeedBase> {
    public final C19719912Dl LL = C13LE.LIZ(SearchMixFeedBase.class);
    public final C643090PKh LLILLJJLI = new C0PHI<SearchMixFeedBase>() { // from class: X.0PKh
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
        return new EcSearchProductCardAssem();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C0PHI<SearchMixFeedBase> getConfig() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C13IQ<SearchMixFeedBase> getDataType() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final boolean Hd1(InterfaceC594520NTm interfaceC594520NTm) {
        EComSearchStruct eComSearchStruct;
        SearchMixFeedBase searchMixFeedBase = (SearchMixFeedBase) interfaceC594520NTm;
        if (searchMixFeedBase.feedType != 96 || (eComSearchStruct = searchMixFeedBase.productStruct) == null || eComSearchStruct.type != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC655050Pmh U42(InterfaceC594520NTm interfaceC594520NTm) {
        SearchMixFeedBase searchMixFeedBase = (SearchMixFeedBase) interfaceC594520NTm;
        return new C643110PKj(searchMixFeedBase.productStruct, searchMixFeedBase.cardTitle, searchMixFeedBase.providerDocIdStr, Integer.valueOf(searchMixFeedBase.rank));
    }
}
