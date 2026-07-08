package com.ss.android.ugc.aweme.diagnosis;

import X.AnonymousClass1463;
import X.AnonymousClass1464;
import X.C08TN;
import X.C0CCZ;
import X.C0VZ0;
import X.C1909907dx;
import X.C202094145s;
import X.C202098145w;
import X.C202100145y;
import X.C202103146b;
import X.C2188811AlT;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.experiment.ColdBootAppLogReportConfig;
import com.ss.android.ugc.aweme.performanceopt.api.IPerformanceExperimentApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes31.dex */
public final class DiagnosisBootFinishReporterTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "DiagnosisBootFinishReporterTask";
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
        ColdBootAppLogReportConfig coldBootAppLogReportConfig;
        AnonymousClass1464 anonymousClass1464LIZ = AnonymousClass1464.LIZ();
        IPerformanceExperimentApi iPerformanceExperimentApi = AnonymousClass1464.LJI;
        if (iPerformanceExperimentApi != null) {
            anonymousClass1464LIZ.getClass();
            if (iPerformanceExperimentApi.LIZIZ()) {
                return;
            }
        }
        if (!anonymousClass1464LIZ.LJ) {
            return;
        }
        ArrayList<C1909907dx> arrayList = new ArrayList<>();
        ArrayList<C1909907dx> arrayList2 = new ArrayList<>();
        ColdBootAppLogReportConfig coldBootAppLogReportConfig2 = (ColdBootAppLogReportConfig) AnonymousClass1463.LIZIZ.getValue();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((ConcurrentHashMap) anonymousClass1464LIZ.LIZJ).entrySet()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(e3.h);
            C202098145w c202098145wLIZ = C08TN.LIZ();
            String str = ((C202100145y) entry.getValue()).LIZJ;
            c202098145wLIZ.getClass();
            sbLIZ.append(C202098145w.LJJJJJ(str));
            sbLIZ.append(")");
            sbLIZ.append((String) entry.getKey());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            double d = ((C202100145y) entry.getValue()).LIZIZ;
            double d2 = ((C202100145y) entry.getValue()).LIZ;
            if (d < 0.0d) {
                if (!((String) entry.getKey()).startsWith("(cpu)")) {
                    double d3 = d2 - C202094145s.LJII;
                    arrayList.add(new C1909907dx(strLIZIZ, d));
                    arrayList2.add(new C1909907dx(strLIZIZ, d3));
                    coldBootAppLogReportConfig = coldBootAppLogReportConfig2;
                    jSONObject = jSONObject;
                    AnonymousClass1464.LIZIZ(jSONObject, coldBootAppLogReportConfig2, (String) entry.getKey(), d, d3);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("(cpu)");
                    sbLIZ2.append((String) entry.getKey());
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(e3.h);
                    C202098145w c202098145wLIZ2 = C08TN.LIZ();
                    String str2 = ((C202100145y) entry.getValue()).LIZJ;
                    c202098145wLIZ2.getClass();
                    sbLIZ3.append(C202098145w.LJJJJJ(str2));
                    sbLIZ3.append(")");
                    sbLIZ3.append(strLIZIZ2);
                    String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                    arrayList.add(new C1909907dx(strLIZIZ3, d));
                    arrayList2.add(new C1909907dx(strLIZIZ3, d3));
                    AnonymousClass1464.LIZIZ(jSONObject, coldBootAppLogReportConfig, strLIZIZ2, d, d3);
                } else {
                    coldBootAppLogReportConfig = coldBootAppLogReportConfig2;
                }
            } else {
                coldBootAppLogReportConfig = coldBootAppLogReportConfig2;
                arrayList.add(new C1909907dx(strLIZIZ, d));
                arrayList2.add(new C1909907dx(strLIZIZ, d2));
                AnonymousClass1464.LIZIZ(jSONObject, coldBootAppLogReportConfig, (String) entry.getKey(), d, d2);
            }
            coldBootAppLogReportConfig2 = coldBootAppLogReportConfig;
        }
        C202103146b.LIZ(0, "feed_total").LJFF("boot_finish_task_cost", arrayList);
        C202103146b.LIZ(0, "feed_total").LJFF("boot_finish_task_time", arrayList2);
        if (jSONObject.length() <= 0) {
            return;
        }
        AppLogNewUtils.onEventV3("perf_boot_finish_task_info", jSONObject);
    }
}
