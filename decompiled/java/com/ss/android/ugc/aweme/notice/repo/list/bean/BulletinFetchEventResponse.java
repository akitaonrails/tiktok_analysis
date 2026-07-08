package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinFetchEventResponse {

    @C09CT("current_timestamp")
    public final Long currentTimeStamp;

    @C09CT("events")
    public final List<BulletinFetchEvent> eventsList;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public BulletinFetchEventResponse(Integer num, String str, Long l, List<BulletinFetchEvent> list) {
        this.statusCode = num;
        this.statusMsg = str;
        this.currentTimeStamp = l;
        this.eventsList = list;
    }
}
