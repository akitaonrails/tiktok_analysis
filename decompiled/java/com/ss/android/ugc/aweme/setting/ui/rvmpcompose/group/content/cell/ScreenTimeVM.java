package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell;

import X.C1388190mED;
import X.C2017907vN;
import X.C20684815ws;
import X.C2344009Gk;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;

/* JADX INFO: loaded from: classes4.dex */
public final class ScreenTimeVM extends BaseCellSettingsVM<C2017907vN> {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC0148002o defaultState() {
        /*
            r13 = this;
            X.07vN r1 = new X.07vN
            java.lang.Class<com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService> r7 = com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService.class
            r8 = 0
            r11 = 14
            r6 = 0
            r9 = r8
            r10 = r8
            r12 = r6
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r7, r8, r9, r10, r11, r12)
            com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService r0 = (com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService) r0
            if (r0 == 0) goto L33
            boolean r0 = r0.LJII()
            r2 = 1
            if (r0 != r2) goto L33
        L1a:
            X.07uW r3 = new X.07uW
            r3.<init>(r13)
            X.0tWw r4 = X.C1669660tYC.LLJLLIL
            r5 = 2131858470(0x7f119426, float:1.935073E38)
            X.0tWw r7 = X.C1669660tYC.LLJLL
            kotlin.jvm.internal.AwS617S0100000_3 r9 = new kotlin.jvm.internal.AwS617S0100000_3
            r0 = 70
            r9.<init>(r13, r0)
            r8 = r6
            r10 = r6
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
        L33:
            r2 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.ScreenTimeVM.defaultState():X.002o");
    }

    public final void vQ2(Context context, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", "click_button");
        c2344009Gk.LJIIIIZZ("enter_from", str);
        C20684815ws.LJIILLIIL("enter_teen_protection", c2344009Gk.LIZ);
        ComplianceServiceProvider.LJIL().LJJJJJ();
        IFamilyPairingService iFamilyPairingServiceLJIIJJI = ComplianceServiceProvider.LJIIJJI();
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (str == null) {
            str = "snp_enter_wellbeing";
        }
        iFamilyPairingServiceLJIIJJI.LJIJI(activityLIZ, str);
    }
}
