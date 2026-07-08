package com.ss.android.ugc.aweme.experiment;

import X.C08JS;
import X.C09CT;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes5.dex */
public final class ColdBootTasksDegradeExperiment {
    public static DegradeStrategy LIZ;

    /* JADX INFO: loaded from: classes14.dex */
    public static class DegradeStrategy {

        @C09CT("DisableABCacheOptInitTask")
        public boolean abCacheOptInitTask;

        @C09CT("AccountRegisterTaskToBootFinish")
        public boolean accountRegisterTask;

        @C09CT("DisableAdjustMusicVolume")
        public boolean adjustMusicVolume;

        @C09CT("CheckUpdateChangeDeviceIDTaskToBootFinish")
        public boolean checkUpdateChangeDeviceIDTask;

        @C09CT("CpuTaskToBootFinish")
        public boolean cpuTask;

        @C09CT("CustomAnchorInitTaskToBootFinish")
        public boolean customAnchorInitTask;

        @C09CT("DisableDMHighPriorityTask")
        public boolean dmHighPriorityTask;

        @C09CT("DisableFeedRequestParamPreloadTask")
        public boolean feedRequestParamPreloadTask;

        @C09CT("FetchIMFollowListRequestToBootFinish")
        public boolean fetchIMFollowListRequest;

        @C09CT("FetchUserInfoRequestToBootFinish")
        public boolean fetchUserInfoRequest;

        @C09CT("FirebaseConfigCheckTaskToBootFinish")
        public boolean firebaseConfigCheckTask;

        @C09CT("GoogleColdStartServiceTaskToBootFinish")
        public boolean googleColdStartServiceTask;

        @C09CT("InitFrameworkToBootFinish")
        public boolean initFramework;

        @C09CT("DisableInitGenoTask")
        public boolean initGenoTask;

        @C09CT("InitServiceSettingTaskToBootFinish")
        public boolean initServiceSettingTask;

        @C09CT("DisableIoPreloadTask")
        public boolean ioPreloadTask;

        @C09CT("DisableMobLaunchEventTask")
        public boolean mobLaunchEventTask;

        @C09CT("DisableMobMainSessionStartTask")
        public boolean mobMainSessionStartTask;

        @C09CT("MusicCollectTaskToBootFinish")
        public boolean musicCollectTask;

        @C09CT("NewUserTaskToBootFinish")
        public boolean newUserTask;

        @C09CT("NujRequestTaskToBootFinish")
        public boolean nujRequestTask;

        @C09CT("DisablePerformanceHelperTask")
        public boolean performanceHelperTask;

        @C09CT("PNSConsentServiceLegoRequestToBootFinish")
        public boolean pnsConsentServiceLegoRequest;

        @C09CT("DisablePreCreatePlayerTask")
        public boolean preCreatePlayerTask;

        @C09CT("DisablePreloadInMeasureTriggerTask")
        public boolean preloadInMeasureTriggerTask;

        @C09CT("DisablePreloadMainTask")
        public boolean preloadMainTask;

        @C09CT("DisableReportActivityStatusTask")
        public boolean reportActivityStatusTask;

        @C09CT("TrackComputedTaskToFocusChange")
        public boolean trackComputedTask;

        @C09CT("TrafficPerfMonitorTaskToBootFinish")
        public boolean trafficPerfMonitorTask;

        @C09CT("UGFeatureInitTaskToBootFinish")
        public boolean uGFeatureInitTask;

        @C09CT("ZstdDictUpdateTaskToBootFinish")
        public boolean zstdDictUpdateTask;
    }

    public static DegradeStrategy LIZ() {
        try {
            if (LIZ == null) {
                LIZ = (DegradeStrategy) C08JS.LIZ(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("coldboot_tasksdegrade", "{}"), DegradeStrategy.class);
            }
            if (LIZ == null) {
                LIZ = new DegradeStrategy();
            }
            return LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new DegradeStrategy();
        }
    }
}
