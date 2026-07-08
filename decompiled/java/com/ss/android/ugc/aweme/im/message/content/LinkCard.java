package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class LinkCard {

    @C09CT("desc")
    public final String desc;

    @C09CT("link_info")
    public final LinkInfo linkInfo;

    @C09CT("name")
    public final String name;

    public LinkCard() {
        this(null, null, null);
    }

    public LinkCard(String str, String str2, LinkInfo linkInfo) {
        this.name = str;
        this.desc = str2;
        this.linkInfo = linkInfo;
    }
}
