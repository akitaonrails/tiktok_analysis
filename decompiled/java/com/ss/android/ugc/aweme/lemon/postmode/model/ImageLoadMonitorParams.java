package com.ss.android.ugc.aweme.lemon.postmode.model;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.lemon.postmode.model.ImageLoadMonitorParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class ImageLoadMonitorParams implements Parcelable {
    public static final Parcelable.Creator<ImageLoadMonitorParams> CREATOR = new Parcelable.Creator<ImageLoadMonitorParams>() { // from class: X.0lOQ
        @Override // android.os.Parcelable.Creator
        public final ImageLoadMonitorParams createFromParcel(Parcel parcel) {
            Integer numValueOf;
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            long j = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new ImageLoadMonitorParams(i, i2, j, numValueOf, string, string2);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageLoadMonitorParams[] newArray(int i) {
            return new ImageLoadMonitorParams[i];
        }
    };
    public final String aid;
    public final long duration;
    public final Integer errorCode;
    public final int index;
    public final int status;
    public final String url;

    /* JADX WARN: Illegal instructions before constructor call */
    public ImageLoadMonitorParams() {
        int i = 0;
        String str = null;
        this(i, i, 0L, str, str, 63);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageLoadMonitorParams)) {
            return false;
        }
        ImageLoadMonitorParams imageLoadMonitorParams = (ImageLoadMonitorParams) obj;
        return this.index == imageLoadMonitorParams.index && this.status == imageLoadMonitorParams.status && this.duration == imageLoadMonitorParams.duration && Intrinsics.LJFF(this.aid, imageLoadMonitorParams.aid) && Intrinsics.LJFF(this.url, imageLoadMonitorParams.url) && Intrinsics.LJFF(this.errorCode, imageLoadMonitorParams.errorCode);
    }

    public final int hashCode() {
        int iY2 = ((((this.index * 31) + this.status) * 31) + C786410Ut5.Y2(this.duration)) * 31;
        String str = this.aid;
        int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.errorCode;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageLoadMonitorParams(index=");
        sbLIZ.append(this.index);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", aid=");
        sbLIZ.append(this.aid);
        sbLIZ.append(", url=");
        sbLIZ.append(this.url);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeInt(this.index);
        parcel.writeInt(this.status);
        parcel.writeLong(this.duration);
        parcel.writeString(this.aid);
        parcel.writeString(this.url);
        Integer num = this.errorCode;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public /* synthetic */ ImageLoadMonitorParams(int i, int i2, long j, String str, String str2, int i3) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? 0L : j, (Integer) null, (i3 & 8) != 0 ? null : str, (i3 & 16) != 0 ? null : str2);
    }

    public ImageLoadMonitorParams(int i, int i2, long j, Integer num, String str, String str2) {
        this.index = i;
        this.status = i2;
        this.duration = j;
        this.aid = str;
        this.url = str2;
        this.errorCode = num;
    }
}
