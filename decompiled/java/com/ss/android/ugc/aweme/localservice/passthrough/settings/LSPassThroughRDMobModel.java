package com.ss.android.ugc.aweme.localservice.passthrough.settings;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class LSPassThroughRDMobModel {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("filter_event_name_list")
    public final List<String> filterEventNameList;

    @C09CT("sample_rate")
    public final float sampleRate;

    public LSPassThroughRDMobModel() {
        this(null, true, 1.0f);
    }

    public LSPassThroughRDMobModel(List<String> list, boolean z, float f) {
        this.filterEventNameList = list;
        this.enable = z;
        this.sampleRate = f;
    }
}
