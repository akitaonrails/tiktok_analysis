package com.ss.android.ugc.aweme.template;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ICAssetInfo implements Serializable {

    @C09CT("anchor_related")
    public AnchorRelated anchorRelated;

    @C09CT("asset_id")
    public Long assetId;

    @C09CT("asset_type")
    public String assetType;

    @C09CT("extra")
    public String extra;

    @C09CT("resource_id")
    public Long resourceId;

    public ICAssetInfo() {
        this(null, null, null, null, null);
    }

    public ICAssetInfo(Long l, Long l2, String str, AnchorRelated anchorRelated, String str2) {
        this.assetId = l;
        this.resourceId = l2;
        this.assetType = str;
        this.anchorRelated = anchorRelated;
        this.extra = str2;
    }
}
