package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "livesdk_micCount_to_layoutId_map")
public final class LiveSdkMicCountToLayoutIdMap {
    public static final MicCountToLayoutIdMapping DEFAULT;
    public static final LiveSdkMicCountToLayoutIdMap INSTANCE = new LiveSdkMicCountToLayoutIdMap();
    public static final MicCountToLayoutIdMapping settings;

    public static final class MicCountToLayoutIdMapping {
        public static final TypeAdapter ADAPTER;

        @C09CT("fix_grid_2_ui_btn")
        public String fixGrid2UiBtn;

        @C09CT("fix_grid_3_ui_btn")
        public String fixGrid3UiBtn;

        @C09CT("fix_grid_4_ui_btn")
        public String fixGrid4UiBtn;

        @C09CT("fix_grid_5_ui_btn")
        public String fixGrid5UiBtn;

        @C09CT("fix_grid_8_ui_btn")
        public String fixGrid8UiBtn;

        @C09CT("fix_panel_4_ui_btn")
        public String fixPanel4UiBtn;

        @C09CT("fix_panel_6_ui_btn")
        public String fixPanel6UiBtn;

        @C09CT("fix_panel_8_ui_btn")
        public String fixPanel8UiBtn;

        @C09CT("grid_float")
        public String gridFloat;

        @C09CT("origin_grid_float_with_empty_seat")
        public String gridFloatWithEmptySeat;

        @C09CT("origin_unfix_grid_with_empty_seat_always")
        public String gridFloatWithEmptySeatWithoutGuest;

        @C09CT("origin_unfix_grid_with_empty_seat_when_no_guest")
        public String gridFloatWithoutGuest;

        @C09CT("origin_grid_fix")
        public String originGridFix;

        @C09CT("origin_panel_fix")
        public String originPanelFix;

        @C09CT("panel_float")
        public String panelFloat;

        @C09CT("origin_panel_float_with_empty_seat")
        public String panelFloatWithEmptySeat;

        @C09CT("origin_unfix_float_with_empty_seat_always")
        public String panelFloatWithEmptySeatWithoutGuest;

        @C09CT("origin_unfix_float_with_empty_seat_when_no_guest")
        public String panelFloatWithoutGuest;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveSdkMicCountToLayoutIdMap_MicCountToLayoutIdMapping_OptTypeAdapter();
        }

        public MicCountToLayoutIdMapping() {
            this("1016", "1015", "1017", "1006", "1014", "1002", "1012", "1022", "1013", "1011", "1014", "1012", "1013_seat", "1011_seat", "1013_c1", "1011_c1", "1013_seat_c1", "1011_seat_c1");
        }

        public MicCountToLayoutIdMapping(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18) {
            this.fixGrid2UiBtn = str;
            this.fixGrid3UiBtn = str2;
            this.fixGrid4UiBtn = str3;
            this.fixGrid5UiBtn = str4;
            this.fixGrid8UiBtn = str5;
            this.fixPanel4UiBtn = str6;
            this.fixPanel6UiBtn = str7;
            this.fixPanel8UiBtn = str8;
            this.gridFloat = str9;
            this.panelFloat = str10;
            this.originGridFix = str11;
            this.originPanelFix = str12;
            this.gridFloatWithEmptySeat = str13;
            this.panelFloatWithEmptySeat = str14;
            this.gridFloatWithoutGuest = str15;
            this.panelFloatWithoutGuest = str16;
            this.gridFloatWithEmptySeatWithoutGuest = str17;
            this.panelFloatWithEmptySeatWithoutGuest = str18;
        }
    }

    static {
        MicCountToLayoutIdMapping micCountToLayoutIdMapping = new MicCountToLayoutIdMapping("1016", "1015", "1017", "1006", "1014", "1002", "1012", "1022", "1013", "1011", "1014", "1012", "1013_seat", "1011_seat", "1013_c1", "1011_c1", "1013_seat_c1", "1011_seat_c1");
        DEFAULT = micCountToLayoutIdMapping;
        MicCountToLayoutIdMapping micCountToLayoutIdMapping2 = (MicCountToLayoutIdMapping) SettingsManager.INSTANCE.getValueSafely("livesdk_micCount_to_layoutId_map", micCountToLayoutIdMapping);
        if (micCountToLayoutIdMapping2 != null) {
            micCountToLayoutIdMapping = micCountToLayoutIdMapping2;
        }
        settings = micCountToLayoutIdMapping;
    }

    public final String getFixGrid2UiBtnLayoutId() {
        return settings.fixGrid2UiBtn;
    }

    public final String getFixGrid3UiBtnLayoutId() {
        return settings.fixGrid3UiBtn;
    }

    public final String getFixGrid4UiBtnLayoutId() {
        return settings.fixGrid4UiBtn;
    }

    public final String getFixGrid5UiBtnLayoutId() {
        return settings.fixGrid5UiBtn;
    }

    public final String getFixGrid8UiBtnLayoutId() {
        return settings.fixGrid8UiBtn;
    }

    public final String getFixPanel4UiBtnLayoutId() {
        return settings.fixPanel4UiBtn;
    }

    public final String getFixPanel6UiBtnLayoutId() {
        return settings.fixPanel6UiBtn;
    }

    public final String getFixPanel8UiBtnLayoutId() {
        return settings.fixPanel8UiBtn;
    }

    public final String gridFixLayoutId() {
        return settings.originGridFix;
    }

    public final String gridFloatLayoutId() {
        return settings.gridFloat;
    }

    public final String gridFloatLayoutWithEmptyId() {
        return settings.gridFloatWithEmptySeat;
    }

    public final String gridFloatWithEmptySeatWithoutGuestId() {
        return settings.gridFloatWithEmptySeatWithoutGuest;
    }

    public final String gridFloatWithoutGuestId() {
        return settings.gridFloatWithoutGuest;
    }

    public final String panelFixLayoutId() {
        return settings.originPanelFix;
    }

    public final String panelFloatLayoutId() {
        return MultiGuestFloatLayoutStyleMapSettings.INSTANCE.transformPanelFloatRatioLayoutId(settings.panelFloat);
    }

    public final String panelFloatLayoutWithEmptyId() {
        return MultiGuestFloatLayoutStyleMapSettings.INSTANCE.transformPanelFloatRatioLayoutId(settings.panelFloatWithEmptySeat);
    }

    public final String panelFloatWithEmptySeatWithoutGuestId() {
        return MultiGuestFloatLayoutStyleMapSettings.INSTANCE.transformPanelFloatRatioLayoutId(settings.panelFloatWithEmptySeatWithoutGuest);
    }

    public final String panelFloatWithoutGuestId() {
        return MultiGuestFloatLayoutStyleMapSettings.INSTANCE.transformPanelFloatRatioLayoutId(settings.panelFloatWithoutGuest);
    }

    public final MicCountToLayoutIdMapping getSettings() {
        return settings;
    }
}
