package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C1915040zvy;
import X.C1915720zx4;
import X.C294520BgY;
import X.EnumC1876780ywG;
import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostGatekeeper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.consent.collector.api.CollectConsentParam;
import com.ss.android.ugc.aweme.pns.consent.collector.api.IPNSConsentCollectorService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class LiveHostGatekeeper implements IHostGatekeeper {
    @Override // com.bytedance.android.livesdkapi.host.IHostGatekeeper
    public final boolean F20() {
        DecisionMakerNetworkApi.EligibilityModel eligibilityModelLIZ;
        IGatekeeperService iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
        if (iGatekeeperService == null || (eligibilityModelLIZ = iGatekeeperService.LIZ("tiktok_live_comments")) == null) {
            return true;
        }
        return eligibilityModelLIZ.isEligible();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostGatekeeper
    public final boolean XA0() {
        DecisionMakerNetworkApi.EligibilityModel eligibilityModelLIZ;
        String str;
        IGatekeeperService iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
        if (iGatekeeperService != null && (eligibilityModelLIZ = iGatekeeperService.LIZ("tiktok_live_comments")) != null) {
            try {
                if (!eligibilityModelLIZ.isEligible()) {
                    for (DecisionMakerNetworkApi.PPFActionModel pPFActionModel : eligibilityModelLIZ.actionList) {
                        if (Intrinsics.LJFF(pPFActionModel.actionId, "ConsentCollectProcessor")) {
                            IPNSConsentCollectorService iPNSConsentCollectorService = (IPNSConsentCollectorService) PluggableExtentionKt.pluggableSpi$default(IPNSConsentCollectorService.class, false, false, false, 14, null);
                            String str2 = "";
                            if (iPNSConsentCollectorService != null) {
                                String str3 = pPFActionModel.actionParams;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                CollectConsentParam collectConsentParamLJ = iPNSConsentCollectorService.LJ(str3);
                                if (collectConsentParamLJ != null && (str = collectConsentParamLJ.consentKey) != null) {
                                    str2 = str;
                                }
                            }
                            C1915720zx4.LIZ.getClass();
                            return C1915720zx4.LIZ(str2, null) != EnumC1876780ywG.APPROVE;
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostGatekeeper
    public final void R31(Context context) {
        DecisionMakerNetworkApi.EligibilityModel eligibilityModelLIZ;
        CollectConsentParam collectConsentParamLJ;
        String strOptString;
        IPNSConsentCollectorService iPNSConsentCollectorService;
        String str;
        if (C294520BgY.LIZ()) {
            IPNSConsentCollectorService iPNSConsentCollectorService2 = (IPNSConsentCollectorService) PluggableExtentionKt.pluggableSpi$default(IPNSConsentCollectorService.class, false, false, false, 14, null);
            if (iPNSConsentCollectorService2 != null) {
                iPNSConsentCollectorService2.LIZIZ(context, new C1915040zvy("tiktok_live_comments", null, null, 6), null);
                return;
            }
            return;
        }
        IGatekeeperService iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
        if (iGatekeeperService == null || (eligibilityModelLIZ = iGatekeeperService.LIZ("tiktok_live_comments")) == null) {
            return;
        }
        try {
            if (eligibilityModelLIZ.isEligible()) {
                return;
            }
            for (DecisionMakerNetworkApi.PPFActionModel pPFActionModel : eligibilityModelLIZ.actionList) {
                if (Intrinsics.LJFF(pPFActionModel.actionId, "ConsentCollectProcessor")) {
                    IPNSConsentCollectorService iPNSConsentCollectorService3 = (IPNSConsentCollectorService) PluggableExtentionKt.pluggableSpi$default(IPNSConsentCollectorService.class, false, false, false, 14, null);
                    String str2 = "";
                    if (iPNSConsentCollectorService3 != null) {
                        String str3 = pPFActionModel.actionParams;
                        if (str3 == null) {
                            str3 = "";
                        }
                        collectConsentParamLJ = iPNSConsentCollectorService3.LJ(str3);
                    } else {
                        collectConsentParamLJ = null;
                    }
                    try {
                        String str4 = pPFActionModel.actionParams;
                        if (str4 == null) {
                            str4 = "";
                        }
                        strOptString = new JSONObject(str4).optString("popup_id", "");
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        strOptString = "";
                    }
                    if (collectConsentParamLJ != null && (str = collectConsentParamLJ.consentKey) != null) {
                        str2 = str;
                    }
                    C1915720zx4.LIZ.getClass();
                    if (C1915720zx4.LIZ(str2, null) != EnumC1876780ywG.APPROVE && collectConsentParamLJ != null && (iPNSConsentCollectorService = (IPNSConsentCollectorService) PluggableExtentionKt.pluggableSpi$default(IPNSConsentCollectorService.class, false, false, false, 14, null)) != null) {
                        iPNSConsentCollectorService.LIZJ(context, collectConsentParamLJ, strOptString, null);
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
