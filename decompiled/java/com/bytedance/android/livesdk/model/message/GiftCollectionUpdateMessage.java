package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdkapi.message.CommonMessageData;

/* JADX INFO: loaded from: classes.dex */
public class GiftCollectionUpdateMessage extends AbstractC1136060ffY {

    @C09CT("gift_collection")
    public GiftCollection giftCollection;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return true;
    }

    @Override // X.AbstractC1136060ffY
    public final boolean supportDisplayText() {
        CommonMessageData commonMessageData = this.baseMessage;
        return (commonMessageData == null || commonMessageData.displayText == null) ? false : true;
    }

    public GiftCollectionUpdateMessage() {
        this.type = C001A.GIFT_COLLECTION_UPDATE_MESSAGE;
    }
}
