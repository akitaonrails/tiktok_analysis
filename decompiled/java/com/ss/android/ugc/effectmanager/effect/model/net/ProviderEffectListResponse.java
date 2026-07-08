package com.ss.android.ugc.effectmanager.effect.model.net;

import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;

/* JADX INFO: loaded from: classes23.dex */
public class ProviderEffectListResponse extends BaseNetResponse {
    public ProviderEffectModel data;

    @Override // com.ss.android.ugc.effectmanager.common.model.BaseNetResponse
    public boolean checkValue() {
        return this.data != null;
    }

    public ProviderEffectModel getData() {
        return this.data;
    }

    public void setData(ProviderEffectModel providerEffectModel) {
        this.data = providerEffectModel;
    }
}
