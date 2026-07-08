package com.ss.android.ugc.tools.infosticker.repository.internal.repository;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;

/* JADX INFO: loaded from: classes23.dex */
public interface InfoStickerPanelApi {
    @InterfaceC1501170pAR("/sticker/collect/create")
    C11NZ<SetStickerRelationResp> createCollectRelation(@InterfaceC1501070pAH("image_url") String str);

    @InterfaceC1501160pAQ("/sticker/collect/list")
    C11NZ<InfoStickerPanelCollectData> getCollectList(@InterfaceC1501070pAH("cursor") int i, @InterfaceC1501070pAH("im_sticker_cursor") long j, @InterfaceC1501070pAH("count") int i2);

    @InterfaceC1501160pAQ("/sticker/collect/token")
    C11NZ<StickerCollectTokenResp> getCustomStickerUploadToken();

    @InterfaceC1501160pAQ("/sticker/set/list")
    C11NZ<InfoStickerSetListResp> getStickerSetCategoryList(@InterfaceC1501070pAH("cursor") int i, @InterfaceC1501070pAH("count") int i2);

    @InterfaceC1501160pAQ("/sticker/set/detail")
    C11NZ<StickerSetDetailResp> getStickerSetDetail(@InterfaceC1501070pAH("category_key") String str, @InterfaceC1501070pAH("cursor") int i, @InterfaceC1501070pAH("count") int i2);
}
