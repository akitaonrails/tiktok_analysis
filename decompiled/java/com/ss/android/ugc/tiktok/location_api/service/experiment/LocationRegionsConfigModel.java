package com.ss.android.ugc.tiktok.location_api.service.experiment;

import X.C08CX;
import X.C09CT;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes28.dex */
public final class LocationRegionsConfigModel {

    @C09CT("blocked_regions")
    public final Set<String> blockedRegions;

    @C09CT("coarse_regions")
    public final Set<String> coarseRegions;

    @C09CT("fine_regions")
    public final Set<String> fineRegions;

    public LocationRegionsConfigModel() {
        this(null, null, null, 7, null);
    }

    public LocationRegionsConfigModel(Set<String> set, Set<String> set2, Set<String> set3) {
        this.fineRegions = set;
        this.coarseRegions = set2;
        this.blockedRegions = set3;
    }

    public LocationRegionsConfigModel(Set set, Set set2, Set set3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C08CX.INSTANCE : set, (i & 2) != 0 ? C08CX.INSTANCE : set2, (i & 4) != 0 ? Collections.singleton("KR") : set3);
    }
}
