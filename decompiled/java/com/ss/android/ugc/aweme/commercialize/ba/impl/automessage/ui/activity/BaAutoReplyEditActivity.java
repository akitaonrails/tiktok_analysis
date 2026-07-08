package com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity;

import X.AbstractActivityC483870IyH;
import X.C0I7D;
import X.C0J21;
import X.C0OM1;
import X.C0PEM;
import X.C0WZX;
import X.C1237450iJ5;
import X.C1308910kAL;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1697810uHb;
import X.C197039127h;
import X.C1DFH;
import X.C2107308Nj;
import X.C2204961BRm;
import X.C23250099c;
import X.C2344009Gk;
import X.C299020Bno;
import X.C335910DEv;
import X.C466090IPn;
import X.C475600Ikw;
import X.C475620Iky;
import X.C483800IyA;
import X.C786410Ut5;
import X.C985403tE;
import X.EnumC335920DEw;
import Y.ACListenerS142S0100000_7;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS95S0110000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class BaAutoReplyEditActivity extends AbstractActivityC483870IyH implements TextWatcher {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6MiBiKy59ISg8JWEyHELIOSPTEjJCogOyQrLGEmIWstKjs6Piw4MGERKQQ5PSABLTUgMAo3ITENKjs6Piw4MA==";
    public TuxNavBar LLILLJJLI;
    public C0I7D LLILLL;
    public C0I7D LLILZ;
    public C197039127h LLILZIL;
    public C197039127h LLILZLL;
    public FrameLayout LLIZ;
    public TuxTextView LLIZLLLIL;
    public LinearLayout LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public TuxTextView LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxTextView LLJILLL;
    public TuxTextView LLJJ;
    public View LLJJI;
    public View LLJJIII;
    public final IBaAutoMessageService LLJJIJI = BaAutoMessageServiceImpl.LJIJ();
    public C475600Ikw LLJJIJIIJIL = new C475600Ikw(0, 0, "", "");
    public KeyListener LLJJIJIL;
    public KeyListener LLJJJ;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity", "onStart", false);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final C197039127h LLLLZI() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d7a);
            this.LLILZLL = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final C197039127h LLLLZIL() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d84);
            this.LLILZIL = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final C0I7D LLLLZLL() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gq7);
            this.LLILLL = (C0I7D) callbackFindViewById;
        }
        return (C0I7D) callbackFindViewById;
    }

    public final C0I7D LLLLZLLIL() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gqe);
            this.LLILZ = (C0I7D) callbackFindViewById;
        }
        return (C0I7D) callbackFindViewById;
    }

    public final FrameLayout LLLLZLLLI() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.mf7);
            this.LLIZ = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final TuxTextView LLLZ() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.zss);
            this.LLJI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView LLLZIL() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.zxd);
            this.LLJILJILJ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView LLLZLZ() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_status);
            this.LLIZLLLIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
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

    public static void LLZ(BaAutoReplyEditActivity baAutoReplyEditActivity) {
        if (Intrinsics.LJFF(String.valueOf(C2204961BRm.LLLLJI(baAutoReplyEditActivity.LLLLZLL(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMumC2mTqQHYs/0JaA28T1tjxzAfk65zcPIZHBt6X92R9MMiPKhfQSLe7Us4iyZ2ZXapx0WfgT8w==", null))), baAutoReplyEditActivity.LLJJIJIIJIL.LIZJ) && Intrinsics.LJFF(String.valueOf(C2204961BRm.LLLLJI(baAutoReplyEditActivity.LLLLZLLIL(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMumC2mTqQHYs/0JaA28T1tjxzAfk65zcPIZHBt6X92R9MMiPKhfQSLe7Us4iyZ2ZXapx0WfgT8w==", null))), baAutoReplyEditActivity.LLJJIJIIJIL.LIZLLL)) {
            baAutoReplyEditActivity.finish();
            C0J21.LIZJ("automsg_keyword_content");
            return;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(baAutoReplyEditActivity);
        c1397580mTM.LJII = false;
        c1397580mTM.LJFF(2131830685);
        c1397580mTM.LIZ(2131830686);
        C985403tE.LIZ(c1397580mTM, new AwS95S0110000_7(false, baAutoReplyEditActivity, 9));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLLZZIL(X.InterfaceC1364105Vn<? super java.lang.Boolean> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C468870Ia5
            if (r0 == 0) goto L7a
            r4 = r9
            X.0Ia5 r4 = (X.C468870Ia5) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7a
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L6c
            if (r0 != r1) goto L80
            X.C155000ia.LIZIZ(r3)
        L22:
            java.util.List r3 = (java.util.List) r3
            r7 = 0
            if (r3 == 0) goto L63
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L6a
            java.util.Iterator r6 = r3.iterator()
        L31:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r5 = r6.next()
            X.0Ikw r5 = (X.C475600Ikw) r5
            long r3 = r5.LIZ
            X.0Ikw r0 = r8.LLJJIJIIJIL
            long r1 = r0.LIZ
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L31
            java.lang.String r4 = r5.LIZJ
            X.0I7D r3 = r8.LLLLZLL()
            X.0WZX r2 = new X.0WZX
            java.lang.String r1 = "dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMumC2mTqQHYs/0JaA28T1tjxzAfk65zcPIZHBt6X92R9MMiPKhfQSLe7Us4iyZ2ZXapx0WfgT8w=="
            r0 = 0
            r2.<init>(r1, r0)
            android.text.Editable r0 = X.C2204961BRm.LLLLJI(r3, r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 == 0) goto L31
        L63:
            r0 = r7 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L6a:
            r7 = 1
            goto L63
        L6c:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService r0 = r8.LLJJIJI
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LJI(r4)
            if (r3 != r2) goto L22
            return r2
        L7a:
            X.0Ia5 r4 = new X.0Ia5
            r4.<init>(r8, r9)
            goto L12
        L80:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity.LLLZZIL(X.05Vn):java.lang.Object");
    }

    public final void LLZLI(boolean z) {
        LLLLZI().setEnabled(z);
        LLLLZIL().setEnabled(z);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable == null) {
            return;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(this, C2107308Nj.LIZ, null, new C475620Iky(this, null), 2);
    }

    @Override // X.AbstractActivityC483870IyH, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity", "onCreate", true);
        super.onCreate(bundle);
        getWindow().setSoftInputMode(32);
        setContentView(R.layout.f5o);
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y1z);
            this.LLILLJJLI = (TuxNavBar) callbackFindViewById;
        }
        C0OM1 c0om1 = new C0OM1();
        C1237450iJ5.LIZIZ(c0om1, getString(2131836298), new AwS551S0100000_7(this, 127));
        ((TuxNavBar) callbackFindViewById).setNavActions(c0om1);
        this.LLJJIJIL = LLLLZLL().getKeyListener();
        this.LLJJJ = LLLLZLLIL().getKeyListener();
        LLLLZIL().setActivated(true);
        C786410Ut5.U8(LLLLZIL(), new ACListenerS142S0100000_7(this, 125));
        C786410Ut5.U8(LLLLZI(), new ACListenerS142S0100000_7(this, 126));
        LLLLZLL().addTextChangedListener(this);
        LLLLZLLIL().addTextChangedListener(this);
        long longExtra = getIntent().getLongExtra("mid", 0L);
        C23250099c.LIZLLL(this, null, null, new C466090IPn(longExtra, this, null), 3);
        try {
            stringExtra = getIntent().getStringExtra("enterFrom");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (longExtra == 0) {
            C483800IyA c483800IyA = C483800IyA.LL;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", stringExtra);
            c483800IyA.invoke("add_auto_reply_keyword", c2344009Gk.LIZ);
        } else {
            C0J21.LJI(stringExtra, 2, null, 12);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity", "onCreate", false);
    }

    public final void setDivider1FromXml(View view) {
        this.LLJJI = view;
    }

    public final void setDivider2FromXml(View view) {
        this.LLJJIII = view;
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
