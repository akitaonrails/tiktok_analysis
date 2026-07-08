package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("ttlive_viewer_wishes_config")
public final class ViewerWishesConfig {
    public static final ViewerWishesConfig INSTANCE = new ViewerWishesConfig();
    public static final ViewerWishesConfigModel DEFAULT = new ViewerWishesConfigModel(true, true, 30, 3);

    public final ViewerWishesConfigModel getGetValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        ViewerWishesConfigModel viewerWishesConfigModel = DEFAULT;
        ViewerWishesConfigModel viewerWishesConfigModel2 = (ViewerWishesConfigModel) settingsManager.getValueSafely("ttlive_viewer_wishes_config", viewerWishesConfigModel);
        return viewerWishesConfigModel2 != null ? viewerWishesConfigModel2 : viewerWishesConfigModel;
    }

    public static final class ViewerWishesConfigModel {
        public static final TypeAdapter ADAPTER = new ViewerWishesConfig_ViewerWishesConfigModel_OptTypeAdapter(NormalGson.singleton());

        @C09CT("live_viewer_wishes_anchor_enabled")
        public boolean anchorEnabled;

        @C09CT("live_viewer_wishes_audience_enabled")
        public boolean audienceEnabled;

        @C09CT("result_display_sec")
        public int resultDisplaySec;

        @C09CT("settlement_duration")
        public int settlementDuration;

        public ViewerWishesConfigModel() {
            this(true, true, 30, 3);
        }

        public ViewerWishesConfigModel(boolean z, boolean z2, int i, int i2) {
            this.audienceEnabled = z;
            this.anchorEnabled = z2;
            this.resultDisplaySec = i;
            this.settlementDuration = i2;
        }
    }
}
