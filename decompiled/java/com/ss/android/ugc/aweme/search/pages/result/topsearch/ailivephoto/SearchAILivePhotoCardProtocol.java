package com.ss.android.ugc.aweme.search.pages.result.topsearch.ailivephoto;

import X.C01GW;
import X.C03H5;
import X.C0PHI;
import X.C0PLT;
import X.C13IQ;
import X.C13LE;
import X.C452501pT;
import X.C663020PzY;
import X.InterfaceC1891350zJl;
import X.InterfaceC594520NTm;
import X.InterfaceC655050Pmh;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IAILiveService;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchAILivePhotoCardProtocol implements ISearchCardProtocol<SearchMixFeed> {
    public final C01GW LL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(299));

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
        return new SearchAILivePhotoCardAssem();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C0PHI<SearchMixFeed> getConfig() {
        return (C0PHI) this.LL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final boolean Hd1(InterfaceC594520NTm interfaceC594520NTm) {
        IAILiveService aILiveService;
        C0PLT c0plt = (C0PLT) interfaceC594520NTm;
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService != null) {
            aILiveService = iExternalService.getAILiveService();
        } else {
            aILiveService = null;
        }
        if (aILiveService == null || c0plt.getFeedType() != 86 || !aILiveService.enableStoryAILiveSearchBanner()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final InterfaceC655050Pmh U42(InterfaceC594520NTm interfaceC594520NTm) {
        return new C663020PzY((SearchMixFeed) interfaceC594520NTm);
    }
}
