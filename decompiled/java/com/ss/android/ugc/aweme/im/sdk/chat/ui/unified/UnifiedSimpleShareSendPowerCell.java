package com.ss.android.ugc.aweme.im.sdk.chat.ui.unified;

import X.C0ZL0;
import X.C0ZQH;
import X.C13LE;
import X.C1562980qm8;
import X.C1622006Ws;
import X.C19719912Dl;
import X.C869590Y9l;
import X.C900450ZUd;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemSend;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public final class UnifiedSimpleShareSendPowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemSend, C900450ZUd> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(UnifiedSimpleShareUISlot.class);
        return new IMSkeletonLayoutReusedUISlotAssemSend(c19719912DlLIZ) { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.unified.UnifiedSimpleShareSendPowerCell$createAssemAttached2Cell$1
            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final void Tp() {
                Function0<Unit> function0;
                C1622006Ws<Function0<Unit>> c1622006Ws = ((C900450ZUd) bo()).LL.LJIIJ;
                if (c1622006Ws == null || (function0 = c1622006Ws.LIZ) == null) {
                    return;
                }
                function0.invoke();
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final List<C1562980qm8<C0ZL0>> Gp(C869590Y9l c869590Y9l) {
                return C0ZQH.LIZ(c869590Y9l, ((C900450ZUd) bo()).LL, Up());
            }
        };
    }
}
