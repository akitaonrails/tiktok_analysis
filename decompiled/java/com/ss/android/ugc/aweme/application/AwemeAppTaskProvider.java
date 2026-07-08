package com.ss.android.ugc.aweme.application;

import X.AnonymousClass0716;
import X.C01GW;
import X.C04TD;
import X.C04U9;
import X.C069P;
import X.C07DE;
import X.C07HQ;
import X.C07JG;
import X.C089K;
import X.C0AD1;
import X.C0B79;
import X.C0B7B;
import X.C0BSP;
import X.C0C64;
import X.C0CBN;
import X.C0CBO;
import X.C0CBS;
import X.C0CCZ;
import X.C0CKL;
import X.C0COI;
import X.C0RRR;
import X.C0XKT;
import X.C1211404oa;
import X.C1251804v6;
import X.C1263390iyv;
import X.C14B1;
import X.C1592110rX7;
import X.C1593730rZj;
import X.C1602860roS;
import X.C1832107Fn;
import X.C1866350yfR;
import X.C1866440yfa;
import X.C1BWL;
import X.C1BX5;
import X.C1BX7;
import X.C1BX8;
import X.C1BXS;
import X.C1E21;
import X.C2187891Ajz;
import X.C2206208ke;
import X.C2206241BWk;
import X.C2277711EDh;
import X.C2279461EKa;
import X.C2406609bs;
import X.C255620A0a;
import X.C274890Apz;
import X.C275720ArK;
import X.C282480B5i;
import X.C282890B6x;
import X.C285090BFj;
import X.C288570BSt;
import X.C296320BjS;
import X.C303040BuI;
import X.C308260C6m;
import X.C788100Uvo;
import X.C799820VZc;
import X.C799900VZk;
import X.C805380Via;
import X.C809360Vp0;
import X.C844470XAv;
import X.C848110XOv;
import X.EnumC799870VZh;
import X.InterfaceC1577280r9C;
import X.InterfaceC1577520r9a;
import X.InterfaceC799850VZf;
import X.InterfaceC800080Va2;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.ies.ugc.aweme.commercialize.splash.SplashAdManagerPreloadTask;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.RealTimeSplashTask;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.TopViewPreloadJsonTask;
import com.bytedance.ies.ugc.statisticlogger.page.PageTask;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.legoapi.IAccountInitializerTaskApi;
import com.ss.android.legoimpl.BusinessToolsTask;
import com.ss.android.legoimpl.CpuTask;
import com.ss.android.legoimpl.ExperienceKitInitTask;
import com.ss.android.legoimpl.FixInflateCrashTask;
import com.ss.android.legoimpl.InitFakeMainTask;
import com.ss.android.legoimpl.InitFrescoCoreTask;
import com.ss.android.legoimpl.InitRewordTask;
import com.ss.android.legoimpl.InitThreadPoolBlockNumTask;
import com.ss.android.legoimpl.NewUserTask;
import com.ss.android.legoimpl.PreloadColdBootKevaValueTask;
import com.ss.android.legoimpl.ProcessMonitorTask;
import com.ss.android.legoimpl.SurveyTask;
import com.ss.android.storage.M2StorageCleanInitTask;
import com.ss.android.ugc.aweme.IHomeTabService;
import com.ss.android.ugc.aweme.ILoginServiceAppDiff;
import com.ss.android.ugc.aweme.IUnifiedAccountSdkSOTLService;
import com.ss.android.ugc.aweme.a11y.AccessibilityEventTrackingTask;
import com.ss.android.ugc.aweme.account.service.IAccountOutBridgeService;
import com.ss.android.ugc.aweme.ad.feed.hybrid.container.AdHybridTask;
import com.ss.android.ugc.aweme.ad.feed.ibe.IBEPreloadTask;
import com.ss.android.ugc.aweme.alog.ALogNativeOptTask;
import com.ss.android.ugc.aweme.app.IInitAllService;
import com.ss.android.ugc.aweme.app.accountsdk.NewUserPrefetchABSettingsTask;
import com.ss.android.ugc.aweme.app.application.task.CheckUpdateChangeDeviceIDTask;
import com.ss.android.ugc.aweme.app.application.task.CommonParamsInitTask;
import com.ss.android.ugc.aweme.application.bootfinish.BootFinishTaskProvider;
import com.ss.android.ugc.aweme.benchmark.BenchmarkCollectionInitService;
import com.ss.android.ugc.aweme.boot.RetryUnsuccessfulPublishTask;
import com.ss.android.ugc.aweme.comment.commentpage.widget.CommentPreloadInstanceTask;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.commercialize.measurement.IMeasurementService;
import com.ss.android.ugc.aweme.commercialize.service.IFeedAppDetectService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IConsentConfigInitTaskService;
import com.ss.android.ugc.aweme.compliance.consent.deviceconsent.config.DelayedConsentConfigInitTask;
import com.ss.android.ugc.aweme.compliance.consent.deviceconsent.config.PrioritizedConsentConfigInitTask;
import com.ss.android.ugc.aweme.diagnosis.DiagnosisDropFrameMonitorTask;
import com.ss.android.ugc.aweme.diagnosis.DiagnosisRunnableMonitorTask;
import com.ss.android.ugc.aweme.experiment.ColdBootTasksDegradeExperiment;
import com.ss.android.ugc.aweme.feed.component.InitFeedPlatformTask;
import com.ss.android.ugc.aweme.feed.component.InitFeedTabSlideTask;
import com.ss.android.ugc.aweme.feed.pip.PipInitTask;
import com.ss.android.ugc.aweme.feed.preload.PreloadMediaCodecListTask;
import com.ss.android.ugc.aweme.feed.sound.AutoAdjustVolumeTask;
import com.ss.android.ugc.aweme.follow.service.FollowFeedServiceImpl;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.sharepanel.impl.service.ImMediaShareService;
import com.ss.android.ugc.aweme.im.sticker.api.socialavatar.AiMojiSyncLegoTask;
import com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService;
import com.ss.android.ugc.aweme.innerpush.api.InitInnerPushTask;
import com.ss.android.ugc.aweme.journey.INewUserJourneyAppDiffService;
import com.ss.android.ugc.aweme.launcher.LauncherServiceImpl;
import com.ss.android.ugc.aweme.lego.RequestCoordinateInitTask;
import com.ss.android.ugc.aweme.lego.kita.InitKitaTask;
import com.ss.android.ugc.aweme.legoImp.CustomAnchorInitTask;
import com.ss.android.ugc.aweme.legoImp.EcommerceLazyInitTask;
import com.ss.android.ugc.aweme.legoImp.OrbuInitTask;
import com.ss.android.ugc.aweme.legoImp.SPKevaPreloadTaskV3;
import com.ss.android.ugc.aweme.legoImp.task.ABCacheOptInitTask;
import com.ss.android.ugc.aweme.legoImp.task.ABClientIDTask;
import com.ss.android.ugc.aweme.legoImp.task.AdjustMusicVolume;
import com.ss.android.ugc.aweme.legoImp.task.AppLogInitTask;
import com.ss.android.ugc.aweme.legoImp.task.AppLogSessionMonitorInitTask;
import com.ss.android.ugc.aweme.legoImp.task.ArsenalPreloadInitTask;
import com.ss.android.ugc.aweme.legoImp.task.AssemExperimentParamInitTask;
import com.ss.android.ugc.aweme.legoImp.task.AssemInitTask;
import com.ss.android.ugc.aweme.legoImp.task.AssistantTask;
import com.ss.android.ugc.aweme.legoImp.task.BPEAPreloadTask;
import com.ss.android.ugc.aweme.legoImp.task.BaseOptFirstFrameTask;
import com.ss.android.ugc.aweme.legoImp.task.BindFrescoTask;
import com.ss.android.ugc.aweme.legoImp.task.BulletAssemblerInitTask;
import com.ss.android.ugc.aweme.legoImp.task.ColdStartThreadPriorityOpt;
import com.ss.android.ugc.aweme.legoImp.task.CronyManagerTask;
import com.ss.android.ugc.aweme.legoImp.task.DeeplinkPrefetchTask;
import com.ss.android.ugc.aweme.legoImp.task.EmojiTask;
import com.ss.android.ugc.aweme.legoImp.task.FeedRequestParamPreloadTask;
import com.ss.android.ugc.aweme.legoImp.task.FetchUltimateComplianceSettingsTask;
import com.ss.android.ugc.aweme.legoImp.task.FirebaseConfigCheckTask;
import com.ss.android.ugc.aweme.legoImp.task.FixFocusedViewLeak;
import com.ss.android.ugc.aweme.legoImp.task.FluencySdkInitTask;
import com.ss.android.ugc.aweme.legoImp.task.FontTask;
import com.ss.android.ugc.aweme.legoImp.task.FriendsRedDotCleanupTask;
import com.ss.android.ugc.aweme.legoImp.task.FriendsRedDotDeferredTask;
import com.ss.android.ugc.aweme.legoImp.task.FriendsTabInitTask;
import com.ss.android.ugc.aweme.legoImp.task.GetDigitalWellbeingSettingsTask;
import com.ss.android.ugc.aweme.legoImp.task.GetGoogleAIdTask;
import com.ss.android.ugc.aweme.legoImp.task.GoogleColdStartServiceTask;
import com.ss.android.ugc.aweme.legoImp.task.InferenceEngineTask;
import com.ss.android.ugc.aweme.legoImp.task.InitAVModule;
import com.ss.android.ugc.aweme.legoImp.task.InitAbTest;
import com.ss.android.ugc.aweme.legoImp.task.InitAppsFlyer;
import com.ss.android.ugc.aweme.legoImp.task.InitDeeplinkSdkTask;
import com.ss.android.ugc.aweme.legoImp.task.InitFacebookAdsTask;
import com.ss.android.ugc.aweme.legoImp.task.InitFramework;
import com.ss.android.ugc.aweme.legoImp.task.InitLottieOptTask;
import com.ss.android.ugc.aweme.legoImp.task.InitModules;
import com.ss.android.ugc.aweme.legoImp.task.InitMusicManager;
import com.ss.android.ugc.aweme.legoImp.task.InitPageMonitorTask;
import com.ss.android.ugc.aweme.legoImp.task.InitPushTask;
import com.ss.android.ugc.aweme.legoImp.task.InitReportSignature;
import com.ss.android.ugc.aweme.legoImp.task.InitShareSdkTask;
import com.ss.android.ugc.aweme.legoImp.task.InitStorageManagerTask;
import com.ss.android.ugc.aweme.legoImp.task.IoPreloadTask;
import com.ss.android.ugc.aweme.legoImp.task.JatoBootFinishTask;
import com.ss.android.ugc.aweme.legoImp.task.JatoInitTask;
import com.ss.android.ugc.aweme.legoImp.task.JsBridge2InitTask;
import com.ss.android.ugc.aweme.legoImp.task.LegacyTask;
import com.ss.android.ugc.aweme.legoImp.task.LiveBootFinishSettingTask;
import com.ss.android.ugc.aweme.legoImp.task.LiveGiftAssetStatisticTask;
import com.ss.android.ugc.aweme.legoImp.task.LiveInjectContextTask;
import com.ss.android.ugc.aweme.legoImp.task.LivePipoInitOptimizeTask;
import com.ss.android.ugc.aweme.legoImp.task.LivePrefetchLoadOptTask;
import com.ss.android.ugc.aweme.legoImp.task.LiveStreamStrategyInitTask;
import com.ss.android.ugc.aweme.legoImp.task.LogCleanTask;
import com.ss.android.ugc.aweme.legoImp.task.MediaStrategyInitTask;
import com.ss.android.ugc.aweme.legoImp.task.MessageControllerTask;
import com.ss.android.ugc.aweme.legoImp.task.MiloInitTask;
import com.ss.android.ugc.aweme.legoImp.task.MotaInitTask;
import com.ss.android.ugc.aweme.legoImp.task.NewLivePrefetchLoadOptTask;
import com.ss.android.ugc.aweme.legoImp.task.NewUserJourneyDialogCleanTask;
import com.ss.android.ugc.aweme.legoImp.task.NewUserPreloadTask;
import com.ss.android.ugc.aweme.legoImp.task.NewUserVodInitTask;
import com.ss.android.ugc.aweme.legoImp.task.NxETInitTask;
import com.ss.android.ugc.aweme.legoImp.task.ObserveDeviceRegister;
import com.ss.android.ugc.aweme.legoImp.task.PerformanceHelperTask;
import com.ss.android.ugc.aweme.legoImp.task.PhotosAuthInitTask;
import com.ss.android.ugc.aweme.legoImp.task.PitayaPreInitTask;
import com.ss.android.ugc.aweme.legoImp.task.PlayerConfigInitTask;
import com.ss.android.ugc.aweme.legoImp.task.PlayerKitCommonWidgetInitTask;
import com.ss.android.ugc.aweme.legoImp.task.PlayerKitInitTask;
import com.ss.android.ugc.aweme.legoImp.task.PopupConfigTask;
import com.ss.android.ugc.aweme.legoImp.task.PowerInitTask;
import com.ss.android.ugc.aweme.legoImp.task.PowerPageTask;
import com.ss.android.ugc.aweme.legoImp.task.PowerPermissionsTask;
import com.ss.android.ugc.aweme.legoImp.task.PreloadStageTask;
import com.ss.android.ugc.aweme.legoImp.task.PreloadWireFieldNoEnumClassTask;
import com.ss.android.ugc.aweme.legoImp.task.RegisterScreenBroadcastReceiverTask;
import com.ss.android.ugc.aweme.legoImp.task.ResIdentifierOptTask;
import com.ss.android.ugc.aweme.legoImp.task.ResetTTNetworkStateIndexTask;
import com.ss.android.ugc.aweme.legoImp.task.ScalpelConfigInitTask;
import com.ss.android.ugc.aweme.legoImp.task.ScopedIdInitTask;
import com.ss.android.ugc.aweme.legoImp.task.SetMainThreadPriorityTask;
import com.ss.android.ugc.aweme.legoImp.task.SetupMainServiceForJsb;
import com.ss.android.ugc.aweme.legoImp.task.SetupTestSpHost;
import com.ss.android.ugc.aweme.legoImp.task.SmartServicePreloadTask;
import com.ss.android.ugc.aweme.legoImp.task.SplitCompatInstall;
import com.ss.android.ugc.aweme.legoImp.task.StarshipFetchTask;
import com.ss.android.ugc.aweme.legoImp.task.StarshipStrategyTask;
import com.ss.android.ugc.aweme.legoImp.task.StorageClearTask;
import com.ss.android.ugc.aweme.legoImp.task.StoreRegionInitTask;
import com.ss.android.ugc.aweme.legoImp.task.TTMockTask;
import com.ss.android.ugc.aweme.legoImp.task.TasksHolder;
import com.ss.android.ugc.aweme.legoImp.task.ThreadPoolInjectTask;
import com.ss.android.ugc.aweme.legoImp.task.TokenResolverInitTask;
import com.ss.android.ugc.aweme.legoImp.task.TrackComputedTask;
import com.ss.android.ugc.aweme.legoImp.task.TrafficPerfMonitorTask;
import com.ss.android.ugc.aweme.legoImp.task.TtopInitTask;
import com.ss.android.ugc.aweme.legoImp.task.TtopMinisInitTask;
import com.ss.android.ugc.aweme.legoImp.task.WatcherTask;
import com.ss.android.ugc.aweme.legoImp.task.XiaomiMiniCardStatusCheckTask;
import com.ss.android.ugc.aweme.legoImp.task.ZeroVideoViewMonitorTask;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.ApmInit;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.InitAnywhereService;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.InitAwemeRuntime;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.InitQuotaTask;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.NetworkUtilsTask;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.RejectedExecutionHandler;
import com.ss.android.ugc.aweme.legoImp.task.btm.BtmGuardTask;
import com.ss.android.ugc.aweme.legoImp.task.btm.InitBtmSDKTask;
import com.ss.android.ugc.aweme.legoImp.task.crypto.CryptoInitTask;
import com.ss.android.ugc.aweme.legoImp.task.dm.DMHighPriorityAllThreadTask;
import com.ss.android.ugc.aweme.legoImp.task.dm.DMHighPriorityTask;
import com.ss.android.ugc.aweme.legoImp.task.mainProcessTask.FrescoSoLoadSetter;
import com.ss.android.ugc.aweme.legoImp.task.mainProcessTask.InitAdServiceTask;
import com.ss.android.ugc.aweme.legoImp.task.mainProcessTask.InitLegoInflate;
import com.ss.android.ugc.aweme.legoImp.task.mainProcessTask.MobMainSessionStartTask;
import com.ss.android.ugc.aweme.legoImp.task.observer_task.EventTrackingConsentListenerInitTask;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa.PumbaaTask;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa2.NewPumbaaTask;
import com.ss.android.ugc.aweme.legoImp.task.ug.CleanMemoryShortcutTask;
import com.ss.android.ugc.aweme.legoImp.task.ug.ObservationInitTask;
import com.ss.android.ugc.aweme.legoImp.task.ug.PreviousLoginPlatformSaveTask;
import com.ss.android.ugc.aweme.legoImp.task.uitask.AvatarInitTask;
import com.ss.android.ugc.aweme.legoImp.task.uitask.UIInitComposeTask;
import com.ss.android.ugc.aweme.legoImp.task.uitask.UIInitTask;
import com.ss.android.ugc.aweme.legoImp.task.webview.InitWebViewHookTask;
import com.ss.android.ugc.aweme.legoImpl.task.ABPreloadTask;
import com.ss.android.ugc.aweme.legoImpl.task.AccountExperimentExposeTask;
import com.ss.android.ugc.aweme.legoImpl.task.AdColdStartTask;
import com.ss.android.ugc.aweme.legoImpl.task.AppLifecycleMetricsTask;
import com.ss.android.ugc.aweme.legoImpl.task.BusinessAccountTask;
import com.ss.android.ugc.aweme.legoImpl.task.C2PAPluginInstallTask;
import com.ss.android.ugc.aweme.legoImpl.task.ColdBootLivePreParseDNSTask;
import com.ss.android.ugc.aweme.legoImpl.task.InitFireBase;
import com.ss.android.ugc.aweme.legoImpl.task.InitRouter;
import com.ss.android.ugc.aweme.legoImpl.task.KeepAliveBootstrapTask;
import com.ss.android.ugc.aweme.legoImpl.task.LegoRequestTask;
import com.ss.android.ugc.aweme.legoImpl.task.LobbyInitTask;
import com.ss.android.ugc.aweme.legoImpl.task.NujRequestTask;
import com.ss.android.ugc.aweme.legoImpl.task.OpenOnMuteTask;
import com.ss.android.ugc.aweme.legoImpl.task.OpenPlatformExperimentExposeTask;
import com.ss.android.ugc.aweme.legoImpl.task.PreloadInMeasureTriggerTask;
import com.ss.android.ugc.aweme.legoImpl.task.PushStartupTaskRejectStrategy;
import com.ss.android.ugc.aweme.legoImpl.task.ScreenShotFeedbackTask;
import com.ss.android.ugc.aweme.legoImpl.task.ScreenShotTask;
import com.ss.android.ugc.aweme.legoImpl.task.SecShareSdkTask;
import com.ss.android.ugc.aweme.legoImpl.task.TtopShareMessageReceiverTask;
import com.ss.android.ugc.aweme.legoImpl.task.UGFeatureInitTask;
import com.ss.android.ugc.aweme.legoImpl.task.dynamic_feature_plugin.PrioritizedPluginInitTask;
import com.ss.android.ugc.aweme.legoimpl.service.Dex2OatTask;
import com.ss.android.ugc.aweme.litemode.LiteModeInitTask;
import com.ss.android.ugc.aweme.memory.MemoryDeteriorationTask;
import com.ss.android.ugc.aweme.memory.task.MemoryLowPriorityOptimizeTask;
import com.ss.android.ugc.aweme.memory.task.MemoryOptimizeTask;
import com.ss.android.ugc.aweme.memory.task.MemoryStatTask;
import com.ss.android.ugc.aweme.music.MusicCollectTask;
import com.ss.android.ugc.aweme.notice.api.lego.InitNoticeTask;
import com.ss.android.ugc.aweme.offline.dogfood.autoupdate.IDogfoodUpdateService;
import com.ss.android.ugc.aweme.offline.ec.rax.impl.IEcRaxService;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import com.ss.android.ugc.aweme.power.PowerModeTask;
import com.ss.android.ugc.aweme.priority.GcThreadPriorityTask;
import com.ss.android.ugc.aweme.push.downgrade.NotifyPushStatusTask;
import com.ss.android.ugc.aweme.reliability.emergencychannel.EmergencyChannelByteSyncRegistrationTask;
import com.ss.android.ugc.aweme.request_combine.task.FetchABCommonTask;
import com.ss.android.ugc.aweme.request_combine.task.FetchCombineSettingsTask;
import com.ss.android.ugc.aweme.requesttask.background.PreCreatePlayerTask;
import com.ss.android.ugc.aweme.requesttask.idle.CAITTMStrategyCenterRequest;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoCustomRequest;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoGlobalInitTask;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoLocalRequest;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoLocalRequestV2;
import com.ss.android.ugc.aweme.requesttask.p0.FeedPreloadRequest;
import com.ss.android.ugc.aweme.series.feed.IDramaDiscoverColdStartTaskService;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import com.ss.android.ugc.aweme.series.feed.nujinsertion.DramaNUJInsertionTask;
import com.ss.android.ugc.aweme.service.IDogfoodFeedbackService;
import com.ss.android.ugc.aweme.service.IDogfoodPermissionService;
import com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.draft.IMigrateDraftLaunchService;
import com.ss.android.ugc.aweme.setting.services.IAppUpdateService;
import com.ss.android.ugc.aweme.shortcut.ShortcutInitTask;
import com.ss.android.ugc.aweme.sidebar.SidebarLegoTask;
import com.ss.android.ugc.aweme.spi.IAppBootTaskCustomLogic;
import com.ss.android.ugc.aweme.storage.StorageInfoCacheInitTask;
import com.ss.android.ugc.aweme.sync.ByteSyncSdkInitTask;
import com.ss.android.ugc.aweme.task.ABKevaAdvPreloadTask;
import com.ss.android.ugc.aweme.task.ClassLoaderPathOptTask;
import com.ss.android.ugc.aweme.task.hook.HookActivityTaskManagerTask;
import com.ss.android.ugc.aweme.task.hook.MainActivityLowMmProtectTask;
import com.ss.android.ugc.aweme.thread.ThreadDetectTask;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import com.ss.android.ugc.aweme.utils.InitServiceGroupTask;
import com.ss.android.ugc.aweme.utils.InitServiceTask;
import com.ss.android.ugc.aweme.utils.PreventServerSideCrashes;
import com.ss.android.ugc.aweme.utils.WebViewPreInitTask;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import com.ss.android.ugc.tiktok.pipo.saas.service.IPipoTTDependencyService;
import com.ss.android.ugc.tiktok.pipo.saas.service.PipoTTDependencyService;
import com.ss.android.ugc.tiktok.pns.IScreenTimeService;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService;
import com.tiktok.ttf.network.task.InitTTNetTask;
import defpackage.BrandTranssionInitTask;
import defpackage.InitFacebookApplinkTask;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class AwemeAppTaskProvider implements AppTaskProvider {
    @Override // com.ss.android.ugc.aweme.application.AppTaskProvider
    public final List<InterfaceC800080Va2> LIZ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new FixInflateCrashTask());
        arrayList.add(new MessageControllerTask());
        arrayList.add(new ScalpelConfigInitTask());
        InitBtmSDKTask initBtmSDKTask = InitBtmSDKTask.LL;
        initBtmSDKTask.getClass();
        if (InitBtmSDKTask.LJFF() == 4) {
            arrayList.add(initBtmSDKTask);
        }
        arrayList.add(AppLogInitTask.LL);
        arrayList.add(new PreloadStageTask(2));
        arrayList.add(new DMHighPriorityTask());
        arrayList.add(new DMHighPriorityAllThreadTask());
        arrayList.add(new ScopedIdInitTask());
        if (((Boolean) C308260C6m.LIZIZ.getValue()).booleanValue()) {
            arrayList.add(new TrafficPerfMonitorTask());
        }
        if (!C1832107Fn.LIZ) {
            C809360Vp0.LIZ(C1BWL.LIZ());
            arrayList.add(InitPushTask.LIZ());
        }
        arrayList.add(PlayerConfigInitTask.LIZ());
        arrayList.add(new MediaStrategyInitTask());
        if (C07JG.LIZ()) {
            arrayList.add(NewUserVodInitTask.LIZ());
        } else {
            arrayList.add(PlayerKitInitTask.LIZ());
            arrayList.add(PlayerKitCommonWidgetInitTask.LL);
        }
        C0CCZ preloadInstanceTask = ((IMainService) ServiceManager.get().getService(IMainService.class)).getPreloadInstanceTask();
        if (preloadInstanceTask != null) {
            arrayList.add(preloadInstanceTask);
        }
        arrayList.add(LIZLLL().LIZIZ());
        arrayList.add(LIZLLL().LJIIL());
        if (((Number) AnonymousClass0716.LJII.getValue()).intValue() == 1) {
            arrayList.add(ColdBootLivePreParseDNSTask.LL);
        }
        arrayList.add(BenchmarkCollectionInitService.createIBenchmarkCollectionInitServicebyMonsterPlugin(false).getBenchmarkCollectionInitTask());
        if (!C1866440yfa.LIZ()) {
            arrayList.add(UIInitTask.LL);
        }
        arrayList.add(UIInitComposeTask.LL);
        arrayList.add(new InitLegoInflate());
        if (((Boolean) AnonymousClass0716.LJIIL.getValue()).booleanValue()) {
            arrayList.add(new InitWebViewHookTask());
        }
        C1BX5 c1bx5 = C1BX5.LIZIZ;
        arrayList.add(c1bx5.LJIILIIL());
        arrayList.add(c1bx5.LJIJJ());
        arrayList.add(c1bx5.LJIJI());
        arrayList.add(c1bx5.LJJ());
        arrayList.add(c1bx5.LJII());
        if (C0CBO.LIZ() == 2) {
            arrayList.add(c1bx5.LJIIZILJ());
        }
        arrayList.add(new SmartServicePreloadTask());
        arrayList.add(new InitQuotaTask());
        arrayList.add(new NewPumbaaTask());
        C844470XAv.LIZ.getClass();
        if (!Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
            try {
                arrayList.add(new PumbaaTask());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C805380Via.LIZIZ(th);
            }
        }
        C1BX8 c1bx8 = C1BX8.LIZIZ;
        arrayList.add(c1bx8.LJI());
        arrayList.add(new NotifyPushStatusTask());
        arrayList.add(new ResetTTNetworkStateIndexTask());
        arrayList.add(new InitStorageManagerTask());
        arrayList.add(C0COI.LIZIZ.LIZIZ());
        arrayList.add(new EmergencyChannelByteSyncRegistrationTask());
        arrayList.add(new ByteSyncSdkInitTask());
        IMContactApi.LIZ.getClass();
        arrayList.add(C069P.LIZ().LIZ().LJIIIZ());
        arrayList.add(C1263390iyv.LIZIZ.LIZIZ());
        if (!C2206241BWk.LIZ()) {
            arrayList.add(new WatcherTask());
            arrayList.add(new InitServiceTask(new Runnable() { // from class: X.0VP3
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("GoogleServiceEnableInitRunnable@9c8d.run");
                    try {
                        C792850V8h.LIZ = new Callable() { // from class: X.0VP4
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                C1C7U.LIZ("GoogleServiceEnableInitRunnable@9c8d.run$1");
                                Boolean boolValueOf = Boolean.valueOf(C0V4W.LIZ());
                                C1C7U.LIZIZ("GoogleServiceEnableInitRunnable@9c8d.run$1");
                                return boolValueOf;
                            }
                        };
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("GoogleServiceEnableInitRunnable@9c8d.run");
                }
            }));
            arrayList.add(PowerPageTask.LL);
            arrayList.add(LIZLLL().LJIIJ());
        }
        if (!C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "safeview_task_downgrade", true, false)) {
            arrayList.add(C1BX7.LIZIZ.LIZLLL());
        }
        arrayList.add(new NewUserTask());
        arrayList.add(new ThreadPoolInjectTask());
        if (!C1E21.LIZIZ()) {
            arrayList.add(TasksHolder.LIZIZ());
        }
        arrayList.add(new StarshipStrategyTask());
        arrayList.add(new StarshipFetchTask());
        arrayList.add(new FriendsTabInitTask());
        arrayList.add(new PhotosAuthInitTask());
        arrayList.add(new RetryUnsuccessfulPublishTask());
        arrayList.add(C2206208ke.LIZIZ.LIZ());
        arrayList.add(new AiMojiSyncLegoTask());
        arrayList.add(((ISocialAvatarCreationStatusService) ServiceManager.get().getService(ISocialAvatarCreationStatusService.class)).LIZLLL());
        arrayList.add(((IStrategyPlatformService) ServiceManager.get().getService(IStrategyPlatformService.class)).LJFF());
        arrayList.add(new BrandTranssionInitTask());
        if (!((Boolean) C07DE.LIZIZ.getValue()).booleanValue()) {
            arrayList.add(C788100Uvo.LIZ ? new InitTTNetTask() : new com.ss.android.ugc.aweme.legoImp.task.InitTTNetTask());
        }
        arrayList.add(new GeckoCustomRequest());
        if (TasksHolder.LIZJ == null) {
            TasksHolder.LIZJ = C1BXS.LIZIZ.LIZIZ();
        }
        arrayList.add(TasksHolder.LIZJ);
        arrayList.add(new GeckoGlobalInitTask());
        arrayList.add(new CAITTMStrategyCenterRequest());
        arrayList.add(BusinessToolsTask.LIZ());
        arrayList.add(new FontTask());
        arrayList.add(new NewLivePrefetchLoadOptTask());
        arrayList.add(new LivePrefetchLoadOptTask());
        C0CCZ initTask = C2277711EDh.LIZIZ.getInitTask();
        if (initTask != null) {
            arrayList.add(initTask);
        }
        arrayList.add(new SurveyTask());
        C1BX7 c1bx7 = C1BX7.LIZIZ;
        arrayList.add(c1bx7.LIZIZ());
        if (!((Boolean) C1211404oa.LIZ.getValue()).booleanValue()) {
            arrayList.add(c1bx8.LIZ());
        }
        arrayList.add(c1bx8.LJFF());
        arrayList.add(c1bx8.LJ());
        arrayList.add(c1bx8.LJIIIZ());
        ((IToolsDebugGpService) ServiceManager.get().getService(IToolsDebugGpService.class)).LIZIZ();
        C01GW c01gw = C275720ArK.LIZ;
        if (((Number) c01gw.getValue()).intValue() != 0) {
            int iIntValue = ((Number) c01gw.getValue()).intValue();
            arrayList.add(c1bx7.LIZ(iIntValue != 1 ? iIntValue != 2 ? EnumC799870VZh.MAIN : EnumC799870VZh.BACKGROUND : EnumC799870VZh.FIRST_WINDOW_FOCUS));
        }
        arrayList.add(InitFireBase.LIZ());
        TopViewPreloadJsonTask topViewPreloadJsonTaskLJJIJLIJ = ((ISplashAdService) ServiceManager.get().getService(ISplashAdService.class)).LJJIJLIJ();
        if (topViewPreloadJsonTaskLJJIJLIJ != null) {
            arrayList.add(topViewPreloadJsonTaskLJJIJLIJ);
        }
        RealTimeSplashTask realTimeSplashTaskLJIL = ((ISplashAdService) ServiceManager.get().getService(ISplashAdService.class)).LJIL();
        if (realTimeSplashTaskLJIL != null) {
            arrayList.add(realTimeSplashTaskLJIL);
        }
        if (!((Boolean) C2279461EKa.LIZJ.getValue()).booleanValue()) {
            if (InitModules.LL == null) {
                InitModules.LL = new InitModules();
            }
            arrayList.add(InitModules.LL);
        }
        arrayList.add(new EmojiTask());
        arrayList.add(new GeckoLocalRequestV2());
        arrayList.add(new GeckoLocalRequest());
        arrayList.add(new IBEPreloadTask());
        arrayList.add(new AdHybridTask());
        arrayList.add(((IMeasurementService) ServiceManager.get().getService(IMeasurementService.class)).LJ());
        arrayList.add(new LiveBootFinishSettingTask());
        arrayList.add(ApmInit.LL);
        arrayList.add(new AvatarInitTask());
        IDramaDiscoverColdStartTaskService iDramaDiscoverColdStartTaskService = (IDramaDiscoverColdStartTaskService) PluggableExtentionKt.pluggableSpi$default(IDramaDiscoverColdStartTaskService.class, false, false, false, 14, null);
        if (iDramaDiscoverColdStartTaskService != null) {
            iDramaDiscoverColdStartTaskService.LIZ();
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.application.AppTaskProvider
    public final List<InterfaceC800080Va2> LIZIZ() {
        InterfaceC1577520r9a interfaceC1577520r9aLIZIZ;
        SplashAdManagerPreloadTask splashAdManagerPreloadTaskLJJIL;
        ISplashAdService iSplashAdService;
        SplashAdManagerPreloadTask splashAdManagerPreloadTaskLJJIL2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new PreloadStageTask(1));
        C01GW c01gw = C1251804v6.LIZJ;
        if (((Boolean) c01gw.getValue()).booleanValue() && (iSplashAdService = (ISplashAdService) ServiceManager.get().getService(ISplashAdService.class)) != null && (splashAdManagerPreloadTaskLJJIL2 = iSplashAdService.LJJIL()) != null) {
            arrayList.add(splashAdManagerPreloadTaskLJJIL2);
        }
        arrayList.add(InitAVModule.LJIIIIZZ());
        List list = (List) C303040BuI.LIZIZ.getValue();
        if (list != null && list.contains("/aweme/v2/feed/")) {
            arrayList.add(new FeedPreloadRequest(null, null, null, null, null, 0, null, false, false, 511));
        }
        arrayList.add(new JatoInitTask());
        arrayList.add(new ALogNativeOptTask());
        arrayList.add(SplitCompatInstall.LL);
        arrayList.add(new ClassLoaderPathOptTask());
        arrayList.add(new WebViewPreInitTask());
        arrayList.add(new RejectedExecutionHandler());
        arrayList.add(TasksHolder.LIZ());
        arrayList.add(new ABPreloadTask());
        arrayList.add(new SPKevaPreloadTaskV3());
        arrayList.add(new PreloadColdBootKevaValueTask());
        arrayList.add(new IoPreloadTask());
        arrayList.add(new ZeroVideoViewMonitorTask());
        arrayList.add(new BPEAPreloadTask());
        arrayList.add(new TokenResolverInitTask());
        arrayList.add(InitAdServiceTask.LL);
        arrayList.add(new BindFrescoTask());
        arrayList.add(new FrescoSoLoadSetter());
        arrayList.add(new PreloadWireFieldNoEnumClassTask());
        arrayList.add(new InitServiceTask(new C14B1()));
        if (TasksHolder.LIZLLL == null) {
            TasksHolder.LIZLLL = C0CKL.LIZIZ.LIZIZ();
        }
        arrayList.add(TasksHolder.LIZLLL);
        InitBtmSDKTask initBtmSDKTask = InitBtmSDKTask.LL;
        initBtmSDKTask.getClass();
        if (InitBtmSDKTask.LJFF() == 3) {
            arrayList.add(initBtmSDKTask);
        }
        arrayList.add(C04U9.LIZIZ.LIZ());
        arrayList.add(new StoreRegionInitTask());
        arrayList.add(new FeedRequestParamPreloadTask());
        C1BX8 c1bx8 = C1BX8.LIZIZ;
        arrayList.add(c1bx8.LJIIIIZZ());
        if (((Boolean) C1211404oa.LIZ.getValue()).booleanValue()) {
            arrayList.add(c1bx8.LIZ());
        }
        arrayList.add(new PreventServerSideCrashes());
        arrayList.add(new MobMainSessionStartTask());
        arrayList.add(new ResIdentifierOptTask());
        if (!((Boolean) c01gw.getValue()).booleanValue() && (splashAdManagerPreloadTaskLJJIL = ((ISplashAdService) ServiceManager.get().getService(ISplashAdService.class)).LJJIL()) != null) {
            arrayList.add(splashAdManagerPreloadTaskLJJIL);
        }
        arrayList.add(new InitThreadPoolBlockNumTask());
        arrayList.add(new InitFrescoCoreTask());
        arrayList.add(new InitFakeMainTask());
        arrayList.add(new InitRewordTask());
        ISeriesFeedService iSeriesFeedService = (ISeriesFeedService) PluggableExtentionKt.pluggableSpi$default(ISeriesFeedService.class, false, false, false, 14, null);
        if (iSeriesFeedService != null && (interfaceC1577520r9aLIZIZ = iSeriesFeedService.LIZIZ()) != null) {
            interfaceC1577520r9aLIZIZ.LJIILIIL();
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.application.AppTaskProvider
    public final List<InterfaceC800080Va2> LIZJ() {
        IPipoTTDependencyService iPipoTTDependencyService;
        InterfaceC1577280r9C interfaceC1577280r9CLIZ;
        DramaNUJInsertionTask dramaNUJInsertionTaskLJIJ;
        C0CCZ oneTapLoginPreloadTask;
        C0CCZ preloadTask;
        IHomeTabService iHomeTabService;
        SidebarLegoTask sidebarLegoTaskLIZLLL;
        C0CCZ migrateDraftTask;
        List<C0CCZ> listLIZIZ;
        DelayedConsentConfigInitTask delayedConsentConfigInitTaskLIZIZ;
        PrioritizedConsentConfigInitTask prioritizedConsentConfigInitTaskLIZ;
        ArrayList arrayList = new ArrayList();
        if (((Boolean) C308260C6m.LIZJ.getValue()).booleanValue()) {
            arrayList.add(new TrafficPerfMonitorTask());
        }
        arrayList.add(new InferenceEngineTask());
        arrayList.add(new NewUserPreloadTask());
        arrayList.add(InitRouter.LJ());
        arrayList.add(new SetMainThreadPriorityTask());
        arrayList.add(new CommonParamsInitTask());
        if (((Number) C296320BjS.LIZ.getValue()).intValue() > 0) {
            arrayList.add(new FriendsRedDotDeferredTask());
        }
        if (Build.VERSION.SDK_INT > 23) {
            arrayList.add(C1BX8.LIZIZ.LIZIZ());
        }
        if (!((Boolean) C1E21.LJ.getValue()).booleanValue()) {
            C799900VZk c799900VZk = C799900VZk.LIZ;
            C1592110rX7 c1592110rX7 = C1592110rX7.LIZIZ;
            InterfaceC799850VZf interfaceC799850VZfLIZIZ = c1592110rX7.LIZIZ();
            c799900VZk.getClass();
            C799820VZc c799820VZc = C799900VZk.LIZLLL;
            c799820VZc.LIZ(interfaceC799850VZfLIZIZ.key(), interfaceC799850VZfLIZIZ);
            InterfaceC799850VZf interfaceC799850VZfLIZ = c1592110rX7.LIZ();
            c799820VZc.LIZ(interfaceC799850VZfLIZ.key(), interfaceC799850VZfLIZ);
            if (!C0BSP.LIZ) {
                arrayList.add(ArsenalPreloadInitTask.LLILLJJLI);
            }
            arrayList.add(AssemExperimentParamInitTask.LL);
            arrayList.add(AssemInitTask.LL);
            arrayList.add(PageTask.LL);
            arrayList.add(MotaInitTask.LL);
            IDogfoodPermissionService iDogfoodPermissionService = (IDogfoodPermissionService) PluggableExtentionKt.pluggableSpi$default(IDogfoodPermissionService.class, false, false, false, 14, null);
            if (iDogfoodPermissionService != null) {
                iDogfoodPermissionService.LIZ();
            }
            arrayList.add(ScreenShotTask.LL);
            arrayList.add(ScreenShotFeedbackTask.LL);
            arrayList.add(ImMediaShareService.LIZIZ().LIZ());
            arrayList.add(new PreDrawableInflate());
        }
        arrayList.add(new MainActivityLowMmProtectTask());
        arrayList.add(new HookActivityTaskManagerTask());
        if (((Number) AnonymousClass0716.LJII.getValue()).intValue() == 2) {
            arrayList.add(ColdBootLivePreParseDNSTask.LL);
        }
        arrayList.add(new LegacyTask());
        IDramaDiscoverColdStartTaskService iDramaDiscoverColdStartTaskService = (IDramaDiscoverColdStartTaskService) PluggableExtentionKt.pluggableSpi$default(IDramaDiscoverColdStartTaskService.class, false, false, false, 14, null);
        if (iDramaDiscoverColdStartTaskService != null) {
            iDramaDiscoverColdStartTaskService.LIZIZ();
        }
        arrayList.add(new AdColdStartTask());
        arrayList.add(new InitAnywhereService());
        arrayList.add(new PitayaPreInitTask());
        arrayList.add(new AppLifecycleMetricsTask());
        arrayList.add(new AutoAdjustVolumeTask());
        arrayList.add(new OpenOnMuteTask());
        arrayList.add(new CustomAnchorInitTask());
        arrayList.add(new NetworkUtilsTask());
        if (!C2206241BWk.LIZ()) {
            arrayList.add(new InitServiceTask(new C0CBN()));
            arrayList.add(new InitServiceTask(new C0CBS()));
        }
        arrayList.add(new SecShareSdkTask());
        arrayList.add(new JsBridge2InitTask(EnumC799870VZh.MAIN));
        arrayList.add(new InitAwemeRuntime());
        arrayList.add(new TTMockTask());
        arrayList.add(LIZLLL().LJ());
        arrayList.add(new InitFramework());
        arrayList.add(new PreloadMediaCodecListTask());
        if (((Boolean) C07HQ.LIZIZ.getValue()).booleanValue()) {
            arrayList.add(new AdjustMusicVolume());
        }
        arrayList.add(((IAccountInitializerTaskApi) PluggableExtentionKt.pluggableSpi$default(IAccountInitializerTaskApi.class, false, false, false, 14, null)).LIZJ());
        arrayList.add(new InitMusicManager());
        arrayList.add(new PowerInitTask());
        if (!C2206241BWk.LIZ()) {
            arrayList.add(new InitReportSignature());
            arrayList.add(new SetupMainServiceForJsb());
            arrayList.add(new InitServiceTask(new Runnable() { // from class: X.0579
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("TraceConfigInitRunnable@1bac.run");
                    try {
                        new C791890V4p();
                        LauncherServiceImpl.LIZLLL().LIZIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TraceConfigInitRunnable@1bac.run");
                }
            }));
        }
        if (!((Boolean) C285090BFj.LJJIIJZLJL.getValue()).booleanValue()) {
            arrayList.add(((IAccountInitializerTaskApi) PluggableExtentionKt.pluggableSpi$default(IAccountInitializerTaskApi.class, false, false, false, 14, null)).LIZLLL());
        }
        arrayList.add(new FixFocusedViewLeak());
        arrayList.add(new InitAbTest());
        arrayList.add(new PopupConfigTask());
        arrayList.add(new ObserveDeviceRegister());
        arrayList.add(new ObservationInitTask());
        arrayList.add(new PreviousLoginPlatformSaveTask());
        arrayList.add(new CleanMemoryShortcutTask());
        arrayList.add(new PrioritizedPluginInitTask());
        IConsentConfigInitTaskService iConsentConfigInitTaskService = (IConsentConfigInitTaskService) PluggableExtentionKt.pluggableSpi$default(IConsentConfigInitTaskService.class, false, false, false, 14, null);
        if (iConsentConfigInitTaskService != null && (prioritizedConsentConfigInitTaskLIZ = iConsentConfigInitTaskService.LIZ()) != null) {
            arrayList.add(prioritizedConsentConfigInitTaskLIZ);
        }
        arrayList.add(new NewUserPrefetchABSettingsTask());
        arrayList.add(C848110XOv.LIZ);
        IConsentConfigInitTaskService iConsentConfigInitTaskService2 = (IConsentConfigInitTaskService) PluggableExtentionKt.pluggableSpi$default(IConsentConfigInitTaskService.class, false, false, false, 14, null);
        if (iConsentConfigInitTaskService2 != null && (delayedConsentConfigInitTaskLIZIZ = iConsentConfigInitTaskService2.LIZIZ()) != null) {
            arrayList.add(delayedConsentConfigInitTaskLIZIZ);
        }
        arrayList.add(new UGFeatureInitTask());
        arrayList.add(new TtopShareMessageReceiverTask());
        arrayList.add(new ABClientIDTask());
        arrayList.add(new ABCacheOptInitTask());
        arrayList.add(new LobbyInitTask());
        arrayList.add(new RegisterScreenBroadcastReceiverTask());
        arrayList.add(new CheckUpdateChangeDeviceIDTask());
        if (C0CBO.LIZ() != 2) {
            arrayList.add(C1BX5.LIZIZ.LJIIZILJ());
        }
        C1BX5 c1bx5 = C1BX5.LIZIZ;
        arrayList.add(c1bx5.LJIIJ());
        arrayList.add(new BulletAssemblerInitTask());
        arrayList.add(((IAccountInitializerTaskApi) PluggableExtentionKt.pluggableSpi$default(IAccountInitializerTaskApi.class, false, false, false, 14, null)).LIZIZ());
        arrayList.add(new AccountExperimentExposeTask());
        arrayList.add(new PerformanceHelperTask());
        arrayList.add(new OpenPlatformExperimentExposeTask());
        arrayList.add(new TrackComputedTask());
        arrayList.add(new InitNoticeTask());
        arrayList.add(new InitServiceGroupTask(new Runnable[]{new Runnable() { // from class: X.087g
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("NewUserHookInitRunnable@dce7.run");
                try {
                    ((IInitAllService) ServiceManager.get().getService(IInitAllService.class)).LJII(C1BWL.LIZ());
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("NewUserHookInitRunnable@dce7.run");
            }
        }}));
        arrayList.add(new InitServiceGroupTask(new Runnable[]{new Runnable() { // from class: X.0X9V
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AppendLifecycleInitRunnable@532d.run");
                try {
                    C2214201BlK.LIZ.LJJLIIJ().LJJLJLI(new C09JN() { // from class: X.0X9T
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("AppendLifecycleInitRunnable@532d.run$1");
                            Activity activity = ((C0X4A) obj).LIZ;
                            if (activity != null) {
                                InterfaceC19262510Xn interfaceC19262510XnLJ = ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LJ();
                                activity.getApplication();
                                String canonicalName = activity.getClass().getCanonicalName();
                                if (canonicalName == null) {
                                    canonicalName = "";
                                }
                                interfaceC19262510XnLJ.LJ(canonicalName);
                            }
                            C1C7U.LIZIZ("AppendLifecycleInitRunnable@532d.run$1");
                        }
                    });
                    C2214201BlK.LIZIZ.LJJLIIJ().LJJIL(C2079508Cr.LL).LJJLL(new C09JN() { // from class: X.0X9W
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("AppendLifecycleInitRunnable@532d.run$2");
                            final C0X4A c0x4a = (C0X4A) obj;
                            ExecutorService executorServiceLIZJ = C823050WQl.LIZJ();
                            final C0X9V c0x9v = this.LL;
                            executorServiceLIZJ.execute(new Runnable() { // from class: X.10Up
                                public final void LIZ() {
                                    Intent intent;
                                    C0X9V c0x9v2 = c0x9v;
                                    C0X4A c0x4a2 = c0x4a;
                                    Activity activity = c0x4a2.LIZ;
                                    Bundle bundle = c0x4a2.LIZIZ;
                                    c0x9v2.getClass();
                                    C799900VZk.LIZ.getClass();
                                    C799890VZj c799890VZj = new C799890VZj();
                                    CommentService.LIZ.getClass();
                                    c799890VZj.LIZ(C523420Kfs.LIZ().LLF(activity));
                                    c799890VZj.LIZ(FollowFeedServiceImpl.LJIL().LJIIIIZZ(activity));
                                    c799890VZj.LIZ(((IUnKnownOwnershipBusinessOuterService) ServiceManager.get().getService(IUnKnownOwnershipBusinessOuterService.class)).LJII());
                                    c799890VZj.LIZ(new NujRequestTask());
                                    c799890VZj.LIZ(((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LJFF(bundle, !ColdBootTasksDegradeExperiment.LIZ().reportActivityStatusTask));
                                    c799890VZj.LIZ(C1336205Ku.LIZJ().LJFF());
                                    Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(IAccountOutBridgeService.class, false, false, false, 14, null);
                                    if (objPluggableSpi$default == null) {
                                        "Required value was null.".toString();
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                    c799890VZj.LIZ(((IAccountOutBridgeService) objPluggableSpi$default).LIZIZ());
                                    c799890VZj.LIZ(new StorageClearTask());
                                    c799890VZj.LIZ(new PowerModeTask());
                                    C07MK.LIZ.getClass();
                                    if (!C07MK.LIZ()) {
                                        c799890VZj.LIZ(new LegoRequestTask());
                                    }
                                    CommentPreloadInstanceTask commentPreloadInstanceTaskLJJJJLI = C523420Kfs.LIZ().LJJJJLI();
                                    if (commentPreloadInstanceTaskLJJJJLI != null) {
                                        c799890VZj.LIZ(commentPreloadInstanceTaskLJJJJLI);
                                    }
                                    c799890VZj.LIZ(((IAppUpdateService) ServiceManager.get().getService(IAppUpdateService.class)).LIZJ());
                                    c799890VZj.LIZ(new BaseOptFirstFrameTask());
                                    if (!C07MK.LIZ() || activity == null || (intent = activity.getIntent()) == null || !intent.getBooleanExtra(C19254610Um.LIZIZ.LJJIJIL(), false)) {
                                        c799890VZj.LIZ(new PreCreatePlayerTask());
                                    }
                                    c799890VZj.LIZ(new ThreadDetectTask());
                                    c799890VZj.LIZ(((IUnKnownOwnershipBusinessOuterService) ServiceManager.get().getService(IUnKnownOwnershipBusinessOuterService.class)).LJIIJ());
                                    C0CCZ profilePageModelPreloadTask = C2277881EDy.LIZIZ.getProfilePageModelPreloadTask();
                                    if (profilePageModelPreloadTask != null) {
                                        c799890VZj.LIZ(profilePageModelPreloadTask);
                                    }
                                    c799890VZj.LIZIZ();
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ2;
                                    C1C7U.LIZ("AppendLifecycleInitRunnable@532d.run$2$1");
                                    try {
                                        LIZ();
                                    } finally {
                                        if (!zLIZ2) {
                                        }
                                    }
                                    C1C7U.LIZIZ("AppendLifecycleInitRunnable@532d.run$2$1");
                                }
                            });
                            C1C7U.LIZIZ("AppendLifecycleInitRunnable@532d.run$2");
                        }
                    }, new C09JN() { // from class: X.0X9U
                        @Override // X.C09JN
                        public final /* bridge */ /* synthetic */ void accept(Object obj) {
                            C1C7U.LIZ("AppendLifecycleInitRunnable@532d.run$3");
                            C1C7U.LIZIZ("AppendLifecycleInitRunnable@532d.run$3");
                        }
                    });
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AppendLifecycleInitRunnable@532d.run");
            }
        }}));
        arrayList.add(new FetchUltimateComplianceSettingsTask());
        arrayList.add(new GoogleColdStartServiceTask());
        arrayList.add(new InitKitaTask());
        arrayList.add(new LiveInjectContextTask());
        arrayList.add(new InitFeedPlatformTask());
        arrayList.add(new InitFeedTabSlideTask());
        arrayList.add(new EventTrackingConsentListenerInitTask());
        arrayList.add(InitShareSdkTask.LL);
        arrayList.add(InitDeeplinkSdkTask.LL);
        arrayList.add(new MusicCollectTask());
        Object objLIZ = C04TD.LIZ(IPipoTTDependencyService.class, false);
        if (objLIZ != null) {
            iPipoTTDependencyService = (IPipoTTDependencyService) objLIZ;
        } else {
            if (C04TD.X6 == null) {
                synchronized (IPipoTTDependencyService.class) {
                    if (C04TD.X6 == null) {
                        C04TD.X6 = new PipoTTDependencyService();
                    }
                }
            }
            iPipoTTDependencyService = C04TD.X6;
        }
        arrayList.add(iPipoTTDependencyService.LIZ());
        IDogfoodUpdateService iDogfoodUpdateService = (IDogfoodUpdateService) PluggableExtentionKt.pluggableSpi$default(IDogfoodUpdateService.class, false, false, false, 14, null);
        if (iDogfoodUpdateService != null) {
            iDogfoodUpdateService.LIZ();
        }
        IDogfoodFeedbackService iDogfoodFeedbackService = (IDogfoodFeedbackService) PluggableExtentionKt.pluggableSpi$default(IDogfoodFeedbackService.class, false, false, false, 14, null);
        if (iDogfoodFeedbackService != null) {
            iDogfoodFeedbackService.getInitTask();
        }
        arrayList.add(new GetDigitalWellbeingSettingsTask());
        arrayList.add(new InitInnerPushTask());
        arrayList.add(InitAppsFlyer.LJ());
        arrayList.add(new LogCleanTask());
        IAppBootTaskCustomLogic iAppBootTaskCustomLogic = (IAppBootTaskCustomLogic) PluggableExtentionKt.pluggableSpi$default(IAppBootTaskCustomLogic.class, false, false, false, 14, null);
        if (iAppBootTaskCustomLogic != null) {
            iAppBootTaskCustomLogic.LIZIZ();
        }
        C1602860roS c1602860roS = C1602860roS.LIZ;
        c1602860roS.getClass();
        if (C1602860roS.LJ()) {
            arrayList.add(new InitFacebookAdsTask());
        }
        arrayList.add(new InitFacebookApplinkTask());
        arrayList.add(new SetupTestSpHost());
        EnumC799870VZh enumC799870VZh = EnumC799870VZh.BACKGROUND;
        arrayList.add(new GetGoogleAIdTask(enumC799870VZh));
        arrayList.add(new AssistantTask());
        arrayList.add(new CronyManagerTask());
        arrayList.add(C1BX8.LIZIZ.LJII());
        arrayList.add(CryptoInitTask.LL);
        ILocationService iLocationService = (ILocationService) ServiceManager.get().getService(ILocationService.class);
        C0CCZ c0cczLJFF = iLocationService != null ? iLocationService.LJFF() : null;
        if (c0cczLJFF != null) {
            arrayList.add(c0cczLJFF);
        }
        if (!C2206241BWk.LIZ()) {
            arrayList.add(new PowerPermissionsTask());
        }
        arrayList.add(ApmInit.LL);
        arrayList.add(new MiloInitTask());
        boolean z = C0XKT.LIZIZ() == 1;
        C0XKT.LIZ(1, z);
        if (z) {
            arrayList.add(new OrbuInitTask());
        }
        arrayList.add(new FluencySdkInitTask());
        arrayList.add(new InitLottieOptTask());
        arrayList.add(new ExperienceKitInitTask());
        arrayList.add(new DeeplinkPrefetchTask());
        arrayList.add(new InitPageMonitorTask());
        if (!((Boolean) AnonymousClass0716.LJIIL.getValue()).booleanValue()) {
            arrayList.add(new InitWebViewHookTask());
        }
        arrayList.add(new FetchCombineSettingsTask());
        arrayList.add(new FetchABCommonTask());
        arrayList.add(new MemoryDeteriorationTask(((Boolean) C282480B5i.LIZ.getValue()).booleanValue() ? EnumC799870VZh.BOOT_FINISH : enumC799870VZh));
        if (((Boolean) C0B7B.LIZ.getValue()).booleanValue()) {
            arrayList.add(new GcThreadPriorityTask(enumC799870VZh));
        }
        if (C2406609bs.LIZ()) {
            arrayList.add(C1BX7.LIZIZ.LJIIIIZZ(enumC799870VZh));
        }
        arrayList.add(new MemoryOptimizeTask());
        arrayList.add(new MemoryLowPriorityOptimizeTask());
        arrayList.add(new MemoryStatTask(C089K.LIZ() ? enumC799870VZh : EnumC799870VZh.BOOT_FINISH));
        if (((Boolean) C0B79.LIZ.getValue()).booleanValue()) {
            arrayList.add(new JatoBootFinishTask(enumC799870VZh));
        }
        arrayList.add(new LiveGiftAssetStatisticTask());
        arrayList.add(new ShortcutInitTask());
        arrayList.add(new FirebaseConfigCheckTask());
        arrayList.add(new NewUserJourneyDialogCleanTask());
        arrayList.add(new PipInitTask());
        List<C0CCZ> initTask = C1593730rZj.LIZIZ.getInitTask();
        if (initTask != null) {
            arrayList.addAll(initTask);
        }
        arrayList.add(new AccessibilityEventTrackingTask());
        InitBtmSDKTask initBtmSDKTask = InitBtmSDKTask.LL;
        initBtmSDKTask.getClass();
        if (!InitBtmSDKTask.LJ()) {
            arrayList.add(initBtmSDKTask);
        }
        arrayList.add(c1bx5.LJIIL());
        IFeedAppDetectService iFeedAppDetectService = (IFeedAppDetectService) PluggableExtentionKt.pluggableSpi$default(IFeedAppDetectService.class, false, false, false, 14, null);
        if (iFeedAppDetectService != null && (listLIZIZ = iFeedAppDetectService.LIZIZ()) != null) {
            arrayList.addAll(listLIZIZ);
        }
        arrayList.add(new XiaomiMiniCardStatusCheckTask());
        arrayList.add(PreloadInMeasureTriggerTask.LL);
        C0CCZ c0cczLJI = ComplianceServiceProvider.LJIJI().LJI();
        if (c0cczLJI != null) {
            arrayList.add(c0cczLJI);
        }
        arrayList.add(((IScreenTimeService) ServiceManager.get().getService(IScreenTimeService.class)).initialize());
        arrayList.add(((IScreenTimeService) ServiceManager.get().getService(IScreenTimeService.class)).LJ());
        IAppBootTaskCustomLogic iAppBootTaskCustomLogic2 = (IAppBootTaskCustomLogic) PluggableExtentionKt.pluggableSpi$default(IAppBootTaskCustomLogic.class, false, false, false, 14, null);
        if (iAppBootTaskCustomLogic2 != null) {
            iAppBootTaskCustomLogic2.LIZ();
        }
        if (((Boolean) C274890Apz.LIZ.getValue()).booleanValue()) {
            arrayList.add(new LiveStreamStrategyInitTask());
        }
        arrayList.add(new TtopMinisInitTask());
        arrayList.add(new TtopInitTask());
        arrayList.add(new EcommerceLazyInitTask());
        IEcRaxService iEcRaxService = (IEcRaxService) PluggableExtentionKt.pluggableSpi$default(IEcRaxService.class, false, false, false, 14, null);
        if (iEcRaxService != null) {
            iEcRaxService.getInitTask();
        }
        arrayList.add(new ProcessMonitorTask());
        c1602860roS.getClass();
        if (C1602860roS.LJI() == 1) {
            arrayList.add(new ColdStartThreadPriorityOpt(enumC799870VZh));
        } else if (C2187891Ajz.LIZ() > 0) {
            arrayList.add(new ColdStartThreadPriorityOpt(enumC799870VZh));
            arrayList.add(new ColdStartThreadPriorityOpt(EnumC799870VZh.BOOT_FINISH));
        }
        arrayList.add(new LivePipoInitOptimizeTask());
        arrayList.add(new C2PAPluginInstallTask());
        if (((Boolean) C1866350yfR.LIZJ.getValue()).booleanValue()) {
            arrayList.add(new Dex2OatTask());
        }
        arrayList.add(new NxETInitTask());
        arrayList.add(new RequestCoordinateInitTask());
        arrayList.add(new AppLogSessionMonitorInitTask());
        arrayList.add(new BusinessAccountTask());
        ComplianceServiceProvider.LIZIZ.getClass();
        C0CCZ c0cczLIZ = ComplianceServiceProvider.LJIIJ().LIZ();
        if (c0cczLIZ != null) {
            arrayList.add(c0cczLIZ);
        }
        arrayList.add(new CpuTask());
        if (C288570BSt.LIZ()) {
            arrayList.add(StorageInfoCacheInitTask.LL);
            arrayList.add(new M2StorageCleanInitTask());
        }
        IMigrateDraftLaunchService iMigrateDraftLaunchService = (IMigrateDraftLaunchService) PluggableExtentionKt.pluggableSpi$default(IMigrateDraftLaunchService.class, false, false, false, 14, null);
        if (iMigrateDraftLaunchService != null && (migrateDraftTask = iMigrateDraftLaunchService.getMigrateDraftTask()) != null) {
            arrayList.add(migrateDraftTask);
        }
        arrayList.add(new DiagnosisRunnableMonitorTask());
        if (((Boolean) C255620A0a.LIZIZ.getValue()).booleanValue()) {
            arrayList.add(DiagnosisDropFrameMonitorTask.LL);
        }
        if (C0AD1.LIZ() && (iHomeTabService = (IHomeTabService) PluggableExtentionKt.pluggableSpi$default(IHomeTabService.class, false, false, false, 14, null)) != null && (sidebarLegoTaskLIZLLL = iHomeTabService.LIZLLL()) != null) {
            arrayList.add(sidebarLegoTaskLIZLLL);
        }
        arrayList.addAll(ComplianceServiceProvider.LJI().LJJJJZ());
        arrayList.add(new ABKevaAdvPreloadTask());
        IUnifiedAccountSdkSOTLService iUnifiedAccountSdkSOTLService = (IUnifiedAccountSdkSOTLService) PluggableExtentionKt.pluggableSpi$default(IUnifiedAccountSdkSOTLService.class, false, false, false, 14, null);
        if (iUnifiedAccountSdkSOTLService != null && (preloadTask = iUnifiedAccountSdkSOTLService.getPreloadTask()) != null) {
            arrayList.add(preloadTask);
        }
        INewUserJourneyAppDiffService iNewUserJourneyAppDiffService = (INewUserJourneyAppDiffService) PluggableExtentionKt.pluggableSpi$default(INewUserJourneyAppDiffService.class, false, false, false, 14, null);
        if (iNewUserJourneyAppDiffService != null) {
            iNewUserJourneyAppDiffService.LIZ();
        }
        arrayList.add(LiteModeInitTask.LL);
        ILoginServiceAppDiff iLoginServiceAppDiff = (ILoginServiceAppDiff) PluggableExtentionKt.pluggableSpi$default(ILoginServiceAppDiff.class, false, false, false, 14, null);
        if (iLoginServiceAppDiff != null && (oneTapLoginPreloadTask = iLoginServiceAppDiff.getOneTapLoginPreloadTask()) != null) {
            arrayList.add(oneTapLoginPreloadTask);
        }
        ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
        if (iSeriesFeedServiceLIZIZ != null && (interfaceC1577280r9CLIZ = iSeriesFeedServiceLIZIZ.LIZ()) != null && (dramaNUJInsertionTaskLJIJ = interfaceC1577280r9CLIZ.LJIJ()) != null) {
            arrayList.add(dramaNUJInsertionTaskLJIJ);
        }
        if (((Boolean) C282890B6x.LIZ.getValue()).booleanValue()) {
            arrayList.add(new FriendsRedDotCleanupTask());
        }
        arrayList.add(new BtmGuardTask());
        arrayList.add(new BootFinishTaskProvider());
        arrayList.add(new PushStartupTaskRejectStrategy());
        arrayList.add(new KeepAliveBootstrapTask());
        return arrayList;
    }

    public static IInitAllService LIZLLL() {
        return (IInitAllService) ServiceManager.get().getService(IInitAllService.class);
    }
}
