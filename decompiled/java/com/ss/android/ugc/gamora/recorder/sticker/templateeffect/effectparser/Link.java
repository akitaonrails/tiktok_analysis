package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class Link {

    @C09CT("path")
    public final String name;

    @C09CT("rawType")
    public final String rawType;

    @C09CT("type")
    public final String type;

    @C09CT("zorder")
    public final Integer zOrder;

    public Link() {
        this(null, null, null, null);
    }

    public Link(String str, String str2, String str3, Integer num) {
        this.name = str;
        this.type = str2;
        this.rawType = str3;
        this.zOrder = num;
    }
}
