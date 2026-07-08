package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class CommentTopBarStruct implements Serializable {

    @C09CT("deepLink")
    public String deepLink;

    @C09CT("description")
    public String description;

    @C09CT("end_time")
    public long endTime;

    @C09CT("extra")
    public String extra;

    @C09CT("icon")
    public UrlModel icon;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("keyword")
    public String keyword;

    @C09CT("language")
    public String language;

    @C09CT("log_extra")
    public String logExtra;

    @C09CT("exposures")
    public long maxExposures;

    @C09CT("priority")
    public long priority;

    @C09CT("schema")
    public String schema;

    @C09CT("start_time")
    public long startTime;

    @C09CT("sub_type")
    public String subType;

    @C09CT("thumbnail")
    public UrlModel thumbnail;

    @C09CT("type")
    public String type;

    @C09CT("universalLink")
    public Long universalLink;

    @C09CT("url")
    public String url;

    public CommentTopBarStruct() {
    }

    public CommentTopBarStruct(long j, String str, String str2, String str3, String str4, UrlModel urlModel, String str5, long j2, long j3, long j4, long j5, String str6, String str7, Long l, String str8, String str9, UrlModel urlModel2, String str10) {
        this.id = j;
        this.type = str;
        this.subType = str2;
        this.keyword = str3;
        this.url = str4;
        this.icon = urlModel;
        this.schema = str5;
        this.startTime = j2;
        this.endTime = j3;
        this.priority = j4;
        this.maxExposures = j5;
        this.language = str6;
        this.deepLink = str7;
        this.universalLink = l;
        this.logExtra = str8;
        this.description = str9;
        this.thumbnail = urlModel2;
        this.extra = str10;
    }
}
