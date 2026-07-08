package com.ss.android.ugc.aweme.notification.view.guidepush;

import X.C0OP4;
import X.C0OPQ;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C624290OeB;
import X.C624310OeD;
import X.C637600Oze;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomProtocol;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinBoardGuideBannerProtocol extends InboxBannerCustomProtocol {
    public final C637600Oze LLILLL = C637600Oze.LIZLLL;
    public final C19719912Dl LLILZ = C13LE.LIZ(BulletinBoardGuideBannerAssem.class);
    public final List<C13IQ<C624310OeD>> LLILZIL = Collections.singletonList(C13LE.LIZ(C624310OeD.class));
    public final List<C13IQ<C624290OeB>> LLILZLL = Collections.singletonList(C13LE.LIZ(C624290OeB.class));

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol
    public final boolean LIZ() {
        C0OP4.LIZ.getClass();
        Pair pairLIZIZ = C0OP4.LIZIZ();
        C0OPQ c0opq = C0OPQ.LIZ;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("should_show", ((Boolean) pairLIZIZ.getFirst()).booleanValue() ? "1" : CardStruct.IStatusCode.DEFAULT);
        pairArr[1] = new Pair("cant_show_reason", pairLIZIZ.getSecond());
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        c0opq.getClass();
        C0OPQ.LJIIL("bulletin_banner_load", mapLJIIJ);
        return ((Boolean) pairLIZIZ.getFirst()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol
    public final C19719912Dl LIZJ() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerProtocol
    public final C637600Oze LIZLLL() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomProtocol
    public final List<C13IQ<C624310OeD>> LJFF() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomProtocol
    public final List<C13IQ<C624290OeB>> LJI() {
        return this.LLILZLL;
    }
}
