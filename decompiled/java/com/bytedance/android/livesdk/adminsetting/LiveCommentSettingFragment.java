package com.bytedance.android.livesdk.adminsetting;

import X.C01C5;
import X.C01GW;
import X.C098200Yq;
import X.C0IJT;
import X.C0TZ7;
import X.C0UX6;
import X.C1161920gLG;
import X.C1548820qPI;
import X.C1685300txQ;
import X.C16F5;
import X.C16FZ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20743716Ff;
import X.C23250099c;
import X.C292401Bi;
import X.C354201Zc;
import X.C452501pT;
import X.C474500IjA;
import X.C475510Ikn;
import X.C488020JBw;
import X.C497740JfY;
import X.C500260Jjc;
import X.C751050Td9;
import X.C751280TdW;
import X.C752120Tes;
import X.C755070Tjd;
import X.C785990UsP;
import X.C786220Usm;
import X.C786410Ut5;
import X.InterfaceC1106030et7;
import X.ViewOnClickListenerC751210TdP;
import Y.ACListenerS147S0100000_12;
import Y.ACListenerS72S0110000_12;
import Y.AObserverS216S0100000_12;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentSchemaConfig;
import com.bytedance.android.livesdk.message.proto.StarCommentConfig;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveCommentSettingFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICHELIOSEgLTE4ICE0ZgklPyoQJyghLCEnGyA4PSY9LwM+KCg+LSs4";
    public String LL;
    public C16FZ LLILLJJLI;
    public FrameLayout LLILLL;
    public LinearLayout LLILZ;
    public C16F5 LLILZIL;
    public C20743716Ff LLILZLL;
    public LinearLayout LLIZ;
    public LinearLayout LLIZLLLIL;
    public C20743716Ff LLJ;
    public C20743716Ff LLJI;
    public C20743716Ff LLJIJIL;
    public LinearLayout LLJILJIL;
    public View LLJILJILJ;
    public View LLJILLL;
    public C16F5 LLJJ;
    public LinearLayout LLJJI;
    public LinearLayout LLJJIII;
    public View LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public C751280TdW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public Function1<? super Boolean, Unit> LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final C785990UsP LLJJL;
    public final C786220Usm LLJJLIIIJLLLLLLLZ;

    public LiveCommentSettingFragment() {
        this(null);
    }

    public final Map NR() {
        HashMap map = new HashMap();
        Room roomRR = RR();
        map.put("room_id", String.valueOf(roomRR != null ? roomRR.getId() : 0L));
        map.put("type", "global_default_on");
        map.put("from_status", InterfaceC1106030et7.J5.LIZIZ().booleanValue() ? "on" : "off");
        map.put("position", "panel");
        return map;
    }

    public final C20743716Ff OR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bey) : null;
            this.LLILZLL = (C20743716Ff) viewFindViewById;
        }
        return (C20743716Ff) viewFindViewById;
    }

    public final View PR() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.hxi) : null;
            this.LLJILJILJ = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final Room RR() {
        return (Room) this.LLJJIJIIJIL.getValue();
    }

    public final boolean SR() {
        return ((Boolean) this.LLJJJIL.getValue()).booleanValue();
    }

    public final View UR() {
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.vxn) : null;
            this.LLJILLL = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final boolean VR() {
        return ((Boolean) this.LLJJJJ.getValue()).booleanValue();
    }

    public final C16FZ getLoadingViewFromXml() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.nnp) : null;
            this.LLILLJJLI = (C16FZ) viewFindViewById;
        }
        return (C16FZ) viewFindViewById;
    }

    public final void WR() {
        StarCommentConfig starCommentConfig;
        LiveMode streamType;
        LiveMode liveMode;
        StarCommentConfig starCommentConfig2;
        Context context = getContext();
        if (context != null) {
            Uri uriLJJL = UriProtector.parse(LiveStarCommentSchemaConfig.INSTANCE.getSettingValue().anchor_settings_scheme);
            View view = getView();
            if (view != null) {
                int height = view.getHeight();
                uriLJJL = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJJL, "height") != null ? C500260Jjc.LJJL(uriLJJL, "height", String.valueOf(((int) C497740JfY.LJJI(height)) + 1)) : uriLJJL.buildUpon().appendQueryParameter("height", String.valueOf(((int) C497740JfY.LJJI(height)) + 1)).build();
            }
            Uri.Builder builderBuildUpon = uriLJJL.buildUpon();
            boolean zLJFF = Intrinsics.LJFF(this.LL, "from_page_preview");
            String str = CardStruct.IStatusCode.DEFAULT;
            builderBuildUpon.appendQueryParameter("is_living", zLJFF ? CardStruct.IStatusCode.DEFAULT : "1");
            View viewUR = UR();
            if (viewUR != null && C500260Jjc.LJJJJIZL(viewUR)) {
                str = "1";
            }
            builderBuildUpon.appendQueryParameter("from_reddot", str);
            if (Intrinsics.LJFF(this.LL, "from_page_preview")) {
                DataChannel dataChannelLJ = C475510Ikn.LJ(this);
                if (dataChannelLJ != null && (starCommentConfig2 = (StarCommentConfig) dataChannelLJ.gg0(C752120Tes.class)) != null) {
                    builderBuildUpon.appendQueryParameter("star_comment_switch", String.valueOf(starCommentConfig2.starCommentSwitch));
                    builderBuildUpon.appendQueryParameter("grant_group", String.valueOf(starCommentConfig2.grantGroup));
                    builderBuildUpon.appendQueryParameter("grant_level", String.valueOf(starCommentConfig2.grantLevel));
                }
            } else {
                Room roomRR = RR();
                if (roomRR != null && (starCommentConfig = roomRR.starCommentConfig) != null) {
                    builderBuildUpon.appendQueryParameter("star_comment_switch", String.valueOf(starCommentConfig.starCommentSwitch));
                    builderBuildUpon.appendQueryParameter("grant_group", String.valueOf(starCommentConfig.grantGroup));
                    builderBuildUpon.appendQueryParameter("grant_level", String.valueOf(starCommentConfig.grantLevel));
                }
            }
            if (Intrinsics.LJFF(this.LL, "from_page_preview")) {
                builderBuildUpon.appendQueryParameter("enter_from", "golive_page");
                DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
                if (dataChannelLJ2 == null || (liveMode = (LiveMode) dataChannelLJ2.gg0(LiveModeChannel.class)) == null) {
                    liveMode = LiveMode.VIDEO;
                }
                builderBuildUpon.appendQueryParameter("live_type", C354201Zc.LIZ(liveMode));
            } else {
                builderBuildUpon.appendQueryParameter("enter_from", "setting_page");
                Room roomRR2 = RR();
                builderBuildUpon.appendQueryParameter("live_type", (roomRR2 == null || (streamType = roomRR2.getStreamType()) == null) ? "" : C354201Zc.LIZ(streamType));
            }
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, builderBuildUpon.build());
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C751280TdW c751280TdW = this.LLJJIJIL;
        if (c751280TdW != null) {
            DataChannelGlobal.LLILZ.zQ2(c751280TdW);
        }
        DataChannelGlobal.LLILZ.zQ2(this);
        C1548820qPI.LJIIIIZZ("star_comment_setting_event", this.LLJJLIIIJLLLLLLLZ);
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIII = null;
        this.LLJJIJI = null;
    }

    public LiveCommentSettingFragment(String str) {
        this.LL = str;
        this.LLJJIJIIJIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 115));
        this.LLJJJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 116));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 117));
        this.LLJJJJ = C292401Bi.LIZ(new AwS556S0100000_12(this, 114));
        this.LLJJL = new C785990UsP(this, 7);
        this.LLJJLIIIJLLLLLLLZ = new C786220Usm(this, 0);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        Room roomRR;
        StarCommentConfig starCommentConfig;
        Room roomRR2;
        RoomAuthStatus roomAuthStatus;
        RoomAuthStatus.StarCommentPermissionSwitch starCommentPermissionSwitch;
        String strLJIJI;
        float f;
        View viewUR;
        DataChannel dataChannelLJ;
        RoomCreateInfo roomCreateInfo;
        DataChannel dataChannelLJ2;
        RoomCreateInfo roomCreateInfo2;
        ViewGroup.LayoutParams layoutParams;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        boolean z2 = true;
        if (arguments != null && arguments.getBoolean("ignore_keyboards_change")) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJJJLIIL = z;
        this.LLJJIJIL = new C751280TdW(requireContext(), this, C475510Ikn.LJ(this), RR(), view, this.LL, SR(), new AObserverS216S0100000_12(this, 20));
        if (!this.LLJJJJLIIL && (layoutParams = view.getLayoutParams()) != null) {
            layoutParams.height = (view.getContext().getResources().getDisplayMetrics().heightPixels * 73) / 100;
            C786410Ut5.W5(view, layoutParams);
        }
        C500260Jjc.LLFFF(getLoadingViewFromXml());
        View viewFindViewById = this.LLILLL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.bmy);
            } else {
                viewFindViewById = null;
            }
            this.LLILLL = (FrameLayout) viewFindViewById;
        }
        C786410Ut5.O7((FrameLayout) viewFindViewById, new ACListenerS147S0100000_12(this, 89));
        if (C755070Tjd.LIZ(VR())) {
            View viewFindViewById3 = this.LLILZIL;
            if (viewFindViewById3 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById3 = view3.findViewById(R.id.yip);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLILZIL = (C16F5) viewFindViewById3;
            }
            ((TextView) viewFindViewById3).setText(getString(2131841262));
        } else {
            View viewFindViewById4 = this.LLILZ;
            if (viewFindViewById4 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById4 = view4.findViewById(R.id.bez);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLILZ = (LinearLayout) viewFindViewById4;
            }
            C786410Ut5.LJZL(8, (LinearLayout) viewFindViewById4);
        }
        SR();
        C20743716Ff c20743716FfOR = OR();
        c20743716FfOR.setChecked(InterfaceC1106030et7.J5.LIZIZ().booleanValue());
        if (RR() != null && C755070Tjd.LIZ(VR())) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_anchor_translation_show");
            c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this));
            c474500IjALIZ.LJJIIZI(NR());
            c474500IjALIZ.LIZ();
        }
        C786410Ut5.A7(c20743716FfOR, new C785990UsP(this, 8));
        View viewFindViewById5 = this.LLIZ;
        if (viewFindViewById5 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById5 = view5.findViewById(R.id.c3i);
            } else {
                viewFindViewById5 = null;
            }
            this.LLIZ = (LinearLayout) viewFindViewById5;
        }
        C786410Ut5.R7((LinearLayout) viewFindViewById5, new ACListenerS147S0100000_12(this, 90));
        View viewFindViewById6 = this.LLIZLLLIL;
        if (viewFindViewById6 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById6 = view6.findViewById(R.id.xix);
            } else {
                viewFindViewById6 = null;
            }
            this.LLIZLLLIL = (LinearLayout) viewFindViewById6;
        }
        C786410Ut5.R7((LinearLayout) viewFindViewById6, new ACListenerS147S0100000_12(this, 91));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C751050Td9(this, null), 3);
        View viewFindViewById7 = this.LLJILJIL;
        if (viewFindViewById7 == null) {
            View view7 = getView();
            if (view7 != null) {
                viewFindViewById7 = view7.findViewById(R.id.hxh);
            } else {
                viewFindViewById7 = null;
            }
            this.LLJILJIL = (LinearLayout) viewFindViewById7;
        }
        C786410Ut5.R7((LinearLayout) viewFindViewById7, new ACListenerS147S0100000_12(this, 92));
        if (!Intrinsics.LJFF(this.LL, "from_page_preview") ? (roomRR = RR()) == null || (starCommentConfig = roomRR.starCommentConfig) == null || !starCommentConfig.starCommentQualification || (roomRR2 = RR()) == null || (roomAuthStatus = roomRR2.getRoomAuthStatus()) == null || (starCommentPermissionSwitch = roomAuthStatus.starCommentPermissionSwitch) == null || starCommentPermissionSwitch.status != 2 : (dataChannelLJ = C475510Ikn.LJ(this)) == null || (roomCreateInfo = (RoomCreateInfo) dataChannelLJ.gg0(RoomCreateInfoChannel.class)) == null || !roomCreateInfo.anchorStarCommentPermission || (dataChannelLJ2 = C475510Ikn.LJ(this)) == null || (roomCreateInfo2 = (RoomCreateInfo) dataChannelLJ2.gg0(RoomCreateInfoChannel.class)) == null || roomCreateInfo2.starCommentPermissionSwitch) {
            z2 = false;
        }
        C751280TdW c751280TdW = this.LLJJIJIL;
        if (c751280TdW != null && c751280TdW.LIZJ() && !z2 && !Intrinsics.LJFF(InterfaceC1106030et7.D4.LIZIZ().get("2"), Boolean.FALSE) && (viewUR = UR()) != null) {
            C500260Jjc.LLFFF(viewUR);
        }
        View viewFindViewById8 = this.LLJJ;
        if (viewFindViewById8 == null) {
            View view8 = getView();
            if (view8 != null) {
                viewFindViewById8 = view8.findViewById(R.id.c3m);
            } else {
                viewFindViewById8 = null;
            }
            this.LLJJ = (C16F5) viewFindViewById8;
        }
        TextView textView = (TextView) viewFindViewById8;
        C0TZ7 c0tz7 = C0TZ7.LIZ;
        DataChannel dataChannelLJ3 = C475510Ikn.LJ(this);
        c0tz7.getClass();
        if (C0TZ7.LIZIZ(dataChannelLJ3)) {
            strLJIJI = C497740JfY.LJIJI(2131835607);
        } else {
            strLJIJI = C497740JfY.LJIJI(2131842673);
        }
        textView.setText(strLJIJI);
        View viewFindViewById9 = this.LLJJI;
        if (viewFindViewById9 == null) {
            View view9 = getView();
            if (view9 != null) {
                viewFindViewById9 = view9.findViewById(R.id.vxg);
            } else {
                viewFindViewById9 = null;
            }
            this.LLJJI = (LinearLayout) viewFindViewById9;
        }
        LinearLayout linearLayout = (LinearLayout) viewFindViewById9;
        if (z2) {
            f = 0.34f;
        } else {
            f = 1.0f;
        }
        C786410Ut5.W4(linearLayout, f);
        View viewFindViewById10 = this.LLJJI;
        if (viewFindViewById10 == null) {
            View view10 = getView();
            if (view10 != null) {
                viewFindViewById10 = view10.findViewById(R.id.vxg);
            } else {
                viewFindViewById10 = null;
            }
            this.LLJJI = (LinearLayout) viewFindViewById10;
        }
        C786410Ut5.R7((LinearLayout) viewFindViewById10, new ViewOnClickListenerC751210TdP(new ACListenerS72S0110000_12(this, z2, 2)));
        if (SR()) {
            View viewFindViewById11 = this.LLJJIII;
            if (viewFindViewById11 == null) {
                View view11 = getView();
                if (view11 != null) {
                    viewFindViewById11 = view11.findViewById(R.id.oyd);
                } else {
                    viewFindViewById11 = null;
                }
                this.LLJJIII = (LinearLayout) viewFindViewById11;
            }
            C786410Ut5.R7((LinearLayout) viewFindViewById11, new ACListenerS147S0100000_12(this, 88));
            C0UX6 c0ux6 = C0UX6.LIVE_BROADCAST_PREVIEW_MUTE_RULE;
            View view12 = this.LLJJIJI;
            if (view12 == null) {
                View view13 = getView();
                if (view13 != null) {
                    viewFindViewById2 = view13.findViewById(R.id.xiz);
                }
                this.LLJJIJI = viewFindViewById2;
            } else {
                viewFindViewById2 = view12;
            }
            RedDotExtensionKt.LJI(viewFindViewById2, this, null, c0ux6, null);
        }
        C1548820qPI.LIZLLL("star_comment_setting_event", this.LLJJLIIIJLLLLLLLZ);
        RedDotExtensionKt.LJI(PR(), this, null, C0UX6.LIVE_BROADCAST_PREVIEW_FILTER_COMMENT, null);
        if (VR()) {
            RedDotExtensionKt.LJI(PR(), this, null, C0UX6.COMMUNITY_FLAG_COMMENT_FILTER, null);
        } else {
            RedDotExtensionKt.LJI(PR(), this, null, C0UX6.COMMUNITY_FLAG_COMMENT_ADMIN_FILTER, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        int i;
        if (VR() || (C01C5.LIZ(C475510Ikn.LJ(this)) && C488020JBw.LIZ(RR()))) {
            z = true;
        } else {
            z = false;
        }
        if (!SR() && !z) {
            i = R.layout.gak;
        } else {
            i = R.layout.gan;
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
