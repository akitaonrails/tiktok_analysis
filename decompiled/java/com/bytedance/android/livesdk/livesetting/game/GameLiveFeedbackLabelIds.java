package com.bytedance.android.livesdk.livesetting.game;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
public final class GameLiveFeedbackLabelIds {
    public static final TypeAdapter ADAPTER;

    @C09CT("game_freezing_or_high_ping")
    public String game_freezing_or_high_ping;

    @C09CT("low_audio_quality")
    public String low_audio_quality;

    @C09CT("video_buffering_or_freezing")
    public String video_buffering_or_freezing;

    static {
        NormalGson.singleton();
        ADAPTER = new GameLiveFeedbackLabelIds_OptTypeAdapter();
    }

    public GameLiveFeedbackLabelIds() {
        this("7196884519075446785", "71968845215375196181", "71968845215375196183");
    }

    public final String getGame_freezing_or_high_ping() {
        return this.game_freezing_or_high_ping;
    }

    public final String getLow_audio_quality() {
        return this.low_audio_quality;
    }

    public final String getVideo_buffering_or_freezing() {
        return this.video_buffering_or_freezing;
    }

    public final void setGame_freezing_or_high_ping(String str) {
        this.game_freezing_or_high_ping = str;
    }

    public final void setLow_audio_quality(String str) {
        this.low_audio_quality = str;
    }

    public final void setVideo_buffering_or_freezing(String str) {
        this.video_buffering_or_freezing = str;
    }

    public GameLiveFeedbackLabelIds(String str, String str2, String str3) {
        this.game_freezing_or_high_ping = str;
        this.video_buffering_or_freezing = str2;
        this.low_audio_quality = str3;
    }
}
