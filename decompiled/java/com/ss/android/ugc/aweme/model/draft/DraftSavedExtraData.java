package com.ss.android.ugc.aweme.model.draft;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.model.draft.DraftSavedExtraData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class DraftSavedExtraData implements Parcelable {
    public static final Parcelable.Creator<DraftSavedExtraData> CREATOR = new Parcelable.Creator<DraftSavedExtraData>() { // from class: X.0vI7
        @Override // android.os.Parcelable.Creator
        public final DraftSavedExtraData createFromParcel(Parcel parcel) {
            return new DraftSavedExtraData(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DraftSavedExtraData[] newArray(int i) {
            return new DraftSavedExtraData[i];
        }
    };
    public final String enteredName;
    public final String iconAssetId;
    public final String isProTemplate;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftSavedExtraData)) {
            return false;
        }
        DraftSavedExtraData draftSavedExtraData = (DraftSavedExtraData) obj;
        return Intrinsics.LJFF(this.enteredName, draftSavedExtraData.enteredName) && Intrinsics.LJFF(this.iconAssetId, draftSavedExtraData.iconAssetId) && Intrinsics.LJFF(this.isProTemplate, draftSavedExtraData.isProTemplate);
    }

    public final int hashCode() {
        return (((this.enteredName.hashCode() * 31) + this.iconAssetId.hashCode()) * 31) + this.isProTemplate.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftSavedExtraData(enteredName=");
        sbLIZ.append(this.enteredName);
        sbLIZ.append(", iconAssetId=");
        sbLIZ.append(this.iconAssetId);
        sbLIZ.append(", isProTemplate=");
        sbLIZ.append(this.isProTemplate);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.enteredName);
        parcel.writeString(this.iconAssetId);
        parcel.writeString(this.isProTemplate);
    }

    public DraftSavedExtraData() {
        this("", "", "1");
    }

    public DraftSavedExtraData(String str, String str2, String str3) {
        this.enteredName = str;
        this.iconAssetId = str2;
        this.isProTemplate = str3;
    }
}
