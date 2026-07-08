package com.ss.android.ugc.aweme.biz.wallet.network.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class Button implements Serializable {

    @C09CT("button_link")
    public final String buttonLink;

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("display_type")
    public final Integer displayType;

    @C09CT("link_type")
    public final Integer linkType;

    public Button(String str, Integer num, String str2, Integer num2) {
        this.buttonText = str;
        this.linkType = num;
        this.buttonLink = str2;
        this.displayType = num2;
    }
}
