package com.ss.android.ugc.aweme.anrmonitor;

import X.C09CT;
import X.C804040VgQ;
import X.C804050VgR;
import X.C804110VgX;
import X.C804120VgY;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.crash.Npth;
import com.bytedance.keva.Keva;
import com.bytedance.sliver.Sliver;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public final class SliverAction extends C804110VgX {
    public static SliverSceneConfig LJ;
    public static SliverAction LJFF;
    public static C804120VgY LJI;
    public static boolean LJII;
    public final Context LIZIZ;
    public String LIZJ;
    public long LIZLLL;

    public class SliverSceneConfig {

        @C09CT("allThreadEnable")
        public boolean allThreadEnable;

        @C09CT("isStartMainThread")
        public boolean isStartMainThread;

        @C09CT("activities")
        public ArrayList<String> sceneActivities;

        @C09CT("targetVersion")
        public int targetVersion;

        @C09CT("bufferSize")
        public int bufferSize = 10000;

        @C09CT("samplingMs")
        public int samplingMs = 30;

        public final String toString() {
            return "SliverSceneConfig { sceneActivities: " + this.sceneActivities + ", bufferSize: " + this.bufferSize + ", samplingMs: " + this.samplingMs + ", targetVersion: " + this.targetVersion + ", isStartMainThread: " + this.isStartMainThread + ", allThreadEnable: " + this.allThreadEnable + " }";
        }

        public SliverSceneConfig(SliverAction sliverAction) {
        }
    }

    public static SliverSceneConfig LIZJ() {
        SliverSceneConfig sliverSceneConfig = LJ;
        if (sliverSceneConfig != null) {
            return sliverSceneConfig;
        }
        try {
            String string = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("sliver_scene_str", "");
            if (!TextUtils.isEmpty(string)) {
                LJ = (SliverSceneConfig) new Gson().LJII(string, SliverSceneConfig.class);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return LJ;
    }

    @Override // X.C804110VgX
    public final void LIZIZ() {
        if (LJII) {
            Sliver.stopAll();
            Sliver.clearAll();
        }
    }

    public SliverAction(Context context) {
        this.LIZIZ = context;
    }

    @Override // X.C804110VgX
    public final void LIZ(String str) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!LJII) {
            long j = this.LIZLLL;
            if (j == 0 || jElapsedRealtime - j > 600000) {
                this.LIZJ = str;
                this.LIZLLL = SystemClock.elapsedRealtime();
                Context context = this.LIZIZ;
                LJII = true;
                SliverSceneConfig sliverSceneConfig = LJ;
                if (sliverSceneConfig.samplingMs < 20) {
                    sliverSceneConfig.samplingMs = 20;
                }
                int i = sliverSceneConfig.bufferSize;
                if (i <= 10000 || i >= 50000) {
                    sliverSceneConfig.bufferSize = 10000;
                }
                C804050VgR c804050VgR = new C804050VgR();
                SliverSceneConfig sliverSceneConfig2 = LJ;
                c804050VgR.LJI = sliverSceneConfig2.allThreadEnable;
                int i2 = sliverSceneConfig2.bufferSize;
                if (c804050VgR.LIZIZ > 50000) {
                    c804050VgR.LIZIZ = 50000;
                } else {
                    c804050VgR.LIZIZ = i2;
                }
                c804050VgR.LIZ = sliverSceneConfig2.samplingMs;
                c804050VgR.LJFF = true;
                c804050VgR.LIZJ = false;
                c804050VgR.LJ = false;
                c804050VgR.LIZLLL = true;
                C804040VgQ.LIZJ(context, c804050VgR);
                Npth.addTag("sliver_scene_enable", "1");
                String str2 = this.LIZJ;
                if (str2 == null) {
                    str2 = "null";
                }
                Npth.addTag("sliver_scene_name", str2);
            }
        }
    }
}
