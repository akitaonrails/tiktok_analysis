package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.powercells;

import X.C0119001l;
import X.C0130001w;
import X.C046200Eq;
import X.C1697810uHb;
import X.C19ME;
import X.C21578619ce;
import X.C371320Eh8;
import X.C384050F3z;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1809520xBm;
import X.InterfaceC1891350zJl;
import X.InterfaceC20631915oL;
import Y.ARunnableS126S0100000_26;
import Y.ATListenerS458S0100000_26;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.LeadingMarginSpan;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import g1c.AjS44S0200000_26;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class ECBillboardAuctionNoteCell extends PowerCell<C046200Eq> implements InterfaceC20631915oL {
    public static final int LLJILJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public static final int LLJILJILJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
    public static final int LLJILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public static final int LLJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
    public ViewGroup LL;
    public TuxTextView LLILLJJLI;
    public C371320Eh8 LLILLL;
    public C21578619ce LLILZ;
    public LinearLayout LLILZIL;
    public FrameLayout LLILZLL;
    public ViewGroup LLIZ;
    public View LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public int LLJIJIL;

    @Override // X.InterfaceC20631915oL
    public final void Z4() {
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.bx3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        this.LL = (ViewGroup) this.itemView.findViewById(R.id.b_r);
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.title);
        this.LLILLL = (C371320Eh8) this.itemView.findViewById(R.id.hjg);
        this.LLILZ = (C21578619ce) this.itemView.findViewById(R.id.u3e);
        this.LLILZIL = (LinearLayout) this.itemView.findViewById(R.id.j6r);
        this.LLIZLLLIL = this.itemView.findViewById(R.id.fz3);
        this.LLILZLL = (FrameLayout) this.itemView.findViewById(R.id.kl2);
        this.LLIZ = (ViewGroup) this.itemView.findViewById(R.id.kl4);
        this.LLJIJIL = ViewConfiguration.get(this.itemView.getContext()).getScaledTouchSlop();
        ViewGroup viewGroup = this.LLIZ;
        if (viewGroup != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zk);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
            viewGroup.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        }
        FrameLayout frameLayout = this.LLILZLL;
        if (frameLayout != null) {
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a0o);
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
            frameLayout.setBackground(c384050F3z2.LIZ(this.itemView.getContext()));
        }
        C21578619ce c21578619ce = this.LLILZ;
        if (c21578619ce != null) {
            c21578619ce.setOnTouchListener(new ATListenerS458S0100000_26(this, 13));
        }
        C21578619ce c21578619ce2 = this.LLILZ;
        if (c21578619ce2 != null) {
            c21578619ce2.setOnScrollChangeListener(new InterfaceC1809520xBm() { // from class: X.0vCy
                /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
                @Override // X.InterfaceC1809520xBm
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(X.C21578619ce r4, int r5, int r6, int r7, int r8) {
                    /*
                        r3 = this;
                        com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.powercells.ECBillboardAuctionNoteCell r0 = r3.LIZ
                        X.0Eh8 r2 = r0.LLILLL
                        if (r2 == 0) goto L14
                        X.19ce r0 = r0.LLILZ
                        if (r0 == 0) goto L15
                        r1 = 1
                        boolean r0 = r0.canScrollVertically(r1)
                        if (r0 != r1) goto L15
                    L11:
                        r2.setFadeEnabled(r1)
                    L14:
                        return
                    L15:
                        r1 = 0
                        goto L11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1733380vCy.LIZ(X.19ce, int, int, int, int):void");
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.util.AttributeSet, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.util.AttributeSet] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        boolean z;
        int iValueOf;
        boolean z2;
        int i;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        C046200Eq c046200Eq = (C046200Eq) interfaceC1891350zJl;
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setText(c046200Eq.LL.title);
        }
        int i2 = c046200Eq.LLILLL;
        int i3 = 8;
        int i4 = 1;
        ?? r4 = 0;
        if (i2 > 1) {
            ViewGroup viewGroup = this.LLIZ;
            if (viewGroup != null) {
                C786410Ut5.LJLLLLLL(0, viewGroup);
            }
            FrameLayout frameLayout = this.LLILZLL;
            if (frameLayout != null) {
                C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)) / i2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))));
            }
            C21578619ce c21578619ce = this.LLILZ;
            if (c21578619ce != null) {
                layoutParams2 = c21578619ce.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            if ((layoutParams2 instanceof C19ME) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams2.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                C21578619ce c21578619ce2 = this.LLILZ;
                if (c21578619ce2 != null) {
                    C786410Ut5.o6(c21578619ce2, marginLayoutParams2);
                }
            }
        } else {
            ViewGroup viewGroup2 = this.LLIZ;
            if (viewGroup2 != null) {
                C786410Ut5.LJLLLLLL(8, viewGroup2);
            }
            C21578619ce c21578619ce3 = this.LLILZ;
            if (c21578619ce3 != null) {
                layoutParams = c21578619ce3.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                C21578619ce c21578619ce4 = this.LLILZ;
                if (c21578619ce4 != null) {
                    C786410Ut5.o6(c21578619ce4, marginLayoutParams);
                }
            }
        }
        List<C0130001w> list = c046200Eq.LLILZ.LIZ;
        LinearLayout linearLayout = this.LLILZIL;
        if (linearLayout != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
        int i5 = 0;
        for (C0130001w c0130001w : list) {
            int i6 = i5 + 1;
            if (i5 >= 0) {
                C0130001w c0130001w2 = c0130001w;
                LinearLayout linearLayout2 = this.LLILZIL;
                if (linearLayout2 != null) {
                    if (i5 > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Context context = this.itemView.getContext();
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(i4);
                    int i7 = -2;
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                    if (z) {
                        iValueOf = Integer.valueOf(i3);
                    } else {
                        iValueOf = 0;
                    }
                    layoutParams3.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(iValueOf));
                    C786410Ut5.d6(linearLayout3, layoutParams3);
                    int i8 = 6;
                    TuxTextView tuxTextView2 = new TuxTextView(context, r4, 6, 0);
                    C786410Ut5.R6(tuxTextView2, new LinearLayout.LayoutParams(-1, -2));
                    tuxTextView2.setTuxFont(72);
                    tuxTextView2.setTextColorRes(R.attr.zl);
                    tuxTextView2.setText(c0130001w2.LIZ);
                    linearLayout3.addView(tuxTextView2);
                    int i9 = 0;
                    r4 = r4;
                    for (C0119001l c0119001l : c0130001w2.LIZIZ) {
                        int i10 = i9 + 1;
                        if (i9 >= 0) {
                            String str = c0119001l.LIZ;
                            if (str == null) {
                                str = "";
                            }
                            if (i9 == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            TuxTextView tuxTextView3 = new TuxTextView(this.itemView.getContext(), r4, i8, 0);
                            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(i7, i7);
                            if (z2) {
                                i = 4;
                            } else {
                                i = 2;
                            }
                            layoutParams4.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
                            C786410Ut5.R6(tuxTextView3, layoutParams4);
                            tuxTextView3.setTuxFont(71);
                            tuxTextView3.setTextColorRes(R.attr.a0p);
                            SpannableString spannableString = new SpannableString(str);
                            final int i11 = LLJILLL;
                            final int i12 = LLJILJIL;
                            final int i13 = LLJILJILJ;
                            final int i14 = LLJJ;
                            C786410Ut5.p2(spannableString, new LeadingMarginSpan(i11, i12, i13, i14) { // from class: X.0F70
                                public final int LL;
                                public final int LLILLJJLI;
                                public final int LLILLL;
                                public final int LLILZ;

                                @Override // android.text.style.LeadingMarginSpan
                                public final int getLeadingMargin(boolean z3) {
                                    return this.LLILZ + this.LLILLJJLI + this.LL;
                                }

                                {
                                    this.LL = i11;
                                    this.LLILLJJLI = i12;
                                    this.LLILLL = i13;
                                    this.LLILZ = i14;
                                }

                                @Override // android.text.style.LeadingMarginSpan
                                public final void drawLeadingMargin(Canvas canvas, Paint paint, int i15, int i16, int i17, int i18, int i19, CharSequence charSequence, int i20, int i21, boolean z3, Layout layout) {
                                    if (!z3) {
                                        return;
                                    }
                                    Paint.Style style = paint.getStyle();
                                    float fAscent = i18 + ((paint.ascent() + paint.descent()) / 2.0f);
                                    int i22 = (this.LLILZ * i16) + i15;
                                    int i23 = this.LLILLL;
                                    float f = fAscent - (i23 / 2.0f);
                                    int i24 = (this.LLILLJJLI * i16) + i22;
                                    paint.setStyle(Paint.Style.FILL);
                                    canvas.drawRect(Math.min(i22, i24), f, Math.max(i22, i24), i23 + f, paint);
                                    paint.setStyle(style);
                                }
                            }, 0, spannableString.length(), 33);
                            tuxTextView3.setText(spannableString);
                            linearLayout3.addView(tuxTextView3);
                            i9 = i10;
                            i7 = -2;
                            r4 = 0;
                            i8 = 6;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    linearLayout2.addView(linearLayout3);
                }
                i5 = i6;
                i3 = 8;
                i4 = 1;
                r4 = r4;
            } else {
                C1697810uHb.LJIJI();
                throw r4;
            }
        }
        ViewGroup viewGroup3 = this.LL;
        if (viewGroup3 != null) {
            C786410Ut5.I7(new AjS44S0200000_26(c046200Eq, this, 66), viewGroup3);
        }
        C371320Eh8 c371320Eh8 = this.LLILLL;
        if (c371320Eh8 != null) {
            c371320Eh8.setFadeEnabled(false);
        }
        C21578619ce c21578619ce5 = this.LLILZ;
        if (c21578619ce5 != null) {
            c21578619ce5.scrollTo(0, 0);
        }
        C21578619ce c21578619ce6 = this.LLILZ;
        if (c21578619ce6 != null) {
            HandlerHook.viewPost(c21578619ce6, new ARunnableS126S0100000_26(this, 135));
        }
    }

    @Override // X.InterfaceC20631915oL
    public final void onPageSelected(int i) {
        ViewGroup.LayoutParams layoutParams;
        FrameLayout frameLayout = this.LLILZLL;
        FrameLayout.LayoutParams layoutParams2 = null;
        if (frameLayout != null) {
            layoutParams = frameLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams) != null) {
            layoutParams2.setMarginStart(i * layoutParams2.width);
        }
        FrameLayout frameLayout2 = this.LLILZLL;
        if (frameLayout2 != null) {
            C786410Ut5.a6(frameLayout2, layoutParams2);
        }
    }
}
