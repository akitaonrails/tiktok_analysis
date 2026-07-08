package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SelectDistrictEvent {

    @C09CT("regions")
    public final List<Region> regions;

    public SelectDistrictEvent(List<Region> list) {
        this.regions = list;
    }
}
