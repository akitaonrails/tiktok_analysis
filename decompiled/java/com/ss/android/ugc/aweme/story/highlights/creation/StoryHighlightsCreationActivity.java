package com.ss.android.ugc.aweme.story.highlights.creation;

import X.C01GW;
import X.C01QV;
import X.C1308910kAL;
import X.C13LE;
import X.C13LP;
import X.C1674360tfm;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C23250099c;
import X.C299020Bno;
import X.C335910DEv;
import X.C341530DaB;
import X.EnumC1674300tfg;
import X.EnumC335920DEw;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.keva.Keva;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class StoryHighlightsCreationActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY4Jj0qZi0lLic/ISIkPTx9HELIOSKzcpKDs6JytiGjs8OjwEICg7JCwrITsgCzcpKDs6JysNKjs6Piw4MA==";
    public final C01GW LL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS266S0000000_25.get$arr$(246), "collection", StoryHighlightCollection.class);
    public final C01GW LLILLJJLI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS266S0000000_25.get$arr$(247), "enter_method", String.class);
    public final C01GW LLILLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS266S0000000_25.get$arr$(248), "resume_aweme_id", String.class);
    public final ViewModelLazy LLILZ = new ViewModelLazy(C13LE.LIZ(StoryHighlightsCreationVM.class), new AwS569S0100000_25((ComponentActivity) this, 428), new AwS569S0100000_25((ComponentActivity) this, 427), new AwS426S0200000_25((Function0) null, this, 83));

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final StoryHighlightsCreationVM LLLLLZL() {
        return (StoryHighlightsCreationVM) this.LLILZ.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        User currentUser;
        String uid;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService != null && (currentUser = iUserService.getCurrentUser()) != null && (uid = currentUser.getUid()) != null) {
            int size = ((C1674360tfm) LLLLLZL().LLILLJJLI.getValue()).LIZ.size();
            if (((C1674360tfm) LLLLLZL().LLILLJJLI.getValue()).LIZLLL != EnumC1674300tfg.LOADED_COMPLETE) {
                size = Math.max(size, LLLLLZL().LLJILJIL);
            }
            Keva repo = Keva.getRepo("story_highlights");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preview_count_");
            sbLIZ.append(uid);
            repo.storeInt(C2188811AlT.LIZIZ(sbLIZ), size);
        }
        IStoryHighlightsMyDataManager iStoryHighlightsMyDataManager = (IStoryHighlightsMyDataManager) PluggableExtentionKt.pluggableSpi$default(IStoryHighlightsMyDataManager.class, false, false, false, 14, null);
        if (iStoryHighlightsMyDataManager != null) {
            iStoryHighlightsMyDataManager.LJJIJIIJIL(C13LP.LL(((C1674360tfm) LLLLLZL().LLILLJJLI.getValue()).LIZ, 12));
        }
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

    /* JADX WARN: Removed duplicated region for block: B:25:0x00cd  */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r24) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationActivity.onCreate(android.os.Bundle):void");
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
        Uri uri;
        super.onActivityResult(i, i2, intent);
        C341530DaB c341530DaB = C341530DaB.LIZ;
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        StoryHighlightsCreationVM storyHighlightsCreationVMLLLLLZL = LLLLLZL();
        c341530DaB.getClass();
        if (i2 == -1 && i == 70001 && (uri = C341530DaB.LIZIZ) != null) {
            C23250099c.LIZLLL(lifecycleScope, null, null, new C01QV(storyHighlightsCreationVMLLLLLZL, this, uri, null), 3);
            C341530DaB.LIZIZ = null;
        }
    }
}
