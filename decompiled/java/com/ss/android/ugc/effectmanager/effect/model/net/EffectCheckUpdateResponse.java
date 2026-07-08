package com.ss.android.ugc.effectmanager.effect.model.net;

import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;

/* JADX INFO: loaded from: classes30.dex */
public class EffectCheckUpdateResponse extends BaseNetResponse {
    public boolean updated;

    @Override // com.ss.android.ugc.effectmanager.common.model.BaseNetResponse
    public boolean checkValue() {
        return super.checkValue();
    }

    public boolean isUpdated() {
        return this.updated;
    }

    public void setUpdated(boolean z) {
        this.updated = z;
    }
}
