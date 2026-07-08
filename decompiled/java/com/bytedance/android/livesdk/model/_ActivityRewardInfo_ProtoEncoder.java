package com.bytedance.android.livesdk.model;

import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;

/* JADX INFO: loaded from: classes18.dex */
public final class _ActivityRewardInfo_ProtoEncoder implements InterfaceC1132110fZB<ActivityRewardInfo> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, ActivityRewardInfo activityRewardInfo) {
        ActivityRewardInfo activityRewardInfo2 = activityRewardInfo;
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 1, activityRewardInfo2.mBage);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 2, activityRewardInfo2.mStoryTag);
    }
}
