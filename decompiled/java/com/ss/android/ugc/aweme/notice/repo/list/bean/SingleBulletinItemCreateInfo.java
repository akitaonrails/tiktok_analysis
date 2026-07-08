package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class SingleBulletinItemCreateInfo {

    @C09CT("video_item_id")
    public final Long aid;

    @C09CT("audios")
    public final String audios;

    @C09CT("channel_id")
    public final Long channelId;

    @C09CT("extra")
    public final String extra;

    @C09CT("images")
    public final String images;

    @C09CT("item_type")
    public final Integer itemType;

    @C09CT("links")
    public final String links;

    @C09CT("text")
    public final String text;

    public SingleBulletinItemCreateInfo(Integer num, Long l, String str, String str2, String str3, Long l2, String str4, String str5) {
        this.itemType = num;
        this.channelId = l;
        this.text = str;
        this.images = str2;
        this.links = str3;
        this.aid = l2;
        this.extra = str4;
        this.audios = str5;
    }
}
