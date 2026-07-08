package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell;

import X.C1669660tYC;
import X.C2024507wR;
import X.C2024607wS;
import X.C2024707wT;
import X.C2025007wW;
import X.InterfaceC0148002o;
import X.InterfaceC2024807wU;
import X.InterfaceC2027807wy;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class OrdersVM extends BaseCellSettingsVM<C2025007wW> {
    public final InterfaceC2024807wU LL = ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).orderCenterService().LJ();
    public final C2024707wT LLILLJJLI = new InterfaceC2027807wy() { // from class: X.07wT
        @Override // X.InterfaceC2027807wy
        public final void LIZ(String str, String str2, String str3, String str4, boolean z) {
            C844470XAv.LIZ.getClass();
            this.LIZ.setState(new C2024907wV(C844470XAv.LIZ(), str, str3, str4, str2));
        }
    };

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2025007wW(null, null, null, new C2024507wR(this), C1669660tYC.h, 2131832903, C1669660tYC.g, null, new AwS617S0100000_3(this, 44), null);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (C2024607wS.LIZ[event.ordinal()] == 1) {
            this.LL.LIZJ(this.LLILLJJLI);
        }
    }
}
