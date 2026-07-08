package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SeaPaymentInstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SeaPaymentPanelInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPaymentPanelInfo implements Parcelable {

    @C09CT("hint")
    public final String hint;

    @C09CT("installment_plans")
    public final List<SeaPaymentInstallmentPlan> installmentPlans;

    @C09CT("left_header_row")
    public final String leftHeaderRow;

    @C09CT("right_header_row")
    public final String rightHeaderRow;

    @C09CT("title")
    public final String title;
    public static final Parcelable.Creator<SeaPaymentPanelInfo> CREATOR = new Parcelable.Creator<SeaPaymentPanelInfo>() { // from class: X.041j
        @Override // android.os.Parcelable.Creator
        public final SeaPaymentPanelInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(SeaPaymentInstallmentPlan.CREATOR.createFromParcel(parcel));
                }
            }
            return new SeaPaymentPanelInfo(string, string2, arrayList, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SeaPaymentPanelInfo[] newArray(int i) {
            return new SeaPaymentPanelInfo[i];
        }
    };
    public static final int $stable = 8;

    public SeaPaymentPanelInfo() {
        this(null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPaymentPanelInfo)) {
            return false;
        }
        SeaPaymentPanelInfo seaPaymentPanelInfo = (SeaPaymentPanelInfo) obj;
        return Intrinsics.LJFF(this.title, seaPaymentPanelInfo.title) && Intrinsics.LJFF(this.hint, seaPaymentPanelInfo.hint) && Intrinsics.LJFF(this.installmentPlans, seaPaymentPanelInfo.installmentPlans) && Intrinsics.LJFF(this.leftHeaderRow, seaPaymentPanelInfo.leftHeaderRow) && Intrinsics.LJFF(this.rightHeaderRow, seaPaymentPanelInfo.rightHeaderRow);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.hint;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<SeaPaymentInstallmentPlan> list = this.installmentPlans;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.leftHeaderRow;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rightHeaderRow;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPaymentPanelInfo(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", hint=");
        sbLIZ.append(this.hint);
        sbLIZ.append(", installmentPlans=");
        sbLIZ.append(this.installmentPlans);
        sbLIZ.append(", leftHeaderRow=");
        sbLIZ.append(this.leftHeaderRow);
        sbLIZ.append(", rightHeaderRow=");
        sbLIZ.append(this.rightHeaderRow);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.hint);
        List<SeaPaymentInstallmentPlan> list = this.installmentPlans;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<SeaPaymentInstallmentPlan> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.leftHeaderRow);
        parcel.writeString(this.rightHeaderRow);
    }

    public SeaPaymentPanelInfo(String str, String str2, List<SeaPaymentInstallmentPlan> list, String str3, String str4) {
        this.title = str;
        this.hint = str2;
        this.installmentPlans = list;
        this.leftHeaderRow = str3;
        this.rightHeaderRow = str4;
    }
}
