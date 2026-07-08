package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class Button {

    @C09CT("link")
    public String link;

    @C09CT("name")
    public String name;

    @C09CT("text")
    public String text;

    @C09CT("type")
    public Integer type;

    public Button() {
    }

    public Button(Integer num, String str, String str2, String str3) {
        this.type = num;
        this.text = str;
        this.link = str2;
        this.name = str3;
    }
}
