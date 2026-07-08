package com.bytedance.tux.navigation;

import X.AbstractC1250270idl;
import X.AbstractC1250290idn;
import X.C01GW;
import X.C09RB;
import X.C09RD;
import X.C0OM1;
import X.C0P2M;
import X.C0P2N;
import X.C1250230idh;
import X.C1250250idj;
import X.C1250280idm;
import X.C1250300ido;
import X.C1251150ifB;
import X.C1361400lX0;
import X.C1388190mED;
import X.C1397760mTe;
import X.C13LP;
import X.C13LQ;
import X.C1602160rnK;
import X.C1697810uHb;
import X.C1954807lC;
import X.C197020126o;
import X.C197021126p;
import X.C197024126s;
import X.C197039127h;
import X.C1CRB;
import X.C20094413jq;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C421100GfE;
import X.C426750GoL;
import X.C427690Gpr;
import X.C431260Gvc;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C816803Ha;
import X.C816903Hb;
import X.EnumC1397840mTm;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import u4.q0;

/* JADX INFO: loaded from: classes30.dex */
public final class TuxNavBar extends FrameLayout {
    public C0P2N LL;
    public Context LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final View LLILZIL;
    public final LinearLayout LLILZLL;
    public LinearLayout LLIZ;
    public final LinearLayout LLIZLLLIL;
    public final C1CRB LLJ;
    public C0OM1 LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public float LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;

    public TuxNavBar(Context context) {
        this(context, null, 6);
    }

    public TuxNavBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final TuxTextView getSubtitleTV() {
        return (TuxTextView) this.LLILZ.getValue();
    }

    private final TuxTextView getTitleTV() {
        return (TuxTextView) this.LLILLL.getValue();
    }

    public final void LJIIJJI() {
        View viewLJI;
        C786410Ut5.LJJJJJL(this.LLIZLLLIL);
        for (AbstractC1250290idn abstractC1250290idn : (ArrayList) this.LLJI.LIZIZ) {
            if (abstractC1250290idn instanceof C1250300ido) {
                viewLJI = LJI((C1250300ido) abstractC1250290idn);
            } else if (abstractC1250290idn instanceof C1251150ifB) {
                viewLJI = LJFF((C1251150ifB) abstractC1250290idn);
            } else if (abstractC1250290idn instanceof C197020126o) {
                viewLJI = LJ((C197020126o) abstractC1250290idn);
            } else if (abstractC1250290idn instanceof C197021126p) {
                viewLJI = LIZLLL((C197021126p) abstractC1250290idn);
            } else if (abstractC1250290idn instanceof C1250280idm) {
                viewLJI = LIZJ((C1250280idm) abstractC1250290idn);
            }
            if (viewLJI != null) {
                if (viewLJI.getParent() != null) {
                    C786410Ut5.LJJJLZIJ(viewLJI, (ViewGroup) viewLJI.getParent());
                }
                this.LLIZLLLIL.addView(viewLJI);
            }
        }
    }

    public final void LJIILIIL() {
        View viewLJI;
        C786410Ut5.LJJJJJL(this.LLILZLL);
        for (AbstractC1250290idn abstractC1250290idn : (ArrayList) this.LLJI.LIZ) {
            if (abstractC1250290idn instanceof C1250300ido) {
                viewLJI = LJI((C1250300ido) abstractC1250290idn);
            } else if (abstractC1250290idn instanceof C1251150ifB) {
                viewLJI = LJFF((C1251150ifB) abstractC1250290idn);
            } else if (abstractC1250290idn instanceof C197020126o) {
                viewLJI = LJ((C197020126o) abstractC1250290idn);
            } else if (abstractC1250290idn instanceof C197021126p) {
                viewLJI = LIZLLL((C197021126p) abstractC1250290idn);
            } else if (abstractC1250290idn instanceof C1250280idm) {
                viewLJI = LIZJ((C1250280idm) abstractC1250290idn);
            }
            if (viewLJI != null) {
                this.LLILZLL.addView(viewLJI);
            }
        }
    }

    public final int getNavBackgroundColor$tux_theme_release() {
        return this.LLJJIJI;
    }

