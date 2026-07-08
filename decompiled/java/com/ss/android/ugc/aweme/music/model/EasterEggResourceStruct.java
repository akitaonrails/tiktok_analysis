package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class EasterEggResourceStruct implements Serializable {

    @C09CT("campaign_id")
    public String campaignId = "";

    @C09CT("jump_url")
    public String jumpUrl = "";

    @C09CT("easter_egg_info")
    public String easterEggInfo = "";

    public final String getCampaignId() {
        return this.campaignId;
    }

    public final String getEasterEggInfo() {
        return this.easterEggInfo;
    }

    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    public final void setCampaignId(String str) {
        this.campaignId = str;
    }

    public final void setEasterEggInfo(String str) {
        this.easterEggInfo = str;
    }

    public final void setJumpUrl(String str) {
        this.jumpUrl = str;
    }
}
