package com.bytedance.android.livesdk.setting;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_show_friend_post_push_inner_live")
public final class LiveAvoidFriendPostPushExp {
    public static final LiveAvoidFriendPostPushExp INSTANCE = new LiveAvoidFriendPostPushExp();
    public static final LiveAvoidFriendPostPushConfig DEFAULT = new LiveAvoidFriendPostPushConfig(false, null, null, null, null, 0);

    public final LiveAvoidFriendPostPushConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveAvoidFriendPostPushConfig liveAvoidFriendPostPushConfig = DEFAULT;
        LiveAvoidFriendPostPushConfig liveAvoidFriendPostPushConfig2 = (LiveAvoidFriendPostPushConfig) settingsManager.getValueSafely("live_show_friend_post_push_inner_live", liveAvoidFriendPostPushConfig);
        return liveAvoidFriendPostPushConfig2 != null ? liveAvoidFriendPostPushConfig2 : liveAvoidFriendPostPushConfig;
    }

    public static final class LiveAvoidFriendPostPushConfig implements Serializable {
        public static final TypeAdapter ADAPTER = new LiveAvoidFriendPostPushExp_LiveAvoidFriendPostPushConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable")
        public boolean enable;

        @C09CT("friend_post_push_show_with_perf_level")
        public Integer showPerfLevel;

        @C09CT("friend_post_push_show_with_position")
        public Integer showPosition;

        @C09CT("friend_post_push_show_with_multi_watch_count")
        public int showWithMultiWatchCount;

        @C09CT("friend_post_push_show_with_multi_watch_time")
        public Long showWithMultiWatchTime;

        @C09CT("friend_post_push_show_with_single_watch_time")
        public Long showWithSingleWatchTime;

        public LiveAvoidFriendPostPushConfig() {
            this(false, null, null, null, null, 0);
        }

        public final boolean getEnable() {
            return this.enable;
        }

        public final Integer getShowPerfLevel() {
            return this.showPerfLevel;
        }

        public final Integer getShowPosition() {
            return this.showPosition;
        }

        public final int getShowWithMultiWatchCount() {
            return this.showWithMultiWatchCount;
        }

        public final Long getShowWithMultiWatchTime() {
            return this.showWithMultiWatchTime;
        }

        public final Long getShowWithSingleWatchTime() {
            return this.showWithSingleWatchTime;
        }

        public final void setEnable(boolean z) {
            this.enable = z;
        }

        public final void setShowPerfLevel(Integer num) {
            this.showPerfLevel = num;
        }

        public final void setShowPosition(Integer num) {
            this.showPosition = num;
        }

        public final void setShowWithMultiWatchCount(int i) {
            this.showWithMultiWatchCount = i;
        }

        public final void setShowWithMultiWatchTime(Long l) {
            this.showWithMultiWatchTime = l;
        }

        public final void setShowWithSingleWatchTime(Long l) {
            this.showWithSingleWatchTime = l;
        }

        public LiveAvoidFriendPostPushConfig(boolean z, Integer num, Integer num2, Long l, Long l2, int i) {
            this.enable = z;
            this.showPosition = num;
            this.showPerfLevel = num2;
            this.showWithSingleWatchTime = l;
            this.showWithMultiWatchTime = l2;
            this.showWithMultiWatchCount = i;
        }
    }
}
