package com.ss.android.ugc.aweme.ug.appstart;

import X.AnonymousClass0829;
import X.C01GW;
import X.C070L;
import X.C070N;
import X.C082B;
import X.C09R3;
import X.C0B2C;
import X.C0CN5;
import X.C0QSJ;
import X.C0WZX;
import X.C0X35;
import X.C10XV;
import X.C1150504el;
import X.C1389890mGx;
import X.C13LE;
import X.C1446010njT;
import X.C1492110ovp;
import X.C14EU;
import X.C1558520qew;
import X.C1565530qqF;
import X.C1701330uNH;
import X.C1785006yu;
import X.C1827607Du;
import X.C19261310Xb;
import X.C19261910Xh;
import X.C19EG;
import X.C20144713rx;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C2241008qG;
import X.C282860B6u;
import X.C296200BjG;
import X.C297720Bli;
import X.C452501pT;
import X.C687700QyG;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C810560Vqw;
import X.C820380WGe;
import X.C836440Wra;
import X.C844470XAv;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.ARunnableS93S0200000_24;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.main.IPerformanceAbility;
import com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public final class MainActivityHelperAssem extends BaseMainContainerAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C01GW LL = C452501pT.LIZIZ(new C1565530qqF(this));
    public volatile MainBusinessAbility LLILLJJLI;
    public volatile IPerformanceAbility LLILLL;
    public InterfaceC665370Q7z LLILZ;
    public C0QSJ LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MainActivityHelperAssem.class, "mainBusinessAbility", "getMainBusinessAbility()Lcom/ss/android/ugc/aweme/base/MainBusinessAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MainActivityHelperAssem.class, "performanceAbility", "getPerformanceAbility()Lcom/ss/android/ugc/aweme/main/IPerformanceAbility;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC738140SxQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            r6 = this;
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r5 = 0
            java.lang.String r0 = "MainActivityHelperAssem"
            r2[r5] = r0
            r1 = 1
            java.lang.String r0 = "onResume"
            r2[r1] = r0
            java.lang.String r0 = "main_act_assem_lifecycle_%s_%s"
            java.lang.String r4 = X.C786410Ut5.j4(r0, r2)
            X.145x r0 = X.C1150504el.LIZ()
            r0.LIZLLL(r4, r5)
            super.onResume()
            android.app.Activity r3 = r6.m331do()
            boolean r0 = r3 instanceof com.bytedance.ies.foundation.activity.BaseActivity
            if (r0 == 0) goto L5d
            com.bytedance.ies.foundation.activity.BaseActivity r3 = (com.bytedance.ies.foundation.activity.BaseActivity) r3
            if (r3 == 0) goto L5d
            X.10Xb r2 = X.C19261310Xb.LIZ
            boolean r0 = r3 instanceof X.C199Y
            if (r0 == 0) goto L65
            boolean r0 = r3 instanceof X.InterfaceC1711206n0
            if (r0 == 0) goto L65
            r0 = r3
            X.15ms r0 = (X.InterfaceC20622815ms) r0
            X.198i r1 = X.C20629915o1.LIZ(r0)
            if (r1 == 0) goto L44
            boolean r0 = r1 instanceof X.C0J5E
            if (r0 == 0) goto L44
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 != 0) goto L45
        L44:
            r1 = r3
        L45:
            r2.getClass()
            androidx.lifecycle.Lifecycle r0 = r1.getLifecycle()
            androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r0 = r1.isAtLeast(r0)
            if (r0 == 0) goto L5d
            com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService r0 = X.C19261310Xb.LJ
            r0.LJIIIZ(r3)
        L5d:
            X.145x r0 = X.C1150504el.LIZ()
            r0.LJI(r4, r5)
            return
        L65:
            r1 = r3
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ug.appstart.MainActivityHelperAssem.onResume():void");
    }

    public final C0QSJ bo() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLILZIL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLILZ;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLILZ = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{MainActivityScope.class});
        this.LLILZIL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final Activity m331do() {
        return (Activity) this.LL.getValue();
    }

    public final IPerformanceAbility fo() {
        IPerformanceAbility iPerformanceAbility = this.LLILLL;
        if (iPerformanceAbility == null) {
            synchronized (this) {
                iPerformanceAbility = this.LLILLL;
                if (iPerformanceAbility == null) {
                    C0QSJ c0qsjBo = bo();
                    IPerformanceAbility iPerformanceAbility2 = c0qsjBo != null ? (IPerformanceAbility) c0qsjBo.getAbility(IPerformanceAbility.class) : null;
                    this.LLILLL = iPerformanceAbility2;
                    return iPerformanceAbility2;
                }
            }
        }
        return iPerformanceAbility;
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onConfigurationChanged(Configuration configuration) {
        BaseActivity baseActivity;
        super.onConfigurationChanged(configuration);
        Activity activityM331do = m331do();
        if ((activityM331do instanceof BaseActivity) && (baseActivity = (BaseActivity) activityM331do) != null) {
            C19261310Xb.LIZ.getClass();
            if (C19261310Xb.LJFF) {
                long jCurrentTimeMillis = (System.currentTimeMillis() - C19261310Xb.LIZJ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                if (jCurrentTimeMillis < 10 && configuration.orientation == 2) {
                    C2241008qG c2241008qG = new C2241008qG();
                    c2241008qG.LIZ.put("duration", Long.valueOf(jCurrentTimeMillis));
                    C20684815ws.LJIJ("main_launch_from_landscape", c2241008qG.LJ());
                }
                C19261310Xb.LJFF = false;
            }
            C19261310Xb.LJ.LJ(baseActivity);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onCreate(Bundle bundle) {
        BaseActivity baseActivity;
        IPerformanceAbility iPerformanceAbilityFo;
        boolean zLJI = MethodIDManager.LJI(196730);
        boolean z = true;
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"MainActivityHelperAssem", "onCreate_with_bundle"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        C0X35.LIZ("main_helper_assem_oncreate", false);
        C0X35.LIZ("main_helper_assem_oncreate_part_1", false);
        super.onCreate(bundle);
        C0X35.LJIIJJI("main_helper_assem_oncreate_part_1", false);
        Activity activityM331do = m331do();
        if ((activityM331do instanceof BaseActivity) && (baseActivity = (BaseActivity) activityM331do) != null) {
            C0X35.LIZ("main_helper_assem_oncreate_part_2", false);
            if (C0B2C.LIZ) {
                C0CN5.LIZJ(Long.valueOf(Mp4ScreenVideoLoadTimeout.CONTROL), new ARunnableS93S0200000_24(baseActivity, bundle, 32), false);
            } else {
                C19261310Xb.LIZ.getClass();
                C19261310Xb.LIZ(baseActivity, bundle);
            }
            C0X35.LJIIJJI("main_helper_assem_oncreate_part_2", false);
            EventBus.LIZLLL().LJIJJ(this);
            INewUserDebugService iNewUserDebugService = (INewUserDebugService) PluggableExtentionKt.pluggableSpi$default(INewUserDebugService.class, false, false, false, 14, null);
            if (iNewUserDebugService != null) {
                iNewUserDebugService.LIZ();
            }
            if (C296200BjG.LIZ()) {
                if (((Boolean) C282860B6u.LIZ.getValue()).booleanValue()) {
                    if (fo() == null) {
                        System.out.println((Object) "MainHelperAssem performanceAbility is null");
                    }
                    iPerformanceAbilityFo = fo();
                    if (iPerformanceAbilityFo == null) {
                        iPerformanceAbilityFo = IPerformanceAbility.AsyncDefault.LL;
                    }
                } else {
                    iPerformanceAbilityFo = fo();
                    if (iPerformanceAbilityFo == null) {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            } else {
                iPerformanceAbilityFo = (IPerformanceAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), IPerformanceAbility.class);
            }
            iPerformanceAbilityFo.dt2(new C10XV(this));
            C0X35.LIZ("main_helper_assem_oncreate_part_3", false);
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null) {
                C082B c082b = new C082B(c19egLIZ);
                AnonymousClass0829 anonymousClass0829 = new AnonymousClass0829(c19egLIZ);
                if (!((Boolean) C070L.LIZ.getValue()).booleanValue() || C1827607Du.LJI(new C070N(), C1785006yu.LIZIZ()) || !((Boolean) C070L.LIZIZ.getValue()).booleanValue()) {
                    z = false;
                }
                C1492110ovp.LIZJ("AppWidgetOpt_onCreate", c082b, anonymousClass0829, z);
            }
            C0X35.LJIIJJI("main_helper_assem_oncreate_part_3", false);
            C0X35.LJIIJJI("main_helper_assem_oncreate", false);
        }
        C1150504el.LIZ().LJI(strJ4, false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onNewIntent(Intent intent) {
        Uri data;
        super.onNewIntent(intent);
        C19261310Xb.LIZ.getClass();
        if (intent != null && (data = intent.getData()) != null) {
            String host = data.getHost();
            String path = data.getPath();
            if (!Intrinsics.LJFF("mine", host)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(host);
                sbLIZ.append(path);
                if (!Intrinsics.LJFF("user/homepage", C2188811AlT.LIZIZ(sbLIZ))) {
                    return;
                }
            }
            if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin()) {
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "USER");
            }
        }
    }

    @C14EU(priority = -1, sticky = true, threadMode = ThreadMode.MAIN)
    public final void onPublishMessage(C1446010njT c1446010njT) {
        MainBusinessAbility mainBusinessAbility;
        int i = c1446010njT.LIZ;
        if (i != -1) {
            if (i != 1 && i == 2) {
                String aid = c1446010njT.LIZIZ.getAid();
                C844470XAv.LIZ.getClass();
                C820380WGe.LIZ(C844470XAv.LIZ(), new C20144713rx(939524097), "mus_af_post_video", null);
                C836440Wra.LIZ("fb_mobile_purchase", "product", aid);
            }
        } else {
            if (C297720Bli.LIZ()) {
                mainBusinessAbility = this.LLILLJJLI;
                if (mainBusinessAbility == null) {
                    synchronized (this) {
                        mainBusinessAbility = this.LLILLJJLI;
                        if (mainBusinessAbility == null) {
                            C0QSJ c0qsjBo = bo();
                            if (c0qsjBo != null) {
                                mainBusinessAbility = (MainBusinessAbility) c0qsjBo.getAbility(MainBusinessAbility.class);
                            } else {
                                mainBusinessAbility = null;
                            }
                            this.LLILLJJLI = mainBusinessAbility;
                            if (mainBusinessAbility == null) {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        }
                    }
                }
            } else {
                mainBusinessAbility = (MainBusinessAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), MainBusinessAbility.class);
            }
            mainBusinessAbility.kE0("page_feed", false);
            C836440Wra.LIZJ("start_upload", null);
        }
        EventBus.LIZLLL().LJIL(c1446010njT);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onWindowFocusChanged(boolean z, boolean z2) {
        BaseActivity baseActivity;
        super.onWindowFocusChanged(z, z2);
        Activity activityM331do = m331do();
        if ((activityM331do instanceof BaseActivity) && (baseActivity = (BaseActivity) activityM331do) != null) {
            C19261310Xb.LIZ.getClass();
            if (z) {
                if (!C19261310Xb.LIZIZ) {
                    C810560Vqw.LIZLLL(new Runnable() { // from class: X.0Wre
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("MainActivityHelper@38f1.onWindowFocusChanged$1");
                            try {
                                C19261310Xb.LIZ.getClass();
                                if (!C19261310Xb.LIZIZ) {
                                    try {
                                        C19261310Xb.LIZIZ = true;
                                        C15O7.LIZJ(new Callable() { // from class: X.0Wrb
                                            @Override // java.util.concurrent.Callable
                                            public final Object call() {
                                                C1C7U.LIZ("AppsFlyerUtils@bb70.trackColdStart$1");
                                                if (!(C836460Wrc.LIZ().getLong("active_time", 0L) > 0)) {
                                                    C836460Wrc.LIZ().edit().putLong("active_time", System.currentTimeMillis()).apply();
                                                    C836440Wra.LIZ("fb_mobile_achievement_unlocked", null, null);
                                                } else if (!C836460Wrc.LIZ().getBoolean("has_2d_rr_use", false)) {
                                                    long j = C836460Wrc.LIZ().getLong("active_time", 0L);
                                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                                    if (timeUnit.toDays(j) + 1 == timeUnit.toDays(jCurrentTimeMillis)) {
                                                        C836440Wra.LIZ("2d_rr_user", null, null);
                                                        C836440Wra.LIZIZ("d2_rr_user", null, null, new C20144713rx(939524358));
                                                        C836460Wrc.LIZ().edit().putBoolean("has_2d_rr_use", true).apply();
                                                    }
                                                }
                                                C1C7U.LIZIZ("AppsFlyerUtils@bb70.trackColdStart$1");
                                                return null;
                                            }
                                        });
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        C2344809Gs.LJI(e);
                                    }
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("MainActivityHelper@38f1.onWindowFocusChanged$1");
                        }
                    }, 200);
                }
                if (baseActivity.getIntent().getBooleanExtra("unlogin_deeplink_third_part", false)) {
                    C1389890mGx c1389890mGx = new C1389890mGx(baseActivity);
                    c1389890mGx.LJIIIZ(2131830510);
                    c1389890mGx.LJIIJJI();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Activity activityM331do = m331do();
        if (!(activityM331do instanceof BaseActivity)) {
            activityM331do = null;
        }
        if (activityM331do == null) {
            return false;
        }
        C19261310Xb.LIZ.getClass();
        if (i == 18 && i2 == -1 && intent != null) {
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activityM331do, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, activityM331do);
            C2204961BRm.LJJJJJL(activityM331do, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+vLZ7ezCGI/gJWlGppde+VYBUvhV+aw1E90jyaUg==", null));
        }
        C19261910Xh.LIZ.getClass();
        if (i == 19 && i2 == -1) {
            C19261910Xh.LIZJ("app_update_click");
        }
        return false;
    }
}
