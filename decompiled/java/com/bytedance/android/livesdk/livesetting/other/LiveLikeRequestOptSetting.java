package com.bytedance.android.livesdk.livesetting.other;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_like_request_opt")
public final class LiveLikeRequestOptSetting {
    public static final LiveLikeRequestOptConfig DEFAULT;
    public static final LiveLikeRequestOptSetting INSTANCE = new LiveLikeRequestOptSetting();
    public static final LiveLikeRequestOptConfig value;

    static {
        LiveLikeRequestOptConfig liveLikeRequestOptConfig = new LiveLikeRequestOptConfig(false, false, false);
        DEFAULT = liveLikeRequestOptConfig;
        LiveLikeRequestOptConfig liveLikeRequestOptConfig2 = (LiveLikeRequestOptConfig) SettingsManager.INSTANCE.getValueSafely("live_like_request_opt", liveLikeRequestOptConfig);
        if (liveLikeRequestOptConfig2 != null) {
            liveLikeRequestOptConfig = liveLikeRequestOptConfig2;
        }
        value = liveLikeRequestOptConfig;
    }

    public final boolean enableExitRoomRequest() {
        return value.exitRoomRequest;
    }

    public final boolean enableRetryRequest() {
        return value.retryRequest;
    }

    public final boolean fixMultiGuestAnchorRequest() {
        return value.multiGuestAnchorRequestOpt;
    }

    public static final class LiveLikeRequestOptConfig {
        public static final TypeAdapter ADAPTER = new LiveLikeRequestOptSetting_LiveLikeRequestOptConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("live_like_request_exit_room_opt")
        public boolean exitRoomRequest;

        @C09CT("live_like_multi_guest_request_opt")
        public boolean multiGuestAnchorRequestOpt;

        @C09CT("live_like_request_retry_opt")
        public boolean retryRequest;

        public LiveLikeRequestOptConfig() {
            this(false, false, false);
        }

        public LiveLikeRequestOptConfig(boolean z, boolean z2, boolean z3) {
            this.retryRequest = z;
            this.exitRoomRequest = z2;
            this.multiGuestAnchorRequestOpt = z3;
        }
    }
}
