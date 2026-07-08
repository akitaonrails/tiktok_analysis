package com.ss.android.ugc.aweme.search.pages.visualsearch.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class TryOnStruct implements Serializable {
    public static final int $stable = 8;

    @C09CT("btn")
    public final String buttonText;

    @C09CT("high_quality_image_uri")
    public final String highQualityImageUri;

    @C09CT("high_quality_image_url")
    public final UrlModel highQualityImageUrl;

    @C09CT("location")
    public final Integer location;

    @C09CT("model_image_url")
    public final UrlModel modelImageUrl;

    @C09CT("query")
    public final String query;

    @C09CT("sub_title")
    public final String subTitle;

    @C09CT("tagname")
    public final String tagName;

    @C09CT("title")
    public final String title;

    public TryOnStruct() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TryOnStruct)) {
            return false;
        }
        TryOnStruct tryOnStruct = (TryOnStruct) obj;
        return Intrinsics.LJFF(this.title, tryOnStruct.title) && Intrinsics.LJFF(this.subTitle, tryOnStruct.subTitle) && Intrinsics.LJFF(this.location, tryOnStruct.location) && Intrinsics.LJFF(this.highQualityImageUri, tryOnStruct.highQualityImageUri) && Intrinsics.LJFF(this.query, tryOnStruct.query) && Intrinsics.LJFF(this.highQualityImageUrl, tryOnStruct.highQualityImageUrl) && Intrinsics.LJFF(this.buttonText, tryOnStruct.buttonText) && Intrinsics.LJFF(this.tagName, tryOnStruct.tagName) && Intrinsics.LJFF(this.modelImageUrl, tryOnStruct.modelImageUrl);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.location;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.highQualityImageUri;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.query;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        UrlModel urlModel = this.highQualityImageUrl;
        int iHashCode6 = (iHashCode5 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str5 = this.buttonText;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.tagName;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        UrlModel urlModel2 = this.modelImageUrl;
        return iHashCode8 + (urlModel2 != null ? urlModel2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TryOnStruct(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", subTitle=");
        sbLIZ.append(this.subTitle);
        sbLIZ.append(", location=");
        sbLIZ.append(this.location);
        sbLIZ.append(", highQualityImageUri=");
        sbLIZ.append(this.highQualityImageUri);
        sbLIZ.append(", query=");
        sbLIZ.append(this.query);
        sbLIZ.append(", highQualityImageUrl=");
        sbLIZ.append(this.highQualityImageUrl);
        sbLIZ.append(", buttonText=");
        sbLIZ.append(this.buttonText);
        sbLIZ.append(", tagName=");
        sbLIZ.append(this.tagName);
        sbLIZ.append(", modelImageUrl=");
        sbLIZ.append(this.modelImageUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TryOnStruct(String str, String str2, Integer num, String str3, String str4, UrlModel urlModel, String str5, String str6, UrlModel urlModel2) {
        this.title = str;
        this.subTitle = str2;
        this.location = num;
        this.highQualityImageUri = str3;
        this.query = str4;
        this.highQualityImageUrl = urlModel;
        this.buttonText = str5;
        this.tagName = str6;
        this.modelImageUrl = urlModel2;
    }
}
