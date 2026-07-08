package com.ss.android.ugc.aweme.ecommerce.singpass;

import X.AbstractActivityC1743740vTg;
import X.C0PEM;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C1739490vMp;
import X.C1739500vMq;
import X.C1739550vMv;
import X.C1739560vMw;
import X.C1739580vMy;
import X.C23250099c;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC335920DEw;
import X.InterfaceC1504300pFU;
import X.InterfaceC1739510vMr;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.pipo.kyc.singpass.network.model.PersonInfo;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.ecommerce.singpass.Error;
import com.ss.android.ugc.aweme.ecommerce.singpass.SingPassResponse;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS268S0000000_26;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class TransparentSingPassHandleActivity extends AbstractActivityC1743740vTg {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGEgISsrHELIOSOS4gO2sYOy49OzUtOyo9PBYlJygDKTY/AS49LCkpCCwnITMlPTY=";
    public final C1739490vMp LLILZIL = new C1739490vMp(this, new C1739560vMw(new InterfaceC1504300pFU() { // from class: X.0pFM
        @Override // X.InterfaceC1504300pFU
        public final String LIZ(String str, String str2, C0X1V c0x1v) {
            JSONObject jSONObject;
            Set<String> setLJFF;
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1019103yf.LIZ(EnumC1014603xw.ERR10, th, null);
                jSONObject = null;
            }
            if (jSONObject == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            if (c0x1v != null && (setLJFF = c0x1v.LJFF()) != null) {
                for (String str3 : setLJFF) {
                    arrayList.add(new C080U(str3, c0x1v.LIZLLL(str3)));
                }
            }
            C08S4.LIZ.getClass();
            return C08S4.LIZLLL(str, jSONObject, null, arrayList);
        }
    }), new InterfaceC1739510vMr() { // from class: X.0vMo
        @Override // X.InterfaceC1739510vMr
        public final void LIZ(PersonInfo personInfo, C1739500vMq c1739500vMq) {
            Integer numValueOf;
            C1724870uzF.LIZ.getClass();
            Function1<? super SingPassResponse, Unit> function1 = C1724870uzF.LIZIZ;
            String str = null;
            if (c1739500vMq != null) {
                numValueOf = Integer.valueOf(c1739500vMq.LIZ);
                str = c1739500vMq.LIZIZ;
            } else {
                numValueOf = null;
            }
            function1.invoke(new SingPassResponse(personInfo, new Error(numValueOf, str)));
            this.LIZ.finish();
        }
    });

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.singpass.TransparentSingPassHandleActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.singpass.TransparentSingPassHandleActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.singpass.TransparentSingPassHandleActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.singpass.TransparentSingPassHandleActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.singpass.TransparentSingPassHandleActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
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

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        String stringExtra2;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.singpass.TransparentSingPassHandleActivity", "onCreate", true);
        activityConfiguration(AFwS268S0000000_26.get$arr$(301));
        super.onCreate(bundle);
        setContentView(R.layout.bq6);
        ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(this);
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(this, immersionBarLJIILJJIL);
        immersionBarLJIILJJIL.LJIIJ(false);
        immersionBarLJIILJJIL.LJIIL();
        tuxImmersionBar.LIZLLL();
        try {
            stringExtra = getIntent().getStringExtra("request_id");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        try {
            stringExtra2 = getIntent().getStringExtra("redirect_uri");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            stringExtra2 = null;
        }
        if (stringExtra != null && stringExtra2 != null) {
            C1739490vMp c1739490vMp = this.LLILZIL;
            c1739490vMp.getClass();
            if (stringExtra.length() != 0 && stringExtra2.length() != 0) {
                C1739550vMv.LJ = stringExtra2;
                C1739550vMv.LIZLLL = stringExtra;
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c1739490vMp.LIZ), C0PEM.LIZJ, null, new C1739580vMy(c1739490vMp, stringExtra, stringExtra2, null, null), 2);
            } else {
                c1739490vMp.LIZJ.LIZ(null, new C1739500vMq(101, "illegal params"));
            }
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.singpass.TransparentSingPassHandleActivity", "onCreate", false);
            return;
        }
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.singpass.TransparentSingPassHandleActivity", "onCreate", false);
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
}
