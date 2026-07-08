package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class TopBannerDesc implements Serializable {
    public static final int $stable = 0;

    @C09CT("sub_title")
    public String subTitle;

    @C09CT("title")
    public String title;

    public TopBannerDesc() {
        this(null, null);
    }

    public TopBannerDesc(String str, String str2) {
        this.title = str;
        this.subTitle = str2;
    }
}
