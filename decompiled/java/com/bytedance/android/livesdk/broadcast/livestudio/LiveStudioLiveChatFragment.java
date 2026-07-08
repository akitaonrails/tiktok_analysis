package com.bytedance.android.livesdk.broadcast.livestudio;

import X.C01GW;
import X.C098200Yq;
import X.C0IK5;
import X.C0RT0;
import X.C1078030e9x;
import X.C1083340eIW;
import X.C1108110ewT;
import X.C1161920gLG;
import X.C11NJ;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2222371ByV;
import X.C437170HCh;
import X.C486790J7d;
import X.C781270Ukn;
import X.C786410Ut5;
import X.InterfaceC781200Ukg;
import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.extendedscreen.ExtendedScreenWidget;
import com.bytedance.android.live.browser.IHybridStorageService;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.qa.IQAService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.api.revenue.IRevenueService;
import com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService;
import com.bytedance.android.livesdk.api.revenue.starcomment.StarCommentEntranceVisibleEvent;
import com.bytedance.android.livesdk.broadcast.video.layer.VideoLayeredElementManager;
import com.bytedance.android.livesdk.chatroom.viewmodule.EndWidget;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.customizedperks.CustomizedPerksCardWidget;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subgoal.SubGoalCardWidget;
import com.bytedance.android.livesdk.dataChannel.CommentOrMessageData;
import com.bytedance.android.livesdk.dataChannel.WidgetLoadedEvent;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastPoorDeviceDelayDurationSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LayeredWidgetManager;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetNonOpProvider;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveStudioLiveChatFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4HELIOSZyM6PiA/PTo3ISpiBSYlLRY4PCs6JwklPyoQICQ4Dz0yLygpJzs=";
    public C0RT0 LL;
    public DataChannel LLILLJJLI;
    public Room LLILLL;
    public LayeredWidgetManager LLILZ;
    public Object LLILZIL;
    public InterfaceC781200Ukg LLILZLL;
    public final C11NJ LLIZ = new C11NJ();

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        Room room = this.LLILLL;
        if (room != null) {
            long id = room.getId();
            IMessageManager iMessageManager = C781270Ukn.LJIILLIIL().get(id);
            if (iMessageManager != null) {
                iMessageManager.stopMessage(new C2222371ByV(0));
            }
            C781270Ukn.LIZLLL().Dh0(id);
        }
        C781270Ukn.LJJIIZ().tf1();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ.LJ();
        C781270Ukn.LJIL().LLLF(this.LLILLL, this.LLILLJJLI);
        C781270Ukn.LJIJI().LLLF(this.LLILLL, this.LLILLJJLI);
        C781270Ukn.LJIJI().Ac2(this.LLILLL);
        C781270Ukn.LJJIII().pa();
        C1108110ewT.LJ(this.LLILLJJLI);
        C781270Ukn.LJIJ().pa().LIZJ();
        C781270Ukn.LJJIIZ().tf1();
        this.LL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        boolean z;
        DataChannel dataChannel;
        LiveWidget liveNameFrameWidget;
        RoomAuthStatus roomAuthStatus;
        RoomAuthStatus roomAuthStatus2;
        super.onActivityCreated(bundle);
        if (getView() == null) {
            return;
        }
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null) {
            dataChannel2.CQ2(WidgetLoadedEvent.class, this, new AwS591S0100000_12(this, 223));
        }
        Room room = this.LLILLL;
        if (room != null && (roomAuthStatus2 = room.getRoomAuthStatus()) != null && !roomAuthStatus2.isAnchorGiftEnable()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            LiveWidget giftWidget = C781270Ukn.LJII().getGiftWidget(null, this.LLILZ);
            LayeredWidgetManager layeredWidgetManager = this.LLILZ;
            if (layeredWidgetManager != null) {
                layeredWidgetManager.load(R.id.video_animate_container, (Widget) giftWidget, true);
            }
        }
        Room room2 = this.LLILLL;
        if ((room2 == null || (roomAuthStatus = room2.getRoomAuthStatus()) == null || roomAuthStatus.isMessageEnable()) && (dataChannel = this.LLILLJJLI) != null) {
            dataChannel.zW(CommentOrMessageData.class, Boolean.TRUE);
        }
        Handler handlerLIZ = C0IK5.LIZ();
        ARunnableS112S0100000_12 aRunnableS112S0100000_12 = new ARunnableS112S0100000_12(this, 471);
        LiveBroadcastPoorDeviceDelayDurationSetting liveBroadcastPoorDeviceDelayDurationSetting = LiveBroadcastPoorDeviceDelayDurationSetting.INSTANCE;
        C786410Ut5.LJLIIL(liveBroadcastPoorDeviceDelayDurationSetting.value(), handlerLIZ, aRunnableS112S0100000_12);
        LayeredWidgetManager layeredWidgetManager2 = this.LLILZ;
        if (layeredWidgetManager2 != null) {
            IRevenueService iRevenueService = (IRevenueService) C1161920gLG.LIZJ(IRevenueService.class);
            if (iRevenueService != null) {
                liveNameFrameWidget = iRevenueService.getLiveNameFrameWidget();
            } else {
                liveNameFrameWidget = null;
            }
            layeredWidgetManager2.load(liveNameFrameWidget);
        }
        LayeredWidgetManager layeredWidgetManager3 = this.LLILZ;
        if (layeredWidgetManager3 != null) {
            layeredWidgetManager3.load(R.id.user_info_container, C781270Ukn.LJJIIZI().S92(), true, new Object[]{new C1078030e9x(SystemClock.elapsedRealtime())});
        }
        C786410Ut5.LJLIIL(liveBroadcastPoorDeviceDelayDurationSetting.value(), C0IK5.LIZ(), new ARunnableS112S0100000_12(this, 470));
        if (this.LLILZIL == null && ((IStarCommentService) C1161920gLG.LIZJ(IStarCommentService.class)).ce0(this.LLILLL)) {
            this.LLILZIL = ((IStarCommentService) C1161920gLG.LIZJ(IStarCommentService.class)).L42(this, this.LLILLJJLI);
        } else {
            DataChannel dataChannel3 = this.LLILLJJLI;
            if (dataChannel3 != null) {
                dataChannel3.zW(StarCommentEntranceVisibleEvent.class, Boolean.FALSE);
            }
            Context context = getContext();
            if (context != null) {
                ((IHybridStorageService) C1161920gLG.LIZJ(IHybridStorageService.class)).CM(context, 0, "star_comment_entrance_visible", null);
            }
        }
        LayeredWidgetManager layeredWidgetManager4 = this.LLILZ;
        if (layeredWidgetManager4 != null) {
            layeredWidgetManager4.load(R.id.sqk, ((IRankService) C1161920gLG.LIZJ(IRankService.class)).BC0());
        }
        LayeredWidgetManager layeredWidgetManager5 = this.LLILZ;
        if (layeredWidgetManager5 != null) {
            C781270Ukn.LJJIII().pa().getClass();
            layeredWidgetManager5.load(R.id.fdx, CustomizedPerksCardWidget.class);
        }
        LayeredWidgetManager layeredWidgetManager6 = this.LLILZ;
        if (layeredWidgetManager6 != null) {
            C781270Ukn.LJJIII().pa().getClass();
            layeredWidgetManager6.load(R.id.weq, SubGoalCardWidget.class);
        }
        LayeredWidgetManager layeredWidgetManager7 = this.LLILZ;
        if (layeredWidgetManager7 != null) {
            layeredWidgetManager7.load(R.id.mue, ExtendedScreenWidget.class, true);
        }
        LayeredWidgetManager layeredWidgetManager8 = this.LLILZ;
        if (layeredWidgetManager8 != null) {
            layeredWidgetManager8.load(R.id.ea1, ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).aF());
        }
        LayeredWidgetManager layeredWidgetManager9 = this.LLILZ;
        if (layeredWidgetManager9 != null) {
            layeredWidgetManager9.load(R.id.h5d, new EndWidget());
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C1083340eIW c1083340eIW;
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            Context context = getContext();
            if (view instanceof C1083340eIW) {
                c1083340eIW = (C1083340eIW) view;
            } else {
                c1083340eIW = null;
            }
            LayeredWidgetManager layeredWidgetManagerOf = LayeredWidgetManager.Companion.of(false, this, view, LiveWidgetNonOpProvider.Companion.getInstance(), C486790J7d.LIZ, new VideoLayeredElementManager(context, this, c1083340eIW, dataChannel));
            layeredWidgetManagerOf.setCheckContentViewAttached(true);
            this.LLILZ = layeredWidgetManagerOf;
            C01GW c01gw = C781270Ukn.LJJIJ;
            this.LLILZLL = ((IUserManageService) c01gw.getValue()).Re1(this, dataChannel, this.LLIZ);
            C781270Ukn.LJJIIZ().hd2(getContext(), this, dataChannel, true, this);
            ((IUserManageService) c01gw.getValue()).Re1(this, dataChannel, this.LLIZ);
        }
        C781270Ukn.LJIL().rV0(this, this.LLILLL, this.LLILLJJLI, false);
        C781270Ukn.LJIJI().gu(this.LLILLL, this.LLILLJJLI, this);
        C781270Ukn.LJJIII().pa();
        C1108110ewT.LIZIZ(this.LLILLL, this.LLILLJJLI, this);
        C781270Ukn.LJIJ().pa().getClass();
        C781270Ukn.LIZLLL().dJ0(this, this.LLILLJJLI, null);
        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).initPublicScreenConfiguration();
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).initPublicScreenConfiguration();
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).initPublicScreenConfiguration();
        ((IQAService) C1161920gLG.LIZJ(IQAService.class)).initPublicScreenConfiguration();
        ((IGameService) C1161920gLG.LIZJ(IGameService.class)).initPublicScreenConfiguration();
        ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).pa().LIZLLL();
        ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).pa().LIZIZ();
        ((IStarCommentService) C1161920gLG.LIZJ(IStarCommentService.class)).initPublicScreenConfiguration();
        ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).initPublicScreenConfiguration();
        ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).My2();
        ((IAdminSettingService) C1161920gLG.LIZJ(IAdminSettingService.class)).Ft0();
        ((IRankService) C1161920gLG.LIZJ(IRankService.class)).Tj2(view);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ggn, viewGroup, false);
        C437170HCh.LIZ(viewTd, this);
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
