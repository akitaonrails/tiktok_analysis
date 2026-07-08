package com.ss.android.ugc.aweme.rss.api.models;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class RssEntry {

    @C09CT("date_unix_milliseconds")
    public final Long date;

    @C09CT("description")
    public final String description;

    @C09CT("rss_entry_guid")
    public final String guid;

    @C09CT("has_max_images")
    public final Boolean hasMaxImages;

    @C09CT("image_url")
    public final List<UrlModel> imageUrl;

    @C09CT("item_ids")
    public final List<Long> itemIds;

    @C09CT("link")
    public final String linkUrl;

    @C09CT("rss_url")
    public final String rssUrl;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    @C09CT("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public RssEntry(String str, String str2, String str3, String str4, List<? extends UrlModel> list, int i, List<Long> list2, String str5, Long l, Boolean bool) {
        this.guid = str;
        this.linkUrl = str2;
        this.title = str3;
        this.description = str4;
        this.imageUrl = list;
        this.status = i;
        this.itemIds = list2;
        this.rssUrl = str5;
        this.date = l;
        this.hasMaxImages = bool;
    }
}
