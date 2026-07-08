package com.ss.android.ugc.aweme.friendstab.guidecard;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class StaticResource implements Serializable {

    @C09CT("friends_tab_bottom_bar")
    public final UrlModel friendsTabBottomBar;

    @C09CT("friends_tab_bottom_bar_rtl")
    public final UrlModel friendsTabBottomBarRtl;

    @C09CT("friends_tab_logo")
    public final UrlModel friendsTabLogo;

    public StaticResource() {
        this(null, null, null);
    }

    public StaticResource(UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3) {
        this.friendsTabLogo = urlModel;
        this.friendsTabBottomBar = urlModel2;
        this.friendsTabBottomBarRtl = urlModel3;
    }
}
