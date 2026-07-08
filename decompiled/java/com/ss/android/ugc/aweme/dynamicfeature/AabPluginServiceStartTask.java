package com.ss.android.ugc.aweme.dynamicfeature;

import X.AnonymousClass1403;
import X.AnonymousClass1404;
import X.AnonymousClass1405;
import X.C08PT;
import X.C0CCZ;
import X.C0VZ0;
import X.C13LP;
import X.C1924007gE;
import X.C1924107gF;
import X.C1BLP;
import X.C1BLS;
import X.C1BLU;
import X.C1BLV;
import X.C1BLX;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2203381BLk;
import X.C793770VBv;
import X.C794240VDq;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class AabPluginServiceStartTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AabPluginServiceStartTask";
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
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        String str;
        String strSubstring;
        IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
        if (iPluginService != null && iPluginService.LIZLLL() != null) {
            try {
                Set set = (Set) C08PT.LIZLLL.getValue();
                Set<String> setLIZJ = C08PT.LIZJ();
                Set<String> setLIZLLL = C08PT.LIZLLL();
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb = new StringBuilder();
                for (String str2 : setLIZLLL) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str2);
                    if (set.contains(str2)) {
                        sb.append("|0");
                    } else if (setLIZJ.contains(str2)) {
                        sb.append("|1");
                    } else {
                        sb.append("|2");
                    }
                }
                jSONObject.put("name_list", sb.toString());
                C20684815ws.LJIJJ("df_installed_modules", jSONObject);
                CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                C793770VBv.LJIIJJI("df_installed_modules", 0, jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (AnonymousClass1404.LIZLLL) {
                C2203381BLk.LIZ.getClass();
                Map<String, ?> all = KevaImpl.getRepo("dynamic_task_triggered", 0).getAll();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    String key = entry.getKey();
                    C1924107gF c1924107gFLIZ = C1924007gE.LIZ((String) entry.getValue());
                    if (c1924107gFLIZ != null) {
                        arrayList.add(new Pair(key, c1924107gFLIZ));
                    }
                }
                for (Map.Entry entry2 : C2097608Jq.LJIILLIIL(arrayList).entrySet()) {
                    String str3 = (String) entry2.getKey();
                    List<String> list = ((C1924107gF) entry2.getValue()).LIZ;
                    if (!list.isEmpty()) {
                        if (list.size() == 1 && (str = (String) C13LP.LJJJJZI(list)) != null && str.startsWith("com.ss.android.ugc.aweme.dflanguage")) {
                            if (u.LJJIIJZLJL(str3, "df_language", false)) {
                                strSubstring = str3.substring(12);
                            } else {
                                strSubstring = str3;
                            }
                            Locale locale = new Locale(strSubstring);
                            if (!C1BLS.LIZIZ(locale)) {
                                AnonymousClass1403 anonymousClass1403 = new AnonymousClass1403();
                                anonymousClass1403.LIZ = false;
                                anonymousClass1403.LJFF = true;
                                new C1BLS(new C1BLX(locale, true, true, null, new AnonymousClass1405(anonymousClass1403))).LIZ();
                            } else {
                                KevaImpl.getRepo("dynamic_task_triggered", 0).erase(str3);
                            }
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            for (String str4 : C08PT.LIZLLL()) {
                                Map<String, String> map = C1BLV.LIZ;
                                String strLIZIZ = C1BLV.LIZIZ(str4);
                                if (strLIZIZ != null) {
                                    arrayList2.add(strLIZIZ);
                                }
                            }
                            Set setLLIIJI = C13LP.LLIIJI(arrayList2);
                            ArrayList arrayList3 = new ArrayList();
                            for (String str5 : list) {
                                if (!setLLIIJI.contains(str5)) {
                                    arrayList3.add(str5);
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                String str6 = (String) C13LP.LJJJJZI(arrayList3);
                                AnonymousClass1403 anonymousClass14032 = new AnonymousClass1403();
                                anonymousClass14032.LIZ = false;
                                anonymousClass14032.LJFF = true;
                                anonymousClass14032.LJIIIIZZ = C13LP.LJJJJIZL(arrayList3, 0);
                                new C1BLU(new C1BLP(str6, true, false, true, null, new AnonymousClass1405(anonymousClass14032), 4)).LIZ();
                            } else {
                                KevaImpl.getRepo("dynamic_task_triggered", 0).erase(str3);
                            }
                        }
                    }
                }
            }
        }
    }
}
