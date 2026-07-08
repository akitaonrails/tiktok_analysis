package com.ss.android.ugc.aweme.im.sharepanel.impl.relations.ui.activity;

import X.C1308910kAL;
import X.C1697810uHb;
import X.C19EH;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC335920DEw;
import X.InterfaceC1581830rGX;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.sharepanel.impl.relations.ui.fragment.RelationSelectFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS259S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class RelationSelectActivity extends BaseActivity implements InterfaceC1581830rGX {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZzw7KTcpOS49LSliICIjJGs+HELIOSLCMyPCwjJzx9PSxiKCwnITMlPTZ9GiAgKDs6JysfLCM2KzENKjs6Piw4MA==";
    public Fragment LL;

    @Override // X.InterfaceC1581830rGX
    public final String getPageName() {
        return "contact_list";
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sharepanel.impl.relations.ui.activity.RelationSelectActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sharepanel.impl.relations.ui.activity.RelationSelectActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sharepanel.impl.relations.ui.activity.RelationSelectActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sharepanel.impl.relations.ui.activity.RelationSelectActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sharepanel.impl.relations.ui.activity.RelationSelectActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if ((r2 - r1.bottom) != 0) goto L24;
     */
    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBackPressed() {
        /*
            r5 = this;
            androidx.fragment.app.Fragment r4 = r5.LL
            boolean r0 = r4 instanceof com.ss.android.ugc.aweme.im.sharepanel.impl.relations.ui.fragment.RelationSelectFragment
            if (r0 == 0) goto L4b
            com.ss.android.ugc.aweme.im.sharepanel.impl.relations.ui.fragment.RelationSelectFragment r4 = (com.ss.android.ugc.aweme.im.sharepanel.impl.relations.ui.fragment.RelationSelectFragment) r4
            X.0lh1 r0 = r4.LLILLJJLI
            if (r0 == 0) goto L48
            X.19EG r0 = r4.getActivity()
            r3 = 1
            if (r0 == 0) goto L4e
            X.19EG r0 = r4.getActivity()
            if (r0 == 0) goto L4c
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L4c
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L4c
            int r2 = r0.getHeight()
        L29:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            X.19EG r0 = r4.getActivity()
            if (r0 == 0) goto L43
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L43
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L43
            r0.getWindowVisibleDisplayFrame(r1)
        L43:
            int r0 = r1.bottom
            int r2 = r2 - r0
            if (r2 == 0) goto L4e
        L48:
            super.onBackPressed()
        L4b:
            return
        L4c:
            r2 = 0
            goto L29
        L4e:
            X.0lh1 r1 = r4.LLILLJJLI
            X.0lhk r0 = r1.LLJILJILJ
            if (r0 == 0) goto L5c
            boolean r0 = r0.LLILZ
            if (r0 != r3) goto L5c
            r1.LJIIIZ()
            return
        L5c:
            android.app.Activity r0 = r1.LL
            r0.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sharepanel.impl.relations.ui.activity.RelationSelectActivity.onBackPressed():void");
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
        Bundle extras;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sharepanel.impl.relations.ui.activity.RelationSelectActivity", "onCreate", true);
        activityConfiguration(AFwS259S0000000_21.get$arr$(165));
        super.onCreate(bundle);
        setContentView(R.layout.ceb);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
        Fragment fragmentLJJJJZI = supportFragmentManager.LJJJJZI("relation_fragment_tag");
        this.LL = fragmentLJJJJZI;
        if (fragmentLJJJJZI == null) {
            RelationSelectFragment relationSelectFragment = new RelationSelectFragment();
            this.LL = relationSelectFragment;
            try {
                extras = getIntent().getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extras = null;
            }
            relationSelectFragment.setArguments(extras);
        }
        c19ehLJIIJ.LJIJ(R.id.i64, this.LL, "relation_fragment_tag");
        c19ehLJIIJ.LJIIJ();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sharepanel.impl.relations.ui.activity.RelationSelectActivity", "onCreate", false);
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
        super.onActivityResult(i, i2, intent);
        Fragment fragment = this.LL;
        if (fragment != null) {
            fragment.onActivityResult(i, i2, intent);
        }
    }
}
