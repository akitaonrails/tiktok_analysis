package com.ss.android.ugc.aweme.account.main;

import X.AbstractC848400XPy;
import X.C09R3;
import X.C0WZX;
import X.C0XJC;
import X.C0XKF;
import X.C0XQ5;
import X.C0XQ7;
import X.C10EU;
import X.C1150504el;
import X.C123100dR;
import X.C1351860lHc;
import X.C1389890mGx;
import X.C13LE;
import X.C1436005ji;
import X.C1440005kM;
import X.C14EU;
import X.C1558520qew;
import X.C1610310s0T;
import X.C1701330uNH;
import X.C1878330yyl;
import X.C1913290zt9;
import X.C1913340ztE;
import X.C19276710bF;
import X.C19EG;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C297720Bli;
import X.C438710HIf;
import X.C484220Iyq;
import X.C687700QyG;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C794420VEi;
import X.C823050WQl;
import X.C848760XRi;
import X.InterfaceC1055110dYz;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hox.Hox;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountSwitcherLogger;
import com.ss.android.ugc.aweme.ICredentialManagerService;
import com.ss.android.ugc.aweme.IPINSetupService;
import com.ss.android.ugc.aweme.account.experiment.ProfileTabDoubleTapSwitchConfig;
import com.ss.android.ugc.aweme.account.security.SecurityCheckUpActivity;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.base.MainDialogAbility;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BASwitchToPAorBAServiceImpl;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.hybridkit.IHybridKitService;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.services.AccountHelperService;
import com.ss.android.ugc.aweme.services.IAccountHelperService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.MainActivityLifecycle;
import com.ss.android.ugc.aweme.setting.ISettingManagerService;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class AccountMainActivityAssem extends BaseMainContainerAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final AtomicBoolean LL = new AtomicBoolean(false);
    public boolean LLILLJJLI = true;
    public final C1351860lHc LLILLL = C1351860lHc.LL;
    public Function0<Unit> LLILZ;
    public volatile C1878330yyl LLILZIL;
    public volatile C1878330yyl LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AccountMainActivityAssem.class, "dialogAbility", "getDialogAbility()Lknit/Option;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AccountMainActivityAssem.class, "mainBusinessAbility", "getMainBusinessAbility()Lknit/Option;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
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

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final void onCreate() throws Throwable {
        Intent intent;
        Intent intent2;
        C19EG c19egLIZ;
        Intent intent3;
        boolean z = false;
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"AccountMainActivityAssem", "onCreate"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate();
        C1913340ztE.LIZ.getClass();
        C1913340ztE.LIZ();
        Bundle extras = null;
        IAccountSwitcherLogger iAccountSwitcherLogger = (IAccountSwitcherLogger) PluggableExtentionKt.pluggableSpi$default(IAccountSwitcherLogger.class, false, false, false, 14, null);
        if (iAccountSwitcherLogger != null) {
            iAccountSwitcherLogger.LIZ();
        }
        EventBus.LIZLLL().LJIJJ(this);
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIILL(this.LLILLL);
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        String stringExtra = null;
        if (c19egLIZ2 != null && (intent3 = c19egLIZ2.getIntent()) != null) {
            try {
                extras = intent3.getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        bo(extras);
        C19EG c19egLIZ3 = C724240Sb0.LIZ(this);
        if (c19egLIZ3 != null && (intent2 = c19egLIZ3.getIntent()) != null && intent2.getBooleanExtra("should_setup_pin", false) && (c19egLIZ = C724240Sb0.LIZ(this)) != null) {
            z = false;
            IPINSetupService iPINSetupService = (IPINSetupService) PluggableExtentionKt.pluggableSpi$default(IPINSetupService.class, false, false, false, 14, null);
            if (iPINSetupService != null) {
                iPINSetupService.LIZ(c19egLIZ);
            }
        }
        C19EG c19egLIZ4 = C724240Sb0.LIZ(this);
        if (c19egLIZ4 != null) {
            Intent intent4 = c19egLIZ4.getIntent();
            if (intent4 != null) {
                try {
                    stringExtra = intent4.getStringExtra("after_login_schema");
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
            Intent intent5 = c19egLIZ4.getIntent();
            if (intent5 != null) {
                intent5.removeExtra("after_login_schema");
            }
            if (C123100dR.LIZ(stringExtra)) {
                Intent intent6 = c19egLIZ4.getIntent();
                boolean booleanExtra = intent6 != null ? intent6.getBooleanExtra("should_launch_web_url", z) : false;
                Intent intent7 = c19egLIZ4.getIntent();
                if (intent7 != null) {
                    intent7.removeExtra("should_launch_web_url");
                }
                if (booleanExtra) {
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), "//webview");
                    smartRouteBuildRoute.withParam("url", stringExtra);
                    smartRouteBuildRoute.open();
                } else {
                    SmartRouter.buildRoute(getContext(), stringExtra).open();
                }
            }
        }
        C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.0XS2
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AccountMainActivityAssem@7d4.onCreate$3");
                try {
                    C19EG c19egLIZ5 = C724240Sb0.LIZ(this.LL);
                    if (c19egLIZ5 != null && ServiceManager.get() != null && AccountHelperService.createIAccountHelperServicebyMonsterPlugin(false) != null) {
                        AccountHelperService.createIAccountHelperServicebyMonsterPlugin(false).getHpasDialog().onCreate(c19egLIZ5);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AccountMainActivityAssem@7d4.onCreate$3");
            }
        });
        C19EG c19egLIZ5 = C724240Sb0.LIZ(this);
        if (c19egLIZ5 != null) {
            if (((ICredentialManagerService) ServiceManager.get().getService(ICredentialManagerService.class)).LJIJJ()) {
                ((ICredentialManagerService) ServiceManager.get().getService(ICredentialManagerService.class)).LIZ(c19egLIZ5);
            }
            final Hox hoxLIZ = Hox.LLJILJIL.LIZ(c19egLIZ5);
            hoxLIZ.wQ2("HOME", new C0XJC(new WeakReference(hoxLIZ)));
            if (C848760XRi.LIZ().showSecurityCheckupTool && (intent = c19egLIZ5.getIntent()) != null) {
                try {
                    Bundle extras2 = intent.getExtras();
                    if (extras2 != null && extras2.getBoolean("is_login_from_client_side_recovery", z)) {
                        hoxLIZ.wQ2("HOME", new InterfaceC1055110dYz() { // from class: X.0r7x
                            @Override // X.InterfaceC1583780rJg
                            public final String getHoxNodeTag() {
                                return "";
                            }

                            @Override // X.InterfaceC1055110dYz
                            public final void onNodeHide(Bundle bundle) {
                            }

                            @Override // X.InterfaceC1055110dYz
                            public final void onNodeShow(Bundle bundle) {
                                String str = SecurityCheckUpActivity._pnsPageId;
                                Context context = this.LL.getContext();
                                Bundle bundle2 = new Bundle();
                                C786410Ut5.LJJJI("enter_from", "find_account", bundle2);
                                SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(context, "//account/security/security_check_up");
                                smartRouteBuildRoute2.withParam(bundle2);
                                smartRouteBuildRoute2.open();
                                hoxLIZ.PQ2("HOME", this);
                            }
                        });
                    }
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
            }
        }
        C1150504el.LIZ().LJI(strJ4, z);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        MainActivityLifecycle hpasDialog;
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"AccountMainActivityAssem", "onResume"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onResume();
        IAccountHelperService iAccountHelperServiceCreateIAccountHelperServicebyMonsterPlugin = AccountHelperService.createIAccountHelperServicebyMonsterPlugin(false);
        if (iAccountHelperServiceCreateIAccountHelperServicebyMonsterPlugin != null && (hpasDialog = iAccountHelperServiceCreateIAccountHelperServicebyMonsterPlugin.getHpasDialog()) != null) {
            hpasDialog.onResume();
        }
        C1150504el.LIZ().LJI(strJ4, false);
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1913340ztE.LIZ.getClass();
        C1913340ztE.LIZ();
        this.LLILZ = null;
        EventBus.LIZLLL().LJJI(this);
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIILL(this.LLILLL);
        if (ServiceManager.get() == null || AccountHelperService.createIAccountHelperServicebyMonsterPlugin(false) == null) {
            return;
        }
        AccountHelperService.createIAccountHelperServicebyMonsterPlugin(false).getHpasDialog().onDestroy();
    }

    public final void bo(Bundle bundle) throws Throwable {
        Uri data;
        Class<? extends Activity> clsLJLJJI;
        boolean z;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (bundle != null && c19egLIZ != null) {
            if (C10EU.LJIIIIZZ() && ((AbstractC848400XPy) C0XQ7.LJFF()).LJJI().size() > 1) {
                C794420VEi.LIZIZ("child_mode_multi_account", "", null);
            }
            C19276710bF.LIZ = false;
            if (bundle.getBoolean("is_start_by_switch_account", false)) {
                C786410Ut5.LJLIIL(500L, new BPEAHandler(), new Runnable() { // from class: X.0zt8
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("AccountMainActivityAssem@7d4.handleSwitchAccount$1");
                        try {
                            ComplianceServiceProvider.LJJI().LJIIJ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("AccountMainActivityAssem@7d4.handleSwitchAccount$1");
                    }
                });
                C1440005kM.LIZ(new IEvent() { // from class: X.0zt6
                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent post() {
                        C1440005kM.LIZ(this);
                        return this;
                    }

                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent postSticky() {
                        C1440005kM.LIZIZ(this);
                        return this;
                    }
                });
            }
            if (!TextUtils.isEmpty(bundle.getString("switch_account_success_toast_text", null))) {
                String string = bundle.getString("switch_account_success_toast_text", null);
                boolean z2 = bundle.getBoolean("show_gesture_tooltip_after_switch", false);
                String string2 = bundle.getString("enter_from", "");
                String string3 = bundle.getString("enter_method", "");
                boolean zLIZIZ = ProfileTabDoubleTapSwitchConfig.LIZIZ();
                if (!zLIZIZ && !Intrinsics.LJFF(string3, "double_tap") && !Intrinsics.LJFF(string3, "long_press")) {
                    z = false;
                } else {
                    z = true;
                    String nickname = C0XQ5.LIZIZ.LJIIJ().getCurUser().getNickname();
                    if (nickname != null && nickname.length() != 0) {
                        string = c19egLIZ.getString(2131849404, nickname);
                    }
                }
                C1913290zt9 c1913290zt9 = new C1913290zt9(this, string2, string3, c19egLIZ, z2, bundle.getString("gesture_tooltip_enter_from", string2), bundle.getString("gesture_tooltip_enter_method", string3), string, z, zLIZIZ);
                if (c19egLIZ.hasWindowFocus()) {
                    c1913290zt9.invoke();
                } else {
                    this.LLILZ = c1913290zt9;
                }
                bundle.remove("switch_account_success_toast_text");
                bundle.remove("show_gesture_tooltip_after_switch");
                bundle.remove("gesture_tooltip_enter_from");
                bundle.remove("gesture_tooltip_enter_method");
            }
            boolean z3 = bundle.getBoolean("login_jump");
            boolean z4 = bundle.getBoolean("switch_jump");
            boolean z5 = bundle.getBoolean("cancelRestoreOnMain");
            Intent intent = (Intent) bundle.getParcelable("push_intent");
            if (intent != null) {
                data = intent.getData();
            } else {
                data = null;
            }
            if (z5) {
                ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().cancelRestoreOnMain();
            }
            if (intent != null) {
                if (z3 || z4) {
                    intent.putExtra("second_jump", true);
                    IDeepLinkService iDeepLinkService = (IDeepLinkService) PluggableExtentionKt.pluggableSpi$default(IDeepLinkService.class, false, false, false, 14, null);
                    if (iDeepLinkService == null || (clsLJLJJI = iDeepLinkService.LJLJJI("AccountMainActivityAssem#handleSwitchAccount")) == null) {
                        return;
                    }
                    intent.setClass(c19egLIZ, clsLJLJJI);
                    intent.putExtra("inner_from", "switch_account");
                    if (data != null) {
                        intent.setData(data.buildUpon().appendQueryParameter("_t", String.valueOf(System.currentTimeMillis())).build());
                    }
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19egLIZ, intent, "Context_startActivity_1");
                    C1701330uNH.LIZ(intent, c19egLIZ);
                    C2204961BRm.LLJJJJ(c19egLIZ, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECP97pEtLwaBok5EiPKa7j+RFNRBBbwBpRpT/HG8=", null));
                }
            }
        }
    }

    @C14EU(priority = 100, sticky = true, threadMode = ThreadMode.MAIN)
    public final void handleAccountSwitchSuccess(C1436005ji c1436005ji) throws Throwable {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && !c19egLIZ.isChangingConfigurations()) {
            EventBus.LIZLLL().LJIL(c1436005ji);
            bo(c1436005ji.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onNewIntent(Intent intent) throws Throwable {
        Bundle extras;
        super.onNewIntent(intent);
        try {
            extras = intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            extras = null;
        }
        bo(extras);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSwitchAccountSuccess(C484220Iyq c484220Iyq) {
        Integer numValueOf;
        C19EG c19egLIZ;
        MainBusinessAbility mainBusinessAbility;
        String strOptString;
        JSONObject jSONObject = c484220Iyq.LIZ;
        if (jSONObject == null) {
            return;
        }
        Object obj = null;
        if (!TextUtils.equals(jSONObject.optString("eventName"), "account_switch_success")) {
            JSONObject jSONObjectOptJSONObject = c484220Iyq.LIZ.optJSONObject("data");
            if (jSONObjectOptJSONObject != null) {
                strOptString = jSONObjectOptJSONObject.optString("eventName");
            } else {
                strOptString = null;
            }
            if (!TextUtils.equals(strOptString, "account_switch_success")) {
                return;
            }
        }
        JSONObject jSONObjectOptJSONObject2 = c484220Iyq.LIZ.optJSONObject("data");
        if (jSONObjectOptJSONObject2 == null) {
            return;
        }
        if (TextUtils.equals(jSONObjectOptJSONObject2.optString("enter_from"), "business_suite_setting")) {
            BASwitchToPAorBAServiceImpl.LIZLLL().LIZIZ(C724240Sb0.LIZ(this));
        } else {
            ((AbstractC848400XPy) C0XQ7.LJFF()).LJI();
            ISettingManagerService iSettingManagerService = (ISettingManagerService) ServiceManager.get().getService(ISettingManagerService.class);
            C724240Sb0.LIZ(this);
            iSettingManagerService.LIZIZ(1);
            int iOptInt = jSONObjectOptJSONObject2.optInt("account_type");
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("data");
            if (jSONObjectOptJSONObject3 != null) {
                numValueOf = Integer.valueOf(jSONObjectOptJSONObject3.optInt("account_type"));
            } else {
                numValueOf = null;
            }
            if (iOptInt == 2) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C724240Sb0.LIZ(this), "//setting");
                smartRouteBuildRoute.addFlags(67108864);
                smartRouteBuildRoute.addFlags(536870912);
                smartRouteBuildRoute.withParam("from_switch_creator_success", true);
                smartRouteBuildRoute.open();
                if (!ComplianceServiceProvider.LJIJJ().LJJIFFI()) {
                    ComplianceServiceProvider.LJIJJ().LJJIIJZLJL("switch_business_account");
                }
                C1440005kM.LIZ(new IEvent() { // from class: X.0iaU
                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent post() {
                        C1440005kM.LIZ(this);
                        return this;
                    }

                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent postSticky() {
                        C1440005kM.LIZIZ(this);
                        return this;
                    }
                });
            } else if ((iOptInt == 3 || (numValueOf != null && numValueOf.intValue() == 3)) && (c19egLIZ = C724240Sb0.LIZ(this)) != null) {
                C1440005kM.LIZ(new IEvent() { // from class: X.0iLB
                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent post() {
                        C1440005kM.LIZ(this);
                        return this;
                    }

                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent postSticky() {
                        C1440005kM.LIZIZ(this);
                        return this;
                    }
                });
                if (C297720Bli.LIZ()) {
                    C1878330yyl c1878330yyl = this.LLILZLL;
                    if (c1878330yyl == null) {
                        synchronized (this) {
                            c1878330yyl = this.LLILZLL;
                            if (c1878330yyl == null) {
                                c1878330yyl = new C1878330yyl();
                                this.LLILZLL = c1878330yyl;
                            }
                        }
                    }
                    Object obj2 = c1878330yyl.LL;
                    if (!Intrinsics.LJFF(obj2, C1610310s0T.LIZ)) {
                        obj = obj2;
                    }
                    mainBusinessAbility = (MainBusinessAbility) obj;
                } else {
                    mainBusinessAbility = (MainBusinessAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), MainBusinessAbility.class);
                }
                if (mainBusinessAbility != null) {
                    mainBusinessAbility.k62(c19egLIZ, "performClickTab", "USER");
                }
                if (!ComplianceServiceProvider.LJIJJ().LJJIFFI()) {
                    ComplianceServiceProvider.LJIJJ().LJJIIJZLJL("switch_business_account");
                }
            }
        }
        if (ComplianceServiceProvider.LJIJJ().LJJIFFI()) {
            ComplianceServiceProvider.LJIJJ().LJJIIJ("switch_business_account");
        } else {
            ComplianceServiceProvider.LJIJJ().LJIILJJIL();
        }
        ((IHybridKitService) ServiceManager.get().getService(IHybridKitService.class)).LJIJ();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onUserLogicDeleteEvent(C0XKF c0xkf) {
        if (this.LL.compareAndSet(false, true)) {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
                c1389890mGx.LJIIJ(c0xkf.LIZ);
                c1389890mGx.LJIIJJI();
            }
            C0XQ7.LIZJ().logout("user_logic_delete", "cancel_account_logout");
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void showEditProfileGuide(C484220Iyq c484220Iyq) {
        if (TextUtils.equals(JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName"), "ttba_show_edit_profile_guide")) {
            if (C297720Bli.LIZ()) {
                C1878330yyl c1878330yyl = this.LLILZIL;
                if (c1878330yyl == null) {
                    synchronized (this) {
                        c1878330yyl = this.LLILZIL;
                        if (c1878330yyl == null) {
                            c1878330yyl = new C1878330yyl();
                            this.LLILZIL = c1878330yyl;
                        }
                    }
                }
                Object obj = c1878330yyl.LL;
                if (Intrinsics.LJFF(obj, C1610310s0T.LIZ)) {
                    obj = null;
                }
                MainDialogAbility mainDialogAbility = (MainDialogAbility) obj;
                if (mainDialogAbility != null) {
                    mainDialogAbility.kL0();
                    return;
                }
                return;
            }
            ((MainDialogAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), MainDialogAbility.class)).kL0();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onWindowFocusChanged(boolean z, boolean z2) {
        super.onWindowFocusChanged(z, z2);
        if (z) {
            Function0<Unit> function0 = this.LLILZ;
            if (function0 != null) {
                this.LLILZ = null;
                function0.invoke();
            }
            if (this.LLILLJJLI) {
                this.LLILLJJLI = false;
            }
        }
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static final C1389890mGx m155do(C19EG c19eg, String str, boolean z, boolean z2) {
        C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
        c1389890mGx.LJIIJ(str);
        if (z) {
            c1389890mGx.LJIIL(64);
            c1389890mGx.LIZ.LIZLLL = true;
            c1389890mGx.LIZLLL(2000L);
        }
        if (z2) {
            c1389890mGx.LIZ.LJ = new AwS585S0100000_6(C438710HIf.LIZ(C0XQ5.LIZIZ.LJIIJ().getCurUser().getAvatarThumb()), 34);
        }
        return c1389890mGx;
    }
}
