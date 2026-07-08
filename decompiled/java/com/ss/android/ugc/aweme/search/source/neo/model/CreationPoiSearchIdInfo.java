package com.ss.android.ugc.aweme.search.source.neo.model;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class CreationPoiSearchIdInfo {

    @C09CT("channel")
    public final String channel;

    @C09CT("click_poi_id")
    public final String clickPoiId;

    @C09CT("click_poi_type")
    public final String clickPoiType;

    @C09CT("doc_rank")
    public final String docRank;

    @C09CT("query")
    public final String query;

    @C09CT("search_id")
    public final String searchId;

    @C09CT("source")
    public final String source;

    @C09CT("timestamp")
    public final Long timestamp;

    public CreationPoiSearchIdInfo() {
        this("", "", null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreationPoiSearchIdInfo)) {
            return false;
        }
        CreationPoiSearchIdInfo creationPoiSearchIdInfo = (CreationPoiSearchIdInfo) obj;
        return Intrinsics.LJFF(this.searchId, creationPoiSearchIdInfo.searchId) && Intrinsics.LJFF(this.query, creationPoiSearchIdInfo.query) && Intrinsics.LJFF(this.channel, creationPoiSearchIdInfo.channel) && Intrinsics.LJFF(this.source, creationPoiSearchIdInfo.source) && Intrinsics.LJFF(this.timestamp, creationPoiSearchIdInfo.timestamp) && Intrinsics.LJFF(this.clickPoiId, creationPoiSearchIdInfo.clickPoiId) && Intrinsics.LJFF(this.clickPoiType, creationPoiSearchIdInfo.clickPoiType) && Intrinsics.LJFF(this.docRank, creationPoiSearchIdInfo.docRank);
    }

    public static CreationPoiSearchIdInfo LIZ(CreationPoiSearchIdInfo creationPoiSearchIdInfo, String str, String str2, String str3, String str4, int i) {
        String str5;
        String str6;
        String str7;
        String str8 = str4;
        String str9 = str3;
        String str10 = str2;
        String str11 = str;
        if ((i & 1) != 0) {
            str11 = creationPoiSearchIdInfo.searchId;
        }
        Long l = null;
        if ((i & 2) != 0) {
            str5 = creationPoiSearchIdInfo.query;
        } else {
            str5 = null;
        }
        if ((i & 4) != 0) {
            str6 = creationPoiSearchIdInfo.channel;
        } else {
            str6 = null;
        }
        if ((i & 8) != 0) {
            str7 = creationPoiSearchIdInfo.source;
        } else {
            str7 = null;
        }
        if ((i & 16) != 0) {
            l = creationPoiSearchIdInfo.timestamp;
        }
        if ((i & 32) != 0) {
            str10 = creationPoiSearchIdInfo.clickPoiId;
        }
        if ((i & 64) != 0) {
            str9 = creationPoiSearchIdInfo.clickPoiType;
        }
        if ((i & 128) != 0) {
            str8 = creationPoiSearchIdInfo.docRank;
        }
        return new CreationPoiSearchIdInfo(str11, str5, str6, str7, l, str10, str9, str8);
    }

    public CreationPoiSearchIdInfo(String str, String str2, String str3, String str4, Long l, String str5, String str6, String str7) {
        this.searchId = str;
        this.query = str2;
        this.channel = str3;
        this.source = str4;
        this.timestamp = l;
        this.clickPoiId = str5;
        this.clickPoiType = str6;
        this.docRank = str7;
    }
}
