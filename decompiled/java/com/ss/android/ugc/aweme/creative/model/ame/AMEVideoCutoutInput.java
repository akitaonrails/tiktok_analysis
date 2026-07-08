package com.ss.android.ugc.aweme.creative.model.ame;

import X.C040H;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.ame.AMEVideoCutoutInput;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AMEVideoCutoutInput implements Parcelable {
    public static final Parcelable.Creator<AMEVideoCutoutInput> CREATOR = new Parcelable.Creator<AMEVideoCutoutInput>() { // from class: X.0LvQ
        @Override // android.os.Parcelable.Creator
        public final AMEVideoCutoutInput createFromParcel(Parcel parcel) {
            return new AMEVideoCutoutInput(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), CreativeInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AMEVideoCutoutInput[] newArray(int i) {
            return new AMEVideoCutoutInput[i];
        }
    };

    @C040H
    public final String contentSource;

    @C040H
    public final String contentType;

    @C040H
    public final CreativeInfo creativeInfo;

    @C040H
    public final int endBoundaryMillis;

    @C040H
    public final String shootWay;

    @C040H
    public final int startBoundaryMillis;

    @C040H
    public final String videoPath;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AMEVideoCutoutInput)) {
            return false;
        }
        AMEVideoCutoutInput aMEVideoCutoutInput = (AMEVideoCutoutInput) obj;
        return Intrinsics.LJFF(this.shootWay, aMEVideoCutoutInput.shootWay) && Intrinsics.LJFF(this.contentSource, aMEVideoCutoutInput.contentSource) && Intrinsics.LJFF(this.contentType, aMEVideoCutoutInput.contentType) && Intrinsics.LJFF(this.videoPath, aMEVideoCutoutInput.videoPath) && this.startBoundaryMillis == aMEVideoCutoutInput.startBoundaryMillis && this.endBoundaryMillis == aMEVideoCutoutInput.endBoundaryMillis && Intrinsics.LJFF(this.creativeInfo, aMEVideoCutoutInput.creativeInfo);
    }

    public final int hashCode() {
        return (((((((((((this.shootWay.hashCode() * 31) + this.contentSource.hashCode()) * 31) + this.contentType.hashCode()) * 31) + this.videoPath.hashCode()) * 31) + this.startBoundaryMillis) * 31) + this.endBoundaryMillis) * 31) + this.creativeInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AMEVideoCutoutInput(shootWay=");
        sbLIZ.append(this.shootWay);
        sbLIZ.append(", contentSource=");
        sbLIZ.append(this.contentSource);
        sbLIZ.append(", contentType=");
        sbLIZ.append(this.contentType);
        sbLIZ.append(", videoPath=");
        sbLIZ.append(this.videoPath);
        sbLIZ.append(", startBoundaryMillis=");
        sbLIZ.append(this.startBoundaryMillis);
        sbLIZ.append(", endBoundaryMillis=");
        sbLIZ.append(this.endBoundaryMillis);
        sbLIZ.append(", creativeInfo=");
        sbLIZ.append(this.creativeInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.shootWay);
        parcel.writeString(this.contentSource);
        parcel.writeString(this.contentType);
        parcel.writeString(this.videoPath);
        parcel.writeInt(this.startBoundaryMillis);
        parcel.writeInt(this.endBoundaryMillis);
        this.creativeInfo.writeToParcel(parcel, i);
    }

    public AMEVideoCutoutInput(String str, String str2, String str3, String str4, int i, int i2, CreativeInfo creativeInfo) {
        this.shootWay = str;
        this.contentSource = str2;
        this.contentType = str3;
        this.videoPath = str4;
        this.startBoundaryMillis = i;
        this.endBoundaryMillis = i2;
        this.creativeInfo = creativeInfo;
    }
}
