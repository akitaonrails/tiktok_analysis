package com.ss.android.ugc.aweme.relation.ffp.ui.cell;

import X.AbstractC1069740dwa;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1069700dwW;
import X.C1069770dwd;
import X.C1069790dwf;
import X.C1069830dwj;
import X.C1072540e16;
import X.C1072550e17;
import X.C1073970e3P;
import X.C13IQ;
import X.C13LE;
import X.C14LC;
import X.C1910890zpH;
import X.C1954807lC;
import X.C197039127h;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C296060Bj2;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1070410dxf;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.relation.ffp.vm.RecFriendsVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS113S0400000_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class RecFriendsAuthCell extends RecFriendsTopBaseCell<C1069700dwW> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(349));
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RecFriendsAuthCell.class, "recFriendsVM", "getRecFriendsVM()Lcom/ss/android/ugc/aweme/relation/ffp/vm/RecFriendsVM;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public RecFriendsAuthCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RecFriendsVM.class);
        AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 525);
        AFwS252S0000000_16 aFwS252S0000000_16 = AFwS252S0000000_16.get$arr$(319);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 510), awS560S0100000_16, AFwS204S0000000_16.get$arr$(245), new AwS560S0100000_16((C03K6) this, 511), new AwS560S0100000_16((C03K6) this, 513), new AwS560S0100000_16((HasDefaultViewModelProviderFactory) this, 515), aFwS252S0000000_16, new AwS560S0100000_16((C03K6) this, 517), null, new AwS560S0100000_16((C03K6) this, 518));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS560S0100000_16 awS560S0100000_162 = new AwS560S0100000_16((C03K6) this, 512);
            AwS560S0100000_16 awS560S0100000_163 = new AwS560S0100000_16((HasDefaultViewModelProviderFactory) this, 514);
            AwS560S0100000_16 awS560S0100000_164 = new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 516);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS417S0200000_16((InterfaceC451590HnJ) obj, awS560S0100000_162, 30));
            AwS560S0100000_16 awS560S0100000_165 = new AwS560S0100000_16(c01gwLIZIZ, 519);
            AwS560S0100000_16 awS560S0100000_166 = new AwS560S0100000_16(c01gwLIZIZ, 520);
            AwS560S0100000_16 awS560S0100000_167 = new AwS560S0100000_16(c01gwLIZIZ, 521);
            AwS560S0100000_16 awS560S0100000_168 = new AwS560S0100000_16(c01gwLIZIZ, 522);
            AwS560S0100000_16 awS560S0100000_169 = new AwS560S0100000_16(c01gwLIZIZ, 523);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS560S0100000_164, awS560S0100000_16, new C452080Ho6(), awS560S0100000_165, awS560S0100000_166, awS560S0100000_163, aFwS252S0000000_16, awS560S0100000_167, awS560S0100000_168, awS560S0100000_169);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 524), awS560S0100000_16, AFwS204S0000000_16.get$arr$(246), new AwS560S0100000_16((C03K6) this, 526), new AwS560S0100000_16((C03K6) this, 527), new AwS560S0100000_16((HasDefaultViewModelProviderFactory) this, 528), aFwS252S0000000_16, new AwS560S0100000_16((C03K6) this, 529), null, new AwS560S0100000_16((C03K6) this, 530));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 531), awS560S0100000_16, AFwS204S0000000_16.get$arr$(247), new AwS560S0100000_16((C03K6) this, 532), new AwS560S0100000_16((C03K6) this, 533), new AwS560S0100000_16((C03K6) this, 534), aFwS252S0000000_16, null, null, new AwS560S0100000_16((C03K6) this, 509));
        }
        this.LLJ = assemVMLazy;
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.cell.RecFriendsTopBaseCell
    public final void R5(AbstractC1069740dwa abstractC1069740dwa) {
        C1069700dwW c1069700dwW = (C1069700dwW) abstractC1069740dwa;
        if (C296060Bj2.LIZIZ) {
            ((C1910890zpH) this.LLIZLLLIL.getValue()).LIZ("auth_cell", "on auth cell click");
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1069770dwd(this, c1069700dwW, null), 3);
        } else {
            Context context = this.itemView.getContext();
            EnumC1070410dxf enumC1070410dxf = c1069700dwW.LL;
            if (!c1069700dwW.LLILLJJLI) {
                C1069830dwj.LIZ(enumC1070410dxf, context, new C1073970e3P(c1069700dwW.LLILZ.LIZ, "click", (String) null, (String) null, 28), new AwS113S0400000_16(this, context, enumC1070410dxf, c1069700dwW, 3));
            } else {
                T5(enumC1070410dxf, context, c1069700dwW);
            }
        }
        C1073970e3P c1073970e3P = c1069700dwW.LLILZ;
        new C1072540e16(c1073970e3P.LIZ, c1073970e3P.LIZIZ, c1073970e3P.LIZJ, c1069700dwW.LL, "suggested_list").LIZLLL(null);
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.cell.RecFriendsTopBaseCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: S5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1069700dwW c1069700dwW) {
        String string;
        Float fValueOf;
        String string2;
        int i;
        View view;
        String string3;
        Float fValueOf2;
        String string4;
        super.onBindItemView(c1069700dwW);
        Context context = this.itemView.getContext();
        int i2 = C1069790dwf.LIZ[c1069700dwW.LL.ordinal()];
        Integer numValueOf = Integer.valueOf(R.attr.ee);
        String str = "";
        int i3 = 0;
        if (i2 != 1) {
            if (i2 == 2) {
                if (C296060Bj2.LIZIZ) {
                    TuxIconView tuxIconViewL5 = L5();
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_facebook_circle;
                    c419910GdJ.LJ = numValueOf;
                    boolean z = C14LC.LJIIIZ;
                    if (z) {
                        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
                        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
                    } else {
                        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    }
                    tuxIconViewL5.setTuxIcon(c419910GdJ);
                    ViewGroup.LayoutParams layoutParams = tuxIconViewL5.getLayoutParams();
                    if (layoutParams != null) {
                        if (z) {
                            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                        } else {
                            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                        }
                        C786410Ut5.W5(tuxIconViewL5, layoutParams);
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZIZ = Integer.valueOf(R.attr.tb);
                        if (z) {
                            fValueOf2 = Float.valueOf(C418440Gaw.LIZIZ(44));
                        } else {
                            fValueOf2 = Float.valueOf(C418440Gaw.LIZIZ(48));
                        }
                        c384050F3z.LIZJ = fValueOf2;
                        tuxIconViewL5.setBackground(c384050F3z.LIZ(context));
                        N5().setText(context.getText(2131839071));
                        TuxTextView tuxTextView = this.LLILZIL;
                        if (tuxTextView != null) {
                            tuxTextView.setText(context.getText(2131839070));
                        }
                        TuxTextView tuxTextViewI5 = I5();
                        Integer numValueOf2 = Integer.valueOf(c1069700dwW.LLILLL);
                        if (numValueOf2.intValue() > 0 && (string4 = numValueOf2.toString()) != null) {
                            str = string4;
                        }
                        tuxTextViewI5.setText(str);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                } else {
                    L5().setIconRes(R.raw.icon_color_facebook_circle);
                    N5().setText(context.getText(2131834662));
                    TuxTextView tuxTextViewI52 = I5();
                    Integer numValueOf3 = Integer.valueOf(c1069700dwW.LLILLL);
                    if (numValueOf3.intValue() > 0 && (string3 = numValueOf3.toString()) != null) {
                        str = string3;
                    }
                    tuxTextViewI52.setText(str);
                }
            } else {
                throw new C1954807lC();
            }
        } else if (C296060Bj2.LIZIZ) {
            TuxIconView tuxIconViewL52 = L5();
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_phone_book_fill;
            c419910GdJ2.LJ = numValueOf;
            boolean z2 = C14LC.LJIIIZ;
            if (z2) {
                c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
                c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
            } else {
                c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            }
            tuxIconViewL52.setTuxIcon(c419910GdJ2);
            ViewGroup.LayoutParams layoutParams2 = tuxIconViewL52.getLayoutParams();
            if (layoutParams2 != null) {
                if (z2) {
                    layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                    layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                } else {
                    layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                    layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                }
                C786410Ut5.W5(tuxIconViewL52, layoutParams2);
                C384050F3z c384050F3z2 = new C384050F3z();
                c384050F3z2.LIZIZ = Integer.valueOf(R.attr.ta);
                if (z2) {
                    fValueOf = Float.valueOf(C418440Gaw.LIZIZ(44));
                } else {
                    fValueOf = Float.valueOf(C418440Gaw.LIZIZ(48));
                }
                c384050F3z2.LIZJ = fValueOf;
                tuxIconViewL52.setBackground(c384050F3z2.LIZ(context));
                N5().setText(context.getText(2131839068));
                TuxTextView tuxTextView2 = this.LLILZIL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(context.getText(2131839067));
                }
                TuxTextView tuxTextViewI53 = I5();
                Integer numValueOf4 = Integer.valueOf(c1069700dwW.LLILLL);
                if (numValueOf4.intValue() > 0 && (string2 = numValueOf4.toString()) != null) {
                    str = string2;
                }
                tuxTextViewI53.setText(str);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        } else {
            L5().setIconRes(R.raw.icon_color_contact_circle);
            N5().setText(context.getText(2131834659));
            TuxTextView tuxTextViewI54 = I5();
            Integer numValueOf5 = Integer.valueOf(c1069700dwW.LLILLL);
            if (numValueOf5.intValue() > 0 && (string = numValueOf5.toString()) != null) {
                str = string;
            }
            tuxTextViewI54.setText(str);
        }
        if (C296060Bj2.LIZIZ) {
            TuxTextView tuxTextViewI55 = I5();
            if ((tuxTextViewI55 instanceof View) && tuxTextViewI55 != null) {
                if (!c1069700dwW.LLILLJJLI) {
                    i3 = 8;
                }
                C786410Ut5.LJLLLLLL(i3, tuxTextViewI55);
            }
        } else {
            C197039127h c197039127h = this.LLILLL;
            if (c197039127h == null) {
                c197039127h = null;
            }
            if (!c1069700dwW.LLILLJJLI) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, c197039127h);
            Object parent = I5().getParent();
            if ((parent instanceof View) && (view = (View) parent) != null) {
                if (!c1069700dwW.LLILLJJLI) {
                    i3 = 8;
                }
                C786410Ut5.LJLLLLLL(i3, view);
            }
        }
        C1073970e3P c1073970e3P = c1069700dwW.LLILZ;
        new C1072550e17(c1073970e3P.LIZ, c1073970e3P.LIZIZ, "", c1073970e3P.LIZJ, c1069700dwW.LL, "suggested_list", -1).LIZLLL(null);
    }

    public static void T5(EnumC1070410dxf enumC1070410dxf, Context context, C1069700dwW c1069700dwW) {
        int i = C1069790dwf.LIZ[enumC1070410dxf.ordinal()];
        if (i != 1) {
            if (i == 2) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//friends/facebook");
                smartRouteBuildRoute.withParam("enter_from", c1069700dwW.LLILZ.LIZ);
                smartRouteBuildRoute.open();
                return;
            }
            throw new C1954807lC();
        }
        SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(context, "//friends/contact");
        smartRouteBuildRoute2.withParam("enter_from", c1069700dwW.LLILZ.LIZ);
        smartRouteBuildRoute2.withParam("enter_method", c1069700dwW.LLILZ.LIZIZ);
        smartRouteBuildRoute2.addFlags(536870912);
        smartRouteBuildRoute2.open();
    }
}
