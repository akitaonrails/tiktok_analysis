package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ArticlePostModel implements Parcelable {
    public static final Parcelable.Creator<ArticlePostModel> CREATOR = new Creator();

    @C09CT("rss_guid")
    public final String rssGuid;

    @C09CT("rss_url")
    public final String rssUrl;

    public static final class Creator implements Parcelable.Creator<ArticlePostModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArticlePostModel createFromParcel(Parcel parcel) {
            return new ArticlePostModel(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArticlePostModel[] newArray(int i) {
            return new ArticlePostModel[i];
        }
    }

    public final ArticlePostModel copy(String str, String str2) {
        return new ArticlePostModel(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArticlePostModel)) {
            return false;
        }
        ArticlePostModel articlePostModel = (ArticlePostModel) obj;
        return Intrinsics.LJFF(this.rssGuid, articlePostModel.rssGuid) && Intrinsics.LJFF(this.rssUrl, articlePostModel.rssUrl);
    }

    public int hashCode() {
        return (this.rssGuid.hashCode() * 31) + this.rssUrl.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ArticlePostModel(rssGuid=");
        sbLIZ.append(this.rssGuid);
        sbLIZ.append(", rssUrl=");
        sbLIZ.append(this.rssUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.rssGuid);
        parcel.writeString(this.rssUrl);
    }

    public ArticlePostModel() {
        this("", "");
    }

    public final String getRssGuid() {
        return this.rssGuid;
    }

    public final String getRssUrl() {
        return this.rssUrl;
    }

    public ArticlePostModel(String str, String str2) {
        this.rssGuid = str;
        this.rssUrl = str2;
    }
}
