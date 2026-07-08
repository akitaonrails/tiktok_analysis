package com.ss.android.ugc.aweme.im.service.experiment.stickerset;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class TTIMLightInteractionSendStickerSetConfig {

    @C09CT("creator_user_id")
    public final long creatorUserId;

    @C09CT("sticker_id")
    public final long stickerId;

    @C09CT("sticker_set_id")
    public final long stickerSetId;

    @C09CT("sticker_url")
    public final String stickerUrl;

    public TTIMLightInteractionSendStickerSetConfig(long j, long j2, String str, long j3) {
        this.stickerId = j;
        this.stickerSetId = j2;
        this.stickerUrl = str;
        this.creatorUserId = j3;
    }
}
