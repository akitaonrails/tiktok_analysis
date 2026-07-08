package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchIntentStruct implements Serializable {

    @C09CT("has_poi_intent")
    public Boolean hasPoiIntent = Boolean.FALSE;

    @C09CT("local_service_intent")
    public String localServiceIntent;

    public final Boolean getHasPoiIntent() {
        return this.hasPoiIntent;
    }

    public final String getLocalServiceIntent() {
        return this.localServiceIntent;
    }

    public final void setHasPoiIntent(Boolean bool) {
        this.hasPoiIntent = bool;
    }

    public final void setLocalServiceIntent(String str) {
        this.localServiceIntent = str;
    }
}
