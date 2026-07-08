package com.ss.android.ugc.aweme.ecommerce.ug.datamerge.manager;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class CacheDataResult {

    @C09CT("_AME_Header_RequestID")
    public final String aweLogId;

    @C09CT("code")
    public final Integer code;

    @C09CT("data")
    public final Map<String, ?> data;

    @C09CT("header")
    public final Map<String, ?> header;

    @C09CT("_Header_RequestID")
    public final String logId;

    @C09CT("message")
    public final String message;

    @C09CT("timestamp")
    public final Long timestamp;

    public CacheDataResult() {
        this(null, null, null, null, null, null, null);
    }

    public CacheDataResult(Map<String, ?> map, Integer num, String str, Map<String, ?> map2, String str2, String str3, Long l) {
        this.data = map;
        this.code = num;
        this.message = str;
        this.header = map2;
        this.aweLogId = str2;
        this.logId = str3;
        this.timestamp = l;
    }
}
