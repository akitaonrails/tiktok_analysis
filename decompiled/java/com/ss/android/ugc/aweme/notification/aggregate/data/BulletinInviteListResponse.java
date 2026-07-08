package com.ss.android.ugc.aweme.notification.aggregate.data;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class BulletinInviteListResponse {
    public static final int $stable = 8;

    @C09CT("invite_list")
    public final List<BulletinAggregateNotice> bulletinInviteItemList;

    @C09CT("cursor")
    public final String cursor;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    @C09CT("total_count")
    public final Integer totalCount;

    public BulletinInviteListResponse(Integer num, String str, Boolean bool, String str2, Integer num2, List<BulletinAggregateNotice> list) {
        this.statusCode = num;
        this.statusMsg = str;
        this.hasMore = bool;
        this.cursor = str2;
        this.totalCount = num2;
        this.bulletinInviteItemList = list;
    }
}
