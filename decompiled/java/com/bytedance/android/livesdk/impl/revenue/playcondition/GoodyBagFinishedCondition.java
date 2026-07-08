package com.bytedance.android.livesdk.impl.revenue.playcondition;

import X.AbstractC20358214lI;
import com.bytedance.android.livesdk.gift.event.GoodyBagUpdateEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class GoodyBagFinishedCondition extends AbstractC20358214lI {
    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "goody_bag_finished";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            dataChannel.BQ2(this.LIZLLL, GoodyBagUpdateEvent.class, new AwS610S0100000_31(this, 98));
        }
        LIZ();
    }
}