    public static View LIZJ(C1250280idm c1250280idm) {
        ViewGroup.LayoutParams layoutParams;
        View view = c1250280idm.LIZJ;
        if (c1250280idm.LIZLLL) {
            if (view != null && view.getLayoutParams() != null) {
                layoutParams = view.getLayoutParams();
                C786410Ut5.W5(view, layoutParams);
                view.setTag(R.id.z0x, c1250280idm.LIZIZ);
                return view;
            }
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
        } else {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
            layoutParams = new LinearLayout.LayoutParams(iLIZIZ, iLIZIZ);
        }
        if (view != null) {
            C786410Ut5.W5(view, layoutParams);
            view.setTag(R.id.z0x, c1250280idm.LIZIZ);
        }
        return view;
    }

    public final void LIZ(AbstractC1250290idn abstractC1250290idn) {
        ((ArrayList) this.LLJI.LIZIZ).add(abstractC1250290idn);
        LJIIJJI();
    }

    public final void LIZIZ(AbstractC1250290idn abstractC1250290idn) {
        ((ArrayList) this.LLJI.LIZ).add(abstractC1250290idn);
        LJIILIIL();
    }

    public final C197039127h LIZLLL(C197021126p c197021126p) {
        C197039127h c197039127h = new C197039127h(this.LLILLJJLI, null, 6, 0);
        C786410Ut5.J6(c197039127h, new LinearLayout.LayoutParams(-2, -2));
        C426750GoL.LJIIIZ(c197039127h, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, false, 26);
        c197039127h.setButtonSize(this.LLJJIJIIJIL);
        c197021126p.getClass();
        c197039127h.setButtonVariant(this.LLJJIJIL);
        LJIJI(c197021126p, c197039127h);
        return c197039127h;
    }

