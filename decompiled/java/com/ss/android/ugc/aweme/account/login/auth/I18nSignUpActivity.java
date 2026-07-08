package com.ss.android.ugc.aweme.account.login.auth;

import X.AbstractC19311610gs;
import X.C01GW;
import X.C0CCZ;
import X.C0FNV;
import X.C0W93;
import X.C0XFF;
import X.C0XGR;
import X.C0XGX;
import X.C0XGZ;
import X.C0XVC;
import X.C1150504el;
import X.C1238280iKQ;
import X.C13LE;
import X.C1697810uHb;
import X.C16G0;
import X.C1832307Fp;
import X.C19313310h9;
import X.C19719612Di;
import X.C19EH;
import X.C1BV2;
import X.C20684815ws;
import X.C2097608Jq;
import X.C293980Bfg;
import X.C294020Bfk;
import X.C452501pT;
import X.C754130Ti7;
import X.C785410UrT;
import X.C786410Ut5;
import X.C798410VTr;
import X.C799890VZj;
import X.C799900VZk;
import X.C818480W8w;
import X.C847910XOb;
import X.C852170Xbr;
import X.DialogC1389620mGW;
import X.InterfaceC1238290iKR;
import X.InterfaceC1740760vOs;
import X.InterfaceC1916090zxf;
import X.InterfaceC19315510hV;
import X.InterfaceC19315610hW;
import X.InterfaceC876920Yag;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS97S0200000_28;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAutoLoginService;
import com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.account.login.auth.ui.login.LoginSignupTabFragment;
import com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.INewUserMainModuleService;
import com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public class I18nSignUpActivity extends BaseActivity implements InterfaceC1238290iKR, InterfaceC1740760vOs, InterfaceC19315610hW, InterfaceC1916090zxf, InterfaceC876920Yag, InterfaceC19315510hV {
    public static Boolean LLJLLIL = null;
    public static boolean LLJLLL = false;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjHELIOSFiJSA0IStiKDonIGsFeHc9GywrJxojCSY4IDk6PDw=";
    public TuxTextView LL;
    public View LLILLJJLI;
    public TuxIconView LLILLL;
    public TuxIconView LLILZ;
    public TuxTextView LLILZIL;
    public View LLILZLL;
    public C16G0 LLIZ;
    public FrameLayout LLIZLLLIL;
    public FrameLayout LLJ;
    public DialogC1389620mGW LLJI;
    public boolean LLJIJIL;
    public DialogC1389620mGW LLJILJILJ;
    public AbstractC19311610gs LLJILLL;
    public C1BV2 LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public Long LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJL;
    public long LLJLIL;
    public String LLJILJIL = "";
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 62));
    public final IProactiveTriggersService LLJJJJ = (IProactiveTriggersService) PluggableExtentionKt.pluggableSpi$default(IProactiveTriggersService.class, false, false, false, 14, null);
    public final IAccountService LLJJJJJIL = (IAccountService) ServiceManager.get().getService(IAccountService.class);
    public final IOneClickLoginService LLJJJJLIIL = (IOneClickLoginService) ServiceManager.get().getService(IOneClickLoginService.class);
    public final IAutoLoginService LLJJL = (IAutoLoginService) ServiceManager.get().getService(IAutoLoginService.class);
    public final long LLJJLIIIJLLLLLLLZ = 2000;
    public boolean LLJLILLLLZIIL = true;
    public final C754130Ti7 LLJLL = new C754130Ti7(this);

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b5346";
    }

    @Override // X.InterfaceC1916090zxf
    public final boolean getCanCollectConsent() {
        return false;
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    public final void LLLLLZL() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            viewFindViewById = findViewById(R.id.ey1);
            this.LLIZ = (C16G0) viewFindViewById;
        }
        View view = viewFindViewById;
        if (view.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.height = -2;
            layoutParams.setMargins(0, 0, 0, 0);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
            view.setLayoutParams(layoutParams);
            FrameLayout frameLayoutLLLZIL = LLLZIL();
            ViewGroup.LayoutParams layoutParams2 = frameLayoutLLLZIL.getLayoutParams();
            if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
                layoutParams3.height = -2;
                layoutParams3.setMargins(0, 0, 0, 0);
                C786410Ut5.a6(frameLayoutLLLZIL, layoutParams2);
            }
        }
    }

    public final void LLLLZI() {
        if (this.LLJJIII) {
            double dEQ2 = LLLLZLLLI().EQ2();
            if (dEQ2 <= 0.0d) {
                return;
            }
            int i = (int) (((double) getResources().getDisplayMetrics().heightPixels) * dEQ2);
            FrameLayout frameLayoutLLLZIL = LLLZIL();
            ViewGroup.LayoutParams layoutParams = frameLayoutLLLZIL.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams) layoutParams).height = i;
                C786410Ut5.a6(frameLayoutLLLZIL, layoutParams);
            }
        }
    }

    public final SignupViewModel LLLLZLLLI() {
        return (SignupViewModel) this.LLJJ.getValue();
    }

    public final View LLLZ() {
        View view = this.LLILZLL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.tqy);
        this.LLILZLL = viewFindViewById;
        return viewFindViewById;
    }

    public final FrameLayout LLLZIL() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vbe);
            this.LLJ = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final void LLLZZIL() {
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(this);
        this.LLJI = dialogC1389620mGW;
        dialogC1389620mGW.LJJLL(false);
        DialogC1389620mGW dialogC1389620mGW2 = this.LLJI;
        if (dialogC1389620mGW2 != null) {
            dialogC1389620mGW2.LJJLIIJ(false);
        }
        DialogC1389620mGW dialogC1389620mGW3 = this.LLJI;
        if (dialogC1389620mGW3 != null) {
            dialogC1389620mGW3.LJJLJ(R.string.txr);
        }
        DialogC1389620mGW dialogC1389620mGW4 = this.LLJI;
        if (dialogC1389620mGW4 != null) {
            C786410Ut5.J4(dialogC1389620mGW4);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        ((CopyOnWriteArrayList) C1238280iKQ.LIZIZ).remove(this);
        super.onDestroy();
        C847910XOb.LIZ.getClass();
        C0XFF.LIZ("TTPRelated", "end ttp context");
        ArrayList arrayList = (ArrayList) C847910XOb.LJIIIIZZ;
        if (!arrayList.isEmpty()) {
            C19719612Di.LJJIJIIJI(arrayList);
        }
        if (!C1150504el.LIZ().LJIIIZ("cold_boot_after_sync_user_to_signup_destroy")) {
            C1150504el.LIZ().LJI("cold_boot_after_sync_user_to_signup_destroy", false);
        }
        if (!C1150504el.LIZ().LJIIIZ("cold_boot_login_success_to_signup_destroy")) {
            C1150504el.LIZ().LJI("cold_boot_login_success_to_signup_destroy", false);
        }
        DialogC1389620mGW dialogC1389620mGW = this.LLJILJILJ;
        if (dialogC1389620mGW != null) {
            C0FNV.LIZ(dialogC1389620mGW);
        }
        if (C0XGX.LIZ()) {
            return;
        }
        LLLLZLLLI().LLILLL = null;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity", "onResume", true);
        super.onResume();
        LLLLZIL();
        if (!C0XGX.LIZ() && Intrinsics.LJFF(LLJLLIL, Boolean.TRUE)) {
            LLJLLIL = null;
            AbstractC19311610gs abstractC19311610gs = this.LLJILLL;
            if (abstractC19311610gs != null) {
                abstractC19311610gs.LIZIZ("signup");
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity", "onStart", true);
        super.onStart();
        this.LLJJJJJIL.LIZJ().loginPanelDisplayedUpdate(true, C13LE.LIZ(getClass()).LJI());
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity", "onStart", false);
    }

    @Override // X.InterfaceC876920Yag
    public final List<Integer> zs() {
        return Collections.singletonList(10);
    }

    @Override // X.InterfaceC19315510hV
    public final void LJJJ() {
        if (C294020Bfk.LIZ() && !LLLLZLLLI().OQ2()) {
            View viewLLLZ = LLLZ();
            if (!this.LLJJIJI) {
                if (this.LLJJIJIIJIL) {
                    HandlerHook.viewPost(viewLLLZ, new ARunnableS97S0200000_28(ViewPagerBottomSheetBehavior.LIZ(viewLLLZ), viewLLLZ, 12));
                    this.LLJJIJIIJIL = false;
                    return;
                }
                return;
            }
            ViewPagerBottomSheetBehavior viewPagerBottomSheetBehaviorLIZ = ViewPagerBottomSheetBehavior.LIZ(viewLLLZ);
            ViewGroup.LayoutParams layoutParams = viewLLLZ.getLayoutParams();
            layoutParams.height = -2;
            C786410Ut5.W5(viewLLLZ, layoutParams);
            HandlerHook.viewPost(viewLLLZ, new ARunnableS97S0200000_28(viewPagerBottomSheetBehaviorLIZ, viewLLLZ, 11));
            this.LLJJIJI = false;
        }
    }

    @Override // X.InterfaceC19315610hW
    public final void LLJJJJLIIL() {
        if (LLLLZLLLI().OQ2()) {
            finish();
            return;
        }
        getWindow().setDimAmount(0.0f);
        ViewPagerBottomSheetBehavior viewPagerBottomSheetBehaviorLIZ = ViewPagerBottomSheetBehavior.LIZ(LLLZ());
        if (viewPagerBottomSheetBehaviorLIZ == null) {
            finish();
        } else {
            this.LLJJIJIL = true;
            viewPagerBottomSheetBehaviorLIZ.setState(5);
        }
    }

    public final void LLLLZIL() {
        Intent intent = getIntent();
        if (intent == null || !intent.getBooleanExtra("extra_login_notify_reentry", false)) {
            return;
        }
        if (C0XGX.LIZ()) {
            LoginSignupTabFragment loginSignupTabFragmentLLLLZLL = LLLLZLL();
            if (loginSignupTabFragmentLLLLZLL != null) {
                loginSignupTabFragmentLLLLZLL.NR().LJIIJJI();
            }
        } else {
            AbstractC19311610gs abstractC19311610gs = this.LLJILLL;
            if (abstractC19311610gs != null) {
                abstractC19311610gs.LJIIJJI();
            }
        }
        Intent intent2 = new Intent(getIntent());
        intent2.removeExtra("extra_login_notify_reentry");
        setIntent(intent2);
    }

    public final LoginSignupTabFragment LLLLZLL() {
        FrameLayout frameLayoutLLLZIL = LLLZIL();
        if (frameLayoutLLLZIL != null) {
            Fragment fragmentLJJJJZ = getSupportFragmentManager().LJJJJZ(frameLayoutLLLZIL.getId());
            if (fragmentLJJJJZ instanceof LoginSignupTabFragment) {
                return (LoginSignupTabFragment) fragmentLJJJJZ;
            }
        }
        return null;
    }

    public final void LLLLZLLIL() {
        super.finish();
        DialogC1389620mGW dialogC1389620mGW = this.LLJI;
        if (dialogC1389620mGW != null) {
            dialogC1389620mGW.dismiss();
            C785410UrT.LIZ(dialogC1389620mGW);
        }
    }

    public final void LLLZLZ() {
        if (LLLLZLLLI().OQ2() || isFinishing()) {
            return;
        }
        C19313310h9.LIZ.getClass();
        C19313310h9.LIZ(this);
        if (LLLLZLLLI().xQ2()) {
            LLLLLZL();
            LLLLZI();
        }
        LLLLZI();
        FrameLayout frameLayoutLLLZIL = LLLZIL();
        View viewLLLZ = LLLZ();
        if (viewLLLZ != null) {
            if (frameLayoutLLLZIL != null) {
                frameLayoutLLLZIL.requestLayout();
            }
            viewLLLZ.requestLayout();
            HandlerHook.viewPost(viewLLLZ, new ARunnableS97S0200000_28(this, viewLLLZ, 44));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae A[PHI: r2
      0x00ae: PHI (r2v2 int) = (r2v1 int), (r2v1 int), (r2v8 int) binds: [B:35:0x00ab, B:32:0x00a7, B:39:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void finish() {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity.finish():void");
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (C0XGX.LIZ()) {
            LoginSignupTabFragment loginSignupTabFragmentLLLLZLL = LLLLZLL();
            if (loginSignupTabFragmentLLLLZLL != null && loginSignupTabFragmentLLLLZLL.NR().LLZLL()) {
                return;
            }
            if (getSupportFragmentManager().LJJLIIIIJ() > 0) {
                getSupportFragmentManager().LJLLILLLL();
                return;
            } else {
                if (LLLLZLLLI().OQ2() && !LLLLZLLLI().QQ2()) {
                    return;
                }
                if (LLLLZLLLI().OQ2() && LLLLZLLLI().NQ2()) {
                    return;
                }
            }
        } else {
            AbstractC19311610gs abstractC19311610gs = this.LLJILLL;
            if (abstractC19311610gs != null && abstractC19311610gs.LLZLL()) {
                return;
            }
        }
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_method", LLLLZLLLI().getEnterMethod());
        c0xgr.LIZLLL("enter_from", LLLLZLLLI().getEnterFrom());
        c0xgr.LIZLLL("exit_method", "go_back");
        c0xgr.LIZLLL("group_id", (String) LLLLZLLLI().LLJJIJIIJIL.getValue());
        c0xgr.LIZLLL("login_panel_type", LLLLZLLLI().BQ2());
        c0xgr.LIZIZ(LLLLZLLLI().AQ2(), "duration");
        if (Intrinsics.LJFF(LLLLZLLLI().getEnterFrom(), "age_gate_page")) {
            c0xgr.LIZJ("exit_to", "back_to_age_gate");
        }
        C20684815ws.LJIILLIIL("close_login_notify", c0xgr.LIZ);
        super.onBackPressed();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStop() {
        super.onStop();
        this.LLJJJJJIL.LIZJ().loginPanelDisplayedUpdate(false, C13LE.LIZ(getClass()).LJI());
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    public static void LLZLI(int i) {
        if (C798410VTr.LIZ()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("monitor_scene", "scene_login");
            linkedHashMap.put("vv_code", Integer.valueOf(i));
            C798410VTr.LJFF(linkedHashMap);
        }
    }

    @Override // X.InterfaceC1238290iKR
    public final void LLJJ(int i) {
        C0CCZ c0cczLJFF;
        if (i != 11) {
            if (i == 15) {
                super.finish();
                return;
            }
            return;
        }
        this.LLJIJIL = true;
        Long l = this.LLJJJ;
        if (l != null) {
            long jLongValue = l.longValue();
            int i2 = Keva.getRepo("app_launch").getInt("launch_times", -1);
            C0XGR c0xgr = new C0XGR();
            c0xgr.LIZIZ(SystemClock.elapsedRealtime() - jLongValue, "duration");
            c0xgr.LIZ(i2, "launch_times");
            C20684815ws.LJIILLIIL("first_login_duration", c0xgr.LIZ);
        }
        if (!C293980Bfg.LIZIZ()) {
            C1832307Fp.LIZ.getClass();
            if (C1832307Fp.LIZJ(true) && !this.LLJJJIL && !this.LLJJJJJIL.LJIIJ().LIZ()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                INewUserMainModuleService iNewUserMainModuleService = (INewUserMainModuleService) PluggableExtentionKt.pluggableSpi$default(INewUserMainModuleService.class, false, false, false, 14, null);
                if (iNewUserMainModuleService != null && (c0cczLJFF = iNewUserMainModuleService.LJFF(1, 3)) != null) {
                    C799900VZk.LIZ.getClass();
                    C799890VZj c799890VZj = new C799890VZj();
                    c799890VZj.LIZ(c0cczLJFF);
                    c799890VZj.LIZIZ();
                }
                C0XVC.LIZ(Long.valueOf(jCurrentTimeMillis), "FeedPreloadHook", "login");
                this.LLJJJIL = true;
            }
        }
        C1150504el.LIZ().LJI("cold_boot_new_user_login_duration", false);
        C1150504el.LIZ().LIZLLL("cold_boot_new_user_login_end_to_feed_total_start", false);
        finish();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (C0XGZ.LIZ() || (Build.VERSION.SDK_INT >= 24 && isInMultiWindowMode())) {
            LLLZLZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cf  */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r25) {
        /*
            Method dump skipped, instruction units count: 1293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24 && i < 26) {
            super.onMultiWindowModeChanged(z);
            LLLZLZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        if (intent.getBooleanExtra("extra_login_notify_reentry", false)) {
            try {
                String stringExtra = intent.getStringExtra("extra_login_notify_reentry_enter_method");
                if (stringExtra != null && stringExtra.length() != 0) {
                    for (Bundle bundle : C1697810uHb.LJIIJJI(LLLLZLLLI().CQ2(), LLLLZLLLI().zQ2(), LLLLZLLLI().GQ2(), LLLLZLLLI().LLLI.getValue())) {
                        C786410Ut5.LJJJI("enter_method", stringExtra, bundle);
                        C852170Xbr.LIZ.getClass();
                        Map mapLJI = C852170Xbr.LJI(bundle);
                        if (mapLJI != null) {
                            mapLJI.put("enter_method", stringExtra);
                            C786410Ut5.LJJIZ(bundle, "extra_param", (Serializable) mapLJI);
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        LLLLZIL();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
        if (z && this.LLJLILLLLZIIL) {
            this.LLJLILLLLZIIL = false;
            C818480W8w.LIZJ("account_i18n_sign_up", C0W93.SUCCESS, null, C2097608Jq.LJIIIIZZ(new Pair("enter_from", LLLLZLLLI().getEnterFrom()), new Pair("enter_method", LLLLZLLLI().getEnterMethod()), new Pair("enter_type", LLLLZLLLI().yQ2()), new Pair("full_screen_dialog", Boolean.valueOf(LLLLZLLLI().OQ2())), new Pair("adjust_height_dynamically", Boolean.valueOf(LLLLZLLLI().xQ2())), new Pair("expendable_dialog", Boolean.valueOf(LLLLZLLLI().MQ2())), new Pair("skip_the_one", Boolean.valueOf(LLLLZLLLI().JQ2())), new Pair("show_login_panel_first", Boolean.valueOf(LLLLZLLLI().FQ2())), new Pair("show_one_login_panel", Boolean.valueOf(this.LLJJJJLIIL.LJIIJ(null)))));
        }
    }

    public final void setDividerFromXml(View view) {
        this.LLILLJJLI = view;
    }

    public final void setRootFromXml(View view) {
        this.LLILZLL = view;
    }

    public final void LLZ(boolean z, boolean z2) {
        Bundle bundle;
        Bundle extras;
        if (z2) {
            getIntent().putExtra("show_login_page_first", true);
        }
        if (C294020Bfk.LIZ() && C0XGX.LIZ() && !LLLLZLLLI().OQ2()) {
            View viewLLLZ = LLLZ();
            if (getSupportFragmentManager().LJJJJZ(LLLZIL().getId()) != null && viewLLLZ.getHeight() > 0) {
                ViewGroup.LayoutParams layoutParams = viewLLLZ.getLayoutParams();
                layoutParams.height = viewLLLZ.getHeight();
                C786410Ut5.W5(viewLLLZ, layoutParams);
                this.LLJJIJI = true;
            }
        }
        FrameLayout frameLayoutLLLZIL = LLLZIL();
        LoginSignupTabFragment loginSignupTabFragment = new LoginSignupTabFragment();
        try {
            extras = getIntent().getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (extras == null) {
            bundle = null;
        } else {
            bundle = new Bundle(extras);
        }
        loginSignupTabFragment.setArguments(bundle);
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJJLI(R.anim.fv, R.anim.ah, R.anim.ft, R.anim.ai);
        c19ehLJIIJ.LJIJ(frameLayoutLLLZIL.getId(), loginSignupTabFragment, null);
        if (z) {
            c19ehLJIIJ.LJII(null);
        }
        c19ehLJIIJ.LJIIIZ();
        getSupportFragmentManager().LJJJJL();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 26) {
            super.onMultiWindowModeChanged(z, configuration);
            LLLZLZ();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.LLJLL.LIZ(new ActivityResult(i2, intent));
    }
}
