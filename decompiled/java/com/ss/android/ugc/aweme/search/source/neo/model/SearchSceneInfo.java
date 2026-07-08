package com.ss.android.ugc.aweme.search.source.neo.model;

import X.C09CT;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchSceneInfo {

    @C09CT("card_consumption")
    public final Map<String, CardConsumption> cardConsumptionMap;

    @C09CT("channel")
    public final String channel;

    @C09CT("query")
    public final String query;

    @C09CT("search_id")
    public final String searchId;

    @C09CT("source")
    public final String source;

    @C09CT("timestamp")
    public final Long timestamp;

    public SearchSceneInfo() {
        this("", "", null, null, null, new ConcurrentHashMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchSceneInfo)) {
            return false;
        }
        SearchSceneInfo searchSceneInfo = (SearchSceneInfo) obj;
        return Intrinsics.LJFF(this.searchId, searchSceneInfo.searchId) && Intrinsics.LJFF(this.query, searchSceneInfo.query) && Intrinsics.LJFF(this.channel, searchSceneInfo.channel) && Intrinsics.LJFF(this.source, searchSceneInfo.source) && Intrinsics.LJFF(this.timestamp, searchSceneInfo.timestamp) && Intrinsics.LJFF(this.cardConsumptionMap, searchSceneInfo.cardConsumptionMap);
    }

    public SearchSceneInfo(String str, String str2, String str3, String str4, Long l, Map<String, CardConsumption> map) {
        this.searchId = str;
        this.query = str2;
        this.channel = str3;
        this.source = str4;
        this.timestamp = l;
        this.cardConsumptionMap = map;
    }
}
