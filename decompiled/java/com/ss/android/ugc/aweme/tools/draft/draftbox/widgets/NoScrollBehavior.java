package com.ss.android.ugc.aweme.tools.draft.draftbox.widgets;

import X.C16G0;
import X.C16GX;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout$Behavior;

/* JADX INFO: loaded from: classes12.dex */
public final class NoScrollBehavior extends AppBarLayout$Behavior {
    public static final /* synthetic */ int LIZIZ = 0;
    public boolean LIZ;

    public NoScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LIZ = true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final boolean onStartNestedScroll(C16G0 c16g0, C16GX c16gx, View view, View view2, int i, int i2) {
        if (this.LIZ) {
            return super.onStartNestedScroll(c16g0, c16gx, view, view2, i, i2);
        }
        return false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, X.C16BC
    public final /* bridge */ /* synthetic */ boolean onStartNestedScroll(C16G0 c16g0, View view, View view2, View view3, int i, int i2) {
        return onStartNestedScroll(c16g0, (C16GX) view, view2, view3, i, i2);
    }
}
