package com.ss.android.ugc.aweme.theater.social.protocol;

import X.C0MXS;
import X.C0ZL0;
import X.C0ZLF;
import X.C0ZLL;
import X.C13BV;
import X.C13LE;
import X.C1562980qm8;
import X.C19719912Dl;
import X.C869590Y9l;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemSend;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class AITheaterSocialGeneratingSendPowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemSend, C0MXS> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(AITheaterSocialGeneratingReusedUISlot.class);
        return new IMSkeletonLayoutReusedUISlotAssemSend(c19719912DlLIZ) { // from class: com.ss.android.ugc.aweme.theater.social.protocol.AITheaterSocialGeneratingSendPowerCell$createAssemAttached2Cell$1
            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final List<C1562980qm8<C0ZL0>> Gp(C869590Y9l c869590Y9l) {
                return C13BV.INSTANCE;
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final C0ZLF Ip(C869590Y9l c869590Y9l) {
                return C0ZLL.LIZ;
            }
        };
    }
}
