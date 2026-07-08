package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class HotfixGiftDataForProp {

    @C09CT("combo_count")
    public Long comboCount;

    @C09CT("describe")
    public String describe;

    @C09CT("display_text")
    public Text displayText;

    @C09CT("gift_id")
    public Long giftId;

    @C09CT("group_count")
    public Long groupCount;

    @C09CT("msg_id")
    public Long msgId;

    @C09CT("repeat_count")
    public Long repeatCount;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.displayText != null) {
            sb.append(", display_text=");
            sb.append(this.displayText);
        }
        if (this.describe != null) {
            sb.append(", describe=");
            sb.append(this.describe);
        }
        if (this.giftId != null) {
            sb.append(", gift_id=");
            sb.append(this.giftId);
        }
        if (this.groupCount != null) {
            sb.append(", group_count=");
            sb.append(this.groupCount);
        }
        if (this.repeatCount != null) {
            sb.append(", repeat_count=");
            sb.append(this.repeatCount);
        }
        if (this.comboCount != null) {
            sb.append(", combo_count=");
            sb.append(this.comboCount);
        }
        if (this.msgId != null) {
            sb.append(", msg_id=");
            sb.append(this.msgId);
        }
        sb.replace(0, 2, "HotfixGiftDataForProp{");
        sb.append('}');
        return sb.toString();
    }
}
