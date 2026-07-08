package com.ss.android.ugc.aweme.prop.draft;

import X.AbstractC322270CkD;
import X.C01GW;
import X.C0PEM;
import X.C13LQ;
import X.C23250099c;
import X.C316080CaE;
import X.C316090CaF;
import X.C322320CkI;
import X.C322380CkO;
import X.C322390CkP;
import X.C322460CkW;
import X.C452501pT;
import X.EnumC322300CkG;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.agilelogger.ALog;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class EffectDraftDetailViewModel extends AssemViewModel<C322320CkI> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 194));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C322320CkI(0);
    }

    public final void wQ2() {
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("EffectDraftDetailViewModel", "loadDraft() start...");
        C316080CaE c316080CaE = (C316080CaE) this.LL.getValue();
        C23250099c.LIZLLL(c316080CaE.LIZ.invoke(), C0PEM.LIZJ, null, new C316090CaF(c316080CaE, new AwS583S0100000_4(this, 102), null), 2);
    }

    public static EnumC322300CkG vQ2(List list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Object obj : list) {
                if ((obj instanceof C322460CkW) && C13LQ.LJLIIL(new AbstractC322270CkD[]{C322390CkP.LIZ, C322380CkO.LIZ}).contains(((C322460CkW) obj).LIZJ)) {
                    return EnumC322300CkG.SELECT_ALL;
                }
            }
        }
        return EnumC322300CkG.DESELECT_ALL;
    }
}
