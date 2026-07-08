package com.ss.android.ugc.aweme.msg;

import X.C13LE;
import X.C461520I7y;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemSend;

/* JADX INFO: loaded from: classes7.dex */
public final class GroupInvitationSendPowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemSend, C461520I7y> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new IMSkeletonLayoutReusedUISlotAssemSend(C13LE.LIZ(GroupInvitationCardAssem.class));
    }
}
