package com.ss.android.ugc.aweme.preview;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0XGR;
import X.C0XPD;
import X.C0XQ7;
import X.C11NJ;
import X.C11S5;
import X.C120A;
import X.C1308910kAL;
import X.C1390410mHn;
import X.C1664680tQA;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C194331111d;
import X.C194335111h;
import X.C197092129i;
import X.C197094129k;
import X.C19774812Yo;
import X.C20684815ws;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C627150Oin;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC1483820oiS;
import X.InterfaceC1484830ok5;
import Y.AfS181S0100000_12;
import Y.AfS198S0100000_29;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.preview.api.WebPreviewVerifyApi;
import com.ss.android.ugc.aweme.preview.model.EditorPreviewAppResult;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class WebPreviewActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjHELIOSU+LDk6LTJiHioxGDcpPyY2PwQvPSYlITE1";
    public EditorPreviewAppResult LLJJIJIL;
    public final C01GW LL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(120));
    public final C11NJ LLILLJJLI = new C11NJ();
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 190));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 176));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 187));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 182));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 185));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 189));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 178));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 186));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 183));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 179));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 175));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 180));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 184));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 181));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS573S0100000_29(this, 188));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 174));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 177));
    public String LLJJJ = "";
    public final C1664680tQA<C194335111h> LLJJJIL = new C1664680tQA<>(new C194335111h(0));

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.preview.WebPreviewActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.preview.WebPreviewActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.preview.WebPreviewActivity", "onStart", true);
        super.onStart();
        LLLLLZL();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.preview.WebPreviewActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.preview.WebPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LLLLZI() {
        C786410Ut5.LJLLLLLL(0, (View) this.LLJILLL.getValue());
        C786410Ut5.LJLLLLLL(4, (View) this.LLJILJILJ.getValue());
        C786410Ut5.LJLLLLLL(4, LLLZZIL());
        C786410Ut5.LJLLLLLL(4, (View) this.LLJJ.getValue());
        C786410Ut5.LJLLLLLL(4, LLLLZLL());
    }

    public final C194331111d LLLLZLL() {
        return (C194331111d) this.LLJJIJIIJIL.getValue();
    }

    public final ImageView LLLLZLLIL() {
        return (ImageView) this.LLJ.getValue();
    }

    public final ImageView LLLLZLLLI() {
        return (ImageView) this.LLJILJIL.getValue();
    }

    public final InterfaceC1484830ok5 LLLZ() {
        return (InterfaceC1484830ok5) this.LL.getValue();
    }

    public final FrameLayout LLLZIL() {
        return (FrameLayout) this.LLILZLL.getValue();
    }

    public final FrameLayout LLLZLZ() {
        return (FrameLayout) this.LLIZ.getValue();
    }

    public final C120A LLLZZIL() {
        return (C120A) this.LLJI.getValue();
    }

    public final boolean LLZ() {
        Long l;
        Long l2;
        EditorPreviewAppResult editorPreviewAppResult = this.LLJJIJIL;
        long jLongValue = 0;
        long jLongValue2 = (editorPreviewAppResult == null || (l2 = editorPreviewAppResult.width) == null) ? 0L : l2.longValue();
        EditorPreviewAppResult editorPreviewAppResult2 = this.LLJJIJIL;
        if (editorPreviewAppResult2 != null && (l = editorPreviewAppResult2.height) != null) {
            jLongValue = l.longValue();
        }
        return jLongValue2 > jLongValue;
    }

    public final void LLLLLZL() {
        InterfaceC1484830ok5 interfaceC1484830ok5LLLZ = LLLZ();
        if (interfaceC1484830ok5LLLZ == null) {
            return;
        }
        interfaceC1484830ok5LLLZ.LIZJ(C197094129k.LIZIZ(LLLZIL()) ? (InterfaceC1483820oiS) this.LLILZ.getValue() : (InterfaceC1483820oiS) this.LLILLL.getValue());
    }

    public final void LLLLZIL() {
        C786410Ut5.LJLLLLLL(0, LLLZLZ());
        C786410Ut5.LJLLLLLL(4, LLLZIL());
        C786410Ut5.LJLLLLLL(0, LLLZZIL());
        C197094129k.LIZ((View) this.LLJIJIL.getValue());
        LLZLLLL();
        C786410Ut5.LJLLLLLL(0, (View) this.LLJJIJI.getValue());
        C786410Ut5.LJLLLLLL(0, (View) this.LLJJIII.getValue());
        if (LLZ()) {
            C786410Ut5.LJLLLLLL(0, LLLLZLL());
        }
        InterfaceC1483820oiS interfaceC1483820oiS = (InterfaceC1483820oiS) this.LLILLL.getValue();
        InterfaceC1484830ok5 interfaceC1484830ok5LLLZ = LLLZ();
        if (interfaceC1484830ok5LLLZ != null) {
            interfaceC1484830ok5LLLZ.LIZLLL(interfaceC1483820oiS);
        }
    }

    public final void LLZLLLL() {
        C786410Ut5.LJLLLLLL(0, LLLZZIL());
        C786410Ut5.LJLLLLLL(0, (View) this.LLJJI.getValue());
        C786410Ut5.LJLLLLLL(0, (View) this.LLJILJILJ.getValue());
        C786410Ut5.LJLLLLLL(0, (View) this.LLJJ.getValue());
        if (LLZ()) {
            C786410Ut5.LJLLLLLL(0, LLLLZLL());
        }
        C786410Ut5.LJLLLLLL(4, (View) this.LLJILLL.getValue());
        InterfaceC1484830ok5 interfaceC1484830ok5LLLZ = LLLZ();
        if (interfaceC1484830ok5LLLZ == null || !interfaceC1484830ok5LLLZ.getPlayState().isPaused()) {
            return;
        }
        if (C197094129k.LIZIZ(LLLZIL())) {
            C197094129k.LIZ(LLLLZLLLI());
            C786410Ut5.LJLLLLLL(0, LLLLZLLIL());
        } else {
            C786410Ut5.LJLLLLLL(0, LLLLZLLLI());
            C197094129k.LIZ(LLLLZLLIL());
        }
    }

    public final void LLZZ() {
        String stringExtra;
        try {
            stringExtra = getIntent().getStringExtra("draft_id");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.LLJJJ = stringExtra;
        WebPreviewVerifyApi.LIZ.getClass();
        WebPreviewVerifyApi value = C197092129i.LIZIZ.getValue();
        String str = this.LLJJJ;
        this.LLILLJJLI.LIZ(value.getVerifyResult(str != null ? str : "").LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS198S0100000_29(this, 7), new AfS181S0100000_12(this, 134)));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC1484830ok5 interfaceC1484830ok5LLLZ = LLLZ();
        if (interfaceC1484830ok5LLLZ != null && interfaceC1484830ok5LLLZ.getPlayState().isPlaying()) {
            interfaceC1484830ok5LLLZ.pause();
        }
        this.LLILLJJLI.dispose();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        InterfaceC1484830ok5 interfaceC1484830ok5LLLZ = LLLZ();
        if (interfaceC1484830ok5LLLZ != null && interfaceC1484830ok5LLLZ.getPlayState().isPlaying()) {
            interfaceC1484830ok5LLLZ.pause();
        }
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

    public final void LLZLI(String str) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("page_name", "web_preview");
        c0xgr.LIZLLL("action_type", str);
        c0xgr.LIZ(0, "has_video_lag_flag");
        C20684815ws.LJIILLIIL("mobile_preview_video_page", c0xgr.LIZ);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.preview.WebPreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.jv);
        C786410Ut5.LLLZZIL((C1390410mHn) this.LLIZLLLIL.getValue(), 0);
        ((C1390410mHn) this.LLIZLLLIL.getValue()).LIZJ();
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C0XPD.LIZIZ(this, "web_preview", "login", new C627150Oin().LIZ, new C19774812Yo(this, 0));
        } else {
            LLZZ();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.preview.WebPreviewActivity", "onCreate", false);
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
