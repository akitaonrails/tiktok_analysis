package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DetailsInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class DetailsInfo implements Parcelable {

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("content")
    public final String content;

    @C09CT("title")
    public final String title;
    public static final Parcelable.Creator<DetailsInfo> CREATOR = new Parcelable.Creator<DetailsInfo>() { // from class: X.02si
        @Override // android.os.Parcelable.Creator
        public final DetailsInfo createFromParcel(Parcel parcel) {
            return new DetailsInfo(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DetailsInfo[] newArray(int i) {
            return new DetailsInfo[i];
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
        if (!(obj instanceof DetailsInfo)) {
            return false;
        }
        DetailsInfo detailsInfo = (DetailsInfo) obj;
        return Intrinsics.LJFF(this.title, detailsInfo.title) && Intrinsics.LJFF(this.content, detailsInfo.content) && Intrinsics.LJFF(this.buttonText, detailsInfo.buttonText);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonText;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DetailsInfo(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", buttonText=");
        sbLIZ.append(this.buttonText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        parcel.writeString(this.buttonText);
    }

    public DetailsInfo(String str, String str2, String str3) {
        this.title = str;
        this.content = str2;
        this.buttonText = str3;
    }
}
