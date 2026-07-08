package com.ss.android.ugc.aweme.share.gif.ui;

import X.C0DLI;
import X.C0WZX;
import X.C1308910kAL;
import X.C1401850maF;
import X.C1697810uHb;
import X.C1701330uNH;
import X.C19252910Tv;
import X.C20684815ws;
import X.C2204961BRm;
import X.C2354709Kn;
import X.C299020Bno;
import X.C335910DEv;
import X.C580810MqF;
import X.C786410Ut5;
import X.EnumC335920DEw;
import Y.ACListenerS155S0100000_21;
import Y.AObjectS122S0000000_21;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes22.dex */
public class VideoShare2GifEditActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkKD02ZiIlHELIOSL2EmIWsaICs2JxYkKD02egIlLwo3ITENKjs6Piw4MA==";
    public boolean LL = true;
    public VideoShare2GifEditContext LLILLJJLI;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() == 1) {
            recreate();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity", "onCreate", true);
        activityConfiguration(new AObjectS122S0000000_21(3));
        super.onCreate(bundle);
        setContentView(R.layout.kr);
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(this, ImmersionBar.LJIILJJIL(this));
        tuxImmersionBar.LJIIIIZZ(R.attr.bx);
        tuxImmersionBar.LIZLLL();
        C0DLI.LIZIZ(findViewById(R.id.w0u));
        View viewFindViewById = findViewById(R.id.bmy);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 114), viewFindViewById);
        }
        VideoShare2GifEditContext videoShare2GifEditContext = (VideoShare2GifEditContext) getIntent().getParcelableExtra("extra_data");
        this.LLILLJJLI = videoShare2GifEditContext;
        if (videoShare2GifEditContext == null || !C2354709Kn.LIZIZ(videoShare2GifEditContext.videoPath)) {
            finish();
        }
        C786410Ut5.I7(new C1401850maF(this, 28), findViewById(R.id.p8k));
        if (getSupportFragmentManager().LJJJJZ(R.id.i4n) == null) {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService(this, "Share2Gif", new C580810MqF(this, 5));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity", "onCreate", false);
    }

    public void resolveUiClickEvent(View view) {
        if (view.getId() == R.id.bmy) {
            C20684815ws.LJIILLIIL("gif_quit_editing", new HashMap());
            finish();
        }
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            finish();
        }
    }

    public static void LLLLLZL(Context context, String str, String str2, String str3, String str4, String str5, boolean z) {
        Intent intent = new Intent(context, (Class<?>) VideoShare2GifEditActivity.class);
        VideoShare2GifEditContext videoShare2GifEditContext = new VideoShare2GifEditContext();
        videoShare2GifEditContext.awemeId = str;
        videoShare2GifEditContext.logPb = str5;
        videoShare2GifEditContext.enterFrom = str4;
        videoShare2GifEditContext.authorId = str2;
        videoShare2GifEditContext.videoPath = str3;
        videoShare2GifEditContext.isAddWatermark = z;
        intent.putExtra("extra_data", videoShare2GifEditContext);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgYo3LkjWY2tjrunB1MMto0A629VB3yR01zzE/mCOO1uHc4Q9QMg==", null));
    }
}
