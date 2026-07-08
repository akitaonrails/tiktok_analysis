package com.ss.android.ugc.aweme.main;

import X.AnonymousClass0716;
import X.AnonymousClass0883;
import X.C01GW;
import X.C092G;
import X.C0B4B;
import X.C0BHY;
import X.C0BL2;
import X.C0BPC;
import X.C0C78;
import X.C0CD2;
import X.C0CFN;
import X.C0CP9;
import X.C0N5P;
import X.C0N5R;
import X.C0S78;
import X.C0VWH;
import X.C0VWL;
import X.C0VWW;
import X.C0WZX;
import X.C0X35;
import X.C0X76;
import X.C0X9S;
import X.C10TN;
import X.C1150504el;
import X.C1228904rP;
import X.C1253130iiN;
import X.C1486210omJ;
import X.C14KQ;
import X.C1559260qg8;
import X.C1590040rTm;
import X.C1591880rWk;
import X.C1602200rnO;
import X.C1697120uGU;
import X.C1957307lb;
import X.C1959507lx;
import X.C1960207m4;
import X.C1961107mD;
import X.C19EG;
import X.C1BCA;
import X.C1BD3;
import X.C1DG0;
import X.C1E83;
import X.C20673215v0;
import X.C20689088p;
import X.C21600419gA;
import X.C2184481AeU;
import X.C2184491AeV;
import X.C2184501AeW;
import X.C2184511AeX;
import X.C2184641Aek;
import X.C2188271Akb;
import X.C2204961BRm;
import X.C2214201BlK;
import X.C2274271E0b;
import X.C2279461EKa;
import X.C2407009bw;
import X.C2517009tg;
import X.C260340AIe;
import X.C269120Agg;
import X.C269150Agj;
import X.C279300Ax6;
import X.C303880Bve;
import X.C305630ByT;
import X.C309580CBo;
import X.C313520CQs;
import X.C313530CQt;
import X.C584470Mw9;
import X.C585110MxB;
import X.C710360Rti;
import X.C710400Rtm;
import X.C723590SZx;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C786450Ut9;
import X.C798520VUc;
import X.C799570VYd;
import X.C799890VZj;
import X.C799900VZk;
import X.C823050WQl;
import X.EnumC312610CNf;
import X.EnumC584340Mvw;
import X.InterfaceC1006670cIr;
import X.InterfaceC1501030pAD;
import X.InterfaceC1501170pAR;
import X.InterfaceC21605119gv;
import X.InterfaceC2174708fZ;
import Y.ARunnableS111S0100000_11;
import Y.AfS133S0000000_9;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.Choreographer;
import android.view.View;
import android.view.Window;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.common.jato.gfx.DoFrameController;
import com.bytedance.hox.Hox;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.otis.optimise.system.doframe.MethodDeOptimize;
import com.bytedance.tiktok.homepage.mainactivity.PreloadActicityTask;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.app.services.ILauncherService;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.boot.speeder.SpeederService;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.IHomePageService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.services.BusinessModuleService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import com.zhiliaoapp.musically.R;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS577S0100000_33;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public final class PerformanceActivityAssem extends BaseMainContainerAssem {
    public boolean LL;
    public boolean LLILLJJLI = true;
    public final C1559260qg8 LLILLL = new C1559260qg8(new C723590SZx(this, C2184501AeW.class, null), checkSupervisorPrepared());

    /* JADX INFO: loaded from: classes24.dex */
    public interface FileApi {
        @C092G
        @InterfaceC1501170pAR
        C0X9S<String> upload(@InterfaceC2174708fZ String str, @InterfaceC1501030pAD List<C0X76> list);
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        Window window;
        View decorView;
        int i;
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"PerformanceActivityAssem", "onCreate"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C0S78.LJII(((Boolean) C1E83.LIZIZ.getValue()).booleanValue(), new C710400Rtm(c19egLIZ));
            if (!AnonymousClass0716.LIZIZ()) {
                Hox hoxLIZ = Hox.LLJILJIL.LIZ(c19egLIZ);
                C799900VZk.LIZ.getClass();
                C799890VZj c799890VZj = new C799890VZj();
                c799890VZj.LIZ(new PreloadActicityTask());
                c799890VZj.LIZ(((IHomePageService) ServiceManager.get().getService(IHomePageService.class)).LJI().LIZ(hoxLIZ));
                c799890VZj.LIZIZ();
            }
            C0S78.LJII(((Boolean) C1E83.LIZJ.getValue()).booleanValue(), new C2184481AeU());
            C786450Ut9.LJ = true;
            C0CFN.LIZJ(new Runnable() { // from class: X.08Ib
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PerformanceActivityAssem@39b8.onCreate$choreographerOptServiceRunnable$1");
                    try {
                        if (C2504109rb.LIZ || C20641086t.LIZ || C722660SWi.LIZIZ()) {
                            C20639086r.LIZ.LIZIZ();
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PerformanceActivityAssem@39b8.onCreate$choreographerOptServiceRunnable$1");
                }
            }, "choreographerOptServiceRunnable", ((Boolean) C2188271Akb.LJFF.getValue()).booleanValue());
            if (!((Boolean) C1E83.LIZLLL.getValue()).booleanValue()) {
                if (((Boolean) C2274271E0b.LIZIZ.getValue()).booleanValue()) {
                    ((ArrayList) C1590040rTm.LIZ).add(new ARunnableS111S0100000_11(this, c19egLIZ, 39));
                } else {
                    ((ILocationService) ServiceManager.get().getService(ILocationService.class)).LJIJJLI();
                }
            }
            try {
                C0CFN.LIZJ(new Runnable() { // from class: X.08IZ
                    public static void LIZ() {
                        C08IS c08is = new C08IS();
                        synchronized (DoFrameController.class) {
                            DoFrameController.LIZIZ(C786410Ut5.v2(), c08is);
                        }
                        ((IHomePageService) ServiceManager.get().getService(IHomePageService.class)).LIZ();
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("PerformanceActivityAssem@39b8.onCreate$doFrameControllerRunnable$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("PerformanceActivityAssem@39b8.onCreate$doFrameControllerRunnable$1");
                    }
                }, "doFrameControllerRunnable", ((Boolean) C2188271Akb.LJI.getValue()).booleanValue());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (((Boolean) C2279461EKa.LJII.getValue()).booleanValue()) {
                C823050WQl.LIZJ().execute(new Runnable() { // from class: X.14hK
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("PerformanceActivityAssem@39b8.onCreate$4");
                        try {
                            BusinessModuleService businessModuleService = (BusinessModuleService) PluggableExtentionKt.pluggableSpi$default(BusinessModuleService.class, false, false, false, 14, null);
                            if (businessModuleService != null) {
                                businessModuleService.getInitialChooseLanguageManager();
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("PerformanceActivityAssem@39b8.onCreate$4");
                    }
                });
            }
            if (((Boolean) C269120Agg.LIZ.getValue()).booleanValue() && (i = Build.VERSION.SDK_INT) > 30 && i <= ((Number) C0BPC.LIZ.getValue()).intValue()) {
                if (((Boolean) C269150Agj.LIZ.getValue()).booleanValue()) {
                    C786410Ut5.LJLIIL(((Number) C0BHY.LIZ.getValue()).longValue(), C799570VYd.LIZIZ(), new Runnable() { // from class: X.08G7
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("DoFrameFixHookManager@ca79.tryHook$1");
                            try {
                                MethodDeOptimize.deOptimizeOnVsync();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("DoFrameFixHookManager@ca79.tryHook$1");
                        }
                    });
                } else {
                    C786410Ut5.LJLIIL(2000L, C799570VYd.LIZJ(), new Runnable() { // from class: X.08G5
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("DoFrameFixHookManager@ca79.tryHook$2");
                            try {
                                MethodDeOptimize.deOptimizeOnVsync();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("DoFrameFixHookManager@ca79.tryHook$2");
                        }
                    });
                }
            }
            C1697120uGU.LIZIZ = ((Boolean) C309580CBo.LIZ.getValue()).booleanValue();
            if (((Boolean) C305630ByT.LIZIZ.getValue()).booleanValue() && (window = c19egLIZ.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                decorView.setBackground(null);
            }
            if (((Boolean) C279300Ax6.LIZ.getValue()).booleanValue()) {
                C21600419gA.LJIJI = new InterfaceC21605119gv() { // from class: X.0NCj
                    @Override // X.InterfaceC21605119gv
                    public final int LIZIZ() {
                        Integer num;
                        FeatureServiceManager.Companion.getClass();
                        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_client_ai", 0, 2, null);
                        Object feature$default = producer$default != null ? FeatureProducer.getFeature$default(producer$default, "cur_ohr_last_status", (JSONObject) null, "feed_scroll_analysis", (ReturnCode) null, 10, (Object) null) : null;
                        if (!(feature$default instanceof Integer) || (num = (Integer) feature$default) == null) {
                            return 0;
                        }
                        return num.intValue();
                    }

                    @Override // X.InterfaceC21605119gv
                    public final void LIZ(JSONObject jSONObject) {
                        if (jSONObject == null) {
                            return;
                        }
                        C20684815ws.LJFF().submit(new RunnableC514901zX(jSONObject, 5));
                    }
                };
                C21600419gA.LJIILLIIL = false;
                C21600419gA.LJIJJ = C799570VYd.LIZIZ();
                C21600419gA.LJIIZILJ = C14KQ.LJII();
                C21600419gA.LJIJ = C14KQ.LJ(c19egLIZ);
            }
        }
        C1150504el.LIZ().LJI(strJ4, false);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"PerformanceActivityAssem", "onResume"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onResume();
        C0CFN.LIZ("simbaRunnable");
        C0CFN.LIZ("choreographerOptServiceRunnable");
        C0CFN.LIZ("doFrameControllerRunnable");
        if (C10TN.LIZ()) {
            ((BusinessModuleService) ServiceManager.get().getService(BusinessModuleService.class)).resetWatchState();
        }
        if (this.LLILLJJLI) {
            DoFrameController.LIZIZ = 2;
            this.LLILLJJLI = false;
        } else {
            ((BusinessModuleService) ServiceManager.get().getService(BusinessModuleService.class)).getMainLooperOptServiceAndUpdateWatchMainFrame();
        }
        if (C1486210omJ.LIZ()) {
            ((FeedCommonService) ServiceManager.get().getService(FeedCommonService.class)).LJIL();
        }
        C1150504el.LIZ().LJI(strJ4, false);
    }

    public PerformanceActivityAssem() {
        ((ILauncherService) ServiceManager.get().getService(ILauncherService.class)).LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onAssemLoaded() {
        super.onAssemLoaded();
        C2184501AeW c2184501AeW = (C2184501AeW) this.LLILLL.getValue();
        c2184501AeW.getClass();
        if (AnonymousClass0716.LJFF()) {
            C2184491AeV c2184491AeV = new C2184491AeV();
            Activity activity = c2184501AeW.LL;
            Application application = activity.getApplication();
            if (application != null && application.getBaseContext() != null) {
                try {
                    c2184491AeV.LIZ = ((Integer) C2204961BRm.a0(C1959507lx.LIZIZ(Context.class, "getThemeResId", new Class[0]), application.getBaseContext(), new Object[0], new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOinbIuA8SeL3jqxrkmsBWiDw5WEokbTXB5E", null))).intValue();
                    application.setTheme(R.style.xm);
                    Configuration configuration = application.getResources().getConfiguration();
                    c2184491AeV.LIZIZ = new Configuration(configuration);
                    configuration.setTo(activity.getResources().getConfiguration());
                    C786410Ut5.t4(activity, c2184491AeV.LIZLLL);
                    C786410Ut5.s4(activity, c2184491AeV.LIZLLL);
                    c2184491AeV.LIZJ = true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            c2184501AeW.LLILLJJLI = c2184491AeV;
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (((Boolean) C303880Bve.LIZ.getValue()).booleanValue()) {
            C2184511AeX.LJ.LIZJ();
        }
        if (((Boolean) C260340AIe.LIZ.getValue()).booleanValue()) {
            HashMap<String, C0VWH> map = C585110MxB.LIZIZ;
            if (!map.isEmpty()) {
                Iterator<Map.Entry<String, C0VWH>> it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    C0VWH value = it2.next().getValue();
                    value.getClass();
                    C0VWL c0vwl = value.LIZLLL;
                    C1957307lb c1957307lb = C798520VUc.LIZLLL;
                    if (c1957307lb == null) {
                        c1957307lb = null;
                    }
                    synchronized (c1957307lb) {
                        try {
                            ((ArrayList) c1957307lb.LLILLJJLI).remove(c0vwl);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            }
        }
        C585110MxB.LIZIZ.clear();
        C585110MxB.LIZ.clear();
        for (String str : C710360Rti.LIZLLL) {
            C20673215v0.LJIIIZ(str);
        }
        C20673215v0.LJIIIZ("profile_fragment_user_mt");
        C20673215v0.LJIIIZ("profile_fragment_aweme_list_mus");
        C20673215v0.LJIIIZ("detail_feed_activity_video_detail");
        C20673215v0.LJIIIZ("detail_feed_fragment_detail_page");
        C20673215v0.LJIIIZ("detail_feed_insights_bottom");
        C20673215v0.LJIIIZ("detail_feed_video_seek_bar");
        C20673215v0.LJIIIZ("awemenotice_fragment_inbox_layout");
        C1591880rWk.LIZIZ.LJJIII();
        C1253130iiN.LJ = true;
        C1253130iiN.LJFF = true;
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        C2184501AeW c2184501AeW = (C2184501AeW) this.LLILLL.getValue();
        C2184491AeV c2184491AeV = c2184501AeW.LLILLJJLI;
        if (c2184491AeV != null && c2184491AeV.LIZJ && AnonymousClass0716.LJFF()) {
            Application application = c2184501AeW.LL.getApplication();
            if (c2184491AeV.LIZJ) {
                application.setTheme(c2184491AeV.LIZ);
                application.getResources().getConfiguration().setTo(c2184491AeV.LIZIZ);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onWindowFocusChanged(boolean z, boolean z2) {
        if (z) {
            ((IMainService) ServiceManager.get().getService(IMainService.class)).startupTestColdBootEnd();
            C799900VZk.LIZ.getClass();
            if (C0CP9.LIZIZ()) {
                Map<String, EnumC584340Mvw> map = C584470Mw9.LIZ;
                C2407009bw.LIZ();
                C584470Mw9.LJ("system_launch");
                if (((Boolean) C1228904rP.LIZLLL.getValue()).booleanValue()) {
                    C0N5P.LIZ.LIZLLL("SystemLaunch", new C0N5R(16L, ((Number) C1228904rP.LIZJ.getValue()).longValue()));
                }
                C584470Mw9.LJ("system_launch_startup_end_to_feed");
                C584470Mw9.LJ("system_launch_isolate_startup_to_first_frame");
                C584470Mw9.LJ("system_launch_1_minute");
                C584470Mw9.LJ("system_launch_1_minute_feed");
                C584470Mw9.LJ("three_vv");
                C2214201BlK.LIZLLL().LJJLJLI(new AfS133S0000000_9(5));
                if (!C584470Mw9.LJIJI) {
                    C584470Mw9.LJIJI = true;
                    InterfaceC1006670cIr<C1602200rnO> interfaceC1006670cIr = new InterfaceC1006670cIr<C1602200rnO>() { // from class: X.0CNG
                        @Override // X.InterfaceC1006670cIr
                        public final void LJIIJ(C1602200rnO c1602200rnO, C1602200rnO c1602200rnO2) {
                            if (c1602200rnO2.LIZJ()) {
                                C1BCA.LJJIJIIJI(EnumC312610CNf.SATRTUP, this);
                                C0CMU.LIZ.LIZIZ(new C2184051Adn());
                            }
                        }
                    };
                    if ((C2517009tg.LIZ & 1) == 1) {
                        C1BCA.LJIJJ(EnumC312610CNf.SATRTUP, interfaceC1006670cIr);
                    } else {
                        C1BCA.LJIJJLI(EnumC312610CNf.SATRTUP, interfaceC1006670cIr);
                    }
                }
                if (C1DG0.LIZIZ() || C0B4B.LIZ() || C0C78.LIZ()) {
                    C0VWW.LJI("diagnosis_top_n_vv");
                }
                if (((Boolean) C303880Bve.LIZIZ.getValue()).booleanValue() || ((Boolean) C303880Bve.LIZJ.getValue()).booleanValue()) {
                    C2184511AeX.LJ.LIZJ();
                }
                C786410Ut5.LJLIIL(50000L, C799570VYd.LIZIZ(), new Runnable() { // from class: X.0814
                    public final void LIZ() {
                        Context context = this.LL.getContext();
                        if (context != null && !C2408409cA.LIZJ) {
                            C2408409cA.LIZIZ(context);
                        }
                        AnonymousClass0811 anonymousClass0811 = AnonymousClass0810.LIZ;
                        try {
                            int i = anonymousClass0811.LIZJ;
                            if (i == 0 || (anonymousClass0811.LIZLLL != 3 && i == 255)) {
                                final ArrayList arrayList = new ArrayList();
                                arrayList.add(new C20491080z());
                                arrayList.add(new C20490080y());
                                arrayList.add(new AnonymousClass0816());
                                final AnonymousClass0813 anonymousClass0813 = anonymousClass0811.LIZ;
                                new BPEAThread(arrayList, anonymousClass0813) { // from class: X.081R
                                    public final AnonymousClass0813 LL;
                                    public final ArrayList<AnonymousClass0812> LLILLJJLI;
                                    public String LLILLL;

                                    @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
                                    public final void run() {
                                        C1C7U.LIZ("DeviceChecker$CheckThread@e33b.run");
                                        boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
                                        try {
                                            LIZJ();
                                        } finally {
                                        }
                                        if (zLJ) {
                                            C0W9U.LJFF();
                                        }
                                        C1C7U.LIZIZ("DeviceChecker$CheckThread@e33b.run");
                                    }

                                    public final void LIZJ() {
                                        boolean z3;
                                        String line;
                                        super.run();
                                        for (int i2 = 0; i2 < this.LLILLJJLI.size(); i2++) {
                                            AnonymousClass0812 anonymousClass0812 = (AnonymousClass0812) ListProtector.get(this.LLILLJJLI, i2);
                                            if (anonymousClass0812.LIZLLL() && anonymousClass0812.LIZ()) {
                                                this.LLILLL = null;
                                                int i3 = 0;
                                                do {
                                                    try {
                                                        Thread.sleep(500L);
                                                    } catch (InterruptedException e) {
                                                        TryCatchGuardChecker.doCheck(e);
                                                    }
                                                    int i4 = 0;
                                                    do {
                                                        try {
                                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                            sbLIZ.append("/sys/devices/system/cpu/cpu");
                                                            sbLIZ.append(i4);
                                                            sbLIZ.append("/cpufreq/scaling_cur_freq");
                                                            RandomAccessFile randomAccessFile = new RandomAccessFile(C2188811AlT.LIZIZ(sbLIZ), "r");
                                                            line = randomAccessFile.readLine();
                                                            randomAccessFile.close();
                                                        } catch (Throwable th) {
                                                            TryCatchGuardChecker.doCheck(th);
                                                        }
                                                        if (i4 == 0 && this.LLILLL == null) {
                                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                            sbLIZ2.append("/sys/devices/system/cpu/cpu");
                                                            sbLIZ2.append(i4);
                                                            sbLIZ2.append("/cpufreq/cpuinfo_max_freq");
                                                            RandomAccessFile randomAccessFile2 = new RandomAccessFile(C2188811AlT.LIZIZ(sbLIZ2), "r");
                                                            String line2 = randomAccessFile2.readLine();
                                                            randomAccessFile2.close();
                                                            if (!line2.equals(line)) {
                                                                if (CastFloatProtector.parseFloat(line) / CastFloatProtector.parseFloat(line2) < 0.75d) {
                                                                    z3 = false;
                                                                    break;
                                                                }
                                                            }
                                                            this.LLILLL = line;
                                                            i4++;
                                                        } else {
                                                            if (!line.equals(this.LLILLL)) {
                                                                z3 = false;
                                                                break;
                                                            }
                                                            i4++;
                                                        }
                                                    } while (i4 < 3);
                                                    i3++;
                                                } while (i3 < 5);
                                                z3 = true;
                                                anonymousClass0812.LIZJ(z3);
                                                if (z3) {
                                                    int type = anonymousClass0812.getType();
                                                    AnonymousClass0810.LIZ.LIZJ = type;
                                                    C081S.LIZ(type + 768);
                                                    return;
                                                }
                                            }
                                        }
                                        AnonymousClass0810.LIZ.LIZJ = 255;
                                        C081S.LIZ(1023);
                                    }

                                    {
                                        this.LLILLJJLI = arrayList;
                                        this.LL = anonymousClass0813;
                                    }
                                }.start();
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("PerformanceActivityAssem@39b8.onWindowFocusChanged$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("PerformanceActivityAssem@39b8.onWindowFocusChanged$1");
                    }
                });
            }
            if (!this.LL) {
                this.LL = true;
                C786410Ut5.LJLIIL(10000L, C799570VYd.LIZIZ(), new Runnable() { // from class: X.0Rth
                    public static void LIZ() {
                        C20673215v0.LJIIIZ("homepage_common_activity_main");
                        C20673215v0.LJIIIZ("homepage_common_fragment_main_page");
                        C20673215v0.LJIIIZ("homepage_common_fragment_main_page_opt");
                        C20673215v0.LJIIIZ("homepage_common_fragment_main");
                        C20673215v0.LJIIIZ("homepage_common_fragment_main_opt");
                        C20673215v0.LJIIIZ("homepage_common_view_main_tab_item_follow");
                        C20673215v0.LJIIIZ("homepage_common_view_main_tab_item_follow_opt");
                        C20673215v0.LJIIIZ("common_feed_fragment_feed");
                        C20673215v0.LJIIIZ("common_feed_fragment_feed_opt");
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("PerformanceActivityAssem@39b8.onWindowFocusChanged$2");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("PerformanceActivityAssem@39b8.onWindowFocusChanged$2");
                    }
                });
            }
            ((IMainService) ServiceManager.get().getService(IMainService.class)).setOptSmartAvatarBorderView(true);
            ((IMainService) ServiceManager.get().getService(IMainService.class)).setOptSmartAvatarVideoBorderView(true);
            C786410Ut5.LJLIIL(1000L, C799570VYd.LIZIZ(), new Runnable() { // from class: X.0815
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PerformanceActivityAssem@39b8.onWindowFocusChanged$3");
                    try {
                        C2187451AjH.LJIIIIZZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PerformanceActivityAssem@39b8.onWindowFocusChanged$3");
                }
            });
            C01GW c01gw = C2184641Aek.LJII;
            if (!((Boolean) c01gw.getValue()).booleanValue()) {
                C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new Runnable() { // from class: X.1Aeb
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("PerformanceActivityAssem@39b8.onWindowFocusChanged$4");
                        try {
                            C20684815ws.LJ = C2189291AmF.LIZJ(this.LL.getContext(), null);
                            C20684815ws.LJFF = new C2184561Aec(String.valueOf(DeviceRegisterManager.getAppId()), AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId());
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("PerformanceActivityAssem@39b8.onWindowFocusChanged$4");
                    }
                });
            } else if (((Boolean) c01gw.getValue()).booleanValue() && C2184641Aek.LIZLLL.compareAndSet(false, true)) {
                C0S78.LIZJ(new AwS577S0100000_33(this, 2847), true);
            }
            if (((Boolean) C0CD2.LIZIZ.getValue()).booleanValue()) {
                SpeederService speederService = C20689088p.LIZ;
                if (speederService.LIZ) {
                    speederService.LIZ = false;
                    SpeederService.DelegateActivityThreadHandler delegateActivityThreadHandler = speederService.LIZJ;
                    if (delegateActivityThreadHandler != null) {
                        try {
                            delegateActivityThreadHandler.LLILLJJLI = false;
                            if (AnonymousClass0883.LIZJ() == delegateActivityThreadHandler) {
                                AnonymousClass0883.LIZ(delegateActivityThreadHandler.LL);
                                AnonymousClass0883.LIZIZ(delegateActivityThreadHandler, delegateActivityThreadHandler.LL);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            Log.getStackTraceString(th);
                        }
                    }
                    SpeederService.DelegateChoreographerHandler delegateChoreographerHandler = speederService.LIZLLL;
                    if (delegateChoreographerHandler != null) {
                        try {
                            Choreographer choreographer = delegateChoreographerHandler.LLILLL;
                            Class<?> cls = AnonymousClass0883.LIZ;
                            try {
                                if (((Handler) C1961107mD.LIZJ(choreographer, "mHandler")) == delegateChoreographerHandler) {
                                    Choreographer choreographer2 = delegateChoreographerHandler.LLILLL;
                                    try {
                                        C1960207m4.LIZIZ(C1960207m4.LIZ(C1961107mD.LIZ(choreographer2.getClass(), "mHandler")), choreographer2, delegateChoreographerHandler.LL);
                                    } catch (Throwable th2) {
                                        TryCatchGuardChecker.doCheck(th2);
                                        Log.getStackTraceString(th2);
                                    }
                                    AnonymousClass0883.LIZIZ(delegateChoreographerHandler, delegateChoreographerHandler.LL);
                                }
                            } catch (Throwable th3) {
                                TryCatchGuardChecker.doCheck(th3);
                                Log.getStackTraceString(th3);
                            }
                        } catch (Throwable th4) {
                            TryCatchGuardChecker.doCheck(th4);
                        }
                    }
                    SpeederService.DelegateViewRootImplHandler delegateViewRootImplHandler = speederService.LJ;
                    if (delegateViewRootImplHandler != null) {
                        delegateViewRootImplHandler.LJ();
                    }
                }
            }
            C1BD3.LIZ(false);
            final C313520CQs c313520CQs = C313530CQt.LIZ;
            c313520CQs.getClass();
            if (((Boolean) C0BL2.LIZ.getValue()).booleanValue()) {
                C1BCA.LJIJJLI(EnumC312610CNf.SATRTUP, new InterfaceC1006670cIr() { // from class: X.1AeT
                    @Override // X.InterfaceC1006670cIr
                    public final void LJIIJ(Object obj, Object obj2) {
                        C313520CQs c313520CQs2 = c313520CQs;
                        c313520CQs2.getClass();
                        if (((C1602200rnO) obj2).LIZJ() && ((Boolean) C0BL2.LIZ.getValue()).booleanValue()) {
                            c313520CQs2.LIZIZ.removeMessages(1);
                            c313520CQs2.LIZIZ.removeMessages(2);
                            BPEAHandler bPEAHandler = c313520CQs2.LIZIZ;
                            C786410Ut5.LJLJJL(bPEAHandler, Message.obtain(bPEAHandler, 2));
                        }
                    }
                });
                c313520CQs.LIZIZ.removeMessages(1);
                c313520CQs.LIZIZ.removeMessages(2);
                BPEAHandler bPEAHandler = c313520CQs.LIZIZ;
                C786410Ut5.LJLJLJ(bPEAHandler, Message.obtain(bPEAHandler, 1), 500L);
            }
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).p5().LIZLLL(C724240Sb0.LIZ(this));
            C0X35.LJIIJJI("feed_load_cache_completed_to_focus", false);
        }
    }
}
