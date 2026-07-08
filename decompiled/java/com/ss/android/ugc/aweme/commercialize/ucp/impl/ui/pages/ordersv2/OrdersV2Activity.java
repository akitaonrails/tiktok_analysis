package com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2;

import X.C0D52;
import X.C0D53;
import X.C0D58;
import X.C0D8O;
import X.C0DET;
import X.C19EH;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C332710D2n;
import X.C335500DDg;
import X.C786410Ut5;
import X.EnumC335460DDc;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class OrdersV2Activity extends C0DET {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6MiBiPCwjHELIOSZiwhOSN9PSxiOS40LTZiJj03LTc/P319BzcoLD0gHncNKjs6Piw4MA==";

    @Override // X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.OrdersV2Activity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.OrdersV2Activity", "onResume", false);
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.OrdersV2Activity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.OrdersV2Activity", "onStart", false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.OrdersV2Activity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
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

    @Override // X.C0DET, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Serializable serializableExtra;
        String strLIZIZ;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.OrdersV2Activity", "onCreate", true);
        super.onCreate(bundle);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("entry context -> ");
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            serializableExtra = intent.getSerializableExtra("ucp_entry_context", C332710D2n.class);
        } else {
            serializableExtra = intent.getSerializableExtra("ucp_entry_context");
            if (!(serializableExtra instanceof C332710D2n)) {
                serializableExtra = null;
            }
        }
        sbLIZ.append(serializableExtra);
        C2188811AlT.LIZIZ(sbLIZ);
        View viewTd = C786410Ut5.Td(getLayoutInflater(), R.layout.i3m, null, false);
        if (viewTd != null) {
            viewTd.setLayoutDirection(3);
            viewTd.setTextDirection(5);
            setContentView(viewTd);
            C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJ(viewTd.getId(), new OrdersV2Fragment(), null);
            c19ehLJIIJ.LJIIJ();
            if (getIntent().getBooleanExtra("inbox_entry_point", false)) {
                C0D52.LIZ.getClass();
                String strLIZIZ2 = C0D58.LIZIZ(null);
                if (strLIZIZ2 == null) {
                    strLIZIZ2 = "empty";
                }
                Map mapLJ = C2097608Jq.LJ();
                String strLIZIZ3 = C0D58.LIZIZ(null);
                if (strLIZIZ3 == null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("order:");
                    sbLIZ2.append(strLIZIZ2);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                } else {
                    strLIZIZ = strLIZIZ3;
                }
                String strLIZIZ4 = C0D58.LIZIZ(null);
                if (strLIZIZ4 == null) {
                    strLIZIZ4 = "";
                }
                C0D53 c0d53 = new C0D53(strLIZIZ, strLIZIZ3, strLIZIZ4, strLIZIZ2, C0D58.LIZIZ(null), C0D58.LIZIZ(null), mapLJ);
                C0D52.LIZ(c0d53).logAd(C335500DDg.LIZ, strLIZIZ, strLIZIZ4, null, new AwS583S0100000_4(c0d53, 343));
            }
            EnumC335460DDc enumC335460DDc = EnumC335460DDc.ORDER_LIST;
            C0D8O.LIZIZ(enumC335460DDc);
            C0D8O.LIZ(enumC335460DDc, null, 6);
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.OrdersV2Activity", "onCreate", false);
            return;
        }
        throw new NullPointerException("rootView");
    }
}
