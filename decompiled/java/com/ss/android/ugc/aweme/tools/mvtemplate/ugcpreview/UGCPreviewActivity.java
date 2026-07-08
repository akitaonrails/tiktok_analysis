package com.ss.android.ugc.aweme.tools.mvtemplate.ugcpreview;

import X.AbstractActivityC1674880tgc;
import X.C0LE8;
import X.C1254880ilC;
import X.C1308910kAL;
import X.C1404250me7;
import X.C1697810uHb;
import X.C20684815ws;
import X.C2268941DrQ;
import X.C299020Bno;
import X.C335910DEv;
import X.C389400FOo;
import X.C418740GbQ;
import X.C580710Mq5;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.EnumC539100LCi;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.nle.editor_jni.NLEModelDownloader;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateResourceService;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class UGCPreviewActivity extends AbstractActivityC1674880tgc {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEjJiMgZig6PSo+HELIOSOCktPSp9PSIvOT02PiwpPmEGDwYcOyolISA7CCwnITMlPTY=";
    public C418740GbQ LLIZ;
    public TuxTextView LLIZLLLIL;
    public TuxIconView LLJ;
    public FrameLayout LLJI;
    public RelativeLayout LLJIJIL;
    public C580710Mq5 LLJILJIL;
    public long LLJILJILJ;
    public String LLJILLL;

    @Override // X.AbstractActivityC1674880tgc
    public final void LLLLZLLLI(boolean z) {
    }

    @Override // X.AbstractActivityC1674880tgc
    public final void LLLZ() {
    }

    @Override // X.AbstractActivityC1674880tgc, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.mvtemplate.ugcpreview.UGCPreviewActivity", "onResume", true);
        super.onResume();
        this.LLJILJILJ = System.currentTimeMillis();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.mvtemplate.ugcpreview.UGCPreviewActivity", "onResume", false);
    }

    @Override // X.AbstractActivityC1674880tgc, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.mvtemplate.ugcpreview.UGCPreviewActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.mvtemplate.ugcpreview.UGCPreviewActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.tools.mvtemplate.ugcpreview.UGCPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        C1254880ilC.LIZ.getClass();
        C1254880ilC.LIZ(this, false, 0);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Aweme awemeLIZ;
        super.onBackPressed();
        C580710Mq5 c580710Mq5 = this.LLJILJIL;
        if (c580710Mq5 == null) {
            c580710Mq5 = null;
        }
        C20684815ws.LJIILLIIL("exit_template_preview_page", C1404250me7.LIZ(c580710Mq5.LIZJ()).LIZ);
        C580710Mq5 c580710Mq52 = this.LLJILJIL;
        if (c580710Mq52 == null) {
            c580710Mq52 = null;
        }
        if (c580710Mq52.LIZ == null || (awemeLIZ = c580710Mq52.LIZ()) == null) {
            return;
        }
        String aid = awemeLIZ.getAid();
        long j = this.LLJILJILJ;
        C580710Mq5 c580710Mq53 = this.LLJILJIL;
        C1404250me7.LIZIZ(1, aid, j, (c580710Mq53 != null ? c580710Mq53 : null).LIZJ());
    }

    @Override // X.AbstractActivityC1674880tgc, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        EnumC539100LCi enumC539100LCi = EnumC539100LCi.UGC;
        C389400FOo c389400FOo = C0LE8.LJFF;
        ((LinkedHashMap) c389400FOo.LIZ).clear();
        ((LinkedHashMap) c389400FOo.LIZIZ).clear();
        ((LinkedHashMap) c389400FOo.LIZJ).clear();
        synchronized (C2268941DrQ.LIZ) {
            NLEModelDownloader nLEModelDownloader = (NLEModelDownloader) ((LinkedHashMap) C2268941DrQ.LJ).get(enumC539100LCi);
            if (nLEModelDownloader != null) {
                nLEModelDownloader.clearEpCache();
            }
        }
        ((ITemplateResourceService) ServiceManager.get().getService(ITemplateResourceService.class)).LJIIJ();
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

    @Override // X.AbstractActivityC1674880tgc
    public final void LLLZIL(boolean z) {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            viewFindViewById = findViewById(R.id.e1i);
            this.LLIZ = (C418740GbQ) viewFindViewById;
        }
        int statusBarHeight = ScreenUtils.getStatusBarHeight(this);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams();
        marginLayoutParams.topMargin = statusBarHeight;
        C786410Ut5.W5(viewFindViewById, marginLayoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013c  */
    /* JADX WARN: Type inference failed for: r0v108, types: [T, java.lang.String] */
    @Override // X.AbstractActivityC1674880tgc, X.ActivityC214874197g, X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r22) {
        /*
            Method dump skipped, instruction units count: 1332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.mvtemplate.ugcpreview.UGCPreviewActivity.onCreate(android.os.Bundle):void");
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

    public static String LLLZZIL(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
