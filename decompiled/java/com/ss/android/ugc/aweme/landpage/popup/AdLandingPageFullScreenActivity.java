package com.ss.android.ugc.aweme.landpage.popup;

import X.C01GW;
import X.C04WF;
import X.C098200Yq;
import X.C0DQL;
import X.C1025720cna;
import X.C1026310coX;
import X.C1028090crP;
import X.C1030400cv8;
import X.C128Y;
import X.C1308910kAL;
import X.C14EU;
import X.C1533950q1J;
import X.C1546210qL5;
import X.C1697810uHb;
import X.C189200o6;
import X.C20485080t;
import X.C2188811AlT;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1030360cv4;
import X.EnumC1036160d4Q;
import X.EnumC1036640d5C;
import X.EnumC335920DEw;
import X.InterfaceC1034470d1h;
import X.InterfaceC1541990qEH;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AutofillModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class AdLandingPageFullScreenActivity extends BaseActivity implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiktJysjKSIpZz88HELIOSODA8Zw43BCQiLSY9LxUtLioVPSkgGiwhLSAiCCwnITMlPTY=";
    public final C01GW LL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(194));
    public C1026310coX LLILLJJLI;
    public EnumC1036160d4Q LLILLL;
    public int LLILZ;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        InterfaceC1034470d1h interfaceC1034470d1h;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.landpage.popup.AdLandingPageFullScreenActivity", "onResume", true);
        super.onResume();
        C128Y c128yLJJJJZI = getSupportFragmentManager().LJJJJZI("newStyleFullScreenAdLandingPage");
        if ((c128yLJJJJZI instanceof InterfaceC1034470d1h) && (interfaceC1034470d1h = (InterfaceC1034470d1h) c128yLJJJJZI) != null) {
            interfaceC1034470d1h.ge(EnumC1036640d5C.PAGE_SELECT);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.landpage.popup.AdLandingPageFullScreenActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.landpage.popup.AdLandingPageFullScreenActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.landpage.popup.AdLandingPageFullScreenActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.landpage.popup.AdLandingPageFullScreenActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() throws JSONException {
        View decorView;
        Rect rect = new Rect();
        Window window = getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.getWindowVisibleDisplayFrame(rect);
        }
        int i = rect.bottom;
        int i2 = this.LLILZ;
        if (i2 == 0) {
            this.LLILZ = i;
            return;
        }
        if (i2 == i) {
            return;
        }
        if (i2 - i > 100) {
            LLLLZIL(Math.abs(i - i2));
            this.LLILZ = i;
        } else if (i - i2 > 100) {
            LLLLZIL(-Math.abs(i - i2));
            this.LLILZ = i;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (C04WF.LIZ()) {
            return;
        }
        try {
            C786410Ut5.C3(getWindow().getDecorView().getViewTreeObserver(), this);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
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

    public static Bundle LLLLLZL(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final Boolean LLLLZI(String str) {
        Bundle bundleLLLLLZL = LLLLLZL(getIntent());
        if (bundleLLLLLZL == null || !bundleLLLLLZL.containsKey(str)) {
            return null;
        }
        String string = bundleLLLLLZL.getString(str);
        if (string == null) {
            string = String.valueOf(bundleLLLLLZL.getBoolean(str, false));
        }
        int iHashCode = string.hashCode();
        if (iHashCode != 48) {
            if (iHashCode != 49) {
                if (iHashCode != 3569038) {
                    if (iHashCode != 97196323 || !string.equals("false")) {
                        return null;
                    }
                } else if (!string.equals("true")) {
                    return null;
                }
            } else if (!string.equals("1")) {
                return null;
            }
            return Boolean.TRUE;
        }
        if (!string.equals(CardStruct.IStatusCode.DEFAULT)) {
            return null;
        }
        return Boolean.FALSE;
    }

    public final void LLLLZIL(int i) throws JSONException {
        boolean z;
        SparkFragment sparkFragment;
        InterfaceC1541990qEH kitView;
        if (i > 0) {
            z = true;
        } else {
            z = false;
            i = 0;
        }
        C1546210qL5.LIZ.getClass();
        int iLJIIL = C1546210qL5.LJIIL(i, this);
        Fragment fragmentLJJJJZI = getSupportFragmentManager().LJJJJZI("newStyleFullScreenAdLandingPage");
        if ((fragmentLJJJJZI instanceof SparkFragment) && (sparkFragment = (SparkFragment) fragmentLJJJJZI) != null && (kitView = sparkFragment.getKitView()) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("visible", z);
            jSONObject.put("height", iLJIIL);
            kitView.LIZ("keyboardStatusChange", jSONObject);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCloseEvent(C0DQL c0dql) {
        IAdLandingPagePopUpService iAdLandingPagePopUpService = (IAdLandingPagePopUpService) this.LL.getValue();
        if (iAdLandingPagePopUpService != null) {
            iAdLandingPagePopUpService.LJIJJLI(this, this.LLILLJJLI, this.LLILLL, EnumC1030360cv4.CLICK_BACK);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) throws JSONException {
        String string;
        C1026310coX c1026310coX;
        EnumC1036160d4Q enumC1036160d4Q;
        String string2;
        String string3;
        String string4;
        Object obj;
        boolean zBooleanValue;
        Object c098200Yq;
        Bundle bundleLLLLLZL;
        Object obj2;
        Set<String> setKeySet;
        Object obj3;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.landpage.popup.AdLandingPageFullScreenActivity", "onCreate", true);
        Bundle bundleLLLLLZL2 = LLLLLZL(getIntent());
        if (bundleLLLLLZL2 != null && (setKeySet = bundleLLLLLZL2.keySet()) != null) {
            for (String str : setKeySet) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onCreate intent extra: ");
                sbLIZ.append(str);
                sbLIZ.append('=');
                Bundle bundleLLLLLZL3 = LLLLLZL(getIntent());
                if (bundleLLLLLZL3 != null) {
                    try {
                        obj3 = bundleLLLLLZL3.get(str);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        obj3 = null;
                    } catch (OutOfMemoryError e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        obj3 = null;
                    }
                } else {
                    obj3 = null;
                }
                sbLIZ.append(obj3);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        Bundle bundleLLLLLZL4 = LLLLLZL(getIntent());
        if (bundleLLLLLZL4 != null) {
            string = bundleLLLLLZL4.getString("url");
        } else {
            string = null;
        }
        if (C1533950q1J.LJ(string)) {
            if (string != null) {
                Bundle bundleLLLLLZL5 = LLLLLZL(getIntent());
                Uri uri = UriProtector.parse(string);
                Bundle bundleLLLLLZL6 = LLLLLZL(getIntent());
                if (bundleLLLLLZL6 != null) {
                    string2 = bundleLLLLLZL6.getString("container_bg_color");
                } else {
                    string2 = null;
                }
                Boolean boolLLLLZI = LLLLZI("hide_nav_bar");
                Boolean boolLLLLZI2 = LLLLZI("trans_status_bar");
                Bundle bundleLLLLLZL7 = LLLLLZL(getIntent());
                if (bundleLLLLLZL7 == null || (string3 = bundleLLLLLZL7.getString("lp_refer")) == null) {
                    string3 = "iab_router";
                }
                Bundle bundleLLLLLZL8 = LLLLLZL(getIntent());
                if (bundleLLLLLZL8 != null) {
                    string4 = bundleLLLLLZL8.getString("is_instant_page");
                } else {
                    string4 = null;
                }
                boolean zLJFF = Intrinsics.LJFF(string4, "1");
                try {
                    JSONObject jSONObject = new JSONObject();
                    Bundle bundleLLLLLZL9 = LLLLLZL(getIntent());
                    if (bundleLLLLLZL9 != null) {
                        for (String str2 : bundleLLLLLZL9.keySet()) {
                            if (!TextUtils.equals(str2, "url")) {
                                try {
                                    try {
                                        obj2 = bundleLLLLLZL9.get(str2);
                                    } catch (Exception e3) {
                                        TryCatchGuardChecker.doCheck(e3);
                                        obj2 = null;
                                        jSONObject.put(str2, obj2);
                                    }
                                } catch (OutOfMemoryError e4) {
                                    TryCatchGuardChecker.doCheck(e4);
                                    obj2 = null;
                                    jSONObject.put(str2, obj2);
                                }
                                jSONObject.put(str2, obj2);
                            }
                        }
                    }
                    C189200o6.m2constructorimpl(jSONObject);
                    obj = jSONObject;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq2 = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq2);
                    obj = c098200Yq2;
                }
                C189200o6.m5exceptionOrNullimpl(obj);
                boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
                Object obj4 = obj;
                if (zM7isFailureimpl) {
                    obj4 = null;
                }
                JSONObject jSONObject2 = (JSONObject) obj4;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                try {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(string), "native_site_ad_info");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null && ((bundleLLLLLZL = LLLLLZL(getIntent())) == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = bundleLLLLLZL.getString("native_site_ad_info")) == null)) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                    }
                    C189200o6.m2constructorimpl(jSONObject2.put("pageData", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter));
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                }
                String strOptString = jSONObject2.optString("pageData");
                if (!TextUtils.isEmpty(strOptString)) {
                    try {
                        JSONObject jSONObject3 = new JSONObject(strOptString);
                        if (jSONObject3.has("creative_id")) {
                            jSONObject2.put("creativeId", jSONObject3.optString("creative_id"));
                        }
                        if (jSONObject3.has("ad_id")) {
                            jSONObject2.put("adId", jSONObject3.optString("ad_id"));
                        }
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        C189200o6.m2constructorimpl(new C098200Yq(th3));
                    }
                }
                uri.buildUpon().appendQueryParameter("initialData", C786410Ut5.J3(jSONObject2)).toString();
                Aweme aweme = new Aweme();
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("creative_id", jSONObject2.optLong("creativeId"));
                jSONObject4.put("group_id", jSONObject2.optLong("groupId"));
                jSONObject4.put("ad_id", jSONObject2.optLong("adId"));
                jSONObject4.put("log_extra", jSONObject2.optString("logExtra"));
                AwemeRawAd awemeRawAd = (AwemeRawAd) C20485080t.LIZ(C786410Ut5.J3(jSONObject4), AwemeRawAd.class);
                AutofillModel autofillModel = new AutofillModel();
                if (jSONObject2.has("enableAutofill")) {
                    zBooleanValue = jSONObject2.optBoolean("enableAutofill");
                } else if (bundleLLLLLZL5 != null && bundleLLLLLZL5.containsKey("track_params") && C1533950q1J.LJ(bundleLLLLLZL5.getString("track_params"))) {
                    try {
                        String string5 = bundleLLLLLZL5.getString("track_params");
                        if (string5 == null) {
                            string5 = "{}";
                        }
                        c098200Yq = Boolean.valueOf(new JSONObject(string5).optBoolean("enableAutofill"));
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th4) {
                        TryCatchGuardChecker.doCheck(th4);
                        c098200Yq = new C098200Yq(th4);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    Boolean bool = Boolean.FALSE;
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = bool;
                    }
                    zBooleanValue = ((Boolean) c098200Yq).booleanValue();
                } else {
                    zBooleanValue = false;
                }
                autofillModel.setEnable(zBooleanValue);
                awemeRawAd.setAutofillModel(autofillModel);
                if (zLJFF) {
                    awemeRawAd.setPreloadWeb(11);
                }
                aweme.setAwemeRawAd(awemeRawAd);
                this.LLILLJJLI = new C1026310coX(string, awemeRawAd, C1028090crP.LIZ(aweme, null, 0, string3, string2, boolLLLLZI, boolLLLLZI2, C786410Ut5.J3(jSONObject2)), true, new C1025720cna(-1.0f, null, null, -1, Boolean.FALSE, -1, -1, Boolean.FALSE), null);
                this.LLILLL = EnumC1036160d4Q.DEFAULT;
            }
        } else {
            Serializable serializableExtra = getIntent().getSerializableExtra("keyAdWebModel");
            if (serializableExtra instanceof C1026310coX) {
                c1026310coX = (C1026310coX) serializableExtra;
            } else {
                c1026310coX = null;
            }
            this.LLILLJJLI = c1026310coX;
            Serializable serializableExtra2 = getIntent().getSerializableExtra("keyFromScene");
            if (serializableExtra2 instanceof EnumC1036160d4Q) {
                enumC1036160d4Q = (EnumC1036160d4Q) serializableExtra2;
            } else {
                enumC1036160d4Q = null;
            }
            this.LLILLL = enumC1036160d4Q;
        }
        activityConfiguration(new AwS595S0100000_16(this, 98));
        super.onCreate(bundle);
        setContentView(R.layout.l5);
        IAdLandingPagePopUpService iAdLandingPagePopUpService = (IAdLandingPagePopUpService) this.LL.getValue();
        if (iAdLandingPagePopUpService != null) {
            iAdLandingPagePopUpService.LJIILLIIL(this, this.LLILLJJLI, this.LLILLL);
        }
        if (!C04WF.LIZ()) {
            C786410Ut5.x3(getWindow().getDecorView().getViewTreeObserver(), this);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.landpage.popup.AdLandingPageFullScreenActivity", "onCreate", false);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onRealCloseEvent(C1030400cv8 c1030400cv8) {
        InterfaceC1034470d1h interfaceC1034470d1h;
        if (c1030400cv8.LIZ == hashCode()) {
            C128Y c128yLJJJJZI = getSupportFragmentManager().LJJJJZI("newStyleFullScreenAdLandingPage");
            if ((c128yLJJJJZI instanceof InterfaceC1034470d1h) && (interfaceC1034470d1h = (InterfaceC1034470d1h) c128yLJJJJZI) != null) {
                interfaceC1034470d1h.LLLIL(null);
            }
            finish();
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19GS, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            IAdLandingPagePopUpService iAdLandingPagePopUpService = (IAdLandingPagePopUpService) this.LL.getValue();
            if (iAdLandingPagePopUpService != null) {
                iAdLandingPagePopUpService.LJIJJLI(this, this.LLILLJJLI, this.LLILLL, EnumC1030360cv4.SYSTEM_BACK);
                return true;
            }
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
