package com.ss.android.ugc.aweme.social.creation.mediapicker;

import X.C01GW;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C1443030nef;
import X.C1697810uHb;
import X.C214873197f;
import X.C2288908xz;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC335920DEw;
import X.InterfaceC214877197j;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import com.ss.android.ugc.aweme.social.creation.mediapicker.SocialMediaPickerActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS239S0000000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class SocialMediaPickerActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYjKiYyJGsvOyoyPCwjHELIOSJ2E+LSElKD86Ky4pO2EAJyYlKCMeLSElKB86Ky4pOw4wPCw6IDsq";
    public final C01GW LL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS239S0000000_8.get$arr$(124), "story_param", EnterStoryParam.class);
    public final C01GW LLILLJJLI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS239S0000000_8.get$arr$(123), "enter_activity_time", Long.class);
    public final C01GW LLILLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS239S0000000_8.get$arr$(121), "click_entry_time", Long.class);
    public final C01GW LLILZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS239S0000000_8.get$arr$(122), "has_permission_before", Boolean.class);
    public float LLILZIL;
    public boolean LLILZLL;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.social.creation.mediapicker.SocialMediaPickerActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.social.creation.mediapicker.SocialMediaPickerActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.social.creation.mediapicker.SocialMediaPickerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.social.creation.mediapicker.SocialMediaPickerActivity", "onResume", true);
        super.onResume();
        C1443030nef.LJII().LIZJ = "story";
        C2288908xz.LIZIZ();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.social.creation.mediapicker.SocialMediaPickerActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        int i = C1389600mGU.LIZIZ(this) ? 0 : R.anim.ij;
        overridePendingTransition(0, i);
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
        int i;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.social.creation.mediapicker.SocialMediaPickerActivity", "onCreate", true);
        super.onCreate(bundle);
        setTheme(R.style.nq);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.z_, this);
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            getWindow().setStatusBarColor(iIntValue);
            getWindow().setNavigationBarColor(iIntValue);
        }
        setContentView(R.layout.f9q);
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (C1389600mGU.LIZIZ(this)) {
            i = 0;
        } else {
            i = R.anim.ii;
        }
        overridePendingTransition(i, 0);
        final Class<SocialCreationMediaPickerScene> cls = SocialCreationMediaPickerScene.class;
        C214873197f c214873197f = new C214873197f(this, SocialCreationMediaPickerScene.class);
        c214873197f.LJFF = R.id.i9u;
        c214873197f.LJIIIIZZ = "SocMediaPicker";
        c214873197f.LJI = false;
        c214873197f.LJII = new InterfaceC214877197j() { // from class: X.0M9v
            @Override // X.InterfaceC214877197j
            public final Scene LIZ(ClassLoader classLoader, String str, Bundle bundle2) {
                Bundle extras = null;
                if (!TextUtils.equals(cls.getName(), str)) {
                    return null;
                }
                try {
                    extras = this.getIntent().getExtras();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                EnterStoryParam enterStoryParam = (EnterStoryParam) this.LL.getValue();
                Long l = (Long) this.LLILLJJLI.getValue();
                return C563830M9l.LIZIZ(this, extras, enterStoryParam, null, (Long) this.LLILLL.getValue(), l, (Boolean) this.LLILZ.getValue(), null, 68);
            }
        };
        c214873197f.LIZ();
        final View viewFindViewById = findViewById(R.id.evm);
        viewFindViewById.setOnTouchListener(new View.OnTouchListener() { // from class: X.0M9w
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        boolean z = false;
                        if (action != 2) {
                            return false;
                        }
                        float rawY = motionEvent.getRawY() - this.LL.LLILZIL;
                        if (rawY <= 0.0f) {
                            return true;
                        }
                        C786410Ut5.ed(viewFindViewById, rawY);
                        SocialMediaPickerActivity socialMediaPickerActivity = this.LL;
                        if (rawY > C12ES.LIZJ(300.0f, socialMediaPickerActivity)) {
                            z = true;
                        }
                        socialMediaPickerActivity.LLILZLL = z;
                        if (rawY > C12ES.LIZJ(100.0f, this.LL)) {
                            SocialMediaPickerActivity socialMediaPickerActivity2 = this.LL;
                            socialMediaPickerActivity2.getWindow().addFlags(1024);
                            socialMediaPickerActivity2.getWindow().clearFlags(SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
                            return true;
                        }
                        SocialMediaPickerActivity socialMediaPickerActivity3 = this.LL;
                        socialMediaPickerActivity3.getWindow().addFlags(SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
                        socialMediaPickerActivity3.getWindow().clearFlags(1024);
                        return true;
                    }
                    SocialMediaPickerActivity socialMediaPickerActivity4 = this.LL;
                    if (socialMediaPickerActivity4.LLILZLL) {
                        socialMediaPickerActivity4.finish();
                    } else {
                        viewFindViewById.animate().translationY(0.0f).setDuration(300L).start();
                        SocialMediaPickerActivity socialMediaPickerActivity5 = this.LL;
                        socialMediaPickerActivity5.getWindow().addFlags(SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
                        socialMediaPickerActivity5.getWindow().clearFlags(1024);
                    }
                    viewFindViewById.performClick();
                    return true;
                }
                this.LL.LLILZIL = motionEvent.getRawY();
                return true;
            }
        });
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.social.creation.mediapicker.SocialMediaPickerActivity", "onCreate", false);
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
