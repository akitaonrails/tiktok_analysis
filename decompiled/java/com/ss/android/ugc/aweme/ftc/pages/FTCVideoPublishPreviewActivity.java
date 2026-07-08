package com.ss.android.ugc.aweme.ftc.pages;

import X.ActivityC214874197g;
import X.C0CHQ;
import X.C11C5;
import X.C1291180jhk;
import X.C1308910kAL;
import X.C1428470nHB;
import X.C1428520nHG;
import X.C1441830ncj;
import X.C1447450nln;
import X.C14K9;
import X.C1602160rnK;
import X.C1660610tJb;
import X.C1697810uHb;
import X.C1848410yCV;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C299020Bno;
import X.C335910DEv;
import X.C338630DPh;
import X.C786410Ut5;
import X.EnumC335920DEw;
import Y.AAListenerS339S0100000_29;
import Y.ACListenerS163S0100000_29;
import Y.AUListenerS277S0100000_29;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder;
import com.zhiliaoapp.musically.R;
import joo.f;
import mf.a;

/* JADX INFO: loaded from: classes30.dex */
public final class FTCVideoPublishPreviewActivity extends ActivityC214874197g {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiM4KmEjKSIpHELIOSOmEVHAYaICs2JxU5KyM6Oy0cOyolISA7CCwnITMlPTY=";
    public ImageView LL;
    public View LLILLJJLI;
    public C1291180jhk LLILLL;
    public VideoPublishEditModel LLILZ;
    public C1441830ncj LLILZIL;

