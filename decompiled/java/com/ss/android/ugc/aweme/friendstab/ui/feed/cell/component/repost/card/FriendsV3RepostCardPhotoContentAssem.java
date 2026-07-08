package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.repost.card;

import X.C01GW;
import X.C0I7Z;
import X.C0N0Y;
import X.C0OB8;
import X.C0S7E;
import X.C0SDJ;
import X.C1386160mAw;
import X.C13BV;
import X.C13LE;
import X.C13LQ;
import X.C1480430ocz;
import X.C1481290oeN;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1845507Kr;
import X.C1888107aR;
import X.C19364010pK;
import X.C1954807lC;
import X.C21696019va;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C704790Rkj;
import X.C705700RmC;
import X.C714800S2c;
import X.C720360SNm;
import X.C724270Sb3;
import X.C725890Sdf;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC19363910pJ;
import X.EnumC452301pR;
import X.EnumC714830S2f;
import X.InterfaceC1361270lWn;
import X.InterfaceC1588310rQz;
import X.InterfaceC1588320rR0;
import X.InterfaceC1608300rxE;
import X.InterfaceC665370Q7z;
import Y.ATListenerS465S0100000_33;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.friendstab.detail.FriendsV3CellDetailNavigateAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3SharedElementSourceAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellUISlotAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.IFriendsV3GestureHandleAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.FriendsV3CommentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.viewmodel.FriendsV3CellAreaViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3DetailBridgeAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AFwS321S0000000_33;
import kotlin.jvm.internal.AwS107S1200000_24;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class FriendsV3RepostCardPhotoContentAssem extends BaseFriendsV3CellUISlotAssem<FriendsV3RepostCardPhotoContentAssem, InterfaceC1361270lWn> implements FriendsV3CellPlayHostAbility, FriendsV3CellDetailNavigateAbility, FriendsV3SharedElementSourceAbility, FriendsV3ViewStateProtocol, InterfaceC1608300rxE, InterfaceC1588320rR0 {
    public static final /* synthetic */ int LLLILZ = 0;
    public boolean LLJLLL;
    public float LLJZ;
    public float LLJZIJLIL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public boolean LLLFZ;
    public long LLLI;
    public boolean LLLII;
    public boolean LLLIIII;
    public final C630740Ooa LLLIIIIL;
    public final C630740Ooa LLLIIIL;
    public final C630740Ooa LLLIIL;
    public final C630740Ooa LLLIILIL;
    public final C630740Ooa LLLIL;
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2237));
    public final C630740Ooa LLJLIL = C628500Oky.LIZ(new AwS563S0100000_19(this, 1463));
    public final C630740Ooa LLJLILLLLZIIL = C628500Oky.LIZ(new AwS577S0100000_33(this, 2235));
    public final C630740Ooa LLJLL = C628500Oky.LIZ(new AwS577S0100000_33(this, 2228));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1465));
    public final C01GW LLL = C737910Sx3.LIZJ(this, C13LE.LIZ(FriendsV3CellAreaViewModel.class), AFwS279S0000000_33.get$arr$(140));

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility
    public final boolean E6() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility
    public final void Hh(AwS107S1200000_24 awS107S1200000_24) {
    }

    @Override // X.InterfaceC1588320rR0
    public final void LLJ(int i) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cbi;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.detail.FriendsV3CellDetailNavigateAbility
    public final void SH1() {
        Pair pair = new Pair(0, this.LLLF.getValue());
        up(((Number) pair.getFirst()).intValue(), (View) pair.getSecond());
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3SharedElementSourceAbility
    public final View W8() {
        return findViewByPosition(0);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility
    public final void bk() {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility
    public final Surface getSurface() {
        return null;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility
    public final View kG2() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility
    public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility
    public final void onPlaying(String str, C1480430ocz c1480430ocz) {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol
    public final List<View> AG0() {
        return Collections.singletonList(this.LLLFFI.getValue());
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C705700RmC.LIZ(this, R.layout.cbi, new AwS577S0100000_33(this, 2231));
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility
    public final FrameLayout M4() {
        return (FrameLayout) this.LLLFFI.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJLIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, FriendsV3CellPlayHostAbility.class, null);
            C1558520qew.LJIIJJI(interfaceC665370Q7z, FriendsV3CellDetailNavigateAbility.class, null);
            C1558520qew.LJIIJJI(interfaceC665370Q7z, FriendsV3SharedElementSourceAbility.class, null);
        }
        InterfaceC665370Q7z interfaceC665370Q7z2 = (InterfaceC665370Q7z) this.LLJLIL.getValue();
        if (interfaceC665370Q7z2 != null) {
            C1554610qYd.LIZLLL(interfaceC665370Q7z2, FriendsV3ViewStateProtocol.class, this);
        }
    }

    public final List<PhotoModeImage> sp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        PhotoModeImageInfo photoModeImageInfo = ((C0OB8) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getPhotoModeImageInfo();
        if (photoModeImageInfo != null) {
            return C720360SNm.LIZLLL(photoModeImageInfo);
        }
        return null;
    }

    public final C21696019va tp() {
        return (C21696019va) this.LLLFF.getValue();
    }

    public FriendsV3RepostCardPhotoContentAssem() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLLF = C452501pT.LIZ(enumC452301pR, new AwS577S0100000_33(this, 2229));
        this.LLLFF = C452501pT.LIZ(enumC452301pR, new AwS577S0100000_33(this, 2236));
        this.LLLFFI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2232));
        this.LLLIIIIL = C628500Oky.LIZ(new AwS577S0100000_33(this, 2227));
        this.LLLIIIL = C628500Oky.LIZ(new AwS577S0100000_33(this, 2230));
        this.LLLIIL = C628500Oky.LIZ(new AwS563S0100000_19(this, 1464));
        this.LLLIILIL = C628500Oky.LIZ(new AwS577S0100000_33(this, 2234));
        this.LLLIL = C628500Oky.LIZ(new AwS577S0100000_33(this, 2233));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJLIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1554610qYd.LIZJ(interfaceC665370Q7z, FriendsV3ViewStateProtocol.class, C1697810uHb.LJIILJJIL(this));
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJLIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, FriendsV3CellPlayHostAbility.class, null, null);
            C1558520qew.LJII(interfaceC665370Q7z, this, FriendsV3SharedElementSourceAbility.class, null, null);
        }
    }

    @Override // X.InterfaceC1588320rR0
    public final View findViewByPosition(int i) {
        if (i == 1) {
            return tp();
        }
        return (View) this.LLLF.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1608300rxE
    public final boolean o5(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldHandleSingleTap, x:");
        sbLIZ.append(motionEvent.getRawX());
        sbLIZ.append(",y:");
        sbLIZ.append(motionEvent.getRawY());
        C2188811AlT.LIZIZ(sbLIZ);
        int i = 0;
        for (View view : (ArrayList) C13LQ.LJIJI(new C21696019va[]{this.LLLF.getValue(), tp()})) {
            int i2 = i + 1;
            if (C1386160mAw.LIZLLL(motionEvent, view)) {
                up(i, view);
                return true;
            }
            i = i2;
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJLIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, FriendsV3CellDetailNavigateAbility.class, null, null);
        }
        IFriendsV3GestureHandleAbility iFriendsV3GestureHandleAbility = (IFriendsV3GestureHandleAbility) this.LLLIIIL.getValue();
        if (iFriendsV3GestureHandleAbility != null) {
            iFriendsV3GestureHandleAbility.AY1(this);
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLL.getValue(), new C2217381BqS() { // from class: X.19vQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0SDJ) obj).LL;
            }
        }, C736820SvI.LIZLLL(), AFwS321S0000000_33.get$arr$(24), 4);
        ((View) this.LLLFFI.getValue()).setOnTouchListener(new ATListenerS465S0100000_33(this, 3));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(Object obj) {
        Object obj2;
        EnumC19363910pJ enumC19363910pJ;
        boolean z;
        int size;
        List<PhotoModeImage> listSp;
        int i;
        C0OB8 c0ob8 = (C0OB8) obj;
        this.LLLIIII = false;
        this.LLLII = false;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj2 = c724270Sb3.LL;
        } else {
            obj2 = null;
        }
        C1845507Kr.LIZ.remove(((C0OB8) obj2).getAweme().getAid());
        if (C0S7E.LIZ(c0ob8.getAweme()) == 1) {
            enumC19363910pJ = EnumC19363910pJ.SINGLE_PHOTO;
        } else {
            enumC19363910pJ = EnumC19363910pJ.MULTI_PHOTO;
        }
        C21696019va c21696019vaTp = tp();
        if (enumC19363910pJ == EnumC19363910pJ.MULTI_PHOTO) {
            z = true;
        } else {
            z = false;
        }
        C725890Sdf.LIZIZ(c21696019vaTp, z);
        List<PhotoModeImage> listSp2 = sp();
        if (listSp2 == null) {
            listSp2 = C13BV.INSTANCE;
        }
        if (listSp2.isEmpty()) {
            C786410Ut5.c0((C21696019va) this.LLLF.getValue(), 8);
            C786410Ut5.c0(tp(), 8);
        } else {
            PhotoModeImage photoModeImage = (PhotoModeImage) ListProtector.get(listSp2, 0);
            Float f = photoModeImage.aspectRatio;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(237));
            if (f != null) {
                int i2 = C19364010pK.LIZ[enumC19363910pJ.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        iLIZIZ = C714800S2c.LIZLLL();
                    } else {
                        throw new C1954807lC();
                    }
                } else if (f.floatValue() > 1.0f) {
                    iLIZIZ = C714800S2c.LIZJ();
                } else {
                    iLIZIZ = C714800S2c.LIZLLL();
                }
            }
            int iIntValue = ((Number) C714800S2c.LIZIZ(photoModeImage.aspectRatio, iLIZIZ, EnumC714830S2f.FIX_WIDTH).getSecond()).intValue();
            C21696019va c21696019va = (C21696019va) this.LLLF.getValue();
            C786410Ut5.c0(c21696019va, 0);
            Pair pair = new Pair(Integer.valueOf(iLIZIZ), Integer.valueOf(iIntValue));
            Aweme aweme = c0ob8.getAweme();
            ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
            if (!C720360SNm.LJIIL(c0ob8.getAweme()) && (listSp = sp()) != null) {
                size = listSp.size();
            } else {
                size = 0;
            }
            C21696019va.LIZJ(c21696019va, photoModeImage, 0, pair, aweme, scaleType, false, this, true, size, false, true, 512);
            c21696019va.setTransitionName(C1888107aR.LIZIZ(0, c0ob8.getAweme().getAid()));
            if (listSp2.size() > 1) {
                PhotoModeImage photoModeImage2 = (PhotoModeImage) ListProtector.get(listSp2, 1);
                int iIntValue2 = ((Number) C714800S2c.LIZIZ(photoModeImage2.aspectRatio, iIntValue, EnumC714830S2f.FIX_HEIGHT).getFirst()).intValue();
                C21696019va c21696019vaTp2 = tp();
                C786410Ut5.c0(c21696019vaTp2, 0);
                C21696019va.LIZJ(c21696019vaTp2, photoModeImage2, 1, new Pair(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue)), c0ob8.getAweme(), ImageView.ScaleType.FIT_CENTER, false, this, false, 0, true, false, 1408);
                c21696019vaTp2.setTransitionName(C1888107aR.LIZIZ(1, c0ob8.getAweme().getAid()));
            } else {
                C786410Ut5.c0(tp(), 8);
            }
        }
        View view = (View) this.LLLFFI.getValue();
        String desc = c0ob8.getAweme().getDesc();
        if (desc != null && desc.length() != 0) {
            i = 6;
        } else {
            i = 10;
        }
        C0I7Z.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))), view);
    }

    @Override // X.InterfaceC705620Rm4
    public final boolean va(List<? extends Object> list) {
        int i = FriendsV3CommentAssem.LLJLLIL;
        return !C704790Rkj.LIZ(list);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol
    public final void EK2(View view, boolean z) {
        if (z) {
            this.LLLI = System.currentTimeMillis();
        }
    }

    public final void up(int i, View view) {
        Object obj;
        FriendsV3DetailBridgeAbility friendsV3DetailBridgeAbility = (FriendsV3DetailBridgeAbility) this.LLLIIL.getValue();
        if (friendsV3DetailBridgeAbility != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            friendsV3DetailBridgeAbility.wz1((InterfaceC1361270lWn) obj, (C0N0Y) this.LLLIILIL.getValue(), null, view, Intrinsics.LJFF(((C0SDJ) ((AssemViewModel) this.LLL.getValue()).getState()).LL, Boolean.TRUE), Integer.valueOf(i), this, (InterfaceC1588310rQz) this.LLJLL.getValue());
        }
    }
}
