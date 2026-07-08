package com.ss.android.ugc.aweme.subscription.pgc.commonui.fragmentcontainer;

import X.C19EG;
import android.content.Context;
import android.content.res.Configuration;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes8.dex */
public final class SubContentFragmentContainerActivity extends C19EG {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY5KzwwOiw8PSY8Jms8Lix9KyohJCA9PSxiLzHELIOS0yLygpJzswJys4KCY9LTdiGjoxCyoiPSo9PAM+KCg+LSs4CiA9PCQlJyohCSY4IDk6PDw=";

    @Override // X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.subscription.pgc.commonui.fragmentcontainer.SubContentFragmentContainerActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.subscription.pgc.commonui.fragmentcontainer.SubContentFragmentContainerActivity", "onResume", false);
    }

    @Override // X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.subscription.pgc.commonui.fragmentcontainer.SubContentFragmentContainerActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.subscription.pgc.commonui.fragmentcontainer.SubContentFragmentContainerActivity", "onStart", false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.subscription.pgc.commonui.fragmentcontainer.SubContentFragmentContainerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.C19EG, android.app.Activity
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

    @Override // X.C19FO, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        int i = context.getResources().getConfiguration().uiMode;
        int i2 = (i & (-49)) | 16;
        if (i != i2) {
            Configuration configuration = new Configuration();
            configuration.uiMode = i2;
            applyOverrideConfiguration(configuration);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b7, code lost:
    
        if (r2 != null) goto L53;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.subscription.pgc.commonui.fragmentcontainer.SubContentFragmentContainerActivity.onCreate(android.os.Bundle):void");
    }
}
