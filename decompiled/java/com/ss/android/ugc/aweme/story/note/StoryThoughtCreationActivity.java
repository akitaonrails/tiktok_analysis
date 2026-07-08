package com.ss.android.ugc.aweme.story.note;

import X.C01GW;
import X.C0DMI;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C1697810uHb;
import X.C19EH;
import X.C298590Bn7;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C817600W5m;
import X.EnumC335920DEw;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class StoryThoughtCreationActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY4Jj0qZisjHELIOSPSp9GzEjOzYHICo5LicnCzcpKDs6JysNKjs6Piw4MA==";
    public final C01GW LL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS276S0000000_31.get$arr$(190), "enter_from", String.class);
    public final C01GW LLILLJJLI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS276S0000000_31.get$arr$(191), "enter_method", String.class);
    public final C01GW LLILLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS276S0000000_31.get$arr$(196), "publish_landing_page", String.class);
    public final C01GW LLILZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS276S0000000_31.get$arr$(188), "draft", C817600W5m.class);
    public final C01GW LLILZIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS276S0000000_31.get$arr$(189), "draft_from_notification", C817600W5m.class);
    public final C01GW LLILZLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS276S0000000_31.get$arr$(185), "avatar_thoughts_text", String.class);
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS276S0000000_31.get$arr$(199), "try_it_out_position", String.class);
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS276S0000000_31.get$arr$(194), "is_from_new_user_guide", Boolean.class);
    public final C01GW LLJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS276S0000000_31.get$arr$(192), "has_avatar_prompt", Boolean.class);
    public final C01GW LLJI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS276S0000000_31.get$arr$(195), "from_social_media_picker", Boolean.class);
    public final C01GW LLJIJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS276S0000000_31.get$arr$(186), "default_background_id", String.class);
    public final C01GW LLJILJIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS276S0000000_31.get$arr$(193), "is_from_avatar_thought_prompt", Boolean.class);
    public final C01GW LLJILJILJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS276S0000000_31.get$arr$(197), "story_archive_tab_name", String.class);
    public final C01GW LLJILLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS276S0000000_31.get$arr$(187), "disable_post_publish_redirect", Boolean.class);
    public final C01GW LLJJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS276S0000000_31.get$arr$(198), "thoughts_text", String.class);
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1058));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1057));

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.note.StoryThoughtCreationActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.note.StoryThoughtCreationActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.note.StoryThoughtCreationActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.note.StoryThoughtCreationActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.note.StoryThoughtCreationActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        int i = C1389600mGU.LIZIZ(this) ? 0 : R.anim.fy;
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
        Class cls;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.note.StoryThoughtCreationActivity", "onCreate", true);
        super.onCreate(bundle);
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (C1389600mGU.LIZIZ(this)) {
            i = 0;
        } else {
            i = R.anim.j0;
        }
        overridePendingTransition(i, 0);
        if (C298590Bn7.LIZ()) {
            ((StoryThoughtAvatarCreationVM) this.LLJJIII.getValue()).LLJJIJIIJIL = C0DMI.LIZIZ(null);
        } else {
            ((StoryThoughtCreationVM) this.LLJJI.getValue()).LLJJIJI = C0DMI.LIZIZ(null);
        }
        if (bundle == null) {
            if (C298590Bn7.LIZ()) {
                cls = StoryThoughtAvatarCreationFragment.class;
            } else {
                cls = StoryThoughtCreationFragment.class;
            }
            C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
            c19ehLJIIJ.LJ(cls, new Bundle(0), "ThoughtCreation");
            c19ehLJIIJ.LJIIJ();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.note.StoryThoughtCreationActivity", "onCreate", false);
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
