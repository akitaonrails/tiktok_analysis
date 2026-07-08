package com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service;

import X.AbstractC1748750vbl;
import X.C1018703yb;
import X.C1748660vbc;
import X.C1748720vbi;
import X.C1748730vbj;
import X.C1AF0;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1743450vTD;
import X.InterfaceC1748810vbr;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.ecommerce.slark.impl.TrackNodeStore;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS605S0100000_26;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpCardBridgeServiceImpl implements IPdpCardBridgeService {
    public static JSONArray LJI(List list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj instanceof Float) {
                jSONArray.put(((Number) obj).floatValue());
            } else if (obj instanceof Long) {
                jSONArray.put(((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                jSONArray.put(((Number) obj).intValue());
            } else if (obj instanceof Double) {
                jSONArray.put(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                jSONArray.put(obj);
            } else if (obj instanceof Boolean) {
                jSONArray.put(((Boolean) obj).booleanValue());
            } else if (obj instanceof Map) {
                try {
                    jSONArray.put(LJII((Map) obj));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else if (obj instanceof List) {
                try {
                    jSONArray.put(LJI((List) obj));
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
        return jSONArray;
    }

    public static JSONObject LJII(Map map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Long) {
                jSONObject.put(str, ((Number) value).longValue());
            } else {
                boolean z = true;
                if (value instanceof Float) {
                    if (Math.abs(((Number) value).floatValue()) > Float.MAX_VALUE) {
                        z = false;
                    }
                    if (z) {
                        jSONObject.put(str, r7.floatValue());
                    }
                } else if (value instanceof Integer) {
                    jSONObject.put(str, ((Number) value).intValue());
                } else if (value instanceof Double) {
                    Number number = (Number) value;
                    if (Math.abs(number.doubleValue()) > Double.MAX_VALUE) {
                        z = false;
                    }
                    if (z) {
                        jSONObject.put(str, number.doubleValue());
                    }
                } else if (value instanceof String) {
                    jSONObject.put(str, value);
                } else if (value instanceof Boolean) {
                    jSONObject.put(str, ((Boolean) value).booleanValue());
                } else if (value instanceof Map) {
                    try {
                        jSONObject.put(str, LJII((Map) value));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } else if (value instanceof List) {
                    try {
                        jSONObject.put(str, LJI((List) value));
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004c  */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.IPdpCardBridgeService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1743460vTE LIZJ(android.view.View r8) {
        /*
            r7 = this;
            r6 = 0
            if (r8 == 0) goto L51
            android.view.ViewParent r0 = r8.getParent()
            if (r0 == 0) goto L51
            android.view.ViewParent r2 = r0.getParent()
        Ld:
            boolean r0 = r2 instanceof android.view.View
            if (r0 == 0) goto L4e
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L4f
            android.view.ViewParent r1 = r2.getParent()
        L19:
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L20
            r6 = r1
            android.view.View r6 = (android.view.View) r6
        L20:
            r5 = 0
            if (r6 == 0) goto L4c
            int r4 = r6.getHeight()
        L27:
            if (r2 == 0) goto L4a
            int r3 = r2.getTop()
        L2d:
            r0 = 1
            if (r6 == 0) goto L48
            boolean r0 = r6.canScrollVertically(r0)
        L34:
            r2 = r0 ^ 1
            X.0vTE r1 = new X.0vTE
            int r4 = r4 - r3
            if (r4 < 0) goto L3c
            r5 = r4
        L3c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            int r0 = X.C679280Qkg.LIZIZ(r0)
            r1.<init>(r2, r0)
            return r1
        L48:
            r0 = 0
            goto L34
        L4a:
            r3 = 0
            goto L2d
        L4c:
            r4 = 0
            goto L27
        L4e:
            r2 = r6
        L4f:
            r1 = r6
            goto L19
        L51:
            r2 = r6
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.PdpCardBridgeServiceImpl.LIZJ(android.view.View):X.0vTE");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.IPdpCardBridgeService
    public final HashMap<String, Object> LIZLLL(InterfaceC1748810vbr interfaceC1748810vbr) {
        LaneParams laneParamsLIZIZ;
        HashMap<String, Object> map = new HashMap<>();
        if (interfaceC1748810vbr != null && (laneParamsLIZIZ = C1748730vbj.LIZIZ(interfaceC1748810vbr, "lib_track_builtin_lane_business")) != null) {
            for (Map.Entry<String, Object> entry : laneParamsLIZIZ.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    map.put(entry.getKey(), value);
                }
            }
        }
        return map;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.IPdpCardBridgeService
    public final void LJFF(InterfaceC1743450vTD interfaceC1743450vTD) {
        if (interfaceC1743450vTD != null) {
            interfaceC1743450vTD.d();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.IPdpCardBridgeService
    public final String LIZ(InterfaceC1743450vTD interfaceC1743450vTD, int i) {
        if (interfaceC1743450vTD != null) {
            return interfaceC1743450vTD.PY(Integer.valueOf(i));
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.IPdpCardBridgeService
    public final void LJ(InterfaceC1748810vbr interfaceC1748810vbr, String str, Map<String, ? extends Object> map) {
        LinkedHashMap linkedHashMap;
        AbstractC1748750vbl abstractC1748750vblLIZ = C1748660vbc.LIZ(str);
        if (map == null) {
            linkedHashMap = null;
        } else {
            linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj : map.keySet()) {
                Object obj2 = map.get(obj);
                if (obj2 instanceof Boolean) {
                    linkedHashMap.put(obj, String.valueOf(((Boolean) obj2).booleanValue()));
                } else if (obj2 instanceof Integer) {
                    linkedHashMap.put(obj, String.valueOf(((Number) obj2).intValue()));
                } else if (obj2 instanceof Number) {
                    Number number = (Number) obj2;
                    if (Math.abs(number.doubleValue()) <= Double.MAX_VALUE) {
                        linkedHashMap.put(obj, String.valueOf(number.doubleValue()));
                    } else {
                        linkedHashMap2.put(obj, obj2);
                    }
                } else if (obj2 instanceof String) {
                    linkedHashMap.put(obj, obj2);
                } else if (obj2 instanceof Map) {
                    linkedHashMap.put(obj, C786410Ut5.J3(LJII((Map) obj2)));
                } else if (obj2 instanceof List) {
                    linkedHashMap.put(obj, LJI((List) obj2).toString());
                } else {
                    linkedHashMap2.put(obj, obj2);
                }
            }
            if (!linkedHashMap2.isEmpty()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ec_send_page_log catch unsupported type of field, eventName: ");
                sbLIZ.append(str);
                sbLIZ.append(", errorParams: ");
                sbLIZ.append(linkedHashMap2);
                C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (abstractC1748750vblLIZ != null && interfaceC1748810vbr != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbr, abstractC1748750vblLIZ, new AwS581S0100000_2((Map) linkedHashMap, (Map<String, String>) 133));
        } else {
            C1018703yb.LIZLLL(str, new AwS581S0100000_2((Map) linkedHashMap, (Map<String, String>) 134));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.IPdpCardBridgeService
    public final void LIZIZ(InterfaceC1748810vbr interfaceC1748810vbr, Context context, String str, Map<String, ? extends Object> map) {
        if (context != null && interfaceC1748810vbr != null) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, str);
            smartRouteBuildRoute.withParam("lib_track_rtn_id", TrackNodeStore.LJFF(interfaceC1748810vbr, new AwS605S0100000_26(map, (Map<String, ? extends Object>) 200)).LL);
            smartRouteBuildRoute.open();
        }
    }
}
