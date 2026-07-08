package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CT;
import X.C13LP;
import X.C1697810uHb;
import X.C20441214yg;
import X.C2188811AlT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_layout_style_to_layout_id_map")
public final class MultiGuestFloatLayoutStyleMapSettings {
    public static final LayoutStyleMap DEFAULT;
    public static final MultiGuestFloatLayoutStyleMapSettings INSTANCE = new MultiGuestFloatLayoutStyleMapSettings();
    public static int ttlhStreamRatio;

    public static final class LayoutArray {
        public static final TypeAdapter ADAPTER = new MultiGuestFloatLayoutStyleMapSettings_LayoutArray_OptTypeAdapter(NormalGson.singleton());

        @C09CT("16_9")
        public List<String> ratio16To9 = new ArrayList();

        @C09CT("2_1")
        public List<String> ratio2To1 = new ArrayList();
    }

    public static final class LayoutStyleMap {
        public static final TypeAdapter ADAPTER = new MultiGuestFloatLayoutStyleMapSettings_LayoutStyleMap_OptTypeAdapter(NormalGson.singleton());

        @C09CT("panel_float")
        public LayoutArray panelFloat = new LayoutArray();

        @C09CT("grid_float")
        public LayoutArray gridFloat = new LayoutArray();

        @C09CT("ratio_suffix")
        public RatioSuffix ratioSuffix = new RatioSuffix();
    }

    public static final class RatioSuffix {
        public static final TypeAdapter ADAPTER;

        @C09CT("2_1")
        public String ratio2To1 = "";

        static {
            NormalGson.singleton();
            ADAPTER = new MultiGuestFloatLayoutStyleMapSettings_RatioSuffix_OptTypeAdapter();
        }
    }

    static {
        LayoutStyleMap layoutStyleMap = new LayoutStyleMap();
        LayoutArray layoutArray = new LayoutArray();
        layoutArray.ratio16To9 = C1697810uHb.LJ("1011", "1011_c1", "1011_seat", "1011_seat_c1");
        layoutArray.ratio2To1 = C1697810uHb.LJ("1011_21", "1011_c1_21", "1011_seat_21", "1011_seat_c1_21");
        layoutStyleMap.panelFloat = layoutArray;
        LayoutArray layoutArray2 = new LayoutArray();
        layoutArray2.ratio16To9 = new ArrayList();
        layoutArray2.ratio2To1 = C1697810uHb.LJ("1013", "1013_seat");
        layoutStyleMap.gridFloat = layoutArray2;
        RatioSuffix ratioSuffix = new RatioSuffix();
        ratioSuffix.ratio2To1 = "_21";
        layoutStyleMap.ratioSuffix = ratioSuffix;
        DEFAULT = layoutStyleMap;
    }

    public final LayoutStyleMap getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LayoutStyleMap layoutStyleMap = DEFAULT;
        LayoutStyleMap layoutStyleMap2 = (LayoutStyleMap) settingsManager.getValueSafely("multi_guest_layout_style_to_layout_id_map", layoutStyleMap);
        return layoutStyleMap2 != null ? layoutStyleMap2 : layoutStyleMap;
    }

    public final boolean isEnable() {
        return MultiGuestFloatLayoutStyleFeatureEnable.INSTANCE.getValue();
    }

    public final String isInFrameRatio21Lab() {
        return (isEnable() && ttlhStreamRatio == 1) ? "1" : CardStruct.IStatusCode.DEFAULT;
    }

    public final int getTTLHStreamRatio() {
        return ttlhStreamRatio;
    }

    public final void setTTLHStreamRatio(int i) {
        ttlhStreamRatio = i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setTTLHStreamRatio:");
        sbLIZ.append(i);
        C20441214yg.LJIIIZ("MultiGuestFloatLayoutStyleMapSettings", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final String transformPanelFloatRatioLayoutId(String str) {
        if (getTTLHStreamRatio() == 1 && isEnable()) {
            LayoutStyleMap value = getValue();
            if (value.panelFloat.ratio16To9.contains(str)) {
                String str2 = value.ratioSuffix.ratio2To1;
                if (str2.length() > 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(str2);
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
                return str;
            }
            return str;
        }
        return str;
    }

    public final String transformRatioLayoutId(String str) {
        if (getTTLHStreamRatio() == 1 && isEnable()) {
            LayoutStyleMap value = getValue();
            if (C13LP.LJJJJ(str, value.panelFloat.ratio16To9)) {
                String str2 = value.ratioSuffix.ratio2To1;
                if (str2.length() > 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(str2);
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
                return str;
            }
            return str;
        }
        return str;
    }
}
