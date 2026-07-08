package com.ss.android.ugc.aweme.poi.uiwidget.gallery.reviews;

import X.C01GW;
import X.C1185440gxC;
import X.C1191440h6s;
import X.C1196110hEP;
import X.C1202300hOO;
import X.C1203310hQ1;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1697810uHb;
import X.C299020Bno;
import X.C335910DEv;
import X.C339190DRl;
import X.C427660Gpo;
import X.EnumC335920DEw;
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
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiReviewsGalleryActivity extends BaseActivity implements PoiReviewGalleryAbility {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGEmITIlLSg2PGsrKCHELIOSM/LTc1Zz02PiwpPjx9GColGyolISA7OggyJCkpOzYSKzElPyYnMQ==";
    public PoiReviewsGalleryData LLILZLL;
    public C1191440h6s LLIZLLLIL;
    public ViewPager LLJ;
    public C1196110hEP LLJI;
    public FrameLayout LLJIJIL;
    public View LLJILJIL;
    public TuxIconView LLJILJILJ;
    public View LLJILLL;
    public C1202300hOO LLJJ;
    public ScrollView LLJJI;
    public C1203310hQ1 LLJJIII;
    public TuxTextView LLJJIJI;
    public C427660Gpo LLJJIJIIJIL;
    public ViewGroup LLJJIJIL;
    public TuxTextView LLJJJ;
    public C1185440gxC LLJJJIL;
    public final C01GW LL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(545), "images", ArrayList.class);
    public final C01GW LLILLJJLI = RouteArgExtension.INSTANCE.requiredArg(this, AFwS206S0000000_18.get$arr$(546), "index", Integer.class);
    public final C01GW LLILLL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(720), "origin_pos", ArrayList.class);
    public final C01GW LLILZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(722), "track_params", PoiReviewsGalleryMobData.class);
    public final C01GW LLILZIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(718), "reviews_info", PoiReviewsGalleryData.class);
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(721), "poi_common_mob_params", PoiCommonMobParams.class);

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.poi.uiwidget.gallery.reviews.PoiReviewsGalleryActivity", "onResume", true);
        super.onResume();
        C1185440gxC c1185440gxC = this.LLJJJIL;
        if (c1185440gxC != null) {
            c1185440gxC.LJ();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.poi.uiwidget.gallery.reviews.PoiReviewsGalleryActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.poi.uiwidget.gallery.reviews.PoiReviewsGalleryActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.poi.uiwidget.gallery.reviews.PoiReviewsGalleryActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.poi.uiwidget.gallery.reviews.PoiReviewsGalleryActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final PoiReviewsGalleryMobData LLLLLZL() {
        return (PoiReviewsGalleryMobData) this.LLILZ.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        int i;
        int i2;
        super.finish();
        C339190DRl.LIZIZ(this.LLJILLL);
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
        C1185440gxC c1185440gxC = this.LLJJJIL;
        if (c1185440gxC != null) {
            c1185440gxC.LIZJ(this, null);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
        C1185440gxC c1185440gxC = this.LLJJJIL;
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

    @Override // com.ss.android.ugc.aweme.poi.uiwidget.gallery.reviews.PoiReviewGalleryAbility
    public final PoiReviewsGalleryData eq() {
        return this.LLILZLL;
    }

    @Override // com.ss.android.ugc.aweme.poi.uiwidget.gallery.reviews.PoiReviewGalleryAbility
    public final void K61(PoiReviewsGalleryData poiReviewsGalleryData) {
        PoiReviewsGalleryData poiReviewsGalleryDataCopy;
        if (poiReviewsGalleryData != null) {
            PoiReviewsGalleryData poiReviewsGalleryData2 = this.LLILZLL;
            if (poiReviewsGalleryData2 != null) {
                PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModel = poiReviewsGalleryData.userStatus;
                poiReviewsGalleryDataCopy = poiReviewsGalleryData2.copy(poiReviewsGalleryData2.content, poiReviewsGalleryData2.author, poiReviewsGalleryData2.reviewId, poiReviewsGalleryData2.poiId, poiReviewsGalleryData.statistics, poiReviewsGalleryData2.source, poiReviewsGalleryData2.isAnonymous, poiReviewUserStatusModel, poiReviewsGalleryData2.serverParam, poiReviewsGalleryData2.reviewContent, poiReviewsGalleryData2.hasTranslate, poiReviewsGalleryData2.reviewOrder, poiReviewsGalleryData2.bottomDesc);
            } else {
                poiReviewsGalleryDataCopy = null;
            }
            this.LLILZLL = poiReviewsGalleryDataCopy;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x046c  */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, android.graphics.drawable.GradientDrawable] */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, android.graphics.drawable.GradientDrawable] */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, android.graphics.drawable.GradientDrawable] */
    /* JADX WARN: Type inference failed for: r8v4, types: [T, android.graphics.drawable.GradientDrawable] */
    /* JADX WARN: Type inference failed for: r8v5, types: [T, android.graphics.drawable.GradientDrawable] */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r33) {
        /*
            Method dump skipped, instruction units count: 1240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.uiwidget.gallery.reviews.PoiReviewsGalleryActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C1185440gxC c1185440gxC = this.LLJJJIL;
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
