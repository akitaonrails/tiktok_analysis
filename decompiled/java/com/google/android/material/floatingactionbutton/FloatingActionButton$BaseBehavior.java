package com.google.android.material.floatingactionbutton;

import X.C1292440jjm;
import X.C16BC;
import X.C16G0;
import X.C16G1;
import X.C16GX;
import X.C19Z0;
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
public class FloatingActionButton$BaseBehavior<T extends C19Z0> extends C16BC<T> {
    public Rect LIZ;
    public final boolean LIZIZ;

    public FloatingActionButton$BaseBehavior() {
        this.LIZIZ = true;
    }

    @Override // X.C16BC
    public final void onAttachedToLayoutParams(C16G1 c16g1) {
        if (c16g1.LJII == 0) {
            c16g1.LJII = 80;
        }
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FloatingActionButton_Behavior_Layout);
        this.LIZIZ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final boolean LIZ(View view, C19Z0 c19z0) {
        C16G1 c16g1 = (C16G1) c19z0.getLayoutParams();
        if (!this.LIZIZ || c16g1.LJFF != view.getId() || c19z0.getUserSetVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final boolean LIZJ(View view, C19Z0 c19z0) {
        if (!LIZ(view, c19z0)) {
            return false;
        }
        if (view.getTop() < (c19z0.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) c19z0.getLayoutParams()).topMargin) {
            c19z0.LJFF(null, false);
            return true;
        }
        c19z0.LJIIIZ(null, false);
        return true;
    }

    public final boolean LIZIZ(C16G0 c16g0, C16GX c16gx, C19Z0 c19z0) {
        if (!LIZ(c16gx, c19z0)) {
            return false;
        }
        if (this.LIZ == null) {
            this.LIZ = new Rect();
        }
        Rect rect = this.LIZ;
        C1292440jjm.LIZ(rect, c16gx, c16g0);
        if (rect.bottom <= c16gx.getMinimumHeightForVisibleOverlappingContent()) {
            c19z0.LJFF(null, false);
            return true;
        }
        c19z0.LJIIIZ(null, false);
        return true;
    }

    @Override // X.C16BC
    public final boolean getInsetDodgeRect(C16G0 c16g0, View view, Rect rect) {
        view.getClass();
        view.getLeft();
        throw null;
    }

    @Override // X.C16BC
    public final boolean onDependentViewChanged(C16G0 c16g0, View view, View view2) {
        C19Z0 c19z0 = (C19Z0) view;
        if (view2 instanceof C16GX) {
            LIZIZ(c16g0, (C16GX) view2, c19z0);
        } else {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if ((layoutParams instanceof C16G1) && (((C16G1) layoutParams).LIZ instanceof BottomSheetBehavior)) {
                LIZJ(view2, c19z0);
                return false;
            }
        }
        return false;
    }

    @Override // X.C16BC
    public final boolean onLayoutChild(C16G0 c16g0, View view, int i) {
        C19Z0 c19z0 = (C19Z0) view;
        ArrayList arrayList = (ArrayList) c16g0.LJFF(c19z0);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = (View) ListProtector.get(arrayList, i2);
            if (view2 instanceof C16GX) {
                if (LIZIZ(c16g0, (C16GX) view2, c19z0)) {
                    break;
                }
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if ((layoutParams instanceof C16G1) && (((C16G1) layoutParams).LIZ instanceof BottomSheetBehavior) && LIZJ(view2, c19z0)) {
                    break;
                }
            }
        }
        c16g0.LJIIL(i, c19z0);
        return true;
    }
}
