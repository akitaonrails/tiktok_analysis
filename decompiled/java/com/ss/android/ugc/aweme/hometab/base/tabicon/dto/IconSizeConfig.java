package com.ss.android.ugc.aweme.hometab.base.tabicon.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class IconSizeConfig {

    @C09CT("height")
    public final Float height;

    @C09CT("width")
    public final Float width;

    public IconSizeConfig() {
        this(null, null);
    }

    public final int hashCode() {
        Float f = this.width;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.height;
        return iHashCode + (f2 != null ? f2.hashCode() : 0);
    }

    public IconSizeConfig(Float f, Float f2) {
        this.width = f;
        this.height = f2;
    }
}
