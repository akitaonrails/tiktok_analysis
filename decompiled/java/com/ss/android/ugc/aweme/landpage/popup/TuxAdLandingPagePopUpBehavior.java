package com.ss.android.ugc.aweme.landpage.popup;

import X.C01GW;
import X.C452501pT;
import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class TuxAdLandingPagePopUpBehavior extends TuxSheetBehavior<View> {
    public static float LJJJJJL;
    public static float LJJJJL;
    public static boolean LJJJJLI;
    public static boolean LJJJJLL;
    public final Context LJJIJLIJ;
    public View LJJIZ;
    public String LJJJ;
    public AwemeRawAd LJJJI;
    public boolean LJJJIL;
    public Fragment LJJJJ;
    public boolean LJJJJI;
    public WebView LJJJJIZL;
    public final C01GW LJJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 323));
    public final ARunnableS116S0100000_16 LJJJJJ = new ARunnableS116S0100000_16(this, 62);

    public TuxAdLandingPagePopUpBehavior(Context context) {
        this.LJJIJLIJ = context;
    }

    public final WebView LJI(View view) {
        if (view instanceof WebView) {
            return (WebView) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                WebView webViewLJI = LJI(viewGroup.getChildAt(i));
                if (webViewLJI != null) {
                    return webViewLJI;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0103  */
    @Override // com.bytedance.tux.sheet.sheet.TuxSheetBehavior, X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(X.C16G0 r10, android.view.View r11, android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.landpage.popup.TuxAdLandingPagePopUpBehavior.onInterceptTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }
}
