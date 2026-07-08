package com.ss.android.ugc.aweme.feed.model.story;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryKt {
    public static final Story copyStory(Story story) {
        if (story != null) {
            return story.copy(story.expiredAt, story.viewed, story.viewerCount, story.chatDisable, story.storyStyleVersion, story.exposeEmojiDisable, story.isLoading, story.isFaked, story.isPublishing, story.isKeepDraft);
        }
        return null;
    }

    public static final boolean isExpired(Story story) {
        long j = story.expiredAt;
        if (j < 0 || j >= System.currentTimeMillis()) {
            return false;
        }
        return true;
    }

    public static final boolean isStoryV2(Story story) {
        if (story.storyStyleVersion == 2) {
            return true;
        }
        return false;
    }

    public static final Story updateStory(Aweme aweme, Aweme aweme2) {
        boolean z = false;
        if (aweme != null && aweme.getIsTikTokStory()) {
            return aweme.getStory();
        }
        if (aweme2 != null) {
            if (aweme2.getStory() != null && (aweme == null || aweme.getStory() == null)) {
                Story story = aweme2.getStory();
                if (story == null) {
                    return null;
                }
                return story.copy(story.expiredAt, story.viewed, story.viewerCount, story.chatDisable, story.storyStyleVersion, story.exposeEmojiDisable, story.isLoading, story.isFaked, false, story.isKeepDraft);
            }
            if (aweme2 != null && aweme2.getStory() != null) {
                if (aweme == null) {
                    return null;
                }
                if (aweme.getStory() != null) {
                    Story story2 = aweme.getStory();
                    if (story2 != null) {
                        Story story3 = aweme2.getStory();
                        if (story3 != null) {
                            z = story3.viewed;
                        }
                        story2.setViewed(z);
                    }
                    return aweme.getStory();
                }
            }
        }
        if (aweme == null) {
            return null;
        }
        return aweme.getStory();
    }
}
