package com.ss.android.ugc.aweme.sticker.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes30.dex */
public final class EffectAnchor implements Serializable {

    @C09CT("desc")
    public final String desc;

    @C09CT("extra")
    public final String extra;

    @C09CT("icon")
    public final EffectAnchorIcon icon;

    @C09CT("subtitle")
    public final String subtitle;

    @C09CT("title")
    public final String title;

    @C09CT("type")
    public final int type;

    @C09CT("url")
    public final String url;

    public EffectAnchor(int i, EffectAnchorIcon effectAnchorIcon, String str, String str2, String str3, String str4, String str5) {
        this.type = i;
        this.icon = effectAnchorIcon;
        this.title = str;
        this.subtitle = str2;
        this.desc = str3;
        this.url = str4;
        this.extra = str5;
    }
}
