package com.ss.android.ugc.aweme.friendstab.experiment;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes14.dex */
public final class FriendsTabRedDotOptimizationSettings {
    public static final FriendsTabRedDotOptimizationModel LIZ = new FriendsTabRedDotOptimizationModel(500, 86400, 600);

    public static final FriendsTabRedDotOptimizationModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        FriendsTabRedDotOptimizationModel friendsTabRedDotOptimizationModel = LIZ;
        FriendsTabRedDotOptimizationModel friendsTabRedDotOptimizationModel2 = (FriendsTabRedDotOptimizationModel) settingsManagerLIZLLL.LJIIIIZZ("friends_tab_red_dot_optimization", FriendsTabRedDotOptimizationModel.class, friendsTabRedDotOptimizationModel);
        return friendsTabRedDotOptimizationModel2 != null ? friendsTabRedDotOptimizationModel2 : friendsTabRedDotOptimizationModel;
    }

    public static final class FriendsTabRedDotOptimizationModel {

        @C09CT("friends_tab_feed_played_items_record_expire_time_seconds")
        public final long expireTimeSeconds;

        @C09CT("friends_tab_report_played_items_count_limit")
        public final long playedItemsCountLimit;

        @C09CT("friends_tab_red_dot_polling_interval_seconds")
        public final long pollingIntervalSeconds;

        public FriendsTabRedDotOptimizationModel(long j, long j2, long j3) {
            this.playedItemsCountLimit = j;
            this.expireTimeSeconds = j2;
            this.pollingIntervalSeconds = j3;
        }
    }
}
