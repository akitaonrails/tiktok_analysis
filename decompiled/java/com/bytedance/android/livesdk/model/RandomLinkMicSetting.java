package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public class RandomLinkMicSetting {
    public static final TypeAdapter ADAPTER = new RandomLinkMicSetting_OptTypeAdapter(NormalGson.singleton());

    @C09CT("quickly_disconnected_time")
    public int disconnectTime = 10;

    @C09CT("quickly_disconnected_judge")
    public DisconnectJudge disconnectJudge = new DisconnectJudge();

    @C09CT("quickly_disconnected_ban_time")
    public int banTime = 30;

    @C09CT("random_linkmic_bubble_strategy")
    public int bubbleStrategy = 2;

    public static class DisconnectJudge {
        public static final TypeAdapter ADAPTER;

        @C09CT("period")
        public int period = 10;

        @C09CT("frequency")
        public int frequency = 10;

        static {
            NormalGson.singleton();
            ADAPTER = new RandomLinkMicSetting_DisconnectJudge_OptTypeAdapter();
        }
    }
}
