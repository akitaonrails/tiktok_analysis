package com.ss.android.ugc.aweme.article.model;

import X.C09CT;
import X.C123100dR;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.article.model.ArticleStickerStruct;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ArticleStickerStruct implements Parcelable, Serializable {
    public static final Parcelable.Creator<ArticleStickerStruct> CREATOR = new Parcelable.Creator<ArticleStickerStruct>() { // from class: X.02pT
        @Override // android.os.Parcelable.Creator
        public final ArticleStickerStruct createFromParcel(Parcel parcel) {
            return new ArticleStickerStruct(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ArticleStickerStruct[] newArray(int i) {
            return new ArticleStickerStruct[i];
        }
    };

    @C09CT("link")
    public String articleLink;

    @C09CT("title")
    public String articleTitle;

    @C09CT("icon_uri")
    public String brandIconId;

    @C09CT("icon_cdn_url")
    public String brandIconUrl;

    @C09CT("theme_color_code")
    public String brandThemeColor;

    public final ArticleStickerStruct copy(String str, String str2, String str3, String str4, String str5) {
        return new ArticleStickerStruct(str, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArticleStickerStruct)) {
            return false;
        }
        ArticleStickerStruct articleStickerStruct = (ArticleStickerStruct) obj;
        return Intrinsics.LJFF(this.articleLink, articleStickerStruct.articleLink) && Intrinsics.LJFF(this.articleTitle, articleStickerStruct.articleTitle) && Intrinsics.LJFF(this.brandIconId, articleStickerStruct.brandIconId) && Intrinsics.LJFF(this.brandIconUrl, articleStickerStruct.brandIconUrl) && Intrinsics.LJFF(this.brandThemeColor, articleStickerStruct.brandThemeColor);
    }

    public int hashCode() {
        String str = this.articleLink;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.articleTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.brandIconId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.brandIconUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.brandThemeColor;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ArticleStickerStruct(articleLink=");
        sbLIZ.append(this.articleLink);
        sbLIZ.append(", articleTitle=");
        sbLIZ.append(this.articleTitle);
        sbLIZ.append(", brandIconId=");
        sbLIZ.append(this.brandIconId);
        sbLIZ.append(", brandIconUrl=");
        sbLIZ.append(this.brandIconUrl);
        sbLIZ.append(", brandThemeColor=");
        sbLIZ.append(this.brandThemeColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.articleLink);
        parcel.writeString(this.articleTitle);
        parcel.writeString(this.brandIconId);
        parcel.writeString(this.brandIconUrl);
        parcel.writeString(this.brandThemeColor);
    }

    public ArticleStickerStruct() {
        this("", "", "", "", "");
    }

    public final boolean clickable() {
        return C123100dR.LIZ(this.articleLink);
    }

    public final String getArticleLink() {
        return this.articleLink;
    }

    public final String getArticleTitle() {
        return this.articleTitle;
    }

    public final String getBrandIconId() {
        return this.brandIconId;
    }

    public final String getBrandIconUrl() {
        return this.brandIconUrl;
    }

    public final String getBrandThemeColor() {
        return this.brandThemeColor;
    }

    public final void setArticleLink(String str) {
        this.articleLink = str;
    }

    public final void setArticleTitle(String str) {
        this.articleTitle = str;
    }

    public final void setBrandIconId(String str) {
        this.brandIconId = str;
    }

    public final void setBrandIconUrl(String str) {
        this.brandIconUrl = str;
    }

    public final void setBrandThemeColor(String str) {
        this.brandThemeColor = str;
    }

    public ArticleStickerStruct(String str, String str2, String str3, String str4, String str5) {
        this.articleLink = str;
        this.articleTitle = str2;
        this.brandIconId = str3;
        this.brandIconUrl = str4;
        this.brandThemeColor = str5;
    }
}
