package com.ss.android.ugc.aweme.story.model;

import X.C051M;
import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class ClientControlParams implements Serializable {
    public static final int $stable = 0;

    @C09CT("enable_reveal_story_content")
    public final Boolean enableRevealStoryContent;

    @C09CT("enable_social_fresh_content")
    public final Boolean enableSocialFreshContent;

    @C09CT("enable_story_collection_lite_author")
    public final Boolean enableStoryCollectionLiteAuthor;

    @C09CT("need_highlight_story_skylight")
    public final Boolean needHighlightStorySkylight;

    public ClientControlParams() {
        this(null, null, null, null);
    }

    public final String toJsonString() {
        return C051M.LJ(this, false);
    }

    public ClientControlParams(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.enableSocialFreshContent = bool;
        this.enableStoryCollectionLiteAuthor = bool2;
        this.needHighlightStorySkylight = bool3;
        this.enableRevealStoryContent = bool4;
    }
}
