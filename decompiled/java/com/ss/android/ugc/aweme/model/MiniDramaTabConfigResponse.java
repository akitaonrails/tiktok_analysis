package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class MiniDramaTabConfigResponse extends BaseResponse implements Serializable {

    @C09CT("card_config")
    public final DramaDNUFeedCardConfig cardConfig;

    public MiniDramaTabConfigResponse() {
        this(null);
    }

    public final MiniDramaTabConfigResponse copy(DramaDNUFeedCardConfig dramaDNUFeedCardConfig) {
        return new MiniDramaTabConfigResponse(dramaDNUFeedCardConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MiniDramaTabConfigResponse) && Intrinsics.LJFF(this.cardConfig, ((MiniDramaTabConfigResponse) obj).cardConfig);
    }

    public int hashCode() {
        DramaDNUFeedCardConfig dramaDNUFeedCardConfig = this.cardConfig;
        if (dramaDNUFeedCardConfig == null) {
            return 0;
        }
        return dramaDNUFeedCardConfig.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MiniDramaTabConfigResponse(cardConfig=");
        sbLIZ.append(this.cardConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final DramaDNUFeedCardConfig getCardConfig() {
        return this.cardConfig;
    }

    public MiniDramaTabConfigResponse(DramaDNUFeedCardConfig dramaDNUFeedCardConfig) {
        this.cardConfig = dramaDNUFeedCardConfig;
    }
}
