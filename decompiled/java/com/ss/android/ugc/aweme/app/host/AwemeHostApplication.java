package com.ss.android.ugc.aweme.app.host;

import X.C08Q0;
import X.C08Q1;
import X.C08TN;
import X.C0BED;
import X.C0J4J;
import X.C0VHM;
import X.C0VHN;
import X.C0VHX;
import X.C0X35;
import X.C1468580oJs;
import X.C1475000oUE;
import X.C1480860odg;
import X.C1487040one;
import X.C1BWK;
import X.C1BWL;
import X.C1BWN;
import X.C1BWU;
import X.C1BWV;
import X.C1BX1;
import X.C20182613y4;
import X.C202094145s;
import X.C202098145w;
import X.C2104108Md;
import X.C2104408Mg;
import X.C2214641Bm2;
import X.C2413309cx;
import X.C582580Mt6;
import X.C817670W5t;
import X.EnumC1609840rzi;
import Y.ACallableS150S0000000_13;
import Y.ARunnableS83S0000000_3;
import Y.ARunnableS84S0000000_4;
import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import com.bytedance.apm.agent.v2.instrumentation.AppAgent;
import com.bytedance.ies.ugc.appcontext.AppBuildConfig;
import com.bytedance.keva.KevaCacheManager;
import com.bytedance.librarian.Librarian;
import com.bytedance.librarian.LibrarianMonitor;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.legoapi.IAccountInitializerTaskApi;
import com.ss.android.legoimpl.DecompressTask;
import com.ss.android.legoimpl.ExperienceKitInitTask;
import com.ss.android.legoimpl.KidsModeStorageTask;
import com.ss.android.legoimpl.ProcessMonitorTask;
import com.ss.android.ugc.AwemeAppBuildConfig;
import com.ss.android.ugc.aweme.IAppWidgetService;
import com.ss.android.ugc.aweme.childhook.ChildActivityInstrumentation;
import com.ss.android.ugc.aweme.configcenter.AwemeConfigCenter;
import com.ss.android.ugc.aweme.device.DeviceInfoReportTask;
import com.ss.android.ugc.aweme.dynamicfeature.AabPluginServiceInitTask;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.kids.api.common.IKidsCommonService;
import com.ss.android.ugc.aweme.kids.api.screentime.IKidsScreenTimeService;
import com.ss.android.ugc.aweme.legoImp.OrbuInitTask;
import com.ss.android.ugc.aweme.legoImp.task.ABTask;
import com.ss.android.ugc.aweme.legoImp.task.AdjustMusicVolume;
import com.ss.android.ugc.aweme.legoImp.task.BulletAssemblerInitTask;
import com.ss.android.ugc.aweme.legoImp.task.BulletOptimizationTask;
import com.ss.android.ugc.aweme.legoImp.task.BulletPreloadTask;
import com.ss.android.ugc.aweme.legoImp.task.EnterMusicGuideColdStartTask;
import com.ss.android.ugc.aweme.legoImp.task.FluencySdkInitTask;
import com.ss.android.ugc.aweme.legoImp.task.FontTask;
import com.ss.android.ugc.aweme.legoImp.task.GetGoogleAIdTask;
import com.ss.android.ugc.aweme.legoImp.task.InitAVModule;
import com.ss.android.ugc.aweme.legoImp.task.InitFramework;
import com.ss.android.ugc.aweme.legoImp.task.InitModules;
import com.ss.android.ugc.aweme.legoImp.task.InitMusicManager;
import com.ss.android.ugc.aweme.legoImp.task.InitMusicServiceTask;
import com.ss.android.ugc.aweme.legoImp.task.InitReportSignature;
import com.ss.android.ugc.aweme.legoImp.task.InitTaskManager;
import com.ss.android.ugc.aweme.legoImp.task.JacocoTask;
import com.ss.android.ugc.aweme.legoImp.task.JsBridge2InitTask;
import com.ss.android.ugc.aweme.legoImp.task.MessageControllerTask;
import com.ss.android.ugc.aweme.legoImp.task.MiloInitTask;
import com.ss.android.ugc.aweme.legoImp.task.PlayerKitCommonWidgetInitTask;
import com.ss.android.ugc.aweme.legoImp.task.PlayerKitInitTask;
import com.ss.android.ugc.aweme.legoImp.task.PopupConfigTask;
import com.ss.android.ugc.aweme.legoImp.task.PreloadResCleanerTask;
import com.ss.android.ugc.aweme.legoImp.task.ResetTTNetworkStateIndexTask;
import com.ss.android.ugc.aweme.legoImp.task.SetAppTrackTask;
import com.ss.android.ugc.aweme.legoImp.task.SharePreferencePreloadForAllProcessTask;
import com.ss.android.ugc.aweme.legoImp.task.SplitCompatInstall;
import com.ss.android.ugc.aweme.legoImp.task.StoreRegionInitTask;
import com.ss.android.ugc.aweme.legoImp.task.TTMockTask;
import com.ss.android.ugc.aweme.legoImp.task.TasksHolder;
import com.ss.android.ugc.aweme.legoImp.task.ThreadPoolInjectTask;
import com.ss.android.ugc.aweme.legoImp.task.TrimMemoryTask;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.ApmInit;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.InitAnywhereService;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.InitDownloadComponentTask;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.NetworkUtilsTask;
import com.ss.android.ugc.aweme.legoImp.task.kidsmode.KidsModeCheckAABDownloadTask;
import com.ss.android.ugc.aweme.legoImp.task.kidsmode.KidsModeFetchKidsSettingTask;
import com.ss.android.ugc.aweme.legoImp.task.kidsmode.KidsModeGateKeeperInitTask;
import com.ss.android.ugc.aweme.legoImp.task.kidsmode.KidsModeGeoBlockingInitTask;
import com.ss.android.ugc.aweme.legoImp.task.kidsmode.KidsModeInitRouterTask;
import com.ss.android.ugc.aweme.legoImp.task.kidsmode.KidsModeInitRuntimeTask;
import com.ss.android.ugc.aweme.legoImp.task.kidsmode.KidsModeLegacyTask;
import com.ss.android.ugc.aweme.legoImp.task.kidsmode.KidsModePolicyNoticeTask;
import com.ss.android.ugc.aweme.legoImp.task.kidsmode.KidsModeQueryUserInfoTask;
import com.ss.android.ugc.aweme.legoImp.task.kidsmode.PNSKidStateMachineInitTask;
import com.ss.android.ugc.aweme.legoImp.task.mainProcessTask.FrescoSoLoadSetter;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa.KidsDMTask;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa.KidsPumbaaTask;
import com.ss.android.ugc.aweme.legoImp.task.uitask.TuxInitTask;
import com.ss.android.ugc.aweme.legoImp.task.webview.InitWebViewHookTask;
import com.ss.android.ugc.aweme.legoImp.task.webview.TTWebViewKeepAliveTask;
import com.ss.android.ugc.aweme.legoImp.task.webview.TTWebViewSubTask;
import com.ss.android.ugc.aweme.legoImpl.task.SecShareSdkTask;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.ss.android.ugc.aweme.offline.abmock.IAbMockService;
import com.ss.android.ugc.aweme.requesttask.idle.CAITTMStrategyCenterRequest;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoCustomRequest;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoGlobalInitTask;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoLocalRequest;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoLocalRequestV2;
import com.ss.android.ugc.aweme.search.SearchWidgetTask;
import com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.settings.TTWebViewEnableStatusSettings;
import com.ss.android.ugc.aweme.story.SocialWidgetLegoTask;
import com.tiktok.ttf.network.task.InitTTNetTask;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import jv6.a;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.text.u;

