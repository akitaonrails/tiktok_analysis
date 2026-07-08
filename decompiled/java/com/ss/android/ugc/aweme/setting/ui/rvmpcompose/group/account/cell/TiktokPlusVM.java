package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell;

import X.C1999907sT;
import X.C2013407ue;
import X.C20684815ws;
import X.C2344009Gk;
import X.C844470XAv;
import X.InterfaceC0148002o;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class TiktokPlusVM extends BaseCellSettingsVM<C2013407ue> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        IComplianceService iComplianceServiceLJIILIIL = ComplianceServiceProvider.LJIILIIL();
        C844470XAv.LIZ.getClass();
        return new C2013407ue(iComplianceServiceLJIILIIL.LJJIIZI(C844470XAv.LIZ()), ComplianceServiceProvider.LJIILIIL().LJJIIZI(C844470XAv.LIZ()), new C1999907sT(this), new AwS617S0100000_3(this, 41));
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(0, "entry_type");
            C20684815ws.LJIILLIIL("ttplus_entry_show", c2344009Gk.LIZ);
        }
    }
}
