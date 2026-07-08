package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class ImageBitrate {

    @C09CT("default_gear")
    public final String defaultGear;

    @C09CT("gears")
    public final List<ImageBitrateItem> gears;

    public ImageBitrate() {
        this(null, null);
    }

    public ImageBitrate(String str, List<ImageBitrateItem> list) {
        this.defaultGear = str;
        this.gears = list;
    }
}
