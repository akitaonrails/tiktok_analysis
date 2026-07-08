package com.ss.android.legoimpl;

import X.C0CCZ;
import X.C0V5M;
import X.C0VEX;
import X.C0VG2;
import X.C0VJQ;
import X.C0VZ0;
import X.C2097608Jq;
import X.C2104108Md;
import X.C291730Bc3;
import X.C791880V4o;
import X.C791940V4u;
import X.C793770VBv;
import X.C794340VEa;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC792020V5c;
import X.InterfaceC792440V6s;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.legoImp.task.dm.ab.TrackerBlockConfigModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class ProcessMonitorTask implements C0CCZ {
    public final Map<Integer, String> LL = C2097608Jq.LJIIJ(new Pair(0, "Cold_Boot_Begin"), new Pair(1, "Cold_Boot_End"), new Pair(2, "Cold_Boot_End_Short"), new Pair(3, "Cold_Boot_End_Long"));

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ProcessMonitorTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 16777215;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return ((Boolean) C291730Bc3.LIZ.getValue()).booleanValue() ? EnumC799870VZh.BOOT_FINISH : EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) throws JSONException {
        if (!C2104108Md.LIZLLL(context)) {
            if (context != null) {
                C791880V4o.LIZ(context);
                C791940V4u c791940V4u = new C791940V4u();
                C844470XAv.LIZ.getClass();
                try {
                    c791940V4u.LJIIJ.put("aid", C844470XAv.LJIIJ);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                c791940V4u.LJIIJJI = new InterfaceC792440V6s() { // from class: X.0VEY
                    @Override // X.InterfaceC792440V6s
                    public final String getSessionId() {
                        return "";
                    }

                    @Override // X.InterfaceC792440V6s
                    public final long getUid() {
                        return 0L;
                    }

                    @Override // X.InterfaceC792440V6s
                    public final Map<String, String> getCommonParams() {
                        HashMap map = new HashMap();
                        HashMap map2 = new HashMap();
                        C0XDN.LIZJ(map2, true);
                        for (Map.Entry entry : map2.entrySet()) {
                            String str = (String) entry.getKey();
                            String str2 = (String) entry.getValue();
                            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                                map.put(str, str2);
                            }
                        }
                        return map;
                    }
                };
                c791940V4u.LJIJI = new C0VEX();
                c791940V4u.LJIILJJIL = new C0V5M() { // from class: X.0VEc
                    @Override // X.C0V5M
                    public final void LIZ() {
                    }

                    @Override // X.C0V5M
                    public final void onStartComplete() {
                    }
                };
                c791940V4u.LJIILLIIL = new InterfaceC792020V5c() { // from class: X.0VEZ
                    @Override // X.InterfaceC792020V5c
                    public final Map<String, String> getQueryParams() {
                        HashMap map = new HashMap();
                        C844470XAv.LIZ.getClass();
                        map.put("app_id", String.valueOf(C844470XAv.LJIIJ));
                        return map;
                    }
                };
                TrackerBlockConfigModel trackerBlockConfigModelLIZ = C794340VEa.LIZ();
                if (trackerBlockConfigModelLIZ.enable) {
                    C0VJQ.LIZ.LJ(trackerBlockConfigModelLIZ.blockConfig, trackerBlockConfigModelLIZ.auditMeta);
                    c791940V4u.LJIL = new C0VG2();
                }
                C791880V4o.LIZIZ(c791940V4u.LIZ());
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("process_name", C2104108Md.LIZ(context));
            C793770VBv.LJII("control_process_init_event", jSONObject2, jSONObject, null);
        }
    }
}
