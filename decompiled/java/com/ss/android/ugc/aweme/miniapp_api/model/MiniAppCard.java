package com.ss.android.ugc.aweme.miniapp_api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class MiniAppCard implements Serializable {

    @C09CT("image_url")
    public String imageUrl;

    @C09CT("text")
    public String text;

    @C09CT("wait_time")
    public int waitTime;

    public MiniAppCard() {
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setWaitTime(int i) {
        this.waitTime = i;
    }

    public MiniAppCard(String str, String str2, int i) {
        this.imageUrl = str;
        this.text = str2;
        this.waitTime = i;
    }
}
