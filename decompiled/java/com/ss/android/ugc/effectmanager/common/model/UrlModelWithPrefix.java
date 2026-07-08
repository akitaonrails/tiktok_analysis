package com.ss.android.ugc.effectmanager.common.model;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class UrlModelWithPrefix {
    public String uri;
    public final List<String> url_prefix;

    public UrlModelWithPrefix() {
        this(new ArrayList(), null);
    }

    public final void setUri(String str) {
        this.uri = str;
    }

    public UrlModelWithPrefix(List<String> list, String str) {
        this.url_prefix = list;
        this.uri = str;
    }
}
