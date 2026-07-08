package com.ss.android.ugc.aweme.friendstab.model;

import X.C09CT;
import X.EnumC1586610rOF;

/* JADX INFO: loaded from: classes25.dex */
public class UserNewContent {

    @C09CT("feed_type")
    public final EnumC1586610rOF feedType;
    public boolean hasBeenShown;
    public boolean isStory;

    @C09CT("item_id")
    public String itemId;
    public Long startShowTimeStamp;

    @C09CT("total_show_duration")
    public long totalShowDuration;

    @C09CT("new_content_author")
    public final FriendsRedDotUser user;

    public UserNewContent() {
        this(EnumC1586610rOF.FRIENDS_FEED);
    }

    public final EnumC1586610rOF getFeedType() {
        return this.feedType;
    }

    public final boolean getHasBeenShown() {
        return this.hasBeenShown;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final Long getStartShowTimeStamp() {
        return this.startShowTimeStamp;
    }

    public final long getTotalShowDuration() {
        return this.totalShowDuration;
    }

    public final FriendsRedDotUser getUser() {
        return this.user;
    }

    public final boolean isStory() {
        return this.isStory;
    }

    public UserNewContent(EnumC1586610rOF enumC1586610rOF) {
        this.feedType = enumC1586610rOF;
        this.itemId = "";
    }

    public final void setHasBeenShown(boolean z) {
        this.hasBeenShown = z;
    }

    public final void setItemId(String str) {
        this.itemId = str;
    }

    public final void setStartShowTimeStamp(Long l) {
        this.startShowTimeStamp = l;
    }

    public final void setStory(boolean z) {
        this.isStory = z;
    }

    public final void setTotalShowDuration(long j) {
        this.totalShowDuration = j;
    }
}
