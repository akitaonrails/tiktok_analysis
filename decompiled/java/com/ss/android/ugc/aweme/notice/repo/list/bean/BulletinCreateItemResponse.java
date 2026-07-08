package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCreateItemResponse {

    @C09CT("item_info")
    public final BulletinItem itemInfo;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("new_quota")
    public final Long quota;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    @C09CT("style_struct")
    public final BulletinStyleStruct styleStruct;

    public BulletinCreateItemResponse(int i, String str, BulletinItem bulletinItem, Long l, BulletinStyleStruct bulletinStyleStruct, LogPbBean logPbBean) {
        this.statusCode = i;
        this.statusMsg = str;
        this.itemInfo = bulletinItem;
        this.quota = l;
        this.styleStruct = bulletinStyleStruct;
        this.logPb = logPbBean;
    }
}
