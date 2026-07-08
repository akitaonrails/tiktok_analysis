package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("gift_shiny_card_interaction_config_setting")
public final class GiftShinyCardInteractionConfigSetting {
    public static final GiftShinyCardInteractionParams DEFAULT;
    public static final GiftShinyCardInteractionConfigSetting INSTANCE = new GiftShinyCardInteractionConfigSetting();
    public static final GiftShinyCardInteractionParams config;

    public static final class GiftShinyCardInteractionParams {
        public static final TypeAdapter ADAPTER;

        @C09CT("bubble_interval")
        public long bubbleInterval;

        @C09CT("bubble_show_delay")
        public long bubbleShowDelay;

        @C09CT("shiny_card_interact_random_delay")
        public int requestApiRandomDelay;

        static {
            NormalGson.singleton();
            ADAPTER = new GiftShinyCardInteractionConfigSetting_GiftShinyCardInteractionParams_OptTypeAdapter();
        }

        public GiftShinyCardInteractionParams() {
            this(30000L, 2000L, LivePreCreateNextRoomPlayer.ENABLE);
        }

        public GiftShinyCardInteractionParams(long j, long j2, int i) {
            this.bubbleInterval = j;
            this.bubbleShowDelay = j2;
            this.requestApiRandomDelay = i;
        }
    }

    static {
        GiftShinyCardInteractionParams giftShinyCardInteractionParams = new GiftShinyCardInteractionParams(30000L, 2000L, LivePreCreateNextRoomPlayer.ENABLE);
        DEFAULT = giftShinyCardInteractionParams;
        GiftShinyCardInteractionParams giftShinyCardInteractionParams2 = (GiftShinyCardInteractionParams) SettingsManager.INSTANCE.getValueSafely("gift_shiny_card_interaction_config_setting", giftShinyCardInteractionParams);
        if (giftShinyCardInteractionParams2 != null) {
            giftShinyCardInteractionParams = giftShinyCardInteractionParams2;
        }
        config = giftShinyCardInteractionParams;
    }

    public final GiftShinyCardInteractionParams getConfig() {
        return config;
    }

    public final GiftShinyCardInteractionParams getDEFAULT() {
        return DEFAULT;
    }
}
