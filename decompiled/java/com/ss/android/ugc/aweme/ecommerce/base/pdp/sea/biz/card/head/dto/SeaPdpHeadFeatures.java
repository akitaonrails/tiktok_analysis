package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.dto;

import X.C09CT;
import com.google.gson.n;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpHeadFeatures {

    @C09CT("custom_config")
    public final n customConfig;

    @C09CT("ignore_cache")
    public final Boolean ignoreCache;

    @C09CT("tags")
    public final List<String> tags;

    @C09CT("type")
    public final String type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPdpHeadFeatures)) {
            return false;
        }
        SeaPdpHeadFeatures seaPdpHeadFeatures = (SeaPdpHeadFeatures) obj;
        return Intrinsics.LJFF(this.type, seaPdpHeadFeatures.type) && Intrinsics.LJFF(this.tags, seaPdpHeadFeatures.tags) && Intrinsics.LJFF(this.ignoreCache, seaPdpHeadFeatures.ignoreCache) && Intrinsics.LJFF(this.customConfig, seaPdpHeadFeatures.customConfig);
    }

    public SeaPdpHeadFeatures(String str, List<String> list, Boolean bool, n nVar) {
        this.type = str;
        this.tags = list;
        this.ignoreCache = bool;
        this.customConfig = nVar;
    }
}
