package com.ss.android.ugc.aweme.poi;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAnchorCardSecondLineCarousel implements Serializable {

    @C09CT("icon_tux")
    public final String iconTux;

    @C09CT("l1_type")
    public final String l1Type;

    @C09CT("l2_type")
    public final String l2Type;

    @C09CT("l3_type")
    public final String l3Type;

    @C09CT("labels")
    public final List<PoiAnchorCardCarouselLabel> labels;

    public PoiAnchorCardSecondLineCarousel() {
        this(null, null, null, null, null);
    }

    public PoiAnchorCardSecondLineCarousel(String str, String str2, String str3, String str4, List<PoiAnchorCardCarouselLabel> list) {
        this.l1Type = str;
        this.l2Type = str2;
        this.l3Type = str3;
        this.iconTux = str4;
        this.labels = list;
    }
}
