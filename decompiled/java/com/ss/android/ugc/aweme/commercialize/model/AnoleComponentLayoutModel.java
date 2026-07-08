package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleComponentLayoutModel implements Serializable {

    @C09CT("angle")
    public final int angle;

    @C09CT("bottom")
    public final double bottom;

    @C09CT("bottom_constraint")
    public final AnoleComponentLayoutConstraintModel bottomConstraint;

    @C09CT("left")
    public final double left;

    @C09CT("left_constraint")
    public final AnoleComponentLayoutConstraintModel leftConstraint;

    @C09CT("right")
    public final double right;

    @C09CT("right_constraint")
    public final AnoleComponentLayoutConstraintModel rightConstraint;

    @C09CT("top")
    public final double top;

    @C09CT("top_constraint")
    public final AnoleComponentLayoutConstraintModel topConstraint;

    @C09CT("type")
    public final String type;

    @C09CT("x")
    public final double x;

    @C09CT("y")
    public final double y;

    public AnoleComponentLayoutModel(String str, double d, double d2, double d3, double d4, double d5, double d6, AnoleComponentLayoutConstraintModel anoleComponentLayoutConstraintModel, AnoleComponentLayoutConstraintModel anoleComponentLayoutConstraintModel2, AnoleComponentLayoutConstraintModel anoleComponentLayoutConstraintModel3, AnoleComponentLayoutConstraintModel anoleComponentLayoutConstraintModel4, int i) {
        this.type = str;
        this.x = d;
        this.y = d2;
        this.left = d3;
        this.top = d4;
        this.right = d5;
        this.bottom = d6;
        this.leftConstraint = anoleComponentLayoutConstraintModel;
        this.rightConstraint = anoleComponentLayoutConstraintModel2;
        this.topConstraint = anoleComponentLayoutConstraintModel3;
        this.bottomConstraint = anoleComponentLayoutConstraintModel4;
        this.angle = i;
    }
}
