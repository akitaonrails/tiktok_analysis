package com.ss.android.ugc.aweme.legoImp.task;

import X.C09CT;
import X.C0CCZ;
import X.C0VZ0;
import X.C804040VgQ;
import X.C804050VgR;
import X.C804080VgU;
import X.C804090VgV;
import X.C804120VgY;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC804130VgZ;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.crash.Npth;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.anrmonitor.SliverAction;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class SliverTrackerTask implements C0CCZ {
    public static final List<InterfaceC804130VgZ> LLILLL = new ArrayList();
    public SliverTrackerConfig LL;
    public SliverAction.SliverSceneConfig LLILLJJLI;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "SliverTrackerTask";
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

    public static SliverTrackerConfig LIZ() {
        String string = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("sliver_tracker_str", "");
        if (!TextUtils.isEmpty(string)) {
            return (SliverTrackerConfig) GsonProtectorUtils.fromJson(new Gson(), string, SliverTrackerConfig.class);
        }
        String string2 = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("sliver_tracker_str_full", "");
        if (TextUtils.isEmpty(string2)) {
            return null;
        }
        return (SliverTrackerConfig) GsonProtectorUtils.fromJson(new Gson(), string2, SliverTrackerConfig.class);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        try {
            SliverAction.SliverSceneConfig sliverSceneConfigLIZJ = SliverAction.LIZJ();
            this.LLILLJJLI = sliverSceneConfigLIZJ;
            if (sliverSceneConfigLIZJ == null) {
                this.LL = LIZ();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        SliverAction.SliverSceneConfig sliverSceneConfig = this.LLILLJJLI;
        if (sliverSceneConfig != null) {
            return sliverSceneConfig.isStartMainThread ? EnumC799870VZh.MAIN : EnumC799870VZh.BOOT_FINISH;
        }
        SliverTrackerConfig sliverTrackerConfig = this.LL;
        return sliverTrackerConfig == null ? EnumC799870VZh.BOOT_FINISH : sliverTrackerConfig.isStartMainThread ? EnumC799870VZh.MAIN : EnumC799870VZh.BOOT_FINISH;
    }

    public class SliverTrackerConfig {

        @C09CT("allThreadEnable")
        public boolean allThreadEnable;

        @C09CT("isStartMainThread")
        public boolean isStartMainThread;

        @C09CT("targetVersion")
        public int targetVersion;

        @C09CT("bufferSize")
        public int bufferSize = 10000;

        @C09CT("samplingMs")
        public int samplingMs = 30;

        public SliverTrackerConfig(SliverTrackerTask sliverTrackerTask) {
        }
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        ArrayList<String> arrayList;
        if (this.LLILLJJLI != null) {
            SliverAction.SliverSceneConfig sliverSceneConfig = SliverAction.LJ;
            if (sliverSceneConfig != null && (arrayList = sliverSceneConfig.sceneActivities) != null && arrayList.size() > 0) {
                C804120VgY c804120VgY = new C804120VgY();
                SliverAction.LJI = c804120VgY;
                c804120VgY.LIZ = SliverAction.LJ.sceneActivities;
            }
            C804120VgY c804120VgY2 = SliverAction.LJI;
            if (c804120VgY2 != null) {
                if (SliverAction.LJFF == null) {
                    SliverAction.LJFF = new SliverAction(context);
                }
                SliverAction sliverAction = SliverAction.LJFF;
                sliverAction.LIZ = c804120VgY2;
                C804090VgV.LIZIZ();
                C804090VgV.LIZ(sliverAction);
            }
            C804080VgU.LIZ(context);
            return;
        }
        try {
            SliverTrackerConfig sliverTrackerConfig = this.LL;
            if (sliverTrackerConfig == null) {
                LJ(context, false);
                return;
            }
            long j = sliverTrackerConfig.targetVersion;
            C844470XAv.LIZ.getClass();
            if (j <= C844470XAv.LIZLLL()) {
                LJ(context, true);
            } else {
                LJ(context, false);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJ(context, false);
        }
    }

    public final void LJ(Context context, boolean z) {
        if (z) {
            SliverTrackerConfig sliverTrackerConfig = this.LL;
            if (sliverTrackerConfig.samplingMs < 20) {
                sliverTrackerConfig.samplingMs = 20;
            }
            int i = sliverTrackerConfig.bufferSize;
            if (i < 10000 || i > 50000) {
                sliverTrackerConfig.bufferSize = 10000;
            }
            C804050VgR c804050VgR = new C804050VgR();
            SliverTrackerConfig sliverTrackerConfig2 = this.LL;
            c804050VgR.LJI = sliverTrackerConfig2.allThreadEnable;
            int i2 = sliverTrackerConfig2.bufferSize;
            if (c804050VgR.LIZIZ > 50000) {
                c804050VgR.LIZIZ = 50000;
            } else {
                c804050VgR.LIZIZ = i2;
            }
            c804050VgR.LIZ = sliverTrackerConfig2.samplingMs;
            c804050VgR.LJFF = true;
            c804050VgR.LIZJ = false;
            c804050VgR.LJ = false;
            c804050VgR.LIZLLL = false;
            C804040VgQ.LIZJ(context, c804050VgR);
            Npth.addTag("sliver_enable", "1");
        } else {
            Npth.addTag("sliver_enable", CardStruct.IStatusCode.DEFAULT);
        }
        Iterator it2 = ((ArrayList) LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC804130VgZ) it2.next()).LIZ();
        }
    }
}
