package com.ss.android.ugc.aweme.poi.experiment;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* JADX INFO: loaded from: classes12.dex */
public final class PoiBubbleConfig {

    @C09CT("icon")
    public UrlModel icon;

    @C09CT("type")
    public int type;

    public PoiBubbleConfig() {
        this(0, null);
    }

    public PoiBubbleConfig(int i, UrlModel urlModel) {
        this.type = i;
        this.icon = urlModel;
    }
}
