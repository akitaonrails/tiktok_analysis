package com.ss.android.ugc.aweme.share.gif.ui;

import X.C0DLI;
import X.C0TVI;
import X.C0VSJ;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C12ES;
import X.C1308910kAL;
import X.C1322200kVm;
import X.C1324840ka2;
import X.C1371710lnd;
import X.C1379070lzV;
import X.C14K9;
import X.C1697810uHb;
import X.C1701330uNH;
import X.C1848410yCV;
import X.C2204961BRm;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C299020Bno;
import X.C335910DEv;
import X.C341940Daq;
import X.C621180OYa;
import X.C663220Pzs;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC1369790lkX;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS155S0100000_21;
import Y.ACListenerS59S1200000_21;
import Y.AObjectS122S0000000_21;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import avg.f;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.zhiliaoapp.musically.R;
import mf.a;

/* JADX INFO: loaded from: classes22.dex */
public class VideoShare2GifPreviewActivity extends BaseActivity implements GenericLifecycleObserver {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkKD02ZiIlL2HELIOSEmIWsaICs2JxYkKD02egIlLx8hLTMlLDgSKzElPyYnMQ==";
    public RemoteImageView LL;
    public LinearLayout LLILLJJLI;
    public LinearLayout LLILLL;
    public LinearLayout LLILZ;
    public VideoShare2GifEditContext LLILZIL;
    public boolean LLILZLL;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() throws Throwable {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity", "onResume", true);
        super.onResume();
        if (this.LLILZLL) {
            C2204961BRm.k(this, -1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgYo3LkjWY2tjrunB1MMto0A629VB3yR01zyQplCGm0OL09BJNPd2p1w==", null));
            finish();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity", "onStart", false);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity", "onWindowFocusChanged", true);
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        InterfaceC1369790lkX interfaceC1369790lkXLIZ;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity", "onCreate", true);
        activityConfiguration(new AObjectS122S0000000_21(4));
        super.onCreate(bundle);
        setContentView(R.layout.kq);
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(this, ImmersionBar.LJIILJJIL(this));
        tuxImmersionBar.LJIIIIZZ(R.attr.bx);
        tuxImmersionBar.LIZLLL();
        C0DLI.LIZIZ(findViewById(R.id.w0u));
        this.LL = (RemoteImageView) findViewById(R.id.lid);
        this.LLILLJJLI = (LinearLayout) findViewById(R.id.nhp);
        this.LLILLL = (LinearLayout) findViewById(R.id.nhq);
        this.LLILZ = (LinearLayout) findViewById(R.id.ivn);
        View viewFindViewById = findViewById(R.id.z_x);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 115), viewFindViewById);
        }
        LinearLayout linearLayout = this.LLILZ;
        if (linearLayout != null && Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(linearLayout, new C0TVI() { // from class: X.0DKs
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), c20246014Ju.LIZ(7).LIZLLL);
                    return c20246014Ju;
                }
            });
        }
        VideoShare2GifEditContext videoShare2GifEditContext = (VideoShare2GifEditContext) getIntent().getParcelableExtra("extra_data");
        this.LLILZIL = videoShare2GifEditContext;
        if (videoShare2GifEditContext == null) {
            finish();
        }
        this.LL.setClipToOutline(true);
        this.LL.setOutlineProvider(new C663220Pzs(C341940Daq.LIZ(4.0d)));
        VideoShare2GifEditContext videoShare2GifEditContext2 = this.LLILZIL;
        if (videoShare2GifEditContext2 != null && !TextUtils.isEmpty(videoShare2GifEditContext2.gifImagePath)) {
            VideoShare2GifEditContext videoShare2GifEditContext3 = this.LLILZIL;
            if (videoShare2GifEditContext3.targetHeight > 0 && videoShare2GifEditContext3.targetWidth > 0) {
                ViewGroup.LayoutParams layoutParams = this.LL.getLayoutParams();
                VideoShare2GifEditContext videoShare2GifEditContext4 = this.LLILZIL;
                layoutParams.width = videoShare2GifEditContext4.targetWidth;
                layoutParams.height = videoShare2GifEditContext4.targetHeight;
                C786410Ut5.f7(this.LL, layoutParams);
                Uri uriFromFile = Uri.fromFile(new C0VSJ(this.LLILZIL.gifImagePath));
                C1322200kVm.LIZ().LIZJ(uriFromFile);
                RemoteImageView remoteImageView = this.LL;
                String string = uriFromFile.toString();
                VideoShare2GifEditContext videoShare2GifEditContext5 = this.LLILZIL;
                C1324840ka2.LIZIZ(remoteImageView, string, videoShare2GifEditContext5.targetWidth, videoShare2GifEditContext5.targetHeight, true);
            }
        }
        String[] strArrLJJIJIIJI = C621180OYa.LIZIZ.LJJIJIIJI();
        if (strArrLJJIJIIJI != null && strArrLJJIJIIJI.length > 0) {
            for (String str : strArrLJJIJIIJI) {
                if (!TextUtils.isEmpty(str) && (interfaceC1369790lkXLIZ = C1371710lnd.LIZ(this, str)) != null) {
                    String strLabel = interfaceC1369790lkXLIZ.label();
                    Drawable drawableLJJII = interfaceC1369790lkXLIZ.LJJII(this, false);
                    View.OnClickListener aCListenerS59S1200000_21 = new ACListenerS59S1200000_21(this, str, interfaceC1369790lkXLIZ, 1);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    int iLIZJ = (int) C12ES.LIZJ(10.0f, this);
                    layoutParams2.leftMargin = iLIZJ;
                    layoutParams2.setMarginStart(iLIZJ);
                    C1379070lzV c1379070lzV = new C1379070lzV(this) { // from class: X.0lzU
                        public static final /* synthetic */ int LLILZ = 0;
                    };
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1379070lzV);
                    c1379070lzV.setLayoutParams(layoutParams2);
                    if (C1848410yCV.LIZ) {
                        aCListenerS59S1200000_21 = new f(aCListenerS59S1200000_21);
                    }
                    a aVar = new a(aCListenerS59S1200000_21);
                    if (C2213981Bky.LIZIZ.isOffline()) {
                        C2211941Bhg.LIZ.injectViewListener(c1379070lzV);
                    }
                    c1379070lzV.setOnClickListener(aVar);
                    if (strLabel != null) {
                        c1379070lzV.setText(strLabel);
                    }
                    if (drawableLJJII != null) {
                        c1379070lzV.setIcon(drawableLJJII);
                    }
                    if (interfaceC1369790lkXLIZ.LJIIZILJ(this)) {
                        this.LLILLJJLI.addView(c1379070lzV);
                    }
                }
            }
        } else {
            LinearLayout linearLayout2 = this.LLILLL;
            if (linearLayout2 != null) {
                C786410Ut5.LJZL(8, linearLayout2);
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity", "onCreate", false);
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

    public static void LLLLLZL(VideoShare2GifPreviewActivity videoShare2GifPreviewActivity, Intent intent) {
        Intent intent2 = intent;
        Activity activity = videoShare2GifPreviewActivity;
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent2, "Context_startActivity_1");
        C1701330uNH.LIZ(intent2, activity);
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgYo3LkjWY2tjrunB1MMto0A629VB3yR01zyQplCGm0OL09BJNPd2p1w==", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "com/ss/android/ugc/aweme/share/gif/ui/VideoShare2GifPreviewActivity", "startActivity", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11098, "com/ss/android/ugc/aweme/share/gif/ui/VideoShare2GifPreviewActivity", "startActivity", null, objArr, activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
        }
        activity.startActivity(intent2);
        c0wst.LIZ(11098, "com/ss/android/ugc/aweme/share/gif/ui/VideoShare2GifPreviewActivity", "startActivity", null, objArr, activity, c0wzw, true);
    }
}
