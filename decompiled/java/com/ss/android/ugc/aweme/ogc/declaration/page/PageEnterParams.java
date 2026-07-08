package com.ss.android.ugc.aweme.ogc.declaration.page;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class PageEnterParams implements Serializable {

    @C09CT("content_source")
    public final String contentSource;

    @C09CT("content_type")
    public final String contentType;

    @C09CT("create_time")
    public final Long createTime;

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("location")
    public final LocationInfo location;

    @C09CT("shoot_tab_name")
    public final String shootTabName;

    @C09CT("shoot_way")
    public final String shootWay;

    public PageEnterParams() {
        this(null, null, null, null, null, null, null, null);
    }

    public PageEnterParams(Long l, LocationInfo locationInfo, String str, String str2, String str3, String str4, String str5, String str6) {
        this.createTime = l;
        this.location = locationInfo;
        this.enterFrom = str;
        this.creationId = str2;
        this.shootWay = str3;
        this.shootTabName = str4;
        this.contentType = str5;
        this.contentSource = str6;
    }
}
