package com.ss.android.ugc.aweme.search.detail.relatedsearch.settings;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class BgmJson implements Serializable {
    public static final int $stable = 8;

    @C09CT("bit_rate")
    public final List<BitRate> bitRate;

    public BgmJson() {
        this(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BgmJson(List<? extends BitRate> list) {
        this.bitRate = list;
    }
}
