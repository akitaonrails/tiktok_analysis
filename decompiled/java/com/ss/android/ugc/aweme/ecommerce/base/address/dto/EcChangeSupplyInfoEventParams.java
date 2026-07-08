package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class EcChangeSupplyInfoEventParams {

    @C09CT("supply_info")
    public final EcChangeSupplyInfoModel supplyInfo;

    public EcChangeSupplyInfoEventParams() {
        this(null);
    }

    public EcChangeSupplyInfoEventParams(EcChangeSupplyInfoModel ecChangeSupplyInfoModel) {
        this.supplyInfo = ecChangeSupplyInfoModel;
    }
}
