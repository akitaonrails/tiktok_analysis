package com.ss.android.ugc.aweme.story.feed.immersive.gallery;

import X.C01GW;
import X.C0SEJ;
import X.C0SUC;
import X.C1254880ilC;
import X.C1308910kAL;
import X.C13LE;
import X.C14K9;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1697810uHb;
import X.C19252910Tv;
import X.C19719912Dl;
import X.C2189821An6;
import X.C2217381BqS;
import X.C2344809Gs;
import X.C299020Bno;
import X.C335910DEv;
import X.C452070Ho5;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724750Sbp;
import X.C727350Sg1;
import X.C727890Sgt;
import X.C739010Syp;
import X.EnumC335920DEw;
import X.InterfaceC2217461Bqa;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.feed.immersive.ability.StoryViewerListHostAbility;
import com.ss.android.ugc.aweme.story.model.StoryInsertUser;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryGalleryActivity extends BaseActivity implements StoryViewerListHostAbility {
    public static final C0SEJ LLJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static Aweme LLJILJILJ = null;
    public static Aweme LLJILLL = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY4Jj0qZiMpLCt9ISHELIOSghLD0gITMpZygyJCkpOzZ9GzEjOzYUKSkgLD0qCSY4IDk6PDw=";
    public final C01GW LL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 822));
    public final AssemVMLazy LLILLJJLI;
    public final C630740Ooa LLILLL;
    public final C630740Ooa LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final Aweme LLIZLLLIL;
    public final Aweme LLJ;
    public final C01GW LLJI;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0SEJ] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoryGalleryActivity.class, "galleryListVM", "getGalleryListVM()Lcom/ss/android/ugc/aweme/story/feed/immersive/gallery/StoryGalleryListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJIJIL = new Object() { // from class: X.0SEJ
        };
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.ability.StoryViewerListHostAbility
    public final boolean K22() {
        return ((Boolean) this.LLIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.ability.StoryViewerListHostAbility
    public final C727350Sg1 ah1() {
        return (C727350Sg1) this.LLJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.ability.StoryViewerListHostAbility
    public final Aweme gv2() {
        Aweme aweme = this.LLIZLLLIL;
        if (aweme != null) {
            return aweme;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public StoryGalleryActivity() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryGalleryListViewModel.class);
        this.LLILLJJLI = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS555S0100000_11(c19719912DlLIZ, 826), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS555S0100000_11((HasDefaultViewModelProviderFactory) this, 827), AFwS243S0000000_11.get$arr$(448));
        this.LLILLL = C628500Oky.LIZ(new AwS555S0100000_11(this, 829));
        this.LLILZ = C628500Oky.LIZ(new AwS555S0100000_11(this, 823));
        this.LLILZIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 821));
        this.LLILZLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 828));
        this.LLIZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 824));
        this.LLIZLLLIL = LLJILJILJ;
        this.LLJ = LLJILLL;
        this.LLJI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 825));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        C1254880ilC.LIZ.getClass();
        C1254880ilC.LIZ(this, false, 1);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C1558520qew.LJIIJJI(C1558360qeg.LJI(this, null), StoryViewerListHostAbility.class, null);
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

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.ability.StoryViewerListHostAbility
    public final Aweme FQ0() {
        return this.LLJ;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ((GestureDetector) this.LL.getValue()).onTouchEvent(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.ability.StoryViewerListHostAbility
    public final List<StoryInsertUser> jE2(String str) {
        if (!Intrinsics.LJFF(str, this.LLILZIL.getValue())) {
            return null;
        }
        return (List) this.LLILZLL.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryActivity", "onCreate", true);
        if (!C19252910Tv.LIZIZ.LIZLLL().LJ()) {
            setRequestedOrientation(1);
        }
        super.onCreate(bundle);
        setContentView(R.layout.faq);
        String str = null;
        C1558520qew.LJII(C1558360qeg.LJI(this, null), this, StoryViewerListHostAbility.class, null, null);
        C1254880ilC.LIZ.getClass();
        C1254880ilC.LIZ(this, true, 1);
        if (this.LLIZLLLIL == null) {
            C727890Sgt c727890Sgt = C727890Sgt.LIZ;
            RuntimeException runtimeException = new RuntimeException("init select story is null");
            c727890Sgt.getClass();
            String strLIZLLL = C727890Sgt.LIZLLL("StoryGalleryActivity");
            if (C2344809Gs.LIZ) {
                C2344809Gs.LIZLLL(6, strLIZLLL, Log.getStackTraceString(runtimeException));
            }
            finish();
        }
        HashMap<String, String> map = new HashMap<>();
        C727350Sg1 c727350Sg1 = (C727350Sg1) this.LLJI.getValue();
        if (c727350Sg1 != null) {
            str = c727350Sg1.enterPosition;
        }
        map.put("enter_position", str);
        C2189821An6 c2189821An6 = new C2189821An6();
        c2189821An6.setExtra(map);
        C0SUC.LIZIZ(this, c2189821An6);
        View viewFindViewById = findViewById(R.id.tsc);
        if (Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(viewFindViewById, new C739010Syp(viewFindViewById, 1));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryActivity", "onCreate", false);
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
