package com.ss.android.ugc.profile.business.live;

import X.C09CT;
import com.ss.android.ugc.aweme.profile.model.LiveEventStruct;
import com.ss.android.ugc.profile.platform.business.header.advanced.AdvancedFeatureBaseData;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class LiveEventData extends AdvancedFeatureBaseData {
    public static final int $stable = 8;

    @C09CT("events")
    public List<LiveEventStruct> liveEventStructList;

    public final List<LiveEventStruct> getLiveEventStructList() {
        return this.liveEventStructList;
    }

    public final void setLiveEventStructList(List<LiveEventStruct> list) {
        this.liveEventStructList = list;
    }
}
