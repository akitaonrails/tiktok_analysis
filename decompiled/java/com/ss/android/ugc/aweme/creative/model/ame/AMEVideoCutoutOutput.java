package com.ss.android.ugc.aweme.creative.model.ame;

import X.C040H;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.ame.AMEVideoCutoutOutput;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AMEVideoCutoutOutput implements Parcelable {
    public static final Parcelable.Creator<AMEVideoCutoutOutput> CREATOR = new Parcelable.Creator<AMEVideoCutoutOutput>() { // from class: X.0LvR
        @Override // android.os.Parcelable.Creator
        public final AMEVideoCutoutOutput createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new AMEVideoCutoutOutput(string, string2, i, i2, i3, i4, z);
        }

        @Override // android.os.Parcelable.Creator
        public final AMEVideoCutoutOutput[] newArray(int i) {
            return new AMEVideoCutoutOutput[i];
        }
    };

    @C040H
    public final String editedVideoPath;

    @C040H
    public final int endBoundaryMillis;

    @C040H
    public final int height;

    @C040H
    public final boolean removeBackground;

    @C040H
    public final int startBoundaryMillis;

    @C040H
    public final String videoPath;

    @C040H
    public final int width;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AMEVideoCutoutOutput)) {
            return false;
        }
        AMEVideoCutoutOutput aMEVideoCutoutOutput = (AMEVideoCutoutOutput) obj;
        return Intrinsics.LJFF(this.videoPath, aMEVideoCutoutOutput.videoPath) && Intrinsics.LJFF(this.editedVideoPath, aMEVideoCutoutOutput.editedVideoPath) && this.startBoundaryMillis == aMEVideoCutoutOutput.startBoundaryMillis && this.endBoundaryMillis == aMEVideoCutoutOutput.endBoundaryMillis && this.width == aMEVideoCutoutOutput.width && this.height == aMEVideoCutoutOutput.height && this.removeBackground == aMEVideoCutoutOutput.removeBackground;
    }

    public final int hashCode() {
        return (((((((((((this.videoPath.hashCode() * 31) + this.editedVideoPath.hashCode()) * 31) + this.startBoundaryMillis) * 31) + this.endBoundaryMillis) * 31) + this.width) * 31) + this.height) * 31) + C786410Ut5.Z2(this.removeBackground);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AMEVideoCutoutOutput(videoPath=");
        sbLIZ.append(this.videoPath);
        sbLIZ.append(", editedVideoPath=");
        sbLIZ.append(this.editedVideoPath);
        sbLIZ.append(", startBoundaryMillis=");
        sbLIZ.append(this.startBoundaryMillis);
        sbLIZ.append(", endBoundaryMillis=");
        sbLIZ.append(this.endBoundaryMillis);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", removeBackground=");
        sbLIZ.append(this.removeBackground);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.videoPath);
        parcel.writeString(this.editedVideoPath);
        parcel.writeInt(this.startBoundaryMillis);
        parcel.writeInt(this.endBoundaryMillis);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.removeBackground ? 1 : 0);
    }

    public AMEVideoCutoutOutput(String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        this.videoPath = str;
        this.editedVideoPath = str2;
        this.startBoundaryMillis = i;
        this.endBoundaryMillis = i2;
        this.width = i3;
        this.height = i4;
        this.removeBackground = z;
    }
}
