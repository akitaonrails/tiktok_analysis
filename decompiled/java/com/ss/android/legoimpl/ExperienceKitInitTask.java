package com.ss.android.legoimpl;

import X.C0CCZ;
import X.C0VZ0;
import X.C1AF0;
import X.C1BWL;
import X.C1E21;
import X.C2188811AlT;
import X.C2207181Ba0;
import X.C2207221Ba4;
import X.C2207231Ba5;
import X.C2207281BaA;
import X.C2207291BaB;
import X.C2207311BaD;
import X.C2207431BaP;
import X.C2344809Gs;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC2207191Ba1;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class ExperienceKitInitTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ExperienceKitInitTask";
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

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        if (C1E21.LIZIZ()) {
            return false;
        }
        return Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("enable_vboost_settings", false);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, java.lang.ref.WeakReference] */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, X.1Ba2] */
    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C2344809Gs.LJ("ExperienceKitInitTask");
        try {
            SettingsManager.LIZLLL().getClass();
            C2207231Ba5.LIZ.LIZIZ = Integer.valueOf(SettingsManager.LJ("vboost_log_level_settings_mt", 6));
            boolean z = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("enable_vboost_settings", false);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("enable:");
            sbLIZ.append(z);
            C2344809Gs.LIZLLL(4, "vboost", C2188811AlT.LIZIZ(sbLIZ));
            if (z) {
                SettingsManager.LIZLLL().getClass();
                C2207431BaP.LIZLLL = SettingsManager.LIZ("enable_vboost_vendor_settings", false);
                C2207181Ba0 c2207181Ba0 = new InterfaceC2207191Ba1() { // from class: X.1Ba0
                    @Override // X.InterfaceC2207191Ba1
                    public final void LIZ(String str, JSONObject jSONObject) {
                        C20684815ws.LJIJ(str, jSONObject);
                    }
                };
                C2207311BaD c2207311BaD = C2207281BaA.LIZ;
                c2207311BaD.LJII.LIZIZ = new WeakReference(c2207181Ba0);
                C2207221Ba4.LIZ.LIZIZ = c2207311BaD.LJIIIIZZ;
                C2207291BaB.LIZ(C1BWL.LIZ());
                C2344809Gs.LIZLLL(4, "vboost", "registerApplication.");
                HashSet hashSet = new HashSet();
                int[] iArr = (int[]) SettingsManager.LIZLLL().LJIIIIZZ("allowed_vboost_scene_mt", int[].class, null);
                if (iArr != null) {
                    for (int i : iArr) {
                        hashSet.add(Integer.valueOf(i));
                    }
                }
                C2207291BaB.LIZLLL(hashSet);
                ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().setKitManageRegister(true);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2344809Gs.LIZLLL(6, "vboost", "registerApplication exception.");
            C1AF0.LJ(th);
            C2207311BaD.LJIIJ.LIZIZ = Boolean.FALSE;
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().setKitManageRegister(false);
        }
    }
}
