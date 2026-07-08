package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public class BannerUpdateMessage extends AbstractC1136060ffY {

    @C09CT("data")
    public BannerInRoomCollection data;

    @C09CT("position")
    public Integer position;

    @Override // X.AbstractC1136060ffY, com.ss.ugc.live.sdk.message.data.IMessage
    public final int consumingStrategy() {
        return 1;
    }

    public BannerUpdateMessage() {
        this.type = C001A.BANNER_UPDATE;
    }
}
