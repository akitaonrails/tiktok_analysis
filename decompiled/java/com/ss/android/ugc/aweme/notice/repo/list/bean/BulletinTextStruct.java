package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinTextStruct {

    @C09CT("color")
    public final String color;

    @C09CT("font")
    public final String font;

    @C09CT("text")
    public final String text;

    public BulletinTextStruct() {
        this(null, null, null);
    }

    public BulletinTextStruct(String str, String str2, String str3) {
        this.text = str;
        this.color = str2;
        this.font = str3;
    }
}
