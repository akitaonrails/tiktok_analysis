package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AdFeInteractionModel implements Serializable {

    @C09CT("duration_time")
    public final int durationTime;

    @C09CT("frontend_data")
    public final Object frontendData;

    @C09CT("gecko_channel")
    public final List<String> geckoChannel;

    @C09CT("hide_time")
    public final long hideTime;

    @C09CT("interaction_type")
    public final int interactionType;
    public boolean isInteractivity;

    @C09CT("lynx_url")
    public final String lynxUrl;

    @C09CT("show_time")
    public final int showTime;

    public final boolean isInteractivity() {
        return this.isInteractivity;
    }

    public final void setInteractivity(boolean z) {
        this.isInteractivity = z;
    }

    public AdFeInteractionModel(int i, int i2, int i3, List<String> list, String str, Object obj, long j) {
        this.interactionType = i;
        this.showTime = i2;
        this.durationTime = i3;
        this.geckoChannel = list;
        this.lynxUrl = str;
        this.frontendData = obj;
        this.hideTime = j;
    }
}
