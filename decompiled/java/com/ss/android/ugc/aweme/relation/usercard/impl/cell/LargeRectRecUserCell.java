package com.ss.android.ugc.aweme.relation.usercard.impl.cell;

import X.C01GW;
import X.C0N58;
import X.C0SY7;
import X.C1260990iv3;
import X.C1261650iw7;
import X.C1261680iwA;
import X.C1261860iwS;
import X.C1262090iwp;
import X.C1262300ixA;
import X.C1262320ixC;
import X.C1262590ixd;
import X.C1264070j01;
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
import X.C296540Bjo;
import X.C304890BxH;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C427590Gph;
import X.C427690Gpr;
import X.C427870Gq9;
import X.C428150Gqb;
import X.C447550Hgn;
import X.C452501pT;
import X.C486860J7k;
import X.C786410Ut5;
import X.C814420VxA;
import X.C946803n0;
import X.EnumC1262370ixH;
import X.EnumC1605470rsf;
import X.EnumC428940Grs;
import X.InterfaceC1263010iyJ;
import X.InterfaceC1398730mVD;
import X.InterfaceC1891350zJl;
import X.InterfaceC494301wD;
import Y.ACListenerS122S0200000_19;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.relation.label.RelationLabelTextView;
import com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility;
import com.zhiliaoapp.musically.R;
import java.util.Set;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS455S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS700S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class LargeRectRecUserCell<ITEM extends C1261650iw7> extends AbsRecUserCell<C1261650iw7> {
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19((LargeRectRecUserCell) this, 1763));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS563S0100000_19((LargeRectRecUserCell) this, 1765));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS563S0100000_19((LargeRectRecUserCell) this, 1764));
    public final int LLJJ = R.layout.el_;

    public final C1609500rzA getSocPubAvatarFrameLayout() {
        return (C1609500rzA) this.LLJILJILJ.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C428150Gqb.LIZ(this.itemView, EnumC428940Grs.LIGHT_MASK, 0.0f);
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final int a6() {
        return this.LLJJ;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void f6(C0SY7 c0sy7) {
        int i;
        super.f6(c0sy7);
        ITEM item = getItem();
        if (item == null) {
            return;
        }
        C1261860iwS c1261860iwS = item.LLILZIL;
        C1262090iwp c1262090iwp = item.LLILLL;
        View viewFindViewById = this.itemView.findViewById(R.id.t5v);
        if (c1261860iwS.getFollowStatus() == 0) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById);
        if (this.itemView.findViewById(R.id.t5v).getVisibility() != 0) {
            ((C197039127h) this.itemView.findViewById(R.id.t4f)).setButtonVariant(1);
            if (c1262090iwp.LIZJ) {
                ((TuxTextView) this.itemView.findViewById(R.id.t4f)).setTextColorRes(R.attr.ee);
                C197039127h c197039127h = (C197039127h) this.itemView.findViewById(R.id.t4f);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.dy);
                c384050F3z.LIZJ = Float.valueOf(P5());
                c197039127h.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
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

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void D6(C1262090iwp c1262090iwp, C1261650iw7 c1261650iw7) {
        C19EG c19eg;
        super.D6(c1262090iwp, c1261650iw7);
        if (c1262090iwp.LJJIJ) {
            Activity activityLIZ = C1388190mED.LIZ(this.itemView.getContext());
            Fragment fragmentVQ2 = null;
            if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
                fragmentVQ2 = C486860J7k.LIZIZ(c19eg).vQ2();
            }
            ((RelationButton) this.itemView.findViewById(R.id.t4f)).setRequestListener(new AwS455S0200000_19((LargeRectRecUserCell) this, fragmentVQ2, (Fragment) 13));
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void J6(C1261860iwS c1261860iwS, C1262090iwp c1262090iwp) {
        ITEM item;
        C1261680iwA.LIZIZ((TuxTextView) this.itemView.findViewById(R.id.p93), c1261860iwS);
        if (!c1262090iwp.LJIL && (item = getItem()) != null) {
            C786410Ut5.h9((TuxTextView) this.itemView.findViewById(R.id.p93), new ACListenerS122S0200000_19(this, item, 75));
            C427690Gpr.LJI(this.itemView.findViewById(R.id.p93), null);
        }
        MatchedFriendStruct matchedFriendStruct = c1261860iwS.getMatchedFriendStruct();
        if (matchedFriendStruct != null) {
            if (C304890BxH.LIZ() == 2) {
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
    public final void L6(C1261860iwS c1261860iwS, C1262090iwp c1262090iwp) {
        EnumC1605470rsf mode = getSocPubAvatarFrameLayout().getMode();
        EnumC1605470rsf enumC1605470rsf = EnumC1605470rsf.NONE;
        if (mode != enumC1605470rsf) {
            ((C427590Gph) this.LLJILJIL.getValue()).setAvatarSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)));
        } else {
            ((C427590Gph) this.LLJILJIL.getValue()).setAvatarSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(84)));
        }
        getSocPubAvatarFrameLayout().setRingStrokeWidthByAvatarSize(80);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(91));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(84));
        if (getSocPubAvatarFrameLayout().getMode() == enumC1605470rsf) {
            iLIZIZ = iLIZIZ2;
        }
        C447550Hgn.LJFF(getSocPubAvatarFrameLayout(), Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ));
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void S6(C1261860iwS c1261860iwS, C1262090iwp c1262090iwp) {
        View viewFindViewById = this.itemView.findViewById(R.id.vzi);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        if (getSocPubAvatarFrameLayout().getMode() == EnumC1605470rsf.NONE) {
            iLIZIZ = iLIZIZ2;
        }
        C447550Hgn.LJFF(viewFindViewById, Integer.valueOf(iLIZIZ), null);
        C426750GoL.LJIIIZ(this.itemView.findViewById(R.id.t4q), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), 0, 0, false, 16);
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
            Integer numValueOf2 = Integer.valueOf(((TextView) this.itemView.findViewById(R.id.t5v)).getCurrentTextColor());
            if (numValueOf2.intValue() != R.attr.ee) {
                numValueOf2.intValue();
                ((TuxTextView) this.itemView.findViewById(R.id.t5v)).setTextColorRes(R.attr.ee);
            }
            Integer numValueOf3 = Integer.valueOf(((TextView) this.itemView.findViewById(R.id.t4q)).getCurrentTextColor());
            if (numValueOf3.intValue() != R.attr.eh) {
                numValueOf3.intValue();
                ((TuxTextView) this.itemView.findViewById(R.id.t4q)).setTextColorRes(R.attr.eh);
            }
            C197039127h c197039127h = (C197039127h) this.itemView.findViewById(R.id.t5v);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.dy);
            c384050F3z.LIZJ = Float.valueOf(P5());
            c197039127h.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
            ((C197039127h) this.itemView.findViewById(R.id.t5v)).LJJLI(true);
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
            Integer numValueOf4 = Integer.valueOf(((TextView) this.itemView.findViewById(R.id.p93)).getCurrentTextColor());
            if (numValueOf4.intValue() != R.attr.a1h) {
                numValueOf4.intValue();
                ((TuxTextView) this.itemView.findViewById(R.id.p93)).setTextColorRes(R.attr.a1h);
            }
            Integer numValueOf5 = Integer.valueOf(((TextView) this.itemView.findViewById(R.id.t4q)).getCurrentTextColor());
            if (numValueOf5.intValue() != R.attr.a1k) {
                numValueOf5.intValue();
                ((TuxTextView) this.itemView.findViewById(R.id.t4q)).setTextColorRes(R.attr.a1k);
            }
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
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19(iUserCardListAbility2, c1261860iwS, 193));
            if (c1262090iwp.LJJIIJ && C1260990iv3.LIZJ(c1261860iwS) && !((Boolean) c01gwLIZIZ.getValue()).booleanValue()) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a0c, S5());
                if (numLIZJ != null) {
                    int iIntValue = numLIZJ.intValue();
                    this.itemView.setBackgroundColor(iIntValue);
                    C427690Gpr.LIZLLL(this.itemView, iIntValue);
                }
            } else if (C304890BxH.LIZIZ() && (item = getItem()) != null && item.LIZLLL() && iUserCardListAbility2 != null && (config = iUserCardListAbility2.getConfig()) != null && (c1262320ixC = config.listConfig) != null && c1262320ixC.LJFF && !((Boolean) c01gwLIZIZ.getValue()).booleanValue() && !iUserCardListAbility2.it2(c1261860iwS.getUid())) {
                z6(true, iUserCardListAbility2.HP0(c1261860iwS.getUid()));
                ITEM item4 = getItem();
                if (item4 != null && (c1261860iwS2 = item4.LLILZIL) != null) {
                    c1261860iwS2.getNickname();
                }
            } else {
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.bx, S5());
                if (numLIZJ2 != null) {
                    int iIntValue2 = numLIZJ2.intValue();
                    this.itemView.setBackgroundColor(iIntValue2);
                    C427690Gpr.LIZLLL(this.itemView, iIntValue2);
                }
            }
        }
        C428150Gqb.LIZ(this.itemView.findViewById(R.id.t5v), EnumC428940Grs.ALPHA, 0.0f);
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void v6(C1261860iwS c1261860iwS, C1262090iwp c1262090iwp) {
        ITEM item;
        W5((C427870Gq9) this.LLJILJIL.getValue(), new AwS420S0200000_19(c1261860iwS, c1262090iwp, 192));
        if (c1262090iwp.LJJIII) {
            getSocPubAvatarFrameLayout().setMode(EnumC1605470rsf.NONE);
            InterfaceC1398730mVD interfaceC1398730mVD = (InterfaceC1398730mVD) this.LLJILLL.getValue();
            if (interfaceC1398730mVD != null) {
                interfaceC1398730mVD.LIZLLL(c1261860iwS);
            }
        }
        if (!c1262090iwp.LJIL && (item = getItem()) != null) {
            C786410Ut5.ra((C427590Gph) this.LLJILJIL.getValue(), new ACListenerS122S0200000_19(this, item, 74));
            C427690Gpr.LJFF((View) this.LLJILJIL.getValue(), C418440Gaw.LIZIZ(42));
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void w6(C1261860iwS c1261860iwS, C1262090iwp c1262090iwp) {
        InterfaceC494301wD interfaceC494301wDLIZ;
        boolean z;
        int i;
        C1262090iwp c1262090iwp2;
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
        View viewFindViewById = this.itemView.findViewById(R.id.t5v);
        View viewFindViewById2 = this.itemView.findViewById(R.id.t5v);
        if (c1261860iwS.getFollowStatus() == 0) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById2);
        if (this.itemView.findViewById(R.id.t5v).getVisibility() != 0) {
            ((C197039127h) this.itemView.findViewById(R.id.t4f)).setButtonVariant(1);
            ITEM item = getItem();
            if (item != null && (c1262090iwp2 = item.LLILLL) != null && c1262090iwp2.LIZJ) {
                ((TuxTextView) this.itemView.findViewById(R.id.t4f)).setTextColorRes(R.attr.ee);
                C197039127h c197039127h = (C197039127h) this.itemView.findViewById(R.id.t4f);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.dy);
                c384050F3z.LIZJ = Float.valueOf(P5());
                c197039127h.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
            }
        }
        C786410Ut5.I7(new AbS700S0100000_19(this, 19), viewFindViewById);
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
        if (getSocPubAvatarFrameLayout().getMode() != EnumC1605470rsf.NONE && z && (interfaceC1398730mVD = (InterfaceC1398730mVD) this.LLJILLL.getValue()) != null) {
            interfaceC1398730mVD.LJIIIIZZ(getSocPubAvatarFrameLayout().getMode());
        }
    }
}
