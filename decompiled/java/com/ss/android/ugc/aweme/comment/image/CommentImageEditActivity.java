package com.ss.android.ugc.aweme.comment.image;

import X.ActivityC214874197g;
import X.C0LJK;
import X.C0PEM;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C20593115i5;
import X.C23250099c;
import X.C299020Bno;
import X.C335910DEv;
import X.C817503Hh;
import X.EnumC335920DEw;
import X.InterfaceC1451590nsT;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes23.dex */
public final class CommentImageEditActivity extends ActivityC214874197g {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2JjHELIOSFiICIyLyBiCiA+JSAiPQY+KSIpDCs6PAQvPSYlITE1";
    public CommentImageEditRootScene LL;
    public int LLILLJJLI = -1;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.comment.image.CommentImageEditActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.comment.image.CommentImageEditActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.comment.image.CommentImageEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        CommentImageEditRootScene commentImageEditRootScene = this.LL;
        if (commentImageEditRootScene != null) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C0LJK(commentImageEditRootScene, null), 2);
        }
        super.finish();
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        CommentImageEditRootScene commentImageEditRootScene = this.LL;
        if (commentImageEditRootScene == null || !commentImageEditRootScene.onBackPressed()) {
            super.onBackPressed();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.comment.image.CommentImageEditActivity", "onResume", true);
        super.onResume();
        if (getRequestedOrientation() != 1) {
            super.setRequestedOrientation(1);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.comment.image.CommentImageEditActivity", "onResume", false);
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
        int iLIZIZ;
        InterfaceC1451590nsT interfaceC1451590nsT;
        super.onConfigurationChanged(configuration);
        if (getRequestedOrientation() != 1) {
            super.setRequestedOrientation(1);
        }
        C20593115i5 c20593115i5 = C20593115i5.LIZ;
        c20593115i5.getClass();
        if (C20593115i5.LJIIIIZZ(this)) {
            c20593115i5.getClass();
            if (C20593115i5.LJIIIIZZ(this)) {
                iLIZIZ = C20593115i5.LIZIZ(this);
            } else {
                iLIZIZ = -1;
            }
            int i = this.LLILLJJLI;
            if (i != -1 && iLIZIZ != -1 && i != iLIZIZ) {
                this.LLILLJJLI = iLIZIZ;
                CommentImageEditRootScene commentImageEditRootScene = this.LL;
                if (commentImageEditRootScene != null && (interfaceC1451590nsT = commentImageEditRootScene.LLJJIJIL) != null) {
                    interfaceC1451590nsT.GS();
                    return;
                }
                return;
            }
            this.LLILLJJLI = iLIZIZ;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0440  */
    /* JADX WARN: Type inference failed for: r24v1, types: [com.ss.android.ugc.aweme.feed.model.Aweme] */
    @Override // X.ActivityC214874197g, X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r65) {
        /*
            Method dump skipped, instruction units count: 1269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.image.CommentImageEditActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.clear();
    }

    @Override // X.C19FO, android.app.Activity
    public final void setRequestedOrientation(int i) {
        super.setRequestedOrientation(1);
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

    @Override // X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        CommentImageEditRootScene commentImageEditRootScene = this.LL;
        if (commentImageEditRootScene != null) {
            commentImageEditRootScene.onActivityResult(i, i2, intent);
        }
    }
}
