package com.ss.android.ugc.aweme.creative.model.declaration;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.declaration.DeclarationPayload;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class DeclarationPayload implements Parcelable {
    public static final Parcelable.Creator<DeclarationPayload> CREATOR = new Parcelable.Creator<DeclarationPayload>() { // from class: X.0n4k
        @Override // android.os.Parcelable.Creator
        public final DeclarationPayload createFromParcel(Parcel parcel) {
            Long lValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new DeclarationPayload(string, string2, lValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final DeclarationPayload[] newArray(int i) {
            return new DeclarationPayload[i];
        }
    };

    @C09CT("create_time")
    public Long createTime;

    @C09CT("location_name")
    public String locationName;

    @C09CT("poi_id")
    public String poiId;

    public DeclarationPayload() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeclarationPayload)) {
            return false;
        }
        DeclarationPayload declarationPayload = (DeclarationPayload) obj;
        return Intrinsics.LJFF(this.poiId, declarationPayload.poiId) && Intrinsics.LJFF(this.locationName, declarationPayload.locationName) && Intrinsics.LJFF(this.createTime, declarationPayload.createTime);
    }

    public final int hashCode() {
        String str = this.poiId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.locationName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.createTime;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeclarationPayload(poiId=");
        sbLIZ.append(this.poiId);
        sbLIZ.append(", locationName=");
        sbLIZ.append(this.locationName);
        sbLIZ.append(", createTime=");
        sbLIZ.append(this.createTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.poiId);
        parcel.writeString(this.locationName);
        Long l = this.createTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public DeclarationPayload(String str, String str2, Long l) {
        this.poiId = str;
        this.locationName = str2;
        this.createTime = l;
    }
}
