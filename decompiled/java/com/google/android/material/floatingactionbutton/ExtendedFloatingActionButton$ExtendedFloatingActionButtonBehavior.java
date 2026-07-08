package com.google.android.material.floatingactionbutton;

import X.C1292440jjm;
import X.C16BC;
import X.C16G0;
import X.C16G1;
import X.C16GX;
import X.C19Q6;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes32.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T extends C19Q6> extends C16BC<T> {
    public Rect LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
        this.LIZJ = true;
    }

    @Override // X.C16BC
    public final void onAttachedToLayoutParams(C16G1 c16g1) {
        if (c16g1.LJII == 0) {
            c16g1.LJII = 80;
        }
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ExtendedFloatingActionButton_Behavior_Layout);
        this.LIZIZ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
        this.LIZJ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void LIZIZ(View view, C19Q6 c19q6) {
        C16G1 c16g1 = (C16G1) c19q6.getLayoutParams();
        if ((!this.LIZIZ && !this.LIZJ) || c16g1.LJFF != view.getId()) {
            return;
        }
        if (view.getTop() < (c19q6.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) c19q6.getLayoutParams()).topMargin) {
            throw null;
        }
        throw null;
    }

    public final void LIZ(C16G0 c16g0, C16GX c16gx, C19Q6 c19q6) {
        C16G1 c16g1 = (C16G1) c19q6.getLayoutParams();
        if ((!this.LIZIZ && !this.LIZJ) || c16g1.LJFF != c16gx.getId()) {
            return;
        }
        if (this.LIZ == null) {
            this.LIZ = new Rect();
        }
        Rect rect = this.LIZ;
        C1292440jjm.LIZ(rect, c16gx, c16g0);
        if (rect.bottom <= c16gx.getMinimumHeightForVisibleOverlappingContent()) {
            throw null;
        }
        throw null;
    }

    @Override // X.C16BC
    public final boolean getInsetDodgeRect(C16G0 c16g0, View view, Rect rect) {
        return super.getInsetDodgeRect(c16g0, view, rect);
    }

    @Override // X.C16BC
    public final boolean onDependentViewChanged(C16G0 c16g0, View view, View view2) {
        C19Q6 c19q6 = (C19Q6) view;
        if (view2 instanceof C16GX) {
            LIZ(c16g0, (C16GX) view2, c19q6);
        } else {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if ((layoutParams instanceof C16G1) && (((C16G1) layoutParams).LIZ instanceof BottomSheetBehavior)) {
                LIZIZ(view2, c19q6);
                return false;
            }
        }
        return false;
    }

    @Override // X.C16BC
    public final boolean onLayoutChild(C16G0 c16g0, View view, int i) {
        C19Q6 c19q6 = (C19Q6) view;
        ArrayList arrayList = (ArrayList) c16g0.LJFF(c19q6);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = (View) ListProtector.get(arrayList, i2);
            if (view2 instanceof C16GX) {
                LIZ(c16g0, (C16GX) view2, c19q6);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if ((layoutParams instanceof C16G1) && (((C16G1) layoutParams).LIZ instanceof BottomSheetBehavior)) {
                    LIZIZ(view2, c19q6);
                }
            }
        }
        c16g0.LJIIL(i, c19q6);
        return true;
    }
}
