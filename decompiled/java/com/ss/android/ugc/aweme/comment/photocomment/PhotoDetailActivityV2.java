package com.ss.android.ugc.aweme.comment.photocomment;

import X.C01GW;
import X.C0BJV;
import X.C1308910kAL;
import X.C1344010l4x;
import X.C1344550l5p;
import X.C1350920lG6;
import X.C1483410ohn;
import X.C1697810uHb;
import X.C2208281Bbm;
import X.C294430BgP;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC335920DEw;
import Y.ARunnableS119S0100000_19;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes22.dex */
public final class PhotoDetailActivityV2 extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2JjFiOSHELIOSc8PCovJiI+LSs4Zx87JzEjDSonKSwgCCwnITMlPTYFeg==";
    public long LL;
    public CommentContextSource LLILLL;
    public C1344550l5p LLILZ;
    public BPEAHandler LLILZIL;
    public String LLILLJJLI = "";
    public final ARunnableS119S0100000_19 LLILZLL = new ARunnableS119S0100000_19(this, 32);

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.comment.photocomment.PhotoDetailActivityV2", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.comment.photocomment.PhotoDetailActivityV2", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.comment.photocomment.PhotoDetailActivityV2", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.comment.photocomment.PhotoDetailActivityV2", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.comment.photocomment.PhotoDetailActivityV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        if (C294430BgP.LIZIZ) {
            BPEAHandler bPEAHandler = this.LLILZIL;
            if (bPEAHandler != null) {
                bPEAHandler.removeCallbacks(this.LLILZLL);
            }
            this.LLILZIL = null;
        }
        super.onDestroy();
        ((ArrayList) C1344010l4x.LIZ).clear();
        ((ArrayList) C1344010l4x.LIZIZ).clear();
        C2208281Bbm.LIZ.getClass();
        ((LinkedHashMap) C2208281Bbm.LJ).clear();
        String str = this.LLILLJJLI;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LL;
        Aweme aweme = CommentContextSourceKt.aweme(this.LLILLL);
        String groupId = aweme != null ? aweme.getGroupId() : null;
        C1344550l5p c1344550l5p = this.LLILZ;
        C1350920lG6.LLIIJI(str, "comment_panel", jCurrentTimeMillis, null, groupId, true, c1344550l5p != null ? c1344550l5p.getEnterComment() : null, 8);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
        C01GW c01gw = C0BJV.LIZ;
        if (C0BJV.LIZIZ && C1483410ohn.LJLJJI().isPlaying()) {
            C1483410ohn.LJLJJI().LIZ();
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

    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014c  */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.photocomment.PhotoDetailActivityV2.onCreate(android.os.Bundle):void");
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
