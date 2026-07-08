package com.ss.android.ugc.aweme.relation.usercard.impl.cell;

import X.C01GW;
import X.C0N58;
import X.C0SY7;
import X.C1073960e3O;
import X.C1261090ivD;
import X.C1261200ivO;
import X.C1261270ivV;
import X.C1261650iw7;
import X.C1261860iwS;
import X.C1262090iwp;
import X.C1264320j0Q;
import X.C1308910kAL;
import X.C1388190mED;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1609500rzA;
import X.C197039127h;
import X.C19EG;
import X.C2188811AlT;
import X.C278730AwB;
import X.C304890BxH;
import X.C384050F3z;
import X.C418440Gaw;
import X.C427590Gph;
import X.C427690Gpr;
import X.C428150Gqb;
import X.C447550Hgn;
import X.C452501pT;
import X.C486860J7k;
import X.C786410Ut5;
import X.C814420VxA;
import X.C946803n0;
import X.EnumC1262370ixH;
import X.EnumC1605470rsf;
import X.EnumC1606080rte;
import X.EnumC428940Grs;
import X.InterfaceC1263010iyJ;
import X.InterfaceC1398730mVD;
import X.InterfaceC1891350zJl;
import X.InterfaceC494301wD;
import Y.ACListenerS122S0200000_19;
import Y.ARunnableS74S0200000_5;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.relation.label.RelationLabelTextView;
import com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility;
import com.zhiliaoapp.musically.R;
import java.util.Set;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS455S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class RectRedesignRecUserCell<ITEM extends C1261650iw7> extends AbsRecUserCell<C1261650iw7> {
    public C1261090ivD LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19((RectRedesignRecUserCell) this, 1777));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS563S0100000_19((RectRedesignRecUserCell) this, 1781));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS563S0100000_19((RectRedesignRecUserCell) this, 1778));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS563S0100000_19((RectRedesignRecUserCell) this, 1782));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS563S0100000_19((RectRedesignRecUserCell) this, 1783));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS563S0100000_19((RectRedesignRecUserCell) this, 1779));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS563S0100000_19((RectRedesignRecUserCell) this, 1770));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS563S0100000_19((RectRedesignRecUserCell) this, 1766));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19((RectRedesignRecUserCell) this, 1774));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS563S0100000_19((RectRedesignRecUserCell) this, 1776));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS563S0100000_19((RectRedesignRecUserCell) this, 1772));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS563S0100000_19((RectRedesignRecUserCell) this, 1768));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS563S0100000_19((RectRedesignRecUserCell) this, 1775));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS563S0100000_19((RectRedesignRecUserCell) this, 1769));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS563S0100000_19((RectRedesignRecUserCell) this, 1771));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS563S0100000_19((RectRedesignRecUserCell) this, 1773));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS563S0100000_19((RectRedesignRecUserCell) this, 1767));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS563S0100000_19((RectRedesignRecUserCell) this, 1780));
    public final int LLJZIJLIL = R.layout.elh;

    public final C427590Gph U6() {
        return (C427590Gph) this.LLJILJIL.getValue();
    }

    public final C1609500rzA getSocPubAvatarFrameLayout() {
        return (C1609500rzA) this.LLJILJILJ.getValue();
    }

    public final C1261200ivO p7() {
        return (C1261200ivO) this.LLJJI.getValue();
    }

    public final TuxTextView V6() {
        return C278730AwB.LIZ() ? (TuxTextView) this.LLJJIJIIJIL.getValue() : (TuxTextView) this.itemView.findViewById(R.id.c21);
    }

    public final View a7() {
        return C278730AwB.LIZ() ? (View) this.LLJL.getValue() : this.itemView.findViewById(R.id.d70);
    }

    public final TuxTag b7() {
        return C278730AwB.LIZ() ? (TuxTag) this.LLJJJJLIIL.getValue() : (TuxTag) this.itemView.findViewById(R.id.p74);
    }

    public final TuxTextView h7() {
        return C278730AwB.LIZ() ? (TuxTextView) this.LLJJIJI.getValue() : (TuxTextView) this.itemView.findViewById(R.id.p93);
    }

    public final RelationButton i7() {
        return C278730AwB.LIZ() ? (RelationButton) this.LLJJL.getValue() : (RelationButton) this.itemView.findViewById(R.id.t4f);
    }

    public final RelationLabelTextView j7() {
        return C278730AwB.LIZ() ? (RelationLabelTextView) this.LLJJJIL.getValue() : (RelationLabelTextView) this.itemView.findViewById(R.id.t4q);
    }

    public final C197039127h k7() {
        return C278730AwB.LIZ() ? (C197039127h) this.LLJJLIIIJLLLLLLLZ.getValue() : (C197039127h) this.itemView.findViewById(R.id.t5v);
    }

    public final Space l7() {
        return C278730AwB.LIZ() ? (Space) this.LLJJIJIL.getValue() : (Space) this.itemView.findViewById(R.id.vr8);
    }

    public final Space m7() {
        return C278730AwB.LIZ() ? (Space) this.LLJJJJJIL.getValue() : (Space) this.itemView.findViewById(R.id.vr9);
    }

    public final Space n7() {
        return C278730AwB.LIZ() ? (Space) this.LLJJJ.getValue() : (Space) this.itemView.findViewById(R.id.vra);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C428150Gqb.LIZ(this.itemView, EnumC428940Grs.LIGHT_MASK, 0.0f);
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final int a6() {
        return this.LLJZIJLIL;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void f6(C0SY7 c0sy7) {
        boolean z;
        int i;
        super.f6(c0sy7);
        ITEM item = getItem();
        if (item == null) {
            return;
        }
        C1261860iwS c1261860iwS = item.LLILZIL;
        C1262090iwp c1262090iwp = item.LLILLL;
        C197039127h c197039127hK7 = k7();
        if (c1261860iwS.getFollowStatus() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, c197039127hK7);
        if (k7().getVisibility() != 0) {
            i7().setButtonVariant(1);
            if (c1262090iwp.LIZJ) {
                i7().setTextColorRes(R.attr.ee);
                RelationButton relationButtonI7 = i7();
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.dy);
                c384050F3z.LIZJ = Float.valueOf(P5());
                relationButtonI7.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
            }
        }
        if (s7(c1261860iwS, c0sy7.getValue()) && p7().getVisibility() == 8) {
            C1261200ivO c1261200ivOP7 = p7();
            View viewA7 = a7();
            C786410Ut5.LJLLLLLL(0, c1261200ivOP7);
            C786410Ut5.T4(c1261200ivOP7, 0.0f);
            HandlerHook.viewPost(c1261200ivOP7, new ARunnableS74S0200000_5(c1261200ivOP7, viewA7, 52));
            C1261090ivD c1261090ivDR7 = r7(c1261860iwS);
            if (c1261090ivDR7.LIZJ > 0) {
                this.LLJLL = true;
            }
            if (c1261090ivDR7.LIZLLL > 0) {
                this.LLJLLIL = true;
            }
        }
        S6(c1261860iwS, c1262090iwp);
        L6(c1261860iwS, c1262090iwp);
        D6(c1262090iwp, item);
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void h6(C1261650iw7 c1261650iw7) {
        Set<String> setNr2;
        Fragment fragmentLIZ;
        Lifecycle lifecycle;
        String strLJJJLIIL;
        super.h6(c1261650iw7);
        if (c1261650iw7.LLILLL.LJJIIJ) {
            InterfaceC494301wD interfaceC494301wD = null;
            try {
                if (!Intrinsics.LJFF(this.itemView.getTag(R.id.usercard_unbind_tag), Boolean.TRUE)) {
                    LifecycleOwner lifecycleOwner = getLifecycleOwner();
                    if ((((lifecycleOwner instanceof Fragment) && (fragmentLIZ = (Fragment) lifecycleOwner) != null) || (fragmentLIZ = C946803n0.LIZ(this.itemView)) != null) && (fragmentLIZ.isDetached() || !fragmentLIZ.isAdded())) {
                        C1264320j0Q.LIZ.getClass();
                        C1264320j0Q.LIZIZ("Ability", "attach fragment illegal!", null);
                    } else {
                        LifecycleOwner lifecycleOwner2 = getLifecycleOwner();
                        if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
                            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                                C1264320j0Q.LIZ.getClass();
                                C1264320j0Q.LIZIZ("Ability", "get ability illegal!", null);
                            } else {
                                InterfaceC1263010iyJ interfaceC1263010iyJI5 = I5();
                                if (interfaceC1263010iyJI5 != null) {
                                    strLJJJLIIL = interfaceC1263010iyJI5.LJJJLIIL();
                                } else {
                                    strLJJJLIIL = null;
                                }
                                InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJ(this.itemView, null), IUserCardListAbility.class, strLJJJLIIL);
                                if (interfaceC494301wDLIZ == null) {
                                    C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(strLJJJLIIL);
                                    sbLIZ.append("'s ");
                                    sbLIZ.append(C13LE.LIZ(IUserCardListAbility.class).LJI());
                                    sbLIZ.append(" not found, parent: ");
                                    sbLIZ.append(this.itemView.getParent());
                                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                    c1264320j0Q.getClass();
                                    C1264320j0Q.LIZIZ("Ability", strLIZIZ, null);
                                }
                                interfaceC494301wD = interfaceC494301wDLIZ;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1264320j0Q.LIZ.getClass();
                C1264320j0Q.LIZIZ("Ability", "get ability error!", th);
            }
            IUserCardListAbility iUserCardListAbility = (IUserCardListAbility) interfaceC494301wD;
            if (iUserCardListAbility != null && (setNr2 = iUserCardListAbility.Nr2()) != null) {
                setNr2.add(c1261650iw7.LLILLJJLI.getElementId());
            }
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, S5());
            if (numLIZJ != null) {
                this.itemView.setBackgroundColor(numLIZJ.intValue());
            }
        }
        if (C304890BxH.LIZIZ() && c1261650iw7.LIZLLL()) {
            C0N58.LIZ().clear();
            C0N58.LIZIZ().clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1261090ivD r7(com.ss.android.ugc.aweme.profile.model.User r12) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.usercard.impl.cell.RectRedesignRecUserCell.r7(com.ss.android.ugc.aweme.profile.model.User):X.0ivD");
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void D6(C1262090iwp c1262090iwp, C1261650iw7 c1261650iw7) {
        boolean z;
        boolean z2;
        boolean z3;
        Fragment fragmentVQ2;
        C19EG c19eg;
        super.D6(c1262090iwp, c1261650iw7);
        this.LLJLILLLLZIIL = c1261650iw7.LLILZIL.isAccuratePrivateAccount();
        C1261090ivD c1261090ivDR7 = r7(c1261650iw7.LLILZIL);
        c1261650iw7.LLIZ = Integer.valueOf(c1261090ivDR7.LIZIZ.size());
        boolean z4 = true;
        if (c1261090ivDR7.LIZLLL > 0) {
            z = true;
        } else {
            z = false;
        }
        c1261650iw7.LLIZLLLIL = Boolean.valueOf(z);
        if (p7().getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c1261090ivDR7.LIZJ > 0 && (C1073960e3O.LIZJ().group != 2 || z2)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LLJLL = z3;
        if (c1261090ivDR7.LIZLLL <= 0 || (C1073960e3O.LIZJ().group == 2 && !z2)) {
            z4 = false;
        }
        this.LLJLLIL = z4;
        if (c1262090iwp.LJJIJ) {
            Activity activityLIZ = C1388190mED.LIZ(this.itemView.getContext());
            if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
                fragmentVQ2 = C486860J7k.LIZIZ(c19eg).vQ2();
            } else {
                fragmentVQ2 = null;
            }
            i7().setRequestListener(new AwS455S0200000_19((RectRedesignRecUserCell) this, fragmentVQ2, (Fragment) 15));
        }
        if (c1262090iwp.LJJJJZI) {
            ((View) this.LLJJIII.getValue()).setBackground(null);
        }
        if (c1262090iwp.LJJJLIIL) {
            this.itemView.setBackground(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J6(X.C1261860iwS r9, X.C1262090iwp r10) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.usercard.impl.cell.RectRedesignRecUserCell.J6(X.0iwS, X.0iwp):void");
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void L6(C1261860iwS c1261860iwS, C1262090iwp c1262090iwp) {
        EnumC1606080rte enumC1606080rteLJII;
        InterfaceC1398730mVD interfaceC1398730mVD = (InterfaceC1398730mVD) this.LLJZ.getValue();
        if (interfaceC1398730mVD != null) {
            enumC1606080rteLJII = interfaceC1398730mVD.LJII();
        } else {
            enumC1606080rteLJII = null;
        }
        if (enumC1606080rteLJII == EnumC1606080rte.INBOX_SUGGESTED_ACCOUNT && c1262090iwp.LIZ == 105) {
            if (getSocPubAvatarFrameLayout().getMode() != EnumC1605470rsf.ON && getSocPubAvatarFrameLayout().getMode() != EnumC1605470rsf.OFF) {
                U6().setAvatarSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)));
            } else {
                U6().setAvatarSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)));
            }
            C1609500rzA socPubAvatarFrameLayout = getSocPubAvatarFrameLayout();
            C447550Hgn.LJFF(socPubAvatarFrameLayout, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64))));
            socPubAvatarFrameLayout.setRingStrokeWidthByAvatarSize(52);
            return;
        }
        int i = c1262090iwp.LIZ;
        if (i != 105) {
            if (i == 106) {
                U6().setAvatarSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(84)));
                h7().setTuxFont(103);
                V6().setTuxFont(61);
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96));
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(84));
                if (getSocPubAvatarFrameLayout().getMode() == EnumC1605470rsf.NONE) {
                    iLIZIZ = iLIZIZ2;
                }
                C447550Hgn.LJFF(getSocPubAvatarFrameLayout(), Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ));
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("not supported current variant: ");
            sbLIZ.append(c1262090iwp.LIZ);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        U6().setAvatarSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)));
        h7().setTuxFont(52);
        V6().setTuxFont(61);
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
        int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
        if (getSocPubAvatarFrameLayout().getMode() == EnumC1605470rsf.NONE) {
            iLIZIZ3 = iLIZIZ4;
        }
        C447550Hgn.LJFF(getSocPubAvatarFrameLayout(), Integer.valueOf(iLIZIZ3), Integer.valueOf(iLIZIZ3));
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void S6(C1261860iwS c1261860iwS, C1262090iwp c1262090iwp) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((View) this.LLJILLL.getValue()).getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) ((View) this.LLJJ.getValue()).getLayoutParams();
        int i = c1262090iwp.LIZ;
        if (i != 105) {
            if (i == 106) {
                C447550Hgn.LJFF(l7(), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))));
                C447550Hgn.LJFF(n7(), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))));
                C447550Hgn.LJFF(m7(), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))));
                return;
            }
            return;
        }
        C447550Hgn.LJFF(l7(), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))));
        C447550Hgn.LJFF(n7(), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))));
        C447550Hgn.LJFF(m7(), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))));
        marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        C786410Ut5.d6((LinearLayout) this.LLJILLL.getValue(), marginLayoutParams);
        marginLayoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        C786410Ut5.d6((LinearLayout) this.LLJJ.getValue(), marginLayoutParams2);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0289  */
    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T6(X.C1261860iwS r13, X.C1262090iwp r14) {
        /*
            Method dump skipped, instruction units count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.usercard.impl.cell.RectRedesignRecUserCell.T6(X.0iwS, X.0iwp):void");
    }

    public final boolean s7(User user, int i) {
        C1261270ivV c1261270ivVB6;
        C1261090ivD c1261090ivDR7 = r7(user);
        if (c1261090ivDR7.LIZJ + c1261090ivDR7.LIZLLL > 0) {
            if ((i == C0SY7.FOLLOWED.getValue() || i == C0SY7.FOLLOW_MUTUAL.getValue()) && C1073960e3O.LIZJ().group == 2 && (c1261270ivVB6 = b6()) != null) {
                Integer num = c1261270ivVB6.LJIJJ;
                int value = EnumC1262370ixH.MAF_NEW_FOLLOWERS_UI_REDESIGN.getValue();
                if (num != null && num.intValue() == value) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void v6(C1261860iwS c1261860iwS, C1262090iwp c1262090iwp) {
        ITEM item;
        W5(U6(), new AwS420S0200000_19(c1261860iwS, c1262090iwp, 187));
        if (c1262090iwp.LJJIII) {
            getSocPubAvatarFrameLayout().setMode(EnumC1605470rsf.NONE);
            InterfaceC1398730mVD interfaceC1398730mVD = (InterfaceC1398730mVD) this.LLJZ.getValue();
            if (interfaceC1398730mVD != null) {
                interfaceC1398730mVD.LIZLLL(c1261860iwS);
            }
        }
        if (!c1262090iwp.LJIL && (item = getItem()) != null) {
            C786410Ut5.ra(U6(), new ACListenerS122S0200000_19(this, item, 70));
            C427690Gpr.LJFF(U6(), C418440Gaw.LIZIZ(42));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0161  */
    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w6(X.C1261860iwS r26, X.C1262090iwp r27) {
        /*
            Method dump skipped, instruction units count: 1460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.usercard.impl.cell.RectRedesignRecUserCell.w6(X.0iwS, X.0iwp):void");
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell, com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell
    public final /* bridge */ /* synthetic */ void R5(int i, InterfaceC1891350zJl interfaceC1891350zJl, boolean z) {
        R5(i, (C1261650iw7) interfaceC1891350zJl, z);
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    /* JADX INFO: renamed from: e6 */
    public final void R5(int i, C1261650iw7 c1261650iw7, boolean z) {
        InterfaceC1398730mVD interfaceC1398730mVD;
        super.R5(i, c1261650iw7, z);
        if (getSocPubAvatarFrameLayout().getMode() != EnumC1605470rsf.NONE && z && (interfaceC1398730mVD = (InterfaceC1398730mVD) this.LLJZ.getValue()) != null) {
            interfaceC1398730mVD.LJIIIIZZ(getSocPubAvatarFrameLayout().getMode());
        }
    }
}
