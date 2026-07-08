package com.ss.android.ugc.aweme.anrmonitor;

import X.C09CT;
import X.C2188811AlT;
import X.C7740030o;
import X.C804110VgX;
import X.C804120VgY;
import android.text.TextUtils;
import com.bytedance.crash.Npth;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public final class GwpasanAction extends C804110VgX {
    public static GwpasanAction LIZIZ;
    public static boolean LIZJ;
    public static GwpasanSceneConfig LIZLLL;
    public static C804120VgY LJ;

    @Override // X.C804110VgX
    public final void LIZIZ() {
    }

    public class GwpasanSceneConfig {

        @C09CT("debug")
        public boolean debug;

        @C09CT("enable")
        public boolean enable;

        @C09CT("sceneActivities")
        public ArrayList<String> sceneActivities;

        @C09CT("upgradeBeforeVideo")
        public boolean upgradeBeforeVideo;

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("GwpasanSceneConfig{, enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", debug=");
            sbLIZ.append(this.debug);
            sbLIZ.append(", upgradeBeforeVideo=");
            sbLIZ.append(this.upgradeBeforeVideo);
            sbLIZ.append(", sceneActivities=");
            sbLIZ.append(this.sceneActivities);
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public GwpasanSceneConfig(GwpasanAction gwpasanAction) {
        }
    }

    public static GwpasanSceneConfig LIZJ() {
        GwpasanSceneConfig gwpasanSceneConfig = LIZLLL;
        if (gwpasanSceneConfig != null) {
            return gwpasanSceneConfig;
        }
        try {
            String string = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("gwpasan_scene_action_setting", "");
            if (!TextUtils.isEmpty(string)) {
                LIZLLL = (GwpasanSceneConfig) C7740030o.LIZ().getGson().LJII(string, GwpasanSceneConfig.class);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return LIZLLL;
    }

    @Override // X.C804110VgX
    public final void LIZ(String str) {
        if (LIZJ) {
            return;
        }
        synchronized (this) {
            try {
                if (!LIZJ) {
                    Npth.enableGwpAsan(true);
                    LIZJ = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
