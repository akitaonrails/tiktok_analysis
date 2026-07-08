package com.ss.android.ugc.aweme.feed.model.story;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class Story implements Serializable {

    @C09CT("chat_disabled")
    public Boolean chatDisable;

    @C09CT("expired_at")
    public long expiredAt;

    @C09CT("emoji_disabled")
    public boolean exposeEmojiDisable;
    public boolean isFaked;
    public boolean isKeepDraft;
    public boolean isLoading;
    public boolean isPublishing;

    @C09CT("story_style_version")
    public long storyStyleVersion;

    @C09CT("viewed")
    public boolean viewed;

    @C09CT("viewer_count")
    public long viewerCount;

    public Story() {
        this(0L, false, 0L, null, 0L, false, false, false, false, false);
    }

    public final Story copy(long j, boolean z, long j2, Boolean bool, long j3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        return new Story(j, z, j2, bool, j3, z2, z3, z4, z5, z6);
    }

    public final boolean isFaked() {
        return this.isFaked;
    }

    public final boolean isKeepDraft() {
        return this.isKeepDraft;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isPublishing() {
        return this.isPublishing;
    }

    public final void setFaked(boolean z) {
        this.isFaked = z;
    }

    public final void setKeepDraft(boolean z) {
        this.isKeepDraft = z;
    }

    public final void setLoading(boolean z) {
        this.isLoading = z;
    }

    public final void setPublishing(boolean z) {
        this.isPublishing = z;
    }

    public final void setViewed(boolean z) {
        this.viewed = z;
    }

    public Story(long j, boolean z, long j2, Boolean bool, long j3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.expiredAt = j;
        this.viewed = z;
        this.viewerCount = j2;
        this.chatDisable = bool;
        this.storyStyleVersion = j3;
        this.exposeEmojiDisable = z2;
        this.isLoading = z3;
        this.isFaked = z4;
        this.isPublishing = z5;
        this.isKeepDraft = z6;
    }
}
