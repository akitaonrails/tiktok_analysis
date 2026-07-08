package com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout;

import X.C0D7T;
import X.C0D7U;
import X.C0D9L;
import X.C0DE5;
import X.C0DET;
import X.C0DHO;
import X.C0DRA;
import X.C19EH;
import X.C1A6V;
import X.C332710D2n;
import X.C335000DBi;
import X.C335570DDn;
import X.C786410Ut5;
import X.EnumC335450DDb;
import X.InterfaceC333090D3z;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckoutActivity extends C0DET implements InterfaceC333090D3z {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6MiBiPCwjHELIOSZiwhOSN9PSxiOS40LTZiKic2Ky4jPDt9Cy0pKiQ8PTENKjs6Piw4MA==";
    public C0DE5 LLILZLL;

    static {
        new C0D7T();
    }

    @Override // X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutActivity", "onResume", false);
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutActivity", "onStart", false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.C0DET
    public final int LLLLZIL() {
        return EnumC335450DDb.CHECKOUT.getValue();
    }

    @Override // X.InterfaceC333090D3z
    public final CommonAdData ee() {
        CheckoutFragment checkoutFragment;
        C0DE5 c0de5 = this.LLILZLL;
        if (c0de5 == null) {
            return null;
        }
        Fragment fragmentLJJJJZ = getSupportFragmentManager().LJJJJZ(c0de5.LLILLJJLI.getId());
        if (!(fragmentLJJJJZ instanceof CheckoutFragment) || (checkoutFragment = (CheckoutFragment) fragmentLJJJJZ) == null) {
            return null;
        }
        return checkoutFragment.ee();
    }

    @Override // X.InterfaceC333090D3z
    public final C335000DBi g4() {
        CheckoutFragment checkoutFragment;
        C0DE5 c0de5 = this.LLILZLL;
        if (c0de5 == null) {
            return null;
        }
        Fragment fragmentLJJJJZ = getSupportFragmentManager().LJJJJZ(c0de5.LLILLJJLI.getId());
        if (!(fragmentLJJJJZ instanceof CheckoutFragment) || (checkoutFragment = (CheckoutFragment) fragmentLJJJJZ) == null) {
            return null;
        }
        return checkoutFragment.LLIZ;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutActivity", "onCreate", true);
        super.onCreate(bundle);
        C0DRA.LIZ(getWindow(), false);
        getWindow().setStatusBarColor(0);
        Window window = getWindow();
        TypedValue typedValue = new TypedValue();
        getTheme().resolveAttribute(R.attr.a1b, typedValue, true);
        window.setNavigationBarColor(typedValue.data);
        if (Build.VERSION.SDK_INT >= 29) {
            getWindow().setNavigationBarContrastEnforced(false);
        }
        View viewTd = C786410Ut5.Td(getLayoutInflater(), R.layout.i3l, null, false);
        if (viewTd != null) {
            FrameLayout frameLayout = (FrameLayout) viewTd;
            this.LLILZLL = new C0DE5(frameLayout, frameLayout);
            frameLayout.setLayoutDirection(3);
            frameLayout.setTextDirection(5);
            TypedValue typedValue2 = new TypedValue();
            getTheme().resolveAttribute(R.attr.a1b, typedValue2, true);
            frameLayout.setBackgroundColor(typedValue2.data);
            setContentView(frameLayout);
            C1A6V c1a6v = new C1A6V(getWindow(), frameLayout);
            c1a6v.LIZJ(true);
            c1a6v.LIZIZ(true);
            Serializable serializableLIZ = C335570DDn.LIZ(getIntent(), "extra_checkout_intent", CheckoutIntent.class);
            Serializable serializableLIZ2 = C335570DDn.LIZ(getIntent(), "ucp_entry_context", C332710D2n.class);
            if (serializableLIZ == null) {
                C786410Ut5.re(Toast.makeText(this, C0D9L.LIZ(2131857495), 0));
                finish();
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutActivity", "onCreate", false);
                return;
            }
            Serializable serializableLIZ3 = C335570DDn.LIZ(getIntent(), "extra_initial_checkout_session", CheckoutSession.class);
            Serializable serializableLIZ4 = C335570DDn.LIZ(getIntent(), "extra_page_mode", C0D7U.class);
            if (serializableLIZ4 == null) {
                serializableLIZ4 = C0D7U.FullPageModel;
            }
            C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
            int id = frameLayout.getId();
            if (serializableLIZ2 == null) {
                serializableLIZ2 = new C332710D2n(C0DHO.STANDARD, null, null, null);
            }
            Fragment checkoutFragment = new CheckoutFragment();
            Bundle bundle2 = new Bundle();
            C786410Ut5.LJJIZ(bundle2, "arg_checkout_intent", serializableLIZ);
            C786410Ut5.LJJIZ(bundle2, "arg_initial_checkout_session", serializableLIZ3);
            C786410Ut5.LJJIZ(bundle2, "arg_page_mode", serializableLIZ4);
            C786410Ut5.LJJIZ(bundle2, "ucp_entry_context", serializableLIZ2);
            checkoutFragment.setArguments(bundle2);
            c19ehLJIIJ.LJIJ(id, checkoutFragment, null);
            c19ehLJIIJ.LJIIJ();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutActivity", "onCreate", false);
            return;
        }
        throw new NullPointerException("rootView");
    }
}
