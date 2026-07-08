package com.ss.android.ugc.aweme.im.b2c.card;

import X.C0ZRW;
import X.C13LE;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemSend;

/* JADX INFO: loaded from: classes15.dex */
public final class BrandInvitationSendPowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemSend, C0ZRW> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new IMSkeletonLayoutReusedUISlotAssemSend(C13LE.LIZ(BrandInvitationReusedUISlot.class));
    }
}
