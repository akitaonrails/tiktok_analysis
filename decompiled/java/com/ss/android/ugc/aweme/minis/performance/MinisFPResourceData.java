package com.ss.android.ugc.aweme.minis.performance;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class MinisFPResourceData implements Serializable {
    public static final int $stable = 8;

    @C09CT("assets")
    public final List<String> assets;

    @C09CT("client_key")
    public final String clientKey;

    @C09CT("minis_url")
    public final String minisUrl;

    public MinisFPResourceData() {
        this(null, null, null, 7, null);
    }

    public MinisFPResourceData(List<String> list, String str, String str2) {
        this.assets = list;
        this.minisUrl = str;
        this.clientKey = str2;
    }

    public MinisFPResourceData(List list, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}
