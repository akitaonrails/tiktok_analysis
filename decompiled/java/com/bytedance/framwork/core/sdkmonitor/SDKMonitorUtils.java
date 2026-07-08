package com.bytedance.framwork.core.sdkmonitor;

import X.C0VBD;
import X.C0VC5;
import X.C0VC6;
import X.C0VC8;
import X.C0VCC;
import X.C0VCZ;
import X.C2188811AlT;
import X.C793590VBd;
import X.C793870VCf;
import X.C793910VCj;
import X.C793950VCn;
import X.C804420Vh2;
import X.InterfaceC794040VCw;
import X.InterfaceC794070VCz;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class SDKMonitorUtils {
    public static ConcurrentHashMap<String, C0VCC> sAidToMonitorCommon = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<String, List<String>> sAidToDefaultReportUrl = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<String, List<String>> sAidToConfigUrl = new ConcurrentHashMap<>();

    public static String getSdkVersion() {
        return "2.0.42-rc.41";
    }

    public static List<String> convertReportUrl(List<String> list) {
        LinkedList linkedList = new LinkedList();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                URL url = new URL(it2.next());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("https://");
                sbLIZ.append(url.getHost());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append("/monitor/collect/");
                linkedList.add(C2188811AlT.LIZIZ(sbLIZ2));
            } catch (MalformedURLException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return linkedList;
    }

    public static C0VCC getInstance(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (sAidToMonitorCommon.get(str) == null) {
                synchronized (SDKMonitorUtils.class) {
                    try {
                        if (sAidToMonitorCommon.get(str) == null) {
                            sAidToMonitorCommon.put(str, new C0VCC(str));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            return sAidToMonitorCommon.get(str);
        }
        throw new IllegalArgumentException("param 'aid' is not allowed to assigned empty string");
    }

    public static void monitorInternalEventToAllAid(JSONObject jSONObject) {
        String sessionId;
        if (jSONObject != null && !sAidToMonitorCommon.isEmpty()) {
            for (C0VCC c0vcc : sAidToMonitorCommon.values()) {
                c0vcc.getClass();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("log_type", "sdk_data_clear");
                    jSONObject2.put("network_type", C804420Vh2.LJ(c0vcc.LIZ).getValue());
                    jSONObject2.put("metric", jSONObject);
                    jSONObject2.put("timestamp", System.currentTimeMillis());
                    C0VCZ c0vcz = c0vcc.LJIILL;
                    if (c0vcz != null) {
                        sessionId = c0vcz.getSessionId();
                    } else {
                        sessionId = null;
                    }
                    jSONObject2.put("session_id", sessionId);
                    c0vcc.LIZ(jSONObject2);
                    C793910VCj.LIZ.LIZIZ(jSONObject2, CastLongProtector.parseLong(c0vcc.LJIL));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }

    public static void setEventJsonInterceptor(C0VBD c0vbd) {
        C0VC6.LIZLLL = c0vbd;
    }

    public static void setHeaderInterceptor(InterfaceC794070VCz interfaceC794070VCz) {
        C0VC5.LJI = interfaceC794070VCz;
    }

    public static void setHostAid(String str) {
        C0VCC.LJJIIJZLJL = str;
    }

    public static void setHttpService(IHttpService iHttpService) {
        C0VCC.LJJIIJ = iHttpService;
    }

    public static synchronized void setConfigUrl(String str, List<String> list) {
        if (!TextUtils.isEmpty(str) && !C793950VCn.LIZ(list)) {
            try {
                String host = new URL(list.get(0)).getHost();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("https://");
                sbLIZ.append(host);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (!TextUtils.isEmpty(strLIZIZ)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append("/monitor/collect/c/exception");
                    C0VC8.LIZJ = C2188811AlT.LIZIZ(sbLIZ2);
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("https://");
                sbLIZ3.append(host);
                sbLIZ3.append("/monitor/collect/quota_status");
                C793590VBd.LJII = C2188811AlT.LIZIZ(sbLIZ3);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            LinkedList linkedList = new LinkedList();
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    URL url = new URL(it2.next());
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("https://");
                    sbLIZ4.append(url.getHost());
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(strLIZIZ2);
                    sbLIZ5.append("/monitor/appmonitor/v5/batch_settings");
                    linkedList.add(C2188811AlT.LIZIZ(sbLIZ5));
                } catch (MalformedURLException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
            sAidToConfigUrl.put(str, linkedList);
        }
    }

    public static synchronized void setDeafultReportUrl(String str, List<String> list) {
        if (!TextUtils.isEmpty(str) && !C793950VCn.LIZ(list)) {
            sAidToDefaultReportUrl.put(str, convertReportUrl(list));
        }
    }

    public static synchronized void setDefaultReportUrl(String str, List<String> list) {
        if (!TextUtils.isEmpty(str) && !C793950VCn.LIZ(list)) {
            sAidToDefaultReportUrl.put(str, convertReportUrl(list));
            try {
                String host = new URL(list.get(0)).getHost();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("https://");
                sbLIZ.append(host);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (!TextUtils.isEmpty(strLIZIZ)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append("/monitor/collect/c/exception");
                    C0VC8.LIZJ = C2188811AlT.LIZIZ(sbLIZ2);
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("https://");
                sbLIZ3.append(host);
                sbLIZ3.append("/monitor/collect/quota_status");
                C793590VBd.LJII = C2188811AlT.LIZIZ(sbLIZ3);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static synchronized void init(Context context, String str, JSONObject jSONObject, InterfaceC794040VCw interfaceC794040VCw) {
        if (context == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            if (jSONObject != null) {
                if (sAidToMonitorCommon.get(str) != null && sAidToMonitorCommon.get(str).LJIJI) {
                    return;
                }
                C0VCC c0vcc = sAidToMonitorCommon.get(str);
                if (c0vcc == null) {
                    c0vcc = new C0VCC(str);
                    sAidToMonitorCommon.put(str, c0vcc);
                }
                List<String> listRemove = sAidToConfigUrl.remove(str);
                if (listRemove != null && !C793950VCn.LIZ(listRemove)) {
                    ((LinkedList) c0vcc.LJIIZILJ).clear();
                    ((LinkedList) c0vcc.LJIIZILJ).addAll(listRemove);
                }
                List<String> listRemove2 = sAidToDefaultReportUrl.remove(str);
                if (listRemove2 != null && !C793950VCn.LIZ(listRemove2)) {
                    C793870VCf.LIZ.LIZIZ(listRemove2);
                }
                if (interfaceC794040VCw == null) {
                    c0vcc.LJI(context, jSONObject, new C0VCZ() { // from class: X.07Rl
                        @Override // X.C0VCZ
                        public final Map<String, String> getCommonParams() {
                            return null;
                        }

                        @Override // X.C0VCZ
                        public final String getSessionId() {
                            return null;
                        }
                    });
                } else {
                    c0vcc.LJI(context, jSONObject, new C0VCZ() { // from class: X.07Rm
                        @Override // X.C0VCZ
                        public final Map<String, String> getCommonParams() {
                            return null;
                        }

                        @Override // X.C0VCZ
                        public final String getSessionId() {
                            throw null;
                        }
                    });
                }
                return;
            }
            throw new IllegalArgumentException("param 'headerInfo' is not allowed to be null");
        }
        throw new IllegalArgumentException("param 'aid' is not allowed to assigned empty string");
    }

    public static synchronized void initMonitor(Context context, String str, JSONObject jSONObject, C0VCZ c0vcz) {
        if (context == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            if (jSONObject != null) {
                if (sAidToMonitorCommon.get(str) != null && sAidToMonitorCommon.get(str).LJIJI) {
                    return;
                }
                C0VCC c0vcc = sAidToMonitorCommon.get(str);
                if (c0vcc == null) {
                    c0vcc = new C0VCC(str);
                    sAidToMonitorCommon.put(str, c0vcc);
                }
                List<String> listRemove = sAidToConfigUrl.remove(str);
                if (listRemove != null && !C793950VCn.LIZ(listRemove)) {
                    ((LinkedList) c0vcc.LJIIZILJ).clear();
                    ((LinkedList) c0vcc.LJIIZILJ).addAll(listRemove);
                }
                List<String> listRemove2 = sAidToDefaultReportUrl.remove(str);
                if (listRemove2 != null && !C793950VCn.LIZ(listRemove2)) {
                    C793870VCf.LIZ.LIZIZ(listRemove2);
                }
                c0vcc.LJI(context, jSONObject, c0vcz);
                return;
            }
            throw new IllegalArgumentException("param 'headerInfo' is not allowed to be null");
        }
        throw new IllegalArgumentException("param 'aid' is not allowed to assigned empty string");
    }
}
