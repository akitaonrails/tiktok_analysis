package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class VirtualInfoFromEvent {

    @C09CT("sku_id")
    public final String skuId;

    @C09CT("virtual_info")
    public final UserVirtualInfo virtualInfo;

    @C09CT("virtual_info_rich_text")
    public final VirtualInfoModule virtualInfoModule;

    public VirtualInfoFromEvent() {
        this(null, null, null);
    }

    public VirtualInfoFromEvent(UserVirtualInfo userVirtualInfo, VirtualInfoModule virtualInfoModule, String str) {
        this.virtualInfo = userVirtualInfo;
        this.virtualInfoModule = virtualInfoModule;
        this.skuId = str;
    }
}
