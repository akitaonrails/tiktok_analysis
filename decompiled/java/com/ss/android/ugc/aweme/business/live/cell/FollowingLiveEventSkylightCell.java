package com.ss.android.ugc.aweme.business.live.cell;

import X.C01GW;
import X.C1243240iSQ;
import X.C1308910kAL;
import X.C1322110kVd;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C13LP;
import X.C1596040rdS;
import X.C1596560reI;
import X.C1597740rgC;
import X.C1607400rvm;
import X.C1608320rxG;
import X.C20684815ws;
import X.C2097908Jt;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C444960Hcc;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1338240kve;
import X.EnumC1605560rso;
import X.EnumC1606080rte;
import X.InterfaceC1891350zJl;
import Y.ACListenerS126S0200000_24;
import Y.ARunnableS29S1100000_24;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.ability.ISkylightListAbility;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.module.FollowingEcLiveEvent;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FollowingLiveEventSkylightCell extends BaseFollowingLiveSkylightCell<C1596040rdS> {
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 156));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 151));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 157));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 153));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 154));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 152));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 150));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 155));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(84));
    public FollowingInterestUser LLJJJJ;

    @Override // com.ss.android.ugc.aweme.business.live.cell.BaseFollowingLiveSkylightCell
    public final ConstraintLayout U5() {
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.c7c;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.cell.BaseSkylightCell
    public final View Hy1() {
        return (View) this.LLJJ.getValue();
    }

    public final TuxTextView f6() {
        return (TuxTextView) this.LLJJI.getValue();
    }

    public final int uH2() {
        ISkylightListAbility iSkylightListAbility = (ISkylightListAbility) this.LLJIJIL.getValue();
        if (iSkylightListAbility != null) {
            return iSkylightListAbility.uH2();
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final View L5() {
        return f6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final User N5() {
        C1596040rdS c1596040rdS = (C1596040rdS) getItem();
        if (c1596040rdS != null) {
            return c1596040rdS.getUser();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final Map<String, String> P5() {
        return C2097908Jt.LIZJ(new Pair("enter_from", C1596560reI.LIZIZ(uH2())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.business.live.cell.BaseFollowingLiveSkylightCell
    public final void a6() {
        C1596040rdS c1596040rdS = (C1596040rdS) getItem();
        if (c1596040rdS == null || !c1596040rdS.LLILLL) {
            C1596040rdS c1596040rdS2 = (C1596040rdS) getItem();
            if (c1596040rdS2 != null) {
                c1596040rdS2.LLILLL = true;
            }
            if (this.LLJJJJ != null) {
                C20684815ws.LJFF().execute(new ARunnableS29S1100000_24(this, "livesdk_live_event_user_entrance_show", 4));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.business.live.cell.BaseFollowingLiveSkylightCell, com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C1607400rvm c1607400rvm = C1607400rvm.LIZIZ;
        int iUH2 = uH2();
        c1607400rvm.LIZIZ(iUH2 != 1 ? iUH2 != 2 ? EnumC1606080rte.DEFAULT : EnumC1606080rte.FOLLOW_SKYLIGHT : EnumC1606080rte.FYP_SKYLIGHT, new C1608320rxG(this.itemView, (View) this.LLJJIJIL.getValue(), (View) this.LLJJ.getValue(), f6(), (TuxIconView) null, 48), false);
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final EnumC1605560rso I5() {
        return EnumC1605560rso.MUTE_LIVE_EVENT;
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final View R5() {
        return this.itemView;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        FollowingEcLiveEvent ecLiveEvent;
        ImageUrlModel liveEventIcon;
        List<String> urls;
        String str;
        User user;
        List<String> urlList;
        C1596040rdS c1596040rdS = (C1596040rdS) interfaceC1891350zJl;
        super.onBindItemView(c1596040rdS);
        FollowingInterestUser followingInterestUser = c1596040rdS.LL;
        this.LLJJJJ = followingInterestUser;
        if (followingInterestUser != null && (user = followingInterestUser.getUser()) != null) {
            UrlModel avatarThumb = user.getAvatarThumb();
            if (avatarThumb != null) {
                urlList = avatarThumb.getUrlList();
            } else {
                urlList = null;
            }
            X5(urlList, (C1322110kVd) this.LLJJ.getValue());
            TuxTextView tuxTextViewF6 = f6();
            C1243240iSQ.LIZ.getClass();
            tuxTextViewF6.setText(C1243240iSQ.LIZ(user, true));
            C1597740rgC.LIZ.getClass();
            boolean zLIZLLL = C1597740rgC.LIZLLL();
            ViewGroup.LayoutParams layoutParams = f6().getLayoutParams();
            if (zLIZLLL) {
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
            } else {
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
            }
            C786410Ut5.R6(f6(), layoutParams);
            if (C1597740rgC.LJ()) {
                f6().setTuxFont(71);
            } else {
                f6().setTuxFont(72);
            }
        }
        View view = (View) this.LLJJJ.getValue();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
        c384050F3z.LJ = C1308910kAL.LIZJ(R.attr.zj, this.itemView.getContext());
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(3.5d))));
        view.setBackground(c384050F3z.LIZ(((View) this.LLJJJ.getValue()).getContext()));
        View view2 = (View) this.LLJJIJI.getValue();
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZJ = Float.valueOf(Float.MAX_VALUE);
        c384050F3z2.LJ = C1308910kAL.LIZJ(R.attr.e1, this.itemView.getContext());
        c384050F3z2.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(2.5d))));
        view2.setBackground(c384050F3z2.LIZ(((View) this.LLJJIJI.getValue()).getContext()));
        if (C444960Hcc.LIZIZ()) {
            C786410Ut5.Gc(C418440Gaw.LIZIZ(-4), (ViewGroup) this.LLJJIII.getValue());
        } else {
            C786410Ut5.Gc(C418440Gaw.LIZIZ(4), (ViewGroup) this.LLJJIII.getValue());
        }
        FollowingInterestUser followingInterestUser2 = this.LLJJJJ;
        if (followingInterestUser2 != null && (ecLiveEvent = followingInterestUser2.getEcLiveEvent()) != null && (liveEventIcon = ecLiveEvent.getLiveEventIcon()) != null && (urls = liveEventIcon.getUrls()) != null && (str = (String) C13LP.LJJJLL(urls)) != null) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LIZLLL("FollowFeedSkylight");
            c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.CENTER_CROP;
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LIZ = true;
            c1331670kl3LJIIIZ.LJJI = new C1331730kl9(c1331750klB);
            c1331670kl3LJIIIZ.LJJI((ImageView) this.LLJJIJIIJIL.getValue());
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        } else {
            TuxIconView tuxIconView = (TuxIconView) this.LLJJIJIIJIL.getValue();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_calendar_star_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15));
            tuxIconView.setTuxIcon(c419910GdJ);
            View view3 = (View) this.LLJJIJIIJIL.getValue();
            C384050F3z c384050F3z3 = new C384050F3z();
            c384050F3z3.LIZJ = Float.valueOf(Float.MAX_VALUE);
            c384050F3z3.LIZ = C1308910kAL.LIZJ(R.attr.a1r, this.itemView.getContext());
            view3.setBackground(c384050F3z3.LIZ(((View) this.LLJJIJIIJIL.getValue()).getContext()));
        }
        C786410Ut5.I7(new ACListenerS126S0200000_24(this, c1596040rdS, 32), (View) this.LLJILLL.getValue());
    }
}
