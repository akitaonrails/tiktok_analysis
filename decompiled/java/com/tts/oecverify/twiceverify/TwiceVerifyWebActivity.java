package com.tts.oecverify.twiceverify;

import X.C12ES;
import X.C14AY;
import X.C14B8;
import X.C14BO;
import X.C1602160rnK;
import X.C19GS;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes31.dex */
public class TwiceVerifyWebActivity extends C19GS {
    public static final String _pnsPageId = "KyohZzsnO2sjLCwlLTclLzZ9PDIlKiolLTclHELIOSLzZ9HDIlKioFLTclLzYELScNKjs6Piw4MA==";
    public C14B8 LL;

    public TwiceVerifyWebActivity() {
        new C14BO() { // from class: X.14AZ
            @Override // X.C14BO
            public final void LIZIZ() {
                this.LIZ.getClass();
                throw null;
            }

            @Override // X.C14BO
            public final void LIZ(int i, String str) {
                this.LIZ.getClass();
                throw null;
            }
        };
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        View decorView = getWindow().getDecorView();
        setFinishOnTouchOutside(false);
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) decorView.getLayoutParams();
        layoutParams.gravity = 80;
        layoutParams.width = C12ES.LJIIJ(this);
        C14AY.LIZ().getClass();
        layoutParams.height = (int) C12ES.LIZJ(304.0f, this);
        getWindowManager().updateViewLayout(decorView, layoutParams);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        finish();
        C14AY.LIZ().getClass();
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.LL = null;
        C14AY.LIZ().getClass();
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
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

    public final void LLLLLZL(int i) {
        getWindow().getDecorView().setBackgroundColor(getResources().getColor(R.color.sg));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ERROR:");
        sbLIZ.append(i);
        C786410Ut5.re(Toast.makeText(this, C2188811AlT.LIZIZ(sbLIZ), 1));
        C14B8 c14b8 = this.LL;
        if (c14b8 != null) {
            int visibility = c14b8.getVisibility();
            c14b8.setVisibility(4);
            C1602160rnK.LIZIZ(visibility, 4, c14b8);
        }
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dtt);
        C14AY.LIZ().getClass();
        throw null;
    }
}
