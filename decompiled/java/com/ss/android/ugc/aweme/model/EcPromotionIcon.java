package com.ss.android.ugc.aweme.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class EcPromotionIcon {

    @C09CT("height")
    public final Integer height;

    @C09CT("url_list")
    public final List<String> urlList;

    @C09CT("width")
    public final Integer width;

    public EcPromotionIcon() {
        this(null, 0, 0);
    }

    public EcPromotionIcon(List<String> list, Integer num, Integer num2) {
        this.urlList = list;
        this.width = num;
        this.height = num2;
    }
}
