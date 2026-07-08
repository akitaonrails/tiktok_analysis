package com.bytedance.android.livesdk.hashtag;

import X.C16G0;
import X.C16GX;
import X.C786410Ut5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;

/* JADX INFO: loaded from: classes20.dex */
public final class HashtagAudienceLayoutBehavior extends AppBarLayout$ScrollingViewBehavior {
    public HashtagAudienceLayoutBehavior() {
    }

    public HashtagAudienceLayoutBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior, X.C16BC
    public final boolean onDependentViewChanged(C16G0 c16g0, View view, View view2) {
        if (!(view2 instanceof C16GX)) {
            super.onDependentViewChanged(c16g0, view, view2);
            return false;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.height = c16g0.getHeight() - view2.getBottom();
        C786410Ut5.W5(view, marginLayoutParams);
        super.onDependentViewChanged(c16g0, view, view2);
        return false;
    }
}
