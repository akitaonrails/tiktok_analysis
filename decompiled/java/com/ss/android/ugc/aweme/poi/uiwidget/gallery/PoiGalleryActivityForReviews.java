package com.ss.android.ugc.aweme.poi.uiwidget.gallery;

import X.C01GW;
import X.C03EB;
import X.C1185440gxC;
import X.C1189590h3t;
import X.C1191390h6n;
import X.C1191440h6s;
import X.C1196110hEP;
import X.C1202300hOO;
import X.C1203310hQ1;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1697810uHb;
import X.C19ME;
import X.C299020Bno;
import X.C335910DEv;
import X.C339190DRl;
import X.C418460Gay;
import X.C427660Gpo;
import X.C724240Sb0;
import X.C786410Ut5;
import X.EnumC1190240h4w;
import X.EnumC335920DEw;
import X.InterfaceC1294060jmO;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiInnerPageMobData;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
@InterfaceC1294060jmO
public final class PoiGalleryActivityForReviews extends BaseActivity implements PoiReviewGalleryAbility {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGEmITIlLSg2PGHELIOSsrKCM/LTc1Zx88IQItJSM2OjwNKjs6Piw4MAk8OhcpPyY2PzY=";
    public final C01GW LL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(539), "poi_gallery_images", ArrayList.class);
    public final C01GW LLILLJJLI = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(538), "poi_gallery_index", Integer.class);
    public final C01GW LLILLL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(537), "poi_gallery_image_ids", ArrayList.class);
    public final C01GW LLILZ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(540), "poi_gallery_uid", String.class);
    public final C01GW LLILZIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(706), "source_btm_token", String.class);
    public final C01GW LLILZLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(701), "poi_gallery_anchor_data", ArrayList.class);
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(536), "enter_from", String.class);
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(702), "mob_data", PoiInnerPageMobData.class);
    public final C01GW LLJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(705), "reviews_info", C1191390h6n.class);
    public final C01GW LLJI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(704), "poi_common_mob_params", PoiCommonMobParams.class);
    public C1191440h6s LLJIJIL;
    public ViewPager LLJILJIL;
    public C1196110hEP LLJILJILJ;
    public FrameLayout LLJILLL;
    public View LLJJ;
    public TuxIconView LLJJI;
    public View LLJJIII;
    public C1202300hOO LLJJIJI;
    public ScrollView LLJJIJIIJIL;
    public C1203310hQ1 LLJJIJIL;
    public C418460Gay LLJJJ;
    public TuxTextView LLJJJIL;
    public C427660Gpo LLJJJJ;
    public C03EB LLJJJJJIL;
    public ViewGroup LLJJJJLIIL;
    public TuxTextView LLJJL;
    public C1189590h3t LLJJLIIIJLLLLLLLZ;
    public PoiReviewsApi.PoiReviewModel LLJL;
    public C1185440gxC LLJLIL;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryActivityForReviews", "onResume", true);
        super.onResume();
        C1185440gxC c1185440gxC = this.LLJLIL;
        if (c1185440gxC != null) {
            c1185440gxC.LJ();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryActivityForReviews", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryActivityForReviews", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryActivityForReviews", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryActivityForReviews", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final C1191390h6n LLLLZI() {
        return (C1191390h6n) this.LLJ.getValue();
    }

    public final int LLLLZIL() {
        if (((Number) this.LLILLJJLI.getValue()).intValue() < 0 || ((Number) this.LLILLJJLI.getValue()).intValue() >= ((ArrayList) this.LL.getValue()).size()) {
            return 0;
        }
        return ((Number) this.LLILLJJLI.getValue()).intValue();
    }

    public final boolean LLLLZLL() {
        Integer num;
        C1191390h6n c1191390h6nLLLLZI = LLLLZI();
        if (c1191390h6nLLLLZI == null || (num = c1191390h6nLLLLZI.reviewSource) == null) {
            return false;
        }
        if (num.intValue() == EnumC1190240h4w.PoiReviewSource_TikTok.getValue()) {
            return false;
        }
        Integer num2 = c1191390h6nLLLLZI.reviewSource;
        return num2 == null || num2.intValue() != EnumC1190240h4w.POIREVIEWSOURCE_TIKTOKORDER.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        int i;
        int i2;
        super.finish();
        C339190DRl.LIZIZ(this.LLJJIII);
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (C1389600mGU.LIZIZ(this)) {
            i = 0;
            i2 = 0;
        } else {
            i = R.anim.d9;
            i2 = R.anim.d_;
        }
        overridePendingTransition(i, i2);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C1558520qew.LJIIJJI(C1558360qeg.LJI(this, null), PoiReviewGalleryAbility.class, null);
        C1185440gxC c1185440gxC = this.LLJLIL;
        if (c1185440gxC != null) {
            c1185440gxC.LIZJ(this, C724240Sb0.LJI(this));
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
        C1185440gxC c1185440gxC = this.LLJLIL;
        if (c1185440gxC != null) {
            c1185440gxC.LIZLLL();
        }
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

    @Override // com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiReviewGalleryAbility
    public final PoiReviewsApi.PoiReviewModel eq() {
        return this.LLJL;
    }

    public final void LLLLLZL(boolean z) {
        int i;
        C19ME c19me;
        C19ME c19me2;
        C19ME c19me3;
        if (z) {
            i = R.id.tfx;
        } else {
            i = R.id.tfw;
        }
        TuxTextView tuxTextView = this.LLJJJIL;
        if (tuxTextView != null) {
            ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
            if ((layoutParams instanceof C19ME) && (c19me3 = (C19ME) layoutParams) != null) {
                c19me3.startToEnd = i;
                C786410Ut5.R6(tuxTextView, c19me3);
            }
        }
        C1203310hQ1 c1203310hQ1 = this.LLJJIJIL;
        if (c1203310hQ1 != null) {
            ViewGroup.LayoutParams layoutParams2 = c1203310hQ1.getLayoutParams();
            if ((layoutParams2 instanceof C19ME) && (c19me2 = (C19ME) layoutParams2) != null) {
                c19me2.startToEnd = i;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1203310hQ1);
                c1203310hQ1.setLayoutParams(c19me2);
            }
        }
        C418460Gay c418460Gay = this.LLJJJ;
        if (c418460Gay != null) {
            ViewGroup.LayoutParams layoutParams3 = c418460Gay.getLayoutParams();
            if ((layoutParams3 instanceof C19ME) && (c19me = (C19ME) layoutParams3) != null) {
                c19me.startToEnd = i;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c418460Gay);
                c418460Gay.setLayoutParams(c19me);
            }
        }
    }

    public final void LLLLZLLIL(int i) {
        ViewGroup.LayoutParams layoutParams;
        C19ME c19me;
        C19ME c19me2;
        TuxTextView tuxTextView = this.LLJJL;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (tuxTextView != null) {
            layoutParams = tuxTextView.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof C19ME) && (c19me2 = (C19ME) layoutParams) != null) {
            c19me2.startToEnd = i;
            c19me2.topToTop = i;
            c19me2.bottomToBottom = i;
            TuxTextView tuxTextView2 = this.LLJJL;
            if (tuxTextView2 != null) {
                C786410Ut5.R6(tuxTextView2, c19me2);
            }
        }
        C1189590h3t c1189590h3t = this.LLJJLIIIJLLLLLLLZ;
        if (c1189590h3t != null) {
            layoutParams2 = c1189590h3t.getLayoutParams();
        }
        if ((layoutParams2 instanceof C19ME) && (c19me = (C19ME) layoutParams2) != null) {
            c19me.startToEnd = R.id.g39;
            c19me.topToTop = i;
            c19me.bottomToBottom = i;
            C1189590h3t c1189590h3t2 = this.LLJJLIIIJLLLLLLLZ;
            if (c1189590h3t2 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1189590h3t2);
                c1189590h3t2.setLayoutParams(c19me);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiReviewGalleryAbility
    public final void RE1(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        this.LLJL = poiReviewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05ea  */
    /* JADX WARN: Type inference failed for: r6v9, types: [T, android.graphics.drawable.GradientDrawable] */
    /* JADX WARN: Type inference failed for: r9v2, types: [T, android.graphics.drawable.GradientDrawable] */
    /* JADX WARN: Type inference failed for: r9v3, types: [T, android.graphics.drawable.GradientDrawable] */
    /* JADX WARN: Type inference failed for: r9v6, types: [T, android.graphics.drawable.GradientDrawable] */
    /* JADX WARN: Type inference failed for: r9v7, types: [T, android.graphics.drawable.GradientDrawable] */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r29) {
        /*
            Method dump skipped, instruction units count: 1648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryActivityForReviews.onCreate(android.os.Bundle):void");
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C1185440gxC c1185440gxC = this.LLJLIL;
        if (c1185440gxC != null) {
            bundle.putLong("play_time_in_current_page", c1185440gxC.LIZLLL);
        }
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
