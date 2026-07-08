package com.ss.android.ugc.aweme.business.live.cell;

import X.C01GW;
import X.C098200Yq;
import X.C0IVT;
import X.C0J5O;
import X.C1243240iSQ;
import X.C1596560reI;
import X.C1597100rfA;
import X.C1597740rgC;
import X.C1597820rgK;
import X.C1605320rsQ;
import X.C1607400rvm;
import X.C1607440rvq;
import X.C1607480rvu;
import X.C1610740s1A;
import X.C1610770s1D;
import X.C189200o6;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C295310Bhp;
import X.C418440Gaw;
import X.C424620Gku;
import X.C424700Gl2;
import X.C426750GoL;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1605560rso;
import X.EnumC1606080rte;
import X.EnumC1610470s0j;
import X.InterfaceC1605330rsR;
import X.InterfaceC1891350zJl;
import X.InterfaceC662550Pyn;
import Y.ACListenerS158S0100000_24;
import Y.ARunnableS106S0100000_6;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveAvatarEntranceUnifySetting;
import com.bytedance.android.livesdkapi.depend.model.live.EcommerceRoomHeadTag;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ab.LiveEntranceConfig;
import com.ss.android.ugc.aweme.base.ability.ISkylightListAbility;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FollowingLiveSkylightBigAvatarCell extends BaseFollowingLiveSkylightCell<C1597820rgK> implements InterfaceC1605330rsR {
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 179));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 174));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 180));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 177));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 178));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 175));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 176));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 173));
    public FollowingInterestUser LLJJJIL;
    public List<FollowingInterestUser> LLJJJJ;
    public C1610740s1A LLJJJJJIL;
    public InterfaceC662550Pyn LLJJJJLIIL;

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final Map<String, String> P5() {
        return C2097608Jq.LJIIIIZZ(new Pair("enter_from", C1596560reI.LIZIZ(uH2())), new Pair("head_type", "live_single_head"));
    }

    @Override // com.ss.android.ugc.aweme.business.live.cell.BaseFollowingLiveSkylightCell
    public final ConstraintLayout U5() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.business.live.cell.BaseFollowingLiveSkylightCell
    public final void a6() {
        User user;
        final int i;
        SlimRoom.LinkMic linkMic;
        List<Long> list;
        LogPbBean logPbBean;
        User user2;
        String uid;
        Long lLJIILIIL;
        FollowingInterestUser followingInterestUser = this.LLJJJIL;
        if (followingInterestUser == null || (user = followingInterestUser.getUser()) == null) {
            return;
        }
        final long j = user.roomId;
        FollowingInterestUser followingInterestUser2 = this.LLJJJIL;
        final long jLongValue = (followingInterestUser2 == null || (user2 = followingInterestUser2.getUser()) == null || (uid = user2.getUid()) == null || (lLJIILIIL = C2095008Iq.LJIILIIL(uid)) == null) ? 0L : lLJIILIIL.longValue();
        FollowingInterestUser followingInterestUser3 = this.LLJJJIL;
        final String imprId = (followingInterestUser3 == null || (logPbBean = followingInterestUser3.getLogPbBean()) == null) ? null : logPbBean.getImprId();
        FollowingInterestUser followingInterestUser4 = this.LLJJJIL;
        final SlimRoom slimRoom = followingInterestUser4 != null ? followingInterestUser4.getSlimRoom() : null;
        FollowingInterestUser followingInterestUser5 = this.LLJJJIL;
        User user3 = followingInterestUser5 != null ? followingInterestUser5.getUser() : null;
        int followStatus = -1;
        if (user3 != null) {
            i = 1;
            if (user3.getFollowStatus() != -1 && user3.getFollowStatus() != 0 && user3.getFollowStatus() != 1) {
                followStatus = user3.getFollowStatus();
            } else if (user3.getFollowerStatus() == 1 && user3.getFollowStatus() == 1) {
                followStatus = 2;
            } else if (user3.getFollowerStatus() == 1) {
                followStatus = 3;
            } else if (user3.getFollowStatus() != 1) {
                followStatus = user3.getFollowStatus();
            }
            i = followStatus;
        } else {
            i = followStatus;
        }
        final int size = (slimRoom == null || (linkMic = slimRoom.getLinkMic()) == null || (list = linkMic.audienceIdList) == null) ? 0 : list.size();
        HandlerHook.viewPost(i6(), new Runnable() { // from class: X.0rgI
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:86:0x01a4  */
            /* JADX WARN: Removed duplicated region for block: B:91:0x01b5  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    Method dump skipped, instruction units count: 449
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1597800rgI.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FollowingLiveSkylightBigAvatarCell@2573.logSkyLightHeadShow$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FollowingLiveSkylightBigAvatarCell@2573.logSkyLightHeadShow$1");
            }
        });
    }

    @Override // X.InterfaceC1605330rsR
    public final String getAuthorId() {
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.c7d;
    }

    public final C424700Gl2 f6() {
        return (C424700Gl2) this.LLJJ.getValue();
    }

    public final C424620Gku h6() {
        return (C424620Gku) this.LLJJIJIIJIL.getValue();
    }

    public final TuxTextView i6() {
        return (TuxTextView) this.LLJJI.getValue();
    }

    public final int uH2() {
        ISkylightListAbility iSkylightListAbility = (ISkylightListAbility) this.LLJIJIL.getValue();
        if (iSkylightListAbility != null) {
            return iSkylightListAbility.uH2();
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.cell.BaseSkylightCell
    public final View Hy1() {
        return f6();
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final View L5() {
        return i6();
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

    @Override // com.ss.android.ugc.aweme.business.live.cell.BaseFollowingLiveSkylightCell
    public final void b6() {
        super.b6();
        q6(this);
    }

    @Override // com.ss.android.ugc.aweme.business.live.cell.BaseFollowingLiveSkylightCell
    public final void c6() {
        super.c6();
        C1610740s1A c1610740s1A = this.LLJJJJJIL;
        if (c1610740s1A != null) {
            c1610740s1A.xs();
        }
        InterfaceC662550Pyn interfaceC662550Pyn = this.LLJJJJLIIL;
        if (interfaceC662550Pyn != null) {
            interfaceC662550Pyn.LIZ();
        }
    }

    @Override // X.InterfaceC1605330rsR
    public final String getEnterFrom() {
        return C1596560reI.LIZIZ(uH2());
    }

    @Override // com.ss.android.ugc.aweme.business.live.cell.BaseFollowingLiveSkylightCell, com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C1605320rsQ.LIZ(this, this);
        C1610740s1A c1610740s1A = new C1610740s1A(LiveAvatarEntranceUnifySetting.getValue() ? EnumC1610470s0j.MEDIUM : EnumC1610470s0j.SKYLIGHT, f6(), f6(), (C1610770s1D) this.LLJJIJIL.getValue());
        this.LLJJJJJIL = c1610740s1A;
        c1610740s1A.LJIIIIZZ = false;
        if (LiveAvatarEntranceUnifySetting.getValue()) {
            C786410Ut5.LJLLLLLL(8, (View) this.LLJJIJI.getValue());
            C786410Ut5.k(h6(), 0);
            HandlerHook.viewPost(h6(), new ARunnableS106S0100000_6(this, 260));
            this.LLJJJJLIIL = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v3().LJJIJIIJI(h6(), true);
            C424620Gku c424620GkuH6 = h6();
            ViewGroup.LayoutParams layoutParams = c424620GkuH6.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25));
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25));
            C786410Ut5.W5(c424620GkuH6, layoutParams);
            C426750GoL.LJIIL(f6(), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(1.5f)))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(1.5f)))), 16);
            ((C1610770s1D) this.LLJJIJIL.getValue()).setInnerStrokeWidth((int) C418440Gaw.LIZIZ(Double.valueOf(2.5d)));
        } else {
            C786410Ut5.k(h6(), 8);
            C786410Ut5.LJLLLLLL(0, (View) this.LLJJIJI.getValue());
        }
        C1610770s1D c1610770s1D = (C1610770s1D) this.LLJJIJIL.getValue();
        c1610770s1D.setInnerStrokeWidth((int) Math.floor(C418440Gaw.LIZIZ(Double.valueOf(3.5d))));
        c1610770s1D.setStrokeWidth((int) Math.floor(C418440Gaw.LIZIZ(Double.valueOf(3.5d))));
        C1607400rvm c1607400rvm = C1607400rvm.LIZIZ;
        C1607440rvq c1607440rvq = new C1607440rvq(this.itemView, (C1610770s1D) this.LLJJIJIL.getValue(), f6(), i6(), (View) this.LLJJIJI.getValue(), 16);
        int iUH2 = uH2();
        c1607400rvm.LIZLLL(c1607440rvq, iUH2 != 1 ? iUH2 != 2 ? EnumC1606080rte.DEFAULT : EnumC1606080rte.FOLLOW_SKYLIGHT : EnumC1606080rte.FYP_SKYLIGHT, false);
        if (C295310Bhp.LIZ()) {
            View view = (View) this.LLJJIII.getValue();
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(41));
            layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(23));
            C786410Ut5.W5(view, layoutParams2);
            ((TuxTextView) this.LLJJIII.getValue()).setTuxFont(73);
            ((AppCompatTextView) this.LLJJIII.getValue()).setBackgroundResource(R.drawable.cdq);
        }
    }

    @Override // com.ss.android.ugc.aweme.business.live.cell.BaseFollowingLiveSkylightCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onPause() {
        super.onPause();
        q6(this);
    }

    @Override // com.ss.android.ugc.aweme.business.live.cell.BaseFollowingLiveSkylightCell, com.ss.android.ugc.aweme.base.ui.cell.BaseSkylightCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        C1610740s1A c1610740s1A = this.LLJJJJJIL;
        if (c1610740s1A != null) {
            c1610740s1A.LIZ();
        }
        InterfaceC662550Pyn interfaceC662550Pyn = this.LLJJJJLIIL;
        if (interfaceC662550Pyn != null) {
            interfaceC662550Pyn.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.business.live.cell.BaseFollowingLiveSkylightCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        C1610740s1A c1610740s1A = this.LLJJJJJIL;
        if (c1610740s1A != null) {
            c1610740s1A.LJIIJ();
        }
        InterfaceC662550Pyn interfaceC662550Pyn = this.LLJJJJLIIL;
        if (interfaceC662550Pyn != null) {
            interfaceC662550Pyn.LJIIZILJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final EnumC1605560rso I5() {
        return EnumC1605560rso.MUTE_LIVES;
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final View R5() {
        return this.itemView;
    }

    public static void q6(FollowingLiveSkylightBigAvatarCell followingLiveSkylightBigAvatarCell) {
        C1610740s1A c1610740s1A = followingLiveSkylightBigAvatarCell.LLJJJJJIL;
        if (c1610740s1A != null) {
            c1610740s1A.Ir();
        }
        InterfaceC662550Pyn interfaceC662550Pyn = followingLiveSkylightBigAvatarCell.LLJJJJLIIL;
        if (interfaceC662550Pyn != null) {
            interfaceC662550Pyn.LJIIZILJ();
        }
        InterfaceC662550Pyn interfaceC662550Pyn2 = followingLiveSkylightBigAvatarCell.LLJJJJLIIL;
        if (interfaceC662550Pyn2 != null) {
            interfaceC662550Pyn2.LJIIZILJ();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        ILiveOuterService iLiveOuterService;
        C0J5O c0j5oZ5;
        EcommerceRoomHeadTag ecommerceRoomHeadTag;
        User user;
        List<String> urlList;
        C1597820rgK c1597820rgK = (C1597820rgK) interfaceC1891350zJl;
        super.onBindItemView(c1597820rgK);
        C786410Ut5.Ob(this.itemView, 1.0f);
        C786410Ut5.pc(this.itemView, 1.0f);
        FollowingInterestUser followingInterestUser = c1597820rgK.LL;
        this.LLJJJIL = followingInterestUser;
        this.LLJJJJ = c1597820rgK.LLILLJJLI;
        if (followingInterestUser != null && (user = followingInterestUser.getUser()) != null) {
            UrlModel avatarThumb = user.getAvatarThumb();
            if (avatarThumb != null) {
                urlList = avatarThumb.getUrlList();
            } else {
                urlList = null;
            }
            X5(urlList, f6());
            TuxTextView tuxTextViewI6 = i6();
            C1243240iSQ.LIZ.getClass();
            String nickname = user.getNickname();
            if (nickname == null) {
                nickname = "";
            }
            tuxTextViewI6.setText(nickname);
            C1597740rgC.LIZ.getClass();
            boolean zLIZLLL = C1597740rgC.LIZLLL();
            ViewGroup.LayoutParams layoutParams = i6().getLayoutParams();
            if (zLIZLLL) {
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
            } else {
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
            }
            C786410Ut5.R6(i6(), layoutParams);
            if (C1597740rgC.LJ()) {
                i6().setTuxFont(71);
            } else {
                i6().setTuxFont(72);
            }
        }
        C1597740rgC c1597740rgC = C1597740rgC.LIZ;
        FollowingInterestUser followingInterestUser2 = this.LLJJJIL;
        c1597740rgC.getClass();
        SlimRoom slimRoomLJII = C1597740rgC.LJII(followingInterestUser2);
        if (slimRoomLJII != null && (ecommerceRoomHeadTag = slimRoomLJII.ecommerceRoomHeadTag) != null) {
            C1597100rfA c1597100rfA = C1597100rfA.LIZ;
            TuxTextView tuxTextView = (TuxTextView) this.LLJJIII.getValue();
            c1597100rfA.getClass();
            C1597100rfA.LJ(tuxTextView, ecommerceRoomHeadTag);
        } else {
            C1597100rfA c1597100rfA2 = C1597100rfA.LIZ;
            TuxTextView tuxTextView2 = (TuxTextView) this.LLJJIII.getValue();
            c1597100rfA2.getClass();
            C1597100rfA.LJFF(tuxTextView2);
        }
        C786410Ut5.Y((C1610770s1D) this.LLJJIJIL.getValue(), 0);
        C1610740s1A c1610740s1A = this.LLJJJJJIL;
        if (c1610740s1A != null) {
            c1610740s1A.LJFF(null, FollowingLiveSkylightBigAvatarCell.class, null, null, null);
        }
        C2271391DvN.LIZ((View) this.LLJILLL.getValue(), C2271381DvM.LIZ());
        C786410Ut5.I7(new ACListenerS158S0100000_24(this, 105), (View) this.LLJILLL.getValue());
        FollowingInterestUser followingInterestUser3 = this.LLJJJIL;
        if (followingInterestUser3 != null) {
            followingInterestUser3.getUser();
        }
        try {
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().T8(C0IVT.LIZ("homepage_follow", "live_cover", C1597740rgC.LJII(this.LLJJJIL)));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (((LiveEntranceConfig) C1607480rvu.LIZIZ.getValue()).enableFollowingHead && getAbsoluteAdapterPosition() == 1) {
            C1597740rgC c1597740rgC2 = C1597740rgC.LIZ;
            FollowingInterestUser followingInterestUser4 = this.LLJJJIL;
            c1597740rgC2.getClass();
            SlimRoom slimRoomLJII2 = C1597740rgC.LJII(followingInterestUser4);
            if (slimRoomLJII2 != null && (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null && (c0j5oZ5 = iLiveOuterService.z5()) != null) {
                c0j5oZ5.LJ(this.itemView.getContext(), slimRoomLJII2, "homepage_follow");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.business.live.cell.BaseFollowingLiveSkylightCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onResume(boolean z) {
        super.onResume(z);
        C1610740s1A c1610740s1A = this.LLJJJJJIL;
        if (c1610740s1A != null) {
            c1610740s1A.xs();
        }
        InterfaceC662550Pyn interfaceC662550Pyn = this.LLJJJJLIIL;
        if (interfaceC662550Pyn != null) {
            interfaceC662550Pyn.LIZ();
        }
    }
}
