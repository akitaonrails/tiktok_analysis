package com.google.android.material.transformation;

import X.C16G0;
import X.C16G1;
import X.C194U;
import X.C194V;
import X.C19L4;
import X.C19L5;
import X.C19Z0;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;

/* JADX INFO: loaded from: classes33.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect LIZJ;
    public final RectF LIZLLL;
    public final RectF LJ;
    public final int[] LJFF;
    public float LJI;
    public float LJII;

    public abstract C19L4 LJII(Context context, boolean z);

    public FabTransformationBehavior() {
        this.LIZJ = new Rect();
        this.LIZLLL = new RectF();
        this.LJ = new RectF();
        this.LJFF = new int[2];
    }

    @Override // X.C16BC
    public final void onAttachedToLayoutParams(C16G1 c16g1) {
        if (c16g1.LJII == 0) {
            c16g1.LJII = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LIZJ = new Rect();
        this.LIZLLL = new RectF();
        this.LJ = new RectF();
        this.LJFF = new int[2];
    }

    public final void LJI(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.LJFF);
        rectF.offsetTo(r2[0], r2[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public static float LJFF(C19L4 c19l4, C194U c194u, float f) {
        long j = c194u.LIZ;
        long j2 = c194u.LIZIZ;
        C194U c194uLIZJ = c19l4.LIZ.LIZJ("expansion");
        float interpolation = c194u.LIZIZ().getInterpolation((((c194uLIZJ.LIZ + c194uLIZJ.LIZIZ) + 17) - j) / j2);
        TimeInterpolator timeInterpolator = C194V.LIZ;
        return f + (interpolation * (0.0f - f));
    }

    public final float LIZLLL(View view, View view2, C19L5 c19l5) {
        RectF rectF = this.LIZLLL;
        RectF rectF2 = this.LJ;
        LJI(view, rectF);
        rectF.offset(this.LJI, this.LJII);
        LJI(view2, rectF2);
        c19l5.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float LJ(View view, View view2, C19L5 c19l5) {
        RectF rectF = this.LIZLLL;
        RectF rectF2 = this.LJ;
        LJI(view, rectF);
        rectF.offset(this.LJI, this.LJII);
        LJI(view2, rectF2);
        c19l5.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, X.C16BC
    public final boolean layoutDependsOn(C16G0 c16g0, View view, View view2) {
        if (view.getVisibility() != 8) {
            if (!(view2 instanceof C19Z0)) {
                return false;
            }
            int expandedComponentIdHint = ((C19Z0) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint != 0 && expandedComponentIdHint != view.getId()) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    public static Pair LIZJ(float f, float f2, boolean z, C19L4 c19l4) {
        C194U c194uLIZJ;
        C194U c194uLIZJ2;
        if (f != 0.0f && f2 != 0.0f) {
            if (!z ? f2 <= 0.0f : f2 >= 0.0f) {
                c194uLIZJ = c19l4.LIZ.LIZJ("translationXCurveDownwards");
                c194uLIZJ2 = c19l4.LIZ.LIZJ("translationYCurveDownwards");
            } else {
                c194uLIZJ = c19l4.LIZ.LIZJ("translationXCurveUpwards");
                c194uLIZJ2 = c19l4.LIZ.LIZJ("translationYCurveUpwards");
            }
        } else {
            c194uLIZJ = c19l4.LIZ.LIZJ("translationXLinear");
            c194uLIZJ2 = c19l4.LIZ.LIZJ("translationYLinear");
        }
        return new Pair(c194uLIZJ, c194uLIZJ2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02db  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.AnimatorSet LIZIZ(final android.view.View r26, final android.view.View r27, final boolean r28, boolean r29) {
        /*
            Method dump skipped, instruction units count: 1005
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.LIZIZ(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }
}
