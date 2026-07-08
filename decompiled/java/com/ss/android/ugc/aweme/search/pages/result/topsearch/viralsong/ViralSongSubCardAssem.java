package com.ss.android.ugc.aweme.search.pages.result.topsearch.viralsong;

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
public final class ViralSongSubCardAssem extends SearchSubCardAssem<C655760Pnq> {
    public final EnumC657370PqR LLLFF = EnumC657370PqR.VIDEO;
    public final String LLLFFI = EnumC682590Qq1.VIDEO.getValue();

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
        String desc;
        UrlModel cover;
        Aweme aweme = interfaceC657240PqE.getAweme();
        if (aweme.getSearchDesc() != null) {
            desc = aweme.getSearchDesc();
        } else {
            desc = aweme.getDesc();
        }
        c683220Qr2.LIZJ = desc;
        c683220Qr2.LJFF = aweme.getAid();
        c683220Qr2.LJII = AwemeExtKt.getAuthorUid(aweme);
        Video video = aweme.getVideo();
        if (video != null) {
            cover = video.getCover();
        } else {
            cover = null;
        }
        c683220Qr2.LIZIZ = cover;
        c683220Qr2.LIZ = this.LLLFFI;
        boolean z = C0Q9J.LIZ;
        c683220Qr2.LIZLLL = C684120QsU.LIZLLL(EnumC682590Qq1.VIDEO.getValue());
        return c683220Qr2;
    }
}
