package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.repost.card;

import X.C01GW;
import X.C0OB8;
import X.C0SDJ;
import X.C1308910kAL;
import X.C1386160mAw;
import X.C13LE;
import X.C1483410ohn;
import X.C418440Gaw;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C704790Rkj;
import X.C705700RmC;
import X.C723830SaL;
import X.C724270Sb3;
import X.C725840Sda;
import X.C737910Sx3;
import X.C814420VxA;
import X.InterfaceC1361270lWn;
import X.InterfaceC1588310rQz;
import X.InterfaceC1608300rxE;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellUISlotAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.IFriendsV3GestureHandleAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.FriendsV3CommentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.viewmodel.FriendsV3CellAreaViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3DetailBridgeAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3PlayerAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class FriendsV3RepostCardVideoAssem extends BaseFriendsV3CellUISlotAssem<FriendsV3RepostCardVideoAssem, InterfaceC1361270lWn> implements InterfaceC1608300rxE {
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2238));
    public final C630740Ooa LLJLIL = C628500Oky.LIZ(new AwS577S0100000_33(this, 2243));
    public final C630740Ooa LLJLILLLLZIIL = C628500Oky.LIZ(new AwS577S0100000_33(this, 2245));
    public final C01GW LLJLL = C737910Sx3.LIZJ(this, C13LE.LIZ(FriendsV3CellAreaViewModel.class), AFwS279S0000000_33.get$arr$(141));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2247));
    public final C630740Ooa LLJLLL = C628500Oky.LIZ(new AwS577S0100000_33(this, 2240));
    public final C630740Ooa LLJZ = C628500Oky.LIZ(new AwS577S0100000_33(this, 2241));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2239));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2242));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2246));
    public final C630740Ooa LLLFF = C628500Oky.LIZ(new AwS563S0100000_19(this, 1466));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cbe;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C705700RmC.LIZ(this, R.layout.cbe, new AwS577S0100000_33(this, 2244));
    }

    @Override // X.InterfaceC1608300rxE
    public final boolean o5(MotionEvent motionEvent) {
        Object obj;
        C1483410ohn c1483410ohnXc;
        if (motionEvent == null || !C1386160mAw.LIZLLL(motionEvent, (View) this.LLJLLIL.getValue()) || C1386160mAw.LIZLLL(motionEvent, (View) this.LLJZIJLIL.getValue())) {
            return false;
        }
        View view = (View) this.LLL.getValue();
        FriendsV3DetailBridgeAbility friendsV3DetailBridgeAbility = (FriendsV3DetailBridgeAbility) this.LLLFF.getValue();
        if (friendsV3DetailBridgeAbility != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            View viewKG2 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            InterfaceC1361270lWn interfaceC1361270lWn = (InterfaceC1361270lWn) obj;
            FriendsV3PlayerAbility friendsV3PlayerAbility = (FriendsV3PlayerAbility) this.LLJLILLLLZIIL.getValue();
            if (friendsV3PlayerAbility != null) {
                c1483410ohnXc = friendsV3PlayerAbility.xc();
            } else {
                c1483410ohnXc = null;
            }
            FriendsV3CellPlayHostAbility friendsV3CellPlayHostAbility = (FriendsV3CellPlayHostAbility) this.LLJLLL.getValue();
            if (friendsV3CellPlayHostAbility != null) {
                viewKG2 = friendsV3CellPlayHostAbility.kG2();
            }
            friendsV3DetailBridgeAbility.wz1(interfaceC1361270lWn, c1483410ohnXc, viewKG2, view, Intrinsics.LJFF(((C0SDJ) ((AssemViewModel) this.LLJLL.getValue()).getState()).LL, Boolean.TRUE), null, null, (InterfaceC1588310rQz) this.LLJZ.getValue());
            return true;
        }
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int iIntValue;
        ((RadiusLayout) this.LLLF.getValue()).setRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        RadiusLayout radiusLayout = (RadiusLayout) this.LLLF.getValue();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, view.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        radiusLayout.LIZIZ(iIntValue, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), 0, 0);
        IFriendsV3GestureHandleAbility iFriendsV3GestureHandleAbility = (IFriendsV3GestureHandleAbility) this.LLJLIL.getValue();
        if (iFriendsV3GestureHandleAbility != null) {
            iFriendsV3GestureHandleAbility.AY1(this);
        }
        C723830SaL.LIZ(this, null, new AwS590S0100000_11(this, 501));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(Object obj) {
        ((C725840Sda) this.LLJL.getValue()).LIZ(this, ((C0OB8) obj).getAweme());
    }

    @Override // X.InterfaceC705620Rm4
    public final boolean va(List<? extends Object> list) {
        int i = FriendsV3CommentAssem.LLJLLIL;
        return !C704790Rkj.LIZ(list);
    }
}
