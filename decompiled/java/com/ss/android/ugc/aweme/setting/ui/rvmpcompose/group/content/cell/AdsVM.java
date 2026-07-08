package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell;

import X.C1999607sQ;
import X.C2013807ui;
import X.C844470XAv;
import X.InterfaceC0148002o;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class AdsVM extends BaseCellSettingsVM<C2013807ui> {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        C1999607sQ c1999607sQ = new C1999607sQ(this);
        IComplianceService iComplianceServiceLJIILIIL = ComplianceServiceProvider.LJIILIIL();
        C844470XAv.LIZ.getClass();
        return new C2013807ui(iComplianceServiceLJIILIIL.LJJIJLIJ(C844470XAv.LIZ()), c1999607sQ, new AwS617S0100000_3(this, 58));
    }
}
