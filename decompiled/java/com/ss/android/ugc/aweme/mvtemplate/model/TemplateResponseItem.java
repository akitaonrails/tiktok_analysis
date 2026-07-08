package com.ss.android.ugc.aweme.mvtemplate.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes23.dex */
public final class TemplateResponseItem {

    @C09CT("author")
    public final User author;

    @C09CT("desc")
    public final String description;

    @C09CT("extra")
    public final String extra;

    @C09CT("fragment_count")
    public final int fragmentCount;

    @C09CT("template_id")
    public final long id;

    @C09CT("is_collected")
    public final boolean isCollected;

    @C09CT("item_type")
    public final int itemType;

    @C09CT("md5")
    public final String md5;

    @C09CT("music")
    public final Music music;

    @C09CT("sdk_version")
    public final String sdkVersion;

    @C09CT("template_url")
    public final String templateUrl;

    @C09CT("title")
    public final String title;

    @C09CT("usage_amount")
    public final long usageAmount;

    @C09CT("video")
    public final Video video;

    public TemplateResponseItem() {
        this(-1L, null, null, null, "not_set", "not_set", "not_set", 0, 0L, "not_set", false, "not_set", -1, "not_set");
    }

    public TemplateResponseItem(long j, User user, Music music, Video video, String str, String str2, String str3, int i, long j2, String str4, boolean z, String str5, int i2, String str6) {
        this.id = j;
        this.author = user;
        this.music = music;
        this.video = video;
        this.title = str;
        this.description = str2;
        this.templateUrl = str3;
        this.fragmentCount = i;
        this.usageAmount = j2;
        this.extra = str4;
        this.isCollected = z;
        this.sdkVersion = str5;
        this.itemType = i2;
        this.md5 = str6;
    }
}
