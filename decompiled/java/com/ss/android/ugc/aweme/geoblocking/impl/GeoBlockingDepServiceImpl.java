package com.ss.android.ugc.aweme.geoblocking.impl;

import X.C098200Yq;
import X.C09JN;
import X.C0C64;
import X.C0X2A;
import X.C0XIR;
import X.C11S5;
import X.C1319780kRs;
import X.C1494460ozc;
import X.C1494570ozn;
import X.C1494600ozq;
import X.C1494650ozv;
import X.C1494690ozz;
import X.C1494850p0F;
import X.C1494890p0J;
import X.C1518800pcs;
import X.C1518820pcu;
import X.C1518830pcv;
import X.C1518950pd7;
import X.C1519010pdD;
import X.C15438062q;
import X.C189200o6;
import X.C1906580ziK;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2222691Bz1;
import X.C23112093u;
import X.C786410Ut5;
import X.InterfaceC1518910pd3;
import X.InterfaceC1519200pdW;
import X.InterfaceC1914220zue;
import Y.AfS192S0100000_23;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService;
import com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingDepService;
import com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService;
import com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS156S0400000_28;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class GeoBlockingDepServiceImpl implements IGeoBlockingDepService {
    @Override // com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingDepService
    public final void LIZ() {
    }

    @Override // com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingDepService
    public final boolean LIZLLL() {
        Object c098200Yq;
        IKidsAccountService iKidsAccountService = (IKidsAccountService) PluggableExtentionKt.pluggableSpi$default(IKidsAccountService.class, false, false, false, 14, null);
        if (iKidsAccountService == null || !iKidsAccountService.LIZIZ()) {
            return true;
        }
        new Object() { // from class: X.0pcz
        }.getClass();
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "enable_kids_mode_geoblock", true, true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingDepService
    public final void LJII() {
        C1518950pd7 c1518950pd7 = C1518950pd7.LIZ;
        C1518950pd7.LIZ(new C1518800pcs());
    }

    @Override // com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingDepService
    public final Map<String, String> LJIIJ() {
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        boolean z = iUserService != null && iUserService.isLogin();
        String str = C0X2A.LIZJ;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("current_region", C2222691Bz1.LIZ().toUpperCase(Locale.ROOT));
        pairArr[1] = new Pair("device_stored_region", z ? "" : str);
        if (!z) {
            str = "";
        }
        pairArr[2] = new Pair("user_stored_region", str);
        pairArr[3] = new Pair("sim_region", C2222691Bz1.LJ());
        pairArr[4] = new Pair("mcc", C1319780kRs.LIZIZ());
        pairArr[5] = new Pair("system_region", C2222691Bz1.LJFF());
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    @Override // com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingDepService
    public final boolean isLogin() {
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        return iUserService != null && iUserService.isLogin();
    }

    @Override // com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingDepService
    public final int LIZIZ(Exception exc) {
        C1494690ozz c1494690ozz;
        if ((exc instanceof C1494690ozz) && (c1494690ozz = (C1494690ozz) exc) != null) {
            return c1494690ozz.getCronetInternalErrorCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingDepService
    public final void LIZJ(final C1518830pcv c1518830pcv) {
        InterfaceC1914220zue interfaceC1914220zue;
        InterfaceC1519200pdW interfaceC1519200pdW = new InterfaceC1519200pdW() { // from class: X.0pd2
            @Override // X.InterfaceC1519200pdW
            public final void LIZ() {
                IGeoBlockingService iGeoBlockingService = (IGeoBlockingService) PluggableExtentionKt.pluggableSpi$default(IGeoBlockingService.class, false, false, false, 14, null);
                if (iGeoBlockingService != null) {
                    iGeoBlockingService.LJIIJ(String.valueOf(c1518830pcv.LIZIZ));
                }
            }

            @Override // X.InterfaceC1519200pdW
            public final void LIZIZ(Map map, AwS156S0400000_28 awS156S0400000_28) {
                IGeoBlockingService iGeoBlockingService = (IGeoBlockingService) PluggableExtentionKt.pluggableSpi$default(IGeoBlockingService.class, false, false, false, 14, null);
                String str = (String) ((LinkedHashMap) map).get("business");
                if (str == null) {
                    str = "";
                }
                if (iGeoBlockingService != null) {
                    if (iGeoBlockingService.LJIIIZ(str)) {
                        iGeoBlockingService.LJI(1, String.valueOf(c1518830pcv.LIZIZ), str, "geo_block_ready_to_display");
                        ComplianceServiceProvider.LJI().LJIIJJI();
                        return;
                    }
                    iGeoBlockingService.LJI(0, String.valueOf(c1518830pcv.LIZIZ), str, "success");
                }
                IPipFeedService iPipFeedService = (IPipFeedService) PluggableExtentionKt.pluggableSpi$default(IPipFeedService.class, false, false, false, 14, null);
                if (iPipFeedService != null) {
                    iPipFeedService.LJIJI();
                }
                awS156S0400000_28.invoke();
            }
        };
        IKidsAccountService iKidsAccountService = (IKidsAccountService) PluggableExtentionKt.pluggableSpi$default(IKidsAccountService.class, false, false, false, 14, null);
        if (iKidsAccountService != null && iKidsAccountService.LIZIZ()) {
            interfaceC1914220zue = new InterfaceC1914220zue() { // from class: X.0pd0
                @Override // X.InterfaceC1914220zue
                public final void LIZ(C1519370pdn c1519370pdn) {
                }

                @Override // X.InterfaceC1914220zue
                public final void LIZIZ(String str, C1519370pdn c1519370pdn) {
                }

                @Override // X.InterfaceC1914220zue
                public final void LIZJ(Boolean bool, String str) {
                }

                @Override // X.InterfaceC1914220zue
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC1914220zue
                public final void LJ(UniversalPopupAction universalPopupAction, C1519370pdn c1519370pdn) {
                }

                @Override // X.InterfaceC1914220zue
                public final void LJFF(C1519370pdn c1519370pdn) {
                    IGeoBlockingService iGeoBlockingService = (IGeoBlockingService) PluggableExtentionKt.pluggableSpi$default(IGeoBlockingService.class, false, false, false, 14, null);
                    if (iGeoBlockingService != null) {
                        iGeoBlockingService.LJIIL(String.valueOf(c1518830pcv.LIZIZ), c1519370pdn.LIZ);
                    }
                }
            };
        } else {
            interfaceC1914220zue = null;
        }
        C1518820pcu.LIZ(c1518830pcv, interfaceC1519200pdW, interfaceC1914220zue);
    }

    @Override // com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingDepService
    public final void LJFF(C1519010pdD c1519010pdD) {
        C1906580ziK.LIZJ().LIZJ().LJJJLZIJ(C11S5.LIZ()).LJJLL(new AfS192S0100000_23(c1519010pdD, 1), new C09JN() { // from class: X.00O8
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("GeoBlockingDepServiceImpl@377d.registerAppBackgroundSwitchListener$1");
                C1C7U.LIZIZ("GeoBlockingDepServiceImpl@377d.registerAppBackgroundSwitchListener$1");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingDepService
    public final int LJI(Exception exc) {
        C1494690ozz c1494690ozz;
        C1494890p0J cronetRequestExtraInfo;
        if ((exc instanceof C1494690ozz) && (c1494690ozz = (C1494690ozz) exc) != null && (cronetRequestExtraInfo = c1494690ozz.getCronetRequestExtraInfo()) != null) {
            return cronetRequestExtraInfo.LIZ;
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingDepService
    public final void LJIIIIZZ(C1518830pcv c1518830pcv) {
        C1518820pcu.LIZ(c1518830pcv, null, new InterfaceC1914220zue() { // from class: X.0pd1
            @Override // X.InterfaceC1914220zue
            public final void LIZ(C1519370pdn c1519370pdn) {
            }

            @Override // X.InterfaceC1914220zue
            public final void LIZIZ(String str, C1519370pdn c1519370pdn) {
            }

            @Override // X.InterfaceC1914220zue
            public final void LIZJ(Boolean bool, String str) {
            }

            @Override // X.InterfaceC1914220zue
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC1914220zue
            public final void LJ(UniversalPopupAction universalPopupAction, C1519370pdn c1519370pdn) {
            }

            @Override // X.InterfaceC1914220zue
            public final void LJFF(C1519370pdn c1519370pdn) {
                IPolicyNoticeService iPolicyNoticeService = (IPolicyNoticeService) PluggableExtentionKt.pluggableSpi$default(IPolicyNoticeService.class, false, false, false, 14, null);
                if (iPolicyNoticeService != null) {
                    iPolicyNoticeService.LIZIZ();
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingDepService
    public final String LJIIIZ(Exception exc) {
        C1494460ozc c1494460ozc;
        Object obj;
        C1494600ozq c1494600ozq;
        C1494570ozn c1494570ozn;
        C1494650ozv c1494650ozv;
        String str;
        Object c098200Yq;
        String string;
        if (exc instanceof C1494690ozz) {
            c1494460ozc = (C1494460ozc) exc;
        } else {
            c1494460ozc = null;
        }
        if (c1494460ozc != null) {
            obj = c1494460ozc.infoObj;
        } else {
            obj = null;
        }
        if (obj instanceof C1494850p0F) {
            c1494600ozq = (C1494600ozq) obj;
        } else {
            c1494600ozq = null;
        }
        Object obj2 = "";
        if (c1494600ozq == null || (c1494570ozn = c1494600ozq.LIZLLL) == null || (c1494650ozv = c1494570ozn.LJLJI) == null || (str = c1494650ozv.LJFF) == null) {
            return "";
        }
        try {
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(JSONObjectProtectorUtils.getJSONObject(new JSONObject(str), "url_dispatch"), "action_info");
            StringBuilder sb = new StringBuilder(",");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    string = Integer.valueOf(jSONObjectOptJSONObject.optInt("rule_id")).toString();
                } else {
                    string = null;
                }
                sb.append(string);
                sb.append(',');
            }
            c098200Yq = sb.toString();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        return (String) obj2;
    }

    @Override // com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingDepService
    public final void LJ(Bundle bundle, Exception exc) {
        C23112093u c23112093u;
        if ((exc instanceof C0XIR) && (c23112093u = (C23112093u) exc) != null && c23112093u.getErrorCode() == 56009) {
            TTKUserCommunicationService tTKUserCommunicationService = (TTKUserCommunicationService) PluggableExtentionKt.pluggableSpi$default(TTKUserCommunicationService.class, false, false, false, 14, null);
            IGeoBlockingService iGeoBlockingService = (IGeoBlockingService) PluggableExtentionKt.pluggableSpi$default(IGeoBlockingService.class, false, false, false, 14, null);
            synchronized (this) {
                if (iGeoBlockingService != null) {
                    try {
                        if (!iGeoBlockingService.LJII(bundle)) {
                            iGeoBlockingService.LJ();
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                Set<String> setKeySet = bundle.keySet();
                if (setKeySet != null) {
                    int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(setKeySet, 10));
                    if (iLIZIZ < 16) {
                        iLIZIZ = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                    for (String str : setKeySet) {
                        String string = bundle.getString(str);
                        if (string == null) {
                            string = "";
                        }
                        Pair pair = new Pair(str, string);
                        linkedHashMap.put(pair.getFirst(), pair.getSecond());
                    }
                    final HashMap mapLJI = C2097608Jq.LJI(new Pair("extra", C786410Ut5.J3(new JSONObject(linkedHashMap))));
                    if (tTKUserCommunicationService != null) {
                        tTKUserCommunicationService.LJIIJJI(56009, new InterfaceC1518910pd3() { // from class: X.0pcw
                            @Override // X.InterfaceC1518910pd3
                            public final InterfaceC1519250pdb LIZ() {
                                return null;
                            }

                            @Override // X.InterfaceC1518910pd3
                            public final InterfaceC1594906Mh LIZJ() {
                                return null;
                            }

                            @Override // X.InterfaceC1518910pd3
                            public final /* bridge */ /* synthetic */ Map LIZIZ() {
                                return mapLJI;
                            }
                        }, null);
                    }
                }
            }
        }
    }
}
