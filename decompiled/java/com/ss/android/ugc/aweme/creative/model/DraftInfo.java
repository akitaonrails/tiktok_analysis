package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.DraftInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class DraftInfo implements Parcelable {
    public static final Parcelable.Creator<DraftInfo> CREATOR = new Parcelable.Creator<DraftInfo>() { // from class: X.0sib
        @Override // android.os.Parcelable.Creator
        public final DraftInfo createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                z2 = false;
            }
            return new DraftInfo(string, z, z2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DraftInfo[] newArray(int i) {
            return new DraftInfo[i];
        }
    };

    @C09CT("draftId")
    public final String draftId;

    @C09CT("enableSubmission")
    public boolean enableSubmission;

    @C09CT("hintStarlingKey")
    public final String hintStarlingKey;

    @C09CT("needSubmission")
    public boolean needSubmission;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftInfo)) {
            return false;
        }
        DraftInfo draftInfo = (DraftInfo) obj;
        return Intrinsics.LJFF(this.draftId, draftInfo.draftId) && this.needSubmission == draftInfo.needSubmission && this.enableSubmission == draftInfo.enableSubmission && Intrinsics.LJFF(this.hintStarlingKey, draftInfo.hintStarlingKey);
    }

    public final int hashCode() {
        return (((((this.draftId.hashCode() * 31) + C786410Ut5.Z2(this.needSubmission)) * 31) + C786410Ut5.Z2(this.enableSubmission)) * 31) + this.hintStarlingKey.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftInfo(draftId=");
        sbLIZ.append(this.draftId);
        sbLIZ.append(", needSubmission=");
        sbLIZ.append(this.needSubmission);
        sbLIZ.append(", enableSubmission=");
        sbLIZ.append(this.enableSubmission);
        sbLIZ.append(", hintStarlingKey=");
        sbLIZ.append(this.hintStarlingKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.draftId);
        parcel.writeInt(this.needSubmission ? 1 : 0);
        parcel.writeInt(this.enableSubmission ? 1 : 0);
        parcel.writeString(this.hintStarlingKey);
    }

    public DraftInfo() {
        this("", false, true, "");
    }

    public DraftInfo(String str, boolean z, boolean z2, String str2) {
        this.draftId = str;
        this.needSubmission = z;
        this.enableSubmission = z2;
        this.hintStarlingKey = str2;
    }
}
