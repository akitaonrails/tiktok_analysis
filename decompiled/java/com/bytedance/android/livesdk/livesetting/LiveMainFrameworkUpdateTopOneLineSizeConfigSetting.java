package com.bytedance.android.livesdk.livesetting;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C20441214yg;
import X.C2188811AlT;
import X.C452501pT;
import android.widget.TextView;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.TypeAdapter;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_main_framework_top_one_size_config")
public final class LiveMainFrameworkUpdateTopOneLineSizeConfigSetting {
    public static final TopOneLineSizeConfig DEFAULT;
    public static final LiveMainFrameworkUpdateTopOneLineSizeConfigSetting INSTANCE = new LiveMainFrameworkUpdateTopOneLineSizeConfigSetting();
    public static final C01GW configs$delegate;
    public static float screenWidthDp;
    public static final TopOneLineSizeConfig value;

    static {
        TopOneLineSizeConfig topOneLineSizeConfig = new TopOneLineSizeConfig(false, null, 3, null);
        topOneLineSizeConfig.config = Collections.singletonList(new Config(new int[0], false, -1, -1, -1, -1, -1, -1, -1, -1, -1));
        DEFAULT = topOneLineSizeConfig;
        value = (TopOneLineSizeConfig) SettingsManager.INSTANCE.getValueSafely("live_main_framework_top_one_size_config", topOneLineSizeConfig);
        screenWidthDp = -1.0f;
        configs$delegate = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(69));
    }

    private final List<Config> getConfigs() {
        return (List) configs$delegate.getValue();
    }

    public final boolean enable() {
        TopOneLineSizeConfig topOneLineSizeConfig;
        List<Config> list;
        return screenWidthDp > 0.0f && (topOneLineSizeConfig = value) != null && topOneLineSizeConfig.enable && (list = topOneLineSizeConfig.config) != null && (list.isEmpty() ^ true) && getConfigs().size() == 1;
    }

    private final Config getConfig() {
        if (!getConfigs().isEmpty()) {
            return (Config) ListProtector.get(getConfigs(), 0);
        }
        return null;
    }

    private final int skylightLeftMargin() {
        Config config = getConfig();
        int i = config != null ? config.skylightLeftMargin : -1;
        if (!enable() || i <= 0) {
            return -1;
        }
        return i;
    }

    private final int skylightRightMargin() {
        Config config = getConfig();
        int i = config != null ? config.skylightRightMargin : -1;
        if (!enable() || i <= 0) {
            return -1;
        }
        return i;
    }

    public final boolean showAtLastOneViewer() {
        Config config;
        return enable() && (config = getConfig()) != null && config.showAtLastOneViewer;
    }

    public final int variableMargin() {
        Config config;
        if (!enable() || (config = getConfig()) == null) {
            return -1;
        }
        return config.variableMargin;
    }

    public final int followAreaMinWidthOrDefault(int i) {
        int i2;
        Config config = getConfig();
        if (config != null) {
            i2 = config.followAreaMinWidth;
        } else {
            i2 = -1;
        }
        if (enable() && i2 >= 0) {
            return i2;
        }
        return i;
    }

    public final int followLeftMarginOrDefault(int i) {
        int i2;
        Config config = getConfig();
        if (config != null) {
            i2 = config.followLeftMargin;
        } else {
            i2 = -1;
        }
        if (enable() && i2 >= 0) {
            return i2;
        }
        return i;
    }

    public final int followRightMarginOrDefault(int i) {
        int i2;
        Config config = getConfig();
        if (config != null) {
            i2 = config.followRightMargin;
        } else {
            i2 = -1;
        }
        if (enable() && i2 >= 0) {
            return i2;
        }
        return i;
    }

    public final int nickNameMaxWidthOrDefault(int i) {
        Config config;
        Config config2;
        if (enable() && (config = getConfig()) != null && config.nickNameMaxWidth > 0 && (config2 = getConfig()) != null) {
            return config2.nickNameMaxWidth;
        }
        return i;
    }

    public final int nickNameMinWidthOrDefault(int i) {
        Config config;
        Config config2;
        if (enable() && (config = getConfig()) != null && config.nickNameMinWidth >= 0 && (config2 = getConfig()) != null) {
            return config2.nickNameMinWidth;
        }
        return i;
    }

    public final void setScreenWidth(float f) {
        screenWidthDp = f;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set screen width: ");
        sbLIZ.append(f);
        C20441214yg.LJIIIZ("top_one_config", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final int skylightLeftMarginOrDefault(int i) {
        if (enable() && skylightLeftMargin() > 0) {
            return skylightLeftMargin();
        }
        return i;
    }

    public final int skylightRightMarginOrDefault(int i) {
        if (enable() && skylightRightMargin() > 0) {
            return skylightRightMargin();
        }
        return i;
    }

    public final void updateUserNameSize(TextView textView) {
        Config config;
        Config config2;
        if (enable() && (config = getConfig()) != null && config.nickNameTextSize > 0 && (config2 = getConfig()) != null) {
            textView.setTextSize(config2.nickNameTextSize);
        }
    }

    public final int variableMarginOrDefault(int i) {
        if (enable() && variableMargin() > 0) {
            return variableMargin();
        }
        return i;
    }

    public static final class TopOneLineSizeConfig {
        public static final TypeAdapter ADAPTER = new LiveMainFrameworkUpdateTopOneLineSizeConfigSetting_TopOneLineSizeConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("config")
        public List<Config> config;

        @C09CT("enable")
        public boolean enable;

        public TopOneLineSizeConfig() {
            this(false, null, 3, null);
        }

        public TopOneLineSizeConfig(boolean z, List<Config> list) {
            this.enable = z;
            this.config = list;
        }

        public TopOneLineSizeConfig(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
        }
    }

    public static final class Config {
        public static final TypeAdapter ADAPTER = new LiveMainFrameworkUpdateTopOneLineSizeConfigSetting_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("follow_area_min_width")
        public int followAreaMinWidth;

        @C09CT("follow_left_margin")
        public int followLeftMargin;

        @C09CT("follow_right_margin")
        public int followRightMargin;

        @C09CT("nick_name_max_width")
        public int nickNameMaxWidth;

        @C09CT("nick_name_min_width")
        public int nickNameMinWidth;

        @C09CT("nick_name_text_size")
        public int nickNameTextSize;

        @C09CT("range")
        public int[] range;

        @C09CT("show_at_last_one_top_viewer")
        public boolean showAtLastOneViewer;

        @C09CT("skylight_left_margin")
        public int skylightLeftMargin;

        @C09CT("skylight_right_margin")
        public int skylightRightMargin;

        @C09CT("variable_margin")
        public int variableMargin;

        public Config() {
            this(new int[0], false, -1, -1, -1, -1, -1, -1, -1, -1, -1);
        }

        public Config(int[] iArr, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.range = iArr;
            this.showAtLastOneViewer = z;
            this.variableMargin = i;
            this.nickNameMaxWidth = i2;
            this.nickNameMinWidth = i3;
            this.nickNameTextSize = i4;
            this.followLeftMargin = i5;
            this.followRightMargin = i6;
            this.skylightLeftMargin = i7;
            this.skylightRightMargin = i8;
            this.followAreaMinWidth = i9;
        }
    }
}
