package com.ss.android.ugc.aweme.assem;

import X.AbstractC1387200mCc;
import X.C01GW;
import X.C09R3;
import X.C0BP1;
import X.C0CCZ;
import X.C0CHQ;
import X.C0CN5;
import X.C0CPH;
import X.C0QSJ;
import X.C1035180d2q;
import X.C1150504el;
import X.C123100dR;
import X.C1388190mED;
import X.C1389890mGx;
import X.C13LE;
import X.C1443290nf5;
import X.C1444940nhk;
import X.C1445940njM;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1563720qnK;
import X.C1585030rLh;
import X.C1593730rZj;
import X.C1593820rZs;
import X.C15O7;
import X.C1604500rr6;
import X.C1620680sHC;
import X.C1906580ziK;
import X.C19EG;
import X.C1ER1;
import X.C20020913Vf;
import X.C201955140j;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2344809Gs;
import X.C262720ARi;
import X.C280080AyM;
import X.C280360Ayo;
import X.C285090BFj;
import X.C289390BVx;
import X.C297720Bli;
import X.C300010BpP;
import X.C300110BpZ;
import X.C452501pT;
import X.C486860J7k;
import X.C581760Mrm;
import X.C687700QyG;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C799890VZj;
import X.C799900VZk;
import X.C810650Vr5;
import X.CallableC1446910nkv;
import X.EnumC1589930rTb;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1603190roz;
import X.InterfaceC214902198i;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import Y.ARunnableS122S0100000_22;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.ability.ToolsMainActivityAbility;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.base.MainDialogAbility;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.Text2ImageModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.NewUserGuideAbility;
import com.ss.android.ugc.aweme.legoImp.task.CleanEffectsTask;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService;
import com.ss.android.ugc.aweme.services.IBusinessPublishService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.external.IInitTaskService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.publish.Publish;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS397S0200000_31;

