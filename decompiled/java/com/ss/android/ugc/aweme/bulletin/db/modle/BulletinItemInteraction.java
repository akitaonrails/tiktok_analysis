package com.ss.android.ugc.aweme.bulletin.db.modle;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinItemInteraction {

    @C09CT("bottom_struct")
    public final String bottomStruct;

    @C09CT("comment")
    public final String comment;

    @C09CT("emoji")
    public final String emoji;

    @C09CT("item_id")
    public final String itemId;

    @C09CT("view_count")
    public final Integer viewCount;

    public BulletinItemInteraction(String str, String str2, String str3, Integer num, String str4) {
        this.itemId = str;
        this.emoji = str2;
        this.comment = str3;
        this.viewCount = num;
        this.bottomStruct = str4;
    }
}
