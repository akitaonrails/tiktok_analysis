package com.bytedance.android.livesdk.interaction.playcondition;

import X.AbstractC20358214lI;
import X.C01GW;
import X.C1161920gLG;
import X.C20350314k1;
import X.C452501pT;
import X.EnumC771230UNd;
import X.EnumC773040UUc;
import X.InterfaceC946300ajU;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class QuickPollOngoingCondition extends AbstractC20358214lI {
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS575S0100000_31(this, 191));

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "quick_poll_ongoing";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        EnumC773040UUc enumC773040UUc = EnumC773040UUc.POLL_NORMAL;
        if (iBroadcastService.getHostToolsCurrentStatus(enumC773040UUc).LIZ != EnumC771230UNd.APPLYING) {
            iBroadcastService.addHostToolsCallback(enumC773040UUc, (C20350314k1) this.LJFF.getValue());
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
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).removeHostToolsCallback(EnumC773040UUc.POLL_NORMAL, (C20350314k1) this.LJFF.getValue());
        super.LJIIIIZZ();
    }
}
