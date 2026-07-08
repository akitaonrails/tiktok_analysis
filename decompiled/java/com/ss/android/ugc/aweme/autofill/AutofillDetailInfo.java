package com.ss.android.ugc.aweme.autofill;

import X.C09CS;
import X.C09CT;
import com.ss.android.ugc.aweme.utils.JsonToStringAdapter;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AutofillDetailInfo implements Serializable {

    @C09CT("contact_infos")
    @C09CS(JsonToStringAdapter.class)
    public String contactInfos;

    @C09CT("is_contact_info_enabled")
    public boolean isContactInfoEnabled;

    @C09CT("is_payment_info_enabled")
    public boolean isPaymentInfoEnabled;

    @C09CT("source")
    public int source = -1;

    public final String getContactInfos() {
        return this.contactInfos;
    }

    public final int getSource() {
        return this.source;
    }

    public final boolean isContactInfoEnabled() {
        return this.isContactInfoEnabled;
    }

    public final boolean isPaymentInfoEnabled() {
        return this.isPaymentInfoEnabled;
    }

    public final void setContactInfoEnabled(boolean z) {
        this.isContactInfoEnabled = z;
    }

    public final void setContactInfos(String str) {
        this.contactInfos = str;
    }

    public final void setPaymentInfoEnabled(boolean z) {
        this.isPaymentInfoEnabled = z;
    }

    public final void setSource(int i) {
        this.source = i;
    }
}
