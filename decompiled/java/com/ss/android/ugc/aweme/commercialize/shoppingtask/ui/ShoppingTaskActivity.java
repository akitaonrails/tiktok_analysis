package com.ss.android.ugc.aweme.commercialize.shoppingtask.ui;

import X.C1058250de3;
import X.C1546090qKt;
import X.C1546100qKu;
import X.C1546680qLq;
import X.C1697810uHb;
import X.C1801370wyd;
import X.C19GS;
import X.C786410Ut5;
import X.EnumC1546110qKv;
import X.EnumC21504619Dw;
import X.InterfaceC1059280dfi;
import X.InterfaceC1546650qLn;
import X.InterfaceC1554280qY6;
import android.content.res.Configuration;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.shoppingtask.api.IShoppingTaskHostService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Iterator;

/* JADX INFO: loaded from: classes33.dex */
public final class ShoppingTaskActivity extends C19GS implements InterfaceC1059280dfi, InterfaceC1546650qLn {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6MiHELIOSBiOic8ODUlJygnKTYnZzo6ZhYkJj8jISsrHS4gIwQvPSYlITE1";
    public SparkFragment LL;
    public C1801370wyd LLILLJJLI;
    public SparkContext LLILLL;
    public boolean LLILZ;
    public Integer LLILZIL;
    public EnumC1546110qKv LLILZLL;
    public boolean LLIZ;

    @Override // X.InterfaceC1546650qLn
    public final void HG(boolean z) {
    }

    @Override // X.InterfaceC1546650qLn
    public final void Ip(boolean z) {
    }

    @Override // X.InterfaceC1546650qLn
    public final void fh(boolean z) {
    }

    @Override // X.InterfaceC1059280dfi
    public final void m3(boolean z) {
    }

    @Override // X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.shoppingtask.ui.ShoppingTaskActivity", "onResume", true);
        super.onResume();
        SparkFragment sparkFragment = this.LL;
        if (sparkFragment != null) {
            sparkFragment.onFragmentShow();
        }
        C1801370wyd c1801370wyd = this.LLILLJJLI;
        if (c1801370wyd != null) {
            c1801370wyd.LIZ("page_show");
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.shoppingtask.ui.ShoppingTaskActivity", "onResume", false);
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.shoppingtask.ui.ShoppingTaskActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.shoppingtask.ui.ShoppingTaskActivity", "onStart", false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.shoppingtask.ui.ShoppingTaskActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        SparkFragment sparkFragment = this.LL;
        if (sparkFragment != null) {
            sparkFragment.onFragmentHide();
        }
        C1801370wyd c1801370wyd = this.LLILLJJLI;
        if (c1801370wyd != null) {
            c1801370wyd.LIZ("page_hide");
        }
        super.onPause();
    }

