package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import X.C786410Ut5;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class FundraiserStruct implements Serializable {
    public static final int $stable = 0;

    @C09CT("create_time")
    public final String createTime;

    @C09CT("creator_id")
    public final String creatorId;

    @C09CT("custom_cover_image_uri")
    public final String customCoverImageUri;

    @C09CT("custom_cover_image_url")
    public final String customCoverImageUrl;

    @C09CT("custom_name")
    public final String customName;

    @C09CT("fundraiser_id")
    public final String fundraiserId;

    @C09CT("goal_amount")
    public final String goalAmount;

    @C09CT("has_offsite_donation")
    public final boolean hasOffsiteDonation;

    @C09CT("language")
    public final String language;

    @C09CT("organization_id")
    public final String organizationId;

    @C09CT("reason_for_support")
    public final String reasonForSupport;

    @C09CT("review_status")
    public final Integer reviewStatus;

    @C09CT("update_time")
    public final String updateTime;

    public FundraiserStruct() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FundraiserStruct)) {
            return false;
        }
        FundraiserStruct fundraiserStruct = (FundraiserStruct) obj;
        return Intrinsics.LJFF(this.fundraiserId, fundraiserStruct.fundraiserId) && Intrinsics.LJFF(this.organizationId, fundraiserStruct.organizationId) && Intrinsics.LJFF(this.creatorId, fundraiserStruct.creatorId) && Intrinsics.LJFF(this.customName, fundraiserStruct.customName) && Intrinsics.LJFF(this.reasonForSupport, fundraiserStruct.reasonForSupport) && Intrinsics.LJFF(this.goalAmount, fundraiserStruct.goalAmount) && Intrinsics.LJFF(this.customCoverImageUrl, fundraiserStruct.customCoverImageUrl) && Intrinsics.LJFF(this.createTime, fundraiserStruct.createTime) && Intrinsics.LJFF(this.updateTime, fundraiserStruct.updateTime) && Intrinsics.LJFF(this.language, fundraiserStruct.language) && Intrinsics.LJFF(this.reviewStatus, fundraiserStruct.reviewStatus) && Intrinsics.LJFF(this.customCoverImageUri, fundraiserStruct.customCoverImageUri) && this.hasOffsiteDonation == fundraiserStruct.hasOffsiteDonation;
    }

    public int hashCode() {
        String str = this.fundraiserId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.organizationId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.creatorId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.customName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.reasonForSupport;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.goalAmount;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.customCoverImageUrl;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.createTime;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.updateTime;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.language;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num = this.reviewStatus;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str11 = this.customCoverImageUri;
        return ((iHashCode11 + (str11 != null ? str11.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.hasOffsiteDonation);
    }

    public String toString() {
        return "FundraiserStruct(fundraiserId=" + this.fundraiserId + ", organizationId=" + this.organizationId + ", creatorId=" + this.creatorId + ", customName=" + this.customName + ", reasonForSupport=" + this.reasonForSupport + ", goalAmount=" + this.goalAmount + ", customCoverImageUrl=" + this.customCoverImageUrl + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", language=" + this.language + ", reviewStatus=" + this.reviewStatus + ", customCoverImageUri=" + this.customCoverImageUri + ", hasOffsiteDonation=" + this.hasOffsiteDonation + ')';
    }

    public FundraiserStruct(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, String str11, boolean z) {
        this.fundraiserId = str;
        this.organizationId = str2;
        this.creatorId = str3;
        this.customName = str4;
        this.reasonForSupport = str5;
        this.goalAmount = str6;
        this.customCoverImageUrl = str7;
        this.createTime = str8;
        this.updateTime = str9;
        this.language = str10;
        this.reviewStatus = num;
        this.customCoverImageUri = str11;
        this.hasOffsiteDonation = z;
    }
}
