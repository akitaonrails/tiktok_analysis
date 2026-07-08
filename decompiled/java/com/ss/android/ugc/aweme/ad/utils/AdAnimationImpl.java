package com.ss.android.ugc.aweme.ad.utils;

import X.C04TD;
import X.C421740GgG;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.commercialize.service.IAdAnimation;

/* JADX INFO: loaded from: classes17.dex */
public final class AdAnimationImpl implements IAdAnimation {
    public static IAdAnimation LIZIZ() {
        Object objLIZ = C04TD.LIZ(IAdAnimation.class, false);
        return objLIZ != null ? (IAdAnimation) objLIZ : new AdAnimationImpl();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAdAnimation
    public final void LIZ(View view, int i, int i2, boolean z) {
        if (view != null) {
            int i3 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
            if (z) {
                if (i3 < 0) {
                    C421740GgG.LIZIZ(view, i3, i, i2).start();
                }
            } else {
                if (i3 < 0) {
                    return;
                }
                C421740GgG.LIZIZ(view, i3, i, i2).start();
            }
        }
    }
}
