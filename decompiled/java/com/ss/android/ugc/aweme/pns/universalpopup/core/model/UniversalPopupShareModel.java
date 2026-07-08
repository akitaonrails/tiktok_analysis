package com.ss.android.ugc.aweme.pns.universalpopup.core.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class UniversalPopupShareModel implements Serializable {

    @C09CT("desc")
    public final String desc;

    @C09CT("title")
    public final String title;

    @C09CT("url")
    public final String url;

    public UniversalPopupShareModel() {
        this("", "", "");
    }

    public UniversalPopupShareModel(String str, String str2, String str3) {
        this.title = str;
        this.desc = str2;
        this.url = str3;
    }
}
