package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class GiftGlobalMessage extends AbstractC1136060ffY {

    @C09CT("from_user_id")
    public long mFromUserId;

    @C09CT("left_icon")
    public ImageModel mLeftIcon;

    @C09CT("notify")
    public RoomNotifyMessage mNotifyMessage;

    public GiftGlobalMessage() {
        this.type = C001A.GIFT_GLOBAL_MESSAGE;
    }
}
