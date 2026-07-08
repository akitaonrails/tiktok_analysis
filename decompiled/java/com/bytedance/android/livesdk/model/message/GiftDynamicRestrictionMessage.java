package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.gift.model.DynamicRestriction;

/* JADX INFO: loaded from: classes.dex */
public final class GiftDynamicRestrictionMessage extends AbstractC1136060ffY {

    @C09CT("dynamic_restriction")
    public DynamicRestriction dynamicRestriction;

    public GiftDynamicRestrictionMessage() {
        this.type = C001A.GIFT_DYNAMIC_RESTRICTION_MESSAGE;
    }
}
