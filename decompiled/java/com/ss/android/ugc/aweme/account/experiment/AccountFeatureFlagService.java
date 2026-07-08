package com.ss.android.ugc.aweme.account.experiment;

import X.AbstractC310860CGm;
import X.C01GW;
import X.C0BTL;
import X.C0BTM;
import X.C0C64;
import X.C0XMV;
import X.C2188811AlT;
import X.C255730A0l;
import X.C290170BYx;
import X.C290430BZx;
import X.C293980Bfg;
import X.C293990Bfh;
import X.C294010Bfj;
import X.C306400Bzi;
import X.C310920CGs;
import X.C786410Ut5;
import X.C847400XMc;
import X.C847410XMd;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountFeatureFlagService;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import defpackage.n0;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class AccountFeatureFlagService implements IAccountFeatureFlagService {
    @Override // com.ss.android.ugc.aweme.IAccountFeatureFlagService
    public final void LIZ() {
        boolean z = n0.LIZ;
        C306400Bzi.LIZ();
        C255730A0l.LIZ();
        C0C64.LJIILLIIL().LJIIIZ(31744, "enable_org_account_bottom_banner", true, true);
        AccountGSMAExperiment.LIZ.getClass();
        AccountGSMAExperiment.LIZ();
        C01GW c01gw = C0BTL.LIZ;
        if (((Number) c01gw.getValue()).intValue() != 1) {
            ((Number) c01gw.getValue()).intValue();
        }
        C290430BZx.LIZ();
        C293980Bfg.LIZ();
        C293990Bfh.LIZ();
        try {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("clear_account_disable_switch_account_android", false)) {
                C0BTM.LIZ().erase("disable_switch_account");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountFeatureFlagService
    public final Map<String, String> LIZJ() {
        C290170BYx.LIZ.getClass();
        return (Map) C290170BYx.LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.IAccountFeatureFlagService
    public final boolean LIZIZ() {
        return C294010Bfj.LIZIZ() != 0;
    }

    @Override // com.ss.android.ugc.aweme.IAccountFeatureFlagService
    public final void LIZLLL() throws JSONException {
        SettingsManager.LIZLLL().getClass();
        boolean zLIZ = SettingsManager.LIZ("ticket_guard_ntp_enabled_android", true);
        Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeBoolean("ticket_guard_ntp_enabled", zLIZ);
        if (C847400XMc.LIZ) {
            C0XMV.LLJJJIL.LLJ.LIZLLL = zLIZ;
        }
        boolean zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "ticket_guard_enable_init_order_fix", true, false);
        Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeBoolean("ticket_guard_enable_init_order_fix", zLJIIIZ);
        C847410XMd.LJI = zLJIIIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applyEnableInitOrderFix=");
        sbLIZ.append(zLJIIIZ);
        C847400XMc.LJIIIZ("TokenGuardSettingManage", C2188811AlT.LIZIZ(sbLIZ));
        JSONObject jSONObject = new JSONObject();
        for (AbstractC310860CGm abstractC310860CGm : (List) C310920CGs.LIZ.getValue()) {
            String strLIZ = abstractC310860CGm.LIZ();
            JSONObject jSONObjectLIZJ = abstractC310860CGm.LIZJ();
            ((Keva) abstractC310860CGm.LIZ.getValue()).storeString(abstractC310860CGm.LIZ(), C786410Ut5.J3(jSONObjectLIZJ));
            jSONObject.put(strLIZ, jSONObjectLIZJ);
        }
        C310920CGs.LIZ(jSONObject);
    }
}
