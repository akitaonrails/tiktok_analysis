package com.ss.android.ugc.aweme.search.voice.core.config;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class TiktokMusicSearchEngineSettingsSettings {
    public static final TiktokMusicSearchEngineSettingsModel LIZ = new TiktokMusicSearchEngineSettingsModel("wss://speech.tiktokv.com", "/api/v1/sauc", "vs_tt_input", 15000, LivePreCreateNextRoomPlayer.ENABLE);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(247));

    public static final class TiktokMusicSearchEngineSettingsModel {

        @C09CT("music_search_address")
        public final String address;

        @C09CT("music_search_cluster")
        public final String cluster;

        @C09CT("music_search_max_process_timeout_int")
        public final int maxProcessTimeout;

        @C09CT("music_search_max_speech_duration_int")
        public final int maxSpeechDuration;

        @C09CT("music_search_uri")
        public final String uri;

        public TiktokMusicSearchEngineSettingsModel() {
            this("wss://speech.tiktokv.com", "/api/v1/sauc", "vs_tt_input", 15000, LivePreCreateNextRoomPlayer.ENABLE);
        }

        public TiktokMusicSearchEngineSettingsModel(String str, String str2, String str3, int i, int i2) {
            this.address = str;
            this.uri = str2;
            this.cluster = str3;
            this.maxSpeechDuration = i;
            this.maxProcessTimeout = i2;
        }
    }
}
