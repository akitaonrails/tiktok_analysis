package com.ss.android.ugc.aweme.component.nativeproducttilescomponent;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class LogInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("refer")
    public final String refer;

    @C09CT("tag")
    public final String tag;

    public LogInfo(String str, String str2) {
        this.refer = str;
        this.tag = str2;
    }
}
