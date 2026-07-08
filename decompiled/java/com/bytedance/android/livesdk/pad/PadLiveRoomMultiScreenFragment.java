package com.bytedance.android.livesdk.pad;

import X.C098200Yq;
import X.C0IJT;
import X.C0IKH;
import X.C1161920gLG;
import X.C14KS;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C469530Ib9;
import X.C469550IbB;
import X.C469560IbC;
import X.C469830Ibd;
import X.C472280Ifa;
import X.C472350Ifh;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.InterfaceC465670INx;
import X.InterfaceC469390Iav;
import Y.ARunnableS107S0100000_7;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.drawerlayout.widget.DrawerLayout$SimpleDrawerListener;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.room.PadMultiScreenWidthChannel;
import com.bytedance.android.livesdk.drawerfeed.LiveDrawerDialogV3;
import com.bytedance.android.livesdk.livesetting.message.LivePadMultiScreenStatePersistenceSetting;
import com.bytedance.android.livesdk.pad.PadLiveRoomMultiScreenFragment;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class PadLiveRoomMultiScreenFragment extends BaseFragment implements InterfaceC469390Iav, C0IKH {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9OCQoHELIOSZx8yLAklPyoBJyohBDo/PCwfKj02LSsKOy40JSAiPQ==";
    public C472280Ifa LL;
    public DataChannel LLILLJJLI;
    public C469830Ibd LLILLL;
    public LiveDrawerDialogV3 LLILZ;
    public View LLILZIL;
    public C472350Ifh LLILZLL;
    public boolean LLIZ = true;
    public long LLIZLLLIL = -1;
    public String LLJ = "slide";
    public final C469530Ib9 LLJI = new DrawerLayout$SimpleDrawerListener() { // from class: X.0Ib9
        @Override // androidx.drawerlayout.widget.DrawerLayout$SimpleDrawerListener, androidx.drawerlayout.widget.DrawerLayout$DrawerListener
        public final void onDrawerClosed(View view) {
            super.onDrawerClosed(view);
            DataChannel dataChannel = this.LIZ.LLILLJJLI;
            if (dataChannel != null) {
                dataChannel.zW(PadMultiScreenWidthChannel.class, Float.valueOf(0.0f));
            }
            PadLiveRoomMultiScreenFragment padLiveRoomMultiScreenFragment = this.LIZ;
            padLiveRoomMultiScreenFragment.RR(padLiveRoomMultiScreenFragment.LLJ);
            if (LivePadMultiScreenStatePersistenceSetting.INSTANCE.getValue() && this.LIZ.PR()) {
                InterfaceC465670INx.LJLJJL.LJFF(Boolean.FALSE);
            }
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout$SimpleDrawerListener, androidx.drawerlayout.widget.DrawerLayout$DrawerListener
        public final void onDrawerOpened(View view) {
            super.onDrawerOpened(view);
            this.LIZ.LLIZLLLIL = System.currentTimeMillis();
            DataChannel dataChannel = this.LIZ.LLILLJJLI;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_pad_split_view_open");
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LJJII("RoomFeedDrawer", "business_scene");
            c474500IjALIZ.LJJII("open", "show_type");
            c474500IjALIZ.LIZ();
            PadLiveRoomMultiScreenFragment padLiveRoomMultiScreenFragment = this.LIZ;
            padLiveRoomMultiScreenFragment.LLJ = "slide";
            DataChannel dataChannel2 = padLiveRoomMultiScreenFragment.LLILLJJLI;
            if (dataChannel2 != null) {
                dataChannel2.zW(PadMultiScreenWidthChannel.class, Float.valueOf(375.0f));
            }
            if (LivePadMultiScreenStatePersistenceSetting.INSTANCE.getValue() && this.LIZ.PR()) {
                InterfaceC465670INx.LJLJJL.LJFF(Boolean.TRUE);
            }
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout$SimpleDrawerListener, androidx.drawerlayout.widget.DrawerLayout$DrawerListener
        public final void onDrawerSlide(View view, float f) {
            FragmentManager childFragmentManager;
            C469830Ibd c469830Ibd;
            C469830Ibd c469830Ibd2;
            super.onDrawerSlide(view, f);
            PadLiveRoomMultiScreenFragment padLiveRoomMultiScreenFragment = this.LIZ;
            if (padLiveRoomMultiScreenFragment.LLIZ && (childFragmentManager = padLiveRoomMultiScreenFragment.getChildFragmentManager()) != null && childFragmentManager.LJJLIIIIJ() == 0) {
                PadLiveRoomMultiScreenFragment padLiveRoomMultiScreenFragment2 = this.LIZ;
                padLiveRoomMultiScreenFragment2.LLIZ = false;
                LiveDrawerDialogV3 liveDrawerDialogV3 = padLiveRoomMultiScreenFragment2.LLILZ;
                if (liveDrawerDialogV3 != null && padLiveRoomMultiScreenFragment2.isAdded() && !padLiveRoomMultiScreenFragment2.getChildFragmentManager().LJLJJI()) {
                    C19EH c19ehLJIIJ = padLiveRoomMultiScreenFragment2.getChildFragmentManager().LJIIJ();
                    c19ehLJIIJ.LIZIZ(R.id.vv3, liveDrawerDialogV3);
                    c19ehLJIIJ.LJII(String.valueOf(liveDrawerDialogV3.hashCode()));
                    c19ehLJIIJ.LJIIJ();
                    if (!Intrinsics.LJFF("init", "init") && (((c469830Ibd = padLiveRoomMultiScreenFragment2.LLILLL) == null || !c469830Ibd.isDrawerOpen(8388613)) && padLiveRoomMultiScreenFragment2.PR() && (c469830Ibd2 = padLiveRoomMultiScreenFragment2.LLILLL) != null)) {
                        c469830Ibd2.openDrawer(8388613, true);
                    }
                }
            }
            this.LIZ.NR(f);
            DataChannel dataChannel = this.LIZ.LLILLJJLI;
            if (dataChannel != null) {
                dataChannel.zW(PadMultiScreenWidthChannel.class, Float.valueOf(375 * f));
            }
        }
    };
    public final ArrayList<C469550IbB> LLJIJIL = new ArrayList<>();

    @Override // X.C0IKH
    public final void Iw(String str) {
    }

    @Override // X.C0IKH
    public final Fragment getFragment() {
        return this;
    }

    @Override // X.C0IKH
    public final Boolean ot() {
        return null;
    }

    @Override // X.InterfaceC469390Iav
    public final boolean St() {
        C469830Ibd c469830Ibd = this.LLILLL;
        return c469830Ibd != null && c469830Ibd.isDrawerOpen(8388613);
    }

    @Override // X.C0IKH
    public final boolean mt() {
        C469830Ibd c469830Ibd = this.LLILLL;
        return c469830Ibd != null && c469830Ibd.isDrawerOpen(8388613);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C469830Ibd c469830Ibd = this.LLILLL;
        if (c469830Ibd != null) {
            c469830Ibd.removeDrawerListener(this.LLJI);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        ((IPadMultiScreenService) C1161920gLG.LIZJ(IPadMultiScreenService.class)).d82(null);
        for (C469550IbB c469550IbB : this.LLJIJIL) {
            C469830Ibd c469830Ibd = this.LLILLL;
            if (c469830Ibd != null) {
                c469830Ibd.removeDrawerListener(c469550IbB);
            }
        }
        RR("Tap");
        super.onDetach();
    }

    public final boolean PR() {
        return C14KS.LJI(getActivity()) > C14KS.LJ(getActivity());
    }

    @Override // X.C0IKH
    public final C472280Ifa wx() {
        return this.LL;
    }

    public final void NR(float f) {
        if (PR()) {
            View view = this.LLILZIL;
            if (view != null) {
                C500260Jjc.LJLLI(C497740JfY.LJIIZILJ() - ((int) C497740JfY.LIZIZ(f * 375.0f)), view);
                return;
            }
            return;
        }
        View view2 = this.LLILZIL;
        if (view2 == null) {
            return;
        }
        C500260Jjc.LJLLI(C497740JfY.LJIIZILJ(), view2);
    }

    public final void OR(String str) {
        C469830Ibd c469830Ibd = this.LLILLL;
        if (c469830Ibd != null) {
            c469830Ibd.setCanSlideCloseDrawerLayout(new AwS551S0100000_7(this, 75));
        }
        C469830Ibd c469830Ibd2 = this.LLILLL;
        if (c469830Ibd2 != null) {
            c469830Ibd2.setCanSlideOpenDrawerLayout(new AwS551S0100000_7(this, 76));
        }
        if (!LivePadMultiScreenStatePersistenceSetting.INSTANCE.getValue()) {
            InterfaceC465670INx.LJLJJL.LJFF(Boolean.FALSE);
        }
        if (InterfaceC465670INx.LJLJJL.LIZIZ().booleanValue()) {
            C469830Ibd c469830Ibd3 = this.LLILLL;
            if (c469830Ibd3 != null) {
                c469830Ibd3.openDrawer(8388613, false);
            }
            NR(1.0f);
        } else {
            this.LLJ = str;
            C469830Ibd c469830Ibd4 = this.LLILLL;
            if (c469830Ibd4 != null) {
                c469830Ibd4.closeDrawer(8388613, false);
            }
            NR(0.0f);
        }
        C469830Ibd c469830Ibd5 = this.LLILLL;
        if (c469830Ibd5 != null) {
            c469830Ibd5.removeDrawerListener(this.LLJI);
        }
        C469830Ibd c469830Ibd6 = this.LLILLL;
        if (c469830Ibd6 != null) {
            c469830Ibd6.addDrawerListener(this.LLJI);
        }
        if (PR()) {
            C469830Ibd c469830Ibd7 = this.LLILLL;
            if (c469830Ibd7 != null) {
                c469830Ibd7.setScrimColor(0);
                return;
            }
            return;
        }
        C469830Ibd c469830Ibd8 = this.LLILLL;
        if (c469830Ibd8 == null) {
            return;
        }
        c469830Ibd8.setScrimColor(-1728053248);
    }

    public final void RR(String str) {
        if (this.LLIZLLLIL > 0) {
            DataChannel dataChannel = this.LLILLJJLI;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLIZLLLIL;
            if (jCurrentTimeMillis > 0) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_pad_split_view_duration");
                c474500IjALIZ.LJIJJLI(dataChannel);
                c474500IjALIZ.LJJII("RoomFeedDrawer", "business_scene");
                c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis), "duration");
                c474500IjALIZ.LIZ();
            }
            DataChannel dataChannel2 = this.LLILLJJLI;
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_pad_split_view_close");
            c474500IjALIZ2.LJIJJLI(dataChannel2);
            c474500IjALIZ2.LJJII("RoomFeedDrawer", "business_scene");
            c474500IjALIZ2.LJJII(str, "dismiss_type");
            c474500IjALIZ2.LIZ();
            this.LLIZLLLIL = -1L;
        }
    }

    public final void SR(C472280Ifa c472280Ifa) {
        this.LL = c472280Ifa;
        if (c472280Ifa != null) {
            c472280Ifa.setDrawerLayout(this.LLILLL);
            c472280Ifa.setDrawerEnable(true);
            c472280Ifa.setPadNewLandscape(((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad());
        }
    }

    @Override // X.InterfaceC469390Iav
    public final void Tt(String str) {
        if (getChildFragmentManager().LJJLIIIIJ() < 0 || getChildFragmentManager().LJLJJI()) {
            return;
        }
        if (str != null) {
            getChildFragmentManager().LJLLJ(1, str);
        } else {
            getChildFragmentManager().LJLLILLLL();
        }
    }

    @Override // X.InterfaceC469390Iav
    public final boolean Ut(String str) {
        if (!St()) {
            return false;
        }
        this.LLJ = str;
        C469830Ibd c469830Ibd = this.LLILLL;
        if (c469830Ibd != null) {
            c469830Ibd.closeDrawer(8388613);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C469830Ibd c469830Ibd;
        View view;
        super.onConfigurationChanged(configuration);
        if (LivePadMultiScreenStatePersistenceSetting.INSTANCE.getValue() && (c469830Ibd = this.LLILLL) != null && c469830Ibd.isDrawerOpen(8388613) && (view = getView()) != null) {
            HandlerHook.viewPost(view, new Runnable() { // from class: X.0IOv
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PadLiveRoomMultiScreenFragment@2bea.onConfigurationChanged$1");
                    try {
                        InterfaceC465670INx.LJLJJL.LJFF(Boolean.TRUE);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PadLiveRoomMultiScreenFragment@2bea.onConfigurationChanged$1");
                }
            });
        }
        OR("Rotate");
        LiveDrawerDialogV3 liveDrawerDialogV3 = this.LLILZ;
        if (liveDrawerDialogV3 != null && !getChildFragmentManager().LJLJJI()) {
            getChildFragmentManager().LJLLJ(0, String.valueOf(liveDrawerDialogV3.hashCode()));
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((IPadMultiScreenService) C1161920gLG.LIZJ(IPadMultiScreenService.class)).d82(this);
    }

    @Override // X.C0IKH
    public final void setDataChannel(DataChannel dataChannel) {
        float f;
        this.LLILLJJLI = dataChannel;
        C469830Ibd c469830Ibd = this.LLILLL;
        if (c469830Ibd != null && c469830Ibd.isDrawerOpen(8388613)) {
            f = 375.0f;
        } else {
            f = 0.0f;
        }
        dataChannel.zW(PadMultiScreenWidthChannel.class, Float.valueOf(f));
    }

    @Override // X.InterfaceC469390Iav
    public final void tK(View view) {
        this.LLILZIL = view;
    }

    @Override // X.C0IKH
    public final void nt(boolean z, boolean z2) {
        if (z) {
            C469830Ibd c469830Ibd = this.LLILLL;
            if (c469830Ibd != null) {
                c469830Ibd.openDrawer(8388613, true);
                return;
            }
            return;
        }
        this.LLJ = "Tap";
        C469830Ibd c469830Ibd2 = this.LLILLL;
        if (c469830Ibd2 == null) {
            return;
        }
        c469830Ibd2.closeDrawer(8388613, true);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C469830Ibd c469830Ibd;
        super.onViewCreated(view, bundle);
        HandlerHook.viewPost(view, new ARunnableS107S0100000_7(this, 247));
        if (view instanceof C469830Ibd) {
            c469830Ibd = (C469830Ibd) view;
        } else {
            c469830Ibd = null;
        }
        this.LLILLL = c469830Ibd;
        C472280Ifa c472280Ifa = this.LL;
        if (c472280Ifa != null) {
            SR(c472280Ifa);
        }
        C472350Ifh c472350Ifh = (C472350Ifh) view.findViewById(R.id.vv3);
        this.LLILZLL = c472350Ifh;
        if (c472350Ifh != null) {
            c472350Ifh.setOnSwipeListener(new C469560IbC() { // from class: X.0IbA
                @Override // X.C469560IbC
                public final void LIZ() {
                    this.LIZ.Tt(null);
                }
            });
        }
        C472350Ifh c472350Ifh2 = this.LLILZLL;
        if (c472350Ifh2 != null) {
            c472350Ifh2.setCanSlideClose(new AwS551S0100000_7(this, 77));
        }
        OR("Tap");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gkk, viewGroup, false);
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
}
