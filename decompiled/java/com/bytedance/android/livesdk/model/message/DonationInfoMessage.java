package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public class DonationInfoMessage extends AbstractC1136060ffY {

    @C09CT("currency")
    public String currency;

    @C09CT("fundraiser_id")
    public long fundraiserId;

    @C09CT("goal_amount")
    public String goalAmount = "";

    @C09CT("donation_total")
    public String totalMoney;

    @C09CT("donation_user_count")
    public long totalUser;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return false;
    }

    @Override // X.AbstractC1136060ffY
    public final boolean supportDisplayText() {
        return false;
    }

    public DonationInfoMessage() {
        this.type = C001A.DONATION_INFO;
    }
}
