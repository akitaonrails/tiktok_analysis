package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("preview_revision_icon_schema")
public final class PreviewRevisionSetting {
    public static final IconSchema DEFAULT;
    public static final PreviewRevisionSetting INSTANCE = new PreviewRevisionSetting();
    public static final IconSchema config;

    static {
        IconSchema iconSchema = new IconSchema("https://sf16-va.tiktokcdn.com/obj/eden-va2/logpbybvo/shop.png");
        DEFAULT = iconSchema;
        config = (IconSchema) SettingsManager.INSTANCE.getValueSafely("preview_revision_icon_schema", iconSchema);
    }

    public final String getShopSchema() {
        return config.getPreloadSchema();
    }
}
