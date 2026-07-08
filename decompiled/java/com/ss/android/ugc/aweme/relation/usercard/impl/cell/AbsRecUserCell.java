package com.ss.android.ugc.aweme.relation.usercard.impl.cell;

import X.AbstractC1261010iv5;
import X.AbstractC848400XPy;
import X.AnonymousClass0950;
import X.AnonymousClass0956;
import X.C01GW;
import X.C0SY7;
import X.C0XQ7;
import X.C1261270ivV;
import X.C1261400ivi;
import X.C1261420ivk;
import X.C1261430ivl;
import X.C1261540ivw;
import X.C1261650iw7;
import X.C1261860iwS;
import X.C1262090iwp;
import X.C1262300ixA;
import X.C1262320ixC;
import X.C1262590ixd;
import X.C1264320j0Q;
import X.C1264800j1C;
import X.C1308910kAL;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1336205Ku;
import X.C1361400lX0;
import X.C13LE;
import X.C13LZ;
import X.C1558360qeg;
import X.C1558520qew;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C23250099c;
import X.C2441009hQ;
import X.C296540Bjo;
import X.C304890BxH;
import X.C418440Gaw;
import X.C426750GoL;
import X.C427690Gpr;
import X.C447550Hgn;
import X.C452501pT;
import X.C459680I0w;
import X.C786410Ut5;
import X.C814420VxA;
import X.C946803n0;
import X.C960203pA;
import X.EnumC1261560ivy;
import X.EnumC1262370ixH;
import X.InterfaceC1261750iwH;
import X.InterfaceC1263010iyJ;
import X.InterfaceC1891350zJl;
import X.InterfaceC494301wD;
import X.ViewOnLongClickListenerC1265840j2s;
import Y.AUListenerS71S0101000_19;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.label.RelationLabelTextView;
import com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility;
import com.ss.android.ugc.aweme.relation.usercard.ability.RecUserCellTrackAbility;
import com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS103S0201000_19;
import kotlin.jvm.internal.AwS143S0201000_19;
import kotlin.jvm.internal.AwS159S0101000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS509S0200000_19;

