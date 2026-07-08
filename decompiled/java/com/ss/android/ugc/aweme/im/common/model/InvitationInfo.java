package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class InvitationInfo {

    @C09CT("expired_at")
    public final Long expiredAt;

    @C09CT("invite_id")
    public final String inviteId;

    @C09CT("invite_long_url")
    public final String inviteLongUrl;

    @C09CT("invite_short_url")
    public final String inviteShortUrl;

    @C09CT("invite_qr_code_url")
    public final String qrCodeUrl;

    public InvitationInfo(Long l, String str, String str2, String str3, String str4) {
        this.expiredAt = l;
        this.inviteId = str;
        this.inviteLongUrl = str2;
        this.inviteShortUrl = str3;
        this.qrCodeUrl = str4;
    }
}
