package com.ss.android.ugc.aweme.hometab.base.tabicon.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class DistinguishTabPositionModel {

    @C09CT("enable_decode")
    public final boolean enableDecode;

    @C09CT("enable_download")
    public final boolean enableDownload;

    public DistinguishTabPositionModel() {
        this(false, false);
    }

    public DistinguishTabPositionModel(boolean z, boolean z2) {
        this.enableDownload = z;
        this.enableDecode = z2;
    }
}
