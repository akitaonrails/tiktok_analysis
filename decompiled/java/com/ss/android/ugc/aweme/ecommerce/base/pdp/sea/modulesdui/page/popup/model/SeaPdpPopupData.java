package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.popup.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.popup.model.SeaPdpPopupData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class SeaPdpPopupData implements Parcelable {

    @C09CT("data")
    public final String data;

    @C09CT("is_retention")
    public final Boolean isRetention;

    @C09CT("load_timeout_ms")
    public final Long loadTimeoutMs;

    @C09CT("perf_track_data")
    public final String perfTrackData;

    @C09CT("priority")
    public final Integer priority;

    @C09CT("schema")
    public final String schema;

    @C09CT("type")
    public final Integer type;
    public static final Parcelable.Creator<SeaPdpPopupData> CREATOR = new Parcelable.Creator<SeaPdpPopupData>() { // from class: X.0mdM
        @Override // android.os.Parcelable.Creator
        public final SeaPdpPopupData createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            boolean z;
            Boolean boolValueOf;
            Long lValueOf = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new SeaPdpPopupData(numValueOf, numValueOf2, boolValueOf, string, string2, lValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SeaPdpPopupData[] newArray(int i) {
            return new SeaPdpPopupData[i];
        }
    };
    public static final int $stable = 8;

    public SeaPdpPopupData() {
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
        if (!(obj instanceof SeaPdpPopupData)) {
            return false;
        }
        SeaPdpPopupData seaPdpPopupData = (SeaPdpPopupData) obj;
        return Intrinsics.LJFF(this.priority, seaPdpPopupData.priority) && Intrinsics.LJFF(this.type, seaPdpPopupData.type) && Intrinsics.LJFF(this.isRetention, seaPdpPopupData.isRetention) && Intrinsics.LJFF(this.schema, seaPdpPopupData.schema) && Intrinsics.LJFF(this.data, seaPdpPopupData.data) && Intrinsics.LJFF(this.loadTimeoutMs, seaPdpPopupData.loadTimeoutMs) && Intrinsics.LJFF(this.perfTrackData, seaPdpPopupData.perfTrackData);
    }

    public final int hashCode() {
        Integer num = this.priority;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.type;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.isRetention;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.schema;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.data;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.loadTimeoutMs;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.perfTrackData;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpPopupData(priority=");
        sbLIZ.append(this.priority);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", isRetention=");
        sbLIZ.append(this.isRetention);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", loadTimeoutMs=");
        sbLIZ.append(this.loadTimeoutMs);
        sbLIZ.append(", perfTrackData=");
        sbLIZ.append(this.perfTrackData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.priority;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.type;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Boolean bool = this.isRetention;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.schema);
        parcel.writeString(this.data);
        Long l = this.loadTimeoutMs;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.perfTrackData);
    }

    public SeaPdpPopupData(Integer num, Integer num2, Boolean bool, String str, String str2, Long l, String str3) {
        this.priority = num;
        this.type = num2;
        this.isRetention = bool;
        this.schema = str;
        this.data = str2;
        this.loadTimeoutMs = l;
        this.perfTrackData = str3;
    }
}
