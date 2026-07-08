package com.ss.android.ugc.aweme.ecommerce.anchor.api;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class EventTrackData {

    @C09CT("finished_detection")
    public final Boolean finishedDetection;

    @C09CT("have_ecom_intent")
    public final Boolean hasEcomIntent;

    public EventTrackData() {
        this(null, null);
    }

    public EventTrackData(Boolean bool, Boolean bool2) {
        this.hasEcomIntent = bool;
        this.finishedDetection = bool2;
    }
}
