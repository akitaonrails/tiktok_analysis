package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import X.EnumC575380MhU;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.PointLengthInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class PointLengthInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<PointLengthInfo> CREATOR = new Parcelable.Creator<PointLengthInfo>() { // from class: X.0Mhf
        @Override // android.os.Parcelable.Creator
        public final PointLengthInfo createFromParcel(Parcel parcel) {
            return new PointLengthInfo((EnumC575380MhU) C08FF.LIZ(EnumC575380MhU.class, parcel.readString()), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final PointLengthInfo[] newArray(int i) {
            return new PointLengthInfo[i];
        }
    };

    @C09CT("type")
    public EnumC575380MhU type;

    @C09CT("value")
    public float value;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type.name());
        parcel.writeFloat(this.value);
    }

    public PointLengthInfo() {
        this(EnumC575380MhU.PointLengthType_ABSOLUTE, 0.0f);
    }

    public final EnumC575380MhU getType() {
        return this.type;
    }

    public final float getValue() {
        return this.value;
    }

    public final void setType(EnumC575380MhU enumC575380MhU) {
        this.type = enumC575380MhU;
    }

    public final void setValue(float f) {
        this.value = f;
    }

    public PointLengthInfo(EnumC575380MhU enumC575380MhU, float f) {
        this.type = enumC575380MhU;
        this.value = f;
    }
}
