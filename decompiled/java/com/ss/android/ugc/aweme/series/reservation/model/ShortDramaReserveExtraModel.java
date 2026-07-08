package com.ss.android.ugc.aweme.series.reservation.model;

import X.C09CT;
import X.C1580970rF9;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes25.dex */
public final class ShortDramaReserveExtraModel implements Serializable {
    public static final C1580970rF9 Companion = new Object() { // from class: X.0rF9
    };

    @C09CT("collection_id")
    public long collectionId;

    @C09CT("is_reserved")
    public int isReservedRaw;

    @C09CT("log_extra")
    public Map<String, String> logExtra;

    @C09CT("lynx_schema")
    public String lynxSchema;

    @C09CT("publish_time")
    public long publishTime;

    @C09CT("reserve_source")
    public String reserveSource;

    public final boolean isReserved() {
        return this.isReservedRaw != 0;
    }

    public final long getCollectionId() {
        return this.collectionId;
    }

    public final Map<String, String> getLogExtra() {
        return this.logExtra;
    }

    public final String getLynxSchema() {
        return this.lynxSchema;
    }

    public final long getPublishTime() {
        return this.publishTime;
    }

    public final String getReserveSource() {
        return this.reserveSource;
    }

    public final void setCollectionId(long j) {
        this.collectionId = j;
    }

    public final void setLogExtra(Map<String, String> map) {
        this.logExtra = map;
    }

    public final void setLynxSchema(String str) {
        this.lynxSchema = str;
    }

    public final void setPublishTime(long j) {
        this.publishTime = j;
    }

    public final void setReserveSource(String str) {
        this.reserveSource = str;
    }

    public final void setReserved(boolean z) {
        this.isReservedRaw = z ? 1 : 0;
    }
}
