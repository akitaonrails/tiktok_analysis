package com.ss.android.ugc.aweme.notification.api;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCommentAllowItemType {
    public static final int $stable = 8;

    @C09CT("card_type")
    public final List<Integer> cardType;

    @C09CT("bulletin_type")
    public final Integer itemType;

    public BulletinCommentAllowItemType() {
        this(0, null);
    }

    public BulletinCommentAllowItemType(Integer num, List<Integer> list) {
        this.itemType = num;
        this.cardType = list;
    }
}
