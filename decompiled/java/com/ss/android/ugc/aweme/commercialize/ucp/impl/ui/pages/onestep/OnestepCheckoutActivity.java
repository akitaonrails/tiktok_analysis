package com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep;

import X.C01GW;
import X.C0DET;
import X.C1281204zq;
import X.C1390920mIc;
import X.C1524305xx;
import X.C2188811AlT;
import X.C332710D2n;
import X.C452501pT;
import X.C497820Jfg;
import X.C786410Ut5;
import X.EnumC12947054v;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class OnestepCheckoutActivity extends C0DET {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6MiBiPCwjZiwhHELIOSOSN9PSxiOS40LTZiJiE2OzEpOWEcJiA/PSojCy0pKiQ8PTENKjs6Piw4MA==";
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 88));
    public C1281204zq LLIZ;

    @Override // X.C0DET
    public final int LLLLZI() {
        return R.style.zj;
    }

    @Override // X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutActivity", "onResume", false);
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutActivity", "onStart", false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.C0DET, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        C1524305xx c1524305xx = C1524305xx.LIZ;
        C1281204zq c1281204zq = this.LLIZ;
        c1524305xx.getClass();
        C1524305xx.LJ(c1281204zq, this);
        this.LLIZ = null;
        super.onDestroy();
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

    @Override // X.C0DET, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Serializable serializableExtra;
        Bundle extras;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutActivity", "onCreate", true);
        super.onCreate(bundle);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("entry context -> ");
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            serializableExtra = intent.getSerializableExtra("ucp_entry_context", C332710D2n.class);
        } else {
            serializableExtra = intent.getSerializableExtra("ucp_entry_context");
            if (!(serializableExtra instanceof C332710D2n)) {
                serializableExtra = null;
            }
        }
        sbLIZ.append(serializableExtra);
        C2188811AlT.LIZIZ(sbLIZ);
        Intent intent2 = getIntent();
        if (intent2 != null) {
            try {
                extras = intent2.getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (extras == null) {
                extras = new Bundle();
            }
        } else {
            extras = new Bundle();
        }
        C1524305xx.LIZ.getClass();
        String strLIZJ = C1524305xx.LIZJ(extras);
        Intent intent3 = getIntent();
        if (intent3 != null) {
            intent3.putExtras(extras);
        }
        this.LLIZ = C1524305xx.LIZ(strLIZJ, (String) this.LLILZLL.getValue(), EnumC12947054v.ONE_STEP_ACTIVITY, this);
        FrameLayout frameLayout = new FrameLayout(this);
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        setContentView(frameLayout);
        if (bundle == null) {
            Bundle bundle2 = new Bundle(extras);
            OnestepCheckoutFragment onestepCheckoutFragment = new OnestepCheckoutFragment();
            Bundle bundle3 = new Bundle();
            C786410Ut5.LJJIIZI(bundle3, bundle2, "arg_entry_args");
            onestepCheckoutFragment.setArguments(bundle3);
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LJIIIIZZ(1);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJL = (int) (C497820Jfg.LIZ(this) * 0.8f);
            tuxSheet.LLJJIJI = onestepCheckoutFragment;
            tuxSheet.LLILLJJLI = onestepCheckoutFragment;
            tuxSheet.LLJLLL = true;
            tuxSheet.LLJLILLLLZIIL = false;
            tuxSheet.LLJLL = true;
            OnestepCheckoutSheetBehavior onestepCheckoutSheetBehavior = new OnestepCheckoutSheetBehavior();
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLLIIII = onestepCheckoutSheetBehavior;
            tuxSheet2.LLJJIJIL = null;
            tuxSheet2.LLJJJ = null;
            tuxSheet2.show(getSupportFragmentManager(), "UcpOnestepCheckoutFragment");
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutActivity", "onCreate", false);
    }
}
