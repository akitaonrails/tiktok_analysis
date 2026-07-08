package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.horizontallist.subcard.assem;

import X.C0Q9J;
import X.C655740Pno;
import X.C683220Qr2;
import X.C684120QsU;
import X.EnumC657370PqR;
import X.InterfaceC657240PqE;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes11.dex */
public final class LiveSubCardAssem extends SearchSubCardAssem<C655740Pno> {
    public final EnumC657370PqR LLLFF = EnumC657370PqR.LIVE;
    public final String LLLFFI = "live";

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
        String roomTitle;
        Aweme aweme = interfaceC657240PqE.getAweme();
        User author = aweme.getAuthor();
        UrlModel urlModel = null;
        if (author != null) {
            roomTitle = author.getRoomTitle();
        } else {
            roomTitle = null;
        }
        c683220Qr2.LIZJ = roomTitle;
        c683220Qr2.LJFF = aweme.getAid();
        c683220Qr2.LJII = AwemeExtKt.getAuthorUid(aweme);
        User author2 = aweme.getAuthor();
        if (author2 != null) {
            urlModel = author2.roomCover;
        }
        c683220Qr2.LIZIZ = urlModel;
        String str = this.LLLFFI;
        c683220Qr2.LIZ = str;
        boolean z = C0Q9J.LIZ;
        c683220Qr2.LIZLLL = C684120QsU.LIZLLL(str);
        return c683220Qr2;
    }
}
