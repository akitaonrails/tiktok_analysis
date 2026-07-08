package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GiftUnlockMessage extends AbstractC1136060ffY {

    @C09CT("bubble_text")
    public Text bubbleText;

    @C09CT("gifts")
    public List<Gift> gifts;

    @C09CT("style_dictate")
    public boolean styleDictate;

    @C09CT("style_dictate_params")
    public StyleDictateParams styleDictateParams;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        List<Gift> list = this.gifts;
        if (list != null && !list.isEmpty()) {
            sb.append(", gifts=");
            sb.append(this.gifts);
        }
        if (this.bubbleText != null) {
            sb.append(", bubble_text=");
            sb.append(this.bubbleText);
        }
        sb.replace(0, 2, "GiftUnlockMessage{");
        sb.append('}');
        return sb.toString();
    }

    public GiftUnlockMessage() {
        this.type = C001A.GIFT_UNLOCK_MESSAGE;
    }
}
