package com.ss.android.ugc.aweme.business.live.cell;

import X.AnonymousClass0956;
import X.C01GW;
import X.C0ACG;
import X.C0IVT;
import X.C0J5O;
import X.C10EU;
import X.C1243240iSQ;
import X.C1322110kVd;
import X.C1387050mCN;
import X.C1596560reI;
import X.C1597100rfA;
import X.C1597740rgC;
import X.C1597830rgL;
import X.C1605320rsQ;
import X.C1607400rvm;
import X.C1607470rvt;
import X.C1607480rvu;
import X.C1608370rxL;
import X.C1610740s1A;
import X.C1610770s1D;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C295310Bhp;
import X.C319860CgK;
import X.C339190DRl;
import X.C418440Gaw;
import X.C444960Hcc;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1605560rso;
import X.EnumC1606080rte;
import X.EnumC1610470s0j;
import X.EnumC2274741E1w;
import X.InterfaceC1605330rsR;
import X.InterfaceC1891350zJl;
import Y.ACListenerS158S0100000_24;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ab.LiveEntranceConfig;
import com.ss.android.ugc.aweme.base.ability.ISkylightListAbility;
import com.ss.android.ugc.aweme.base.ui.cell.BaseSkylightCell;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
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
public final class LiveSkylightDoubleBigAvatarCell extends BaseSkylightCell<C1597830rgL> implements InterfaceC1605330rsR {
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 213));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 383));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 215));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 207));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 206));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 216));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 212));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 214));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 211));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 210));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 217));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 209));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 208));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 205));
    public final C01GW LLJJI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(86));
    public C1610740s1A LLJJIII;
    public C1610740s1A LLJJIJI;
    public FollowingInterestUser LLJJIJIIJIL;
    public List<FollowingInterestUser> LLJJIJIL;
    public AnonymousClass0956 LLJJJ;

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final Map<String, String> P5() {
        return C2097608Jq.LJIIIIZZ(new Pair("enter_from", C1596560reI.LIZIZ(uH2())), new Pair("head_type", "live_heads"));
    }

    @Override // X.InterfaceC1605330rsR
    public final String getAuthorId() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.cell.BaseSkylightCell
    public final View Hy1() {
        return (View) this.LLILZIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final View R5() {
        return (View) this.LLJJ.getValue();
    }

    public final int U5() {
        User user;
        FollowingInterestUser followingInterestUser = this.LLJJIJIIJIL;
        if (followingInterestUser == null || (user = followingInterestUser.getUser()) == null) {
            return -1;
        }
        int followStatus = user.getFollowStatus();
        return (followStatus == 0 || followStatus == 1 || followStatus == 2) ? followStatus : user.getFollowerStatus() == 0 ? 0 : 3;
    }

    public final ViewGroup V5() {
        return (ViewGroup) this.LLJI.getValue();
    }

    public final ISkylightListAbility W5() {
        return (ISkylightListAbility) this.LLILLJJLI.getValue();
    }

    public final RelationButton X5() {
        return (RelationButton) this.LLJ.getValue();
    }

    public final TuxTextView a6() {
        return (TuxTextView) this.LLIZ.getValue();
    }

    public final TuxTextView b6() {
        return (TuxTextView) this.LLJILJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        ViewGroup viewGroup;
        super.onItemViewCreated();
        ISkylightListAbility iSkylightListAbilityW5 = W5();
        if (iSkylightListAbilityW5 != null) {
            iSkylightListAbilityW5.kf1(a6());
        }
        C1605320rsQ.LIZ(this, this);
        if (C1607470rvt.LIZ().followingSkyFixVersion <= 0) {
            View view = this.itemView;
            if ((view instanceof ConstraintLayout) && (viewGroup = (ViewGroup) view) != null) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.LLJJ.getValue();
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
        }
        EnumC1610470s0j enumC1610470s0j = EnumC1610470s0j.SKYLIGHT;
        this.LLJJIII = new C1610740s1A(enumC1610470s0j, (View) this.LLILZIL.getValue(), (View) this.LLILZIL.getValue(), (C1610770s1D) this.LLJILJILJ.getValue());
        C1610740s1A c1610740s1A = new C1610740s1A(enumC1610470s0j, (View) this.LLILZLL.getValue(), (View) this.LLILZLL.getValue(), (C1610770s1D) this.LLJILLL.getValue());
        this.LLJJIJI = c1610740s1A;
        C1610740s1A c1610740s1A2 = this.LLJJIII;
        if (c1610740s1A2 != null) {
            c1610740s1A2.LJIIIIZZ = false;
        }
        c1610740s1A.LJIIIIZZ = false;
        C1610770s1D c1610770s1D = (C1610770s1D) this.LLJILJILJ.getValue();
        c1610770s1D.setStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
        c1610770s1D.setInnerStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
        C1610770s1D c1610770s1D2 = (C1610770s1D) this.LLJILLL.getValue();
        c1610770s1D2.setStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
        c1610770s1D2.setInnerStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
        C1607400rvm.LIZIZ.LIZ(new C1608370rxL(this.itemView, (C1610770s1D) this.LLJILJILJ.getValue(), this.itemView.findViewById(R.id.l_z), (C1322110kVd) this.LLILZIL.getValue(), (C1610770s1D) this.LLJILLL.getValue(), this.itemView.findViewById(R.id.l_w), (C1322110kVd) this.LLILZLL.getValue(), a6(), b6(), X5(), this.itemView.findViewById(R.id.k4d)), EnumC1606080rte.FYP_SKYLIGHT, false);
        if (C295310Bhp.LIZ()) {
            ViewGroup viewGroupV5 = V5();
            ViewGroup.LayoutParams layoutParams = viewGroupV5.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(23));
            C786410Ut5.W5(viewGroupV5, layoutParams);
            View view2 = (View) this.LLJIJIL.getValue();
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(41));
            layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(23));
            C786410Ut5.W5(view2, layoutParams2);
            ((TuxTextView) this.LLJIJIL.getValue()).setTuxFont(73);
            ((AppCompatTextView) this.LLJIJIL.getValue()).setBackgroundResource(R.drawable.cdq);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b5  */
    @Override // com.ss.android.ugc.aweme.base.ui.cell.BaseSkylightCell, com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewAttachedToWindow() {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.business.live.cell.LiveSkylightDoubleBigAvatarCell.onViewAttachedToWindow():void");
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final View L5() {
        return a6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final User N5() {
        C1597830rgL c1597830rgL = (C1597830rgL) getItem();
        if (c1597830rgL != null) {
            return c1597830rgL.getUser();
        }
        return null;
    }

    @Override // X.InterfaceC1605330rsR
    public final String getEnterFrom() {
        return C1596560reI.LIZIZ(uH2());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return (uH2() == 0 && C319860CgK.LIZ()) ? R.layout.c7b : R.layout.c7a;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        C1610740s1A c1610740s1A = this.LLJJIII;
        if (c1610740s1A != null) {
            c1610740s1A.LJIIJ();
        }
        C1610740s1A c1610740s1A2 = this.LLJJIJI;
        if (c1610740s1A2 != null) {
            c1610740s1A2.LJIIJ();
        }
    }

    public final int uH2() {
        ISkylightListAbility iSkylightListAbilityW5 = W5();
        if (iSkylightListAbilityW5 != null) {
            return iSkylightListAbilityW5.uH2();
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final EnumC1605560rso I5() {
        return EnumC1605560rso.MUTE_LIVES;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        FollowingInterestUser followingInterestUser;
        C0J5O c0j5oZ5;
        List<com.bytedance.android.live.base.model.user.User> list;
        com.bytedance.android.live.base.model.user.User user;
        List urls;
        List<com.bytedance.android.live.base.model.user.User> list2;
        com.bytedance.android.live.base.model.user.User user2;
        List urls2;
        C1597830rgL c1597830rgL = (C1597830rgL) interfaceC1891350zJl;
        super.onBindItemView(c1597830rgL);
        FollowingInterestUser followingInterestUser2 = c1597830rgL.LL;
        this.LLJJIJIIJIL = followingInterestUser2;
        this.LLJJIJIL = c1597830rgL.LLILLJJLI;
        C1597740rgC.LIZ.getClass();
        SlimRoom slimRoomLJII = C1597740rgC.LJII(followingInterestUser2);
        if (slimRoomLJII != null) {
            C786410Ut5.Ob(this.itemView, 1.0f);
            C786410Ut5.pc(this.itemView, 1.0f);
            if (slimRoomLJII.getLinkMic().followedList.size() >= 2) {
                SlimRoom.LinkMic linkMic = slimRoomLJII.getLinkMic();
                if (linkMic != null && (list2 = linkMic.followedList) != null && (user2 = (com.bytedance.android.live.base.model.user.User) ListProtector.get(list2, 0)) != null) {
                    ImageModel avatarThumb = user2.getAvatarThumb();
                    if (avatarThumb != null) {
                        urls2 = avatarThumb.getUrls();
                    } else {
                        urls2 = null;
                    }
                    BaseSkylightCell.T5(urls2, (C1322110kVd) this.LLILZLL.getValue(), (String) this.LLJJI.getValue());
                    TuxTextView tuxTextViewA6 = a6();
                    C1243240iSQ c1243240iSQ = C1243240iSQ.LIZ;
                    String username = user2.getUsername();
                    String nickName = user2.getNickName();
                    c1243240iSQ.getClass();
                    tuxTextViewA6.setText(C1243240iSQ.LIZLLL(username, nickName));
                    boolean zLIZLLL = C1597740rgC.LIZLLL();
                    ViewGroup.LayoutParams layoutParams = ((View) this.LLIZLLLIL.getValue()).getLayoutParams();
                    if (zLIZLLL) {
                        layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
                    } else {
                        layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
                    }
                    C786410Ut5.W5((View) this.LLIZLLLIL.getValue(), layoutParams);
                    if (C1597740rgC.LJ()) {
                        a6().setTuxFont(71);
                        b6().setTuxFont(71);
                    } else {
                        a6().setTuxFont(72);
                        b6().setTuxFont(72);
                    }
                }
                SlimRoom.LinkMic linkMic2 = slimRoomLJII.getLinkMic();
                if (linkMic2 != null && (list = linkMic2.followedList) != null && (user = (com.bytedance.android.live.base.model.user.User) ListProtector.get(list, 1)) != null) {
                    ImageModel avatarThumb2 = user.getAvatarThumb();
                    if (avatarThumb2 != null) {
                        urls = avatarThumb2.getUrls();
                    } else {
                        urls = null;
                    }
                    BaseSkylightCell.T5(urls, (C1322110kVd) this.LLILZIL.getValue(), (String) this.LLJJI.getValue());
                }
            }
            TuxTextView tuxTextViewB6 = b6();
            if (slimRoomLJII.getLinkMic().followedCount > 1) {
                if (C444960Hcc.LIZIZ()) {
                    TuxTextView tuxTextViewB62 = b6();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(slimRoomLJII.getLinkMic().followedCount - 1);
                    sbLIZ.append('+');
                    tuxTextViewB62.setText(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    TuxTextView tuxTextViewB63 = b6();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append('+');
                    sbLIZ2.append(slimRoomLJII.getLinkMic().followedCount - 1);
                    tuxTextViewB63.setText(C2188811AlT.LIZIZ(sbLIZ2));
                }
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextViewB6, i);
            C1597100rfA c1597100rfA = C1597100rfA.LIZ;
            TuxTextView tuxTextView = (TuxTextView) this.LLJIJIL.getValue();
            c1597100rfA.getClass();
            C1597100rfA.LJFF(tuxTextView);
            C2271391DvN.LIZ((View) this.LLILZ.getValue(), C2271381DvM.LIZ());
            C786410Ut5.I7(new ACListenerS158S0100000_24(this, 108), (View) this.LLILZ.getValue());
            C1610740s1A c1610740s1A = this.LLJJIII;
            if (c1610740s1A != null) {
                c1610740s1A.LJFF(null, LiveSkylightDoubleBigAvatarCell.class, null, null, null);
            }
            C1610740s1A c1610740s1A2 = this.LLJJIJI;
            if (c1610740s1A2 != null) {
                c1610740s1A2.LJFF(null, LiveSkylightDoubleBigAvatarCell.class, null, null, null);
            }
            FollowingInterestUser followingInterestUser3 = this.LLJJIJIIJIL;
            if (followingInterestUser3 != null) {
                followingInterestUser3.getUser();
            }
            try {
                ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().T8(C0IVT.LIZ("homepage_follow", "live_cover", C1597740rgC.LJII(this.LLJJIJIIJIL)));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (((LiveEntranceConfig) C1607480rvu.LIZIZ.getValue()).enableFollowingHead && getAbsoluteAdapterPosition() == 1) {
                C1597740rgC c1597740rgC = C1597740rgC.LIZ;
                FollowingInterestUser followingInterestUser4 = this.LLJJIJIIJIL;
                c1597740rgC.getClass();
                SlimRoom slimRoomLJII2 = C1597740rgC.LJII(followingInterestUser4);
                if (slimRoomLJII2 != null) {
                    ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                    if (iLiveOuterService != null && (c0j5oZ5 = iLiveOuterService.z5()) != null) {
                        c0j5oZ5.LJ(this.itemView.getContext(), slimRoomLJII2, "homepage_follow");
                    }
                } else {
                    return;
                }
            }
            if (C0ACG.LIZ() && uH2() == 0 && (followingInterestUser = this.LLJJIJIIJIL) != null) {
                if (followingInterestUser.getRelationType() == 4 && !C10EU.LJIIL(followingInterestUser.getUser())) {
                    C339190DRl.LIZLLL(X5());
                    RelationButton relationButtonX5 = X5();
                    C1387050mCN c1387050mCN = new C1387050mCN(followingInterestUser.getUser());
                    c1387050mCN.LIZIZ = false;
                    c1387050mCN.LJFF = EnumC2274741E1w.CUSTOM_FEED_SKYLIGHT_RELATION;
                    c1387050mCN.LJIIJJI = getCurrentLifecycleOwner();
                    relationButtonX5.LLLLZIL(c1387050mCN.LIZ());
                    X5().setFollowClickListener(new AwS620S0100000_6(this, 149));
                    X5().setDataChangeListener(new AwS585S0100000_6(this, 366));
                    X5().setTracker(new AwS425S0200000_24(followingInterestUser, this, 90));
                    C339190DRl.LIZIZ(V5());
                    return;
                }
                C339190DRl.LIZIZ(X5());
                X5().LIZ();
                C339190DRl.LIZLLL(V5());
            }
        }
    }
}
