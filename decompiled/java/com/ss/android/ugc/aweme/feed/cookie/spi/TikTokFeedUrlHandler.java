package com.ss.android.ugc.aweme.feed.cookie.spi;

import X.C0XLP;
import X.C0XLQ;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class TikTokFeedUrlHandler implements IFeedUrlHandler {
    @Override // com.ss.android.ugc.aweme.feed.cookie.spi.IFeedUrlHandler
    public final String LIZ(String str) {
        C0XLQ c0xlqLJIIL = C0XLQ.LJIIL(str);
        if (c0xlqLJIIL != null) {
            String str2 = c0xlqLJIIL.LIZLLL;
            C0XLP c0xlpLJIIJ = c0xlqLJIIL.LJIIJ();
            if (c0xlpLJIIJ != null) {
                if (Intrinsics.LJFF(str2, "api.tiktokv.com")) {
                    c0xlpLJIIJ.LJFF("api-h2.tiktokv.com");
                }
                String string = c0xlpLJIIJ.LIZLLL().LJJ().toString();
                if (string != null) {
                    return string;
                }
            }
        }
        return str;
    }
}
