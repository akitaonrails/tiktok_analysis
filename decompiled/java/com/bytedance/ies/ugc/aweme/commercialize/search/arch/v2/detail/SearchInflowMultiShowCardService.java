package com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.detail;

import X.C1010120cOQ;
import X.C1017180cZo;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.item.ISearchInflowMultiShowCardService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: loaded from: classes17.dex */
public final class SearchInflowMultiShowCardService implements ISearchInflowMultiShowCardService {
    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.item.ISearchInflowMultiShowCardService
    public final boolean LIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || !AwemeExtKt.isAdTraffic(aweme) || !C1010120cOQ.LJIJI(aweme) || (awemeRawAd = aweme.getAwemeRawAd()) == null || !C1017180cZo.LJIL(awemeRawAd)) {
            return false;
        }
        return true;
    }
}
