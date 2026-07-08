package com.bytedance.android.livesdkapi.depend.model.live;

import X.C08FF;
import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public enum LiveMode {
    VIDEO("video_live", false, true),
    AUDIO("audio", false, false),
    THIRD_PARTY("third_party", true, false),
    SCREEN_RECORD("screen_share", true, false),
    LIVE_STUDIO("live_studio", false, false),
    OFFICIAL_ACTIVITY("official_activity", false, false),
    LIVE_VOICE("live_voice", false, false),
    LIVE_MANAGER("live_manager", false, false);


    @C09CT("isStreamingBackground")
    public final boolean isStreamingBackground;

    @C09CT("isUsingCamera")
    public final boolean isUsingCamera;

    @C09CT("logStreamingType")
    public final String logStreamingType;

    public String getModeFromServer() {
        return this == VIDEO ? "live" : this == SCREEN_RECORD ? "live_by_record" : this == THIRD_PARTY ? "computer" : this == LIVE_VOICE ? "live_voice" : "";
    }

    public static boolean isWatchGameLiveOrPCLive(LiveMode liveMode) {
        if (liveMode != THIRD_PARTY && liveMode != SCREEN_RECORD && liveMode != LIVE_STUDIO) {
            return false;
        }
        return true;
    }

    public static LiveMode valueOf(int i) {
        if (i >= 0 && i < values().length) {
            return values()[i];
        }
        return VIDEO;
    }

    public static LiveMode valueOf(String str) {
        return (LiveMode) C08FF.LIZ(LiveMode.class, str);
    }

    LiveMode(String str, boolean z, boolean z2) {
        this.logStreamingType = str;
        this.isStreamingBackground = z;
        this.isUsingCamera = z2;
    }
}
