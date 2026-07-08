package com.ss.android.ugc.aweme.ecommerce.showcase.mix.event;

import X.C09CT;
import X.C0H9H;
import X.C786410Ut5;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.mix.base.BaseMixEvent;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class BaseStoreOverlayEvent extends BaseMixEvent {

    @C09CT("bottom")
    public final Float bottom;

    @C09CT("height")
    public final Float height;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("left")
    public final Float left;

    @C09CT("right")
    public final Float right;

    @C09CT("top")
    public final Float top;

    @C09CT("width")
    public final Float width;

    public static int LIZIZ(Float f) {
        if (f != null && f.floatValue() > 0.0f) {
            return (int) C0H9H.LIZ(f.floatValue());
        }
        return -1;
    }

    public final void LIZ(FrameLayout frameLayout, boolean z) {
        FrameLayout.LayoutParams layoutParams;
        if (z) {
            layoutParams = new FrameLayout.LayoutParams(LIZIZ(this.width), LIZIZ(this.height));
        } else {
            layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.width = LIZIZ(this.width);
            layoutParams.height = LIZIZ(this.height);
        }
        if (Intrinsics.LIZLLL(this.top, 0.0f) && Intrinsics.LIZLLL(this.bottom, 0.0f) && Intrinsics.LIZLLL(this.left, 0.0f) && Intrinsics.LIZLLL(this.right, 0.0f)) {
            layoutParams.gravity = 17;
        } else {
            Float f = this.top;
            if (f != null && f.floatValue() >= 0.0f) {
                int i = layoutParams.gravity;
                if (i > 0) {
                    layoutParams.gravity = i | 48;
                } else {
                    layoutParams.gravity = 48;
                }
                layoutParams.topMargin = (int) C0H9H.LIZ(this.top.floatValue());
            }
            Float f2 = this.bottom;
            if (f2 != null && f2.floatValue() >= 0.0f) {
                int i2 = layoutParams.gravity;
                if (i2 > 0) {
                    layoutParams.gravity = i2 | 80;
                } else {
                    layoutParams.gravity = 80;
                }
                layoutParams.bottomMargin = (int) C0H9H.LIZ(this.bottom.floatValue());
            }
            Float f3 = this.right;
            if (f3 != null && f3.floatValue() >= 0.0f) {
                int i3 = layoutParams.gravity;
                if (i3 > 0) {
                    layoutParams.gravity = i3 | 8388613;
                } else {
                    layoutParams.gravity = 8388613;
                }
                layoutParams.rightMargin = (int) C0H9H.LIZ(this.right.floatValue());
            }
            Float f4 = this.left;
            if (f4 != null && f4.floatValue() >= 0.0f) {
                int i4 = layoutParams.gravity;
                if (i4 > 0) {
                    layoutParams.gravity = i4 | 8388611;
                } else {
                    layoutParams.gravity = 8388611;
                }
                layoutParams.leftMargin = (int) C0H9H.LIZ(this.left.floatValue());
            }
        }
        C786410Ut5.a6(frameLayout, layoutParams);
    }
}
