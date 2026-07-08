package com.ss.android.ugc.tiktok.ban;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class PopAccessory implements Serializable {

    @C09CT("accessory_open_type")
    public final Integer openType;

    @C09CT("accessory_text")
    public final String text;

    @C09CT("accessory_url")
    public final String url;

    public PopAccessory() {
        this("", "", 0);
    }

    public PopAccessory(String str, String str2, Integer num) {
        this.text = str;
        this.url = str2;
        this.openType = num;
    }
}
