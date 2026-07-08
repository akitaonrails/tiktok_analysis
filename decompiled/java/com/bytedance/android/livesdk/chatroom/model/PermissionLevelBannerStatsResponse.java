package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class PermissionLevelBannerStatsResponse {

    @C09CT("data")
    public ResponseData data;

    @C09CT("extra")
    public PermissionLevelBannerStatusExtra extra;

    public static final class ResponseData {

        @C09CT("current_value")
        public int currentValue;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;

        @C09CT("text_key")
        public String textKey = "";

        @C09CT("threshold_value")
        public int thresholdValue;
    }
}