/* JADX INFO: loaded from: classes25.dex */
public final class ToolsActivityAssem extends BaseMainContainerAssem implements ToolsMainActivityAbility, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public boolean LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new C1604500rr6());
    public final HashSet<String> LLILZIL = new HashSet<>();
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(53));
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(54));
    public boolean LLIZLLLIL;
    public volatile MainDialogAbility LLJ;
    public volatile MainBusinessAbility LLJI;
    public InterfaceC665370Q7z LLJIJIL;
    public C0QSJ LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ToolsActivityAssem.class, "dialogAbility", "getDialogAbility()Lcom/ss/android/ugc/aweme/base/MainDialogAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(ToolsActivityAssem.class, "mainBusinessAbility", "getMainBusinessAbility()Lcom/ss/android/ugc/aweme/base/MainBusinessAbility;", 0);
        c09r3.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
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

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        C19EG c19egLIZ;
        Intent intent;
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"ToolsActivityAssem", "onResume"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onResume();
        if (((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().isPublishing() && (c19egLIZ = C724240Sb0.LIZ(this)) != null && (intent = c19egLIZ.getIntent()) != null) {
            lo(intent, false, true);
        }
        if (C285090BFj.LJI() && !this.LLIZLLLIL) {
            this.LLIZLLLIL = true;
            MainBusinessAbility mainBusinessAbilityKo = ko();
            if (mainBusinessAbilityKo != null) {
                mainBusinessAbilityKo.yW0(new C1593820rZs(this));
            }
        }
        C1150504el.LIZ().LJI(strJ4, false);
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1353757167) {
            return null;
        }
        return this;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final C0QSJ m160do() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLJILJIL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJIJIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJIJIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{MainActivityScope.class});
        this.LLJILJIL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final MainDialogAbility ho() {
        MainDialogAbility mainDialogAbility = this.LLJ;
        if (mainDialogAbility == null) {
            synchronized (this) {
                mainDialogAbility = this.LLJ;
                if (mainDialogAbility == null) {
                    C0QSJ c0qsjM160do = m160do();
                    MainDialogAbility mainDialogAbility2 = c0qsjM160do != null ? (MainDialogAbility) c0qsjM160do.getAbility(MainDialogAbility.class) : null;
                    this.LLJ = mainDialogAbility2;
                    return mainDialogAbility2;
                }
            }
        }
        return mainDialogAbility;
    }

    public final MainBusinessAbility ko() {
        MainBusinessAbility mainBusinessAbility = this.LLJI;
        if (mainBusinessAbility == null) {
            synchronized (this) {
                mainBusinessAbility = this.LLJI;
                if (mainBusinessAbility == null) {
                    C0QSJ c0qsjM160do = m160do();
                    MainBusinessAbility mainBusinessAbility2 = c0qsjM160do != null ? (MainBusinessAbility) c0qsjM160do.getAbility(MainBusinessAbility.class) : null;
                    this.LLJI = mainBusinessAbility2;
                    return mainBusinessAbility2;
                }
            }
        }
        return mainBusinessAbility;
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        C0CCZ c0cczInitTask;
        super.onStop();
        ((IMainService) ServiceManager.get().getService(IMainService.class)).startCleanEffect(C724240Sb0.LIZ(this));
        C20020913Vf c20020913Vf = C20020913Vf.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ToolsActivityAssem:onStop isHome: ");
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        Object obj = abstractC1387200mCcLJ != null ? abstractC1387200mCcLJ.LIZ : null;
        if (!(obj instanceof InterfaceC1603190roz)) {
            obj = null;
        }
        sbLIZ.append(obj != null);
        C201955140j.LIZJ(c20020913Vf, C2188811AlT.LIZIZ(sbLIZ));
        if ((C289390BVx.LIZ() && C0CHQ.LIZ().LJJIIJZLJL().getCleanUselessDraftsProvider().LIZJ()) || ((Boolean) C280360Ayo.LIZ.getValue()).booleanValue()) {
            AbstractC1387200mCc abstractC1387200mCcLJ2 = C1906580ziK.LJ();
            Object obj2 = abstractC1387200mCcLJ2 != null ? abstractC1387200mCcLJ2.LIZ : null;
            if (!(obj2 instanceof InterfaceC1603190roz) || obj2 == null || (c0cczInitTask = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).initService().initTask(24)) == null) {
                return;
            }
            C799900VZk.LIZ.getClass();
            C799890VZj c799890VZj = new C799890VZj();
            c799890VZj.LIZ(c0cczInitTask);
            c799890VZj.LIZIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0104 A[ADDED_TO_REGION] */
    @Override // com.ss.android.ugc.aweme.ability.ToolsMainActivityAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Mv2(com.ss.android.ugc.aweme.shortvideo.publish.PublishModel r7) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.assem.ToolsActivityAssem.Mv2(com.ss.android.ugc.aweme.shortvideo.publish.PublishModel):boolean");
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onCreate(Bundle bundle) {
        IInitTaskService iInitTaskServiceInitService;
        C0CCZ c0cczInitTask;
        IInitTaskService iInitTaskServiceInitService2;
        C0CCZ c0cczInitTask2;
        IExternalService iExternalService;
        IInitTaskService iInitTaskServiceInitService3;
        C0CCZ c0cczInitTask3;
        IExternalService iExternalService2;
        IInitTaskService iInitTaskServiceInitService4;
        C0CCZ c0cczInitTask4;
        IExternalService iExternalService3;
        IInitTaskService iInitTaskServiceInitService5;
        C0CCZ c0cczInitTask5;
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"ToolsActivityAssem", "onCreate_with_bundle"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate(bundle);
        super.onCreate();
        C1150504el.LIZ().LIZLLL("main_act_tools_activity_observer_duration", false);
        CleanEffectsTask cleanEffectsTask = new CleanEffectsTask();
        C799900VZk.LIZ.getClass();
        C0CPH c0cph = new C0CPH();
        c0cph.LIZ(cleanEffectsTask);
        c0cph.LIZIZ();
        if (!C285090BFj.LJI()) {
            C1563720qnK.LIZ();
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C0CHQ.LIZ().getPublishService().LJJLI(c19egLIZ);
            Intent intent = c19egLIZ.getIntent();
            boolean zHasExtra = intent.hasExtra("enable_optimize_main_not_in_stack");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ProcessPublish MainActivityCreate isMainNotInStackPublish:");
            sbLIZ.append(zHasExtra);
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ToosActivityAssem: activity ");
            sbLIZ2.append(c19egLIZ);
            sbLIZ2.append(", activity scope: ");
            sbLIZ2.append(C1558360qeg.LJI(c19egLIZ, null));
            sbLIZ2.append(", parentScope: ");
            sbLIZ2.append(interfaceC665370Q7zLJIIL.getTree().LJIIIIZZ());
            sbLIZ2.append(", parentparentScope: ");
            sbLIZ2.append(interfaceC665370Q7zLJIIL.getTree().LJIIIIZZ().getTree().LJIIIIZZ());
            System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ2));
            NewUserGuideAbility newUserGuideAbility = (NewUserGuideAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, NewUserGuideAbility.class, null);
            if (newUserGuideAbility != null && !newUserGuideAbility.isNewUser() && ((bundle == null && zHasExtra) || Publish.isNeedProcessPublish || Publish.isInPublish)) {
                this.LLILLL = true;
                Publish.isNeedProcessPublish = false;
                lo(intent, true, false);
            }
            C0CPH c0cph2 = new C0CPH();
            C0CCZ c0cczInitTask6 = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).initService().initTask(5);
            if (c0cczInitTask6 != null) {
                c0cph2.LIZ(c0cczInitTask6);
                C0CCZ c0cczInitTask7 = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).initService().initTask(6);
                if (c0cczInitTask7 != null) {
                    c0cph2.LIZ(c0cczInitTask7);
                    C0CCZ c0cczInitTask8 = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).initService().initTask(7);
                    if (c0cczInitTask8 != null) {
                        c0cph2.LIZ(c0cczInitTask8);
                        C0CCZ c0cczInitTask9 = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).initService().initTask(10);
                        if (c0cczInitTask9 != null) {
                            c0cph2.LIZ(c0cczInitTask9);
                            C0CCZ c0cczInitTask10 = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).initService().initTask(11);
                            if (c0cczInitTask10 != null) {
                                c0cph2.LIZ(c0cczInitTask10);
                                C0CCZ c0cczInitTask11 = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).initService().initTask(22);
                                if (c0cczInitTask11 != null) {
                                    c0cph2.LIZ(c0cczInitTask11);
                                    C0CCZ c0cczInitTask12 = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).initService().initTask(23);
                                    if (c0cczInitTask12 != null) {
                                        c0cph2.LIZ(c0cczInitTask12);
                                        if (C280080AyM.LIZ() && (iExternalService3 = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null)) != null && (iInitTaskServiceInitService5 = iExternalService3.initService()) != null && (c0cczInitTask5 = iInitTaskServiceInitService5.initTask(25)) != null) {
                                            c0cph2.LIZ(c0cczInitTask5);
                                        }
                                        if (C300010BpP.LIZ() && C300110BpZ.LIZ() && (iExternalService2 = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null)) != null && (iInitTaskServiceInitService4 = iExternalService2.initService()) != null && (c0cczInitTask4 = iInitTaskServiceInitService4.initTask(28)) != null) {
                                            c0cph2.LIZ(c0cczInitTask4);
                                        }
                                        if (C0BP1.LIZ() && (iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null)) != null && (iInitTaskServiceInitService3 = iExternalService.initService()) != null && (c0cczInitTask3 = iInitTaskServiceInitService3.initTask(26)) != null) {
                                            c0cph2.LIZ(c0cczInitTask3);
                                        }
                                        C0CCZ c0cczInitTask13 = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).initService().initTask(18);
                                        if (c0cczInitTask13 != null) {
                                            c0cph2.LIZ(c0cczInitTask13);
                                            C0CCZ c0cczInitTask14 = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).initService().initTask(17);
                                            if (c0cczInitTask14 != null) {
                                                c0cph2.LIZ(c0cczInitTask14);
                                                C0CCZ c0cczInitTask15 = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).initService().initTask(20);
                                                if (c0cczInitTask15 != null) {
                                                    c0cph2.LIZ(c0cczInitTask15);
                                                    if (!C285090BFj.LJI()) {
                                                        C0CCZ c0cczInitTask16 = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).initService().initTask(13);
                                                        if (c0cczInitTask16 != null) {
                                                            c0cph2.LIZ(c0cczInitTask16);
                                                        } else {
                                                            "Required value was null.".toString();
                                                            throw new IllegalArgumentException("Required value was null.");
                                                        }
                                                    }
                                                    C0CCZ c0cczInitTask17 = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).initService().initTask(9);
                                                    if (c0cczInitTask17 != null) {
                                                        c0cph2.LIZ(c0cczInitTask17);
                                                    }
                                                    IExternalService iExternalService4 = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
                                                    if (iExternalService4 != null && (iInitTaskServiceInitService2 = iExternalService4.initService()) != null && (c0cczInitTask2 = iInitTaskServiceInitService2.initTask(27)) != null) {
                                                        c0cph2.LIZ(c0cczInitTask2);
                                                    }
                                                    IExternalService iExternalService5 = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
                                                    if (iExternalService5 != null && (iInitTaskServiceInitService = iExternalService5.initService()) != null && (c0cczInitTask = iInitTaskServiceInitService.initTask(29)) != null) {
                                                        c0cph2.LIZ(c0cczInitTask);
                                                    }
                                                    c0cph2.LIZIZ();
                                                    C1150504el.LIZ().LJI("main_act_tools_activity_observer_duration", false);
                                                } else {
                                                    "Required value was null.".toString();
                                                    throw new IllegalArgumentException("Required value was null.");
                                                }
                                            } else {
                                                "Required value was null.".toString();
                                                throw new IllegalArgumentException("Required value was null.");
                                            }
                                        } else {
                                            "Required value was null.".toString();
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                    } else {
                                        "Required value was null.".toString();
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                } else {
                                    "Required value was null.".toString();
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                            } else {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        if (((Boolean) C285090BFj.LJJLIL.getValue()).booleanValue()) {
            C0CN5.LIZIZ(Long.valueOf(((Number) C285090BFj.LJJLIIJ.getValue()).longValue()), new ARunnableS122S0100000_22(this, 11));
        } else {
            C15O7.LIZJ(new CallableC1446910nkv(this));
        }
        C1150504el.LIZ().LJI(strJ4, false);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onNewIntent(Intent intent) {
        MainBusinessAbility mainBusinessAbilityKo;
        boolean z;
        this.LLILLJJLI = true;
        try {
            String stringExtra = intent.getStringExtra("extra_back_url");
            if (stringExtra != null) {
                Bundle bundleG3 = C786410Ut5.g3(intent, "extra_back_bundle");
                if (bundleG3 == null) {
                    bundleG3 = new Bundle();
                }
                if (C123100dR.LIZ(stringExtra)) {
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C724240Sb0.LIZ(this), stringExtra);
                    smartRouteBuildRoute.withParam(bundleG3);
                    smartRouteBuildRoute.open();
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (lo(intent, false, false)) {
            return;
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            if (C297720Bli.LIZ()) {
                mainBusinessAbilityKo = ko();
            } else {
                mainBusinessAbilityKo = (MainBusinessAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), MainBusinessAbility.class, null);
            }
            if (mainBusinessAbilityKo != null) {
                mainBusinessAbilityKo.k62(c19egLIZ, "onNewIntent", intent);
            }
            if (!C1585030rLh.LJIJI("NOTIFICATION") && !C1585030rLh.LJIJI("USER")) {
                z = false;
            } else {
                z = true;
            }
            if ((!TextUtils.equals(intent.getAction(), "android.intent.action.MAIN") || !intent.hasCategory("android.intent.category.LAUNCHER")) && !z) {
                C486860J7k.LIZIZ(c19egLIZ).kE0("page_feed", false);
            }
        }
        fo(intent, intent.getBooleanExtra("enter_record_from_other_platform", false));
    }

    public final void bo(PublishModel publishModel, boolean z) {
        BaseShortVideoContext baseShortVideoContext;
        VideoPublishEditModelKt videoPublishEditModelKt;
        BaseShortVideoContext baseShortVideoContext2;
        InterfaceC214902198i interfaceC214902198iLJIIIIZZ;
        C19EG c19egLIZIZ;
        MainBusinessAbility mainBusinessAbilityKo;
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel;
        Text2ImageModel text2ImageModel;
        if (publishModel != null) {
            baseShortVideoContext = publishModel.editModel;
        } else {
            baseShortVideoContext = null;
        }
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            videoPublishEditModelKt = (VideoPublishEditModelKt) baseShortVideoContext;
        } else {
            videoPublishEditModelKt = null;
        }
        if (videoPublishEditModelKt != null && C1444940nhk.LIZLLL(videoPublishEditModelKt.getCanvasVideoData())) {
            return;
        }
        if (publishModel != null) {
            baseShortVideoContext2 = publishModel.editModel;
        } else {
            baseShortVideoContext2 = null;
        }
        if ((baseShortVideoContext2 instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext2) != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (text2ImageModel = creativeModel.text2ImageModel) != null && text2ImageModel.fromPopup) {
            return;
        }
        C1ER1 c1er1 = C1ER1.LIZIZ;
        Context context = getContext();
        if (context != null) {
            interfaceC214902198iLJIIIIZZ = SAFExtensionKt.LJIIIIZZ(context);
        } else {
            interfaceC214902198iLJIIIIZZ = null;
        }
        Context context2 = getContext();
        if (context2 != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(context2);
        } else {
            c19egLIZIZ = null;
        }
        if (c1er1.s(publishModel, interfaceC214902198iLJIIIIZZ, c19egLIZIZ) || !C1593730rZj.LIZIZ.LJJI(getContext())) {
            return;
        }
        boolean zIsAutoRetry = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().isAutoRetry();
        if (((Boolean) C262720ARi.LIZ.getValue()).booleanValue() && zIsAutoRetry && !z) {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
                c1389890mGx.LJIIIZ(2131845907);
                c1389890mGx.LJIIJJI();
                return;
            }
            return;
        }
        if (C297720Bli.LIZ()) {
            mainBusinessAbilityKo = ko();
        } else {
            mainBusinessAbilityKo = (MainBusinessAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), MainBusinessAbility.class, null);
        }
        if (mainBusinessAbilityKo != null) {
            mainBusinessAbilityKo.k62(C724240Sb0.LIZ(this), "changeTabAfterPublish", new Pair(Boolean.valueOf(z), publishModel));
        }
    }

    public final void fo(Intent intent, boolean z) {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && z) {
            this.LL = true;
            C810650Vr5.LIZ(C786410Ut5.P3(c19egLIZ), "protect", "record_on");
            boolean booleanExtra = intent.getBooleanExtra("show_no_splash_ad", false);
            RecordConfig recordConfig = (RecordConfig) intent.getSerializableExtra("EXTRA_AV_RECORD_CONFIG");
            if (booleanExtra) {
                C1035180d2q.LIZIZ = true;
            }
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService(c19egLIZ, "from_3rd_platform", new C1620680sHC(recordConfig, c19egLIZ, intent, 0));
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onWindowFocusChanged(boolean z, boolean z2) {
        C19EG c19egLIZ;
        if (z2 && (c19egLIZ = C724240Sb0.LIZ(this)) != null && c19egLIZ.getIntent().getBooleanExtra("enter_record_from_other_platform", false) && !this.LL) {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().tryRestorePublish(c19egLIZ, false, new AwS397S0200000_31(c19egLIZ, this, 38));
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.ToolsMainActivityAbility
    public final void OS1(C1445940njM c1445940njM, PublishModel publishModel, boolean z) {
        IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService;
        IMainService iMainService = (IMainService) this.LLILZ.getValue();
        if (!z) {
            bo(publishModel, publishModel.isStoryPublish);
        }
        C1150504el.LIZ().LJIILJJIL(EnumC1589930rTb.PUBLISH);
        C581760Mrm.LIZIZ = false;
        IEvent publishConcatMessage = iMainService.getPublishConcatMessage();
        if (publishConcatMessage != null) {
            publishConcatMessage.postSticky();
        }
        int iLIZIZ = c1445940njM.LIZIZ();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService2 = (IUnKnownOwnershipBusinessOuterService) this.LLIZ.getValue();
        if (iUnKnownOwnershipBusinessOuterService2 != null) {
            iUnKnownOwnershipBusinessOuterService2.LJJIFFI(iLIZIZ, c19egLIZ);
        }
        ((IMainService) this.LLILZ.getValue()).checkAmplify(c19egLIZ, iLIZIZ);
        IBusinessPublishService iBusinessPublishService = (IBusinessPublishService) this.LLILZLL.getValue();
        if ((iBusinessPublishService == null || !iBusinessPublishService.isInActivity()) && (iUnKnownOwnershipBusinessOuterService = (IUnKnownOwnershipBusinessOuterService) this.LLIZ.getValue()) != null) {
            iUnKnownOwnershipBusinessOuterService.LJJ(c19egLIZ);
        }
        iMainService.hideUploadRecover();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean lo(final android.content.Intent r23, final boolean r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.assem.ToolsActivityAssem.lo(android.content.Intent, boolean, boolean):boolean");
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        if (i == 1996 && i2 == -1 && intent != null) {
            C1443290nf5.LIZIZ(C724240Sb0.LIZ(this), intent);
            return true;
        }
        return false;
    }
}
