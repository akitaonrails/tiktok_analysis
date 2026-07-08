package com.ss.android.ugc.aweme.shortvideo.cut;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.cut.BackgroundVideoCompileConfigure;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class BackgroundVideoCompileConfigure extends CutVideoCompileConfigure {
    public final String audioOutputPath;
    public final String videoOutputPath;
    public static final Parcelable.Creator<BackgroundVideoCompileConfigure> CREATOR = new Parcelable.Creator<BackgroundVideoCompileConfigure>() { // from class: X.0L37
        @Override // android.os.Parcelable.Creator
        public final BackgroundVideoCompileConfigure createFromParcel(Parcel parcel) {
            return new BackgroundVideoCompileConfigure(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BackgroundVideoCompileConfigure[] newArray(int i) {
            return new BackgroundVideoCompileConfigure[i];
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
        if (!(obj instanceof BackgroundVideoCompileConfigure)) {
            return false;
        }
        BackgroundVideoCompileConfigure backgroundVideoCompileConfigure = (BackgroundVideoCompileConfigure) obj;
        return Intrinsics.LJFF(this.videoOutputPath, backgroundVideoCompileConfigure.videoOutputPath) && Intrinsics.LJFF(this.audioOutputPath, backgroundVideoCompileConfigure.audioOutputPath);
    }

    public final int hashCode() {
        return (this.videoOutputPath.hashCode() * 31) + this.audioOutputPath.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BackgroundVideoCompileConfigure(videoOutputPath=");
        sbLIZ.append(this.videoOutputPath);
        sbLIZ.append(", audioOutputPath=");
        sbLIZ.append(this.audioOutputPath);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.videoOutputPath);
        parcel.writeString(this.audioOutputPath);
    }

    public BackgroundVideoCompileConfigure() {
        this("", "");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.CutVideoCompileConfigure
    public final String LIZ() {
        return this.audioOutputPath;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.CutVideoCompileConfigure
    public final String LIZIZ() {
        return this.videoOutputPath;
    }

    public BackgroundVideoCompileConfigure(String str, String str2) {
        this.videoOutputPath = str;
        this.audioOutputPath = str2;
    }
}
