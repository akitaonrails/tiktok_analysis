package com.ss.android.ugc.aweme.business.live.cell;

import X.AbstractC1597860rgO;
import X.AnonymousClass0956;
import X.C01GW;
import X.C0ACG;
import X.C0J5O;
import X.C10EU;
import X.C1243240iSQ;
import X.C1322110kVd;
import X.C1387050mCN;
import X.C1595960rdK;
import X.C1596560reI;
import X.C1597100rfA;
import X.C1597740rgC;
import X.C1597820rgK;
import X.C1597900rgS;
import X.C1597910rgT;
import X.C1605320rsQ;
import X.C1607400rvm;
import X.C1607440rvq;
import X.C1607470rvt;
import X.C1607480rvu;
import X.C1610740s1A;
import X.C1610770s1D;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C295310Bhp;
import X.C319860CgK;
import X.C339190DRl;
import X.C418440Gaw;
import X.C424700Gl2;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1605560rso;
import X.EnumC1606080rte;
import X.EnumC1610470s0j;
import X.EnumC2274741E1w;
import X.InterfaceC1595940rdI;
import X.InterfaceC1605330rsR;
import X.InterfaceC1891350zJl;
import Y.ACListenerS158S0100000_24;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ab.LiveEntranceConfig;
import com.ss.android.ugc.aweme.base.ability.ISkylightListAbility;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.cell.BaseSkylightCell;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightContainerViewModel;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes25.dex */
public final class LiveSkylightBigAvatarCell extends BaseSkylightCell<C1597820rgK> implements InterfaceC1605330rsR {
    public FollowingInterestUser LLJIJIL;
    public List<FollowingInterestUser> LLJILJIL;
    public C1610740s1A LLJILJILJ;
    public AnonymousClass0956 LLJJ;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 201));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 382));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 203));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 197));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 204));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 202));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 200));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 199));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 198));
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(85));

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final Map<String, String> P5() {
        return C2097608Jq.LJIIIIZZ(new Pair("enter_from", C1596560reI.LIZIZ(uH2())), new Pair("head_type", "live_single_head"));
    }

    @Override // X.InterfaceC1605330rsR
    public final String getAuthorId() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.cell.BaseSkylightCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        Integer numValueOf;
        C1597900rgS c1597900rgSLIZIZ;
        InterfaceC1595940rdI interfaceC1595940rdI;
        User user;
        User user2;
        User user3;
        LogPbBean logPbBean;
        User user4;
        String uid;
        Long lLJIILIIL;
        super.onViewAttachedToWindow();
        C1610740s1A c1610740s1A = this.LLJILJILJ;
        if (c1610740s1A != null) {
            c1610740s1A.LIZ();
        }
        FollowingInterestUser followingInterestUser = this.LLJIJIL;
        String uid2 = null;
        if (followingInterestUser != null && (user = followingInterestUser.getUser()) != null) {
            final long j = user.roomId;
            FollowingInterestUser followingInterestUser2 = this.LLJIJIL;
            final long jLongValue = (followingInterestUser2 == null || (user4 = followingInterestUser2.getUser()) == null || (uid = user4.getUid()) == null || (lLJIILIIL = C2095008Iq.LJIILIIL(uid)) == null) ? 0L : lLJIILIIL.longValue();
            FollowingInterestUser followingInterestUser3 = this.LLJIJIL;
            final String imprId = (followingInterestUser3 == null || (logPbBean = followingInterestUser3.getLogPbBean()) == null) ? null : logPbBean.getImprId();
            FollowingInterestUser followingInterestUser4 = this.LLJIJIL;
            final SlimRoom slimRoom = followingInterestUser4 != null ? followingInterestUser4.getSlimRoom() : null;
            FollowingInterestUser followingInterestUser5 = this.LLJIJIL;
            final int followStatus = (followingInterestUser5 == null || (user3 = followingInterestUser5.getUser()) == null) ? -1 : (user3.getFollowStatus() == -1 || user3.getFollowStatus() == 0 || user3.getFollowStatus() == 1) ? (user3.getFollowerStatus() == 1 && user3.getFollowStatus() == 1) ? 2 : user3.getFollowerStatus() == 1 ? 3 : user3.getFollowStatus() == 1 ? 1 : user3.getFollowStatus() : user3.getFollowStatus();
            HandlerHook.viewPost(W5(), new Runnable() { // from class: X.0rgJ
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:80:0x0191  */
                /* JADX WARN: Removed duplicated region for block: B:84:0x019e  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ() {
                    /*
                        Method dump skipped, instruction units count: 426
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1597810rgJ.LIZ():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LiveSkylightBigAvatarCell@40ab.logSkyLightHeadShow$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LiveSkylightBigAvatarCell@40ab.logSkyLightHeadShow$1");
                }
            });
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Report livesdk_live_show for user = ");
            FollowingInterestUser followingInterestUser6 = this.LLJIJIL;
            if (followingInterestUser6 != null && (user2 = followingInterestUser6.getUser()) != null) {
                uid2 = user2.getUid();
            }
            sbLIZ.append(uid2);
            sbLIZ.append(", scene = ");
            sbLIZ.append(uH2());
            sbLIZ.append(", cell = ");
            sbLIZ.append(this);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        ISkylightListAbility iSkylightListAbilityU5 = U5();
        if (iSkylightListAbilityU5 == null || (numValueOf = Integer.valueOf(iSkylightListAbilityU5.uH2())) == null) {
            return;
        }
        if (numValueOf.intValue() == 2) {
            c1597900rgSLIZIZ = C1597910rgT.LIZ();
        } else if (numValueOf.intValue() != 0) {
            return;
        } else {
            c1597900rgSLIZIZ = C1597910rgT.LIZIZ();
        }
        if (c1597900rgSLIZIZ == null || C1597900rgS.LIZ(c1597900rgSLIZIZ)) {
            return;
        }
        T item = getItem();
        if (!(item instanceof InterfaceC1595940rdI) || (interfaceC1595940rdI = (InterfaceC1595940rdI) item) == null) {
            return;
        }
        boolean zLIZ = C1595960rdK.LIZ(interfaceC1595940rdI, c1597900rgSLIZIZ.LIZJ);
        c1597900rgSLIZIZ.LIZLLL(zLIZ ? 0 : 3, zLIZ, true);
        FeedSkylightContainerViewModel feedSkylightContainerViewModel = (FeedSkylightContainerViewModel) this.LLILLL.getValue();
        if (feedSkylightContainerViewModel == null || !feedSkylightContainerViewModel.xQ2()) {
            return;
        }
        AbstractC1597860rgO.LJI(c1597900rgSLIZIZ.LIZ, zLIZ);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.cell.BaseSkylightCell
    public final View Hy1() {
        return (View) this.LLILZIL.getValue();
    }

    public final ISkylightListAbility U5() {
        return (ISkylightListAbility) this.LLILLJJLI.getValue();
    }

    public final RelationButton V5() {
        return (RelationButton) this.LLIZ.getValue();
    }

    public final TuxTextView W5() {
        return (TuxTextView) this.LLILZLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final View L5() {
        return W5();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final User N5() {
        C1597820rgK c1597820rgK = (C1597820rgK) getItem();
        if (c1597820rgK != null) {
            return c1597820rgK.getUser();
        }
        return null;
    }

    @Override // X.InterfaceC1605330rsR
    public final String getEnterFrom() {
        return C1596560reI.LIZIZ(uH2());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return (uH2() == 0 && C319860CgK.LIZ()) ? R.layout.c7e : R.layout.c7d;
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        ISkylightListAbility iSkylightListAbilityU5 = U5();
        if (iSkylightListAbilityU5 != null) {
            iSkylightListAbilityU5.kf1(W5());
        }
        C1605320rsQ.LIZ(this, this);
        View view = this.itemView;
        ViewGroup viewGroup = view instanceof ConstraintLayout ? (ViewGroup) view : null;
        if (viewGroup != null && C1607470rvt.LIZ().followingSkyFixVersion <= 0) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
        C1610740s1A c1610740s1A = new C1610740s1A(EnumC1610470s0j.SKYLIGHT, (View) this.LLILZIL.getValue(), (View) this.LLILZIL.getValue(), (C1610770s1D) this.LLJI.getValue());
        this.LLJILJILJ = c1610740s1A;
        c1610740s1A.LJIIIIZZ = false;
        C1610770s1D c1610770s1D = (C1610770s1D) this.LLJI.getValue();
        c1610770s1D.setInnerStrokeWidth((int) Math.floor(C418440Gaw.LIZIZ(Double.valueOf(3.5d))));
        c1610770s1D.setStrokeWidth((int) Math.floor(C418440Gaw.LIZIZ(Double.valueOf(3.5d))));
        C1607400rvm.LIZIZ.LIZLLL(new C1607440rvq(this.itemView, (C1610770s1D) this.LLJI.getValue(), (C424700Gl2) this.LLILZIL.getValue(), W5(), V5(), this.itemView.findViewById(R.id.k4d)), EnumC1606080rte.FYP_SKYLIGHT, false);
        if (C295310Bhp.LIZ()) {
            View view2 = (View) this.LLJ.getValue();
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(41));
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(23));
            C786410Ut5.W5(view2, layoutParams);
            ((TuxTextView) this.LLJ.getValue()).setTuxFont(73);
            ((AppCompatTextView) this.LLJ.getValue()).setBackgroundResource(R.drawable.cdq);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        C1610740s1A c1610740s1A = this.LLJILJILJ;
        if (c1610740s1A != null) {
            c1610740s1A.LJIIJ();
        }
    }

    public final int uH2() {
        ISkylightListAbility iSkylightListAbilityU5 = U5();
        if (iSkylightListAbilityU5 != null) {
            return iSkylightListAbilityU5.uH2();
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final EnumC1605560rso I5() {
        return EnumC1605560rso.MUTE_LIVES;
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final View R5() {
        return this.itemView;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        FollowingInterestUser followingInterestUser;
        C0J5O c0j5oZ5;
        User user;
        List<String> urlList;
        C1597820rgK c1597820rgK = (C1597820rgK) interfaceC1891350zJl;
        super.onBindItemView(c1597820rgK);
        C786410Ut5.Ob(this.itemView, 1.0f);
        C786410Ut5.pc(this.itemView, 1.0f);
        FollowingInterestUser followingInterestUser2 = c1597820rgK.LL;
        this.LLJIJIL = followingInterestUser2;
        this.LLJILJIL = c1597820rgK.LLILLJJLI;
        if (followingInterestUser2 != null && (user = followingInterestUser2.getUser()) != null) {
            UrlModel avatarThumb = user.getAvatarThumb();
            if (avatarThumb != null) {
                urlList = avatarThumb.getUrlList();
            } else {
                urlList = null;
            }
            BaseSkylightCell.T5(urlList, (C1322110kVd) this.LLILZIL.getValue(), (String) this.LLJILLL.getValue());
            TuxTextView tuxTextViewW5 = W5();
            C1243240iSQ.LIZ.getClass();
            String nickname = user.getNickname();
            if (nickname == null) {
                nickname = "";
            }
            tuxTextViewW5.setText(nickname);
            C1597740rgC.LIZ.getClass();
            boolean zLIZLLL = C1597740rgC.LIZLLL();
            ViewGroup.LayoutParams layoutParams = W5().getLayoutParams();
            if (zLIZLLL) {
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
            } else {
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
            }
            C786410Ut5.R6(W5(), layoutParams);
            if (C1597740rgC.LJ()) {
                W5().setTuxFont(71);
            } else {
                W5().setTuxFont(72);
            }
        }
        C1597100rfA c1597100rfA = C1597100rfA.LIZ;
        TuxTextView tuxTextView = (TuxTextView) this.LLJ.getValue();
        c1597100rfA.getClass();
        C1597100rfA.LJFF(tuxTextView);
        C786410Ut5.Y((C1610770s1D) this.LLJI.getValue(), 0);
        C1610740s1A c1610740s1A = this.LLJILJILJ;
        if (c1610740s1A != null) {
            c1610740s1A.LJFF(null, LiveSkylightBigAvatarCell.class, null, null, null);
        }
        C2271391DvN.LIZ((View) this.LLILZ.getValue(), C2271381DvM.LIZ());
        C786410Ut5.I7(new ACListenerS158S0100000_24(this, 103), (View) this.LLILZ.getValue());
        if (((LiveEntranceConfig) C1607480rvu.LIZIZ.getValue()).enableFollowingHead && getAbsoluteAdapterPosition() == 1) {
            C1597740rgC c1597740rgC = C1597740rgC.LIZ;
            FollowingInterestUser followingInterestUser3 = this.LLJIJIL;
            c1597740rgC.getClass();
            SlimRoom slimRoomLJII = C1597740rgC.LJII(followingInterestUser3);
            if (slimRoomLJII != null) {
                ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                if (iLiveOuterService != null && (c0j5oZ5 = iLiveOuterService.z5()) != null) {
                    c0j5oZ5.LJ(this.itemView.getContext(), slimRoomLJII, "homepage_follow");
                }
            } else {
                return;
            }
        }
        if (C0ACG.LIZ() && uH2() == 0 && (followingInterestUser = this.LLJIJIL) != null) {
            if (followingInterestUser.getRelationType() == 4 && !C10EU.LJIIL(followingInterestUser.getUser())) {
                C339190DRl.LIZLLL(V5());
                RelationButton relationButtonV5 = V5();
                C1387050mCN c1387050mCN = new C1387050mCN(followingInterestUser.getUser());
                c1387050mCN.LIZIZ = false;
                if (C319860CgK.LIZ()) {
                    c1387050mCN.LJFF = EnumC2274741E1w.CUSTOM_FRIENDS_V3_SKYLIGHT_RELATION;
                } else {
                    c1387050mCN.LJFF = EnumC2274741E1w.CUSTOM_FEED_SKYLIGHT_RELATION;
                }
                c1387050mCN.LJIIJJI = getCurrentLifecycleOwner();
                relationButtonV5.LLLLZIL(c1387050mCN.LIZ());
                V5().setFollowClickListener(new AwS620S0100000_6(this, 150));
                V5().setDataChangeListener(new AwS585S0100000_6(this, 367));
                V5().setTracker(new AwS425S0200000_24(followingInterestUser, this, 89));
                C339190DRl.LIZIZ((View) this.LLIZLLLIL.getValue());
                return;
            }
            C339190DRl.LIZIZ(V5());
            V5().LIZ();
            C339190DRl.LIZLLL((View) this.LLIZLLLIL.getValue());
        }
    }
}
