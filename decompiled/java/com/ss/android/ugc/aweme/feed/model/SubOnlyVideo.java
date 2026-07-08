package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class SubOnlyVideo implements Serializable {

    @C09CT("should_show_paywall")
    public Boolean shouldShowPaywall = Boolean.FALSE;

    @C09CT("sub_only_video_gates")
    public SubOnlyVideoGates subOnlyVideoGates;

    @C09CT("subs_status")
    public Integer subsStatus;

    public final Boolean getShouldShowPaywall() {
        return this.shouldShowPaywall;
    }

    public final SubOnlyVideoGates getSubOnlyVideoGates() {
        return this.subOnlyVideoGates;
    }

    public final Integer getSubsStatus() {
        return this.subsStatus;
    }

    public final void setShouldShowPaywall(Boolean bool) {
        this.shouldShowPaywall = bool;
    }

    public final void setSubOnlyVideoGates(SubOnlyVideoGates subOnlyVideoGates) {
        this.subOnlyVideoGates = subOnlyVideoGates;
    }

    public final void setSubsStatus(Integer num) {
        this.subsStatus = num;
    }
}
