package com.ss.android.ugc.aweme.deeplink.actions.internal;

import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class WWACampaignModel {

    @C09CT("addyours")
    public WWACampaignAddYoursModel addyours;

    @C09CT("back_url")
    public String backUrl;

    @C09CT("campaign_id")
    public String campaignId;

    @C09CT("completed_event")
    public boolean completedEvent;

    @C09CT("effect_id")
    public String effectId;

    @C09CT("hashtags")
    public ArrayList<String> hashTags;

    @C09CT("landing_back")
    public Number landingBack;

    @C09CT("music_id")
    public String musicId;

    @C09CT("music_selected_from")
    public String musicSelectedFrom;

    @C09CT("show_story_button")
    public boolean showStoryButton;

    @C09CT("source_platform_channel")
    public String sourcePlatformChannel;

    public WWACampaignModel() {
        this(null, null, null, null, null, null, false, null, null, null, true);
    }

    public WWACampaignModel(WWACampaignAddYoursModel wWACampaignAddYoursModel, String str, String str2, String str3, ArrayList<String> arrayList, Number number, boolean z, String str4, String str5, String str6, boolean z2) {
        this.addyours = wWACampaignAddYoursModel;
        this.musicId = str;
        this.effectId = str2;
        this.musicSelectedFrom = str3;
        this.hashTags = arrayList;
        this.landingBack = number;
        this.completedEvent = z;
        this.campaignId = str4;
        this.sourcePlatformChannel = str5;
        this.backUrl = str6;
        this.showStoryButton = z2;
    }
}
