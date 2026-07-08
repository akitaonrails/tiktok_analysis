package com.ss.android.ugc.aweme.bean;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.story.inbox.SkylightStoryUser;
import com.ss.android.ugc.aweme.story.inbox.StoryInsertCard;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
public final class MixRankSkylightStoryBiz implements Serializable {

    @C09CT("insert_cards")
    public final List<StoryInsertCard> storyCards;

    @C09CT("skylight_story_users")
    public final List<SkylightStoryUser> users;

    public MixRankSkylightStoryBiz() {
        this(null, null, 3, null);
    }

    public MixRankSkylightStoryBiz(List<SkylightStoryUser> list, List<StoryInsertCard> list2) {
        this.users = list;
        this.storyCards = list2;
    }

    public MixRankSkylightStoryBiz(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}
