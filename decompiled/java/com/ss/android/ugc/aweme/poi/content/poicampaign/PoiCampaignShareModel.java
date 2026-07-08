package com.ss.android.ugc.aweme.poi.content.poicampaign;

import X.C1198420hI8;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCampaignShareModel extends ShareModel {
    public final C1198420hI8 items;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PoiCampaignShareModel) && Intrinsics.LJFF(this.items, ((PoiCampaignShareModel) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiCampaignShareModel(items=");
        sbLIZ.append(this.items);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PoiCampaignShareModel(C1198420hI8 c1198420hI8) {
        super(c1198420hI8);
        this.items = c1198420hI8;
    }
}
