package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class DonationMessage extends AbstractC1136060ffY {

    @C09CT("currency")
    public String currency;

    @C09CT("sponsor")
    public List<User> sponsor;

    @C09CT("total")
    public Long total;

    @C09CT("user")
    public List<User> user;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.total != null) {
            sb.append(", total=");
            sb.append(this.total);
        }
        if (this.currency != null) {
            sb.append(", currency=");
            sb.append(this.currency);
        }
        List<User> list = this.sponsor;
        if (list != null && !list.isEmpty()) {
            sb.append(", sponsor=");
            sb.append(this.sponsor);
        }
        List<User> list2 = this.user;
        if (list2 != null && !list2.isEmpty()) {
            sb.append(", user=");
            sb.append(this.user);
        }
        sb.replace(0, 2, "DonationMessage{");
        sb.append('}');
        return sb.toString();
    }

    public DonationMessage() {
        this.type = C001A.DONATION_MESSAGE;
    }
}
