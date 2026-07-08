package com.ss.android.ugc.aweme.im.sdk.chat.ui.unified;

import X.C0ZL0;
import X.C0ZQG;
import X.C13LE;
import X.C1562980qm8;
import X.C19719912Dl;
import X.C869590Y9l;
import X.C900420ZUa;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemReceive;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class UnifiedMultipleShareReceivePowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemReceive, C900420ZUa> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(UnifiedMultipleShareUISlot.class);
        return new IMSkeletonLayoutReusedUISlotAssemReceive(c19719912DlLIZ) { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.unified.UnifiedMultipleShareReceivePowerCell$createAssemAttached2Cell$1
            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final List<C1562980qm8<C0ZL0>> Gp(C869590Y9l c869590Y9l) {
                return C0ZQG.LIZ(c869590Y9l, ((C900420ZUa) bo()).LL, Up());
            }
        };
    }
}
