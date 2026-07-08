package com.bytedance.android.livesdk.api.revenue.strategy.channel;

import X.C2188811AlT;
import X.C2436109gd;
import com.bytedance.ies.sdk.datachannel.GlobalEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class OpenLiveReferralPanelEvent extends GlobalEvent<OpenLiveReferralPanelEvent> {
    public final C2436109gd schemaModel;

    public final OpenLiveReferralPanelEvent copy(C2436109gd c2436109gd) {
        return new OpenLiveReferralPanelEvent(c2436109gd);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpenLiveReferralPanelEvent) && Intrinsics.LJFF(this.schemaModel, ((OpenLiveReferralPanelEvent) obj).schemaModel);
    }

    public int hashCode() {
        return this.schemaModel.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpenLiveReferralPanelEvent(schemaModel=");
        sbLIZ.append(this.schemaModel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C2436109gd getSchemaModel() {
        return this.schemaModel;
    }

    public OpenLiveReferralPanelEvent(C2436109gd c2436109gd) {
        this.schemaModel = c2436109gd;
    }
}
