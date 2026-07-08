package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_event_page_url")
public final class LiveEventPageLynxUrl {
    public static final LiveEventPageLynxUrl INSTANCE = new LiveEventPageLynxUrl();
    public static final Map<String, String> DEFAULT = C2097608Jq.LJ();

    public final String getEventCardLynxUrl() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Map<String, String> map = DEFAULT;
        Map<String, String> map2 = (Map) settingsManager.getValueSafely("live_event_page_url", map);
        if (map2 != null) {
            map = map2;
        }
        return map.containsKey("event_card") ? map.get("event_card") : null;
    }

    public final String getInLiveEventListSchema() {
        String str;
        Map map = (Map) SettingsManager.INSTANCE.getValueSafely("live_event_page_url", DEFAULT);
        return (map == null || (str = (String) map.get("inlive_event_list")) == null) ? "" : str;
    }

    public final String getLiveEvent60PercentBgMaskSchema() {
        String str;
        Map map = (Map) SettingsManager.INSTANCE.getValueSafely("live_event_page_url", DEFAULT);
        return (map == null || (str = (String) map.get("event_detail_6_percent_bg_mask")) == null) ? "" : str;
    }

    public final String getLiveEvent60PercentSchema() {
        String str;
        Map map = (Map) SettingsManager.INSTANCE.getValueSafely("live_event_page_url", DEFAULT);
        return (map == null || (str = (String) map.get("event_detail_6_percent")) == null) ? "" : str;
    }

    public final String getLiveEvent9percentSchema() {
        String str;
        Map map = (Map) SettingsManager.INSTANCE.getValueSafely("live_event_page_url", DEFAULT);
        return (map == null || (str = (String) map.get("event_detail_room_9_percent")) == null) ? "" : str;
    }

    public final String getLiveEventCalendarSchema() {
        String str;
        Map map = (Map) SettingsManager.INSTANCE.getValueSafely("live_event_page_url", DEFAULT);
        return (map == null || (str = (String) map.get("event_calendar")) == null) ? "" : str;
    }

    public final String getLiveEventDialogSchema() {
        String str;
        Map map = (Map) SettingsManager.INSTANCE.getValueSafely("live_event_page_url", DEFAULT);
        return (map == null || (str = (String) map.get("event_detail_room")) == null) ? "" : str;
    }

    public final String getLiveEventGuideSchema() {
        String str;
        Map map = (Map) SettingsManager.INSTANCE.getValueSafely("live_event_page_url", DEFAULT);
        return (map == null || (str = (String) map.get("event_guide_new")) == null) ? "aweme://roma_redirect/?spark_page=live_event_guide_new" : str;
    }

    public final String getLiveEventListLynxSchema() {
        String str;
        Map map = (Map) SettingsManager.INSTANCE.getValueSafely("live_event_page_url", DEFAULT);
        return (map == null || (str = (String) map.get("event_list_lynx")) == null) ? "" : str;
    }

    public final String getLiveEventPageSchema() {
        String str;
        Map map = (Map) SettingsManager.INSTANCE.getValueSafely("live_event_page_url", DEFAULT);
        return (map == null || (str = (String) map.get("event_detail")) == null) ? "" : str;
    }

    public final String getLiveEventSchemaInGroupChat() {
        Map map = (Map) SettingsManager.INSTANCE.getValueSafely("live_event_page_url", DEFAULT);
        if (map != null) {
            return (String) map.get("group_live_event_list");
        }
        return null;
    }

    public final String getLiveEventStickerGuidanceSchema() {
        String str;
        Map map = (Map) SettingsManager.INSTANCE.getValueSafely("live_event_page_url", DEFAULT);
        return (map == null || (str = (String) map.get("event_sticker_guide_page")) == null) ? "" : str;
    }

    public final String getLiveEventTimePickerSchema() {
        String str;
        Map map = (Map) SettingsManager.INSTANCE.getValueSafely("live_event_page_url", DEFAULT);
        return (map == null || (str = (String) map.get("event_time_picker")) == null) ? "" : str;
    }

    public final Map<String, String> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Map<String, String> map = DEFAULT;
        Map<String, String> map2 = (Map) settingsManager.getValueSafely("live_event_page_url", map);
        return map2 != null ? map2 : map;
    }

    public final Map<String, String> getDEFAULT() {
        return DEFAULT;
    }
}