    public final void LLLLZLL() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.5f, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.11C3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C1291180jhk c1291180jhkLLLLZLLLI = this.LL.LLLLZLLLI();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1291180jhkLLLLZLLLI);
                c1291180jhkLLLLZLLLI.setAlpha(fFloatValue);
            }
        });
        valueAnimatorOfFloat.addListener(new AAListenerS339S0100000_29(this, 1));
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.start();
        LLLLZLLIL().bringToFront();
        C786410Ut5.V4(LLLLZLLIL(), 1.0f);
        C786410Ut5.LJZI(0, LLLLZLLIL());
        finishAfterTransition();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishPreviewActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishPreviewActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishPreviewActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishPreviewActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final ImageView LLLLZLLIL() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.l71);
            this.LL = (ImageView) callbackFindViewById;
        }
        return (ImageView) callbackFindViewById;
    }

    public final C1291180jhk LLLLZLLLI() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ron);
            this.LLILLL = (C1291180jhk) callbackFindViewById;
        }
        return (C1291180jhk) callbackFindViewById;
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        LLLLZLL();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        LifecycleRegistry lifecycleRegistry;
        Lifecycle lifecycle = getLifecycle();
        if ((lifecycle instanceof LifecycleRegistry) && (lifecycleRegistry = (LifecycleRegistry) lifecycle) != null) {
            lifecycleRegistry.markState(Lifecycle.State.DESTROYED);
        }
        C1441830ncj c1441830ncj = this.LLILZIL;
        (c1441830ncj != null ? c1441830ncj : null).LIZJ();
        super.onDestroy();
        f.LIZ.getClass();
        f.LIZ(this);
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

    @Override // X.ActivityC214874197g, X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        LifecycleRegistry lifecycleRegistry;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishPreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setContentView(R.layout.j0);
        f fVar = f.LIZ;
        Intent intent = getIntent();
        fVar.getClass();
        f.LIZJ(this, intent, bundle);
        C0CHQ.LIZ().LJJIZ();
        Bitmap bitmap = VideoCoverBitmapHolder.LL;
        if (bitmap != null) {
            LLLLZLLIL().setImageBitmap(bitmap);
        }
        C14K9.LJIJJLI(LLLLZLLIL(), "transition_view_v1");
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            viewFindViewById = findViewById(R.id.uk7);
            this.LLILLJJLI = viewFindViewById;
        }
        C14K9.LJIJJLI(viewFindViewById, "transition_view_v2");
        C1291180jhk c1291180jhkLLLLZLLLI = LLLLZLLLI();
        int visibility = c1291180jhkLLLLZLLLI.getVisibility();
        c1291180jhkLLLLZLLLI.setVisibility(4);
        C1602160rnK.LIZIZ(visibility, 4, c1291180jhkLLLLZLLLI);
        C1291180jhk c1291180jhkLLLLZLLLI2 = LLLLZLLLI();
        View.OnClickListener aCListenerS163S0100000_29 = new ACListenerS163S0100000_29(this, 243);
        if (C1848410yCV.LIZ) {
            aCListenerS163S0100000_29 = new avg.f(aCListenerS163S0100000_29);
        }
        a aVar = new a(aCListenerS163S0100000_29);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1291180jhkLLLLZLLLI2);
        }
        c1291180jhkLLLLZLLLI2.setOnClickListener(aVar);
        VideoPublishEditModel videoPublishEditModelLJIILLIIL = C1428470nHB.LJIILLIIL(getIntent());
        this.LLILZ = videoPublishEditModelLJIILLIIL;
        int videoEditorType = videoPublishEditModelLJIILLIIL.getVideoEditorType();
        VideoPublishEditModel videoPublishEditModel = this.LLILZ;
        VideoPublishEditModel videoPublishEditModel2 = null;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        int value = C1428520nHG.LJJZZIII(videoPublishEditModel).getValue();
        VideoPublishEditModel videoPublishEditModel3 = this.LLILZ;
        if (videoPublishEditModel3 == null) {
            videoPublishEditModel3 = null;
        }
        C1441830ncj c1441830ncj = new C1441830ncj(videoEditorType, value, C1428520nHG.LJJZZI(videoPublishEditModel3).getValue(), "FTCVideoPublishPreviewActivity", C338630DPh.LIZ());
        VideoPublishEditModel videoPublishEditModel4 = this.LLILZ;
        if (videoPublishEditModel4 == null) {
            videoPublishEditModel4 = null;
        }
        c1441830ncj.LJIJJ = videoPublishEditModel4.getNleData();
        this.LLILZIL = c1441830ncj;
        Lifecycle lifecycle = getLifecycle();
        if ((lifecycle instanceof LifecycleRegistry) && (lifecycleRegistry = (LifecycleRegistry) lifecycle) != null) {
            lifecycleRegistry.markState(Lifecycle.State.STARTED);
        }
        C1447450nln c1447450nln = C1447450nln.LIZ;
        C1291180jhk c1291180jhkLLLLZLLLI3 = LLLLZLLLI();
        C1441830ncj c1441830ncj2 = this.LLILZIL;
        if (c1441830ncj2 == null) {
            c1441830ncj2 = null;
        }
        VideoPublishEditModel videoPublishEditModel5 = this.LLILZ;
        if (videoPublishEditModel5 == null) {
            videoPublishEditModel5 = null;
        }
        c1447450nln.getClass();
        C1447450nln.LIZ(this, this, c1291180jhkLLLLZLLLI3, c1441830ncj2, videoPublishEditModel5, "kids_preview");
        C1660610tJb c1660610tJb = C1660610tJb.LIZ;
        C1291180jhk c1291180jhkLLLLZLLLI4 = LLLLZLLLI();
        VideoPublishEditModel videoPublishEditModel6 = this.LLILZ;
        if (videoPublishEditModel6 == null) {
            videoPublishEditModel6 = null;
        }
        int iIntValue = ((Number) C1447450nln.LIZIZ(videoPublishEditModel6).getFirst()).intValue();
        VideoPublishEditModel videoPublishEditModel7 = this.LLILZ;
        if (videoPublishEditModel7 == null) {
            videoPublishEditModel7 = null;
        }
        c1660610tJb.q2(iIntValue, ((Number) C1447450nln.LIZIZ(videoPublishEditModel7).getSecond()).intValue(), c1291180jhkLLLLZLLLI4);
        ImageView imageViewLLLLZLLIL = LLLLZLLIL();
        VideoPublishEditModel videoPublishEditModel8 = this.LLILZ;
        if (videoPublishEditModel8 == null) {
            videoPublishEditModel8 = null;
        }
        int iIntValue2 = ((Number) C1447450nln.LIZIZ(videoPublishEditModel8).getFirst()).intValue();
        VideoPublishEditModel videoPublishEditModel9 = this.LLILZ;
        if (videoPublishEditModel9 != null) {
            videoPublishEditModel2 = videoPublishEditModel9;
        }
        c1660610tJb.q2(iIntValue2, ((Number) C1447450nln.LIZIZ(videoPublishEditModel2).getSecond()).intValue(), imageViewLLLLZLLIL);
        AutoTransition autoTransition = new AutoTransition();
        getWindow().setSharedElementEnterTransition(autoTransition);
        getWindow().setSharedElementExitTransition(autoTransition);
        autoTransition.addListener((Transition.TransitionListener) new C11C5() { // from class: X.11C4
            public final ValueAnimator LIZ = ValueAnimator.ofFloat(0.0f, 1.0f);

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition) {
                this.LIZIZ.LLLLZLLLI().bringToFront();
                C1291180jhk c1291180jhkLLLLZLLLI5 = this.LIZIZ.LLLLZLLLI();
                int visibility2 = c1291180jhkLLLLZLLLI5.getVisibility();
                c1291180jhkLLLLZLLLI5.setVisibility(0);
                C1602160rnK.LIZIZ(visibility2, 0, c1291180jhkLLLLZLLLI5);
                this.LIZ.end();
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionStart(Transition transition) {
                this.LIZ.addUpdateListener(new AUListenerS277S0100000_29(this.LIZIZ, 37));
                this.LIZ.addListener(new AAListenerS339S0100000_29(this.LIZIZ, 14));
                this.LIZ.setDuration(300L);
                this.LIZ.start();
            }
        });
        getWindow().setReturnTransition(new AutoTransition());
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishPreviewActivity", "onCreate", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        f fVar = f.LIZ;
        getIntent();
        fVar.getClass();
        f.LJII(this, bundle);
    }

    public final void setSelectCoverSpaceFromXml(View view) {
        this.LLILLJJLI = view;
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
