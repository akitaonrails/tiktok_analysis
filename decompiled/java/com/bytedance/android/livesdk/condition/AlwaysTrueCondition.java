package com.bytedance.android.livesdk.condition;

import X.AbstractC20358214lI;
import X.InterfaceC946300ajU;

/* JADX INFO: loaded from: classes16.dex */
public final class AlwaysTrueCondition extends AbstractC20358214lI {
    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "always_true";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        LJIIIZ("always true");
        InterfaceC946300ajU interfaceC946300ajU = this.LJ;
        if (interfaceC946300ajU != null) {
            interfaceC946300ajU.LIZ(true, false);
        }
    }
}
