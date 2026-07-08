package com.ss.android.ugc.aweme.biz.wallet.network.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class PopOutInfo implements Serializable {

    @C09CT("content")
    public final String content;

    @C09CT("ext_info")
    public final PopOutExtraInfo extraInfo;

    @C09CT("main_button")
    public final Button mainButton;

    @C09CT("sub_button")
    public final Button subButton;

    @C09CT("title")
    public final String title;

    public PopOutInfo(String str, String str2, Button button, Button button2, PopOutExtraInfo popOutExtraInfo) {
        this.title = str;
        this.content = str2;
        this.mainButton = button;
        this.subButton = button2;
        this.extraInfo = popOutExtraInfo;
    }
}
