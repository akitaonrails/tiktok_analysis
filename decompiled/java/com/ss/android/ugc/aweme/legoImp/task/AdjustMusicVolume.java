package com.ss.android.ugc.aweme.legoImp.task;

import X.C07OX;
import X.C0CCZ;
import X.C0VZ0;
import X.C15O7;
import X.C19259110Wf;
import X.C2230608oa;
import X.C746350TPl;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC2385309Wh;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.ColdBootTasksDegradeExperiment;
import com.ss.android.ugc.aweme.framework.analysis.CrashlyticsWrapperService;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class AdjustMusicVolume implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AdjustMusicVolume";
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
        return ((Boolean) C07OX.LJ.getValue()).booleanValue() ? EnumC799870VZh.BACKGROUND : EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return !ColdBootTasksDegradeExperiment.LIZ().adjustMusicVolume;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C19259110Wf c19259110Wf = C746350TPl.LIZ;
        if (c19259110Wf.LJFF == null) {
            c19259110Wf.LJFF = new C2230608oa<>("i18n_audio_volume", Boolean.FALSE);
        }
        if (!c19259110Wf.LJFF.LIZ().booleanValue()) {
            C15O7.LJIIIIZZ(500L).LIZLLL(new InterfaceC2385309Wh() { // from class: X.0W0j
                @Override // X.InterfaceC2385309Wh
                public final Object then(C15O7 c15o7) {
                    C1C7U.LIZ("AdjustMusicVolume@1557.run$1L");
                    C844470XAv.LIZ.getClass();
                    Context contextLIZ = C844470XAv.LIZ();
                    float fLJFF = C2179771ASp.LJFF(contextLIZ);
                    int iLJII = C2179771ASp.LJII(contextLIZ);
                    if (fLJFF != -1.0f && iLJII != -1 && iLJII / fLJFF > 0.2f) {
                        int iLJFF = (int) (0.2f * C2179771ASp.LJFF(contextLIZ));
                        if (!C2179771ASp.LJIIJJI(contextLIZ)) {
                            try {
                                C2179771ASp.LIZ.setStreamVolume(3, iLJFF, 16);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                CrashlyticsWrapperService.LIZLLL().logException(e);
                            }
                        }
                    }
                    C1C7U.LIZIZ("AdjustMusicVolume@1557.run$1L");
                    return null;
                }
            });
            if (c19259110Wf.LJFF == null) {
                c19259110Wf.LJFF = new C2230608oa<>("i18n_audio_volume", Boolean.FALSE);
            }
            c19259110Wf.LJFF.LJ(Boolean.TRUE);
        }
    }
}
