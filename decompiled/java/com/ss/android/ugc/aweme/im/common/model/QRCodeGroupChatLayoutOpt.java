package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class QRCodeGroupChatLayoutOpt {

    @C09CT("with_invite_long_url_opt")
    public final boolean withInviteLongUrlOpt;

    @C09CT("with_invite_qr_code_url_opt")
    public final boolean withInviteQrCodeUrlOpt;

    @C09CT("with_invite_short_url_opt")
    public final boolean withInviteShortUrlOpt;

    public QRCodeGroupChatLayoutOpt() {
        this(true, true, true);
    }

    public QRCodeGroupChatLayoutOpt(boolean z, boolean z2, boolean z3) {
        this.withInviteLongUrlOpt = z;
        this.withInviteShortUrlOpt = z2;
        this.withInviteQrCodeUrlOpt = z3;
    }
}
