package com.ss.android.ugc.aweme.search.lynx.core.utils;

import X.C1537900q7g;
import X.C1541950qED;
import X.C649740Pe8;
import com.ss.android.ugc.aweme.search.lynx.spark.core.ISearchSparkPluginService;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchSparkPluginService implements ISearchSparkPluginService {
    @Override // com.ss.android.ugc.aweme.search.lynx.spark.core.ISearchSparkPluginService
    public final void LIZ() {
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        C649740Pe8 c649740Pe8 = new C649740Pe8();
        c1537900q7g.getClass();
        C1537900q7g.LJIIIIZZ(c649740Pe8);
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.spark.core.ISearchSparkPluginService
    public final boolean LIZIZ(String str) {
        if (str == null || !a0.LJJIIZI(str, "target_handler=search_page", false)) {
            return false;
        }
        return true;
    }
}
