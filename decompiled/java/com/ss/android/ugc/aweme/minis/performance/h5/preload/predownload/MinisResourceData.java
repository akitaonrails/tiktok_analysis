package com.ss.android.ugc.aweme.minis.performance.h5.preload.predownload;

import X.C09CT;
import X.C1529650puN;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class MinisResourceData implements Serializable {

    @C09CT("children")
    public final List<MinisResourceData> children;

    @C09CT("name")
    public final String name;

    @C09CT("type")
    public final String type;
    public static final C1529650puN Companion = new Object() { // from class: X.0puN
    };
    public static final int $stable = 8;

    public MinisResourceData() {
        this("", "", null);
    }

    public MinisResourceData(String str, String str2, List<MinisResourceData> list) {
        this.type = str;
        this.name = str2;
        this.children = list;
    }
}
