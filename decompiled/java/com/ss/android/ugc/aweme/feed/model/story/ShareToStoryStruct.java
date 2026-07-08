package com.ss.android.ugc.aweme.feed.model.story;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ShareToStoryStruct implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("is_visible")
    public int isVisible;

    @C09CT("share_story_post_type")
    public int shareStoryPostType;

    public static final class Companion {
    }

    public ShareToStoryStruct() {
        this(0, 0);
    }

    public final int isVisible() {
        return this.isVisible;
    }

    public ShareToStoryStruct(int i, int i2) {
        this.isVisible = i;
        this.shareStoryPostType = i2;
    }
}
