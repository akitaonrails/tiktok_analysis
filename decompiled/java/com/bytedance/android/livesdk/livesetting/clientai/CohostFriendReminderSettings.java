package com.bytedance.android.livesdk.livesetting.clientai;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("cohost_friend_reminder_v2")
public final class CohostFriendReminderSettings {
    public static final CohostFriendReminderSettings INSTANCE = new CohostFriendReminderSettings();
    public static final CohostFriendReminderParams DEFAULT = new CohostFriendReminderParams(0, "live_interact_cohost_friend_notice_trigger_v3", "live_cohost_friend_notice_optimize_strategy");

    private final CohostFriendReminderParams getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        CohostFriendReminderParams cohostFriendReminderParams = DEFAULT;
        CohostFriendReminderParams cohostFriendReminderParams2 = (CohostFriendReminderParams) settingsManager.getValueSafely("cohost_friend_reminder_v2", cohostFriendReminderParams);
        return cohostFriendReminderParams2 != null ? cohostFriendReminderParams2 : cohostFriendReminderParams;
    }

    public final String algoPkgName() {
        return getValue().algoPkgName;
    }

    public final boolean enable() {
        return getValue().enable > 0;
    }

    public final String modelName() {
        return getValue().modelName;
    }

    public static final class CohostFriendReminderParams {
        public static final TypeAdapter ADAPTER;

        @C09CT("algo_package_name")
        public String algoPkgName;

        @C09CT("enable")
        public int enable;

        @C09CT("model_name")
        public String modelName;

        static {
            NormalGson.singleton();
            ADAPTER = new CohostFriendReminderSettings_CohostFriendReminderParams_OptTypeAdapter();
        }

        public CohostFriendReminderParams() {
            this(0, "live_interact_cohost_friend_notice_trigger_v3", "live_cohost_friend_notice_optimize_strategy");
        }

        public CohostFriendReminderParams(int i, String str, String str2) {
            this.enable = i;
            this.modelName = str;
            this.algoPkgName = str2;
        }
    }
}
