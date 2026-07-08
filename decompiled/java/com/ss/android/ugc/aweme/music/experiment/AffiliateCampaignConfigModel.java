package com.ss.android.ugc.aweme.music.experiment;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
public final class AffiliateCampaignConfigModel {

    @C09CT("affiliate_dsp")
    public final int affiliateDsp;

    @C09CT("affiliate_month")
    public final int affiliateMonth;

    @C09CT("campaign_id")
    public final String campaignId;

    @C09CT("end_time")
    public final long endTime;

    @C09CT("jump_schema")
    public final String jumpSchema;

    @C09CT("start_time")
    public final long startTime;

    @C09CT("uncontrolled_scene_list")
    public final List<String> uncontrolledSceneList;

    public AffiliateCampaignConfigModel() {
        this(null, 0L, 0L, 0, 0, null, null, 127, null);
    }

    public AffiliateCampaignConfigModel(String str, long j, long j2, int i, int i2, List<String> list, String str2) {
        this.campaignId = str;
        this.startTime = j;
        this.endTime = j2;
        this.affiliateDsp = i;
        this.affiliateMonth = i2;
        this.uncontrolledSceneList = list;
        this.jumpSchema = str2;
    }

    public AffiliateCampaignConfigModel(String str, long j, long j2, int i, int i2, List list, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0L : j, (i3 & 4) == 0 ? j2 : 0L, (i3 & 8) != 0 ? DspPlatform.UNKNOWN.getValue() : i, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? C13BV.INSTANCE : list, (i3 & 64) == 0 ? str2 : "");
    }
}
