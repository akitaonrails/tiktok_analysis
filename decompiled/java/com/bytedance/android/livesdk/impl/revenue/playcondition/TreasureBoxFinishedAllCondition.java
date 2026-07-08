package com.bytedance.android.livesdk.impl.revenue.playcondition;

import X.AbstractC20358214lI;
import X.C1548820qPI;
import X.C20748416Ha;

/* JADX INFO: loaded from: classes32.dex */
public final class TreasureBoxFinishedAllCondition extends AbstractC20358214lI {
    public final C20748416Ha LJFF = new C20748416Ha(this, 0);

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "treasure_box_finished_all";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        C1548820qPI.LIZLLL("liveGoldenEnvelopCloseAll", this.LJFF);
        LIZ();
    }

    @Override // X.AbstractC20358214lI, com.bytedance.android.livesdk.condition.PlayCondition
    public final void LJIIIIZZ() {
        super.LJIIIIZZ();
        C1548820qPI.LJIIIIZZ("liveGoldenEnvelopCloseAll", this.LJFF);
    }
}
