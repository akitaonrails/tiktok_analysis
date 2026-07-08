package com.ss.android.ugc.aweme.search.source.neo.model;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class CreationPoiClickInfo {

    @C09CT("click_poi_id")
    public final String clickPoiId;

    @C09CT("timestamp")
    public final Long timestamp;

    public CreationPoiClickInfo(String str, Long l) {
        this.clickPoiId = str;
        this.timestamp = l;
    }
}
