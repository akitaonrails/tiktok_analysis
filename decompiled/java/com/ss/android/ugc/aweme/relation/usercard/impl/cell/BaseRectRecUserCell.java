package com.ss.android.ugc.aweme.relation.usercard.impl.cell;

import X.C01GW;
import X.C0SY7;
import X.C1260990iv3;
import X.C1261650iw7;
import X.C1261680iwA;
import X.C1261860iwS;
import X.C1262090iwp;
import X.C1262300ixA;
import X.C1262320ixC;
import X.C1262490ixT;
import X.C1262590ixd;
import X.C1264070j01;
import X.C1264320j0Q;
import X.C1308910kAL;
import X.C1387040mCM;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1609500rzA;
import X.C1908030zkf;
import X.C2188811AlT;
import X.C296540Bjo;
import X.C304890BxH;
import X.C418440Gaw;
import X.C426750GoL;
import X.C427590Gph;
import X.C427690Gpr;
import X.C428150Gqb;
import X.C452501pT;
import X.C459670I0v;
import X.C459680I0w;
import X.C786410Ut5;
import X.C946803n0;
import X.EnumC1262370ixH;
import X.EnumC1605470rsf;
import X.EnumC428940Grs;
import X.InterfaceC1263010iyJ;
import X.InterfaceC1398730mVD;
import X.InterfaceC1891350zJl;
import X.InterfaceC494301wD;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS122S0200000_19;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.relation.label.RelationLabelTextView;
import com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS700S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public abstract class BaseRectRecUserCell<ITEM extends C1261650iw7> extends AbsRecUserCell<C1261650iw7> {
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19((BaseRectRecUserCell) this, 1760));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS563S0100000_19((BaseRectRecUserCell) this, 1762));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS563S0100000_19((BaseRectRecUserCell) this, 1761));
    public final int LLJJ = R.layout.ele;

    public final C427590Gph U6() {
        return (C427590Gph) this.LLJILJIL.getValue();
    }

    public final C1609500rzA getSocPubAvatarFrameLayout() {
        return (C1609500rzA) this.LLJILJILJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        super.unBind();
        if (C304890BxH.LIZIZ()) {
            View view = this.itemView;
            C786410Ut5.T4(view, 1.0f);
            C786410Ut5.Jc(view, 0.0f);
            C786410Ut5.ed(view, 0.0f);
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public int a6() {
        return this.LLJJ;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public void f6(C0SY7 c0sy7) {
        int i;
        super.f6(c0sy7);
        ITEM item = getItem();
        if (item == null) {
            return;
        }
        C1261860iwS c1261860iwS = item.LLILZIL;
        C1262090iwp c1262090iwp = item.LLILLL;
        boolean zV6 = V6(c1261860iwS, c1262090iwp);
        View viewFindViewById = this.itemView.findViewById(R.id.fki);
        if (zV6) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById);
        S6(c1261860iwS, c1262090iwp);
        L6(c1261860iwS, c1262090iwp);
        D6(c1262090iwp, item);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h6(X.C1261650iw7 r15) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.usercard.impl.cell.BaseRectRecUserCell.h6(X.0iw7):void");
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell, com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell, com.bytedance.ies.powerlist.PowerCell
    public /* bridge */ /* synthetic */ void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        onBindItemView((C1261650iw7) interfaceC1891350zJl);
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public void J6(C1261860iwS c1261860iwS, C1262090iwp c1262090iwp) {
        CharSequence nickname;
        ITEM item;
        C459670I0v c459670I0v;
        TextView textView = (TextView) this.itemView.findViewById(R.id.p93);
        C459680I0w c459680I0w = this.LLILLL;
        int i = C1261680iwA.LIZ;
        if (c459680I0w == null || (c459670I0v = c459680I0w.LIZ) == null || (nickname = (SpannableString) c459670I0v.invoke(c1261860iwS.getNickname(), textView.getContext())) == null) {
            nickname = c1261860iwS.getNickname();
        }
        textView.setText(nickname);
        C1908030zkf.LJI(textView.getContext(), c1261860iwS.getCustomVerify(), c1261860iwS.getEnterpriseVerifyReason(), textView);
        if (!c1262090iwp.LJIL && (item = getItem()) != null) {
            C786410Ut5.h9((TuxTextView) this.itemView.findViewById(R.id.p93), new ACListenerS122S0200000_19(this, item, 73));
            C427690Gpr.LJI(this.itemView.findViewById(R.id.p93), null);
        }
        MatchedFriendStruct matchedFriendStruct = c1261860iwS.getMatchedFriendStruct();
        if (matchedFriendStruct != null) {
            if (C304890BxH.LIZIZ()) {
                matchedFriendStruct.setRecMore(Boolean.valueOf(c1261860iwS.isRelatedRec()));
            }
            r6(this.itemView.findViewById(R.id.t4q));
            if (c1262090iwp.LIZJ) {
                RelationLabelTextView.LJJJJL((RelationLabelTextView) this.itemView.findViewById(R.id.t4q), matchedFriendStruct, C1264070j01.LIZIZ);
            } else {
                RelationLabelTextView.LJJJJL((RelationLabelTextView) this.itemView.findViewById(R.id.t4q), matchedFriendStruct, C1264070j01.LIZ);
            }
            U5(c1261860iwS, c1262090iwp);
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public void S6(C1261860iwS c1261860iwS, C1262090iwp c1262090iwp) {
        C426750GoL.LJIIL(this.itemView, null, Integer.valueOf(c1262090iwp.LJIILIIL), null, Integer.valueOf(c1262090iwp.LJIILIIL), 21);
        Integer num = c1262090iwp.LJJJJI;
        if (num != null) {
            int iIntValue = num.intValue();
            ViewGroup.LayoutParams layoutParams = this.itemView.findViewById(R.id.t4q).getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = iIntValue;
                View viewFindViewById = this.itemView.findViewById(R.id.t4q);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewFindViewById);
                viewFindViewById.setLayoutParams(layoutParams);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void T6(C1261860iwS c1261860iwS, C1262090iwp c1262090iwp) {
        ITEM item;
        C1262300ixA config;
        C1262320ixC c1262320ixC;
        C1261860iwS c1261860iwS2;
        Fragment fragmentLIZ;
        Lifecycle lifecycle;
        String strLJJJLIIL;
        ITEM item2;
        C1262300ixA config2;
        C1262320ixC c1262320ixC2;
        C1261860iwS c1261860iwS3;
        Fragment fragmentLIZ2;
        Lifecycle lifecycle2;
        String strLJJJLIIL2;
        InterfaceC494301wD interfaceC494301wD = null;
        if (c1262090iwp.LIZJ) {
            Integer numValueOf = Integer.valueOf(((TextView) this.itemView.findViewById(R.id.p93)).getCurrentTextColor());
            if (numValueOf.intValue() != R.attr.ee) {
                numValueOf.intValue();
                ((TuxTextView) this.itemView.findViewById(R.id.p93)).setTextColorRes(R.attr.ee);
            }
            Integer numValueOf2 = Integer.valueOf(((TextView) this.itemView.findViewById(R.id.t4q)).getCurrentTextColor());
            if (numValueOf2.intValue() != R.attr.eh) {
                numValueOf2.intValue();
                ((TuxTextView) this.itemView.findViewById(R.id.t4q)).setTextColorRes(R.attr.eh);
            }
            ((TuxIconView) this.itemView.findViewById(R.id.fki)).setTintColorRes(R.attr.e8);
            try {
                if (!Intrinsics.LJFF(this.itemView.getTag(R.id.usercard_unbind_tag), Boolean.TRUE)) {
                    LifecycleOwner lifecycleOwner = getLifecycleOwner();
                    if ((((lifecycleOwner instanceof Fragment) && (fragmentLIZ2 = (Fragment) lifecycleOwner) != null) || (fragmentLIZ2 = C946803n0.LIZ(this.itemView)) != null) && (fragmentLIZ2.isDetached() || !fragmentLIZ2.isAdded())) {
                        C1264320j0Q.LIZ.getClass();
                        C1264320j0Q.LIZIZ("Ability", "attach fragment illegal!", null);
                    } else {
                        LifecycleOwner lifecycleOwner2 = getLifecycleOwner();
                        if (lifecycleOwner2 != null && (lifecycle2 = lifecycleOwner2.getLifecycle()) != null) {
                            if (lifecycle2.getCurrentState() == Lifecycle.State.DESTROYED) {
                                C1264320j0Q.LIZ.getClass();
                                C1264320j0Q.LIZIZ("Ability", "get ability illegal!", null);
                            } else {
                                InterfaceC1263010iyJ interfaceC1263010iyJI5 = I5();
                                if (interfaceC1263010iyJI5 != null) {
                                    strLJJJLIIL2 = interfaceC1263010iyJI5.LJJJLIIL();
                                } else {
                                    strLJJJLIIL2 = null;
                                }
                                InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJ(this.itemView, null), IUserCardListAbility.class, strLJJJLIIL2);
                                if (interfaceC494301wDLIZ == null) {
                                    C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(strLJJJLIIL2);
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
            if (C304890BxH.LIZIZ() && (item2 = getItem()) != null && item2.LIZLLL() && iUserCardListAbility != null && (config2 = iUserCardListAbility.getConfig()) != null && (c1262320ixC2 = config2.listConfig) != null && c1262320ixC2.LJFF && !iUserCardListAbility.Nr2().contains(c1261860iwS.getElementId()) && !iUserCardListAbility.it2(c1261860iwS.getUid())) {
                z6(true, iUserCardListAbility.HP0(c1261860iwS.getUid()));
                ITEM item3 = getItem();
                if (item3 != null && (c1261860iwS3 = item3.LLILZIL) != null) {
                    c1261860iwS3.getNickname();
                }
            }
        } else {
            Integer numValueOf3 = Integer.valueOf(((TextView) this.itemView.findViewById(R.id.p93)).getCurrentTextColor());
            if (numValueOf3.intValue() != R.attr.a1h) {
                numValueOf3.intValue();
                ((TuxTextView) this.itemView.findViewById(R.id.p93)).setTextColorRes(R.attr.a1h);
            }
            Integer numValueOf4 = Integer.valueOf(((TextView) this.itemView.findViewById(R.id.t4q)).getCurrentTextColor());
            if (numValueOf4.intValue() != R.attr.a1k) {
                numValueOf4.intValue();
                ((TuxTextView) this.itemView.findViewById(R.id.t4q)).setTextColorRes(R.attr.a1k);
            }
            ((TuxIconView) this.itemView.findViewById(R.id.fki)).setTintColorRes(R.attr.a1p);
            try {
                if (!Intrinsics.LJFF(this.itemView.getTag(R.id.usercard_unbind_tag), Boolean.TRUE)) {
                    LifecycleOwner lifecycleOwner3 = getLifecycleOwner();
                    if ((((lifecycleOwner3 instanceof Fragment) && (fragmentLIZ = (Fragment) lifecycleOwner3) != null) || (fragmentLIZ = C946803n0.LIZ(this.itemView)) != null) && (fragmentLIZ.isDetached() || !fragmentLIZ.isAdded())) {
                        C1264320j0Q.LIZ.getClass();
                        C1264320j0Q.LIZIZ("Ability", "attach fragment illegal!", null);
                    } else {
                        LifecycleOwner lifecycleOwner4 = getLifecycleOwner();
                        if (lifecycleOwner4 != null && (lifecycle = lifecycleOwner4.getLifecycle()) != null) {
                            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                                C1264320j0Q.LIZ.getClass();
                                C1264320j0Q.LIZIZ("Ability", "get ability illegal!", null);
                            } else {
                                InterfaceC1263010iyJ interfaceC1263010iyJI52 = I5();
                                if (interfaceC1263010iyJI52 != null) {
                                    strLJJJLIIL = interfaceC1263010iyJI52.LJJJLIIL();
                                } else {
                                    strLJJJLIIL = null;
                                }
                                InterfaceC494301wD interfaceC494301wDLIZ2 = C1558520qew.LIZ(C1558360qeg.LJ(this.itemView, null), IUserCardListAbility.class, strLJJJLIIL);
                                if (interfaceC494301wDLIZ2 == null) {
                                    C1264320j0Q c1264320j0Q2 = C1264320j0Q.LIZ;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append(strLJJJLIIL);
                                    sbLIZ2.append("'s ");
                                    sbLIZ2.append(C13LE.LIZ(IUserCardListAbility.class).LJI());
                                    sbLIZ2.append(" not found, parent: ");
                                    sbLIZ2.append(this.itemView.getParent());
                                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                                    c1264320j0Q2.getClass();
                                    C1264320j0Q.LIZIZ("Ability", strLIZIZ2, null);
                                }
                                interfaceC494301wD = interfaceC494301wDLIZ2;
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1264320j0Q.LIZ.getClass();
                C1264320j0Q.LIZIZ("Ability", "get ability error!", th2);
            }
            IUserCardListAbility iUserCardListAbility2 = (IUserCardListAbility) interfaceC494301wD;
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19(iUserCardListAbility2, c1261860iwS, 188));
            if (c1262090iwp.LJJIIJ && C1260990iv3.LIZJ(c1261860iwS) && !((Boolean) c01gwLIZIZ.getValue()).booleanValue()) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a0c, S5());
                if (numLIZJ != null) {
                    int iIntValue = numLIZJ.intValue();
                    this.itemView.setBackgroundColor(iIntValue);
                    C427690Gpr.LIZLLL(this.itemView, iIntValue);
                }
            } else if (c1262090iwp.LJJIIJZLJL) {
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1b, S5());
                if (numLIZJ2 != null) {
                    int iIntValue2 = numLIZJ2.intValue();
                    this.itemView.setBackgroundColor(iIntValue2);
                    C427690Gpr.LIZLLL(this.itemView, iIntValue2);
                }
            } else if (C304890BxH.LIZIZ() && (item = getItem()) != null && item.LIZLLL() && iUserCardListAbility2 != null && (config = iUserCardListAbility2.getConfig()) != null && (c1262320ixC = config.listConfig) != null && c1262320ixC.LJFF && !iUserCardListAbility2.Nr2().contains(c1261860iwS.getElementId()) && !iUserCardListAbility2.it2(c1261860iwS.getUid())) {
                z6(true, iUserCardListAbility2.HP0(c1261860iwS.getUid()));
                ITEM item4 = getItem();
                if (item4 != null && (c1261860iwS2 = item4.LLILZIL) != null) {
                    c1261860iwS2.getNickname();
                }
            } else {
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.bx, S5());
                if (numLIZJ3 != null) {
                    int iIntValue3 = numLIZJ3.intValue();
                    this.itemView.setBackgroundColor(iIntValue3);
                    C427690Gpr.LIZLLL(this.itemView, iIntValue3);
                }
            }
        }
        C428150Gqb.LIZ(this.itemView.findViewById(R.id.fki), EnumC428940Grs.ALPHA, 0.0f);
    }

    public final boolean V6(C1261860iwS c1261860iwS, C1262090iwp c1262090iwp) {
        int i = c1262090iwp.LIZLLL;
        if (i != 203 && i != 200 && c1261860iwS.getFollowStatus() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void v6(C1261860iwS c1261860iwS, C1262090iwp c1262090iwp) {
        ITEM item;
        W5(U6(), new AwS563S0100000_19(C1262490ixT.LIZ(c1262090iwp, 401, c1261860iwS, false), 3192));
        if (c1262090iwp.LJJIII) {
            getSocPubAvatarFrameLayout().setMode(EnumC1605470rsf.NONE);
            InterfaceC1398730mVD interfaceC1398730mVD = (InterfaceC1398730mVD) this.LLJILLL.getValue();
            if (interfaceC1398730mVD != null) {
                interfaceC1398730mVD.LIZLLL(c1261860iwS);
            }
        }
        if (!c1262090iwp.LJIL && (item = getItem()) != null) {
            C786410Ut5.ra(U6(), new ACListenerS122S0200000_19(this, item, 72));
            C427690Gpr.LJFF(U6(), C418440Gaw.LIZIZ(28));
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void w6(C1261860iwS c1261860iwS, C1262090iwp c1262090iwp) {
        InterfaceC494301wD interfaceC494301wDLIZ;
        boolean z;
        int i;
        C1262300ixA config;
        C1262590ixd c1262590ixd;
        Fragment fragmentLIZ;
        Lifecycle lifecycle;
        String strLJJJLIIL;
        EnumC1262370ixH enumC1262370ixH = null;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1264320j0Q.LIZ.getClass();
            C1264320j0Q.LIZIZ("Ability", "get ability error!", th);
        }
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
                        interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJ(this.itemView, null), IUserCardListAbility.class, strLJJJLIIL);
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
                    }
                }
            }
            interfaceC494301wDLIZ = null;
        } else {
            interfaceC494301wDLIZ = null;
        }
        IUserCardListAbility iUserCardListAbility = (IUserCardListAbility) interfaceC494301wDLIZ;
        if (iUserCardListAbility != null && (config = iUserCardListAbility.getConfig()) != null && (c1262590ixd = config.apiConfig) != null) {
            enumC1262370ixH = c1262590ixd.LIZ;
        }
        RelationButton relationButton = (RelationButton) this.itemView.findViewById(R.id.t4f);
        if (enumC1262370ixH != EnumC1262370ixH.FYP_POPUP && enumC1262370ixH != EnumC1262370ixH.INBOX_PROFILE_POPUP && C296540Bjo.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        K6(relationButton, c1261860iwS, c1262090iwp, true, z);
        View viewFindViewById = this.itemView.findViewById(R.id.fki);
        if (V6(c1261860iwS, c1262090iwp)) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById);
        if (viewFindViewById.getVisibility() == 0) {
            C1387040mCM.LIZ(viewFindViewById, new AwS633S0100000_19(this, (BaseRectRecUserCell<C1261650iw7>) 289));
            C786410Ut5.I7(new AbS700S0100000_19(this, 16), viewFindViewById);
        }
    }
}
