package com.ss.android.ugc.aweme.compliance.common.serviceimpl;

import X.C08Q1;
import X.C0X1C;
import X.C0X1H;
import X.C11NZ;
import X.C123100dR;
import X.C1668306g5;
import X.C1917030zzB;
import X.C1917060zzE;
import X.C19EG;
import X.C20684815ws;
import X.C632140Oqq;
import X.C849850XVn;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.compliance.api.model.InterfaceControlRule;
import com.ss.android.ugc.aweme.compliance.api.model.InterfaceControlSettings;
import com.ss.android.ugc.aweme.compliance.api.model.RuleConfig;
import com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService;
import com.ss.android.ugc.aweme.compliance.common.enums.ConfigTypeEnum;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.kids.compliance.IKidsSettingsService;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes14.dex */
public final class ComplianceMonitorServiceImpl implements IComplianceMonitorService {
    public volatile InterfaceControlSettings LIZIZ;
    public final Object LIZ = new Object();
    public final List<C0X1H> LIZJ = new ArrayList();

    @Override // com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService
    public final void LIZ() {
        this.LIZIZ = null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService
    public final InterfaceControlSettings LIZIZ() {
        String strLIZJ;
        List<InterfaceControlRule> list;
        Set<String> set;
        if (this.LIZIZ == null) {
            synchronized (this.LIZ) {
                try {
                    if (this.LIZIZ != null) {
                        return this.LIZIZ;
                    }
                    Exception e = null;
                    if (C08Q1.LIZJ()) {
                        IKidsSettingsService iKidsSettingsService = (IKidsSettingsService) PluggableExtentionKt.pluggableSpi$default(IKidsSettingsService.class, false, false, false, 14, null);
                        strLIZJ = iKidsSettingsService != null ? iKidsSettingsService.LIZJ() : null;
                    } else {
                        strLIZJ = ComplianceServiceProvider.LJJI().LIZJ();
                    }
                    this.LIZIZ = new InterfaceControlSettings(null, null, null, null);
                    if (C123100dR.LIZ(strLIZJ)) {
                        try {
                            this.LIZIZ = (InterfaceControlSettings) new Gson().LJII(strLIZJ, InterfaceControlSettings.class);
                            InterfaceControlSettings interfaceControlSettings = this.LIZIZ;
                            if (interfaceControlSettings != null && (list = interfaceControlSettings.rules) != null) {
                                Iterator<InterfaceControlRule> it2 = list.iterator();
                                while (it2.hasNext()) {
                                    List<RuleConfig> list2 = it2.next().ruleThens;
                                    if (list2 != null) {
                                        ArrayList<RuleConfig> arrayList = new ArrayList();
                                        for (RuleConfig ruleConfig : list2) {
                                            RuleConfig ruleConfig2 = ruleConfig;
                                            if (Intrinsics.LJFF(ruleConfig2.type, ConfigTypeEnum.PARAM_REPLACE.getType()) && (set = ruleConfig2.value) != null && !set.isEmpty()) {
                                                arrayList.add(ruleConfig);
                                            }
                                        }
                                        for (RuleConfig ruleConfig3 : arrayList) {
                                            Set<String> set2 = ruleConfig3.value;
                                            if (set2 != null) {
                                                Iterator<T> it3 = set2.iterator();
                                                while (it3.hasNext()) {
                                                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((String) it3.next(), new String[]{":"}, 0, 6);
                                                    ruleConfig3.replaceMap.put((String) listLJJLIIIJILLIZJL.get(0), (String) listLJJLIIIJILLIZJL.get(1));
                                                }
                                            }
                                            Set<String> set3 = ruleConfig3.value;
                                            if (set3 != null) {
                                                set3.clear();
                                            }
                                            Set<String> set4 = ruleConfig3.value;
                                            if (set4 != null) {
                                                set4.addAll(ruleConfig3.replaceMap.keySet());
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    Iterator it4 = ((ArrayList) this.LIZJ).iterator();
                    while (it4.hasNext()) {
                        ((C0X1H) it4.next()).LJ(strLIZJ, this.LIZIZ, e);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService
    public final void LIZJ(C19EG c19eg) {
        AdPersonalitySettings adPersonalitySettingsLJIIL;
        if (!ComplianceServiceProvider.LJIILIIL().LJIILJJIL() && ComplianceServiceProvider.LJIILIIL().LJJJJZI() && ComplianceServiceProvider.LJIILIIL().LJIJI()) {
            ((IPipFeedService) ServiceManager.get().getService(IPipFeedService.class)).LJIJI();
            PopupManager.LJIJI(new C1917030zzB(c19eg, null), true);
        }
        if (!ComplianceServiceProvider.LJIILIIL().LJIILJJIL() && (adPersonalitySettingsLJIIL = ComplianceServiceProvider.LJJI().LJIIL()) != null && Intrinsics.LJFF(adPersonalitySettingsLJIIL.needPopUp, Boolean.TRUE)) {
            ((IPipFeedService) ServiceManager.get().getService(IPipFeedService.class)).LJIJI();
            if (C849850XVn.LIZIZ.LIZJ().LJJ("global_personalized_ad")) {
                PopupManager.LJIJ(new C1917060zzE(c19eg, null), "global_personalized_ad", new C1668306g5("global_personalized_ad_ads_ad_compliance"));
            } else {
                PopupManager.LJIJI(new C1917060zzE(c19eg, null), true);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService
    public final void LIZLLL(C0X1C c0x1c) {
        ((ArrayList) this.LIZJ).add(c0x1c);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService
    public final C11NZ LJ(C11NZ c11nz) {
        return C632140Oqq.LIZLLL(c11nz, "/aweme/v1/mask/cancel/", null);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService
    public final void sendEvent(String str, Map<String, String> map) {
        C20684815ws.LJIILLIIL(str, map);
    }
}
