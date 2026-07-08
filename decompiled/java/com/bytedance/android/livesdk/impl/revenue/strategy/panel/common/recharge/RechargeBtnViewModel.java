package com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.recharge;

import X.C1151190g3x;
import X.C1151330g4B;
import X.C1151400g4I;
import X.C1548820qPI;
import X.C1796560wqs;
import X.C1797200wru;
import X.C1871910yoP;
import X.C2097608Jq;
import X.C262100zr;
import X.InterfaceC0148002o;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelInputParams;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.PackageListAbility;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.PanelHostAbility;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.Map;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class RechargeBtnViewModel extends AssemViewModel<C1151330g4B> implements InterfaceC1141530foN {
    public final PanelHostAbility LL;
    public final TouchPointAbility LLILLJJLI;
    public final PackageListAbility LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1151330g4B(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C1548820qPI.LJIIIIZZ("recharge_cashier_cancel", this);
        C1548820qPI.LJIIIIZZ("live_js_event_fe_recharge_finish", this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C1548820qPI.LIZLLL("recharge_cashier_cancel", this);
        C1548820qPI.LIZLLL("live_js_event_fe_recharge_finish", this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.HashMap] */
    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        Map<String, String> logExtra;
        if (Intrinsics.LJFF(c262100zr.LIZ, "recharge_cashier_cancel")) {
            setState(AFwS254S0000000_17.get$arr$(72));
            return;
        }
        if (!Intrinsics.LJFF(c262100zr.LIZ, "live_js_event_fe_recharge_finish") || (interfaceC1107590evd = c262100zr.LIZIZ) == null || !Intrinsics.LJFF(C1871910yoP.LJFF(interfaceC1107590evd, "panel_channel", ""), "tiktok")) {
            return;
        }
        boolean z = true;
        if (C1871910yoP.LIZLLL(interfaceC1107590evd, "is_success", 0) != 1) {
            z = false;
        }
        int iLIZLLL = C1871910yoP.LIZLLL(interfaceC1107590evd, "coin_number", 0);
        String strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "order_id", "");
        int iLIZLLL2 = C1871910yoP.LIZLLL(interfaceC1107590evd, "error_code", 0);
        String strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd, "error_msg", "");
        C1151400g4I c1151400g4I = getState().LLILLJJLI;
        if (c1151400g4I == null) {
            return;
        }
        Map<String, String> mapUB2 = null;
        if (z) {
            C1796560wqs c1796560wqs = new C1796560wqs(iLIZLLL, c1151400g4I.LL, strLJFF, String.valueOf(UserService.getInstance().user().getCurrentUserId()), false, 16);
            int i = c1151400g4I.LLILZ;
            RechargePanelInputParams inputParams = this.LL.getInputParams();
            Map mapLJ = C2097608Jq.LJ();
            TouchPointAbility touchPointAbility = this.LLILLJJLI;
            if (touchPointAbility != null) {
                mapUB2 = touchPointAbility.getLogExtra();
            }
            C1151190g3x.LJIIIZ(i, c1796560wqs, inputParams, mapLJ, mapUB2, c1151400g4I.LLIZLLLIL.LIZIZ());
            setState(AFwS254S0000000_17.get$arr$(73));
            return;
        }
        C1797200wru c1797200wru = new C1797200wru(2, -206, iLIZLLL2, String.valueOf(iLIZLLL2), strLJFF2, "", new Exception(strLJFF2), null, null, 0, 0, null, 3968, null);
        Diamond diamond = c1151400g4I.LLIZLLLIL;
        RechargePanelInputParams inputParams2 = this.LL.getInputParams();
        TouchPointAbility touchPointAbility2 = this.LLILLJJLI;
        if (touchPointAbility2 != null) {
            logExtra = touchPointAbility2.getLogExtra();
        } else {
            logExtra = null;
        }
        PackageListAbility packageListAbility = this.LLILLL;
        if (packageListAbility != null) {
            mapUB2 = packageListAbility.UB2(null);
        }
        C1151190g3x.LJIIIIZZ(diamond, 2, c1797200wru, inputParams2, logExtra, mapUB2);
        setState(AFwS254S0000000_17.get$arr$(74));
    }

    public RechargeBtnViewModel(PanelHostAbility panelHostAbility, TouchPointAbility touchPointAbility, PackageListAbility packageListAbility) {
        this.LL = panelHostAbility;
        this.LLILLJJLI = touchPointAbility;
        this.LLILLL = packageListAbility;
    }
}
