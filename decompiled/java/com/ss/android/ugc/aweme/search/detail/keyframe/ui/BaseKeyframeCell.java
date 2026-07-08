package com.ss.android.ugc.aweme.search.detail.keyframe.ui;

import X.C01GW;
import X.C04WG;
import X.C07CY;
import X.C0H8A;
import X.C0PEM;
import X.C0QBT;
import X.C1295960jpS;
import X.C1308910kAL;
import X.C1361400lX0;
import X.C13LP;
import X.C1463005o4;
import X.C1619980sG4;
import X.C1908520zlS;
import X.C1DFH;
import X.C2107308Nj;
import X.C339190DRl;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C948503nH;
import X.InterfaceC1891350zJl;
import Y.AAListenerS341S0100000_31;
import Y.ACListenerS165S0100000_31;
import Y.AUListenerS278S0100000_31;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public abstract class BaseKeyframeCell<T extends C0H8A> extends PowerCell<T> {
    public static final int LLJILJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
    public static final int LLJILJILJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public C1361400lX0 LLILLL;
    public Animator LLJIJIL;
    public final C01GW LL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(125));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(126));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS575S0100000_31((BaseKeyframeCell) this, 938));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS575S0100000_31((BaseKeyframeCell) this, 939));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS575S0100000_31((BaseKeyframeCell) this, 941));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS575S0100000_31((BaseKeyframeCell) this, 940));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS575S0100000_31((BaseKeyframeCell) this, 943));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS575S0100000_31((BaseKeyframeCell) this, 944));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS575S0100000_31((BaseKeyframeCell) this, 942));

    public boolean R5() {
        return false;
    }

    public abstract void W5(C0H8A c0h8a);

    public abstract int X5();

    public final View L5() {
        return (View) this.LLILZIL.getValue();
    }

    public final C1295960jpS N5() {
        return (C1295960jpS) this.LLIZ.getValue();
    }

    public final View P5() {
        return (View) this.LLILZLL.getValue();
    }

    public final TuxTextView S5() {
        return (TuxTextView) this.LLJI.getValue();
    }

    public final TuxTextView T5() {
        return (TuxTextView) this.LLIZLLLIL.getValue();
    }

    public final TuxTextView U5() {
        return (TuxTextView) this.LLJ.getValue();
    }

    public final boolean V5() {
        return (this instanceof KeyframeBottomCellImageStyle) || (this instanceof KeyframeBottomCellNoImageStyle);
    }

    public final Drawable b6() {
        Integer numLIZJ;
        Integer numLIZJ2;
        C1361400lX0 c1361400lX0 = this.LLILLL;
        int iIntValue = 0;
        int iIntValue2 = (c1361400lX0 == null || (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a03, c1361400lX0)) == null) ? 0 : numLIZJ2.intValue();
        C1361400lX0 c1361400lX02 = this.LLILLL;
        if (c1361400lX02 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, c1361400lX02)) != null) {
            iIntValue = numLIZJ.intValue();
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        float fLIZIZ = C418440Gaw.LIZIZ(10);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(iIntValue2);
        gradientDrawable.setCornerRadius(fLIZIZ);
        gradientDrawable.setStroke(iLIZIZ, iIntValue);
        return gradientDrawable;
    }

    public final Drawable c6() {
        Integer numLIZJ;
        C1361400lX0 c1361400lX0 = this.LLILLL;
        return C1908520zlS.LIZIZ(C418440Gaw.LIZIZ(10), (c1361400lX0 == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.a03, c1361400lX0)) == null) ? 0 : numLIZJ.intValue());
    }

    public final void a6() {
        TuxTextView tuxTextViewT5 = T5();
        if (tuxTextViewT5 != null) {
            tuxTextViewT5.setTextSize(1, 13.0f);
        }
        TuxTextView tuxTextViewU5 = U5();
        if (tuxTextViewU5 != null) {
            tuxTextViewU5.setTextSize(1, 13.0f);
        }
        TuxTextView tuxTextViewT52 = T5();
        if (tuxTextViewT52 != null) {
            tuxTextViewT52.setEllipsize(TextUtils.TruncateAt.END);
        }
        TuxTextView tuxTextViewU52 = U5();
        if (tuxTextViewU52 != null) {
            tuxTextViewU52.setEllipsize(TextUtils.TruncateAt.END);
        }
        this.itemView.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILZ.getValue() != null ? 170 : 150)));
        TuxTextView tuxTextViewT53 = T5();
        if (tuxTextViewT53 != null) {
            tuxTextViewT53.setMaxLines(1);
        }
        TuxTextView tuxTextViewU53 = U5();
        if (tuxTextViewU53 != null) {
            tuxTextViewU53.setMaxLines(1);
        }
        this.itemView.requestLayout();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onItemViewCreated() {
        super.onItemViewCreated();
        N5().setAnimation(X5());
        if (C04WG.LIZ()) {
            C427690Gpr.LJ(this.itemView, 0.0f);
        }
        if (C07CY.LIZ()) {
            C427690Gpr.LJ(this.itemView, C418440Gaw.LIZIZ(8));
        }
        C786410Ut5.I7(new ACListenerS165S0100000_31(this, 81), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        T item = getItem();
        if (item == null || !item.LLILLL) {
            return;
        }
        if (C07CY.LIZ()) {
            d6(true);
        } else {
            N5().playAnimation();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        N5().cancelAnimation();
    }

    public final void d6(boolean z) {
        if (z) {
            if (!N5().isAnimating()) {
                N5().playAnimation();
            }
            C339190DRl.LIZLLL(N5());
            View viewL5 = L5();
            if (viewL5 != null) {
                C339190DRl.LIZIZ(viewL5);
            }
            View viewP5 = P5();
            if (viewP5 != null) {
                C339190DRl.LIZLLL(viewP5);
            }
            C786410Ut5.f5(N5(), 1.0f);
            View viewP52 = P5();
            if (viewP52 != null) {
                C786410Ut5.T4(viewP52, 1.0f);
                return;
            }
            return;
        }
        N5().cancelAnimation();
        C339190DRl.LIZIZ(N5());
        C786410Ut5.f5(N5(), 0.0f);
        View viewP53 = P5();
        if (viewP53 != null) {
            C339190DRl.LIZIZ(viewP53);
        }
        View viewP54 = P5();
        if (viewP54 != null) {
            C786410Ut5.T4(viewP54, 0.0f);
        }
        View viewL52 = L5();
        if (viewL52 != null) {
            C339190DRl.LIZLLL(viewL52);
        }
        View viewL53 = L5();
        if (viewL53 == null) {
            return;
        }
        C786410Ut5.T4(viewL53, 1.0f);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        C0H8A c0h8a = (C0H8A) interfaceC1891350zJl;
        ImageView imageView = (ImageView) this.LLILZ.getValue();
        if (imageView != null) {
            C1DFH c1dfh = C0PEM.LIZ;
            C948503nH.LJ(this, C2107308Nj.LIZ, new C1463005o4(c0h8a, imageView, null));
        }
        int i = 8;
        String str = "";
        if (c0h8a.LLILLJJLI.fromKeySegmentInfo) {
            if (c0h8a.LLILLL) {
                TuxTextView tuxTextViewT5 = T5();
                if (tuxTextViewT5 != null) {
                    tuxTextViewT5.setText(c0h8a.LLILLJJLI.titlePlaying);
                }
                TuxTextView tuxTextViewU5 = U5();
                if (tuxTextViewU5 != null) {
                    String str2 = c0h8a.LLILLJJLI.subTitlePlaying;
                    if (str2 != null) {
                        str = str2;
                    }
                    tuxTextViewU5.setText(str);
                }
            } else {
                TuxTextView tuxTextViewT52 = T5();
                if (tuxTextViewT52 != null) {
                    tuxTextViewT52.setText(c0h8a.LLILLJJLI.title);
                }
                TuxTextView tuxTextViewU52 = U5();
                if (tuxTextViewU52 != null) {
                    tuxTextViewU52.setText(c0h8a.LLILLJJLI.contentDetails);
                }
            }
            TuxTextView tuxTextViewS5 = S5();
            if (tuxTextViewS5 != null) {
                C786410Ut5.LJLLLLLL(8, tuxTextViewS5);
            }
        } else {
            TuxTextView tuxTextViewT53 = T5();
            if (tuxTextViewT53 != null) {
                int i2 = c0h8a.LLILLJJLI.secondStart;
                if (i2 >= 3600) {
                    z = true;
                } else {
                    z = false;
                }
                tuxTextViewT53.setText(C0QBT.LIZ(i2, z));
            }
            TuxTextView tuxTextViewU53 = U5();
            if (tuxTextViewU53 != null) {
                tuxTextViewU53.setText(c0h8a.LLILLJJLI.title);
            }
            TuxTextView tuxTextViewS52 = S5();
            if (tuxTextViewS52 != null) {
                String str3 = c0h8a.LLILLJJLI.contentDetails;
                if (str3 != null) {
                    str = str3;
                }
                tuxTextViewS52.setText(str);
            }
            TuxTextView tuxTextViewS53 = S5();
            if (tuxTextViewS53 != null) {
                if (c0h8a.LLILLJJLI.contentDetails.length() > 0) {
                    i = 0;
                }
                C786410Ut5.LJLLLLLL(i, tuxTextViewS53);
            }
        }
        if (c0h8a.LLILLL) {
            if (C07CY.LIZ()) {
                this.itemView.setBackground(b6());
            }
            d6(true);
        } else {
            if (C07CY.LIZ()) {
                this.itemView.setBackground(c6());
            }
            d6(false);
        }
        if (c0h8a.LLILLJJLI.fromKeySegmentInfo && V5()) {
            I5(c0h8a.LLILLJJLI, c0h8a.LLILLL);
        } else {
            if (c0h8a.LLILLJJLI.fromKeySegmentInfo || !V5()) {
                return;
            }
            a6();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013d A[PHI: r3
      0x013d: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v5 java.lang.String), (r3v5 java.lang.String) binds: [B:56:0x0139, B:19:0x002c, B:21:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5(com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.detail.keyframe.ui.BaseKeyframeCell.I5(com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint, boolean):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        Boolean bool;
        boolean z;
        C0H8A c0h8a = (C0H8A) interfaceC1891350zJl;
        Object objLJJJLL = C13LP.LJJJLL(list);
        if ((objLJJJLL instanceof Boolean) && (bool = (Boolean) objLJJJLL) != null) {
            if (R5()) {
                d6(bool.booleanValue());
            } else {
                boolean zBooleanValue = bool.booleanValue();
                Animator animator = this.LLJIJIL;
                if (animator != null) {
                    animator.cancel();
                }
                if (zBooleanValue) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJI());
                    valueAnimatorOfFloat.setDuration(250L);
                    valueAnimatorOfFloat.addListener(new AAListenerS341S0100000_31(this, 10));
                    valueAnimatorOfFloat.addListener(new AAListenerS341S0100000_31(this, 9));
                    valueAnimatorOfFloat.addUpdateListener(new AUListenerS278S0100000_31(this, 48));
                    valueAnimatorOfFloat.start();
                    this.LLJIJIL = valueAnimatorOfFloat;
                } else {
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat2.setInterpolator(C1619980sG4.LJI());
                    valueAnimatorOfFloat2.setDuration(250L);
                    valueAnimatorOfFloat2.addListener(new AAListenerS341S0100000_31(this, 12));
                    valueAnimatorOfFloat2.addListener(new AAListenerS341S0100000_31(this, 11));
                    valueAnimatorOfFloat2.addUpdateListener(new AUListenerS278S0100000_31(this, 49));
                    valueAnimatorOfFloat2.start();
                    this.LLJIJIL = valueAnimatorOfFloat2;
                }
            }
            int i = 8;
            String str = "";
            if (c0h8a.LLILLJJLI.fromKeySegmentInfo) {
                if (bool.booleanValue()) {
                    TuxTextView tuxTextViewT5 = T5();
                    if (tuxTextViewT5 != null) {
                        tuxTextViewT5.setText(c0h8a.LLILLJJLI.titlePlaying);
                    }
                    TuxTextView tuxTextViewU5 = U5();
                    if (tuxTextViewU5 != null) {
                        String str2 = c0h8a.LLILLJJLI.subTitlePlaying;
                        if (str2 != null) {
                            str = str2;
                        }
                        tuxTextViewU5.setText(str);
                    }
                } else {
                    TuxTextView tuxTextViewT52 = T5();
                    if (tuxTextViewT52 != null) {
                        tuxTextViewT52.setText(c0h8a.LLILLJJLI.title);
                    }
                    TuxTextView tuxTextViewU52 = U5();
                    if (tuxTextViewU52 != null) {
                        tuxTextViewU52.setText(c0h8a.LLILLJJLI.contentDetails);
                    }
                }
                TuxTextView tuxTextViewS5 = S5();
                if (tuxTextViewS5 != null) {
                    C786410Ut5.LJLLLLLL(8, tuxTextViewS5);
                }
            } else {
                TuxTextView tuxTextViewT53 = T5();
                if (tuxTextViewT53 != null) {
                    int i2 = c0h8a.LLILLJJLI.secondStart;
                    if (i2 >= 3600) {
                        z = true;
                    } else {
                        z = false;
                    }
                    tuxTextViewT53.setText(C0QBT.LIZ(i2, z));
                }
                TuxTextView tuxTextViewU53 = U5();
                if (tuxTextViewU53 != null) {
                    tuxTextViewU53.setText(c0h8a.LLILLJJLI.title);
                }
                TuxTextView tuxTextViewS52 = S5();
                if (tuxTextViewS52 != null) {
                    String str3 = c0h8a.LLILLJJLI.contentDetails;
                    if (str3 != null) {
                        str = str3;
                    }
                    tuxTextViewS52.setText(str);
                }
                TuxTextView tuxTextViewS53 = S5();
                if (tuxTextViewS53 != null) {
                    if (c0h8a.LLILLJJLI.contentDetails.length() > 0) {
                        i = 0;
                    }
                    C786410Ut5.LJLLLLLL(i, tuxTextViewS53);
                }
            }
            if (c0h8a.LLILLJJLI.fromKeySegmentInfo && V5()) {
                I5(c0h8a.LLILLJJLI, c0h8a.LLILLL);
            } else {
                if (c0h8a.LLILLJJLI.fromKeySegmentInfo || !V5()) {
                    return;
                }
                a6();
            }
        }
    }
}
