package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GiftPromptMessage extends AbstractC1136060ffY {

    @C09CT("block_num_days")
    public Integer blockNumDays;

    @C09CT("body")
    public String body;

    @C09CT("in_user_gifting_addiction_expr")
    public boolean inUserGiftingAddictionExpr;

    @C09CT("order_id")
    public String orderId;

    @C09CT("order_timestamp")
    public Long orderTimestamp;

    @C09CT("pop_up_schema")
    public String popUpSchema = "";

    @C09CT("title")
    public String title;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.body != null) {
            sb.append(", body=");
            sb.append(this.body);
        }
        if (this.blockNumDays != null) {
            sb.append(", block_num_days=");
            sb.append(this.blockNumDays);
        }
        if (this.orderId != null) {
            sb.append(", order_id=");
            sb.append(this.orderId);
        }
        if (this.orderTimestamp != null) {
            sb.append(", order_timestamp=");
            sb.append(this.orderTimestamp);
        }
        sb.replace(0, 2, "GiftPromptMessage{");
        sb.append('}');
        return sb.toString();
    }

    public GiftPromptMessage() {
        this.type = C001A.GIFT_PROMPT_MESSAGE;
    }
}
