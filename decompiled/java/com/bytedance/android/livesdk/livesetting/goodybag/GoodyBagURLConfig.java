package com.bytedance.android.livesdk.livesetting.goodybag;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_goody_bag_router_config")
public final class GoodyBagURLConfig {
    public static final GoodyBagURLConfig INSTANCE = new GoodyBagURLConfig();
    public static GoodyBagUrls DEFAULT = new GoodyBagUrls();

    public final String getAnchorOpenUrl() {
        GoodyBagUrls goodyBagUrls = (GoodyBagUrls) SettingsManager.INSTANCE.getValueSafely("live_goody_bag_router_config", DEFAULT);
        if (goodyBagUrls != null) {
            return goodyBagUrls.waitingOpenSchema;
        }
        return null;
    }

    public final String getAudienceOpenUrl() {
        GoodyBagUrls goodyBagUrls = (GoodyBagUrls) SettingsManager.INSTANCE.getValueSafely("live_goody_bag_router_config", DEFAULT);
        if (goodyBagUrls != null) {
            return goodyBagUrls.openAudienceSchema;
        }
        return null;
    }

    public final String getFaqUrl() {
        GoodyBagUrls goodyBagUrls = (GoodyBagUrls) SettingsManager.INSTANCE.getValueSafely("live_goody_bag_router_config", DEFAULT);
        if (goodyBagUrls != null) {
            return goodyBagUrls.goodyBagFaqSchema;
        }
        return null;
    }

    public final String getSendUrl() {
        GoodyBagUrls goodyBagUrls = (GoodyBagUrls) SettingsManager.INSTANCE.getValueSafely("live_goody_bag_router_config", DEFAULT);
        if (goodyBagUrls != null) {
            return goodyBagUrls.sendUrl;
        }
        return null;
    }

    public final String getShortTouchUrl() {
        GoodyBagUrls goodyBagUrls = (GoodyBagUrls) SettingsManager.INSTANCE.getValueSafely("live_goody_bag_router_config", DEFAULT);
        if (goodyBagUrls != null) {
            return goodyBagUrls.shortTouch;
        }
        return null;
    }

    public final GoodyBagUrls getDEFAULT() {
        return DEFAULT;
    }

    public final void setDEFAULT(GoodyBagUrls goodyBagUrls) {
        DEFAULT = goodyBagUrls;
    }
}
