package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C09CT;
import X.C13BV;
import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_public_screen_first_messages_release")
public final class LivePublicScreenFirstMessagesReleaseSetting {
    public static final LivePublicScreenFirstMessagesReleaseSetting INSTANCE = new LivePublicScreenFirstMessagesReleaseSetting();
    public static final Config DEFAULT = new Config();

    public static final class Config {
        public static final TypeAdapter ADAPTER = new LivePublicScreenFirstMessagesReleaseSetting_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable")
        public boolean enable;

        @C09CT("sequence")
        public List<String> sequence = C1697810uHb.LJIIJJI("self_enter", "chat", "ai_summary", "welcome", "warn", "intro", "game_intro", "pk_notice", "ai_summary");

        @C09CT("per_loop_count")
        public List<Integer> perLoopCount = C1697810uHb.LJIIJJI(1, 4, 5);

        @C09CT("per_loop_duration")
        public List<Long> perLoopDuration = C1697810uHb.LJIIJJI(2000L, 3000L, 2000L);

        @C09CT("self_enter_bottom")
        public boolean selfEnterBottom = true;

        @C09CT("hide_fold_area")
        public boolean hideFoldArea = true;

        @C09CT("msg_recv_timeout")
        public long messageReceiveTimeout = 3000;

        @C09CT("max_hot_level")
        public int maxHotLevel = -1;
    }

    private final Config config() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("live_public_screen_first_messages_release", config);
        return config2 != null ? config2 : config;
    }

    public final boolean enable() {
        return config().enable;
    }

    public final boolean hideFoldArea() {
        return config().hideFoldArea;
    }

    public final int maxHotLevel() {
        return config().maxHotLevel;
    }

    public final long messageReceiveTimeout() {
        return config().messageReceiveTimeout;
    }

    public final List<Integer> perLoopCount() {
        List<Integer> list = config().perLoopCount;
        return list == null ? C13BV.INSTANCE : list;
    }

    public final List<Long> perLoopDuration() {
        List<Long> list = config().perLoopDuration;
        return list == null ? C13BV.INSTANCE : list;
    }

    public final List<String> sequence() {
        List<String> list = config().sequence;
        return list == null ? C13BV.INSTANCE : list;
    }
}
