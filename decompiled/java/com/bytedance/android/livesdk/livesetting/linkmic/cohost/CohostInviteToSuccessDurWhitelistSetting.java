package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("cohost_invite_to_success_dur_whitelist")
public final class CohostInviteToSuccessDurWhitelistSetting {
    public static final CohostInviteToSuccessDurWhitelistSetting INSTANCE = new CohostInviteToSuccessDurWhitelistSetting();
    public static final Configs DEFAULT = new Configs(0, null, 3, null);

    private final Configs getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Configs configs = DEFAULT;
        Configs configs2 = (Configs) settingsManager.getValueSafely("cohost_invite_to_success_dur_whitelist", configs);
        return configs2 != null ? configs2 : configs;
    }

    public final boolean isAllowed(int i) {
        Configs value = getValue();
        int i2 = value.mode;
        if (i2 == 0) {
            return false;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                return false;
            }
            return value.whiteList.contains(Integer.valueOf(i));
        }
        return true;
    }

    public static final class Configs {
        public static final TypeAdapter ADAPTER = new CohostInviteToSuccessDurWhitelistSetting_Configs_OptTypeAdapter(NormalGson.singleton());

        @C09CT("mode")
        public int mode;

        @C09CT("white_list")
        public List<Integer> whiteList;

        public Configs() {
            this(0, null, 3, null);
        }

        public Configs(int i, List<Integer> list) {
            this.mode = i;
            this.whiteList = list;
        }

        public Configs(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