    public final C421100GfE LJ(C197020126o c197020126o) {
        int iLIZIZ;
        C421100GfE c421100GfE = new C421100GfE(this.LLILLJJLI, null, 6, 0);
        if (this.LL == C0P2N.CENTER) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iLIZIZ, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c421100GfE);
        c421100GfE.setLayoutParams(layoutParams);
        LJIJJLI(c197020126o, c421100GfE);
        return c421100GfE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TuxIconView LJFF(C1251150ifB c1251150ifB) {
        int iLIZIZ;
        if (c1251150ifB.LIZJ == -1 && c1251150ifB.LJ == null && c1251150ifB.LJFF == null) {
            return null;
        }
        TuxIconView tuxIconView = new TuxIconView(this.LLILLJJLI, null, 0, 6, null == true ? 1 : 0);
        int i = C0P2M.LIZ[this.LL.ordinal()];
        if (i != 1) {
            if (i == 2) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
            } else {
                throw new C1954807lC();
            }
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        }
        C786410Ut5.M6(tuxIconView, new LinearLayout.LayoutParams(iLIZIZ, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44))));
        LJIL(c1251150ifB, tuxIconView);
        return tuxIconView;
    }

    public final TuxTextView LJI(C1250300ido c1250300ido) {
        TuxTextView tuxTextView = new TuxTextView(this.LLILLJJLI, null, 6, 0);
        tuxTextView.setGravity(17);
        C426750GoL.LJIIL(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, 26);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 16;
        C786410Ut5.R6(tuxTextView, layoutParams);
        LJJI(c1250300ido, tuxTextView);
        return tuxTextView;
    }

    public final View LJII(Object obj) {
        Object next;
        C197024126s c197024126s = new C197024126s(C09RB.LJJ(C09RB.LJJ(new C09RD(this.LLILZLL), new C09RD(this.LLIZLLLIL)), new C09RD(this.LLIZ)));
        while (true) {
            if (c197024126s.hasNext()) {
                next = c197024126s.next();
                if (LJIIIIZZ((View) next, obj)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (View) next;
    }

    public final void LJIIIZ(Object obj) {
        C197024126s c197024126s = new C197024126s(C09RB.LJJ(new C09RD(this.LLILZLL), new C09RD(this.LLIZLLLIL)));
        while (c197024126s.hasNext()) {
            View view = (View) c197024126s.next();
            if (LJIIIIZZ(view, obj)) {
                C426750GoL.LIZJ(view);
            }
        }
        if (LJIIIIZZ(getTitleTV(), obj)) {
            C426750GoL.LIZJ(getTitleTV());
        }
    }

    public final void LJIIL(AbstractC1250270idl abstractC1250270idl) {
        TuxIconDrawable tuxIconDrawableLIZ;
        TuxIconDrawable tuxIconDrawableLIZ2;
        String string;
        if (abstractC1250270idl == null) {
            return;
        }
        C786410Ut5.LJJJJJL(this.LLIZ);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.p1k);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.p1l);
        int i = C0P2M.LIZ[this.LL.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (Intrinsics.LJFF(this.LLIZ, linearLayout2)) {
                    this.LLIZ = linearLayout;
                    C786410Ut5.LJZL(linearLayout2.getVisibility(), linearLayout);
                    C786410Ut5.LJZL(8, linearLayout2);
                }
            } else {
                throw new C1954807lC();
            }
        } else if (Intrinsics.LJFF(this.LLIZ, linearLayout)) {
            this.LLIZ = linearLayout2;
            C786410Ut5.LJZL(linearLayout.getVisibility(), linearLayout2);
            C786410Ut5.LJZL(8, linearLayout);
        }
        LinearLayout linearLayout3 = this.LLIZ;
        View view = new View(this.LLILLJJLI);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        C786410Ut5.W5(view, layoutParams);
        linearLayout3.addView(view);
        if (abstractC1250270idl instanceof C1250250idj) {
            TuxTextView titleTV = getTitleTV();
            C1250250idj c1250250idj = (C1250250idj) abstractC1250270idl;
            titleTV.setTag(R.id.z0x, c1250250idj.LIZIZ);
            titleTV.setTuxFont(this.LLJJJ);
            titleTV.setTextColor(this.LLJJJIL);
            titleTV.setMinTextSizePx((int) this.LLJJJJ);
            TuxTextView subtitleTV = getSubtitleTV();
            subtitleTV.setTuxFont(this.LLJJJJLIIL);
            subtitleTV.setTextColor(this.LLJJL);
            CharSequence charSequence = c1250250idj.LIZJ;
            if (charSequence.length() > 0) {
                if (!(charSequence instanceof String)) {
                    getTitleTV().setMovementMethod(C431260Gvc.LIZ);
                }
                getTitleTV().setText(c1250250idj.LIZJ);
            } else {
                getTitleTV().setText("");
            }
            CharSequence charSequence2 = c1250250idj.LIZLLL;
            if (charSequence2.length() > 0) {
                C786410Ut5.LLLLZLL(getSubtitleTV(), 0);
                getSubtitleTV().setText(charSequence2);
                getTitleTV().setTuxFont(this.LLJJJJJIL);
            } else {
                C786410Ut5.LLLLZLL(getSubtitleTV(), 8);
                getTitleTV().setTuxFont(this.LLJJJ);
            }
            String string2 = null;
            if (c1250250idj.LJ != -1) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = c1250250idj.LJ;
                c419910GdJ.LIZLLL = Integer.valueOf(this.LLJJI);
                c419910GdJ.LJI = null;
                tuxIconDrawableLIZ = c419910GdJ.LIZ(this.LLILLJJLI);
                tuxIconDrawableLIZ.setBounds(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            } else {
                tuxIconDrawableLIZ = null;
            }
            if (c1250250idj.LJFF != -1) {
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = c1250250idj.LJFF;
                c419910GdJ2.LIZLLL = Integer.valueOf(this.LLJJI);
                c419910GdJ2.LJI = c1250250idj.LJI;
                tuxIconDrawableLIZ2 = c419910GdJ2.LIZ(this.LLILLJJLI);
                tuxIconDrawableLIZ2.setBounds(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            } else {
                tuxIconDrawableLIZ2 = null;
            }
            if (getLayoutDirection() == 1) {
                getTitleTV().setCompoundDrawables(tuxIconDrawableLIZ2, null, tuxIconDrawableLIZ, null);
            } else {
                getTitleTV().setCompoundDrawables(tuxIconDrawableLIZ, null, tuxIconDrawableLIZ2, null);
            }
            String[] strArr = new String[3];
            strArr[0] = null;
            CharSequence text = getTitleTV().getText();
            if (text != null) {
                string = text.toString();
            } else {
                string = null;
            }
            strArr[1] = string;
            CharSequence charSequence3 = c1250250idj.LJI;
            if (charSequence3 != null && (!a0.LJJJIL(charSequence3))) {
                string2 = charSequence3.toString();
            }
            strArr[2] = string2;
            getTitleTV().setContentDescription(C13LP.LJJLIIIJ(C13LQ.LJIJI(strArr), ", ", null, null, 0, null, null, 62));
            LJIILL(getTitleTV(), this.LL);
            LJIILL(getSubtitleTV(), this.LL);
            this.LLIZ.addView(getTitleTV());
            this.LLIZ.addView(getSubtitleTV());
        } else if (abstractC1250270idl instanceof C1250230idh) {
            LinearLayout linearLayout4 = this.LLIZ;
            C1250230idh c1250230idh = (C1250230idh) abstractC1250270idl;
            View view2 = c1250230idh.LIZJ;
            setTag(R.id.z0x, c1250230idh.LIZIZ);
            linearLayout4.addView(view2);
        }
        LinearLayout linearLayout5 = this.LLIZ;
        View view3 = new View(this.LLILLJJLI);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        C786410Ut5.W5(view3, layoutParams2);
        linearLayout5.addView(view3);
        C786410Ut5.R7(this.LLIZ, new ACListenerS163S0100000_29(abstractC1250270idl, 17));
    }

    public final void LJIILJJIL(TypedArray typedArray) {
        int color = typedArray.getColor(R$styleable.TuxNavBar__tux_navSeparatorColor, -16777216);
        int color2 = typedArray.getColor(R$styleable.TuxNavBar__tux_navBackgroundColor, 0);
        this.LLJILJILJ = typedArray.getInt(R$styleable.TuxNavBar__tux_navActionText_PrimaryFont, 0);
        this.LLJILJIL = typedArray.getInt(R$styleable.TuxNavBar__tux_navActionText_SecondaryFont, 0);
        this.LLJILLL = typedArray.getColor(R$styleable.TuxNavBar__tux_navTextNormalColor, -16777216);
        this.LLJJ = typedArray.getColor(R$styleable.TuxNavBar__tux_navTextEnableColor, -16777216);
        this.LLJIJIL = typedArray.getColor(R$styleable.TuxNavBar__tux_navTextDisable_Color, -16777216);
        this.LLJJJ = typedArray.getInt(R$styleable.TuxNavBar__tux_navTitleFont, 0);
        this.LLJJJJJIL = typedArray.getInt(R$styleable.TuxNavBar__tux_navTitleFontWithSubTitle2, 0);
        this.LLJJJJLIIL = typedArray.getInt(R$styleable.TuxNavBar__tux_navSubtitleFont2, 0);
        int color3 = typedArray.getColor(R$styleable.TuxNavBar__tux_navTitleColor, -16777216);
        this.LLJJJIL = color3;
        this.LLJJI = color3;
        this.LLJJL = typedArray.getColor(R$styleable.TuxNavBar__tux_navSubTitleColor, -16777216);
        this.LLJJJJ = typedArray.getDimension(R$styleable.TuxNavBar__tux_navTitleMinTextSize, 0.0f);
        this.LLJJIII = typedArray.getDimensionPixelSize(R$styleable.TuxNavBar__tux_navActionIconSize, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        this.LLJJIJIIJIL = typedArray.getInt(R$styleable.TuxNavBar_tux_buttonSize, Integer.MIN_VALUE);
        this.LLJJIJIL = typedArray.getInt(R$styleable.TuxNavBar_tux_buttonVariant, Integer.MIN_VALUE);
        typedArray.recycle();
        this.LLILZIL.setBackgroundColor(color);
        setNavBackground(color2);
    }

    public final void LJIIZILJ(boolean z) {
        int i;
        View view = this.LLILZIL;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
    }

    public final void LJIJ(int i) {
        C1361400lX0 c1361400lX0LJ = C1388190mED.LJ(i, getContext());
        this.LLILLJJLI = c1361400lX0LJ;
        LJIILJJIL(c1361400lX0LJ.obtainStyledAttributes(null, R$styleable.TuxNavBar, R.attr.yc, 0));
        setNavActions(this.LLJI);
    }

    public final void LJIJJ(AbstractC1250270idl abstractC1250270idl) {
        this.LLJI.LIZJ = abstractC1250270idl;
        LJIIL(abstractC1250270idl);
    }

    public final void setAlignment(C0P2N c0p2n) {
        this.LL = c0p2n;
        LJIILIIL();
        LJIIJJI();
        LJIIL(this.LLJI.LIZJ);
    }

    public final void setNavActions(C0OM1 c0om1) {
        this.LLJI = c0om1;
        LJIILIIL();
        LJIIJJI();
        LJIIL(c0om1.LIZJ);
        LJIIZILJ(c0om1.LIZLLL);
        Integer num = c0om1.LJ;
        if (num != null) {
            setNavBackground(num.intValue());
        }
    }

    public final void setNavBackground(int i) {
        this.LLJJIJI = i;
        this.LLJ.setBackgroundColor(i);
    }

    public static boolean LJIIIIZZ(View view, Object obj) {
        Object tag = view.getTag(R.id.z0x);
        if (tag != null && tag.equals(obj)) {
            return true;
        }
        return false;
    }

    public static void LJIILL(TuxTextView tuxTextView, C0P2N c0p2n) {
        LinearLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
        if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
            int i = C0P2M.LIZ[c0p2n.ordinal()];
            int i2 = 1;
            if (i != 1) {
                if (i != 2) {
                    throw new C1954807lC();
                }
            } else {
                i2 = 8388611;
            }
            layoutParams.gravity = i2;
            C786410Ut5.R6(tuxTextView, layoutParams);
        }
    }

    public static void LJIJI(C197021126p c197021126p, C197039127h c197039127h) {
        int i;
        c197039127h.setTag(R.id.z0x, c197021126p.LIZIZ);
        if (c197021126p.LJ) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLLLJ(c197039127h, i);
        if (c197021126p.LIZLLL) {
            C786410Ut5.U8(c197039127h, new ACListenerS163S0100000_29(c197021126p, 18));
            c197039127h.setEnabled(true);
        } else {
            C786410Ut5.U8(c197039127h, null);
            c197039127h.setEnabled(false);
        }
        c197039127h.setText(c197021126p.LIZJ);
    }

    public static void LJIJJLI(C197020126o c197020126o, C421100GfE c421100GfE) {
        int i;
        c421100GfE.setTag(R.id.z0x, c197020126o.LIZIZ);
        if (c197020126o.LIZLLL) {
            i = 0;
        } else {
            i = 8;
        }
        int visibility = c421100GfE.getVisibility();
        c421100GfE.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c421100GfE);
        c421100GfE.setEnabled(c197020126o.LIZJ);
        C786410Ut5.Z8(c421100GfE, new ACListenerS163S0100000_29(c197020126o, 19));
        Integer num = c197020126o.LJFF;
        if (num != null) {
            c421100GfE.setBgColorRes(num.intValue());
        }
        Integer num2 = c197020126o.LJ;
        if (num2 != null) {
            c421100GfE.setBgColor(num2.intValue());
        }
        Integer num3 = c197020126o.LJII;
        if (num3 != null) {
            c421100GfE.setTintColorRes(num3.intValue());
        }
        Integer num4 = c197020126o.LJI;
        if (num4 != null) {
            c421100GfE.setTintColor(num4.intValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(X.C1251150ifB r3, com.bytedance.tux.icon.TuxIconView r4) {
        /*
            r2 = this;
            java.lang.Object r1 = r3.LIZIZ
            r0 = 2131396210(0x7f0a8672, float:1.8413154E38)
            r4.setTag(r0, r1)
            boolean r0 = r3.LJI
            if (r0 == 0) goto L8a
            r0 = 0
        Ld:
            X.C786410Ut5.LLLLLLZZ(r4, r0)
            java.lang.Integer r0 = r3.LJII
            if (r0 == 0) goto L87
            int r1 = r0.intValue()
            android.content.Context r0 = r4.getContext()
            java.lang.String r1 = r0.getString(r1)
            if (r1 == 0) goto L87
        L22:
            boolean r0 = r3.LIZLLL
            LJIIJ(r1, r0, r4)
            boolean r1 = r3.LIZLLL
            r0 = 0
            if (r1 == 0) goto L80
            X.C427690Gpr.LJI(r4, r0)
            Y.ACListenerS163S0100000_29 r1 = new Y.ACListenerS163S0100000_29
            r0 = 20
            r1.<init>(r3, r0)
            X.C786410Ut5.a9(r4, r1)
        L39:
            X.0GdJ r1 = r3.LJ
            if (r1 == 0) goto L51
            int r0 = r1.LIZIZ
            if (r0 >= 0) goto L45
            int r0 = r2.LLJJIII
            r1.LIZIZ = r0
        L45:
            int r0 = r1.LIZJ
            if (r0 >= 0) goto L4d
            int r0 = r2.LLJJIII
            r1.LIZJ = r0
        L4d:
            r4.setTuxIcon(r1)
        L50:
            return
        L51:
            int r1 = r3.LIZJ
            r0 = -1
            if (r1 == r0) goto L78
            X.0GdJ r1 = new X.0GdJ
            r1.<init>()
            int r0 = r3.LIZJ
            r1.LIZ = r0
            boolean r0 = r3.LIZLLL
            if (r0 == 0) goto L75
            int r0 = r2.LLJJI
        L65:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.LIZLLL = r0
            int r0 = r2.LLJJIII
            r1.LIZIZ = r0
            r1.LIZJ = r0
            r4.setTuxIcon(r1)
            return
        L75:
            int r0 = r2.LLJIJIL
            goto L65
        L78:
            kotlin.jvm.functions.Function1<? super com.bytedance.tux.icon.TuxIconView, kotlin.Unit> r0 = r3.LJFF
            if (r0 == 0) goto L50
            r0.invoke(r4)
            return
        L80:
            r4.setOnTouchListener(r0)
            X.C786410Ut5.a9(r4, r0)
            goto L39
        L87:
            java.lang.CharSequence r1 = r3.LJIIIIZZ
            goto L22
        L8a:
            r0 = 8
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.navigation.TuxNavBar.LJIL(X.0ifB, com.bytedance.tux.icon.TuxIconView):void");
    }

    public final void LJJ(Function1 function1, Object obj) {
        AbstractC1250290idn abstractC1250290idn;
        C197024126s c197024126s = new C197024126s(C09RB.LJJ(new C09RD(this.LLILZLL), new C09RD(this.LLIZLLLIL)));
        int i = 0;
        while (c197024126s.hasNext()) {
            Object next = c197024126s.next();
            int i2 = i + 1;
            if (i >= 0) {
                View view = (View) next;
                if (LJIIIIZZ(view, obj)) {
                    if (i < ((ArrayList) this.LLJI.LIZ).size()) {
                        abstractC1250290idn = (AbstractC1250290idn) ListProtector.get(this.LLJI.LIZ, i);
                    } else {
                        C0OM1 c0om1 = this.LLJI;
                        abstractC1250290idn = (AbstractC1250290idn) ListProtector.get(c0om1.LIZIZ, i - ((ArrayList) c0om1.LIZ).size());
                    }
                    function1.invoke(abstractC1250290idn);
                    if ((abstractC1250290idn instanceof C1251150ifB) && (view instanceof TuxIconView)) {
                        LJIL((C1251150ifB) abstractC1250290idn, (TuxIconView) view);
                    } else if ((abstractC1250290idn instanceof C1250300ido) && (view instanceof TuxTextView)) {
                        LJJI((C1250300ido) abstractC1250290idn, (TuxTextView) view);
                    } else if ((abstractC1250290idn instanceof C197020126o) && (view instanceof C421100GfE)) {
                        LJIJJLI((C197020126o) abstractC1250290idn, (C421100GfE) view);
                    } else if ((abstractC1250290idn instanceof C197021126p) && (view instanceof C197039127h)) {
                        LJIJI((C197021126p) abstractC1250290idn, (C197039127h) view);
                    } else if (abstractC1250290idn instanceof C1250280idm) {
                        view.setTag(R.id.z0x, abstractC1250290idn.LIZIZ);
                    }
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final void LJJI(C1250300ido c1250300ido, TuxTextView tuxTextView) {
        int i;
        tuxTextView.setTag(R.id.z0x, c1250300ido.LIZIZ);
        if (c1250300ido.LJFF) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLZLL(tuxTextView, i);
        if (C0P2M.LIZIZ[c1250300ido.LIZLLL.ordinal()] == 1) {
            tuxTextView.setTuxFont(this.LLJILJIL);
            tuxTextView.setTextColor(this.LLJILLL);
        } else {
            tuxTextView.setTuxFont(this.LLJILJILJ);
            tuxTextView.setTextColor(this.LLJJ);
        }
        if (c1250300ido.LJ) {
            C786410Ut5.B5(tuxTextView, 1.0f);
            C427690Gpr.LJI(tuxTextView, null);
            C786410Ut5.h9(tuxTextView, new ACListenerS163S0100000_29(c1250300ido, 21));
        } else {
            C786410Ut5.B5(tuxTextView, 0.4f);
            tuxTextView.setOnTouchListener(null);
            C786410Ut5.h9(tuxTextView, null);
        }
        tuxTextView.setText(c1250300ido.LIZJ);
        LJIIJ(c1250300ido.LIZJ, c1250300ido.LJ, tuxTextView);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TuxNavBar(Context context, AttributeSet attributeSet, int i) {
        int i2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.yc;
        } else {
            i2 = 0;
        }
        super(context, attributeSet, i2);
        this.LL = C0P2N.CENTER;
        this.LLILLJJLI = context;
        this.LLILLL = C452501pT.LIZIZ(new C816903Hb(context));
        this.LLILZ = C452501pT.LIZIZ(new C816803Ha(context));
        this.LLJI = new C0OM1();
        this.LLJIJIL = -16777216;
        this.LLJILLL = -16777216;
        this.LLJJ = -16777216;
        this.LLJJI = -16777216;
        this.LLJJIJIIJIL = Integer.MIN_VALUE;
        this.LLJJIJIL = Integer.MIN_VALUE;
        this.LLJJJIL = -16777216;
        this.LLJJL = -16777216;
        FrameLayout.inflate(context, R.layout.gn, this);
        this.LLILZIL = findViewById(R.id.p24);
        this.LLILZLL = (LinearLayout) findViewById(R.id.p25);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.p1k);
        this.LLIZ = linearLayout;
        linearLayout.addView(getTitleTV());
        this.LLIZ.addView(getSubtitleTV());
        this.LLIZLLLIL = (LinearLayout) findViewById(R.id.p1u);
        this.LLJ = (C1CRB) findViewById(R.id.p1z);
        C426750GoL.LJIIL(getSubtitleTV(), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null, null, 29);
        LJIILJJIL(context.obtainStyledAttributes(attributeSet, R$styleable.TuxNavBar, i2, 0));
    }

    public static void LJIIJ(CharSequence charSequence, boolean z, View view) {
        int i = C20094413jq.LJIIZILJ;
        C1397760mTe c1397760mTe = new C1397760mTe();
        if (charSequence != null && charSequence.length() != 0) {
            c1397760mTe.LIZ = charSequence;
        }
        c1397760mTe.LIZIZ = EnumC1397840mTm.BUTTON;
        c1397760mTe.LIZJ = null;
        c1397760mTe.LJIIIZ = new AwS41S0010000_29(z, 6);
        q0.LJIJ(view, c1397760mTe.LIZ());
    }

    public final void LJIILLIIL(int i, int i2, Object obj) {
        C197024126s c197024126s = new C197024126s(C09RB.LJJ(new C09RD(this.LLILZLL), new C09RD(this.LLIZLLLIL)));
        while (c197024126s.hasNext()) {
            View view = (View) c197024126s.next();
            if (LJIIIIZZ(view, obj)) {
                C426750GoL.LIZ(view, i, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), i2, 2, C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(8), null, 0, null, null, 960);
                for (ViewGroup viewGroup : C1697810uHb.LJIIJJI(this.LLILZLL, this.LLIZLLLIL, this.LLJ)) {
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                }
            }
        }
        if (LJIIIIZZ(getTitleTV(), obj)) {
            C426750GoL.LIZ(getTitleTV(), i, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), i2, 2, 0.0f, 0.0f, null, 0, null, null, 1008);
            this.LLIZ.setClipToPadding(false);
            this.LLIZ.setClipChildren(false);
            this.LLJ.setClipToPadding(false);
            this.LLJ.setClipChildren(false);
        }
    }
}
