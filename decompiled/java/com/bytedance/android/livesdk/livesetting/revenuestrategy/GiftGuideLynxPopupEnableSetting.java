package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_guide_lynx_popup_config")
public final class GiftGuideLynxPopupEnableSetting {
    public static final GiftGuideLynxPopupEnableSetting INSTANCE = new GiftGuideLynxPopupEnableSetting();
    public static final MockParams DEFAULT = new MockParams(0, "", 140, 177, 147, false, false);

    public static final class MockParams {
        public static final TypeAdapter ADAPTER = new GiftGuideLynxPopupEnableSetting_MockParams_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable")
        public int enable;

        @C09CT("gift_icon_animation")
        public boolean giftIconAnimation;

        @C09CT("height")
        public int height;

        @C09CT("min_height")
        public int minHeight;

        @C09CT("popup_url")
        public String popupUrl;

        @C09CT("width")
        public int width;

        @C09CT("wrap_comment")
        public boolean wrapComment;

        public MockParams() {
            this(0, "", 140, 177, 147, false, false);
        }

        public MockParams(int i, String str, int i2, int i3, int i4, boolean z, boolean z2) {
            this.enable = i;
            this.popupUrl = str;
            this.width = i2;
            this.height = i3;
            this.minHeight = i4;
            this.wrapComment = z;
            this.giftIconAnimation = z2;
        }
    }

    private final MockParams getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MockParams mockParams = DEFAULT;
        MockParams mockParams2 = (MockParams) settingsManager.getValueSafely("live_gift_guide_lynx_popup_config", mockParams);
        return mockParams2 != null ? mockParams2 : mockParams;
    }

    public final boolean enable() {
        return getValue().enable > 0 && getValue().popupUrl.length() > 0;
    }

    public final int height() {
        return getValue().height;
    }

    public final boolean isCommentEvade() {
        return getValue().wrapComment;
    }

    public final boolean isNewGiftGuideAnimation() {
        return getValue().giftIconAnimation;
    }

    public final int minHeight() {
        return getValue().minHeight;
    }

    public final String popupUrl() {
        return getValue().popupUrl;
    }

    public final int width() {
        return getValue().width;
    }
}
