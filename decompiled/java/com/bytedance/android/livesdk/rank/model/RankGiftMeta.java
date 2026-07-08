package com.bytedance.android.livesdk.rank.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class RankGiftMeta {

    @C09CT("gift_id")
    public long giftId;

    @C09CT("gift_type")
    public long giftType;

    @C09CT("image")
    public ImageModel image;

    @C09CT("name")
    public Text name;

    @C09CT("price")
    public long price;
}
