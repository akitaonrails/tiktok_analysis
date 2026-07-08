package com.ss.android.ugc.aweme.ad.feed.adexperience.extlayer;

import X.C1049100dPI;
import X.C1D2H;
import com.ss.android.ugc.aweme.ad.feed.adexperience.IFeedAdRefreshEventLogger;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.AwS85S1000000_35;

/* JADX INFO: loaded from: classes3.dex */
public final class FeedAdRefreshEventLoggerImpl implements IFeedAdRefreshEventLogger {
    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.IFeedAdRefreshEventLogger
    public final void LIZ(AwemeRawAd awemeRawAd, String str) {
        if (awemeRawAd == null) {
            return;
        }
        new C1049100dPI(new Object[0]).logAd(C1D2H.LIZ, awemeRawAd, new AwS85S1000000_35(str, 1));
    }
}
