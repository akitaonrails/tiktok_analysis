package com.ss.android.ugc.aweme.sidebar.model;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SideBarListItemIcon {

    @C09CT("dark_url")
    public SideBarListItemIconUrl darkUrl;

    @C09CT("normal_url")
    public SideBarListItemIconUrl normalUrl;

    public SideBarListItemIcon() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SideBarListItemIcon)) {
            return false;
        }
        SideBarListItemIcon sideBarListItemIcon = (SideBarListItemIcon) obj;
        return Intrinsics.LJFF(this.normalUrl, sideBarListItemIcon.normalUrl) && Intrinsics.LJFF(this.darkUrl, sideBarListItemIcon.darkUrl);
    }

    public final int hashCode() {
        SideBarListItemIconUrl sideBarListItemIconUrl = this.normalUrl;
        int iHashCode = (sideBarListItemIconUrl == null ? 0 : sideBarListItemIconUrl.hashCode()) * 31;
        SideBarListItemIconUrl sideBarListItemIconUrl2 = this.darkUrl;
        return iHashCode + (sideBarListItemIconUrl2 != null ? sideBarListItemIconUrl2.hashCode() : 0);
    }

    public SideBarListItemIcon(SideBarListItemIconUrl sideBarListItemIconUrl, SideBarListItemIconUrl sideBarListItemIconUrl2) {
        this.normalUrl = sideBarListItemIconUrl;
        this.darkUrl = sideBarListItemIconUrl2;
    }
}
