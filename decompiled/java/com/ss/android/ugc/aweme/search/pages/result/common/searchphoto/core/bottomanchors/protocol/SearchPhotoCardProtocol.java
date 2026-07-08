package com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.bottomanchors.protocol;

import X.C0PHH;
import X.C0PHI;
import X.C0PLT;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.InterfaceC594520NTm;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.search.arch.v2.legacy.SearchTransitionalCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPhotoCardProtocol extends SearchTransitionalCardProtocol<SearchMixFeed> {
    public final C19719912Dl LL = C13LE.LIZ(SearchMixFeed.class);
    public final C0PHH LLILLJJLI = new C0PHI<SearchMixFeed>() { // from class: X.0PHH
        public final C0PHM LIZIZ = C0PHM.ONE_COLUMN;
        public final C642240PHa LIZJ = new C642240PHa(true, true, C0BRG.LIZ() ? 1 : 0, false, false, true, true, true, false, false, null, null, 15380);

        @Override // X.C0PHI
        public final C0PHM LIZLLL() {
            return this.LIZIZ;
        }

        @Override // X.C0PHI
        public final C642240PHa LJFF() {
            return this.LIZJ;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.C0PHI
        public final List LIZIZ(InterfaceC594520NTm interfaceC594520NTm, C0PHT c0pht) {
            Aweme aweme = ((C0PLT) interfaceC594520NTm).getAweme();
            if (aweme != null) {
                return Collections.singletonList(aweme);
            }
            return null;
        }
    };

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
        Aweme aweme;
        C0PLT c0plt = (C0PLT) interfaceC594520NTm;
        if (c0plt.getFeedType() != 65280 || (aweme = c0plt.getAweme()) == null || !AwemeExtKt.isPhotoMode(aweme)) {
            return false;
        }
        return true;
    }
}
