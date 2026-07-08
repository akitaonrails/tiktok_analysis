package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.bnpl;

import X.AbstractActivityC1743740vTg;
import X.AnonymousClass0317;
import X.C01GW;
import X.C034S;
import X.C0FNV;
import X.C0PEM;
import X.C1120604Zw;
import X.C1308910kAL;
import X.C1397660mTU;
import X.C1507790pL7;
import X.C1697810uHb;
import X.C1738760vLe;
import X.C1AQS;
import X.C1DFH;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C23271099x;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C756020TlA;
import X.C948503nH;
import X.DialogInterfaceOnCancelListenerC1775850wJT;
import X.EnumC335920DEw;
import X.EnumC743970TGh;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.dependency.business.BusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.IBusinessDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.IPipoService;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class BnplMiddleActivity extends AbstractActivityC1743740vTg {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTHELIOSYpZyAgOGs8KDY+LSs4Zy09OCliCyEjJAglLSs/LQQvPSYlITE1";
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 360));
    public String LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public int LLJ;
    public long LLJI;
    public long LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public String LLJJIII;
    public String LLJJIJI;
    public String LLJJIJIIJIL;

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        boolean zLJI = MethodIDManager.LJI(202337);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.payment.bnpl.BnplMiddleActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.payment.bnpl.BnplMiddleActivity", "onResume", false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.payment.bnpl.BnplMiddleActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.payment.bnpl.BnplMiddleActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.payment.bnpl.BnplMiddleActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LLLLZLLLI() {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("bnpl_source_id", this.LLILZLL), new Pair("download_scene", "middlePage"));
        c1507790pL7.getClass();
        C1507790pL7.LJFF("rd_pipo_bnpl_df_download_start", mapLJIIJ);
        C0FNV.LIZJ((Dialog) this.LLILZIL.getValue());
        ((IPipoService) ServiceManager.get().getService(IPipoService.class)).LIZIZ(new AwS605S0100000_26(this, 197));
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

    public static Bundle LLLLZLLIL(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        AnonymousClass0317 anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin;
        boolean z;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.payment.bnpl.BnplMiddleActivity", "onCreate", true);
        super.onCreate(bundle);
        this.LLJIJIL = System.currentTimeMillis();
        Bundle bundleLLLLZLLIL = LLLLZLLIL(getIntent());
        String name = null;
        if (bundleLLLLZLLIL != null) {
            string = bundleLLLLZLLIL.getString("source");
        } else {
            string = null;
        }
        this.LLILZLL = string;
        Bundle bundleLLLLZLLIL2 = LLLLZLLIL(getIntent());
        if (bundleLLLLZLLIL2 != null) {
            string2 = bundleLLLLZLLIL2.getString("landing_info");
        } else {
            string2 = null;
        }
        this.LLIZ = string2;
        Bundle bundleLLLLZLLIL3 = LLLLZLLIL(getIntent());
        if (bundleLLLLZLLIL3 != null) {
            string3 = bundleLLLLZLLIL3.getString("extra_info");
        } else {
            string3 = null;
        }
        this.LLIZLLLIL = string3;
        Bundle bundleLLLLZLLIL4 = LLLLZLLIL(getIntent());
        if (bundleLLLLZLLIL4 != null) {
            string4 = bundleLLLLZLLIL4.getString("source_btm_token");
        } else {
            string4 = null;
        }
        this.LLJILJIL = string4;
        Bundle bundleLLLLZLLIL5 = LLLLZLLIL(getIntent());
        if (bundleLLLLZLLIL5 != null) {
            string5 = bundleLLLLZLLIL5.getString("track_id");
        } else {
            string5 = null;
        }
        this.LLJILJILJ = string5;
        Bundle bundleLLLLZLLIL6 = LLLLZLLIL(getIntent());
        if (bundleLLLLZLLIL6 != null) {
            string6 = bundleLLLLZLLIL6.getString("rendering_num");
        } else {
            string6 = null;
        }
        this.LLJILLL = string6;
        Bundle bundleLLLLZLLIL7 = LLLLZLLIL(getIntent());
        if (bundleLLLLZLLIL7 != null) {
            string7 = bundleLLLLZLLIL7.getString("target_page");
        } else {
            string7 = null;
        }
        this.LLJJ = string7;
        Bundle bundleLLLLZLLIL8 = LLLLZLLIL(getIntent());
        if (bundleLLLLZLLIL8 != null) {
            string8 = bundleLLLLZLLIL8.getString("bnpl_extra_info");
        } else {
            string8 = null;
        }
        this.LLJJI = string8;
        Bundle bundleLLLLZLLIL9 = LLLLZLLIL(getIntent());
        if (bundleLLLLZLLIL9 != null) {
            string9 = bundleLLLLZLLIL9.getString("tenure");
        } else {
            string9 = null;
        }
        this.LLJJIII = string9;
        Bundle bundleLLLLZLLIL10 = LLLLZLLIL(getIntent());
        if (bundleLLLLZLLIL10 != null) {
            string10 = bundleLLLLZLLIL10.getString("interest_fee_promotion");
        } else {
            string10 = null;
        }
        this.LLJJIJI = string10;
        Bundle bundleLLLLZLLIL11 = LLLLZLLIL(getIntent());
        if (bundleLLLLZLLIL11 != null) {
            string11 = bundleLLLLZLLIL11.getString("payment_promotion");
        } else {
            string11 = null;
        }
        this.LLJJIJIIJIL = string11;
        ((Dialog) this.LLILZIL.getValue()).setOnCancelListener(new DialogInterfaceOnCancelListenerC1775850wJT(this, 1));
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("bnpl_source_id", this.LLILZLL));
        c1507790pL7.getClass();
        C1507790pL7.LJFF("rd_pipo_enter_middle_page", mapLJIIJ);
        if (((IPipoService) ServiceManager.get().getService(IPipoService.class)).LJFF(EnumC743970TGh.BNPL)) {
            C948503nH.LJ(this, C23271099x.INSTANCE, new C1738760vLe(this, null));
        } else {
            this.LLJI = System.currentTimeMillis();
            LLLLZLLLI();
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = BusinessDependencyService.createIBusinessDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IBusinessDependencyService.class.getName();
            if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IBusinessDependencyService.class);
        }
        ((IBusinessDependencyService) anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin).dialogManagerOnDialogShow(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.payment.bnpl.BnplMiddleActivity", "onCreate", false);
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

    public final void LLLZ(String str, int i, Function1<? super C1397660mTU, Unit> function1, Function1<? super C1397660mTU, Unit> function12) {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("bnpl_source_id", this.LLILZLL), new Pair("object_id", str));
        c1507790pL7.getClass();
        C1507790pL7.LJFF("rd_pipo_middle_retry_show", mapLJIIJ);
        C1DFH c1dfh = C0PEM.LIZ;
        C948503nH.LJ(this, C2107308Nj.LIZ, new C756020TlA(this, i, str, function1, function12, null));
    }
}
