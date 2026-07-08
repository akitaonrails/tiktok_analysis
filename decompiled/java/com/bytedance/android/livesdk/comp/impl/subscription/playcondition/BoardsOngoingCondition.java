package com.bytedance.android.livesdk.comp.impl.subscription.playcondition;

import X.AbstractC20358214lI;
import X.C20349614ju;
import X.InterfaceC946300ajU;
import com.bytedance.android.live.liveinteract.multiguestv3.PlaybookBoardEntityStatusChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class BoardsOngoingCondition extends AbstractC20358214lI {
    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "boards_ongoing";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel == null || !Intrinsics.LJFF(dataChannel.gg0(PlaybookBoardEntityStatusChannel.class), Boolean.TRUE)) {
            DataChannel dataChannel2 = this.LIZIZ;
            if (dataChannel2 != null) {
                dataChannel2.BQ2(this.LIZLLL, PlaybookBoardEntityStatusChannel.class, new C20349614ju(this));
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
}
