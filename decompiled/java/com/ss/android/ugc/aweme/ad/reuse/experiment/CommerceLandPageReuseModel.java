package com.ss.android.ugc.aweme.ad.reuse.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceLandPageReuseModel {

    @C09CT("enable_first_page_on_additional_finish")
    public final boolean enableFirstPageOnAdditionalFinish;

    @C09CT("enable_reuse_land_page")
    public final boolean enableReuseLandPage;

    public CommerceLandPageReuseModel() {
        this(false, true);
    }

    public CommerceLandPageReuseModel(boolean z, boolean z2) {
        this.enableReuseLandPage = z;
        this.enableFirstPageOnAdditionalFinish = z2;
    }
}
