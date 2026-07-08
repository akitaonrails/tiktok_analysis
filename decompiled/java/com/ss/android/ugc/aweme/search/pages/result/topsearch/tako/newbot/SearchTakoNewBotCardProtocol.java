package com.ss.android.ugc.aweme.search.pages.result.topsearch.tako.newbot;

import X.C03H5;
import X.C0PHI;
import X.C0PYV;
import X.C13IQ;
import X.C13LE;
import X.InterfaceC1891350zJl;
import X.InterfaceC594520NTm;
import X.InterfaceC655050Pmh;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.bot.model.TakoInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTakoNewBotCardProtocol implements ISearchCardProtocol<SearchMixFeed> {
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
        return new SearchTakoNewBotCardAssem();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C0PHI<SearchMixFeed> getConfig() {
        return new C0PHI<SearchMixFeed>() { // from class: X.0PKr
            @Override // X.C0PHI
            public final C0PHM LIZLLL() {
                return C0PHM.ALL_COLUMNS;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final boolean Hd1(InterfaceC594520NTm interfaceC594520NTm) {
        TakoInfo bot;
        SearchMixFeed searchMixFeed = (SearchMixFeed) interfaceC594520NTm;
        if (!searchMixFeed.isTako() || (bot = searchMixFeed.getBot()) == null || !bot.isNewStyle()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC655050Pmh U42(InterfaceC594520NTm interfaceC594520NTm) {
        return new C0PYV((SearchMixFeed) interfaceC594520NTm);
    }
}
