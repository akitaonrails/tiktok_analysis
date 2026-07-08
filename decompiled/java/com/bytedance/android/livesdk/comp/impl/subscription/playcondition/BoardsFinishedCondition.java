package com.bytedance.android.livesdk.comp.impl.subscription.playcondition;

import X.AbstractC20358214lI;
import X.C20349814jw;
import com.bytedance.android.live.liveinteract.multiguestv3.PlaybookBoardEntityStatusChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes32.dex */
public final class BoardsFinishedCondition extends AbstractC20358214lI {
    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "boards_finished";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            dataChannel.BQ2(this.LIZLLL, PlaybookBoardEntityStatusChannel.class, new C20349814jw(this));
        }
        LIZ();
    }
}
