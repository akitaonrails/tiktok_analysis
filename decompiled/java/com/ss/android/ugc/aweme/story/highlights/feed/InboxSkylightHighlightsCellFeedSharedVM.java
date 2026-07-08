package com.ss.android.ugc.aweme.story.highlights.feed;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightsAwemeDetailResponse;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class InboxSkylightHighlightsCellFeedSharedVM extends BaseStoryHighlightsFeedSharedVM {
    public final void FQ2(Context context, StoryHighlightsAwemeDetailResponse storyHighlightsAwemeDetailResponse, String str, User user) {
        UserStory userStory;
        Aweme aweme = storyHighlightsAwemeDetailResponse.getAweme();
        if (aweme == null || (userStory = aweme.getUserStory()) == null) {
            return;
        }
        aweme.setAuthor(user);
        aweme.setAwemeType(40);
        userStory.setFakeAwemeShell(true);
        userStory.setCurrentPosition(0L);
        userStory.setCurrentInfo(new UserStoryCurrentInfo(0, null, 0));
        BQ2(context, "inbox_skylight_feed_anchor", Collections.singletonList(aweme), str, null, "notification_page", "", null);
    }
}
