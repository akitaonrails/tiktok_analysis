package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class FollowCardMessage extends AbstractC1136060ffY {

    @C09CT("follow_card_id")
    public Long followCardId;

    @C09CT("max_random")
    public Long maxRandom;

    public FollowCardMessage() {
        this.type = C001A.FOLLOW_CARD_MESSAGE;
    }
}
