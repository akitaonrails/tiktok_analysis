package com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity;

import X.AbstractActivityC483870IyH;
import X.C0I7D;
import X.C0J21;
import X.C0OM1;
import X.C0WZX;
import X.C1237450iJ5;
import X.C1308910kAL;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1697810uHb;
import X.C197039127h;
import X.C2204961BRm;
import X.C23250099c;
import X.C299020Bno;
import X.C335910DEv;
import X.C475630Ikz;
import X.C484190Iyn;
import X.C484210Iyp;
import X.C786410Ut5;
import X.C985403tE;
import X.EnumC335920DEw;
import Y.ACListenerS142S0100000_7;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
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
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class BaWelcomeMessageEditActivity extends AbstractActivityC483870IyH implements TextWatcher {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6MiBiKy59ISg8JWEyPTHELIOSEjJCogOyQrLGEmIWstKjs6Piw4MGERKRIpJSw8JSABLDwgKSIpDCs6PAQvPSYlITE1";
    public TuxNavBar LLILLJJLI;
    public C0I7D LLILLL;
    public C197039127h LLILZ;
    public FrameLayout LLILZIL;
    public TuxTextView LLILZLL;
    public LinearLayout LLIZ;
    public TuxTextView LLIZLLLIL;
    public KeyListener LLJ;
    public C484210Iyp LLJI = new C484210Iyp(0, 0L, "", null);
    public final IBaAutoMessageService LLJIJIL = BaAutoMessageServiceImpl.LJIJ();

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaWelcomeMessageEditActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaWelcomeMessageEditActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaWelcomeMessageEditActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaWelcomeMessageEditActivity", "onStart", false);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaWelcomeMessageEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final C197039127h LLLLZI() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d84);
            this.LLILZ = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final C0I7D LLLLZIL() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gsx);
            this.LLILLL = (C0I7D) callbackFindViewById;
        }
        return (C0I7D) callbackFindViewById;
    }

    public final FrameLayout LLLLZLL() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.mf7);
            this.LLILZIL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final TuxTextView LLLLZLLIL() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_status);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void LLLZ() {
        int length = LLLLZIL().length();
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_string_count);
            this.LLIZLLLIL = (TuxTextView) callbackFindViewById;
        }
        ((TextView) callbackFindViewById).setTextColor(C475630Ikz.LIZIZ(length <= 250 ? R.attr.a1k : R.attr.zs, this));
        KeyEvent.Callback callbackFindViewById2 = this.LLIZLLLIL;
        if (callbackFindViewById2 == null) {
            callbackFindViewById2 = findViewById(R.id.tv_string_count);
            this.LLIZLLLIL = (TuxTextView) callbackFindViewById2;
        }
        ((TextView) callbackFindViewById2).setText(String.valueOf(length));
        if (Intrinsics.LJFF(a0.LJLIIIL(String.valueOf(C2204961BRm.LLLLJI(LLLLZIL(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMumC2mTqQHYs/0JaA28T1tjxzAfk65zcPIZHBt6X92R9MMjXanfgvJfvvQVzc5dNODB1t0EQU9NyP/t6R", null)))).toString(), "") || 1 > length || length >= 251) {
            LLLLZI().setEnabled(false);
            LLLLZI().setActivated(false);
            return;
        }
        if (!Intrinsics.LJFF(this.LLJI.LIZJ, String.valueOf(C2204961BRm.LLLLJI(LLLLZIL(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMumC2mTqQHYs/0JaA28T1tjxzAfk65zcPIZHBt6X92R9MMjXanfgvJfvvQVzc5dNODB1t0EQU9NyP/t6R", null))))) {
            LLLLZI().setEnabled(true);
            LLLLZI().setActivated(true);
            return;
        }
        int i = this.LLJI.LIZIZ;
        if (i != 0) {
            if (i == 1) {
                LLLLZI().setEnabled(true);
                LLLLZI().setActivated(true);
                return;
            } else if (i != 3 && i != 4) {
                return;
            }
        }
        LLLLZI().setEnabled(false);
        LLLLZI().setActivated(false);
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

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        LLLLZLLLI(this);
    }

    public static void LLLLZLLLI(BaWelcomeMessageEditActivity baWelcomeMessageEditActivity) {
        if (Intrinsics.LJFF(String.valueOf(C2204961BRm.LLLLJI(baWelcomeMessageEditActivity.LLLLZIL(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMumC2mTqQHYs/0JaA28T1tjxzAfk65zcPIZHBt6X92R9MMjXanfgvJfvvQVzc5dNODB1t0EQU9NyP/t6R", null))), baWelcomeMessageEditActivity.LLJI.LIZJ)) {
            baWelcomeMessageEditActivity.finish();
            C0J21.LIZJ("automsg_welcome_content");
            return;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(baWelcomeMessageEditActivity);
        c1397580mTM.LJII = false;
        c1397580mTM.LJFF(2131830685);
        c1397580mTM.LIZ(2131830686);
        C985403tE.LIZ(c1397580mTM, new AwS95S0110000_7(false, baWelcomeMessageEditActivity, 7));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable == null) {
            return;
        }
        LLLZ();
    }

    @Override // X.AbstractActivityC483870IyH, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaWelcomeMessageEditActivity", "onCreate", true);
        super.onCreate(bundle);
        getWindow().setSoftInputMode(32);
        setContentView(R.layout.f5r);
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y1z);
            this.LLILLJJLI = (TuxNavBar) callbackFindViewById;
        }
        C0OM1 c0om1 = new C0OM1();
        C1237450iJ5.LIZIZ(c0om1, getString(2131858446), new AwS551S0100000_7(this, 132));
        ((TuxNavBar) callbackFindViewById).setNavActions(c0om1);
        this.LLJ = LLLLZIL().getKeyListener();
        LLLLZIL().addTextChangedListener(this);
        LLLLZI().setActivated(true);
        C786410Ut5.U8(LLLLZI(), new ACListenerS142S0100000_7(this, 131));
        LLLLZI().isHorizontalScrollBarEnabled();
        try {
            stringExtra = getIntent().getStringExtra("enter_from");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (stringExtra == null) {
            stringExtra = "";
        }
        C0J21.LJI(stringExtra, 1, Integer.valueOf(getIntent().getIntExtra("msg_status", 0)), 8);
        C23250099c.LIZLLL(this, null, null, new C484190Iyn(this, null), 3);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaWelcomeMessageEditActivity", "onCreate", false);
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
