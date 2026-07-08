package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class AddressTipInfo {

    @C09CT("buttons")
    public final List<AddressTipButton> buttons;

    @C09CT("content")
    public final String content;

    @C09CT("tips")
    public final String tips;

    @C09CT("title")
    public final String title;

    public AddressTipInfo(String str, String str2, String str3, List<AddressTipButton> list) {
        this.title = str;
        this.content = str2;
        this.tips = str3;
        this.buttons = list;
    }
}
