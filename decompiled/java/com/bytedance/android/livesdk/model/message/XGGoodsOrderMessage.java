package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class XGGoodsOrderMessage extends AbstractC1136060ffY {

    @C09CT("goods_order")
    public GoodsOrder goodsOrder;

    @C09CT("user")
    public User user;

    public static class GoodsOrder {

        @C09CT("goods_room_order")
        public long goodsRoomOrder;

        @C09CT("order_id")
        public String orderId;

        @C09CT("order_money")
        public long orderMoney;

        @C09CT("order_num")
        public long orderNum;
    }

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return true;
    }

    public final int hashCode() {
        CommonMessageData commonMessageData = this.baseMessage;
        return commonMessageData != null ? Objects.hash(Long.valueOf(commonMessageData.messageId)) : super.hashCode();
    }

    public XGGoodsOrderMessage() {
        this.type = C001A.GOODS_ORDER;
    }

    public final boolean equals(Object obj) {
        CommonMessageData commonMessageData;
        CommonMessageData commonMessageData2;
        if (!(obj instanceof XGGoodsOrderMessage) || (commonMessageData = this.baseMessage) == null || (commonMessageData2 = ((BaseMessage) obj).baseMessage) == null || commonMessageData.messageId != commonMessageData2.messageId) {
            return false;
        }
        return true;
    }
}
