package com.ss.android.ugc.aweme.social.sticker.model.base;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class RelationshipInfo {

    @C09CT("messages_cnt")
    public final Long messagesCnt;

    @C09CT("sticker_info")
    public final String stickerInfo;

    @C09CT("celebrating_user_id")
    public final String toId;

    public RelationshipInfo() {
        this(null, null, null);
    }

    public RelationshipInfo(String str, Long l, String str2) {
        this.toId = str;
        this.messagesCnt = l;
        this.stickerInfo = str2;
    }
}
