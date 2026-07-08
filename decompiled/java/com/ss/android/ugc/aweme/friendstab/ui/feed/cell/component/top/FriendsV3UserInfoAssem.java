package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.top;

import X.C01GW;
import X.C06BY;
import X.C06LY;
import X.C418440Gaw;
import X.C452501pT;
import X.C704790Rkj;
import X.C705700RmC;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1578206Fw;
import X.EnumC452301pR;
import X.InterfaceC1361270lWn;
import X.InterfaceC899120ZPa;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellUISlotAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.FriendsV3CommentAssem;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import irm.AkS83S0100000_11;
import java.util.List;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsV3UserInfoAssem extends BaseFriendsV3CellUISlotAssem<FriendsV3UserInfoAssem, InterfaceC1361270lWn> {
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public InterfaceC899120ZPa LLJZ;
    public final C01GW LLJZIJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cby;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C705700RmC.LIZ(this, R.layout.cby, new AwS555S0100000_11(this, 478));
    }

    public final MatchedFriendStruct sp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        User userLLILLL = ((InterfaceC1361270lWn) (c724270Sb3 != null ? c724270Sb3.LL : null)).LLILLL();
        if (userLLILLL != null) {
            return userLLILLL.getMatchedFriendStruct();
        }
        return null;
    }

    public FriendsV3UserInfoAssem() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLJL = C452501pT.LIZ(enumC452301pR, new AwS555S0100000_11(this, 475));
        this.LLJLIL = C452501pT.LIZ(enumC452301pR, new AwS555S0100000_11(this, 482));
        this.LLJLILLLLZIIL = C452501pT.LIZ(enumC452301pR, new AwS555S0100000_11(this, 476));
        this.LLJLL = C452501pT.LIZ(enumC452301pR, new AwS555S0100000_11(this, 477));
        this.LLJLLIL = C452501pT.LIZ(enumC452301pR, new AwS555S0100000_11(this, 481));
        this.LLJLLL = C452501pT.LIZ(enumC452301pR, new AwS555S0100000_11(this, 480));
        this.LLJZIJLIL = C452501pT.LIZ(enumC452301pR, new AwS555S0100000_11(this, 479));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Context context;
        ((RadiusLayout) this.LLJLILLLLZIIL.getValue()).setRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        C786410Ut5.I7(new AkS83S0100000_11(this, 8), (View) this.LLJL.getValue());
        C786410Ut5.I7(new AkS83S0100000_11(this, 9), (View) this.LLJZIJLIL.getValue());
        if (C06BY.LIZ() && (context = getContext()) != null) {
            IStreakService.LJJIIZ.getClass();
            this.LLJZ = C06LY.LIZ().V(context, EnumC1578206Fw.FRIENDS, new AwS590S0100000_11(this, 551));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0153  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.top.FriendsV3UserInfoAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC705620Rm4
    public final boolean va(List<? extends Object> list) {
        int i = FriendsV3CommentAssem.LLJLLIL;
        return !C704790Rkj.LIZ(list);
    }
}
