package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.avatar;

import X.C019F;
import X.C01GW;
import X.C0S1B;
import X.C13LE;
import X.C1608750rxx;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C426140GnM;
import X.C452501pT;
import X.C459640I0s;
import X.C628500Oky;
import X.C630740Ooa;
import X.C704790Rkj;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737740Swm;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC1607270rvZ;
import X.EnumC452301pR;
import X.InterfaceC1357880lRK;
import X.InterfaceC1361270lWn;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellContentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.FriendsV3CommentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3EventDispatchViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import irm.AkS83S0100000_11;
import java.util.List;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsV3AvatarAssem extends BaseFriendsV3CellContentAssem<FriendsV3AvatarAssem, InterfaceC1361270lWn> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public final C630740Ooa LLJJJJJIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 429));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 430));
    public final InterfaceC1731706qJ LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3AvatarAssem.class, "eventVM", "getEventVM()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3EventDispatchViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FriendsV3AvatarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsV3EventDispatchViewModel.class);
        this.LLJJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 431), null, AFwS243S0000000_11.get$arr$(214));
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZ(enumC452301pR, new AwS555S0100000_11(this, 427));
        this.LLJL = C452501pT.LIZ(enumC452301pR, new AwS555S0100000_11(this, 428));
    }

    public final User cp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return ((InterfaceC1361270lWn) (c724270Sb3 != null ? c724270Sb3.LL : null)).LLILLL();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        AvatarComponentView avatarComponentView = (AvatarComponentView) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (avatarComponentView != null) {
            C1608750rxx config = avatarComponentView.getConfig();
            config.LIZ(AFwS243S0000000_11.get$arr$(213));
            config.LIZJ(new C737740Swm(0));
            avatarComponentView.LJFF(avatarComponentView.getConfig());
        }
        View view2 = (View) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (view2 != null) {
            C786410Ut5.I7(new AkS83S0100000_11(this, 1), view2);
        }
        View view3 = (View) this.LLJL.getValue();
        if (view3 != null) {
            C786410Ut5.I7(new AkS83S0100000_11(this, 12), view3);
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJL.getValue(this, LLJLIL[0]), new C2217381BqS() { // from class: X.0Slm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1393390mMb) obj).LLJI;
            }
        }, null, AFwS294S0000000_11.get$arr$(310), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(Object obj) {
        Object obj2;
        C426140GnM c426140GnM;
        int followStatus;
        String uid;
        Object obj3;
        AvatarComponentView avatarComponentView = (AvatarComponentView) this.LLJJLIIIJLLLLLLLZ.getValue();
        String uid2 = null;
        if (avatarComponentView != null) {
            User userCp = cp();
            if (userCp == null || (uid = userCp.getUid()) == null) {
                uid = "";
            }
            C0S1B.LIZ(avatarComponentView, uid, cp(), this, false, null, 56);
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj3 = c724270Sb3.LL;
            } else {
                obj3 = null;
            }
            avatarComponentView.LJIILIIL(new C459640I0s(obj3 instanceof InterfaceC1357880lRK), EnumC1607270rvZ.INTERACTION);
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        } else {
            obj2 = null;
        }
        if (!(obj2 instanceof InterfaceC1357880lRK) && (c426140GnM = (C426140GnM) this.LLJL.getValue()) != null) {
            User userCp2 = cp();
            if (userCp2 != null) {
                uid2 = userCp2.getUid();
            }
            User userCp3 = cp();
            if (userCp3 != null) {
                followStatus = userCp3.getFollowStatus();
            } else {
                followStatus = 0;
            }
            c426140GnM.LIZ(followStatus, uid2, false);
        }
    }

    @Override // X.InterfaceC705620Rm4
    public final boolean va(List<? extends Object> list) {
        int i = FriendsV3CommentAssem.LLJLLIL;
        return !C704790Rkj.LIZ(list);
    }
}
