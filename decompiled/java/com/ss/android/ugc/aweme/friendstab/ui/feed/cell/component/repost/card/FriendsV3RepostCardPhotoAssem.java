package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.repost.card;

import X.C01GW;
import X.C0N0Y;
import X.C0OB8;
import X.C0SDJ;
import X.C1308910kAL;
import X.C1386160mAw;
import X.C13LE;
import X.C1558520qew;
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
import X.InterfaceC1588320rR0;
import X.InterfaceC1608300rxE;
import X.InterfaceC665370Q7z;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellUISlotAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.IFriendsV3GestureHandleAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.FriendsV3CommentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.viewmodel.FriendsV3CellAreaViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3DetailBridgeAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3RepostCardAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class FriendsV3RepostCardPhotoAssem extends BaseFriendsV3CellUISlotAssem<FriendsV3RepostCardPhotoAssem, InterfaceC1361270lWn> implements InterfaceC1608300rxE, InterfaceC1588320rR0, FriendsV3RepostCardAbility {
    public final C630740Ooa LLJL = C628500Oky.LIZ(new AwS563S0100000_19(this, 1462));
    public final C630740Ooa LLJLIL = C628500Oky.LIZ(new AwS577S0100000_33(this, 2222));
    public final C630740Ooa LLJLILLLLZIIL = C628500Oky.LIZ(new AwS577S0100000_33(this, 2224));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2221));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2226));
    public final C630740Ooa LLJLLL = C628500Oky.LIZ(new AwS577S0100000_33(this, 2220));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2219));
    public final C01GW LLJZIJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(FriendsV3CellAreaViewModel.class), AFwS279S0000000_33.get$arr$(139));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2218));
    public final C630740Ooa LLLF = C628500Oky.LIZ(new AwS563S0100000_19(this, 1461));
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2225));

    @Override // X.InterfaceC1588320rR0
    public final void LLJ(int i) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cbe;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C705700RmC.LIZ(this, R.layout.cbe, new AwS577S0100000_33(this, 2223));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLLF.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, FriendsV3RepostCardAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3RepostCardAbility
    public final View j82() {
        return (View) this.LLJLLIL.getValue();
    }

    @Override // X.InterfaceC1588320rR0
    public final View findViewByPosition(int i) {
        return (View) this.LLJLL.getValue();
    }

    @Override // X.InterfaceC1608300rxE
    public final boolean o5(MotionEvent motionEvent) {
        Object obj;
        if (motionEvent == null || !C1386160mAw.LIZLLL(motionEvent, (View) this.LLJLLIL.getValue()) || C1386160mAw.LIZLLL(motionEvent, (View) this.LLJZ.getValue())) {
            return false;
        }
        View view = (View) this.LLJLL.getValue();
        FriendsV3DetailBridgeAbility friendsV3DetailBridgeAbility = (FriendsV3DetailBridgeAbility) this.LLJL.getValue();
        if (friendsV3DetailBridgeAbility != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            friendsV3DetailBridgeAbility.wz1((InterfaceC1361270lWn) obj, (C0N0Y) this.LLJLILLLLZIIL.getValue(), null, view, Intrinsics.LJFF(((C0SDJ) ((AssemViewModel) this.LLJZIJLIL.getValue()).getState()).LL, Boolean.TRUE), 0, this, (InterfaceC1588310rQz) this.LLJLLL.getValue());
            return true;
        }
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int iIntValue;
        ((RadiusLayout) this.LLLFF.getValue()).setRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        RadiusLayout radiusLayout = (RadiusLayout) this.LLLFF.getValue();
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
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLLF.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, FriendsV3RepostCardAbility.class, null, null);
        }
        C723830SaL.LIZ(this, null, new AwS590S0100000_11(this, 500));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        ((C725840Sda) this.LLL.getValue()).LIZ(this, ((C0OB8) obj).getAweme());
    }

    @Override // X.InterfaceC705620Rm4
    public final boolean va(List<? extends Object> list) {
        int i = FriendsV3CommentAssem.LLJLLIL;
        return !C704790Rkj.LIZ(list);
    }
}
