package com.ss.android.ugc.aweme.inbox.bulletin.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinLynxSchemeItem {

    @C09CT("card_type")
    public final long cardType;

    @C09CT("scheme")
    public final String scheme;

    public BulletinLynxSchemeItem() {
        this(0L, null);
    }

    public BulletinLynxSchemeItem(long j, String str) {
        this.cardType = j;
        this.scheme = str;
    }
}
