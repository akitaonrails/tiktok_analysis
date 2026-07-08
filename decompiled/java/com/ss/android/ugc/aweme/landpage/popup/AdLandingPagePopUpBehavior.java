package com.ss.android.ugc.aweme.landpage.popup;

import X.C01GW;
import X.C452501pT;
import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class AdLandingPagePopUpBehavior extends BottomSheetBehavior<View> {
    public static float LJIIJ;
    public static float LJIIJJI;
    public static boolean LJIIL;
    public static boolean LJIILIIL;
    public final Context LIZ;
    public View LIZJ;
    public String LIZLLL;
    public AwemeRawAd LJ;
    public boolean LJFF;
    public Fragment LJI;
    public boolean LJII;
    public WebView LJIIIIZZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 322));
    public final ARunnableS116S0100000_16 LJIIIZ = new ARunnableS116S0100000_16(this, 61);

    public AdLandingPagePopUpBehavior(Context context) {
        this.LIZ = context;
    }

    public final WebView LIZ(View view) {
        if (view instanceof WebView) {
            return (WebView) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                WebView webViewLIZ = LIZ(viewGroup.getChildAt(i));
                if (webViewLIZ != null) {
                    return webViewLIZ;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0103  */
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(X.C16G0 r10, android.view.View r11, android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.landpage.popup.AdLandingPagePopUpBehavior.onInterceptTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }
}
