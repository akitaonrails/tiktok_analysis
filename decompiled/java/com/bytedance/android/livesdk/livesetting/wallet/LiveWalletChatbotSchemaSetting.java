package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_wallet_faq_v3")
public final class LiveWalletChatbotSchemaSetting {
    public static final LiveWalletChatbotSchemaSetting INSTANCE = new LiveWalletChatbotSchemaSetting();
    public static final ChatBotSchema DEFAULT = new ChatBotSchema();

    public final ChatBotSchema getValue() {
        ChatBotSchema chatBotSchema = (ChatBotSchema) SettingsManager.INSTANCE.getValueSafely(LiveWalletChatbotSchemaSetting.class);
        return chatBotSchema == null ? DEFAULT : chatBotSchema;
    }
}
