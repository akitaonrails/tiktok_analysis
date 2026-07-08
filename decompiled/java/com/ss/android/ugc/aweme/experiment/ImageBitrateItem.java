package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes12.dex */
public final class ImageBitrateItem {

    @C09CT("name")
    public final String name;

    @C09CT("network_lower")
    public final int networkLowerKbps;

    @C09CT("network_upper")
    public final int networkUpperKbps;

    public ImageBitrateItem() {
        this(null, 0, 0);
    }

    public ImageBitrateItem(String str, int i, int i2) {
        this.name = str;
        this.networkLowerKbps = i;
        this.networkUpperKbps = i2;
    }
}
