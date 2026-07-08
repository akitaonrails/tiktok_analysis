package com.ss.android.ugc.aweme.experiment;

import X.C086T;
import X.C08JS;
import X.C09CT;
import X.C0X52;
import X.C1494590ozp;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import android.content.Intent;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public final class ColdBootPushStartupExperiment {
    public static PushStartupStrategy LIZ;

    public static class KeepAliveEntry {

        @C09CT("action")
        public String action = "";

        @C09CT("component")
        public String component = "";

        @C09CT("keepAliveInterval")
        public long keepAliveInterval;

        @C09CT("killSelfInterval")
        public long killSelfInterval;

        @C09CT("suspendTasks")
        public boolean suspendTasks;
    }

    public static class PushStartupStrategy {

        @C09CT("bootFinishDelayTime")
        public long bootFinishDelayTime;

        @C09CT("networkPendingInterceptor")
        public boolean networkPendingInterceptor;

        @C09CT("networkPendingInterceptorInterval")
        public long networkPendingInterceptorInterval;

        @C09CT("preCreatePrerenderSession")
        public boolean preCreatePrerenderSession;

        @C09CT("ABPreloadTask")
        public boolean preloadABTask;

        @C09CT("SPKevaPreloadTaskV3")
        public boolean preloadKevaTask;

        @C09CT("PushStartupTaskRejectStrategyV2")
        public boolean taskRejectStrategyV2;

        @C09CT("PushStartupTaskSleepTime")
        public long taskSleepTime;

        @C09CT("componentNames")
        public String[] componentNames = new String[0];

        @C09CT("launchComponentSignature")
        public String[] launchComponentSignature = new String[0];

        @C09CT("keepAliveEntries")
        public List<KeepAliveEntry> keepAliveEntries = new ArrayList();
    }

    public static PushStartupStrategy LIZ() {
        try {
            if (LIZ == null) {
                LIZ = (PushStartupStrategy) C08JS.LIZ(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("coldboot_pushstartup", "{}"), PushStartupStrategy.class);
            }
            if (LIZ == null) {
                LIZ = new PushStartupStrategy();
            }
            return LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new PushStartupStrategy();
        }
    }

    public static boolean LIZIZ() {
        Intent intentLIZ;
        if (LIZ() != null && (intentLIZ = C086T.LIZ()) != null && intentLIZ.getAction() != null && intentLIZ.getComponent() != null) {
            if (LIZ().launchComponentSignature != null) {
                for (String str : LIZ().launchComponentSignature) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(intentLIZ.getAction());
                    sbLIZ.append(":");
                    sbLIZ.append(intentLIZ.getComponent().getShortClassName());
                    if (str.equals(C2188811AlT.LIZIZ(sbLIZ))) {
                        return true;
                    }
                }
            }
            if (LIZ().componentNames != null) {
                for (String str2 : LIZ().componentNames) {
                    if (str2.equals(intentLIZ.getComponent().getShortClassName())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static class NetworkPendingInterceptor implements InterfaceC1904907d9 {
        public final Set<Thread> LL = new HashSet();
        public volatile boolean LLILLJJLI = false;
        public long LLILLL = 0;

        @Override // X.InterfaceC1904907d9
        public final C0X52 intercept(InterfaceC841770X0l interfaceC841770X0l) {
            if (this.LLILLJJLI) {
                ((HashSet) this.LL).add(C786410Ut5.u3());
                try {
                    Thread.sleep(this.LLILLL);
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    ((HashSet) this.LL).remove(C786410Ut5.u3());
                    throw th;
                }
                ((HashSet) this.LL).remove(C786410Ut5.u3());
            }
            C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
            return c1494590ozp.LIZ(c1494590ozp.LIZJ);
        }
    }
}
