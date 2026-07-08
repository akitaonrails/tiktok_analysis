package com.ss.android.ugc.aweme.commercialize.router.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class CRouterAiPdpActionModel implements Serializable {

    @C09CT("jump_data")
    public final CRouterAiPdpJumpDataModel jumpData;

    public CRouterAiPdpActionModel() {
        this(null);
    }

    public final CRouterAiPdpJumpDataModel getJumpData() {
        return this.jumpData;
    }

    public CRouterAiPdpActionModel(CRouterAiPdpJumpDataModel cRouterAiPdpJumpDataModel) {
        this.jumpData = cRouterAiPdpJumpDataModel;
    }
}
