package com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.shop;

import X.C01GW;
import X.C0D8O;
import X.C0D8X;
import X.C0DBY;
import X.C0DET;
import X.C0DG6;
import X.C0FG3;
import X.C0TVI;
import X.C13LE;
import X.C14K9;
import X.C1616006Uk;
import X.C19V8;
import X.C20097313kJ;
import X.C20512315Of;
import X.C23250099c;
import X.C327060Crw;
import X.C333140D4e;
import X.C333160D4g;
import X.C335000DBi;
import X.C335530DDj;
import X.C335580DDo;
import X.C335620DDs;
import X.C336380DGq;
import X.C452501pT;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC335450DDb;
import X.EnumC335460DDc;
import X.InterfaceC333090D3z;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS139S0100000_4;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.components.waterfall.WaterfallRecommendationViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS405S0200000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class ShopActivity extends C0DET implements InterfaceC333090D3z {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6MiHELIOSBiPCwjZiwhOSN9PSxiOS40LTZiOic8OGsfISAjCSY4IDk6PDw=";
    public C335580DDo LLILZLL;
    public C335000DBi LLJJI;
    public C0DG6 LLJJIII;
    public CommonAdData LLJJIJIIJIL;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 111));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 113));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 112));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS548S0100000_4(this, 114));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 110));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new C333160D4g(this));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new C333140D4e(this));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 116));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 109));
    public final ViewModelLazy LLJJIJI = new ViewModelLazy(C13LE.LIZ(WaterfallRecommendationViewModel.class), new AwS548S0100000_4((ComponentActivity) this, 115), new AwS548S0100000_4(this, 117), new AwS405S0200000_4((Function0) null, this, 18));

    @Override // X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.shop.ShopActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.shop.ShopActivity", "onResume", false);
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.shop.ShopActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.shop.ShopActivity", "onStart", false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.shop.ShopActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.C0DET
    public final int LLLLZIL() {
        return EnumC335450DDb.SHOP.getValue();
    }

    public final Map<String, String> LLLZ() {
        return (Map) this.LLJILJIL.getValue();
    }

    @Override // X.InterfaceC333090D3z
    public final CommonAdData ee() {
        if (this.LLJJIJIIJIL == null && (!LLLZ().isEmpty())) {
            C0DBY c0dby = C335000DBi.LIZJ;
            Map<String, String> mapLLLZ = LLLZ();
            c0dby.getClass();
            this.LLJJIJIIJIL = C0DBY.LIZLLL(mapLLLZ);
        }
        return this.LLJJIJIIJIL;
    }

    @Override // X.C0DET, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        C0DG6 c0dg6 = this.LLJJIII;
        if (c0dg6 != null) {
            c0dg6.LIZIZ.setAdapter(null);
        }
        this.LLJJIII = null;
        this.LLILZLL = null;
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

    @Override // X.InterfaceC333090D3z
    public final C335000DBi g4() {
        return this.LLJJI;
    }

    @Override // X.C0DET, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.shop.ShopActivity", "onCreate", true);
        super.onCreate(bundle);
        this.LLJJI = new C335000DBi(LLLZ(), new Object[0]);
        C0D8O.LIZIZ(EnumC335460DDc.SHOP);
        try {
            stringExtra = getIntent().getStringExtra("extra_shop_name");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (stringExtra == null) {
            stringExtra = "Shop";
        }
        C0D8O.LIZ(EnumC335460DDc.SHOP, stringExtra, 4);
        boolean zLIZIZ = C960203pA.LIZIZ(this);
        ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(this);
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(this, immersionBarLJIILJJIL);
        immersionBarLJIILJJIL.LJIIL();
        tuxImmersionBar.LJ(R.attr.zq);
        boolean z = !zLIZIZ;
        immersionBarLJIILJJIL.LJIIJ(z);
        immersionBarLJIILJJIL.LJII(z);
        tuxImmersionBar.LIZ(false);
        tuxImmersionBar.LIZLLL();
        View viewTd = C786410Ut5.Td(getLayoutInflater(), R.layout.i3p, null, false);
        int i = R.id.m72;
        FrameLayout frameLayout = (FrameLayout) C1616006Uk.LIZ(R.id.m72, viewTd);
        if (frameLayout != null) {
            i = R.id.m7z;
            View viewLIZ = C1616006Uk.LIZ(R.id.m7z, viewTd);
            if (viewLIZ != null) {
                C335530DDj c335530DDjLIZ = C335530DDj.LIZ(viewLIZ);
                i = R.id.p12;
                C19V8 c19v8 = (C19V8) C1616006Uk.LIZ(R.id.p12, viewTd);
                if (c19v8 != null) {
                    i = R.id.v68;
                    View viewLIZ2 = C1616006Uk.LIZ(R.id.v68, viewTd);
                    if (viewLIZ2 != null) {
                        int i2 = R.id.cls;
                        TuxIconView tuxIconView = (TuxIconView) C1616006Uk.LIZ(R.id.cls, viewLIZ2);
                        if (tuxIconView != null) {
                            i2 = R.id.fen;
                            CardView cardView = (CardView) C1616006Uk.LIZ(R.id.fen, viewLIZ2);
                            if (cardView != null) {
                                i2 = R.id.l7j;
                                ImageView imageView = (ImageView) C1616006Uk.LIZ(R.id.l7j, viewLIZ2);
                                if (imageView != null) {
                                    i2 = R.id.z70;
                                    TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.z70, viewLIZ2);
                                    if (tuxTextView != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewTd;
                                        this.LLILZLL = new C335580DDo(constraintLayout, frameLayout, c335530DDjLIZ, c19v8, new C335620DDs((LinearLayout) viewLIZ2, tuxIconView, cardView, imageView, tuxTextView));
                                        if (constraintLayout == null) {
                                            ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.shop.ShopActivity", "onCreate", false);
                                            return;
                                        }
                                        setContentView(constraintLayout);
                                        final C335580DDo c335580DDo = this.LLILZLL;
                                        if (c335580DDo != null) {
                                            C335620DDs c335620DDs = c335580DDo.LLILZIL;
                                            final int iLIZ = C336380DGq.LIZ(getResources(), R.dimen.b3h);
                                            final int paddingBottom = c335580DDo.LLILLL.LL.getPaddingBottom();
                                            C14K9.LJIJJ(c335580DDo.LL, new C0TVI() { // from class: X.0DDd
                                                @Override // X.C0TVI
                                                public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                                                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                                                    C19V8 c19v82 = c335580DDo.LLILZ;
                                                    c19v82.setPadding(c19v82.getPaddingLeft(), c20244914JjLIZ.LIZIZ, c19v82.getPaddingRight(), c19v82.getPaddingBottom());
                                                    c335580DDo.LLILZ.getLayoutParams().height = iLIZ + c20244914JjLIZ.LIZIZ;
                                                    LinearLayout linearLayout = c335580DDo.LLILLL.LL;
                                                    linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), paddingBottom + c20244914JjLIZ.LIZLLL);
                                                    return c20246014Ju;
                                                }
                                            });
                                            C20097313kJ.LIZJ(c335580DDo.LL);
                                            C786410Ut5.a9(c335620DDs.LLILLJJLI, new ACListenerS139S0100000_4(this, 92));
                                            c335620DDs.LLILZIL.setText((String) this.LLIZLLLIL.getValue());
                                            if (C0FG3.LIZIZ((String) this.LLJ.getValue())) {
                                                C786410Ut5.LLILLL(c335620DDs.LLILLL, 0);
                                                C0D8X.LIZ().LIZ((String) this.LLJ.getValue(), c335620DDs.LLILZ, 0.0f, null);
                                            } else {
                                                C786410Ut5.LLILLL(c335620DDs.LLILLL, 8);
                                            }
                                            C786410Ut5.LJZL(8, c335580DDo.LLILLL.LLILLJJLI);
                                            C20512315Of c20512315Of = c335580DDo.LLILLL.LLILLL;
                                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20512315Of);
                                            c20512315Of.setLayoutParams(layoutParams);
                                            C335530DDj c335530DDj = c335580DDo.LLILLL;
                                            this.LLJJIII = new C0DG6(c335530DDj.LL, c335530DDj.LLILLL, c335530DDj.LLILZ, c335530DDj.LLILLJJLI, new AwS583S0100000_4(this, 307));
                                            C786410Ut5.LJZL(0, c335580DDo.LLILLL.LL);
                                            C786410Ut5.LJZ(8, c335580DDo.LLILLJJLI);
                                            C0DG6 c0dg6 = this.LLJJIII;
                                            if (c0dg6 != null) {
                                                c0dg6.LJI();
                                            }
                                            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C327060Crw(this, null), 3);
                                        }
                                        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.shop.ShopActivity", "onCreate", false);
                                        return;
                                    }
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(viewLIZ2.getResources().getResourceName(i2)));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i)));
    }
}
