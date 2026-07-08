package com.ss.android.ugc.aweme.poi.uiwidget.gallery.dishes;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDishesGalleryMobData implements Serializable {

    @C09CT("collect_info")
    public final String collectInfo;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("module_name")
    public final String moduleName;

    public PoiDishesGalleryMobData() {
        this(null, null, null);
    }

    public PoiDishesGalleryMobData(String str, String str2, String str3) {
        this.enterFrom = str;
        this.moduleName = str2;
        this.collectInfo = str3;
    }
}
