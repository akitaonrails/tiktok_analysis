package com.ss.android.ugc.aweme.bulletin.db.modle;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinItemBase {

    @C09CT("bulletin_board_id")
    public final String bulletinBoardId;

    @C09CT("create_time")
    public final Long createTime;

    @C09CT("has_read")
    public final Integer hasRead;

    @C09CT("item_id")
    public final String itemId;

    @C09CT("last_update_time")
    public final Long lastUpdateTime;

    @C09CT("publish_user_id")
    public final String publishUserId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    @C09CT("style_id")
    public final String styleId;

    @C09CT("ttl")
    public final Integer ttl;

    @C09CT("type")
    public final Integer type;

    public BulletinItemBase(String str, String str2, Long l, Long l2, String str3, Integer num, Integer num2, Integer num3, Integer num4, String str4) {
        this.itemId = str;
        this.bulletinBoardId = str2;
        this.lastUpdateTime = l;
        this.createTime = l2;
        this.publishUserId = str3;
        this.type = num;
        this.hasRead = num2;
        this.ttl = num3;
        this.status = num4;
        this.styleId = str4;
    }
}
