package com.ss.android.ugc.aweme.search.pages.result.common.lynxwithvideo.protocol;

import X.C0PF8;
import X.C0PFU;
import X.C0PHI;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C643000PJy;
import X.InterfaceC594520NTm;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.legacy.SearchTransitionalCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS241S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchLynxWithVideoCardProtocol extends SearchTransitionalCardProtocol<SearchMixFeed> implements C0PF8 {
    public final C19719912Dl LL = C13LE.LIZ(SearchMixFeed.class);
    public final C643000PJy LLILLJJLI = new C643000PJy();

    @Override // X.C0PF8
    public final C0PFU LIZ() {
        return new C0PFU() { // from class: X.0PIu
            @Override // X.C0PFU
            public final Function1<Aweme, Boolean> LIZIZ() {
                return AFwS241S0000000_10.get$arr$(214);
            }

            @Override // X.C0PFU
            public final String getIdentifier() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SearchVideoForLynx_");
                LifecycleOwner lifecycleOwnerLIZ = C651290Pgd.LIZ();
                sbLIZ.append(lifecycleOwnerLIZ != null ? Integer.valueOf(lifecycleOwnerLIZ.hashCode()) : null);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C0PHI<SearchMixFeed> getConfig() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final C13IQ<SearchMixFeed> getDataType() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol
    public final boolean Hd1(InterfaceC594520NTm interfaceC594520NTm) {
        String tokenType;
        DynamicPatch dynamicPatch = ((SearchMixFeed) interfaceC594520NTm).getDynamicPatch();
        if (dynamicPatch != null && (tokenType = dynamicPatch.getTokenType()) != null && tokenType.length() > 0) {
            return true;
        }
        return false;
    }
}
