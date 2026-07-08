package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import X.C13LN;
import X.C2188811AlT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.google.gson.TypeAdapter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.u;

/* JADX INFO: loaded from: classes34.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_ticket_setting")
public final class LinkMicTicketIconUrlSetting {
    public static final TicketConfig DEFAULT;
    public static final LinkMicTicketIconUrlSetting INSTANCE;

    static {
        LinkMicTicketIconUrlSetting linkMicTicketIconUrlSetting = new LinkMicTicketIconUrlSetting();
        INSTANCE = linkMicTicketIconUrlSetting;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("default", "https://p16-webcast.tiktokcdn.com/img/webcast-sg/tiktok_linkmic_coin@3x.png~0x0.png");
        linkedHashMap.put("winner", "https://p16-webcast.tiktokcdn.com/img/webcast-sg/mg_winner.png~0x0.png");
        linkedHashMap.put("loser", "https://p16-webcast.tiktokcdn.com/img/webcast-sg/multi_guest_loser.png~0x0.png");
        linkedHashMap.put("mg_default", "https://p16-webcast.tiktokcdn.com/img/webcast-sg/tiktok_linkmic_coin@3x.png~0x0.png");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("winner", "#F6BA2AFF");
        linkedHashMap2.put("loser", "#25252599");
        linkedHashMap2.put("mg_default", "#25252599");
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("be_winner", linkMicTicketIconUrlSetting.getWinnerAnimation());
        linkedHashMap3.put("be_loser", linkMicTicketIconUrlSetting.getNormalTypeAnimation());
        linkedHashMap3.put("be_normal", linkMicTicketIconUrlSetting.getNormalTypeAnimation());
        DEFAULT = new TicketConfig(linkedHashMap, linkedHashMap2, null, linkedHashMap3);
    }

    private final AnimationValue getNormalTypeAnimation() {
        return new AnimationValue("normal", null, new NormalAnimationValue(200, 150));
    }

    private final AnimationValue getWinnerAnimation() {
        return new AnimationValue("path", new PathAnimationValue("tiktok_live_interaction_ticket", "ttlive_mg_score_winner", 98, 116, "49_58", "10_10", 12, Float.valueOf(0.66f), Float.valueOf(1.0f), 2400), null);
    }

    public final TicketConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        TicketConfig ticketConfig = DEFAULT;
        TicketConfig ticketConfig2 = (TicketConfig) settingsManager.getValueSafely("multi_guest_ticket_setting", ticketConfig);
        return ticketConfig2 != null ? ticketConfig2 : ticketConfig;
    }

    private final String rgbaToArgb(String str) {
        if (str.length() != 8 && str.length() != 9) {
            if (str.length() == 6) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('#');
                sbLIZ.append(str);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            return str;
        }
        if (u.LJJIIJZLJL(str, "#", false)) {
            str = C13LN.LJLJLJ(1, str);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(C13LN.LL(2, str));
        sbLIZ2.append(C13LN.LJLL(2, str));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append('#');
        sbLIZ3.append(strLIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    public final AnimationValue getAnimationInfo(String str) {
        Map<String, AnimationValue> map = getValue().animationNameToValueMap;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public final AnimationValue getAnimationValueByKey(String str) {
        Map<String, AnimationValue> map = getValue().animationNameToValueMap;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public final Integer getIconBgColorByName(String str) {
        Map<String, String> map;
        String str2;
        if (str == null || (map = getValue().styleNameToColorMap) == null || (str2 = map.get(str)) == null || str2.length() <= 0) {
            return null;
        }
        return Integer.valueOf(ColorProtector.parseColor(rgbaToArgb(str2)));
    }

    public final String getIconValueByName(String str) {
        String str2;
        Map<String, String> map = getValue().styleNameToUrlMap;
        if (map == null || (str2 = map.get(str)) == null) {
            return "";
        }
        return str2;
    }

    public final String getPath(AnimationValue animationValue) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        PathAnimationValue pathAnimationValue = animationValue.pathValue;
        String str2 = null;
        if (pathAnimationValue != null) {
            str = pathAnimationValue.channelName;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append('/');
        PathAnimationValue pathAnimationValue2 = animationValue.pathValue;
        if (pathAnimationValue2 != null) {
            str2 = pathAnimationValue2.fileName;
        }
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Integer getRankBgColorByName(String str) {
        Map<String, String> map;
        String str2;
        if (str == null || (map = getValue().iconName2RankBgMap) == null || (str2 = map.get(str)) == null || str2.length() <= 0) {
            return null;
        }
        return Integer.valueOf(ColorProtector.parseColor(rgbaToArgb(str2)));
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class AnimationValue {
        public static final TypeAdapter ADAPTER = new LinkMicTicketIconUrlSetting_AnimationValue_OptTypeAdapter(NormalGson.singleton());

        @C09CT("normal_value")
        public NormalAnimationValue normalValue;

        @C09CT("path_value")
        public PathAnimationValue pathValue;

        @C09CT("type")
        public String type;

        public AnimationValue() {
            this(null, null, null);
        }

        public AnimationValue(String str, PathAnimationValue pathAnimationValue, NormalAnimationValue normalAnimationValue) {
            this.type = str;
            this.pathValue = pathAnimationValue;
            this.normalValue = normalAnimationValue;
        }
    }

    public static final class TicketConfig {
        public static final TypeAdapter ADAPTER = new LinkMicTicketIconUrlSetting_TicketConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("animation_name_to_value_map")
        public Map<String, AnimationValue> animationNameToValueMap;

        @C09CT("rank_bg_color_map")
        public Map<String, String> iconName2RankBgMap;

        @C09CT("style_name_to_color_map")
        public Map<String, String> styleNameToColorMap;

        @C09CT("style_name_to_url_map")
        public Map<String, String> styleNameToUrlMap;

        public TicketConfig() {
            this(null, null, null, null);
        }

        public TicketConfig(Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, AnimationValue> map4) {
            this.styleNameToUrlMap = map;
            this.styleNameToColorMap = map2;
            this.iconName2RankBgMap = map3;
            this.animationNameToValueMap = map4;
        }
    }
}
