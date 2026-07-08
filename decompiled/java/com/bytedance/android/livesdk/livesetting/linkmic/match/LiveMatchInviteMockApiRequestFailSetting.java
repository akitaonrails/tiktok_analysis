package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_invite_mock_api_request_fail")
public final class LiveMatchInviteMockApiRequestFailSetting {
    public static final LiveMatchInviteMockApiRequestFailSetting INSTANCE = new LiveMatchInviteMockApiRequestFailSetting();
    public static final LiveMatchInviteMockApiRequestFailData DEFAULT = new LiveMatchInviteMockApiRequestFailData(false, 4029011, false);

    public final LiveMatchInviteMockApiRequestFailData getValue() {
        LiveMatchInviteMockApiRequestFailData liveMatchInviteMockApiRequestFailData = (LiveMatchInviteMockApiRequestFailData) SettingsManager.INSTANCE.getValueSafely(LiveMatchInviteMockApiRequestFailSetting.class);
        return liveMatchInviteMockApiRequestFailData == null ? DEFAULT : liveMatchInviteMockApiRequestFailData;
    }

    public final int errorCode() {
        return getValue().errorCode;
    }

    public final boolean isEnabled() {
        return getValue().enable;
    }

    public final boolean shouldMockResend() {
        return getValue().mockResend;
    }

    public final LiveMatchInviteMockApiRequestFailData getDEFAULT() {
        return DEFAULT;
    }
}