/* JADX INFO: loaded from: classes35.dex */
public class AwemeHostApplication extends Application implements C0VHX {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public final C1BWK LL;

    @Override // X.C0VHX
    public final C0VHM LIZ() {
        C0VHN c0vhn = new C0VHN();
        c0vhn.LIZ = 3;
        return new C0VHM(c0vhn);
    }

    @Override // android.app.Application
    public final void onCreate() {
        String strLIZ;
        Application application = C1475000oUE.LIZ;
        C1468580oJs.LIZ.getClass();
        if (C1475000oUE.LIZ == null) {
            C1480860odg.LIZ = this;
            C1475000oUE.LIZ = this;
            registerActivityLifecycleCallbacks(new C1487040one());
        }
        AppAgent.onTrace("onCreate", true);
        if (C2104108Md.LJ(this) || C2104108Md.LIZJ(this) || C2104108Md.LIZIZ(this) || ((strLIZ = C2104108Md.LIZ(this)) != null && strLIZ.endsWith(":account"))) {
            super.onCreate();
            AppAgent.onTrace("onCreate", false);
            return;
        }
        C20182613y4.LIZLLL().LJ().LIZ("cold_boot_application_create_duration");
        C0X35.LJIIJJI("cold_boot_application_attach_to_create", true);
        C0X35.LIZ("cold_boot_application_create_duration", true);
        C0X35.LIZIZ("cold_boot_application_create_duration");
        C202098145w c202098145wLIZ = C08TN.LIZ();
        EnumC1609840rzi enumC1609840rzi = EnumC1609840rzi.APPLICATION_CREATE;
        if (enumC1609840rzi != null) {
            c202098145wLIZ.LJJJLIIL = enumC1609840rzi;
            c202098145wLIZ.LJJJLL = 0L;
            c202098145wLIZ.LJJJLZIJ = 0L;
        } else {
            c202098145wLIZ.getClass();
        }
        C0X35.LIZ("application_create_begin_to_super", true);
        this.LL.LJI();
        C0X35.LJIIJJI("application_create_begin_to_super", true);
        C0X35.LIZ("application_create_super_duration", true);
        super.onCreate();
        C0X35.LJIIJJI("application_create_super_duration", true);
        C0X35.LIZ("application_create_super_to_end", true);
        this.LL.onCreate();
        setTheme(R.style.xm);
        Resources.Theme theme = super.getTheme();
        Resources.Theme theme2 = NxRewordManager.LJIIL;
        if (theme2 != null) {
            theme2.setTo(theme);
        }
        KevaCacheManager.init(this, C0BED.LIZLLL, C0BED.LIZ, C0BED.LIZIZ, C0BED.LIZJ);
        C0X35.LJIIJJI("application_create_super_to_end", true);
        C0X35.LJIIJJI("cold_boot_application_create_duration", true);
        C0X35.LIZ("cold_boot_application_to_main", true);
        C0X35.LIZIZ("cold_boot_application_to_main");
        C20182613y4.LIZLLL().LJ().LIZ("cold_boot_application_to_main");
        if (!C582580Mt6.LIZ) {
            try {
                if (C08Q0.LJ(this, "resource_psi_enabled", false)) {
                    try {
                        C582580Mt6.LIZIZ = true;
                        C2214641Bm2.LJIIIIZZ(this);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C582580Mt6.LIZ = true;
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C582580Mt6.LIZ = true;
            }
        }
        AppAgent.onTrace("onCreate", false);
    }

    public AwemeHostApplication() {
        AppAgent.onTrace("<init>", true);
        C202094145s.LJII = SystemClock.uptimeMillis();
        C202094145s.LJIIIIZZ = System.currentTimeMillis();
        C202094145s.LJIIIZ = SystemClock.elapsedRealtime();
        C202094145s.LJI = SystemClock.currentThreadTimeMillis();
        C1BWL.LIZ = new C1BWN(this);
        if (C08Q1.LIZJ()) {
            final AwemeAppBuildConfig awemeAppBuildConfig = new AwemeAppBuildConfig();
            final C1BWV c1bwv = new C1BWV();
            this.LL = new C1BWK(this, awemeAppBuildConfig, c1bwv) { // from class: X.1BX3
                public final Application LIZ;
                public final AppBuildConfig LIZIZ;
                public final C1BWW LIZJ;
                public boolean LIZLLL;

                @Override // X.C1BWK
                public final void LIZ() {
                }

                @Override // X.C1BWK
                public final Resources LIZJ(Resources resources) {
                    return resources;
                }

                @Override // X.C1BWK
                public final String LIZLLL(String str) {
                    return null;
                }

                @Override // X.C1BWK
                public final void LJFF() {
                }

                @Override // X.C1BWK
                public final void LJII() {
                }

                @Override // X.C1BWK
                public final void LJI() {
                    IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService;
                    C2215308m7.LIZ(this.LIZ);
                    C799900VZk.LIZ.getClass();
                    C799890VZj c799890VZj = new C799890VZj();
                    C1BX8 c1bx8 = C1BX8.LIZIZ;
                    c799890VZj.LIZ(c1bx8.LJI());
                    c799890VZj.LIZ(C0CKL.LIZIZ.LIZIZ());
                    c799890VZj.LIZ(C04U9.LIZIZ.LIZ());
                    c799890VZj.LIZIZ();
                    C844470XAv.LIZ.getClass();
                    if (!C844470XAv.LJIILL.equals("local_test")) {
                        C799890VZj c799890VZj2 = new C799890VZj();
                        c799890VZj2.LIZ(new KidsPumbaaTask());
                        c799890VZj2.LIZIZ();
                    }
                    C799890VZj c799890VZj3 = new C799890VZj();
                    c799890VZj3.LIZ(new KidsDMTask());
                    c799890VZj3.LIZIZ();
                    C1150504el.LIZ().LIZLLL("method_init_ttnet_duration", false);
                    C799890VZj c799890VZj4 = new C799890VZj();
                    c799890VZj4.LIZ(new ResetTTNetworkStateIndexTask());
                    c799890VZj4.LIZ(C788100Uvo.LIZ ? new InitTTNetTask() : new com.ss.android.ugc.aweme.legoImp.task.InitTTNetTask());
                    c799890VZj4.LIZIZ();
                    C1150504el.LIZ().LJI("method_init_ttnet_duration", false);
                    if (this.LIZLLL) {
                        C799890VZj c799890VZj5 = new C799890VZj();
                        if (TasksHolder.LIZJ == null) {
                            TasksHolder.LIZJ = C1BXS.LIZIZ.LIZIZ();
                        }
                        c799890VZj5.LIZ(TasksHolder.LIZJ);
                        c799890VZj5.LIZ(new KidsModeInitRouterTask());
                        c799890VZj5.LIZ(new FontTask());
                        c799890VZj5.LIZIZ();
                    }
                    C799890VZj c799890VZj6 = new C799890VZj();
                    C1BX7 c1bx7 = C1BX7.LIZIZ;
                    c799890VZj6.LIZ(c1bx7.LJ());
                    c799890VZj6.LIZ(c1bx7.LJII());
                    c799890VZj6.LIZ(c1bx7.LIZ(EnumC799870VZh.BOOT_FINISH));
                    c799890VZj6.LIZ(c1bx8.LIZLLL());
                    c799890VZj6.LIZ(TasksHolder.LIZIZ());
                    c799890VZj6.LIZIZ();
                    if (this.LIZLLL && C0CBO.LIZ() == 1 && (iUnKnownOwnershipBusinessOuterService = (IUnKnownOwnershipBusinessOuterService) PluggableExtentionKt.pluggableSpi(IUnKnownOwnershipBusinessOuterService.class)) != null) {
                        C799890VZj c799890VZj7 = new C799890VZj();
                        c799890VZj7.LIZ(iUnKnownOwnershipBusinessOuterService.LJI());
                        c799890VZj7.LIZ(new MessageControllerTask());
                        c799890VZj7.LIZIZ();
                    }
                    C799890VZj c799890VZj8 = new C799890VZj();
                    c799890VZj8.LIZ(new CAITTMStrategyCenterRequest());
                    c799890VZj8.LIZIZ();
                    if (this.LIZLLL) {
                        C799890VZj c799890VZj9 = new C799890VZj();
                        if (InitModules.LL == null) {
                            InitModules.LL = new InitModules();
                        }
                        c799890VZj9.LIZ(InitModules.LL);
                        c799890VZj9.LIZIZ();
                    }
                    if (this.LIZLLL) {
                        C799890VZj c799890VZj10 = new C799890VZj();
                        c799890VZj10.LIZ(new AabPluginServiceInitTask());
                        c799890VZj10.LIZIZ();
                    }
                    C1150504el.LIZ().LIZLLL("method_thread_pool_inject_duration", false);
                    C799890VZj c799890VZj11 = new C799890VZj();
                    c799890VZj11.LIZ(new ThreadPoolInjectTask());
                    c799890VZj11.LIZIZ();
                    C1150504el.LIZ().LJI("method_thread_pool_inject_duration", false);
                    C792850V8h.LIZ = new ACallableS150S0000000_13(1);
                    if (this.LIZLLL) {
                        C799890VZj c799890VZj12 = new C799890VZj();
                        c799890VZj12.LIZ(new TuxInitTask());
                        C1BX5 c1bx5 = C1BX5.LIZIZ;
                        c799890VZj12.LIZ(c1bx5.LJIILIIL());
                        c799890VZj12.LIZ(c1bx5.LJIJJ());
                        c799890VZj12.LIZ(c1bx5.LJIJI());
                        c799890VZj12.LIZ(c1bx5.LJJ());
                        c799890VZj12.LIZIZ();
                    }
                    if (this.LIZLLL) {
                        if (((Boolean) C288540BSq.LIZIZ.getValue()).booleanValue()) {
                            C799890VZj c799890VZj13 = new C799890VZj();
                            c799890VZj13.LIZ(new GeckoCustomRequest());
                            c799890VZj13.LIZ(new GeckoGlobalInitTask());
                            c799890VZj13.LIZ(new GeckoLocalRequestV2());
                            c799890VZj13.LIZIZ();
                            return;
                        }
                        C799890VZj c799890VZj14 = new C799890VZj();
                        c799890VZj14.LIZ(new GeckoCustomRequest());
                        c799890VZj14.LIZ(new GeckoGlobalInitTask());
                        c799890VZj14.LIZ(new GeckoLocalRequest());
                        c799890VZj14.LIZIZ();
                    }
                }

                @Override // X.C1BWK
                public final void onCreate() {
                    C0CCZ c0cczLIZIZ;
                    IKidsCommonService iKidsCommonService = (IKidsCommonService) PluggableExtentionKt.pluggableSpi(IKidsCommonService.class);
                    if (this.LIZLLL && iKidsCommonService != null) {
                        iKidsCommonService.LJFF();
                    }
                    ((IExternalService) ServiceManager.get().getService(IExternalService.class)).attachApplication(this.LIZ);
                    if (this.LIZLLL) {
                        C799900VZk.LIZ.getClass();
                        C799890VZj c799890VZj = new C799890VZj();
                        c799890VZj.LIZ(TasksHolder.LIZ());
                        c799890VZj.LIZIZ();
                    }
                    C799900VZk.LIZ.getClass();
                    C799890VZj c799890VZj2 = new C799890VZj();
                    c799890VZj2.LIZ(new NetworkUtilsTask());
                    c799890VZj2.LIZIZ();
                    if (this.LIZLLL) {
                        C799890VZj c799890VZj3 = new C799890VZj();
                        c799890VZj3.LIZ(new KidsModeGeoBlockingInitTask());
                        c799890VZj3.LIZIZ();
                    }
                    if (this.LIZLLL) {
                        C799890VZj c799890VZj4 = new C799890VZj();
                        c799890VZj4.LIZ(new DecompressTask());
                        c799890VZj4.LIZIZ();
                    }
                    if (this.LIZLLL) {
                        C0CPH c0cph = new C0CPH();
                        c0cph.LIZ(new JsBridge2InitTask(EnumC799870VZh.BACKGROUND));
                        c0cph.LIZ(new JsBridge2InitTask(EnumC799870VZh.BOOT_FINISH));
                        c0cph.LIZ(new KidsModeInitRuntimeTask(this.LIZ));
                        c0cph.LIZIZ();
                    }
                    C19GV c19gv = C19GT.LL;
                    C799890VZj c799890VZj5 = new C799890VZj();
                    c799890VZj5.LIZ(new KidsModeLegacyTask());
                    c799890VZj5.LIZ(PlayerKitInitTask.LIZ());
                    c799890VZj5.LIZ(PlayerKitCommonWidgetInitTask.LL);
                    c799890VZj5.LIZ(new InitFramework());
                    c799890VZj5.LIZ(InitAVModule.LJIIIIZZ());
                    c799890VZj5.LIZ(new InitReportSignature());
                    c799890VZj5.LIZ(new InitTaskManager());
                    c799890VZj5.LIZ(new PopupConfigTask());
                    c799890VZj5.LIZ(new InitMusicManager());
                    c799890VZj5.LIZIZ();
                    if (((Boolean) C07HQ.LIZIZ.getValue()).booleanValue()) {
                        C799890VZj c799890VZj6 = new C799890VZj();
                        c799890VZj6.LIZ(new AdjustMusicVolume());
                        c799890VZj6.LIZIZ();
                    }
                    if (!((Boolean) C285090BFj.LJJIIJZLJL.getValue()).booleanValue()) {
                        C799890VZj c799890VZj7 = new C799890VZj();
                        c799890VZj7.LIZ(((IAccountInitializerTaskApi) ServiceManager.get().getService(IAccountInitializerTaskApi.class)).LIZLLL());
                        c799890VZj7.LIZIZ();
                    }
                    C799890VZj c799890VZj8 = new C799890VZj();
                    c799890VZj8.LIZ(new GetGoogleAIdTask(EnumC799870VZh.BACKGROUND));
                    C1BX7 c1bx7 = C1BX7.LIZIZ;
                    c799890VZj8.LIZ(c1bx7.LJI());
                    if (!((Boolean) C1867150ygj.LIZJ.getValue()).booleanValue()) {
                        c799890VZj8.LIZ(new BulletPreloadTask());
                        c799890VZj8.LIZ(new BulletOptimizationTask());
                        c799890VZj8.LIZ(new BulletAssemblerInitTask());
                        c799890VZj8.LIZIZ();
                    }
                    if (this.LIZLLL) {
                        C799890VZj c799890VZj9 = new C799890VZj();
                        C1BX5 c1bx5 = C1BX5.LIZIZ;
                        c799890VZj9.LIZ(c1bx5.LJIIZILJ());
                        c799890VZj9.LIZ(c1bx5.LJIIJ());
                        c799890VZj9.LIZIZ();
                    }
                    C799890VZj c799890VZj10 = new C799890VZj();
                    c799890VZj10.LIZ(new KidsModeStorageTask());
                    c799890VZj10.LIZ(new SetAppTrackTask());
                    c799890VZj10.LIZ(new DeviceInfoReportTask());
                    c799890VZj10.LIZ(new JacocoTask());
                    c799890VZj10.LIZ(c1bx7.LJIIIIZZ(EnumC799870VZh.BOOT_FINISH));
                    if (Build.VERSION.SDK_INT < 28) {
                        c799890VZj10.LIZ(new PreloadResCleanerTask());
                    }
                    c799890VZj10.LIZIZ();
                    C799890VZj c799890VZj11 = new C799890VZj();
                    c799890VZj11.LIZ(new EnterMusicGuideColdStartTask());
                    c799890VZj11.LIZ(new InitMusicServiceTask());
                    c799890VZj11.LIZ(new InitAnywhereService());
                    c799890VZj11.LIZIZ();
                    C799890VZj c799890VZj12 = new C799890VZj();
                    c799890VZj12.LIZ(ApmInit.LL);
                    c799890VZj12.LIZIZ();
                    if (((Boolean) C0BLM.LIZ.getValue()).booleanValue()) {
                        C799890VZj c799890VZj13 = new C799890VZj();
                        c799890VZj13.LIZ(new MiloInitTask());
                        c799890VZj13.LIZIZ();
                    }
                    boolean z = C0XKT.LIZIZ() == 1;
                    C0XKT.LIZ(1, z);
                    if (z) {
                        C799890VZj c799890VZj14 = new C799890VZj();
                        c799890VZj14.LIZ(new OrbuInitTask());
                        c799890VZj14.LIZIZ();
                    }
                    if (((Boolean) C0BLK.LIZ.getValue()).booleanValue()) {
                        C799890VZj c799890VZj15 = new C799890VZj();
                        c799890VZj15.LIZ(new FluencySdkInitTask());
                        c799890VZj15.LIZIZ();
                    }
                    TTWebViewEnableStatusSettings.LIZ.getClass();
                    if (TTWebViewEnableStatusSettings.LIZ().isTTWebViewEnabled || TTWebViewEnableStatusSettings.LIZ().isDownloadEnabled) {
                        new C799890VZj().LIZ(new TTWebViewSubTask());
                    }
                    C799890VZj c799890VZj16 = new C799890VZj();
                    c799890VZj16.LIZ(new InitDownloadComponentTask());
                    c799890VZj16.LIZ(new ProcessMonitorTask());
                    c799890VZj16.LIZ(new ExperienceKitInitTask());
                    c799890VZj16.LIZ(new InitWebViewHookTask());
                    c799890VZj16.LIZ(new TTWebViewKeepAliveTask());
                    c799890VZj16.LIZIZ();
                    InitAVModule initAVModuleLJIIIIZZ = InitAVModule.LJIIIIZZ();
                    C799900VZk.LIZJ(initAVModuleLJIIIIZZ);
                    initAVModuleLJIIIIZZ.LJIIIZ();
                    if (this.LIZLLL) {
                        C799890VZj c799890VZj17 = new C799890VZj();
                        c799890VZj17.LIZ(new KidsModePolicyNoticeTask());
                        c799890VZj17.LIZ(new KidsModeFetchKidsSettingTask());
                        c799890VZj17.LIZ(new KidsModeQueryUserInfoTask());
                        c799890VZj17.LIZ(new KidsModeCheckAABDownloadTask());
                        c799890VZj17.LIZIZ();
                    }
                    if (this.LIZLLL) {
                        SocialWidgetLegoTask socialWidgetLegoTaskLIZLLL = ((IAppWidgetService) ServiceManager.get().getService(IAppWidgetService.class)).LIZLLL();
                        if (socialWidgetLegoTaskLIZLLL != null) {
                            C799890VZj c799890VZj18 = new C799890VZj();
                            c799890VZj18.LIZ(socialWidgetLegoTaskLIZLLL);
                            c799890VZj18.LIZIZ();
                        }
                        C799890VZj c799890VZj19 = new C799890VZj();
                        c799890VZj19.LIZ(new SecShareSdkTask());
                        c799890VZj19.LIZIZ();
                        SearchWidgetTask searchWidgetTaskLJFF = ((IAppWidgetService) ServiceManager.get().getService(IAppWidgetService.class)).LJFF();
                        C799890VZj c799890VZj20 = new C799890VZj();
                        c799890VZj20.LIZ(searchWidgetTaskLJFF);
                        c799890VZj20.LIZIZ();
                    }
                    C799890VZj c799890VZj21 = new C799890VZj();
                    c799890VZj21.LIZ(new PNSKidStateMachineInitTask());
                    c799890VZj21.LIZIZ();
                    C799890VZj c799890VZj22 = new C799890VZj();
                    c799890VZj22.LIZ(new KidsModeGateKeeperInitTask());
                    c799890VZj22.LIZIZ();
                    C799890VZj c799890VZj23 = new C799890VZj();
                    c799890VZj23.LIZ(new TTMockTask());
                    c799890VZj23.LIZIZ();
                    IKidsScreenTimeService iKidsScreenTimeService = (IKidsScreenTimeService) PluggableExtentionKt.pluggableSpi(IKidsScreenTimeService.class);
                    if (iKidsScreenTimeService == null || (c0cczLIZIZ = iKidsScreenTimeService.LIZIZ()) == null) {
                        return;
                    }
                    C799890VZj c799890VZj24 = new C799890VZj();
                    c799890VZj24.LIZ(c0cczLIZIZ);
                    c799890VZj24.LIZIZ();
                }

                @Override // X.C1BWK
                public final void LIZIZ(Context context) throws Throwable {
                    this.LIZLLL = C2162308dZ.LJI(this.LIZ);
                    C2236808pa.LIZ(this.LIZ, C2162308dZ.LJI(this.LIZ));
                    C1BWZ c1bwz = C1BWZ.LIZ;
                    Application application = this.LIZ;
                    AppBuildConfig appBuildConfig = this.LIZIZ;
                    c1bwz.getClass();
                    C1BWZ.LIZ(application, appBuildConfig);
                    C1BWY c1bwy = C1BWY.LIZ;
                    Application application2 = this.LIZ;
                    AppBuildConfig appBuildConfig2 = this.LIZIZ;
                    c1bwy.getClass();
                    C1BWY.LIZ(application2, appBuildConfig2);
                    C1150504el.LIZ().LIZLLL("cold_boot_application_attach_before_base_duration", false);
                    C0V2C.LIZ();
                    AwemeConfigCenter.LIZ();
                    AppLog.setSwitchToBdtracker(true);
                    if (C08Q0.LJ(context, "optimize_loadabrepo_v2", false)) {
                        C823050WQl.LIZLLL().execute(new ARunnableS84S0000000_4(13));
                        C823050WQl.LIZLLL().execute(new ARunnableS84S0000000_4(14));
                    }
                    C0VZV.LIZ(this.LIZ);
                    C1150504el.LIZ().LJI("cold_boot_application_attach_before_base_duration", false);
                    C1BWV.LIZ(this.LIZ);
                    C2093808Ie.LIZ.getClass();
                    C2093808Ie.LIZ(context);
                    C2094108Ih.LIZIZ();
                    C086L.LIZ();
                    C0V60.LIZ();
                    C844470XAv.LIZ.getClass();
                    if (C844470XAv.LJIILL.equals("local_test")) {
                        C799900VZk.LIZ.getClass();
                        C799890VZj c799890VZj = new C799890VZj();
                        c799890VZj.LIZ(new KidsPumbaaTask());
                        c799890VZj.LIZIZ();
                    }
                    IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService = (IUnKnownOwnershipBusinessOuterService) PluggableExtentionKt.pluggableSpi(IUnKnownOwnershipBusinessOuterService.class);
                    if (iUnKnownOwnershipBusinessOuterService != null) {
                        iUnKnownOwnershipBusinessOuterService.LJJIIJ(context);
                    }
                    C20250514Ln.LIZ.getClass();
                    C20250514Ln.LIZIZ(context);
                    C0W87.LIZ.getClass();
                    C0W87.LIZ(context);
                    C799900VZk.LIZ.getClass();
                    C799890VZj c799890VZj2 = new C799890VZj();
                    c799890VZj2.LIZ(new FrescoSoLoadSetter());
                    c799890VZj2.LIZIZ();
                    Application application3 = this.LIZ;
                    application3.getClass();
                    C2354709Kn.LIZ = application3;
                    C799890VZj c799890VZj3 = new C799890VZj();
                    c799890VZj3.LIZ(new SharePreferencePreloadForAllProcessTask());
                    c799890VZj3.LIZ(C1BX8.LIZIZ.LJIIIIZZ());
                    c799890VZj3.LIZIZ();
                    try {
                        a.install(context);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    SplitCompatInstall.LL.run(context);
                    try {
                        Class<?> cls = Class.forName("android.app.ActivityThread");
                        Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
                        declaredMethod.setAccessible(true);
                        Object objInvoke = declaredMethod.invoke(cls, new Object[0]);
                        Field declaredField = objInvoke.getClass().getDeclaredField("mInstrumentation");
                        declaredField.setAccessible(true);
                        declaredField.set(objInvoke, new ChildActivityInstrumentation((Instrumentation) declaredField.get(objInvoke)));
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C1AF0.LJFF(e2, "ChildActivityHook.startHook");
                    }
                    C799900VZk.LIZ.getClass();
                    C799890VZj c799890VZj4 = new C799890VZj();
                    c799890VZj4.LIZ(new StoreRegionInitTask());
                    c799890VZj4.LIZIZ();
                    if (this.LIZLLL) {
                        C1150504el.LIZ().LJI("cold_boot_application_attach_duration", true);
                        C1150504el.LIZ().LIZLLL("cold_boot_application_attach_to_create", true);
                    }
                }

                @Override // X.C1BWK
                public final void LJ(Context context) {
                    this.LIZIZ.LJIIIIZZ();
                    Librarian.LJ(context, "46.0.1", C1225404qq.LIZ(), C1223504qX.LIZ(), new LibrarianMonitor(context) { // from class: X.13qf
                        @Override // com.bytedance.librarian.LibrarianMonitor
                        public final void LIZ(String str) {
                            TextUtils.isEmpty(str);
                            System.loadLibrary(str);
                            TextUtils.isEmpty(str);
                        }
                    });
                    if (C08Q0.LIZIZ(context, 0, "fix_librarian_empty_apks") == 1) {
                        C823050WQl.LIZLLL().execute(new ARunnableS83S0000000_3(39));
                    }
                    C1519870peb.LIZ(context);
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 27) {
                        C20129813pY.LIZ();
                    }
                    C2409809cO.LIZ = this.LIZ;
                    try {
                        C2409809cO.LIZIZ = C08Q0.LJ(context, "optimize_cold_boot_hook_app_context", true);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    this.LIZIZ.LJIIL();
                    C2405409bg.LIZ = "disabled";
                    C0CQU c0cqu = C844470XAv.LJIIIIZZ;
                    c0cqu.LIZ = "api-va.tiktokv.com";
                    c0cqu.LIZJ = "ichannel-va.tiktokv.com";
                    c0cqu.LIZIZ = "api-va.tiktokv.com";
                    c0cqu.LIZLLL = "widget-va.tiktokv.com";
                    C1BYN c1byn = C1BYN.LIZIZ;
                    c1byn.LJFF(C844470XAv.LJIIIIZZ.LIZ, C844470XAv.LJIIIIZZ.LIZIZ, C844470XAv.LJIIIIZZ.LIZJ);
                    c1byn.LIZLLL();
                    C0X4M.LIZ();
                    C1491980ovc c1491980ovc = C1491980ovc.LIZ;
                    Handler handlerLIZIZ = C799570VYd.LIZIZ();
                    c1491980ovc.getClass();
                    C1491980ovc.LJ = handlerLIZIZ;
                    C823050WQl.LIZIZ().execute(RunnableC2206381BWy.LL);
                    if (i >= 33 && C2104108Md.LIZLLL(context)) {
                        try {
                            C08P9.LIZLLL(context);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            System.err.println(th2);
                        }
                    }
                }

                @Override // X.C1BWK
                public final void onTrimMemory(int i) {
                    C799900VZk.LIZ.getClass();
                    C799890VZj c799890VZj = new C799890VZj();
                    c799890VZj.LIZ(new TrimMemoryTask(i));
                    c799890VZj.LIZIZ();
                }

                {
                    this.LIZ = this;
                    this.LIZIZ = awemeAppBuildConfig;
                    this.LIZJ = c1bwv;
                }
            };
        } else {
            String strLIZIZ = C2104408Mg.LIZIZ(this);
            if (strLIZIZ == null || !u.LJIIZILJ(strLIZIZ, ":error_activity", false)) {
                this.LL = new C1BX1(this, new AwemeAppBuildConfig(), new C1BWV());
            } else {
                final AwemeAppBuildConfig awemeAppBuildConfig2 = new AwemeAppBuildConfig();
                this.LL = new C1BWU(this, awemeAppBuildConfig2) { // from class: X.1BWT
                    public final Application LIZ;
                    public final AppBuildConfig LIZIZ;

                    @Override // X.C1BWK
                    public final Resources LIZJ(Resources resources) {
                        return resources;
                    }

                    @Override // X.C1BWK
                    public final void LIZIZ(Context context) {
                        if (context != null) {
                            NxRewordManager.LIZ.LIZJ(context, new C818150W7p(context.getResources().getConfiguration().locale, "", false, null, new C823760WTe(C0W86.LIZ), null, null, 1780), new AwS609S0100000_30(context, 281));
                        }
                        C1BWZ c1bwz = C1BWZ.LIZ;
                        Application application = this.LIZ;
                        AppBuildConfig appBuildConfig = this.LIZIZ;
                        c1bwz.getClass();
                        C1BWZ.LIZ(application, appBuildConfig);
                        C1BWY c1bwy = C1BWY.LIZ;
                        Application application2 = this.LIZ;
                        AppBuildConfig appBuildConfig2 = this.LIZIZ;
                        c1bwy.getClass();
                        C1BWY.LIZ(application2, appBuildConfig2);
                    }

                    @Override // X.C1BWK
                    public final void LJ(Context context) {
                        this.LIZIZ.LJIIIIZZ();
                        Librarian.LJ(context, "46.0.1", C1225404qq.LIZ(), C1223504qX.LIZ(), new LibrarianMonitor() { // from class: X.145v
                            @Override // com.bytedance.librarian.LibrarianMonitor
                            public final void LIZ(String str) {
                                System.loadLibrary(str);
                            }
                        });
                        C1519870peb.LIZ(context);
                        if (context != null) {
                            ((IAbMockService) ServiceManager.get().getService(IAbMockService.class)).init();
                            new ABTask().run(context);
                        }
                        if (Build.VERSION.SDK_INT >= 33 && C2104108Md.LIZLLL(context)) {
                            try {
                                C08P9.LIZLLL(context);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                System.err.println(th);
                            }
                        }
                    }

                    {
                        this.LIZ = this;
                        this.LIZIZ = awemeAppBuildConfig2;
                    }
                };
            }
        }
        registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.1BWM
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPreCreated(Activity activity, Bundle bundle) {
                activity.setTheme(R.style.ih);
            }
        });
        C202094145s.LJIIJ = SystemClock.uptimeMillis();
        AppAgent.onTrace("<init>", false);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (C2104108Md.LJ(this) || C2104108Md.LIZJ(this) || C2104108Md.LIZIZ(this)) {
            return NxRewordManager.LJFF(this, super.getResources());
        }
        C1BWK c1bwk = this.LL;
        Resources resources = super.getResources();
        c1bwk.LIZJ(resources);
        return NxRewordManager.LJFF(this, resources);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = super.getTheme();
        if (NxRewordManager.LJIIJ == null) {
            return theme;
        }
        if (NxRewordManager.LJIIL == null) {
            C817670W5t c817670W5t = NxRewordManager.LJIIJ;
            Resources.Theme themeNewTheme = c817670W5t == null ? null : c817670W5t.newTheme();
            NxRewordManager.LJIIL = themeNewTheme;
            if (themeNewTheme != null) {
                themeNewTheme.setTo(theme);
            }
        }
        return NxRewordManager.LJIIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0146  */
    @Override // android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void attachBaseContext(final android.content.Context r14) {
        /*
            Method dump skipped, instruction units count: 823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.host.AwemeHostApplication.attachBaseContext(android.content.Context):void");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        Object systemService = super.getSystemService(str);
        if (str.equals("layout_inflater")) {
            return new C0J4J(this, (LayoutInflater) systemService);
        }
        return systemService;
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        if (!C2104108Md.LJ(this) && !C2104108Md.LIZJ(this) && !C2104108Md.LIZIZ(this)) {
            this.LL.LJII();
            super.onConfigurationChanged(configuration);
            this.LL.LIZ();
            return;
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (!C2104108Md.LJ(this) && !C2104108Md.LIZJ(this) && !C2104108Md.LIZIZ(this)) {
            this.LL.LJFF();
            super.onTrimMemory(i);
            this.LL.onTrimMemory(i);
            return;
        }
        super.onTrimMemory(i);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        C2413309cx.LIZ(AFwS224S0000000_33.get$arr$(611));
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(this, intent, "Context_startActivity_1");
        super.startActivity(intent);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory) {
        if (!C2104108Md.LJ(this) && !C2104108Md.LIZJ(this) && !C2104108Md.LIZIZ(this)) {
            return super.openOrCreateDatabase(this.LL.LIZLLL(str), i, cursorFactory);
        }
        return super.openOrCreateDatabase(str, i, cursorFactory);
    }
}
