package com.ss.android.ugc.aweme.minis.model.payment.coupon;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.payment.coupon.ACAConfig;
import com.ss.android.ugc.aweme.minis.model.payment.coupon.QCPXConfig;
import com.ss.android.ugc.aweme.minis.model.payment.coupon.TiktokMinisMonetizationCheckEnablementListResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class TiktokMinisMonetizationCheckEnablementListResponse implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TiktokMinisMonetizationCheckEnablementListResponse> CREATOR = new Parcelable.Creator<TiktokMinisMonetizationCheckEnablementListResponse>() { // from class: X.1Cu0
        @Override // android.os.Parcelable.Creator
        public final TiktokMinisMonetizationCheckEnablementListResponse createFromParcel(Parcel parcel) {
            return new TiktokMinisMonetizationCheckEnablementListResponse(QCPXConfig.CREATOR.createFromParcel(parcel), ACAConfig.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final TiktokMinisMonetizationCheckEnablementListResponse[] newArray(int i) {
            return new TiktokMinisMonetizationCheckEnablementListResponse[i];
        }
    };

    @C09CT("aca_config")
    public final ACAConfig acaConfig;

    @C09CT("qcpx_config")
    public final QCPXConfig qcpxConfig;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TiktokMinisMonetizationCheckEnablementListResponse)) {
            return false;
        }
        TiktokMinisMonetizationCheckEnablementListResponse tiktokMinisMonetizationCheckEnablementListResponse = (TiktokMinisMonetizationCheckEnablementListResponse) obj;
        return Intrinsics.LJFF(this.qcpxConfig, tiktokMinisMonetizationCheckEnablementListResponse.qcpxConfig) && Intrinsics.LJFF(this.acaConfig, tiktokMinisMonetizationCheckEnablementListResponse.acaConfig);
    }

    public final int hashCode() {
        return (this.qcpxConfig.hashCode() * 31) + this.acaConfig.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TiktokMinisMonetizationCheckEnablementListResponse(qcpxConfig=");
        sbLIZ.append(this.qcpxConfig);
        sbLIZ.append(", acaConfig=");
        sbLIZ.append(this.acaConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TiktokMinisMonetizationCheckEnablementListResponse() {
        this(new QCPXConfig(false), new ACAConfig(false));
    }

    public TiktokMinisMonetizationCheckEnablementListResponse(QCPXConfig qCPXConfig, ACAConfig aCAConfig) {
        this.qcpxConfig = qCPXConfig;
        this.acaConfig = aCAConfig;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.qcpxConfig.enabled ? 1 : 0);
        parcel.writeInt(this.acaConfig.enabled ? 1 : 0);
    }
}
