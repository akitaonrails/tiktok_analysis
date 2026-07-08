package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GiftBoostCardMessage extends AbstractC1136060ffY {

    @C09CT("cards")
    public List<BoostCard> mCards;

    public GiftBoostCardMessage() {
        this.type = C001A.GIFT_BOOST_CARD_MESSAGE;
    }
}
