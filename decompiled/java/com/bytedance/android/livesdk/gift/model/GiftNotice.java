package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class GiftNotice {

    @C09CT("biz_type")
    public int bizType;

    @C09CT("icon")
    public ImageModel effect;

    @C09CT("gift_id")
    public long giftId;

    @C09CT("notice_type")
    public int noticeType;

    @C09CT("period_id")
    public Long periodId = 0L;
}
