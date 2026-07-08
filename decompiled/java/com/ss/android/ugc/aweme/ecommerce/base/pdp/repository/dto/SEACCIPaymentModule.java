package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SEACCIPaymentModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SeaPaymentInstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SeaPaymentPanelInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SEACCIPaymentModule implements Parcelable {

    @C09CT("cci_info")
    public final SeaPaymentPanelInfo cciInfo;

    @C09CT("cci_top_widget")
    public final SeaPaymentInstallmentPlan cciTopWidget;
    public static final Parcelable.Creator<SEACCIPaymentModule> CREATOR = new Parcelable.Creator<SEACCIPaymentModule>() { // from class: X.041i
        @Override // android.os.Parcelable.Creator
        public final SEACCIPaymentModule createFromParcel(Parcel parcel) {
            SeaPaymentInstallmentPlan seaPaymentInstallmentPlanCreateFromParcel;
            SeaPaymentPanelInfo seaPaymentPanelInfoCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                seaPaymentInstallmentPlanCreateFromParcel = null;
            } else {
                seaPaymentInstallmentPlanCreateFromParcel = SeaPaymentInstallmentPlan.CREATOR.createFromParcel(parcel);
            }
            SeaPaymentInstallmentPlan seaPaymentInstallmentPlan = seaPaymentInstallmentPlanCreateFromParcel;
            if (parcel.readInt() != 0) {
                seaPaymentPanelInfoCreateFromParcel = SeaPaymentPanelInfo.CREATOR.createFromParcel(parcel);
            }
            return new SEACCIPaymentModule(seaPaymentInstallmentPlan, seaPaymentPanelInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SEACCIPaymentModule[] newArray(int i) {
            return new SEACCIPaymentModule[i];
        }
    };
    public static final int $stable = 8;

    public SEACCIPaymentModule() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SEACCIPaymentModule)) {
            return false;
        }
        SEACCIPaymentModule sEACCIPaymentModule = (SEACCIPaymentModule) obj;
        return Intrinsics.LJFF(this.cciTopWidget, sEACCIPaymentModule.cciTopWidget) && Intrinsics.LJFF(this.cciInfo, sEACCIPaymentModule.cciInfo);
    }

    public final int hashCode() {
        SeaPaymentInstallmentPlan seaPaymentInstallmentPlan = this.cciTopWidget;
        int iHashCode = (seaPaymentInstallmentPlan == null ? 0 : seaPaymentInstallmentPlan.hashCode()) * 31;
        SeaPaymentPanelInfo seaPaymentPanelInfo = this.cciInfo;
        return iHashCode + (seaPaymentPanelInfo != null ? seaPaymentPanelInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SEACCIPaymentModule(cciTopWidget=");
        sbLIZ.append(this.cciTopWidget);
        sbLIZ.append(", cciInfo=");
        sbLIZ.append(this.cciInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SeaPaymentInstallmentPlan seaPaymentInstallmentPlan = this.cciTopWidget;
        if (seaPaymentInstallmentPlan == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            seaPaymentInstallmentPlan.writeToParcel(parcel, i);
        }
        SeaPaymentPanelInfo seaPaymentPanelInfo = this.cciInfo;
        if (seaPaymentPanelInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            seaPaymentPanelInfo.writeToParcel(parcel, i);
        }
    }

    public SEACCIPaymentModule(SeaPaymentInstallmentPlan seaPaymentInstallmentPlan, SeaPaymentPanelInfo seaPaymentPanelInfo) {
        this.cciTopWidget = seaPaymentInstallmentPlan;
        this.cciInfo = seaPaymentPanelInfo;
    }
}
