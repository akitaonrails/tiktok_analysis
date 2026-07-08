package com.ss.android.ugc.tiktok.tuc.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class TUCInlineLinkData implements Serializable {

    @C09CT("action")
    public final TUCProcessData action;

    @C09CT("placeholder")
    public final String placeHolder;

    @C09CT("text")
    public final String text;

    @C09CT("url")
    public final String url;

    public TUCInlineLinkData() {
        this(null, null, null, null);
    }

    public TUCInlineLinkData(String str, String str2, String str3, TUCProcessData tUCProcessData) {
        this.placeHolder = str;
        this.text = str2;
        this.url = str3;
        this.action = tUCProcessData;
    }
}
