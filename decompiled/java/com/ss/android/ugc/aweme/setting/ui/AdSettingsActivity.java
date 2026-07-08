package com.ss.android.ugc.aweme.setting.ui;

import X.C01GW;
import X.C0CLW;
import X.C0OM1;
import X.C0TMG;
import X.C11GO;
import X.C1237450iJ5;
import X.C127K;
import X.C1308910kAL;
import X.C1389890mGx;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1697810uHb;
import X.C20145813s8;
import X.C2188811AlT;
import X.C2344809Gs;
import X.C299020Bno;
import X.C316660CbA;
import X.C335910DEv;
import X.C346230Dhl;
import X.C452501pT;
import X.C785990UsP;
import X.C786260Usq;
import X.C786410Ut5;
import X.C838130WuJ;
import X.C985403tE;
import X.DialogC1389620mGW;
import X.EnumC335920DEw;
import X.InterfaceC2173371A3z;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commercialize.ICommercializeFromMainOutService;
import com.ss.android.ugc.aweme.commercialize.adsetting.AdAuthorizationDialog;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.pojo.AdFeSettings;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS32S1110000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes13.dex */
public final class AdSettingsActivity extends BaseActivity implements View.OnClickListener {
    public static Aweme LLJJIJIIJIL = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpHELIOSPTs6JiJiPCZ9CSEfLDsnISsrOg4wPCw6IDsq";
    public TuxNavBar LL;
    public TuxTextView LLILLJJLI;
    public LinearLayout LLILLL;
    public TuxTextView LLILZ;
    public C127K LLILZIL;
    public CheckBox LLILZLL;
    public LinearLayout LLIZ;
    public C127K LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxTextView LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public int LLJILJILJ = -1;
    public long LLJILLL;
    public long LLJJ;
    public final C0TMG LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final C127K LLLLLZL() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.a7o);
            this.LLIZLLLIL = (C127K) callbackFindViewById;
        }
        return (C127K) callbackFindViewById;
    }

    public final C127K LLLLZI() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.aaw);
            this.LLILZIL = (C127K) callbackFindViewById;
        }
        return (C127K) callbackFindViewById;
    }

    public final CheckBox LLLLZIL() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.djp);
            this.LLILZLL = (CheckBox) callbackFindViewById;
        }
        return (CheckBox) callbackFindViewById;
    }

    public final LinearLayout LLLLZLL() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.m_c);
            this.LLIZ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final LinearLayout LLLLZLLIL() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.m_d);
            this.LLILLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView LLLLZLLLI() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.znk);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void LLLZ() {
        ICommercializeFromMainOutService iCommercializeFromMainOutService;
        try {
            AdFeSettings adFeSettings = C0CLW.LIZIZ.LIZ.getAdFeSettings();
            if (adFeSettings == null) {
                return;
            }
            String legalPage = adFeSettings.getLegalPage();
            if (TextUtils.isEmpty(legalPage) || (iCommercializeFromMainOutService = (ICommercializeFromMainOutService) PluggableExtentionKt.pluggableSpi$default(ICommercializeFromMainOutService.class, false, false, false, 14, null)) == null) {
                return;
            }
            iCommercializeFromMainOutService.openAdWebUrl(this, legalPage, getString(2131847746));
        } catch (C316660CbA e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public AdSettingsActivity() {
        C0TMG.LIZ.getClass();
        this.LLJJI = (C0TMG) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.LIZ).create(C0TMG.class);
        this.LLJJIII = C452501pT.LIZIZ(new AwS556S0100000_12(this, 593));
        this.LLJJIJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(205));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.g2);
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

    public final n LLLZIL(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                ((p) this.LLJJIJI.getValue()).getClass();
                return p.LIZJ(str).LJIILIIL();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return null;
            }
        }
        return null;
    }

    public final void LLLZZIL(boolean z) {
        Aweme awemeLLILZ;
        String str = this.LLJIJIL;
        if (str == null || (awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(str)) == null) {
            return;
        }
        AwemeCommerceStruct commerceVideoAuthInfo = awemeLLILZ.getCommerceVideoAuthInfo();
        if (commerceVideoAuthInfo == null) {
            commerceVideoAuthInfo = new AwemeCommerceStruct();
            awemeLLILZ.setCommerceVideoAuthInfo(commerceVideoAuthInfo);
        }
        commerceVideoAuthInfo.setAdvPromotable(z);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        if (id == R.id.zfh) {
            String str = this.LLJILJIL;
            if (str != null) {
                try {
                    C20145813s8.LIZ(str, str, this, CertProviderManagerKt.findCert("bpea-216", 1476399125));
                } catch (C838130WuJ e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2344809Gs.LJI(e);
                }
                C1389890mGx c1389890mGx = new C1389890mGx(this);
                c1389890mGx.LJIIJ(getResources().getString(2131829538));
                c1389890mGx.LJIIJJI();
                return;
            }
            return;
        }
        if (id == R.id.znk) {
            String string = getResources().getString(2131847273);
            InterfaceC2173371A3z interfaceC2173371A3z = new InterfaceC2173371A3z() { // from class: X.0TGN
                @Override // X.InterfaceC2173371A3z
                public final void LIZ() {
                }

                @Override // X.InterfaceC2173371A3z
                public final void LIZIZ(final long j, final long j2) {
                    final AdSettingsActivity adSettingsActivity = this.LIZ;
                    String str2 = adSettingsActivity.LLJIJIL;
                    if (str2 != null) {
                        adSettingsActivity.LLJJI.LJFF(str2, j, j2).enqueue(new InterfaceC594300NSq<String>() { // from class: X.0TGM
                            @Override // X.InterfaceC594300NSq
                            public final void onFailure(C0X9S<String> c0x9s, Throwable th) {
                                C1389890mGx c1389890mGx2 = new C1389890mGx(adSettingsActivity);
                                c1389890mGx2.LJIIJ("Request Failed");
                                c1389890mGx2.LJIIJJI();
                            }

                            @Override // X.InterfaceC594300NSq
                            public final void onResponse(C0X9S<String> c0x9s, C0X52<String> c0x52) {
                                String str3;
                                String strLJIL;
                                k kVarLJJIIZ;
                                k kVarLJJIIZ2;
                                if (c0x52 != null && c0x52.LIZJ() && (str3 = c0x52.LIZIZ) != null) {
                                    n nVarLLLZIL = adSettingsActivity.LLLZIL(str3);
                                    String strLJIL2 = null;
                                    if (nVarLLLZIL != null && (kVarLJJIIZ2 = nVarLLLZIL.LJJIIZ("status_msg")) != null) {
                                        strLJIL = kVarLJJIIZ2.LJIL();
                                    } else {
                                        strLJIL = null;
                                    }
                                    if (!TextUtils.isEmpty(strLJIL)) {
                                        C1389890mGx c1389890mGx2 = new C1389890mGx(adSettingsActivity);
                                        c1389890mGx2.LJIIJ(strLJIL);
                                        c1389890mGx2.LJIIJJI();
                                    }
                                    if (nVarLLLZIL != null && (kVarLJJIIZ = nVarLLLZIL.LJJIIZ("video_code")) != null) {
                                        strLJIL2 = kVarLJJIIZ.LJIL();
                                    }
                                    if (!TextUtils.isEmpty(strLJIL2)) {
                                        adSettingsActivity.LLZ(1, j, j2, strLJIL2);
                                    }
                                }
                            }
                        });
                    }
                }
            };
            AdAuthorizationDialog adAuthorizationDialog = new AdAuthorizationDialog();
            adAuthorizationDialog.LLILZLL = string;
            adAuthorizationDialog.LLIZ = interfaceC2173371A3z;
            adAuthorizationDialog.LLJ = 0L;
            adAuthorizationDialog.LLJI = 0L;
            adAuthorizationDialog.setCancelable(true);
            adAuthorizationDialog.show(getSupportFragmentManager(), "authorization_dialog");
            return;
        }
        if (id == R.id.zhp) {
            if (this.LLJILJILJ == 2) {
                String str2 = this.LLJIJIL;
                if (str2 != null) {
                    this.LLJJI.LJ(str2, false).enqueue(new C786260Usq(this, 10));
                    return;
                }
                return;
            }
            LLLZLZ(getResources().getString(2131830527), getResources().getString(R.string.gm7), getResources().getString(2131830528), new AwS556S0100000_12(this, 594), true);
            return;
        }
        if (id == R.id.zl7) {
            String string2 = getResources().getString(2131847273);
            InterfaceC2173371A3z interfaceC2173371A3z2 = new InterfaceC2173371A3z() { // from class: X.0TGO
                @Override // X.InterfaceC2173371A3z
                public final void LIZ() {
                    this.LIZ.LLLZ();
                }

                @Override // X.InterfaceC2173371A3z
                public final void LIZIZ(long j, long j2) {
                    AdSettingsActivity adSettingsActivity = this.LIZ;
                    String str3 = adSettingsActivity.LLJIJIL;
                    if (str3 != null) {
                        adSettingsActivity.LLJJI.LIZLLL(str3, j2).enqueue(new C786260Usq(adSettingsActivity, 9));
                    }
                }
            };
            long j = this.LLJILLL;
            long j2 = this.LLJJ;
            AdAuthorizationDialog adAuthorizationDialog2 = new AdAuthorizationDialog();
            adAuthorizationDialog2.LLILZLL = string2;
            adAuthorizationDialog2.LLIZ = interfaceC2173371A3z2;
            adAuthorizationDialog2.LLJ = j;
            adAuthorizationDialog2.LLJI = j2;
            adAuthorizationDialog2.setCancelable(true);
            adAuthorizationDialog2.show(getSupportFragmentManager(), "extend_authorization_period_dialog");
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(R.anim.fv, 0);
        setContentView(R.layout.i8);
        try {
            stringExtra = getIntent().getStringExtra(FollowStatusChangeMethod.PARAM_UID);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        this.LLJIJIL = stringExtra;
        C786410Ut5.J4((DialogC1389620mGW) this.LLJJIII.getValue());
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y08);
            this.LL = (TuxNavBar) callbackFindViewById;
        }
        C0OM1 c0om1 = new C0OM1();
        C1237450iJ5.LIZIZ(c0om1, getString(2131847745), new AwS556S0100000_12(this, 765));
        ((TuxNavBar) callbackFindViewById).setNavActions(c0om1);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String string = getString(2131847744);
        String strJ4 = C786410Ut5.j4(getString(2131847743), Arrays.copyOf(new Object[]{string}, 1));
        int iLJJJ = a0.LJJJ(strJ4, string, 0, false, 6);
        spannableStringBuilder.append((CharSequence) strJ4);
        C786410Ut5.q2(spannableStringBuilder, new C346230Dhl(this, 1), iLJJJ, string.length() + iLJJJ, 33);
        KeyEvent.Callback callbackFindViewById2 = this.LLILZ;
        if (callbackFindViewById2 == null) {
            callbackFindViewById2 = findViewById(R.id.ab2);
            this.LLILZ = (TuxTextView) callbackFindViewById2;
        }
        ((TextView) callbackFindViewById2).setMovementMethod(LinkMovementMethod.getInstance());
        KeyEvent.Callback callbackFindViewById3 = this.LLILZ;
        if (callbackFindViewById3 == null) {
            callbackFindViewById3 = findViewById(R.id.ab2);
            this.LLILZ = (TuxTextView) callbackFindViewById3;
        }
        ((TextView) callbackFindViewById3).setText(spannableStringBuilder);
        C11GO c11go = (C11GO) LLLLZI().getAccessory();
        c11go.LJIILL(new AwS556S0100000_12(this, 763));
        c11go.LJIILLIIL(new C785990UsP(this, 28));
        C11GO c11go2 = (C11GO) LLLLLZL().getAccessory();
        c11go2.LJIILL(new AwS556S0100000_12(this, 764));
        c11go2.LJIILLIIL(new CompoundButton.OnCheckedChangeListener() { // from class: X.0TJv
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                AwemeCommerceStruct commerceVideoAuthInfo;
                int i;
                Aweme aweme = AdSettingsActivity.LLJJIJIIJIL;
                if (aweme != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null) {
                    if (z) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    commerceVideoAuthInfo.setDarkPostStatus(i);
                }
            }
        });
        C786410Ut5.LLLLZLL(LLLLZLLLI(), 8);
        C786410Ut5.LJZL(8, LLLLZLLIL());
        C786410Ut5.I7(this, findViewById(R.id.znk));
        C786410Ut5.I7(this, findViewById(R.id.zfh));
        C786410Ut5.I7(this, findViewById(R.id.zhp));
        C786410Ut5.I7(this, findViewById(R.id.zl7));
        String str = this.LLJIJIL;
        if (str != null) {
            this.LLJJI.LIZIZ(str).enqueue(new C786260Usq(this, 7));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity", "onCreate", false);
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

    public final void LLZ(int i, long j, long j2, String str) {
        boolean z;
        String string;
        this.LLJILJIL = str;
        this.LLJILJILJ = i;
        this.LLJILLL = j;
        this.LLJJ = j2;
        C11GO c11go = (C11GO) LLLLZI().getAccessory();
        int i2 = 0;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        int i3 = 8;
        if (z) {
            TuxTextView tuxTextViewLLLLZLLLI = LLLLZLLLI();
            if (!c11go.LJIILIIL()) {
                i2 = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextViewLLLLZLLLI, i2);
            C786410Ut5.LJZL(8, LLLLZLLIL());
            return;
        }
        C786410Ut5.LLLLZLL(LLLLZLLLI(), 8);
        LinearLayout linearLayoutLLLLZLLIL = LLLLZLLIL();
        if (c11go.LJIILIIL()) {
            i3 = 0;
        }
        C786410Ut5.LJZL(i3, linearLayoutLLLLZLLIL);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    string = "";
                } else {
                    string = getResources().getString(2131828883);
                }
            } else {
                string = getResources().getString(2131828882);
            }
        } else {
            string = getResources().getString(2131828881);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getResources().getString(2131828884));
        sbLIZ.append(": ");
        sbLIZ.append(string);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        SpannableString spannableString = new SpannableString(strLIZIZ);
        int iLJJJ = a0.LJJJ(strLIZIZ, string, 0, false, 6);
        if (iLJJJ >= 0) {
            C786410Ut5.p2(spannableString, new StyleSpan(1), iLJJJ, string.length() + iLJJJ, 33);
        }
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.zdz);
            this.LLJ = (TuxTextView) callbackFindViewById;
        }
        ((TextView) callbackFindViewById).setText(spannableString);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm", Locale.getDefault());
        Date date = new Date(j * 1000);
        Date date2 = new Date(j2 * 1000);
        KeyEvent.Callback callbackFindViewById2 = this.LLJI;
        if (callbackFindViewById2 == null) {
            callbackFindViewById2 = findViewById(R.id.z_g);
            this.LLJI = (TuxTextView) callbackFindViewById2;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(getResources().getString(2131826812));
        sbLIZ2.append(":\n");
        sbLIZ2.append(simpleDateFormat.format(date));
        sbLIZ2.append(" - ");
        sbLIZ2.append(simpleDateFormat.format(date2));
        ((TextView) callbackFindViewById2).setText(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LLLZLZ(String str, String str2, String str3, Function0 function0, boolean z) {
        C1397580mTM c1397580mTM = new C1397580mTM(this);
        if (!TextUtils.isEmpty(str3)) {
            c1397580mTM.LJI(str3);
        }
        c1397580mTM.LIZIZ(str);
        C985403tE.LIZ(c1397580mTM, new AwS32S1110000_12(str2, function0, z, 0));
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
    }
}
