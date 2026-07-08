package com.bytedance.android.livesdk.gift.model;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.gift.model.WishListResponse;
import com.bytedance.android.livesdkapi.message.CommonMessageData;

/* JADX INFO: loaded from: classes.dex */
public class WishListUpdateMessage extends AbstractC1136060ffY {

    @C09CT("list")
    public WishListResponse.WishList list;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        CommonMessageData commonMessageData = this.baseMessage;
        return (commonMessageData == null || commonMessageData.displayText == null) ? false : true;
    }

    @Override // X.AbstractC1136060ffY
    public final boolean supportDisplayText() {
        CommonMessageData commonMessageData = this.baseMessage;
        return (commonMessageData == null || commonMessageData.displayText == null) ? false : true;
    }

    public WishListUpdateMessage() {
        this.type = C001A.WISH_LIST_UPDATE_MESSAGE;
    }
}
