package com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class QueryDesc {

    @C09CT("clickable")
    public final boolean clickable;

    @C09CT("event_param")
    public final Map<String, String> eventParam;

    @C09CT("text")
    public final String text;

    @C09CT("type")
    public final String type;

    public QueryDesc(String str, String str2, boolean z, Map<String, String> map) {
        this.type = str;
        this.text = str2;
        this.clickable = z;
        this.eventParam = map;
    }
}
