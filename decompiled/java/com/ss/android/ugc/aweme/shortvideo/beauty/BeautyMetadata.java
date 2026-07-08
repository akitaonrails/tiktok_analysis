package com.ss.android.ugc.aweme.shortvideo.beauty;

import X.C09CT;
import X.C1433130nOh;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class BeautyMetadata implements Serializable, Parcelable {
    public static final C1433130nOh CREATOR = new Parcelable.Creator<BeautyMetadata>() { // from class: X.0nOh
        @Override // android.os.Parcelable.Creator
        public final BeautyMetadata createFromParcel(Parcel parcel) {
            return new BeautyMetadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BeautyMetadata[] newArray(int i) {
            return new BeautyMetadata[i];
        }
    };

    @C09CT("te_record_beauty_id")
    public String beautyId;

    @C09CT("te_record_beauty_name")
    public String beautyName;

    @C09CT("te_record_beauty_res")
    public String beautyRes;

    @C09CT("te_record_beauty_strength")
    public String beautyStrength;

    @C09CT("te_record_beauty_res_valid")
    public String beautyValid;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BeautyMetadata() {
        this.beautyName = "";
        this.beautyStrength = "";
        this.beautyId = "";
        this.beautyRes = "";
        this.beautyValid = "";
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BeautyMetadata:id=");
        sbLIZ.append(this.beautyId);
        sbLIZ.append(",name=");
        sbLIZ.append(this.beautyName);
        sbLIZ.append(",strength=");
        sbLIZ.append(this.beautyStrength);
        sbLIZ.append(",res=");
        sbLIZ.append(this.beautyRes);
        sbLIZ.append(",valid=");
        sbLIZ.append(this.beautyValid);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getBeautyId() {
        return this.beautyId;
    }

    public final String getBeautyName() {
        return this.beautyName;
    }

    public final String getBeautyRes() {
        return this.beautyRes;
    }

    public final String getBeautyStrength() {
        return this.beautyStrength;
    }

    public final String getBeautyValid() {
        return this.beautyValid;
    }

    public BeautyMetadata(Parcel parcel) {
        this();
        String string = parcel.readString();
        this.beautyName = string == null ? "" : string;
        String string2 = parcel.readString();
        this.beautyStrength = string2 == null ? "" : string2;
        String string3 = parcel.readString();
        this.beautyId = string3 == null ? "" : string3;
        String string4 = parcel.readString();
        this.beautyRes = string4 == null ? "" : string4;
        String string5 = parcel.readString();
        this.beautyValid = string5 != null ? string5 : "";
    }

    public final void setBeautyId(String str) {
        this.beautyId = str;
    }

    public final void setBeautyName(String str) {
        this.beautyName = str;
    }

    public final void setBeautyRes(String str) {
        this.beautyRes = str;
    }

    public final void setBeautyStrength(String str) {
        this.beautyStrength = str;
    }

    public final void setBeautyValid(String str) {
        this.beautyValid = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.beautyName);
        parcel.writeString(this.beautyStrength);
        parcel.writeString(this.beautyId);
        parcel.writeString(this.beautyRes);
        parcel.writeString(this.beautyValid);
    }
}
