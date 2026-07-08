package com.ss.android.ugc.aweme.business.live.cell;

import X.C01GW;
import X.C098200Yq;
import X.C0IVT;
import X.C0J5O;
import X.C1243240iSQ;
import X.C1322110kVd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1596560reI;
import X.C1597100rfA;
import X.C1597740rgC;
import X.C1597830rgL;
import X.C1605320rsQ;
import X.C1607400rvm;
import X.C1607480rvu;
import X.C1608370rxL;
import X.C1610740s1A;
import X.C1610770s1D;
import X.C189200o6;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C295310Bhp;
import X.C418440Gaw;
import X.C424620Gku;
import X.C426750GoL;
import X.C444960Hcc;
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
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveAvatarEntranceUnifySetting;
import com.bytedance.android.livesdkapi.depend.model.live.EcommerceRoomHeadTag;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ab.LiveEntranceConfig;
import com.ss.android.ugc.aweme.base.ability.ISkylightListAbility;
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
public final class FollowingLiveSkylightDoubleBigAvatarCell extends BaseFollowingLiveSkylightCell<C1597830rgL> implements InterfaceC1605330rsR {
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 190));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 183));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 182));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 191));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 189));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 187));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 192));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 186));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 185));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 188));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 184));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 181));
    public C1610740s1A LLJJL;
    public C1610740s1A LLJJLIIIJLLLLLLLZ;
    public InterfaceC662550Pyn LLJL;
    public FollowingInterestUser LLJLIL;
    public List<FollowingInterestUser> LLJLILLLLZIIL;

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final Map<String, String> P5() {
        return C2097608Jq.LJIIIIZZ(new Pair("enter_from", C1596560reI.LIZIZ(uH2())), new Pair("head_type", "live_heads"));
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4  */
    @Override // com.ss.android.ugc.aweme.business.live.cell.BaseFollowingLiveSkylightCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a6() {
        /*
            r15 = this;
            r5 = r15
            com.ss.android.ugc.aweme.feed.module.FollowingInterestUser r0 = r5.LLJLIL
            if (r0 == 0) goto Laf
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getUser()
            if (r0 == 0) goto Laf
            long r8 = r0.roomId
            com.ss.android.ugc.aweme.feed.module.FollowingInterestUser r0 = r5.LLJLIL
            if (r0 == 0) goto Lbf
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getUser()
            if (r0 == 0) goto Lbf
            java.lang.String r0 = r0.getUid()
            if (r0 == 0) goto Lbf
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)
            if (r0 == 0) goto Lbf
            long r6 = r0.longValue()
        L27:
            com.ss.android.ugc.aweme.feed.module.FollowingInterestUser r0 = r5.LLJLIL
            if (r0 == 0) goto Lbd
            com.bytedance.android.livesdkapi.depend.model.live.SlimRoom r0 = r0.getSlimRoom()
            if (r0 == 0) goto Lbd
            com.bytedance.android.livesdkapi.depend.model.live.SlimRoom$LinkMic r0 = r0.getLinkMic()
            if (r0 == 0) goto Lbd
            java.util.List<java.lang.Long> r0 = r0.audienceIdList
            if (r0 == 0) goto Lbd
            int r0 = r0.size()
        L3f:
            r4 = 1
            if (r0 <= 0) goto Lbb
            r11 = 1
        L43:
            com.ss.android.ugc.aweme.feed.module.FollowingInterestUser r0 = r5.LLJLIL
            r12 = 0
            if (r0 == 0) goto Lb9
            com.bytedance.android.livesdkapi.depend.model.live.SlimRoom r0 = r0.getSlimRoom()
            if (r0 == 0) goto Lb9
            com.bytedance.android.livesdkapi.depend.model.live.SlimRoom$LinkMic r0 = r0.getLinkMic()
            if (r0 == 0) goto Lb9
            java.util.List<com.bytedance.android.live.base.model.user.User> r1 = r0.followedList
        L56:
            com.ss.android.ugc.aweme.feed.module.FollowingInterestUser r0 = r5.LLJLIL
            if (r0 == 0) goto Lb7
            com.bytedance.android.livesdkapi.depend.model.live.SlimRoom r0 = r0.getSlimRoom()
            if (r0 == 0) goto Lb7
            com.bytedance.android.livesdkapi.depend.model.live.SlimRoom$LinkMic r0 = r0.getLinkMic()
            if (r0 == 0) goto Lb7
            java.util.List<java.lang.Long> r3 = r0.audienceIdList
        L68:
            if (r1 == 0) goto Lb4
            int r2 = r1.size()
            java.lang.Object r0 = X.C13LP.LJJJLL(r1)
            com.bytedance.android.live.base.model.user.User r0 = (com.bytedance.android.live.base.model.user.User) r0
            if (r0 == 0) goto Lb2
            if (r3 == 0) goto Lb2
            long r0 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = r3.contains(r0)
            if (r0 != r4) goto Lb2
        L86:
            if (r2 <= 0) goto Lb4
            if (r4 == 0) goto Lb4
            java.lang.String r13 = "guest"
        L8c:
            com.ss.android.ugc.aweme.feed.module.FollowingInterestUser r0 = r5.LLJLIL
            if (r0 == 0) goto Lb0
            com.ss.android.ugc.aweme.feed.model.LogPbBean r0 = r0.getLogPbBean()
            if (r0 == 0) goto Lb0
            java.lang.String r10 = r0.getImprId()
        L9a:
            com.ss.android.ugc.aweme.feed.module.FollowingInterestUser r0 = r5.LLJLIL
            if (r0 == 0) goto La2
            com.bytedance.android.livesdkapi.depend.model.live.SlimRoom r12 = r0.getSlimRoom()
        La2:
            com.bytedance.tux.input.TuxTextView r0 = r5.i6()
            Y.ARunnableS0S2210200_24 r4 = new Y.ARunnableS0S2210200_24
            r14 = 0
            r4.<init>(r5, r6, r8, r10, r11, r12, r13, r14)
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r0, r4)
        Laf:
            return
        Lb0:
            r10 = r12
            goto L9a
        Lb2:
            r4 = 0
            goto L86
        Lb4:
            java.lang.String r13 = "anchor"
            goto L8c
        Lb7:
            r3 = r12
            goto L68
        Lb9:
            r1 = r12
            goto L56
        Lbb:
            r11 = 0
            goto L43
        Lbd:
            r0 = -1
            goto L3f
        Lbf:
            r6 = 0
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.business.live.cell.FollowingLiveSkylightDoubleBigAvatarCell.a6():void");
    }

    @Override // X.InterfaceC1605330rsR
    public final String getAuthorId() {
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.c7a;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.cell.BaseSkylightCell
    public final View Hy1() {
        return (View) this.LLJJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.business.live.cell.BaseFollowingLiveSkylightCell
    public final ConstraintLayout U5() {
        return (ConstraintLayout) this.LLJJJJLIIL.getValue();
    }

    public final int f6() {
        User user;
        FollowingInterestUser followingInterestUser = this.LLJLIL;
        if (followingInterestUser == null || (user = followingInterestUser.getUser()) == null) {
            return -1;
        }
        int followStatus = user.getFollowStatus();
        return (followStatus == 0 || followStatus == 1 || followStatus == 2) ? followStatus : user.getFollowerStatus() == 0 ? 0 : 3;
    }

    public final C424620Gku h6() {
        return (C424620Gku) this.LLJJJJJIL.getValue();
    }

    public final TuxTextView i6() {
        return (TuxTextView) this.LLJJIII.getValue();
    }

    @Override // com.ss.android.ugc.aweme.business.live.cell.BaseFollowingLiveSkylightCell, com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C1605320rsQ.LIZ(this, this);
        EnumC1610470s0j enumC1610470s0j = LiveAvatarEntranceUnifySetting.getValue() ? EnumC1610470s0j.MEDIUM : EnumC1610470s0j.SKYLIGHT;
        this.LLJJL = new C1610740s1A(enumC1610470s0j, (View) this.LLJJ.getValue(), (View) this.LLJJ.getValue(), (C1610770s1D) this.LLJJJ.getValue());
        C1610740s1A c1610740s1A = new C1610740s1A(enumC1610470s0j, (View) this.LLJJI.getValue(), (View) this.LLJJI.getValue(), (C1610770s1D) this.LLJJJIL.getValue());
        this.LLJJLIIIJLLLLLLLZ = c1610740s1A;
        C1610740s1A c1610740s1A2 = this.LLJJL;
        if (c1610740s1A2 != null) {
            c1610740s1A2.LJIIIIZZ = false;
        }
        c1610740s1A.LJIIIIZZ = false;
        if (LiveAvatarEntranceUnifySetting.getValue()) {
            C786410Ut5.LJLLLLLL(8, (View) this.LLJJJJ.getValue());
            C786410Ut5.k(h6(), 0);
            HandlerHook.viewPost(h6(), new ARunnableS106S0100000_6(this, 35));
            this.LLJL = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v3().LJJIJIIJI(h6(), true);
            C424620Gku c424620GkuH6 = h6();
            ViewGroup.LayoutParams layoutParams = c424620GkuH6.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25));
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25));
            C786410Ut5.W5(c424620GkuH6, layoutParams);
            C426750GoL.LJIIIZ(this.itemView.findViewById(R.id.bi2), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), 0, 0, false, 16);
            C1610770s1D c1610770s1D = (C1610770s1D) this.LLJJJ.getValue();
            c1610770s1D.setStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
            c1610770s1D.setInnerStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
            C1610770s1D c1610770s1D2 = (C1610770s1D) this.LLJJJIL.getValue();
            c1610770s1D2.setStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
            c1610770s1D2.setInnerStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
        } else {
            C786410Ut5.k(h6(), 8);
            C786410Ut5.LJLLLLLL(0, (View) this.LLJJJJ.getValue());
        }
        View viewFindViewById = this.itemView.findViewById(R.id.l_z);
        View viewFindViewById2 = this.itemView.findViewById(R.id.l_w);
        C1607400rvm c1607400rvm = C1607400rvm.LIZIZ;
        C1608370rxL c1608370rxL = new C1608370rxL(this.itemView, (C1610770s1D) this.LLJJJ.getValue(), viewFindViewById, (C1322110kVd) this.LLJJ.getValue(), (C1610770s1D) this.LLJJJIL.getValue(), viewFindViewById2, (C1322110kVd) this.LLJJI.getValue(), i6(), q6(), (View) this.LLJJJJ.getValue(), 512);
        int iUH2 = uH2();
        c1607400rvm.LIZ(c1608370rxL, iUH2 != 1 ? iUH2 != 2 ? EnumC1606080rte.DEFAULT : EnumC1606080rte.FOLLOW_SKYLIGHT : EnumC1606080rte.FYP_SKYLIGHT, false);
        if (C295310Bhp.LIZ()) {
            View view = (View) this.LLJJJJ.getValue();
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(23));
            C786410Ut5.W5(view, layoutParams2);
            View view2 = (View) this.LLJJIJIIJIL.getValue();
            ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams3.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(41));
            layoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(23));
            C786410Ut5.W5(view2, layoutParams3);
            ((TuxTextView) this.LLJJIJIIJIL.getValue()).setTuxFont(73);
            ((AppCompatTextView) this.LLJJIJIIJIL.getValue()).setBackgroundResource(R.drawable.cdq);
        }
    }

    public final TuxTextView q6() {
        return (TuxTextView) this.LLJJIJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final View L5() {
        return i6();
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

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final View R5() {
        return U5();
    }

    @Override // com.ss.android.ugc.aweme.business.live.cell.BaseFollowingLiveSkylightCell
    public final void b6() {
        super.b6();
        r6(this);
    }

    @Override // com.ss.android.ugc.aweme.business.live.cell.BaseFollowingLiveSkylightCell
    public final void c6() {
        super.c6();
        C1610740s1A c1610740s1A = this.LLJJL;
        if (c1610740s1A != null) {
            c1610740s1A.xs();
        }
        C1610740s1A c1610740s1A2 = this.LLJJLIIIJLLLLLLLZ;
        if (c1610740s1A2 != null) {
            c1610740s1A2.xs();
        }
        InterfaceC662550Pyn interfaceC662550Pyn = this.LLJL;
        if (interfaceC662550Pyn != null) {
            interfaceC662550Pyn.LIZ();
        }
    }

    @Override // X.InterfaceC1605330rsR
    public final String getEnterFrom() {
        return C1596560reI.LIZIZ(uH2());
    }

    @Override // com.ss.android.ugc.aweme.business.live.cell.BaseFollowingLiveSkylightCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onPause() {
        super.onPause();
        r6(this);
    }

    @Override // com.ss.android.ugc.aweme.business.live.cell.BaseFollowingLiveSkylightCell, com.ss.android.ugc.aweme.base.ui.cell.BaseSkylightCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        C1610740s1A c1610740s1A = this.LLJJL;
        if (c1610740s1A != null) {
            c1610740s1A.LIZ();
        }
        C1610740s1A c1610740s1A2 = this.LLJJLIIIJLLLLLLLZ;
        if (c1610740s1A2 != null) {
            c1610740s1A2.LIZ();
        }
        InterfaceC662550Pyn interfaceC662550Pyn = this.LLJL;
        if (interfaceC662550Pyn != null) {
            interfaceC662550Pyn.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.business.live.cell.BaseFollowingLiveSkylightCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        C1610740s1A c1610740s1A = this.LLJJL;
        if (c1610740s1A != null) {
            c1610740s1A.LJIIJ();
        }
        C1610740s1A c1610740s1A2 = this.LLJJLIIIJLLLLLLLZ;
        if (c1610740s1A2 != null) {
            c1610740s1A2.LJIIJ();
        }
        InterfaceC662550Pyn interfaceC662550Pyn = this.LLJL;
        if (interfaceC662550Pyn != null) {
            interfaceC662550Pyn.LJIIZILJ();
        }
    }

    public final int uH2() {
        Fragment fragmentLIZ;
        ISkylightListAbility iSkylightListAbility;
        LifecycleOwner parent = getParent();
        if (parent == null || (fragmentLIZ = C1596560reI.LIZ(parent)) == null || (iSkylightListAbility = (ISkylightListAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLIZ, null), ISkylightListAbility.class, null)) == null) {
            return -1;
        }
        return iSkylightListAbility.uH2();
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final EnumC1605560rso I5() {
        return EnumC1605560rso.MUTE_LIVES;
    }

    public static void r6(FollowingLiveSkylightDoubleBigAvatarCell followingLiveSkylightDoubleBigAvatarCell) {
        C1610740s1A c1610740s1A = followingLiveSkylightDoubleBigAvatarCell.LLJJL;
        if (c1610740s1A != null) {
            c1610740s1A.Ir();
        }
        C1610740s1A c1610740s1A2 = followingLiveSkylightDoubleBigAvatarCell.LLJJLIIIJLLLLLLLZ;
        if (c1610740s1A2 != null) {
            c1610740s1A2.Ir();
        }
        InterfaceC662550Pyn interfaceC662550Pyn = followingLiveSkylightDoubleBigAvatarCell.LLJL;
        if (interfaceC662550Pyn != null) {
            interfaceC662550Pyn.LJIIZILJ();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C0J5O c0j5oZ5;
        List<com.bytedance.android.live.base.model.user.User> list;
        com.bytedance.android.live.base.model.user.User user;
        List urls;
        List<com.bytedance.android.live.base.model.user.User> list2;
        com.bytedance.android.live.base.model.user.User user2;
        List urls2;
        C1597830rgL c1597830rgL = (C1597830rgL) interfaceC1891350zJl;
        super.onBindItemView(c1597830rgL);
        FollowingInterestUser followingInterestUser = c1597830rgL.LL;
        this.LLJLIL = followingInterestUser;
        this.LLJLILLLLZIIL = c1597830rgL.LLILLJJLI;
        C1597740rgC.LIZ.getClass();
        SlimRoom slimRoomLJII = C1597740rgC.LJII(followingInterestUser);
        if (slimRoomLJII != null) {
            C786410Ut5.Ob(this.itemView, 1.0f);
            C786410Ut5.pc(this.itemView, 1.0f);
            int i = 0;
            if (slimRoomLJII.getLinkMic().followedList.size() >= 2) {
                SlimRoom.LinkMic linkMic = slimRoomLJII.getLinkMic();
                if (linkMic != null && (list2 = linkMic.followedList) != null && (user2 = (com.bytedance.android.live.base.model.user.User) ListProtector.get(list2, 0)) != null) {
                    ImageModel avatarThumb = user2.getAvatarThumb();
                    if (avatarThumb != null) {
                        urls2 = avatarThumb.getUrls();
                    } else {
                        urls2 = null;
                    }
                    X5(urls2, (C1322110kVd) this.LLJJI.getValue());
                    TuxTextView tuxTextViewI6 = i6();
                    C1243240iSQ c1243240iSQ = C1243240iSQ.LIZ;
                    String username = user2.getUsername();
                    String nickName = user2.getNickName();
                    c1243240iSQ.getClass();
                    tuxTextViewI6.setText(C1243240iSQ.LIZLLL(username, nickName));
                    boolean zLIZLLL = C1597740rgC.LIZLLL();
                    ViewGroup.LayoutParams layoutParams = ((View) this.LLJJIJI.getValue()).getLayoutParams();
                    if (zLIZLLL) {
                        layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
                    } else {
                        layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
                    }
                    C786410Ut5.W5((View) this.LLJJIJI.getValue(), layoutParams);
                    if (C1597740rgC.LJ()) {
                        i6().setTuxFont(71);
                        q6().setTuxFont(71);
                    } else {
                        i6().setTuxFont(72);
                        q6().setTuxFont(72);
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
                    X5(urls, (C1322110kVd) this.LLJJ.getValue());
                }
            }
            TuxTextView tuxTextViewQ6 = q6();
            if (slimRoomLJII.getLinkMic().followedCount > 1) {
                if (C444960Hcc.LIZIZ()) {
                    TuxTextView tuxTextViewQ62 = q6();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(slimRoomLJII.getLinkMic().followedCount - 1);
                    sbLIZ.append('+');
                    tuxTextViewQ62.setText(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    TuxTextView tuxTextViewQ63 = q6();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append('+');
                    sbLIZ2.append(slimRoomLJII.getLinkMic().followedCount - 1);
                    tuxTextViewQ63.setText(C2188811AlT.LIZIZ(sbLIZ2));
                }
            } else {
                i = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextViewQ6, i);
            EcommerceRoomHeadTag ecommerceRoomHeadTag = slimRoomLJII.ecommerceRoomHeadTag;
            if (ecommerceRoomHeadTag != null) {
                C1597100rfA c1597100rfA = C1597100rfA.LIZ;
                TuxTextView tuxTextView = (TuxTextView) this.LLJJIJIIJIL.getValue();
                c1597100rfA.getClass();
                C1597100rfA.LJ(tuxTextView, ecommerceRoomHeadTag);
            } else {
                C1597100rfA c1597100rfA2 = C1597100rfA.LIZ;
                TuxTextView tuxTextView2 = (TuxTextView) this.LLJJIJIIJIL.getValue();
                c1597100rfA2.getClass();
                C1597100rfA.LJFF(tuxTextView2);
            }
            C2271391DvN.LIZ((View) this.LLJILLL.getValue(), C2271381DvM.LIZ());
            C786410Ut5.I7(new ACListenerS158S0100000_24(this, 106), (View) this.LLJILLL.getValue());
            C1610740s1A c1610740s1A = this.LLJJL;
            if (c1610740s1A != null) {
                c1610740s1A.LJFF(null, FollowingLiveSkylightDoubleBigAvatarCell.class, null, null, null);
            }
            C1610740s1A c1610740s1A2 = this.LLJJLIIIJLLLLLLLZ;
            if (c1610740s1A2 != null) {
                c1610740s1A2.LJFF(null, FollowingLiveSkylightDoubleBigAvatarCell.class, null, null, null);
            }
            try {
                ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().T8(C0IVT.LIZ("homepage_follow", "live_cover", slimRoomLJII));
                if (((LiveEntranceConfig) C1607480rvu.LIZIZ.getValue()).enableFollowingHead && getAbsoluteAdapterPosition() == 1) {
                    SlimRoom slimRoomLJII2 = C1597740rgC.LJII(this.LLJLIL);
                    if (slimRoomLJII2 != null) {
                        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                        if (iLiveOuterService != null && (c0j5oZ5 = iLiveOuterService.z5()) != null) {
                            c0j5oZ5.LJ(this.itemView.getContext(), slimRoomLJII2, "homepage_follow");
                        }
                    } else {
                        return;
                    }
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.business.live.cell.BaseFollowingLiveSkylightCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onResume(boolean z) {
        super.onResume(z);
        C1610740s1A c1610740s1A = this.LLJJL;
        if (c1610740s1A != null) {
            c1610740s1A.xs();
        }
        C1610740s1A c1610740s1A2 = this.LLJJLIIIJLLLLLLLZ;
        if (c1610740s1A2 != null) {
            c1610740s1A2.xs();
        }
        InterfaceC662550Pyn interfaceC662550Pyn = this.LLJL;
        if (interfaceC662550Pyn != null) {
            interfaceC662550Pyn.LIZ();
        }
    }
}
