package com.ss.android.ugc.aweme.friendstab.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsFeedEmptyRetrySetting {
    public static final FriendsTabEmptyRetryModel LIZ = new FriendsTabEmptyRetryModel(1, 3);

    public static final class FriendsTabEmptyRetryModel {

        @C09CT("tt_friends_feed_loadmore_empty_retry_times_android")
        public final int loadMoreRetryTimes;

        @C09CT("tt_friends_feed_refresh_empty_retry_times_android")
        public final int refreshRetryTimes;

        public FriendsTabEmptyRetryModel(int i, int i2) {
            this.refreshRetryTimes = i;
            this.loadMoreRetryTimes = i2;
        }
    }
}
