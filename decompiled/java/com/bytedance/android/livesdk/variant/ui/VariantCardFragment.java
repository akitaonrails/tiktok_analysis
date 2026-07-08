package com.bytedance.android.livesdk.variant.ui;

import X.AbstractC1143290frD;
import X.AbstractC463340IEy;
import X.C01GW;
import X.C098200Yq;
import X.C09JN;
import X.C0IEG;
import X.C0IES;
import X.C0IF8;
import X.C0IFB;
import X.C0IFX;
import X.C0IGD;
import X.C0IGR;
import X.C0IHD;
import X.C0II0;
import X.C0IID;
import X.C0IIQ;
import X.C0IIR;
import X.C0IJT;
import X.C0IKG;
import X.C0IL2;
import X.C0IRE;
import X.C1143300frE;
import X.C11NJ;
import X.C128Y;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20441214yg;
import X.C21601619gM;
import X.C2188811AlT;
import X.C452501pT;
import X.C463900IHc;
import X.C464520IJm;
import X.C465900IOu;
import X.C467650IVn;
import X.C472280Ifa;
import X.C474500IjA;
import X.C521960KdW;
import X.C784440Upu;
import X.C786410Ut5;
import X.C827750WdZ;
import X.InterfaceC466370IQp;
import Y.AfS176S0100000_7;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.SwipeNextEvent;
import com.bytedance.android.livesdk.dataChannel.PIPStatusData;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.RecommendEndAtFollowingSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.widget.RecommendSwipeOptWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: loaded from: classes8.dex */
public final class VariantCardFragment extends BaseFragment implements InterfaceC466370IQp, C0IRE {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9HELIOSPiQ+IC49PGs5IGEFKTclKCEnCyQ+LQkhKSIhLCEn";
    public C0IFX LLILLL;
    public C0IGD LLILZLL;
    public DataChannel LLIZ;
    public EnterRoomConfig LLIZLLLIL;
    public Room LLJ;
    public Long LLJI;
    public C467650IVn LLJIJIL;
    public C0IIQ LLJILJIL;
    public boolean LLJILJILJ;
    public View LLJILLL;
    public View LLJJ;
    public AbstractC463340IEy LLJJI;
    public View LLJJIII;
    public RecommendSwipeOptWidget LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final C11NJ LL = new C11NJ();
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 106));
    public int LLILZ = -1;
    public C0IID LLILZIL = C0IID.IDLE;

    @Override // X.InterfaceC466370IQp
    public final /* synthetic */ void AJ(Object obj) {
    }

    @Override // X.C0IRE
    public final boolean Bb() {
        return false;
    }

    @Override // X.InterfaceC466370IQp
    public final /* synthetic */ void Be() {
    }

    @Override // X.C0IRE
    public final void Bu(boolean z) {
    }

    @Override // X.InterfaceC466370IQp
    public final boolean Dt() {
        return true;
    }

    @Override // X.InterfaceC466370IQp
    public final void EN(String str) {
    }

    @Override // X.C0IRE
    public final void Fa(boolean z) {
    }

    @Override // X.InterfaceC466370IQp
    public final boolean H5() {
        return true;
    }

    @Override // X.InterfaceC466370IQp
    public final void LJLLLL() {
    }

    @Override // X.InterfaceC466370IQp
    public final boolean O3() {
        return true;
    }

    @Override // X.InterfaceC466370IQp
    public final /* synthetic */ void Qb(String str) {
    }

    @Override // X.InterfaceC466370IQp
    public final void Rm() {
    }

    @Override // X.InterfaceC466370IQp
    public final /* synthetic */ Object XJ() {
        return null;
    }

    @Override // X.InterfaceC466370IQp
    public final void Ys() {
    }

    @Override // X.InterfaceC466370IQp
    public final boolean Za() {
        return false;
    }

    @Override // X.C0IRE
    public final void Zo(float f) {
    }

    @Override // X.C0IRE
    public final float aj() {
        return 0.0f;
    }

    @Override // X.InterfaceC466370IQp
    public final void cD(String str, boolean z) {
    }

    @Override // X.InterfaceC466370IQp
    public final void cancel() {
        this.LLJJIJIIJIL = false;
    }

    @Override // X.InterfaceC466370IQp
    public final void dl(Rect rect) {
    }

    @Override // X.InterfaceC466370IQp
    public final void e0() {
    }

    @Override // X.InterfaceC466370IQp
    public final void eE(LiveRoomFragment liveRoomFragment) {
    }

    @Override // X.InterfaceC466370IQp
    public final void ea() {
        this.LLJJIJIIJIL = true;
        AbstractC463340IEy abstractC463340IEy = this.LLJJI;
        if (abstractC463340IEy != null) {
            abstractC463340IEy.LJIIJ();
        }
    }

    @Override // X.InterfaceC466370IQp
    public final void fN() {
    }

    @Override // X.InterfaceC466370IQp
    public final void fO() {
    }

    @Override // X.InterfaceC466370IQp
    public final void fk() {
    }

    @Override // X.InterfaceC466370IQp
    public final void gc() {
    }

    @Override // X.InterfaceC466370IQp
    public final Fragment getFragment() {
        return this;
    }

    @Override // X.InterfaceC466370IQp
    public final String hx() {
        return null;
    }

    @Override // X.InterfaceC466370IQp
    public final void i9() {
    }

    @Override // X.InterfaceC466370IQp
    public final void jm() {
    }

    @Override // X.InterfaceC466370IQp
    public final void kb(C0IHD c0ihd) {
    }

    @Override // X.InterfaceC466370IQp
    public final void ki() {
    }

    @Override // X.InterfaceC466370IQp
    public final boolean lk() {
        return false;
    }

    @Override // X.InterfaceC466370IQp
    public final void n0(boolean z) {
    }

    @Override // X.InterfaceC466370IQp
    public final void pL(boolean z) {
    }

    @Override // X.InterfaceC466370IQp
    public final void pause() {
    }

    @Override // X.InterfaceC466370IQp
    public final void resume() {
    }

    @Override // X.InterfaceC466370IQp
    public final void vH() {
    }

    @Override // X.InterfaceC466370IQp
    public final void wA(C0IHD c0ihd) {
    }

    @Override // X.InterfaceC466370IQp
    public final void wD(int i) {
    }

    @Override // X.InterfaceC466370IQp
    public final void z7(Rect rect) {
    }

    @Override // X.InterfaceC466370IQp
    public final LiveWidget zb() {
        return null;
    }

    @Override // X.InterfaceC466370IQp
    public final void Eo() {
        this.LL.LJ();
        this.LLJILJILJ = false;
    }

    @Override // X.InterfaceC466370IQp
    public final void IP() {
        this.LL.LJ();
        this.LLJILJILJ = false;
        AbstractC463340IEy abstractC463340IEy = this.LLJJI;
        if (abstractC463340IEy != null) {
            abstractC463340IEy.LJIIJ();
        }
    }

    @Override // X.InterfaceC466370IQp
    public final void OB() {
        this.LLILZIL = C0IID.LIVE_STARTED;
        Room room = this.LLJ;
        if (room != null) {
            room.isShow = true;
        }
        this.LLJJIJIIJIL = false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startRoom -> roomId=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(", isVariant=true");
        C827750WdZ.LIZ("VariantCardFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLJILJILJ) {
            this.LL.LIZ(C784440Upu.LIZ().LIZLLL(this, C0IF8.class, new C521960KdW(this, 2)).LIZ(new AfS176S0100000_7(this, 100), new C09JN() { // from class: X.0IEx
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("VariantCardFragment@182a.startRoom$3");
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("JumpToOtherRoomEvent error: ");
                    sbLIZ2.append(obj);
                    C20441214yg.LJ("VariantCardFragment", C2188811AlT.LIZIZ(sbLIZ2));
                    C1C7U.LIZIZ("VariantCardFragment@182a.startRoom$3");
                }
            }));
            this.LLJILJILJ = true;
        }
        DataChannel dataChannel = this.LLIZ;
        if (dataChannel != null) {
            dataChannel.BQ2(this, SwipeNextEvent.class, new AwS586S0100000_7(this, 190));
        }
        C0IFX c0ifx = this.LLILLL;
        if (c0ifx != null) {
            c0ifx.T8(true);
        }
        C0IFX c0ifx2 = this.LLILLL;
        if (c0ifx2 != null) {
            c0ifx2.LJLL();
        }
    }

    @Override // X.InterfaceC466370IQp
    public final Long bg() {
        return 0L;
    }

    @Override // X.InterfaceC466370IQp
    public final long getRoomId() {
        Room room = this.LLJ;
        if (room != null) {
            return room.getId();
        }
        return 0L;
    }

    @Override // X.InterfaceC466370IQp
    public final void hC() {
        this.LLILZIL = C0IID.PREPARED;
        this.LL.LJ();
        this.LLJILJILJ = false;
        AbstractC463340IEy abstractC463340IEy = this.LLJJI;
        if (abstractC463340IEy != null) {
            abstractC463340IEy.LIZLLL();
        }
        C472280Ifa c472280IfaLIZLLL = C0IKG.LIZLLL(C0IKG.LIZ(getActivity()));
        if (c472280IfaLIZLLL != null) {
            c472280IfaLIZLLL.setVariantCardShowing(false);
        }
    }

    @Override // X.InterfaceC466370IQp
    public final void kR() {
        this.LL.LJ();
        this.LLJILJILJ = false;
        AbstractC463340IEy abstractC463340IEy = this.LLJJI;
        if (abstractC463340IEy != null) {
            abstractC463340IEy.LJIIJ();
        }
    }

    @Override // X.InterfaceC466370IQp
    public final void l0() {
        this.LL.LJ();
        this.LLJILJILJ = false;
    }

    @Override // X.InterfaceC466370IQp
    public final void pD() {
        AbstractC463340IEy abstractC463340IEy = this.LLJJI;
        if (abstractC463340IEy != null) {
            abstractC463340IEy.LIZJ();
        }
        C472280Ifa c472280IfaLIZLLL = C0IKG.LIZLLL(C0IKG.LIZ(getActivity()));
        if (c472280IfaLIZLLL != null) {
            c472280IfaLIZLLL.setVariantCardShowing(true);
        }
        C01GW<C463900IHc> c01gw = C463900IHc.LJIIJJI;
        C0IFB.LIZ().LIZIZ();
        C0IFX c0ifx = this.LLILLL;
        if (c0ifx != null) {
            c0ifx.T8(true);
        }
        C0IFX c0ifx2 = this.LLILLL;
        if (c0ifx2 != null) {
            c0ifx2.LJLL();
        }
    }

    @Override // X.InterfaceC466370IQp
    public final void tF() {
        C467650IVn c467650IVn = this.LLJIJIL;
        if (c467650IVn != null) {
            c467650IVn.LJJII(6, OR().IH(), this.LLJILJIL);
        }
    }

    public final C0IEG OR() {
        LiveRoomFragment liveRoomFragment;
        Fragment parentFragment = getParentFragment();
        return (!(parentFragment instanceof LiveRoomFragment) || (liveRoomFragment = (LiveRoomFragment) parentFragment) == null) ? new C0IES() : liveRoomFragment;
    }

    @Override // X.InterfaceC466370IQp
    public final void PH() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPreviousPlayDisplayed -> roomId = ");
        sbLIZ.append(this.LLJI);
        C20441214yg.LIZIZ("VariantCardFragment", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC466370IQp
    public final void SD() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPreviousEnterRoomSucceed -> roomId = ");
        sbLIZ.append(this.LLJI);
        C20441214yg.LIZIZ("VariantCardFragment", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC466370IQp
    public final void bK() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onConceal -> roomId = ");
        sbLIZ.append(this.LLJI);
        C20441214yg.LIZIZ("VariantCardFragment", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC466370IQp
    public final void fy() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReveal -> roomId = ");
        sbLIZ.append(this.LLJI);
        C20441214yg.LIZIZ("VariantCardFragment", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC466370IQp, X.C0IGR
    public final boolean onBackPressed() {
        List<Fragment> listLJJLIIIJL = getChildFragmentManager().LJJLIIIJL();
        if (!(!listLJJLIIIJL.isEmpty())) {
            PR(new C465900IOu(8));
            return false;
        }
        for (C128Y c128y : listLJJLIIIJL) {
            if ((c128y instanceof C0IGR) && ((C0IGR) c128y).onBackPressed()) {
                return true;
            }
        }
        PR(new C465900IOu(8));
        return false;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        AbstractC463340IEy abstractC463340IEy = this.LLJJI;
        if (abstractC463340IEy != null) {
            abstractC463340IEy.LIZIZ();
        }
        this.LLJILJILJ = false;
        this.LLJJIJIIJIL = false;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        AbstractC463340IEy abstractC463340IEy = this.LLJJI;
        if (abstractC463340IEy != null) {
            abstractC463340IEy.LJ();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        AbstractC463340IEy abstractC463340IEy = this.LLJJI;
        if (abstractC463340IEy != null) {
            C0IGD c0igd = this.LLILZLL;
            abstractC463340IEy.LJFF(c0igd != null ? ((LiveRoomFragment) c0igd).cS(this) : false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        AbstractC463340IEy abstractC463340IEy = this.LLJJI;
        if (abstractC463340IEy != null) {
            abstractC463340IEy.LJI();
        }
    }

    @Override // X.InterfaceC466370IQp
    public final int Ei() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC466370IQp
    public final EnterRoomConfig Eq() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC466370IQp
    public final C0IID LLD() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC466370IQp
    public final boolean bl() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC466370IQp
    public final Room f8() {
        return this.LLJ;
    }

    @Override // X.InterfaceC466370IQp
    public final DataChannel getDataChannel() {
        return this.LLIZ;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
    }

    @Override // X.InterfaceC466370IQp
    public final void FP(LiveRoomFragment liveRoomFragment) {
        this.LLILZLL = liveRoomFragment;
    }

    public final void NR(C0II0 c0ii0) {
        C0IIQ c0iiq;
        if (c0ii0 == C0II0.USER_CLOSE) {
            if (c0ii0 == C0II0.USER_CLOSE_CLICK) {
                c0iiq = C0IIQ.CLICK;
            } else {
                c0iiq = C0IIQ.DRAW;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exit exitRoom:");
            sbLIZ.append(this.LLJI);
            C827750WdZ.LIZ("RoomListener", C2188811AlT.LIZIZ(sbLIZ));
            DataChannel dataChannel = this.LLIZ;
            if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(PIPStatusData.class), Boolean.TRUE)) {
                C19EG activity = getActivity();
                if (activity != null) {
                    activity.finishAndRemoveTask();
                    C01GW<C463900IHc> c01gw = C463900IHc.LJIIJJI;
                    C0IFB.LIZ().LIZIZ();
                }
            } else if (OR().V7() != null) {
                ((C464520IJm) OR().V7()).LIZ(c0iiq);
            }
            this.LLJILJIL = c0iiq;
        }
    }

    public final void PR(C465900IOu c465900IOu) {
        String requestId;
        C0IGD c0igd;
        C0IGD c0igd2;
        if (c465900IOu.LIZ == 8 && (c0igd2 = this.LLILZLL) != null && ((LiveRoomFragment) c0igd2).oS()) {
            return;
        }
        if (c465900IOu.LIZ == 6 && (c0igd = this.LLILZLL) != null && ((LiveRoomFragment) c0igd).qS()) {
            return;
        }
        if (OR().Ao() != null && OR().Ao().onBackPressed()) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_leave");
            c474500IjALIZ.LJJII("click", "leave_type");
            Room room = this.LLJ;
            if (room == null || (requestId = room.getRequestId()) == null) {
                requestId = "";
            }
            c474500IjALIZ.LJJII(requestId, "guest_request_id");
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LIZ();
            } else {
                c474500IjALIZ.LJJIJLIJ();
                c474500IjALIZ.LJIIIIZZ();
                w.LIZ.getClass();
                c474500IjALIZ.LJJII(w.LJIJI(), "request_id");
                c474500IjALIZ.LJJII(w.LIZLLL(), "action_type");
                c474500IjALIZ.LJJII(w.LJJII(), "video_id");
                c474500IjALIZ.LJJII(w.LJIIZILJ(), "log_pb");
                c474500IjALIZ.LJJIJL();
            }
            C20441214yg.LIZIZ("VariantCardFragment", "MultiGuest Hangout page close intercept_");
            return;
        }
        C467650IVn c467650IVn = this.LLJIJIL;
        if (c467650IVn != null) {
            c467650IVn.LJJII(c465900IOu.LIZ, OR().IH(), null);
        }
        NR(C0II0.USER_CLOSE);
    }

    @Override // X.C0IRE
    public final void ch(boolean z) {
        RecommendSwipeOptWidget recommendSwipeOptWidget = this.LLJJIJI;
        if (recommendSwipeOptWidget != null) {
            recommendSwipeOptWidget.x1(z);
        }
    }

    @Override // X.InterfaceC466370IQp
    public final void fG(int i) {
        this.LLILZ = i;
        AbstractC463340IEy abstractC463340IEy = this.LLJJI;
        if (abstractC463340IEy != null) {
            abstractC463340IEy.LJIIJJI(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0141 A[PHI: r3
      0x0141: PHI (r3v2 java.lang.String) = (r3v1 java.lang.String), (r3v6 java.lang.String) binds: [B:61:0x013e, B:53:0x010f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0145 A[PHI: r2 r3
      0x0145: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v5 java.lang.String) binds: [B:64:0x0142, B:56:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0145: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v5 java.lang.String) binds: [B:64:0x0142, B:56:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r23) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.variant.ui.VariantCardFragment.onCreate(android.os.Bundle):void");
    }

    public final void onEvent(C0IF8 c0if8) {
        C0IL2.LIZ.LIZ().LIZIZ(new Event("live_play_on_jump_to_other_event", 1027, C0IIR.BussinessApiCall));
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LJI("ttlive_room", "received JumpToOtherRoomEvent");
        EnterRoomConfig enterRoomConfig = c0if8.LJ;
        if (enterRoomConfig == null) {
            return;
        }
        long j = enterRoomConfig.mLogData.fromPortalId;
        long jLongValue = 0;
        if (j > 0) {
            C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preparing jump bundle, portalId=");
            sbLIZ.append(j);
            sbLIZ.append(" originatingRoomId=");
            sbLIZ.append(this.LLJI);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1143300frELJIIJJI.getClass();
            AbstractC1143290frD.LJI("ttlive_portal", strLIZIZ);
            EnterRoomConfig.LogData logData = c0if8.LJ.mLogData;
            Long l = this.LLJI;
            if (l != null) {
                jLongValue = l.longValue();
            }
            logData.originatingRoomId = jLongValue;
        }
        boolean z = c0if8.LIZ;
        if (!z) {
            c0if8.LJ.mRoomsData.backRoomSource = c0if8.LIZIZ;
        } else {
            c0if8.LJ.mRoomsData.backRoomSource = "jump_source_room_back";
        }
        c0if8.LJ.mRoomsData.isBackPreRoom = z;
        NR(C0II0.JUMP_TO_OTHER);
        C0IGD c0igd = this.LLILZLL;
        if (c0igd != null) {
            ((LiveRoomFragment) c0igd).mS(c0if8.LIZJ, c0if8.LJ, c0if8.LIZ, c0if8.LIZLLL);
        }
    }

    @Override // X.InterfaceC466370IQp
    public final void CJ(Room room, EnterRoomConfig enterRoomConfig) {
        this.LLIZLLLIL = enterRoomConfig;
        this.LLJ = room;
    }

    @Override // X.C0IRE
    public final void b5(boolean z, boolean z2) {
        RecommendSwipeOptWidget recommendSwipeOptWidget = this.LLJJIJI;
        if (recommendSwipeOptWidget != null) {
            recommendSwipeOptWidget.z1(false);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View viewLJIIIIZZ;
        ViewGroup viewGroup;
        super.onViewCreated(view, bundle);
        this.LLJJ = view.findViewById(R.id.variant_card_container);
        this.LLJJIII = view.findViewById(R.id.sxp);
        AbstractC463340IEy abstractC463340IEy = this.LLJJI;
        if (abstractC463340IEy != null && (viewLJIIIIZZ = abstractC463340IEy.LJIIIIZZ()) != null) {
            View view2 = this.LLJJ;
            if ((view2 instanceof FrameLayout) && (viewGroup = (ViewGroup) view2) != null) {
                viewGroup.addView(viewLJIIIIZZ, -1, -1);
            }
        }
        AbstractC463340IEy abstractC463340IEy2 = this.LLJJI;
        if (abstractC463340IEy2 != null) {
            abstractC463340IEy2.LJII(view, bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gm1, viewGroup, false);
        this.LLJILLL = viewTd;
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    @Override // X.InterfaceC466370IQp
    public final void UP(int i, int i2, boolean z, boolean z2) {
        if (this.LLJJIJIIJIL) {
            this.LLJJIJIIJIL = false;
            AbstractC463340IEy abstractC463340IEy = this.LLJJI;
            if (abstractC463340IEy != null) {
                abstractC463340IEy.LJIIIZ();
            }
        }
    }

    @Override // X.C0IRE
    public final void Z9(float f, float f2, boolean z, int i, boolean z2, float f3, C21601619gM c21601619gM) {
        RecommendSwipeOptWidget recommendSwipeOptWidget;
        if (RecommendEndAtFollowingSetting.INSTANCE.getValue().enableShowRecommend != 3) {
            return;
        }
        if (this.LLJJIJI == null) {
            if (getContext() != null && this.LLJJIII != null) {
                this.LLJJIJI = (RecommendSwipeOptWidget) ((RecyclableWidgetManager) this.LLILLJJLI.getValue()).getRecyclableWidgetFromCacheOrNew(RecommendSwipeOptWidget.class, null, AFwS193S0000000_7.get$arr$(96));
                ((WidgetManager) this.LLILLJJLI.getValue()).load(R.id.sxp, this.LLJJIJI, false);
                View view = this.LLJJ;
                if (view != null && (recommendSwipeOptWidget = this.LLJJIJI) != null) {
                    recommendSwipeOptWidget.LLILLJJLI = view;
                    recommendSwipeOptWidget.LL = c21601619gM;
                    c21601619gM.LJJI(0.99f, false);
                    recommendSwipeOptWidget.y1();
                }
            } else {
                return;
            }
        }
        RecommendSwipeOptWidget recommendSwipeOptWidget2 = this.LLJJIJI;
        if (recommendSwipeOptWidget2 != null) {
            recommendSwipeOptWidget2.A1(i, f, f3, z, z2);
        }
        RecommendSwipeOptWidget recommendSwipeOptWidget3 = this.LLJJIJI;
        if (recommendSwipeOptWidget3 != null) {
            recommendSwipeOptWidget3.show();
        }
    }
}
