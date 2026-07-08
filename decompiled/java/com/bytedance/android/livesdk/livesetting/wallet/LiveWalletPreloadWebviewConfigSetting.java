package com.bytedance.android.livesdk.livesetting.wallet;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_wallet_preload_webview_config")
public final class LiveWalletPreloadWebviewConfigSetting {
    public static final LiveWalletPreloadWebviewConfigSetting INSTANCE = new LiveWalletPreloadWebviewConfigSetting();
    public static final WalletPreloadWebviewConfig DEFAULT = new WalletPreloadWebviewConfig();

    public static final class WalletPreloadWebviewConfig {
        public static final TypeAdapter ADAPTER = new LiveWalletPreloadWebviewConfigSetting_WalletPreloadWebviewConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable_precreate")
        public boolean enablePrecreate;

        @C09CT("ttl_seconds")
        public int ttlSeconds;
    }

    public final WalletPreloadWebviewConfig getValue() {
        WalletPreloadWebviewConfig walletPreloadWebviewConfig = (WalletPreloadWebviewConfig) SettingsManager.INSTANCE.getValueSafely(LiveWalletPreloadWebviewConfigSetting.class);
        return walletPreloadWebviewConfig == null ? DEFAULT : walletPreloadWebviewConfig;
    }
}
