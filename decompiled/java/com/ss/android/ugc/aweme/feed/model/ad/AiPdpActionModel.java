package com.ss.android.ugc.aweme.feed.model.ad;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AiPdpActionModel implements Serializable {

    @C09CT("jump_data")
    public final AiPdpJumpDataModel jumpData;

    public AiPdpActionModel() {
        this(null);
    }

    public final AiPdpJumpDataModel getJumpData() {
        return this.jumpData;
    }

    public AiPdpActionModel(AiPdpJumpDataModel aiPdpJumpDataModel) {
        this.jumpData = aiPdpJumpDataModel;
    }
}
