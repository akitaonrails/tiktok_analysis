package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell;

import X.C2025207wY;
import X.C2454609jc;
import X.InterfaceC0148002o;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletVM extends BaseCellSettingsVM<C2025207wY> {
    public static final /* synthetic */ int LL = 0;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2025207wY(2131858402, new C2454609jc(this), new AwS617S0100000_3(this, 42));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vQ2(android.content.Context r8, java.lang.String r9) {
        /*
            r7 = this;
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r6 = "settings_page"
            if (r9 != 0) goto L99
            r0 = r6
        La:
            java.lang.String r5 = "enter_from"
            r2.put(r5, r0)
            java.lang.String r1 = "scene_id"
            java.lang.String r0 = "1003"
            r2.put(r1, r0)
            java.lang.String r0 = "enter_wallet_page"
            X.C20684815ws.LJIILLIIL(r0, r2)
            com.ss.android.ugc.aweme.common.MobClick r1 = new com.ss.android.ugc.aweme.common.MobClick
            r1.<init>()
            java.lang.String r0 = "wallet"
            r1.setEventName(r0)
            java.lang.String r0 = "setting"
            r1.setLabelName(r0)
            X.C20684815ws.onEvent(r1)
            X.09Gk r1 = new X.09Gk
            r1.<init>()
            if (r9 != 0) goto L97
            r0 = r6
        L35:
            r1.LJIIIIZZ(r5, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.LIZ
            java.lang.String r0 = "wallet_click"
            X.C20684815ws.LJIILLIIL(r0, r1)
            X.09Gk r4 = new X.09Gk
            r4.<init>()
            java.lang.String r1 = "entrance"
            java.lang.String r0 = "settings_privacy"
            r4.LJIIIIZZ(r1, r0)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.live.ILiveOuterService> r0 = com.ss.android.ugc.aweme.live.ILiveOuterService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.live.ILiveOuterService r0 = (com.ss.android.ugc.aweme.live.ILiveOuterService) r0
            X.15v3 r0 = r0.k4()
            X.0ijV r0 = r0.LJJL()
            r3 = 0
            if (r0 == 0) goto L95
            boolean r1 = r0.LJIILJJIL()
            r0 = 1
            if (r1 != r0) goto L95
        L69:
            java.lang.String r2 = "0"
            if (r0 == 0) goto L93
            java.lang.String r1 = "1"
        L6f:
            java.lang.String r0 = "has_income_before"
            r4.LJIIIIZZ(r0, r1)
            java.lang.String r1 = "display_balance"
            r0 = 0
            r4.LJIIIIZZ(r1, r0)
            if (r9 == 0) goto L7d
            r6 = r9
        L7d:
            r4.LJIIIIZZ(r5, r6)
            java.lang.String r0 = "show_red_point"
            r4.LJIIIIZZ(r0, r2)
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.LIZ
            java.lang.String r0 = "livesdk_wallet_entrance_click"
            X.C20684815ws.LJIILLIIL(r0, r1)
            android.app.Activity r1 = X.C1388190mED.LIZ(r8)
            if (r1 != 0) goto L9c
            return
        L93:
            r1 = r2
            goto L6f
        L95:
            r0 = 0
            goto L69
        L97:
            r0 = r9
            goto L35
        L99:
            r0 = r9
            goto La
        L9c:
            java.lang.String r0 = "profile_center_search"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r9, r0)
            X.C1253840ijW.LIZIZ(r1, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.WalletVM.vQ2(android.content.Context, java.lang.String):void");
    }
}
