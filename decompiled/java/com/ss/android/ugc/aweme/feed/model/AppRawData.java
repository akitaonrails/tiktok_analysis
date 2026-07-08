package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AppRawData implements Serializable {

    @C09CT("download_mode")
    public final int downloadMode;

    @C09CT("download_url")
    public final String downloadUrl;

    @C09CT("event_tag")
    public final String eventTag;

    @C09CT("group_id")
    public final String groupId;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("is_ad")
    public final int isAd;

    @C09CT("log_extra")
    public final String logExtra;

    @C09CT("name")
    public final String name;

    @C09CT("pkg_name")
    public final String pkgName;

    @C09CT("quick_app_url")
    public final String quickAppUrl;

    public AppRawData() {
        this(null, null, null, null, null, null, 0, null, null, 0);
    }

    public final int isAd() {
        return this.isAd;
    }

    public AppRawData(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, int i2) {
        this.id = str;
        this.name = str2;
        this.pkgName = str3;
        this.downloadUrl = str4;
        this.eventTag = str5;
        this.groupId = str6;
        this.isAd = i;
        this.logExtra = str7;
        this.quickAppUrl = str8;
        this.downloadMode = i2;
    }
}
