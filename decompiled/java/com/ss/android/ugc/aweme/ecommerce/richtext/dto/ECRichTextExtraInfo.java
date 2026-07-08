package com.ss.android.ugc.aweme.ecommerce.richtext.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextExtraInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ECRichTextExtraInfo implements Parcelable {
    public static final Parcelable.Creator<ECRichTextExtraInfo> CREATOR = new Parcelable.Creator<ECRichTextExtraInfo>() { // from class: X.02ml
        @Override // android.os.Parcelable.Creator
        public final ECRichTextExtraInfo createFromParcel(Parcel parcel) {
            return new ECRichTextExtraInfo(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ECRichTextExtraInfo[] newArray(int i) {
            return new ECRichTextExtraInfo[i];
        }
    };

    @C09CT("content")
    public String content;

    @C09CT("da_info")
    public String daInfo;

    public ECRichTextExtraInfo() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECRichTextExtraInfo)) {
            return false;
        }
        ECRichTextExtraInfo eCRichTextExtraInfo = (ECRichTextExtraInfo) obj;
        return Intrinsics.LJFF(this.daInfo, eCRichTextExtraInfo.daInfo) && Intrinsics.LJFF(this.content, eCRichTextExtraInfo.content);
    }

    public final int hashCode() {
        String str = this.daInfo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ECRichTextExtraInfo(daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.daInfo);
        parcel.writeString(this.content);
    }

    public ECRichTextExtraInfo(String str, String str2) {
        this.daInfo = str;
        this.content = str2;
    }
}
