package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.pendant.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.pendant.model.SeaPdpPendantData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class SeaPdpPendantData implements Parcelable {

    @C09CT("anchor_position")
    public final Integer anchorPosition;

    @C09CT("data")
    public final String data;

    @C09CT("margin_x")
    public final Integer marginX;

    @C09CT("margin_y")
    public final Integer marginY;

    @C09CT("perf_track_data")
    public final String perfTrackData;

    @C09CT("schema")
    public final String schema;

    @C09CT("type")
    public final Integer type;
    public static final Parcelable.Creator<SeaPdpPendantData> CREATOR = new Parcelable.Creator<SeaPdpPendantData>() { // from class: X.0mdN
        @Override // android.os.Parcelable.Creator
        public final SeaPdpPendantData createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            Integer numValueOf4 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            }
            return new SeaPdpPendantData(numValueOf, string, string2, numValueOf2, numValueOf3, numValueOf4, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SeaPdpPendantData[] newArray(int i) {
            return new SeaPdpPendantData[i];
        }
    };
    public static final int $stable = 8;

    public SeaPdpPendantData() {
        this(null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPdpPendantData)) {
            return false;
        }
        SeaPdpPendantData seaPdpPendantData = (SeaPdpPendantData) obj;
        return Intrinsics.LJFF(this.type, seaPdpPendantData.type) && Intrinsics.LJFF(this.schema, seaPdpPendantData.schema) && Intrinsics.LJFF(this.data, seaPdpPendantData.data) && Intrinsics.LJFF(this.anchorPosition, seaPdpPendantData.anchorPosition) && Intrinsics.LJFF(this.marginX, seaPdpPendantData.marginX) && Intrinsics.LJFF(this.marginY, seaPdpPendantData.marginY) && Intrinsics.LJFF(this.perfTrackData, seaPdpPendantData.perfTrackData);
    }

    public final int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.schema;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.data;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.anchorPosition;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.marginX;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.marginY;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.perfTrackData;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpPendantData(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", anchorPosition=");
        sbLIZ.append(this.anchorPosition);
        sbLIZ.append(", marginX=");
        sbLIZ.append(this.marginX);
        sbLIZ.append(", marginY=");
        sbLIZ.append(this.marginY);
        sbLIZ.append(", perfTrackData=");
        sbLIZ.append(this.perfTrackData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.type;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.schema);
        parcel.writeString(this.data);
        Integer num2 = this.anchorPosition;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.marginX;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.marginY;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        parcel.writeString(this.perfTrackData);
    }

    public SeaPdpPendantData(Integer num, String str, String str2, Integer num2, Integer num3, Integer num4, String str3) {
        this.type = num;
        this.schema = str;
        this.data = str2;
        this.anchorPosition = num2;
        this.marginX = num3;
        this.marginY = num4;
        this.perfTrackData = str3;
    }
}
