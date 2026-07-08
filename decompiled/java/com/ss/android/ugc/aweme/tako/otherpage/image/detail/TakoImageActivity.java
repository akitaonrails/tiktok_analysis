package com.ss.android.ugc.aweme.tako.otherpage.image.detail;

import X.C01GW;
import X.C07IE;
import X.C0DSB;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C19EG;
import X.C19EH;
import X.C19HU;
import X.C299020Bno;
import X.C335910DEv;
import X.C786410Ut5;
import X.EnumC335920DEw;
import Y.ARunnableS129S0100000_29;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.ChangeImageTransform;
import android.transition.ChangeTransform;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.Window;
import android.widget.ImageView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoImageFragment;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoImageTransitionFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class TakoImageActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9JzEkLD0jHELIOSKSIpZyY+KSIpZys2PCQlJWEHKS4jACIyLyANKjs6Piw4MA==";
    public final C01GW LL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS273S0000000_29.get$arr$(162), "image_url", String[].class);
    public final C01GW LLILLJJLI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS273S0000000_29.get$arr$(161), "image_mob_params", HashMap.class);
    public final C01GW LLILLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS273S0000000_29.get$arr$(163), "aigc_image", Boolean.class);
    public final C01GW LLILZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS273S0000000_29.get$arr$(160), "post_hashtag", ArrayList.class);
    public final C01GW LLILZIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS273S0000000_29.get$arr$(164), "tako_transition_name", String.class);
    public TakoImageTransitionFragment LLILZLL;
    public TakoImageFragment LLIZ;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoImageActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoImageActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoImageActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoImageActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoImageActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final String LLLLLZL() {
        return (String) this.LLILZIL.getValue();
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        C19HU c19hu;
        if (LLLLLZL() == null) {
            super.onBackPressed();
            return;
        }
        TakoImageFragment takoImageFragment = this.LLIZ;
        if (takoImageFragment != null && (c19hu = takoImageFragment.LLIZLLLIL) != null) {
            C786410Ut5.LJLLLLLL(4, c19hu);
        }
        TakoImageFragment takoImageFragment2 = this.LLIZ;
        if (takoImageFragment2 != null) {
            ImageView imageView = takoImageFragment2.LLJ;
            if (imageView != null) {
                C0DSB.LIZJ(imageView);
            }
            C19EG activity = takoImageFragment2.getActivity();
            if (activity != null) {
                activity.finishAfterTransition();
            }
        }
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoImageActivity", "onCreate", true);
        setTheme(R.style.y0);
        super.onCreate(bundle);
        activityConfiguration(new AwS608S0100000_29(this, 283));
        setContentView(R.layout.fjd);
        String[] strArr = (String[]) this.LL.getValue();
        HashMap map = (HashMap) this.LLILLJJLI.getValue();
        boolean zLJFF = Intrinsics.LJFF(this.LLILLL.getValue(), Boolean.TRUE);
        if (strArr != null && strArr.length != 0 && true) {
            if (LLLLLZL() != null && C07IE.LIZ()) {
                String str = TakoImageTransitionFragment._pnsPageId;
                String strLLLLLZL = LLLLLZL();
                ArrayList arrayList = (ArrayList) this.LLILZ.getValue();
                TakoImageTransitionFragment takoImageTransitionFragment = new TakoImageTransitionFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putStringArray("image_url", strArr);
                if (map != null) {
                    C786410Ut5.LJJIZ(bundle2, "image_mob_params", map);
                }
                bundle2.putBoolean("aigc_image", zLJFF);
                if (strLLLLLZL != null) {
                    C786410Ut5.LJJJI("tako_transition_name", strLLLLLZL, bundle2);
                }
                if (arrayList != null) {
                    C786410Ut5.LJJJIL(bundle2, "post_hashtag", arrayList);
                }
                takoImageTransitionFragment.setArguments(bundle2);
                C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
                c19ehLJIIJ.LJIJ(R.id.iiv, takoImageTransitionFragment, null);
                c19ehLJIIJ.LJIIJ();
                this.LLILZLL = takoImageTransitionFragment;
            } else {
                String str2 = TakoImageFragment._pnsPageId;
                String strLLLLLZL2 = LLLLLZL();
                TakoImageFragment takoImageFragment = new TakoImageFragment();
                Bundle bundle3 = new Bundle();
                bundle3.putStringArray("image_url", strArr);
                if (map != null) {
                    C786410Ut5.LJJIZ(bundle3, "image_mob_params", map);
                }
                if (strLLLLLZL2 != null) {
                    C786410Ut5.LJJJI("tako_transition_name", strLLLLLZL2, bundle3);
                }
                bundle3.putBoolean("aigc_image", zLJFF);
                takoImageFragment.setArguments(bundle3);
                C19EH c19ehLJIIJ2 = getSupportFragmentManager().LJIIJ();
                c19ehLJIIJ2.LJIJ(R.id.iiv, takoImageFragment, null);
                c19ehLJIIJ2.LJIIJ();
                this.LLIZ = takoImageFragment;
            }
        } else {
            finish();
        }
        if (LLLLLZL() == null) {
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoImageActivity", "onCreate", false);
            return;
        }
        Window window = getWindow();
        TransitionSet transitionSet = new TransitionSet() { // from class: X.0lQQ
            {
                C12DM c12dm = new C12DM();
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setInterpolator(c12dm);
                addTransition(changeBounds);
                ChangeTransform changeTransform = new ChangeTransform();
                changeTransform.setInterpolator(c12dm);
                addTransition(changeTransform);
                ChangeImageTransform changeImageTransform = new ChangeImageTransform();
                changeImageTransform.setInterpolator(c12dm);
                addTransition(changeImageTransform);
                setDuration(200L);
            }
        };
        transitionSet.addListener(new Transition.TransitionListener() { // from class: X.12FG
            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionStart(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition) {
                ImageView imageView;
                ImageView imageView2;
                TakoImageFragment takoImageFragment2 = this.LIZ.LLIZ;
                if (takoImageFragment2 != null && (imageView2 = takoImageFragment2.LLJ) != null) {
                    HandlerHook.viewPostDelay(imageView2, new ARunnableS129S0100000_29(takoImageFragment2, 8), 100L);
                }
                TakoImageTransitionFragment takoImageTransitionFragment2 = this.LIZ.LLILZLL;
                if (takoImageTransitionFragment2 != null && (imageView = takoImageTransitionFragment2.LLJ) != null) {
                    HandlerHook.viewPostDelay(imageView, new ARunnableS129S0100000_29(takoImageTransitionFragment2, 9), 100L);
                }
            }
        });
        window.setSharedElementEnterTransition(transitionSet);
        getWindow().setSharedElementReturnTransition(new TransitionSet() { // from class: X.0lQQ
            {
                C12DM c12dm = new C12DM();
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setInterpolator(c12dm);
                addTransition(changeBounds);
                ChangeTransform changeTransform = new ChangeTransform();
                changeTransform.setInterpolator(c12dm);
                addTransition(changeTransform);
                ChangeImageTransform changeImageTransform = new ChangeImageTransform();
                changeImageTransform.setInterpolator(c12dm);
                addTransition(changeImageTransform);
                setDuration(200L);
            }
        });
        postponeEnterTransition();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoImageActivity", "onCreate", false);
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
