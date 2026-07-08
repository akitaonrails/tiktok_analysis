package com.ss.android.ugc.aweme.home.repo.network.data;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class NewUserGuideInfoResponse {

    @C09CT("can_close")
    public final Boolean canClose;

    @C09CT("desc")
    public final String desc;

    @C09CT("icon_map")
    public final Map<String, String> iconMap;

    @C09CT("notice_key")
    public final String noticeKey;

    @C09CT("title")
    public final String title;

    public NewUserGuideInfoResponse() {
        this(null, null, null, null, Boolean.FALSE);
    }

    public NewUserGuideInfoResponse(String str, Map<String, String> map, String str2, String str3, Boolean bool) {
        this.title = str;
        this.iconMap = map;
        this.desc = str2;
        this.noticeKey = str3;
        this.canClose = bool;
    }
}
