package com.ss.android.ugc.aweme.account.pin;

import X.C01GW;
import X.C08CX;
import X.C0WZX;
import X.C0XO3;
import X.C1192304lV;
import X.C13LP;
import X.C13LQ;
import X.C1668306g5;
import X.C1701330uNH;
import X.C1852070yIP;
import X.C1906580ziK;
import X.C19EG;
import X.C20656615sK;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C452501pT;
import X.InterfaceC19483011Ki;
import Y.AfS200S0100000_31;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.IPINSetupService;
import com.ss.android.ugc.aweme.account.pin.CreateOrManagePINActivity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import java.util.Set;
import kotlin.jvm.internal.AwS397S0200000_31;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class PINSetupService implements IPINSetupService {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1192304lV());

    @Override // com.ss.android.ugc.aweme.IPINSetupService
    public final void LIZJ() {
        String curUserId;
        Set<String> stringSet = ((Keva) this.LIZ.getValue()).getStringSet("should_setup_after_cold_start_uids", C08CX.INSTANCE);
        IAccountUserService iAccountUserService = (IAccountUserService) PluggableExtentionKt.pluggableSpi$default(IAccountUserService.class, false, false, false, 14, null);
        if (iAccountUserService == null || (curUserId = iAccountUserService.getCurUserId()) == null) {
            curUserId = "";
        }
        if (stringSet.contains(curUserId)) {
            C13LP.LLIIIZ(stringSet).remove(curUserId);
            ((Keva) this.LIZ.getValue()).storeStringSet("should_setup_after_cold_start_uids", stringSet);
        }
    }

    @Override // com.ss.android.ugc.aweme.IPINSetupService
    public final void LIZ(C19EG c19eg) {
        String curUserId;
        Set<String> setLLIIIZ = C13LP.LLIIIZ(((Keva) this.LIZ.getValue()).getStringSet("should_setup_after_cold_start_uids", C08CX.INSTANCE));
        IAccountUserService iAccountUserService = (IAccountUserService) PluggableExtentionKt.pluggableSpi$default(IAccountUserService.class, false, false, false, 14, null);
        if (iAccountUserService != null && (curUserId = iAccountUserService.getCurUserId()) != null) {
            setLLIIIZ.add(curUserId);
        }
        ((Keva) this.LIZ.getValue()).storeStringSet("should_setup_after_cold_start_uids", setLLIIIZ);
        PopupManager.LJIJ(new C1852070yIP(c19eg, new AwS397S0200000_31(this, c19eg, 37)), "org_account_pin_full_screen_upsell", new C1668306g5("account_pin_setup_login"));
    }

    @Override // com.ss.android.ugc.aweme.IPINSetupService
    public final void LIZIZ(C19EG c19eg, C0XO3 c0xo3) {
        if (C13LQ.LJIILLIIL("org_account.pin.management", c0xo3.LJIL)) {
            JSONObject jSONObject = c0xo3.LJJII;
            if ((jSONObject == null || !jSONObject.optBoolean("has_org_account_pin")) && !c0xo3.LJIJJLI && ((Keva) this.LIZ.getValue()).getStringSet("should_setup_after_cold_start_uids", C08CX.INSTANCE).contains(String.valueOf(c0xo3.LIZ))) {
                PopupManager.LJIJ(new C1852070yIP(c19eg, new AwS397S0200000_31(this, c19eg, 6)), "org_account_pin_full_screen_upsell", new C1668306g5("account_pin_setup_cold_start"));
            }
        }
    }

    public final void LIZLLL(C19EG c19eg, boolean z, C20656615sK c20656615sK) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("//account/org/pin?step=force_create&enter_from=");
        if (z) {
            str = "login";
        } else {
            str = "cold_start";
        }
        sbLIZ.append(str);
        Intent intentBuildIntent = SmartRouter.buildRoute(c19eg, C2188811AlT.LIZIZ(sbLIZ)).buildIntent();
        Bundle bundle = ActivityOptions.makeCustomAnimation(c19eg, R.anim.fq, R.anim.a6).toBundle();
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19eg, intentBuildIntent, "Context_startActivity_2");
        C1701330uNH.LIZ(intentBuildIntent, c19eg);
        C2204961BRm.LLJJJIL(c19eg, intentBuildIntent, bundle, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibEFfd85DVD7JBikoomIqKgYdD0Yg==", null));
        C1906580ziK.LIZJ().LJII().LJJIL(new InterfaceC19483011Ki() { // from class: X.14ii
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return ((AbstractC1387200mCc) obj).LIZ instanceof CreateOrManagePINActivity;
            }
        }).LJJLJLI(new AfS200S0100000_31(c20656615sK, 6));
    }
}
