package com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.DiyPropUploadVideoAutoCutConfigure;

/* JADX INFO: loaded from: classes9.dex */
public final class DiyPropUploadVideoAutoCutConfigure implements Parcelable {

    @C09CT("autoCutHeight")
    public final double autoCutHeight;

    @C09CT("autoCutWidth")
    public final double autoCutWidth;

    @C09CT("enableAutoCutting")
    public final boolean enableAutoCutting;

    @C09CT("maxDuration")
    public final long maxDuration;

    @C09CT("maxHeight")
    public final double maxHeight;

    @C09CT("maxWidth")
    public final double maxWidth;

    @C09CT("minDuration")
    public final long minDuration;
    public static final Parcelable.Creator<DiyPropUploadVideoAutoCutConfigure> CREATOR = new Parcelable.Creator<DiyPropUploadVideoAutoCutConfigure>() { // from class: X.0MbU
        @Override // android.os.Parcelable.Creator
        public final DiyPropUploadVideoAutoCutConfigure createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new DiyPropUploadVideoAutoCutConfigure(z, parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final DiyPropUploadVideoAutoCutConfigure[] newArray(int i) {
            return new DiyPropUploadVideoAutoCutConfigure[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiyPropUploadVideoAutoCutConfigure)) {
            return false;
        }
        DiyPropUploadVideoAutoCutConfigure diyPropUploadVideoAutoCutConfigure = (DiyPropUploadVideoAutoCutConfigure) obj;
        return this.enableAutoCutting == diyPropUploadVideoAutoCutConfigure.enableAutoCutting && Double.compare(this.autoCutWidth, diyPropUploadVideoAutoCutConfigure.autoCutWidth) == 0 && Double.compare(this.autoCutHeight, diyPropUploadVideoAutoCutConfigure.autoCutHeight) == 0 && Double.compare(this.maxWidth, diyPropUploadVideoAutoCutConfigure.maxWidth) == 0 && Double.compare(this.maxHeight, diyPropUploadVideoAutoCutConfigure.maxHeight) == 0 && this.minDuration == diyPropUploadVideoAutoCutConfigure.minDuration && this.maxDuration == diyPropUploadVideoAutoCutConfigure.maxDuration;
    }

    public final int hashCode() {
        return (((((((((((C786410Ut5.Z2(this.enableAutoCutting) * 31) + C786410Ut5.X2(this.autoCutWidth)) * 31) + C786410Ut5.X2(this.autoCutHeight)) * 31) + C786410Ut5.X2(this.maxWidth)) * 31) + C786410Ut5.X2(this.maxHeight)) * 31) + C786410Ut5.Y2(this.minDuration)) * 31) + C786410Ut5.Y2(this.maxDuration);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DiyPropUploadVideoAutoCutConfigure(enableAutoCutting=");
        sbLIZ.append(this.enableAutoCutting);
        sbLIZ.append(", autoCutWidth=");
        sbLIZ.append(this.autoCutWidth);
        sbLIZ.append(", autoCutHeight=");
        sbLIZ.append(this.autoCutHeight);
        sbLIZ.append(", maxWidth=");
        sbLIZ.append(this.maxWidth);
        sbLIZ.append(", maxHeight=");
        sbLIZ.append(this.maxHeight);
        sbLIZ.append(", minDuration=");
        sbLIZ.append(this.minDuration);
        sbLIZ.append(", maxDuration=");
        sbLIZ.append(this.maxDuration);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.enableAutoCutting ? 1 : 0);
        parcel.writeDouble(this.autoCutWidth);
        parcel.writeDouble(this.autoCutHeight);
        parcel.writeDouble(this.maxWidth);
        parcel.writeDouble(this.maxHeight);
        parcel.writeLong(this.minDuration);
        parcel.writeLong(this.maxDuration);
    }

    public DiyPropUploadVideoAutoCutConfigure(boolean z, double d, double d2, double d3, double d4, long j, long j2) {
        this.enableAutoCutting = z;
        this.autoCutWidth = d;
        this.autoCutHeight = d2;
        this.maxWidth = d3;
        this.maxHeight = d4;
        this.minDuration = j;
        this.maxDuration = j2;
    }
}
