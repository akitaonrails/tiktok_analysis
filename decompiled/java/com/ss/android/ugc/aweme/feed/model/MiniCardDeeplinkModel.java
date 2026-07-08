package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class MiniCardDeeplinkModel implements Serializable {

    @C09CT("full_screen_auto_install")
    public final String fullScreenAutoInstallDL;

    @C09CT("full_screen")
    public final String fullScreenDL;

    @C09CT("half_screen_auto_install")
    public final String halfScreenAutoInstallDL;

    @C09CT("half_screen")
    public final String halfScreenDL;

    public final String getFullScreenAutoInstallDL() {
        return this.fullScreenAutoInstallDL;
    }

    public final String getFullScreenDL() {
        return this.fullScreenDL;
    }

    public final String getHalfScreenAutoInstallDL() {
        return this.halfScreenAutoInstallDL;
    }

    public final String getHalfScreenDL() {
        return this.halfScreenDL;
    }
}
