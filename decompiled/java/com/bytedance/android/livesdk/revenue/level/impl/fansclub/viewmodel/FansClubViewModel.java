package com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel;

import X.AbstractC509530JyZ;
import X.AnonymousClass0956;
import X.C007E;
import X.C087800Uq;
import X.C098200Yq;
import X.C09JN;
import X.C0IJT;
import X.C0K9Q;
import X.C0KT0;
import X.C0KT2;
import X.C0KT6;
import X.C0KVU;
import X.C0TZM;
import X.C0UO0;
import X.C1078890eBL;
import X.C1078910eBN;
import X.C1092510eXJ;
import X.C1092520eXK;
import X.C1094580eae;
import X.C1094590eaf;
import X.C1094740eau;
import X.C1094910ebB;
import X.C1094950ebF;
import X.C1094970ebH;
import X.C1095010ebL;
import X.C1095070ebR;
import X.C1095090ebT;
import X.C1095100ebU;
import X.C1095110ebV;
import X.C1095120ebW;
import X.C1095130ebX;
import X.C1095140ebY;
import X.C1095160eba;
import X.C1095220ebg;
import X.C1095250ebj;
import X.C1095260ebk;
import X.C1095290ebn;
import X.C1095300ebo;
import X.C1095370ebv;
import X.C1095910ecn;
import X.C1095920eco;
import X.C1114690f75;
import X.C1117530fBf;
import X.C1161920gLG;
import X.C11NZ;
import X.C11S5;
import X.C13DA;
import X.C13LP;
import X.C15438062q;
import X.C158B;
import X.C1701940uOG;
import X.C189200o6;
import X.C19322110iZ;
import X.C19719612Di;
import X.C19748512Ol;
import X.C1CC2;
import X.C20337914i1;
import X.C20441214yg;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C389001fE;
import X.C419430GcX;
import X.C419440GcY;
import X.C467770IVz;
import X.C474500IjA;
import X.C480460Ism;
import X.C492290JSh;
import X.C495520Jby;
import X.C497740JfY;
import X.C500260Jjc;
import X.C517700KSa;
import X.C517740KSe;
import X.C518180KTw;
import X.C521750KdB;
import X.C748880TZe;
import X.C786410Ut5;
import X.C930940aKi;
import X.EnumC1095410ebz;
import X.EnumC1095860eci;
import X.InterfaceC1094160eZy;
import X.InterfaceC1095000ebK;
import X.InterfaceC1095170ebb;
import X.InterfaceC1095350ebt;
import X.InterfaceC1096360edW;
import X.InterfaceC1631620sYq;
import X.InterfaceC20484815Dq;
import X.InterfaceC2262081DgM;
import X.InterfaceC500940Jki;
import X.InterfaceC517900KSu;
import Y.AfS143S0200000_7;
import Y.AfS148S0200000_12;
import Y.AfS178S0100000_9;
import Y.AfS181S0100000_12;
import Y.AfS2S0110100_17;
import Y.AfS42S1200000_16;
import Y.AfS5S1210000_17;
import Y.AfS6S0010000_7;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.CombineBadgeBackground;
import com.bytedance.android.live.base.model.user.CombineBadgeStruct;
import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.browser.IHybridStorageService;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.GiftDialogVisibilityChannel;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.uikit.setting.LiveSheetMigrationFansGroupGuideV2Setting;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UpdateGiftIconEvent;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.goodybag.GoodyBagFansClubSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubAnchorEntranceSettings;
import com.bytedance.android.livesdk.livesetting.level.FansClubApiRequestEnableSettings;
import com.bytedance.android.livesdk.livesetting.level.FansClubAudienceEntranceSettings;
import com.bytedance.android.livesdk.livesetting.level.FansClubCommonParamConfig;
import com.bytedance.android.livesdk.livesetting.level.FansClubCommunityGuideDisplayConfiguration;
import com.bytedance.android.livesdk.livesetting.level.FansClubCommunityGuideItem;
import com.bytedance.android.livesdk.livesetting.level.FansClubCommunityGuideTriggerConfigurationSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubCompensationExpSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubDynamicConfig;
import com.bytedance.android.livesdk.livesetting.level.FansClubEnableGameplayRefreshGiftPanelSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubGiftJoinDialogStyleSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubJoinDialogSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubJoinDialogStyleSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubJoinPanelUpgradeSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubLevelUpEnableSettings;
import com.bytedance.android.livesdk.livesetting.level.FansClubMonitorInvalidateMsgSettings;
import com.bytedance.android.livesdk.livesetting.level.FansClubPanelV2Settings;
import com.bytedance.android.livesdk.livesetting.level.FansClubScoreFixedEnableSettings;
import com.bytedance.android.livesdk.livesetting.level.FansClubSettings;
import com.bytedance.android.livesdk.livesetting.level.FansClubTaskPageInitSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubTaskPanelOptSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubZeroClaimAnimFixSetting;
import com.bytedance.android.livesdk.livesetting.level.FansEntranceResConfig;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubAwarenessEnhancementSetting;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubRoomInfoGuideTimeoutDurationSetting;
import com.bytedance.android.livesdk.livesetting.level.ParamConfig;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.EntranceGuidanceContainer;
import com.bytedance.android.livesdk.model.message.FansEventData;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubChannel;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubEvent;
import com.bytedance.android.livesdk.revenue.level.api.event.UserInfoGuideAnimEvent;
import com.bytedance.android.livesdk.revenue.level.api.fansclub.model.FansClubJoinDialogInitData;
import com.bytedance.android.livesdk.revenue.level.api.fansclub.model.FansClubTaskPageData;
import com.bytedance.android.livesdk.revenue.level.api.fansclub.model.RankFirstInfo;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.FansClubWidget;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.api.FansClubApi;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.api.FansClubCompensationApi;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.superfans.goal.SuperFansGoalJoinDialog;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.AbsFansClubJoinDialog;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.FansClubJoinDialog;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.FansClubJoinDialogV1;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.FansClubJoinDialogV2;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.FansClubJoinDialogV2New;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.FansClubJoinDialogV3;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.FansClubJoinGiftCenterDialog;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.FansClubJoinGiftDialogV2;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.FansClubJoinGiftDialogV2New;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialogv2.JoinDialogProxyViewModel;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.FansClubViewModel;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.ui.SuperFanViewModel;
import com.bytedance.android.livesdk.userservice.UserApi;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.watch.OrientationChangeEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetViewModel;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS135S0110000_17;
import kotlin.jvm.internal.AwS32S0000100_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS67S1000000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;
import qo2.w;
import tikcast.api.fans.FansGetTaskInfoResponse;
import tikcast.api.fans.GetNonFansUserDataResponse;
import tikcast.api.fans.UserPopularityInfo;
import ttpobfuscated.e3;
import webcast.api.fans.FansTaskOperateRequest;
import webcast.data.FansLevelInfo;
import webcast.data.FansScoreRule;
import webcast.data.SubSplitStatus;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubViewModel extends LiveWidgetViewModel implements IFansClubService, OnMessageListener {
    public C1095300ebo LLILZLL;
    public FansEventData.GetUnclaimedPoints LLIZ;
    public C1078890eBL LLIZLLLIL;
    public C1094910ebB LLJ;
    public C1095370ebv LLJI;
    public C1078910eBN LLJIJIL;
    public C1092510eXJ LLJILJILJ;
    public SuperFanViewModel LLJJI;
    public JoinDialogViewModel LLJJIII;
    public SuperFansGoalViewModel LLJJIJI;
    public JoinDialogProxyViewModel LLJJIJIIJIL;
    public AnonymousClass0956 LLJJIJIL;
    public long LLJJJ;
    public C492290JSh LLJJJIL;
    public final ISubscriptionStatusService LLJJJJ;
    public boolean LLJJJJJIL;
    public final String LL = "FansClubViewModel";
    public String LLILLJJLI = "unknown";
    public final boolean LLILLL = FansClubLevelUpEnableSettings.INSTANCE.getValue();
    public final boolean LLILZ = FansClubApiRequestEnableSettings.INSTANCE.getValue();
    public final boolean LLILZIL = FansClubMonitorInvalidateMsgSettings.INSTANCE.getValue();
    public final List<String> LLJILJIL = new ArrayList();
    public final C1092520eXK LLJILLL = new C1092520eXK();
    public final BPEAHandler LLJJ = new BPEAHandler(Looper.getMainLooper(), new C521750KdB(this, 2));

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void Gy1() {
        this.LLJJIII = null;
        this.LLJJIJI = null;
        C492290JSh c492290JSh = this.LLJJJIL;
        if (c492290JSh != null) {
            c492290JSh.LIZ();
        }
        this.LLJJ.removeMessages(1);
        C1095250ebj.LIZ.removeMessages(0);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void eS1(DataChannel dataChannel, String str, Map map, boolean z) {
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void lI2() {
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final RoomRecycleWidget pa2() {
        return null;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean Ag1() {
        FansClubDynamicConfig fansClubDynamicConfig = FansClubSettings.INSTANCE.getFansClubConfig().fansClubDynamicConfig;
        if (fansClubDynamicConfig != null) {
            return fansClubDynamicConfig.enableFastFollowByFansLevel;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void C11() {
        SuperFanViewModel superFanViewModel = this.LLJJI;
        if (superFanViewModel != null) {
            superFanViewModel.vQ2(new C0KT0(C0KT2.PREFETCH, "prefetch", LiveFansClubAwarenessEnhancementSetting.INSTANCE.isEnabled() ? 5 : 0), FansClubJoinPanelUpgradeSetting.INSTANCE.getValue(), new InterfaceC517900KSu() { // from class: X.0KTj
                @Override // X.InterfaceC517900KSu
                public final void LIZ(C0KSY<GetNonFansUserDataResponse.Data> c0ksy, C0KS8 c0ks8) {
                }

                @Override // X.InterfaceC517900KSu
                public final void onFailure() {
                }
            });
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void LA2() {
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_follow");
        c474500IjALIZ.LJJII(C497740JfY.LJIL() ? "portrait" : "landscape", "room_orientation");
        c474500IjALIZ.LJJII(Long.valueOf(iLiveHostCrossRoomEventHelper.getIsTransfer()), "is_transfer");
        c474500IjALIZ.LJJII(Long.valueOf(iLiveHostCrossRoomEventHelper.getIsMatchOpponent()), "is_match_opponent");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJJ();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            c474500IjALIZ.LJJII(Integer.valueOf(((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).ip(room.getId())), "server_heat_level");
            c474500IjALIZ.LJJII(Integer.valueOf(((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).v5(room.getId())), "client_heat_level");
        }
        C518180KTw.LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII("live_audience_c_anchor", "request_page");
        c474500IjALIZ.LJJII("first_join_fans_club", "click_user_position");
        w.LIZ.getClass();
        if (Intrinsics.LJFF("live_detail", w.LJIIIZ()) || Intrinsics.LJFF("others_homepage", w.LJIIIZ())) {
            c474500IjALIZ.LJJII(iLiveHostCrossRoomEventHelper.getFromRequestId(), "cohost_from_request_id");
            c474500IjALIZ.LJJII(iLiveHostCrossRoomEventHelper.getFromRoomId(), "cohost_from_room_id");
        }
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean TL0() {
        return FansClubAudienceEntranceSettings.INSTANCE.getValue();
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean oS0() {
        return FansClubAnchorEntranceSettings.INSTANCE.getValue();
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean wd2() {
        AbstractC509530JyZ abstractC509530JyZLIZJ;
        C492290JSh c492290JSh = this.LLJJJIL;
        return (c492290JSh == null || (abstractC509530JyZLIZJ = c492290JSh.LIZJ()) == null || !abstractC509530JyZLIZJ.LIZ) ? false : true;
    }

    public FansClubViewModel() {
        ISubscriptionStatusService.LJIIIZ.getClass();
        this.LLJJJJ = C0K9Q.LIZ();
    }

    public final void HQ2() {
        C1095140ebY c1095140ebY;
        DataChannel dataChannel;
        Room room;
        User.FansClubInfo fansClubInfo;
        DataChannel dataChannel2 = getDataChannel();
        if (dataChannel2 == null || (c1095140ebY = (C1095140ebY) dataChannel2.gg0(FansClubChannel.class)) == null || (dataChannel = getDataChannel()) == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null) {
            return;
        }
        User owner = room.getOwner();
        if (owner != null && (fansClubInfo = owner.fansClubInfo) != null) {
            fansClubInfo.fansCount = c1095140ebY.LJII;
            fansClubInfo.fansLevel = c1095140ebY.LIZ;
            fansClubInfo.fansScore = c1095140ebY.LIZIZ;
            fansClubInfo.badge = c1095140ebY.LIZJ;
            fansClubInfo.isSleeping = c1095140ebY.LJ == 2;
        }
        DataChannel dataChannel3 = getDataChannel();
        if (dataChannel3 != null) {
            dataChannel3.zW(RoomChannel.class, room);
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final long Ib1() {
        long j;
        C1095140ebY c1095140ebYUw0 = uw0();
        long j2 = c1095140ebYUw0 != null ? c1095140ebYUw0.LIZIZ : 0L;
        Map<Integer, FansScoreRule> map = C1095130ebX.LIZ;
        int i = c1095140ebYUw0 != null ? (int) c1095140ebYUw0.LIZ : 0;
        FansScoreRule fansScoreRule = (FansScoreRule) ((LinkedHashMap) map).get(Integer.valueOf(i));
        if (fansScoreRule != null) {
            j = fansScoreRule.levelMaxScore;
            if (j <= 0) {
            }
            return j - j2;
        }
        j = 0;
        if (FansClubScoreFixedEnableSettings.INSTANCE.getValue()) {
            j = C1094970ebH.LIZ == i ? C1094970ebH.LIZIZ : 0L;
        }
        return j - j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b A[PHI: r5
      0x002b: PHI (r5v1 com.bytedance.android.live.base.model.user.SubscribeBadge) = 
      (r5v0 com.bytedance.android.live.base.model.user.SubscribeBadge)
      (r5v3 com.bytedance.android.live.base.model.user.SubscribeBadge)
      (r5v3 com.bytedance.android.live.base.model.user.SubscribeBadge)
      (r5v3 com.bytedance.android.live.base.model.user.SubscribeBadge)
     binds: [B:28:0x005b, B:10:0x001f, B:12:0x0025, B:14:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Iy2() {
        /*
            r12 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r12.getDataChannel()
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = X.C500260Jjc.LJJLIIIIJ(r0)
            r9 = 0
            if (r3 == 0) goto L5a
            com.bytedance.android.live.base.model.user.User r0 = r3.getOwner()
            if (r0 == 0) goto L5a
            com.bytedance.android.live.base.model.user.SubscribeInfo r0 = r0.getSubscribeInfo()
            if (r0 == 0) goto L5a
            com.bytedance.android.live.base.model.user.SubscribeBadge r5 = r0.getSubscribeBadge()
        L1b:
            com.bytedance.android.live.base.model.user.User r0 = r3.getOwner()
            if (r0 == 0) goto L2b
            com.bytedance.android.live.base.model.user.SubscribeInfo r0 = r0.getSubscribeInfo()
            if (r0 == 0) goto L2b
            java.lang.String r8 = r0.packageId
            if (r8 != 0) goto L2d
        L2b:
            java.lang.String r8 = ""
        L2d:
            if (r3 == 0) goto L58
            com.bytedance.android.live.base.model.user.User r0 = r3.getOwner()
            if (r0 == 0) goto L58
            com.bytedance.android.live.base.model.user.SubscribeInfo r0 = r0.getSubscribeInfo()
            if (r0 == 0) goto L58
            int r1 = r0.status
            r0 = 2
            if (r1 != r0) goto L58
            r7 = 1
        L41:
            X.0K6y r4 = new X.0K6y
            r6 = 0
            r11 = 862(0x35e, float:1.208E-42)
            r10 = r9
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService r2 = r12.LLJJJJ
            X.0K6i r1 = new X.0K6i
            r0 = 6
            r1.<init>(r4, r9, r9, r0)
            X.0KAA r0 = X.C0KAA.SUBSCRIBE_SUCCESS
            r2.AV1(r3, r1, r0)
            return
        L58:
            r7 = 0
            goto L41
        L5a:
            r5 = r9
            if (r3 == 0) goto L2b
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.FansClubViewModel.Iy2():void");
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void Wt2() {
        String strWQ2 = wQ2();
        C20337914i1<CopyOnWriteArraySet<String>> c20337914i1 = InterfaceC1094160eZy.v1;
        CopyOnWriteArraySet<String> copyOnWriteArraySetLIZIZ = c20337914i1.LIZIZ();
        copyOnWriteArraySetLIZIZ.remove(strWQ2);
        c20337914i1.LJFF(copyOnWriteArraySetLIZIZ);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean c70() {
        Boolean bool;
        DataChannel dataChannel = getDataChannel();
        C1095140ebY c1095140ebY = dataChannel != null ? (C1095140ebY) dataChannel.gg0(FansClubChannel.class) : null;
        DataChannel dataChannel2 = getDataChannel();
        return (c1095140ebY == null || c1095140ebY.LIZ != 0) && !((dataChannel2 == null || (bool = (Boolean) dataChannel2.gg0(UserIsAnchorChannel.class)) == null) ? false : bool.booleanValue());
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final ArrayList<Double> i42() {
        return InterfaceC1094160eZy.w1.LIZIZ().get(wQ2());
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean il0() {
        return C1095130ebX.LIZ();
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void nk1() {
        String strWQ2 = wQ2();
        C20337914i1<CopyOnWriteArraySet<String>> c20337914i1 = InterfaceC1094160eZy.v1;
        CopyOnWriteArraySet<String> copyOnWriteArraySetLIZIZ = c20337914i1.LIZIZ();
        if (copyOnWriteArraySetLIZIZ.size() > 100) {
            copyOnWriteArraySetLIZIZ.clear();
        }
        copyOnWriteArraySetLIZIZ.add(strWQ2);
        c20337914i1.LJFF(copyOnWriteArraySetLIZIZ);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C1078910eBN c1078910eBN = this.LLJIJIL;
        if (c1078910eBN != null) {
            List<InterfaceC1095000ebK> list = c1078910eBN.LIZ;
            if (list != null) {
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1095000ebK) it2.next()).onRelease();
                }
            }
            List<InterfaceC1095000ebK> list2 = c1078910eBN.LIZ;
            if (list2 != null) {
                ((ArrayList) list2).clear();
            }
        }
        C1092510eXJ c1092510eXJ = this.LLJILJILJ;
        if (c1092510eXJ != null) {
            c1092510eXJ.LIZIZ = false;
            c1092510eXJ.LIZJ = false;
            c1092510eXJ.LIZLLL.removeMessages(11);
        }
        this.LLJIJIL = null;
        this.LLJILJILJ = null;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final C1095140ebY uw0() {
        DataChannel dataChannel = getDataChannel();
        if (dataChannel != null) {
            return (C1095140ebY) dataChannel.gg0(FansClubChannel.class);
        }
        return null;
    }

    public final String wQ2() {
        Room room;
        DataChannel dataChannel = getDataChannel();
        String string = null;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            string = Long.valueOf(room.getOwnerUserId()).toString();
        }
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(string);
        sbLIZ.append(strValueOf);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void we2() {
        Boolean bool;
        DataChannel dataChannel = getDataChannel();
        boolean zBooleanValue = (dataChannel == null || (bool = (Boolean) dataChannel.gg0(C0TZM.class)) == null) ? true : bool.booleanValue();
        JoinDialogProxyViewModel joinDialogProxyViewModel = this.LLJJIJIIJIL;
        if (joinDialogProxyViewModel != null) {
            LiveSheetFragment liveSheetFragmentXQ2 = joinDialogProxyViewModel.xQ2(getDataChannel(), "comment_panel", EnumC1095410ebz.ONLY_FANS_CLUB);
            if (zBooleanValue) {
                DQ2(liveSheetFragmentXQ2, "-1", "comment_panel", false);
                return;
            }
            DataChannel dataChannel2 = getDataChannel();
            if (dataChannel2 != null) {
                dataChannel2.FQ2(OrientationChangeEvent.class);
            }
            C11NZ.LJLJJLL(700L, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS42S1200000_16(this, liveSheetFragmentXQ2, 2));
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final Class<? extends LiveRecyclableWidget> PH() {
        return FansClubWidget.class;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final int AR(List<BadgeStruct> list) {
        String str;
        int i = -1;
        if (list != null) {
            for (BadgeStruct badgeStruct : list) {
                if (badgeStruct.badgeScene == 10) {
                    try {
                        PrivilegeLogExtra privilegeLogExtra = badgeStruct.logExtra;
                        if (privilegeLogExtra != null && (str = privilegeLogExtra.level) != null) {
                            i = CastIntegerProtector.parseInt(str);
                        } else {
                            i = 0;
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
        return i;
    }

    public final void FQ2(ImageModel imageModel) {
        Boolean bool;
        if (imageModel == null || getDataChannel() == null || !FansClubEnableGameplayRefreshGiftPanelSetting.INSTANCE.getValue()) {
            return;
        }
        DataChannel dataChannel = getDataChannel();
        if (dataChannel == null || (bool = (Boolean) dataChannel.gg0(GiftDialogVisibilityChannel.class)) == null || !bool.booleanValue()) {
            C007E c007e = new C007E(imageModel);
            DataChannel dataChannel2 = getDataChannel();
            if (dataChannel2 != null) {
                dataChannel2.LC0(UpdateGiftIconEvent.class, c007e);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void Fr0(String str) {
        if (str == null) {
            return;
        }
        this.LLILLJJLI = str;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean HZ1(long j) {
        int i = C1095260ebk.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        TreeSet<C1094950ebF> treeSet = C1095260ebk.LIZIZ;
        if (treeSet == null || treeSet.isEmpty()) {
            return false;
        }
        for (C1094950ebF c1094950ebF : treeSet) {
            if (c1094950ebF.LIZ == j && c1094950ebF.LIZIZ > jCurrentTimeMillis) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean Kw0(DataChannel dataChannel) {
        return ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Kw0(dataChannel);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final Fragment Qn0(String str) {
        Fragment fragmentVQ2;
        FansClubJoinPanelUpgradeSetting fansClubJoinPanelUpgradeSetting = FansClubJoinPanelUpgradeSetting.INSTANCE;
        if (fansClubJoinPanelUpgradeSetting.isExperimentalGroup()) {
            JoinDialogProxyViewModel joinDialogProxyViewModel = this.LLJJIJIIJIL;
            if (joinDialogProxyViewModel != null) {
                DataChannel dataChannel = getDataChannel();
                if (fansClubJoinPanelUpgradeSetting.getValue() == 1) {
                    return joinDialogProxyViewModel.xQ2(dataChannel, str, EnumC1095410ebz.ONLY_FANS_CLUB);
                }
                FansClubJoinGiftCenterDialog fansClubJoinGiftCenterDialog = new FansClubJoinGiftCenterDialog();
                fansClubJoinGiftCenterDialog.LL = str;
                fansClubJoinGiftCenterDialog.MR(joinDialogProxyViewModel.LL);
                return fansClubJoinGiftCenterDialog;
            }
            return null;
        }
        JoinDialogViewModel joinDialogViewModel = this.LLJJIII;
        if (joinDialogViewModel != null) {
            if (joinDialogViewModel.LLILLL == null) {
                if (FansClubGiftJoinDialogStyleSetting.INSTANCE.getValue() == 0) {
                    if (LiveSheetMigrationFansGroupGuideV2Setting.INSTANCE.enable()) {
                        fragmentVQ2 = new FansClubJoinGiftDialogV2New();
                    } else {
                        fragmentVQ2 = new FansClubJoinGiftDialogV2(false);
                    }
                } else {
                    fragmentVQ2 = JoinDialogViewModel.vQ2();
                }
                joinDialogViewModel.LLILLL = fragmentVQ2;
            }
            Fragment fragment = joinDialogViewModel.LLILLL;
            if (fragment instanceof AbsFansClubJoinDialog) {
                AbsFansClubJoinDialog absFansClubJoinDialog = (AbsFansClubJoinDialog) fragment;
                absFansClubJoinDialog.LL = str;
                absFansClubJoinDialog.MR(joinDialogViewModel);
                return absFansClubJoinDialog;
            }
            if (fragment instanceof FansClubJoinDialogV2New) {
                FansClubJoinDialogV2New fansClubJoinDialogV2New = (FansClubJoinDialogV2New) fragment;
                FansClubJoinDialogV2 fansClubJoinDialogV2 = fansClubJoinDialogV2New.LLJLLL;
                fansClubJoinDialogV2.LL = str;
                fansClubJoinDialogV2.MR(joinDialogViewModel);
                return fansClubJoinDialogV2New;
            }
            if (fragment instanceof FansClubJoinGiftDialogV2New) {
                FansClubJoinGiftDialogV2New fansClubJoinGiftDialogV2New = (FansClubJoinGiftDialogV2New) fragment;
                FansClubJoinGiftDialogV2 fansClubJoinGiftDialogV2 = fansClubJoinGiftDialogV2New.LLJLLL;
                fansClubJoinGiftDialogV2.LL = str;
                fansClubJoinGiftDialogV2.MR(joinDialogViewModel);
                return fansClubJoinGiftDialogV2New;
            }
            return null;
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void RL1(String str) {
        C0KT6.LIZ = false;
        EQ2(getDataChannel(), str, true);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void RV0(String str) {
        this.LLJILLL.getClass();
        C1092520eXK.LJ(null, str, true);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final C419440GcY SR1(Context context) {
        if (context == null) {
            return null;
        }
        return new C419440GcY(context);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean VV0(String str) {
        boolean zBooleanValue;
        FragmentManager fragmentManager;
        Boolean bool;
        DataChannel dataChannel = getDataChannel();
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(C0TZM.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        SuperFansGoalJoinDialog superFansGoalJoinDialog = new SuperFansGoalJoinDialog();
        superFansGoalJoinDialog.LLJLLL = str;
        superFansGoalJoinDialog.LLJZ = this.LLJJIJI;
        superFansGoalJoinDialog.LLJZIJLIL = this.LLJJI;
        superFansGoalJoinDialog.LLL = getDataChannel();
        if (zBooleanValue) {
            DataChannel dataChannel2 = getDataChannel();
            if (dataChannel2 != null && (fragmentManager = (FragmentManager) dataChannel2.gg0(C748880TZe.class)) != null) {
                C19322110iZ.LJFF(fragmentManager, superFansGoalJoinDialog, "super_fans_goal_dialog", null, C467770IVz.LIZ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)));
                return true;
            }
            return false;
        }
        DataChannel dataChannel3 = getDataChannel();
        if (dataChannel3 != null) {
            dataChannel3.FQ2(OrientationChangeEvent.class);
        }
        C11NZ.LJLJJLL(700L, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS143S0200000_7((Object) this, (EmoteModel) superFansGoalJoinDialog, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 8));
        return true;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final C419430GcX WL2(Context context) {
        if (context == null) {
            return null;
        }
        return new C419430GcX(context);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final int Wy2(int i) {
        if (!C1095130ebX.LIZ() || getDataChannel() == null) {
            return 0;
        }
        Integer num = (Integer) ((LinkedHashMap) C1095130ebX.LIZIZ).get(Integer.valueOf(i));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final FansEntranceResConfig gY(int i) {
        int i2;
        List<FansEntranceResConfig> list = FansClubSettings.INSTANCE.getFansClubConfig().fansEntranceGeckoConfigList;
        FansEntranceResConfig fansEntranceResConfig = null;
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        Iterator<FansEntranceResConfig> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            FansEntranceResConfig next = it2.next();
            FansEntranceResConfig fansEntranceResConfig2 = next;
            if (fansEntranceResConfig2 != null) {
                i2 = fansEntranceResConfig2.fansGrade;
            } else {
                i2 = 0;
            }
            if (i <= i2) {
                fansEntranceResConfig = next;
                break;
            }
        }
        return fansEntranceResConfig;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean iA2(boolean z) {
        C1078910eBN c1078910eBN;
        List<InterfaceC1095000ebK> list;
        if (!InterfaceC1094160eZy.v1.LIZIZ().contains(wQ2())) {
            if (!z && (c1078910eBN = this.LLJIJIL) != null && (list = c1078910eBN.LIZ) != null) {
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    if (((InterfaceC1095000ebK) it2.next()).LIZIZ()) {
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean kI1(DataChannel dataChannel) {
        return ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).kI1(dataChannel);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) throws JSONException {
        zQ2(iMessage);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean pY1(SubSplitStatus subSplitStatus) {
        return ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).pY1(subSplitStatus);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void qH(double d) {
        String strWQ2 = wQ2();
        C20337914i1<Map<String, ArrayList<Double>>> c20337914i1 = InterfaceC1094160eZy.w1;
        Map<String, ArrayList<Double>> mapLIZIZ = c20337914i1.LIZIZ();
        if (mapLIZIZ.size() > 100) {
            mapLIZIZ.clear();
        }
        ArrayList<Double> arrayList = mapLIZIZ.get(strWQ2);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            arrayList.add(Double.valueOf(d));
            mapLIZIZ.put(strWQ2, arrayList);
        } else if (!arrayList.contains(Double.valueOf(d))) {
            arrayList.add(Double.valueOf(d));
        }
        mapLIZIZ.put(strWQ2, arrayList);
        c20337914i1.LJFF(mapLIZIZ);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final ImageModel qf1(long j) {
        if (!C1095130ebX.LIZ() || getDataChannel() == null) {
            return null;
        }
        return (ImageModel) ((LinkedHashMap) C1095130ebX.LIZJ).get(Long.valueOf(j));
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void sp1(Context context) {
        ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).sp1(context);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final C1095140ebY tL1(User user) {
        User.FansClubInfo fansClubInfo;
        int i;
        if (user == null || (fansClubInfo = user.fansClubInfo) == null) {
            return null;
        }
        long j = fansClubInfo.fansLevel;
        long j2 = fansClubInfo.fansScore;
        ImageModel imageModel = fansClubInfo.badge;
        boolean z = fansClubInfo.isSleeping;
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        return new C1095140ebY(j, j2, imageModel, i, xQ2((int) j, z), fansClubInfo.fansCount, 7936);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void wQ(double d) {
        String strWQ2 = wQ2();
        C20337914i1<Map<String, ArrayList<Double>>> c20337914i1 = InterfaceC1094160eZy.w1;
        Map<String, ArrayList<Double>> mapLIZIZ = c20337914i1.LIZIZ();
        ArrayList<Double> arrayList = mapLIZIZ.get(strWQ2);
        if (arrayList != null) {
            arrayList.remove(Double.valueOf(d));
        }
        c20337914i1.LJFF(mapLIZIZ);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final C1094950ebF y51(long j) {
        int i = C1095260ebk.LIZ;
        TreeSet<C1094950ebF> treeSet = C1095260ebk.LIZIZ;
        C1094950ebF c1094950ebF = null;
        if (treeSet != null) {
            for (C1094950ebF c1094950ebF2 : treeSet) {
                if (c1094950ebF2.LIZ == j) {
                    c1094950ebF = c1094950ebF2;
                }
            }
            c1094950ebF = c1094950ebF;
        }
        TreeSet<C1094950ebF> treeSet2 = C1095260ebk.LIZIZ;
        if (treeSet2 != null) {
            C19719612Di.LJJIII(treeSet2, new AwS32S0000100_17(j, 5), true);
        }
        return c1094950ebF;
    }

    public final ImageModel yQ2(long j) {
        if (!C1095130ebX.LIZ() || getDataChannel() == null) {
            return null;
        }
        return (ImageModel) ((LinkedHashMap) C1095130ebX.LIZLLL).get(Long.valueOf(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:229:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x043f A[PHI: r1
      0x043f: PHI (r1v89 java.lang.String) = (r1v88 java.lang.String), (r1v92 java.lang.String), (r1v92 java.lang.String) binds: [B:319:0x043c, B:310:0x0427, B:312:0x042b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0541 A[PHI: r5
      0x0541: PHI (r5v19 long) = (r5v18 long), (r5v21 long) binds: [B:391:0x053e, B:353:0x04ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x056b A[PHI: r5
      0x056b: PHI (r5v12 long) = (r5v11 long), (r5v14 long) binds: [B:407:0x0568, B:403:0x055b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:598:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zQ2(com.ss.ugc.live.sdk.message.data.IMessage r29) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 2082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.FansClubViewModel.zQ2(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    public static void BQ2(Function0 function0, boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C480460Ism.LIZ().getClass();
        ((FansClubApi) C480460Ism.LIZLLL(FansClubApi.class)).getFansConfigWithParameter().LJFF(new C0UO0()).LJJIIZ(new AfS2S0110100_17(jCurrentTimeMillis, function0, z, 2), new AfS6S0010000_7(z, 0));
    }

    public static String xQ2(int i, boolean z) {
        if (z) {
            return "#FF767676";
        }
        String str = (String) ((LinkedHashMap) C1095130ebX.LJFF).get(Integer.valueOf(i));
        if (TextUtils.isEmpty(str)) {
            if (i >= 50) {
                return "#FFB21BCB";
            }
            if (i >= 40) {
                return "#FFD631B1";
            }
            if (i > 30) {
                return "#FFFF4F4F";
            }
            if (i > 20) {
                return "#FFFF6C37";
            }
            if (i < 10) {
                return "#FFFF984D";
            }
            return "#FFFD8E3F";
        }
        if (str == null) {
            return "#FFFF984D";
        }
        return str;
    }

    public final void AQ2(FansEventData.EntranceGuidanceData entranceGuidanceData, String str) {
        int i;
        FansClubCommunityGuideItem guideByType;
        FansClubCommunityGuideDisplayConfiguration displayConfiguration;
        Map<String, String> mapLJ;
        if (entranceGuidanceData != null && (guideByType = FansClubCommunityGuideTriggerConfigurationSetting.INSTANCE.getGuideByType((i = entranceGuidanceData.guidanceType))) != null && (displayConfiguration = guideByType.getDisplayConfiguration()) != null && !TextUtils.isEmpty(displayConfiguration.getChannelName()) && !TextUtils.isEmpty(displayConfiguration.getGuideLottieFileName())) {
            Map<String, String> eventParams = guideByType.getEventParams();
            if (eventParams == null) {
                eventParams = C2097608Jq.LJ();
            }
            DataChannel dataChannel = getDataChannel();
            if (dataChannel != null) {
                String channelName = displayConfiguration.getChannelName();
                String guideLottieFileName = displayConfiguration.getGuideLottieFileName();
                C13DA c13da = new C13DA();
                c13da.put("guidance_type", String.valueOf(i));
                c13da.putAll(eventParams);
                EntranceGuidanceContainer entranceGuidanceContainer = entranceGuidanceData.entranceGuidanceContainer;
                if (entranceGuidanceContainer == null || (mapLJ = entranceGuidanceContainer.extra) == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                c13da.putAll(mapLJ);
                Map mapBuild = c13da.build();
                C1094580eae c1094580eae = C1094580eae.LIZ;
                Text text = entranceGuidanceData.text;
                c1094580eae.getClass();
                dataChannel.LC0(UserInfoGuideAnimEvent.class, new C1094740eau(str, channelName, guideLottieFileName, mapBuild, C1094580eae.LJFF(text).toString(), entranceGuidanceData.icon, LiveFansClubRoomInfoGuideTimeoutDurationSetting.INSTANCE.getValue()));
            }
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean C71(int i, int i2) {
        if (i > i2) {
            return false;
        }
        Iterator<Integer> it2 = C1095130ebX.LJ.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            if (i + 1 <= iIntValue && iIntValue <= i2) {
                i3 = iIntValue;
            }
        }
        if (i3 <= 0) {
            return false;
        }
        return true;
    }

    public final void CQ2(C1095140ebY c1095140ebY, boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fans_club_level", String.valueOf(c1095140ebY.LIZ));
        jSONObject.put("fans_club_status", C518180KTw.LJJII(c1095140ebY.LJ, c1095140ebY.LIZ, z));
        C389001fE.LIZ("live_fans_club_info_update", jSONObject, System.currentTimeMillis(), false);
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendLiveFansClubInfoUpdate firstJoin=");
        sbLIZ.append(z);
        sbLIZ.append(" payload=");
        sbLIZ.append(jSONObject);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void OF0(SparkContext sparkContext, String str) {
        Object c098200Yq;
        long ownerUserId;
        long currentUserId;
        Room room;
        Room room2;
        boolean zLJIIZILJ;
        String str2;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Long lValueOf;
        String strValueOf;
        long j;
        int i;
        boolean z;
        Object obj;
        try {
            c098200Yq = UriProtector.parse(sparkContext.LJIJI());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        User userLJIIIIZZ = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Uri uri = (Uri) c098200Yq;
        if (uri == null) {
            uri = Uri.EMPTY;
        }
        HashMap map = new HashMap();
        ParamConfig commonParamsConfig = FansClubCommonParamConfig.INSTANCE.getCommonParamsConfig(str);
        long id = 0;
        if (commonParamsConfig.needCommonParam) {
            DataChannel dataChannel = getDataChannel();
            if (dataChannel != null) {
                zLJIIZILJ = C500260Jjc.LJIIZILJ(dataChannel);
            } else {
                zLJIIZILJ = false;
            }
            map.put("online_cnt", String.valueOf(((IRankService) C1161920gLG.LIZJ(IRankService.class)).yy2()));
            String str3 = "";
            if (!zLJIIZILJ) {
                if (uri == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "trigger_type")) == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                boolean zEquals = TextUtils.equals(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "join");
                C1095140ebY c1095140ebYUw0 = uw0();
                String str4 = "1";
                if (zEquals) {
                    strValueOf = "1";
                } else {
                    if (c1095140ebYUw0 != null) {
                        lValueOf = Long.valueOf(c1095140ebYUw0.LIZ);
                    } else {
                        lValueOf = null;
                    }
                    strValueOf = String.valueOf(lValueOf);
                }
                map.put("fans_club_level", strValueOf);
                if (c1095140ebYUw0 != null) {
                    j = c1095140ebYUw0.LIZ;
                    i = c1095140ebYUw0.LJ;
                } else {
                    j = 0;
                    i = 0;
                }
                map.put("fans_club_status", C518180KTw.LJJII(i, j, zEquals));
                C1095140ebY c1095140ebYUw02 = uw0();
                if (c1095140ebYUw02 != null && c1095140ebYUw02.LJ == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("is_sleeping", obj);
                if (!((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).wd2()) {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("skeleton_is_super_fan", str4);
            }
            map.put("live_fans_club_task_panel_opt", String.valueOf(FansClubTaskPanelOptSetting.INSTANCE.getValue()));
            C1095140ebY c1095140ebYUw03 = uw0();
            if (c1095140ebYUw03 != null && (str2 = c1095140ebYUw03.LJIIL) != null) {
                str3 = str2;
            }
            map.put("fans_club_name", str3);
            DataChannel dataChannel2 = getDataChannel();
            if (dataChannel2 != null) {
                userLJIIIIZZ = C500260Jjc.LJIIIIZZ(dataChannel2);
            }
            map.put("nick_name", C0KVU.LIZ(userLJIIIIZZ));
        }
        if (commonParamsConfig.needPreloadStorageKey) {
            DataChannel dataChannel3 = getDataChannel();
            if (dataChannel3 != null && (room2 = (Room) dataChannel3.gg0(RoomChannel.class)) != null) {
                ownerUserId = room2.getOwnerUserId();
            } else {
                ownerUserId = 0;
            }
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            if (interfaceC500940JkiUser != null) {
                currentUserId = interfaceC500940JkiUser.getCurrentUserId();
            } else {
                currentUserId = 0;
            }
            DataChannel dataChannel4 = getDataChannel();
            if (dataChannel4 != null && (room = (Room) dataChannel4.gg0(RoomChannel.class)) != null) {
                id = room.getId();
            }
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("anchor_id", Long.valueOf(ownerUserId)), new Pair("user_id", Long.valueOf(currentUserId)), new Pair("room_id", Long.valueOf(id)));
            Regex regex = new Regex("\\{([^}]+)\\}");
            ArrayList arrayList = new ArrayList();
            List<String> list = commonParamsConfig.preloadStorageKeys;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Boolean.valueOf(arrayList.add(regex.replace(it2.next(), new AwS589S0100000_10(mapLJIIIIZZ, (Map<String, String>) 611)))));
            }
            map.put("preload_storage_keys", C13LP.LJJLIIIJ(arrayList, ",", e3.e, e3.f, 0, null, null, 56));
        }
        for (Map.Entry entry : map.entrySet()) {
            if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, (String) entry.getKey()) == null && !sparkContext.LJJJ().containsKey(entry.getKey())) {
                sparkContext.LJJJZ((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void S30(Gift gift, Long l) {
        C1078890eBL c1078890eBL = this.LLIZLLLIL;
        if (c1078890eBL != null && l != null) {
            l.longValue();
            if (gift != null && c1078890eBL.LIZIZ == l.longValue()) {
                c1078890eBL.LIZ = gift;
                l.longValue();
                if (l.longValue() == c1078890eBL.LIZIZ) {
                    c1078890eBL.LIZJ.removeMessages(2);
                }
                C786410Ut5.LJLJJI(2, 300000L, c1078890eBL.LIZJ);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void St1(Context context, C1094590eaf c1094590eaf) {
        Long lValueOf;
        long ownerUserId;
        FansLevelInfo fansLevelInfo;
        Long lValueOf2;
        long ownerUserId2;
        UserPopularityInfo userPopularityInfo;
        RankFirstInfo rankFirstInfo;
        FansGetTaskInfoResponse.Data data;
        int i;
        FansClubTaskPageData fansClubTaskPageData;
        int i2;
        long j;
        String str;
        String str2;
        Room room;
        Room room2;
        String str3 = "";
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null) {
            lValueOf = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId());
        } else {
            lValueOf = null;
        }
        DataChannel dataChannel = getDataChannel();
        long j2 = 0;
        if (dataChannel != null && (room2 = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            ownerUserId = room2.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        try {
            IHybridStorageService iHybridStorageService = (IHybridStorageService) C1161920gLG.LIZJ(IHybridStorageService.class);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fe_fans_level_info_");
            sbLIZ.append(lValueOf);
            String str4 = (String) iHybridStorageService.Pp2(context, C2188811AlT.LIZIZ(sbLIZ), null);
            if (str4 == null) {
                str4 = "";
            }
            fansLevelInfo = (FansLevelInfo) ((Map) C19748512Ol.LIZIZ.LJIIIIZZ(str4, new TypeToken<HashMap<Long, FansLevelInfo>>() { // from class: X.00Tt
            }.getType())).get(Long.valueOf(ownerUserId));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            fansLevelInfo = null;
        }
        InterfaceC500940Jki interfaceC500940JkiUser2 = UserService.getInstance().user();
        if (interfaceC500940JkiUser2 != null) {
            lValueOf2 = Long.valueOf(interfaceC500940JkiUser2.getCurrentUserId());
        } else {
            lValueOf2 = null;
        }
        DataChannel dataChannel2 = getDataChannel();
        if (dataChannel2 != null && (room = (Room) dataChannel2.gg0(RoomChannel.class)) != null) {
            ownerUserId2 = room.getOwnerUserId();
        } else {
            ownerUserId2 = 0;
        }
        try {
            IHybridStorageService iHybridStorageService2 = (IHybridStorageService) C1161920gLG.LIZJ(IHybridStorageService.class);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fe_fans_level_rank_info_");
            sbLIZ2.append(lValueOf2);
            String str5 = (String) iHybridStorageService2.Pp2(context, C2188811AlT.LIZIZ(sbLIZ2), null);
            if (str5 == null) {
                str5 = "";
            }
            userPopularityInfo = (UserPopularityInfo) ((Map) C19748512Ol.LIZIZ.LJIIIIZZ(str5, new TypeToken<HashMap<Long, UserPopularityInfo>>() { // from class: X.04aN
            }.getType())).get(Long.valueOf(ownerUserId2));
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            userPopularityInfo = null;
        }
        try {
            String str6 = (String) ((IHybridStorageService) C1161920gLG.LIZJ(IHybridStorageService.class)).Pp2(context, "FANS_LEVEL_USER_RANK_FIRST_ENTER_ANIMATION_SHOWED111", null);
            if (str6 != null) {
                str3 = str6;
            }
            rankFirstInfo = (RankFirstInfo) C19748512Ol.LIZIZ.LJII(str3, RankFirstInfo.class);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            rankFirstInfo = null;
        }
        DataChannel dataChannel3 = getDataChannel();
        if (dataChannel3 != null) {
            data = (FansGetTaskInfoResponse.Data) dataChannel3.gg0(C1095100ebU.class);
            if (data != null) {
                j2 = data.expireTime;
            }
        } else {
            data = null;
        }
        int i3 = 1;
        if (j2 < C158B.LIZ()) {
            i = 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            fansClubTaskPageData = new FansClubTaskPageData(fansLevelInfo, userPopularityInfo, rankFirstInfo, null);
        } else {
            fansClubTaskPageData = new FansClubTaskPageData(fansLevelInfo, userPopularityInfo, rankFirstInfo, data);
        }
        String json = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, fansClubTaskPageData);
        C1095140ebY c1095140ebYUw0 = uw0();
        if (c1095140ebYUw0 != null && c1095140ebYUw0.LJ == 2) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (fansClubTaskPageData.taskInfoData != null) {
            i3 = 0;
        }
        if (data != null) {
            j = data.expireTime;
        } else {
            j = -1;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_fans_club_init_data");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_expired");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "is_sleep");
        c474500IjALIZ.LJJII(Integer.valueOf(i3), "is_data_error");
        c474500IjALIZ.LJJII(Long.valueOf(j), "expire_time");
        C518180KTw.LIZ(c474500IjALIZ);
        c474500IjALIZ.LIZ();
        C495520Jby c495520Jby = new C495520Jby("aweme://roma_redirect/?");
        c495520Jby.LIZJ("roma_group_key", "roma_schema_group_fans_level_main");
        c495520Jby.LIZJ("roma_page_key", "roma_schema_page_user_main");
        c495520Jby.LIZJ("show_entrance", c1094590eaf.LIZ);
        if (c1094590eaf.LIZIZ) {
            str = "join";
        } else {
            str = "click";
        }
        c495520Jby.LIZJ("trigger_type", str);
        if (FansClubTaskPageInitSetting.INSTANCE.getValue() && fansClubTaskPageData.taskInfoData != null) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c495520Jby.LIZJ("live_fans_task_ab_test", str2);
        w.LIZ.getClass();
        c495520Jby.LIZIZ(w.LJFF(), "start_watch_time");
        c495520Jby.LIZJ("source_page", c1094590eaf.LIZ);
        C1094580eae c1094580eae = C1094580eae.LIZ;
        boolean z = c1094590eaf.LIZJ;
        EnumC1095860eci enumC1095860eci = c1094590eaf.LIZLLL;
        c1094580eae.getClass();
        C1094580eae.LIZ(c495520Jby, z, enumC1095860eci);
        Map<String, String> map = c1094590eaf.LJIIIIZZ;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c495520Jby.LIZJ(entry.getKey(), entry.getValue());
            }
        }
        ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, c495520Jby.LIZLLL(), new AwS67S1000000_16(json, 6));
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void VN2(Context context, C1094590eaf c1094590eaf) {
        String idStr;
        User userLJIIIIZZ;
        int i;
        String str;
        String str2;
        int i2;
        List urls;
        ImageModel avatarLarge;
        List urls2;
        User userLJIIIIZZ2;
        try {
            C495520Jby c495520Jby = new C495520Jby("aweme://roma_redirect/?spark_page=fan_club_user_join_super_fan&roma_group_key=spark_page_fan_club_user_join_super_fan&roma_page_key=p");
            c495520Jby.LIZJ("source_page", c1094590eaf.LIZ);
            c495520Jby.LIZJ("is_super_fan", CardStruct.IStatusCode.DEFAULT);
            DataChannel dataChannel = getDataChannel();
            if (dataChannel == null || (userLJIIIIZZ2 = C500260Jjc.LJIIIIZZ(dataChannel)) == null || (idStr = userLJIIIIZZ2.getIdStr()) == null) {
                idStr = "";
            }
            c495520Jby.LIZJ("anchor_id", idStr);
            if (C500260Jjc.LJJIIZ(C518180KTw.LJJIII(Integer.valueOf(c1094590eaf.LJ)))) {
                c495520Jby.LIZJ("gift_panel_tab_from", C518180KTw.LJJIII(Integer.valueOf(c1094590eaf.LJ)));
            }
            DataChannel dataChannel2 = getDataChannel();
            if (dataChannel2 != null) {
                userLJIIIIZZ = C500260Jjc.LJIIIIZZ(dataChannel2);
            } else {
                userLJIIIIZZ = null;
            }
            User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
            if (FansClubPanelV2Settings.INSTANCE.enableFansClubPanelV2()) {
                i = 2131852336;
            } else {
                i = 2131841658;
            }
            String strLJIJJ = C497740JfY.LJIJJ(i, C0KVU.LIZ(userLJIIIIZZ));
            boolean zIsFansCLubGiftLimited = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).isFansCLubGiftLimited(getDataChannel());
            if (userLJIIIIZZ == null || (avatarLarge = userLJIIIIZZ.getAvatarLarge()) == null || (urls2 = avatarLarge.getUrls()) == null || (str = (String) C13LP.LJJJLZIJ(0, urls2)) == null) {
                str = "";
            }
            ImageModel avatarLarge2 = userLJIJJLI.getAvatarLarge();
            if (avatarLarge2 == null || (urls = avatarLarge2.getUrls()) == null || (str2 = (String) C13LP.LJJJLZIJ(0, urls)) == null) {
                str2 = "";
            }
            String strLIZ = C0KVU.LIZ(userLJIIIIZZ);
            String strLIZ2 = C0KVU.LIZ(userLJIJJLI);
            if (zIsFansCLubGiftLimited) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, c495520Jby.LIZLLL(), new AwS67S1000000_16(C19748512Ol.LIZIZ.LJIILL(new FansClubJoinDialogInitData(str, str2, strLIZ, strLIZ2, strLJIJJ, i2)), 7));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1CC2.LIZ("open fans club page failed", e);
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void c30(DataChannel dataChannel, Context context) {
        ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).c30(dataChannel, context);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void cT1(BadgeStruct badgeStruct, BadgeStruct badgeStruct2) {
        User user;
        List<BadgeStruct> list;
        CombineBadgeStruct combineBadgeStruct;
        CombineBadgeBackground combineBadgeBackground;
        CombineBadgeStruct combineBadgeStruct2;
        CombineBadgeStruct combineBadgeStruct3;
        CombineBadgeBackground combineBadgeBackground2;
        CombineBadgeStruct combineBadgeStruct4;
        BadgeStruct badgeStruct3;
        BadgeStruct badgeStruct4;
        CombineBadgeBackground combineBadgeBackground3 = null;
        if (UserService.getInstance().user() != null) {
            InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
            if ((currentUser instanceof User) && (user = (User) currentUser) != null) {
                C087800Uq.LIZIZ(8, badgeStruct, user);
                if (badgeStruct2 != null) {
                    User.EnigmaInfo enigmaInfo = user.enigmaInfo;
                    if (enigmaInfo != null && enigmaInfo.isEnigmaMaskOn) {
                        return;
                    }
                    List<BadgeStruct> badgeList = user.getBadgeList();
                    if (badgeList != null && !badgeList.isEmpty()) {
                        int size = badgeList.size();
                        int i = -1;
                        int i2 = -1;
                        for (int i3 = 0; i3 < size; i3++) {
                            if (i2 < 0 && (badgeStruct4 = (BadgeStruct) ListProtector.get(badgeList, i3)) != null && badgeStruct4.badgeScene == 10) {
                                i2 = i3;
                            }
                            if (i < 0 && (badgeStruct3 = (BadgeStruct) ListProtector.get(badgeList, i3)) != null && badgeStruct3.badgeScene == 8) {
                                i = i3;
                            }
                        }
                        if (i >= 0) {
                            if (i2 >= 0) {
                                if (i > i2) {
                                    ListProtector.set(badgeList, i2, badgeStruct2);
                                    ListProtector.add(badgeList, i2, ListProtector.remove(badgeList, i));
                                    list = badgeList;
                                } else {
                                    BadgeStruct badgeStruct5 = (BadgeStruct) ListProtector.remove(badgeList, i2);
                                    if (badgeStruct5 != null && (combineBadgeStruct3 = badgeStruct5.combineBadgeStruct) != null && (combineBadgeBackground2 = combineBadgeStruct3.background) != null && combineBadgeBackground2.stretchableBackgroundImage != null && (combineBadgeStruct4 = badgeStruct2.combineBadgeStruct) != null) {
                                        CombineBadgeStruct combineBadgeStruct5 = badgeStruct5.combineBadgeStruct;
                                        if (combineBadgeStruct5 != null) {
                                            combineBadgeBackground3 = combineBadgeStruct5.background;
                                        }
                                        combineBadgeStruct4.background = combineBadgeBackground3;
                                    }
                                    ListProtector.add(badgeList, (int) Math.min(i + 1, badgeList.size()), badgeStruct2);
                                    list = badgeList;
                                }
                            } else {
                                ListProtector.add(badgeList, (int) Math.min(i + 1, badgeList.size()), badgeStruct2);
                                list = badgeList;
                            }
                        } else if (i2 >= 0) {
                            BadgeStruct badgeStruct6 = (BadgeStruct) ListProtector.get(badgeList, i2);
                            if (badgeStruct6 != null && (combineBadgeStruct = badgeStruct6.combineBadgeStruct) != null && (combineBadgeBackground = combineBadgeStruct.background) != null && combineBadgeBackground.stretchableBackgroundImage != null && (combineBadgeStruct2 = badgeStruct2.combineBadgeStruct) != null) {
                                CombineBadgeStruct combineBadgeStruct6 = badgeStruct6.combineBadgeStruct;
                                if (combineBadgeStruct6 != null) {
                                    combineBadgeBackground3 = combineBadgeStruct6.background;
                                }
                                combineBadgeStruct2.background = combineBadgeBackground3;
                            }
                            ListProtector.set(badgeList, i2, badgeStruct2);
                            list = badgeList;
                        } else {
                            badgeList.add(badgeStruct2);
                            list = badgeList;
                        }
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(badgeStruct2);
                        list = arrayList;
                    }
                    user.setBadgeList(list);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void de1(Long l, Long l2) {
        C1078890eBL c1078890eBL = this.LLIZLLLIL;
        if (c1078890eBL != null && l != null) {
            l.longValue();
            if (l.longValue() == c1078890eBL.LIZIZ) {
                c1078890eBL.LIZJ.removeMessages(2);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void i31(String str, boolean z) {
        C0KT6.LIZ = z;
        EQ2(getDataChannel(), str, false);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void n52(String str, String str2) {
        C517700KSa.LIZJ(getDataChannel(), new C517740KSe(this, str, str2));
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void rQ0(Context context, DataChannel dataChannel) {
        ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).rQ0(context, dataChannel);
    }

    public final Fragment vQ2(String str, String str2) {
        DataChannel dataChannel;
        Room roomLJJLIIIIJ;
        User owner;
        SubscribeInfo subscribeInfo;
        Fragment fansClubJoinDialogV3;
        Fragment fansClubJoinDialogV1;
        if (FansClubJoinPanelUpgradeSetting.INSTANCE.isExperimentalGroup()) {
            JoinDialogProxyViewModel joinDialogProxyViewModel = this.LLJJIJIIJIL;
            if (joinDialogProxyViewModel == null) {
                return null;
            }
            return joinDialogProxyViewModel.xQ2(getDataChannel(), str, EnumC1095410ebz.BOTH);
        }
        JoinDialogViewModel joinDialogViewModel = this.LLJJIII;
        if (joinDialogViewModel == null) {
            return null;
        }
        SuperFanViewModel superFanViewModel = this.LLJJI;
        if ((FansClubJoinDialogSetting.INSTANCE.getValue() == 2 || Intrinsics.LJFF(str, "profile")) && (dataChannel = joinDialogViewModel.getDataChannel()) != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel)) != null && (owner = roomLJJLIIIIJ.getOwner()) != null && (subscribeInfo = owner.getSubscribeInfo()) != null && subscribeInfo.isAnchorQualified()) {
            FansClubJoinDialog fansClubJoinDialog = new FansClubJoinDialog();
            fansClubJoinDialog.LLJZ = str;
            fansClubJoinDialog.LLJZIJLIL = joinDialogViewModel;
            joinDialogViewModel.BQ2(str);
            fansClubJoinDialog.LLL = superFanViewModel;
            joinDialogViewModel.LLILLJJLI = null;
            return fansClubJoinDialog;
        }
        if (joinDialogViewModel.LLILLJJLI == null) {
            int value = FansClubJoinDialogStyleSetting.INSTANCE.getValue();
            if (value != 0) {
                if (value != 1) {
                    if (value != 2) {
                        if (value != 3) {
                            fansClubJoinDialogV1 = new FansClubJoinDialogV1();
                        } else if (!joinDialogViewModel.xQ2()) {
                            fansClubJoinDialogV1 = JoinDialogViewModel.vQ2();
                        } else {
                            fansClubJoinDialogV1 = new FansClubJoinDialogV3(0);
                        }
                    } else {
                        fansClubJoinDialogV1 = new FansClubJoinDialogV3(0);
                    }
                } else {
                    fansClubJoinDialogV1 = JoinDialogViewModel.vQ2();
                }
            } else {
                fansClubJoinDialogV1 = new FansClubJoinDialogV1();
            }
            joinDialogViewModel.LLILLJJLI = fansClubJoinDialogV1;
        } else if (FansClubJoinDialogStyleSetting.INSTANCE.getValue() == 3) {
            if (!joinDialogViewModel.xQ2()) {
                fansClubJoinDialogV3 = JoinDialogViewModel.vQ2();
            } else {
                fansClubJoinDialogV3 = new FansClubJoinDialogV3(0);
            }
            joinDialogViewModel.LLILLJJLI = fansClubJoinDialogV3;
        }
        Fragment fragment = joinDialogViewModel.LLILLJJLI;
        if (fragment instanceof AbsFansClubJoinDialog) {
            AbsFansClubJoinDialog absFansClubJoinDialog = (AbsFansClubJoinDialog) fragment;
            absFansClubJoinDialog.LL = str;
            absFansClubJoinDialog.MR(joinDialogViewModel);
            return absFansClubJoinDialog;
        }
        if (!(fragment instanceof FansClubJoinDialogV2New)) {
            return fragment;
        }
        FansClubJoinDialogV2New fansClubJoinDialogV2New = (FansClubJoinDialogV2New) fragment;
        FansClubJoinDialogV2 fansClubJoinDialogV2 = fansClubJoinDialogV2New.LLJLLL;
        fansClubJoinDialogV2.LL = str;
        fansClubJoinDialogV2.MR(joinDialogViewModel);
        return fansClubJoinDialogV2New;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean Bo1(final String str, String str2, final String str3) {
        Boolean bool;
        DataChannel dataChannel = getDataChannel();
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(C0TZM.class)) != null && !bool.booleanValue()) {
            DataChannel dataChannel2 = getDataChannel();
            if (dataChannel2 != null) {
                dataChannel2.FQ2(OrientationChangeEvent.class);
            }
            C11NZ.LJLJJLL(700L, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C09JN() { // from class: X.0btX
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("FansClubViewModel@394b.showFansClubJoinDialog$1");
                    FansClubViewModel fansClubViewModel = this.LL;
                    fansClubViewModel.DQ2(fansClubViewModel.vQ2(str, CardStruct.IStatusCode.DEFAULT), str3, str, true);
                    C1C7U.LIZIZ("FansClubViewModel@394b.showFansClubJoinDialog$1");
                }
            });
            return true;
        }
        return DQ2(vQ2(str, CardStruct.IStatusCode.DEFAULT), str3, str, true);
    }

    public final void EQ2(DataChannel dataChannel, String str, boolean z) {
        LiveSheetFragment liveSheetFragmentZQ2;
        if (dataChannel != null) {
            Boolean bool = (Boolean) dataChannel.gg0(C0TZM.class);
            if (bool != null) {
                if (bool.booleanValue()) {
                    if (dataChannel == null) {
                        return;
                    }
                } else {
                    if (dataChannel != null) {
                        dataChannel.FQ2(OrientationChangeEvent.class);
                    }
                    C11NZ.LJLJJLL(700L, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS5S1210000_17(dataChannel, this, str, z, 0));
                    return;
                }
            }
            FragmentManager fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
            if (fragmentManager != null) {
                JoinDialogProxyViewModel joinDialogProxyViewModel = this.LLJJIJIIJIL;
                if (joinDialogProxyViewModel != null) {
                    liveSheetFragmentZQ2 = joinDialogProxyViewModel.zQ2(dataChannel, str, z);
                } else {
                    liveSheetFragmentZQ2 = null;
                }
                C19322110iZ.LJFF(fragmentManager, liveSheetFragmentZQ2, "fans_dialog", null, C467770IVz.LIZ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)));
            }
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final boolean HO(String str, String str2, String str3) {
        return DQ2(Qn0(str), str3, str, false);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final Map JA(Room room, DataChannel dataChannel, boolean z) {
        return C518180KTw.LIZLLL(room, dataChannel, z);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void Mq2(final int i, final long j, final long j2) {
        final DataChannel dataChannel = getDataChannel();
        if (dataChannel != null) {
            FansClubCompensationExpSetting fansClubCompensationExpSetting = FansClubCompensationExpSetting.INSTANCE;
            boolean z = fansClubCompensationExpSetting.getValue().enableCompensation;
            long j3 = fansClubCompensationExpSetting.getValue().compensationDelayTime;
            if (z) {
                C786410Ut5.LJLIIL(j3, new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0KTy
                    public final void LIZ() {
                        final DataChannel dataChannel2 = dataChannel;
                        final int i2 = i;
                        final long j4 = j;
                        long j5 = j2;
                        if (dataChannel2 != null) {
                            final long jCurrentTimeMillis = System.currentTimeMillis();
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_fans_club_compensation_send_request");
                            c474500IjALIZ.LJJII(Long.valueOf(j4), "room_id");
                            c474500IjALIZ.LJJII(i2 == 101 ? "joincompensation" : "reactivecompensation", "operation_type");
                            c474500IjALIZ.LJJIJL();
                            FansTaskOperateRequest fansTaskOperateRequest = new FansTaskOperateRequest();
                            fansTaskOperateRequest.anchorId = j5;
                            fansTaskOperateRequest.operateType = 101L;
                            fansTaskOperateRequest.roomId = j4;
                            C480460Ism.LIZ().getClass();
                            ((FansClubCompensationApi) C480460Ism.LIZLLL(FansClubCompensationApi.class)).fansTaskOperate(fansTaskOperateRequest).LJFF(new C0UO0()).LJJIIZ(new C09JN() { // from class: X.0KTz
                                /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
                                /* JADX WARN: Removed duplicated region for block: B:45:0x00f1  */
                                /* JADX WARN: Removed duplicated region for block: B:48:0x00fd  */
                                /* JADX WARN: Removed duplicated region for block: B:50:0x0118  */
                                @Override // X.C09JN
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final void accept(java.lang.Object r35) {
                                    /*
                                        Method dump skipped, instruction units count: 292
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C518210KTz.accept(java.lang.Object):void");
                                }
                            }, new C09JN() { // from class: X.0J8N
                                /* JADX WARN: Removed duplicated region for block: B:13:0x0076 A[PHI: r0 r6 r11
                                  0x0076: PHI (r0v14 java.lang.String) = (r0v13 java.lang.String), (r0v17 java.lang.String) binds: [B:11:0x0073, B:5:0x003d] A[DONT_GENERATE, DONT_INLINE]
                                  0x0076: PHI (r6v4 java.lang.String) = (r6v3 java.lang.String), (r6v6 java.lang.String) binds: [B:11:0x0073, B:5:0x003d] A[DONT_GENERATE, DONT_INLINE]
                                  0x0076: PHI (r11v2 int) = (r11v1 int), (r11v4 int) binds: [B:11:0x0073, B:5:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
                                @Override // X.C09JN
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final void accept(java.lang.Object r15) {
                                    /*
                                        r14 = this;
                                        java.lang.String r4 = "FansClubCompensationManager@fd4.realCompensationFansClub$dispose$2"
                                        X.C1C7U.LIZ(r4)
                                        java.lang.Throwable r15 = (java.lang.Throwable) r15
                                        long r12 = java.lang.System.currentTimeMillis()
                                        long r0 = r1
                                        long r12 = r12 - r0
                                        java.lang.Throwable r2 = r15.getCause()
                                        boolean r0 = r2 instanceof X.C477520Io2
                                        r3 = 44
                                        java.lang.String r8 = ""
                                        if (r0 == 0) goto L4c
                                        X.0Io2 r2 = (X.C477520Io2) r2
                                        int r11 = r2.getErrorCode()
                                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                                        java.lang.String r0 = r2.getErrorMsg()
                                        r1.append(r0)
                                        r1.append(r3)
                                        java.lang.String r0 = r15.getMessage()
                                        r1.append(r0)
                                        java.lang.String r6 = X.C2188811AlT.LIZIZ(r1)
                                        java.lang.String r0 = r2.getxTtLogId()
                                        if (r0 != 0) goto L76
                                    L3f:
                                        long r9 = r3
                                        int r5 = r5
                                        java.lang.String r7 = "fail"
                                        X.C518180KTw.LJJIJIIJI(r5, r6, r7, r8, r9, r11, r12)
                                        X.C1C7U.LIZIZ(r4)
                                        return
                                    L4c:
                                        boolean r0 = r2 instanceof X.C501470JlZ
                                        if (r0 == 0) goto L78
                                        X.0JlZ r2 = (X.C501470JlZ) r2
                                        int r11 = r2.getErrorCode()
                                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                                        java.lang.String r0 = r2.getErrorMsg()
                                        r1.append(r0)
                                        r1.append(r3)
                                        java.lang.String r0 = r15.getMessage()
                                        r1.append(r0)
                                        java.lang.String r6 = X.C2188811AlT.LIZIZ(r1)
                                        java.lang.String r0 = r2.getLogId()
                                        if (r0 != 0) goto L76
                                        goto L3f
                                    L76:
                                        r8 = r0
                                        goto L3f
                                    L78:
                                        boolean r0 = r2 instanceof X.C1494690ozz
                                        if (r0 == 0) goto L9e
                                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                                        X.0ozc r2 = (X.C1494460ozc) r2
                                        java.lang.String r0 = r2.getMessage()
                                        r1.append(r0)
                                        r1.append(r3)
                                        java.lang.String r0 = r15.getMessage()
                                        r1.append(r0)
                                        java.lang.String r6 = X.C2188811AlT.LIZIZ(r1)
                                        java.lang.String r0 = r2.traceCode
                                        if (r0 == 0) goto L9c
                                        r8 = r0
                                    L9c:
                                        r11 = -1
                                        goto L3f
                                    L9e:
                                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                                        if (r2 == 0) goto Lba
                                        java.lang.String r0 = r2.getMessage()
                                    La8:
                                        r1.append(r0)
                                        r1.append(r3)
                                        java.lang.String r0 = r15.getMessage()
                                        r1.append(r0)
                                        java.lang.String r6 = X.C2188811AlT.LIZIZ(r1)
                                        goto L9c
                                    Lba:
                                        r0 = 0
                                        goto La8
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C0J8N.accept(java.lang.Object):void");
                                }
                            });
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("FansClubCompensationManager@fd4.compensationFansClub$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("FansClubCompensationManager@fd4.compensationFansClub$1");
                    }
                });
            }
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void Pf0(long j, AwS135S0110000_17 awS135S0110000_17, AFwS205S0000000_17 aFwS205S0000000_17) {
        if (getDataChannel() == null) {
            return;
        }
        C1095160eba c1095160eba = new C1095160eba(j, awS135S0110000_17);
        AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(aFwS205S0000000_17, 596);
        C480460Ism.LIZ().getClass();
        ((UserApi) C480460Ism.LIZLLL(UserApi.class)).updateSwitch(17L, j).LJIILIIL(new C0UO0()).LJJLL(new AfS148S0200000_12(c1095160eba, awS561S0100000_17, 66), new AfS178S0100000_9(awS561S0100000_17, 75));
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void eG(long j, long j2, C1095110ebV c1095110ebV) {
        String string;
        C1094910ebB c1094910ebB = this.LLJ;
        if (c1094910ebB != null) {
            DataChannel dataChannel = getDataChannel();
            if (dataChannel == null || (string = Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannel)).toString()) == null) {
                string = "";
            }
            C1095090ebT.LIZ("public_screen", C1094910ebB.LIZ(dataChannel), j, j2, c1094910ebB.LIZ, new C1095010ebL("public_screen", "", c1095110ebV, null, new C1095070ebR(string)), c1094910ebB.LIZIZ, null);
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void wq1(long j, C1117530fBf c1117530fBf, AFwS205S0000000_17 aFwS205S0000000_17) {
        if (getDataChannel() == null) {
            return;
        }
        C480460Ism.LIZ().getClass();
        ((UserApi) C480460Ism.LIZLLL(UserApi.class)).updateSwitch(31L, j).LJIILIIL(new C0UO0()).LJJLL(new AfS148S0200000_12(c1117530fBf, aFwS205S0000000_17, 67), new AfS181S0100000_12(aFwS205S0000000_17, 289));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean DQ2(Fragment fragment, String str, String str2, boolean z) {
        FragmentManager fragmentManager;
        int iIntValue = -1;
        if (z && FansClubJoinDialogSetting.INSTANCE.getValue() == 1) {
            Context contextLJII = C497740JfY.LJII();
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(str);
            if (numLJIIJJI != null) {
                iIntValue = numLJIIJJI.intValue();
            }
            VN2(contextLJII, new C1094590eaf(str2, false, false, null, iIntValue, null, null, null, null, 480));
            return true;
        }
        DataChannel dataChannel = getDataChannel();
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null && (fragment instanceof InterfaceC1095170ebb) && !fragment.isAdded()) {
            if (fragment instanceof LiveDialogFragment) {
                LiveDialogFragment liveDialogFragment = (LiveDialogFragment) fragment;
                if (!liveDialogFragment.isShowing()) {
                    InterfaceC1095170ebb interfaceC1095170ebb = (InterfaceC1095170ebb) fragment;
                    Integer numLJIIJJI2 = C2095008Iq.LJIIJJI(str);
                    if (numLJIIJJI2 != null) {
                        iIntValue = numLJIIJJI2.intValue();
                    }
                    interfaceC1095170ebb.LP(iIntValue);
                    liveDialogFragment.showNow(fragmentManager, "fans_dialog");
                    return true;
                }
            }
            if (fragment instanceof LiveSheetFragment) {
                InterfaceC1095170ebb interfaceC1095170ebb2 = (InterfaceC1095170ebb) fragment;
                Integer numLJIIJJI3 = C2095008Iq.LJIIJJI(str);
                if (numLJIIJJI3 != null) {
                    iIntValue = numLJIIJJI3.intValue();
                }
                interfaceC1095170ebb2.LP(iIntValue);
                C19322110iZ.LJFF(fragmentManager, (InterfaceC20484815Dq) fragment, "fans_dialog", null, C467770IVz.LIZ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)));
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final InterfaceC1096360edW qj0(boolean z, ViewGroup viewGroup, InterfaceC1095350ebt interfaceC1095350ebt, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        if (viewGroup == null || lifecycleOwner == null) {
            return null;
        }
        if (z) {
            return new C1095920eco(viewGroup, interfaceC1095350ebt, lifecycleOwner, dataChannel);
        }
        return new C1095910ecn(viewGroup, interfaceC1095350ebt, lifecycleOwner, dataChannel);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void wo0(FansLevelInfo fansLevelInfo, long j, long j2, long j3, String str) throws JSONException {
        long id;
        Long lValueOf;
        long j4;
        C1095140ebY c1095140ebY;
        Room room;
        if (this.LLILLL) {
            DataChannel dataChannel = getDataChannel();
            long j5 = 0;
            if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            if (id != j2) {
                return;
            }
            C1095220ebg c1095220ebg = new C1095220ebg(0, String.valueOf(j3), str, "");
            C1094910ebB c1094910ebB = this.LLJ;
            if (c1094910ebB != null) {
                DataChannel dataChannel2 = getDataChannel();
                if (dataChannel2 != null && (c1095140ebY = (C1095140ebY) dataChannel2.gg0(FansClubChannel.class)) != null) {
                    j4 = c1095140ebY.LIZ;
                } else {
                    j4 = 0;
                }
                if (fansLevelInfo != null) {
                    j5 = fansLevelInfo.level;
                }
                if (C1114690f75.LIZ(j4, j5)) {
                    C1095090ebT.LIZ("entrance", C1094910ebB.LIZ(dataChannel2), j4, j5, c1094910ebB.LIZ, new C1095010ebL("send_gifts", "", null, new C1095120ebW(String.valueOf(j3), str), new C1095070ebR(String.valueOf(j2))), c1094910ebB.LIZIZ, null);
                }
            }
            Boolean boolValueOf = null;
            if (GQ2(fansLevelInfo, "gift", j, null, null, c1095220ebg, null) != null) {
                C1094580eae c1094580eae = C1094580eae.LIZ;
                DataChannel dataChannel3 = getDataChannel();
                C1095300ebo c1095300ebo = this.LLILZLL;
                c1094580eae.getClass();
                if (dataChannel3 != null && c1095300ebo != null) {
                    dataChannel3.LC0(FansClubEvent.class, new C1095290ebn(c1095300ebo.LIZ, c1095300ebo.LIZIZ));
                }
                this.LLILZLL = null;
                if (this.LLIZ != null) {
                    if (!FansClubZeroClaimAnimFixSetting.INSTANCE.getValue()) {
                        this.LLIZ = null;
                    } else {
                        FansEventData fansEventData = new FansEventData();
                        fansEventData.getUnclaimedPoints = this.LLIZ;
                        GQ2(fansLevelInfo, "unclaim", j, null, null, c1095220ebg, fansEventData);
                        this.LLIZ = null;
                    }
                }
            }
            if (GoodyBagFansClubSetting.INSTANCE.getValue()) {
                JSONObject jSONObject = new JSONObject();
                if (fansLevelInfo != null) {
                    lValueOf = Long.valueOf(fansLevelInfo.level);
                } else {
                    lValueOf = null;
                }
                jSONObject.put("fans_level", lValueOf);
                if (fansLevelInfo != null) {
                    boolValueOf = Boolean.valueOf(fansLevelInfo.isSleeping);
                }
                jSONObject.put("is_sleeping", boolValueOf);
                C389001fE.LIZ("EVENT_FANS_STATE_UPDATE", jSONObject, System.currentTimeMillis(), false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean z90(com.bytedance.android.live.base.model.ImageModel r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17) {
        /*
            r12 = this;
            r7 = r12
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r7.getDataChannel()
            r5 = 1
            if (r1 == 0) goto L6a
            java.lang.Class<X.0TZM> r0 = X.C0TZM.class
            java.lang.Object r0 = r1.gg0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L6a
            boolean r4 = r0.booleanValue()
        L16:
            com.bytedance.android.livesdk.livesetting.level.FansClubPanelV2Settings r0 = com.bytedance.android.livesdk.livesetting.level.FansClubPanelV2Settings.INSTANCE
            boolean r0 = r0.isLynxFansClubJoinDialogEnable()
            r3 = 0
            r2 = 0
            r10 = r14
            if (r0 != 0) goto L68
            com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.JoinDialogViewModel r1 = r7.LLJJIII
            if (r1 == 0) goto L68
            com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.FansClubStickerJoinDialog r0 = r1.LLILZ
            if (r0 != 0) goto L30
            com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.FansClubStickerJoinDialog r0 = new com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.FansClubStickerJoinDialog
            r0.<init>(r3)
            r1.LLILZ = r0
        L30:
            com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.FansClubStickerJoinDialog r8 = r1.LLILZ
            boolean r0 = r8 instanceof com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.AbsFansClubJoinDialog
            if (r0 == 0) goto L5a
            r8.LL = r10
            r8.MR(r1)
        L3b:
            boolean r1 = r8 instanceof com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.FansClubStickerJoinDialog
            if (r1 == 0) goto L51
            r0 = r8
            com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.FansClubStickerJoinDialog r0 = (com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.FansClubStickerJoinDialog) r0
            if (r0 == 0) goto L46
            r0.LLJL = r13
        L46:
            if (r1 == 0) goto L51
            r0 = r8
            com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.FansClubStickerJoinDialog r0 = (com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.FansClubStickerJoinDialog) r0
            if (r0 == 0) goto L51
            r1 = r17
            r0.LLJLIL = r1
        L51:
            r9 = r16
            if (r4 == 0) goto L6c
            boolean r0 = r7.DQ2(r8, r9, r10, r3)
            return r0
        L5a:
            boolean r0 = r8 instanceof com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.FansClubStickerJoinSheetDialog
            if (r0 == 0) goto L68
            com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.FansClubStickerJoinSheetDialog r8 = (com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.FansClubStickerJoinSheetDialog) r8
            com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.FansClubStickerJoinDialog r0 = r8.LLJLLL
            r0.LL = r10
            r0.MR(r1)
            goto L3b
        L68:
            r8 = r2
            goto L3b
        L6a:
            r4 = 1
            goto L16
        L6c:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r7.getDataChannel()
            if (r1 == 0) goto L77
            java.lang.Class<com.bytedance.android.livesdk.watch.OrientationChangeEvent> r0 = com.bytedance.android.livesdk.watch.OrientationChangeEvent.class
            r1.FQ2(r0)
        L77:
            r0 = 700(0x2bc, double:3.46E-321)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.11IB r1 = X.C11NZ.LJLJJLL(r0, r2)
            X.11RO r0 = X.C11S5.LIZ()
            X.11Hw r1 = r1.LJL(r0)
            X.11RO r0 = X.C1701940uOG.LIZIZ()
            X.11O8 r0 = r1.LJJJLZIJ(r0)
            Y.AfS10S2200000_16 r6 = new Y.AfS10S2200000_16
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            r0.LJJLJLI(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.FansClubViewModel.z90(com.bytedance.android.live.base.model.ImageModel, java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService
    public final void Ux2(DataChannel dataChannel, String str, long j, long j2, String str2, JSONObject jSONObject) {
        C1094910ebB c1094910ebB = this.LLJ;
        if (c1094910ebB != null) {
            C1095090ebT.LIZ("profile_card", C1094910ebB.LIZ(dataChannel), j, j2, c1094910ebB.LIZ, new C1095010ebL("profile_card", str2, null, null, new C1095070ebR(str)), c1094910ebB.LIZIZ, jSONObject);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(38:19|(1:21)|22|(1:28)|29|(1:31)(1:86)|32|(30:82|(0)(1:85)|(1:81)(4:41|(1:43)(3:78|(1:80)|81)|44|(1:46)(0))|(1:77)(1:50)|51|(2:53|(2:55|(1:57))(2:66|(6:68|(1:70)|71|(1:73)|74|(1:76))))|58|(1:60)|61|(1:63)(1:65)|64|170|90|(1:92)(1:106)|93|(1:95)(1:105)|96|(1:98)(1:104)|99|(1:101)(1:103)|102|109|(6:113|(1:115)|116|(2:118|(1:120))|121|(1:123))|124|(2:126|(1:130))|131|(2:163|(1:169))(2:135|(1:137))|138|(2:140|(4:142|(1:144)(1:151)|145|(1:149)))(1:(4:157|(1:159)(1:162)|160|161))|150)(1:36)|37|(1:39)(0)|(0)(0)|(2:48|77)(0)|51|(0)|58|(0)|61|(0)(0)|64|170|90|(0)(0)|93|(0)(0)|96|(0)(0)|99|(0)(0)|102|109|(7:111|113|(0)|116|(0)|121|(0))|124|(0)|131|(3:133|163|(3:165|167|169))(0)|138|(0)(0)|150) */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01d3, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01d4, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a2 A[Catch: Exception -> 0x01d3, TryCatch #0 {Exception -> 0x01d3, blocks: (B:90:0x0168, B:92:0x0175, B:93:0x017d, B:95:0x0184, B:96:0x018c, B:98:0x0193, B:99:0x019b, B:101:0x01a2, B:102:0x01aa), top: B:170:0x0168 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015a A[PHI: r9
      0x015a: PHI (r9v1 long) = (r9v0 long), (r9v8 long) binds: [B:83:0x0156, B:38:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0175 A[Catch: Exception -> 0x01d3, TryCatch #0 {Exception -> 0x01d3, blocks: (B:90:0x0168, B:92:0x0175, B:93:0x017d, B:95:0x0184, B:96:0x018c, B:98:0x0193, B:99:0x019b, B:101:0x01a2, B:102:0x01aa), top: B:170:0x0168 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0184 A[Catch: Exception -> 0x01d3, TryCatch #0 {Exception -> 0x01d3, blocks: (B:90:0x0168, B:92:0x0175, B:93:0x017d, B:95:0x0184, B:96:0x018c, B:98:0x0193, B:99:0x019b, B:101:0x01a2, B:102:0x01aa), top: B:170:0x0168 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0193 A[Catch: Exception -> 0x01d3, TryCatch #0 {Exception -> 0x01d3, blocks: (B:90:0x0168, B:92:0x0175, B:93:0x017d, B:95:0x0184, B:96:0x018c, B:98:0x0193, B:99:0x019b, B:101:0x01a2, B:102:0x01aa), top: B:170:0x0168 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1095140ebY GQ2(webcast.data.FansLevelInfo r43, java.lang.String r44, long r45, final java.util.List<java.lang.Integer> r47, final java.util.List<java.lang.String> r48, X.C1095220ebg r49, com.bytedance.android.livesdk.model.message.FansEventData r50) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.FansClubViewModel.GQ2(webcast.data.FansLevelInfo, java.lang.String, long, java.util.List, java.util.List, X.0ebg, com.bytedance.android.livesdk.model.message.FansEventData):X.0ebY");
    }
}
