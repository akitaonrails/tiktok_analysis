package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewSourceInfo;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ReviewSourceInfo implements Parcelable {

    @C09CT("content")
    public final ECRichText content;

    @C09CT("link")
    public final String link;

    @C09CT("title")
    public final String title;
    public static final Parcelable.Creator<ReviewSourceInfo> CREATOR = new Parcelable.Creator<ReviewSourceInfo>() { // from class: X.0mhg
        @Override // android.os.Parcelable.Creator
        public final ReviewSourceInfo createFromParcel(Parcel parcel) {
            return new ReviewSourceInfo(parcel.readString(), (ECRichText) parcel.readParcelable(ReviewSourceInfo.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReviewSourceInfo[] newArray(int i) {
            return new ReviewSourceInfo[i];
        }
    };
    public static final int $stable = 8;

    public ReviewSourceInfo() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewSourceInfo)) {
            return false;
        }
        ReviewSourceInfo reviewSourceInfo = (ReviewSourceInfo) obj;
        return Intrinsics.LJFF(this.title, reviewSourceInfo.title) && Intrinsics.LJFF(this.content, reviewSourceInfo.content) && Intrinsics.LJFF(this.link, reviewSourceInfo.link);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ECRichText eCRichText = this.content;
        int iHashCode2 = (iHashCode + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        String str2 = this.link;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReviewSourceInfo(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", link=");
        sbLIZ.append(this.link);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.content, i);
        parcel.writeString(this.link);
    }

    public ReviewSourceInfo(String str, ECRichText eCRichText, String str2) {
        this.title = str;
        this.content = eCRichText;
        this.link = str2;
    }
}
