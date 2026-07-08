package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_multi_guest_link_in_room_info")
public final class LinkMicLinkInRoomInfoSettings {
    public static final LinkMicLinkInRoomInfoSettings INSTANCE = new LinkMicLinkInRoomInfoSettings();
    public static final Option DEFAULT = new Option(false, true);
    public static final int $stable = 8;

    public final Option getValue() {
        Option option = (Option) SettingsManager.INSTANCE.getValueSafely(LinkMicLinkInRoomInfoSettings.class);
        return option == null ? DEFAULT : option;
    }

    public static final class Option {
        public static final TypeAdapter ADAPTER = new LinkMicLinkInRoomInfoSettings_Option_OptTypeAdapter(NormalGson.singleton());

        @C09CT("set_is_progress_0")
        public boolean isInProgress_0;

        @C09CT("rtc_jonined_channel_0")
        public boolean rtcJoninedChannel_0;

        public Option() {
            this(false, true);
        }

        public Option(boolean z, boolean z2) {
            this.isInProgress_0 = z;
            this.rtcJoninedChannel_0 = z2;
        }
    }
}
