package com.bytedance.android.livesdk.chatroom.ui.landscapefeeds;

import X.AbstractC1143290frD;
import X.C098200Yq;
import X.C0DXR;
import X.C0IF8;
import X.C0IGD;
import X.C0IHD;
import X.C0IID;
import X.C0IIR;
import X.C0IJR;
import X.C0IL2;
import X.C0ILZ;
import X.C0INL;
import X.C0JDJ;
import X.C1143300frE;
import X.C11NJ;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C464940ILc;
import X.C465220IMe;
import X.C521960KdW;
import X.C784440Upu;
import X.C786410Ut5;
import X.InterfaceC465090ILr;
import X.InterfaceC466370IQp;
import X.InterfaceC500940Jki;
import Y.AfS176S0100000_7;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveLandNoMoreFragment extends BaseFragment implements InterfaceC466370IQp, InterfaceC465090ILr, C0JDJ {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9Ky0tPT08JyhiPCHELIOSZ9JCQiLTwwKTUpLyo2LDZiBSYlLQktJysdJwgjOyoVOiQrJCo9PA==";
    public EnterRoomConfig LL;
    public RecyclerView LLILLL;
    public C0INL LLILZ;
    public C464940ILc LLILZIL;
    public C0IGD LLIZ;
    public int LLILLJJLI = -1;
    public final C11NJ LLILZLL = new C11NJ();

    @Override // X.InterfaceC466370IQp
    public final /* synthetic */ void AJ(Object obj) {
    }

    @Override // X.InterfaceC466370IQp
    public final /* synthetic */ void Be() {
    }

    @Override // X.InterfaceC466370IQp
    public final /* synthetic */ boolean Dt() {
        return false;
    }

    @Override // X.InterfaceC466370IQp
    public final void EN(String str) {
    }

    @Override // X.InterfaceC466370IQp
    public final void Eo() {
    }

    @Override // X.InterfaceC465090ILr
    public final void Fc() {
    }

    @Override // X.InterfaceC466370IQp
    public final boolean H5() {
        return true;
    }

    @Override // X.InterfaceC466370IQp
    public final void IP() {
    }

    @Override // X.InterfaceC466370IQp
    public final void LJLLLL() {
    }

    @Override // X.InterfaceC466370IQp
    public final C0IID LLD() {
        return null;
    }

    @Override // X.InterfaceC466370IQp
    public final boolean O3() {
        return true;
    }

    @Override // X.InterfaceC466370IQp
    public final void OB() {
    }

    @Override // X.InterfaceC466370IQp
    public final /* synthetic */ void PH() {
    }

    @Override // X.InterfaceC466370IQp
    public final /* synthetic */ void Qb(String str) {
    }

    @Override // X.InterfaceC466370IQp
    public final void Rm() {
    }

    @Override // X.InterfaceC466370IQp
    public final /* synthetic */ void SD() {
    }

    @Override // X.InterfaceC466370IQp
    public final void UP(int i, int i2, boolean z, boolean z2) {
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

    @Override // X.InterfaceC465090ILr
    public final /* synthetic */ void az(Room room) {
    }

    @Override // X.InterfaceC466370IQp
    public final /* synthetic */ void bK() {
    }

    @Override // X.InterfaceC466370IQp
    public final /* synthetic */ boolean bl() {
        return false;
    }

    @Override // X.InterfaceC466370IQp
    public final void cD(String str, boolean z) {
    }

    @Override // X.InterfaceC466370IQp
    public final void cancel() {
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
    }

    @Override // X.InterfaceC465090ILr
    public final void ed(Room room) {
    }

    @Override // X.InterfaceC466370IQp
    public final Room f8() {
        return null;
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
    public final /* synthetic */ void fy() {
    }

    @Override // X.InterfaceC466370IQp
    public final void gc() {
    }

    @Override // X.InterfaceC466370IQp
    public final Fragment getFragment() {
        return this;
    }

    @Override // X.InterfaceC466370IQp
    public final long getRoomId() {
        return 0L;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C465220IMe.LIZ();
    }

    @Override // X.InterfaceC466370IQp
    public final void hC() {
    }

    @Override // X.InterfaceC466370IQp
    public final String hx() {
        return null;
    }

    @Override // X.InterfaceC466370IQp
    public final void i9() {
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment
    public final /* synthetic */ boolean isLight(Context context) {
        throw null;
    }

    @Override // X.InterfaceC466370IQp
    public final void jm() {
    }

    @Override // X.InterfaceC466370IQp
    public final void kR() {
    }

    @Override // X.InterfaceC466370IQp
    public final void kb(C0IHD c0ihd) {
    }

    @Override // X.InterfaceC466370IQp
    public final void ki() {
    }

    @Override // X.InterfaceC466370IQp
    public final void l0() {
    }

    @Override // X.InterfaceC466370IQp
    public final boolean lk() {
        return false;
    }

    @Override // X.InterfaceC466370IQp
    public final void n0(boolean z) {
    }

    @Override // X.InterfaceC466370IQp, X.C0IGR
    public final boolean onBackPressed() {
        return false;
    }

    @Override // X.InterfaceC466370IQp
    public final void pD() {
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
    public final void tF() {
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

    @Override // X.InterfaceC465090ILr
    public final void xg(Room room) {
    }

    @Override // X.InterfaceC466370IQp
    public final void z7(Rect rect) {
    }

    @Override // X.InterfaceC466370IQp
    public final LiveWidget zb() {
        return null;
    }

    @Override // X.InterfaceC466370IQp
    public final Long bg() {
        return 0L;
    }

    @Override // X.InterfaceC466370IQp
    public final DataChannel getDataChannel() {
        if (isAdded()) {
            return C0IJR.LIZ(ViewModelProviders.of(this), this);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C464940ILc c464940ILc = this.LLILZIL;
        if (c464940ILc != null) {
            c464940ILc.LLILLJJLI.removeCallbacks(new Runnable() { // from class: X.0ILb
                @Override // java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("LiveLandNoMorePresenter@f81d.onDestroy$1");
                    C1C7U.LIZIZ("LiveLandNoMorePresenter@f81d.onDestroy$1");
                }
            });
        }
        this.LLILZLL.LJ();
        this.LLIZ = null;
    }

    @Override // X.InterfaceC466370IQp
    public final int Ei() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC466370IQp
    public final EnterRoomConfig Eq() {
        return this.LL;
    }

    @Override // X.InterfaceC466370IQp
    public final void FP(LiveRoomFragment liveRoomFragment) {
        this.LLIZ = liveRoomFragment;
    }

    @Override // X.InterfaceC466370IQp
    public final void fG(int i) {
        this.LLILLJJLI = i;
    }

    public final void onEvent(C0IF8 c0if8) {
        C0IL2.LIZ.LIZ().LIZIZ(new Event("live_play_on_jump_to_other_event", 1027, C0IIR.BussinessApiCall));
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LJI("ttlive_room", "received JumpToOtherRoomEvent");
        EnterRoomConfig enterRoomConfig = c0if8.LJ;
        if (enterRoomConfig == null) {
            return;
        }
        EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
        if (logData.fromPortalId > 0) {
            logData.originatingRoomId = Long.MIN_VALUE;
        }
        boolean z = c0if8.LIZ;
        if (!z) {
            enterRoomConfig.mRoomsData.backRoomSource = c0if8.LIZIZ;
        } else {
            enterRoomConfig.mRoomsData.backRoomSource = "jump_source_room_back";
        }
        enterRoomConfig.mRoomsData.isBackPreRoom = z;
        C0IGD c0igd = this.LLIZ;
        if (c0igd != null) {
            ((LiveRoomFragment) c0igd).mS(c0if8.LIZJ, enterRoomConfig, z, c0if8.LIZLLL);
        }
    }

    @Override // X.InterfaceC465090ILr
    public final void xw(List<Room> list) {
        C0INL c0inl;
        if (list != null && (c0inl = this.LLILZ) != null) {
            c0inl.LL = list;
            c0inl.notifyDataSetChanged();
        }
    }

    @Override // X.InterfaceC466370IQp
    public final void CJ(Room room, EnterRoomConfig enterRoomConfig) {
        this.LL = enterRoomConfig;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.tua);
        this.LLILLL = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        }
        getDataChannel();
        C0INL c0inl = new C0INL();
        this.LLILZ = c0inl;
        RecyclerView recyclerView2 = this.LLILLL;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(c0inl);
        }
        RecyclerView recyclerView3 = this.LLILLL;
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(new C0DXR() { // from class: X.0INO
                public final int LL = (int) C497740JfY.LIZIZ(2.0f);

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView4, C21673919s1 c21673919s1) {
                    int itemCount;
                    super.LIZIZ(rect, view2, recyclerView4, c21673919s1);
                    int childAdapterPosition = recyclerView4.getChildAdapterPosition(view2);
                    C0INL c0inl2 = this.LLILLJJLI.LLILZ;
                    if (c0inl2 != null) {
                        itemCount = c0inl2.getItemCount();
                    } else {
                        itemCount = 0;
                    }
                    if (childAdapterPosition < itemCount - 1) {
                        if (C497740JfY.LJJ()) {
                            rect.left = this.LL;
                            rect.right = 0;
                            return;
                        } else {
                            rect.left = 0;
                            rect.right = this.LL;
                            return;
                        }
                    }
                    rect.left = 0;
                    rect.right = 0;
                }
            });
        }
        this.LLILZIL = new C464940ILc(this);
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null) {
            long currentUserId = interfaceC500940JkiUser.getCurrentUserId();
            C464940ILc c464940ILc = this.LLILZIL;
            if (c464940ILc != null) {
                C0ILZ.LIZ(c464940ILc.LLILLJJLI, -1L, currentUserId);
            }
        }
        this.LLILZLL.LIZ(C784440Upu.LIZ().LIZLLL(this, C0IF8.class, new C521960KdW(this, 3)).LIZJ(new AfS176S0100000_7(this, 216)));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs = null;
        View viewSd = C786410Ut5.Sd(R.layout.gj3, layoutInflater, null);
        if (!(viewSd instanceof View)) {
            viewSd = null;
        }
        if (viewSd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewSd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewSd, this);
                viewSd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewSd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewSd;
    }
}
