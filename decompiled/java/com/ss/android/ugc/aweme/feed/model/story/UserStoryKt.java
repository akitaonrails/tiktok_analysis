package com.ss.android.ugc.aweme.feed.model.story;

import X.C13BV;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class UserStoryKt {
    public static final UserStory copyAll(UserStory userStory) {
        UserStoryCurrentInfo userStoryCurrentInfoCopy;
        ArrayList arrayList = new ArrayList();
        List<Aweme> stories = userStory.getStories();
        if (stories == null) {
            stories = C13BV.INSTANCE;
        }
        arrayList.addAll(stories);
        UserStoryCurrentInfo currentInfo = userStory.getCurrentInfo();
        if (currentInfo != null) {
            userStoryCurrentInfoCopy = currentInfo.copy(currentInfo.currentIndex, currentInfo.currentStory, currentInfo.dispatchCode);
        } else {
            userStoryCurrentInfoCopy = null;
        }
        return userStory.copy(arrayList, userStory.totalCount, userStory.currentPosition, userStory.allViewed, userStory.minCursor, userStory.maxCursor, userStory.hasMoreAfter, userStory.hasMoreBefore, userStory.lastStoryCreatedAt, userStory.isPostStyle, userStory.metaDataList, userStory.userFilterStoryInfo, userStory.isStoryGuideCard, userStory.highlightSkylightUser, userStory.originTotalCount, userStoryCurrentInfoCopy, userStory.fakeSelfStoryCollection, userStory.fakeAwemeShell, userStory.maxViewedInfo, userStory.firstUnViewedStoryIdx, userStory.shouldStartFromUnViewedStoryIdx, userStory.totalVV, userStory.unReadStoryAids, userStory.isFromRemote);
    }

    public static final UserStory copyUserStory(UserStory userStory) {
        if (userStory != null) {
            ArrayList arrayList = new ArrayList();
            List<Aweme> stories = userStory.getStories();
            if (stories == null) {
                stories = C13BV.INSTANCE;
            }
            arrayList.addAll(stories);
            return userStory.copy(arrayList, userStory.totalCount, userStory.currentPosition, userStory.allViewed, userStory.minCursor, userStory.maxCursor, userStory.hasMoreAfter, userStory.hasMoreBefore, userStory.lastStoryCreatedAt, userStory.isPostStyle, userStory.metaDataList, userStory.userFilterStoryInfo, userStory.isStoryGuideCard, userStory.highlightSkylightUser, userStory.originTotalCount, userStory.currentInfo, userStory.fakeSelfStoryCollection, userStory.fakeAwemeShell, userStory.maxViewedInfo, userStory.firstUnViewedStoryIdx, userStory.shouldStartFromUnViewedStoryIdx, userStory.totalVV, userStory.unReadStoryAids, userStory.isFromRemote);
        }
        return null;
    }

    public static final Integer currentIndex(UserStory userStory) {
        UserStoryCurrentInfo currentInfo = userStory.getCurrentInfo();
        if (currentInfo != null) {
            return currentInfo.currentIndex;
        }
        return null;
    }

    public static final Aweme currentStory(UserStory userStory) {
        UserStoryCurrentInfo currentInfo = userStory.getCurrentInfo();
        if (currentInfo != null) {
            return currentInfo.currentStory;
        }
        return null;
    }

    public static final UserStory update(UserStory userStory, UserStory userStory2) {
        UserStoryCurrentInfo userStoryCurrentInfoCopy;
        if (userStory2 == null) {
            return userStory;
        }
        List<Aweme> stories = userStory.getStories();
        stories.clear();
        stories.addAll(userStory2.getStories());
        userStory.setTotalCount(userStory2.getTotalCount());
        userStory.setCurrentPosition(userStory2.getCurrentPosition());
        userStory.setAllViewed(userStory2.getAllViewed());
        userStory.setMinCursor(userStory2.getMinCursor());
        userStory.setMaxCursor(userStory2.getMaxCursor());
        userStory.setHasMoreAfter(userStory2.getHasMoreBefore());
        userStory.setHasMoreBefore(userStory2.getHasMoreBefore());
        userStory.setLastStoryCreatedAt(userStory2.getLastStoryCreatedAt());
        UserStoryCurrentInfo currentInfo = userStory2.getCurrentInfo();
        UserStoryCurrentInfo userStoryCurrentInfoCopy2 = null;
        if (currentInfo != null) {
            userStoryCurrentInfoCopy = currentInfo.copy(currentInfo.currentIndex, currentInfo.currentStory, currentInfo.dispatchCode);
        } else {
            userStoryCurrentInfoCopy = null;
        }
        userStory.setCurrentInfo(userStoryCurrentInfoCopy);
        UserStoryCurrentInfo maxViewedInfo = userStory2.getMaxViewedInfo();
        if (maxViewedInfo != null) {
            userStoryCurrentInfoCopy2 = maxViewedInfo.copy(maxViewedInfo.currentIndex, maxViewedInfo.currentStory, maxViewedInfo.dispatchCode);
        }
        userStory.setMaxViewedInfo(userStoryCurrentInfoCopy2);
        userStory.setFirstUnViewedStoryIdx(userStory2.getFirstUnViewedStoryIdx());
        userStory.setShouldStartFromUnViewedStoryIdx(userStory2.getShouldStartFromUnViewedStoryIdx());
        return userStory;
    }
}
