package com.ss.android.ugc.aweme.donation.token;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class DonationTokenResponse extends BaseResponse implements Serializable {

    @C09CT("data")
    public final DonationTokenBean data;

    public final DonationTokenResponse copy(DonationTokenBean donationTokenBean) {
        return new DonationTokenResponse(donationTokenBean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DonationTokenResponse) && Intrinsics.LJFF(this.data, ((DonationTokenResponse) obj).data);
    }

    public int hashCode() {
        DonationTokenBean donationTokenBean = this.data;
        if (donationTokenBean == null) {
            return 0;
        }
        return donationTokenBean.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DonationTokenResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final DonationTokenBean getData() {
        return this.data;
    }

    public DonationTokenResponse(DonationTokenBean donationTokenBean) {
        this.data = donationTokenBean;
    }
}
