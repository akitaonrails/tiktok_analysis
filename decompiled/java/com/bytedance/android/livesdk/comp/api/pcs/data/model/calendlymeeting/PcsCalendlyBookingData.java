package com.bytedance.android.livesdk.comp.api.pcs.data.model.calendlymeeting;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.calendlymeeting.PcsCalendlyBookingData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsCalendlyBookingData implements Parcelable {
    public static final Parcelable.Creator<PcsCalendlyBookingData> CREATOR = new Parcelable.Creator<PcsCalendlyBookingData>() { // from class: X.0JJh
        @Override // android.os.Parcelable.Creator
        public final PcsCalendlyBookingData createFromParcel(Parcel parcel) {
            boolean z;
            long j = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new PcsCalendlyBookingData(j, string, string2, string3, string4, string5, z);
        }

        @Override // android.os.Parcelable.Creator
        public final PcsCalendlyBookingData[] newArray(int i) {
            return new PcsCalendlyBookingData[i];
        }
    };
    public final String anchorId;
    public final String description;
    public final String secAnchorId;
    public final boolean showBackButton;
    public final String showEntrance;
    public final long skuId;
    public final String title;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PcsCalendlyBookingData)) {
            return false;
        }
        PcsCalendlyBookingData pcsCalendlyBookingData = (PcsCalendlyBookingData) obj;
        return this.skuId == pcsCalendlyBookingData.skuId && Intrinsics.LJFF(this.anchorId, pcsCalendlyBookingData.anchorId) && Intrinsics.LJFF(this.secAnchorId, pcsCalendlyBookingData.secAnchorId) && Intrinsics.LJFF(this.showEntrance, pcsCalendlyBookingData.showEntrance) && Intrinsics.LJFF(this.title, pcsCalendlyBookingData.title) && Intrinsics.LJFF(this.description, pcsCalendlyBookingData.description) && this.showBackButton == pcsCalendlyBookingData.showBackButton;
    }

    public final int hashCode() {
        return (((((((((((C786410Ut5.Y2(this.skuId) * 31) + this.anchorId.hashCode()) * 31) + this.secAnchorId.hashCode()) * 31) + this.showEntrance.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + C786410Ut5.Z2(this.showBackButton);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PcsCalendlyBookingData(skuId=");
        sbLIZ.append(this.skuId);
        sbLIZ.append(", anchorId=");
        sbLIZ.append(this.anchorId);
        sbLIZ.append(", secAnchorId=");
        sbLIZ.append(this.secAnchorId);
        sbLIZ.append(", showEntrance=");
        sbLIZ.append(this.showEntrance);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", showBackButton=");
        sbLIZ.append(this.showBackButton);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.skuId);
        parcel.writeString(this.anchorId);
        parcel.writeString(this.secAnchorId);
        parcel.writeString(this.showEntrance);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeInt(this.showBackButton ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PcsCalendlyBookingData(long j, String str, String str2, String str3, String str4, String str5, int i) {
        boolean z;
        String str6 = (i & 16) != 0 ? "" : str4;
        String str7 = (i & 32) == 0 ? str5 : "";
        if ((i & 64) != 0) {
            z = true;
        } else {
            z = false;
        }
        this(j, str, str2, str3, str6, str7, z);
    }

    public PcsCalendlyBookingData(long j, String str, String str2, String str3, String str4, String str5, boolean z) {
        this.skuId = j;
        this.anchorId = str;
        this.secAnchorId = str2;
        this.showEntrance = str3;
        this.title = str4;
        this.description = str5;
        this.showBackButton = z;
    }
}
