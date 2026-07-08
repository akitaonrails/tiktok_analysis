package com.ss.android.ugc.aweme.im.b2c.card;

import X.C13LE;
import X.C900090ZSt;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemSend;

/* JADX INFO: loaded from: classes15.dex */
public final class InfoCardSendPowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemSend, C900090ZSt> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new IMSkeletonLayoutReusedUISlotAssemSend(C13LE.LIZ(InfoCardReusedUISlot.class));
    }
}
