package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_aigc_wallpaper_config")
public final class MultiGuestAigcWallpaperConfigSetting {
    public static final MultiGuestAigcWallpaperConfigSetting INSTANCE = new MultiGuestAigcWallpaperConfigSetting();
    public static final MultiGuestAigcWallpaperConfigBean DEFAULT = new MultiGuestAigcWallpaperConfigBean(0, 5, 300, 3, 15, 3);

    public static final class MultiGuestAigcWallpaperConfigBean {
        public static final TypeAdapter ADAPTER;

        @C09CT("anchor_game_end_delay_show_time")
        public int anchorEndGameDelayTime;

        @C09CT("wallpaper_create_timeout_interval")
        public int createTimeout;

        @C09CT("audience_each_round_duration")
        public long eachRoundTotalTime;

        @C09CT("audience_wait_accept_time")
        public long invitedDialogCountDownTime;

        @C09CT("audience_delay_show_time")
        public long invitedDialogDelayTime;

        @C09CT("audience_play_max_retry_times")
        public int maxRetryCount;

        static {
            NormalGson.singleton();
            ADAPTER = new MultiGuestAigcWallpaperConfigSetting_MultiGuestAigcWallpaperConfigBean_OptTypeAdapter();
        }

        public MultiGuestAigcWallpaperConfigBean() {
            this(0L, 5L, 300L, 3, 15, 3);
        }

        public MultiGuestAigcWallpaperConfigBean(long j, long j2, long j3, int i, int i2, int i3) {
            this.invitedDialogDelayTime = j;
            this.invitedDialogCountDownTime = j2;
            this.eachRoundTotalTime = j3;
            this.maxRetryCount = i;
            this.createTimeout = i2;
            this.anchorEndGameDelayTime = i3;
        }
    }

    private final MultiGuestAigcWallpaperConfigBean getValue() {
        MultiGuestAigcWallpaperConfigBean multiGuestAigcWallpaperConfigBean = (MultiGuestAigcWallpaperConfigBean) SettingsManager.INSTANCE.getValueSafely(MultiGuestAigcWallpaperConfigSetting.class);
        return multiGuestAigcWallpaperConfigBean == null ? DEFAULT : multiGuestAigcWallpaperConfigBean;
    }

    public final int getAnchorEndGameDelayTime() {
        return getValue().anchorEndGameDelayTime;
    }

    public final int getCreateTimeout() {
        return getValue().createTimeout;
    }

    public final long getEachRoundTotalTime() {
        return getValue().eachRoundTotalTime;
    }

    public final long getInvitedDialogCountDownTime() {
        return getValue().invitedDialogCountDownTime;
    }

    public final long getInvitedDialogDelayTime() {
        return getValue().invitedDialogDelayTime;
    }

    public final int getMaxRetryCount() {
        return getValue().maxRetryCount;
    }
}
