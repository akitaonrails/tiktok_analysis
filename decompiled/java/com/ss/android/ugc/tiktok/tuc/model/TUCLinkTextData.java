package com.ss.android.ugc.tiktok.tuc.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class TUCLinkTextData implements Serializable {

    @C09CT("links")
    public List<TUCInlineLinkData> links;

    @C09CT("text")
    public String text;

    public TUCLinkTextData() {
        this(null, null);
    }

    public TUCLinkTextData(String str, List<TUCInlineLinkData> list) {
        this.text = str;
        this.links = list;
    }
}
