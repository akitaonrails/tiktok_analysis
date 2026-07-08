package com.google.android.material.transformation;

import X.C16G0;
import X.C16G1;
import X.C194T;
import X.C19L4;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    public Map<View, Integer> LJIIIIZZ;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.19L5] */
    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public final C19L4 LJII(Context context, boolean z) {
        int i;
        if (z) {
            i = R.animator.t;
        } else {
            i = R.animator.s;
        }
        C19L4 c19l4 = new C19L4();
        c19l4.LIZ = C194T.LIZ(i, context);
        c19l4.LIZIZ = new Object() { // from class: X.19L5
        };
        return c19l4;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public final void LIZ(View view, View view2, boolean z, boolean z2) {
        boolean z3;
        ViewParent parent = view2.getParent();
        if (parent instanceof C16G0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            int childCount = viewGroup.getChildCount();
            if (z) {
                this.LJIIIIZZ = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((childAt.getLayoutParams() instanceof C16G1) && (((C16G1) childAt.getLayoutParams()).LIZ instanceof FabTransformationScrimBehavior)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (childAt != view2 && !z3) {
                    if (!z) {
                        Map<View, Integer> map = this.LJIIIIZZ;
                        if (map != null && ((HashMap) map).containsKey(childAt)) {
                            childAt.setImportantForAccessibility(((Integer) ((HashMap) this.LJIIIIZZ).get(childAt)).intValue());
                        }
                    } else {
                        ((HashMap) this.LJIIIIZZ).put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        childAt.setImportantForAccessibility(4);
                    }
                }
            }
            if (!z) {
                this.LJIIIIZZ = null;
            }
        }
        super.LIZ(view, view2, z, z2);
    }
}
