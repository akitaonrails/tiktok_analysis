package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileNgoStruct implements Serializable {

    @C09CT("ngo_id")
    public int id;

    @C09CT("organization_id")
    public String orgId = "";

    @C09CT("organization_type")
    public String orgType = "";

    @C09CT("ngo_name")
    public String name = "";

    @C09CT("ngo_icon_url")
    public String iconUrl = "";

    @C09CT("ngo_donation_link")
    public String donationLink = "";

    @C09CT("fundraiser_id")
    public String fundraiserId = "";

    public final String getDonationLink() {
        return this.donationLink;
    }

    public final String getFundraiserId() {
        return this.fundraiserId;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOrgId() {
        return this.orgId;
    }

    public final String getOrgType() {
        return this.orgType;
    }

    public final void setDonationLink(String str) {
        this.donationLink = str;
    }

    public final void setFundraiserId(String str) {
        this.fundraiserId = str;
    }

    public final void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setOrgId(String str) {
        this.orgId = str;
    }

    public final void setOrgType(String str) {
        this.orgType = str;
    }
}
