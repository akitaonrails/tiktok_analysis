package com.bytedance.android.livesdk.impl.revenue.playcondition;

import X.AbstractC20358214lI;
import X.InterfaceC946300ajU;
import com.bytedance.android.livesdk.gift.event.GoodyBagUpdateEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class GoodyBagOngoingCondition extends AbstractC20358214lI {
    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "goody_bag_ongoing";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel == null || !Intrinsics.LJFF(dataChannel.gg0(GoodyBagUpdateEvent.class), Boolean.TRUE)) {
            DataChannel dataChannel2 = this.LIZIZ;
            if (dataChannel2 != null) {
                dataChannel2.CQ2(GoodyBagUpdateEvent.class, this, new AwS610S0100000_31(this, 99));
            }
            LIZ();
            return;
        }
        LJIIIZ("get status");
        InterfaceC946300ajU interfaceC946300ajU = this.LJ;
        if (interfaceC946300ajU != null) {
            interfaceC946300ajU.LIZ(true, false);
        }
    }

    @Override // X.AbstractC20358214lI, com.bytedance.android.livesdk.condition.PlayCondition
    public final void LJIIIIZZ() {
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        super.LJIIIIZZ();
    }
}
