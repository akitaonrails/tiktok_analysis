package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_sdk_channel_ab_info_report")
public final class LinkMicChannelAbInfoReport {
    public static final ChannelAbInfoStruct DEFAULT;
    public static final LinkMicChannelAbInfoReport INSTANCE = new LinkMicChannelAbInfoReport();
    public static final ChannelAbInfoStruct settings;

    static {
        ChannelAbInfoStruct channelAbInfoStruct = new ChannelAbInfoStruct(null, null);
        DEFAULT = channelAbInfoStruct;
        ChannelAbInfoStruct channelAbInfoStruct2 = (ChannelAbInfoStruct) SettingsManager.INSTANCE.getValueSafely("linkmic_sdk_channel_ab_info_report", channelAbInfoStruct);
        if (channelAbInfoStruct2 != null) {
            channelAbInfoStruct = channelAbInfoStruct2;
        }
        settings = channelAbInfoStruct;
    }

    public final List<String> getMultiGuestChannelAbInfoReportList() {
        return settings.multiGuestList;
    }

    public final List<String> getMultiHostChannelAbInfoReportList() {
        return settings.multiHostList;
    }

    public final ChannelAbInfoStruct getSettings() {
        return settings;
    }

    public static final class ChannelAbInfoStruct {
        public static final TypeAdapter ADAPTER = new LinkMicChannelAbInfoReport_ChannelAbInfoStruct_OptTypeAdapter(NormalGson.singleton());

        @C09CT("4")
        public List<String> multiGuestList;

        @C09CT("2")
        public List<String> multiHostList;

        public ChannelAbInfoStruct() {
            this(null, null);
        }

        public ChannelAbInfoStruct(List<String> list, List<String> list2) {
            this.multiHostList = list;
            this.multiGuestList = list2;
        }
    }
}
