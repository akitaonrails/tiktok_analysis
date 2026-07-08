package com.ss.android.ugc.aweme.creative.model.tns;

import X.C040H;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.tns.AnsaPromptModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class AnsaPromptModel implements Parcelable {
    public static final Parcelable.Creator<AnsaPromptModel> CREATOR = new Parcelable.Creator<AnsaPromptModel>() { // from class: X.0Yx0
        @Override // android.os.Parcelable.Creator
        public final AnsaPromptModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new AnsaPromptModel(z, string, string2, string3, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final AnsaPromptModel[] newArray(int i) {
            return new AnsaPromptModel[i];
        }
    };

    @C040H
    public boolean hasCheckedShouldShow;

    @C040H
    public boolean needPrompt;

    @C040H
    public String videoCoverUri;

    @C040H
    public String videoTitle;

    @C040H
    public String violationType;

    public AnsaPromptModel() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnsaPromptModel)) {
            return false;
        }
        AnsaPromptModel ansaPromptModel = (AnsaPromptModel) obj;
        return this.needPrompt == ansaPromptModel.needPrompt && Intrinsics.LJFF(this.videoTitle, ansaPromptModel.videoTitle) && Intrinsics.LJFF(this.videoCoverUri, ansaPromptModel.videoCoverUri) && Intrinsics.LJFF(this.violationType, ansaPromptModel.violationType) && this.hasCheckedShouldShow == ansaPromptModel.hasCheckedShouldShow;
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.needPrompt) * 31;
        String str = this.videoTitle;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.videoCoverUri;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.violationType;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.hasCheckedShouldShow);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnsaPromptModel(needPrompt=");
        sbLIZ.append(this.needPrompt);
        sbLIZ.append(", videoTitle=");
        sbLIZ.append(this.videoTitle);
        sbLIZ.append(", videoCoverUri=");
        sbLIZ.append(this.videoCoverUri);
        sbLIZ.append(", violationType=");
        sbLIZ.append(this.violationType);
        sbLIZ.append(", hasCheckedShouldShow=");
        sbLIZ.append(this.hasCheckedShouldShow);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.needPrompt ? 1 : 0);
        parcel.writeString(this.videoTitle);
        parcel.writeString(this.videoCoverUri);
        parcel.writeString(this.violationType);
        parcel.writeInt(this.hasCheckedShouldShow ? 1 : 0);
    }

    public /* synthetic */ AnsaPromptModel(int i) {
        this(false, null, null, null, false);
    }

    public AnsaPromptModel(boolean z, String str, String str2, String str3, boolean z2) {
        this.needPrompt = z;
        this.videoTitle = str;
        this.videoCoverUri = str2;
        this.violationType = str3;
        this.hasCheckedShouldShow = z2;
    }
}
