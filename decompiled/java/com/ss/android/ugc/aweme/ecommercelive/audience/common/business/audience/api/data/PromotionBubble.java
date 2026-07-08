package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import X.C5182020e;

/* JADX INFO: loaded from: classes.dex */
public final class PromotionBubble {
    public final C01GW LIZ;

    @C09CT("bubble_click_action")
    public final BubbleClickAction bubbleClickAction;

    @C09CT("bubble_icon")
    public final BubbleIcon bubbleIcon;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("text")
    public final String text;

    public PromotionBubble() {
        this(null, null, null, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PromotionBubble(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", bubbleIcon=");
        sbLIZ.append(this.bubbleIcon);
        sbLIZ.append(", bubbleClickAction=");
        sbLIZ.append(this.bubbleClickAction);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PromotionBubble(String str, BubbleIcon bubbleIcon, BubbleClickAction bubbleClickAction, String str2) {
        this.text = str;
        this.bubbleIcon = bubbleIcon;
        this.bubbleClickAction = bubbleClickAction;
        this.daInfo = str2;
        this.LIZ = C452501pT.LIZIZ(new C5182020e(this, 108));
    }
}
