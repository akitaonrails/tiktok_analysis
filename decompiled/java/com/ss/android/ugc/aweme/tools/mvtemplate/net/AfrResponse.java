package com.ss.android.ugc.aweme.tools.mvtemplate.net;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class AfrResponse extends DataBaseResponse {
    public static final int $stable = 8;

    @C09CT("afr_data")
    public List<AfrData> afrData;

    public final List<AfrData> getAfrData() {
        return this.afrData;
    }

    public final void setAfrData(List<AfrData> list) {
        this.afrData = list;
    }
}
