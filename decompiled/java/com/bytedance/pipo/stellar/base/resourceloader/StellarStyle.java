package com.bytedance.pipo.stellar.base.resourceloader;

import X.C09CT;
import com.bytedance.pipo.stellar.base.model.BackgroundDO;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class StellarStyle {

    @C09CT("background")
    public final BackgroundDO background;

    @C09CT("enable_refresh")
    public final Integer enableRefresh;

    @C09CT("navigation_bar")
    public final String navigationBar;

    @C09CT("status_bar")
    public final String statusBar;

    @C09CT("theme")
    public final String theme;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StellarStyle)) {
            return false;
        }
        StellarStyle stellarStyle = (StellarStyle) obj;
        return Intrinsics.LJFF(this.theme, stellarStyle.theme) && Intrinsics.LJFF(this.statusBar, stellarStyle.statusBar) && Intrinsics.LJFF(this.navigationBar, stellarStyle.navigationBar) && Intrinsics.LJFF(this.background, stellarStyle.background) && Intrinsics.LJFF(this.enableRefresh, stellarStyle.enableRefresh);
    }

    public StellarStyle(String str, String str2, String str3, BackgroundDO backgroundDO, Integer num) {
        this.theme = str;
        this.statusBar = str2;
        this.navigationBar = str3;
        this.background = backgroundDO;
        this.enableRefresh = num;
    }
}
