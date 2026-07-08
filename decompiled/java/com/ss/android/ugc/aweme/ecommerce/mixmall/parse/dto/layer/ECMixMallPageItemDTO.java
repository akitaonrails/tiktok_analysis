package com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.layer;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.item.ECMixMallItemDTO;

/* JADX INFO: loaded from: classes27.dex */
public final class ECMixMallPageItemDTO {

    @C09CT("item")
    public ECMixMallItemDTO item;

    public ECMixMallPageItemDTO() {
        this(null);
    }

    public ECMixMallPageItemDTO(ECMixMallItemDTO eCMixMallItemDTO) {
        this.item = eCMixMallItemDTO;
    }
}
