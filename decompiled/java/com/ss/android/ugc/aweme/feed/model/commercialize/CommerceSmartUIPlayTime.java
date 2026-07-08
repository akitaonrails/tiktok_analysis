package com.ss.android.ugc.aweme.feed.model.commercialize;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class CommerceSmartUIPlayTime implements Serializable {

    @C09CT("package")
    public UrlPackage packageUrl;

    @C09CT("params")
    public List<Integer> params;

    public final UrlPackage getPackageUrl() {
        return this.packageUrl;
    }

    public final List<Integer> getParams() {
        return this.params;
    }

    public final void setPackageUrl(UrlPackage urlPackage) {
        this.packageUrl = urlPackage;
    }

    public final void setParams(List<Integer> list) {
        this.params = list;
    }
}
