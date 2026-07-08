package com.bytedance.ies.sdk.widgets;

import X.C1083090eI7;
import X.C1083340eIW;
import X.C19ME;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes18.dex */
public class ConstraintProperty {
    public ViewGroup container;
    public float mAlpha;
    public LayeredConstraintLayout$LayoutParams mParams;
    public PropertyResolver mPropertyResolver;
    public float mRotation;
    public float mScaleX;
    public float mScaleY;
    public float mTranslationX;
    public float mTranslationY;
    public View mView;
    public int mVisibility;

    private String sideToString(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public ViewPropertyAnimator animate() {
        return this.mView.animate();
    }

    public void apply() {
        ViewGroup viewGroup = this.container;
        if (viewGroup instanceof C1083340eIW) {
            ((C1083340eIW) viewGroup).updateView(this.mView, this.mParams);
        }
        C786410Ut5.W5(this.mView, this.mParams);
    }

    public ConstraintProperty disableNonOverlapping() {
        this.mView.setTag(R.id.n9c, Boolean.FALSE);
        return this;
    }

    public int id() {
        return this.mView.getId();
    }

    public int layer() {
        return this.mParams.getLayer();
    }

    public int order() {
        return this.mParams.getOrder();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.ies.sdk.widgets.ConstraintProperty removeFromHorizontalChain() {
        /*
            r11 = this;
            com.bytedance.ies.sdk.widgets.LayeredConstraintLayout$LayoutParams r0 = r11.mParams
            int r10 = r0.leftToRight
            int r6 = r0.rightToLeft
            r8 = 0
            r7 = -1
            if (r10 != r7) goto L5d
            if (r6 != r7) goto L5d
            int r9 = r0.startToEnd
            int r6 = r0.endToStart
            r5 = 7
            r4 = 6
            if (r9 != r7) goto L16
            if (r6 == r7) goto L44
        L16:
            android.view.View r0 = r11.mView
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            android.view.View r0 = r0.findViewById(r9)
            com.bytedance.ies.sdk.widgets.ConstraintProperty r3 = new com.bytedance.ies.sdk.widgets.ConstraintProperty
            r3.<init>(r0)
            android.view.View r0 = r11.mView
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            android.view.View r0 = r0.findViewById(r6)
            com.bytedance.ies.sdk.widgets.ConstraintProperty r2 = new com.bytedance.ies.sdk.widgets.ConstraintProperty
            r2.<init>(r0)
            com.bytedance.ies.sdk.widgets.LayeredConstraintLayout$LayoutParams r1 = r11.mParams
            if (r9 == r7) goto L4b
            if (r6 == r7) goto L44
            r3.connect(r5, r6, r4, r8)
            r2.connect(r4, r10, r5, r8)
        L44:
            r11.removeConstraints(r4)
            r11.removeConstraints(r5)
            return r11
        L4b:
            if (r6 == r7) goto L44
            int r0 = r1.rightToRight
            if (r0 == r7) goto L55
            r3.connect(r5, r0, r5, r8)
            goto L44
        L55:
            int r0 = r1.leftToLeft
            if (r0 == r7) goto L44
            r2.connect(r4, r0, r4, r8)
            goto L44
        L5d:
            android.view.View r0 = r11.mView
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            android.view.View r0 = r0.findViewById(r10)
            com.bytedance.ies.sdk.widgets.ConstraintProperty r5 = new com.bytedance.ies.sdk.widgets.ConstraintProperty
            r5.<init>(r0)
            android.view.View r0 = r11.mView
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            android.view.View r0 = r0.findViewById(r6)
            com.bytedance.ies.sdk.widgets.ConstraintProperty r4 = new com.bytedance.ies.sdk.widgets.ConstraintProperty
            r4.<init>(r0)
            com.bytedance.ies.sdk.widgets.LayeredConstraintLayout$LayoutParams r3 = r11.mParams
            r2 = 1
            r1 = 2
            if (r10 == r7) goto L96
            if (r6 == r7) goto L94
            r5.connect(r1, r6, r2, r8)
            r4.connect(r2, r10, r1, r8)
        L8d:
            r11.removeConstraints(r2)
            r11.removeConstraints(r1)
            return r11
        L94:
            if (r10 != r7) goto L98
        L96:
            if (r6 == r7) goto L8d
        L98:
            int r0 = r3.rightToRight
            if (r0 == r7) goto La0
            r5.connect(r1, r0, r1, r8)
            goto L8d
        La0:
            int r0 = r3.leftToLeft
            if (r0 == r7) goto L8d
            r4.connect(r2, r0, r2, r8)
            goto L8d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.sdk.widgets.ConstraintProperty.removeFromHorizontalChain():com.bytedance.ies.sdk.widgets.ConstraintProperty");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.ies.sdk.widgets.ConstraintProperty removeFromVerticalChain() {
        /*
            r10 = this;
            com.bytedance.ies.sdk.widgets.LayeredConstraintLayout$LayoutParams r0 = r10.mParams
            int r9 = r0.topToBottom
            int r8 = r0.bottomToTop
            r7 = 4
            r6 = 3
            r5 = -1
            if (r9 != r5) goto Ld
            if (r8 == r5) goto L3c
        Ld:
            android.view.View r0 = r10.mView
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            android.view.View r0 = r0.findViewById(r9)
            com.bytedance.ies.sdk.widgets.ConstraintProperty r4 = new com.bytedance.ies.sdk.widgets.ConstraintProperty
            r4.<init>(r0)
            android.view.View r0 = r10.mView
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            android.view.View r0 = r0.findViewById(r8)
            com.bytedance.ies.sdk.widgets.ConstraintProperty r3 = new com.bytedance.ies.sdk.widgets.ConstraintProperty
            r3.<init>(r0)
            com.bytedance.ies.sdk.widgets.LayeredConstraintLayout$LayoutParams r2 = r10.mParams
            r1 = 0
            if (r9 == r5) goto L45
            if (r8 == r5) goto L43
            r4.connect(r7, r8, r6, r1)
            r3.connect(r6, r9, r7, r1)
        L3c:
            r10.removeConstraints(r6)
            r10.removeConstraints(r7)
            return r10
        L43:
            if (r9 != r5) goto L47
        L45:
            if (r8 == r5) goto L3c
        L47:
            int r0 = r2.bottomToBottom
            if (r0 == r5) goto L4f
            r4.connect(r7, r0, r7, r1)
            goto L3c
        L4f:
            int r0 = r2.topToTop
            if (r0 == r5) goto L3c
            r3.connect(r6, r0, r6, r1)
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.sdk.widgets.ConstraintProperty.removeFromVerticalChain():com.bytedance.ies.sdk.widgets.ConstraintProperty");
    }

    public float alpha() {
        return this.mAlpha;
    }

    public View getView() {
        return this.mView;
    }

    public float translationX() {
        return this.mTranslationX;
    }

    public float translationY() {
        return this.mTranslationY;
    }

    public int visibility() {
        return this.mVisibility;
    }

    public ConstraintProperty(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        this.mView = view;
        this.mAlpha = view.getAlpha();
        this.mScaleX = this.mView.getScaleX();
        this.mScaleY = this.mView.getScaleY();
        this.mRotation = this.mView.getRotation();
        this.mTranslationX = this.mView.getTranslationX();
        this.mTranslationY = this.mView.getTranslationY();
        this.mVisibility = this.mView.getVisibility();
        if (layoutParams == null) {
            this.mParams = new LayeredConstraintLayout$LayoutParams(-2, -2);
        } else if (layoutParams instanceof C19ME) {
            this.mParams = (LayeredConstraintLayout$LayoutParams) layoutParams;
        } else {
            this.mParams = new LayeredConstraintLayout$LayoutParams(layoutParams.width, layoutParams.height);
        }
    }

    public ConstraintProperty addToHorizontalChainHeadRtl(int i) {
        int i2;
        if (i == 0) {
            i2 = 6;
        } else {
            i2 = 7;
        }
        connect(6, i, i2, 0);
        return this;
    }

    public ConstraintProperty addToHorizontalChainTailRtl(int i) {
        int i2;
        if (i == 0) {
            i2 = 7;
        } else {
            i2 = 6;
        }
        connect(7, i, i2, 0);
        return this;
    }

    public ConstraintProperty alpha(float f) {
        this.mAlpha = f;
        View view = this.mView;
        PropertyResolver propertyResolver = this.mPropertyResolver;
        if (propertyResolver != null) {
            f = propertyResolver.getResolvedAlpha(view.getId());
        }
        C786410Ut5.T4(view, f);
        return this;
    }

    public void applyAndUpdate(ViewGroup viewGroup) {
        if (viewGroup instanceof C1083340eIW) {
            ((C1083340eIW) viewGroup).updateView(this.mView, this.mParams);
        }
        C786410Ut5.W5(this.mView, this.mParams);
    }

    public ConstraintProperty centerHorizontally(int i) {
        if (i == 0) {
            center(0, 1, 0, 0, 2, 0, 0.5f);
            return this;
        }
        center(i, 2, 0, i, 1, 0, 0.5f);
        return this;
    }

    public ConstraintProperty centerHorizontallyRtl(int i) {
        if (i == 0) {
            center(0, 6, 0, 0, 7, 0, 0.5f);
            return this;
        }
        center(i, 7, 0, i, 6, 0, 0.5f);
        return this;
    }

    public ConstraintProperty centerVertically(int i) {
        if (i == 0) {
            center(0, 3, 0, 0, 4, 0, 0.5f);
            return this;
        }
        center(i, 4, 0, i, 3, 0, 0.5f);
        return this;
    }

    public ConstraintProperty constrainDefaultHeight(int i) {
        this.mParams.matchConstraintDefaultHeight = i;
        return this;
    }

    public ConstraintProperty constrainDefaultWidth(int i) {
        this.mParams.matchConstraintDefaultWidth = i;
        return this;
    }

    public ConstraintProperty constrainHeight(int i) {
        ((ViewGroup.MarginLayoutParams) this.mParams).height = i;
        return this;
    }

    public ConstraintProperty constrainMaxHeight(int i) {
        this.mParams.matchConstraintMaxHeight = i;
        return this;
    }

    public ConstraintProperty constrainMaxWidth(int i) {
        this.mParams.matchConstraintMaxWidth = i;
        return this;
    }

    public ConstraintProperty constrainMinHeight(int i) {
        this.mParams.matchConstraintMinHeight = i;
        return this;
    }

    public ConstraintProperty constrainMinWidth(int i) {
        this.mParams.matchConstraintMinWidth = i;
        return this;
    }

    public ConstraintProperty constrainWidth(int i) {
        ((ViewGroup.MarginLayoutParams) this.mParams).width = i;
        return this;
    }

    public ConstraintProperty dimensionRatio(String str) {
        this.mParams.dimensionRatio = str;
        return this;
    }

    public ConstraintProperty elevation(float f) {
        this.mView.setElevation(f);
        return this;
    }

    public ConstraintProperty forceHasOverlappingRendering(boolean z) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.mView.forceHasOverlappingRendering(z);
        }
        return this;
    }

    public ConstraintProperty forceHasOverlappingRenderingCompat(boolean z) throws Throwable {
        View view = this.mView;
        if (view instanceof C1083090eI7) {
            ((C1083090eI7) view).forceHasOverlappingRenderingCompat(z);
        }
        return this;
    }

    public ConstraintProperty horizontalBias(float f) {
        this.mParams.horizontalBias = f;
        return this;
    }

    public ConstraintProperty horizontalChainStyle(int i) {
        this.mParams.horizontalChainStyle = i;
        return this;
    }

    public ConstraintProperty horizontalWeight(float f) {
        this.mParams.horizontalWeight = f;
        return this;
    }

    public ConstraintProperty layer(int i) {
        this.mParams.setLayer(i);
        return this;
    }

    public int margin(int i) {
        switch (i) {
            case 1:
                return ((ViewGroup.MarginLayoutParams) this.mParams).leftMargin;
            case 2:
                return ((ViewGroup.MarginLayoutParams) this.mParams).rightMargin;
            case 3:
                return ((ViewGroup.MarginLayoutParams) this.mParams).topMargin;
            case 4:
                return ((ViewGroup.MarginLayoutParams) this.mParams).bottomMargin;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                return this.mParams.getMarginStart();
            case 7:
                return this.mParams.getMarginEnd();
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public ConstraintProperty order(int i) {
        this.mParams.setOrder(i);
        return this;
    }

    public ConstraintProperty removeConstraints(int i) {
        switch (i) {
            case 1:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams = this.mParams;
                layeredConstraintLayout$LayoutParams.leftToRight = -1;
                layeredConstraintLayout$LayoutParams.leftToLeft = -1;
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams).leftMargin = -1;
                layeredConstraintLayout$LayoutParams.goneLeftMargin = -1;
                return this;
            case 2:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams2 = this.mParams;
                layeredConstraintLayout$LayoutParams2.rightToRight = -1;
                layeredConstraintLayout$LayoutParams2.rightToLeft = -1;
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams2).rightMargin = -1;
                layeredConstraintLayout$LayoutParams2.goneRightMargin = -1;
                return this;
            case 3:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams3 = this.mParams;
                layeredConstraintLayout$LayoutParams3.topToBottom = -1;
                layeredConstraintLayout$LayoutParams3.topToTop = -1;
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams3).topMargin = -1;
                layeredConstraintLayout$LayoutParams3.goneTopMargin = -1;
                return this;
            case 4:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams4 = this.mParams;
                layeredConstraintLayout$LayoutParams4.bottomToTop = -1;
                layeredConstraintLayout$LayoutParams4.bottomToBottom = -1;
                ((ViewGroup.MarginLayoutParams) layeredConstraintLayout$LayoutParams4).bottomMargin = -1;
                layeredConstraintLayout$LayoutParams4.goneBottomMargin = -1;
                return this;
            case 5:
                this.mParams.baselineToBaseline = -1;
                return this;
            case 6:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams5 = this.mParams;
                layeredConstraintLayout$LayoutParams5.startToEnd = -1;
                layeredConstraintLayout$LayoutParams5.startToStart = -1;
                layeredConstraintLayout$LayoutParams5.setMarginStart(-1);
                this.mParams.goneStartMargin = -1;
                return this;
            case 7:
                LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams6 = this.mParams;
                layeredConstraintLayout$LayoutParams6.endToStart = -1;
                layeredConstraintLayout$LayoutParams6.endToEnd = -1;
                layeredConstraintLayout$LayoutParams6.setMarginEnd(-1);
                this.mParams.goneEndMargin = -1;
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void resetView(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C19ME) {
            this.mParams = (LayeredConstraintLayout$LayoutParams) layoutParams;
            this.mView = view;
            this.mAlpha = view.getAlpha();
            this.mScaleX = this.mView.getScaleX();
            this.mScaleY = this.mView.getScaleY();
            this.mRotation = this.mView.getRotation();
            this.mTranslationX = this.mView.getTranslationX();
            this.mTranslationY = this.mView.getTranslationY();
            this.mVisibility = this.mView.getVisibility();
        }
        if ((view instanceof C1083090eI7) && ((C1083090eI7) view).isEnableOpt()) {
            this.mView = view;
            this.mAlpha = view.getAlpha();
            this.mScaleX = this.mView.getScaleX();
            this.mScaleY = this.mView.getScaleY();
            this.mRotation = this.mView.getRotation();
            this.mTranslationX = this.mView.getTranslationX();
            this.mTranslationY = this.mView.getTranslationY();
            this.mVisibility = this.mView.getVisibility();
        }
    }

    public ConstraintProperty rotation(float f) {
        this.mRotation = f;
        C786410Ut5.Ab(this.mView, f);
        return this;
    }

    public ConstraintProperty rotationX(float f) {
        C786410Ut5.Hb(this.mView, f);
        return this;
    }

    public ConstraintProperty rotationY(float f) {
        C786410Ut5.Ib(this.mView, f);
        return this;
    }

    public ConstraintProperty scaleX(float f) {
        this.mScaleX = f;
        C786410Ut5.Ob(this.mView, f);
        return this;
    }

    public ConstraintProperty scaleY(float f) {
        this.mScaleY = f;
        C786410Ut5.pc(this.mView, f);
        return this;
    }

    public ConstraintProperty transformPivotX(float f) {
        this.mView.setPivotX(f);
        return this;
    }

    public ConstraintProperty transformPivotY(float f) {
        this.mView.setPivotY(f);
        return this;
    }

    public ConstraintProperty translationX(float f) {
        this.mTranslationX = f;
        View view = this.mView;
        PropertyResolver propertyResolver = this.mPropertyResolver;
        if (propertyResolver != null) {
            f = propertyResolver.getResolvedTranslationX(view.getId());
        }
        C786410Ut5.Jc(view, f);
        return this;
    }

    public ConstraintProperty translationY(float f) {
        this.mTranslationY = f;
        View view = this.mView;
        PropertyResolver propertyResolver = this.mPropertyResolver;
        if (propertyResolver != null) {
            f = propertyResolver.getResolvedTranslationY(view.getId());
        }
        C786410Ut5.ed(view, f);
        return this;
    }

    public ConstraintProperty translationZ(float f) {
        this.mView.setTranslationZ(f);
        return this;
    }

    public ConstraintProperty verticalBias(float f) {
        this.mParams.verticalBias = f;
        return this;
    }

    public ConstraintProperty verticalChainStyle(int i) {
        this.mParams.verticalChainStyle = i;
        return this;
    }

    public ConstraintProperty verticalWeight(float f) {
        this.mParams.verticalWeight = f;
        return this;
    }

    public ConstraintProperty visibility(int i) {
        boolean z;
        this.mVisibility = i;
        PropertyResolver propertyResolver = this.mPropertyResolver;
        if (propertyResolver != null) {
            i = propertyResolver.getResolvedVisibility(this.mView.getId());
        }
        C786410Ut5.LJLLLLLL(i, this.mView);
        if (i != this.mVisibility) {
            PropertyResolver propertyResolver2 = this.mPropertyResolver;
            int iId = id();
            if (i == 8) {
                z = true;
            } else {
                z = false;
            }
            propertyResolver2.onHiddenChanged(iId, z);
        }
        return this;
    }

    public ConstraintProperty(View view, ConstraintProperty constraintProperty) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C19ME) {
            this.mParams = (LayeredConstraintLayout$LayoutParams) layoutParams;
            this.mView = view;
            this.mAlpha = constraintProperty.mAlpha;
            this.mScaleX = constraintProperty.mScaleX;
            this.mScaleY = constraintProperty.mScaleY;
            this.mRotation = constraintProperty.mRotation;
            this.mTranslationX = constraintProperty.mTranslationX;
            this.mTranslationY = constraintProperty.mTranslationY;
            this.mVisibility = constraintProperty.mVisibility;
            return;
        }
        throw new RuntimeException("Only children of ConstraintLayout.LayoutParams supported");
    }

    public ConstraintProperty addToHorizontalChain(int i, int i2) {
        int i3;
        int i4;
        if (i == 0) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        connect(1, i, i3, 0);
        if (i2 == 0) {
            i4 = 2;
        } else {
            i4 = 1;
        }
        connect(2, i2, i4, 0);
        if (i != 0) {
            new ConstraintProperty(((View) this.mView.getParent()).findViewById(i)).connect(2, this.mView.getId(), 1, 0);
        }
        if (i2 != 0) {
            new ConstraintProperty(((View) this.mView.getParent()).findViewById(i2)).connect(1, this.mView.getId(), 2, 0);
        }
        return this;
    }

    public ConstraintProperty addToHorizontalChainRtl(int i, int i2) {
        int i3;
        int i4;
        if (i == 0) {
            i3 = 6;
        } else {
            i3 = 7;
        }
        connect(6, i, i3, 0);
        if (i2 == 0) {
            i4 = 7;
        } else {
            i4 = 6;
        }
        connect(7, i2, i4, 0);
        if (i != 0) {
            new ConstraintProperty(((View) this.mView.getParent()).findViewById(i)).connect(7, this.mView.getId(), 6, 0);
        }
        if (i2 != 0) {
            new ConstraintProperty(((View) this.mView.getParent()).findViewById(i2)).connect(6, this.mView.getId(), 7, 0);
        }
        return this;
    }

    public ConstraintProperty addToVerticalChain(int i, int i2) {
        int i3;
        int i4;
        if (i == 0) {
            i3 = 3;
        } else {
            i3 = 4;
        }
        connect(3, i, i3, 0);
        if (i2 == 0) {
            i4 = 4;
        } else {
            i4 = 3;
        }
        connect(4, i2, i4, 0);
        if (i != 0) {
            new ConstraintProperty(((View) this.mView.getParent()).findViewById(i)).connect(4, this.mView.getId(), 3, 0);
        }
        if (i2 != 0) {
            new ConstraintProperty(((View) this.mView.getParent()).findViewById(i2)).connect(3, this.mView.getId(), 4, 0);
        }
        return this;
    }

    public ConstraintProperty bottomToBottom(int i, int i2) {
        connect(4, i, 4, i2);
        return this;
    }

    public ConstraintProperty bottomToTop(int i, int i2) {
        connect(4, i, 3, i2);
        return this;
    }

    public ConstraintProperty endToEnd(int i, int i2) {
        connect(7, i, 7, i2);
        return this;
    }

    public ConstraintProperty endToStart(int i, int i2) {
        connect(7, i, 6, i2);
        return this;
    }

    public ConstraintProperty goneMargin(int i, int i2) {
        switch (i) {
            case 1:
                this.mParams.goneLeftMargin = i2;
                return this;
            case 2:
                this.mParams.goneRightMargin = i2;
                return this;
            case 3:
                this.mParams.goneTopMargin = i2;
                return this;
            case 4:
                this.mParams.goneBottomMargin = i2;
                return this;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.mParams.goneStartMargin = i2;
                return this;
            case 7:
                this.mParams.goneEndMargin = i2;
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public ConstraintProperty leftToLeft(int i, int i2) {
        connect(1, i, 1, i2);
        return this;
    }

    public ConstraintProperty leftToRight(int i, int i2) {
        connect(1, i, 2, i2);
        return this;
    }

    public ConstraintProperty margin(int i, int i2) {
        switch (i) {
            case 1:
                ((ViewGroup.MarginLayoutParams) this.mParams).leftMargin = i2;
                return this;
            case 2:
                ((ViewGroup.MarginLayoutParams) this.mParams).rightMargin = i2;
                return this;
            case 3:
                ((ViewGroup.MarginLayoutParams) this.mParams).topMargin = i2;
                return this;
            case 4:
                ((ViewGroup.MarginLayoutParams) this.mParams).bottomMargin = i2;
                return this;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.mParams.setMarginStart(i2);
                return this;
            case 7:
                this.mParams.setMarginEnd(i2);
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public ConstraintProperty startToEnd(int i, int i2) {
        connect(6, i, 7, i2);
        return this;
    }

    public ConstraintProperty topToBottom(int i, int i2) {
        connect(3, i, 4, i2);
        return this;
    }

    public ConstraintProperty topToTop(int i, int i2) {
        connect(3, i, 3, i2);
        return this;
    }

    public ConstraintProperty transformPivot(float f, float f2) {
        this.mView.setPivotX(f);
        this.mView.setPivotY(f2);
        return this;
    }

    public ConstraintProperty translation(float f, float f2) {
        translationX(f);
        translationY(f2);
        return this;
    }

    public ConstraintProperty connect(int i, int i2, int i3, int i4) {
        switch (i) {
            case 1:
                if (i3 == 1) {
                    LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams = this.mParams;
                    layeredConstraintLayout$LayoutParams.leftToLeft = i2;
                    layeredConstraintLayout$LayoutParams.leftToRight = -1;
                } else if (i3 == 2) {
                    LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams2 = this.mParams;
                    layeredConstraintLayout$LayoutParams2.leftToRight = i2;
                    layeredConstraintLayout$LayoutParams2.leftToLeft = -1;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Left to ");
                    sbLIZ.append(sideToString(i3));
                    sbLIZ.append(" undefined");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
                ((ViewGroup.MarginLayoutParams) this.mParams).leftMargin = i4;
                return this;
            case 2:
                if (i3 == 1) {
                    LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams3 = this.mParams;
                    layeredConstraintLayout$LayoutParams3.rightToLeft = i2;
                    layeredConstraintLayout$LayoutParams3.rightToRight = -1;
                } else if (i3 == 2) {
                    LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams4 = this.mParams;
                    layeredConstraintLayout$LayoutParams4.rightToRight = i2;
                    layeredConstraintLayout$LayoutParams4.rightToLeft = -1;
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("right to ");
                    sbLIZ2.append(sideToString(i3));
                    sbLIZ2.append(" undefined");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                }
                ((ViewGroup.MarginLayoutParams) this.mParams).rightMargin = i4;
                return this;
            case 3:
                if (i3 == 3) {
                    LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams5 = this.mParams;
                    layeredConstraintLayout$LayoutParams5.topToTop = i2;
                    layeredConstraintLayout$LayoutParams5.topToBottom = -1;
                    layeredConstraintLayout$LayoutParams5.baselineToBaseline = -1;
                } else if (i3 == 4) {
                    LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams6 = this.mParams;
                    layeredConstraintLayout$LayoutParams6.topToBottom = i2;
                    layeredConstraintLayout$LayoutParams6.topToTop = -1;
                    layeredConstraintLayout$LayoutParams6.baselineToBaseline = -1;
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("right to ");
                    sbLIZ3.append(sideToString(i3));
                    sbLIZ3.append(" undefined");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
                }
                ((ViewGroup.MarginLayoutParams) this.mParams).topMargin = i4;
                return this;
            case 4:
                if (i3 == 4) {
                    LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams7 = this.mParams;
                    layeredConstraintLayout$LayoutParams7.bottomToBottom = i2;
                    layeredConstraintLayout$LayoutParams7.bottomToTop = -1;
                    layeredConstraintLayout$LayoutParams7.baselineToBaseline = -1;
                } else if (i3 == 3) {
                    LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams8 = this.mParams;
                    layeredConstraintLayout$LayoutParams8.bottomToTop = i2;
                    layeredConstraintLayout$LayoutParams8.bottomToBottom = -1;
                    layeredConstraintLayout$LayoutParams8.baselineToBaseline = -1;
                } else {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("right to ");
                    sbLIZ4.append(sideToString(i3));
                    sbLIZ4.append(" undefined");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ4));
                }
                ((ViewGroup.MarginLayoutParams) this.mParams).bottomMargin = i4;
                return this;
            case 5:
                if (i3 == 5) {
                    LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams9 = this.mParams;
                    layeredConstraintLayout$LayoutParams9.baselineToBaseline = i2;
                    layeredConstraintLayout$LayoutParams9.bottomToBottom = -1;
                    layeredConstraintLayout$LayoutParams9.bottomToTop = -1;
                    layeredConstraintLayout$LayoutParams9.topToTop = -1;
                    layeredConstraintLayout$LayoutParams9.topToBottom = -1;
                } else {
                    if (i3 == 3) {
                        LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams10 = this.mParams;
                        layeredConstraintLayout$LayoutParams10.bottomToBottom = -1;
                        layeredConstraintLayout$LayoutParams10.bottomToTop = -1;
                        layeredConstraintLayout$LayoutParams10.topToTop = -1;
                        layeredConstraintLayout$LayoutParams10.topToBottom = -1;
                        return this;
                    }
                    if (i3 == 4) {
                        LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams11 = this.mParams;
                        layeredConstraintLayout$LayoutParams11.bottomToBottom = -1;
                        layeredConstraintLayout$LayoutParams11.bottomToTop = -1;
                        layeredConstraintLayout$LayoutParams11.topToTop = -1;
                        layeredConstraintLayout$LayoutParams11.topToBottom = -1;
                        return this;
                    }
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("right to ");
                sbLIZ5.append(sideToString(i3));
                sbLIZ5.append(" undefined");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ5));
            case 6:
                if (i3 == 6) {
                    LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams12 = this.mParams;
                    layeredConstraintLayout$LayoutParams12.startToStart = i2;
                    layeredConstraintLayout$LayoutParams12.startToEnd = -1;
                } else if (i3 == 7) {
                    LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams13 = this.mParams;
                    layeredConstraintLayout$LayoutParams13.startToEnd = i2;
                    layeredConstraintLayout$LayoutParams13.startToStart = -1;
                } else {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("right to ");
                    sbLIZ6.append(sideToString(i3));
                    sbLIZ6.append(" undefined");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ6));
                }
                this.mParams.setMarginStart(i4);
                return this;
            case 7:
                if (i3 == 7) {
                    LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams14 = this.mParams;
                    layeredConstraintLayout$LayoutParams14.endToEnd = i2;
                    layeredConstraintLayout$LayoutParams14.endToStart = -1;
                } else if (i3 == 6) {
                    LayeredConstraintLayout$LayoutParams layeredConstraintLayout$LayoutParams15 = this.mParams;
                    layeredConstraintLayout$LayoutParams15.endToStart = i2;
                    layeredConstraintLayout$LayoutParams15.endToEnd = -1;
                } else {
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("right to ");
                    sbLIZ7.append(sideToString(i3));
                    sbLIZ7.append(" undefined");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ7));
                }
                this.mParams.setMarginEnd(i4);
                return this;
            default:
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append(sideToString(i));
                sbLIZ8.append(" to ");
                sbLIZ8.append(sideToString(i3));
                sbLIZ8.append(" unknown");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ8));
        }
    }

    public ConstraintProperty center(int i, int i2, int i3, int i4, int i5, int i6, float f) {
        if (i3 >= 0) {
            if (i6 >= 0) {
                if (f > 0.0f && f <= 1.0f) {
                    if (i2 != 1 && i2 != 2) {
                        if (i2 != 6 && i2 != 7) {
                            connect(3, i, i2, i3);
                            connect(4, i4, i5, i6);
                            this.mParams.verticalBias = f;
                            return this;
                        }
                        connect(6, i, i2, i3);
                        connect(7, i4, i5, i6);
                        this.mParams.horizontalBias = f;
                        return this;
                    }
                    connect(1, i, i2, i3);
                    connect(2, i4, i5, i6);
                    this.mParams.horizontalBias = f;
                    return this;
                }
                throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
            }
            throw new IllegalArgumentException("margin must be > 0");
        }
        throw new IllegalArgumentException("margin must be > 0");
    }

    public ConstraintProperty centerHorizontally(int i, int i2, int i3, int i4, int i5, int i6, float f) {
        connect(1, i, i2, i3);
        connect(2, i4, i5, i6);
        this.mParams.horizontalBias = f;
        return this;
    }

    public ConstraintProperty centerHorizontallyRtl(int i, int i2, int i3, int i4, int i5, int i6, float f) {
        connect(6, i, i2, i3);
        connect(7, i4, i5, i6);
        this.mParams.horizontalBias = f;
        return this;
    }

    public ConstraintProperty centerVertically(int i, int i2, int i3, int i4, int i5, int i6, float f) {
        connect(3, i, i2, i3);
        connect(4, i4, i5, i6);
        this.mParams.verticalBias = f;
        return this;
    }
}
