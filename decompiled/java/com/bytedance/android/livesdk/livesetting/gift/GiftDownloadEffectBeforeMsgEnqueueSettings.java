package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("gift_download_effect_before_msg_enqueue_setting")
public final class GiftDownloadEffectBeforeMsgEnqueueSettings {
    public static final GiftDownloadEffectBeforeEnqueueParams DEFAULT;
    public static final GiftDownloadEffectBeforeMsgEnqueueSettings INSTANCE = new GiftDownloadEffectBeforeMsgEnqueueSettings();
    public static final GiftDownloadEffectBeforeEnqueueParams settingParams;

    static {
        GiftDownloadEffectBeforeEnqueueParams giftDownloadEffectBeforeEnqueueParams = new GiftDownloadEffectBeforeEnqueueParams(0, 5, 4000L);
        DEFAULT = giftDownloadEffectBeforeEnqueueParams;
        GiftDownloadEffectBeforeEnqueueParams giftDownloadEffectBeforeEnqueueParams2 = (GiftDownloadEffectBeforeEnqueueParams) SettingsManager.INSTANCE.getValueSafely("gift_download_effect_before_msg_enqueue_setting", giftDownloadEffectBeforeEnqueueParams);
        if (giftDownloadEffectBeforeEnqueueParams2 != null) {
            giftDownloadEffectBeforeEnqueueParams = giftDownloadEffectBeforeEnqueueParams2;
        }
        settingParams = giftDownloadEffectBeforeEnqueueParams;
    }

    public final long getHotRoomDownloadLoopCheckDelay() {
        return settingParams.hotRoomDownloadLoopCheckDelay;
    }

    public final int getHotRoomSpecialQueueWaitSize() {
        return settingParams.hotRoomSpecialQueueWaitSize;
    }

    public final boolean isEnabled() {
        return settingParams.isEnable > 0;
    }

    public final GiftDownloadEffectBeforeEnqueueParams getDEFAULT() {
        return DEFAULT;
    }

    public static final class GiftDownloadEffectBeforeEnqueueParams {
        public static final TypeAdapter ADAPTER;

        @C09CT("hot_room_download_loop_check_delay")
        public long hotRoomDownloadLoopCheckDelay;

        @C09CT("hot_room_special_queue_wait_size")
        public int hotRoomSpecialQueueWaitSize;

        @C09CT("enable")
        public int isEnable;

        static {
            NormalGson.singleton();
            ADAPTER = new GiftDownloadEffectBeforeMsgEnqueueSettings_GiftDownloadEffectBeforeEnqueueParams_OptTypeAdapter();
        }

        public GiftDownloadEffectBeforeEnqueueParams() {
            this(0, 5, 4000L);
        }

        public GiftDownloadEffectBeforeEnqueueParams(int i, int i2, long j) {
            this.isEnable = i;
            this.hotRoomSpecialQueueWaitSize = i2;
            this.hotRoomDownloadLoopCheckDelay = j;
        }
    }
}
