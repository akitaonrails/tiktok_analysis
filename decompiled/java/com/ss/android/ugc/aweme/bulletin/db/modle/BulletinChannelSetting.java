package com.ss.android.ugc.aweme.bulletin.db.modle;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinChannelSetting {

    @C09CT("bulletin_board_id")
    public final String bulletinBoardId;

    @C09CT("edit_quota")
    public final Long editQuota;

    @C09CT("plus_post_orders")
    public final String plusPostOrders;

    @C09CT("publish_quota")
    public final Long publishQuota;

    @C09CT("quick_post_orders")
    public final String quickPostOrders;

    @C09CT("reopen_deadline_time")
    public final Long reopenDeadlineTime;

    public BulletinChannelSetting(String str, Long l, Long l2, Long l3, String str2, String str3) {
        this.bulletinBoardId = str;
        this.reopenDeadlineTime = l;
        this.publishQuota = l2;
        this.editQuota = l3;
        this.quickPostOrders = str2;
        this.plusPostOrders = str3;
    }
}
