package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.video;

import X.C019F;
import X.C01GW;
import X.C03DO;
import X.C098200Yq;
import X.C0AI6;
import X.C0AIN;
import X.C0OB8;
import X.C0SDJ;
import X.C0W17;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1361240lWk;
import X.C1386160mAw;
import X.C13IQ;
import X.C13LE;
import X.C1480430ocz;
import X.C1481290oeN;
import X.C1482640ogY;
import X.C1483410ohn;
import X.C1486080om6;
import X.C1558520qew;
import X.C1588330rR1;
import X.C1602160rnK;
import X.C1637806bA;
import X.C189200o6;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C278200AvK;
import X.C278540Avs;
import X.C278600Avy;
import X.C418440Gaw;
import X.C425050Glb;
import X.C438710HIf;
import X.C444960Hcc;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C704790Rkj;
import X.C705700RmC;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C725850Sdb;
import X.C725880Sde;
import X.C725890Sdf;
import X.C729510SjV;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1361270lWn;
import X.InterfaceC1588310rQz;
import X.InterfaceC1608300rxE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC427850Gq7;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS135S0200000_33;
import Y.ARunnableS116S0100000_16;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.friendstab.detail.FriendsV3CellDetailNavigateAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3SharedElementSourceAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellUISlotAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.IFriendsV3GestureHandleAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.FriendsV3CommentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.view.FriendsV3TagBarLayout;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.viewmodel.FriendsV3CellAreaViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3DetailBridgeAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3PlayerAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3PageViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AFwS321S0000000_33;
import kotlin.jvm.internal.AFwS356S0000000_33;
import kotlin.jvm.internal.AwS107S1200000_24;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class FriendsV3VideoAssem extends BaseFriendsV3CellUISlotAssem<FriendsV3VideoAssem, InterfaceC1361270lWn> implements FriendsV3CellPlayHostAbility, FriendsV3CellDetailNavigateAbility, FriendsV3RepostAbility, FriendsV3SharedElementSourceAbility, InterfaceC1608300rxE {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLJIL;
    public C1482640ogY LLLFFI;
    public C725850Sdb LLLFZ;
    public View LLLI;
    public final AssemVMLazy LLLILZ;
    public final C01GW LLLILZJ;
    public final C01GW LLLILZLLLI;
    public final C630740Ooa LLLIZZ;
    public final C01GW LLLJ;
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 301));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 303));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2270));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2268));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 302));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 304));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 298));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 299));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2266));
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2264));
    public int LLLII = -1;
    public int LLLIIII = -1;
    public final C1486080om6 LLLIIIIL = new C1486080om6();
    public final C630740Ooa LLLIIIL = C628500Oky.LIZ(new AwS563S0100000_19(this, 1469));
    public final C630740Ooa LLLIIL = C628500Oky.LIZ(new AwS577S0100000_33(this, 2273));
    public final C630740Ooa LLLIILIL = C628500Oky.LIZ(new AwS577S0100000_33(this, 2269));
    public final C630740Ooa LLLIL = C628500Oky.LIZ(new AwS577S0100000_33(this, 2267));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3VideoAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3PageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FriendsV3VideoAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsV3PageViewModel.class);
        this.LLLILZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 305), AFwS279S0000000_33.get$arr$(152), null, true);
        this.LLLILZJ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS279S0000000_33.get$arr$(153));
        this.LLLILZLLLI = C737910Sx3.LIZJ(this, C13LE.LIZ(FriendsV3CellAreaViewModel.class), AFwS279S0000000_33.get$arr$(151));
        this.LLLIZZ = C628500Oky.LIZ(new AwS563S0100000_19(this, 1470));
        this.LLLJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2265));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cc0;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final FriendsV3PlayerAbility Ap() {
        return (FriendsV3PlayerAbility) this.LLLIIL.getValue();
    }

    public final RadiusLayout Bp() {
        return (RadiusLayout) this.LLLFF.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C705700RmC.LIZ(this, R.layout.cc0, new AwS577S0100000_33(this, 2271));
    }

    public final FrameLayout Ep() {
        return (FrameLayout) this.LLJL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility
    public final FrameLayout M4() {
        return (FrameLayout) this.LLJLLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility
    public final void bk() {
        try {
            C724270Sb3 c724270Sb3 = this.LLJI;
            Video video = ((InterfaceC1361270lWn) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getVideo();
            if (video != null) {
                Integer numValueOf = Integer.valueOf(video.getWidth());
                if (numValueOf.intValue() > 0) {
                    int iIntValue = numValueOf.intValue();
                    Integer numValueOf2 = Integer.valueOf(video.getHeight());
                    if (numValueOf2.intValue() > 0) {
                        int iIntValue2 = numValueOf2.intValue();
                        C1482640ogY c1482640ogY = this.LLLFFI;
                        C425050Glb.LJ(getContentView().getContext(), c1482640ogY != null ? c1482640ogY.getView() : null, iIntValue, iIntValue2, 3);
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLLIIIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, FriendsV3CellPlayHostAbility.class, null);
            C1558520qew.LJIIJJI(interfaceC665370Q7z, FriendsV3CellDetailNavigateAbility.class, null);
            C1558520qew.LJIIJJI(interfaceC665370Q7z, FriendsV3RepostAbility.class, null);
            C1558520qew.LJIIJJI(interfaceC665370Q7z, FriendsV3SharedElementSourceAbility.class, null);
        }
        IFriendsV3GestureHandleAbility iFriendsV3GestureHandleAbility = (IFriendsV3GestureHandleAbility) this.LLLIILIL.getValue();
        if (iFriendsV3GestureHandleAbility != null) {
            iFriendsV3GestureHandleAbility.jx1(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility
    public final Surface getSurface() {
        C1482640ogY c1482640ogY = this.LLLFFI;
        if (c1482640ogY != null) {
            return c1482640ogY.getSurface();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility
    public final View kG2() {
        C1482640ogY c1482640ogY = this.LLLFFI;
        if (c1482640ogY != null) {
            return c1482640ogY.getView();
        }
        return null;
    }

    public final void sp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        Video video = ((C0OB8) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getVideo();
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(video != null ? video.getCover() : null));
        c1331670kl3LJIIIIZZ.LJJIJL(getContext());
        c1331670kl3LJIIIIZZ.LJJ(zp());
        c1331670kl3LJIIIIZZ.LIZLLL = true;
        c1331670kl3LJIIIIZZ.LJIIL((InterfaceC427850Gq7) this.LLLJ.getValue());
    }

    public final FrameLayout up() {
        return (FrameLayout) this.LLJLLL.getValue();
    }

    public final RadiusLayout yp() {
        return (RadiusLayout) this.LLJLL.getValue();
    }

    public final SmartImageView zp() {
        return (SmartImageView) this.LLJLILLLLZIIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility
    public final boolean E6() {
        if (up().getVisibility() != 0) {
            return false;
        }
        up().performClick();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.detail.FriendsV3CellDetailNavigateAbility
    public final void SH1() {
        C1482640ogY c1482640ogY;
        if (up().getVisibility() == 0) {
            up().performClick();
            return;
        }
        boolean zLJFF = Intrinsics.LJFF(((C0SDJ) ((AssemViewModel) this.LLLILZLLLI.getValue()).getState()).LL, Boolean.TRUE);
        View view = (!zLJFF || (c1482640ogY = this.LLLFFI) == null) ? null : c1482640ogY.getView();
        FriendsV3PlayerAbility friendsV3PlayerAbilityAp = Ap();
        C1483410ohn c1483410ohnXc = friendsV3PlayerAbilityAp != null ? friendsV3PlayerAbilityAp.xc() : null;
        FriendsV3DetailBridgeAbility friendsV3DetailBridgeAbility = (FriendsV3DetailBridgeAbility) this.LLLIZZ.getValue();
        if (friendsV3DetailBridgeAbility != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            friendsV3DetailBridgeAbility.wz1((InterfaceC1361270lWn) (c724270Sb3 != null ? c724270Sb3.LL : null), c1483410ohnXc, view, yp(), zLJFF, null, null, (InterfaceC1588310rQz) this.LLLIL.getValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3SharedElementSourceAbility
    public final View W8() {
        if (bp()) {
            return yp();
        }
        return null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLLIIIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, FriendsV3CellPlayHostAbility.class, null, null);
            C1558520qew.LJII(interfaceC665370Q7z, this, FriendsV3CellDetailNavigateAbility.class, null, null);
            C1558520qew.LJII(interfaceC665370Q7z, this, FriendsV3RepostAbility.class, null, null);
            C1558520qew.LJII(interfaceC665370Q7z, this, FriendsV3SharedElementSourceAbility.class, null, null);
        }
    }

    public final void Fp(String str) {
        Object obj;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (!Intrinsics.LJFF(str, ((C0OB8) obj).getAweme().getAid())) {
            return;
        }
        if (((Boolean) C278200AvK.LIZ.getValue()).booleanValue()) {
            HandlerHook.viewPost(zp(), new ARunnableS116S0100000_16(this, 57));
            HandlerHook.viewPost(up(), new ARunnableS116S0100000_16(this, 58));
        } else {
            C786410Ut5.LJLLLLLL(8, zp());
            C786410Ut5.LJLLLLLL(8, up());
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility
    public final void Hh(final AwS107S1200000_24 awS107S1200000_24) {
        SurfaceView surfaceView;
        final SurfaceHolder holder;
        C1482640ogY c1482640ogY = this.LLLFFI;
        if (c1482640ogY == null) {
            return;
        }
        Surface surface = c1482640ogY.getSurface();
        if (surface != null && surface.isValid()) {
            awS107S1200000_24.invoke(surface);
            return;
        }
        View view = c1482640ogY.getView();
        if (!(view instanceof SurfaceView) || (surfaceView = (SurfaceView) view) == null || (holder = surfaceView.getHolder()) == null) {
            return;
        }
        holder.addCallback(new SurfaceHolder.Callback() { // from class: X.0orX
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                holder.removeCallback(this);
                Surface surface2 = surfaceHolder.getSurface();
                if (surface2 != null && surface2.isValid()) {
                    awS107S1200000_24.invoke(surface2);
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                holder.removeCallback(this);
            }
        });
    }

    @Override // X.InterfaceC1608300rxE
    public final boolean o5(MotionEvent motionEvent) {
        if (motionEvent == null || !C1386160mAw.LIZLLL(motionEvent, yp())) {
            return false;
        }
        SH1();
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int iIntValue;
        yp().setRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        RadiusLayout radiusLayoutYp = yp();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, view.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        radiusLayoutYp.LIZIZ(iIntValue, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))), 0, 0);
        ((RadiusLayout) this.LLLF.getValue()).setRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        Bp().LIZ(0.0f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), 0.0f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        C1386160mAw.LIZ(Bp());
        this.LLLFFI = C1482640ogY.LJI((ViewGroup) this.LLJLLIL.getValue(), false, false);
        C1486080om6 c1486080om6 = this.LLLIIIIL;
        c1486080om6.LIZ = (ViewGroup) this.LLJLLIL.getValue();
        c1486080om6.LIZ();
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLILZJ.getValue(), new C2217381BqS() { // from class: X.19vX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJ;
            }
        }, null, AFwS321S0000000_33.get$arr$(27), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLILZJ.getValue(), new C2217381BqS() { // from class: X.19vZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJILLL;
            }
        }, null, AFwS321S0000000_33.get$arr$(28), 6);
        C736680Sv4.LJIIIZ(this, (AssemViewModel) this.LLLILZLLLI.getValue(), new C2217381BqS() { // from class: X.19vV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0SDJ) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.19rW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0SDJ) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), AFwS356S0000000_33.get$arr$(2), 8);
        if (C278600Avy.LIZ()) {
            View viewLIZ = C03DO.LIZ(Ep(), null);
            C786410Ut5.LJLLLLLL(8, viewLIZ);
            this.LLLI = viewLIZ;
            Ep().addView(this.LLLI);
        }
        IFriendsV3GestureHandleAbility iFriendsV3GestureHandleAbility = (IFriendsV3GestureHandleAbility) this.LLLIILIL.getValue();
        if (iFriendsV3GestureHandleAbility != null) {
            iFriendsV3GestureHandleAbility.AY1(this);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(Object obj) {
        Object obj2;
        Object obj3;
        int i;
        long totalCount;
        UserStory userStory;
        Object obj4;
        Object obj5;
        C0OB8 c0ob8 = (C0OB8) obj;
        int i2 = 8;
        if (C278600Avy.LIZ()) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj5 = c724270Sb3.LL;
            } else {
                obj5 = null;
            }
            if (obj5 instanceof C1361240lWk) {
                C725890Sdf.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)), (View) this.LLJLIL.getValue());
                View view = this.LLLI;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
            } else {
                C725890Sdf.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68)), (View) this.LLJLIL.getValue());
                View view2 = this.LLLI;
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(8, view2);
                }
            }
        } else {
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            if (obj2 instanceof C1361240lWk) {
                C725890Sdf.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)), (View) this.LLJLIL.getValue());
                if (Ep().findViewWithTag("repost_line_tag") == null) {
                    Ep().addView(C03DO.LIZ(Ep(), null));
                }
            } else {
                C725890Sdf.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68)), (View) this.LLJLIL.getValue());
                View viewFindViewWithTag = Ep().findViewWithTag("repost_line_tag");
                if (viewFindViewWithTag != null) {
                    C786410Ut5.LJJJZ(viewFindViewWithTag, Ep());
                }
            }
        }
        C786410Ut5.LJLLLLLL(0, zp());
        try {
            C724270Sb3 c724270Sb33 = this.LLJI;
            if (c724270Sb33 != null) {
                obj4 = c724270Sb33.LL;
            } else {
                obj4 = null;
            }
            Video video = ((InterfaceC1361270lWn) obj4).getAweme().getVideo();
            if (video != null) {
                Integer numValueOf = Integer.valueOf(video.getWidth());
                if (numValueOf.intValue() > 0) {
                    int iIntValue = numValueOf.intValue();
                    Integer numValueOf2 = Integer.valueOf(video.getHeight());
                    if (numValueOf2.intValue() > 0) {
                        Gp(iIntValue, numValueOf2.intValue());
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        sp();
        C724270Sb3 c724270Sb34 = this.LLJI;
        if (c724270Sb34 != null) {
            obj3 = c724270Sb34.LL;
        } else {
            obj3 = null;
        }
        boolean z = obj3 instanceof C1361240lWk;
        Aweme aweme = c0ob8.getAweme();
        if (((Boolean) C278540Avs.LIZ.getValue()).booleanValue()) {
            if (!z) {
                C725850Sdb c725850Sdb = this.LLLFZ;
                if (c725850Sdb != null) {
                    int visibility = c725850Sdb.getVisibility();
                    c725850Sdb.setVisibility(8);
                    C1602160rnK.LIZIZ(visibility, 8, c725850Sdb);
                }
            } else {
                C725850Sdb c725850Sdb2 = this.LLLFZ;
                if (c725850Sdb2 == null) {
                    C725850Sdb c725850Sdb3 = new C725850Sdb(getContentView().getContext());
                    c725850Sdb3.LIZ(this, aweme);
                    this.LLLFZ = c725850Sdb3;
                    yp().addView(this.LLLFZ);
                } else {
                    int visibility2 = c725850Sdb2.getVisibility();
                    c725850Sdb2.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility2, 0, c725850Sdb2);
                    c725850Sdb2.LIZ(this, aweme);
                }
            }
        } else if (!z) {
            C725850Sdb c725850Sdb4 = this.LLLFZ;
            if (c725850Sdb4 != null) {
                RadiusLayout radiusLayoutYp = yp();
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(radiusLayoutYp, c725850Sdb4);
                radiusLayoutYp.removeView(c725850Sdb4);
                this.LLLFZ = null;
            }
        } else {
            C725850Sdb c725850Sdb5 = this.LLLFZ;
            if (c725850Sdb5 == null) {
                C725850Sdb c725850Sdb6 = new C725850Sdb(getContentView().getContext());
                c725850Sdb6.LIZ(this, aweme);
                this.LLLFZ = c725850Sdb6;
                yp().addView(this.LLLFZ);
            } else {
                c725850Sdb5.LIZ(this, aweme);
            }
        }
        View view3 = (View) this.LLLF.getValue();
        if (C729510SjV.LJJIJIL(c0ob8.getAweme())) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view3);
        Aweme awemeLIZIZ = C1588330rR1.LIZIZ(c0ob8.getAweme().getAid());
        if (awemeLIZIZ != null && (userStory = awemeLIZIZ.getUserStory()) != null) {
            totalCount = userStory.getTotalCount();
        } else {
            totalCount = 0;
        }
        RadiusLayout radiusLayoutBp = Bp();
        if (totalCount > 1) {
            i2 = 0;
        }
        C786410Ut5.LJLLLLLL(i2, radiusLayoutBp);
    }

    public final void tp(Function0<Unit> function0) {
        C786410Ut5.LJLLLLLL(0, up());
        C786410Ut5.LJLLLLLL(0, (View) this.LLJZ.getValue());
        C786410Ut5.LJLLLLLL(8, (View) this.LLJZIJLIL.getValue());
        C786410Ut5.O7(up(), new ACListenerS135S0200000_33(this, function0, 3));
    }

    @Override // X.InterfaceC705620Rm4
    public final boolean va(List<? extends Object> list) {
        int i = FriendsV3CommentAssem.LLJLLIL;
        return !C704790Rkj.LIZ(list);
    }

    public final void Gp(int i, int i2) {
        Object obj;
        int i3;
        int i4;
        Pair pair;
        float f = i;
        int i5 = 1;
        if (i2 < 1) {
            i2 = 1;
        }
        float f2 = f / i2;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (obj instanceof C1361240lWk) {
            i3 = 80;
        } else {
            i3 = 68;
        }
        double d = f2;
        if (d <= 1.0d) {
            i4 = 77;
        } else {
            i4 = 16;
        }
        int iLIZLLL = C418440Gaw.LIZLLL(getContentView().getContext()) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i4))));
        if (d < 1.0d) {
            pair = new Pair(Integer.valueOf(iLIZLLL), Integer.valueOf((iLIZLLL * 4) / 3));
        } else if (f2 == 1.0f) {
            pair = new Pair(Integer.valueOf(iLIZLLL), Integer.valueOf(iLIZLLL));
        } else {
            pair = new Pair(Integer.valueOf(iLIZLLL), Integer.valueOf((int) (iLIZLLL / f2)));
        }
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        if (((Boolean) C0AIN.LIZ.getValue()).booleanValue()) {
            if (iIntValue == this.LLLII && iIntValue2 == this.LLLIIII) {
                return;
            }
            this.LLLII = iIntValue;
            this.LLLIIII = iIntValue2;
        }
        View view = (View) this.LLJLLIL.getValue();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = iIntValue;
        layoutParams.height = iIntValue2;
        C786410Ut5.W5(view, layoutParams);
        RadiusLayout radiusLayoutYp = yp();
        ViewGroup.LayoutParams layoutParams2 = radiusLayoutYp.getLayoutParams();
        layoutParams2.width = iIntValue;
        layoutParams2.height = iIntValue2;
        C786410Ut5.W5(radiusLayoutYp, layoutParams2);
        SmartImageView smartImageViewZp = zp();
        ViewGroup.LayoutParams layoutParams3 = smartImageViewZp.getLayoutParams();
        layoutParams3.width = iIntValue;
        layoutParams3.height = iIntValue2;
        C786410Ut5.W5(smartImageViewZp, layoutParams3);
        RadiusLayout radiusLayoutBp = Bp();
        ViewGroup.LayoutParams layoutParams4 = Bp().getLayoutParams();
        layoutParams4.height = (int) (iIntValue2 * 0.9f);
        C786410Ut5.b7(radiusLayoutBp, layoutParams4);
        if (C444960Hcc.LIZIZ()) {
            i5 = -1;
        }
        RadiusLayout radiusLayoutBp2 = Bp();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(radiusLayoutBp2);
        radiusLayoutBp2.setTranslationX(i5 * iIntValue);
        C786410Ut5.yd(Bp(), (iIntValue2 - r4) / 2.0f);
        if (!((Boolean) C0AI6.LIZ.getValue()).booleanValue() && C725880Sde.LIZIZ()) {
            ((FriendsV3TagBarLayout) this.LLL.getValue()).setMaxBarWidth(iIntValue);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility
    public final void onPlaying(String str, C1480430ocz c1480430ocz) {
        Fp(str);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility
    public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
        Object obj;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (!Intrinsics.LJFF(((C0OB8) obj).getAweme().getAid(), str)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("displayRetry, onPlayFailed, sourceId=");
        sbLIZ.append(str);
        sbLIZ.append(", error=");
        sbLIZ.append(c1481290oeN);
        sbLIZ.append(", playerEvent=");
        sbLIZ.append(c1480430ocz);
        C0W17.LIZ("FriendsV3VideoAssem", C2188811AlT.LIZIZ(sbLIZ));
        tp(new AwS577S0100000_33(this, 2272));
    }
}
