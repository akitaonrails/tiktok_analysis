package com.bytedance.android.livesdk.chatroom.bl.enterroomboost;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_enter_room_update_config")
public final class LiveEnterRoomUpdateSetting {
    public static final LiveEnterRoomUpdateSetting INSTANCE = new LiveEnterRoomUpdateSetting();
    public static final LiveEnterRoomUpdateConfig DEFAULT = new LiveEnterRoomUpdateConfig(false, false, false, 0, true);

    public final LiveEnterRoomUpdateConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveEnterRoomUpdateConfig liveEnterRoomUpdateConfig = DEFAULT;
        LiveEnterRoomUpdateConfig liveEnterRoomUpdateConfig2 = (LiveEnterRoomUpdateConfig) settingsManager.getValueSafely("live_enter_room_update_config", liveEnterRoomUpdateConfig);
        return liveEnterRoomUpdateConfig2 != null ? liveEnterRoomUpdateConfig2 : liveEnterRoomUpdateConfig;
    }

    public final boolean enableForInnerFlow() {
        return isEnable() && getValue().getEnableForInnerFlow();
    }

    public final boolean enableForPreview() {
        return isEnable() && getValue().getEnableForPreview();
    }

    public final int getCacheUpdateMethod() {
        return getValue().getCacheUpdateMethod();
    }

    public final boolean isEnable() {
        return getValue().getEnableEnterRoomUpdate();
    }

    public final boolean isSyncFetchCacheEnable() {
        return getValue().getSyncFetchCacheEnable();
    }

    public static final class LiveEnterRoomUpdateConfig {
        public static final TypeAdapter ADAPTER = new LiveEnterRoomUpdateSetting_LiveEnterRoomUpdateConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("cache_update_method")
        public int cacheUpdateMethod;

        @C09CT("enable_enter_room_update")
        public boolean enableEnterRoomUpdate;

        @C09CT("enable_for_inner_flow")
        public boolean enableForInnerFlow;

        @C09CT("enable_for_preview")
        public boolean enableForPreview;

        @C09CT("sync_fetch_cache_enable")
        public boolean syncFetchCacheEnable;

        public LiveEnterRoomUpdateConfig() {
            this(false, false, false, 0, true);
        }

        public final int getCacheUpdateMethod() {
            return this.cacheUpdateMethod;
        }

        public final boolean getEnableEnterRoomUpdate() {
            return this.enableEnterRoomUpdate;
        }

        public final boolean getEnableForInnerFlow() {
            return this.enableForInnerFlow;
        }

        public final boolean getEnableForPreview() {
            return this.enableForPreview;
        }

        public final boolean getSyncFetchCacheEnable() {
            return this.syncFetchCacheEnable;
        }

        public final void setCacheUpdateMethod(int i) {
            this.cacheUpdateMethod = i;
        }

        public final void setEnableEnterRoomUpdate(boolean z) {
            this.enableEnterRoomUpdate = z;
        }

        public final void setEnableForInnerFlow(boolean z) {
            this.enableForInnerFlow = z;
        }

        public final void setEnableForPreview(boolean z) {
            this.enableForPreview = z;
        }

        public final void setSyncFetchCacheEnable(boolean z) {
            this.syncFetchCacheEnable = z;
        }

        public LiveEnterRoomUpdateConfig(boolean z, boolean z2, boolean z3, int i, boolean z4) {
            this.enableEnterRoomUpdate = z;
            this.enableForPreview = z2;
            this.enableForInnerFlow = z3;
            this.cacheUpdateMethod = i;
            this.syncFetchCacheEnable = z4;
        }
    }
}
