package com.ss.android.ugc.aweme.base.ui.bottom.banner;

import X.C01GW;
import X.C0HCN;
import X.C0HH2;
import X.C0SH7;
import X.C11VU;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1619980sG4;
import X.C1AV2;
import X.C2180521AVm;
import X.C2180551AVp;
import X.C2180571AVr;
import X.C265760AbG;
import X.C339190DRl;
import X.C345710Dgv;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C715390S4j;
import X.C715400S4k;
import X.C718670SGz;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC2180541AVo;
import X.InterfaceC20343214is;
import X.InterfaceC2180591AVt;
import Y.AAListenerS263S0200000_11;
import Y.AAListenerS322S0100000_11;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig;
import com.ss.android.ugc.feed.platform.ab.LowScreenOptimizeAB;
import com.ss.android.ugc.feed.platform.cell.interact.view.InteractFrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedBottomBannerView extends LinearLayout implements InterfaceC20343214is {
    public static final Pair<Integer, Integer> LLJJIJIIJIL;
    public final int LL;
    public final int LLILLJJLI;
    public final FrameLayout LLILLL;
    public final TuxIconView LLILZ;
    public final SmartImageView LLILZIL;
    public Function1<? super C1331670kl3, Unit> LLILZLL;
    public int LLIZ;
    public final TuxTextView LLIZLLLIL;
    public final TuxIconView LLJ;
    public boolean LLJI;
    public int LLJIJIL;
    public boolean LLJILJIL;
    public final InteractFrameLayout LLJILJILJ;
    public final InteractFrameLayout LLJILLL;
    public FeedBottomBannerConfig.InteractionType LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final ObjectAnimator LLJJIJI;

    public FeedBottomBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // X.InterfaceC20343214is
    public String getCustomRiskId() {
        return null;
    }

    public void setCustomRiskId(String str) {
    }

    private final ValueAnimator getDefaultAnimationAppear() {
        return (ValueAnimator) this.LLJJI.getValue();
    }

    @Override // android.view.View
    public final ViewPropertyAnimator animate() {
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_ANIMATE;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, "");
        ViewPropertyAnimator viewPropertyAnimatorAnimate = super.animate();
        C2180551AVp.LIZ(enumC2180541AVo, this, "");
        return viewPropertyAnimatorAnimate;
    }

    public final int getBannerHeight() {
        int iIntValue = (this.LLIZ > 1 ? LLJJIJIIJIL.getSecond() : LLJJIJIIJIL.getFirst()).intValue();
        int measuredHeight = getMeasuredHeight();
        Pair<Integer, Integer> pair = LLJJIJIIJIL;
        return measuredHeight <= pair.getFirst().intValue() ? pair.getFirst().intValue() : iIntValue;
    }

    public final ValueAnimator getDefaultAnimationDisappear() {
        return (ValueAnimator) this.LLJJIII.getValue();
    }

    static {
        LLJJIJIIJIL = (C0HCN.LIZ() || LowScreenOptimizeAB.LIZ()) ? new Pair<>(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(33))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50)))) : new Pair<>(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(37))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54))));
    }

    @Override // X.InterfaceC20343214is
    public String getRiskId() {
        return getCustomRiskId();
    }

    public final FrameLayout getInteractionAssemArea() {
        return this.LLJILLL;
    }

    private final void setCurrentMaxLine(int i) {
        if (i == this.LLIZ) {
            return;
        }
        this.LLIZ = i;
    }

    private final void setRichTitleFixed(SpannableStringBuilder spannableStringBuilder) {
        this.LLIZLLLIL.setText(spannableStringBuilder);
        this.LLIZLLLIL.setOnTouchListener(new View.OnTouchListener() { // from class: X.0GvL
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Spanned spanned;
                TextView textView = (TextView) view;
                CharSequence text = textView.getText();
                if (text instanceof Spanned) {
                    spanned = (Spanned) text;
                } else {
                    spanned = null;
                }
                if (spanned == null) {
                    return false;
                }
                int action = motionEvent.getAction();
                if (action == 0 || action == 1) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    int totalPaddingLeft = x - textView.getTotalPaddingLeft();
                    int totalPaddingTop = y - textView.getTotalPaddingTop();
                    int scrollX = totalPaddingLeft + textView.getScrollX();
                    int scrollY = totalPaddingTop + textView.getScrollY();
                    Layout layout = textView.getLayout();
                    int iU3 = C786410Ut5.U3(layout, layout.getLineForVertical(scrollY), scrollX);
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(iU3, iU3, ClickableSpan.class);
                    if (clickableSpanArr.length != 0) {
                        if (action == 1) {
                            C431920Gwg.LIZ(clickableSpanArr, null).onClick(textView);
                        }
                        return true;
                    }
                }
                return false;
            }
        });
    }

    public final void LIZ(Function0<Unit> function0) {
        FeedBottomBannerConfig.InteractionType interactionType = this.LLJJ;
        if (interactionType == FeedBottomBannerConfig.InteractionType.BUTTON || interactionType == FeedBottomBannerConfig.InteractionType.TEXT) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.bottomMargin = -getBannerHeight();
                C786410Ut5.W5(this, layoutParams2);
                getDefaultAnimationAppear().cancel();
                getDefaultAnimationAppear().removeAllListeners();
                ValueAnimator defaultAnimationAppear = getDefaultAnimationAppear();
                defaultAnimationAppear.addListener(new AAListenerS322S0100000_11(function0, 2));
                defaultAnimationAppear.start();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    public final void LIZIZ(C1AV2 c1av2) {
        setEnabled(false);
        C2180521AVm.LIZLLL(this.LLJILJILJ, 8, c1av2);
        C786410Ut5.LJJJJIZL(this.LLJILJILJ);
        if (this.LLJILLL.getVisibility() != 8) {
            C2180521AVm.LIZ(this.LLJILLL, EnumC2180541AVo.V_VISIBLITY, c1av2);
        }
        C339190DRl.LIZIZ(this.LLJILLL);
        FeedBottomBannerConfig.InteractionType interactionType = FeedBottomBannerConfig.InteractionType.UNKNOWN;
        this.LLJJ = interactionType;
        LJFF(interactionType);
    }

    public final void LIZJ(C1AV2 c1av2) {
        LIZIZ(c1av2);
        this.LLIZLLLIL.setMovementMethod(null);
        this.LLIZLLLIL.setText("");
        C786410Ut5.LLLLLLZZ(this.LLJ, 8);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
            C786410Ut5.W5(this, layoutParams2);
            this.LLIZLLLIL.setOnTouchListener(null);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public final void LJFF(FeedBottomBannerConfig.InteractionType interactionType) {
        int iLIZIZ;
        if (C718670SGz.LIZ[interactionType.ordinal()] == 5 || this.LLJILJIL) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        } else {
            iLIZIZ = this.LL;
        }
        setPaddingRelative(this.LL, getPaddingTop(), iLIZIZ + this.LLJIJIL, getPaddingBottom());
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_ALPHA;
        if (C2180571AVr.LIZIZ(enumC2180541AVo, Float.valueOf(f))) {
            super.setAlpha(f);
            return;
        }
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, Float.valueOf(f));
        super.setAlpha(f);
        C2180551AVp.LIZ(enumC2180541AVo, this, Float.valueOf(f));
    }

    public final void setBackground(boolean z) {
        if (z) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.eb, getContext());
            if (numLIZJ != null) {
                setBackgroundColor(numLIZJ.intValue());
            }
        } else {
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.e4, getContext());
            if (numLIZJ2 != null) {
                setBackgroundColor(numLIZJ2.intValue());
            }
        }
        if (!C715400S4k.LIZIZ()) {
            C715390S4j.LIZ(this);
        }
    }

    public final void setCompactRightAreaEnabled(boolean z) {
        if (this.LLJILJIL == z) {
            return;
        }
        this.LLJILJIL = z;
        LJFF(this.LLJJ);
    }

    public final void setExtraEndPadding(int i) {
        if (i < 0) {
            i = 0;
        }
        if (this.LLJIJIL == i) {
            return;
        }
        this.LLJIJIL = i;
        LJFF(this.LLJJ);
    }

    public final void setIcon(String str) {
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        c1331670kl3LJIIIZ.LJJ(this.LLILZIL);
        Function1<? super C1331670kl3, Unit> function1 = this.LLILZLL;
        if (function1 != null) {
            function1.invoke(c1331670kl3LJIIIZ);
        }
    }

    public final void setIconType(FeedBottomBannerConfig.IconType iconType) {
        if (iconType == FeedBottomBannerConfig.IconType.LOCAL) {
            C786410Ut5.LLLLLLZZ(this.LLILZ, 0);
        } else {
            C786410Ut5.LLFF(0, this.LLILZIL);
        }
    }

    public final void setInteractionAction(C0SH7 c0sh7) {
        C786410Ut5.LJZ(0, this.LLJILJILJ);
        C786410Ut5.LJJJJIZL(this.LLJILJILJ);
        this.LLJILJILJ.addView(c0sh7.LIZ(getContext()));
        setEnabled(true);
        AwS620S0100000_6 awS620S0100000_6 = new AwS620S0100000_6(this, 9);
        if (c0sh7 instanceof C345710Dgv) {
            ((C345710Dgv) c0sh7).LIZIZ = new AwS620S0100000_6(awS620S0100000_6, 7);
        }
        if (c0sh7 instanceof C0HH2) {
            ((C0HH2) c0sh7).LIZIZ = new AwS620S0100000_6(awS620S0100000_6, 8);
        }
    }

    public final void setInteractionArea(View view) {
        C786410Ut5.LJZ(0, this.LLJILJILJ);
        setEnabled(true);
        if (this.LLJILJILJ.getChildCount() == 0) {
            this.LLJILJILJ.addView(view);
            return;
        }
        ObjectAnimator objectAnimator = this.LLJJIJI;
        objectAnimator.setTarget(view);
        C786410Ut5.Pd(objectAnimator);
        objectAnimator.addListener(new AAListenerS322S0100000_11(this, 3));
        objectAnimator.addListener(new AAListenerS263S0200000_11(this, view, 0));
    }

    public final void setInteractionAreaType(FeedBottomBannerConfig.InteractionType interactionType) {
        this.LLJJ = interactionType;
        switch (C718670SGz.LIZ[interactionType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                InteractFrameLayout interactFrameLayout = this.LLJILJILJ;
                int i = this.LLILLJJLI;
                interactFrameLayout.setPaddingRelative(interactFrameLayout.getPaddingStart(), i, interactFrameLayout.getPaddingEnd(), i);
                setGravity(48);
                LJFF(interactionType);
                break;
            case 5:
                InteractFrameLayout interactFrameLayout2 = this.LLJILJILJ;
                interactFrameLayout2.setPaddingRelative(interactFrameLayout2.getPaddingStart(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), interactFrameLayout2.getPaddingEnd(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
                setGravity(48);
                LJFF(interactionType);
                break;
            case 6:
            case 7:
                InteractFrameLayout interactFrameLayout3 = this.LLJILJILJ;
                interactFrameLayout3.setPaddingRelative(interactFrameLayout3.getPaddingStart(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), interactFrameLayout3.getPaddingEnd(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
                setGravity(16);
                LJFF(interactionType);
                break;
        }
    }

    public final void setLightenBuilder(Function1<? super C1331670kl3, Unit> function1) {
        this.LLILZLL = function1;
    }

    public final void setRichTitle(SpannableStringBuilder spannableStringBuilder) {
        if (((Boolean) C265760AbG.LIZ.getValue()).booleanValue()) {
            setRichTitleFixed(spannableStringBuilder);
        } else {
            this.LLIZLLLIL.setMovementMethod(LinkMovementMethod.getInstance());
            this.LLIZLLLIL.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        this.LLIZLLLIL.setMovementMethod(null);
        this.LLIZLLLIL.setText(charSequence);
    }

    public final void setTitleMaxLines(int i) {
        TuxTextView tuxTextView = this.LLIZLLLIL;
        setCurrentMaxLine(Math.min(i, 2));
        tuxTextView.setMaxLines(this.LLIZ);
        tuxTextView.setMinTextSize(12.0f);
    }

    public final void setTitleMinTextSize(float f) {
        this.LLIZLLLIL.setMinTextSize(f);
    }

    public final void setTitleTextWeightedEnabled(boolean z) {
        int i;
        float f;
        TuxTextView tuxTextView = this.LLIZLLLIL;
        ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (z) {
                i = 0;
            } else {
                i = -2;
            }
            layoutParams2.width = i;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            layoutParams2.weight = f;
            C786410Ut5.W5(tuxTextView, layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    public final void setTitleUpdateSync(boolean z) {
        this.LLJI = z;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_VISIBLITY;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, Integer.valueOf(i));
        super.setVisibility(i);
        C2180551AVp.LIZ(enumC2180541AVo, this, Integer.valueOf(i));
    }

    public final void LIZLLL(int i, Integer num) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZ = i;
        if (num == null) {
            num = Integer.valueOf(R.attr.ee);
        }
        c419910GdJ.LJ = num;
        this.LLILZ.setTuxIcon(c419910GdJ);
    }

    public final void LJ(C419910GdJ c419910GdJ, Function1<? super View, Unit> function1) {
        this.LLJ.setTuxIcon(c419910GdJ);
        C786410Ut5.LLLLLLZZ(this.LLJ, 0);
        if (function1 != null) {
            function1.invoke(this.LLJ);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Integer first;
        super.onMeasure(i, i2);
        if (this.LLIZ > 1 && this.LLIZLLLIL.getLineCount() > 1) {
            first = LLJJIJIIJIL.getSecond();
        } else {
            first = LLJJIJIIJIL.getFirst();
        }
        int iIntValue = first.intValue();
        int measuredHeight = getMeasuredHeight();
        Pair<Integer, Integer> pair = LLJJIJIIJIL;
        if (measuredHeight <= pair.getFirst().intValue()) {
            iIntValue = pair.getFirst().intValue();
        }
        setMeasuredDimension(i, iIntValue);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedBottomBannerView(Context context, AttributeSet attributeSet, int i) {
        boolean z;
        float fLIZIZ;
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        AttributeSet attributeSet2 = null;
        int i2 = 0;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        this.LL = iLIZIZ;
        if (!C0HCN.LIZ() && !LowScreenOptimizeAB.LIZ()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            fLIZIZ = C418440Gaw.LIZIZ(8);
        } else {
            fLIZIZ = C418440Gaw.LIZIZ(10);
        }
        int iLIZIZ2 = C814420VxA.LIZIZ(fLIZIZ);
        this.LLILLJJLI = iLIZIZ2;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPaddingRelative(frameLayout.getPaddingStart(), iLIZIZ2, frameLayout.getPaddingEnd(), iLIZIZ2);
        this.LLILLL = frameLayout;
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        C786410Ut5.LLLLLLZZ(tuxIconView, 4);
        this.LLILZ = tuxIconView;
        SmartImageView smartImageView = new SmartImageView(context);
        C786410Ut5.LLFF(4, smartImageView);
        this.LLILZIL = smartImageView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), iLIZIZ2, linearLayout.getPaddingEnd(), iLIZIZ2);
        this.LLIZ = 1;
        TuxTextView tuxTextView = new TuxTextView(context, attributeSet2, 6, i2);
        tuxTextView.setTuxFont(62);
        tuxTextView.setTextColorRes(R.attr.ee);
        tuxTextView.setMaxLines(this.LLIZ);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxWidth(((C11VU.LJ(context) - (iLIZIZ * 2)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        tuxTextView.setGravity(16);
        this.LLIZLLLIL = tuxTextView;
        TuxIconView tuxIconView2 = new TuxIconView(context, null, 0, 6, null);
        this.LLJ = tuxIconView2;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        int marginEnd = layoutParams.getMarginEnd();
        int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        layoutParams.setMarginStart(iLIZIZ3);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i3;
        layoutParams.setMarginEnd(marginEnd);
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i4;
        InteractFrameLayout interactFrameLayout = new InteractFrameLayout(14, context, null);
        interactFrameLayout.setId(R.id.ekm);
        this.LLJILJILJ = interactFrameLayout;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        int i5 = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
        int marginEnd2 = layoutParams2.getMarginEnd();
        int i6 = ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
        layoutParams2.setMarginStart(iLIZIZ4);
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i5;
        layoutParams2.setMarginEnd(marginEnd2);
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = i6;
        InteractFrameLayout interactFrameLayout2 = new InteractFrameLayout(14, context, null);
        interactFrameLayout2.setId(R.id.ekn);
        this.LLJILLL = interactFrameLayout2;
        this.LLJJ = FeedBottomBannerConfig.InteractionType.UNKNOWN;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e4, context);
        if (numLIZJ != null) {
            setBackgroundColor(numLIZJ.intValue());
        }
        if (!C715400S4k.LIZIZ()) {
            C715390S4j.LIZ(this);
        }
        addView(frameLayout, new LinearLayout.LayoutParams(-2, -2));
        frameLayout.addView(tuxIconView, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
        frameLayout.addView(smartImageView, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
        layoutParams3.weight = 1.0f;
        addView(linearLayout, layoutParams3);
        addView(interactFrameLayout, layoutParams);
        addView(interactFrameLayout2, layoutParams2);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        int i7 = ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin;
        int marginEnd3 = layoutParams4.getMarginEnd();
        int i8 = ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin;
        layoutParams4.setMarginStart(iLIZIZ5);
        ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = i7;
        layoutParams4.setMarginEnd(marginEnd3);
        ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = i8;
        linearLayout.addView(tuxTextView, layoutParams4);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        int iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        int i9 = ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin;
        int marginEnd4 = layoutParams5.getMarginEnd();
        int i10 = ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin;
        layoutParams5.setMarginStart(iLIZIZ6);
        ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = i9;
        layoutParams5.setMarginEnd(marginEnd4);
        ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = i10;
        layoutParams5.gravity = 16;
        linearLayout.addView(tuxIconView2, layoutParams5);
        this.LLJJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 30));
        this.LLJJIII = C452501pT.LIZIZ(new AwS550S0100000_6(this, 31));
        ObjectAnimator objectAnimator = new ObjectAnimator();
        objectAnimator.setProperty(View.ALPHA);
        objectAnimator.setFloatValues(0.0f, 1.0f);
        objectAnimator.setDuration(300L);
        objectAnimator.setInterpolator(C1619980sG4.LIZLLL());
        objectAnimator.setStartDelay(300L);
        this.LLJJIJI = objectAnimator;
    }
}