    @Override // X.InterfaceC1051240dSk
    public final void refresh() {
        SparkFragment sparkFragment = this.LL;
        if (sparkFragment != null) {
            sparkFragment.refresh();
        }
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        SparkFragment sparkFragment;
        if (isFinishing() && (sparkFragment = this.LL) != null) {
            sparkFragment.finish();
        }
        IShoppingTaskHostService iShoppingTaskHostService = (IShoppingTaskHostService) PluggableExtentionKt.pluggableSpi$default(IShoppingTaskHostService.class, false, false, false, 14, null);
        if (iShoppingTaskHostService != null) {
            SparkContext sparkContext = this.LLILLL;
            iShoppingTaskHostService.LJFF(sparkContext != null ? sparkContext.containerId : null);
        }
        super.onDestroy();
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
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

    @Override // X.InterfaceC1546650qLn
    public final SparkContext LLIILZL() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1059280dfi
    public final void close() {
        finish();
    }

    @Override // X.InterfaceC1546650qLn
    public final SparkFragment getSparkFragment() {
        return this.LL;
    }

    @Override // X.InterfaceC1546650qLn
    public final boolean k9() {
        return this.LLIZ;
    }

    @Override // androidx.activity.ComponentActivity
    public final Object onRetainCustomNonConfigurationInstance() {
        return this.LLILLL;
    }

    public final void LLLLLZL(SparkContext sparkContext) {
        SparkPageSchemaParam sparkPageSchemaParam;
        boolean z = true;
        SparkSchemaParam sparkSchemaParamLJJJI = sparkContext.LJJJI(1);
        if (!(sparkSchemaParamLJJJI instanceof SparkPageSchemaParam) || (sparkPageSchemaParam = (SparkPageSchemaParam) sparkSchemaParamLJJJI) == null) {
            sparkPageSchemaParam = new SparkPageSchemaParam(null, 1, null);
        }
        Iterator it2 = C1697810uHb.LJIIJJI(new C1546680qLq(sparkPageSchemaParam, this), new C1546100qKu(sparkPageSchemaParam, this), new C1546090qKt(sparkPageSchemaParam, this)).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1554280qY6) it2.next()).invoke();
        }
        ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(this);
        if (this.LLILZ) {
            immersionBarLJIILJJIL.LIZLLL(EnumC21504619Dw.FLAG_HIDE_STATUS_BAR);
        } else {
            immersionBarLJIILJJIL.LIZLLL(EnumC21504619Dw.FLAG_SHOW_BAR);
        }
        Integer num = this.LLILZIL;
        if (num != null) {
            immersionBarLJIILJJIL.LJFF.LL = num.intValue();
        }
        EnumC1546110qKv enumC1546110qKv = this.LLILZLL;
        if (enumC1546110qKv != null) {
            if (enumC1546110qKv != EnumC1546110qKv.DARK) {
                z = false;
            }
            immersionBarLJIILJJIL.LJIIJ(z);
        }
        if (this.LLIZ) {
            immersionBarLJIILJJIL.LJIIL();
        } else {
            Integer num2 = this.LLILZIL;
            if (num2 != null) {
                immersionBarLJIILJJIL.LJFF.LL = num2.intValue();
            }
        }
        immersionBarLJIILJJIL.LJ();
    }

    @Override // X.InterfaceC1546650qLn
    public final void Ux(EnumC1546110qKv enumC1546110qKv) {
        this.LLILZLL = enumC1546110qKv;
    }

    @Override // X.InterfaceC1546650qLn
    public final void g5(boolean z) {
        this.LLILZ = z;
    }

    @Override // X.InterfaceC1546650qLn
    public final void h9(boolean z) {
        this.LLIZ = z;
    }

    @Override // X.C19GS, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        SparkContext sparkContext = this.LLILLL;
        if (sparkContext != null) {
            LLLLLZL(sparkContext);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00eb A[PHI: r9
      0x00eb: PHI (r9v7 java.lang.String) = (r9v0 java.lang.String), (r9v8 java.lang.String) binds: [B:37:0x00e9, B:29:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3 A[PHI: r9
      0x00f3: PHI (r9v6 java.lang.String) = (r9v0 java.lang.String), (r9v7 java.lang.String) binds: [B:37:0x00e9, B:39:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105 A[PHI: r0 r9
      0x0105: PHI (r0v17 java.lang.Object) = (r0v38 java.lang.Object), (r0v40 java.lang.Object) binds: [B:42:0x00fd, B:39:0x00f1] A[DONT_GENERATE, DONT_INLINE]
      0x0105: PHI (r9v3 java.lang.String) = (r9v6 java.lang.String), (r9v7 java.lang.String) binds: [B:42:0x00fd, B:39:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.shoppingtask.ui.ShoppingTaskActivity.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        String string;
        super.onSaveInstanceState(bundle);
        SparkContext sparkContext = this.LLILLL;
        if (sparkContext == null) {
            return;
        }
        C786410Ut5.LJJJI("shoppingTaskSparkInsureUrl", sparkContext.LJIJI(), bundle);
        Object obj = sparkContext.extraRuntimeInfo.get((Object) "shoppingTaskParams");
        if (obj == null || (string = obj.toString()) == null) {
            string = "";
        }
        C786410Ut5.LJJJI("shoppingTaskSparkInsureGlobalProps", string, bundle);
        C786410Ut5.LJJJI("shoppingTaskSparkInsureRuntimeInfo", C1058250de3.LIZLLL(sparkContext.extraRuntimeInfo), bundle);
    }

    @Override // X.InterfaceC1546650qLn
    public final void tH(Integer num) {
        this.LLILZIL = num;
    }
}
