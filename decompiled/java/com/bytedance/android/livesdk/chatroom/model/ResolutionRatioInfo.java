package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class ResolutionRatioInfo {

    @C09CT("resolution_ratio_changed")
    public boolean resolutionRatioChanged;

    @C09CT("start_check_resolution_ration_time")
    public long startCheckResolutionRationTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;
}
