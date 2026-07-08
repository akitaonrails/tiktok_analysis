package com.ss.android.ugc.aweme.bulletin.db.modle;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinChannelContent {

    @C09CT("avatar_url")
    public final String avatarUrl;

    @C09CT("badge_icon_url")
    public final String badgeIconUrl;

    @C09CT("bulletin_board_id")
    public final String bulletinBoardId;

    @C09CT("desc")
    public final String desc;

    @C09CT("extra_data")
    public final String extraData;

    @C09CT("member_count")
    public final Long memberCount;

    @C09CT("name")
    public final String name;

    public BulletinChannelContent(String str, String str2, String str3, String str4, Long l, String str5, String str6) {
        this.bulletinBoardId = str;
        this.name = str2;
        this.desc = str3;
        this.avatarUrl = str4;
        this.memberCount = l;
        this.badgeIconUrl = str5;
        this.extraData = str6;
    }
}
