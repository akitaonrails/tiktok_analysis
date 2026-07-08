package com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity;

import X.AbstractActivityC483870IyH;
import X.C0IPB;
import X.C0J21;
import X.C0OM1;
import X.C1237450iJ5;
import X.C1308910kAL;
import X.C1389890mGx;
import X.C13BV;
import X.C1697810uHb;
import X.C197039127h;
import X.C23250099c;
import X.C299020Bno;
import X.C335910DEv;
import X.C475600Ikw;
import X.C483650Ixv;
import X.C786410Ut5;
import X.EnumC335920DEw;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class BaAutoReplyListActivity extends AbstractActivityC483870IyH implements View.OnClickListener {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6MiBiKy59ISg8JWEyHELIOSPTEjJCogOyQrLGEmIWstKjs6Piw4MGERKQQ5PSABLTUgMAM6OzENKjs6Piw4MA==";
    public TuxNavBar LLILLJJLI;
    public RecyclerView LLILLL;
    public C197039127h LLILZ;
    public final C0IPB LLILZIL = new C0IPB();
    public List<C475600Ikw> LLILZLL = C13BV.INSTANCE;
    public final IBaAutoMessageService LLIZ = BaAutoMessageServiceImpl.LJIJ();

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyListActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyListActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final C197039127h LLLLLZL() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d6x);
            this.LLILZ = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyListActivity", "onResume", true);
        super.onResume();
        C23250099c.LIZLLL(this, null, null, new C483650Ixv(this, null), 3);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyListActivity", "onResume", false);
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

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.LLILZLL.size() >= 4) {
            C1389890mGx c1389890mGx = new C1389890mGx(this);
            c1389890mGx.LJIIIZ(2131837106);
            c1389890mGx.LJIIJJI();
        } else {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this, "//setting/ba/auto_reply");
            smartRouteBuildRoute.withParam("mid", 0);
            smartRouteBuildRoute.withParam("enterFrom", "business_message_setting_page");
            smartRouteBuildRoute.open();
        }
    }

    @Override // X.AbstractActivityC483870IyH, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyListActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.f5p);
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y1z);
            this.LLILLJJLI = (TuxNavBar) callbackFindViewById;
        }
        C0OM1 c0om1 = new C0OM1();
        C1237450iJ5.LIZIZ(c0om1, getString(2131836298), new AwS551S0100000_7(this, 128));
        ((TuxNavBar) callbackFindViewById).setNavActions(c0om1);
        KeyEvent.Callback callbackFindViewById2 = this.LLILLL;
        if (callbackFindViewById2 == null) {
            callbackFindViewById2 = findViewById(R.id.t0e);
            this.LLILLL = (RecyclerView) callbackFindViewById2;
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(1);
        ((RecyclerView) callbackFindViewById2).setLayoutManager(linearLayoutManager);
        KeyEvent.Callback callbackFindViewById3 = this.LLILLL;
        if (callbackFindViewById3 == null) {
            callbackFindViewById3 = findViewById(R.id.t0e);
            this.LLILLL = (RecyclerView) callbackFindViewById3;
        }
        ((RecyclerView) callbackFindViewById3).setAdapter(this.LLILZIL);
        this.LLILZIL.LL = this;
        C197039127h c197039127hLLLLLZL = LLLLLZL();
        C786410Ut5.U8(c197039127hLLLLLZL, this);
        C786410Ut5.LLLLLLJ(c197039127hLLLLLZL, 8);
        try {
            stringExtra = getIntent().getStringExtra("enter_from");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (stringExtra == null) {
            stringExtra = "";
        }
        C0J21.LJI(stringExtra, 2, null, 12);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyListActivity", "onCreate", false);
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
