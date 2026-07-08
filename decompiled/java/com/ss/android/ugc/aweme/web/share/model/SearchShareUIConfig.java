package com.ss.android.ugc.aweme.web.share.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class SearchShareUIConfig implements Serializable {

    @C09CT("DMCardStyle")
    public final int dmCardStyle;

    @C09CT("sharePanelStyle")
    public final int sharePanelStyle;

    public SearchShareUIConfig() {
        this(0, 0);
    }

    public SearchShareUIConfig(int i, int i2) {
        this.sharePanelStyle = i;
        this.dmCardStyle = i2;
    }
}
