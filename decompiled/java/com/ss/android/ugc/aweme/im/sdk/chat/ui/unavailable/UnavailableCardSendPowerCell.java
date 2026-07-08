package com.ss.android.ugc.aweme.im.sdk.chat.ui.unavailable;

import X.C0ZL0;
import X.C0ZLF;
import X.C0ZLL;
import X.C0ZNK;
import X.C0ZNW;
import X.C0ZQI;
import X.C13LE;
import X.C1559260qg8;
import X.C1562980qm8;
import X.C19719912Dl;
import X.C457780HxI;
import X.C723580SZw;
import X.C869590Y9l;
import X.C898020ZKu;
import X.C898560ZMw;
import X.C898650ZNf;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemSend;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class UnavailableCardSendPowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemSend, C898650ZNf> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(UnavailableCardCardAssem.class);
        return new IMSkeletonLayoutReusedUISlotAssemSend(c19719912DlLIZ) { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.unavailable.UnavailableCardSendPowerCell$createAssemAttached2Cell$1
            public final C1559260qg8 LLLIIII = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final void Tp() {
                C457780HxI c457780HxI = (C457780HxI) this.LLLIIII.getValue();
                C0ZNW.LIZJ(c457780HxI != null ? c457780HxI.LL : null, (C0ZNK) bo());
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemSend, com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.AbsSkeletonLayoutReusedUISlotAssem
            public final void op() {
                super.op();
                tp(C898560ZMw.LIZ);
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final List<C1562980qm8<C0ZL0>> Gp(C869590Y9l c869590Y9l) {
                C0ZQI c0zqiUp = Up();
                ArrayList arrayList = new ArrayList();
                C898020ZKu c898020ZKu = (C898020ZKu) c0zqiUp;
                arrayList.addAll(c898020ZKu.LJIIIIZZ(c869590Y9l));
                if (c898020ZKu.LJFF(c869590Y9l)) {
                    arrayList.add(c898020ZKu.LJIIIZ(c869590Y9l));
                }
                return arrayList;
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final C0ZLF Ip(C869590Y9l c869590Y9l) {
                return C0ZLL.LIZ;
            }
        };
    }
}
