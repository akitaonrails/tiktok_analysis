package com.ss.android.ugc.effectmanager.effect.model.net;

import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelModel;

/* JADX INFO: loaded from: classes31.dex */
public class EffectNetListResponse extends BaseNetResponse {
    public EffectChannelModel data;

    @Override // com.ss.android.ugc.effectmanager.common.model.BaseNetResponse
    public boolean checkValue() {
        EffectChannelModel effectChannelModel = this.data;
        return effectChannelModel != null && effectChannelModel.checkValued();
    }

    public EffectChannelModel getData() {
        return this.data;
    }

    public void setData(EffectChannelModel effectChannelModel) {
        this.data = effectChannelModel;
    }
}
