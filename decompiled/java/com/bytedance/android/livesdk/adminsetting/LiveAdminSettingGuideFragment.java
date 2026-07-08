package com.bytedance.android.livesdk.adminsetting;

import X.C01C6;
import X.C01GW;
import X.C098200Yq;
import X.C0IJT;
import X.C0KXJ;
import X.C0UIM;
import X.C0UX6;
import X.C1161920gLG;
import X.C1685300txQ;
import X.C16F5;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20743716Ff;
import X.C2188811AlT;
import X.C292401Bi;
import X.C474500IjA;
import X.C475510Ikn;
import X.C489080JFy;
import X.C500260Jjc;
import X.C786410Ut5;
import X.EnumC748580TYa;
import Y.ACListenerS147S0100000_12;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.broadcast.api.RestartLiveFromSettingEvent;
import com.bytedance.android.live.liveinteract.api.FunKitVisibleEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.AdminPermissionUpdateChannel;
import com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.viewerwishes.datachannel.ViewerWishesStatus;
import com.bytedance.android.livesdk.livesetting.broadcast.HostAddLocationSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorHashTagHideSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.RestartLiveSetting;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS221S0300000_12;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS65S0210000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveAdminSettingGuideFragment extends BaseFragment implements View.OnClickListener {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICEgHELIOSLTE4ICE0ZgklPyoSLCglJxw2PDElJygUPSwoLAkhKSIhLCEn";
    public final C01GW LL = C292401Bi.LIZ(new AwS556S0100000_12(this, 90));
    public C16F5 LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public View LLILZLL;
    public View LLIZ;
    public View LLIZLLLIL;
    public View LLJ;
    public View LLJI;
    public View LLJIJIL;
    public View LLJILJIL;
    public View LLJILJILJ;
    public View LLJILLL;
    public View LLJJ;
    public View LLJJI;
    public View LLJJIII;
    public View LLJJIJI;
    public View LLJJIJIIJIL;
    public View LLJJIJIL;
    public View LLJJJ;
    public ViewGroup LLJJJIL;
    public ViewGroup LLJJJJ;
    public View LLJJJJJIL;
    public View LLJJJJLIIL;
    public C16F5 LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public LiveAdminSettingGuideAdapter LLJL;

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        LiveAdminSettingGuideAdapter liveAdminSettingGuideAdapter = this.LLJL;
        if (liveAdminSettingGuideAdapter != null) {
            liveAdminSettingGuideAdapter.onDestroy(this);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        LiveAdminSettingGuideAdapter liveAdminSettingGuideAdapter = this.LLJL;
        if (liveAdminSettingGuideAdapter != null) {
            liveAdminSettingGuideAdapter.onResume(this);
        }
    }

    public final void NR(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("livesdk_anchor_restart_");
        sbLIZ.append(str);
        C474500IjA c474500IjALIZ = C0IJT.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this));
        c474500IjALIZ.LJJII("live_take_detail", "event_page");
        c474500IjALIZ.LJJII("anchor", "user_type");
        c474500IjALIZ.LJJII("more_panel", "panel_type");
        c474500IjALIZ.LIZ();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null && view.getId() == R.id.tda) {
            DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
            if (dataChannelLJ2 != null) {
                dataChannelLJ2.FQ2(RestartLiveFromSettingEvent.class);
            }
            NR("click");
            EnumC748580TYa enumC748580TYa = EnumC748580TYa.DISMISS;
            enumC748580TYa.next();
            dataChannelLJ.zW(BroadcastDialogPageChannel.class, enumC748580TYa);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C20743716Ff c20743716Ff;
        C16F5 c16f5;
        View view2;
        long jLongValue;
        String str;
        Room room;
        Hashtag hashtag;
        Long l;
        boolean zLJFF;
        Room room2;
        UserAttr userAttrLIZ;
        RoomAuthStatus roomAuthStatus;
        AnchorLevelPermission anchorLevelPermission;
        Map<Integer, Integer> map;
        Integer num;
        int i;
        View viewFindViewById;
        View viewFindViewById2;
        super.onViewCreated(view, bundle);
        C16F5 c16f52 = null;
        LiveAdminSettingGuideAdapter liveAdminSettingGuideAdapter = new LiveAdminSettingGuideAdapter(this, C475510Ikn.LJ(this), null, this);
        this.LLJL = liveAdminSettingGuideAdapter;
        liveAdminSettingGuideAdapter.onViewCreated(view);
        LiveAnchorHashTagHideSetting liveAnchorHashTagHideSetting = LiveAnchorHashTagHideSetting.INSTANCE;
        if (liveAnchorHashTagHideSetting.enable() && (viewFindViewById2 = view.findViewById(R.id.yfa)) != null) {
            C500260Jjc.LJIILIIL(viewFindViewById2);
        }
        this.LLILLJJLI = (C16F5) view.findViewById(R.id.tv_title);
        view.findViewById(R.id.desc);
        this.LLJILJIL = view.findViewById(R.id.t00);
        this.LLJJJ = view.findViewById(R.id.d6a);
        this.LLJJLIIIJLLLLLLLZ = view.findViewById(R.id.tda);
        if (liveAnchorHashTagHideSetting.enable() && (viewFindViewById = view.findViewById(R.id.yfa)) != null) {
            C500260Jjc.LJIILIIL(viewFindViewById);
        }
        C16F5 c16f53 = this.LLILLJJLI;
        if (c16f53 != null) {
            if (((Boolean) this.LL.getValue()).booleanValue()) {
                i = 2131842655;
            } else {
                i = 2131843853;
            }
            c16f53.setText(i);
        }
        View viewFindViewById3 = view.findViewById(R.id.rg7);
        this.LLILZ = viewFindViewById3;
        LiveAdminSettingGuideAdapter liveAdminSettingGuideAdapter2 = this.LLJL;
        boolean z = false;
        if (liveAdminSettingGuideAdapter2 != null) {
            DataChannel dataChannel = liveAdminSettingGuideAdapter2.LLILLJJLI;
            if (dataChannel != null) {
                dataChannel.EQ2(liveAdminSettingGuideAdapter2.LLILZ, ViewerWishesStatus.class, new AwS586S0100000_7(viewFindViewById3, 0));
            }
            DataChannel dataChannel2 = liveAdminSettingGuideAdapter2.LLILLJJLI;
            if (dataChannel2 != null) {
                room2 = (Room) dataChannel2.gg0(RoomChannel.class);
            } else {
                room2 = null;
            }
            if (liveAdminSettingGuideAdapter2.LIZJ() || (((userAttrLIZ = C0KXJ.LIZ()) != null && (map = userAttrLIZ.adminPermissions) != null && (num = map.get(12)) != null && num.intValue() == 0) || (room2 != null && (roomAuthStatus = room2.getRoomAuthStatus()) != null && (anchorLevelPermission = roomAuthStatus.anchorLevelPermission) != null && anchorLevelPermission.poll == 0))) {
                C500260Jjc.LJLJLJ(viewFindViewById3, false);
            } else {
                C500260Jjc.LJLJLJ(viewFindViewById3, true);
                liveAdminSettingGuideAdapter2.LJI("show", "poll_vote");
            }
            if (viewFindViewById3 != null) {
                C786410Ut5.I7(new ACListenerS147S0100000_12(liveAdminSettingGuideAdapter2, 3), viewFindViewById3);
            }
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.nz5);
        this.LLJJJIL = viewGroup;
        if (viewGroup != null) {
            c20743716Ff = (C20743716Ff) viewGroup.findViewById(R.id.nz3);
        } else {
            c20743716Ff = null;
        }
        ViewGroup viewGroup2 = this.LLJJJIL;
        if (viewGroup2 != null) {
            c16f5 = (C16F5) viewGroup2.findViewById(R.id.nz7);
        } else {
            c16f5 = null;
        }
        ViewGroup viewGroup3 = this.LLJJJIL;
        if (viewGroup3 != null) {
            c16f52 = (C16F5) viewGroup3.findViewById(R.id.nz0);
        }
        LiveAdminSettingGuideAdapter liveAdminSettingGuideAdapter3 = this.LLJL;
        if (liveAdminSettingGuideAdapter3 != null) {
            liveAdminSettingGuideAdapter3.ne2(this.LLJJJIL, c16f5, c16f52, c20743716Ff);
        }
        this.LLJJJJ = (ViewGroup) view.findViewById(R.id.bg8);
        C16F5 c16f54 = (C16F5) view.findViewById(R.id.bg_);
        View viewFindViewById4 = view.findViewById(R.id.bga);
        LiveAdminSettingGuideAdapter liveAdminSettingGuideAdapter4 = this.LLJL;
        if (liveAdminSettingGuideAdapter4 != null) {
            liveAdminSettingGuideAdapter4.ww1(this.LLJJJJ, viewFindViewById4, c16f54);
        }
        this.LLIZ = view.findViewById(R.id.edg);
        View viewFindViewById5 = view.findViewById(R.id.edf);
        this.LLJI = viewFindViewById5;
        LiveAdminSettingGuideAdapter liveAdminSettingGuideAdapter5 = this.LLJL;
        if (liveAdminSettingGuideAdapter5 != null) {
            liveAdminSettingGuideAdapter5.qk1(viewFindViewById5, this.LLIZ);
        }
        View viewFindViewById6 = view.findViewById(R.id.szz);
        this.LLJIJIL = viewFindViewById6;
        LiveAdminSettingGuideAdapter liveAdminSettingGuideAdapter6 = this.LLJL;
        if (liveAdminSettingGuideAdapter6 != null) {
            liveAdminSettingGuideAdapter6.Ol1(viewFindViewById6);
        }
        View viewFindViewById7 = view.findViewById(R.id.o06);
        this.LLJILLL = viewFindViewById7;
        LiveAdminSettingGuideAdapter liveAdminSettingGuideAdapter7 = this.LLJL;
        if (liveAdminSettingGuideAdapter7 != null) {
            liveAdminSettingGuideAdapter7.CY0(viewFindViewById7);
        }
        View viewFindViewById8 = view.findViewById(R.id.oy6);
        this.LLJJ = viewFindViewById8;
        LiveAdminSettingGuideAdapter liveAdminSettingGuideAdapter8 = this.LLJL;
        if (liveAdminSettingGuideAdapter8 != null) {
            liveAdminSettingGuideAdapter8.tp0(viewFindViewById8);
        }
        View viewFindViewById9 = view.findViewById(R.id.m3f);
        this.LLJJI = viewFindViewById9;
        LiveAdminSettingGuideAdapter liveAdminSettingGuideAdapter9 = this.LLJL;
        if (liveAdminSettingGuideAdapter9 != null) {
            liveAdminSettingGuideAdapter9.OZ(viewFindViewById9);
        }
        this.LLJJJJJIL = view.findViewById(R.id.ao0);
        this.LLJJL = (C16F5) view.findViewById(R.id.m6_);
        C16F5 c16f55 = (C16F5) view.findViewById(R.id.wv7);
        LiveAdminSettingGuideAdapter liveAdminSettingGuideAdapter10 = this.LLJL;
        if (liveAdminSettingGuideAdapter10 != null) {
            liveAdminSettingGuideAdapter10.hd0(this.LLJJJJJIL, c16f55, this.LLJJL);
        }
        C16F5 c16f56 = (C16F5) view.findViewById(R.id.aqw);
        View viewFindViewById10 = view.findViewById(R.id.aqv);
        View viewFindViewById11 = view.findViewById(R.id.aqu);
        this.LLJJJJLIIL = viewFindViewById11;
        LiveAdminSettingGuideAdapter liveAdminSettingGuideAdapter11 = this.LLJL;
        if (liveAdminSettingGuideAdapter11 != null) {
            liveAdminSettingGuideAdapter11.WN2(viewFindViewById11, viewFindViewById10, c16f56);
        }
        if (RestartLiveSetting.INSTANCE.getConfig().getEnable() && ((Boolean) this.LL.getValue()).booleanValue()) {
            C500260Jjc.LLFFF(this.LLJJLIIIJLLLLLLLZ);
            NR("show");
        } else {
            C500260Jjc.LJIILIIL(this.LLJJLIIIJLLLLLLLZ);
        }
        this.LLILLL = view.findViewById(R.id.ojm);
        View viewFindViewById12 = view.findViewById(R.id.nz8);
        this.LLJILJILJ = viewFindViewById12;
        LiveAdminSettingGuideAdapter liveAdminSettingGuideAdapter12 = this.LLJL;
        if (liveAdminSettingGuideAdapter12 != null) {
            liveAdminSettingGuideAdapter12.Oj1(viewFindViewById12, this.LLILLL);
        }
        View viewFindViewById13 = view.findViewById(R.id.srb);
        this.LLJ = viewFindViewById13;
        LiveAdminSettingGuideAdapter liveAdminSettingGuideAdapter13 = this.LLJL;
        if (liveAdminSettingGuideAdapter13 != null) {
            liveAdminSettingGuideAdapter13.ON1(viewFindViewById13);
        }
        View viewFindViewById14 = view.findViewById(R.id.ooj);
        this.LLILZLL = viewFindViewById14;
        LiveAdminSettingGuideAdapter liveAdminSettingGuideAdapter14 = this.LLJL;
        if (liveAdminSettingGuideAdapter14 != null) {
            boolean zLIZ = C489080JFy.LIZ(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).QZ(), 2);
            DataChannel dataChannel3 = liveAdminSettingGuideAdapter14.LLILLJJLI;
            if (dataChannel3 != null) {
                dataChannel3.EQ2(liveAdminSettingGuideAdapter14.LLILZ, FunKitVisibleEvent.class, new AwS65S0210000_12(liveAdminSettingGuideAdapter14, viewFindViewById14, zLIZ, 0));
            }
            DataChannel dataChannel4 = liveAdminSettingGuideAdapter14.LLILLJJLI;
            if (dataChannel4 != null) {
                zLJFF = Intrinsics.LJFF(dataChannel4.gg0(FunKitVisibleEvent.class), Boolean.TRUE);
            } else {
                zLJFF = false;
            }
            liveAdminSettingGuideAdapter14.LJII(viewFindViewById14, zLIZ, zLJFF);
            if (viewFindViewById14 != null) {
                C786410Ut5.I7(new ACListenerS147S0100000_12(liveAdminSettingGuideAdapter14, 5), viewFindViewById14);
            }
        }
        View viewFindViewById15 = view.findViewById(R.id.ooz);
        this.LLILZIL = viewFindViewById15;
        LiveAdminSettingGuideAdapter liveAdminSettingGuideAdapter15 = this.LLJL;
        if (liveAdminSettingGuideAdapter15 != null) {
            if (C489080JFy.LIZ(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).QZ(), 2) && !liveAdminSettingGuideAdapter15.LIZJ() && ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).yk1()) {
                C500260Jjc.LJLJLJ(viewFindViewById15, true);
                liveAdminSettingGuideAdapter15.LJI("show", "multi_guest_settings");
                if (viewFindViewById15 != null) {
                    C786410Ut5.I7(new ACListenerS147S0100000_12(liveAdminSettingGuideAdapter15, 6), viewFindViewById15);
                }
            } else {
                C500260Jjc.LJLJLJ(viewFindViewById15, false);
            }
        }
        this.LLJJIJIIJIL = view.findViewById(R.id.ojg);
        View viewFindViewById16 = view.findViewById(R.id.ojh);
        this.LLJJIJIL = viewFindViewById16;
        LiveAdminSettingGuideAdapter liveAdminSettingGuideAdapter16 = this.LLJL;
        if (liveAdminSettingGuideAdapter16 != null && (view2 = this.LLJJIJIIJIL) != null) {
            ((IGameService) C1161920gLG.LIZJ(IGameService.class)).na1();
            if (C500260Jjc.LJJIJIIJIL(Boolean.valueOf(C01C6.LIZ(liveAdminSettingGuideAdapter16.LLILLJJLI)))) {
                C500260Jjc.LJLJLJ(view2, false);
            } else {
                C500260Jjc.LJLJLJ(view2, true);
                C500260Jjc.LJLIIIL(500L, view2, new AwS378S0200000_12(viewFindViewById16, liveAdminSettingGuideAdapter16, 0));
                if (viewFindViewById16 != null) {
                    boolean zLJIILLIIL = RedDotExtensionKt.LJIILLIIL(C0UX6.RED_DOT_AUDIENCE_MODERATOR_GUIDE_TIPS);
                    C500260Jjc.LJLJLJ(viewFindViewById16, zLJIILLIIL);
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_moderator_settings_guide_icon");
                    c474500IjALIZ.LJIJJLI(liveAdminSettingGuideAdapter16.LLILLJJLI);
                    c474500IjALIZ.LJ("show");
                    DataChannel dataChannel5 = liveAdminSettingGuideAdapter16.LLILLJJLI;
                    if (dataChannel5 != null && (room = (Room) dataChannel5.gg0(RoomChannel.class)) != null && (hashtag = room.hashtag) != null && (l = hashtag.id) != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "choose_hashtag_id");
                    if (zLJIILLIIL) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    c474500IjALIZ.LJJII(str, "has_red_dot");
                    c474500IjALIZ.LIZ();
                }
            }
        }
        this.LLJJIII = view.findViewById(R.id.iql);
        View viewFindViewById17 = view.findViewById(R.id.iqm);
        this.LLJJIJI = viewFindViewById17;
        LiveAdminSettingGuideAdapter liveAdminSettingGuideAdapter17 = this.LLJL;
        if (liveAdminSettingGuideAdapter17 != null) {
            View view3 = this.LLJJIII;
            liveAdminSettingGuideAdapter17.LJFF(view3, viewFindViewById17);
            DataChannel dataChannel6 = liveAdminSettingGuideAdapter17.LLILLJJLI;
            if (dataChannel6 != null) {
                dataChannel6.BQ2(liveAdminSettingGuideAdapter17.LLILZ, AdminPermissionUpdateChannel.class, new AwS221S0300000_12(liveAdminSettingGuideAdapter17, view3, viewFindViewById17, 0));
            }
        }
        View view4 = this.LLJJJ;
        if (C500260Jjc.LJJJJIZL(this.LLILZ) || C500260Jjc.LJJJJIZL(this.LLJJIII)) {
            z = true;
        }
        C500260Jjc.LJLJLJ(view4, z);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.BQ2(this, AdminPermissionUpdateChannel.class, new AwS591S0100000_12(this, 147));
        }
        View view5 = this.LLJJLIIIJLLLLLLLZ;
        if (view5 != null) {
            C786410Ut5.I7(this, view5);
        }
        this.LLIZLLLIL = view.findViewById(R.id.ghz);
        C20743716Ff c20743716Ff2 = (C20743716Ff) view.findViewById(R.id.ghy);
        LiveAdminSettingGuideAdapter liveAdminSettingGuideAdapter18 = this.LLJL;
        if (liveAdminSettingGuideAdapter18 != null) {
            liveAdminSettingGuideAdapter18.di0(this.LLIZLLLIL, c20743716Ff2);
        }
        View viewFindViewById18 = view.findViewById(R.id.kif);
        LiveAdminSettingGuideAdapter liveAdminSettingGuideAdapter19 = this.LLJL;
        if (liveAdminSettingGuideAdapter19 != null) {
            liveAdminSettingGuideAdapter19.sh1(viewFindViewById18);
        }
        if (((Boolean) this.LL.getValue()).booleanValue()) {
            if (HostAddLocationSetting.INSTANCE.enable()) {
                View viewFindViewById19 = view.findViewById(R.id.mc6);
                C16F5 c16f57 = (C16F5) view.findViewById(R.id.no_);
                LiveAdminSettingGuideAdapter liveAdminSettingGuideAdapter20 = this.LLJL;
                if (liveAdminSettingGuideAdapter20 != null) {
                    liveAdminSettingGuideAdapter20.Wm2(viewFindViewById19, c16f57);
                    return;
                }
                return;
            }
            View viewFindViewById20 = view.findViewById(R.id.mc5);
            C16F5 c16f58 = (C16F5) viewFindViewById20.findViewById(R.id.no9);
            CompoundButton compoundButton = (CompoundButton) viewFindViewById20.findViewById(R.id.noo);
            View viewFindViewById21 = viewFindViewById20.findViewById(R.id.nop);
            LiveAdminSettingGuideAdapter liveAdminSettingGuideAdapter21 = this.LLJL;
            if (liveAdminSettingGuideAdapter21 == null) {
                return;
            }
            liveAdminSettingGuideAdapter21.cW1(viewFindViewById20, c16f58, compoundButton, viewFindViewById21, getParentFragmentManager(), null, C475510Ikn.LJ(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (C0UIM.LIZ()) {
            i = R.layout.g8_;
        } else {
            i = R.layout.g89;
        }
        View viewTd = C786410Ut5.Td(layoutInflater, i, viewGroup, false);
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
