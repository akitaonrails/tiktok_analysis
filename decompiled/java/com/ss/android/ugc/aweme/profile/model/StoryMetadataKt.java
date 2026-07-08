package com.ss.android.ugc.aweme.profile.model;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class StoryMetadataKt {
    public static final User updateStoryMetadata(User user, User user2) {
        List<Integer> list;
        List<Integer> list2;
        UserAllStoryMetadata allStoryMetadata;
        UserAllStoryMetadata allStoryMetadata2;
        UserAllStoryMetadata userAllStoryMetadataCopy = null;
        if (user2 != null && (allStoryMetadata2 = user2.getAllStoryMetadata()) != null) {
            list = allStoryMetadata2.disableStoryCircleScenes;
        } else {
            list = null;
        }
        if (user != null && (allStoryMetadata = user.getAllStoryMetadata()) != null) {
            list2 = allStoryMetadata.disableStoryCircleScenes;
        } else {
            list2 = null;
        }
        if (list == null && list2 != null && user2 != null) {
            if (user2.getAllStoryMetadata() == null) {
                if (user2 != null) {
                    user2.setAllStoryMetadata(new UserAllStoryMetadata(null, null, null, null, null, null, list2));
                }
            } else if (user2 != null) {
                UserAllStoryMetadata allStoryMetadata3 = user2.getAllStoryMetadata();
                if (allStoryMetadata3 != null) {
                    userAllStoryMetadataCopy = allStoryMetadata3.copy(allStoryMetadata3.storyLiteMetadata, allStoryMetadata3.latestStoryViewTime, allStoryMetadata3.userStoryChangeTime, allStoryMetadata3.storyBadgeUrl, allStoryMetadata3.storyCelebrationList, allStoryMetadata3.postTypeToCount, list2);
                }
                user2.setAllStoryMetadata(userAllStoryMetadataCopy);
                return user2;
            }
        }
        return user2;
    }

    public static final UserAllStoryMetadata updateStoryMetadata(UserAllStoryMetadata userAllStoryMetadata, UserAllStoryMetadata userAllStoryMetadata2) {
        List<Integer> list;
        List<Integer> list2 = null;
        if (userAllStoryMetadata2 != null) {
            list = userAllStoryMetadata2.disableStoryCircleScenes;
        } else {
            list = null;
        }
        if (userAllStoryMetadata != null) {
            list2 = userAllStoryMetadata.disableStoryCircleScenes;
        }
        if (list != null || list2 == null) {
            return userAllStoryMetadata2;
        }
        if (userAllStoryMetadata2 == null) {
            return new UserAllStoryMetadata(null, null, null, null, null, null, list2);
        }
        return userAllStoryMetadata2.copy(userAllStoryMetadata2.storyLiteMetadata, userAllStoryMetadata2.latestStoryViewTime, userAllStoryMetadata2.userStoryChangeTime, userAllStoryMetadata2.storyBadgeUrl, userAllStoryMetadata2.storyCelebrationList, userAllStoryMetadata2.postTypeToCount, list2);
    }
}
