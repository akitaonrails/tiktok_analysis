package com.ss.android.ugc.aweme.challenge.ui;

import X.C01GW;
import X.C0OGM;
import X.C0QFS;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1254880ilC;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C1458960o4M;
import X.C1619690sFb;
import X.C1697810uHb;
import X.C18JG;
import X.C19EH;
import X.C2188811AlT;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C520650KbP;
import X.C818480W8w;
import X.EnumC335920DEw;
import X.InterfaceC1399350mWD;
import X.InterfaceC1581830rGX;
import X.InterfaceC1740760vOs;
import X.InterfaceC655270Pn3;
import X.InterfaceC744180THc;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ICommercePageTrackingService;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class ChallengeDetailActivity extends BaseActivity implements InterfaceC655270Pn3, InterfaceC1581830rGX, InterfaceC744180THc, InterfaceC1740760vOs, C0QFS, C0OGM {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYkKCM/LSHELIOSsrLGEmIWsPIS4/JCAiLioXLTEtICMSKzElPyYnMQ==";
    public final C01GW LL = RouteArgExtension.INSTANCE.navArg(this);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 101));
    public String LLILLL = "";
    public final ArrayList<InterfaceC1399350mWD> LLILZ = new ArrayList<>();
    public boolean LLILZIL = true;

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b3953";
    }

    @Override // X.InterfaceC1581830rGX
    public final String getPageName() {
        return "challenge";
    }

    @Override // X.C0OGM
    public final int getPageType() {
        return 3;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        boolean zLJI = MethodIDManager.LJI(202314);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onStart", false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    public final ChallengeDetailParam LLLLLZL() {
        return (ChallengeDetailParam) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC744180THc
    public final Analysis getAnalysis() {
        long j;
        long j2 = 0;
        try {
            j = CastLongProtector.parseLong(LLLLLZL().getCid());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            j = 0;
        }
        try {
            j2 = CastLongProtector.parseLong(LLLLLZL().getAwemeId());
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("process_id", LLLLLZL().getProcessId());
            jSONObject.put("challenge_id", this.LLILLL);
            jSONObject.put("page_model", "detail");
        } catch (JSONException e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        Analysis analysis = new Analysis();
        analysis.setLabelName("challenge");
        analysis.setExt_value(j);
        analysis.setValue(j2);
        analysis.setExt_json(jSONObject);
        return analysis;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onResume", true);
        super.onResume();
        if (!this.LLILZIL) {
            C1254880ilC.LIZ.getClass();
            C1254880ilC.LIZ(this, true, 1);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        C1619690sFb.LIZ(this, null);
        C520650KbP.LIZ(this);
    }

    public final void init() throws Throwable {
        String stringExtra;
        if (TextUtils.isEmpty(LLLLLZL().getCid())) {
            finish();
            return;
        }
        ChallengeDetailParam challengeDetailParamLLLLLZL = LLLLLZL();
        String stringExtra2 = null;
        try {
            stringExtra = getIntent().getStringExtra("shoot_enter_from");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        challengeDetailParamLLLLLZL.setShootEnterFrom(stringExtra);
        LLLLLZL().setBundled(Integer.valueOf(getIntent().getIntExtra("is_bundled", 0)));
        ICommercePageTrackingService iCommercePageTrackingServiceLIZLLL = ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZLLL();
        try {
            stringExtra2 = getIntent().getStringExtra("aweme_id");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        iCommercePageTrackingServiceLIZLLL.LIZIZ(stringExtra2);
        if (Intrinsics.LJFF(LLLLLZL().getEnterFrom(), "collection_tag")) {
            C1458960o4M.LIZ = true;
        }
        String str = ChallengeDetailFragment._pnsPageId;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        ChallengeDetailParam challengeDetailParamLLLLLZL2 = LLLLLZL();
        C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
        Fragment fragmentLJJJJZI = supportFragmentManager.LJJJJZI("challenge_detail_fragment_tag");
        if (fragmentLJJJJZI == null) {
            fragmentLJJJJZI = new ChallengeDetailFragment();
            RouteArgExtension.INSTANCE.withNavArg(fragmentLJJJJZI, challengeDetailParamLLLLLZL2);
        }
        fragmentLJJJJZI.setUserVisibleHint(true);
        c19ehLJIIJ.LJIJ(R.id.eqx, fragmentLJJJJZI, "challenge_detail_fragment_tag");
        c19ehLJIIJ.LJIIIZ();
        if (fragmentLJJJJZI instanceof ChallengeDetailFragment) {
            ((ChallengeDetailFragment) fragmentLJJJJZI).LLLIIIIL = new AwS562S0100000_18(this, 90);
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

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        String stringExtra;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onCreate", true);
        C818480W8w.LIZ("challenge_detail");
        this.LLILZIL = getIntent().getBooleanExtra("enter_anim_enable", true);
        activityConfiguration(AFwS259S0000000_21.get$arr$(56));
        super.onCreate(bundle);
        setContentView(R.layout.d_r);
        findViewById(R.id.eqx).setFitsSystemWindows(false);
        init();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("a2270.");
        sbLIZ.append(getBtmPageCode());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        try {
            stringExtra = getIntent().getStringExtra("source_btm_token");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        C18JG.LJI(this, strLIZIZ, stringExtra);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onCreate", false);
    }

    @Override // X.InterfaceC655270Pn3
    public final void registerActivityOnKeyDownListener(InterfaceC1399350mWD interfaceC1399350mWD) {
        if (!this.LLILZ.contains(interfaceC1399350mWD)) {
            this.LLILZ.add(interfaceC1399350mWD);
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

    @Override // X.InterfaceC655270Pn3
    public final void unRegisterActivityOnKeyDownListener(InterfaceC1399350mWD interfaceC1399350mWD) {
        ArrayList<InterfaceC1399350mWD> arrayList = this.LLILZ;
        if (arrayList != null) {
            arrayList.remove(interfaceC1399350mWD);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19GS, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isDestroyed()) {
            return false;
        }
        Iterator<InterfaceC1399350mWD> it2 = this.LLILZ.iterator();
        while (it2.hasNext()) {
            if (it2.next().onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        Activity activity;
        Intent intent2;
        super.onActivityResult(i, i2, intent);
        if (i == 10086) {
            int iIntValue = -1;
            if (i2 == -1) {
                C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgYpPC2TyfV++OzJUbMPgE+7V11Qo7Fotc3Z2Y2vhd7W7Eaw==", null);
                C0WST c0wst = new C0WST();
                Object[] objArr = {-1, intent};
                C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
                C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/challenge/ui/ChallengeDetailActivity", "setResult", this, objArr, "void", c0wzw);
                if (c0wsuLIZIZ.LIZ) {
                    c0wst.LIZ(11071, "com/ss/android/ugc/aweme/challenge/ui/ChallengeDetailActivity", "setResult", null, objArr, this, c0wzw, false);
                } else {
                    Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                    if (objArr2 != null) {
                        Object obj = objArr2[0];
                        if (obj != null) {
                            activity = (Activity) obj;
                        } else {
                            activity = this;
                        }
                        Object obj2 = objArr2[1];
                        if (obj2 != null) {
                            iIntValue = ((Integer) obj2).intValue();
                        }
                        Object obj3 = c0wsuLIZIZ.LIZJ[2];
                        if (obj3 != null) {
                            intent2 = (Intent) obj3;
                        } else {
                            intent2 = intent;
                        }
                    } else {
                        activity = this;
                        intent2 = intent;
                    }
                    activity.setResult(iIntValue, intent2);
                    c0wst.LIZ(11071, "com/ss/android/ugc/aweme/challenge/ui/ChallengeDetailActivity", "setResult", null, objArr, activity, c0wzw, true);
                }
                finish();
                try {
                    C1389600mGU.LIZIZ(this);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                overridePendingTransition(0, 0);
            }
        }
    }
}
