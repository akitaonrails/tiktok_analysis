package com.bytedance.android.livesdk.revenue.level.impl.fansclub;

import X.AnonymousClass0956;
import X.C001A;
import X.C01GW;
import X.C087800Uq;
import X.C0J0P;
import X.C0KT0;
import X.C0KT2;
import X.C0UO0;
import X.C1078890eBL;
import X.C1078910eBN;
import X.C1087240eOo;
import X.C1089010eRf;
import X.C1092510eXJ;
import X.C1092520eXK;
import X.C1092760eXi;
import X.C1092780eXk;
import X.C1092980eY4;
import X.C1094910ebB;
import X.C1094920ebC;
import X.C1094930ebD;
import X.C1094940ebE;
import X.C1094950ebF;
import X.C1094980ebI;
import X.C1094990ebJ;
import X.C1095010ebL;
import X.C1095070ebR;
import X.C1095130ebX;
import X.C1095140ebY;
import X.C1095250ebj;
import X.C1095260ebk;
import X.C1095360ebu;
import X.C1095370ebv;
import X.C1101440eli;
import X.C1145050fu3;
import X.C1148210fz9;
import X.C1148420fzU;
import X.C1151790g4v;
import X.C1161920gLG;
import X.C13LE;
import X.C13LQ;
import X.C1548820qPI;
import X.C158B;
import X.C1697810uHb;
import X.C1860207Qi;
import X.C19719912Dl;
import X.C1CC2;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2273311DyT;
import X.C465040ILm;
import X.C480460Ism;
import X.C494680Jac;
import X.C495520Jby;
import X.C497740JfY;
import X.C500260Jjc;
import X.C516700KOe;
import X.C517840KSo;
import X.C517910KSv;
import X.C520010KaN;
import X.C749390TaT;
import X.C776250Uch;
import X.C784440Upu;
import X.C786410Ut5;
import X.EnumC1133850fbz;
import X.EnumC494740Jai;
import X.InterfaceC1092860eXs;
import X.InterfaceC1093910eZZ;
import X.InterfaceC1095000ebK;
import X.InterfaceC1106030et7;
import X.InterfaceC2262081DgM;
import X.InterfaceC500940Jki;
import X.InterfaceC517900KSu;
import Y.AComparatorS36S0000000_17;
import Y.AComparatorS515S0100000_17;
import Y.ARunnableS116S0100000_16;
import Y.ARunnableS117S0100000_17;
import Y.AfS186S0100000_17;
import Y.AfS1S0000100_7;
import Y.AfS6S0100100_17;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.dataChannel.GeneralHighlightPreviewEnterEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.level.FansClubEnableAnchorSuperFanGuideSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubEnableGuideContainerizationSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubEnableSuperFanGuideSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubEntranceConfigSettings;
import com.bytedance.android.livesdk.livesetting.level.FansClubEntranceGuideClientAISettings;
import com.bytedance.android.livesdk.livesetting.level.FansClubGameplayCommunityEnableSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubJoinDialogStyleSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubJoinPanelUpgradeSetting;
import com.bytedance.android.livesdk.livesetting.level.GuidanceConfig;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubAwarenessEnhancementSetting;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubEpiDynamicEngineEnableSetting;
import com.bytedance.android.livesdk.livesetting.level.SuperFanProDisableSetting;
import com.bytedance.android.livesdk.livesetting.level.TextConfig;
import com.bytedance.android.livesdk.livesetting.level.TriggerConfiguration;
import com.bytedance.android.livesdk.livesetting.performance.LiveGradeInfoAndConfigApiOptSetting;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextFormat;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceUser;
import com.bytedance.android.livesdk.revenue.level.api.event.CancelSystemScheduleEvent;
import com.bytedance.android.livesdk.revenue.level.api.event.DismissFansClubGuideDialogEvent;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubChannel;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubEvent;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubGuideClientAiEvent;
import com.bytedance.android.livesdk.revenue.level.api.event.JoinFansClubSuccessEvent;
import com.bytedance.android.livesdk.revenue.level.api.event.OpenFansClubPageEvent;
import com.bytedance.android.livesdk.revenue.level.api.event.SendFansSystemMessageEvent;
import com.bytedance.android.livesdk.revenue.level.api.event.ShowFansClubToastEvent;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.api.FansClubApi;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.sticker.FansStickerViewModel;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialogv2.JoinDialogProxyViewModel;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialogv2.data.TabSwitchEvent;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.FansClubViewModel;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.JoinDialogViewModel;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.SuperFansGoalViewModel;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.treasurebox.TreasureBoxViewModel;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.ui.SuperFanViewModel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.watch.HorizontalOrientationChangeEvent;
import com.bytedance.android.livesdk.watch.OrientationChangeEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tikcast.api.fans.GetNonFansUserDataResponse;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubWidget extends RoomRecycleWidget implements OnMessageListener {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public C1101440eli LLIZLLLIL;
    public final C1092760eXi LLJ;
    public final C1092520eXK LLJI;
    public final C1151790g4v LLJIJIL;

    public FansClubWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FansClubViewModel.class);
        AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(c19719912DlLIZ, 236);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        EnumC494740Jai enumC494740Jai = EnumC494740Jai.WIDGET;
        this.LL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, enumC494740Jai, awS561S0100000_17, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(JoinDialogViewModel.class);
        this.LLILLJJLI = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ2, enumC494740Jai, new AwS561S0100000_17(c19719912DlLIZ2, 237), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(SuperFansGoalViewModel.class);
        this.LLILLL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ3, enumC494740Jai, new AwS561S0100000_17(c19719912DlLIZ3, 238), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(SuperFanViewModel.class);
        this.LLILZ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ4, enumC494740Jai, new AwS561S0100000_17(c19719912DlLIZ4, 239), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(JoinDialogProxyViewModel.class);
        this.LLILZIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ5, enumC494740Jai, new AwS561S0100000_17(c19719912DlLIZ5, 240), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ6 = C13LE.LIZ(TreasureBoxViewModel.class);
        this.LLILZLL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ6, enumC494740Jai, new AwS561S0100000_17(c19719912DlLIZ6, 241), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ7 = C13LE.LIZ(FansStickerViewModel.class);
        this.LLIZ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ7, enumC494740Jai, new AwS561S0100000_17(c19719912DlLIZ7, 242), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        this.LLJ = new C1092760eXi();
        this.LLJI = new C1092520eXK();
        this.LLJIJIL = new C1151790g4v(this, 4);
    }

    @Override // com.bytedance.android.widget.Widget
    public final boolean enablePacedLoad() {
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final FansClubViewModel x1() {
        return (FansClubViewModel) this.LL.getValue();
    }

    public final JoinDialogViewModel y1() {
        return (JoinDialogViewModel) this.LLILLJJLI.getValue();
    }

    public final void z1() {
        C1095140ebY c1095140ebYUw0;
        DataChannel dataChannel = this.dataChannel;
        Room room = dataChannel != null ? (Room) dataChannel.gg0(RoomChannel.class) : null;
        FansClubViewModel fansClubViewModelX1 = x1();
        DataChannelGlobal.LLILZ.JQ2(C1148420fzU.class, new C1094990ebJ(room != null ? room.getId() : 0L, (fansClubViewModelX1 == null || (c1095140ebYUw0 = fansClubViewModelX1.uw0()) == null) ? 0L : c1095140ebYUw0.LJIIIIZZ));
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) throws JSONException {
        FansClubViewModel fansClubViewModelX1 = x1();
        if (fansClubViewModelX1 != null) {
            fansClubViewModelX1.zQ2(iMessage);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onUnload(RecycleSource recycleSource) {
        long j;
        DataChannel dataChannel;
        C1095140ebY c1095140ebY;
        AnonymousClass0956 anonymousClass0956;
        IMessageManager iMessageManager;
        super.onUnload(recycleSource);
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (iMessageManager = (IMessageManager) dataChannel2.gg0(C776250Uch.class)) != null) {
            iMessageManager.removeMessageListener(C001A.FANS_EVENT_MESSAGE.getIntType(), this);
        }
        FansClubViewModel fansClubViewModelX1 = x1();
        if (fansClubViewModelX1 != null) {
            ((ArrayList) fansClubViewModelX1.LLJILJIL).clear();
            fansClubViewModelX1.LLJJJJJIL = false;
            C1078890eBL c1078890eBL = fansClubViewModelX1.LLIZLLLIL;
            if (c1078890eBL != null) {
                c1078890eBL.LIZ = null;
                c1078890eBL.LIZJ.removeCallbacksAndMessages(null);
            }
            fansClubViewModelX1.LLIZLLLIL = null;
            C1095370ebv c1095370ebv = fansClubViewModelX1.LLJI;
            if (c1095370ebv != null && (anonymousClass0956 = c1095370ebv.LIZJ) != null) {
                anonymousClass0956.LIZIZ(null);
            }
            fansClubViewModelX1.LLJI = null;
            fansClubViewModelX1.LLJJIII = null;
            C1094910ebB c1094910ebB = fansClubViewModelX1.LLJ;
            if (c1094910ebB != null) {
                c1094910ebB.LIZ = null;
                c1094910ebB.LIZIZ = 0;
            }
            TreeSet<C1094950ebF> treeSet = C1095260ebk.LIZIZ;
            if (treeSet != null) {
                treeSet.clear();
            }
            DataChannel dataChannel3 = fansClubViewModelX1.getDataChannel();
            if (dataChannel3 != null && (c1095140ebY = (C1095140ebY) dataChannel3.gg0(FansClubChannel.class)) != null) {
                j = c1095140ebY.LIZ;
            } else {
                j = 0;
            }
            DataChannel dataChannel4 = fansClubViewModelX1.getDataChannel();
            if ((dataChannel4 == null || !C500260Jjc.LJIIZILJ(dataChannel4)) && j <= 0 && (dataChannel = fansClubViewModelX1.getDataChannel()) != null) {
                dataChannel.LC0(DismissFansClubGuideDialogEvent.class, Boolean.TRUE);
            }
            if (fansClubViewModelX1.c70()) {
                C495520Jby c495520Jby = new C495520Jby("sslocal://webcast_highlight_general_popup?");
                c495520Jby.LIZJ(Scene.SCENE_SERVICE, "room_end");
                c495520Jby.LIZIZ(C500260Jjc.LJJLIIIJ(fansClubViewModelX1.getDataChannel()), "room_id");
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(C497740JfY.LJII(), c495520Jby.LIZLLL());
            }
        }
        C087800Uq.LIZ(UserService.getInstance().user().getCurrentUser());
        C1095250ebj.LIZ.removeMessages(0);
        C1548820qPI.LJIIIIZZ("tt_live_fans_club_event_quit", this.LLJIJIL);
        C1548820qPI.LJIIIIZZ("tt_live_fans_club_event_quit_clear_data", this.LLJIJIL);
        C1548820qPI.LJIIIIZZ("FE_FANS_LEVEL_FETCH_TASK_DATA", this.LLJIJIL);
        C1548820qPI.LJIIIIZZ("tt_live_clear_local_test_keva_keys_data", this.LLJIJIL);
        C1548820qPI.LJIIIIZZ("live_fans_level_all_tasks_points_claimed", this.LLJIJIL);
        C1548820qPI.LJIIIIZZ("tt_fe_fans_level_data", this.LLJIJIL);
        C1548820qPI.LJIIIIZZ("fans_user_page_preload_data_listener_ready", this.LLJIJIL);
        C1548820qPI.LJIIIIZZ("anchor_set_customize_fan_club_badge", this.LLJIJIL);
        C1548820qPI.LJIIIIZZ("anchor_fan_club_select_page_closed", this.LLJIJIL);
        C1548820qPI.LJIIIIZZ("anchor_set_customize_fan_club_sticker", this.LLJIJIL);
        C1548820qPI.LJIIIIZZ("tt_live_block_pause_live_stream", this.LLJIJIL);
        C1548820qPI.LJIIIIZZ("anchor_set_customize_superfan_sticker", this.LLJIJIL);
        C1548820qPI.LJIIIIZZ("fan_club_guide_containerzation_frequency_maximum", this.LLJIJIL);
        IFansClubService iFansClubService = (IFansClubService) C1161920gLG.LIZJ(IFansClubService.class);
        if (iFansClubService instanceof FansClubService) {
            ((FansClubService) iFansClubService).Gy1();
        }
        DataChannelGlobal.LLILZ.JQ2(C1148210fz9.class, "");
        JoinDialogViewModel joinDialogViewModelY1 = y1();
        if (joinDialogViewModelY1 != null) {
            joinDialogViewModelY1.LL.removeMessages(1);
        }
        C1092760eXi c1092760eXi = this.LLJ;
        c1092760eXi.LIZ.removeCallbacksAndMessages(null);
        if (c1092760eXi.LIZLLL || LiveFansClubEpiDynamicEngineEnableSetting.INSTANCE.getValue()) {
            Iterator<String> it2 = c1092760eXi.LIZIZ.iterator();
            while (it2.hasNext()) {
                ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).CW(it2.next());
            }
        }
        c1092760eXi.LIZLLL = false;
        c1092760eXi.LIZJ = null;
        C1101440eli c1101440eli = this.LLIZLLLIL;
        if (c1101440eli != null) {
            c1101440eli.LIZIZ = null;
            C1145050fu3.LIZIZ(c1101440eli);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onLoad(RecycleSource recycleSource, Object[] objArr) {
        FansClubViewModel fansClubViewModelX1;
        long j;
        Room room;
        User owner;
        User.FansClubInfo fansClubInfo;
        DataChannel dataChannel;
        DataChannel dataChannel2;
        LinkedHashMap linkedHashMap;
        IHostAppContext iHostAppContext;
        String str;
        Room roomLJJLIIIIJ;
        User owner2;
        FollowInfo followInfo;
        boolean zBooleanValue;
        long id;
        String str2;
        List list;
        List<InterfaceC1095000ebK> list2;
        Boolean bool;
        Room roomLJJLIIIIJ2;
        User owner3;
        SubscribeInfo subscribeInfo;
        ISubscribeService iSubscribeService;
        String strLIZ;
        WeakReference<SuperFanViewModel> weakReference;
        SuperFanViewModel superFanViewModel;
        int i;
        IMessageManager iMessageManager;
        super.onLoad(recycleSource, objArr);
        long jCurrentTimeMillis = System.currentTimeMillis();
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null && (iMessageManager = (IMessageManager) dataChannel3.gg0(C776250Uch.class)) != null) {
            iMessageManager.addMessageListener(C001A.FANS_EVENT_MESSAGE.getIntType(), this);
        }
        C1548820qPI.LIZLLL("tt_live_fans_club_event_quit", this.LLJIJIL);
        C1548820qPI.LIZLLL("tt_live_fans_club_event_quit_clear_data", this.LLJIJIL);
        C1548820qPI.LIZLLL("FE_FANS_LEVEL_FETCH_TASK_DATA", this.LLJIJIL);
        C1548820qPI.LIZLLL("tt_live_clear_local_test_keva_keys_data", this.LLJIJIL);
        C1548820qPI.LIZLLL("live_fans_level_all_tasks_points_claimed", this.LLJIJIL);
        C1548820qPI.LIZLLL("tt_fe_fans_level_data", this.LLJIJIL);
        C1548820qPI.LIZLLL("fans_user_page_preload_data_listener_ready", this.LLJIJIL);
        C1548820qPI.LIZLLL("anchor_set_customize_fan_club_badge", this.LLJIJIL);
        C1548820qPI.LIZLLL("anchor_fan_club_select_page_closed", this.LLJIJIL);
        C1548820qPI.LIZLLL("anchor_set_customize_fan_club_sticker", this.LLJIJIL);
        C1548820qPI.LIZLLL("tt_live_block_pause_live_stream", this.LLJIJIL);
        C1548820qPI.LIZLLL("anchor_set_customize_superfan_sticker", this.LLJIJIL);
        C1548820qPI.LIZLLL("fan_club_guide_containerzation_frequency_maximum", this.LLJIJIL);
        IFansClubService iFansClubService = (IFansClubService) C1161920gLG.LIZJ(IFansClubService.class);
        if (iFansClubService instanceof FansClubService) {
            FansClubService fansClubService = (FansClubService) iFansClubService;
            FansClubViewModel fansClubViewModelX12 = x1();
            if (fansClubViewModelX12 != null) {
                fansClubService.LL = fansClubViewModelX12;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        JoinDialogViewModel joinDialogViewModelY1 = y1();
        if (joinDialogViewModelY1 != null) {
            joinDialogViewModelY1.LLILZIL = System.currentTimeMillis();
            if (FansClubJoinDialogStyleSetting.INSTANCE.getValue() == 3) {
                C786410Ut5.LJLJLJ(joinDialogViewModelY1.LL, joinDialogViewModelY1.LL.obtainMessage(1), 6000L);
            }
        }
        SuperFanViewModel superFanViewModel2 = (SuperFanViewModel) this.LLILZ.getValue();
        if (superFanViewModel2 != null) {
            superFanViewModel2.LLILLJJLI = new C517840KSo(new WeakReference(C520010KaN.LJIJJLI(this.context, true)), new WeakReference(this.widgetCallback.getFragment()));
            C1548820qPI.LIZLLL("live_super_fan_treasure_receive_success", superFanViewModel2);
            DataChannel dataChannel4 = superFanViewModel2.getDataChannel();
            if (dataChannel4 != null && (roomLJJLIIIIJ2 = C500260Jjc.LJJLIIIIJ(dataChannel4)) != null && (owner3 = roomLJJLIIIIJ2.getOwner()) != null && (subscribeInfo = owner3.getSubscribeInfo()) != null && subscribeInfo.isAnchorQualified() && (iSubscribeService = (ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)) != null && iSubscribeService.Ae() != null && (strLIZ = C516700KOe.LIZ()) != null && strLIZ.length() != 0 && C500260Jjc.LJIJI(dataChannel4) && !((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).wd2() && ((C494680Jac.LJI(dataChannel4) || C494680Jac.LJIIJ(dataChannel4)) && (weakReference = C517910KSv.LIZ) != null && (superFanViewModel = weakReference.get()) != null)) {
                C0KT2 c0kt2 = C0KT2.PREFETCH;
                if (LiveFansClubAwarenessEnhancementSetting.INSTANCE.isEnabled()) {
                    i = 5;
                } else {
                    i = 0;
                }
                superFanViewModel.vQ2(new C0KT0(c0kt2, "prefetch", i), FansClubJoinPanelUpgradeSetting.INSTANCE.getValue(), new InterfaceC517900KSu() { // from class: X.0KTi
                    @Override // X.InterfaceC517900KSu
                    public final void LIZ(C0KSY<GetNonFansUserDataResponse.Data> c0ksy, C0KS8 c0ks8) {
                    }

                    @Override // X.InterfaceC517900KSu
                    public final void onFailure() {
                    }
                });
            }
        }
        TreasureBoxViewModel treasureBoxViewModel = (TreasureBoxViewModel) this.LLILZLL.getValue();
        if (treasureBoxViewModel != null) {
            treasureBoxViewModel.LL = new C517840KSo(new WeakReference(C520010KaN.LJIJJLI(this.context, true)), new WeakReference(this.widgetCallback.getFragment()));
        }
        FansClubViewModel fansClubViewModelX13 = x1();
        if (fansClubViewModelX13 != null) {
            JoinDialogViewModel joinDialogViewModelY12 = y1();
            SuperFanViewModel superFanViewModel3 = (SuperFanViewModel) this.LLILZ.getValue();
            SuperFansGoalViewModel superFansGoalViewModel = (SuperFansGoalViewModel) this.LLILLL.getValue();
            JoinDialogProxyViewModel joinDialogProxyViewModel = (JoinDialogProxyViewModel) this.LLILZIL.getValue();
            fansClubViewModelX13.LLIZLLLIL = new C1078890eBL(fansClubViewModelX13.getDataChannel());
            fansClubViewModelX13.LLJI = new C1095370ebv(fansClubViewModelX13.getDataChannel(), ViewModelKt.getViewModelScope(fansClubViewModelX13));
            fansClubViewModelX13.LLJIJIL = new C1078910eBN(fansClubViewModelX13.getDataChannel());
            fansClubViewModelX13.LLJJIII = joinDialogViewModelY12;
            fansClubViewModelX13.LLJJIJI = superFansGoalViewModel;
            fansClubViewModelX13.LLJJIJIIJIL = joinDialogProxyViewModel;
            int i2 = C1095260ebk.LIZ;
            C1095260ebk.LIZIZ = new TreeSet<>(new AComparatorS515S0100000_17(new AComparatorS515S0100000_17(new AComparatorS36S0000000_17(32), 4), 5));
            C1094910ebB c1094910ebB = new C1094910ebB();
            DataChannel dataChannel5 = fansClubViewModelX13.getDataChannel();
            if (dataChannel5 != null && (bool = (Boolean) dataChannel5.gg0(UserIsAnchorChannel.class)) != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            String str3 = C465040ILm.LIZ;
            String strValueOf = String.valueOf(C500260Jjc.LJJLIIIJ(dataChannel5));
            User userLJIIIIZZ = C500260Jjc.LJIIIIZZ(dataChannel5);
            if (userLJIIIIZZ != null) {
                id = userLJIIIIZZ.getId();
            } else {
                id = 0;
            }
            String strValueOf2 = String.valueOf(id);
            if (zBooleanValue) {
                str2 = "anchor";
            } else {
                str2 = "user";
            }
            c1094910ebB.LIZ = new C1095010ebL("enter_room", str3, null, null, new C1095070ebR(strValueOf, strValueOf2, str2, str3));
            fansClubViewModelX13.LLJ = c1094910ebB;
            C1078910eBN c1078910eBN = fansClubViewModelX13.LLJIJIL;
            if (c1078910eBN != null && (list2 = c1078910eBN.LIZ) != null) {
                Iterator it2 = ((ArrayList) list2).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1095000ebK) it2.next()).LIZ();
                }
            }
            fansClubViewModelX13.LLJJI = superFanViewModel3;
            fansClubViewModelX13.LLJILJILJ = new C1092510eXJ(fansClubViewModelX13.getDataChannel());
            if (FansClubEnableGuideContainerizationSetting.INSTANCE.getValue()) {
                long currentUserId = UserService.getInstance().user().getCurrentUserId();
                if (!C1860207Qi.LIZIZ || System.currentTimeMillis() - C1860207Qi.LIZJ >= 7200000 || C1860207Qi.LIZLLL != currentUserId) {
                    C1860207Qi.LIZLLL = currentUserId;
                    C1860207Qi.LIZJ = System.currentTimeMillis();
                    List<GuidanceConfig> list3 = FansClubEntranceConfigSettings.INSTANCE.getFansClubEntranceConfig().configs;
                    if (list3 != null) {
                        for (GuidanceConfig guidanceConfig : list3) {
                            List<TriggerConfiguration> list4 = guidanceConfig.triggerConfiguration;
                            if (list4 != null) {
                                if (C13LQ.LJJIJIIJI(guidanceConfig.guidanceKey, C1094940ebE.LIZ) < 0) {
                                    Iterator<TriggerConfiguration> it3 = list4.iterator();
                                    while (it3.hasNext()) {
                                        int i3 = it3.next().triggerType;
                                        if (i3 != 0) {
                                            if (i3 != 1) {
                                                if (i3 != 2) {
                                                    if (i3 == 4 && (list = (List) ((LinkedHashMap) C1860207Qi.LIZ).get(4)) != null) {
                                                        list.add(guidanceConfig);
                                                    }
                                                } else {
                                                    List list5 = (List) ((LinkedHashMap) C1860207Qi.LIZ).get(2);
                                                    if (list5 != null) {
                                                        list5.add(guidanceConfig);
                                                    }
                                                }
                                            } else {
                                                List list6 = (List) ((LinkedHashMap) C1860207Qi.LIZ).get(1);
                                                if (list6 != null) {
                                                    list6.add(guidanceConfig);
                                                }
                                            }
                                        } else {
                                            List list7 = (List) ((LinkedHashMap) C1860207Qi.LIZ).get(0);
                                            if (list7 != null) {
                                                list7.add(guidanceConfig);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C1860207Qi.LIZIZ = true;
                }
            }
            fansClubViewModelX13.LLJJJIL = fansClubViewModelX13.LLJJJJ.fi2(C500260Jjc.LJJLIIIIJ(fansClubViewModelX13.getDataChannel()), fansClubViewModelX13, this);
            long jLJJLIIIJ = C500260Jjc.LJJLIIIJ(fansClubViewModelX13.getDataChannel());
            if (C1094980ebI.LIZ != jLJJLIIIJ) {
                C1094980ebI.LIZ = jLJJLIIIJ;
                C1094980ebI.LIZIZ = 0;
            }
        }
        JoinDialogProxyViewModel joinDialogProxyViewModel2 = (JoinDialogProxyViewModel) this.LLILZIL.getValue();
        if (joinDialogProxyViewModel2 != null) {
            JoinDialogViewModel joinDialogViewModelY13 = y1();
            SuperFanViewModel superFanViewModel4 = (SuperFanViewModel) this.LLILZ.getValue();
            joinDialogProxyViewModel2.LL = joinDialogViewModelY13;
            joinDialogProxyViewModel2.LLILLJJLI = superFanViewModel4;
            DataChannel dataChannel6 = joinDialogProxyViewModel2.getDataChannel();
            if (dataChannel6 != null) {
                dataChannel6.BQ2(this, TabSwitchEvent.class, new AwS612S0100000_33(joinDialogProxyViewModel2, 205));
            }
        }
        C1094930ebD.LIZ = new WeakReference<>(this.LLIZ.getValue());
        DataChannel dataChannel7 = this.dataChannel;
        dataChannel7.EQ2(this, RoomChannel.class, new AwS596S0100000_17(this, 698));
        dataChannel7.BQ2(this, ShowFansClubToastEvent.class, new AwS591S0100000_12(this, 1219));
        dataChannel7.BQ2(this, OpenFansClubPageEvent.class, new AwS596S0100000_17(this, 699));
        DataChannelGlobal.LLILZ.BQ2(this, this, GeneralHighlightPreviewEnterEvent.class, new AwS596S0100000_17(this, OppoPermissionPopupMaskDelayExp.DEFAULT));
        LiveGradeInfoAndConfigApiOptSetting liveGradeInfoAndConfigApiOptSetting = LiveGradeInfoAndConfigApiOptSetting.INSTANCE;
        if (liveGradeInfoAndConfigApiOptSetting.getConfig().enableFansClubApiOpt) {
            FansClubViewModel fansClubViewModelX14 = x1();
            if (fansClubViewModelX14 != null) {
                if (!liveGradeInfoAndConfigApiOptSetting.reachTimeLimitForFansClubApi() && !(!Intrinsics.LJFF(InterfaceC1093910eZZ.LLLLLLL.LIZIZ(), C2273311DyT.LIZ(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentLocale())))) {
                    if (!C1095130ebX.LIZ()) {
                        C786410Ut5.LJJZZIII(C1095250ebj.LIZ, new ARunnableS116S0100000_16(new AwS561S0100000_17(fansClubViewModelX14, 593), (Function0<Unit>) 15));
                    }
                } else {
                    FansClubViewModel.BQ2(AFwS205S0000000_17.get$arr$(305), false);
                }
            }
        } else {
            try {
                DataChannel dataChannel8 = this.dataChannel;
                if (dataChannel8 != null && (room = (Room) dataChannel8.gg0(RoomChannel.class)) != null && (owner = room.getOwner()) != null && (fansClubInfo = owner.fansClubInfo) != null) {
                    j = fansClubInfo.fansLevel;
                } else {
                    j = 0;
                }
                C786410Ut5.LJJZZIII(C1095250ebj.LIZ, new ARunnableS117S0100000_17(new C1094920ebC(j), 262));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1CC2.LIZ("fansClub load config from cache exception", th);
            }
            if (!C1095130ebX.LJII && (fansClubViewModelX1 = x1()) != null) {
                AFwS254S0000000_17 aFwS254S0000000_17 = AFwS254S0000000_17.get$arr$(89);
                if (fansClubViewModelX1.LLILZ) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    C480460Ism.LIZ().getClass();
                    ((FansClubApi) C480460Ism.LIZLLL(FansClubApi.class)).getFansConfigWithParameter().LJFF(new C0UO0()).LJJIIZ(new AfS6S0100100_17(jCurrentTimeMillis2, aFwS254S0000000_17, 5), new AfS1S0000100_7(jCurrentTimeMillis2, 2));
                }
            }
        }
        DataChannel dataChannel9 = this.dataChannel;
        if (dataChannel9 != null) {
            dataChannel9.BQ2(this, SendFansSystemMessageEvent.class, new AwS596S0100000_17(this, 232));
        }
        DataChannel dataChannel10 = this.dataChannel;
        if (dataChannel10 != null) {
            dataChannel10.BQ2(this, CancelSystemScheduleEvent.class, new AwS596S0100000_17(this, 233));
        }
        DataChannel dataChannel11 = this.dataChannel;
        if (dataChannel11 != null) {
            dataChannel11.BQ2(this, FansClubEvent.class, new AwS596S0100000_17(this, 234));
        }
        DataChannel dataChannel12 = this.dataChannel;
        if (dataChannel12 != null) {
            dataChannel12.BQ2(this, JoinFansClubSuccessEvent.class, new AwS596S0100000_17(this, 235));
        }
        DataChannel dataChannel13 = this.dataChannel;
        if (dataChannel13 != null) {
            dataChannel13.BQ2(this, FansClubGuideClientAiEvent.class, new AwS596S0100000_17(this, 236));
        }
        if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
            DataChannel dataChannel14 = this.dataChannel;
            if (dataChannel14 != null && Intrinsics.LJFF(dataChannel14.gg0(C749390TaT.class), Boolean.TRUE)) {
                FansClubViewModel fansClubViewModelX15 = x1();
                if (fansClubViewModelX15 != null) {
                    fansClubViewModelX15.HQ2();
                }
                DataChannel dataChannel15 = this.dataChannel;
                if (dataChannel15 != null) {
                    dataChannel15.SX0(C749390TaT.class, Boolean.FALSE);
                }
            }
        } else {
            DataChannel dataChannel16 = this.dataChannel;
            if (dataChannel16 != null) {
                dataChannel16.BQ2(this, OrientationChangeEvent.class, new AwS596S0100000_17(this, 237));
            }
            DataChannel dataChannel17 = this.dataChannel;
            if (dataChannel17 != null) {
                dataChannel17.BQ2(this, HorizontalOrientationChangeEvent.class, new AwS596S0100000_17(this, 238));
            }
        }
        C784440Upu.LIZ().LIZJ(this, C1095360ebu.class).LIZJ(new AfS186S0100000_17(this, 63));
        FansClubViewModel fansClubViewModelX16 = x1();
        if (fansClubViewModelX16 != null) {
            boolean zKw0 = fansClubViewModelX16.Kw0(fansClubViewModelX16.getDataChannel());
            boolean value = FansClubEnableSuperFanGuideSetting.INSTANCE.getValue();
            boolean value2 = FansClubEnableAnchorSuperFanGuideSetting.INSTANCE.getValue();
            if (value && ((dataChannel2 = fansClubViewModelX16.getDataChannel()) == null || (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel2)) == null || (owner2 = roomLJJLIIIIJ.getOwner()) == null || (followInfo = owner2.getFollowInfo()) == null || ((int) followInfo.getFollowStatus()) != 0)) {
                int i4 = C1087240eOo.LIZ;
                try {
                    Map<String, String> mapLIZ = InterfaceC1106030et7.e9.LIZ();
                    if (mapLIZ != null) {
                        linkedHashMap = new LinkedHashMap(mapLIZ);
                    } else {
                        linkedHashMap = new LinkedHashMap();
                    }
                    Calendar calendar = Calendar.getInstance();
                    int i5 = calendar.get(1);
                    int i6 = calendar.get(2) + 1;
                    int i7 = calendar.get(5);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(i5);
                    sbLIZ.append('-');
                    sbLIZ.append(i6);
                    sbLIZ.append('-');
                    sbLIZ.append(i7);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    if (linkedHashMap.size() < 7) {
                        if (linkedHashMap.containsKey(strLIZIZ) && (str = (String) linkedHashMap.get(strLIZIZ)) != null) {
                            if (CastIntegerProtector.parseInt(str) < 3) {
                                if (zKw0) {
                                    BPEAHandler bPEAHandler = fansClubViewModelX16.LLJJ;
                                    C786410Ut5.LJLJLJ(bPEAHandler, bPEAHandler.obtainMessage(2), 120000L);
                                }
                            }
                        } else if (zKw0 && (!SuperFanProDisableSetting.INSTANCE.getValue() || (iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)) == null || !iHostAppContext.isCoin())) {
                            BPEAHandler bPEAHandler2 = fansClubViewModelX16.LLJJ;
                            C786410Ut5.LJLJLJ(bPEAHandler2, bPEAHandler2.obtainMessage(2), 120000L);
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1CC2.LIZ("super fans guide animation read", e);
                }
            }
            if (value2 && (dataChannel = fansClubViewModelX16.getDataChannel()) != null && C500260Jjc.LJIIZILJ(dataChannel) && zKw0) {
                BPEAHandler bPEAHandler3 = fansClubViewModelX16.LLJJ;
                C786410Ut5.LJLJLJ(bPEAHandler3, bPEAHandler3.obtainMessage(3), 120000L);
            }
        }
        if (FansClubEntranceGuideClientAISettings.INSTANCE.getValue()) {
            if (this.LLIZLLLIL == null) {
                this.LLIZLLLIL = new C1101440eli();
            }
            C1101440eli c1101440eli = this.LLIZLLLIL;
            if (c1101440eli != null) {
                c1101440eli.LIZIZ = this.dataChannel;
                C1145050fu3.LIZ(c1101440eli);
            }
        }
        final C1092760eXi c1092760eXi = this.LLJ;
        DataChannel dataChannel18 = this.dataChannel;
        c1092760eXi.getClass();
        if (LiveFansClubEpiDynamicEngineEnableSetting.INSTANCE.getValue() && dataChannel18 != null) {
            c1092760eXi.LIZJ = dataChannel18;
            c1092760eXi.LIZLLL = true;
            for (final String str4 : c1092760eXi.LIZIZ) {
                ILiveDecisionService iLiveDecisionService = (ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class);
                InterfaceC1092860eXs interfaceC1092860eXs = new InterfaceC1092860eXs() { // from class: X.0eXc
                    @Override // X.InterfaceC1092860eXs
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC1092860eXs
                    public final void LIZIZ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                    }

                    @Override // X.InterfaceC1092860eXs
                    public final void LIZJ() {
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r3v1, types: [X.13BV] */
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
                    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
                    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.CharSequence, java.lang.String] */
                    @Override // X.InterfaceC1092860eXs
                    public final void LJ(C1092890eXv c1092890eXv) {
                        Object obj;
                        C1089610eSd c1089610eSd;
                        JSONObject jSONObject;
                        C1092740eXg c1092740eXg;
                        C1092730eXf c1092730eXf;
                        ?? arrayList;
                        C1092710eXd c1092710eXd;
                        int i8;
                        int i9;
                        int i10;
                        long j2;
                        long j3;
                        C1092720eXe c1092720eXe;
                        Text textLJIIJJI;
                        ImageModel imageModelLIZIZ;
                        Text textLJIIJJI2;
                        ImageModel imageModelLIZIZ2;
                        TextConfig textConfigLIZJ;
                        TextConfig textConfigLIZJ2;
                        C0J0M c0j0m = c1092890eXv.LIZIZ;
                        C1092680eXa c1092680eXa = null;
                        if (c0j0m != null) {
                            obj = c0j0m.LIZ;
                        } else {
                            obj = null;
                        }
                        if ((obj instanceof C1089940eTA) && (c1089610eSd = (C1089610eSd) obj) != null) {
                            final C1092760eXi c1092760eXi2 = c1092760eXi;
                            ?? r4 = c1089610eSd.LIZ;
                            if (TextUtils.isEmpty(r4)) {
                                return;
                            }
                            c1092760eXi2.getClass();
                            if (FansClubGameplayCommunityEnableSetting.INSTANCE.getValue() && r4 != 0) {
                                try {
                                    if (r4 instanceof JSONObject) {
                                        jSONObject = (JSONObject) r4;
                                    } else {
                                        jSONObject = new JSONObject((String) r4);
                                    }
                                    if (jSONObject != null) {
                                        String strOptString = jSONObject.optString("biz_type", "");
                                        if (strOptString == null) {
                                            strOptString = "";
                                        }
                                        String strOptString2 = jSONObject.optString("biz_scene", "");
                                        if (strOptString2 == null) {
                                            strOptString2 = "";
                                        }
                                        if (strOptString.length() != 0 && strOptString2.length() != 0 && C1092550eXN.LIZ.contains(strOptString)) {
                                            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("frequency_configuration");
                                            if (jSONObjectOptJSONObject != null) {
                                                c1092740eXg = new C1092740eXg(jSONObjectOptJSONObject.optInt("frequency_type", 0), jSONObjectOptJSONObject.optInt("time_limit", 0), jSONObjectOptJSONObject.optInt("duration_limit", 0));
                                            } else {
                                                c1092740eXg = null;
                                            }
                                            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("trigger_configuration");
                                            if (jSONObjectOptJSONObject2 != null) {
                                                c1092730eXf = new C1092730eXf(jSONObjectOptJSONObject2.optLong("trigger_time", 0L));
                                            } else {
                                                c1092730eXf = null;
                                            }
                                            String strOptString3 = jSONObject.optString("biz_scene_type", null);
                                            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("content_configuration");
                                            if (jSONObjectOptJSONObject3 != null) {
                                                JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("effect_resource");
                                                if (jSONObjectOptJSONObject4 != null) {
                                                    c1092720eXe = new C1092720eXe(jSONObjectOptJSONObject4.optString("file_name", ""), jSONObjectOptJSONObject4.optString("file_gecko_channel", ""), jSONObjectOptJSONObject4.optInt("type", 0));
                                                } else {
                                                    c1092720eXe = null;
                                                }
                                                JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject3.optJSONObject("content_text");
                                                if (jSONObjectOptJSONObject5 != null && (textConfigLIZJ2 = C1092550eXN.LIZJ(jSONObjectOptJSONObject5)) != null) {
                                                    C1094580eae.LIZ.getClass();
                                                    textLJIIJJI = C1094580eae.LJIIJJI(textConfigLIZJ2);
                                                } else {
                                                    textLJIIJJI = null;
                                                }
                                                boolean zOptBoolean = jSONObjectOptJSONObject3.optBoolean("content_need_anchor_name", false);
                                                JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject3.optJSONObject("content_icon");
                                                if (jSONObjectOptJSONObject6 != null) {
                                                    imageModelLIZIZ = C1092550eXN.LIZIZ(jSONObjectOptJSONObject6);
                                                } else {
                                                    imageModelLIZIZ = null;
                                                }
                                                JSONObject jSONObjectOptJSONObject7 = jSONObjectOptJSONObject3.optJSONObject("button_text");
                                                if (jSONObjectOptJSONObject7 != null && (textConfigLIZJ = C1092550eXN.LIZJ(jSONObjectOptJSONObject7)) != null) {
                                                    C1094580eae.LIZ.getClass();
                                                    textLJIIJJI2 = C1094580eae.LJIIJJI(textConfigLIZJ);
                                                } else {
                                                    textLJIIJJI2 = null;
                                                }
                                                String strLIZ2 = C1092550eXN.LIZ(jSONObjectOptJSONObject3, "left_tux_icon");
                                                JSONObject jSONObjectOptJSONObject8 = jSONObjectOptJSONObject3.optJSONObject("left_icon");
                                                if (jSONObjectOptJSONObject8 != null) {
                                                    imageModelLIZIZ2 = C1092550eXN.LIZIZ(jSONObjectOptJSONObject8);
                                                } else {
                                                    imageModelLIZIZ2 = null;
                                                }
                                                c1092680eXa = new C1092680eXa(c1092720eXe, textLJIIJJI, imageModelLIZIZ, textLJIIJJI2, strLIZ2, imageModelLIZIZ2, jSONObjectOptJSONObject3, zOptBoolean);
                                            }
                                            JSONObject jSONObjectOptJSONObject9 = jSONObject.optJSONObject("interaction_configuration");
                                            JSONObject jSONObjectOptJSONObject10 = jSONObject.optJSONObject("business_dependency_configuration");
                                            if (jSONObjectOptJSONObject10 == null) {
                                                c1092710eXd = null;
                                            } else {
                                                int iOptInt = jSONObjectOptJSONObject10.optInt("gift_check_type", 0);
                                                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject10.optJSONArray("gift_ids");
                                                if (jSONArrayOptJSONArray != null) {
                                                    int length = jSONArrayOptJSONArray.length();
                                                    ArrayList arrayList2 = new ArrayList(length);
                                                    for (int i11 = 0; i11 < length; i11++) {
                                                        arrayList2.add(Long.valueOf(jSONArrayOptJSONArray.optLong(i11)));
                                                    }
                                                    arrayList = new ArrayList();
                                                    for (Object obj2 : arrayList2) {
                                                        if (((Number) obj2).longValue() > 0) {
                                                            arrayList.add(obj2);
                                                        }
                                                    }
                                                } else {
                                                    arrayList = C13BV.INSTANCE;
                                                }
                                                c1092710eXd = new C1092710eXd(iOptInt, arrayList, jSONObjectOptJSONObject10);
                                            }
                                            final C1092690eXb c1092690eXb = new C1092690eXb(strOptString, strOptString2, strOptString3, c1092680eXa, jSONObjectOptJSONObject9, c1092740eXg, c1092730eXf, c1092710eXd, jSONObject);
                                            C1092740eXg c1092740eXg2 = c1092690eXb.LJFF;
                                            if (c1092740eXg2 != null) {
                                                i8 = c1092740eXg2.LIZIZ;
                                                i9 = c1092740eXg2.LIZJ;
                                                i10 = c1092740eXg2.LIZ;
                                            } else {
                                                i8 = 0;
                                                i9 = 0;
                                                i10 = 0;
                                            }
                                            C1092730eXf c1092730eXf2 = c1092690eXb.LJI;
                                            if (c1092730eXf2 != null) {
                                                j3 = c1092730eXf2.LIZ;
                                                j2 = 0;
                                                if (j3 < 0) {
                                                    j3 = 0;
                                                }
                                            } else {
                                                j2 = 0;
                                                j3 = 0;
                                            }
                                            long j4 = j3 * 1000;
                                            final int i12 = i8;
                                            final int i13 = i9;
                                            final int i14 = i10;
                                            Runnable runnable = new Runnable() { // from class: X.0eXZ
                                                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                                                /* JADX WARN: Removed duplicated region for block: B:107:0x0212  */
                                                /* JADX WARN: Removed duplicated region for block: B:110:0x0218  */
                                                /* JADX WARN: Removed duplicated region for block: B:113:0x0220  */
                                                /* JADX WARN: Removed duplicated region for block: B:119:0x022e  */
                                                /* JADX WARN: Removed duplicated region for block: B:120:0x0230  */
                                                /* JADX WARN: Removed duplicated region for block: B:121:0x0232  */
                                                /* JADX WARN: Removed duplicated region for block: B:122:0x0234  */
                                                /*
                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                    To view partially-correct add '--show-bad-code' argument
                                                */
                                                public final void LIZ() {
                                                    /*
                                                        Method dump skipped, instruction units count: 1398
                                                        To view this dump add '--comments-level debug' option
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1092670eXZ.LIZ():void");
                                                }

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    boolean zLIZ;
                                                    C1C7U.LIZ("FanClubGuideEngine@1b5b.handleDecisionResult$triggerAction$1");
                                                    try {
                                                        LIZ();
                                                    } finally {
                                                        if (!zLIZ) {
                                                        }
                                                    }
                                                    C1C7U.LIZIZ("FanClubGuideEngine@1b5b.handleDecisionResult$triggerAction$1");
                                                }
                                            };
                                            if (j4 > j2) {
                                                C786410Ut5.LJLIIL(j4, c1092760eXi2.LIZ, runnable);
                                            } else {
                                                runnable.run();
                                            }
                                        }
                                    }
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                }
                            }
                        }
                    }

                    @Override // X.InterfaceC1092860eXs
                    public final void LIZLLL(String str5, C477840IoY c477840IoY) {
                        C1092760eXi c1092760eXi2 = c1092760eXi;
                        int i8 = c477840IoY.LIZ;
                        String str6 = str4;
                        String str7 = c477840IoY.LIZIZ;
                        if (str7 == null) {
                            str7 = "";
                        }
                        c1092760eXi2.LIZ(i8, "", str6, str7);
                    }
                };
                C1092980eY4 c1092980eY4 = new C1092980eY4();
                c1092980eY4.LIZ = C0J0P.ROOM;
                c1092980eY4.LIZ(new C1092780eXk(new C1089010eRf()));
                iLiveDecisionService.fR1(interfaceC1092860eXs, c1092980eY4.LIZIZ(), null, str4);
            }
        }
        C20441214yg.LIZIZ("fans club", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public final void A1(String str, BadgeStruct badgeStruct, String str2, String str3) {
        IMessageManager iMessageManager;
        InterfaceC2262081DgM currentUser;
        int i;
        long id;
        DataChannel dataChannel = this.dataChannel;
        Room room = null;
        if (dataChannel != null) {
            iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        } else {
            iMessageManager = null;
        }
        RoomMessage roomMessage = new RoomMessage();
        roomMessage.isLocalInsertMsg = true;
        roomMessage.scene = str2;
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            User user = (User) currentUser;
            Text text = new Text();
            text.key = str3;
            if (TextUtils.equals(str2, "user_fans_upgrade")) {
                i = 2131841661;
            } else {
                i = 2131841659;
            }
            text.defaultPattern = C497740JfY.LJIJI(i);
            TextFormat textFormat = new TextFormat();
            textFormat.color = "#ffffff";
            text.defaultFormat = textFormat;
            TextPieceUser textPieceUser = new TextPieceUser();
            C087800Uq.LIZIZ(10, badgeStruct, user);
            textPieceUser.user = user;
            TextPiece textPiece = new TextPiece();
            textPiece.userValue = textPieceUser;
            textPiece.type = EnumC1133850fbz.USER.getPieceType();
            TextFormat textFormat2 = new TextFormat();
            textFormat2.color = C786410Ut5.j4("#%x", Arrays.copyOf(new Object[]{Integer.valueOf(C497740JfY.LJFF(R.color.aag))}, 1));
            textPiece.format = textFormat2;
            TextPiece textPiece2 = new TextPiece();
            textPiece2.type = EnumC1133850fbz.STRING.getPieceType();
            textPiece2.stringValue = str;
            text.pieces = C1697810uHb.LJIIJJI(textPiece, textPiece2);
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                room = (Room) dataChannel2.gg0(RoomChannel.class);
            }
            CommonMessageData commonMessageData = new CommonMessageData();
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            commonMessageData.roomId = id;
            commonMessageData.showMsg = true;
            commonMessageData.messageId = C158B.LIZ();
            commonMessageData.foldType = 0L;
            commonMessageData.displayText = text;
            commonMessageData.createTime = C158B.LIZ();
            roomMessage.baseMessage = commonMessageData;
            if (iMessageManager != null) {
                iMessageManager.insertMessage(roomMessage, true);
            }
        }
    }
}
