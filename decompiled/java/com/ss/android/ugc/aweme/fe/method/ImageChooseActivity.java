package com.ss.android.ugc.aweme.fe.method;

import X.C12ES;
import X.C1308910kAL;
import X.C14U0;
import X.C15O7;
import X.C1697810uHb;
import X.C20271714Tr;
import X.C20272214Tw;
import X.C20308614dI;
import X.C20684815ws;
import X.C2344009Gk;
import X.C299020Bno;
import X.C335910DEv;
import X.C345780Dh2;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.EnumC335920DEw;
import Y.ACListenerS164S0100000_30;
import Y.ACallableS426S0100000_21;
import android.os.Bundle;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.AwS630S0100000_16;

/* JADX INFO: loaded from: classes31.dex */
public final class ImageChooseActivity extends BaseActivity {
    public static C14U0 LLJILLL = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMpHELIOSZyI2PC0jLWEaJSQrLAw7Jyo/LA4wPCw6IDsq";
    public boolean LL;
    public DialogC1389620mGW LLILLJJLI;
    public RecyclerView LLILLL;
    public TextView LLILZ;
    public TextView LLILZIL;
    public C20271714Tr LLILZLL;
    public List<C20272214Tw> LLIZ;
    public int LLIZLLLIL = 1;
    public long LLJ = Long.MAX_VALUE;
    public final int LLJI = 4;
    public String LLJIJIL = "";
    public final AwS630S0100000_16 LLJILJIL = new AwS630S0100000_16(this, 13);
    public final AwS609S0100000_30 LLJILJILJ = new AwS609S0100000_30(this, 63);

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.ImageChooseActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.ImageChooseActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.ImageChooseActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.ImageChooseActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.ImageChooseActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLJIJIL);
        C20684815ws.LJIILLIIL("cancel_image_choose", c2344009Gk.LIZ);
        C14U0 c14u0 = LLJILLL;
        if (c14u0 != null) {
            c14u0.cancelMultiUpload();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C14U0 c14u0 = LLJILLL;
        if (c14u0 != null) {
            c14u0.releaseListener();
        }
        LLJILLL = null;
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.ImageChooseActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.bil);
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(this);
        dialogC1389620mGW.LJJLJ(2131835638);
        this.LLILLJJLI = dialogC1389620mGW;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.tvp);
        this.LLILLL = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new WrapGridLayoutManager(null, this.LLJI));
        }
        RecyclerView recyclerView2 = this.LLILLL;
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(new C345780Dh2(this.LLJI, (int) C12ES.LIZJ(1.0f, this), false));
        }
        this.LLILZIL = (TextView) findViewById(R.id.zz9);
        this.LLILZ = (TextView) findViewById(R.id.tv_sure);
        TextView textView = (TextView) findViewById(R.id.zbp);
        if (textView != null) {
            C786410Ut5.T7(textView, new ACListenerS164S0100000_30(this, 10));
        }
        TextView textView2 = this.LLILZ;
        if (textView2 != null) {
            C786410Ut5.T7(textView2, new ACListenerS164S0100000_30(this, 11));
        }
        if (getIntent().hasExtra("shouldWithCamera")) {
            getIntent().getBooleanExtra("shouldWithCamera", true);
        }
        if (getIntent().hasExtra("maxSelectNum")) {
            this.LLIZLLLIL = getIntent().getIntExtra("maxSelectNum", 9);
        }
        if (getIntent().hasExtra("maxFileSize")) {
            this.LLJ = getIntent().getLongExtra("maxFileSize", Long.MAX_VALUE);
        }
        if (getIntent().hasExtra("needBase64Response")) {
            this.LL = getIntent().getBooleanExtra("needBase64Response", false);
        }
        if (getIntent() != null && getIntent().hasExtra("enter_from")) {
            try {
                stringExtra = getIntent().getStringExtra("enter_from");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.LLJIJIL = stringExtra;
        }
        this.LLILZLL = new C20271714Tr(this, this.LLJI, this.LLIZLLLIL, this.LLJ, this.LL);
        DialogC1389620mGW dialogC1389620mGW2 = this.LLILLJJLI;
        if (dialogC1389620mGW2 != null) {
            C786410Ut5.J4(dialogC1389620mGW2);
        }
        C15O7.LIZJ(new ACallableS426S0100000_21(this, 1)).LJ(new C20308614dI(this, 0), C15O7.LJIIIIZZ, null);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fe.method.ImageChooseActivity", "onCreate", false);
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
