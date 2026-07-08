package com.ss.android.ugc.aweme.ecommerce.base.common;

import X.C01GW;
import X.C04CK;
import X.C0X52;
import X.C1277704zH;
import X.C13LP;
import X.C1AF0;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C452501pT;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomRequestParamVerifierConfig;
import com.ss.android.ugc.aweme.ecommercebase.monitor.PageMonitor;
import com.ss.android.ugc.aweme.offline.ecommerce.debug.IEComOfflineService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS29S1101000_26;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes27.dex */
public final class EcommerceRequestParamsVerifier implements NetworkPartner.Bystander {
    public static final EcomRequestParamVerifierConfig.EcomRequestParamVerifierModel LIZ;
    public static final Map<String, List<EcomRequestParamVerifierConfig.Rule>> LIZIZ;
    public static final C01GW<IEComOfflineService> LIZJ;

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LIZLLL(C0X52<?> c0x52) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJIIJ(Request request) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJIIJJI(Request request, C0X52<?> c0x52, Throwable th) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void onException(Throwable th) {
    }

    static {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcomRequestParamVerifierConfig.EcomRequestParamVerifierModel ecomRequestParamVerifierModel = EcomRequestParamVerifierConfig.LIZ;
        EcomRequestParamVerifierConfig.EcomRequestParamVerifierModel ecomRequestParamVerifierModel2 = (EcomRequestParamVerifierConfig.EcomRequestParamVerifierModel) settingsManagerLIZLLL.LJIIIIZZ("ttec_request_rule_verification_v1", EcomRequestParamVerifierConfig.EcomRequestParamVerifierModel.class, ecomRequestParamVerifierModel);
        if (ecomRequestParamVerifierModel2 != null) {
            ecomRequestParamVerifierModel = ecomRequestParamVerifierModel2;
        }
        LIZ = ecomRequestParamVerifierModel;
        ecomRequestParamVerifierModel.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<EcomRequestParamVerifierConfig.VerificationRule> list = ecomRequestParamVerifierModel.verificationRules;
        if (list != null) {
            for (EcomRequestParamVerifierConfig.VerificationRule verificationRule : list) {
                linkedHashMap.put(verificationRule.path, verificationRule.rules);
            }
        }
        LIZIZ = linkedHashMap;
        LIZJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(77));
    }

    public static String LJIIL(List list) {
        StringBuilder sb = new StringBuilder();
        for (String str : (ArrayList) list) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(' ');
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0129  */
    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.bytedance.retrofit2.client.Request r22) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.common.EcommerceRequestParamsVerifier.LJI(com.bytedance.retrofit2.client.Request):void");
    }

    public static void LJIILJJIL(Request request, String str, int i) {
        C04CK c04ck = new C04CK() { // from class: X.0vbP
            @Override // X.AbstractC1748790vbp
            public final C1748850vbv LIZ() {
                return new C1748850vbv(new C1748840vbu("url", new C1747940vaS[0]), new C1748840vbu("host", new C1747940vaS[0]), new C1748840vbu("path", new C1747940vaS[0]), new C1748840vbu("key", new C1747940vaS[0]), new C1748840vbu("type", new C1747940vaS[0]));
            }
        };
        c04ck.LJIIIIZZ(new AwS29S1101000_26(request, str, i, 0));
        c04ck.LIZJ(false);
    }

    public static void LJIILIIL(List list, Set set, Map map, Map map2) {
        boolean zBooleanValue;
        int iIntValue;
        boolean zBooleanValue2;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                EcomRequestParamVerifierConfig.Rule rule = (EcomRequestParamVerifierConfig.Rule) it2.next();
                if (rule.key != null) {
                    Boolean bool = rule.required;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    Integer num = rule.type;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    Boolean bool2 = rule.empty;
                    if (bool2 != null) {
                        zBooleanValue2 = bool2.booleanValue();
                    } else {
                        zBooleanValue2 = false;
                    }
                    Object objLJJJLL = C13LP.LJJJLL(a0.LJJLIIIJILLIZJL(rule.key, new String[]{e3.d}, 0, 6));
                    if (objLJJJLL != null) {
                        set.add(objLJJJLL);
                    }
                    if (zBooleanValue) {
                        map.put(rule.key, new Pair(Integer.valueOf(iIntValue), Boolean.valueOf(zBooleanValue2)));
                    } else {
                        map2.put(rule.key, new Pair(Integer.valueOf(iIntValue), Boolean.valueOf(zBooleanValue2)));
                    }
                }
            }
        }
    }

    public static void LIZIZ(Request request, List list, List list2, List list3, List list4) {
        List<String> list5;
        String strLJIIL = LJIIL(list);
        String strLJIIL2 = LJIIL(list2);
        String strLJIIL3 = LJIIL(list2);
        String strLJIIL4 = LJIIL(list3);
        C1AF0.LIZLLL("ec_request_rule_verification_error", C2097608Jq.LJI(new Pair("url", request.getUrl()), new Pair("host", request.getHost()), new Pair("path", request.getPath()), new Pair("missParameters", strLJIIL), new Pair("typeParameters", strLJIIL2), new Pair("emptyValueParameters", strLJIIL4), new Pair("redundancyParameters", strLJIIL3)));
        if (!(!((ArrayList) list).isEmpty()) && !(!((ArrayList) list2).isEmpty()) && !(!((ArrayList) list3).isEmpty())) {
            if (!((ArrayList) list4).isEmpty()) {
                IEComOfflineService value = LIZJ.getValue();
                request.getPath();
                value.LJI();
                return;
            }
            return;
        }
        String path = request.getPath();
        if (((ArrayList) C1277704zH.LIZ()).contains(path) && (list5 = EcommerceNetworkMonitor.LIZ.getValue().get(path)) != null) {
            PageMonitor.LIZ.LIZLLL(list5, C2097608Jq.LJIIJ(new Pair("request_miss_parameters", strLJIIL), new Pair("request_type_error", strLJIIL2), new Pair("request_type_value_empty", strLJIIL4)), new LinkedHashMap());
        }
        IEComOfflineService value2 = LIZJ.getValue();
        request.getPath();
        value2.LIZ();
    }

    public static int LJIILL(int i, int i2, boolean z, List list, HashMap map) {
        HashMap map2;
        int i3;
        int i4 = 0;
        if (i >= list.size()) {
            return 0;
        }
        Object obj = ListProtector.get(list, i);
        if (!map.containsKey(obj)) {
            return 1;
        }
        if (i == list.size() - 1) {
            Object obj2 = map.get(obj);
            if (obj2 instanceof Number) {
                i3 = 0;
                i4 = 1;
            } else if (obj2 instanceof String) {
                String str = (String) obj2;
                if (str != null && a0.LJJJIL(str)) {
                    i4 = 1;
                }
                i3 = i4;
                i4 = 2;
            } else if (obj2 instanceof List) {
                List list2 = (List) obj2;
                if (list2 != null && list2.size() == 0) {
                    i4 = 1;
                }
                i3 = i4;
                i4 = 3;
            } else if (obj2 instanceof Map) {
                Map map3 = (Map) obj2;
                if (map3 != null && map3.size() == 0) {
                    i4 = 1;
                }
                i3 = i4;
                i4 = 4;
            } else {
                i3 = 0;
            }
            if (i2 != 0 && i2 != i4) {
                return 2;
            }
            if (z && i3 != 0) {
                return 4;
            }
            return 999;
        }
        Object obj3 = map.get(obj);
        if (!(obj3 instanceof HashMap) || (map2 = (HashMap) obj3) == null) {
            return 1;
        }
        return LJIILL(i + 1, i2, z, list, map2);
    }

    public static void LJ(Request request, boolean z, HashMap map, Map map2, List list, List list2, List list3) {
        for (Map.Entry entry : ((LinkedHashMap) map2).entrySet()) {
            int iLJIILL = LJIILL(0, ((Number) ((Pair) entry.getValue()).getFirst()).intValue(), ((Boolean) ((Pair) entry.getValue()).getSecond()).booleanValue(), a0.LJJLIIIJILLIZJL((CharSequence) entry.getKey(), new String[]{e3.d}, 0, 6), map);
            if (iLJIILL != 1) {
                if (iLJIILL != 2) {
                    if (iLJIILL == 4) {
                        LJIILJJIL(request, (String) entry.getKey(), 4);
                        ((ArrayList) list3).add(entry.getKey());
                    }
                } else {
                    LJIILJJIL(request, (String) entry.getKey(), 2);
                    ((ArrayList) list).add(entry.getKey());
                }
            } else if (z) {
                LJIILJJIL(request, (String) entry.getKey(), 1);
                ((ArrayList) list2).add(entry.getKey());
            }
        }
    }
}
