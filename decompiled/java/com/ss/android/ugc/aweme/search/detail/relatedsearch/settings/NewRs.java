package com.ss.android.ugc.aweme.search.detail.relatedsearch.settings;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class NewRs implements Serializable {
    public static final int $stable = 8;

    @C09CT("bgm_json")
    public final BgmJson bgmJson;

    @C09CT("cover")
    public final String cover;

    public NewRs() {
        this(null, null);
    }

    public NewRs(BgmJson bgmJson, String str) {
        this.bgmJson = bgmJson;
        this.cover = str;
    }
}
