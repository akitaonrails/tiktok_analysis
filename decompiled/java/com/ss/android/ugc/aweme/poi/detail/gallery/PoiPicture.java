package com.ss.android.ugc.aweme.poi.detail.gallery;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPicture implements Serializable {

    @C09CT("author")
    public final PoiPictureAuthorModel author;

    @C09CT("can_report")
    public final Boolean canReport;

    @C09CT("compressed_url_info")
    public final UrlModel compressedUrlInfo;

    @C09CT("entity_id")
    public final String entityId;

    @C09CT("entity_type")
    public final Integer entityType;

    @C09CT("origin_url_info")
    public final UrlModel originUrlInfo;

    @C09CT("pic_id")
    public final String picId;

    @C09CT("pic_source")
    public final String picSource;

    @C09CT("ref_code")
    public final String refCode;

    @C09CT("review_id")
    public final String reviewId;

    @C09CT("source")
    public final String source;

    @C09CT("url_info")
    public final UrlModel urlModel;

    public PoiPicture() {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiPicture)) {
            return false;
        }
        PoiPicture poiPicture = (PoiPicture) obj;
        return Intrinsics.LJFF(this.urlModel, poiPicture.urlModel) && Intrinsics.LJFF(this.originUrlInfo, poiPicture.originUrlInfo) && Intrinsics.LJFF(this.compressedUrlInfo, poiPicture.compressedUrlInfo) && Intrinsics.LJFF(this.source, poiPicture.source) && Intrinsics.LJFF(this.author, poiPicture.author) && Intrinsics.LJFF(this.picId, poiPicture.picId) && Intrinsics.LJFF(this.refCode, poiPicture.refCode) && Intrinsics.LJFF(this.canReport, poiPicture.canReport) && Intrinsics.LJFF(this.entityType, poiPicture.entityType) && Intrinsics.LJFF(this.entityId, poiPicture.entityId) && Intrinsics.LJFF(this.picSource, poiPicture.picSource) && Intrinsics.LJFF(this.reviewId, poiPicture.reviewId);
    }

    public int hashCode() {
        UrlModel urlModel = this.urlModel;
        int iHashCode = (urlModel == null ? 0 : urlModel.hashCode()) * 31;
        UrlModel urlModel2 = this.originUrlInfo;
        int iHashCode2 = (iHashCode + (urlModel2 == null ? 0 : urlModel2.hashCode())) * 31;
        UrlModel urlModel3 = this.compressedUrlInfo;
        int iHashCode3 = (iHashCode2 + (urlModel3 == null ? 0 : urlModel3.hashCode())) * 31;
        String str = this.source;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        PoiPictureAuthorModel poiPictureAuthorModel = this.author;
        int iHashCode5 = (iHashCode4 + (poiPictureAuthorModel == null ? 0 : poiPictureAuthorModel.hashCode())) * 31;
        String str2 = this.picId;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.refCode;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.canReport;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.entityType;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.entityId;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.picSource;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.reviewId;
        return iHashCode11 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "PoiPicture(urlModel=" + this.urlModel + ", originUrlInfo=" + this.originUrlInfo + ", compressedUrlInfo=" + this.compressedUrlInfo + ", source=" + this.source + ", author=" + this.author + ", picId=" + this.picId + ", refCode=" + this.refCode + ", canReport=" + this.canReport + ", entityType=" + this.entityType + ", entityId=" + this.entityId + ", picSource=" + this.picSource + ", reviewId=" + this.reviewId + ')';
    }

    public PoiPicture(UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, String str, PoiPictureAuthorModel poiPictureAuthorModel, String str2, String str3, Boolean bool, Integer num, String str4, String str5, String str6) {
        this.urlModel = urlModel;
        this.originUrlInfo = urlModel2;
        this.compressedUrlInfo = urlModel3;
        this.source = str;
        this.author = poiPictureAuthorModel;
        this.picId = str2;
        this.refCode = str3;
        this.canReport = bool;
        this.entityType = num;
        this.entityId = str4;
        this.picSource = str5;
        this.reviewId = str6;
    }
}
