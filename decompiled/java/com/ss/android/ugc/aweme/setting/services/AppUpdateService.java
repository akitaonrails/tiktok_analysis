package com.ss.android.ugc.aweme.setting.services;

import X.C1697810uHb;
import X.C344740DfM;
import X.C835490Wq3;
import X.C835510Wq5;
import X.InterfaceC20658015sY;
import X.InterfaceC835710WqP;
import X.InterfaceC835730WqR;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.scene.Scene;
import com.google.android.play.core.appupdate.a;
import com.google.android.play.core.appupdate.b;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.setting.experiment.BetaAppExperiment;
import com.ss.android.ugc.aweme.setting.experiment.InboxMsgInterceptor;
import com.ss.android.ugc.aweme.setting.experiment.MarketInterceptor;
import com.ss.android.ugc.aweme.setting.lego.BetaAppTask;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class AppUpdateService implements IAppUpdateService {
    @Override // com.ss.android.ugc.aweme.setting.services.IAppUpdateService
    public final List<IInterceptor> LIZ() {
        return C1697810uHb.LJIIJJI(new InboxMsgInterceptor(), new MarketInterceptor());
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IAppUpdateService
    public final BetaAppTask LIZJ() {
        return new BetaAppTask();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IAppUpdateService
    public final void LIZIZ(boolean z, InterfaceC20658015sY interfaceC20658015sY) {
        BetaAppExperiment.LIZ.getClass();
        if (BetaAppExperiment.LIZJ()) {
            String str = C344740DfM.LLILLL;
            if (z && BetaAppExperiment.LJIIIIZZ && !C344740DfM.LLILZ.getBoolean(C344740DfM.LLILLL, false)) {
                PopupManager.LJIJI(new C344740DfM(interfaceC20658015sY), true);
            }
            BetaAppExperiment.LJIIIZ.getClass();
            C835510Wq5 c835510Wq5LIZIZ = ((b) BetaAppExperiment.LJII.getValue()).LIZIZ();
            InterfaceC835710WqP interfaceC835710WqP = new InterfaceC835710WqP() { // from class: X.0TTy
                @Override // X.InterfaceC835710WqP
                public final void onSuccess(Object obj) {
                    int i = ((a) obj).LIZ;
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, "profile");
                    c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "success");
                    BetaAppExperiment.LIZ.getClass();
                    c2344009Gk.LJ(Boolean.valueOf(BetaAppExperiment.LIZIZ(i)), "new_beta_version");
                    c2344009Gk.LIZJ(i, "version");
                    C20684815ws.LJIILLIIL("tiktok_beta_googleplay_version", c2344009Gk.LIZ);
                    if (BetaAppExperiment.LIZIZ(i)) {
                        BetaAppExperiment.LIZLLL(i);
                    }
                }
            };
            c835510Wq5LIZIZ.getClass();
            c835510Wq5LIZIZ.LJI(C835490Wq3.LIZ, interfaceC835710WqP);
            c835510Wq5LIZIZ.LIZLLL(new InterfaceC835730WqR() { // from class: X.0TTz
                @Override // X.InterfaceC835730WqR
                public final void onFailure(Exception exc) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, "profile");
                    c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "failed");
                    C20684815ws.LJIILLIIL("tiktok_beta_googleplay_version", c2344009Gk.LIZ);
                }
            });
        }
    }
}
