package com.ss.android.ugc.aweme.addyours.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.addyours.model.AddYoursInfoStruct;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AddYoursInfoStruct implements Serializable, Parcelable {
    public static final Parcelable.Creator<AddYoursInfoStruct> CREATOR = new Parcelable.Creator<AddYoursInfoStruct>() { // from class: X.02r3
        @Override // android.os.Parcelable.Creator
        public final AddYoursInfoStruct createFromParcel(Parcel parcel) {
            Integer numValueOf;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new AddYoursInfoStruct(numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AddYoursInfoStruct[] newArray(int i) {
            return new AddYoursInfoStruct[i];
        }
    };

    @C09CT("addyours_enter_method")
    public String addYoursEnterMethod;

    @C09CT("video_source")
    public Integer videoSource;

    public AddYoursInfoStruct() {
        this(null, null);
    }

    public final AddYoursInfoStruct copy(Integer num, String str) {
        return new AddYoursInfoStruct(num, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddYoursInfoStruct)) {
            return false;
        }
        AddYoursInfoStruct addYoursInfoStruct = (AddYoursInfoStruct) obj;
        return Intrinsics.LJFF(this.videoSource, addYoursInfoStruct.videoSource) && Intrinsics.LJFF(this.addYoursEnterMethod, addYoursInfoStruct.addYoursEnterMethod);
    }

    public int hashCode() {
        Integer num = this.videoSource;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.addYoursEnterMethod;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddYoursInfoStruct(videoSource=");
        sbLIZ.append(this.videoSource);
        sbLIZ.append(", addYoursEnterMethod=");
        sbLIZ.append(this.addYoursEnterMethod);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        Integer num = this.videoSource;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.addYoursEnterMethod);
    }

    public final String getAddYoursEnterMethod() {
        return this.addYoursEnterMethod;
    }

    public final Integer getVideoSource() {
        return this.videoSource;
    }

    public final void setAddYoursEnterMethod(String str) {
        this.addYoursEnterMethod = str;
    }

    public AddYoursInfoStruct(Integer num, String str) {
        this.videoSource = num;
        this.addYoursEnterMethod = str;
    }
}
