package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.repository.api;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.creatorvideo.SeaPdpCreatorVideoModuleDTO;

/* JADX INFO: loaded from: classes4.dex */
public final class RecommendListResponse {

    @C09CT("data")
    public final String data;

    @C09CT("sea_card_data")
    public final SeaPdpCreatorVideoModuleDTO seaData;

    public RecommendListResponse(String str, SeaPdpCreatorVideoModuleDTO seaPdpCreatorVideoModuleDTO) {
        this.data = str;
        this.seaData = seaPdpCreatorVideoModuleDTO;
    }
}
