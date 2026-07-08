package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BNPLTopWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BnplInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPaymentModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SeaPaymentPanelInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpPaymentModule implements Parcelable {

    @C09CT("bnpl_info")
    public final BnplInfo bnplInfo;

    @C09CT("bnpl_panel_info")
    public final SeaPaymentPanelInfo bnplPanelInfo;

    @C09CT("bnpl_top_widget")
    public final BNPLTopWidget bnplTopWidget;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("pdp_da_info")
    public final String pdpDaInfo;
    public static final Parcelable.Creator<PdpPaymentModule> CREATOR = new Parcelable.Creator<PdpPaymentModule>() { // from class: X.041h
        @Override // android.os.Parcelable.Creator
        public final PdpPaymentModule createFromParcel(Parcel parcel) {
            BnplInfo bnplInfoCreateFromParcel;
            BNPLTopWidget bNPLTopWidgetCreateFromParcel;
            SeaPaymentPanelInfo seaPaymentPanelInfoCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                bnplInfoCreateFromParcel = null;
            } else {
                bnplInfoCreateFromParcel = BnplInfo.CREATOR.createFromParcel(parcel);
            }
            BnplInfo bnplInfo = bnplInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                bNPLTopWidgetCreateFromParcel = null;
            } else {
                bNPLTopWidgetCreateFromParcel = BNPLTopWidget.CREATOR.createFromParcel(parcel);
            }
            BNPLTopWidget bNPLTopWidget = bNPLTopWidgetCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                seaPaymentPanelInfoCreateFromParcel = SeaPaymentPanelInfo.CREATOR.createFromParcel(parcel);
            }
            return new PdpPaymentModule(bnplInfo, bNPLTopWidget, string, seaPaymentPanelInfoCreateFromParcel, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PdpPaymentModule[] newArray(int i) {
            return new PdpPaymentModule[i];
        }
    };
    public static final int $stable = 8;

    public PdpPaymentModule() {
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
        if (!(obj instanceof PdpPaymentModule)) {
            return false;
        }
        PdpPaymentModule pdpPaymentModule = (PdpPaymentModule) obj;
        return Intrinsics.LJFF(this.bnplInfo, pdpPaymentModule.bnplInfo) && Intrinsics.LJFF(this.bnplTopWidget, pdpPaymentModule.bnplTopWidget) && Intrinsics.LJFF(this.daInfo, pdpPaymentModule.daInfo) && Intrinsics.LJFF(this.bnplPanelInfo, pdpPaymentModule.bnplPanelInfo) && Intrinsics.LJFF(this.pdpDaInfo, pdpPaymentModule.pdpDaInfo);
    }

    public final int hashCode() {
        BnplInfo bnplInfo = this.bnplInfo;
        int iHashCode = (bnplInfo == null ? 0 : bnplInfo.hashCode()) * 31;
        BNPLTopWidget bNPLTopWidget = this.bnplTopWidget;
        int iHashCode2 = (iHashCode + (bNPLTopWidget == null ? 0 : bNPLTopWidget.hashCode())) * 31;
        String str = this.daInfo;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        SeaPaymentPanelInfo seaPaymentPanelInfo = this.bnplPanelInfo;
        int iHashCode4 = (iHashCode3 + (seaPaymentPanelInfo == null ? 0 : seaPaymentPanelInfo.hashCode())) * 31;
        String str2 = this.pdpDaInfo;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpPaymentModule(bnplInfo=");
        sbLIZ.append(this.bnplInfo);
        sbLIZ.append(", bnplTopWidget=");
        sbLIZ.append(this.bnplTopWidget);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(", bnplPanelInfo=");
        sbLIZ.append(this.bnplPanelInfo);
        sbLIZ.append(", pdpDaInfo=");
        sbLIZ.append(this.pdpDaInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        BnplInfo bnplInfo = this.bnplInfo;
        if (bnplInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bnplInfo.writeToParcel(parcel, i);
        }
        BNPLTopWidget bNPLTopWidget = this.bnplTopWidget;
        if (bNPLTopWidget == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bNPLTopWidget.writeToParcel(parcel, i);
        }
        parcel.writeString(this.daInfo);
        SeaPaymentPanelInfo seaPaymentPanelInfo = this.bnplPanelInfo;
        if (seaPaymentPanelInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            seaPaymentPanelInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.pdpDaInfo);
    }

    public PdpPaymentModule(BnplInfo bnplInfo, BNPLTopWidget bNPLTopWidget, String str, SeaPaymentPanelInfo seaPaymentPanelInfo, String str2) {
        this.bnplInfo = bnplInfo;
        this.bnplTopWidget = bNPLTopWidget;
        this.daInfo = str;
        this.bnplPanelInfo = seaPaymentPanelInfo;
        this.pdpDaInfo = str2;
    }
}
