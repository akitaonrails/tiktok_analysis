package com.ss.android.ugc.tiktok.ban;

import X.C09CT;
import X.EnumC1706760uW2;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class PopButton implements Serializable {

    @C09CT("btn_content")
    public final String btnContent;

    @C09CT("btn_style")
    public final int btnStyle;

    @C09CT("btn_type")
    public final Integer btnType;

    @C09CT("btn_url")
    public final String btnUrl;

    public PopButton() {
        this("", EnumC1706760uW2.PRIMARY.getValue(), "", -1);
    }

    public PopButton(String str, int i, String str2, Integer num) {
        this.btnContent = str;
        this.btnStyle = i;
        this.btnUrl = str2;
        this.btnType = num;
    }
}
