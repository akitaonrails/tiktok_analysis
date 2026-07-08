package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.top;

import X.C019F;
import X.C01GW;
import X.C0OB8;
import X.C0RJN;
import X.C0SY3;
import X.C0SY7;
import X.C109100bB;
import X.C10EU;
import X.C1206504nn;
import X.C1336205Ku;
import X.C1361220lWi;
import X.C1387050mCN;
import X.C1389300mG0;
import X.C13DA;
import X.C13LE;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1578630rBN;
import X.C1591860rWi;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1908890zm3;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C704790Rkj;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C725890Sdf;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1387060mCO;
import X.EnumC2274741E1w;
import X.EnumC452301pR;
import X.InterfaceC1361270lWn;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.ATListenerS440S0100000_6;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellContentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.FriendsV3CommentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3MessageAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3PlayerAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3EventDispatchViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsV3MessageAssem extends BaseFriendsV3CellContentAssem<FriendsV3MessageAssem, InterfaceC1361270lWn> implements FriendsV3MessageAbility, FriendsV3ViewStateProtocol {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public final C01GW LLJJJJJIL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS555S0100000_11(this, 473));
    public final C630740Ooa LLJJJJLIIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 472));
    public final InterfaceC1731706qJ LLJJL;
    public Integer LLJJLIIIJLLLLLLLZ;
    public Bitmap LLJL;
    public boolean LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3MessageAssem.class, "eventVM", "getEventVM()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3EventDispatchViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FriendsV3MessageAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsV3EventDispatchViewModel.class);
        this.LLJJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 474), null, AFwS243S0000000_11.get$arr$(280));
    }

    public final void hp() {
        lp(false);
        User userDp = dp();
        if (userDp != null) {
            C0SY3 c0sy3 = C0SY3.LIZ;
            Context context = getContext();
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            C724270Sb3 c724270Sb3 = this.LLJI;
            Object obj = c724270Sb3 != null ? c724270Sb3.LL : null;
            FriendsV3PlayerAbility friendsV3PlayerAbility = (FriendsV3PlayerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), FriendsV3PlayerAbility.class, null);
            c0sy3.getClass();
            C0SY3.LIZ(context, fragmentLJI, (InterfaceC1361270lWn) obj, userDp, friendsV3PlayerAbility);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJJJJLIIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1554610qYd.LIZLLL(interfaceC665370Q7z, FriendsV3ViewStateProtocol.class, this);
        }
        InterfaceC665370Q7z interfaceC665370Q7z2 = (InterfaceC665370Q7z) this.LLJJJJLIIL.getValue();
        if (interfaceC665370Q7z2 != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z2, FriendsV3MessageAbility.class, null);
        }
    }

    public final User dp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return ((InterfaceC1361270lWn) (c724270Sb3 != null ? c724270Sb3.LL : null)).LLILLL();
    }

    public final RelationButton ep() {
        return (RelationButton) this.LLJJJJJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol
    public final List<View> AG0() {
        return Collections.singletonList(ep());
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3MessageAbility
    public final void Ry() {
        C786410Ut5.LJLLLLLL(0, ep());
    }

    public final void cp() {
        Map<? extends C0SY7, ? extends C1908890zm3> mapLJ;
        User userDp;
        C725890Sdf.LIZIZ(ep(), ip() || ((userDp = dp()) != null && userDp.getFollowStatus() == 0));
        User userDp2 = dp();
        if (userDp2 != null) {
            RelationButton relationButtonEp = ep();
            C1387050mCN c1387050mCN = new C1387050mCN(userDp2);
            c1387050mCN.LJ = EnumC1387060mCO.FRIENDS;
            c1387050mCN.LJIIJJI = this;
            c1387050mCN.LIZIZ = ip();
            c1387050mCN.LJIIJ = userDp2.getMatchedFriendStruct() != null;
            c1387050mCN.LJFF = EnumC2274741E1w.CUSTOM_FRIENDS_V3_FEEDS;
            if (ip()) {
                Pair[] pairArr = new Pair[2];
                C0SY7 c0sy7 = C0SY7.FOLLOW_MUTUAL;
                Context context = getContext();
                pairArr[0] = new Pair(c0sy7, new C1908890zm3(context != null ? context.getString(2131837236) : null, new AwS555S0100000_11(this, 469)));
                C0SY7 c0sy72 = C0SY7.FOLLOWED;
                Context context2 = getContext();
                pairArr[1] = new Pair(c0sy72, new C1908890zm3(context2 != null ? context2.getString(2131837236) : null, new AwS555S0100000_11(this, 470)));
                mapLJ = C2097608Jq.LJIIIIZZ(pairArr);
            } else {
                mapLJ = C2097608Jq.LJ();
            }
            c1387050mCN.LJII.putAll(mapLJ);
            relationButtonEp.LLLLZIL(c1387050mCN.LIZ());
            ep().setTracker(new AwS555S0100000_11(this, 471));
            ep().setRequestListener(new AwS625S0100000_11(userDp2, 40));
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3MessageAbility
    public final void hL1() {
        if (C1206504nn.LIZ() && !this.LLJLIL && kp()) {
            this.LLJL = null;
            C786410Ut5.LJLLLLLL(8, LJJIJL());
        }
    }

    public final boolean ip() {
        if (C1336205Ku.LIZJ().LIZJ() || C10EU.LJIILLIIL(dp()) || C1336205Ku.LIZ(false).getImPrivacySettings().LJIIJJI() == 3) {
            return false;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        return !((c724270Sb3 != null ? c724270Sb3.LL : null) instanceof C1361220lWi);
    }

    public final boolean kp() {
        User userDp = dp();
        return userDp != null && userDp.getFollowStatus() == 0;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJJJJLIIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1554610qYd.LIZJ(interfaceC665370Q7z, FriendsV3ViewStateProtocol.class, C1697810uHb.LJIILJJIL(this));
        }
        InterfaceC665370Q7z interfaceC665370Q7z2 = (InterfaceC665370Q7z) this.LLJJJJLIIL.getValue();
        if (interfaceC665370Q7z2 != null) {
            C1558520qew.LJII(interfaceC665370Q7z2, this, FriendsV3MessageAbility.class, null, null);
        }
    }

    public final void lp(boolean z) {
        String str;
        C0RJN c0rjnLIZIZ;
        Object obj;
        if (z) {
            str = "ttsocial_friend_tab_dm_btn_show";
        } else {
            str = "ttsocial_friend_tab_dm_btn_click";
        }
        C109100bB c109100bB = C109100bB.LIZ;
        C13DA c13da = new C13DA();
        c13da.put("friends_tab_version", "v3.0");
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        String uid = null;
        if (fragmentLJI != null) {
            c0rjnLIZIZ = C1578630rBN.LIZIZ(fragmentLJI);
        } else {
            c0rjnLIZIZ = null;
        }
        c13da.put("enter_from", C1389300mG0.LIZ(c0rjnLIZIZ));
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        c13da.put("group_id", ((C0OB8) obj).getAweme().getAid());
        User userDp = dp();
        if (userDp != null) {
            uid = userDp.getUid();
        }
        c13da.put("author_id", uid);
        Map mapBuild = c13da.build();
        c109100bB.getClass();
        C109100bB.LIZ(str, mapBuild);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int i;
        RelationButton relationButtonEp = ep();
        C1591860rWi.LJFF(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), relationButtonEp);
        relationButtonEp.setMinTextSize(13.0f);
        relationButtonEp.setEllipsize(TextUtils.TruncateAt.END);
        Context context = getContext();
        if (context != null) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            if (displayMetrics != null) {
                i = displayMetrics.widthPixels;
            } else {
                i = 0;
            }
            ep().setMaxWidth((int) (((double) i) * 0.25d));
        }
        if (C1206504nn.LIZ()) {
            ep().setOnTouchListener(new ATListenerS440S0100000_6(this, 10));
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJL.getValue(this, LLJLILLLLZIIL[0]), new C2217381BqS() { // from class: X.0Sll
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1393390mMb) obj).LLJI;
                }
            }, null, AFwS294S0000000_11.get$arr$(280), 6);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(Object obj) {
        int i;
        if (C1206504nn.LIZ()) {
            Integer numValueOf = null;
            this.LLJL = null;
            boolean zKp = kp();
            View viewLJJIJL = LJJIJL();
            if (zKp) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewLJJIJL);
            User userDp = dp();
            if (userDp != null) {
                numValueOf = Integer.valueOf(userDp.getFollowStatus());
            }
            this.LLJJLIIIJLLLLLLLZ = numValueOf;
            if (!zKp) {
                return;
            }
        }
        cp();
    }

    @Override // X.InterfaceC705620Rm4
    public final boolean va(List<? extends Object> list) {
        int i = FriendsV3CommentAssem.LLJLLIL;
        return !C704790Rkj.LIZ(list);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol
    public final void EK2(View view, boolean z) {
        if (z) {
            lp(true);
        }
    }
}
