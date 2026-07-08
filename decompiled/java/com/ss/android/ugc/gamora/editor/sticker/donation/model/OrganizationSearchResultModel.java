package com.ss.android.ugc.gamora.editor.sticker.donation.model;

import X.C09CT;
import X.C11BE;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class OrganizationSearchResultModel extends C11BE implements Serializable {

    @C09CT("desc")
    public final String desc;

    @C09CT("desc_highlights")
    public List<TextHighlight> descHighlightList;

    @C09CT("web_url")
    public final String detailUrl;

    @C09CT("donation_link")
    public final String donateLink;

    @C09CT("fundraiser_goal_desc")
    public final String fundraiserGoalDesc;

    @C09CT("fundraiser_id")
    public final String fundraiserId;

    @C09CT("fundraiser_owner_id")
    public final String fundraiserOwnerId;

    @C09CT("icon")
    public final UrlModel icon;

    @C09CT("name")
    public final String name;

    @C09CT("ngo_id")
    public Integer ngoId;

    @C09CT("organization_id")
    public final String orgId;

    @C09CT("organization_type")
    public final String orgType;

    @C09CT("name_highlights")
    public List<TextHighlight> textHighlightList;

    public final OrganizationSearchResultModel copy(Integer num, String str, List<TextHighlight> list, String str2, List<TextHighlight> list2, UrlModel urlModel, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        return new OrganizationSearchResultModel(num, str, list, str2, list2, urlModel, str3, str4, str5, str6, str7, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrganizationSearchResultModel)) {
            return false;
        }
        OrganizationSearchResultModel organizationSearchResultModel = (OrganizationSearchResultModel) obj;
        return Intrinsics.LJFF(this.ngoId, organizationSearchResultModel.ngoId) && Intrinsics.LJFF(this.name, organizationSearchResultModel.name) && Intrinsics.LJFF(this.textHighlightList, organizationSearchResultModel.textHighlightList) && Intrinsics.LJFF(this.desc, organizationSearchResultModel.desc) && Intrinsics.LJFF(this.descHighlightList, organizationSearchResultModel.descHighlightList) && Intrinsics.LJFF(this.icon, organizationSearchResultModel.icon) && Intrinsics.LJFF(this.detailUrl, organizationSearchResultModel.detailUrl) && Intrinsics.LJFF(this.donateLink, organizationSearchResultModel.donateLink) && Intrinsics.LJFF(this.orgId, organizationSearchResultModel.orgId) && Intrinsics.LJFF(this.orgType, organizationSearchResultModel.orgType) && Intrinsics.LJFF(this.fundraiserId, organizationSearchResultModel.fundraiserId) && Intrinsics.LJFF(this.fundraiserOwnerId, organizationSearchResultModel.fundraiserOwnerId) && Intrinsics.LJFF(this.fundraiserGoalDesc, organizationSearchResultModel.fundraiserGoalDesc);
    }

    public int hashCode() {
        Integer num = this.ngoId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<TextHighlight> list = this.textHighlightList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.desc;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<TextHighlight> list2 = this.descHighlightList;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        UrlModel urlModel = this.icon;
        int iHashCode6 = (iHashCode5 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str3 = this.detailUrl;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.donateLink;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.orgId;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.orgType;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.fundraiserId;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.fundraiserOwnerId;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.fundraiserGoalDesc;
        return iHashCode12 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        return "OrganizationSearchResultModel(ngoId=" + this.ngoId + ", name=" + this.name + ", textHighlightList=" + this.textHighlightList + ", desc=" + this.desc + ", descHighlightList=" + this.descHighlightList + ", icon=" + this.icon + ", detailUrl=" + this.detailUrl + ", donateLink=" + this.donateLink + ", orgId=" + this.orgId + ", orgType=" + this.orgType + ", fundraiserId=" + this.fundraiserId + ", fundraiserOwnerId=" + this.fundraiserOwnerId + ", fundraiserGoalDesc=" + this.fundraiserGoalDesc + ')';
    }

    @Override // X.C11BE
    public String getDesc() {
        return this.desc;
    }

    public final List<TextHighlight> getDescHighlightList() {
        return this.descHighlightList;
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

    public final List<TextHighlight> getTextHighlightList() {
        return this.textHighlightList;
    }

    public final void setDescHighlightList(List<TextHighlight> list) {
        this.descHighlightList = list;
    }

    public void setNgoId(Integer num) {
        this.ngoId = num;
    }

    public final void setTextHighlightList(List<TextHighlight> list) {
        this.textHighlightList = list;
    }

    public OrganizationSearchResultModel(Integer num, String str, List<TextHighlight> list, String str2, List<TextHighlight> list2, UrlModel urlModel, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.ngoId = num;
        this.name = str;
        this.textHighlightList = list;
        this.desc = str2;
        this.descHighlightList = list2;
        this.icon = urlModel;
        this.detailUrl = str3;
        this.donateLink = str4;
        this.orgId = str5;
        this.orgType = str6;
        this.fundraiserId = str7;
        this.fundraiserOwnerId = str8;
        this.fundraiserGoalDesc = str9;
    }
}