/* JADX INFO: loaded from: classes20.dex */
public abstract class AbsRecUserCell<ITEM extends C1261650iw7> extends BasePowerCell<ITEM> {
    public C459680I0w LLILLL;
    public boolean LLILZIL;
    public AnonymousClass0956 LLJIJIL;
    public C1261860iwS LLILZ = new C1261860iwS(-1);
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS563S0100000_19((AbsRecUserCell) this, 1758));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS563S0100000_19((AbsRecUserCell) this, 1759));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19((AbsRecUserCell) this, 1756));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS563S0100000_19((AbsRecUserCell) this, 1757));
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(308));

    public abstract void J6(C1261860iwS c1261860iwS, C1262090iwp c1262090iwp);

    public abstract void L6(C1261860iwS c1261860iwS, C1262090iwp c1262090iwp);

    public abstract void S6(C1261860iwS c1261860iwS, C1262090iwp c1262090iwp);

    public abstract void T6(C1261860iwS c1261860iwS, C1262090iwp c1262090iwp);

    public abstract int a6();

    public void q6(int i) {
    }

    public abstract void v6(C1261860iwS c1261860iwS, C1262090iwp c1262090iwp);

    public abstract void w6(C1261860iwS c1261860iwS, C1262090iwp c1262090iwp);

    public final C1261270ivV b6() {
        return (C1261270ivV) this.LLIZ.getValue();
    }

    public final void c6() {
        C1261860iwS c1261860iwS;
        Fragment fragmentLIZ;
        Lifecycle lifecycle;
        if (C304890BxH.LIZJ()) {
            z6(false, true);
            ITEM item = getItem();
            if (item == null || (c1261860iwS = item.LLILZIL) == null || !c1261860iwS.isRelatedRec()) {
                return;
            }
            InterfaceC494301wD interfaceC494301wD = null;
            try {
                if (!Intrinsics.LJFF(this.itemView.getTag(R.id.usercard_unbind_tag), Boolean.TRUE)) {
                    LifecycleOwner lifecycleOwner = getLifecycleOwner();
                    if (((!(lifecycleOwner instanceof Fragment) || (fragmentLIZ = (Fragment) lifecycleOwner) == null) && (fragmentLIZ = C946803n0.LIZ(this.itemView)) == null) || (!fragmentLIZ.isDetached() && fragmentLIZ.isAdded())) {
                        LifecycleOwner lifecycleOwner2 = getLifecycleOwner();
                        if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
                            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                                C1264320j0Q.LIZ.getClass();
                                C1264320j0Q.LIZIZ("Ability", "get ability illegal!", null);
                            } else {
                                InterfaceC1263010iyJ interfaceC1263010iyJI5 = I5();
                                String strLJJJLIIL = interfaceC1263010iyJI5 != null ? interfaceC1263010iyJI5.LJJJLIIL() : null;
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
                    } else {
                        C1264320j0Q.LIZ.getClass();
                        C1264320j0Q.LIZIZ("Ability", "attach fragment illegal!", null);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1264320j0Q.LIZ.getClass();
                C1264320j0Q.LIZIZ("Ability", "get ability error!", th);
            }
            IUserCardListAbility iUserCardListAbility = (IUserCardListAbility) interfaceC494301wD;
            if (iUserCardListAbility != null) {
                iUserCardListAbility.dL0(c1261860iwS);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        InterfaceC494301wD interfaceC494301wDLIZ;
        Fragment fragmentLIZ;
        Lifecycle lifecycle;
        super.onViewAttachedToWindow();
        if (C304890BxH.LIZIZ()) {
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1264320j0Q.LIZ.getClass();
                C1264320j0Q.LIZIZ("Ability", "get ability error!", th);
            }
            if (Intrinsics.LJFF(this.itemView.getTag(R.id.usercard_unbind_tag), Boolean.TRUE)) {
                interfaceC494301wDLIZ = null;
            } else {
                LifecycleOwner lifecycleOwner = getLifecycleOwner();
                if (((!(lifecycleOwner instanceof Fragment) || (fragmentLIZ = (Fragment) lifecycleOwner) == null) && (fragmentLIZ = C946803n0.LIZ(this.itemView)) == null) || (!fragmentLIZ.isDetached() && fragmentLIZ.isAdded())) {
                    LifecycleOwner lifecycleOwner2 = getLifecycleOwner();
                    if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
                        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                            C1264320j0Q.LIZ.getClass();
                            C1264320j0Q.LIZIZ("Ability", "get ability illegal!", null);
                        } else {
                            InterfaceC1263010iyJ interfaceC1263010iyJI5 = I5();
                            String strLJJJLIIL = interfaceC1263010iyJI5 != null ? interfaceC1263010iyJI5.LJJJLIIL() : null;
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
                } else {
                    C1264320j0Q.LIZ.getClass();
                    C1264320j0Q.LIZIZ("Ability", "attach fragment illegal!", null);
                }
                interfaceC494301wDLIZ = null;
            }
            IUserCardListAbility iUserCardListAbility = (IUserCardListAbility) interfaceC494301wDLIZ;
            if (iUserCardListAbility != null) {
                iUserCardListAbility.Eg((C1261430ivl) this.LLJ.getValue());
            }
            LifecycleOwner lifecycleOwner3 = getLifecycleOwner();
            AnonymousClass0950 anonymousClass0950ND2 = iUserCardListAbility != null ? iUserCardListAbility.ND2() : null;
            if (lifecycleOwner3 == null || anonymousClass0950ND2 == null) {
                return;
            }
            AnonymousClass0956 anonymousClass0956 = this.LLJIJIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLJIJIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner3), null, null, new C1261420ivk(lifecycleOwner3, anonymousClass0950ND2, iUserCardListAbility, this, null), 3);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        InterfaceC494301wD interfaceC494301wDLIZ;
        Animator animator;
        Animator animator2;
        Fragment fragmentLIZ;
        Lifecycle lifecycle;
        super.onViewDetachedFromWindow();
        if (C304890BxH.LIZIZ()) {
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1264320j0Q.LIZ.getClass();
                C1264320j0Q.LIZIZ("Ability", "get ability error!", th);
            }
            if (Intrinsics.LJFF(this.itemView.getTag(R.id.usercard_unbind_tag), Boolean.TRUE)) {
                interfaceC494301wDLIZ = null;
            } else {
                LifecycleOwner lifecycleOwner = getLifecycleOwner();
                if (((!(lifecycleOwner instanceof Fragment) || (fragmentLIZ = (Fragment) lifecycleOwner) == null) && (fragmentLIZ = C946803n0.LIZ(this.itemView)) == null) || (!fragmentLIZ.isDetached() && fragmentLIZ.isAdded())) {
                    LifecycleOwner lifecycleOwner2 = getLifecycleOwner();
                    if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
                        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                            C1264320j0Q.LIZ.getClass();
                            C1264320j0Q.LIZIZ("Ability", "get ability illegal!", null);
                        } else {
                            InterfaceC1263010iyJ interfaceC1263010iyJI5 = I5();
                            String strLJJJLIIL = interfaceC1263010iyJI5 != null ? interfaceC1263010iyJI5.LJJJLIIL() : null;
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
                } else {
                    C1264320j0Q.LIZ.getClass();
                    C1264320j0Q.LIZIZ("Ability", "attach fragment illegal!", null);
                }
                interfaceC494301wDLIZ = null;
            }
            IUserCardListAbility iUserCardListAbility = (IUserCardListAbility) interfaceC494301wDLIZ;
            if (iUserCardListAbility != null) {
                iUserCardListAbility.ng((C1261430ivl) this.LLJ.getValue());
            }
            AnonymousClass0956 anonymousClass0956 = this.LLJIJIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLJIJIL = null;
            Object tag = this.itemView.getTag(R.id.f802svb);
            if ((tag instanceof Animator) && (animator2 = (Animator) tag) != null) {
                animator2.cancel();
            }
            Object tag2 = this.itemView.getTag(R.id.svc);
            if ((tag2 instanceof Animator) && (animator = (Animator) tag2) != null) {
                animator.cancel();
            }
            this.itemView.setTag(R.id.f802svb, null);
            this.itemView.setTag(R.id.svc, null);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return a6();
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell
    public final void T5(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1261650iw7 c1261650iw7 = (C1261650iw7) interfaceC1891350zJl;
        super.T5(c1261650iw7);
        c1261650iw7.LLILZLL = false;
        this.LLILZIL = false;
    }

    public final boolean X5(User user) {
        List<Integer> canMessageFollowStatusList;
        if (user == null || (canMessageFollowStatusList = user.getCanMessageFollowStatusList()) == null || !(!canMessageFollowStatusList.isEmpty()) || C1336205Ku.LIZJ().LIZJ()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: d6, reason: merged with bridge method [inline-methods] */
    public void onBindItemView(ITEM item) {
        String nickname;
        Boolean boolValueOf;
        C1261860iwS c1261860iwS;
        C1261860iwS c1261860iwS2;
        C1261860iwS c1261860iwS3;
        super.onBindItemView(item);
        this.LLILZ = item.LLILZIL;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bind item ");
        sbLIZ.append(this.LLILZ.getNickname());
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLILZ.isRelatedRec()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("RecMore bind ");
            sbLIZ2.append(this.LLILZ.getNickname());
            sbLIZ2.append(", ");
            ITEM item2 = getItem();
            AbstractC1261010iv5 from = null;
            if (item2 != null && (c1261860iwS3 = item2.LLILZIL) != null) {
                nickname = c1261860iwS3.getNickname();
            } else {
                nickname = null;
            }
            sbLIZ2.append(nickname);
            sbLIZ2.append(", ");
            ITEM item3 = getItem();
            if (item3 != null && (c1261860iwS2 = item3.LLILZIL) != null) {
                boolValueOf = Boolean.valueOf(c1261860iwS2.isRelatedRec());
            } else {
                boolValueOf = null;
            }
            sbLIZ2.append(boolValueOf);
            sbLIZ2.append(", from: ");
            ITEM item4 = getItem();
            if (item4 != null && (c1261860iwS = item4.LLILZIL) != null) {
                from = c1261860iwS.getFrom();
            }
            sbLIZ2.append(from);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        this.LLILLL = item.LLILZ;
        if (C304890BxH.LIZIZ()) {
            View view = this.itemView;
            C786410Ut5.T4(view, 1.0f);
            C786410Ut5.Jc(view, 0.0f);
            C786410Ut5.ed(view, 0.0f);
        }
        C1262090iwp c1262090iwp = item.LLILLL;
        T6(this.LLILZ, c1262090iwp);
        v6(this.LLILZ, c1262090iwp);
        J6(this.LLILZ, c1262090iwp);
        w6(this.LLILZ, c1262090iwp);
        L6(this.LLILZ, c1262090iwp);
        S6(this.LLILZ, c1262090iwp);
        D6(c1262090iwp, item);
        C1261860iwS c1261860iwS4 = this.LLILZ;
        if (!c1262090iwp.LJJIJIIJI) {
            this.itemView.setOnLongClickListener(new ViewOnLongClickListenerC1265840j2s(c1261860iwS4, this, 1));
        }
    }

    public void f6(C0SY7 c0sy7) {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        ITEM item;
        InterfaceC494301wD interfaceC494301wDLIZ;
        Fragment fragmentLIZ;
        Lifecycle lifecycle2;
        String strLJJJLIIL;
        Function1<Function1<? super InterfaceC1261750iwH, Unit>, Unit> function1;
        Fragment fragmentLIZ2;
        Lifecycle lifecycle3;
        String strLJJJLIIL2;
        Fragment fragment;
        if (this.itemView.getParent() != null && (lifecycleOwner = getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            Lifecycle.State currentState = lifecycle.getCurrentState();
            Lifecycle.State state = Lifecycle.State.DESTROYED;
            if (currentState == state) {
                return;
            }
            LifecycleOwner lifecycleOwner2 = getLifecycleOwner();
            InterfaceC494301wD interfaceC494301wD = null;
            if (((lifecycleOwner2 instanceof Fragment) && (fragment = (Fragment) lifecycleOwner2) != null && fragment.isDetached()) || (item = getItem()) == null) {
                return;
            }
            int iN5 = N5();
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1264320j0Q.LIZ.getClass();
                C1264320j0Q.LIZIZ("Ability", "get ability error!", th);
            }
            if (!Intrinsics.LJFF(this.itemView.getTag(R.id.usercard_unbind_tag), Boolean.TRUE)) {
                LifecycleOwner lifecycleOwner3 = getLifecycleOwner();
                if ((((lifecycleOwner3 instanceof Fragment) && (fragmentLIZ2 = (Fragment) lifecycleOwner3) != null) || (fragmentLIZ2 = C946803n0.LIZ(this.itemView)) != null) && (fragmentLIZ2.isDetached() || !fragmentLIZ2.isAdded())) {
                    C1264320j0Q.LIZ.getClass();
                    C1264320j0Q.LIZIZ("Ability", "attach fragment illegal!", null);
                } else {
                    LifecycleOwner lifecycleOwner4 = getLifecycleOwner();
                    if (lifecycleOwner4 != null && (lifecycle3 = lifecycleOwner4.getLifecycle()) != null) {
                        if (lifecycle3.getCurrentState() == state) {
                            C1264320j0Q.LIZ.getClass();
                            C1264320j0Q.LIZIZ("Ability", "get ability illegal!", null);
                        } else {
                            InterfaceC1263010iyJ interfaceC1263010iyJI5 = I5();
                            if (interfaceC1263010iyJI5 != null) {
                                strLJJJLIIL2 = interfaceC1263010iyJI5.LJJJLIIL();
                            } else {
                                strLJJJLIIL2 = null;
                            }
                            interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJ(this.itemView, null), RecUserCellTrackAbility.class, strLJJJLIIL2);
                            if (interfaceC494301wDLIZ == null) {
                                C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(strLJJJLIIL2);
                                sbLIZ.append("'s ");
                                sbLIZ.append(C13LE.LIZ(RecUserCellTrackAbility.class).LJI());
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
            RecUserCellTrackAbility recUserCellTrackAbility = (RecUserCellTrackAbility) interfaceC494301wDLIZ;
            if (recUserCellTrackAbility != null && (function1 = recUserCellTrackAbility.LLILLL) != null) {
                function1.invoke(new AwS103S0201000_19(iN5, c0sy7, item, 5));
            }
            if (c0sy7 != C0SY7.UNFOLLOW) {
                try {
                    if (!Intrinsics.LJFF(this.itemView.getTag(R.id.usercard_unbind_tag), Boolean.TRUE)) {
                        LifecycleOwner lifecycleOwner5 = getLifecycleOwner();
                        if ((((lifecycleOwner5 instanceof Fragment) && (fragmentLIZ = (Fragment) lifecycleOwner5) != null) || (fragmentLIZ = C946803n0.LIZ(this.itemView)) != null) && (fragmentLIZ.isDetached() || !fragmentLIZ.isAdded())) {
                            C1264320j0Q.LIZ.getClass();
                            C1264320j0Q.LIZIZ("Ability", "attach fragment illegal!", null);
                        } else {
                            LifecycleOwner lifecycleOwner6 = getLifecycleOwner();
                            if (lifecycleOwner6 != null && (lifecycle2 = lifecycleOwner6.getLifecycle()) != null) {
                                if (lifecycle2.getCurrentState() == Lifecycle.State.DESTROYED) {
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
                IUserCardListAbility iUserCardListAbility = (IUserCardListAbility) interfaceC494301wD;
                if (iUserCardListAbility != null) {
                    iUserCardListAbility.Tr2(item, this.LLILZIL);
                }
            }
            new FollowStatus(item.LLILZIL.getUid(), c0sy7.getValue()).setFollowFrom(22);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h6(ITEM r41) {
        /*
            Method dump skipped, instruction units count: 854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell.h6(X.0iw7):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onResume(boolean z) {
        super.onResume(z);
        if (z) {
            this.LLILZIL = false;
        }
    }

    public final void r6(View view) {
        Map<String, Boolean> map;
        C786410Ut5.LJLLLLLL(0, view);
        RecUserCellTrackAbility recUserCellTrackAbility = (RecUserCellTrackAbility) this.LLILZLL.getValue();
        if (recUserCellTrackAbility != null && (map = recUserCellTrackAbility.LLILZIL) != null) {
            if (C1264800j1C.LIZIZ()) {
                map.put(this.LLILZ.getUid(), Boolean.TRUE);
            } else {
                map.put(this.LLILZ.getUid(), null);
            }
        }
    }

    public static void u6(SmartAvatarImageView smartAvatarImageView, int i) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = smartAvatarImageView.getLayoutParams();
        if (layoutParams2 != null && layoutParams2.width == i && (layoutParams = smartAvatarImageView.getLayoutParams()) != null && layoutParams.height == i) {
            return;
        }
        C447550Hgn.LJFF(smartAvatarImageView, Integer.valueOf(i), Integer.valueOf(i));
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LIZIZ = C418440Gaw.LIZIZ(1);
        c1331750klB.LIZJ = C960203pA.LIZ(R.attr.br, smartAvatarImageView.getContext());
        c1331750klB.LJ = i;
        smartAvatarImageView.setCircleOptions(new C1331730kl9(c1331750klB));
    }

    public void D6(C1262090iwp c1262090iwp, ITEM item) {
        if (!c1262090iwp.LJIL) {
            C786410Ut5.I7(new AbS509S0200000_19(this, item, 4), this.itemView);
        }
    }

    public final void U5(C1261860iwS c1261860iwS, C1262090iwp c1262090iwp) {
        InterfaceC494301wD interfaceC494301wDLIZ;
        C1262590ixd c1262590ixd;
        InterfaceC494301wD interfaceC494301wDLIZ2;
        C1262320ixC c1262320ixC;
        EnumC1262370ixH enumC1262370ixH;
        RelationLabelTextView relationLabelTextView;
        View viewFindViewById;
        TuxIconView tuxIconView;
        TextView textView;
        String str;
        String string;
        String uid;
        ConcurrentHashMap<Pair<String, String>, Boolean> concurrentHashMap;
        boolean zBooleanValue;
        int iLIZIZ;
        Integer num;
        Space space;
        int i;
        Boolean boolPutIfAbsent;
        int i2;
        MatchedFriendStruct matchedFriendStruct;
        C1262300ixA config;
        Fragment fragmentLIZ;
        Lifecycle lifecycle;
        String strLJJJLIIL;
        C1262300ixA config2;
        Fragment fragmentLIZ2;
        Lifecycle lifecycle2;
        String strLJJJLIIL2;
        Pair<String, String> pair = null;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1264320j0Q.LIZ.getClass();
            C1264320j0Q.LIZIZ("Ability", "get ability error!", th);
        }
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
                        interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJ(this.itemView, null), IUserCardListAbility.class, strLJJJLIIL2);
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
                    }
                }
            }
            interfaceC494301wDLIZ = null;
        } else {
            interfaceC494301wDLIZ = null;
        }
        IUserCardListAbility iUserCardListAbility = (IUserCardListAbility) interfaceC494301wDLIZ;
        if (iUserCardListAbility != null && (config2 = iUserCardListAbility.getConfig()) != null) {
            c1262590ixd = config2.apiConfig;
        } else {
            c1262590ixd = null;
        }
        try {
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C1264320j0Q.LIZ.getClass();
            C1264320j0Q.LIZIZ("Ability", "get ability error!", th2);
        }
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
                        interfaceC494301wDLIZ2 = C1558520qew.LIZ(C1558360qeg.LJ(this.itemView, null), IUserCardListAbility.class, strLJJJLIIL);
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
                    }
                }
            }
            interfaceC494301wDLIZ2 = null;
        } else {
            interfaceC494301wDLIZ2 = null;
        }
        IUserCardListAbility iUserCardListAbility2 = (IUserCardListAbility) interfaceC494301wDLIZ2;
        if (iUserCardListAbility2 != null && (config = iUserCardListAbility2.getConfig()) != null) {
            c1262320ixC = config.listConfig;
        } else {
            c1262320ixC = null;
        }
        if (c1262590ixd != null) {
            enumC1262370ixH = c1262590ixd.LIZ;
        } else {
            enumC1262370ixH = null;
        }
        if (((Number) C296540Bjo.LIZ.getValue()).intValue() == 2 && enumC1262370ixH != EnumC1262370ixH.FYP_POPUP && enumC1262370ixH != EnumC1262370ixH.INBOX_PROFILE_POPUP) {
            Context context = this.itemView.getContext();
            View view = this.itemView;
            if (view == null || (relationLabelTextView = (RelationLabelTextView) view.findViewById(R.id.t4q)) == null) {
                relationLabelTextView = null;
            }
            View view2 = this.itemView;
            if (view2 == null || (viewFindViewById = view2.findViewById(R.id.igy)) == null) {
                viewFindViewById = null;
            }
            View view3 = this.itemView;
            if (view3 == null || (tuxIconView = (TuxIconView) view3.findViewById(R.id.ih0)) == null) {
                tuxIconView = null;
            }
            View view4 = this.itemView;
            if (view4 == null || (textView = (TextView) view4.findViewById(R.id.ih1)) == null) {
                textView = null;
            }
            if (c1261860iwS != null && (matchedFriendStruct = c1261860iwS.getMatchedFriendStruct()) != null) {
                str = matchedFriendStruct.recommendReason;
            } else {
                str = null;
            }
            if (context != null) {
                string = context.getString(2131834752);
            } else {
                string = null;
            }
            boolean zEquals = TextUtils.equals(str, string);
            if (relationLabelTextView != null) {
                if (zEquals) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                C786410Ut5.v0(relationLabelTextView, i2);
            }
            if (c1261860iwS != null) {
                uid = c1261860iwS.getUid();
            } else {
                uid = null;
            }
            String uid2 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getUid();
            if (c1262320ixC != null) {
                concurrentHashMap = c1262320ixC.LJI;
            } else {
                concurrentHashMap = null;
            }
            if (uid2 != null && uid != null) {
                pair = new Pair<>(uid2, uid);
            }
            if (c1261860iwS != null && c1261860iwS.getFollowStatus() == C0SY7.UNFOLLOW.getValue() && c1261860iwS.getFollowerStatus() == C0SY7.FOLLOWED.getValue()) {
                zBooleanValue = true;
            } else {
                zBooleanValue = false;
            }
            if (pair != null && concurrentHashMap != null) {
                Boolean boolValueOf = concurrentHashMap.get(pair);
                if (boolValueOf == null && (boolPutIfAbsent = concurrentHashMap.putIfAbsent(pair, (boolValueOf = Boolean.valueOf(zBooleanValue)))) != null) {
                    boolValueOf = boolPutIfAbsent;
                }
                Boolean bool = boolValueOf;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                }
            }
            if (viewFindViewById != null) {
                if (zBooleanValue) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, viewFindViewById);
            }
            if (zEquals && (space = (Space) this.itemView.findViewById(R.id.vra)) != null) {
                C786410Ut5.LLIIZ(space, 8);
            }
            if (viewFindViewById != null) {
                if (c1262090iwp != null && (num = c1262090iwp.LJJIJIL) != null) {
                    iLIZIZ = num.intValue();
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
                }
                C426750GoL.LJIIIZ(viewFindViewById, null, Integer.valueOf(iLIZIZ), null, null, false, 29);
            }
            if (c1262090iwp != null && c1262090iwp.LIZJ) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, new C1361400lX0(context, R.style.y0));
                if (numLIZJ != null) {
                    int iIntValue = numLIZJ.intValue();
                    if (tuxIconView != null) {
                        tuxIconView.setTintColor(iIntValue);
                    }
                }
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, new C1361400lX0(context, R.style.y0));
                if (numLIZJ2 != null) {
                    int iIntValue2 = numLIZJ2.intValue();
                    if (textView != null) {
                        textView.setTextColor(iIntValue2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dd A[PHI: r3
      0x00dd: PHI (r3v3 java.lang.String) = (r3v1 java.lang.String), (r3v4 java.lang.String) binds: [B:45:0x00db, B:43:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W5(X.C427870Gq9 r9, kotlin.jvm.functions.Function0 r10) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell.W5(X.0Gq9, kotlin.jvm.functions.Function0):void");
    }

    public final void i6(EnumC1261560ivy enumC1261560ivy, C1261650iw7 c1261650iw7) {
        InterfaceC494301wD interfaceC494301wDLIZ;
        Function0<C1261270ivV> function0;
        C1261270ivV c1261270ivVInvoke;
        Fragment fragmentLIZ;
        Lifecycle lifecycle;
        String strLJJJLIIL;
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
                        interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJ(this.itemView, null), RecUserCellTrackAbility.class, strLJJJLIIL);
                        if (interfaceC494301wDLIZ == null) {
                            C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(strLJJJLIIL);
                            sbLIZ.append("'s ");
                            sbLIZ.append(C13LE.LIZ(RecUserCellTrackAbility.class).LJI());
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
        RecUserCellTrackAbility recUserCellTrackAbility = (RecUserCellTrackAbility) interfaceC494301wDLIZ;
        if (recUserCellTrackAbility != null && (function0 = recUserCellTrackAbility.LL) != null && (c1261270ivVInvoke = function0.invoke()) != null && c1261270ivVInvoke.LJIL) {
            c1261650iw7.LLJ = enumC1261560ivy.getValue();
        }
    }

    public final void z6(boolean z, boolean z2) {
        InterfaceC494301wD interfaceC494301wDLIZ;
        C1262300ixA config;
        C1262590ixd c1262590ixd;
        Fragment fragmentLIZ;
        Lifecycle lifecycle;
        String strLJJJLIIL;
        Integer numLIZJ;
        ColorDrawable colorDrawable;
        Integer numValueOf;
        Animator animator;
        EnumC1262370ixH enumC1262370ixH = null;
        if (!z) {
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.bx, S5());
            if (numLIZJ2 != null) {
                final int iIntValue = numLIZJ2.intValue();
                final AwS159S0101000_19 awS159S0101000_19 = new AwS159S0101000_19(iIntValue, this, 1);
                Drawable background = this.itemView.getBackground();
                if ((background instanceof ColorDrawable) && (colorDrawable = (ColorDrawable) background) != null && (numValueOf = Integer.valueOf(colorDrawable.getColor())) != null && numValueOf.intValue() != iIntValue) {
                    Object tag = this.itemView.getTag(R.id.f802svb);
                    if ((tag instanceof Animator) && (animator = (Animator) tag) != null) {
                        animator.cancel();
                    }
                    int iAlpha = Color.alpha(numValueOf.intValue());
                    ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(Color.rgb(Color.red(numValueOf.intValue()), Color.green(numValueOf.intValue()), Color.blue(numValueOf.intValue()))), Integer.valueOf(Color.rgb(Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue))));
                    valueAnimatorOfObject.setDuration(340L);
                    valueAnimatorOfObject.addUpdateListener(new AUListenerS71S0101000_19(iAlpha, this, 1));
                    valueAnimatorOfObject.addListener(new AnimatorListenerAdapter() { // from class: X.0ivv
                        public boolean LL;

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationCancel(Animator animator2) {
                            this.LL = true;
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator2) {
                            this.LLILLJJLI.itemView.setTag(R.id.f802svb, null);
                            if (this.LL) {
                                return;
                            }
                            this.LLILLJJLI.itemView.setBackgroundColor(iIntValue);
                            awS159S0101000_19.invoke();
                        }
                    });
                    this.itemView.setTag(R.id.f802svb, valueAnimatorOfObject);
                    valueAnimatorOfObject.start();
                    return;
                }
                this.itemView.setBackgroundColor(iIntValue);
                awS159S0101000_19.invoke();
                return;
            }
            return;
        }
        if (C304890BxH.LIZJ()) {
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
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a0c, S5());
            if (numLIZJ3 != null) {
                int iIntValue2 = numLIZJ3.intValue();
                if (enumC1262370ixH != EnumC1262370ixH.INBOX_PAGE && enumC1262370ixH != EnumC1262370ixH.MAF_NEW_FOLLOWERS_UI_REDESIGN) {
                    V5(iIntValue2, 430L, z2, false);
                    return;
                } else {
                    V5(C2441009hQ.LJIIL(iIntValue2, 19), 430L, z2, false);
                    return;
                }
            }
            return;
        }
        if (C304890BxH.LIZLLL() && (numLIZJ = C1308910kAL.LIZJ(R.attr.a03, S5())) != null) {
            V5(C2441009hQ.LJIIL(numLIZJ.intValue(), C13LZ.LJ((int) (((r3 >> 24) & 255) * 0.55f), 0, 255)), 200L, z2, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell
    /* JADX INFO: renamed from: e6, reason: merged with bridge method [inline-methods] */
    public void R5(int i, ITEM item, boolean z) {
        RecUserCellTrackAbility recUserCellTrackAbility = (RecUserCellTrackAbility) this.LLILZLL.getValue();
        if (recUserCellTrackAbility != null) {
            boolean z2 = recUserCellTrackAbility.LL.invoke().LJIIIIZZ;
            if (z) {
                if (z2) {
                    C1261540ivw.LIZ.getClass();
                    C1261540ivw.LIZIZ.LIZIZ++;
                    C447550Hgn.LIZJ(new AwS143S0201000_19(recUserCellTrackAbility, item, i, 6));
                    return;
                }
                return;
            }
            if (z2) {
                return;
            }
            C447550Hgn.LIZJ(new AwS143S0201000_19(recUserCellTrackAbility, item, i, 7));
        }
    }

    public final void V5(int i, long j, boolean z, boolean z2) {
        if (!z) {
            C427690Gpr.LIZLLL(this.itemView, i);
            this.itemView.setBackgroundColor(i);
        } else {
            this.itemView.setBackgroundColor(0);
            C447550Hgn.LIZIZ(this.itemView, new C1261400ivi(this, z2, j, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K6(com.ss.android.ugc.aweme.relation.follow.ui.RelationButton r14, X.C1261860iwS r15, X.C1262090iwp r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell.K6(com.ss.android.ugc.aweme.relation.follow.ui.RelationButton, X.0iwS, X.0iwp, boolean, boolean):void");
    }
}
