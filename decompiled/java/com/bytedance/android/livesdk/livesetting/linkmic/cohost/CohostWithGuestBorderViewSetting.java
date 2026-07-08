package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_with_guest_border_view_setting")
public final class CohostWithGuestBorderViewSetting {
    public static final CohostWithGuestBorderViewSetting INSTANCE = new CohostWithGuestBorderViewSetting();
    public static final Configs DEFAULT = new Configs(false, true, 2.0f, 1.5f, 0.0f, C1697810uHb.LJIIJJI(1, 3), true);

    public final Configs getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Configs configs = DEFAULT;
        Configs configs2 = (Configs) settingsManager.getValueSafely("cohost_with_guest_border_view_setting", configs);
        return configs2 != null ? configs2 : configs;
    }

    public final boolean isEnabled() {
        return getValue().isEnabled;
    }

    public final boolean isRemoveWithoutPost() {
        return getValue().removeWithoutPost;
    }

    public final boolean isRtlEnabledForAll() {
        return getValue().rtlEnableRoles.contains(-1);
    }

    public final boolean isRtlEnabledForAnchor() {
        return getValue().rtlEnableRoles.contains(2);
    }

    public final boolean isRtlEnabledForAudience() {
        return getValue().rtlEnableRoles.contains(1);
    }

    public final boolean isRtlEnabledForGuest() {
        return getValue().rtlEnableRoles.contains(3);
    }

    public static final class Configs {
        public static final TypeAdapter ADAPTER = new CohostWithGuestBorderViewSetting_Configs_OptTypeAdapter(NormalGson.singleton());

        @C09CT("corner_radius_extra_dp")
        public float cornerRadiusExtraDp;

        @C09CT("extra_size_dp")
        public float extraSizeDp;

        @C09CT("is_anchor_enabled")
        public boolean isAnchorEnabled;

        @C09CT("is_enabled")
        public boolean isEnabled;

        @C09CT("remove_without_post")
        public boolean removeWithoutPost;

        @C09CT("rtl_enable_role")
        public List<Integer> rtlEnableRoles;

        @C09CT("stroke_width_dp")
        public float strokeWidthDp;

        public Configs() {
            this(false, true, 2.0f, 1.5f, 0.0f, C1697810uHb.LJIIJJI(1, 3), true);
        }

        public Configs(boolean z, boolean z2, float f, float f2, float f3, List<Integer> list, boolean z3) {
            this.isEnabled = z;
            this.isAnchorEnabled = z2;
            this.extraSizeDp = f;
            this.strokeWidthDp = f2;
            this.cornerRadiusExtraDp = f3;
            this.rtlEnableRoles = list;
            this.removeWithoutPost = z3;
        }
    }
}
