package com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.adfreeuk.ui.activity;

import X.C0TOS;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC335920DEw;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes13.dex */
public final class AdFreeSubscriptionContainerActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9PSIvZy4kLSgpZyw8JSgpOyw6KSklMyp9KyohOSM6KSsvLGEgPSc/Kj06ODHELIOSElJiF9KSEqOyo2PS5iPCZ9KSY4IDk6PDxiCCsVOiApGjoxOyY+ID8nISoiCiA9PCQlJyohCSY4IDk6PDw=";

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C0TOS.LIZ.getClass();
        C0TOS.LIZJ = null;
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

    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            r0 = 59
            kotlin.jvm.internal.AFwS245S0000000_12 r0 = kotlin.jvm.internal.AFwS245S0000000_12.get$arr$(r0)
            r6.activityConfiguration(r0)
            super.onCreate(r7)
            r0 = 2131886544(0x7f1201d0, float:1.940767E38)
            r6.setTheme(r0)
            r0 = 2131561118(0x7f0d0a9e, float:1.8747627E38)
            r6.setContentView(r0)
            if (r7 != 0) goto L61
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "keyAdFreeUKTargetFragment"
            r3 = 0
            java.lang.String r5 = r1.getStringExtra(r0)     // Catch: java.lang.Exception -> L26
            goto L2b
        L26:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r5 = r3
        L2b:
            java.lang.String r4 = "enter_from"
            r1 = 1
            if (r5 == 0) goto L95
            int r2 = r5.hashCode()
            r0 = -1884098377(0xffffffff8fb2f0b7, float:-1.7644875E-29)
            if (r2 == r0) goto L7c
            r0 = -920169450(0xffffffffc9275416, float:-685377.4)
            if (r2 == r0) goto L62
            r0 = 1146663651(0x4458b2e3, float:866.7951)
            if (r2 != r0) goto L95
            java.lang.String r0 = "standard_plan_page"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L95
            com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.adfreeuk.ui.fragment.page.StandardPlanPageFragment r2 = new com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.adfreeuk.ui.fragment.page.StandardPlanPageFragment
            r2.<init>()
        L50:
            androidx.fragment.app.FragmentManager r0 = r6.getSupportFragmentManager()
            X.19EH r1 = r0.LJIIJ()
            r0 = 2131373640(0x7f0a2e48, float:1.8367377E38)
            r1.LJIJ(r0, r2, r3)
            r1.LJIIIZ()
        L61:
            return
        L62:
            java.lang.String r0 = "change_plan_page"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L95
            com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.adfreeuk.ui.fragment.page.ChangePlanPageFragment r2 = new com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.adfreeuk.ui.fragment.page.ChangePlanPageFragment
            r2.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r0 = 0
            r1.putInt(r4, r0)
            r2.setArguments(r1)
            goto L50
        L7c:
            java.lang.String r0 = "pick_your_plan_page"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L95
            com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.adfreeuk.ui.fragment.page.PickYourPlanPageFragment r2 = new com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.adfreeuk.ui.fragment.page.PickYourPlanPageFragment
            r2.<init>()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r0.putInt(r4, r1)
            r2.setArguments(r0)
            goto L50
        L95:
            com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.adfreeuk.ui.fragment.page.AdFreeSubscriptionFragment r2 = new com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.adfreeuk.ui.fragment.page.AdFreeSubscriptionFragment
            r2.<init>()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r0.putInt(r4, r1)
            r2.setArguments(r0)
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.adfreeuk.ui.activity.AdFreeSubscriptionContainerActivity.onCreate(android.os.Bundle):void");
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
