package com.ss.android.ugc.aweme.live;

import X.AbstractActivityC484150Iyj;
import X.C0IJT;
import X.C0J3Y;
import X.C0WZX;
import X.C1308910kAL;
import X.C168R;
import X.C168Y;
import X.C1697810uHb;
import X.C1844940y6u;
import X.C19EH;
import X.C1AKN;
import X.C1AKO;
import X.C1AKR;
import X.C2204961BRm;
import X.C299020Bno;
import X.C335910DEv;
import X.C474500IjA;
import X.C474750IjZ;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC773130UUl;
import X.InterfaceC782610Umx;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes34.dex */
public class LiveBgBroadcastActivity extends AbstractActivityC484150Iyj {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklHELIOSPyp9BCw6LA00CjcjKCswKTY4CCwnITMlPTY=";
    public C1AKO LL;
    public C1AKR LLILLJJLI;
    public C1AKN LLILLL = new InterfaceC773130UUl() { // from class: X.1AKN
        @Override // X.InterfaceC773130UUl
        public final void LIZIZ(C779220UhU c779220UhU, IntentFilter intentFilter) {
        }

        @Override // X.InterfaceC773130UUl
        public final void LIZJ() {
        }

        @Override // X.InterfaceC773130UUl
        public final void LIZLLL(boolean z) {
        }

        @Override // X.InterfaceC773130UUl
        public final void LJ(C779220UhU c779220UhU) {
        }

        @Override // X.InterfaceC773130UUl
        public final void LIZ(Bundle bundle) {
            this.LIZ.LLILLJJLI = Live.getService().createLiveBroadcastEndFragment(bundle);
            C19EH c19ehLJIIJ = this.LIZ.getSupportFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.iiv, this.LIZ.LLILLJJLI.getFragment(), null);
            c19ehLJIIJ.LJIIL();
            this.LIZ.LL = null;
        }
    };

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        boolean zLJI = MethodIDManager.LJI(202088);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onStart", false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        C1AKO c1ako = this.LL;
        if (c1ako != null) {
            c1ako.finish();
        }
        super.finish();
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        C1AKO c1ako = this.LL;
        if (c1ako == null || !c1ako.onBackPressed()) {
            super.onBackPressed();
        }
    }

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Live.getService().setBroadcastActivity(null);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        ((Function1) dataChannelGlobal.gg0(C168Y.class)).invoke(0);
        List list = (List) dataChannelGlobal.gg0(C168R.class);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((InterfaceC782610Umx) it2.next()).LIZ(0);
            }
        }
        this.LLILLL = null;
        C474750IjZ.LIZ();
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

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        Bundle bundle2;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onCreate", true);
        super.onCreate(bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key")) != null) {
            C786410Ut5.LJJIIZI(bundle2, new Bundle(), "android:support:fragments");
        }
        C0J3Y.LIZ.getClass();
        C0J3Y.LJIJ();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        ((Function1) dataChannelGlobal.gg0(C168Y.class)).invoke(2);
        List list = (List) dataChannelGlobal.gg0(C168R.class);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((InterfaceC782610Umx) it2.next()).LIZ(1);
            }
        }
        setContentView(R.layout.daw);
        if (getWindow() != null) {
            getWindow().addFlags(128);
            getWindow().getDecorView().setBackgroundResource(0);
        }
        new Bundle();
        if (getIntent() != null) {
            try {
                extras = getIntent().getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extras = null;
            }
            int intExtra = getIntent().getIntExtra("broadcast_type", 0);
            if (intExtra == 2) {
                this.LL = Live.getService().createObsBroadcastFragment(this.LLILLL, extras);
            } else if (intExtra == 3) {
                this.LL = Live.getService().pk(this.LLILLL, extras);
            } else if (intExtra == 4) {
                this.LL = Live.getService().LJLZ(this.LLILLL, extras);
            } else if (intExtra == 6) {
                this.LL = Live.getService().LJLJLJ(this.LLILLL, extras);
            }
        }
        if (this.LL != null) {
            C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.iiv, this.LL.getFragment(), null);
            c19ehLJIIJ.LJIIIZ();
            Live.getService().setBroadcastActivity(this);
        } else {
            finish();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onCreate", false);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) throws Throwable {
        String stringExtra;
        Bundle extras;
        boolean z;
        super.onNewIntent(intent);
        if (intent != null) {
            C1844940y6u.LIZ(this, intent);
            if (intent.getComponent() != null) {
                String strLJJIJIL = C2204961BRm.LJJIJIL(intent.getComponent(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA8Dvnvqw+af2SqsteCXUC66haFQ97F6s=", null));
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_broadcast_activity_from");
                c474500IjALIZ.LJJII(strLJJIJIL, "from");
                c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
                if (this.LL == null) {
                    z = true;
                } else {
                    z = false;
                }
                c474500IjALIZ.LJJII(Boolean.valueOf(z), "fragment_is_null");
                c474500IjALIZ.LIZ();
            }
            try {
                stringExtra = intent.getStringExtra("request_page");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
            if ("live_end_page".equals(stringExtra)) {
                Live.getService().LLJILJILJ(stringExtra);
                vQ();
                try {
                    extras = intent.getExtras();
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    extras = null;
                }
                int intExtra = intent.getIntExtra("broadcast_type", 0);
                if (intExtra == 2) {
                    this.LL = Live.getService().createObsBroadcastFragment(this.LLILLL, extras);
                } else if (intExtra == 3) {
                    this.LL = Live.getService().pk(this.LLILLL, extras);
                } else if (intExtra == 4) {
                    this.LL = Live.getService().LJLZ(this.LLILLL, extras);
                } else if (intExtra == 6) {
                    this.LL = Live.getService().LJLJLJ(this.LLILLL, extras);
                }
                C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
                c19ehLJIIJ.LJIJ(R.id.iiv, this.LL.getFragment(), null);
                c19ehLJIIJ.LJIIIZ();
                Live.getService().setBroadcastActivity(this);
                Live.getService().preloadLiveStream(this, false, false);
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.clear();
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
