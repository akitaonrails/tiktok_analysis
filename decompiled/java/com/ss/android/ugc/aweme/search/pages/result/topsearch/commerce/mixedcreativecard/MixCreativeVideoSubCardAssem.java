package com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.mixedcreativecard;

import X.C0Q9J;
import X.C655760Pnq;
import X.C683220Qr2;
import X.C684120QsU;
import X.EnumC657370PqR;
import X.EnumC682590Qq1;
import X.InterfaceC657240PqE;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.horizontallist.subcard.assem.SearchSubCardAssem;

/* JADX INFO: loaded from: classes11.dex */
public final class MixCreativeVideoSubCardAssem extends SearchSubCardAssem<C655760Pnq> {
    public final EnumC657370PqR LLLFF = EnumC657370PqR.VIDEO;
    public final String LLLFFI = EnumC682590Qq1.ADS.getValue();

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.horizontallist.subcard.assem.SearchSubCardAssem
    public final String sp() {
        return this.LLLFFI;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.horizontallist.subcard.assem.SearchSubCardAssem
    public final EnumC657370PqR up() {
        return this.LLLFF;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.horizontallist.subcard.assem.SearchSubCardAssem
    public final C683220Qr2 op(C683220Qr2 c683220Qr2, InterfaceC657240PqE interfaceC657240PqE) {
        UrlModel cover;
        Aweme aweme = interfaceC657240PqE.getAweme();
        c683220Qr2.LIZJ = aweme.getDesc();
        c683220Qr2.LJFF = aweme.getAid();
        c683220Qr2.LJII = AwemeExtKt.getAuthorUid(aweme);
        Video video = aweme.getVideo();
        if (video != null) {
            cover = video.getCover();
        } else {
            cover = null;
        }
        c683220Qr2.LIZIZ = cover;
        String str = this.LLLFFI;
        c683220Qr2.LIZ = str;
        c683220Qr2.LJIILIIL = aweme;
        boolean z = C0Q9J.LIZ;
        c683220Qr2.LIZLLL = C684120QsU.LIZLLL(str);
        return c683220Qr2;
    }
}
