package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_mic_room_show_list_url")
public final class LiveMicRoomShowListUrlSetting {
    public static final String DEFAULT = "sslocal://webcast_webview_popup?type=popup&radius=8&url=https%3A%2F%2Fttlive.tiktok.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Flive_house%2Fshow_list%2Findex.html%3Fenter_from%3Dlive_detail_page_icon";
    public static final LiveMicRoomShowListUrlSetting INSTANCE = new LiveMicRoomShowListUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_mic_room_show_list_url", DEFAULT);
    }
}
