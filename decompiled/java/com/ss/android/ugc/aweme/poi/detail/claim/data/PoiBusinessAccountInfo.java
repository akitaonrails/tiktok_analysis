package com.ss.android.ugc.aweme.poi.detail.claim.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiBusinessAccountInfo implements Serializable {

    @C09CT("header_img")
    public final String headerImg;

    @C09CT("nick")
    public final String nick;

    @C09CT("owner_text")
    public final String ownerText;

    @C09CT("title")
    public final String title;

    public PoiBusinessAccountInfo() {
        this(null, null, null, null);
    }

    public PoiBusinessAccountInfo(String str, String str2, String str3, String str4) {
        this.title = str;
        this.headerImg = str2;
        this.nick = str3;
        this.ownerText = str4;
    }
}
