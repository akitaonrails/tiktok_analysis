package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class MultiGuestHangoutLandingMessage extends AbstractC1136060ffY {

    @C09CT("current_time")
    public long currentTime;

    @C09CT("expire_time")
    public long expireTime;

    @C09CT("landing_strategy")
    public int landingStrategy;

    public MultiGuestHangoutLandingMessage() {
        this.type = C001A.MULTI_GUEST_HANGOUT_LANDING_MESSAGE;
    }
}
