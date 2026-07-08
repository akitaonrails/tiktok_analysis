package com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2;

import X.C0D52;
import X.C0D53;
import X.C0D55;
import X.C0D58;
import X.C0D8X;
import X.C0DBY;
import X.C0DDG;
import X.C0DDW;
import X.C0DDX;
import X.C0DET;
import X.C0DG6;
import X.C0DJY;
import X.C1308910kAL;
import X.C13LP;
import X.C1697810uHb;
import X.C333350D4z;
import X.C335000DBi;
import X.C335510DDh;
import X.C786410Ut5;
import X.EnumC335450DDb;
import X.InterfaceC333090D3z;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.details.OrderDetailsV2ViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS370S0200000_4;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes5.dex */
public final class OrdersV2OrderDetailsActivity extends C0DET implements InterfaceC333090D3z {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6MiBiPCwjZiwhOSN9HELIOSPSxiOS40LTZiJj03LTc/P319BzcoLD0gHncDOys2OgEpPS46JDYNKjs6Piw4MA==";
    public C0DDX LLILZLL;
    public OrderDetailsV2ViewModel LLIZ;
    public LocalOrderWrapper LLIZLLLIL;
    public C0D55 LLJ;
    public C0DG6 LLJI;
    public C333350D4z LLJIJIL;
    public boolean LLJILJIL;
    public C335000DBi LLJILJILJ;

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.OrdersV2OrderDetailsActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.OrdersV2OrderDetailsActivity", "onStart", false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.OrdersV2OrderDetailsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.C0DET
    public final int LLLLZIL() {
        return EnumC335450DDb.ORDER_DETAIL.getValue();
    }

    @Override // X.InterfaceC333090D3z
    public final CommonAdData ee() {
        CheckoutIntent resolvedCheckoutIntent;
        C0DBY c0dby = C335000DBi.LIZJ;
        LocalOrderWrapper localOrderWrapper = this.LLIZLLLIL;
        Map<String, String> map = (localOrderWrapper == null || (resolvedCheckoutIntent = localOrderWrapper.getResolvedCheckoutIntent()) == null) ? null : resolvedCheckoutIntent.passThrough;
        c0dby.getClass();
        return C0DBY.LIZLLL(map);
    }

    @Override // X.C0DET, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        C0DG6 c0dg6 = this.LLJI;
        if (c0dg6 != null) {
            c0dg6.LIZIZ.setAdapter(null);
        }
        this.LLJI = null;
        this.LLILZLL = null;
        super.onDestroy();
    }

    @Override // X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.OrdersV2OrderDetailsActivity", "onResume", true);
        super.onResume();
        if (!this.LLJILJIL) {
            LocalOrderWrapper localOrderWrapper = this.LLIZLLLIL;
            C0D55 c0d55 = this.LLJ;
            if (localOrderWrapper != null && c0d55 != null) {
                C0D52.LIZ.getClass();
                C0D53 c0d53LIZ = C0D58.LIZ(localOrderWrapper, null);
                if (c0d53LIZ != null) {
                    C0D52.LIZ(c0d53LIZ).logAd(C335510DDh.LIZ, c0d53LIZ.LIZ, c0d53LIZ.LIZJ, null, new AwS370S0200000_4(c0d53LIZ, c0d55, 103));
                }
            }
            this.LLJILJIL = true;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.OrdersV2OrderDetailsActivity", "onResume", false);
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

    @Override // X.InterfaceC333090D3z
    public final C335000DBi g4() {
        return this.LLJILJILJ;
    }

    @Override // X.C0DET
    public final int LLLLZLL(boolean z) {
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, this);
        if (numLIZJ != null) {
            return numLIZJ.intValue();
        }
        return C0DDG.LIZ(this, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x03e6 A[PHI: r0
      0x03e6: PHI (r0v13 int) = (r0v12 int), (r0v17 int), (r0v18 int), (r0v19 int), (r0v20 int), (r0v21 int), (r0v22 int) binds: [B:11:0x0080, B:13:0x008b, B:15:0x0096, B:17:0x00a1, B:19:0x00ac, B:21:0x00b7, B:23:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a0  */
    @Override // X.C0DET, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r31) {
        /*
            Method dump skipped, instruction units count: 1059
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.OrdersV2OrderDetailsActivity.onCreate(android.os.Bundle):void");
    }

    public static void LLLZ(C0DDW c0ddw, List list) {
        ViewGroup viewGroup;
        int i = 0;
        for (Object obj : C1697810uHb.LJIIJJI(c0ddw.LLILZ, c0ddw.LLILZIL, c0ddw.LLILZLL, c0ddw.LLIZ)) {
            int i2 = i + 1;
            if (i >= 0) {
                ImageView imageView = (ImageView) obj;
                String str = (String) C13LP.LJJJLZIJ(i, list);
                ViewParent parent = imageView.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                } else {
                    viewGroup = null;
                }
                if (str != null && !a0.LJJJIL(str)) {
                    if (viewGroup != null) {
                        C786410Ut5.LJLZ(0, viewGroup);
                    }
                    if (!u.LJJIIJZLJL(str, "http://", false) && !u.LJJIIJZLJL(str, "https://", false)) {
                        int iN3 = C786410Ut5.n3(imageView.getContext().getResources(), str, "drawable", imageView.getContext().getPackageName());
                        if (iN3 != 0) {
                            imageView.setImageResource(iN3);
                        } else {
                            C0DJY.LIZ(imageView);
                        }
                    } else {
                        C0D8X.LIZ().LIZ(str, imageView, 0.0f, null);
                    }
                } else {
                    if (viewGroup != null) {
                        C786410Ut5.LJLZ(8, viewGroup);
                    }
                    imageView.setImageDrawable(null);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }
}
