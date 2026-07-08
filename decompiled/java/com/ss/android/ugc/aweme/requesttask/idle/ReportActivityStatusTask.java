package com.ss.android.ugc.aweme.requesttask.idle;

import X.C0CCZ;
import X.C0VZ0;
import X.C2188811AlT;
import X.C2344809Gs;
import X.C793770VBv;
import X.C794240VDq;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ReportActivityStatusTask implements C0CCZ {
    public final String LL = "MainActivity";
    public final Bundle LLILLJJLI;
    public final boolean LLILLL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ReportActivityStatusTask";
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return this.LLILLL;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.SPARSE;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        boolean z;
        String str = this.LL;
        int i = 1;
        if (this.LLILLJJLI != null) {
            z = true;
        } else {
            z = false;
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("The activity is recovered by the system or config change:");
            sbLIZ.append(z);
            C2344809Gs.LIZLLL(4, str, C2188811AlT.LIZIZ(sbLIZ));
            if (!z) {
                i = 0;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("activity", str);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("");
            sbLIZ2.append(z);
            jSONObject.put("activity_status", C2188811AlT.LIZIZ(sbLIZ2));
            CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
            C793770VBv.LJIIJJI("activity_monitor", i, jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2344809Gs.LJI(th);
        }
    }

    public ReportActivityStatusTask(Bundle bundle, boolean z) {
        this.LLILLJJLI = bundle;
        this.LLILLL = z;
    }
}
