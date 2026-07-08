package com.bytedance.ies.cutsame.source.api;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class AfrResponse extends DataBaseResponse {

    @C09CT("afr_data")
    public List<AfrData> afrData;

    public final List<AfrData> getAfrData() {
        return this.afrData;
    }

    public final void setAfrData(List<AfrData> list) {
        this.afrData = list;
    }
}
