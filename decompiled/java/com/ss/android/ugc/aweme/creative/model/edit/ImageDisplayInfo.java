package com.ss.android.ugc.aweme.creative.model.edit;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.ImageDisplayInfo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ImageDisplayInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<ImageDisplayInfo> CREATOR = new Parcelable.Creator<ImageDisplayInfo>() { // from class: X.0ngf
        @Override // android.os.Parcelable.Creator
        public final ImageDisplayInfo createFromParcel(Parcel parcel) {
            return new ImageDisplayInfo(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ImageDisplayInfo[] newArray(int i) {
            return new ImageDisplayInfo[i];
        }
    };

    @C09CT("display_color_space")
    public final String displayColorSpace;

    @C09CT("display_depth")
    public final String displayDepth;

    @C09CT("display_format")
    public final String displayFormat;

    public ImageDisplayInfo() {
        this(null, null, null);
    }

    public final ImageDisplayInfo copy(String str, String str2, String str3) {
        return new ImageDisplayInfo(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageDisplayInfo)) {
            return false;
        }
        ImageDisplayInfo imageDisplayInfo = (ImageDisplayInfo) obj;
        return Intrinsics.LJFF(this.displayColorSpace, imageDisplayInfo.displayColorSpace) && Intrinsics.LJFF(this.displayFormat, imageDisplayInfo.displayFormat) && Intrinsics.LJFF(this.displayDepth, imageDisplayInfo.displayDepth);
    }

    public int hashCode() {
        String str = this.displayColorSpace;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.displayFormat;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayDepth;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageDisplayInfo(displayColorSpace=");
        sbLIZ.append(this.displayColorSpace);
        sbLIZ.append(", displayFormat=");
        sbLIZ.append(this.displayFormat);
        sbLIZ.append(", displayDepth=");
        sbLIZ.append(this.displayDepth);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.displayColorSpace);
        parcel.writeString(this.displayFormat);
        parcel.writeString(this.displayDepth);
    }

    public final String getDisplayColorSpace() {
        return this.displayColorSpace;
    }

    public final String getDisplayDepth() {
        return this.displayDepth;
    }

    public final String getDisplayFormat() {
        return this.displayFormat;
    }

    public ImageDisplayInfo(String str, String str2, String str3) {
        this.displayColorSpace = str;
        this.displayFormat = str2;
        this.displayDepth = str3;
    }
}
