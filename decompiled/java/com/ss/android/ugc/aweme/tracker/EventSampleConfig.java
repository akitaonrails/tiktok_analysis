package com.ss.android.ugc.aweme.tracker;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class EventSampleConfig {

    @C09CT("event_name")
    public final String eventName;

    @C09CT("sample_list")
    public final List<SampleConfig> sampleList;

    public EventSampleConfig(String str, List<SampleConfig> list) {
        this.eventName = str;
        this.sampleList = list;
    }
}
