package com.ss.android.ugc.aweme.portrait.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC2270808v4;
import X.InterfaceC2270908v5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitResultItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitResultItem implements Parcelable {
    public static final Parcelable.Creator<AIPortraitResultItem> CREATOR = new Parcelable.Creator<AIPortraitResultItem>() { // from class: X.0Lef
        @Override // android.os.Parcelable.Creator
        public final AIPortraitResultItem createFromParcel(Parcel parcel) {
            return new AIPortraitResultItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AIPortraitResultItem[] newArray(int i) {
            return new AIPortraitResultItem[i];
        }
    };

    @InterfaceC2270908v5
    @C09CT("localFilePath")
    @InterfaceC2270808v4
    public final String localFilePath;

    @C09CT("thumbnailLocalFilePath")
    public final String thumbnailLocalFilePath;

    @C09CT("thumbnailUrl")
    public final String thumbnailUrl;

    @C09CT("url")
    public final String url;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIPortraitResultItem)) {
            return false;
        }
        AIPortraitResultItem aIPortraitResultItem = (AIPortraitResultItem) obj;
        return Intrinsics.LJFF(this.url, aIPortraitResultItem.url) && Intrinsics.LJFF(this.localFilePath, aIPortraitResultItem.localFilePath) && Intrinsics.LJFF(this.thumbnailUrl, aIPortraitResultItem.thumbnailUrl) && Intrinsics.LJFF(this.thumbnailLocalFilePath, aIPortraitResultItem.thumbnailLocalFilePath);
    }

    public final int hashCode() {
        return (((((this.url.hashCode() * 31) + this.localFilePath.hashCode()) * 31) + this.thumbnailUrl.hashCode()) * 31) + this.thumbnailLocalFilePath.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIPortraitResultItem(url=");
        sbLIZ.append(this.url);
        sbLIZ.append(", localFilePath=");
        sbLIZ.append(this.localFilePath);
        sbLIZ.append(", thumbnailUrl=");
        sbLIZ.append(this.thumbnailUrl);
        sbLIZ.append(", thumbnailLocalFilePath=");
        sbLIZ.append(this.thumbnailLocalFilePath);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeString(this.localFilePath);
        parcel.writeString(this.thumbnailUrl);
        parcel.writeString(this.thumbnailLocalFilePath);
    }

    public AIPortraitResultItem() {
        this("", "", "", "");
    }

    public AIPortraitResultItem(String str, String str2, String str3, String str4) {
        this.url = str;
        this.localFilePath = str2;
        this.thumbnailUrl = str3;
        this.thumbnailLocalFilePath = str4;
    }
}
