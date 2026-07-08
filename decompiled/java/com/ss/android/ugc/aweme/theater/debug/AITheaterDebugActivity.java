package com.ss.android.ugc.aweme.theater.debug;

import X.C0I7D;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C197039127h;
import X.C299020Bno;
import X.C335910DEv;
import X.C549720LhC;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC558620LvY;
import Y.ACListenerS143S0100000_8;
import android.os.Bundle;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes9.dex */
public final class AITheaterDebugActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEkLC4nLTHELIOSdiLSoxPSJiCAYHICAtPSohDCAuPCgSKzElPyYnMQ==";
    public TuxTextView LL;
    public C0I7D LLILLJJLI;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        this.LL = null;
        this.LLILLJJLI = null;
        super.onDestroy();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.theater.debug.AITheaterDebugActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.theater.debug.AITheaterDebugActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.theater.debug.AITheaterDebugActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLZL() {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.theater.debug.AITheaterDebugActivity.LLLLLZL():void");
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        String string;
        InterfaceC558620LvY interfaceC558620LvYLJIIIIZZ;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.theater.debug.AITheaterDebugActivity", "onResume", true);
        super.onResume();
        LLLLLZL();
        C0I7D c0i7d = this.LLILLJJLI;
        if (c0i7d != null) {
            IAITheaterFeatureService.LIZ.getClass();
            IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
            if (iAITheaterFeatureServiceLIZ == null || (interfaceC558620LvYLJIIIIZZ = iAITheaterFeatureServiceLIZ.LJIIIIZZ()) == null || (string = Integer.valueOf(interfaceC558620LvYLJIIIIZZ.LIZ()).toString()) == null) {
                string = "";
            }
            c0i7d.setText(string);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.theater.debug.AITheaterDebugActivity", "onResume", false);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.theater.debug.AITheaterDebugActivity", "onCreate", true);
        super.onCreate(bundle);
        getWindow().setSoftInputMode(16);
        setContentView(R.layout.nf);
        this.LL = (TuxTextView) findViewById(R.id.as4);
        C0I7D c0i7d = (C0I7D) findViewById(R.id.as5);
        c0i7d.setHint("Repeat count (<0 to disable, e.g. -1)");
        this.LLILLJJLI = c0i7d;
        C197039127h c197039127h = (C197039127h) findViewById(R.id.as2);
        c197039127h.setText("Clear cache (Keva + download)");
        C786410Ut5.U8(c197039127h, new ACListenerS143S0100000_8(this, 92));
        ((TextView) findViewById(R.id.as6)).setText("Repeat count (<0 to disable, e.g. -1)");
        C197039127h c197039127h2 = (C197039127h) findViewById(R.id.as3);
        c197039127h2.setText("Save stress test count");
        C786410Ut5.U8(c197039127h2, new ACListenerS143S0100000_8(this, 93));
        LLLLLZL();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.theater.debug.AITheaterDebugActivity", "onCreate", false);
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
