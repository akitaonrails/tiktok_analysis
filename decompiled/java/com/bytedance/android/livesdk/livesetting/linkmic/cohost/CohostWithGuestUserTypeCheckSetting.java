package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_with_guest_user_type_check_setting")
public final class CohostWithGuestUserTypeCheckSetting {
    public static final CohostWithGuestUserTypeCheckSetting INSTANCE = new CohostWithGuestUserTypeCheckSetting();
    public static final Configs DEFAULT = new Configs(null, false, 3, null);

    public final Configs getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Configs configs = DEFAULT;
        Configs configs2 = (Configs) settingsManager.getValueSafely("cohost_with_guest_user_type_check_setting", configs);
        return configs2 != null ? configs2 : configs;
    }

    public static final class Configs {
        public static final TypeAdapter ADAPTER = new CohostWithGuestUserTypeCheckSetting_Configs_OptTypeAdapter(NormalGson.singleton());

        @C09CT("additional_host_types")
        public List<Integer> additionalHostTypes;

        @C09CT("should_check_anchor_ab")
        public boolean shouldCheckAnchorAB;

        public Configs() {
            this(null, false, 3, null);
        }

        public Configs(List<Integer> list, boolean z) {
            this.additionalHostTypes = list;
            this.shouldCheckAnchorAB = z;
        }

        public Configs(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Collections.singletonList(0) : list, (i & 2) != 0 ? false : z);
        }
    }
}
