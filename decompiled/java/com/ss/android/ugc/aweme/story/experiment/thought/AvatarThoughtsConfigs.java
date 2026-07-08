package com.ss.android.ugc.aweme.story.experiment.thought;

import X.C09CT;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes20.dex */
public final class AvatarThoughtsConfigs {
    public static final Configs LIZ = new Configs(LivePreCreateNextRoomPlayer.ENABLE, 1751353200000L, 5);

    public static final class Configs {

        @C09CT("new_user_guide_expire_date")
        public final long newUserGuideExpireDate;

        @C09CT("show_toast_delay")
        public final int showToastDelay;

        @C09CT("try_it_button_show_times")
        public final int tryItButtonShowTimes;

        public Configs() {
            this(LivePreCreateNextRoomPlayer.ENABLE, 1751353200000L, 5);
        }

        public Configs(int i, long j, int i2) {
            this.showToastDelay = i;
            this.newUserGuideExpireDate = j;
            this.tryItButtonShowTimes = i2;
        }
    }

    public static final Configs LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        Configs configs = LIZ;
        Configs configs2 = (Configs) settingsManagerLIZLLL.LJIIIIZZ("avatar_thoughts_configs", Configs.class, configs);
        return configs2 != null ? configs2 : configs;
    }
}
