package com.ss.android.ugc.aweme.bulletin.db.modle;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinItemContent {

    @C09CT("contentKey")
    public final String contentKey;

    @C09CT("contentValue")
    public final String contentValue;

    @C09CT("item_id")
    public final String itemId;

    public BulletinItemContent(String str, String str2, String str3) {
        this.itemId = str;
        this.contentKey = str2;
        this.contentValue = str3;
    }
}
