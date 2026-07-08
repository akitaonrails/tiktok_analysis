package com.ss.android.ugc.aweme.hometab.base.tabicon.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class IconInOutConfig {

    @C09CT("time")
    public final Long time;

    @C09CT("type")
    public final String type;

    public IconInOutConfig() {
        this(null, null);
    }

    public IconInOutConfig(Long l, String str) {
        this.time = l;
        this.type = str;
    }
}
