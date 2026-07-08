package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes35.dex */
@SettingsKey(preciseExperiment = false, value = "live_samsung_foldscreen_device_list")
public final class LiveSamsungFoldScreenDeviceListSetting {
    public static final String[] DEFAULT;
    public static final LiveSamsungFoldScreenDeviceListSetting INSTANCE = new LiveSamsungFoldScreenDeviceListSetting();
    public static final String[] defaultSamsungFoldDevices;

    static {
        String[] strArr = {"SM-F900F", "SM-F900N", "SM-F9000", "SM-F900U", "SM-F900U1", "SM-F916B", "SM-F916N", "SM-F9160", "SM-F916U", "SM-F916U1", "SM-F926B", "SM-F926N", "SM-F9260", "SM-F926U", "SM-F926U1", "SM-F936B", "SM-F936N", "SM-F9360", "SM-F936U", "SM-F936U1", "SM-F946B", "SM-F946N", "SM-F9460", "SM-F946U", "SM-F946U1", "SM-F956B", "SM-F956N", "SM-F9560", "SM-F956U", "SM-F956U1", "SM-F700F", "SM-F700N", "SM-F7000", "SM-F700U", "SM-F700U1", "SM-F707B", "SM-F707N", "SM-F7070", "SM-F707U", "SM-F707U1", "SM-F711B", "SM-F711N", "SM-F7110", "SM-F711U", "SM-F711U1", "SM-F721B", "SM-F721N", "SM-F7210", "SM-F721U", "SM-F721U1", "SM-F731B", "SM-F731N", "SM-F7310", "SM-F731U", "SM-F731U1", "SM-F741B", "SM-F741N", "SM-F7410", "SM-F741U", "SM-F741U1", "SM-W2020", "SM-W2021", "SM-W2022", "SM-W2023", "SM-W2024"};
        defaultSamsungFoldDevices = strArr;
        DEFAULT = strArr;
    }

    public final String[] getConfig() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_samsung_foldscreen_device_list", DEFAULT);
    }
}
