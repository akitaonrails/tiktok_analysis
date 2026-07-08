package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class GeccContentSellingPoint implements Serializable {

    @C09CT("log_extra")
    public Map<String, String> logExtra;

    @C09CT("text")
    public final String text;

    @C09CT("selling_point_type_name")
    public final String type;

    public GeccContentSellingPoint() {
        this(null, null, null);
    }

    public final void setLogExtra(Map<String, String> map) {
        this.logExtra = map;
    }

    public GeccContentSellingPoint(String str, String str2, Map<String, String> map) {
        this.text = str;
        this.type = str2;
        this.logExtra = map;
    }
}
