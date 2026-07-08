package com.ss.android.ugc.aweme.shortvideo.cut;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.cut.DiyPropVideoCompileConfigure;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class DiyPropVideoCompileConfigure extends CutVideoCompileConfigure {
    public final String videoOutputPath;
    public static final Parcelable.Creator<DiyPropVideoCompileConfigure> CREATOR = new Parcelable.Creator<DiyPropVideoCompileConfigure>() { // from class: X.0L36
        @Override // android.os.Parcelable.Creator
        public final DiyPropVideoCompileConfigure createFromParcel(Parcel parcel) {
            return new DiyPropVideoCompileConfigure(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DiyPropVideoCompileConfigure[] newArray(int i) {
            return new DiyPropVideoCompileConfigure[i];
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
        return (obj instanceof DiyPropVideoCompileConfigure) && Intrinsics.LJFF(this.videoOutputPath, ((DiyPropVideoCompileConfigure) obj).videoOutputPath);
    }

    public final int hashCode() {
        return this.videoOutputPath.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DiyPropVideoCompileConfigure(videoOutputPath=");
        sbLIZ.append(this.videoOutputPath);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.videoOutputPath);
    }

    public DiyPropVideoCompileConfigure() {
        this("");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.CutVideoCompileConfigure
    public final String LIZIZ() {
        return this.videoOutputPath;
    }

    public DiyPropVideoCompileConfigure(String str) {
        this.videoOutputPath = str;
    }
}
