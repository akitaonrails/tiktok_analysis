package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class EcChangeSupplyInfoModel {

    @C09CT("encrypted_info_id")
    public final String encryptedInfoId;

    @C09CT("scene_code")
    public final Integer sceneCode;

    public EcChangeSupplyInfoModel() {
        this(null, null);
    }

    public EcChangeSupplyInfoModel(Integer num, String str) {
        this.sceneCode = num;
        this.encryptedInfoId = str;
    }
}
