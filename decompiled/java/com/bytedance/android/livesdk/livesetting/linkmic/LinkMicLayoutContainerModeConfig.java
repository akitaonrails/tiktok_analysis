package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
@SettingsKey(preciseExperiment = false, value = "triones_layout_mode_config")
public final class LinkMicLayoutContainerModeConfig {
    public static final Map<String, ContainerMode> DEFAULT;
    public static final LinkMicLayoutContainerModeConfig INSTANCE = new LinkMicLayoutContainerModeConfig();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ContainerMode containerMode = new ContainerMode(new ContainerModeScene("fullscreen", "fit", "center", "center", "center", "center", null), new ContainerModeScene("central_operate", "fit", "center", "top", "center", "top", null), new ContainerModeScene("fullscreen", "fit", "center", "center", "center", "center", null), new ContainerModeScene("fullscreen", "fit", "center", "center", "center", "center", null), new ContainerModeScene("fullscreen", "fit", "center", "center", "center", "center", null));
        ContainerMode containerMode2 = new ContainerMode(new ContainerModeScene("fullscreen", "fill_height", "center", "center", "center", "center", null), new ContainerModeScene("fullscreen", "fill_height", "center", "center", "right", "center", null), new ContainerModeScene("fullscreen", "fill_height", "center", "center", "right", "center", null), new ContainerModeScene("fullscreen", "fit", "center", "center", "center", "center", null), new ContainerModeScene("fullscreen", "fit", "center", "center", "center", "center", null));
        ContainerMode containerMode3 = new ContainerMode(new ContainerModeScene("fullscreen", "fit", "center", "center", "center", "center", null), new ContainerModeScene("central_operate", "fill_height", "center", "center", "right", "center", null), new ContainerModeScene("fullscreen", "fill_height", "center", "center", "right", "center", null), new ContainerModeScene("fullscreen", "fit", "center", "center", "center", "center", null), new ContainerModeScene("fullscreen", "fit", "center", "center", "center", "center", null));
        linkedHashMap.put("central_operat", containerMode);
        linkedHashMap.put("full_screen_right_center", containerMode2);
        linkedHashMap.put("central_operat_right_center", containerMode3);
        DEFAULT = linkedHashMap;
    }

    public final Map<String, ContainerMode> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Map<String, ContainerMode> map = DEFAULT;
        Map<String, ContainerMode> map2 = (Map) settingsManager.getValueSafely("triones_layout_mode_config", map);
        return map2 != null ? map2 : map;
    }
}
