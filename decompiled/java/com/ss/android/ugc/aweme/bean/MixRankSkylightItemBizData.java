package com.ss.android.ugc.aweme.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.story.highlights.HighlightSkylightUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class MixRankSkylightItemBizData implements Serializable {

    @C09CT("room_info")
    public final String roomInfo;

    @C09CT("story_highlight_user_info")
    public final HighlightSkylightUser skylightHighlightUser;

    @C09CT("skylight_live_item_info")
    public final MixRankSkylightLive skylightLive;

    @C09CT("skylight_story_user_info")
    public final MixRankSkylightStory skylightStory;

    @C09CT("thought_info")
    public final ThoughtInfo thoughtInfo;

    @C09CT("user")
    public final User user;

    public MixRankSkylightItemBizData() {
        this(null, null, null, null, null, null);
    }

    public MixRankSkylightItemBizData(MixRankSkylightStory mixRankSkylightStory, String str, User user, MixRankSkylightLive mixRankSkylightLive, HighlightSkylightUser highlightSkylightUser, ThoughtInfo thoughtInfo) {
        this.skylightStory = mixRankSkylightStory;
        this.roomInfo = str;
        this.user = user;
        this.skylightLive = mixRankSkylightLive;
        this.skylightHighlightUser = highlightSkylightUser;
        this.thoughtInfo = thoughtInfo;
    }
}
