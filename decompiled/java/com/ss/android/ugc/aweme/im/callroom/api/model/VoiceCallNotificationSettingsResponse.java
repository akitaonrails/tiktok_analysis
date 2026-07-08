package com.ss.android.ugc.aweme.im.callroom.api.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes29.dex */
public final class VoiceCallNotificationSettingsResponse extends BaseResponse {

    @C09CT("settings")
    public VoiceCallSettingsInner settings;

    public static final class VoiceCallSettingsInner {

        @C09CT("voice_call_in_app_push_status")
        public int voiceCallInAppPushStatus;

        @C09CT("voice_call_outapp_app_push_status")
        public int voiceCallOutAppPushStatus;
    }
}
