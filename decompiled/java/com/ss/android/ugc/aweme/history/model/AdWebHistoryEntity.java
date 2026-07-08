package com.ss.android.ugc.aweme.history.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AdWebHistoryEntity implements Serializable {
    public static final int $stable = 8;

    @C09CT("iab_ad_info")
    public final AdWebHistoryAdInfo adWebHistoryAdInfo;

    @C09CT("container_id")
    public final String containerId;

    @C09CT("cover_url")
    public final String coverUrl;

    @C09CT("cursor_id")
    public final Long cursorId;

    @C09CT("order")
    public Long order;

    @C09CT("request_time")
    public final Long requestTime;

    @C09CT("request_time_str")
    public final String requestTimeStr;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    @C09CT("title")
    public final String title;

    @C09CT("unique_id")
    public final Long uniqueId;

    @C09CT("url")
    public final String url;

    public AdWebHistoryEntity() {
        this(null, null, null, null, null, null, null, null, null, 0, null);
    }

    public final AdWebHistoryEntity copy(String str, String str2, String str3, Long l, String str4, Long l2, Long l3, Long l4, AdWebHistoryAdInfo adWebHistoryAdInfo, Integer num, String str5) {
        return new AdWebHistoryEntity(str, str2, str3, l, str4, l2, l3, l4, adWebHistoryAdInfo, num, str5);
    }

    public final void setOrder(Long l) {
        this.order = l;
    }

    public AdWebHistoryEntity(String str, String str2, String str3, Long l, String str4, Long l2, Long l3, Long l4, AdWebHistoryAdInfo adWebHistoryAdInfo, Integer num, String str5) {
        this.url = str;
        this.title = str2;
        this.coverUrl = str3;
        this.requestTime = l;
        this.requestTimeStr = str4;
        this.order = l2;
        this.cursorId = l3;
        this.uniqueId = l4;
        this.adWebHistoryAdInfo = adWebHistoryAdInfo;
        this.status = num;
        this.containerId = str5;
    }
}
