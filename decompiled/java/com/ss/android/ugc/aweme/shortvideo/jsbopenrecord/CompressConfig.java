package com.ss.android.ugc.aweme.shortvideo.jsbopenrecord;

import X.C040H;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.CompressConfig;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class CompressConfig implements Parcelable {
    public static final Parcelable.Creator<CompressConfig> CREATOR = new Parcelable.Creator<CompressConfig>() { // from class: X.0LEm
        @Override // android.os.Parcelable.Creator
        public final CompressConfig createFromParcel(Parcel parcel) {
            Float fValueOf;
            Float fValueOf2;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                fValueOf = null;
            } else {
                fValueOf = Float.valueOf(parcel.readFloat());
            }
            if (parcel.readInt() == 0) {
                fValueOf2 = null;
            } else {
                fValueOf2 = Float.valueOf(parcel.readFloat());
            }
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
            }
            return new CompressConfig(fValueOf, fValueOf2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CompressConfig[] newArray(int i) {
            return new CompressConfig[i];
        }
    };

    @C040H
    public final Float imageCompress;

    @C040H
    public final ArrayList<Integer> targetSize;

    @C040H
    public final Float videoCompress;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompressConfig)) {
            return false;
        }
        CompressConfig compressConfig = (CompressConfig) obj;
        return Intrinsics.LJFF(this.imageCompress, compressConfig.imageCompress) && Intrinsics.LJFF(this.videoCompress, compressConfig.videoCompress) && Intrinsics.LJFF(this.targetSize, compressConfig.targetSize);
    }

    public final int hashCode() {
        Float f = this.imageCompress;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.videoCompress;
        int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        ArrayList<Integer> arrayList = this.targetSize;
        return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompressConfig(imageCompress=");
        sbLIZ.append(this.imageCompress);
        sbLIZ.append(", videoCompress=");
        sbLIZ.append(this.videoCompress);
        sbLIZ.append(", targetSize=");
        sbLIZ.append(this.targetSize);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Float f = this.imageCompress;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Float f2 = this.videoCompress;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        ArrayList<Integer> arrayList = this.targetSize;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList.size());
        Iterator<Integer> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            parcel.writeInt(it2.next().intValue());
        }
    }

    public CompressConfig(Float f, Float f2, ArrayList<Integer> arrayList) {
        this.imageCompress = f;
        this.videoCompress = f2;
        this.targetSize = arrayList;
    }
}
