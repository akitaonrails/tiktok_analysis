package com.ss.android.ugc.aweme.search.performance.core.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class PreloadImg implements Serializable {
    public static final int $stable = 8;

    @C09CT("urls")
    public List<String> urlList;

    public final List<String> getUrlList() {
        return this.urlList;
    }

    public final void setUrlList(List<String> list) {
        this.urlList = list;
    }
}
