package com.bytedance.android.livesdk.livesetting.subscription;

import android.text.TextUtils;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_subscription_goal_lynx_url")
public final class SubscribeGoalsLynxUrlSetting {
    public static final String DEFAULT = "";
    public static final SubscribeGoalsLynxUrlSetting INSTANCE;
    public static final String anchor_detail_page;
    public static final String anchor_detail_popup;
    public static final String edit_page;
    public static final String edit_popup;
    public static final String guide_page;
    public static final String guide_popup;
    public static final String history_page;
    public static final String history_popup;
    public static final String management_page;
    public static final String management_popup;
    public static final String pinCard;
    public static final String setupTemplatePage;
    public static final String setupTemplatePopup;
    public static final String user_detail_page;
    public static final String user_detail_popup;

    static {
        SubscribeGoalsLynxUrlSetting subscribeGoalsLynxUrlSetting = new SubscribeGoalsLynxUrlSetting();
        INSTANCE = subscribeGoalsLynxUrlSetting;
        guide_popup = subscribeGoalsLynxUrlSetting.getValue().optString("guide_popup", "");
        edit_popup = subscribeGoalsLynxUrlSetting.getValue().optString("edit_popup", "");
        anchor_detail_popup = subscribeGoalsLynxUrlSetting.getValue().optString("anchor_detail_popup", "");
        user_detail_popup = subscribeGoalsLynxUrlSetting.getValue().optString("user_detail_popup", "");
        management_popup = subscribeGoalsLynxUrlSetting.getValue().optString("management_popup", "");
        history_popup = subscribeGoalsLynxUrlSetting.getValue().optString("history_popup", "");
        setupTemplatePopup = subscribeGoalsLynxUrlSetting.getValue().optString("setup_template_popup", "");
        guide_page = subscribeGoalsLynxUrlSetting.getValue().optString("guide_page", "");
        edit_page = subscribeGoalsLynxUrlSetting.getValue().optString("edit_page", "");
        anchor_detail_page = subscribeGoalsLynxUrlSetting.getValue().optString("anchor_detail_page", "");
        user_detail_page = subscribeGoalsLynxUrlSetting.getValue().optString("user_detail_page", "");
        management_page = subscribeGoalsLynxUrlSetting.getValue().optString("management_page", "");
        history_page = subscribeGoalsLynxUrlSetting.getValue().optString("history_page", "");
        setupTemplatePage = subscribeGoalsLynxUrlSetting.getValue().optString("setup_template_page", "");
        pinCard = subscribeGoalsLynxUrlSetting.getValue().optString("pin_card", "");
    }

    public final JSONObject getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        String str = DEFAULT;
        return TextUtils.isEmpty(settingsManager.getStringValue("live_subscription_goal_lynx_url", str)) ? new JSONObject() : new JSONObject(settingsManager.getStringValue("live_subscription_goal_lynx_url", str));
    }

    public final String getAnchor_detail_page() {
        return anchor_detail_page;
    }

    public final String getAnchor_detail_popup() {
        return anchor_detail_popup;
    }

    public final String getEdit_page() {
        return edit_page;
    }

    public final String getEdit_popup() {
        return edit_popup;
    }

    public final String getGuide_page() {
        return guide_page;
    }

    public final String getGuide_popup() {
        return guide_popup;
    }

    public final String getHistory_page() {
        return history_page;
    }

    public final String getHistory_popup() {
        return history_popup;
    }

    public final String getManagement_page() {
        return management_page;
    }

    public final String getManagement_popup() {
        return management_popup;
    }

    public final String getPinCard() {
        return pinCard;
    }

    public final String getSetupTemplatePage() {
        return setupTemplatePage;
    }

    public final String getSetupTemplatePopup() {
        return setupTemplatePopup;
    }

    public final String getUser_detail_page() {
        return user_detail_page;
    }

    public final String getUser_detail_popup() {
        return user_detail_popup;
    }
}
