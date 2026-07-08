package com.ss.android.ugc.aweme.aabplugin.core.base.view;

import X.AbstractC2457909k9;
import X.C0P4S;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1399860mX2;
import X.C1697810uHb;
import X.C1720106oR;
import X.C1766570w4V;
import X.C1896207bk;
import X.C1BLC;
import X.C1BLG;
import X.C1BLH;
import X.C1BLL;
import X.C1BLM;
import X.C1BLO;
import X.C1BLQ;
import X.C1BLX;
import X.C20338014i2;
import X.C20684815ws;
import X.C2097908Jt;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C299020Bno;
import X.C335910DEv;
import X.C785410UrT;
import X.C786410Ut5;
import X.C793770VBv;
import X.C794240VDq;
import X.C816490W1f;
import X.C985403tE;
import X.EnumC335920DEw;
import X.ProgressDialogC1399850mX1;
import android.content.DialogInterface;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS398S0200000_32;
import kotlin.jvm.internal.AwS400S0200000_34;
import kotlin.jvm.internal.AwS613S0100000_34;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class DFInstallBlankActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQtKz8/PSIlJ2EwHELIOSJzcpZy0yOyBiPyY2P2sIDwY9OzEtJSMRJCQiIg4wPCw6IDsq";
    public boolean LL;
    public boolean LLILLJJLI;
    public C1BLG LLILLL;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.LL) {
            LLLLLZL(this.LLILLL);
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        if (this.LL) {
            C1399860mX2.LIZIZ().LIZ();
        }
        super.onDestroy();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        try {
            C1389600mGU.LIZIZ(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        overridePendingTransition(0, 0);
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    public final void LLLLLZL(C1BLG c1blg) {
        C1BLC c1blc;
        if (this.LLILLJJLI) {
            return;
        }
        this.LLILLJJLI = true;
        if (c1blg != null && (c1blc = c1blg.LJFF) != null) {
            int i = c1blg.LJI;
            try {
                JSONObject jSONObjectLJFF = C1BLQ.LJFF(c1blc);
                jSONObjectLJFF.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i);
                C20684815ws.LJIJJ("df_cancel_progress_dialog", jSONObjectLJFF);
                int iLIZ = C1BLQ.LIZ(i);
                CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                C793770VBv.LJIIJJI("df_cancel_progress_dialog", iLIZ, jSONObjectLJFF);
                if (c1blc instanceof C1BLX) {
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("df_cancel_progress_dialog:");
                    sbLIZ.append(C786410Ut5.J3(jSONObjectLJFF));
                    C1720106oR.LJI("DynamicLanguageTask", C2188811AlT.LIZIZ(sbLIZ));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (c1blc.LJIIIZ == C1BLH.RUNNING && c1blc.LJI.LIZJ) {
                c1blc.LIZ(8, c1blc.LJIIIIZZ, null);
                c1blc.LJFF = true;
                c1blc.LJI.LIZ = false;
                c1blc.LJIIIIZZ = 0;
            } else {
                C1BLL.LJ().LIZ(c1blc);
            }
        }
        C1399860mX2.LIZIZ().LIZ();
        finish();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        C1BLC c1blc;
        AbstractC2457909k9 abstractC2457909k9LIZ;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity", "onCreate", true);
        super.onCreate(bundle);
        C1766570w4V c1766570w4V = C1766570w4V.LIZ;
        C1896207bk c1896207bk = new C1896207bk(this);
        c1766570w4V.getClass();
        C1766570w4V.LIZ(c1896207bk);
        if (getIntent().getBooleanExtra("is_guide_clean_dialog", false)) {
            C1BLC c1blc2 = C1BLL.LJ().LLILZLL;
            if (c1blc2 != null) {
                C1397580mTM c1397580mTM = new C1397580mTM(this);
                c1397580mTM.LJFF(2131840582);
                c1397580mTM.LIZ(2131840581);
                C985403tE.LIZ(c1397580mTM, new AwS400S0200000_34(this, c1blc2, 35));
                c1397580mTM.LIZLLL(new AwS613S0100000_34(this, 123));
                new C1397510mTF(c1397580mTM).LIZLLL();
            }
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity", "onCreate", false);
            return;
        }
        try {
            stringExtra = getIntent().getStringExtra("module_name");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        final C1BLG c1blgLJFF = C1BLL.LJ().LJFF(stringExtra);
        this.LLILLL = c1blgLJFF;
        boolean booleanExtra = getIntent().getBooleanExtra("is_hold_progress_dialog", false);
        this.LL = booleanExtra;
        if (booleanExtra) {
            C1399860mX2 c1399860mX2LIZIZ = C1399860mX2.LIZIZ();
            DialogInterface.OnCancelListener onCancelListener = new DialogInterface.OnCancelListener() { // from class: X.1BL6
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.LL.LLLLLZL(c1blgLJFF);
                }
            };
            c1399860mX2LIZIZ.getClass();
            String string = getString(2131835068);
            WeakReference weakReference = new WeakReference(this);
            c1399860mX2LIZIZ.LIZ = new ProgressDialogC1399850mX1(this);
            c1399860mX2LIZIZ.LIZ.setCancelable(true);
            c1399860mX2LIZIZ.LIZ.setCanceledOnTouchOutside(false);
            c1399860mX2LIZIZ.LIZ.setIndeterminate(false);
            c1399860mX2LIZIZ.LIZ.setMax(100);
            c1399860mX2LIZIZ.LIZ.setMessage(string);
            c1399860mX2LIZIZ.LIZ.setOnCancelListener(onCancelListener);
            c1399860mX2LIZIZ.LIZ.setOnDismissListener(new C0P4S(weakReference, 11));
            if (!isFinishing()) {
                ProgressDialogC1399850mX1 progressDialogC1399850mX1 = c1399860mX2LIZIZ.LIZ;
                progressDialogC1399850mX1.show();
                C785410UrT.LIZIZ(progressDialogC1399850mX1);
                PopupMonitorServiceImpl.LIZ.getClass();
                PopupMonitorServiceImpl.LJJJ(progressDialogC1399850mX1);
                C816490W1f.LIZ(progressDialogC1399850mX1);
            }
        }
        if (getIntent().getBooleanExtra("is_hold_permission_dialog", false)) {
            try {
                activityConfiguration(new AwS398S0200000_32(c1blgLJFF, this, 80));
                c1blc = c1blgLJFF.LJFF;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if (c1blc != null && (abstractC2457909k9LIZ = C20338014i2.LIZ(c1blc.LIZ)) != null) {
                if (!C1BLO.LIZJ.LJ(abstractC2457909k9LIZ, this)) {
                    finish();
                }
            } else {
                finish();
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity", "onCreate", false);
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

    public static void LLLLZI(C1BLC c1blc, boolean z) {
        C1BLM c1blm = new C1BLM(c1blc.LJIIJ, c1blc.LJIIJJI, c1blc.LIZIZ);
        if (z) {
            c1blm.LJIIIZ = C2097908Jt.LIZJ(new Pair("reject_clean_dialog", Boolean.TRUE));
        }
        C1BLL.LJ().LJFF(c1blc.LIZ).LIZLLL.LIZ(c1blm);
    }
}
