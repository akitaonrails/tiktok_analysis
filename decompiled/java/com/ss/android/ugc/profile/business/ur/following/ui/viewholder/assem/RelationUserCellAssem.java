package com.ss.android.ugc.profile.business.ur.following.ui.viewholder.assem;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0HHT;
import X.C0HX6;
import X.C1076010e6h;
import X.C1091830eWD;
import X.C1163440gNi;
import X.C1243340iSa;
import X.C1252120igk;
import X.C1265420j2C;
import X.C1388190mED;
import X.C13LE;
import X.C1609500rzA;
import X.C1610840s1K;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C19EG;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C631370Opb;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1264850j1H;
import X.InterfaceC1398730mVD;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC1265900j2y;
import Y.AObserverS223S0100000_19;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.live.notification.NotificationLiveAssemViewModel;
import com.ss.android.ugc.aweme.live.notification.ResponseState;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.label.RelationLabelTextView;
import com.ss.android.ugc.aweme.user.repository.UserAssemViewModel;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.FollowRelationInfoViewModel;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.FollowerListViewModel;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.FollowingListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS303S0000000_19;
import kotlin.jvm.internal.AFwS341S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class RelationUserCellAssem extends ReusedUISlotAssem<RelationUserCellAssem> implements InterfaceC712990Rxx<C1265420j2C>, InterfaceC1264850j1H {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLIIL;
    public C1265420j2C LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final RelationUserCellAssem LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public RelationLabelTextView LLLFZ;
    public C1091830eWD LLLI;
    public final C01GW LLLII;
    public SlimRoom LLLIIII;
    public final C01GW LLLIIIIL;
    public final InterfaceC1731706qJ LLLIIIL;
    public final InterfaceC1731706qJ LLLIIL;
    public final InterfaceC1731706qJ LLLIILIL;
    public final InterfaceC1731706qJ LLLIL;
    public final InterfaceC1731706qJ LLLILZ;
    public final C01GW LLLILZJ;
    public final C01GW LLLILZLLLI;
    public final C01GW LLLIZZ;
    public final C01GW LLLJ;
    public final C01GW LLLJIL;
    public final C01GW LLLJL;
    public final C01GW LLLL;
    public final C01GW LLLLII;
    public final C01GW LLLLIIIILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RelationUserCellAssem.class, "followRelationInfoViewModel", "getFollowRelationInfoViewModel()Lcom/ss/android/ugc/profile/business/ur/following/ui/viewmodel/FollowRelationInfoViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(RelationUserCellAssem.class, "followerRelationViewModel", "getFollowerRelationViewModel()Lcom/ss/android/ugc/profile/business/ur/following/ui/viewmodel/FollowerListViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(RelationUserCellAssem.class, "followingListViewModel", "getFollowingListViewModel()Lcom/ss/android/ugc/profile/business/ur/following/ui/viewmodel/FollowingListViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(RelationUserCellAssem.class, "userViewModel", "getUserViewModel()Lcom/ss/android/ugc/aweme/user/repository/UserAssemViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(RelationUserCellAssem.class, "notificationLiveViewModel", "getNotificationLiveViewModel()Lcom/ss/android/ugc/aweme/live/notification/NotificationLiveAssemViewModel;", 0);
        c09r3.getClass();
        LLLLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    public RelationUserCellAssem() {
        mp(C1163440gNi.LIZJ);
        this.LLJLIL = this;
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2370));
        this.LLJLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2363));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2364));
        this.LLJLLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2362));
        this.LLJZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2375));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2372));
        this.LLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2365));
        this.LLLF = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2377));
        this.LLLFF = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2366));
        this.LLLFFI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2361));
        this.LLLII = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2367));
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2373));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FollowRelationInfoViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLLIIIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ, 2380), null, AFwS257S0000000_19.get$arr$(436));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FollowerListViewModel.class);
        this.LLLIIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ2, 2381), null, AFwS257S0000000_19.get$arr$(437));
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(FollowingListViewModel.class);
        this.LLLIILIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ3, 2382), null, AFwS257S0000000_19.get$arr$(438));
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(UserAssemViewModel.class);
        this.LLLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c0hht, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ4, 2357), null, AFwS257S0000000_19.get$arr$(434));
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(NotificationLiveAssemViewModel.class);
        this.LLLILZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ5), c0hht, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ5, 2360), null, AFwS257S0000000_19.get$arr$(435));
        this.LLLILZJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2369));
        this.LLLILZLLLI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2376));
        this.LLLIZZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2374));
        this.LLLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2368));
        this.LLLJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2371));
        this.LLLJL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2359));
        this.LLLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2378));
        this.LLLLII = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2379));
        this.LLLLIIIILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2358));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ecr;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // X.InterfaceC1264850j1H
    public final C1610840s1K A5() {
        return (C1610840s1K) this.LLJLL.getValue();
    }

    @Override // X.InterfaceC1264850j1H
    public final InterfaceC1398730mVD G9() {
        return (InterfaceC1398730mVD) this.LLLLII.getValue();
    }

    @Override // X.InterfaceC1264850j1H
    public final boolean LLIL() {
        return ((Boolean) this.LLLILZJ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1264850j1H
    public final String M2() {
        return (String) this.LLLIZZ.getValue();
    }

    @Override // X.InterfaceC1264850j1H
    public final TuxIconView P4() {
        return (TuxIconView) this.LLL.getValue();
    }

    @Override // X.InterfaceC1264850j1H
    public final String Ri() {
        return (String) this.LLLJ.getValue();
    }

    @Override // X.InterfaceC1264850j1H
    public final String Ye() {
        return (String) this.LLLILZLLLI.getValue();
    }

    public final Observer<C1243340iSa> op() {
        return (Observer) this.LLLLIIIILLL.getValue();
    }

    @Override // X.InterfaceC1264850j1H
    public final String qk() {
        return (String) this.LLLJIL.getValue();
    }

    public final FollowRelationInfoViewModel sp() {
        return (FollowRelationInfoViewModel) this.LLLIIIL.getValue(this, LLLLIIL[0]);
    }

    @Override // X.InterfaceC1264850j1H
    public final TextView t7() {
        return (TextView) this.LLJLLIL.getValue();
    }

    public final C0HX6 tp() {
        return (C0HX6) this.LLJLILLLLZIIL.getValue();
    }

    public final TuxIconView up() {
        return (TuxIconView) this.LLLF.getValue();
    }

    public final TextView yp() {
        return (TextView) this.LLJLLL.getValue();
    }

    @Override // X.InterfaceC1264850j1H
    /* JADX INFO: renamed from: zp, reason: merged with bridge method [inline-methods] */
    public final UserAssemViewModel R5() {
        return (UserAssemViewModel) this.LLLIL.getValue(this, LLLLIIL[3]);
    }

    public final String Ap() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem=");
        sbLIZ.append(System.identityHashCode(this));
        sbLIZ.append(",view=");
        sbLIZ.append(System.identityHashCode(getContentView()));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1264850j1H
    public final int Yg() {
        return C631370Opb.LIZIZ(this);
    }

    @Override // X.InterfaceC1264850j1H
    public final View bl() {
        return getContentView();
    }

    @Override // X.InterfaceC1264850j1H
    public final C19EG getFragmentActivity() {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(getContentView().getContext());
        if (c19egLIZIZ != null) {
            return c19egLIZIZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC1264850j1H
    public final RelationLabelTextView H2() {
        return this.LLLFZ;
    }

    @Override // X.InterfaceC1264850j1H
    public final SlimRoom Lk() {
        return this.LLLIIII;
    }

    @Override // X.InterfaceC1264850j1H
    public final C1091830eWD S5() {
        return this.LLLI;
    }

    @Override // X.InterfaceC1264850j1H
    public final C1265420j2C Z0() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC1264850j1H
    public final LifecycleOwner getLifecycleOwner() {
        return this.LLJLIL;
    }

    @Override // X.InterfaceC1264850j1H
    public final void gf(SlimRoom slimRoom) {
        this.LLLIIII = slimRoom;
    }

    @Override // X.InterfaceC1264850j1H
    public final void o9(RelationLabelTextView relationLabelTextView) {
        this.LLLFZ = relationLabelTextView;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewParent parent;
        User user;
        View view2 = (View) this.LLLFF.getValue();
        String secUid = null;
        if (view2 != null) {
            parent = view2.getParent();
        } else {
            parent = null;
        }
        C786410Ut5.LJJJLZIJ((View) this.LLLFF.getValue(), (ViewGroup) parent);
        tp().addView((View) this.LLLFF.getValue(), 1);
        ((C1609500rzA) this.LLLII.getValue()).setRingStrokeWidthByAvatarSize(56);
        UserAssemViewModel userAssemViewModelR5 = R5();
        subscribe(userAssemViewModelR5, C736820SvI.LIZIZ(userAssemViewModelR5.usedInReusedScene), null, AFwS303S0000000_19.get$arr$(35));
        InterfaceC1731706qJ interfaceC1731706qJ = this.LLLILZ;
        InterfaceC2217461Bqa<?>[] interfaceC2217461BqaArr = LLLLIIL;
        NotificationLiveAssemViewModel notificationLiveAssemViewModel = (NotificationLiveAssemViewModel) interfaceC1731706qJ.getValue(this, interfaceC2217461BqaArr[4]);
        C1265420j2C c1265420j2C = this.LLJJLIIIJLLLLLLLZ;
        if (c1265420j2C != null && (user = c1265420j2C.LLILLJJLI) != null) {
            secUid = user.getSecUid();
        }
        notificationLiveAssemViewModel.getClass();
        C1252120igk.LIZ(notificationLiveAssemViewModel, secUid);
        C736680Sv4.LJIIIZ(this, (AssemViewModel) this.LLLILZ.getValue(this, interfaceC2217461BqaArr[4]), new C2217381BqS() { // from class: X.0ihy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ResponseState) obj).getCacheEvent();
            }
        }, new C2217381BqS() { // from class: X.0ii2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((ResponseState) obj).getPushState());
            }
        }, null, AFwS341S0000000_19.get$arr$(5), 12);
        C1076010e6h.LIZJ.LIZIZ().LIZ().observe(this, op());
        if (Intrinsics.LJFF(Ye(), "following_relation")) {
            ((FollowingListViewModel) this.LLLIILIL.getValue(this, interfaceC2217461BqaArr[2])).LLJIJIL.observe(this, new AObserverS223S0100000_19(this, 58));
        }
        if (!this.LLJL) {
            this.LLJL = true;
            getContentView().addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1265900j2y(this, 2));
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1265420j2C c1265420j2C) {
        User user;
        C1265420j2C c1265420j2C2 = c1265420j2C;
        C1265420j2C c1265420j2C3 = this.LLJJLIIIJLLLLLLLZ;
        if (c1265420j2C3 != null && (user = c1265420j2C3.LLILLJJLI) != null) {
            user.getUid();
        }
        this.LLJJLIIIJLLLLLLLZ = c1265420j2C2;
        UserAssemViewModel userAssemViewModelR5 = R5();
        User user2 = c1265420j2C2.LLILLJJLI;
        userAssemViewModelR5.getClass();
        userAssemViewModelR5.setStateImmediate(new AwS598S0100000_19(user2, 805));
    }

    @Override // X.InterfaceC1264850j1H
    public final void si(C1091830eWD c1091830eWD) {
        this.LLLI = c1091830eWD;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1265420j2C c1265420j2C) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1265420j2C c1265420j2C) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
