package com.ss.android.ugc.aweme.im.creative.common.api.model.data;

import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1294060jmO;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.DMMediaModelMirror;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.GroupShotParam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
@InterfaceC1294060jmO
public final class DMMediaModelMirror implements Parcelable {
    public static final Parcelable.Creator<DMMediaModelMirror> CREATOR = new Parcelable.Creator<DMMediaModelMirror>() { // from class: X.0nhp
        @Override // android.os.Parcelable.Creator
        public final DMMediaModelMirror createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            GroupShotParam groupShotParamCreateFromParcel;
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() == 0) {
                groupShotParamCreateFromParcel = null;
            } else {
                groupShotParamCreateFromParcel = GroupShotParam.CREATOR.createFromParcel(parcel);
            }
            return new DMMediaModelMirror(i, string, string2, string3, z, z2, z3, groupShotParamCreateFromParcel, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DMMediaModelMirror[] newArray(int i) {
            return new DMMediaModelMirror[i];
        }
    };
    public final GroupShotParam groupShotData;
    public final boolean isFromMainPost;
    public final boolean isSynthesised;
    public final String outputCoverFile;
    public final String photoFile;
    public String photoSwapScene;
    public final boolean skipExtractVideoCover;
    public final String synthesisedFile;
    public final int type;

    /* JADX WARN: Multi-variable type inference failed */
    public DMMediaModelMirror() {
        this(0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DMMediaModelMirror)) {
            return false;
        }
        DMMediaModelMirror dMMediaModelMirror = (DMMediaModelMirror) obj;
        return this.type == dMMediaModelMirror.type && Intrinsics.LJFF(this.photoFile, dMMediaModelMirror.photoFile) && Intrinsics.LJFF(this.synthesisedFile, dMMediaModelMirror.synthesisedFile) && Intrinsics.LJFF(this.outputCoverFile, dMMediaModelMirror.outputCoverFile) && this.isSynthesised == dMMediaModelMirror.isSynthesised && this.skipExtractVideoCover == dMMediaModelMirror.skipExtractVideoCover && this.isFromMainPost == dMMediaModelMirror.isFromMainPost && Intrinsics.LJFF(this.groupShotData, dMMediaModelMirror.groupShotData) && Intrinsics.LJFF(this.photoSwapScene, dMMediaModelMirror.photoSwapScene);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.type * 31) + this.photoFile.hashCode()) * 31) + this.synthesisedFile.hashCode()) * 31) + this.outputCoverFile.hashCode()) * 31) + C786410Ut5.Z2(this.isSynthesised)) * 31) + C786410Ut5.Z2(this.skipExtractVideoCover)) * 31) + C786410Ut5.Z2(this.isFromMainPost)) * 31;
        GroupShotParam groupShotParam = this.groupShotData;
        int iHashCode2 = (iHashCode + (groupShotParam == null ? 0 : groupShotParam.hashCode())) * 31;
        String str = this.photoSwapScene;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DMMediaModelMirror(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", photoFile=");
        sbLIZ.append(this.photoFile);
        sbLIZ.append(", synthesisedFile=");
        sbLIZ.append(this.synthesisedFile);
        sbLIZ.append(", outputCoverFile=");
        sbLIZ.append(this.outputCoverFile);
        sbLIZ.append(", isSynthesised=");
        sbLIZ.append(this.isSynthesised);
        sbLIZ.append(", skipExtractVideoCover=");
        sbLIZ.append(this.skipExtractVideoCover);
        sbLIZ.append(", isFromMainPost=");
        sbLIZ.append(this.isFromMainPost);
        sbLIZ.append(", groupShotData=");
        sbLIZ.append(this.groupShotData);
        sbLIZ.append(", photoSwapScene=");
        sbLIZ.append(this.photoSwapScene);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.type);
        parcel.writeString(this.photoFile);
        parcel.writeString(this.synthesisedFile);
        parcel.writeString(this.outputCoverFile);
        parcel.writeInt(this.isSynthesised ? 1 : 0);
        parcel.writeInt(this.skipExtractVideoCover ? 1 : 0);
        parcel.writeInt(this.isFromMainPost ? 1 : 0);
        GroupShotParam groupShotParam = this.groupShotData;
        if (groupShotParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupShotParam.writeToParcel(parcel, i);
        }
        parcel.writeString(this.photoSwapScene);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DMMediaModelMirror(int i, String str, GroupShotParam groupShotParam, String str2, int i2) {
        String str3;
        GroupShotParam groupShotParam2 = groupShotParam;
        String str4 = str;
        int i3 = (i2 & 1) != 0 ? 0 : i;
        str4 = (i2 & 2) != 0 ? "" : str4;
        if ((i2 & 4) != 0) {
            str3 = "";
        } else {
            str3 = null;
        }
        this(i3, str4, str3, (i2 & 8) == 0 ? null : "", false, false, false, (i2 & 128) != 0 ? null : groupShotParam2, (i2 & 256) == 0 ? str2 : null);
    }

    public DMMediaModelMirror(int i, String str, String str2, String str3, boolean z, boolean z2, boolean z3, GroupShotParam groupShotParam, String str4) {
        this.type = i;
        this.photoFile = str;
        this.synthesisedFile = str2;
        this.outputCoverFile = str3;
        this.isSynthesised = z;
        this.skipExtractVideoCover = z2;
        this.isFromMainPost = z3;
        this.groupShotData = groupShotParam;
        this.photoSwapScene = str4;
    }
}
