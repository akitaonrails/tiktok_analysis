package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.C01GW;
import X.C0IJT;
import X.C0UOP;
import X.C0UVE;
import X.C0UX6;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1108110ewT;
import X.C1119170fEJ;
import X.C1161920gLG;
import X.C1548820qPI;
import X.C16F5;
import X.C1826730xdX;
import X.C1834350xpp;
import X.C1871910yoP;
import X.C19EH;
import X.C20337914i1;
import X.C20736316Cj;
import X.C20743716Ff;
import X.C21578619ce;
import X.C2188811AlT;
import X.C262100zr;
import X.C2845018h;
import X.C292401Bi;
import X.C354201Zc;
import X.C444140HbI;
import X.C474500IjA;
import X.C475510Ikn;
import X.C492400JSs;
import X.C494680Jac;
import X.C497740JfY;
import X.C499490JiN;
import X.C499850Jix;
import X.C499860Jiy;
import X.C500260Jjc;
import X.C517530KRj;
import X.C518420KUu;
import X.C521520Kco;
import X.C748880TZe;
import X.C758410Tp1;
import X.C770730ULf;
import X.C771670UOv;
import X.C781270Ukn;
import X.C786410Ut5;
import X.InterfaceC1106030et7;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC2262081DgM;
import X.InterfaceC492460JSy;
import X.InterfaceC493650JXn;
import X.InterfaceC500690JkJ;
import X.InterfaceC513260KAy;
import Y.ACListenerS147S0100000_12;
import Y.ACListenerS74S0300000_7;
import Y.ARunnableS107S0100000_7;
import android.content.Context;
import android.os.Looper;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.broadcast.LiveOnGoingGoalChannel;
import com.bytedance.android.livesdk.dataChannel.IsSubscribeEnable;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.highlight.LiveRecordingsSettingsEnableSetting;
import com.bytedance.android.livesdk.livesetting.highlight.LiveReplayHighlightRecoverSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS289S0000000_6;
import kotlin.jvm.internal.AFwS290S0000000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class BasePreviewSettingMainFragmentSheet extends LiveSheetFragment implements InterfaceC1141530foN {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4Zz8hLTMlLDh9PyHELIOSwoLionZjYpPTs6JiJiCy4gLRU+LDk6LTIfLDsnISsrBC46JgM+KCg+LSs4Gic2LTE=";
    public LinearLayout LLJLLL;
    public View LLJZ;
    public LinearLayout LLJZIJLIL;
    public C20743716Ff LLL;
    public C16F5 LLLF;
    public LinearLayout LLLFF;
    public LinearLayout LLLFFI;
    public LinearLayout LLLFZ;
    public C20743716Ff LLLI;
    public LiveIconView LLLII;
    public View LLLIIII;
    public LinearLayout LLLIIIIL;
    public LinearLayout LLLIIIL;
    public C16F5 LLLIIL;
    public LinearLayout LLLIILIL;
    public LinearLayout LLLIL;
    public LinearLayout LLLILZ;
    public C16F5 LLLILZJ;
    public C16F5 LLLILZLLLI;
    public LinearLayout LLLIZZ;
    public C20743716Ff LLLJ;
    public LinearLayout LLLJIL;
    public View LLLJL;
    public LinearLayout LLLL;
    public View LLLLII;
    public LinearLayout LLLLIIIILLL;
    public C16F5 LLLLIIL;
    public C16F5 LLLLIILL;
    public View LLLLIILLL;
    public C20743716Ff LLLLIL;
    public LiveIconView LLLLILI;
    public LinearLayout LLLLJ;
    public LinearLayout LLLLJI;
    public View LLLLL;
    public LinearLayout LLLLLIL;
    public LinearLayout LLLLLILLIL;
    public C20743716Ff LLLLLJIL;
    public View LLLLLJLJLL;
    public C20743716Ff LLLLLL;
    public C21578619ce LLLLLLIL;
    public BasePreviewSettingMainFragmentSheetInitializer LLLLLLJ;
    public boolean LLLLLLLLL;
    public long LLLLLLLLLL;
    public long LLLLLLLZIL;
    public View LLLLLLZ;
    public View LLLLLLZZ;
    public final InterfaceC493650JXn LLLLLZL;
    public final BPEAHandler LLLLZ;
    public final C01GW LLLLLLL = C292401Bi.LIZ(AFwS193S0000000_7.get$arr$(22));
    public final C499860Jiy LLLLLZ = new C499860Jiy();
    public final C01GW LLLLLZIL = C292401Bi.LIZ(AFwS193S0000000_7.get$arr$(23));

    public final void ES() {
        View viewFindViewById = this.LLJLLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.dct) : null;
            this.LLJLLL = (LinearLayout) viewFindViewById;
        }
        View viewFindViewById2 = this.LLLI;
        if (viewFindViewById2 == null) {
            View view2 = getView();
            viewFindViewById2 = view2 != null ? view2.findViewById(R.id.dcu) : null;
            this.LLLI = (C20743716Ff) viewFindViewById2;
        }
        C20743716Ff c20743716Ff = (C20743716Ff) viewFindViewById2;
        View view3 = this.LLLII;
        if (view3 == null) {
            View view4 = getView();
            View viewFindViewById3 = view4 != null ? view4.findViewById(R.id.dcm) : null;
            this.LLLII = (LiveIconView) viewFindViewById3;
            view3 = viewFindViewById3;
        }
        LiveIconView liveIconView = (LiveIconView) view3;
        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = this.LLLLLLJ;
        if (basePreviewSettingMainFragmentSheetInitializer != null) {
            basePreviewSettingMainFragmentSheetInitializer.LJIIJJI(viewFindViewById, c20743716Ff, liveIconView);
        }
    }

    public final void FS() {
        View viewFindViewById = this.LLLFZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ek7) : null;
            this.LLLFZ = (LinearLayout) viewFindViewById;
        }
        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = this.LLLLLLJ;
        if (basePreviewSettingMainFragmentSheetInitializer != null) {
            basePreviewSettingMainFragmentSheetInitializer.LJIILIIL(viewFindViewById);
        }
    }

    public final void GS() {
        View viewFindViewById = this.LLLFF;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kie) : null;
            this.LLLFF = (LinearLayout) viewFindViewById;
        }
        View view2 = this.LLJZ;
        if (view2 == null) {
            View view3 = getView();
            View viewFindViewById2 = view3 != null ? view3.findViewById(R.id.kig) : null;
            this.LLJZ = viewFindViewById2;
            view2 = viewFindViewById2;
        }
        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = this.LLLLLLJ;
        if (basePreviewSettingMainFragmentSheetInitializer != null) {
            basePreviewSettingMainFragmentSheetInitializer.LJIIZILJ(viewFindViewById, view2);
        }
    }

    public final void HS() {
        LiveMode liveMode;
        View viewFindViewById = this.LLLIILIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.myp) : null;
            this.LLLIILIL = (LinearLayout) viewFindViewById;
        }
        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = this.LLLLLLJ;
        if (basePreviewSettingMainFragmentSheetInitializer != null) {
            DataChannel dataChannel = basePreviewSettingMainFragmentSheetInitializer.LLILLJJLI;
            if (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null) {
                liveMode = LiveMode.VIDEO;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_settings_goal_icon_show");
            c474500IjALIZ.LJIJJLI(basePreviewSettingMainFragmentSheetInitializer.LLILLJJLI);
            c474500IjALIZ.LJIILJJIL("live_take_page");
            int i = C2845018h.LIZ[liveMode.ordinal()];
            c474500IjALIZ.LJJII(i != 1 ? i != 2 ? "third_party" : "screen_share" : "video_live", "live_type");
            c474500IjALIZ.LIZ();
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById);
            }
            ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).syncGiftList(1);
            UserService.getInstance().user().LJIJ(UserService.getInstance().user().getCurrentUserId());
            C1548820qPI.LIZLLL("live_goal_update_event", basePreviewSettingMainFragmentSheetInitializer);
            DataChannel dataChannel2 = basePreviewSettingMainFragmentSheetInitializer.LLILLJJLI;
            if (dataChannel2 != null) {
                dataChannel2.EQ2(basePreviewSettingMainFragmentSheetInitializer.LL, LiveOnGoingGoalChannel.class, new AwS586S0100000_7(basePreviewSettingMainFragmentSheetInitializer, 384));
            }
            if (viewFindViewById != null) {
                C500260Jjc.LJLIIIL(500L, viewFindViewById, new AwS586S0100000_7(basePreviewSettingMainFragmentSheetInitializer, 385));
                C444140HbI.LIZ(viewFindViewById, AFwS289S0000000_6.get$arr$(43));
            }
        }
    }

    public final void QS() {
        LiveMode liveMode;
        C0UOP c0uop;
        C0UOP c0uop2;
        if (this.LLLLLLLLL) {
            return;
        }
        this.LLLLLLLLL = true;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_management_entrance_show");
        c474500IjALIZ.LJJII("live_take_page", "show_entrance");
        long jCurrentTimeMillis = System.currentTimeMillis();
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        long j = 0;
        c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis - ((dataChannelLJ == null || (c0uop2 = (C0UOP) dataChannelLJ.gg0(C758410Tp1.class)) == null) ? 0L : c0uop2.LIZ)), "tti_duration");
        c474500IjALIZ.LIZ();
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_subscribe_icon_show");
        c474500IjALIZ2.LJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        c474500IjALIZ2.LJJII("anchor", "user_type");
        c474500IjALIZ2.LJJII("live_take_page", "show_entrance");
        DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
        boolean zLIZJ = dataChannelLJ2 != null ? C518420KUu.LIZJ(dataChannelLJ2) : false;
        DataChannel dataChannelLJ3 = C475510Ikn.LJ(this);
        c474500IjALIZ2.LJJIIZI(C494680Jac.LJJIFFI(zLIZJ, dataChannelLJ3 != null ? C518420KUu.LIZLLL(dataChannelLJ3) : false, true));
        DataChannel dataChannelLJ4 = C475510Ikn.LJ(this);
        if (dataChannelLJ4 == null || (liveMode = (LiveMode) dataChannelLJ4.gg0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        c474500IjALIZ2.LJJII(C354201Zc.LIZ(liveMode), "live_type");
        View view = this.LLLLLLZZ;
        c474500IjALIZ2.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(view != null && view.getVisibility() == 0)) ? 1 : 0), "have_red_dot");
        if (BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ2.LJIJ())) {
            c474500IjALIZ2.LJJIJLIJ();
            c474500IjALIZ2.LJJIJIL();
            c474500IjALIZ2.LJJIJL();
        } else {
            c474500IjALIZ2.LIZ();
        }
        InterfaceC513260KAy interfaceC513260KAyLIZIZ = C1826730xdX.LIZIZ();
        if (interfaceC513260KAyLIZIZ != null) {
            int iHashCode = hashCode();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            DataChannel dataChannelLJ5 = C475510Ikn.LJ(this);
            if (dataChannelLJ5 != null && (c0uop = (C0UOP) dataChannelLJ5.gg0(C758410Tp1.class)) != null) {
                j = c0uop.LIZ;
            }
            interfaceC513260KAyLIZIZ.LIZLLL("SubEntranceBeforeLive", new C517530KRj(iHashCode, 40, jCurrentTimeMillis2 - j, "live_take_page", null));
        }
    }

    public final boolean RS() {
        Object objGg0;
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isCoin()) {
            return false;
        }
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ == null || (objGg0 = dataChannelLJ.gg0(LiveModeChannel.class)) == null) {
            objGg0 = LiveMode.VIDEO;
        }
        return User.sShowSubEntranceGoLive || LiveMode.SCREEN_RECORD == objGg0 || LiveMode.THIRD_PARTY == objGg0;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131853493));
        c1119170fEJ.LJI = false;
        return c1119170fEJ;
    }

    public final void zS() {
        View viewFindViewById = this.LLJZIJLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.any) : null;
            this.LLJZIJLIL = (LinearLayout) viewFindViewById;
        }
        View viewFindViewById2 = this.LLL;
        if (viewFindViewById2 == null) {
            View view2 = getView();
            viewFindViewById2 = view2 != null ? view2.findViewById(R.id.ao2) : null;
            this.LLL = (C20743716Ff) viewFindViewById2;
        }
        C20743716Ff c20743716Ff = (C20743716Ff) viewFindViewById2;
        View view3 = this.LLLF;
        if (view3 == null) {
            View view4 = getView();
            View viewFindViewById3 = view4 != null ? view4.findViewById(R.id.anz) : null;
            this.LLLF = (C16F5) viewFindViewById3;
            view3 = viewFindViewById3;
        }
        C16F5 c16f5 = (C16F5) view3;
        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = this.LLLLLLJ;
        if (basePreviewSettingMainFragmentSheetInitializer != null) {
            basePreviewSettingMainFragmentSheetInitializer.LJIIIZ(viewFindViewById, c20743716Ff, c16f5);
        }
    }

    public BasePreviewSettingMainFragmentSheet() {
        C781270Ukn.LJJIII().pa();
        this.LLLLLZL = C1108110ewT.LIZJ();
        this.LLLLZ = new BPEAHandler(Looper.getMainLooper());
    }

    public final void BS() {
        View viewFindViewById;
        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer;
        View view = getView();
        if (view == null || (viewFindViewById = view.findViewById(R.id.bdl)) == null || (basePreviewSettingMainFragmentSheetInitializer = this.LLLLLLJ) == null) {
            return;
        }
        C500260Jjc.LLFFF(viewFindViewById);
        C786410Ut5.I7(new ACListenerS147S0100000_12(basePreviewSettingMainFragmentSheetInitializer, 316), viewFindViewById);
        C444140HbI.LIZ(viewFindViewById, AFwS290S0000000_7.get$arr$(18));
    }

    public final void XS() {
        Boolean bool;
        if (RS()) {
            View view = this.LLLLLLZ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            this.LLLLLLLLLL = System.currentTimeMillis();
            QS();
            C781270Ukn.LJJIII().pa();
            C1108110ewT.LJI();
            InterfaceC493650JXn interfaceC493650JXn = this.LLLLLZL;
            if (interfaceC493650JXn != null) {
                interfaceC493650JXn.LJI(new InterfaceC492460JSy() { // from class: X.0Jgy
                    @Override // X.InterfaceC492460JSy
                    public final void LIZIZ(Throwable th) {
                    }

                    @Override // X.InterfaceC492460JSy
                    public final void LIZ() {
                        if (this.LIZ.RS()) {
                            return;
                        }
                        View view2 = this.LIZ.LLLLLLZ;
                        if (view2 != null) {
                            C786410Ut5.LJLLLLLL(8, view2);
                        }
                        C781270Ukn.LJJIII().pa();
                        C1108110ewT.LJFF();
                    }
                });
            }
            View view2 = this.LLLLLLZZ;
            if (view2 == null || view2.getVisibility() != 0) {
                RedDotExtensionKt.LJI(this.LLLLLLZZ, this, null, C0UX6.LIVE_BROADCAST_PREVIEW_SUBSCRIPTION, null);
                RedDotExtensionKt.LJI(this.LLLLLLZZ, this, null, C0UX6.LIVE_BROADCAST_PREVIEW_CUSTOM_DISCOUNT, null);
            }
            if (C500260Jjc.LJJJJIZL(getView())) {
                QS();
                DataChannel dataChannelLJ = C475510Ikn.LJ(this);
                if (dataChannelLJ != null && (bool = (Boolean) dataChannelLJ.gg0(IsSubscribeEnable.class)) != null) {
                    bool.booleanValue();
                }
            }
            C499850Jix c499850Jix = this.LLLLLZ.LIZJ;
            c499850Jix.getClass();
            ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).registerHostWS(50331740, 1, c499850Jix.LIZIZ);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C1548820qPI.LJIIIIZZ("anchor_subscribe_invitation_accepted", this);
        C1548820qPI.LJIIIIZZ("open_native_subscription_settings", this);
        C1548820qPI.LJIIIIZZ("close_native_subscription_settings", this);
        InterfaceC493650JXn interfaceC493650JXn = this.LLLLLZL;
        if (interfaceC493650JXn != null) {
            interfaceC493650JXn.onDestroy();
        }
        C499850Jix c499850Jix = this.LLLLLZ.LIZJ;
        c499850Jix.getClass();
        ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).unRegisterHostWS(50331740, 1, c499850Jix.LIZIZ);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        InterfaceC500690JkJ interfaceC500690JkJ;
        super.onDestroyView();
        this.LLJLLL = null;
        this.LLJZ = null;
        this.LLJZIJLIL = null;
        this.LLL = null;
        this.LLLF = null;
        this.LLLFF = null;
        this.LLLFFI = null;
        this.LLLFZ = null;
        this.LLLI = null;
        this.LLLII = null;
        this.LLLIIII = null;
        this.LLLIIIIL = null;
        this.LLLIIIL = null;
        this.LLLIIL = null;
        this.LLLIILIL = null;
        this.LLLIL = null;
        this.LLLILZ = null;
        this.LLLILZJ = null;
        this.LLLILZLLLI = null;
        this.LLLIZZ = null;
        this.LLLJ = null;
        this.LLLJIL = null;
        this.LLLJL = null;
        this.LLLL = null;
        this.LLLLII = null;
        this.LLLLIIIILLL = null;
        this.LLLLIIL = null;
        this.LLLLIILL = null;
        this.LLLLIILLL = null;
        this.LLLLIL = null;
        this.LLLLILI = null;
        this.LLLLJ = null;
        this.LLLLJI = null;
        this.LLLLL = null;
        this.LLLLLIL = null;
        this.LLLLLILLIL = null;
        this.LLLLLJIL = null;
        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = this.LLLLLLJ;
        if (basePreviewSettingMainFragmentSheetInitializer == null || (interfaceC500690JkJ = basePreviewSettingMainFragmentSheetInitializer.LLJJI) == null) {
            return;
        }
        interfaceC500690JkJ.release();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = this.LLLLLLJ;
        if (basePreviewSettingMainFragmentSheetInitializer != null) {
            basePreviewSettingMainFragmentSheetInitializer.onResume(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = this.LLLLLLJ;
        if (basePreviewSettingMainFragmentSheetInitializer != null) {
            basePreviewSettingMainFragmentSheetInitializer.onStart(this);
        }
    }

    public final void JS(View view) {
        View viewFindViewById;
        if (!LiveRecordingsSettingsEnableSetting.INSTANCE.enable() || C770730ULf.LJ(C475510Ikn.LJ(this))) {
            return;
        }
        View viewFindViewById2 = null;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.n4x);
            viewFindViewById2 = view.findViewById(R.id.n4y);
        } else {
            viewFindViewById = null;
        }
        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = this.LLLLLLJ;
        if (basePreviewSettingMainFragmentSheetInitializer != null) {
            basePreviewSettingMainFragmentSheetInitializer.LJIJ(viewFindViewById, viewFindViewById2);
        }
    }

    public final void NS(View view) {
        View viewFindViewById;
        C20743716Ff c20743716Ff;
        TextView textView;
        boolean z;
        if (LiveRecordingsSettingsEnableSetting.INSTANCE.enable() || !LiveReplayHighlightRecoverSetting.INSTANCE.enable() || C770730ULf.LJ(C475510Ikn.LJ(this))) {
            return;
        }
        Integer numLIZ = null;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.syk);
            c20743716Ff = (C20743716Ff) view.findViewById(R.id.sym);
            textView = (TextView) view.findViewById(R.id.syl);
        } else {
            viewFindViewById = null;
            c20743716Ff = null;
            textView = null;
        }
        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = this.LLLLLLJ;
        if (basePreviewSettingMainFragmentSheetInitializer != null) {
            basePreviewSettingMainFragmentSheetInitializer.LLJL = viewFindViewById;
            C500260Jjc.LLFFF(viewFindViewById);
            if (basePreviewSettingMainFragmentSheetInitializer.LLJI) {
                C1834350xpp.LIZ.getClass();
                numLIZ = C1834350xpp.LJII.LIZ();
            } else {
                C499490JiN c499490JiNLIZJ = C771670UOv.LIZJ();
                if (c499490JiNLIZJ != null) {
                    numLIZ = c499490JiNLIZJ.LIZ;
                }
            }
            if (c20743716Ff != null) {
                c20743716Ff.setClickable(true);
            }
            if (c20743716Ff != null) {
                if (numLIZ != null && numLIZ.intValue() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                c20743716Ff.setChecked(z);
                C786410Ut5.k8(c20743716Ff, new ACListenerS74S0300000_7(basePreviewSettingMainFragmentSheetInitializer, c20743716Ff, numLIZ, 6));
            }
            if (textView != null) {
                textView.setClickable(true);
                String strLJIJI = C497740JfY.LJIJI(2131855671);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C497740JfY.LJIJI(2131850524));
                sbLIZ.append(' ');
                sbLIZ.append(strLJIJI);
                textView.setText(basePreviewSettingMainFragmentSheetInitializer.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), strLJIJI, new C521520Kco(basePreviewSettingMainFragmentSheetInitializer, c20743716Ff, 5)));
                textView.setLinksClickable(true);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setHighlightColor(0);
            }
        }
    }

    public final void PS(boolean z) {
        String str;
        Object objValueOf;
        SubscribeInfo subscribeInfo;
        if (z) {
            str = "livesdk_subscribe_icon_service_update_red_dot_click";
        } else {
            str = "livesdk_subscribe_icon_service_update_red_dot_show";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this));
        c474500IjALIZ.LJJII("subscription_upgrades_to_fan_plus", "show_reason");
        c474500IjALIZ.LJJII("live_take_page", "page_name");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
        if (currentUser != null && (subscribeInfo = currentUser.getSubscribeInfo()) != null) {
            objValueOf = Integer.valueOf(subscribeInfo.getSubscriberCount());
        } else {
            objValueOf = 0L;
        }
        c474500IjALIZ.LJJII(objValueOf, "active_sub_cnt");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.exw, context);
    }

    public final void US(View view) {
        View viewFindViewById = view.findViewById(R.id.mc5);
        C16F5 c16f5 = (C16F5) view.findViewById(R.id.noa);
        CompoundButton compoundButton = (CompoundButton) view.findViewById(R.id.noo);
        View viewFindViewById2 = view.findViewById(R.id.nop);
        if (this.LLLLLLJ != null) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            DataChannel dataChannelLJ = C475510Ikn.LJ(this);
            IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class);
            if (iRoomFunctionService != null) {
                iRoomFunctionService.YO(viewFindViewById, c16f5, compoundButton, viewFindViewById2, parentFragmentManager, null, dataChannelLJ);
            }
        }
    }

    public final void VS(View view) {
        C16F5 c16f5 = (C16F5) view.findViewById(R.id.no_);
        View viewFindViewById = view.findViewById(R.id.mc6);
        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = this.LLLLLLJ;
        if (basePreviewSettingMainFragmentSheetInitializer != null) {
            basePreviewSettingMainFragmentSheetInitializer.LJJJJL(viewFindViewById, c16f5, C475510Ikn.LJ(this));
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(2, null);
        return sheetOptions;
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String strLJFF;
        IHostSubscription iHostSubscription;
        FragmentManager fragmentManager;
        Class<?> cls;
        C19EH c19ehLJIIJ;
        String strLJFF2;
        DataChannel dataChannelLJ;
        FragmentManager fragmentManager2;
        List<Fragment> listLJJLIIIJL;
        Class<?> cls2;
        C19EH c19ehLJIIJ2;
        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = this.LLLLLLJ;
        if (basePreviewSettingMainFragmentSheetInitializer != null) {
            basePreviewSettingMainFragmentSheetInitializer.mh2(c262100zr);
        }
        String str = c262100zr.LIZ;
        int iHashCode = str.hashCode();
        if (iHashCode != -1710760782) {
            if (iHashCode != 1268793102) {
                if (iHashCode == 1514286020 && str.equals("close_native_subscription_settings")) {
                    InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                    if (interfaceC1107590evd != null) {
                        strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd, "type", "");
                    } else {
                        strLJFF2 = null;
                    }
                    if (Intrinsics.LJFF(strLJFF2, "popup") && (dataChannelLJ = C475510Ikn.LJ(this)) != null && (fragmentManager2 = (FragmentManager) dataChannelLJ.gg0(C748880TZe.class)) != null && (listLJJLIIIJL = fragmentManager2.LJJLIIIJL()) != null) {
                        for (Fragment fragment : listLJJLIIIJL) {
                            Class<?> cls3 = fragment.getClass();
                            Object value = this.LLLLLZIL.getValue();
                            if (value != null) {
                                cls2 = value.getClass();
                            } else {
                                cls2 = null;
                            }
                            if (Intrinsics.LJFF(cls3, cls2) && (fragment instanceof LiveDialogFragment) && ((LiveDialogFragment) fragment).isShowing() && (c19ehLJIIJ2 = fragmentManager2.LJIIJ()) != null) {
                                c19ehLJIIJ2.LJIILL(fragment);
                                c19ehLJIIJ2.LJIIJ();
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (str.equals("anchor_subscribe_invitation_accepted")) {
                show();
                C786410Ut5.LJLIIL(600L, this.LLLLZ, new ARunnableS107S0100000_7(this, 18));
                return;
            }
            return;
        }
        if (str.equals("open_native_subscription_settings")) {
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 != null) {
                strLJFF = C1871910yoP.LJFF(interfaceC1107590evd2, "type", "");
            } else {
                strLJFF = null;
            }
            boolean z = false;
            if (Intrinsics.LJFF(strLJFF, "popup")) {
                DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
                if (dataChannelLJ2 != null && (fragmentManager = (FragmentManager) dataChannelLJ2.gg0(C748880TZe.class)) != null) {
                    List<Fragment> listLJJLIIIJL2 = fragmentManager.LJJLIIIJL();
                    if (listLJJLIIIJL2 != null) {
                        for (Fragment fragment2 : listLJJLIIIJL2) {
                            Class<?> cls4 = fragment2.getClass();
                            Object value2 = this.LLLLLZIL.getValue();
                            if (value2 != null) {
                                cls = value2.getClass();
                            } else {
                                cls = null;
                            }
                            if (Intrinsics.LJFF(cls4, cls)) {
                                if ((fragment2 instanceof LiveDialogFragment) && !((LiveDialogFragment) fragment2).isShowing() && (c19ehLJIIJ = fragmentManager.LJIIJ()) != null) {
                                    c19ehLJIIJ.LJJIFFI(fragment2);
                                    c19ehLJIIJ.LJIIJ();
                                }
                                z = true;
                            }
                        }
                        if (z) {
                            return;
                        }
                    }
                    LiveDialogFragment liveDialogFragment = (LiveDialogFragment) this.LLLLLZIL.getValue();
                    if (liveDialogFragment != null) {
                        C492400JSs.LIZ(liveDialogFragment, fragmentManager, "BasePreviewSettingMainFragment");
                        return;
                    }
                    return;
                }
                return;
            }
            Context context = getContext();
            if (context != null && (iHostSubscription = (IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)) != null) {
                iHostSubscription.EB0(context, 0, "creator_tools_page");
            }
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/android/livesdk/broadcast/preview/widget/setting/BasePreviewSettingMainFragmentSheet", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyHvo93dVp1FXRkZIqIyTgw9n8C2RnQE4MhcKxWkbItydTgoWVm7cPlFVU=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = this.LLLLLLJ;
        if (basePreviewSettingMainFragmentSheetInitializer != null) {
            basePreviewSettingMainFragmentSheetInitializer.onHiddenChanged(z);
        }
    }

    public final void uS(boolean z) {
        String str;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C0UVE.LIZLLL(str);
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        C20337914i1<Map<String, Boolean>> c20337914i1 = InterfaceC1106030et7.O8;
        Map<String, Boolean> mapLIZIZ = c20337914i1.LIZIZ();
        mapLIZIZ.put(strValueOf, Boolean.valueOf(z));
        c20337914i1.LJFF(mapLIZIZ);
    }

    public final void wS(View view) {
        View viewFindViewById;
        C16F5 c16f5;
        View viewFindViewById2 = null;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.aqu);
            c16f5 = (C16F5) view.findViewById(R.id.aqw);
            viewFindViewById2 = view.findViewById(R.id.aqv);
        } else {
            viewFindViewById = null;
            c16f5 = null;
        }
        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = this.LLLLLLJ;
        if (basePreviewSettingMainFragmentSheetInitializer != null) {
            basePreviewSettingMainFragmentSheetInitializer.LJI(viewFindViewById, viewFindViewById2, c16f5);
        }
    }

    public final void yS(View view) {
        View viewFindViewById;
        View viewFindViewById2;
        C16F5 c16f5 = null;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.ao0);
            viewFindViewById2 = view.findViewById(R.id.ao1);
            c16f5 = (C16F5) view.findViewById(R.id.art);
        } else {
            viewFindViewById = null;
            viewFindViewById2 = null;
        }
        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = this.LLLLLLJ;
        if (basePreviewSettingMainFragmentSheetInitializer != null) {
            basePreviewSettingMainFragmentSheetInitializer.LJII(viewFindViewById, viewFindViewById2, c16f5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0870  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x095c  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0966  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0974  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x099f  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x09aa  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x09cd  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x09da  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x09e3  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x09f0  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x09f6  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0a7b  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0ac9  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0ad0  */
    /* JADX WARN: Removed duplicated region for block: B:534:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v18, types: [T, android.os.BaseBundle, android.os.Bundle] */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r30, android.os.Bundle r31) {
        /*
            Method dump skipped, instruction units count: 2830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheet.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View dS(android.view.LayoutInflater r3, android.view.ViewGroup r4, android.os.Bundle r5) {
        /*
            r2 = this;
            boolean r0 = X.C760180Trs.LJII()
            if (r0 == 0) goto L2f
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = X.C475510Ikn.LJ(r2)
            if (r1 == 0) goto L2d
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.LiveModeChannel> r0 = com.bytedance.android.livesdk.dataChannel.LiveModeChannel.class
            java.lang.Object r0 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = (com.bytedance.android.livesdkapi.depend.model.live.LiveMode) r0
            if (r0 == 0) goto L2d
            boolean r0 = X.C354201Zc.LJFF(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L1e:
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 == 0) goto L2f
            r1 = 2131568179(0x7f0d2633, float:1.8761949E38)
        L27:
            r0 = 0
            android.view.View r0 = X.C786410Ut5.Td(r3, r1, r4, r0)
            return r0
        L2d:
            r0 = 0
            goto L1e
        L2f:
            r1 = 2131568181(0x7f0d2635, float:1.8761953E38)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheet.dS(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
