package com.ss.android.ugc.aweme.socialavatar.mixstudio.elements;

import X.AnonymousClass0956;
import X.C01GW;
import X.C0HPP;
import X.C0HPQ;
import X.C0HPR;
import X.C0HPT;
import X.C0HZV;
import X.C1358105Tf;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1697810uHb;
import X.C19ME;
import X.C2217381BqS;
import X.C23250099c;
import X.C384050F3z;
import X.C418440Gaw;
import X.C420500GeG;
import X.C428740GrY;
import X.C439980HNc;
import X.C452501pT;
import X.C462960IDm;
import X.C497820Jfg;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC440050HNj;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS52S0200000_6;
import irm.AkS78S0100000_6;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS289S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class HomePageElementRowPowerCell extends PowerCell<C0HPT> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public ConstraintLayout LLILLJJLI;
    public ConstraintLayout LLILLL;
    public FrameLayout LLILZ;
    public LinearLayout LLILZIL;
    public TuxTextView LLILZLL;
    public ConstraintLayout LLIZ;
    public AnonymousClass0956 LLJILJILJ;
    public AnonymousClass0956 LLJILLL;
    public final C462960IDm LL = new C462960IDm(this, 0);
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(143));
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(142));
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(141));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(144));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(145));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HomePageElementRowPowerCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/socialavatar/mixstudio/elements/HomeRowsControl;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final C0HPQ L5() {
        return (C0HPQ) this.LL.getValue(this, LLJJ[0]);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        AnonymousClass0956 anonymousClass0956 = this.LLJILJILJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJILJILJ = null;
        AnonymousClass0956 anonymousClass09562 = this.LLJILLL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        this.LLJILLL = null;
        super.onViewDetachedFromWindow();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C0HPT c0hpt = (C0HPT) interfaceC1891350zJl;
        super.onBindItemView(c0hpt);
        ConstraintLayout constraintLayout = this.LLILLJJLI;
        if (constraintLayout != null) {
            I5(constraintLayout, c0hpt.LLILLJJLI.LIZ, 0, c0hpt.LLILLL, c0hpt.LLILZ);
        }
        ConstraintLayout constraintLayout2 = this.LLILLL;
        if (constraintLayout2 != null) {
            C0HZV<InterfaceC440050HNj> c0hzv = c0hpt.LLILLJJLI.LIZIZ;
            int i = c0hpt.LLILLL;
            I5(constraintLayout2, c0hzv, i, i, c0hpt.LLILZ);
        }
        String str = c0hpt.LLILLJJLI.LIZJ;
        TuxTextView tuxTextView = this.LLILZLL;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJILJILJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJILJILJ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0HPP(this, c0hpt, str, null), 3);
        AnonymousClass0956 anonymousClass09562 = this.LLJILLL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        this.LLJILLL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0HPR(this, null), 3);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        C786410Ut5.d6(linearLayout, new RecyclerView.LayoutParams(-1, -2));
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setClipChildren(false);
        constraintLayout.setMaxWidth(((Number) this.LLJ.getValue()).intValue());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = ((Number) this.LLJIJIL.getValue()).intValue();
        int iIntValue = ((Number) this.LLJI.getValue()).intValue();
        layoutParams.setMarginStart(iIntValue);
        layoutParams.setMarginEnd(iIntValue);
        linearLayout.addView(constraintLayout, layoutParams);
        this.LLILLJJLI = constraintLayout;
        ConstraintLayout constraintLayout2 = new ConstraintLayout(context);
        constraintLayout2.setClipChildren(false);
        constraintLayout2.setMaxWidth(((Number) this.LLJ.getValue()).intValue());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 1;
        layoutParams2.bottomMargin = ((Number) this.LLJILJIL.getValue()).intValue();
        int iIntValue2 = ((Number) this.LLJI.getValue()).intValue();
        layoutParams2.setMarginStart(iIntValue2);
        layoutParams2.setMarginEnd(iIntValue2);
        linearLayout.addView(constraintLayout2, layoutParams2);
        this.LLILLL = constraintLayout2;
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.LJLLLLLL(8, frameLayout);
        this.LLILZ = frameLayout;
        RecyclerView.LayoutParams layoutParams3 = new RecyclerView.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)));
        ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        linearLayout.addView(frameLayout, layoutParams3);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1d);
        c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
        linearLayout2.setBackground(c384050F3z.LIZ(context));
        this.LLILZIL = linearLayout2;
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(C497820Jfg.LIZIZ(context) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), -1);
        layoutParams4.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        layoutParams4.gravity = 8388611;
        frameLayout.addView(linearLayout2, layoutParams4);
        int iGenerateViewId = View.generateViewId();
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setId(iGenerateViewId);
        tuxIconView.setIconRes(R.raw.icon_pen_star_fill);
        tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        tuxIconView.setTintColorRes(R.attr.a1j);
        RecyclerView.LayoutParams layoutParams5 = new RecyclerView.LayoutParams(-2, -2);
        ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        layoutParams5.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)));
        linearLayout2.addView(tuxIconView, layoutParams5);
        int iGenerateViewId2 = View.generateViewId();
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setId(iGenerateViewId2);
        tuxTextView.setTuxFont(31);
        tuxTextView.setTextColorRes(R.attr.a1k);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        layoutParams6.gravity = 16;
        layoutParams6.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7)));
        linearLayout2.addView(tuxTextView, layoutParams6);
        this.LLILZLL = tuxTextView;
        ConstraintLayout constraintLayout3 = new ConstraintLayout(context);
        constraintLayout3.setBackground(C428740GrY.LIZ(Float.MAX_VALUE, context));
        C786410Ut5.I7(new AkS78S0100000_6(this, 7), constraintLayout3);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(0, -1);
        layoutParams7.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        layoutParams7.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        layoutParams7.gravity = 8388613;
        frameLayout.addView(constraintLayout3, layoutParams7);
        this.LLIZ = constraintLayout3;
        int iGenerateViewId3 = View.generateViewId();
        int iGenerateViewId4 = View.generateViewId();
        TuxIconView tuxIconView2 = new TuxIconView(context, null, 0, 6, null);
        tuxIconView2.setId(iGenerateViewId3);
        tuxIconView2.setIconRes(R.raw.icon_twinkle_star_fill);
        tuxIconView2.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        tuxIconView2.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        tuxIconView2.setTintColorRes(R.attr.z_);
        ConstraintLayout constraintLayout4 = this.LLIZ;
        if (constraintLayout4 != null) {
            C19ME c19me = new C19ME(-2, -2);
            c19me.startToStart = 0;
            c19me.topToTop = 0;
            c19me.endToStart = iGenerateViewId4;
            c19me.bottomToBottom = 0;
            c19me.horizontalChainStyle = 2;
            constraintLayout4.addView(tuxIconView2, c19me);
        }
        TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
        tuxTextView2.setId(iGenerateViewId4);
        tuxTextView2.setText(2131831632);
        tuxTextView2.setTuxFont(33);
        tuxTextView2.setTextColorRes(R.attr.z_);
        ConstraintLayout constraintLayout5 = this.LLIZ;
        if (constraintLayout5 != null) {
            C19ME c19me2 = new C19ME(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
            c19me2.startToEnd = iGenerateViewId3;
            c19me2.topToTop = 0;
            c19me2.endToEnd = 0;
            c19me2.bottomToBottom = 0;
            c19me2.horizontalChainStyle = 2;
            constraintLayout5.addView(tuxTextView2, c19me2);
        }
        return linearLayout;
    }

    public final void I5(ConstraintLayout constraintLayout, C0HZV<InterfaceC440050HNj> c0hzv, int i, int i2, C439980HNc c439980HNc) {
        List listLL = C13LP.LL(C13LP.LJLJJLL(c0hzv), i2);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLL, 10));
        int i3 = 0;
        for (Object obj : listLL) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                int i5 = ((i + i2) - i3) - 1;
                C420500GeG c420500GeG = new C420500GeG(constraintLayout.getContext());
                c420500GeG.setId(View.generateViewId());
                c420500GeG.setElementDisplayStrategy(c439980HNc.LIZIZ((InterfaceC440050HNj) obj, Integer.valueOf(i5)));
                C786410Ut5.I7(new AkS52S0200000_6(this, c420500GeG, 8), c420500GeG);
                C19ME c19me = new C19ME(((Number) this.LLIZLLLIL.getValue()).intValue(), ((Number) this.LLIZLLLIL.getValue()).intValue());
                c19me.startToStart = 0;
                c19me.endToEnd = 0;
                c19me.horizontalChainStyle = 1;
                constraintLayout.addView(c420500GeG, 0, c19me);
                arrayList.add(c420500GeG);
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C1358105Tf.LIZ(arrayList, AFwS289S0000000_6.get$arr$(23));
    }
}
