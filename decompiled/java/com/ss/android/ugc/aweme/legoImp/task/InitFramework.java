package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C19263210Xu;
import X.C19263410Xw;
import X.C2354709Kn;
import X.C810670Vr7;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.ColdBootTasksDegradeExperiment;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class InitFramework implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitFramework";
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
        return 17;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return ColdBootTasksDegradeExperiment.LIZ().initFramework ? EnumC799870VZh.BOOT_FINISH : EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        context.getClass();
        C2354709Kn.LIZ = context;
        C844470XAv.LIZ.getClass();
        C19263210Xu.LIZ(C844470XAv.LIZ()).getClass();
        try {
            SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(C19263210Xu.LIZIZ, 0, "KEY_NEED_UPLOAD_LAUNCHLOG").edit();
            editorEdit.putInt("json_data", 1);
            editorEdit.commit();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C844470XAv.LIZ.getClass();
        C19263210Xu.LIZ(C844470XAv.LIZ()).LIZ = new C19263410Xw();
    }
}
