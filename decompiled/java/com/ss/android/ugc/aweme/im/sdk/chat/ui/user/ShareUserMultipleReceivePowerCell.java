package com.ss.android.ugc.aweme.im.sdk.chat.ui.user;

import X.C0ZL0;
import X.C13LE;
import X.C1562980qm8;
import X.C19719912Dl;
import X.C462690ICl;
import X.C869590Y9l;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemReceive;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ShareUserMultipleReceivePowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemReceive, C462690ICl> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(ShareUserMultipleReusedUISlot.class);
        return new IMSkeletonLayoutReusedUISlotAssemReceive(c19719912DlLIZ) { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.user.ShareUserMultipleReceivePowerCell$createAssemAttached2Cell$1
            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final List<C1562980qm8<C0ZL0>> Gp(C869590Y9l c869590Y9l) {
                return yp(c869590Y9l, true);
            }
        };
    }
}
