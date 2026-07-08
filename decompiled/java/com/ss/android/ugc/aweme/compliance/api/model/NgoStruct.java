package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class NgoStruct implements Serializable {
    public static final int $stable = 8;

    @C09CT("ngo_about_page")
    public final String ngoAboutPage;

    @C09CT("ngo_cover_image_url")
    public final String ngoCoverImageUrl;

    @C09CT("ngo_currency")
    public final String ngoCurrency;

    @C09CT("ngo_description")
    public final String ngoDescription;

    @C09CT("ngo_donation_link")
    public final String ngoDonationLink;

    @C09CT("ngo_icon")
    public final ImageUrlModel ngoIcon;

    @C09CT("ngo_icon_url")
    public final String ngoIconUrl;

    @C09CT("ngo_is_verified")
    public final Boolean ngoIsVerified;

    @C09CT("ngo_name")
    public final String ngoName;

    @C09CT("ngo_organization_id")
    public final String ngoOrganizationId;

    @C09CT("ngo_uid")
    public final String ngoUid;

    @C09CT("ngo_unique_id")
    public final String ngoUniqueId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NgoStruct)) {
            return false;
        }
        NgoStruct ngoStruct = (NgoStruct) obj;
        return Intrinsics.LJFF(this.ngoName, ngoStruct.ngoName) && Intrinsics.LJFF(this.ngoIconUrl, ngoStruct.ngoIconUrl) && Intrinsics.LJFF(this.ngoDonationLink, ngoStruct.ngoDonationLink) && Intrinsics.LJFF(this.ngoDescription, ngoStruct.ngoDescription) && Intrinsics.LJFF(this.ngoAboutPage, ngoStruct.ngoAboutPage) && Intrinsics.LJFF(this.ngoOrganizationId, ngoStruct.ngoOrganizationId) && Intrinsics.LJFF(this.ngoCoverImageUrl, ngoStruct.ngoCoverImageUrl) && Intrinsics.LJFF(this.ngoUniqueId, ngoStruct.ngoUniqueId) && Intrinsics.LJFF(this.ngoUid, ngoStruct.ngoUid) && Intrinsics.LJFF(this.ngoIsVerified, ngoStruct.ngoIsVerified) && Intrinsics.LJFF(this.ngoIcon, ngoStruct.ngoIcon) && Intrinsics.LJFF(this.ngoCurrency, ngoStruct.ngoCurrency);
    }

    public int hashCode() {
        String str = this.ngoName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ngoIconUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ngoDonationLink;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ngoDescription;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.ngoAboutPage;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.ngoOrganizationId;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.ngoCoverImageUrl;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.ngoUniqueId;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.ngoUid;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool = this.ngoIsVerified;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        ImageUrlModel imageUrlModel = this.ngoIcon;
        int iHashCode11 = (iHashCode10 + (imageUrlModel == null ? 0 : imageUrlModel.hashCode())) * 31;
        String str10 = this.ngoCurrency;
        return iHashCode11 + (str10 != null ? str10.hashCode() : 0);
    }

    public String toString() {
        return "NgoStruct(ngoName=" + this.ngoName + ", ngoIconUrl=" + this.ngoIconUrl + ", ngoDonationLink=" + this.ngoDonationLink + ", ngoDescription=" + this.ngoDescription + ", ngoAboutPage=" + this.ngoAboutPage + ", ngoOrganizationId=" + this.ngoOrganizationId + ", ngoCoverImageUrl=" + this.ngoCoverImageUrl + ", ngoUniqueId=" + this.ngoUniqueId + ", ngoUid=" + this.ngoUid + ", ngoIsVerified=" + this.ngoIsVerified + ", ngoIcon=" + this.ngoIcon + ", ngoCurrency=" + this.ngoCurrency + ')';
    }

    public NgoStruct(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, ImageUrlModel imageUrlModel, String str10) {
        this.ngoName = str;
        this.ngoIconUrl = str2;
        this.ngoDonationLink = str3;
        this.ngoDescription = str4;
        this.ngoAboutPage = str5;
        this.ngoOrganizationId = str6;
        this.ngoCoverImageUrl = str7;
        this.ngoUniqueId = str8;
        this.ngoUid = str9;
        this.ngoIsVerified = bool;
        this.ngoIcon = imageUrlModel;
        this.ngoCurrency = str10;
    }
}
