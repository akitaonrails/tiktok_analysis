package com.ss.android.ugc.aweme.creative.model.common;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.common.PromptJsonModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class PromptJsonModel implements Parcelable {
    public static final Parcelable.Creator<PromptJsonModel> CREATOR = new Parcelable.Creator<PromptJsonModel>() { // from class: X.0LNm
        @Override // android.os.Parcelable.Creator
        public final PromptJsonModel createFromParcel(Parcel parcel) {
            return new PromptJsonModel(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PromptJsonModel[] newArray(int i) {
            return new PromptJsonModel[i];
        }
    };

    @C09CT("content")
    public final String content;

    @C09CT("type")
    public final String type;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromptJsonModel)) {
            return false;
        }
        PromptJsonModel promptJsonModel = (PromptJsonModel) obj;
        return Intrinsics.LJFF(this.type, promptJsonModel.type) && Intrinsics.LJFF(this.content, promptJsonModel.content);
    }

    public final int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PromptJsonModel(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.content);
    }

    public PromptJsonModel(String str, String str2) {
        this.type = str;
        this.content = str2;
    }
}
