package com.bytedance.android.livesdk.model.message.ext;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class EcTaskRefreshCouponListMessage extends AbstractC1136060ffY {

    @C09CT("message_entity")
    public EcTaskRefreshCouponListEntity entity;

    @Override // X.AbstractC1136060ffY, com.ss.ugc.live.sdk.message.data.IMessage
    public final int getIntType() {
        return 100003;
    }

    public EcTaskRefreshCouponListMessage() {
        this.type = C001A.EC_TASK_REFRESH_COUPON_LIST_MESSAGE;
    }
}
