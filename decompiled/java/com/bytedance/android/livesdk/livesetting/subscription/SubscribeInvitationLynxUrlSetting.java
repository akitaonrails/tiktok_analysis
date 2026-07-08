package com.bytedance.android.livesdk.livesetting.subscription;

import android.text.TextUtils;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_subscription_invitation_lynx_url")
public final class SubscribeInvitationLynxUrlSetting {
    public static final String DEFAULT = "";
    public static final SubscribeInvitationLynxUrlSetting INSTANCE;
    public static final String activityId;
    public static final String activityUrl;
    public static final String home_page;
    public static final String invitation_card;
    public static final String wrong_invitation;

    static {
        SubscribeInvitationLynxUrlSetting subscribeInvitationLynxUrlSetting = new SubscribeInvitationLynxUrlSetting();
        INSTANCE = subscribeInvitationLynxUrlSetting;
        home_page = subscribeInvitationLynxUrlSetting.getValue().optString("home_page", "");
        invitation_card = subscribeInvitationLynxUrlSetting.getValue().optString("invitation_card", "");
        wrong_invitation = subscribeInvitationLynxUrlSetting.getValue().optString("wrong_invitation", "");
        activityId = subscribeInvitationLynxUrlSetting.getValue().optString("activity_id", "");
        activityUrl = subscribeInvitationLynxUrlSetting.getValue().optString("activity_url", "");
    }

    public final JSONObject getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        String str = DEFAULT;
        return TextUtils.isEmpty(settingsManager.getStringValue("live_subscription_invitation_lynx_url", str)) ? new JSONObject() : new JSONObject(settingsManager.getStringValue("live_subscription_invitation_lynx_url", str));
    }

    public final boolean showActivityEntry() {
        return activityId.length() > 0;
    }

    public final String getActivityId() {
        return activityId;
    }

    public final String getActivityUrl() {
        return activityUrl;
    }

    public final String getHome_page() {
        return home_page;
    }

    public final String getInvitation_card() {
        return invitation_card;
    }

    public final String getWrong_invitation() {
        return wrong_invitation;
    }
}
