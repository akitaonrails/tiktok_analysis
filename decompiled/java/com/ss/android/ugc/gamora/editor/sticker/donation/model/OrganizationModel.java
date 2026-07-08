package com.ss.android.ugc.gamora.editor.sticker.donation.model;

import X.C09CT;
import X.C11BE;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class OrganizationModel extends C11BE implements Serializable {

    @C09CT("add_time")
    public String addTime;

    @C09CT("desc")
    public final String desc;

    @C09CT("web_url")
    public final String detailUrl;

    @C09CT("donation_link")
    public final String donateLink;

    @C09CT("fundraiser_goal_desc")
    public final String fundraiserGoalDesc;

    @C09CT("fundraiser_id")
    public String fundraiserId;

    @C09CT("fundraiser_owner_id")
    public final String fundraiserOwnerId;

    @C09CT("icon")
    public final UrlModel icon;

    @C09CT("name")
    public final String name;

    @C09CT("ngo_id")
    public Integer ngoId;

    @C09CT("organization_id")
    public String orgId;

    @C09CT("organization_type")
    public String orgType;

    public final OrganizationModel copy(String str, String str2, UrlModel urlModel, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10) {
        return new OrganizationModel(str, str2, urlModel, str3, str4, str5, num, str6, str7, str8, str9, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrganizationModel)) {
            return false;
        }
        OrganizationModel organizationModel = (OrganizationModel) obj;
        return Intrinsics.LJFF(this.name, organizationModel.name) && Intrinsics.LJFF(this.desc, organizationModel.desc) && Intrinsics.LJFF(this.icon, organizationModel.icon) && Intrinsics.LJFF(this.detailUrl, organizationModel.detailUrl) && Intrinsics.LJFF(this.donateLink, organizationModel.donateLink) && Intrinsics.LJFF(this.addTime, organizationModel.addTime) && Intrinsics.LJFF(this.ngoId, organizationModel.ngoId) && Intrinsics.LJFF(this.orgId, organizationModel.orgId) && Intrinsics.LJFF(this.orgType, organizationModel.orgType) && Intrinsics.LJFF(this.fundraiserId, organizationModel.fundraiserId) && Intrinsics.LJFF(this.fundraiserOwnerId, organizationModel.fundraiserOwnerId) && Intrinsics.LJFF(this.fundraiserGoalDesc, organizationModel.fundraiserGoalDesc);
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        UrlModel urlModel = this.icon;
        int iHashCode3 = (iHashCode2 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str3 = this.detailUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.donateLink;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.addTime;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.ngoId;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.orgId;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.orgType;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.fundraiserId;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.fundraiserOwnerId;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.fundraiserGoalDesc;
        return iHashCode11 + (str10 != null ? str10.hashCode() : 0);
    }

    public String toString() {
        return "OrganizationModel(name=" + this.name + ", desc=" + this.desc + ", icon=" + this.icon + ", detailUrl=" + this.detailUrl + ", donateLink=" + this.donateLink + ", addTime=" + this.addTime + ", ngoId=" + this.ngoId + ", orgId=" + this.orgId + ", orgType=" + this.orgType + ", fundraiserId=" + this.fundraiserId + ", fundraiserOwnerId=" + this.fundraiserOwnerId + ", fundraiserGoalDesc=" + this.fundraiserGoalDesc + ')';
    }

    @Override // X.C11BE
    public String getAddTime() {
        return this.addTime;
    }

    @Override // X.C11BE
    public String getDesc() {
        return this.desc;
    }

    @Override // X.C11BE
    public String getDetailUrl() {
        return this.detailUrl;
    }

    @Override // X.C11BE
    public String getDonateLink() {
        return this.donateLink;
    }

    @Override // X.C11BE
    public String getFundraiserGoalDesc() {
        return this.fundraiserGoalDesc;
    }

    @Override // X.C11BE
    public String getFundraiserId() {
        return this.fundraiserId;
    }

    @Override // X.C11BE
    public String getFundraiserOwnerId() {
        return this.fundraiserOwnerId;
    }

    @Override // X.C11BE
    public UrlModel getIcon() {
        return this.icon;
    }

    @Override // X.C11BE
    public String getName() {
        return this.name;
    }

    @Override // X.C11BE
    public Integer getNgoId() {
        return this.ngoId;
    }

    @Override // X.C11BE
    public String getOrgId() {
        return this.orgId;
    }

    @Override // X.C11BE
    public String getOrgType() {
        return this.orgType;
    }

    @Override // X.C11BE
    public void setAddTime(String str) {
        this.addTime = str;
    }

    public void setFundraiserId(String str) {
        this.fundraiserId = str;
    }

    public void setNgoId(Integer num) {
        this.ngoId = num;
    }

    public void setOrgId(String str) {
        this.orgId = str;
    }

    public void setOrgType(String str) {
        this.orgType = str;
    }

    public OrganizationModel(String str, String str2, UrlModel urlModel, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10) {
        this.name = str;
        this.desc = str2;
        this.icon = urlModel;
        this.detailUrl = str3;
        this.donateLink = str4;
        this.addTime = str5;
        this.ngoId = num;
        this.orgId = str6;
        this.orgType = str7;
        this.fundraiserId = str8;
        this.fundraiserOwnerId = str9;
        this.fundraiserGoalDesc = str10;
    }
}
