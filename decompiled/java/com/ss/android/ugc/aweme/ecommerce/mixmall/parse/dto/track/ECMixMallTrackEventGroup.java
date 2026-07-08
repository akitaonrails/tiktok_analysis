package com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.track;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class ECMixMallTrackEventGroup {

    @C09CT("config")
    public ECMixMallTrackEventGroupConfig config;

    @C09CT("event_list")
    public List<ECMixMallTrackEvent> eventList;

    @C09CT("group_params")
    public ECMixMallTrackGroupParams groupParams;

    public ECMixMallTrackEventGroup() {
        this(new ECMixMallTrackEventGroupConfig(0), null, null);
    }

    public ECMixMallTrackEventGroup(ECMixMallTrackEventGroupConfig eCMixMallTrackEventGroupConfig, ECMixMallTrackGroupParams eCMixMallTrackGroupParams, List<ECMixMallTrackEvent> list) {
        this.config = eCMixMallTrackEventGroupConfig;
        this.groupParams = eCMixMallTrackGroupParams;
        this.eventList = list;
    }
}
