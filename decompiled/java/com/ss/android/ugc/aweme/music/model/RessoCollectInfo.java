package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class RessoCollectInfo implements Serializable {

    @C09CT("added_on_resso")
    public final boolean addedOnResso;

    @C09CT("deep_link")
    public final String deepLink;

    public RessoCollectInfo(boolean z, String str) {
        this.addedOnResso = z;
        this.deepLink = str;
    }
}
