package com.ss.android.ugc.aweme.hometab.base.tabicon.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class IconSizeModel {

    @C09CT("icon_height_max")
    public final int iconHeightMax;

    @C09CT("icon_height_min")
    public final int iconHeightMin;

    @C09CT("icon_width_max")
    public final int iconWidthMax;

    @C09CT("icon_width_min")
    public final int iconWidthMin;

    public IconSizeModel() {
        this(0, 0, 0, 0);
    }

    public IconSizeModel(int i, int i2, int i3, int i4) {
        this.iconWidthMax = i;
        this.iconWidthMin = i2;
        this.iconHeightMax = i3;
        this.iconHeightMin = i4;
    }
}
