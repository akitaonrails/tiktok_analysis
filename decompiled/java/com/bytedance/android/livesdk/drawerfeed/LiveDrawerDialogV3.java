package com.bytedance.android.livesdk.drawerfeed;

import X.C01GW;
import X.C098200Yq;
import X.C0IJT;
import X.C0IKG;
import X.C0IKH;
import X.C0IL2;
import X.C0INV;
import X.C0IUE;
import X.C0IVY;
import X.C0J1R;
import X.C0J3Y;
import X.C0UO0;
import X.C1161920gLG;
import X.C11NJ;
import X.C12ES;
import X.C1300480jwk;
import X.C1388190mED;
import X.C1602160rnK;
import X.C1685300txQ;
import X.C16F5;
import X.C16FZ;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C19U1;
import X.C1EOY;
import X.C20441214yg;
import X.C21594519fD;
import X.C2188811AlT;
import X.C452501pT;
import X.C467800IWc;
import X.C467820IWe;
import X.C467850IWh;
import X.C469250Iah;
import X.C469310Ian;
import X.C469320Iao;
import X.C469330Iap;
import X.C469370Iat;
import X.C469380Iau;
import X.C469420Iay;
import X.C469440Ib0;
import X.C469460Ib2;
import X.C469770IbX;
import X.C469810Ibb;
import X.C472280Ifa;
import X.C474500IjA;
import X.C480460Ism;
import X.C486790J7d;
import X.C497740JfY;
import X.C784440Upu;
import X.C786410Ut5;
import X.C930940aKi;
import X.C930970aKl;
import X.EnumC469210Iad;
import X.EnumC469260Iai;
import X.EnumC469490Ib5;
import X.InterfaceC1081980eGK;
import X.InterfaceC1584740rLE;
import X.InterfaceC420801kM;
import X.InterfaceC469270Iaj;
import X.InterfaceC469360Ias;
import X.InterfaceC469520Ib8;
import X.InterfaceC469760IbW;
import Y.ACListenerS142S0100000_7;
import Y.ARunnableS12S1100000_7;
import Y.AfS176S0100000_7;
import Y.AfS55S0110000_7;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.RelativeLayout;
import androidx.drawerlayout.widget.DrawerLayout$DrawerListener;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.feed.api.DrawerTypeChangeEvent;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.feed.api.RoomChangeEvent;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.drawerfeed.LiveDrawerDialogV3;
import com.bytedance.android.livesdk.drawerfeed.tab.DrawerTabsApi;
import com.bytedance.android.livesdk.drawerfeed.tab.DrawerTabsItem;
import com.bytedance.android.livesdk.livesetting.feed.LiveDrawerSearchEnableSetting;
import com.bytedance.android.livesdk.livesetting.feed.LiveDrawerTabTypeSetting;
import com.bytedance.android.livesdk.livesetting.model.DrawerLoadOpt;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawerLoadOptSetting;
import com.bytedance.android.livesdk.pad.IPadMultiScreenService;
import com.bytedance.android.livesdk.setting.LiveDrawerDisableGameLandingSetting;
import com.bytedance.android.livesdk.setting.LiveDrawerGameLandingFixSetting;
import com.bytedance.android.livesdk.setting.LiveDrawerTabLandingCustomSetting;
import com.bytedance.android.livesdk.setting.LiveDrawerTabLandingSupportTypeSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.watch.clearscreen.IClearScreenService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostPersonalized;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveDrawerDialogV3 extends BaseFragment implements C0IKH, InterfaceC469520Ib8 {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9HELIOSLDctPiohLiApLWEfITMpDT0yPyA+DSYyJCorH3w=";
    public C469810Ibb LL;
    public RelativeLayout LLILLJJLI;
    public C19U1 LLILLL;
    public C21594519fD LLILZ;
    public LiveIconView LLILZIL;
    public C16FZ LLILZLL;
    public FrameLayout LLIZ;
    public C16F5 LLIZLLLIL;
    public View LLJ;
    public FrameLayout LLJI;
    public C472280Ifa LLJIJIL;
    public Bundle LLJILJIL;
    public EnumC469210Iad LLJILJILJ;
    public DrawerLayout$DrawerListener LLJILLL;
    public long LLJJI;
    public DataChannel LLJJIII;
    public C469320Iao LLJJIJI;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public C469380Iau LLJJJJJIL;
    public List<DrawerTabsItem> LLJJJJLIIL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public String LLJLILLLLZIIL;
    public boolean LLJLL;
    public InterfaceC469270Iaj LLJZ;
    public int LLJZIJLIL;
    public boolean LLLFF;
    public String LLLFFI;
    public final C11NJ LLJJ = new C11NJ();
    public final Map<String, Fragment> LLJJIJIIJIL = new LinkedHashMap();
    public final Map<String, String> LLJJIJIL = new LinkedHashMap();
    public int LLJJJ = Integer.MAX_VALUE;
    public final List<DrawerTabsItem> LLJJL = new ArrayList();
    public final C469310Ian LLJLIL = new C469310Ian();
    public boolean LLJLLIL = true;
    public boolean LLJLLL = true;
    public final HashSet<String> LLL = new HashSet<>();
    public final Set<String> LLLF = new LinkedHashSet();
    public final C469250Iah LLLFZ = new C469250Iah(this);
    public final C469330Iap LLLI = new InterfaceC469760IbW() { // from class: X.0Iap
        @Override // X.InterfaceC469760IbW
        public final void LJ() {
            LiveDrawerDialogV3 liveDrawerDialogV3 = this.LIZ;
            View viewFindViewById = liveDrawerDialogV3.LLILZLL;
            if (viewFindViewById == null) {
                View view = liveDrawerDialogV3.getView();
                viewFindViewById = view != null ? view.findViewById(R.id.g1s) : null;
                liveDrawerDialogV3.LLILZLL = (C16FZ) viewFindViewById;
            }
            C16FZ c16fz = (C16FZ) viewFindViewById;
            if (c16fz != null) {
                C786410Ut5.LLLIZZ(c16fz, 0);
            }
        }

        @Override // X.InterfaceC469760IbW
        public final void LJIIL() {
            LiveDrawerDialogV3 liveDrawerDialogV3 = this.LIZ;
            View viewFindViewById = liveDrawerDialogV3.LLILZLL;
            if (viewFindViewById == null) {
                View view = liveDrawerDialogV3.getView();
                viewFindViewById = view != null ? view.findViewById(R.id.g1s) : null;
                liveDrawerDialogV3.LLILZLL = (C16FZ) viewFindViewById;
            }
            C16FZ c16fz = (C16FZ) viewFindViewById;
            if (c16fz != null) {
                C786410Ut5.LLLIZZ(c16fz, 8);
            }
        }

        @Override // X.InterfaceC469760IbW
        public final void LJIILIIL() {
            InterfaceC469390Iav interfaceC469390Iav;
            this.LIZ.nt(false, true);
            if (this.LIZ.LLLFF && C500260Jjc.LJJIII(C497740JfY.LIZ) && (interfaceC469390Iav = ((IPadMultiScreenService) C1161920gLG.LIZJ(IPadMultiScreenService.class)).MR().get()) != null) {
                interfaceC469390Iav.Ut("transfer");
            }
        }

        @Override // X.InterfaceC469760IbW
        public final void LJIILJJIL() {
            LiveDrawerDialogV3 liveDrawerDialogV3 = this.LIZ;
            if (liveDrawerDialogV3.RR().isAttachedToWindow()) {
                liveDrawerDialogV3.RR().requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // X.InterfaceC469760IbW
        public final EnumC469210Iad getContainerType() {
            return this.LIZ.LLJILJILJ;
        }

        @Override // X.InterfaceC469760IbW
        public final boolean isOpen() {
            return this.LIZ.gS();
        }
    };
    public final C01GW LLLII = C452501pT.LIZIZ(new AwS551S0100000_7(this, 46));

    @Override // X.C0IKH
    public final Fragment getFragment() {
        return this;
    }

    public final void NR() {
        if (LiveDrawerSearchEnableSetting.INSTANCE.getValue() && this.LLJZIJLIL == 2) {
            qS(null, false);
        }
        this.LLJZIJLIL = 1;
        Fragment fragmentVR = VR(this.LLLFFI, true);
        if (fragmentVR != null && getActivity() != null) {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            if (getChildFragmentManager().LJJJJZ(fragmentVR.getId()) != null || fragmentVR.isAdded()) {
                c19ehLJIIJ.LJJIFFI(fragmentVR);
                c19ehLJIIJ.LJIIJ();
            } else {
                c19ehLJIIJ.LIZIZ(R.id.q1r, fragmentVR);
                c19ehLJIIJ.LJIIL();
            }
        }
        C21594519fD c21594519fDZR = ZR();
        int visibility = c21594519fDZR.getVisibility();
        c21594519fDZR.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c21594519fDZR);
        oS(false, false);
        View view = this.LLIZ;
        if (view == null) {
            View view2 = getView();
            View viewFindViewById = view2 != null ? view2.findViewById(R.id.q1r) : null;
            this.LLIZ = (FrameLayout) viewFindViewById;
            view = viewFindViewById;
        }
        C786410Ut5.LJZ(0, (FrameLayout) view);
        rS();
    }

    public final void OR() {
        int count;
        C19U1 c19u1UR;
        ViewGroup viewGroup;
        C469320Iao c469320Iao;
        String strLJJIJL;
        C469320Iao c469320Iao2 = this.LLJJIJI;
        if (c469320Iao2 == null || this.LLLF.size() >= (count = c469320Iao2.getCount()) || (c19u1UR = UR()) == null) {
            return;
        }
        View childAt = c19u1UR.getChildAt(0);
        if (!(childAt instanceof ViewGroup) || (viewGroup = (ViewGroup) childAt) == null) {
            return;
        }
        int scrollX = c19u1UR.getScrollX();
        int width = c19u1UR.getWidth() + scrollX;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt2 = viewGroup.getChildAt(i);
            if (i < count && childAt2 != null && childAt2.getVisibility() == 0) {
                int left = childAt2.getLeft();
                if (childAt2.getWidth() + left > scrollX && left < width && (c469320Iao = this.LLJJIJI) != null && (strLJJIJL = c469320Iao.LJJIJL(i)) != null && !this.LLLF.contains(strLJJIJL)) {
                    C486790J7d.LIZJ(new ARunnableS12S1100000_7(this, strLJJIJL, 13));
                    this.LLLF.add(strLJJIJL);
                }
            }
        }
    }

    public final C16F5 PR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.fts) : null;
            this.LLIZLLLIL = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    public final C469810Ibb RR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.g_x) : null;
            this.LL = (C469810Ibb) viewFindViewById;
        }
        return (C469810Ibb) viewFindViewById;
    }

    public final LiveIconView SR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.g_y) : null;
            this.LLILZIL = (LiveIconView) viewFindViewById;
        }
        return (LiveIconView) viewFindViewById;
    }

    public final C19U1 UR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ga1) : null;
            this.LLILLL = (C19U1) viewFindViewById;
        }
        return (C19U1) viewFindViewById;
    }

    public final C21594519fD ZR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ga3) : null;
            this.LLILZ = (C21594519fD) viewFindViewById;
        }
        return (C21594519fD) viewFindViewById;
    }

    public final RelativeLayout bS() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.q1v) : null;
            this.LLILLJJLI = (RelativeLayout) viewFindViewById;
        }
        return (RelativeLayout) viewFindViewById;
    }

    public final View dS() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wyv) : null;
            this.LLJ = viewFindViewById;
        }
        return viewFindViewById;
    }

    @Override // X.C0IKH
    public final Boolean ot() {
        return Boolean.valueOf(this.LLJLL);
    }

    public final void rS() {
        C467800IWc c467800IWc = C467800IWc.LJIJ;
        if (Intrinsics.LJFF(c467800IWc.LJIIIZ, "game_drawer_drops")) {
            PR().setText(C497740JfY.LJIJI(2131841772));
            C786410Ut5.LLJJJJ(PR(), 0);
        } else if (c467800IWc.LJI()) {
            PR().setText(C497740JfY.LJIJI(2131841539));
            C786410Ut5.LLJJJJ(PR(), 0);
        } else if (!Intrinsics.LJFF(c467800IWc.LJIIIZ, "game_drawer_guessing")) {
            C786410Ut5.LLJJJJ(PR(), 8);
        } else {
            PR().setText(C497740JfY.LJIJI(2131852774));
            C786410Ut5.LLJJJJ(PR(), 0);
        }
    }

    public final boolean gS() {
        Context context;
        C469810Ibb c469810IbbRR;
        C469810Ibb c469810IbbRR2;
        Context context2;
        return (getContext() == null || (context = getContext()) == null || context.getApplicationInfo() == null || RR() == null || (c469810IbbRR = RR()) == null || c469810IbbRR.getContext() == null || (c469810IbbRR2 = RR()) == null || (context2 = c469810IbbRR2.getContext()) == null || context2.getApplicationInfo() == null || !RR().isDrawerOpen(8388613) || !RR().isAttachedToWindow()) ? false : true;
    }

    @Override // X.C0IKH
    public final boolean mt() {
        return gS();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        IClearScreenService iClearScreenService;
        InterfaceC1081980eGK interfaceC1081980eGKWy2;
        super.onDestroy();
        C1EOY c1eoy = C1EOY.LIZ;
        C467800IWc c467800IWc = C467800IWc.LJIJ;
        String str = c467800IWc.LJIIIIZZ;
        if (str == null) {
            str = "";
        }
        C1EOY.LJIJJ = str;
        C1300480jwk c1300480jwkLIZIZ = C1EOY.LIZ.LIZIZ("drawer_open");
        if (c1300480jwkLIZIZ != null) {
            c1300480jwkLIZIZ.stop();
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.JQ2(C930970aKl.class, null);
        this.LLJJLIIIJLLLLLLLZ = false;
        this.LLJJ.LJ();
        C467820IWe.LJFF(true);
        C467820IWe.LJ(false);
        C467820IWe.LJ = false;
        C0IVY.LIZ.clear();
        c467800IWc.LJIIL = "";
        ILiveFeedApiService iLiveFeedApiService = (ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class);
        if (iLiveFeedApiService != null) {
            iLiveFeedApiService.aw2();
        }
        this.LLL.clear();
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room == null || (iClearScreenService = (IClearScreenService) C1161920gLG.LIZJ(IClearScreenService.class)) == null || (interfaceC1081980eGKWy2 = iClearScreenService.wy2(room, this.LLJJIII)) == null) {
            return;
        }
        interfaceC1081980eGKWy2.LIZLLL(true);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
    }

    @Override // X.InterfaceC469520Ib8
    public final boolean tf() {
        return ZR().getCurrentItem() == 0;
    }

    @Override // X.C0IKH
    public final C472280Ifa wx() {
        return this.LLJIJIL;
    }

    @Override // X.C0IKH
    public final void Iw(String str) {
        this.LLJLL = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setUpdateDrawerTabs: ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("LiveDrawerDialogV3", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final String aS(boolean z) {
        if (this.LLJJJJ && z) {
            String strVa2 = ((IHostPersonalized) C1161920gLG.LIZJ(IHostPersonalized.class)).va2(2);
            if (strVa2 == null) {
                return "";
            }
            return strVa2;
        }
        return getString(2131841463);
    }

    public final void cS(boolean z) {
        List<DrawerTabsItem> list = this.LLJJJJLIIL;
        if (list != null) {
            if (!z) {
                mS(list, z);
            }
        } else {
            long currentUserId = UserService.getInstance().user().getCurrentUserId();
            C480460Ism.LIZ().getClass();
            InterfaceC420801kM interfaceC420801kMLJJLL = ((DrawerTabsApi) C480460Ism.LIZLLL(DrawerTabsApi.class)).queryDrawerTabs(currentUserId, C469460Ib2.LIZJ() ? 1 : 0).LJIILIIL(new C0UO0()).LJIILIIL(C0J1R.LIZIZ(this)).LJJLL(new AfS55S0110000_7(this, z, 1), new AfS55S0110000_7(this, z, 2));
            Iw("getTabData");
            this.LLJJ.LIZ(interfaceC420801kMLJJLL);
        }
    }

    public final void kS(String str) {
        if (Intrinsics.LJFF(str, "game_drawer_drops")) {
            Object obj = ((LinkedHashMap) this.LLJJIJIL).get(str);
            String str2 = C467800IWc.LJIJ.LJIIJ;
            if (str2.length() > 0 && !Intrinsics.LJFF(obj, str2)) {
                this.LLJJIJIL.put("game_drawer_drops", str2);
                Fragment fragmentVR = VR(str, false);
                if (fragmentVR != null) {
                    C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
                    if (fragmentVR.isAdded()) {
                        c19ehLJIIJ.LJIILL(fragmentVR);
                        c19ehLJIIJ.LJIIZILJ(fragmentVR);
                        c19ehLJIIJ.LJIIJ();
                    }
                    this.LLJJIJIIJIL.remove(str);
                }
            }
        }
        this.LLLFFI = str;
    }

    public final void nS(boolean z) {
        int size;
        Fragment fragment;
        String str;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.LogData logData;
        kS(C467800IWc.LJIJ.LJIIIZ);
        boolean z2 = true;
        if (!Intrinsics.LJFF(this.LLLFFI, "game_drawer_drops") && !Intrinsics.LJFF(this.LLLFFI, "game_drawer") && !Intrinsics.LJFF(this.LLLFFI, "game_drawer_guessing")) {
            C469320Iao c469320Iao = this.LLJJIJI;
            if (c469320Iao == null) {
                String str2 = null;
                if (LiveDrawerTabTypeSetting.INSTANCE.getValue() == 0) {
                    mS(null, z);
                } else if (C0IKG.LIZIZ != null) {
                    mS(C0IKG.LIZIZ, z);
                } else {
                    cS(false);
                }
                this.LLJZIJLIL = 0;
                if (this.LLJJIJI != null && LiveDrawerSearchEnableSetting.INSTANCE.getValue()) {
                    C0INV c0inv = C0IL2.LIZ;
                    EnterRoomConfig enterRoomConfig = c0inv.LIZ().mEnterRoomConfig;
                    if (enterRoomConfig != null && (logData = enterRoomConfig.mLogData) != null) {
                        str = logData.search_keyword;
                    } else {
                        str = null;
                    }
                    EnterRoomConfig enterRoomConfig2 = c0inv.LIZ().mEnterRoomConfig;
                    if (enterRoomConfig2 != null && (roomsData = enterRoomConfig2.mRoomsData) != null) {
                        str2 = roomsData.enterFromMerge;
                    }
                    if (str != null && !a0.LJJJIL(str) && Intrinsics.LJFF("search_result", str2) && this.LLJZIJLIL == 0) {
                        qS(str, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.LLJZIJLIL != 2 && (fragment = c469320Iao.LLJILJIL) != null) {
                fragment.setUserVisibleHint(true);
            }
            C19EG activity = getActivity();
            List<DrawerTabsItem> list = this.LLJJJJLIIL;
            if (list != null) {
                size = list.size();
            } else {
                size = 0;
            }
            if (!z || activity == null) {
                return;
            }
            LiveDrawerLoadOptSetting liveDrawerLoadOptSetting = LiveDrawerLoadOptSetting.INSTANCE;
            if (liveDrawerLoadOptSetting.getValue() == null) {
                return;
            }
            DrawerLoadOpt value = liveDrawerLoadOptSetting.getValue();
            boolean z3 = value.isPreLoadingForuUI;
            if (size <= 0 || !value.isPreLoadingGameUI) {
                z2 = false;
            }
            if (z3) {
                ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).Cz1(activity, "foru");
            }
            if (!z2) {
                return;
            }
            ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).Cz1(activity, "game");
            return;
        }
        NR();
        RR().setViewPagerPos(0);
        Fragment fragmentVR = VR(this.LLLFFI, true);
        if (fragmentVR == null) {
            return;
        }
        fragmentVR.setUserVisibleHint(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onConfigurationChanged(android.content.res.Configuration r5) {
        /*
            r4 = this;
            super.onConfigurationChanged(r5)
            java.lang.Class<com.bytedance.android.livesdkapi.host.user.IHostPad> r0 = com.bytedance.android.livesdkapi.host.user.IHostPad.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdkapi.host.user.IHostPad r0 = (com.bytedance.android.livesdkapi.host.user.IHostPad) r0
            boolean r0 = r0.isPad()
            if (r0 == 0) goto L4c
            r0 = 1136361472(0x43bb8000, float:375.0)
            float r1 = X.C497740JfY.LIZIZ(r0)
        L18:
            int r2 = (int) r1
        L19:
            if (r2 <= 0) goto L32
            android.widget.RelativeLayout r0 = r4.bS()
            if (r0 == 0) goto L4a
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto L29
            r1.width = r2
        L29:
            android.widget.RelativeLayout r0 = r4.bS()
            if (r0 == 0) goto L32
            X.C786410Ut5.e6(r0, r1)
        L32:
            Y.ARunnableS107S0100000_7 r3 = new Y.ARunnableS107S0100000_7
            r0 = 80
            r3.<init>(r4, r0)
            boolean r1 = r4.LLLFF
            r0 = 1
            if (r1 == r0) goto L49
            android.view.View r2 = r4.getView()
            if (r2 == 0) goto L49
            r0 = 500(0x1f4, double:2.47E-321)
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPostDelay(r2, r3, r0)
        L49:
            return
        L4a:
            r1 = 0
            goto L29
        L4c:
            int r0 = r5.orientation
            boolean r0 = X.C500260Jjc.LJJII(r0)
            if (r0 == 0) goto L64
            int r2 = r4.LLJJJ
            X.19EG r0 = r4.getActivity()
            int r0 = X.C12ES.LJIIJ(r0)
            if (r2 <= r0) goto L61
            r2 = r0
        L61:
            r4.LLJJJ = r2
            goto L19
        L64:
            int r1 = r4.LLJJJ
            X.19EG r0 = r4.getActivity()
            int r0 = X.C12ES.LJIIJ(r0)
            if (r1 <= r0) goto L71
            r1 = r0
        L71:
            float r1 = (float) r1
            r0 = 1112014848(0x42480000, float:50.0)
            float r0 = X.C497740JfY.LIZIZ(r0)
            float r1 = r1 - r0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.drawerfeed.LiveDrawerDialogV3.onConfigurationChanged(android.content.res.Configuration):void");
    }

    @Override // X.C0IKH
    public final void setDataChannel(DataChannel dataChannel) {
        this.LLJJIII = dataChannel;
    }

    public final Fragment VR(String str, boolean z) {
        boolean z2;
        String strLIZIZ;
        EnumC469490Ib5 enumC469490Ib5;
        if (str != null && str.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            return null;
        }
        str.toString();
        if (this.LLJJIJIIJIL.containsKey(str)) {
            return (Fragment) ((LinkedHashMap) this.LLJJIJIIJIL).get(str);
        }
        if (!z) {
            return null;
        }
        if (Intrinsics.LJFF(str, "game_drawer_drops")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append((String) ((LinkedHashMap) this.LLJJIJIL).get("game_drawer_drops"));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = str;
        }
        if (Intrinsics.LJFF(strLIZIZ, "game_drawer")) {
            enumC469490Ib5 = EnumC469490Ib5.GAME_ESPORT;
        } else if (Intrinsics.LJFF(strLIZIZ, "game_drawer_guessing")) {
            enumC469490Ib5 = EnumC469490Ib5.GAME_GUESS;
        } else if (u.LJJIIJZLJL(strLIZIZ, "game_drawer_drops", false)) {
            enumC469490Ib5 = EnumC469490Ib5.GAME_DROPS;
        } else {
            enumC469490Ib5 = EnumC469490Ib5.DEFAULT;
        }
        Fragment fragmentYU = ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).YU(this.LLLI, new C469770IbX(strLIZIZ), enumC469490Ib5);
        fragmentYU.setUserVisibleHint(false);
        this.LLJJIJIIJIL.put(str, fragmentYU);
        return fragmentYU;
    }

    public final void hS(boolean z, EnumC469260Iai enumC469260Iai) {
        Room room;
        String str;
        Room room2;
        LiveDrawerTabLandingCustomSetting liveDrawerTabLandingCustomSetting = LiveDrawerTabLandingCustomSetting.INSTANCE;
        String str2 = "game";
        if (liveDrawerTabLandingCustomSetting.getValue() && enumC469260Iai != EnumC469260Iai.LLILLL) {
            if (this.LLJLIL.LIZIZ(this.LLJJL, z, gS())) {
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                Room room3 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                C469310Ian c469310Ian = this.LLJLIL;
                List<DrawerTabsItem> list = this.LLJJL;
                c469310Ian.getClass();
                boolean value = liveDrawerTabLandingCustomSetting.getValue();
                String str3 = null;
                if (value && (room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class)) != null) {
                    String str4 = room2.drawerTabPosition;
                    if (!c469310Ian.LIZ(str4, list)) {
                        str4 = null;
                    }
                    c469310Ian.LIZ = str4;
                    c469310Ian.LIZIZ = Long.valueOf(room2.getId());
                }
                this.LLJJLIIIJLLLLLLLZ = false;
                this.LLJL = false;
                if (room3 != null) {
                    str3 = room3.drawerTabPosition;
                }
                if ((!TextUtils.equals(str3, "game") || (!LiveDrawerDisableGameLandingSetting.INSTANCE.getValue() && (!LiveDrawerGameLandingFixSetting.INSTANCE.getValue() || LiveDrawerTabLandingSupportTypeSetting.contains("game")))) && room3 != null && (str = room3.drawerTabPosition) != null) {
                    int size = ((ArrayList) this.LLJJL).size();
                    for (int i = 0; i < size; i++) {
                        if (TextUtils.equals(((DrawerTabsItem) ListProtector.get(this.LLJJL, i)).tabType, str)) {
                            this.LLJJLIIIJLLLLLLLZ = true;
                            ZR().setCurrentItem(i);
                            C467800IWc.LJIJ.LJIIIIZZ = str;
                            iS("personal", str);
                            this.LLJL = true;
                        }
                    }
                }
            }
        }
        if (!LiveDrawerDisableGameLandingSetting.INSTANCE.getValue() && C0IKG.LJ() && !this.LLJJLIIIJLLLLLLLZ && ((gS() || z) && (room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class)) != null)) {
            String str5 = room.drawerTabPosition;
            if (TextUtils.isEmpty(str5)) {
                str5 = "foru";
            }
            C467800IWc c467800IWc = C467800IWc.LJIJ;
            if (!c467800IWc.LJFF() && !Intrinsics.LJFF(c467800IWc.LJIIIZ, "game_drawer_guessing")) {
                str2 = str5;
            }
            room.drawerTabPosition = str2;
            String str6 = room.drawerTabPosition;
            if (str6 != null) {
                int size2 = ((ArrayList) this.LLJJL).size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if (TextUtils.equals(((DrawerTabsItem) ListProtector.get(this.LLJJL, i2)).tabType, str6)) {
                        this.LLJJLIIIJLLLLLLLZ = true;
                        DrawerLoadOpt value2 = LiveDrawerLoadOptSetting.INSTANCE.getValue();
                        if (value2 != null && value2.isPreLoadingGameUI) {
                            this.LLJLLIL = false;
                        }
                        ZR().setCurrentItem(i2);
                        C467800IWc.LJIJ.LJIIIIZZ = str6;
                        iS("personal", str6);
                        this.LLJL = true;
                    }
                }
            }
        }
        if (!this.LLJL && !this.LLJJLIIIJLLLLLLLZ && (gS() || z)) {
            this.LLJJLIIIJLLLLLLLZ = true;
            this.LLJLLIL = true;
            ZR().setCurrentItem(0);
            if (!((ArrayList) this.LLJJL).isEmpty()) {
                C467800IWc.LJIJ.LJIIIIZZ = ((DrawerTabsItem) ListProtector.get(this.LLJJL, 0)).tabType;
            } else {
                C467800IWc.LJIJ.LJIIIIZZ = "foru";
            }
            String str7 = C467800IWc.LJIJ.LJIIIIZZ;
            if (str7 == null) {
                str7 = "";
            }
            iS("default", str7);
        }
        this.LLJLILLLLZIIL = C467800IWc.LJIJ.LJIIIIZZ;
    }

    public final void iS(String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_drawer_tab_landing");
        c474500IjALIZ.LJIJJLI(this.LLJJIII);
        c474500IjALIZ.LJJII(str, "landing_reason");
        c474500IjALIZ.LJJII(str2, "tab_type");
        if (Intrinsics.LJFF(str2, "auction")) {
            c474500IjALIZ.LJJII("TEMAI", "EVENT_ORIGIN_FEATURE");
        }
        c474500IjALIZ.LIZ();
        C467800IWc.LJIJ.LJIIL = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0211  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mS(java.util.List r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.drawerfeed.LiveDrawerDialogV3.mS(java.util.List, boolean):void");
    }

    @Override // X.C0IKH
    public final void nt(boolean z, boolean z2) {
        C469810Ibb c469810IbbRR;
        if (!this.LLLFF && (c469810IbbRR = RR()) != null && c469810IbbRR.isAttachedToWindow()) {
            if (z) {
                c469810IbbRR.openDrawer(8388613, z2);
            } else {
                if (!gS()) {
                    return;
                }
                c469810IbbRR.closeDrawer(8388613, z2);
            }
        }
    }

    public final void oS(boolean z, boolean z2) {
        if (z) {
            C786410Ut5.LLFFF(0, UR());
            if (z2 && LiveDrawerSearchEnableSetting.INSTANCE.getValue()) {
                C786410Ut5.LLJJIJIL(SR(), 0);
                C0IUE.LIZ();
            } else {
                C786410Ut5.LLJJIJIL(SR(), 8);
            }
        } else {
            C786410Ut5.LLFFF(8, UR());
            C786410Ut5.LLJJIJIL(SR(), 8);
        }
        C786410Ut5.LJLLLLLL(0, dS());
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int iLIZIZ;
        C19EG c19egLIZIZ;
        Window window;
        this.LLJJJJ = C469460Ib2.LIZ();
        super.onViewCreated(view, bundle);
        this.LLJJ.LIZ(C784440Upu.LIZ().LJ(C469440Ib0.class).LJJLJLI(new AfS176S0100000_7(this, 54)));
        this.LLJJ.LIZ(C784440Upu.LIZ().LJ(DrawerTypeChangeEvent.class).LJJLJLI(new AfS176S0100000_7(this, 55)));
        this.LLJJ.LIZ(C784440Upu.LIZ().LJ(RoomChangeEvent.class).LJJLJLI(new AfS176S0100000_7(this, 56)));
        this.LLJJ.LIZ(C784440Upu.LIZ().LJ(C469380Iau.class).LJJLJLI(new AfS176S0100000_7(this, 57)));
        this.LLJJ.LIZ(C784440Upu.LIZ().LJ(C467850IWh.class).LJJLJLI(new AfS176S0100000_7(this, 58)));
        C472280Ifa c472280Ifa = this.LLJIJIL;
        if (c472280Ifa != null) {
            c472280Ifa.setDrawerLayout(RR());
        }
        RR().addDrawerListener(this.LLLFZ);
        DrawerLayout$DrawerListener drawerLayout$DrawerListener = this.LLJILLL;
        if (drawerLayout$DrawerListener != null) {
            RR().addDrawerListener(drawerLayout$DrawerListener);
        }
        if (!((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad() && ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).XM(getContext()) != 1) {
            iLIZIZ = C12ES.LJIIJ(getContext()) - ((int) C497740JfY.LIZIZ(50.0f));
        } else {
            iLIZIZ = (int) C497740JfY.LIZIZ(375.0f);
        }
        if (iLIZIZ > 0) {
            ViewGroup.LayoutParams layoutParams = bS().getLayoutParams();
            layoutParams.width = iLIZIZ;
            C786410Ut5.e6(bS(), layoutParams);
        }
        int i = this.LLJJJ;
        int iLJIIJ = C12ES.LJIIJ(getContext());
        if (i > iLJIIJ) {
            i = iLJIIJ;
        }
        this.LLJJJ = i;
        UR().setupWithViewPager(ZR());
        UR().addOnTabSelectedListener(new InterfaceC1584740rLE() { // from class: X.0Iaq
            @Override // X.InterfaceC1586460rO0
            public final void Yn(C19U0 c19u0) {
            }

            @Override // X.InterfaceC1586460rO0
            public final void ih(C19U0 c19u0) {
            }

            @Override // X.InterfaceC1586460rO0
            public final void Oq(C19U0 c19u0) {
                int i2;
                String strLJJIJL;
                boolean z = false;
                if (c19u0 != null) {
                    i2 = c19u0.LJ;
                } else {
                    i2 = 0;
                }
                C469320Iao c469320Iao = this.LL.LLJJIJI;
                if (c469320Iao != null) {
                    strLJJIJL = c469320Iao.LJJIJL(i2);
                } else {
                    strLJJIJL = null;
                }
                LiveDrawerDialogV3 liveDrawerDialogV3 = this.LL;
                C19EG activity = liveDrawerDialogV3.getActivity();
                if (activity != null && strLJJIJL != null) {
                    boolean z2 = !liveDrawerDialogV3.LLL.contains(strLJJIJL);
                    if (z2) {
                        liveDrawerDialogV3.LLL.add(strLJJIJL);
                    }
                    if (activity.getViewModelStore().get(strLJJIJL) != null && !z2) {
                        z = true;
                    }
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_drawer_start_loading");
                    c474500IjALIZ.LJJII(strLJJIJL, "tab_type");
                    c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "has_data");
                    c474500IjALIZ.LIZ();
                }
                if (this.LL.LLJJLIIIJLLLLLLLZ) {
                    C467800IWc c467800IWc = C467800IWc.LJIJ;
                    c467800IWc.LJIIL = "auto";
                    c467800IWc.LJIIIIZZ = strLJJIJL;
                }
            }
        });
        ZR().addOnPageChangeListener(new InterfaceC469360Ias() { // from class: X.0Iam
            public boolean LL;
            public boolean LLILLJJLI;

            @Override // X.InterfaceC469360Ias
            public final void onPageScrollStateChanged(int i2) {
                this.LLILLJJLI = true;
                if (i2 != 0) {
                    if (i2 == 1) {
                        this.LL = true;
                        return;
                    }
                    return;
                }
                this.LLILLL.OR();
            }

            @Override // X.InterfaceC469360Ias
            public final void onPageSelected(int i2) {
                String strLJJIJL;
                String str;
                C469320Iao c469320Iao = this.LLILLL.LLJJIJI;
                if (c469320Iao != null) {
                    strLJJIJL = c469320Iao.LJJIJL(i2);
                } else {
                    strLJJIJL = null;
                }
                if (this.LLILLJJLI) {
                    LiveDrawerDialogV3 liveDrawerDialogV3 = this.LLILLL;
                    if (this.LL) {
                        str = "slide";
                    } else {
                        str = "click";
                    }
                    String str2 = liveDrawerDialogV3.LLJLILLLLZIIL;
                    if (liveDrawerDialogV3.LLJLLIL) {
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_drawer_tab_switch");
                        c474500IjALIZ.LJIJJLI(liveDrawerDialogV3.LLJJIII);
                        c474500IjALIZ.LJJII(str, "switch_action");
                        c474500IjALIZ.LJJII("auto", "landing_reason");
                        c474500IjALIZ.LJJII(strLJJIJL, "tab_type");
                        c474500IjALIZ.LJJII(str2, "from_tab_type");
                        if (Intrinsics.LJFF(strLJJIJL, "auction")) {
                            c474500IjALIZ.LJJII("TEMAI", "EVENT_ORIGIN_FEATURE");
                        }
                        c474500IjALIZ.LIZ();
                        C467800IWc.LJIJ.LJIIL = "auto";
                    }
                    liveDrawerDialogV3.LLJLLIL = true;
                    this.LLILLJJLI = false;
                    this.LL = false;
                }
                C467800IWc.LJIJ.LJIIIIZZ = strLJJIJL;
                C0IUA.LJJ = strLJJIJL;
                this.LLILLL.LLJLILLLLZIIL = strLJJIJL;
                if (Intrinsics.LJFF(strLJJIJL, "music_spotlight")) {
                    C784440Upu.LIZ().LIZIZ(new C469280Iak(4));
                }
            }

            @Override // X.InterfaceC469360Ias
            public final void onPageScrolled(int i2, float f, int i3) {
                this.LLILLL.RR().setViewPagerPos(i2);
            }
        });
        C19U1 c19u1UR = UR();
        if (!(c19u1UR instanceof HorizontalScrollView)) {
            c19u1UR = null;
        }
        Context context = getContext();
        if (context != null) {
            final int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            if (c19u1UR != null) {
                c19u1UR.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: X.0Iar
                    @Override // android.view.View.OnScrollChangeListener
                    public final void onScrollChange(View view2, int i2, int i3, int i4, int i5) {
                        if (Math.abs(i2 - i4) > scaledTouchSlop) {
                            this.OR();
                        }
                    }
                });
            }
        }
        C467820IWe.LJ = false;
        C467800IWc.LJIJ.LJIILIIL = false;
        Context context2 = getContext();
        if (context2 != null && (c19egLIZIZ = C1388190mED.LIZIZ(context2)) != null && (window = c19egLIZIZ.getWindow()) != null) {
            window.setBackgroundDrawable(null);
        }
        C786410Ut5.g8(SR(), new ACListenerS142S0100000_7(this, 53));
        if (this.LLLFF) {
            C469810Ibb c469810IbbRR = RR();
            c469810IbbRR.setDrawerLockMode(2);
            this.LLLFZ.onDrawerOpened(c469810IbbRR);
        }
    }

    public final void qS(String str, boolean z) {
        Fragment fragment;
        Fragment fragmentLLLIILIL;
        Fragment fragment2;
        Fragment fragmentLLLIILIL2;
        View viewFindViewById = null;
        if (z) {
            C786410Ut5.LJLLLLLL(8, dS());
            C21594519fD c21594519fDZR = ZR();
            int visibility = c21594519fDZR.getVisibility();
            c21594519fDZR.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c21594519fDZR);
            View view = this.LLJI;
            if (view == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.ua2);
                }
                this.LLJI = (FrameLayout) viewFindViewById;
                view = viewFindViewById;
            }
            C786410Ut5.LJZ(0, (FrameLayout) view);
            if (this.LLJZ == null) {
                this.LLJZ = ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).WM((C469370Iat) this.LLLII.getValue(), new C469420Iay(str));
            }
            InterfaceC469270Iaj interfaceC469270Iaj = this.LLJZ;
            if (interfaceC469270Iaj != null && (fragmentLLLIILIL2 = interfaceC469270Iaj.LLLIILIL()) != null) {
                C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
                if (!fragmentLLLIILIL2.isAdded() && this.LLJZIJLIL != 2) {
                    c19ehLJIIJ.LIZIZ(R.id.ua2, fragmentLLLIILIL2);
                    c19ehLJIIJ.LJIIJ();
                }
            }
            C467800IWc.LJIJ.LJIILIIL = true;
            this.LLJZIJLIL = 2;
            C469320Iao c469320Iao = this.LLJJIJI;
            if (c469320Iao != null && (fragment2 = c469320Iao.LLJILJIL) != null) {
                fragment2.setUserVisibleHint(false);
                return;
            }
            return;
        }
        C786410Ut5.LJLLLLLL(0, dS());
        C21594519fD c21594519fDZR2 = ZR();
        int visibility2 = c21594519fDZR2.getVisibility();
        c21594519fDZR2.setVisibility(0);
        C1602160rnK.LIZIZ(visibility2, 0, c21594519fDZR2);
        View view3 = this.LLJI;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById = view4.findViewById(R.id.ua2);
            }
            this.LLJI = (FrameLayout) viewFindViewById;
            view3 = viewFindViewById;
        }
        C786410Ut5.LJZ(8, (FrameLayout) view3);
        InterfaceC469270Iaj interfaceC469270Iaj2 = this.LLJZ;
        if (interfaceC469270Iaj2 != null && (fragmentLLLIILIL = interfaceC469270Iaj2.LLLIILIL()) != null) {
            C19EH c19ehLJIIJ2 = getChildFragmentManager().LJIIJ();
            if (fragmentLLLIILIL.isAdded()) {
                c19ehLJIIJ2.LJIIZILJ(fragmentLLLIILIL);
            }
            c19ehLJIIJ2.LJIIJ();
        }
        C467800IWc.LJIJ.LJIILIIL = false;
        this.LLJZIJLIL = 0;
        C469320Iao c469320Iao2 = this.LLJJIJI;
        if (c469320Iao2 == null || (fragment = c469320Iao2.LLJILJIL) == null) {
            return;
        }
        fragment.setUserVisibleHint(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewLJFF = C0J3Y.LJFF(C0J3Y.LIZ, R.layout.bmp, viewGroup, false, null, false, 60);
        try {
            ViewTreeLifecycleOwner.set(viewLJFF, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewLJFF, this);
            viewLJFF.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewLJFF;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewLJFF;
        }
    }
}
