package com.ss.android.ugc.aweme.home.repo.network.data;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class ServiceComponentResponse {

    @C09CT("icon_map")
    public final Map<String, String> iconMap;

    @C09CT("link")
    public final String link;

    @C09CT("title")
    public final String title;

    public ServiceComponentResponse() {
        this(null, null, null);
    }

    public ServiceComponentResponse(String str, Map<String, String> map, String str2) {
        this.title = str;
        this.iconMap = map;
        this.link = str2;
    }
}
