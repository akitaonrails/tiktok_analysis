package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes36.dex */
@SettingsKey("live_land_float_message_display_duration")
public final class LiveFloatMsgDisplayDurationSetting {
    public static final LiveFloatMsgDisplayDurationSetting INSTANCE = new LiveFloatMsgDisplayDurationSetting();
    public static final MessageDuration DEFAULT = new MessageDuration(Mp4ScreenVideoLoadTimeout.CONTROL, Mp4ScreenVideoLoadTimeout.CONTROL, Mp4ScreenVideoLoadTimeout.CONTROL, Mp4ScreenVideoLoadTimeout.CONTROL, 2000, 2000);

    public static final class MessageDuration {
        public static final TypeAdapter ADAPTER;

        @C09CT("bottom_message")
        public long bottomMessageDuration;

        @C09CT("chat_message")
        public long chatMessageDuration;

        @C09CT("intro_message")
        public long introMessage;

        @C09CT("pre_show_end_message")
        public long preShowEndMessage;

        @C09CT("pre_show_message")
        public long preShowMessage;

        @C09CT("room_message")
        public long roomMessageDuration;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveFloatMsgDisplayDurationSetting_MessageDuration_OptTypeAdapter();
        }

        public MessageDuration() {
            this(Mp4ScreenVideoLoadTimeout.CONTROL, Mp4ScreenVideoLoadTimeout.CONTROL, Mp4ScreenVideoLoadTimeout.CONTROL, Mp4ScreenVideoLoadTimeout.CONTROL, 2000L, 2000L);
        }

        public MessageDuration(long j, long j2, long j3, long j4, long j5, long j6) {
            this.chatMessageDuration = j;
            this.bottomMessageDuration = j2;
            this.roomMessageDuration = j3;
            this.introMessage = j4;
            this.preShowMessage = j5;
            this.preShowEndMessage = j6;
        }
    }

    public final long getBottomMsgDuration() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MessageDuration messageDuration = DEFAULT;
        MessageDuration messageDuration2 = (MessageDuration) settingsManager.getValueSafely("live_land_float_message_display_duration", messageDuration);
        if (messageDuration2 != null) {
            messageDuration = messageDuration2;
        }
        return messageDuration.bottomMessageDuration;
    }

    public final long getChatMsgDuration() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MessageDuration messageDuration = DEFAULT;
        MessageDuration messageDuration2 = (MessageDuration) settingsManager.getValueSafely("live_land_float_message_display_duration", messageDuration);
        if (messageDuration2 != null) {
            messageDuration = messageDuration2;
        }
        return messageDuration.chatMessageDuration;
    }

    public final long getIntroMsgDuration() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MessageDuration messageDuration = DEFAULT;
        MessageDuration messageDuration2 = (MessageDuration) settingsManager.getValueSafely("live_land_float_message_display_duration", messageDuration);
        if (messageDuration2 != null) {
            messageDuration = messageDuration2;
        }
        return messageDuration.introMessage;
    }

    public final long getPreShowEndMsgDuration() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MessageDuration messageDuration = DEFAULT;
        MessageDuration messageDuration2 = (MessageDuration) settingsManager.getValueSafely("live_land_float_message_display_duration", messageDuration);
        if (messageDuration2 != null) {
            messageDuration = messageDuration2;
        }
        return messageDuration.preShowEndMessage;
    }

    public final long getPreShowMsgDuration() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MessageDuration messageDuration = DEFAULT;
        MessageDuration messageDuration2 = (MessageDuration) settingsManager.getValueSafely("live_land_float_message_display_duration", messageDuration);
        if (messageDuration2 != null) {
            messageDuration = messageDuration2;
        }
        return messageDuration.preShowMessage;
    }

    public final long getRoomMsgDuration() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MessageDuration messageDuration = DEFAULT;
        MessageDuration messageDuration2 = (MessageDuration) settingsManager.getValueSafely("live_land_float_message_display_duration", messageDuration);
        if (messageDuration2 != null) {
            messageDuration = messageDuration2;
        }
        return messageDuration.roomMessageDuration;
    }
}
