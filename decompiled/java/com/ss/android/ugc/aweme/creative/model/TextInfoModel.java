package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.TextInfoModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class TextInfoModel implements Parcelable {
    public static final Parcelable.Creator<TextInfoModel> CREATOR = new Parcelable.Creator<TextInfoModel>() { // from class: X.0Xjn
        @Override // android.os.Parcelable.Creator
        public final TextInfoModel createFromParcel(Parcel parcel) {
            return new TextInfoModel(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TextInfoModel[] newArray(int i) {
            return new TextInfoModel[i];
        }
    };

    @C09CT("text_description")
    public String textDescription;

    @C09CT("text_title")
    public String textTitle;

    public TextInfoModel() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextInfoModel)) {
            return false;
        }
        TextInfoModel textInfoModel = (TextInfoModel) obj;
        return Intrinsics.LJFF(this.textTitle, textInfoModel.textTitle) && Intrinsics.LJFF(this.textDescription, textInfoModel.textDescription);
    }

    public final int hashCode() {
        String str = this.textTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.textDescription;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextInfoModel(textTitle=");
        sbLIZ.append(this.textTitle);
        sbLIZ.append(", textDescription=");
        sbLIZ.append(this.textDescription);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.textTitle);
        parcel.writeString(this.textDescription);
    }

    public TextInfoModel(String str, String str2) {
        this.textTitle = str;
        this.textDescription = str2;
    }
}
