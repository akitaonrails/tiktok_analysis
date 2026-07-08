package com.ss.android.ugc.aweme.newlego;

import X.C01GW;
import X.C04VD;
import X.C0BEC;
import X.C0BSP;
import X.C0CBA;
import X.C0CD2;
import X.C0CG6;
import X.C0WVP;
import X.C0WVQ;
import X.C104100aN;
import X.C1216504pP;
import X.C1602860roS;
import X.C1832107Fn;
import X.C1866440yfa;
import X.C18JJ;
import X.C1BWL;
import X.C1BWX;
import X.C1BXA;
import X.C1BXD;
import X.C1BXK;
import X.C1BXO;
import X.C1BXQ;
import X.C1BXR;
import X.C1BXW;
import X.C1BXX;
import X.C1E21;
import X.C202109146h;
import X.C20618085w;
import X.C20619085x;
import X.C20725089z;
import X.C2110308On;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2206241BWk;
import X.C2222891BzL;
import X.C274300Ap2;
import X.C275830ArV;
import X.C285090BFj;
import X.C303040BuI;
import X.C303960Bvm;
import X.C786410Ut5;
import X.C806820Vku;
import X.C823130WQt;
import X.C844140X9o;
import X.C844470XAv;
import X.InterfaceC1655560tBS;
import X.InterfaceC308150C6b;
import android.content.Context;
import android.os.Build;
import com.bytedance.ies.ugc.aweme.commercialize.splash.SplashAdManagerPreloadTask;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.legoimpl.AppMonitorTask;
import com.ss.android.legoimpl.DepressPreloadTask;
import com.ss.android.legoimpl.DisableClassVerifyTask;
import com.ss.android.legoimpl.FlippedTask;
import com.ss.android.legoimpl.InitABTask;
import com.ss.android.legoimpl.InitFakeMainTask;
import com.ss.android.legoimpl.InitFrescoCoreTask;
import com.ss.android.legoimpl.InitGenoTask;
import com.ss.android.legoimpl.InitKevaTask;
import com.ss.android.legoimpl.InitPlayerTask;
import com.ss.android.legoimpl.InitRewordTask;
import com.ss.android.legoimpl.InitThreadPoolBlockNumTask;
import com.ss.android.legoimpl.InjectApplicationTask;
import com.ss.android.legoimpl.LessMadviseOptTask;
import com.ss.android.legoimpl.LibrarianTask;
import com.ss.android.legoimpl.PreloadBootFinishABValueTask;
import com.ss.android.legoimpl.PreloadColdBootKevaValueTask;
import com.ss.android.legoimpl.PreloadIOTask;
import com.ss.android.legoimpl.PreloadMDLSoTask;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import com.ss.android.ugc.aweme.alog.ALogNativeOptTaskBackground;
import com.ss.android.ugc.aweme.alog.ALogNativeOptTaskBootFinish;
import com.ss.android.ugc.aweme.audiomode.legoimpl.AudioSDKABLegoTaskEntry;
import com.ss.android.ugc.aweme.experiment.ColdBootTasksDegradeExperiment;
import com.ss.android.ugc.aweme.explore.performance.ExploreFeedPreloadTask;
import com.ss.android.ugc.aweme.external.AVCameraInitTaskNew;
import com.ss.android.ugc.aweme.featurepoll.FeaturePollLegoTask;
import com.ss.android.ugc.aweme.feed.api.IRecommendFeedOutBridgeService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.launcher.service.task.ITaskParams;
import com.ss.android.ugc.aweme.legoImp.SPKevaPreloadTaskV3;
import com.ss.android.ugc.aweme.legoImp.task.AnalysisHprofBootFinishTask;
import com.ss.android.ugc.aweme.legoImp.task.AnrThanosEarliestTask;
import com.ss.android.ugc.aweme.legoImp.task.AnrThanosTask;
import com.ss.android.ugc.aweme.legoImp.task.ArsenalPreloadInitTaskEarly;
import com.ss.android.ugc.aweme.legoImp.task.ArsenalPreloadInitTaskLate;
import com.ss.android.ugc.aweme.legoImp.task.BPEAPreloadTask;
import com.ss.android.ugc.aweme.legoImp.task.BindFrescoTask;
import com.ss.android.ugc.aweme.legoImp.task.ColdBootInitTask;
import com.ss.android.ugc.aweme.legoImp.task.ColdBootSystemOptTask;
import com.ss.android.ugc.aweme.legoImp.task.FeedRequestParamPreloadTask;
import com.ss.android.ugc.aweme.legoImp.task.InitAVModuleTask;
import com.ss.android.ugc.aweme.legoImp.task.InitPushTaskEarlyBackground;
import com.ss.android.ugc.aweme.legoImp.task.InitPushTaskEarlyMain;
import com.ss.android.ugc.aweme.legoImp.task.InitPushTaskLateBackground;
import com.ss.android.ugc.aweme.legoImp.task.InitPushTaskLateMain;
import com.ss.android.ugc.aweme.legoImp.task.IoPreloadTask;
import com.ss.android.ugc.aweme.legoImp.task.JatoInitTask;
import com.ss.android.ugc.aweme.legoImp.task.LiveRevenueStrategyTask;
import com.ss.android.ugc.aweme.legoImp.task.MemOptTask;
import com.ss.android.ugc.aweme.legoImp.task.NpthCoreInitTask;
import com.ss.android.ugc.aweme.legoImp.task.NpthSecondInitBackgroundTask;
import com.ss.android.ugc.aweme.legoImp.task.NpthSecondInitMainTask;
import com.ss.android.ugc.aweme.legoImp.task.PreloadStageTaskV1;
import com.ss.android.ugc.aweme.legoImp.task.PreloadStageTaskV2;
import com.ss.android.ugc.aweme.legoImp.task.PreloadWireFieldNoEnumClassTask;
import com.ss.android.ugc.aweme.legoImp.task.PushSetupTask;
import com.ss.android.ugc.aweme.legoImp.task.ResIdentifierOptTask;
import com.ss.android.ugc.aweme.legoImp.task.SplitCompatInstallEntry;
import com.ss.android.ugc.aweme.legoImp.task.StoreRegionInitTask;
import com.ss.android.ugc.aweme.legoImp.task.TokenResolverInitTask;
import com.ss.android.ugc.aweme.legoImp.task.ZeroVideoViewMonitorTask;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.InitGodzillaEntry;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.RejectedExecutionHandler;
import com.ss.android.ugc.aweme.legoImp.task.btm.InitBtmSDKTask;
import com.ss.android.ugc.aweme.legoImp.task.btm.InitBtmSDKTaskSwitch3Background;
import com.ss.android.ugc.aweme.legoImp.task.btm.InitBtmSDKTaskSwitch3Main;
import com.ss.android.ugc.aweme.legoImp.task.btm.InitBtmSDKTaskSwitch4Background;
import com.ss.android.ugc.aweme.legoImp.task.btm.InitBtmSDKTaskSwitch4Main;
import com.ss.android.ugc.aweme.legoImp.task.mainProcessTask.FrescoSoLoadSetter;
import com.ss.android.ugc.aweme.legoImp.task.mainProcessTask.InitAdServiceTaskEntry;
import com.ss.android.ugc.aweme.legoImp.task.mainProcessTask.MobMainSessionStartTask;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa.OnlinePumbaaTask;
import com.ss.android.ugc.aweme.legoImp.task.uitask.UIInitTaskEarly;
import com.ss.android.ugc.aweme.legoImp.task.uitask.UIInitTaskLate;
import com.ss.android.ugc.aweme.legoImpl.task.ABPreloadTask;
import com.ss.android.ugc.aweme.legoImpl.task.AntispamApiUploadTask;
import com.ss.android.ugc.aweme.legoImpl.task.AppStartupRecordTask;
import com.ss.android.ugc.aweme.ogccampaign.OgcLynxPspInitTask;
import com.ss.android.ugc.aweme.pns.aab.event.api.IPNSAabEventService;
import com.ss.android.ugc.aweme.tako.TakoNewInitTask;
import com.ss.android.ugc.aweme.task.ClassLoaderPathOptTaskBackground;
import com.ss.android.ugc.aweme.task.ClassLoaderPathOptTaskMain;
import com.ss.android.ugc.aweme.task.HippoAntiDeteriorationKitTask;
import com.ss.android.ugc.aweme.task.ScalpelBackgroundRunnableMonitorTask;
import com.ss.android.ugc.aweme.texttoimage.ITextToImageService;
import com.ss.android.ugc.aweme.utils.DeadSystemExceptionTask;
import com.ss.android.ugc.aweme.utils.PreventServerSideCrashes;
import com.ss.android.ugc.aweme.utils.WebViewPreInitTask;
import com.ss.android.ugc.tiktok.commercialize.dispatcher.impl.trigger.ResourceDispatcherBootFinishTask;
import com.ss.android.ugc.tiktok.commercialize.dispatcher.impl.trigger.RewardGeckoPrefetchBootFinishTask;
import com.ss.android.ugc.tiktok.tools.performance.api.ICreationPerfService;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public class TaskHolder {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static InterfaceC308150C6b getTask(String str) {
        InterfaceC1655560tBS interfaceC1655560tBSRecordService;
        switch (str.hashCode()) {
            case -2118365798:
                if (str.equals("InitFrescoCoreTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (C2222891BzL.LIZ.LJFF()) {
                        return new InitFrescoCoreTask();
                    }
                }
                return null;
            case -2108350753:
                if (str.equals("SplitCompatInstall")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C1BWX.LIZ(529)) {
                        return null;
                    }
                    return new SplitCompatInstallEntry();
                }
                return null;
            case -2071185112:
                if (str.equals("LiveRevenueStrategyTask")) {
                    return new LiveRevenueStrategyTask();
                }
                return null;
            case -1963505384:
                if (str.equals("NpthSecondInitMainTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!(!((Boolean) C285090BFj.LJJIII.getValue()).booleanValue())) {
                        return null;
                    }
                    return new NpthSecondInitMainTask();
                }
                return null;
            case -1922973795:
                if (str.equals("LibrarianTask")) {
                    return new LibrarianTask();
                }
                return null;
            case -1899381453:
                if (str.equals("ColdBootSystemOptTask")) {
                    return new ColdBootSystemOptTask();
                }
                return null;
            case -1855376613:
                if (str.equals("ArsenalPreloadInitTaskEarly")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C0BSP.LIZ || !C1BWX.LIZ(1)) {
                        return null;
                    }
                    return new ArsenalPreloadInitTaskEarly();
                }
                return null;
            case -1807490316:
                if (str.equals("PreloadIOTask")) {
                    return new PreloadIOTask();
                }
                return null;
            case -1768873464:
                if (str.equals("IoPreloadTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!((Boolean) C0CG6.LJII.getValue()).booleanValue() || ColdBootTasksDegradeExperiment.LIZ().ioPreloadTask || !C1BWX.LIZ(1)) {
                        return null;
                    }
                    return new IoPreloadTask();
                }
                return null;
            case -1764678702:
                if (str.equals("PNSAabEventTask")) {
                    return new InterfaceC308150C6b() { // from class: X.14FQ
                        @Override // X.InterfaceC308150C6b
                        public final void run(Context context) {
                            IPNSAabEventService iPNSAabEventService;
                            IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
                            if (iPluginService != null && iPluginService.checkPluginInstalled("com.ss.android.ugc.aweme.df_pns_biz") && (iPNSAabEventService = (IPNSAabEventService) PluggableExtentionKt.pluggableSpi$default(IPNSAabEventService.class, false, false, false, 14, null)) != null) {
                                iPNSAabEventService.LIZ();
                            }
                        }
                    };
                }
                return null;
            case -1763917426:
                if (str.equals("AsyncInitRewordTask")) {
                    return new InterfaceC308150C6b() { // from class: X.1BXL
                        @Override // X.InterfaceC308150C6b
                        public final void run(Context context) {
                            InitRewordTask.LIZ(context);
                        }
                    };
                }
                return null;
            case -1629631841:
                if (str.equals("DebugPerformanceOptimizeTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    return null;
                }
                return null;
            case -1581413785:
                if (str.equals("InitAdServiceTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    C1602860roS.LIZ.getClass();
                    if (!C1602860roS.LJ() ? !((Boolean) C303960Bvm.LIZJ.getValue()).booleanValue() : !C104100aN.LIZ().isNewUser()) {
                        if (C1BWX.LIZ(1)) {
                            return new InitAdServiceTaskEntry();
                        }
                    }
                    return null;
                }
                return null;
            case -1570049166:
                if (str.equals("OnlinePumbaaTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    C844470XAv.LIZ.getClass();
                    if (!(!Intrinsics.LJFF(C844470XAv.LJIILL, "local_test"))) {
                        return null;
                    }
                    return new OnlinePumbaaTask();
                }
                return null;
            case -1447650822:
                if (str.equals("InitKevaTask")) {
                    return new InitKevaTask();
                }
                return null;
            case -1408522607:
                if (str.equals("AVCameraInitTaskNew")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    C1BXX.LIZ.getClass();
                    ICreationPerfService iCreationPerfService = C1BXX.LIZIZ;
                    if (iCreationPerfService == null || (interfaceC1655560tBSRecordService = iCreationPerfService.recordService()) == null || interfaceC1655560tBSRecordService.LJIIIIZZ() == null) {
                        return null;
                    }
                    return new AVCameraInitTaskNew();
                }
                return null;
            case -1407197022:
                if (str.equals("OGCLynxDataPreloadTask")) {
                    return new OgcLynxPspInitTask();
                }
                return null;
            case -1395248460:
                if (str.equals("FeedPreloadOnAttachTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    C01GW c01gw = C303040BuI.LIZIZ;
                    if (c01gw.getValue() == null || !((List) c01gw.getValue()).contains("/aweme/v2/feed/")) {
                        return null;
                    }
                    return new InterfaceC308150C6b() { // from class: X.0sFj
                        @Override // X.InterfaceC308150C6b
                        public final void run(Context context) {
                            ((IRecommendFeedOutBridgeService) PluggableExtentionKt.pluggableSpi(IRecommendFeedOutBridgeService.class)).LJIIIZ().LJI(context, false);
                        }
                    };
                }
                return null;
            case -1361780252:
                if (str.equals("InitBtmSDKTaskSwitch3Main")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    InitBtmSDKTask.LL.getClass();
                    if (InitBtmSDKTask.LJFF() != 3 || InitBtmSDKTask.LJ() || !C1BWX.LIZ(1)) {
                        return null;
                    }
                    return new InitBtmSDKTaskSwitch3Main();
                }
                return null;
            case -1360856731:
                if (str.equals("InitBtmSDKTaskSwitch4Main")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    InitBtmSDKTask.LL.getClass();
                    if (InitBtmSDKTask.LJFF() != 4 || InitBtmSDKTask.LJ()) {
                        return null;
                    }
                    return new InitBtmSDKTaskSwitch4Main();
                }
                return null;
            case -1356715601:
                if (str.equals("PreloadWireFieldNoEnumClassTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (C2206241BWk.LIZ() || !C1BWX.LIZ(1)) {
                        return null;
                    }
                    return new PreloadWireFieldNoEnumClassTask();
                }
                return null;
            case -1350304556:
                if (str.equals("TokenResolverInitTask")) {
                    return new TokenResolverInitTask();
                }
                return null;
            case -1331536500:
                if (str.equals("DepressPreloadTask")) {
                    return new DepressPreloadTask();
                }
                return null;
            case -1313664765:
                if (str.equals("ALogNativeOptTaskBootFinish")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (C275830ArV.LIZ(2) || !C1BWX.LIZ(1)) {
                        return null;
                    }
                    return new ALogNativeOptTaskBootFinish();
                }
                return null;
            case -1295034649:
                if (str.equals("JatoInitTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C1BWX.LIZ(17)) {
                        return null;
                    }
                    return new JatoInitTask();
                }
                return null;
            case -1275163236:
                if (str.equals("LessMadviseOptTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C1BWX.LIZ(1)) {
                        return null;
                    }
                    return new LessMadviseOptTask();
                }
                return null;
            case -1220054780:
                if (str.equals("InjectApplicationTask")) {
                    return new InjectApplicationTask();
                }
                return null;
            case -1159687909:
                if (str.equals("RewardGeckoPrefetchBootFinishTask")) {
                    return new RewardGeckoPrefetchBootFinishTask();
                }
                return null;
            case -1011957907:
                if (str.equals("InitPushTaskEarlyMain")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C1832107Fn.LIZ || C1BWX.LIZ(1)) {
                        return null;
                    }
                    return new InitPushTaskEarlyMain();
                }
                return null;
            case -946088120:
                if (str.equals("BindFrescoTask")) {
                    return new BindFrescoTask();
                }
                return null;
            case -935404467:
                if (str.equals("ABPreloadTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (((Boolean) C0CD2.LJJJLZIJ.getValue()).booleanValue() || !C274300Ap2.LIZ() || !C1BWX.LIZ(1)) {
                        return null;
                    }
                    return new ABPreloadTask();
                }
                return null;
            case -931322205:
                if (str.equals("InitFakeMainTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C0BEC.LJFF(C1BWL.LIZ())) {
                        return null;
                    }
                    return new InitFakeMainTask();
                }
                return null;
            case -930806214:
                if (str.equals("DebugOptServiceTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    return null;
                }
                return null;
            case -914146350:
                if (str.equals("PreloadColdBootKevaValueTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!((Boolean) C0CD2.LJJJZ.getValue()).booleanValue()) {
                        return null;
                    }
                    return new PreloadColdBootKevaValueTask();
                }
                return null;
            case -901046753:
                if (str.equals("ResourceDispatcherBootFinishTask")) {
                    return new ResourceDispatcherBootFinishTask();
                }
                return null;
            case -831562323:
                if (str.equals("TextToImageResourcePreloadTask")) {
                    return new InterfaceC308150C6b() { // from class: X.1BXM
                        @Override // X.InterfaceC308150C6b
                        public final void run(Context context) {
                            ITextToImageService iTextToImageService = (ITextToImageService) PluggableExtentionKt.pluggableSpi$default(ITextToImageService.class, false, false, false, 14, null);
                            if (iTextToImageService != null) {
                                iTextToImageService.LJJIJL();
                            }
                        }
                    };
                }
                return null;
            case -773114562:
                if (str.equals("AppMonitorTask")) {
                    return new AppMonitorTask();
                }
                return null;
            case -744292486:
                if (str.equals("UIInitTaskEarly")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C1866440yfa.LIZ()) {
                        return null;
                    }
                    return new UIInitTaskEarly();
                }
                return null;
            case -708290558:
                if (str.equals("AnrThanosEarliestTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C1BWX.LIZ(1)) {
                        return null;
                    }
                    return new AnrThanosEarliestTask();
                }
                return null;
            case -675771560:
                if (str.equals("ScalpelBackgroundRunnableMonitorTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    ITaskParams iTaskParams = (ITaskParams) PluggableExtentionKt.pluggableSpi$default(ITaskParams.class, false, false, false, 14, null);
                    if (iTaskParams == null || !iTaskParams.LIZ(1)) {
                        return null;
                    }
                    return new ScalpelBackgroundRunnableMonitorTask();
                }
                return null;
            case -668371026:
                if (str.equals("InitPushTaskLateMain")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (C1832107Fn.LIZ || C1BWX.LIZ(1)) {
                        return null;
                    }
                    return new InitPushTaskLateMain();
                }
                return null;
            case -601043989:
                if (str.equals("SplashAdManagerPreloadTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!((ISplashAdService) PluggableExtentionKt.pluggableSpi(ISplashAdService.class)).LJIILIIL() || !((ITaskParams) PluggableExtentionKt.pluggableSpi(ITaskParams.class)).LIZ(1)) {
                        return null;
                    }
                    return new SplashAdManagerPreloadTask();
                }
                return null;
            case -598351537:
                if (str.equals("ResIdentifierOptTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C1BWX.LIZ(1)) {
                        return null;
                    }
                    return new ResIdentifierOptTask();
                }
                return null;
            case -556401145:
                if (str.equals("FlippedTask")) {
                    return new FlippedTask();
                }
                return null;
            case -535747303:
                if (str.equals("InitBtmSDKTaskSwitch3Background")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    InitBtmSDKTask.LL.getClass();
                    if (InitBtmSDKTask.LJFF() != 3 || !InitBtmSDKTask.LJ() || !C1BWX.LIZ(1)) {
                        return null;
                    }
                    return new InitBtmSDKTaskSwitch3Background();
                }
                return null;
            case -501632682:
                if (str.equals("InitAVModuleTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C1BWX.LIZ(17)) {
                        return null;
                    }
                    return new InitAVModuleTask();
                }
                return null;
            case -485127123:
                if (str.equals("PreloadMDLSoTask")) {
                    return new PreloadMDLSoTask();
                }
                return null;
            case -436244146:
                if (str.equals("DisableClassVerifyTask")) {
                    return new DisableClassVerifyTask();
                }
                return null;
            case -239297183:
                if (str.equals("DeadSystemExceptionTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C1BWX.LIZ(1)) {
                        return null;
                    }
                    return new DeadSystemExceptionTask();
                }
                return null;
            case -224244502:
                if (str.equals("StoreRegionInitTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (C1E21.LIZIZ() || !C1BWX.LIZ(1)) {
                        return null;
                    }
                    return new StoreRegionInitTask();
                }
                return null;
            case -180686379:
                if (str.equals("PreloadStageTaskV1")) {
                    return new PreloadStageTaskV1();
                }
                return null;
            case -180686378:
                if (str.equals("PreloadStageTaskV2")) {
                    return new PreloadStageTaskV2();
                }
                return null;
            case -177780942:
                if (str.equals("DebugPumbaaTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    return null;
                }
                return null;
            case -83823990:
                if (str.equals("PrimeGlobalVariablesInitTask")) {
                    return new InterfaceC308150C6b() { // from class: X.14B2
                        @Override // X.InterfaceC308150C6b
                        public final void run(Context context) {
                            new C14B1().run();
                        }
                    };
                }
                return null;
            case -45061484:
                if (str.equals("InitGenoTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (ColdBootTasksDegradeExperiment.LIZ().initGenoTask || Build.VERSION.SDK_INT > 36) {
                        return null;
                    }
                    return new InitGenoTask();
                }
                return null;
            case -35456090:
                if (str.equals("InitGodzilla")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    return new InitGodzillaEntry();
                }
                return null;
            case 34036616:
                if (str.equals("PushSetupTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    boolean zLIZIZ = PushMultiProcessSharedProvider.LJ(C1BWL.LIZ()).LIZIZ("ensure_init_configurations", false);
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("attachBaseContext()#meetTrigger()@");
                    sbLIZ.append(C786410Ut5.u3().getName());
                    sbLIZ.append(", ensure: ");
                    sbLIZ.append(zLIZIZ);
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (!C1BWX.LIZ(1) || !zLIZIZ) {
                        return null;
                    }
                    return new PushSetupTask();
                }
                return null;
            case 335552263:
                if (str.equals("ZeroVideoViewMonitorTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C1BWX.LIZ(1)) {
                        return null;
                    }
                    return new ZeroVideoViewMonitorTask();
                }
                return null;
            case 337522700:
                if (str.equals("ALogNativeOptTaskBackground")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C275830ArV.LIZ(2) || !C1BWX.LIZ(1)) {
                        return null;
                    }
                    return new ALogNativeOptTaskBackground();
                }
                return null;
            case 355999726:
                if (str.equals("ArsenalPreloadInitTaskLate")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (C0BSP.LIZ || !C1BWX.LIZ(1)) {
                        return null;
                    }
                    return new ArsenalPreloadInitTaskLate();
                }
                return null;
            case 372990165:
                if (str.equals("AntispamApiUploadTask")) {
                    return new AntispamApiUploadTask();
                }
                return null;
            case 650431442:
                if (str.equals("AppStartupRecordTask")) {
                    return new AppStartupRecordTask();
                }
                return null;
            case 767206635:
                if (str.equals("ColdBootInitTask")) {
                    return new ColdBootInitTask();
                }
                return null;
            case 838499818:
                if (str.equals("MobMainSessionStartTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C0WVP.LIZ()) {
                        return null;
                    }
                    return new MobMainSessionStartTask();
                }
                return null;
            case 880915786:
                if (str.equals("AnalysisHprofTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C1BXW.LIZ()) {
                        return null;
                    }
                    return new AnalysisHprofBootFinishTask();
                }
                return null;
            case 912291434:
                if (str.equals("NpthCoreInitTask")) {
                    return new NpthCoreInitTask();
                }
                return null;
            case 981055332:
                if (str.equals("BPEAPreloadTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C20725089z.LIZ()) {
                        return null;
                    }
                    return new BPEAPreloadTask();
                }
                return null;
            case 1037104716:
                if (str.equals("FrescoSoLoadSetterTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C1BXO.LIZ()) {
                        return null;
                    }
                    return new InterfaceC308150C6b() { // from class: X.1BXN
                        @Override // X.InterfaceC308150C6b
                        public final void run(Context context) {
                            new FrescoSoLoadSetter();
                            C1322210kVn.LIZIZ = C1BXP.LIZ;
                        }
                    };
                }
                return null;
            case 1049032674:
                if (str.equals("InitPushTaskEarlyBackground")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C1BXQ.LIZ()) {
                        return null;
                    }
                    return new InitPushTaskEarlyBackground();
                }
                return null;
            case 1051663752:
                if (str.equals("DebugDoolittleWSTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    return null;
                }
                return null;
            case 1083261512:
                if (str.equals("InitPluggableTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    return null;
                }
                return null;
            case 1083854484:
                if (str.equals("InitThreadPoolBlockNumTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C823130WQt.LIZ()) {
                        return null;
                    }
                    return new InitThreadPoolBlockNumTask();
                }
                return null;
            case 1113600370:
                if (str.equals("FeedRequestParamPreloadTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C844140X9o.LIZ()) {
                        return null;
                    }
                    return new FeedRequestParamPreloadTask();
                }
                return null;
            case 1267455779:
                if (str.equals("PreventServerSideCrashes")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    return new PreventServerSideCrashes();
                }
                return null;
            case 1286359907:
                if (str.equals("MemOptTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C1216504pP.LIZ()) {
                        return null;
                    }
                    return new MemOptTask();
                }
                return null;
            case 1295056327:
                if (str.equals("PreloadBootFinishABValueTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C0CBA.LIZ()) {
                        return null;
                    }
                    return new PreloadBootFinishABValueTask();
                }
                return null;
            case 1318384667:
                if (str.equals("FeaturePollLegoTask")) {
                    return new FeaturePollLegoTask();
                }
                return null;
            case 1378812194:
                if (str.equals("HippoAntiDeteriorationKitTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C202109146h.LIZ()) {
                        return null;
                    }
                    return new HippoAntiDeteriorationKitTask();
                }
                return null;
            case 1484521515:
                if (str.equals("AudioSDKABLegoTask")) {
                    return new AudioSDKABLegoTaskEntry();
                }
                return null;
            case 1524196790:
                if (str.equals("ClassLoaderPathOptTaskBackground")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C20618085w.LIZ()) {
                        return null;
                    }
                    return new ClassLoaderPathOptTaskBackground();
                }
                return null;
            case 1571340941:
                if (str.equals("NpthSecondInitBackgroundTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C1BXK.LIZ()) {
                        return null;
                    }
                    return new NpthSecondInitBackgroundTask();
                }
                return null;
            case 1583916223:
                if (str.equals("WebViewPreInitTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C2110308On.LIZ()) {
                        return null;
                    }
                    return new WebViewPreInitTask();
                }
                return null;
            case 1684430825:
                if (str.equals("SPKevaPreloadTaskV3")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C1BXA.LIZ()) {
                        return null;
                    }
                    return new SPKevaPreloadTaskV3();
                }
                return null;
            case 1690037878:
                if (str.equals("InitABTask")) {
                    return new InitABTask();
                }
                return null;
            case 1773500880:
                if (str.equals("RejectedExecutionHandler")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C0WVQ.LIZ()) {
                        return null;
                    }
                    return new RejectedExecutionHandler();
                }
                return null;
            case 1786585615:
                if (str.equals("AnrThanosTask")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C1BWX.LIZ(1)) {
                        return null;
                    }
                    return new AnrThanosTask();
                }
                return null;
            case 1850345786:
                if (str.equals("TakoInitTaskNew")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C04VD.LIZ()) {
                        return null;
                    }
                    return new TakoNewInitTask();
                }
                return null;
            case 1889742781:
                if (str.equals("ExploreFeedPreloadTask")) {
                    return new ExploreFeedPreloadTask();
                }
                return null;
            case 1921850433:
                if (str.equals("ClassLoaderPathOptTaskMain")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C20619085x.LIZ()) {
                        return null;
                    }
                    return new ClassLoaderPathOptTaskMain();
                }
                return null;
            case 1962268634:
                if (str.equals("InitBtmSDKTaskSwitch4Background")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C18JJ.LIZ()) {
                        return null;
                    }
                    return new InitBtmSDKTaskSwitch4Background();
                }
                return null;
            case 2009523542:
                if (str.equals("InitPlayerTask")) {
                    return new InitPlayerTask();
                }
                return null;
            case 2022488931:
                if (str.equals("InitPushTaskLateBackground")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C1BXR.LIZ()) {
                        return null;
                    }
                    return new InitPushTaskLateBackground();
                }
                return null;
            case 2054409135:
                if (str.equals("UIInitTaskLate")) {
                    C1BXD.LIZIZ().LIZ.getApplication();
                    if (!C806820Vku.LIZ()) {
                        return null;
                    }
                    return new UIInitTaskLate();
                }
                return null;
            default:
                return null;
        }
    }
}
