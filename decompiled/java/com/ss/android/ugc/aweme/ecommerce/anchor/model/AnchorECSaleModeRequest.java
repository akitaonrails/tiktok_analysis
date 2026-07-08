package com.ss.android.ugc.aweme.ecommerce.anchor.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class AnchorECSaleModeRequest {

    @C09CT("creator_id")
    public final long creatorId;

    @C09CT("product_ids")
    public final List<String> productIds;

    @C09CT("source_type")
    public final int type;

    public AnchorECSaleModeRequest(long j, int i, List<String> list) {
        this.creatorId = j;
        this.type = i;
        this.productIds = list;
    }
}
