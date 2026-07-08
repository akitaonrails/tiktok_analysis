package com.ss.android.ugc.aweme.commercialize.live.promote.api;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class BannerActionReportRequest implements Serializable {

    @C09CT("items")
    public List<BannerActionReportModel> items;

    public BannerActionReportRequest() {
        this(null);
    }

    public final List<BannerActionReportModel> getItems() {
        return this.items;
    }

    public BannerActionReportRequest(List<BannerActionReportModel> list) {
        this.items = list;
    }

    public final void setItems(List<BannerActionReportModel> list) {
        this.items = list;
    }
}
