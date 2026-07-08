package com.ss.android.ugc.aweme.account.login.authorize;

import X.AbstractC20344114j1;
import X.C0FNV;
import X.C0WZX;
import X.C0XGR;
import X.C0XO3;
import X.C0XPY;
import X.C0XQ5;
import X.C0XQF;
import X.C0XQG;
import X.C0XQZ;
import X.C0XZ4;
import X.C0XZV;
import X.C0XZY;
import X.C1072010e0F;
import X.C1072020e0G;
import X.C10RP;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C1912380zrg;
import X.C19254610Um;
import X.C19315710hX;
import X.C1ATR;
import X.C1AWO;
import X.C1BWA;
import X.C1BWD;
import X.C20344014j0;
import X.C20344214j2;
import X.C20431714x9;
import X.C20684815ws;
import X.C2093608Ic;
import X.C2188811AlT;
import X.C2193741AtQ;
import X.C2204961BRm;
import X.C275580Ar6;
import X.C299020Bno;
import X.C335910DEv;
import X.C786410Ut5;
import X.C847910XOb;
import X.C851240XaM;
import X.C851250XaN;
import X.C851480Xak;
import X.C852170Xbr;
import X.DialogC1240080iNK;
import X.EnumC191814102i;
import X.EnumC335920DEw;
import X.InterfaceC1240070iNJ;
import X.InterfaceC1916090zxf;
import X.InterfaceC19303910fd;
import X.InterfaceC19305110fp;
import X.InterfaceC20343914iz;
import X.InterfaceC21614319iP;
import X.InterfaceC2204941BRk;
import X.InterfaceC851260XaO;
import X.InterfaceC852200Xbu;
import Y.AObserverS233S0100000_31;
import Y.ARunnableS113S0100000_13;
import Y.ARunnableS131S0100000_31;
import Y.ARunnableS35S0201000_31;
import Y.ARunnableS3S0220000_28;
import Y.ARunnableS46S0300000_13;
import Y.ARunnableS82S0200000_13;
import Y.AfS200S0100000_31;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Window;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ICredentialManagerService;
import com.ss.android.ugc.aweme.IPrevLoginPlatformService;
import com.ss.android.ugc.aweme.account.base.SafeHandler;
import com.ss.android.ugc.aweme.account.login.passkey.PasskeyApis;
import com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.service.IFriendsService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IAccountHelperService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class AuthorizeActivity extends BaseActivity implements InterfaceC1240070iNJ, InterfaceC851260XaO, InterfaceC19303910fd, InterfaceC21614319iP, InterfaceC19305110fp, InterfaceC852200Xbu, InterfaceC1916090zxf, InterfaceC20343914iz, C0XQG {
    public static final Map<Integer, Integer> LLJJJJLIIL = new HashMap();
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiHELIOSJSA0IStiKDonICo+IDU2ZgQ5PSc8Oiw2LA4wPCw6IDsq";
    public C1ATR LL;
    public C1072020e0G LLILLJJLI;
    public C1AWO LLILLL;
    public C1BWA LLILZ;
    public AuthResult LLILZIL;
    public InterfaceC2204941BRk LLILZLL;
    public String LLIZ;
    public boolean LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public boolean LLJILLL;
    public DialogC1240080iNK LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public C0XZV LLJJJ;
    public Long LLJJJJJIL;
    public final SafeHandler LLJJIJIIJIL = new SafeHandler(this);
    public int LLJJIJIL = -1;
    public boolean LLJJJIL = false;
    public boolean LLJJJJ = false;

    @Override // X.C0XQG
    public final void LLJLILLLLZIIL() {
        C0XQF.LIZJ = null;
        Intent intent = new Intent();
        intent.putExtra("error_code", this.LLJJIJIL);
        if (ComplianceServiceProvider.LIZLLL().LIZ() == EnumC191814102i.US_FTC && this.LLJJIII && !TextUtils.equals(this.LLIZ, "facebook") && !TextUtils.equals(this.LLIZ, "google") && C0XQZ.LIZ().getInt("ftc_age_gate_response_mode", 0) != EnumC191814102i.PASS.getValue()) {
            LLLLZLL(0, intent);
            return;
        }
        int i = this.LLJJJ.LIZLLL;
        if (!(i == 1030 || i == 1041)) {
            intent.putExtra("description", this.LLJJIJIL);
            LLLLZLL(0, intent);
        } else {
            intent.putExtra("description", this.LLJJIJIL);
            intent.putExtra("repeat_bind_error", true);
            LLLLZLL(999, intent);
        }
    }

    @Override // X.InterfaceC852200Xbu
    public final String dm() {
        return "";
    }

    @Override // X.InterfaceC1916090zxf
    public final boolean getCanCollectConsent() {
        return false;
    }

    @Override // X.C0XQG
    public final Activity getFragmentActivity() {
        return this;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC20343914iz
    public final void LJ() {
        runOnUiThread(new ARunnableS131S0100000_31(this, 7));
    }

    public final void LLLLZLLLI() {
        if (this.LLJJ == null) {
            DialogC1240080iNK dialogC1240080iNK = new DialogC1240080iNK(this);
            this.LLJJ = dialogC1240080iNK;
            dialogC1240080iNK.LL = this;
        }
        DialogC1240080iNK dialogC1240080iNK2 = this.LLJJ;
        if (dialogC1240080iNK2 != null) {
            C0FNV.LIZJ(dialogC1240080iNK2);
        }
    }

    @Override // X.InterfaceC1240070iNJ
    public final void P4() {
        LLLLZLL(0, new Intent());
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        DialogC1240080iNK dialogC1240080iNK = this.LLJJ;
        if (dialogC1240080iNK != null) {
            C0FNV.LIZ(dialogC1240080iNK);
        }
        super.finish();
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if ("passkey".equals(this.LLIZ) || "google_onetap".equals(this.LLIZ)) {
            LLLLZLL(0, new Intent());
        } else {
            super.onBackPressed();
        }
    }

    @Override // X.InterfaceC852200Xbu
    public final String Nn() {
        return LLLLZI(getIntent(), "enter_type");
    }

    @Override // X.InterfaceC852200Xbu
    public final Bundle getExtras() {
        return LLLLLZL(getIntent());
    }

    public final void init() {
        Window window = getWindow();
        window.clearFlags(201326592);
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        this.LLILZLL = C0XZY.LJI();
        Intent intent = getIntent();
        this.LLIZ = LLLLZI(intent, "platform");
        this.LLIZLLLIL = intent.getBooleanExtra("is_login", true);
        boolean booleanExtra = intent.getBooleanExtra("is_only_fetch_token", false);
        this.LLJILLL = booleanExtra;
        if (booleanExtra) {
            this.LLIZLLLIL = false;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        C1AWO c1awo;
        super.onDestroy();
        PopupManager.LIZJ(C1912380zrg.class);
        if (this.LL != null) {
            C1ATR.LJ(this);
        }
        Map<Integer, Integer> map = LLJJJJLIIL;
        if (map != null) {
            ((HashMap) map).remove(Integer.valueOf(getTaskId()));
        }
        if (!C275580Ar6.LIZ() || (c1awo = this.LLILLL) == null) {
            return;
        }
        c1awo.onDestroy();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        boolean zLJI = MethodIDManager.LJI(71957);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onResume", true);
        super.onResume();
        if (this.LLJJJIL && !this.LLJJJJ) {
            LLJLILLLLZIIL();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onResume", false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // X.InterfaceC852200Xbu
    public final String LJJLIIIJJI() {
        return this.LLJ;
    }

    @Override // X.InterfaceC852200Xbu
    public final String LLIIJI() {
        return this.LLJI;
    }

    @Override // X.InterfaceC852200Xbu
    public final String bt() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC852200Xbu
    public final String channel() {
        return this.LLJILJILJ;
    }

    public static Bundle LLLLLZL(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC20343914iz
    public final void LLJJL(AbstractC20344114j1 abstractC20344114j1) {
        if (abstractC20344114j1 instanceof C20344014j0) {
            C20344014j0 c20344014j0 = (C20344014j0) abstractC20344114j1;
            PasskeyApis.LIZJ(c20344014j0.LIZ, c20344014j0.LIZIZ).LJIIZILJ(new AfS200S0100000_31(this, 3), new AfS200S0100000_31(this, 4));
        } else {
            if (!(abstractC20344114j1 instanceof C20344214j2)) {
                return;
            }
            AuthResult authResult = (AuthResult) ((C20344214j2) abstractC20344114j1).LIZ;
            this.LLIZ = authResult.mProviderId;
            LLLLJ(authResult);
        }
    }

    @Override // X.InterfaceC851260XaO
    public final void LLLLIILL(C0XO3 c0xo3) {
        AuthResult authResult;
        C0XQ5.LJIIL(c0xo3, "login");
        if (!TextUtils.isEmpty(this.LLIZ) && "facebook".equals(this.LLIZ) && c0xo3 != null && (authResult = this.LLILZIL) != null) {
            String[] stringArray = authResult.mBundle.getStringArray("fb_granted_permissions");
            int length = stringArray.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if ("user_friends".equals(stringArray[i])) {
                    z = true;
                    break;
                }
                i++;
            }
            String strValueOf = String.valueOf(c0xo3.LIZ);
            AuthResult authResult2 = this.LLILZIL;
            String str = authResult2.mToken;
            long j = authResult2.mExpiryDateInMillis;
            IFriendsService iFriendsService = (IFriendsService) PluggableExtentionKt.pluggableSpi(IFriendsService.class);
            if (iFriendsService != null) {
                if (z) {
                    iFriendsService.LJII().LJIIIZ(j, strValueOf, str);
                } else {
                    iFriendsService.LJII().LIZ(strValueOf);
                }
            }
        }
        if (this.LLIZLLLIL) {
            ((IOneClickLoginService) ServiceManager.get().getService(IOneClickLoginService.class)).LJIILIIL(new Bundle());
            C847910XOb c847910XOb = C847910XOb.LIZ;
            String str2 = c0xo3.LJIIL;
            String str3 = c0xo3.LJJIJ;
            c847910XOb.getClass();
            C847910XOb.LIZ(str2, str3);
            ((IAccountHelperService) C0XPY.LIZIZ(IAccountHelperService.class)).AppsFlyerUtilsTrackLoginSuccess(this.LLIZ);
            C786410Ut5.LJJZZIII(this.LLJJIJIIJIL, new ARunnableS82S0200000_13(c0xo3, this, 1));
            IPrevLoginPlatformService iPrevLoginPlatformService = (IPrevLoginPlatformService) ServiceManager.get().getService(IPrevLoginPlatformService.class);
            iPrevLoginPlatformService.LIZLLL(c0xo3.LIZ, this.LLIZ);
            iPrevLoginPlatformService.LJIIJ(this.LLIZ);
            return;
        }
        C786410Ut5.LJJZZIII(this.LLJJIJIIJIL, new ARunnableS113S0100000_13((Object) this, 5));
    }

    @Override // X.InterfaceC21614319iP
    public final void LLLLJ(AuthResult authResult) {
        String str;
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        if (!isFinishing() && !isDestroyed()) {
            this.LLILZIL = authResult;
            Long lValueOf2 = Long.valueOf(lValueOf.longValue() - this.LLJJJJJIL.longValue());
            Boolean boolValueOf = Boolean.valueOf(authResult.mIsCancelled);
            Intent intent = new Intent();
            intent.putExtra("platform", this.LLIZ);
            intent.putExtra("close_3p_time_ms", lValueOf2);
            intent.putExtra("is_cancelled", boolValueOf);
            if (authResult.mIsSuccessful) {
                str = "1";
            } else if (authResult.mIsCancelled) {
                str = "2";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            C0XGR c0xgr = new C0XGR();
            c0xgr.LIZLLL("enter_method", this.LLJI);
            c0xgr.LIZLLL("enter_from", this.LLJ);
            c0xgr.LIZLLL("enter_type", Nn());
            c0xgr.LIZLLL("login_panel_type", this.LLJIJIL);
            c0xgr.LIZLLL("platform", this.LLIZ);
            c0xgr.LIZLLL(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
            C20684815ws.LJIILLIIL("3p_auth_page_response", c0xgr.LIZ);
            if (authResult.mIsSuccessful) {
                LLLLZLLIL(authResult, true);
            } else if (authResult.mIsCancelled) {
                C786410Ut5.LJJZZIII(this.LLJJIJIIJIL, new ARunnableS82S0200000_13(intent, this, 0));
            } else {
                C786410Ut5.LJJZZIII(this.LLJJIJIIJIL, new ARunnableS46S0300000_13(this, authResult, intent, 0));
            }
            C1BWA c1bwa = this.LLILZ;
            if (c1bwa != null) {
                c1bwa.LIZ(authResult, new C20431714x9(this.LLJ, this.LLJI, this.LLJILJIL, this.LLJIJIL));
                return;
            }
            return;
        }
        PopupManager.LIZJ(C1912380zrg.class);
    }

    public final Boolean LLLLZIL(AuthResult authResult) {
        boolean z;
        if (!TextUtils.equals("google", authResult.mProviderId) && !TextUtils.equals("google_onetap", authResult.mProviderId)) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        boolean zLJI = MethodIDManager.LJI(202455);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onCreate", true);
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setContentView(R.layout.zz);
        this.LLJJJJJIL = Long.valueOf(System.currentTimeMillis());
        init();
        HashMap map = (HashMap) LLJJJJLIIL;
        if (map.containsKey(Integer.valueOf(getTaskId()))) {
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onCreate", false);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        map.put(Integer.valueOf(getTaskId()), Integer.valueOf(hashCode()));
        this.LLJ = LLLLZI(getIntent(), "enter_from");
        this.LLJI = LLLLZI(getIntent(), "enter_method");
        this.LLJIJIL = LLLLZI(getIntent(), "login_panel_type");
        this.LLJILJIL = LLLLZI(getIntent(), "source");
        this.LLJILJILJ = LLLLZI(getIntent(), "auth_from_app");
        if (C0XQ5.LJFF()) {
            ComplianceServiceProvider.LIZLLL().LJIILL(null);
        }
        ICredentialManagerService iCredentialManagerService = (ICredentialManagerService) PluggableExtentionKt.pluggableSpi(ICredentialManagerService.class);
        if (("passkey".equals(this.LLIZ) || "google_onetap".equals(this.LLIZ)) && iCredentialManagerService != null) {
            iCredentialManagerService.LJIJI(this, getIntent(), this);
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onCreate", false);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        String strLJFF = C19315710hX.LJFF(this.LLIZ);
        if (C275580Ar6.LIZ()) {
            LobbyViewModel.vQ2(this).wQ2().observe(this, new AObserverS233S0100000_31(this, 0));
        }
        this.LL = C1ATR.LIZIZ();
        C1072010e0F c1072010e0F = new C1072010e0F(this);
        c1072010e0F.LIZJ = this;
        c1072010e0F.LIZ = strLJFF;
        Bundle bundleLIZ = C19315710hX.LIZ(strLJFF);
        if (bundleLIZ != null) {
            Bundle bundle2 = c1072010e0F.LIZLLL;
            if (bundle2 == null) {
                c1072010e0F.LIZLLL = bundleLIZ;
            } else {
                C786410Ut5.LJJIIJZLJL(bundle2, bundleLIZ);
            }
        }
        this.LLILLJJLI = new C1072020e0G(c1072010e0F);
        this.LLILZ = C1BWD.LIZ(strLJFF);
        if (this.LL != null && this.LLILLJJLI != null) {
            MobClick mobClickObtain = MobClick.obtain();
            mobClickObtain.setEventName("sign_in");
            mobClickObtain.setLabelName(this.LLIZ);
            C20684815ws.onEvent(mobClickObtain);
            if ("google_web".equals(this.LLILLJJLI.LIZIZ)) {
                LLLLZLLLI();
            }
            if (C275580Ar6.LIZ()) {
                C1AWO c1awoLIZ = C1ATR.LIZIZ().LIZ(this.LLILLJJLI.LIZIZ);
                this.LLILLL = c1awoLIZ;
                if (c1awoLIZ == null) {
                    C2193741AtQ c2193741AtQ = new C2193741AtQ(this.LLILLJJLI.LIZIZ, 1);
                    c2193741AtQ.LIZ = false;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("No provider found for ");
                    sbLIZ.append(this.LLILLJJLI.LIZIZ);
                    c2193741AtQ.LIZIZ = new C851480Xak(1, C2188811AlT.LIZIZ(sbLIZ), "before_goto_URL");
                    LLLLJ(new AuthResult(c2193741AtQ));
                } else {
                    this.LLJJIJI = true;
                    Bundle bundle3 = this.LLILLJJLI.LIZLLL;
                    if (bundle3 == null) {
                        bundle3 = new Bundle();
                    }
                    c1awoLIZ.n20(this, bundle3);
                }
            } else {
                C1ATR c1atr = this.LL;
                C1072020e0G c1072020e0G = this.LLILLJJLI;
                c1atr.getClass();
                C1ATR.LIZJ(c1072020e0G);
            }
            C0XGR c0xgr = new C0XGR();
            c0xgr.LIZLLL("enter_method", this.LLJI);
            c0xgr.LIZLLL("enter_from", this.LLJ);
            c0xgr.LIZLLL("platform", this.LLIZ);
            c0xgr.LIZLLL("login_panel_type", this.LLJIJIL);
            c0xgr.LIZLLL("source", this.LLJILJIL);
            c0xgr.LIZ(1, "_perf_monitor");
            C1072020e0G c1072020e0G2 = this.LLILLJJLI;
            if (c1072020e0G2 != null && (str = c1072020e0G2.LIZIZ) != null) {
                c0xgr.LIZJ("provider_id", str);
            }
            C20684815ws.LJIILLIIL("token_request", c0xgr.LIZ);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onCreate", false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }

    public static String LLLLZI(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.C0XQG
    public final void LJJLIIIJ(C0XO3 c0xo3, JSONObject jSONObject) {
        this.LLJJJJ = true;
        C0XQF.LIZJ = null;
        LLLLIILL(c0xo3);
    }

    @Override // X.InterfaceC19305110fp
    public final void LJLILLLLZI(int i, AuthResult authResult) {
        if (i == -1) {
            LLLLZLLIL(authResult, false);
        } else {
            LLLLZLL(0, new Intent());
            finish();
        }
    }

    @Override // X.InterfaceC20343914iz
    public final void LLLILZLLLI(Throwable th, boolean z) {
        runOnUiThread(new ARunnableS3S0220000_28(this, th, z, 0));
    }

    public final void LLLLZLL(int i, Intent intent) {
        intent.putExtra("platform", this.LLIZ);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            C2204961BRm.LLLZ(this, i, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owskw7ZzjpAkGL23W6ZUpSsOMbBq/SqDC91CnBaI", null));
            finish();
        } else {
            C786410Ut5.LJJZZIII(this.LLJJIJIIJIL, new ARunnableS35S0201000_31(i, intent, this, 0));
        }
    }

    public final void LLLLZLLIL(AuthResult authResult, boolean z) {
        String string;
        String str;
        JSONObject jSONObject;
        String str2 = "";
        if (authResult == null) {
            string = "";
        } else {
            string = authResult.mBundle.getString("code");
        }
        String strLIZIZ = C19315710hX.LIZIZ(authResult);
        String strLIZJ = C19315710hX.LIZJ(authResult);
        long j = authResult.mExpiryDateInMillis / 1000;
        if (!LLLLZIL(authResult).booleanValue()) {
            str2 = authResult.mToken;
        }
        if (LLLLZIL(authResult).booleanValue()) {
            str = authResult.mToken;
        } else {
            str = authResult.mTokenSecret;
        }
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(authResult.mUid)) {
            map.put("uid", Uri.encode(authResult.mUid));
        }
        if (!TextUtils.isEmpty(str)) {
            map.put("access_token_secret", Uri.encode(str));
        }
        if (!TextUtils.isEmpty(C19315710hX.LJ(authResult))) {
            map.put("profile_key", Uri.encode(C19315710hX.LJ(authResult)));
        }
        if (this.LLJILLL) {
            Intent intent = new Intent();
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra("access_token", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("access_token_secret", str);
            }
            if (!TextUtils.isEmpty(string)) {
                intent.putExtra("code", string);
            }
            if (j > 0) {
                intent.putExtra("expires_in", j);
            }
            if (!TextUtils.isEmpty(strLIZIZ)) {
                intent.putExtra("platform_id", strLIZIZ);
            }
            LLLLZLL(-1, intent);
        } else {
            this.LLJJI = z;
            if (this.LLIZLLLIL && C0XQ5.LJ().isEnableMultiAccountLogin()) {
                map.put("multi_login", Uri.encode("1"));
            }
            String str3 = authResult.mUid;
            if (TextUtils.isEmpty(str3)) {
                C0XZV c0xzv = new C0XZV(false, 1);
                c0xzv.LIZLLL = 10000;
                c0xzv.LJFF = C0XPY.LIZIZ.getString(2131836832);
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("description", C0XPY.LIZIZ.getString(2131836832));
                    jSONObject2.put("error_code", 10000);
                    jSONObject = new JSONObject();
                    jSONObject.put("data", jSONObject2);
                    jSONObject.put("message", "error");
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    jSONObject = new JSONObject();
                }
                c0xzv.LJII = jSONObject;
                LJJLJLI(c0xzv.LIZLLL, c0xzv.LJFF, null, c0xzv);
                return;
            }
            map.put("ttp_platform_uid", C2093608Ic.LIZIZ(str3));
            String str4 = authResult.mNonce;
            if (str4 != null) {
                map.put("nonce", str4);
            }
            if (TextUtils.equals("google_onetap", authResult.mProviderId)) {
                map.put("platform_sdk", "onetap_auth");
            } else if (TextUtils.equals("google", authResult.mProviderId)) {
                map.put("platform_sdk", "google_auth");
            }
            if (z) {
                if (!TextUtils.isEmpty(string)) {
                    this.LLILZLL.LIZ(strLIZIZ, strLIZJ, string, j, map, new C851240XaM(this));
                } else {
                    this.LLILZLL.LIZJ(strLIZIZ, strLIZJ, str2, j, map, new C851240XaM(this));
                }
            } else {
                C0XZ4.LIZ.getClass();
                Map mapLJIIL = C0XZ4.LJIIL();
                HashMap map2 = (HashMap) mapLJIIL;
                if (map2.size() > 0) {
                    map.putAll(mapLJIIL);
                } else {
                    C19254610Um.LIZIZ.LJIIJJI().LIZJ();
                    if (C10RP.LIZ("3p_sign_up")) {
                        map2.put("birthday", C10RP.LIZLLL());
                        map.putAll(mapLJIIL);
                    }
                }
                if (!TextUtils.isEmpty(string)) {
                    this.LLILZLL.LIZIZ(strLIZIZ, strLIZJ, string, j, map, new C851240XaM(this));
                } else {
                    this.LLILZLL.LIZLLL(strLIZIZ, strLIZJ, str2, j, map, new C851240XaM(this));
                }
            }
        }
        C786410Ut5.LJJZZIII(this.LLJJIJIIJIL, new ARunnableS131S0100000_31(this, 9));
    }

    @Override // X.InterfaceC19303910fd
    public final void LJJJLZIJ(int i, AuthResult authResult, String str) {
        if (isFinishing()) {
            PopupManager.LIZJ(C1912380zrg.class);
            return;
        }
        if (i == -1) {
            C852170Xbr c852170Xbr = C852170Xbr.LIZ;
            String strLIZJ = C19315710hX.LIZJ(authResult);
            c852170Xbr.getClass();
            C852170Xbr.LJIIIIZZ(true, 56004, strLIZJ, this, null);
        } else if (i == 0) {
            C852170Xbr c852170Xbr2 = C852170Xbr.LIZ;
            String strLIZJ2 = C19315710hX.LIZJ(authResult);
            c852170Xbr2.getClass();
            C852170Xbr.LJIIIIZZ(true, -3005, strLIZJ2, this, null);
        }
        if (authResult != null && i == 1) {
            String strLIZIZ = ComplianceServiceProvider.LIZLLL().LIZIZ();
            if ((strLIZIZ == null || strLIZIZ.isEmpty()) && str != null && !str.isEmpty()) {
                ComplianceServiceProvider.LIZLLL().LJIILL(str);
            }
            LLLLZLLIL(authResult, false);
            return;
        }
        LLLLZLL(0, new Intent());
        finish();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle bundleLLLLLZL;
        C1AWO c1awo;
        if (C275580Ar6.LIZ() && (c1awo = this.LLILLL) != null && this.LLJJIJI) {
            this.LLJJIJI = false;
            c1awo.ID0(this, i, i2, intent);
        }
        if (i == 32972) {
            if (i2 != 0 && intent != null && (bundleLLLLLZL = LLLLLZL(intent)) != null && bundleLLLLLZL.containsKey("callback")) {
                try {
                    Uri uri = UriProtector.parse(bundleLLLLLZL.getString("callback"));
                    String scheme = uri.getScheme();
                    if (scheme != null && scheme.startsWith("snssdk")) {
                        if ("connect_switch".equals(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "error_name"))) {
                            Intent intent2 = new Intent();
                            intent2.putExtra("repeat_bind_error", true);
                            LLLLZLL(0, intent2);
                            return;
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            this.LLILZLL.LJFF(this.LLIZ, new C851250XaN(this));
        }
        super.onActivityResult(i, i2, intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0141  */
    @Override // X.InterfaceC851260XaO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLJLI(int r14, java.lang.String r15, java.lang.String r16, X.C0XZV r17) {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity.LJJLJLI(int, java.lang.String, java.lang.String, X.0XZV):void");
    }
}
