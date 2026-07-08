package com.bytedance.android.livesdk.impl.revenue.playcondition;

import X.AbstractC20358214lI;
import X.InterfaceC946300ajU;
import com.bytedance.android.livesdk.gift.event.TreasureBoxCurrentData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class TreasureBoxOngoingCondition extends AbstractC20358214lI {
    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "treasure_box_ongoing";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        List list;
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel == null || (list = (List) dataChannel.gg0(TreasureBoxCurrentData.class)) == null || !(!list.isEmpty())) {
            DataChannel dataChannel2 = this.LIZIZ;
            if (dataChannel2 != null) {
                dataChannel2.CQ2(TreasureBoxCurrentData.class, this, new AwS610S0100000_31(this, 100));
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
