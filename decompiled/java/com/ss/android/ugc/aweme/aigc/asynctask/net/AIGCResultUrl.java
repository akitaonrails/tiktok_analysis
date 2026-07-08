package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.aigc.asynctask.net.AIGCResultUrl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCResultUrl implements Parcelable {

    @C09CT("original_url")
    public final String originalUrl;

    @C09CT("thumbnail_url")
    public final String thumbnailUrl;
    public static final Parcelable.Creator<AIGCResultUrl> CREATOR = new Parcelable.Creator<AIGCResultUrl>() { // from class: X.0LWd
        @Override // android.os.Parcelable.Creator
        public final AIGCResultUrl createFromParcel(Parcel parcel) {
            return new AIGCResultUrl(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AIGCResultUrl[] newArray(int i) {
            return new AIGCResultUrl[i];
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
        if (!(obj instanceof AIGCResultUrl)) {
            return false;
        }
        AIGCResultUrl aIGCResultUrl = (AIGCResultUrl) obj;
        return Intrinsics.LJFF(this.originalUrl, aIGCResultUrl.originalUrl) && Intrinsics.LJFF(this.thumbnailUrl, aIGCResultUrl.thumbnailUrl);
    }

    public final int hashCode() {
        String str = this.originalUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.thumbnailUrl;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCResultUrl(originalUrl=");
        sbLIZ.append(this.originalUrl);
        sbLIZ.append(", thumbnailUrl=");
        sbLIZ.append(this.thumbnailUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.originalUrl);
        parcel.writeString(this.thumbnailUrl);
    }

    public AIGCResultUrl(String str, String str2) {
        this.originalUrl = str;
        this.thumbnailUrl = str2;
    }
}
