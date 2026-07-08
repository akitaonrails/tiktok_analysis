package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_layout_qos_filter_rule")
public final class LinkMicLayoutLayerQosMonitorFilterRule {
    public static final LinkMicLayoutLayerQosMonitorFilterRule INSTANCE = new LinkMicLayoutLayerQosMonitorFilterRule();
    public static final EventList DEFAULT = new EventList();

    private final EventList getEventList() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        EventList eventList = DEFAULT;
        EventList eventList2 = (EventList) settingsManager.getValueSafely("linkmic_layout_qos_filter_rule", eventList);
        return eventList2 != null ? eventList2 : eventList;
    }

    public final List<String> getEventBlockedList(boolean z) {
        if (z) {
            return getEventList().audienceBlockedList;
        }
        return getEventList().blockedList;
    }
}
