package com.ss.android.ugc.feed.platform.cell.interact.next.debug;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class StandardSignal implements Serializable {
    public static final int $stable = 0;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("index")
    public final int index;

    @C09CT("key")
    public final String key;

    public StandardSignal() {
        this(-1, "", false);
    }

    public StandardSignal(int i, String str, boolean z) {
        this.index = i;
        this.key = str;
        this.enable = z;
    }
}
