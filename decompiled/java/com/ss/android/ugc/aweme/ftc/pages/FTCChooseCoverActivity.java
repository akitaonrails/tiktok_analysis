package com.ss.android.ugc.aweme.ftc.pages;

import X.ActivityC214874197g;
import X.C0CHQ;
import X.C122T;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C1441830ncj;
import X.C1447200nlO;
import X.C1452730nuJ;
import X.C1697810uHb;
import X.C19565911gn;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC335920DEw;
import X.InterfaceC1447480nlq;
import X.InterfaceC1447490nlr;
import X.InterfaceC1452170ntP;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.SurfaceView;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class FTCChooseCoverActivity extends ActivityC214874197g implements InterfaceC1447490nlr, InterfaceC1447480nlq {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiM4KmHELIOSEjKSIpOmEVHAYPISA8OyAPJjk2OgQvPSYlITE1";
    public SurfaceView LL;
    public ImageView LLILLJJLI;
    public VideoPublishEditModel LLILLL;
    public C1441830ncj LLILZ;
    public final MutableLiveData<C1452730nuJ> LLILZIL = new MutableLiveData<>();
    public final MutableLiveData<Bitmap> LLILZLL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLIZ = new MutableLiveData<>();

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC1447490nlr
    public final VideoPublishEditModel LJI() {
        VideoPublishEditModel videoPublishEditModel = this.LLILLL;
        if (videoPublishEditModel == null) {
            return null;
        }
        return videoPublishEditModel;
    }

    @Override // X.InterfaceC1447490nlr
    public final InterfaceC1452170ntP LLFII() {
        C1441830ncj c1441830ncj = this.LLILZ;
        if (c1441830ncj == null) {
            c1441830ncj = null;
        }
        return c1441830ncj.LJIIIZ;
    }

    public final ImageView LLLLZLLIL() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.l71);
            this.LLILLJJLI = (ImageView) callbackFindViewById;
        }
        return (ImageView) callbackFindViewById;
    }

    public final SurfaceView LLLLZLLLI() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ron);
            this.LL = (SurfaceView) callbackFindViewById;
        }
        return (SurfaceView) callbackFindViewById;
    }

    static {
        C19565911gn.LIZ();
        C122T.LIZ();
        C122T.LIZIZ();
    }

    @Override // X.InterfaceC1447480nlq
    public final void LLLIIII() {
        FTCChooseCoverFragment fTCChooseCoverFragment;
        Fragment fragmentLJJJJZI = getSupportFragmentManager().LJJJJZI("cover");
        if ((fragmentLJJJJZI instanceof FTCChooseCoverFragment) && (fTCChooseCoverFragment = (FTCChooseCoverFragment) fragmentLJJJJZI) != null && fTCChooseCoverFragment.LLJJIJI) {
            InterfaceC1447490nlr interfaceC1447490nlr = fTCChooseCoverFragment.LLJILJIL;
            if (interfaceC1447490nlr == null) {
                interfaceC1447490nlr = null;
            }
            Bitmap currDisplayImage = interfaceC1447490nlr.LLFII().getCurrDisplayImage();
            if (currDisplayImage != null) {
                fTCChooseCoverFragment.LLJILJILJ = (fTCChooseCoverFragment.LLJILJIL != null ? r0 : null).LLFII().LLL();
                fTCChooseCoverFragment.PR().setVideoCoverFrameView(currDisplayImage);
                currDisplayImage.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(currDisplayImage);
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        int i;
        int i2;
        super.finish();
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (C1389600mGU.LIZIZ(this)) {
            i = 0;
            i2 = 0;
        } else {
            i = R.anim.a7;
            i2 = R.anim.a8;
        }
        overridePendingTransition(i, i2);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        FTCChooseCoverFragment fTCChooseCoverFragment;
        Fragment fragmentLJJJJZI = getSupportFragmentManager().LJJJJZI("cover");
        if (!(fragmentLJJJJZI instanceof FTCChooseCoverFragment) || (fTCChooseCoverFragment = (FTCChooseCoverFragment) fragmentLJJJJZI) == null) {
            return;
        }
        C0CHQ.LIZ().LIZ().LIZLLL(new AwS388S0200000_22(fTCChooseCoverFragment, new AwS601S0100000_22(this, 94), 253), !C1447200nlO.LIZ((fTCChooseCoverFragment.LLJILJIL != null ? r0 : null).LJI().getVideoCoverStartTm(), fTCChooseCoverFragment.LLJILJILJ / 1000.0f));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        LifecycleRegistry lifecycleRegistry;
        Lifecycle lifecycle = getLifecycle();
        if ((lifecycle instanceof LifecycleRegistry) && (lifecycleRegistry = (LifecycleRegistry) lifecycle) != null) {
            lifecycleRegistry.markState(Lifecycle.State.DESTROYED);
        }
        LLFII().cancelGetVideoFrames();
        C1441830ncj c1441830ncj = this.LLILZ;
        (c1441830ncj != null ? c1441830ncj : null).LIZJ();
        super.onDestroy();
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

    @Override // X.InterfaceC1447490nlr
    public final MutableLiveData<C1452730nuJ> LLIIII() {
        return this.LLILZIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x02b6  */
    @Override // X.ActivityC214874197g, X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r21) {
        /*
            Method dump skipped, instruction units count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverActivity.onCreate(android.os.Bundle):void");
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
