package com.ss.android.ugc.aweme.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.inbox.StoryNoteBubbleInfo;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class MixRankSkylightStory implements Serializable {

    @C09CT("all_unviewed_story_ids")
    public final List<Long> allUnViewedStoryIds;

    @C09CT("all_viewed")
    public final boolean allViewed;

    @C09CT("aweme")
    public final Aweme aweme;

    @C09CT("reveal_preview_authors")
    public final List<User> revealPreviewAuthors;

    @C09CT("user_story_note")
    public final StoryNoteBubbleInfo userStoryNote;

    public MixRankSkylightStory() {
        this(null, false, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MixRankSkylightStory(Aweme aweme, boolean z, List<Long> list, StoryNoteBubbleInfo storyNoteBubbleInfo, List<? extends User> list2) {
        this.aweme = aweme;
        this.allViewed = z;
        this.allUnViewedStoryIds = list;
        this.userStoryNote = storyNoteBubbleInfo;
        this.revealPreviewAuthors = list2;
    }
}
