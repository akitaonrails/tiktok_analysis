package com.bytedance.android.livesdk.impl.revenue.playcondition;

import X.AbstractC20358214lI;
import X.C001A;
import X.C16HP;
import X.C776250Uch;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;

/* JADX INFO: loaded from: classes32.dex */
public final class TreasureBoxFinishedOneCondition extends AbstractC20358214lI {
    public final C16HP LJFF = new C16HP(this, 0);

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "treasure_box_finished_one";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        IMessageManager iMessageManager;
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.addMessageListener(C001A.RED_ENVELOPE_MESSAGE.getIntType(), this.LJFF);
        }
        LIZ();
    }

    @Override // X.AbstractC20358214lI, com.bytedance.android.livesdk.condition.PlayCondition
    public final void LJIIIIZZ() {
        IMessageManager iMessageManager;
        super.LJIIIIZZ();
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel == null || (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) == null) {
            return;
        }
        iMessageManager.removeMessageListener(this.LJFF);
    }
}
