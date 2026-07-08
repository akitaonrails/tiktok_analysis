package com.bytedance.android.livesdk.function;

import X.AbstractC1103160eoU;
import X.AbstractC1136060ffY;
import X.AbstractC497160Jec;
import X.AbstractC781140Uka;
import X.C001A;
import X.C011Z;
import X.C01C1;
import X.C01C3;
import X.C01C5;
import X.C01GW;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C09AJ;
import X.C09JN;
import X.C0IJT;
import X.C0IKN;
import X.C0IMI;
import X.C0IR5;
import X.C0IWZ;
import X.C0J1R;
import X.C0JFN;
import X.C0JFO;
import X.C0JT6;
import X.C0KBS;
import X.C0KXB;
import X.C0KYK;
import X.C0KYL;
import X.C0TZM;
import X.C0U4S;
import X.C0UIJ;
import X.C0UIM;
import X.C0UO0;
import X.C0UXA;
import X.C0UXQ;
import X.C1086800eO6;
import X.C1086830eO9;
import X.C1086960eOM;
import X.C1087000eOQ;
import X.C1087250eOp;
import X.C1088060eQ8;
import X.C1088070eQ9;
import X.C1096290edP;
import X.C1096420edc;
import X.C1096480edi;
import X.C1096490edj;
import X.C1096600edu;
import X.C1101060el6;
import X.C1103170eoV;
import X.C1105280eru;
import X.C1106210etP;
import X.C1107690evn;
import X.C1110390f09;
import X.C1110410f0B;
import X.C1110420f0C;
import X.C1114730f79;
import X.C1119850fFP;
import X.C1151720g4o;
import X.C1161920gLG;
import X.C11JF;
import X.C11NJ;
import X.C1338270kvh;
import X.C1388190mED;
import X.C13BV;
import X.C13LQ;
import X.C1548820qPI;
import X.C16F5;
import X.C189200o6;
import X.C19322110iZ;
import X.C19EG;
import X.C1ADU;
import X.C1AUC;
import X.C1AUE;
import X.C1EOY;
import X.C20337914i1;
import X.C20484615Do;
import X.C2252611DEt;
import X.C237000vo;
import X.C243200wo;
import X.C294101Bz;
import X.C425401l6;
import X.C464500IJk;
import X.C464800IKo;
import X.C465520INi;
import X.C470590Icr;
import X.C474350Iiv;
import X.C474500IjA;
import X.C475020Ik0;
import X.C475030Ik1;
import X.C475510Ikn;
import X.C481220Iu0;
import X.C481330IuB;
import X.C482260Ivg;
import X.C488020JBw;
import X.C488910JFh;
import X.C496200Jd4;
import X.C496230Jd7;
import X.C498340JgW;
import X.C498820JhI;
import X.C500260Jjc;
import X.C520010KaN;
import X.C751340Tdc;
import X.C751360Tde;
import X.C751800TeM;
import X.C752740Tfs;
import X.C753730ThT;
import X.C753760ThW;
import X.C758980Tpw;
import X.C759940TrU;
import X.C760370TsB;
import X.C773850UXf;
import X.C773870UXh;
import X.C776250Uch;
import X.C780860Uk8;
import X.C781520UlC;
import X.C782850UnL;
import X.C783080Uni;
import X.C783420UoG;
import X.C784440Upu;
import X.C786410Ut5;
import X.C916790Zxt;
import X.C920440a3m;
import X.C930940aKi;
import X.CountDownTimerC1086810eO7;
import X.EnumC1085350eLl;
import X.EnumC1102740eno;
import X.EnumC1102750enp;
import X.EnumC759110Tq9;
import X.InterfaceC1085480eLy;
import X.InterfaceC1086970eON;
import X.InterfaceC1096500edk;
import X.InterfaceC1100800ekg;
import X.InterfaceC1100990ekz;
import X.InterfaceC1101080el8;
import X.InterfaceC1102810env;
import X.InterfaceC1106030et7;
import X.InterfaceC1112400f3O;
import X.InterfaceC1300440jwg;
import X.InterfaceC1364105Vn;
import X.InterfaceC1372610lp5;
import X.InterfaceC465240IMg;
import X.InterfaceC474360Iiw;
import X.InterfaceC760020Trc;
import X.InterfaceC777420Uea;
import X.InterfaceC781410Ul1;
import Y.AfS176S0100000_7;
import Y.AfS186S0100000_17;
import Y.AfS3S0100200_7;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.adminsetting.RoomSwitchApi;
import com.bytedance.android.live.adminsetting.SwitchBatchUpdateRequest;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.CoverImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment;
import com.bytedance.android.live.dynamicstrategy.AudienceCountChannel;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.interaction.drawguess.DrawGuessCorrectsRoundsChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessHasLoggedRoundEndChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundIdChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundStartTimeChannel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.pincard.event.LivePinCardVisibilityChannel;
import com.bytedance.android.live.poll.ILiveNormalPollViewModel;
import com.bytedance.android.live.poll.PollApi;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.publicscreen.api.WarningInfoVisibilityEvent;
import com.bytedance.android.live.room.LiveEndEvent;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.uikit.uisetting.MessageNotifyConfig;
import com.bytedance.android.live.usermanage.model.UserManageExtra;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.adminsetting.LiveCommentFlagFilterFragmentSheet;
import com.bytedance.android.livesdk.adminsetting.LiveFilterCommentSettingFragmentSheet;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdk.chatroom.model.AgeRestrictionSettings;
import com.bytedance.android.livesdk.chatroom.model.AnchorSettingsUpdateResponse;
import com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings;
import com.bytedance.android.livesdk.chatroom.model.ContentDisclosureSettings;
import com.bytedance.android.livesdk.chatroom.model.LocationIconDisplaySettings;
import com.bytedance.android.livesdk.chatroom.model.MarkListResp;
import com.bytedance.android.livesdk.chatroom.model.MarkUserResp;
import com.bytedance.android.livesdk.chatroom.model.SilenceResponse;
import com.bytedance.android.livesdk.chatroom.model.UnmarkUserResp;
import com.bytedance.android.livesdk.comp.api.performance.IPerformanceService;
import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.dataChannel.AdminPermissionUpdateChannel;
import com.bytedance.android.livesdk.dataChannel.CommentPinWidgetVisibility;
import com.bytedance.android.livesdk.dataChannel.CustomPollCardVisibility;
import com.bytedance.android.livesdk.dataChannel.CustomizedPerksCardVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.DrawGuessStatusVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.HighPrioritySlotVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.HighPriorityTooltipVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel;
import com.bytedance.android.livesdk.dataChannel.PublicScreenGiftPollStateVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.PublicScreenNormalPollStateVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SubGoalCardVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.dataChannel.SubscribeSubOnlyChatChangeEvent;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.dialog.BroadcastDialogDispatcher;
import com.bytedance.android.livesdk.interaction.LiveInteractionFeaturesFragment;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessEndResponse;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessSummaryResponse;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessWordlistResponse;
import com.bytedance.android.livesdk.interaction.drawguess.network.GuessResponse;
import com.bytedance.android.livesdk.interaction.drawguess.network.StartDrawGuessResponse;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessCanvasWidget;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStatusWidget;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessToolbarWidget;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.LiveNormalPollViewModel;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.GiftSelectPollWidget;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.NormalSelectPollWidget;
import com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveGiftPollEffectWidget;
import com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveNormalPollEffectWidget;
import com.bytedance.android.livesdk.interaction.pollandgiftvote.ToolWrapperDialog;
import com.bytedance.android.livesdk.liveevent.LiveEventDescCardWidget;
import com.bytedance.android.livesdk.livesetting.game.LiveBroadcastCustomPollOptGuideUrl;
import com.bytedance.android.livesdk.livesetting.game.LiveBroadcastCustomPollOptUrl;
import com.bytedance.android.livesdk.livesetting.model.LiveMessagePlatformBubbleConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveAnchorStrategyParamsSwitchSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveStrategyParamsSwitchSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveServiceManagerOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveWidgetMinLoadSettingV3;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleItemConfig;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveEffectNotifyMockEnabledSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveReportViolationPreloadSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveRepostConsumeConfig;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveRepostProduceConfig;
import com.bytedance.android.livesdk.livesetting.subscription.LivePublicScreenEmoteLoadResilienceSetting;
import com.bytedance.android.livesdk.locationservice.LocationServiceNotionSheet;
import com.bytedance.android.livesdk.longpress.LiveLongPressDialog;
import com.bytedance.android.livesdk.markviewer.MarkedViewerListFragmentSheet;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.WarningTag;
import com.bytedance.android.livesdk.model.message.BottomMessage;
import com.bytedance.android.livesdk.model.message.CapsuleBizParams;
import com.bytedance.android.livesdk.model.message.CapsuleBizParamsCommentFlaggedPrompt;
import com.bytedance.android.livesdk.model.message.CapsuleBizParamsCommentFlaggedPromptForNewUser;
import com.bytedance.android.livesdk.model.message.CapsuleBizParamsCommentMuteRulePrompt;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.LiveEventMessage;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.PictionaryInfo;
import com.bytedance.android.livesdk.model.message.PollEndContent;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.android.livesdk.model.message.PollUpdateVotesContent;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.Question;
import com.bytedance.android.livesdk.model.message.RoomUserSeqMessage;
import com.bytedance.android.livesdk.model.message.RoomVerifyMessage;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.performance.PerfUseApmFluencySetting;
import com.bytedance.android.livesdk.performance.RealtimePerfScoreSettings;
import com.bytedance.android.livesdk.poll.setting.TtliveCustomGiftVoteHostSchemaOnGoingSetting;
import com.bytedance.android.livesdk.poll.setting.TtliveCustomGiftVoteHostSchemaSetting;
import com.bytedance.android.livesdk.poll.setting.TtliveQuickGiftVoteHostSchemaSetting;
import com.bytedance.android.livesdk.qa.CurrentQuestionChannel;
import com.bytedance.android.livesdk.qa.CurrentQuestionResponse;
import com.bytedance.android.livesdk.qa.QAApi;
import com.bytedance.android.livesdk.qa.QuestionEx;
import com.bytedance.android.livesdk.qa.QuestionList;
import com.bytedance.android.livesdk.qa.StartAnswerResponse;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.sheet.LiveRepostGuideFragment;
import com.bytedance.android.livesdk.slot.FrameL2SlotVisibilityChannel;
import com.bytedance.android.livesdk.slot.FrameSlotVisibilityChannel;
import com.bytedance.android.livesdk.streamadaption.StreamAdaptionHandler;
import com.bytedance.android.livesdk.topeffect.LiveTopAlphaVideoWidget;
import com.bytedance.android.livesdk.topeffect.LiveTopStickerEffectWidget;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.usercard.LiveProfileManageDialog;
import com.bytedance.android.livesdk.usermanage.AdminApi;
import com.bytedance.android.livesdk.usermanage.KickOutApi;
import com.bytedance.android.livesdk.usermanage.MarkUserApi;
import com.bytedance.android.livesdk.usermanage.MuteApi;
import com.bytedance.android.livesdk.usermanage.UpdateAdminParams;
import com.bytedance.android.livesdk.usermanage.model.AddAdminExtra;
import com.bytedance.android.livesdk.usermanage.model.AdminListExtra;
import com.bytedance.android.livesdk.usermanage.model.AdminResponse;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.handler.WeakHandler;
import com.bytedance.android.livesdkapi.depend.model.live.ActivityToggleInfo;
import com.bytedance.android.livesdkapi.depend.model.live.AggregationData;
import com.bytedance.android.livesdkapi.depend.model.live.BcToggleInfo;
import com.bytedance.android.livesdkapi.depend.model.live.CommercialContentToggle;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.PictionaryFullInfo;
import com.bytedance.android.livesdkapi.depend.model.live.PictionaryStatistics;
import com.bytedance.android.livesdkapi.depend.model.live.PollConf;
import com.bytedance.android.livesdkapi.depend.model.live.PollCountLimit;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.share.ShareFromInfo;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.message.IMessageService;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.EventListener;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import qo2.w;
import tikcast.api.anchor.AdminHostListResponse;
import tikcast.api.anchor.AdminOperationRecordListResponse;
import tikcast.api.anchor.AdminOverallTabResponse;
import tikcast.api.anchor.AnchorAdminListResponse;
import tikcast.api.anchor.AnchorLocationSettingsReadResponse;
import tikcast.api.anchor.DelHostRelationResponse;
import tikcast.api.perception.ViolationStatusResponse;
import webcast.api.interaction.pictionary.PictionaryRankResponse;
import webcast.api.interaction.pictionary.ReviewWordResponse;
import webcast.api.room.BusinessDataFilter;
import webcast.api.room.GetRoomProfileCardRequest;
import webcast.api.room.GetRoomProfileCardResponse;
import webcast.data.EventCard;

/* JADX INFO: loaded from: classes18.dex */
public class RoomFunctionService implements IRoomFunctionService, InterfaceC465240IMg, OnMessageListener, InterfaceC1300440jwg {
    public boolean LL;
    public boolean LLILLJJLI;
    public C11JF LLILLL;
    public WeakHandler LLILZIL;
    public final boolean LLJIJIL;
    public int LLJILJIL;
    public final Map<DataChannel, C1096480edi> LLILZ = new LinkedHashMap();
    public final LongSparseArray<ArrayList<InterfaceC781410Ul1>> LLILZLL = new LongSparseArray<>();
    public final LongSparseArray<DataChannel> LLIZ = new LongSparseArray<>();
    public final LongSparseArray<C0IKN> LLIZLLLIL = new LongSparseArray<>();
    public final LongSparseArray<C0IKN> LLJ = new LongSparseArray<>();
    public final ConcurrentHashMap<String, CopyOnWriteArrayList<C0U4S>> LLJI = new ConcurrentHashMap<>();

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final int C22(boolean z) {
        return z ? R.layout.hyj : R.layout.hyk;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final Object Gd2(DataChannel dataChannel, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return LJ(this, dataChannel, interfaceC1364105Vn);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final Object ND1(DataChannel dataChannel, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return LIZIZ(this, dataChannel, interfaceC1364105Vn);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final Object getAiCommentReplySwitch(DataChannel dataChannel, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return LIZ(this, dataChannel, interfaceC1364105Vn);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final C0UIJ Cb() {
        if (Intrinsics.LJFF("lightning_qa", "lightning_qa")) {
            return new C0UIJ();
        }
        return null;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final String Fq1() {
        C752740Tfs.LIZ.getClass();
        return C752740Tfs.LIZJ;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final LiveTopStickerEffectWidget GT1() {
        return new LiveTopStickerEffectWidget();
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final MarkedViewerListFragmentSheet I31() {
        return new MarkedViewerListFragmentSheet();
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void My2() {
        if (this.LLILLJJLI) {
            return;
        }
        this.LLILLJJLI = true;
        ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).bQ1(52, new C243200wo() { // from class: X.01dK
            @Override // X.InterfaceC1112400f3O
            public final void LJIL(C1112330f3H c1112330f3H) {
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJIIIZ(C1112330f3H c1112330f3H) {
                C19EG c19egLJ;
                String str;
                long j;
                CapsuleBizParamsCommentMuteRulePrompt capsuleBizParamsCommentMuteRulePrompt;
                CapsuleBizParamsCommentMuteRulePrompt capsuleBizParamsCommentMuteRulePrompt2;
                CapsuleBizParams capsuleBizParams = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
                if (capsuleBizParams != null && capsuleBizParams.commentMuteRulePrompt != null && (c19egLJ = C500260Jjc.LJ(c1112330f3H.LLIIIILZ().LIZ)) != null) {
                    FragmentManager supportFragmentManager = c19egLJ.getSupportFragmentManager();
                    Bundle bundle = new Bundle();
                    CapsuleBizParams capsuleBizParams2 = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
                    if (capsuleBizParams2 == null || (capsuleBizParamsCommentMuteRulePrompt2 = capsuleBizParams2.commentMuteRulePrompt) == null || (str = capsuleBizParamsCommentMuteRulePrompt2.content) == null) {
                        str = "";
                    }
                    C786410Ut5.LJJJI("content", str, bundle);
                    CapsuleBizParams capsuleBizParams3 = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
                    if (capsuleBizParams3 != null && (capsuleBizParamsCommentMuteRulePrompt = capsuleBizParams3.commentMuteRulePrompt) != null) {
                        j = capsuleBizParamsCommentMuteRulePrompt.userCnt;
                    } else {
                        j = 0;
                    }
                    bundle.putLong("userCnt", j);
                    C19322110iZ.LIZLLL(supportFragmentManager, ((IAdminSettingService) C1161920gLG.LIZJ(IAdminSettingService.class)).Lc0(), "live_mute_suggest_dialog", null, bundle);
                    return false;
                }
                return false;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJII(C1112330f3H c1112330f3H, Map<String, String> map) {
                map.put("user_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
                map.put("type", "autosuggest_mute_rule");
            }
        });
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final DrawGuessCanvasWidget P10() {
        return new DrawGuessCanvasWidget();
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final int Pm2() {
        C752740Tfs.LIZ.getClass();
        return C752740Tfs.LIZIZ;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void Xp() {
        int i = C498820JhI.LJIIIZ;
        InterfaceC1106030et7.k5.LIZJ(Double.valueOf(System.currentTimeMillis()));
        C0JT6<Integer> c0jt6 = InterfaceC1106030et7.l5;
        Integer numLIZ = c0jt6.LIZ();
        c0jt6.LIZJ(Integer.valueOf((numLIZ != null ? numLIZ.intValue() : 0) + 1));
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void a41() {
        if (C488910JFh.LIZLLL) {
            C488910JFh.LIZLLL = false;
            ((ArrayList) C488910JFh.LIZ.getValue()).clear();
            C488910JFh.LIZJ = false;
            C488910JFh.LIZIZ = null;
            C488910JFh.LJ = null;
        }
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void initPublicScreenConfiguration() {
        if (this.LL) {
            return;
        }
        this.LL = true;
        InterfaceC1106030et7.I8.LJFF(Boolean.FALSE);
        ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).bQ1(21, new InterfaceC1112400f3O() { // from class: X.01oq
            @Override // X.InterfaceC1112400f3O
            public final boolean LIZ() {
                return true;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LIZIZ(CapsuleMessage capsuleMessage, Map<String, String> map) {
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJIIJJI(C1112330f3H c1112330f3H) {
                return false;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJIILLIIL() {
            }

            @Override // X.InterfaceC1112400f3O
            public final int LJIIZILJ() {
                return 0;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJIJ(C1112330f3H c1112330f3H, Map<String, String> map) {
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJIL(C1112330f3H c1112330f3H) {
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJJIIJ(C1112330f3H c1112330f3H) {
            }

            @Override // X.InterfaceC1112400f3O
            public final int LJJIIZI(CapsuleMessage capsuleMessage) {
                return -1;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJJIJIIJI() {
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJJIJIL(C1109770ez9 c1109770ez9, CapsuleMessage capsuleMessage) {
                return false;
            }

            @Override // X.InterfaceC1112400f3O
            public final int LJJIJL(CapsuleMessage capsuleMessage) {
                return -1;
            }

            @Override // X.InterfaceC1112400f3O
            public final LiveCapsuleStyleItemConfig LJI() {
                return C952230at3.LIZ();
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJIIIIZZ(C1112330f3H c1112330f3H) {
                return C952230at3.LIZJ();
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJIIIZ(C1112330f3H c1112330f3H) {
                String string;
                CapsuleBizParamsCommentFlaggedPrompt capsuleBizParamsCommentFlaggedPrompt;
                FragmentManager fragmentManagerLJIL = C520010KaN.LJIL(c1112330f3H.LLIIIILZ().LIZ, false);
                if (fragmentManagerLJIL != null) {
                    Bundle bundle = new Bundle();
                    CapsuleBizParams capsuleBizParams = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
                    if (capsuleBizParams == null || (capsuleBizParamsCommentFlaggedPrompt = capsuleBizParams.commentFlaggedPrompt) == null || (string = Long.valueOf(capsuleBizParamsCommentFlaggedPrompt.trigger).toString()) == null) {
                        string = "";
                    }
                    C786410Ut5.LJJJI("trigger", string, bundle);
                    C786410Ut5.LJJJI("entry", "autosuggest_comment_filter", bundle);
                    C19322110iZ.LIZLLL(fragmentManagerLJIL, LiveFilterCommentSettingFragmentSheet.class, "live_filter_comment_setting", null, bundle);
                    return true;
                }
                return true;
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJJIIZ(C1112330f3H c1112330f3H) {
                return C952230at3.LIZIZ(c1112330f3H);
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJII(C1112330f3H c1112330f3H, Map<String, String> map) {
                String string;
                CapsuleBizParamsCommentFlaggedPrompt capsuleBizParamsCommentFlaggedPrompt;
                CapsuleBizParams capsuleBizParams = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
                if (capsuleBizParams == null || (capsuleBizParamsCommentFlaggedPrompt = capsuleBizParams.commentFlaggedPrompt) == null || (string = Long.valueOf(capsuleBizParamsCommentFlaggedPrompt.trigger).toString()) == null) {
                    string = "";
                }
                map.put("trigger", string);
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJJIFFI(C1112330f3H c1112330f3H, Map<String, String> map) {
                String string;
                CapsuleBizParamsCommentFlaggedPrompt capsuleBizParamsCommentFlaggedPrompt;
                CapsuleBizParams capsuleBizParams = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
                if (capsuleBizParams == null || (capsuleBizParamsCommentFlaggedPrompt = capsuleBizParams.commentFlaggedPrompt) == null || (string = Long.valueOf(capsuleBizParamsCommentFlaggedPrompt.trigger).toString()) == null) {
                    string = "";
                }
                map.put("trigger", string);
            }
        });
        ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).bQ1(53, new InterfaceC1112400f3O() { // from class: X.01dL
            public String LL = "1";

            @Override // X.InterfaceC1112400f3O
            public final boolean LIZ() {
                return true;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LIZIZ(CapsuleMessage capsuleMessage, Map<String, String> map) {
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJII(C1112330f3H c1112330f3H, Map<String, String> map) {
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJIIJJI(C1112330f3H c1112330f3H) {
                return false;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJIILLIIL() {
            }

            @Override // X.InterfaceC1112400f3O
            public final int LJIIZILJ() {
                return 0;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJIJ(C1112330f3H c1112330f3H, Map<String, String> map) {
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJJIFFI(C1112330f3H c1112330f3H, Map<String, String> map) {
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJJIIJ(C1112330f3H c1112330f3H) {
            }

            @Override // X.InterfaceC1112400f3O
            public final int LJJIIZI(CapsuleMessage capsuleMessage) {
                return -1;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJJIJIIJI() {
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJJIJIL(C1109770ez9 c1109770ez9, CapsuleMessage capsuleMessage) {
                return false;
            }

            @Override // X.InterfaceC1112400f3O
            public final int LJJIJL(CapsuleMessage capsuleMessage) {
                return -1;
            }

            @Override // X.InterfaceC1112400f3O
            public final LiveCapsuleStyleItemConfig LJI() {
                return C952230at3.LIZ();
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJIIIIZZ(C1112330f3H c1112330f3H) {
                return C952230at3.LIZJ();
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJIIIZ(C1112330f3H c1112330f3H) {
                FragmentManager supportFragmentManager;
                long j;
                CapsuleBizParamsCommentFlaggedPromptForNewUser capsuleBizParamsCommentFlaggedPromptForNewUser;
                CapsuleBizParamsCommentFlaggedPromptForNewUser capsuleBizParamsCommentFlaggedPromptForNewUser2;
                List<Long> list;
                C19EG c19egLJ = C500260Jjc.LJ(c1112330f3H.LLIIIILZ().LIZ);
                if (c19egLJ != null && (supportFragmentManager = c19egLJ.getSupportFragmentManager()) != null) {
                    Bundle bundle = new Bundle();
                    CapsuleBizParams capsuleBizParams = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
                    if (capsuleBizParams != null && (capsuleBizParamsCommentFlaggedPromptForNewUser2 = capsuleBizParams.commentFlaggedPromptForNewUser) != null && (list = capsuleBizParamsCommentFlaggedPromptForNewUser2.commentIds) != null) {
                        bundle.putLongArray("trigger_comment_id", C13LP.LLIIIILZ(list));
                    }
                    CapsuleBizParams capsuleBizParams2 = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
                    if (capsuleBizParams2 != null && (capsuleBizParamsCommentFlaggedPromptForNewUser = capsuleBizParams2.commentFlaggedPromptForNewUser) != null) {
                        j = capsuleBizParamsCommentFlaggedPromptForNewUser.trigger;
                    } else {
                        j = 0;
                    }
                    bundle.putLong("trigger", j);
                    C19322110iZ.LIZLLL(supportFragmentManager, LiveCommentFlagFilterFragmentSheet.class, "live_comment_flag_filter_dialog", null, bundle);
                }
                LIZJ("livesdk_comment_community_flag_capsule_click", c1112330f3H);
                return true;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJIL(C1112330f3H c1112330f3H) {
                String str;
                C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.I8;
                if (c20337914i1.LIZIZ().booleanValue()) {
                    str = CardStruct.IStatusCode.DEFAULT;
                } else {
                    str = "1";
                }
                this.LL = str;
                c20337914i1.LJFF(Boolean.TRUE);
                LIZJ("livesdk_comment_community_flag_capsule_see", c1112330f3H);
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJJIIZ(C1112330f3H c1112330f3H) {
                return C952230at3.LIZIZ(c1112330f3H);
            }

            public final void LIZJ(String str, C1112330f3H c1112330f3H) {
                CapsuleBizParamsCommentFlaggedPromptForNewUser capsuleBizParamsCommentFlaggedPromptForNewUser;
                long id;
                long ownerUserId;
                boolean z;
                String str2;
                CapsuleBizParams capsuleBizParams = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
                List<Long> list = null;
                if (capsuleBizParams != null) {
                    capsuleBizParamsCommentFlaggedPromptForNewUser = capsuleBizParams.commentFlaggedPromptForNewUser;
                } else {
                    capsuleBizParamsCommentFlaggedPromptForNewUser = null;
                }
                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                long j = 0;
                if (room != null) {
                    id = room.getId();
                } else {
                    id = 0;
                }
                long currentUserId = UserService.getInstance().user().getCurrentUserId();
                if (room != null) {
                    ownerUserId = room.getOwnerUserId();
                } else {
                    ownerUserId = 0;
                }
                if (ownerUserId == currentUserId) {
                    z = true;
                } else {
                    z = false;
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII(Long.valueOf(currentUserId), "user_id");
                if (z) {
                    str2 = "anchor";
                } else {
                    str2 = "admin";
                }
                c474500IjALIZ.LJJII(str2, "admin_type");
                c474500IjALIZ.LJJII(Long.valueOf(id), "room_id");
                c474500IjALIZ.LJJII(this.LL, "live_room_first_time_see");
                if (capsuleBizParamsCommentFlaggedPromptForNewUser != null) {
                    j = capsuleBizParamsCommentFlaggedPromptForNewUser.trigger;
                }
                c474500IjALIZ.LJJII(Long.valueOf(j), "trigger");
                if (capsuleBizParamsCommentFlaggedPromptForNewUser != null) {
                    list = capsuleBizParamsCommentFlaggedPromptForNewUser.commentIds;
                }
                c474500IjALIZ.LJJII(list, "trigger_comment_id");
                c474500IjALIZ.LIZ();
            }
        });
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final boolean le1() {
        C1086960eOM c1086960eOM = C1086960eOM.LL;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        long id = room != null ? room.getId() : 0L;
        c1086960eOM.getClass();
        return C1086960eOM.LJIILLIIL(id);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void onEnterBroadcastPreview() {
        InterfaceC1106030et7.E4.LJFF(Boolean.TRUE);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final LiveGiftPollEffectWidget sQ2() {
        return new LiveGiftPollEffectWidget(257);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void tk0() {
        C1086800eO6 c1086800eO6 = C1086800eO6.LIZ;
        CountDownTimerC1086810eO7 countDownTimerC1086810eO7 = C1086800eO6.LIZIZ;
        if (countDownTimerC1086810eO7 != null) {
            countDownTimerC1086810eO7.cancel();
        }
        C1086800eO6.LJFF.clear();
        DataChannel dataChannel = C1086800eO6.LJI;
        if (dataChannel != null) {
            dataChannel.zQ2(c1086800eO6);
        }
        C1086800eO6.LJI = null;
        C1086800eO6.LJ = 0;
        C1086800eO6.LIZJ = false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Jd4] */
    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final C496200Jd4 uL2() {
        return new AbstractC497160Jec<BaseResponse<GetRoomProfileCardResponse.ResponseData, Extra>, C496230Jd7>() { // from class: X.0Jd4
            @Override // X.AbstractC497160Jec
            public final void LIZJ() {
            }

            @Override // X.AbstractC497160Jec
            public final String LIZLLL() {
                return "POST";
            }

            @Override // X.AbstractC497160Jec
            public final String LJ() {
                return "/webcast/room/profile_card/";
            }

            @Override // X.AbstractC497160Jec
            public final String LJFF() {
                return "application/json; charset=utf-8";
            }

            @Override // X.AbstractC497160Jec
            public final Type LJII() {
                return new TypeToken<BaseResponse<GetRoomProfileCardResponse.ResponseData, Extra>>() { // from class: X.0Jd6
                }.getType();
            }

            @Override // X.AbstractC497160Jec
            public final Class<BaseResponse<GetRoomProfileCardResponse.ResponseData, Extra>> LJIIIIZZ() {
                new BaseResponse();
                return BaseResponse.class;
            }

            @Override // X.AbstractC497160Jec
            public final boolean LIZ(C496230Jd7 c496230Jd7) {
                AggregationData aggregationData;
                Room room = c496230Jd7.LIZ;
                if (room != null && (aggregationData = room.aggregationData) != null && aggregationData.audience != null) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC497160Jec
            public final Object LIZIZ(C496230Jd7 c496230Jd7) {
                AggregationData aggregationData;
                User user;
                boolean z;
                int i;
                C496230Jd7 c496230Jd72 = c496230Jd7;
                Room room = c496230Jd72.LIZ;
                if (room != null && (aggregationData = room.aggregationData) != null && (user = aggregationData.audience) != null) {
                    User.EnigmaInfo enigmaInfo = user.enigmaInfo;
                    boolean z2 = false;
                    if (enigmaInfo != null && enigmaInfo.isEnigmaMaskOn) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i2 = 2;
                    if (z) {
                        i = 32;
                    } else {
                        UserAttr userAttr = user.getUserAttr();
                        if (userAttr != null && userAttr.isAdmin) {
                            i = 2;
                        } else {
                            i = 1;
                        }
                    }
                    GetRoomProfileCardRequest getRoomProfileCardRequest = new GetRoomProfileCardRequest();
                    getRoomProfileCardRequest.roomId = room.getId();
                    getRoomProfileCardRequest.anchorId = room.getOwnerUserId();
                    getRoomProfileCardRequest.targetUserId = room.getOwnerUserId();
                    getRoomProfileCardRequest.userRole = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, C2097608Jq.LJIIIIZZ(new Pair(Long.valueOf(user.getId()), Integer.valueOf(i)), new Pair(Long.valueOf(getRoomProfileCardRequest.targetUserId), 4)));
                    IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
                    User user2 = new User();
                    user2.setId(user.getId());
                    int i3 = C496210Jd5.LIZ[iInteractService.ND(user2).ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                i2 = 0;
                            }
                        } else {
                            i2 = 3;
                        }
                    } else {
                        i2 = 1;
                    }
                    getRoomProfileCardRequest.galleryEntranceScene = i2;
                    BusinessDataFilter businessDataFilter = new BusinessDataFilter();
                    businessDataFilter.needUser = true;
                    businessDataFilter.needGiftGalleryEntrance = c496230Jd72.LIZIZ;
                    getRoomProfileCardRequest.businessDataFilter = businessDataFilter;
                    if (i == 32) {
                        z2 = true;
                    }
                    getRoomProfileCardRequest.canRecognizeEnigmaRole = z2;
                    return getRoomProfileCardRequest;
                }
                return null;
            }

            @Override // X.AbstractC497160Jec
            public final /* bridge */ /* synthetic */ Map LJI(C496230Jd7 c496230Jd7) {
                return null;
            }

            @Override // X.AbstractC497160Jec
            public final boolean LJIIIZ(BaseResponse<GetRoomProfileCardResponse.ResponseData, Extra> baseResponse) {
                if (baseResponse.statusCode == 0) {
                    return true;
                }
                return false;
            }
        };
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void wL2() {
        C752740Tfs.LIZ.getClass();
        C752740Tfs.LIZIZ = 0;
        C752740Tfs.LIZJ = "";
        C752740Tfs.LIZLLL = null;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final DrawGuessStatusWidget yO1() {
        return new DrawGuessStatusWidget();
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final boolean yU0() {
        C752740Tfs.LIZ.getClass();
        int i = C752740Tfs.LIZIZ;
        return i == 0 || (i != 1 && C752740Tfs.LIZJ.length() == 0);
    }

    public RoomFunctionService() {
        this.LLJIJIL = LiveStrategyParamsSwitchSetting.getValue().f36switch || LiveAnchorStrategyParamsSwitchSetting.getValue().f35switch;
        this.LLJILJIL = -1;
    }

    public final void onInit() {
        if (LiveServiceManagerOptSetting.enable()) {
            return;
        }
        C1119850fFP c1119850fFP = C011Z.LIZ;
        C783420UoG c783420UoG = new C783420UoG();
        c1119850fFP.getClass();
        C1119850fFP.LJJIFFI(R.drawable.eqn, c783420UoG);
        C1119850fFP.LJJIFFI(R.drawable.exj, new C783420UoG());
        C1119850fFP.LJJIFFI(R.drawable.eql, new C783420UoG());
        C1119850fFP.LJJIFFI(R.drawable.eql, new C783420UoG());
        C1119850fFP.LJJIFFI(R.drawable.eup, new C783420UoG());
        C1105280eru.LIZIZ(null, C13LQ.LJLIIL(new Integer[]{Integer.valueOf(R.layout.hun), Integer.valueOf(R.layout.go8), Integer.valueOf(R.layout.gox), Integer.valueOf(R.layout.h93), Integer.valueOf(R.layout.i25), Integer.valueOf(R.layout.hjj), Integer.valueOf(R.layout.hwa), Integer.valueOf(R.layout.huv), Integer.valueOf(R.layout.hwf)}));
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final C0JFN C72() {
        return C0JFN.LIZ;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final Class<? extends LiveRecyclableWidget> Gi0() {
        return DrawGuessCanvasWidget.class;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void JP0() {
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final boolean Ly1() {
        return C1086800eO6.LIZJ;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void Nf1() {
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final boolean QO() {
        return C1086830eO9.LIZLLL;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final long S00() {
        return C1086830eO9.LIZIZ;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final Class<? extends ILiveNormalPollViewModel> SL0() {
        return LiveNormalPollViewModel.class;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final Class<? extends LiveRecyclableWidget> V80() {
        return StreamInfoWidget.class;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void aj0() {
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final Class<? extends LiveRecyclableWidget> eQ() {
        return DrawGuessStatusWidget.class;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final C1087250eOp getRoomStatus() {
        return C1087250eOp.LL;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final C1086960eOM lI() {
        return C1086960eOM.LL;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final Class<? extends LiveRecyclableWidget> mD0() {
        return LiveTopAlphaVideoWidget.class;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final Class<? extends LiveRecyclableWidget> nQ0() {
        return NormalSelectPollWidget.class;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final Class<? extends LiveRecyclableWidget> tv1() {
        return LiveRoomNotifyWidget.class;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void tz1() {
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final Class<? extends LiveRecyclableWidget> wk1() {
        return LiveEventDescCardWidget.class;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final Class<? extends LiveRecyclableWidget> ze2() {
        return GiftSelectPollWidget.class;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void AV0(DataChannel dataChannel) {
        EnumC1102750enp.CUSTOM_POLL.load(dataChannel, new C773870UXh());
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final boolean AZ1(Room room) {
        BcToggleInfo bcToggleInfoPq0;
        if (room == null || (bcToggleInfoPq0 = Pq0(room)) == null) {
            return false;
        }
        CommercialContentToggle commercialContentToggle = room.commercialContentToggle;
        Integer numValueOf = Integer.valueOf(bcToggleInfoPq0.status);
        if (commercialContentToggle != null && (commercialContentToggle.promoteMyself || commercialContentToggle.promoteThirdParty)) {
            return true;
        }
        if (numValueOf != null && (numValueOf.intValue() == 0 || numValueOf.intValue() == 3)) {
            return false;
        }
        IntRange intRange = new IntRange(1, 9);
        if (numValueOf == null || !intRange.LJLJL(numValueOf.intValue())) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final LiveInteractionFeaturesFragment B01(Bundle bundle) {
        LiveInteractionFeaturesFragment liveInteractionFeaturesFragment = new LiveInteractionFeaturesFragment();
        liveInteractionFeaturesFragment.setArguments(bundle);
        return liveInteractionFeaturesFragment;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final InterfaceC777420Uea Ea0(ViewModelProvider viewModelProvider) {
        return (InterfaceC777420Uea) viewModelProvider.get(BroadcastDialogDispatcher.class);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final boolean Ee1(Room room) {
        boolean z = false;
        if (room == null) {
            return false;
        }
        RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
        if (roomAuthStatus != null && roomAuthStatus.getUserCountDisplayState() == 2) {
            z = true;
        }
        return !z;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void Fp0(long j) {
        this.LLJ.remove(j);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void Gf2(DataChannel dataChannel) {
        EnumC1102750enp.AUDIENCE_INTERACTION_FEATURES.load(dataChannel, new C773850UXf(), false);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void IG2(int i) {
        C752740Tfs.LIZ.getClass();
        C752740Tfs.LIZIZ = i;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final Object Jx0(InterfaceC1364105Vn<? super AnchorLocationSettingsReadResponse.ResponseData> interfaceC1364105Vn) {
        return C752740Tfs.LIZ.LIZ(interfaceC1364105Vn);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void Kp1(Room room) {
        List<PollOptionInfo> list;
        PollUpdateVotesContent pollUpdateVotesContent;
        IMessageManager iMessageManager;
        if (room != null) {
            C1086960eOM c1086960eOM = C1086960eOM.LL;
            long id = room.getId();
            c1086960eOM.getClass();
            C1086960eOM.LLJJJJ = false;
            LongSparseArray<DataChannel> longSparseArray = C1086960eOM.LLILLJJLI;
            DataChannel dataChannel = longSparseArray.get(id);
            if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
                iMessageManager.removeMessageListener(C1086960eOM.LLILLL.get(id));
            }
            C01C1 c01c1LIZJ = C1086960eOM.LIZJ(id);
            if (c01c1LIZJ != null) {
                if (C500260Jjc.LJIIZILJ(longSparseArray.get(id))) {
                    c01c1LIZJ.LJI = EnumC1085350eLl.LIVE_END;
                    PollMessage pollMessage = c01c1LIZJ.LJFF;
                    if (pollMessage != null) {
                        PollEndContent pollEndContent = new PollEndContent();
                        PollMessage pollMessage2 = C1086960eOM.LLILZLL;
                        if (pollMessage2 == null || (pollUpdateVotesContent = pollMessage2.updateContent) == null || (list = pollUpdateVotesContent.optionList) == null) {
                            list = C13BV.INSTANCE;
                        }
                        pollEndContent.optionList = list;
                        pollMessage.endContent = pollEndContent;
                    }
                    C01C3.LJI(longSparseArray.get(id), c01c1LIZJ, "close_take");
                } else {
                    c01c1LIZJ.LJI = EnumC1085350eLl.LEAVE_ROOM;
                }
                c1086960eOM.LJIILIIL(id, c01c1LIZJ);
            }
            C1548820qPI.LJIIIIZZ("custom_poll_start", c1086960eOM);
            C1548820qPI.LJIIIIZZ("custom_poll_template_page_status", c1086960eOM);
            C1548820qPI.LJIIIIZZ("custom_poll_open_interact", c1086960eOM);
            C1548820qPI.LJIIIIZZ("custom_poll_open_detailed_panel", c1086960eOM);
            C1548820qPI.LJIIIIZZ("sub_emote_poll_open_detailed_panel", c1086960eOM);
            C1548820qPI.LJIIIIZZ("close_poll_short_touch", c1086960eOM);
            C1548820qPI.LJIIIIZZ("gift_vote_dialog_status_changed", c1086960eOM);
            if (C500260Jjc.LJJJIL(longSparseArray.get(C1086960eOM.LLJJJ))) {
                C1548820qPI.LJIIIIZZ("try_mode_custom_poll_message_event", c1086960eOM);
            }
            LongSparseArray<OnMessageListener> longSparseArray2 = C1086960eOM.LLILLL;
            OnMessageListener onMessageListener = longSparseArray2.get(id);
            if (onMessageListener != null) {
                C482260Ivg.LJ(onMessageListener);
            }
            LongSparseArray<CopyOnWriteArrayList<InterfaceC1086970eON>> longSparseArray3 = C1086960eOM.LLJILJIL;
            longSparseArray3.remove(id);
            C1086960eOM.LLILZLL = null;
            C1086960eOM.LLJ = null;
            C1086960eOM.LLJIJIL = false;
            C1086960eOM.LLJJJIL.remove(id);
            C1086960eOM.LLILZIL.remove(id);
            C1086960eOM.LLJILLL.remove(id);
            C1086960eOM.LLJILJILJ.remove(id);
            longSparseArray2.remove(id);
            longSparseArray.remove(id);
            longSparseArray.clear();
            C1086960eOM.LLILZ.remove(id);
            longSparseArray3.remove(id);
            C1086960eOM.LLJI = null;
            C1086960eOM.LLJJ.clear();
            C1086960eOM.LLJJIJIIJIL.removeCallbacksAndMessages(null);
            C1086960eOM.LLJJI = null;
            C1086960eOM.LLIZ = 0L;
            C294101Bz c294101Bz = C1086960eOM.LLJJIJIL;
            if (c294101Bz != null) {
                C482260Ivg.LJ(c294101Bz);
            }
            C1086960eOM.LLJJIJIL = null;
        }
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void LLZZZIL(final DataChannel dataChannel) {
        C482260Ivg.LIZLLL(DrawGuessApi.class, new DrawGuessApi(dataChannel) { // from class: X.0JFX
            public final DataChannel LIZ;
            public long LIZIZ = 1;
            public long LIZJ = 1;
            public final List<PictionaryFullInfo> LIZLLL = new ArrayList();

            {
                this.LIZ = dataChannel;
            }

            @Override // com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi
            public final C11NZ<C470590Icr<DrawGuessWordlistResponse>> getWordList(long j) {
                if (C500260Jjc.LJJJIL(this.LIZ)) {
                    return getMockWordList(j, C500260Jjc.LJJJJZ(this.LIZ));
                }
                C480460Ism.LIZ().getClass();
                return ((DrawGuessApi) C480460Ism.LIZLLL(DrawGuessApi.class)).getWordList(j);
            }

            @Override // com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi
            public final AbstractC19484711Kz<C470590Icr<CoverImageModel>> uploadImage(TypedOutput typedOutput) {
                return AbstractC19484711Kz.LJIILLIIL(new C0JFY());
            }

            @Override // com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi
            public final C11NZ<C470590Icr<DrawGuessWordlistResponse>> getMockWordList(long j, long j2) {
                C480460Ism.LIZ().getClass();
                return ((DrawGuessApi) C480460Ism.LIZLLL(DrawGuessApi.class)).getMockWordList(j, j2);
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [T, com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessSummaryResponse] */
            @Override // com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi
            public final C11NZ<C470590Icr<DrawGuessSummaryResponse>> getSummaryData(long j, long j2) {
                C470590Icr c470590Icr = new C470590Icr();
                c470590Icr.data = new DrawGuessSummaryResponse(new ArrayList());
                return C11NZ.LJJJJZ(c470590Icr);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [T, webcast.api.interaction.pictionary.ReviewWordResponse$ResponseData] */
            @Override // com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi
            public final C11NZ<C470590Icr<ReviewWordResponse.ResponseData>> reviewWord(long j, String str) {
                C470590Icr c470590Icr = new C470590Icr();
                c470590Icr.data = new ReviewWordResponse.ResponseData();
                return C11NZ.LJJJJZ(c470590Icr);
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [T, com.bytedance.android.livesdk.interaction.drawguess.network.GuessResponse] */
            @Override // com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi
            public final C11NZ<C470590Icr<GuessResponse>> guessWord(long j, long j2, String str) {
                C470590Icr c470590Icr = new C470590Icr();
                c470590Icr.data = new GuessResponse(true, "");
                return C11NZ.LJJJJZ(c470590Icr);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [T, com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessEndResponse] */
            @Override // com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi
            public final C11NZ<C470590Icr<DrawGuessEndResponse>> endDrawGuessGameRound(long j, long j2, String str, int i) {
                C470590Icr c470590Icr = new C470590Icr();
                c470590Icr.data = new DrawGuessEndResponse(new PictionaryStatistics(0L, 0L, null));
                return C11NZ.LJJJJZ(c470590Icr);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [T, com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessSummaryResponse] */
            @Override // com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi
            public final C11NZ<C470590Icr<DrawGuessSummaryResponse>> exitDrawGuessGame(long j, long j2, long j3, String str) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.LIZLLL);
                ((ArrayList) this.LIZLLL).clear();
                C470590Icr c470590Icr = new C470590Icr();
                c470590Icr.data = new DrawGuessSummaryResponse(arrayList);
                return C11NZ.LJJJJZ(c470590Icr);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [T, webcast.api.interaction.pictionary.PictionaryRankResponse$ResponseData] */
            @Override // com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi
            public final C11NZ<C470590Icr<PictionaryRankResponse.ResponseData>> getRoundSummaryData(long j, long j2, long j3, long j4) {
                C470590Icr c470590Icr = new C470590Icr();
                c470590Icr.data = new PictionaryRankResponse.ResponseData();
                return C11NZ.LJJJJZ(c470590Icr);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi
            public final C11NZ<C470590Icr<StartDrawGuessResponse>> startDrawGuess(long j, long j2, long j3, String str, int i) {
                T startDrawGuessResponse;
                if (i == 2) {
                    startDrawGuessResponse = new StartDrawGuessResponse(1L, 1L);
                } else {
                    if (j2 == 0) {
                        this.LIZJ++;
                        this.LIZIZ++;
                    } else {
                        this.LIZIZ++;
                    }
                    startDrawGuessResponse = new StartDrawGuessResponse(this.LIZIZ, this.LIZJ);
                }
                List<PictionaryFullInfo> list = this.LIZLLL;
                PictionaryInfo pictionaryInfo = new PictionaryInfo();
                pictionaryInfo.word = str;
                pictionaryInfo.id = j3;
                pictionaryInfo.pictionaryType = i;
                pictionaryInfo.sessionId = j2;
                ((ArrayList) list).add(new PictionaryFullInfo(pictionaryInfo, new PictionaryStatistics(0L, 0L, null), false));
                C470590Icr c470590Icr = new C470590Icr();
                c470590Icr.data = startDrawGuessResponse;
                return C11NZ.LJJJJZ(c470590Icr);
            }
        });
        C482260Ivg.LIZLLL(QAApi.class, new QAApi(dataChannel) { // from class: X.0UNa
            public final DataChannel LIZ;

            {
                this.LIZ = dataChannel;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [T, com.bytedance.android.livesdk.qa.CurrentQuestionResponse] */
            @Override // com.bytedance.android.livesdk.qa.QAApi
            public final C11NZ<C470590Icr<CurrentQuestionResponse>> queryCurrentQuestion(long j) {
                C470590Icr c470590Icr = new C470590Icr();
                c470590Icr.data = new CurrentQuestionResponse(new QuestionEx(new Question(), 0L, 0, false, false, false, 0L, 0, 0));
                return C11NZ.LJJJJZ(c470590Icr);
            }

            @Override // com.bytedance.android.livesdk.qa.QAApi
            public final C11NZ<C470590Icr<Object>> endAnswer(long j, long j2) {
                C470590Icr c470590Icr = new C470590Icr();
                c470590Icr.data = "";
                return C11NZ.LJJJJZ(c470590Icr);
            }

            @Override // com.bytedance.android.livesdk.qa.QAApi
            public final C11NZ<C470590Icr<QuestionList>> getRecommendQuestion(long j, int i, int i2) {
                if (C500260Jjc.LJJJIL(this.LIZ)) {
                    return getTryModeRecommendQuestion(C500260Jjc.LJJJJZ(this.LIZ), j, i, i2);
                }
                C480460Ism.LIZ().getClass();
                return ((QAApi) C480460Ism.LIZLLL(QAApi.class)).getRecommendQuestion(j, i, i2);
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [T, com.bytedance.android.livesdk.qa.StartAnswerResponse] */
            @Override // com.bytedance.android.livesdk.qa.QAApi
            public final C11NZ<C470590Icr<StartAnswerResponse>> startAnswer(long j, long j2, int i) {
                boolean zLJI = MethodIDManager.LJI(202507);
                C470590Icr c470590Icr = new C470590Icr();
                c470590Icr.data = new StartAnswerResponse(0L);
                C11K9 c11k9LJJJJZ = C11NZ.LJJJJZ(c470590Icr);
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                return c11k9LJJJJZ;
            }

            @Override // com.bytedance.android.livesdk.qa.QAApi
            public final C11NZ<C470590Icr<QuestionList>> getTryModeRecommendQuestion(long j, long j2, int i, int i2) {
                C480460Ism.LIZ().getClass();
                return ((QAApi) C480460Ism.LIZLLL(QAApi.class)).getTryModeRecommendQuestion(j, j2, i, i2);
            }
        });
        C482260Ivg.LIZLLL(PollApi.class, new C425401l6(dataChannel));
        C482260Ivg.LIZLLL(RoomSwitchApi.class, new RoomSwitchApi() { // from class: X.0135
            @Override // com.bytedance.android.live.adminsetting.RoomSwitchApi
            public final C11NZ<C470590Icr<Object>> batchUpdateSwitch(SwitchBatchUpdateRequest switchBatchUpdateRequest) {
                return C11NZ.LJJJJZ(new C470590Icr());
            }

            @Override // com.bytedance.android.live.adminsetting.RoomSwitchApi
            public final C11NZ<C470590Icr<Object>> updateSwitch(long j, int i, boolean z, long j2) {
                return C11NZ.LJJJJZ(new C470590Icr());
            }
        });
        C482260Ivg.LIZLLL(MuteApi.class, new MuteApi() { // from class: X.0Tew
            @Override // com.bytedance.android.livesdk.usermanage.MuteApi
            public final C11NZ<C470590Icr<Object>> unmute(long j, long j2, String str) {
                return C11NZ.LJJJJZ(new C470590Icr());
            }

            @Override // com.bytedance.android.livesdk.usermanage.MuteApi
            public final C11NZ<C752140Teu> getMuteList(long j, int i, int i2, String str) {
                C752140Teu c752140Teu = new C752140Teu();
                c752140Teu.data = C13BV.INSTANCE;
                c752140Teu.extra = new UserManageExtra();
                return C11NZ.LJJJJZ(c752140Teu);
            }

            @Override // com.bytedance.android.livesdk.usermanage.MuteApi
            public final C11NZ<C470590Icr<SilenceResponse>> mute(long j, long j2, long j3, String str, long j4, long j5) {
                return C11NZ.LJJJJZ(new C470590Icr());
            }
        });
        C482260Ivg.LIZLLL(MarkUserApi.class, new MarkUserApi() { // from class: X.0Ilo
            @Override // com.bytedance.android.livesdk.usermanage.MarkUserApi
            public final C11NZ<C470590Icr<List<MarkListResp.MarkedUser>>> fetchMarkedUserList() {
                C480460Ism.LIZ().getClass();
                return ((MarkUserApi) C480460Ism.LIZIZ(MarkUserApi.class)).fetchMarkedUserList();
            }

            @Override // com.bytedance.android.livesdk.usermanage.MarkUserApi
            public final C11NZ<C470590Icr<MarkUserResp.Data>> mark(long j, String str) {
                return C11NZ.LJJJJZ(new C470590Icr());
            }

            @Override // com.bytedance.android.livesdk.usermanage.MarkUserApi
            public final C11NZ<C470590Icr<UnmarkUserResp.Data>> unmark(long j, String str) {
                return C11NZ.LJJJJZ(new C470590Icr());
            }
        });
        C482260Ivg.LIZLLL(KickOutApi.class, new KickOutApi() { // from class: X.0Tev
            @Override // com.bytedance.android.livesdk.usermanage.KickOutApi
            public final C11NZ<C470590Icr<Unit>> unKickOut(long j, long j2) {
                return C11NZ.LJJJJZ(new C470590Icr());
            }

            @Override // com.bytedance.android.livesdk.usermanage.KickOutApi
            public final C11NZ<C470590Icr<Unit>> kickOut(long j, long j2, Long l) {
                return C11NZ.LJJJJZ(new C470590Icr());
            }

            @Override // com.bytedance.android.livesdk.usermanage.KickOutApi
            public final C11NZ<C752140Teu> getKickedOutList(long j, int i, int i2, String str) {
                C752140Teu c752140Teu = new C752140Teu();
                c752140Teu.data = C13BV.INSTANCE;
                c752140Teu.extra = new UserManageExtra();
                return C11NZ.LJJJJZ(c752140Teu);
            }
        });
        C482260Ivg.LIZLLL(AdminApi.class, new AdminApi() { // from class: X.0TeV
            @Override // com.bytedance.android.livesdk.usermanage.AdminApi
            public final C11NZ<AdminHostListResponse> requestModeratorIHostList() {
                return C11NZ.LJJJJZ(new AdminHostListResponse());
            }

            @Override // com.bytedance.android.livesdk.usermanage.AdminApi
            public final C11NZ<C470590Icr<AdminOperationRecordListResponse.Data>> getModeratorOperationRecords() {
                C480460Ism.LIZ().getClass();
                return ((AdminApi) C480460Ism.LIZLLL(AdminApi.class)).getModeratorOperationRecords();
            }

            @Override // com.bytedance.android.livesdk.usermanage.AdminApi
            public final C11NZ<BaseResponse<Object, AddAdminExtra>> updateAdminWithExtra(UpdateAdminParams updateAdminParams) {
                return C11NZ.LJJJJZ(new BaseResponse());
            }

            @Override // com.bytedance.android.livesdk.usermanage.AdminApi
            public final C11NZ<DelHostRelationResponse> delHostIModerator(long j, long j2) {
                return C11NZ.LJJJJZ(new DelHostRelationResponse());
            }

            @Override // com.bytedance.android.livesdk.usermanage.AdminApi
            public final C11NZ<AdminOverallTabResponse> getAdminOverallTab(Long l, int i) {
                C480460Ism.LIZ().getClass();
                return ((AdminApi) C480460Ism.LIZLLL(AdminApi.class)).getAdminOverallTab(l, i);
            }

            @Override // com.bytedance.android.livesdk.usermanage.AdminApi
            public final C11NZ<ViolationStatusResponse> requestReportViolation(int i, long j) {
                return C11NZ.LJJJJZ(new ViolationStatusResponse());
            }

            @Override // com.bytedance.android.livesdk.usermanage.AdminApi
            public final C11NZ<BaseListResponse<AdminResponse, AdminListExtra>> fetchAdministrators(long j, String str, String str2) {
                C480460Ism.LIZ().getClass();
                return ((AdminApi) C480460Ism.LIZLLL(AdminApi.class)).fetchAdministrators(j, str, str2);
            }

            @Override // com.bytedance.android.livesdk.usermanage.AdminApi
            public final C11NZ<C470590Icr<AnchorAdminListResponse.Data>> fetchAdministratorsNew(long j, String str, String str2, long j2) {
                C480460Ism.LIZ().getClass();
                return ((AdminApi) C480460Ism.LIZLLL(AdminApi.class)).fetchAdministratorsNew(j, str, str2, j2);
            }

            @Override // com.bytedance.android.livesdk.usermanage.AdminApi
            public final C11NZ<C470590Icr<Object>> updateAdmin(int i, long j, long j2, long j3) {
                return C11NZ.LJJJJZ(new C470590Icr());
            }

            @Override // com.bytedance.android.livesdk.usermanage.AdminApi
            public final C11NZ<C470590Icr<Object>> updateAdminPermission(int i, int i2, long j, long j2, long j3, String str, String str2) {
                return C11NZ.LJJJJZ(new C470590Icr());
            }
        });
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void MY(long j) {
        this.LLIZLLLIL.remove(j);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void Nt2(C1AUC c1auc) {
        ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).fetchLocationForHost("global_live", "nearby_live", c1auc, null);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final BcToggleInfo Pq0(Room room) {
        if (room == null) {
            return null;
        }
        if (dA1(room)) {
            return room.officialChannelBcToggleInfo;
        }
        return room.getBcToggleInfo();
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final boolean Tt1(DataChannel dataChannel) {
        Boolean boolValueOf;
        IProgrammedLiveService iProgrammedLiveService = (IProgrammedLiveService) C1161920gLG.LIZJ(IProgrammedLiveService.class);
        Object objGg0 = null;
        if (iProgrammedLiveService != null) {
            boolValueOf = Boolean.valueOf(iProgrammedLiveService.lm1());
        } else {
            boolValueOf = null;
        }
        boolean zOn1 = ((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).On1();
        boolean zLIZ = ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).getRoomStatus().LIZ(Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannel)));
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(C0TZM.class);
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.FALSE) && !zOn1 && !zLIZ && Intrinsics.LJFF(objGg0, Boolean.TRUE)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final DrawGuessToolbarWidget Y12(Fragment fragment) {
        return new DrawGuessToolbarWidget(fragment);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void ZH(DataChannel dataChannel) {
        RoomAuthStatus roomAuthStatus;
        if (!C0UIM.LJFF()) {
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null && room.getOwnerUserId() == UserService.getInstance().user().getCurrentUserId()) {
                if (room.getStreamType() == LiveMode.SCREEN_RECORD) {
                    if (C0UIM.LJI() || (((roomAuthStatus = room.getRoomAuthStatus()) != null && roomAuthStatus.guessEntranceForHost) || C0UXQ.LIZ(room))) {
                    }
                } else if (room != null) {
                    room.getStreamType();
                }
                EnumC1102750enp.INTERACTION_FEATURES.load(dataChannel, new C0UXA());
            } else {
                EnumC1102750enp.INTERACTION_FEATURES.load(dataChannel, new C0UXA());
            }
        }
        EnumC1102750enp.ANCHOR_INTERACTION_FEATURES_IN_MORE.load(dataChannel, new C0UXA());
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void bC1(Function1<? super Boolean, Unit> function1) {
        C1086800eO6.LIZ.LIZ(2, function1);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final boolean dA1(Room room) {
        if (room == null || !((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).On1() || room.officialChannelInfo == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void dK(C920440a3m c920440a3m) {
        CopyOnWriteArrayList<C0U4S> copyOnWriteArrayList = this.LLJI.get("invite_outroom_link_succ");
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.LLJI.put("invite_outroom_link_succ", copyOnWriteArrayList);
        }
        if ((!copyOnWriteArrayList.contains(c920440a3m)) && c920440a3m != null) {
            copyOnWriteArrayList.add(c920440a3m);
        }
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final boolean dS(Room room) {
        BcToggleInfo bcToggleInfoPq0;
        if (room == null || (bcToggleInfoPq0 = Pq0(room)) == null || bcToggleInfoPq0.position != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void dn(Observer<User> observer) {
        C0KXB.LIZ.removeObserver(observer);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void eU(DataChannel dataChannel) {
        EnumC1102740eno.load$default(EnumC1102740eno.VOTE, dataChannel, new InterfaceC1102810env() { // from class: X.0KWj
            public DataChannel LL;
            public InterfaceC785120Ur0 LLILLJJLI;

            @Override // X.InterfaceC1102810env
            public final void J() {
            }

            @Override // X.InterfaceC1102810env
            public final Integer LIZJ() {
                return null;
            }

            @Override // X.InterfaceC1102810env
            public final void LIZLLL(C1099960ejK c1099960ejK, InterfaceC785120Ur0 interfaceC785120Ur0) {
            }

            @Override // X.InterfaceC1102810env
            public final Integer LJ() {
                return null;
            }

            @Override // X.InterfaceC1102810env
            public final void LLILLJJLI() {
            }

            @Override // X.InterfaceC1102810env
            public final void LLILZ() {
            }

            @Override // X.InterfaceC1102810env
            public final boolean f1() {
                return false;
            }

            @Override // X.InterfaceC1102810env
            public final long g0() {
                return 500L;
            }

            @Override // X.InterfaceC1102810env
            public final boolean x0(View view) {
                return false;
            }

            @Override // X.InterfaceC1102810env
            public final C0KX7 LIZ() {
                return C0KX7.FIXED;
            }

            @Override // X.InterfaceC1102810env
            public final void onClick(View view) {
                C0KX8 c0kx8;
                Long l;
                int i;
                C0KWU.LIZJ(this.LL, "toolbar_vote");
                DataChannel dataChannel2 = this.LL;
                if (dataChannel2 != null) {
                    c0kx8 = (C0KX8) dataChannel2.gg0(LiveBanCapabilityChannel.class);
                } else {
                    c0kx8 = null;
                }
                if (c0kx8 != null && c0kx8.LIZLLL && (C01C5.LIZ(this.LL) || C500260Jjc.LJIIZILJ(this.LL))) {
                    if (C500260Jjc.LJIIZILJ(this.LL)) {
                        C766270U4b.LIZLLL(2131844184);
                    }
                    if (C01C5.LIZ(this.LL)) {
                        C766270U4b.LIZLLL(2131844187);
                        return;
                    }
                    return;
                }
                if (C494680Jac.LJI(this.LL)) {
                    if (((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Kw0(this.LL)) {
                        i = 2131856620;
                    } else {
                        i = 2131844448;
                    }
                    C766270U4b.LIZLLL(i);
                    return;
                }
                DataChannel dataChannel3 = this.LL;
                if (dataChannel3 != null) {
                    dataChannel3.SX0(C753250Tgh.class, "toolbar_vote");
                }
                DataChannel dataChannel4 = this.LL;
                if (dataChannel4 != null && Intrinsics.LJFF(dataChannel4.gg0(C0TZM.class), Boolean.FALSE) && !((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
                    C784440Upu.LIZ().LIZIZ(new C0IF2(1));
                    DataChannel dataChannel5 = this.LL;
                    if (dataChannel5 != null) {
                        dataChannel5.SX0(C0TZY.class, Boolean.TRUE);
                        return;
                    }
                    return;
                }
                DataChannel dataChannel6 = this.LL;
                if (dataChannel6 == null || (l = (Long) dataChannel6.gg0(C751340Tdc.class)) == null) {
                    return;
                }
                long jLongValue = l.longValue();
                C1086960eOM.LL.getClass();
                C1086960eOM.LJIILLIIL(jLongValue);
            }

            @Override // X.InterfaceC1102810env
            public final void LIZIZ(C1099960ejK c1099960ejK, C945840aik c945840aik) {
                C0J1N c0j1n;
                Long l;
                this.LL = c1099960ejK.LIZJ;
                this.LLILLJJLI = c945840aik;
                c945840aik.setVisibility(8);
                DataChannel dataChannel2 = this.LL;
                if (dataChannel2 != null) {
                    dataChannel2.BQ2(c1099960ejK.LIZIZ, AdminPermissionUpdateChannel.class, new AwS586S0100000_7(c945840aik, 450));
                }
                C0KWU.LIZ = false;
                C0KWU.LIZLLL(this.LL, "toolbar_vote");
                DataChannel dataChannel3 = this.LL;
                if (dataChannel3 != null && Intrinsics.LJFF(dataChannel3.gg0(C0TZY.class), Boolean.TRUE)) {
                    DataChannel dataChannel4 = this.LL;
                    if (dataChannel4 != null) {
                        dataChannel4.SX0(C0TZY.class, Boolean.FALSE);
                    }
                    DataChannel dataChannel5 = this.LL;
                    if (dataChannel5 != null && (l = (Long) dataChannel5.gg0(C751340Tdc.class)) != null) {
                        long jLongValue = l.longValue();
                        C1086960eOM.LL.getClass();
                        C1086960eOM.LJIILLIIL(jLongValue);
                    }
                }
                DataChannel dataChannel6 = this.LL;
                LifecycleOwner lifecycleOwner = c1099960ejK.LIZIZ;
                if (dataChannel6 != null) {
                    long jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel6);
                    C480460Ism.LIZ().getClass();
                    C11NZ c11nzLJIILJJIL = C510380Jzw.LJIILJJIL(((SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class)).getEmotePollEligibility(jLJJLIIIJ).LJL(C11S5.LIZ()).LJIILIIL(new C0UO0()), EnumC510330Jzr.GENERAL, C494680Jac.class.getSimpleName(), "emote_poll/eligibility", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353));
                    if (c11nzLJIILJJIL != null && (c0j1n = (C0J1N) c11nzLJIILJJIL.LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(lifecycleOwner))) != null) {
                        c0j1n.LIZ(new AfS176S0100000_7(dataChannel6, 261), new C09JN() { // from class: X.00ow
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                C1C7U.LIZ("SubscribeTool@e35a.updateEmotePollEligibility$2");
                                C20441214yg.LJII((Throwable) obj);
                                C1C7U.LIZIZ("SubscribeTool@e35a.updateEmotePollEligibility$2");
                            }
                        });
                    }
                }
            }
        }, false, 4, null);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final List<C0U4S> gT(String str) {
        CopyOnWriteArrayList<C0U4S> copyOnWriteArrayList = this.LLJI.get(str);
        if (copyOnWriteArrayList != null) {
            return Collections.unmodifiableList(copyOnWriteArrayList);
        }
        return null;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void hG(String str) {
        C752740Tfs.LIZ.getClass();
        C752740Tfs.LIZJ = str;
    }

    @Override // X.InterfaceC465240IMg
    public final void handleMsg(Message message) {
        Object messageObj;
        Object messageObj2;
        boolean z;
        BottomMessage bottomMessageJK0;
        int i;
        Text text;
        long j;
        PunishEventInfo punishEventInfo;
        int i2;
        String str;
        Integer numValueOf = null;
        if (message != null) {
            messageObj = HandlerHook.getMessageObj(message.obj);
        } else {
            messageObj = null;
        }
        int i3 = 0;
        if (messageObj instanceof Room) {
            if (message != null) {
                messageObj2 = HandlerHook.getMessageObj(message.obj);
            } else {
                messageObj2 = null;
            }
            if (Room.isValid((Room) messageObj2)) {
                Room room = (Room) HandlerHook.getMessageObj(message.obj);
                IPublicScreenService iPublicScreenService = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
                WarningTag warningTag = room.warningTag;
                int i4 = 4;
                if (warningTag != null && warningTag.text != null) {
                    if (warningTag.tagSource != 1) {
                        i4 = 3;
                    }
                    if (warningTag.punishInfo != null) {
                        i4 = 6;
                    }
                    if (iPublicScreenService != null) {
                        long id = room.getId();
                        WarningTag warningTag2 = room.warningTag;
                        if (warningTag2 != null) {
                            text = warningTag2.text;
                            j = warningTag2.duration;
                            punishEventInfo = warningTag2.punishInfo;
                            i2 = warningTag2.style;
                            str = warningTag2.detailUrl;
                            numValueOf = Integer.valueOf(warningTag2.iconType);
                        } else {
                            text = null;
                            j = 0;
                            punishEventInfo = null;
                            i2 = 0;
                            str = null;
                        }
                        z = true;
                        iPublicScreenService.T60(id, text, j, punishEventInfo, i4, i2, str, numValueOf);
                    } else {
                        z = true;
                    }
                } else {
                    z = true;
                    if (iPublicScreenService != null && (bottomMessageJK0 = iPublicScreenService.jK0(room.getId())) != null && ((i = bottomMessageJK0.bizType) == 3 || i == 4)) {
                        iPublicScreenService.aD2(room.getId(), "");
                    }
                }
                Room room2 = (Room) HandlerHook.getMessageObj(message.obj);
                if (C500260Jjc.LJJIIJZLJL(room2)) {
                    C784440Upu.LIZ().LIZIZ(new C464500IJk(room2.getId(), false));
                } else {
                    C784440Upu.LIZ().LIZIZ(new C464500IJk(room2.getId(), z));
                }
            }
        }
        C01GW c01gw = C1088060eQ8.LIZ;
        if (message != null) {
            i3 = message.what;
        }
        C1088060eQ8.LIZ(i3);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService, X.InterfaceC1300440jwg
    public final int ip(long j) {
        Integer num;
        DataChannel dataChannel = this.LLIZ.get(j);
        if (dataChannel != null && (num = (Integer) dataChannel.gg0(C753760ThW.class)) != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void k7(LifecycleOwner lifecycleOwner) {
        C0KXB.LIZ.removeObservers(lifecycleOwner);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final boolean lw0(Room room) {
        if (room == null) {
            return false;
        }
        if (!C781520UlC.LJII(room) && !C781520UlC.LIZLLL(room) && !C781520UlC.LJIIL(room) && !C781520UlC.LJFF(room) && !C781520UlC.LJIIJ(room)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final InterfaceC1100800ekg mc1(DataChannel dataChannel) {
        final C1ADU c1aduWC;
        final String str;
        EventListener eventListener;
        InterfaceC1100800ekg interfaceC1100800ekg = (InterfaceC1100800ekg) dataChannel.gg0(C780860Uk8.class);
        if (interfaceC1100800ekg != null) {
            return interfaceC1100800ekg;
        }
        synchronized (this) {
            try {
                InterfaceC1100800ekg interfaceC1100800ekg2 = (InterfaceC1100800ekg) dataChannel.gg0(C780860Uk8.class);
                if (interfaceC1100800ekg2 == null) {
                    if (PerfUseApmFluencySetting.getEnable()) {
                        c1aduWC = ((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).Au2();
                    } else {
                        c1aduWC = ((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).wC();
                    }
                    Boolean bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
                    if (bool == null || !bool.booleanValue()) {
                        str = "live_watch";
                    } else {
                        str = "live_broadcast";
                    }
                    C1101060el6 c1101060el6V91 = ((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).V91(new InterfaceC1101080el8() { // from class: X.0el1
                        @Override // X.InterfaceC1101080el8
                        public final void LIZ() {
                        }

                        @Override // X.InterfaceC1101080el8
                        public final InterfaceC1100960ekw LIZIZ() {
                            return null;
                        }

                        @Override // X.InterfaceC1101080el8
                        public final void LIZLLL() {
                        }

                        @Override // X.InterfaceC1101080el8
                        public final InterfaceC1100950ekv LJ() {
                            return null;
                        }

                        @Override // X.InterfaceC1101080el8
                        public final InterfaceC1100980eky LJFF() {
                            return null;
                        }

                        @Override // X.InterfaceC1101080el8
                        public final void message() {
                        }

                        @Override // X.InterfaceC1101080el8
                        public final C1ADU LIZJ() {
                            return c1aduWC;
                        }

                        @Override // X.InterfaceC1101080el8
                        public final String scene() {
                            return str;
                        }

                        @Override // X.InterfaceC1101080el8
                        public final C1101110elB LJI(InterfaceC1100800ekg interfaceC1100800ekg3) {
                            InterfaceC1101080el8.LIZ.getClass();
                            AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(interfaceC1100800ekg3, 9);
                            RealtimePerfScoreSettings realtimePerfScoreSettings = RealtimePerfScoreSettings.INSTANCE;
                            return new C1101110elB(new C1101090el9[]{new C1101090el9("fps", awS561S0100000_17, realtimePerfScoreSettings.fpsConfig()), new C1101090el9("drop3", new AwS561S0100000_17(interfaceC1100800ekg3, 10), realtimePerfScoreSettings.drop3Config()), new C1101090el9("battery_temp", new AwS561S0100000_17(interfaceC1100800ekg3, 11), realtimePerfScoreSettings.temperatureConfig()), new C1101090el9("cpu_speed", new AwS561S0100000_17(interfaceC1100800ekg3, 12), realtimePerfScoreSettings.cpuSpeedConfig()), new C1101090el9("cpu_rate", new AwS561S0100000_17(interfaceC1100800ekg3, 13), realtimePerfScoreSettings.cpuRateConfig())}, realtimePerfScoreSettings.levelConfig(), realtimePerfScoreSettings.maxScore());
                        }
                    });
                    Long l = (Long) dataChannel.gg0(C751340Tdc.class);
                    if (l != null) {
                        IMessageManager iMessageManager = ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).get(l.longValue());
                        InterfaceC1100990ekz interfaceC1100990ekz = null;
                        if (c1101060el6V91 != null) {
                            interfaceC1100990ekz = c1101060el6V91.LJFF;
                        }
                        if ((interfaceC1100990ekz instanceof EventListener) && (eventListener = (EventListener) interfaceC1100990ekz) != null && iMessageManager != null) {
                            iMessageManager.addEventListener(eventListener);
                        }
                    } else {
                        Map<String, Object> map = C1338270kvh.LIZ;
                    }
                    dataChannel.SX0(C780860Uk8.class, c1101060el6V91);
                    return c1101060el6V91;
                }
                return interfaceC1100800ekg2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final boolean o52(DataChannel dataChannel) {
        C0JFN.LIZ.getClass();
        return C0JFN.LJFF(dataChannel);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void onLocaleChanged(Locale locale) {
        C1119850fFP c1119850fFP = C011Z.LIZ;
        C783420UoG c783420UoG = new C783420UoG();
        c1119850fFP.getClass();
        C1119850fFP.LJJIFFI(R.drawable.eqn, c783420UoG);
        C1119850fFP.LJJIFFI(R.drawable.exj, new C783420UoG());
        C1119850fFP.LJJIFFI(R.drawable.eql, new C783420UoG());
        C1119850fFP.LJJIFFI(R.drawable.eql, new C783420UoG());
        C1119850fFP.LJJIFFI(R.drawable.eup, new C783420UoG());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        BaseMessage baseMessage;
        CommonMessageData commonMessageData;
        long j;
        DataChannel dataChannel;
        Room room;
        DataChannel dataChannel2;
        long id;
        boolean z;
        FollowInfo followInfo;
        InterfaceC1085480eLy interfaceC1085480eLyO41;
        if ((iMessage instanceof AbstractC1136060ffY) && (baseMessage = (BaseMessage) iMessage) != null && (commonMessageData = baseMessage.baseMessage) != null && (dataChannel = this.LLIZ.get((j = commonMessageData.roomId))) != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            if (iMessage instanceof RoomVerifyMessage) {
                int i = ((RoomVerifyMessage) iMessage).verifyAction;
                if (i == 32) {
                    RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
                    if (roomAuthStatus != null) {
                        roomAuthStatus.setUserCountDisplayState(1);
                    }
                    ArrayList<InterfaceC781410Ul1> arrayList = this.LLILZLL.get(j);
                    if (arrayList != null) {
                        for (InterfaceC781410Ul1 interfaceC781410Ul1 : arrayList) {
                            Ee1(room);
                            interfaceC781410Ul1.LJJLIIIJLJLI();
                        }
                        return;
                    }
                    return;
                }
                if (i == 33) {
                    RoomAuthStatus roomAuthStatus2 = room.getRoomAuthStatus();
                    if (roomAuthStatus2 != null) {
                        roomAuthStatus2.setUserCountDisplayState(2);
                    }
                    ArrayList<InterfaceC781410Ul1> arrayList2 = this.LLILZLL.get(j);
                    if (arrayList2 != null) {
                        for (InterfaceC781410Ul1 interfaceC781410Ul12 : arrayList2) {
                            Ee1(room);
                            interfaceC781410Ul12.LJJLIIIJLJLI();
                        }
                        return;
                    }
                    return;
                }
                if (i == 36) {
                    RoomAuthStatus roomAuthStatus3 = room.getRoomAuthStatus();
                    if (roomAuthStatus3 != null) {
                        roomAuthStatus3.chatSubOnly = true;
                    }
                    DataChannel dataChannel3 = this.LLIZ.get(j);
                    if (dataChannel3 != null) {
                        dataChannel3.FQ2(SubscribeSubOnlyChatChangeEvent.class);
                        return;
                    }
                    return;
                }
                if (i == 37) {
                    RoomAuthStatus roomAuthStatus4 = room.getRoomAuthStatus();
                    if (roomAuthStatus4 != null) {
                        roomAuthStatus4.chatSubOnly = false;
                    }
                    DataChannel dataChannel4 = this.LLIZ.get(j);
                    if (dataChannel4 != null) {
                        dataChannel4.FQ2(SubscribeSubOnlyChatChangeEvent.class);
                        return;
                    }
                    return;
                }
                return;
            }
            if (iMessage instanceof SocialMessage) {
                SocialMessage socialMessage = (SocialMessage) iMessage;
                if (socialMessage.action == 3) {
                    User user = socialMessage.user;
                    if (user != null && user.getId() != UserService.getInstance().user().getCurrentUserId() && (interfaceC1085480eLyO41 = ((IBarrageService) C1161920gLG.LIZJ(IBarrageService.class)).O41(j)) != null) {
                        interfaceC1085480eLyO41.LJIIZILJ();
                        return;
                    }
                    return;
                }
                SocialMessage socialMessage2 = (SocialMessage) iMessage;
                if (socialMessage2.action == 4) {
                    boolean zLJFF = Intrinsics.LJFF(dataChannel.gg0(UserIsAnchorChannel.class), Boolean.TRUE);
                    User user2 = socialMessage2.user;
                    long followStatus = 0;
                    if (user2 != null) {
                        id = user2.getId();
                    } else {
                        id = 0;
                    }
                    if (id == UserService.getInstance().user().getCurrentUserId()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (zLJFF) {
                        if (!C1096600edu.LIZ() || !LiveRepostConsumeConfig.INSTANCE.config().repostConsumeEnable || !LiveRepostConsumeConfig.INSTANCE.config().consumeAnchorGroupConfig.anchorEnable || !LiveRepostConsumeConfig.INSTANCE.config().consumeAnchorGroupConfig.anchorLikeIcon) {
                            return;
                        }
                    } else if (z) {
                        if (!C1096600edu.LIZIZ() || !LiveRepostProduceConfig.INSTANCE.config().selfLikeIconShow) {
                            return;
                        }
                    } else if (!C1096600edu.LIZ() || !LiveRepostConsumeConfig.INSTANCE.config().repostConsumeEnable || !LiveRepostConsumeConfig.INSTANCE.config().consumeAudienceGroupConfig.audienceEnable || !LiveRepostConsumeConfig.INSTANCE.config().consumeAudienceGroupConfig.othersLikeIcon) {
                        return;
                    }
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_repost_icon_likestream_show");
                    User owner = room.getOwner();
                    if (owner != null && (followInfo = owner.getFollowInfo()) != null) {
                        followStatus = followInfo.getFollowStatus();
                    }
                    c474500IjALIZ.LJJII(String.valueOf(followStatus), "follow_status");
                    c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
                    c474500IjALIZ.LJIJJLI(dataChannel);
                    c474500IjALIZ.LIZ();
                    InterfaceC1085480eLy interfaceC1085480eLyO412 = ((IBarrageService) C1161920gLG.LIZJ(IBarrageService.class)).O41(j);
                    if (interfaceC1085480eLyO412 != null) {
                        interfaceC1085480eLyO412.LJIJJLI();
                        return;
                    }
                    return;
                }
            }
            if (iMessage instanceof RoomUserSeqMessage) {
                RoomUserSeqMessage roomUserSeqMessage = (RoomUserSeqMessage) iMessage;
                if (this.LLJIJIL) {
                    DataChannel dataChannel5 = this.LLIZ.get(j);
                    if ((dataChannel5 == null || !Intrinsics.LJFF(dataChannel5.gg0(UserIsAnchorChannel.class), Boolean.TRUE)) && (dataChannel2 = this.LLIZ.get(j)) != null) {
                        dataChannel2.zW(AudienceCountChannel.class, Integer.valueOf((int) roomUserSeqMessage.mTotal));
                        return;
                    }
                    return;
                }
                return;
            }
            if ((iMessage instanceof MemberMessage) && LIZJ(null, dataChannel)) {
                int i2 = ((MemberMessage) iMessage).action;
                if (i2 != 39) {
                    if (i2 != 40) {
                        switch (i2) {
                            case 30:
                                room.getRoomAuthStatus().enableChatL2 = true;
                                break;
                            case 31:
                                room.getRoomAuthStatus().enableChatL2 = false;
                                break;
                            case 32:
                                room.getRoomAuthStatus().commentFlaggedSwitch = true;
                                break;
                            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                room.getRoomAuthStatus().commentFlaggedSwitch = false;
                                break;
                            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                                room.getRoomAuthStatus().commentFlaggedReviewSwitch = true;
                                break;
                            case 35:
                                room.getRoomAuthStatus().commentFlaggedReviewSwitch = false;
                                break;
                        }
                        return;
                    }
                    room.getRoomAuthStatus().spamcomments = false;
                    return;
                }
                room.getRoomAuthStatus().spamcomments = true;
            }
        }
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void pO1(DataChannel dataChannel) {
        Map<String, LiveMessagePlatformBubbleConfig> map;
        C1096480edi c1096480edi = (C1096480edi) ((LinkedHashMap) this.LLILZ).get(dataChannel);
        if (c1096480edi != null && c1096480edi.LIZIZ) {
            return;
        }
        LinkedList<C09AJ<Unit>> linkedList = C782850UnL.LIZ;
        MessageNotifyConfig messageNotifyConfigLIZ = C782850UnL.LIZ();
        if (messageNotifyConfigLIZ != null && (map = messageNotifyConfigLIZ.bubbleConfig) != null) {
            LJFF(dataChannel, map);
        } else {
            if (this.LLILLL != null) {
                return;
            }
            this.LLILLL = (C11JF) C782850UnL.LJ().LJJLL(new AfS186S0100000_17(this, 3), new C09JN() { // from class: X.00Lz
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("RoomFunctionService@938f.registerStrategyHandler$2$2");
                    C1C7U.LIZIZ("RoomFunctionService@938f.registerStrategyHandler$2$2");
                }
            });
        }
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService, X.InterfaceC1300440jwg
    public final int v5(long j) {
        Integer num;
        DataChannel dataChannel = this.LLIZ.get(j);
        if (dataChannel != null && (num = (Integer) dataChannel.gg0(C753730ThT.class)) != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final boolean vu1(Room room) {
        String str;
        ActivityToggleInfo activityToggleInfo;
        if (room != null && (activityToggleInfo = room.activityToggleInfo) != null) {
            str = activityToggleInfo.activityToggleText;
        } else {
            str = null;
        }
        if ((str == null || str.length() == 0) && (!AZ1(room) || !dS(room))) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final boolean ym2(DataChannel dataChannel) {
        QuestionEx questionEx;
        Question question;
        if (dataChannel != null && (questionEx = (QuestionEx) dataChannel.gg0(CurrentQuestionChannel.class)) != null && (question = questionEx.question) != null && question.questionId > 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void Dp2(Fragment fragment, String str) {
        long jLongValue;
        Boolean boolValueOf;
        C0JFN c0jfn = C0JFN.LIZ;
        if (str == null) {
            return;
        }
        c0jfn.getClass();
        DataChannel dataChannelLJ = C475510Ikn.LJ(fragment);
        if (dataChannelLJ != null) {
            Long lLJJI = C0JFN.LJJI(dataChannelLJ);
            long jLongValue2 = 0;
            if (lLJJI != null) {
                jLongValue = lLJJI.longValue();
            } else {
                jLongValue = 0;
            }
            Long l = (Long) dataChannelLJ.gg0(DrawGuessRoundIdChannel.class);
            if (l != null) {
                long jLongValue3 = l.longValue();
                if (jLongValue3 > 0) {
                    HashMap map = (HashMap) dataChannelLJ.gg0(DrawGuessCorrectsRoundsChannel.class);
                    if (map != null) {
                        boolValueOf = Boolean.valueOf(map.containsKey(Long.valueOf(jLongValue3)));
                    } else {
                        boolValueOf = null;
                    }
                    if (!C500260Jjc.LJJJI(boolValueOf)) {
                        DrawGuessApi drawGuessApi = (DrawGuessApi) C482260Ivg.LIZJ(DrawGuessApi.class);
                        long jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannelLJ);
                        Long l2 = (Long) dataChannelLJ.gg0(DrawGuessRoundIdChannel.class);
                        if (l2 != null) {
                            jLongValue2 = l2.longValue();
                        }
                        drawGuessApi.guessWord(jLJJLIIIJ, jLongValue2, str).LJIILIIL(new C0UO0()).LJIILIIL(C0J1R.LIZIZ(fragment)).LJJLL(new AfS3S0100200_7(jLongValue3, jLongValue, dataChannelLJ, 1), new C09JN() { // from class: X.00KI
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                C1C7U.LIZ("DrawGuessUtil@bdeb.guessWord$2");
                                C766270U4b.LIZLLL(2131854909);
                                C1C7U.LIZIZ("DrawGuessUtil@bdeb.guessWord$2");
                            }
                        });
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void Jz(CommentSwitchSettings commentSwitchSettings, DataChannel dataChannel) {
        C758980Tpw c758980Tpw;
        if (dataChannel != null && (c758980Tpw = (C758980Tpw) dataChannel.gg0(C751800TeM.class)) != null) {
            c758980Tpw.LIZ(commentSwitchSettings);
        }
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void KC2(long j, C0IKN c0ikn) {
        this.LLIZLLLIL.put(j, c0ikn);
        ip(j);
        c0ikn.LIZ();
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void L21(long j, InterfaceC781410Ul1 interfaceC781410Ul1) {
        ArrayList<InterfaceC781410Ul1> arrayList = this.LLILZLL.get(j);
        if (arrayList != null) {
            arrayList.remove(interfaceC781410Ul1);
        }
    }

    public final boolean LIZJ(Room room, DataChannel dataChannel) {
        int i;
        if (this.LLJILJIL == -1) {
            if (room == null) {
                if (dataChannel != null) {
                    room = (Room) dataChannel.gg0(RoomChannel.class);
                } else {
                    room = null;
                }
            }
            if (!C500260Jjc.LJIIZILJ(dataChannel) && !C488020JBw.LIZ(room)) {
                i = 0;
            } else {
                i = 1;
            }
            this.LLJILJIL = i;
        }
        if (this.LLJILJIL != 1 || !C01C5.LIZ(dataChannel)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(com.bytedance.ies.sdk.datachannel.DataChannel r18, java.util.Map<java.lang.String, com.bytedance.android.livesdk.livesetting.model.LiveMessagePlatformBubbleConfig> r19) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.function.RoomFunctionService.LJFF(com.bytedance.ies.sdk.datachannel.DataChannel, java.util.Map):void");
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void LLLF(Room room, DataChannel dataChannel) {
        IMessageManager iMessageManager;
        IMessageManager iMessageManager2;
        if (room != null) {
            this.LLIZ.remove(room.getId());
            this.LLILZLL.remove(room.getId());
            Handler handler = C1088060eQ8.LJFF;
            if (handler != null) {
                handler.removeMessages(291);
            }
            C1088060eQ8.LIZ(291);
            InterfaceC1085480eLy interfaceC1085480eLyO41 = ((IBarrageService) C1161920gLG.LIZJ(IBarrageService.class)).O41(C1088060eQ8.LJ);
            if (interfaceC1085480eLyO41 != null) {
                interfaceC1085480eLyO41.LJIJ((C1088070eQ9) C1088060eQ8.LIZ.getValue());
            }
            C1088060eQ8.LIZJ = null;
            C1088060eQ8.LJFF = null;
            C1096420edc c1096420edc = C1096420edc.LL;
            long id = room.getId();
            LongSparseArray<DataChannel> longSparseArray = C1096420edc.LLILLJJLI;
            DataChannel dataChannel2 = longSparseArray.get(id);
            if (dataChannel2 != null && (iMessageManager2 = (IMessageManager) dataChannel2.gg0(C776250Uch.class)) != null) {
                iMessageManager2.removeMessageListener(C1096420edc.LLILLL.get(id));
            }
            LongSparseArray<CopyOnWriteArrayList<InterfaceC1096500edk>> longSparseArray2 = C1096420edc.LLILZIL;
            longSparseArray2.remove(id);
            C1096420edc.LLIZ.remove(id);
            C1096420edc.LLILZLL.remove(id);
            C1096420edc.LLILLL.remove(id);
            longSparseArray.remove(id);
            C1096420edc.LLILZ.remove(id);
            longSparseArray2.remove(id);
            C1096420edc.LLJ.remove(id);
        }
        if (dataChannel != null) {
            iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
            if (iMessageManager != null) {
                iMessageManager.removeMessageListener(C001A.ROOM_VERIFY.getIntType(), this);
                iMessageManager.removeMessageListener(C001A.SOCIAL.getIntType(), this);
            }
        } else {
            iMessageManager = null;
        }
        C1110390f09 c1110390f09 = C1110390f09.LIZ;
        ArrayList<C1110420f0C<String>> arrayList = C1110390f09.LJII;
        arrayList.size();
        ArrayList<C1110410f0B<Function1<Map<EmoteModel, ? extends Drawable>, Unit>>> arrayList2 = C1110390f09.LJIIIIZZ;
        arrayList2.size();
        ArrayList<C1110410f0B<Function1<List<? extends SpannableStringBuilder>, Unit>>> arrayList3 = C1110390f09.LJIIIZ;
        arrayList3.size();
        DataChannelGlobal.LLILZ.zQ2(c1110390f09);
        C11NJ c11nj = C0KBS.LJIJI;
        if (c11nj != null && !c11nj.LLILLJJLI) {
            c11nj.LJ();
        }
        C0KBS.LJIJI = null;
        LivePublicScreenEmoteLoadResilienceSetting livePublicScreenEmoteLoadResilienceSetting = LivePublicScreenEmoteLoadResilienceSetting.INSTANCE;
        if (livePublicScreenEmoteLoadResilienceSetting.getValue()) {
            BPEAHandler bPEAHandler = C0KBS.LJIJJ;
            if (bPEAHandler != null) {
                bPEAHandler.removeCallbacksAndMessages(null);
            }
            C0KBS.LJIJJ = null;
        }
        ((ArrayList) C0KBS.LJ).clear();
        ((LinkedHashMap) C0KBS.LJFF).clear();
        C0KBS.LIZLLL.clear();
        C0KBS.LJI.clear();
        C0KBS.LJIIJ.clear();
        C0KBS.LJIIIIZZ.clear();
        C0KBS.LJIILIIL.clear();
        ((ArrayList) C0KBS.LJIILJJIL).clear();
        ((ArrayList) C0KBS.LJIILL).clear();
        C0KBS.LJIILLIIL = null;
        C11JF c11jf = C0KBS.LJIIJJI;
        if (c11jf != null && (!c11jf.isDisposed())) {
            c11jf.dispose();
        }
        C0KBS.LJIIJJI = null;
        C0KBS.LJIIZILJ = false;
        C1110390f09.LJFF.clear();
        C1110390f09.LJ.clear();
        arrayList.clear();
        arrayList2.clear();
        arrayList3.clear();
        if (livePublicScreenEmoteLoadResilienceSetting.getValue()) {
            C1110390f09.LJIIJ.clear();
            C1110390f09.LJIIJJI.clear();
            C1110390f09.LJIIL.clear();
        }
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest() && (C1096290edP.LIZIZ || LiveEffectNotifyMockEnabledSetting.enable())) {
            if (iMessageManager != null) {
                iMessageManager.removeMessageListener((OnIMMessageListener) C1096290edP.LIZJ.getValue());
            }
            C1096290edP.LIZ = null;
        }
        this.LLJILJIL = -1;
        this.LLILZ.remove(dataChannel);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void MO1(long j, DataChannel dataChannel) {
        if (dataChannel != null) {
            dataChannel.SX0(C751800TeM.class, new C758980Tpw(j, dataChannel));
        }
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void N92(long j, InterfaceC781410Ul1 interfaceC781410Ul1) {
        ArrayList<InterfaceC781410Ul1> arrayList = this.LLILZLL.get(j);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.LLILZLL.put(j, arrayList);
        }
        arrayList.add(interfaceC781410Ul1);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void OW(DataChannel dataChannel, boolean z) {
        HashMap map;
        String str;
        HashMap map2;
        long jLongValue;
        String str2;
        if (dataChannel == null || (map = (HashMap) dataChannel.gg0(DrawGuessCorrectsRoundsChannel.class)) == null) {
            map = new HashMap();
        }
        Long lLJIIL = C0JFO.LJIIL(dataChannel);
        if (lLJIIL != null) {
            if (map.containsKey(Long.valueOf(lLJIIL.longValue()))) {
                str = "right";
            } else {
                str = "wrong";
            }
            if (dataChannel == null || (map2 = (HashMap) dataChannel.gg0(DrawGuessRoundStartTimeChannel.class)) == null) {
                map2 = new HashMap();
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            Long l = (Long) map2.get(C0JFO.LJIIL(dataChannel));
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_audience_pictionary_round_end");
            C0JFO.LIZIZ(c474500IjALIZ, dataChannel);
            C0JFO.LIZ(c474500IjALIZ);
            c474500IjALIZ.LJJII(str, "result");
            c474500IjALIZ.LJJII(Long.valueOf(Math.min(jUptimeMillis - jLongValue, 120000L)), "time");
            if (z) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(str2, "before_end");
            c474500IjALIZ.LIZ();
            if (dataChannel != null) {
                dataChannel.zW(DrawGuessHasLoggedRoundEndChannel.class, Boolean.TRUE);
            }
        }
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final Object YK0(DataChannel dataChannel, InterfaceC1364105Vn<? super ContentDisclosureSettings> interfaceC1364105Vn) {
        C758980Tpw c758980Tpw;
        if (dataChannel != null && (c758980Tpw = (C758980Tpw) dataChannel.gg0(C751800TeM.class)) != null) {
            return c758980Tpw.LJ(interfaceC1364105Vn);
        }
        return null;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final AbstractC1103160eoU Yd1(DataChannel dataChannel, String str) {
        C1096480edi c1096480edi = (C1096480edi) ((LinkedHashMap) this.LLILZ).get(dataChannel);
        if (c1096480edi != null) {
            return (AbstractC1103160eoU) ((Map) c1096480edi.LIZ.getValue()).get(str);
        }
        return null;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final Object Z32(DataChannel dataChannel, InterfaceC1364105Vn<? super CommentSwitchSettings> interfaceC1364105Vn) {
        return C751360Tde.LIZ.LIZ(dataChannel, interfaceC1364105Vn);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final Object Zq0(DataChannel dataChannel, InterfaceC1364105Vn<? super LocationIconDisplaySettings> interfaceC1364105Vn) {
        C758980Tpw c758980Tpw;
        if (dataChannel != null && (c758980Tpw = (C758980Tpw) dataChannel.gg0(C751800TeM.class)) != null) {
            return c758980Tpw.LJII(interfaceC1364105Vn);
        }
        return null;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void c00(C19EG c19eg, DataChannel dataChannel) {
        C760370TsB c760370TsBLIZ = C0KYL.LIZ(TtliveQuickGiftVoteHostSchemaSetting.INSTANCE.getValue());
        C0KYK.LIZJ(c760370TsBLIZ, dataChannel);
        C0KYK.LIZIZ(c19eg, dataChannel, c760370TsBLIZ.LIZ().toString());
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final C237000vo cb(LifecycleOwner lifecycleOwner, Function1 function1) {
        C237000vo c237000vo = new C237000vo(C0KXB.LIZ.getValue(), function1);
        C0KXB.LIZ.observe(lifecycleOwner, c237000vo);
        return c237000vo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (r14 == null) goto L12;
     */
    @Override // com.bytedance.android.live.function.IRoomFunctionService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean db0(com.bytedance.android.livesdkapi.depend.model.live.Room r13, com.bytedance.ies.sdk.datachannel.DataChannel r14) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.function.RoomFunctionService.db0(com.bytedance.android.livesdkapi.depend.model.live.Room, com.bytedance.ies.sdk.datachannel.DataChannel):boolean");
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void fZ0(DataChannel dataChannel, boolean z) {
        C0JFO.LJ(dataChannel, z);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void ff0(C19EG c19eg, DataChannel dataChannel) {
        long jLongValue;
        String value;
        Long l;
        C1086960eOM c1086960eOM = C1086960eOM.LL;
        if (dataChannel != null && (l = (Long) dataChannel.gg0(C751340Tdc.class)) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (c1086960eOM.LJIIIZ(jLongValue)) {
            value = TtliveCustomGiftVoteHostSchemaOnGoingSetting.INSTANCE.getValue();
        } else {
            value = TtliveCustomGiftVoteHostSchemaSetting.INSTANCE.getValue();
        }
        C760370TsB c760370TsBLIZ = C0KYL.LIZ(value);
        C0KYK.LIZJ(c760370TsBLIZ, dataChannel);
        C0KYK.LIZIZ(c19eg, dataChannel, c760370TsBLIZ.LIZ().toString());
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void fs0(C19EG c19eg, DataChannel dataChannel) {
        boolean z;
        String value;
        Room room;
        String string;
        String string2;
        String string3;
        Boolean boolValueOf;
        String string4;
        PollConf pollConf;
        PollCountLimit pollCountLimit;
        PollConf pollConf2;
        PollCountLimit pollCountLimit2;
        Hashtag hashtag;
        RoomAuthStatus roomAuthStatus;
        PollConf pollConf3;
        RoomAuthStatus roomAuthStatus2;
        Long l;
        Room room2;
        PollConf pollConf4;
        if (dataChannel != null && (room2 = (Room) dataChannel.gg0(RoomChannel.class)) != null && (pollConf4 = room2.pollConf) != null && pollConf4.pollTemplateOptimizeGroup == 2) {
            z = true;
        } else {
            z = false;
        }
        C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.h6;
        if (!c20337914i1.LIZIZ().booleanValue() && z) {
            c20337914i1.LJFF(Boolean.TRUE);
            value = LiveBroadcastCustomPollOptGuideUrl.INSTANCE.getValue();
        } else {
            value = LiveBroadcastCustomPollOptUrl.INSTANCE.getValue();
        }
        Boolean boolValueOf2 = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        C760370TsB c760370TsBLIZ = C0KYL.LIZ(value);
        C0KYK.LIZ(c760370TsBLIZ, dataChannel);
        c760370TsBLIZ.LJJIFFI("enter_from", "select_vote_panel");
        String str = CardStruct.IStatusCode.DEFAULT;
        if (room == null || (roomAuthStatus2 = room.getRoomAuthStatus()) == null || (l = roomAuthStatus2.customizablepoll) == null || (string = l.toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        c760370TsBLIZ.LJJIFFI("customizable_poll_auth", string);
        if (room == null || (pollConf3 = room.pollConf) == null || (string2 = Long.valueOf(pollConf3.pollTemplateOptimizeGroup).toString()) == null) {
            string2 = CardStruct.IStatusCode.DEFAULT;
        }
        c760370TsBLIZ.LJJIFFI("poll_template_optimize_group", string2);
        if (room == null || (roomAuthStatus = room.getRoomAuthStatus()) == null || (string3 = Long.valueOf(roomAuthStatus.customizablegiftpoll).toString()) == null) {
            string3 = CardStruct.IStatusCode.DEFAULT;
        }
        c760370TsBLIZ.LJJIFFI("customizable_gift_vote_auth", string3);
        if (room != null && (hashtag = room.hashtag) != null) {
            boolValueOf = Boolean.valueOf(hashtag.isUseGameTagAsHashTag());
        } else {
            boolValueOf = null;
        }
        c760370TsBLIZ.LJJIFFI("hashtag_is_game", String.valueOf(C500260Jjc.LJJJI(boolValueOf) ? 1 : 0));
        if (room != null && (pollConf2 = room.pollConf) != null && (pollCountLimit2 = pollConf2.giftPollLimit) != null) {
            boolValueOf2 = Boolean.valueOf(pollCountLimit2.unlimited);
        }
        if (C500260Jjc.LJJIFFI(boolValueOf2)) {
            if (room != null && (pollConf = room.pollConf) != null && (pollCountLimit = pollConf.giftPollLimit) != null && (string4 = Long.valueOf(pollCountLimit.maxPollCount).toString()) != null) {
            }
            c760370TsBLIZ.LJJIFFI("gift_vote_limit_count", str);
            C0KYK.LIZIZ(c19eg, dataChannel, c760370TsBLIZ.LIZ().toString());
        }
        string4 = CardStruct.IStatusCode.DEFAULT;
        str = string4;
        c760370TsBLIZ.LJJIFFI("gift_vote_limit_count", str);
        C0KYK.LIZIZ(c19eg, dataChannel, c760370TsBLIZ.LIZ().toString());
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void iv0(C498340JgW c498340JgW, FragmentManager fragmentManager) {
        LiveProfileManageDialog liveProfileManageDialog = new LiveProfileManageDialog();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "report_arg", c498340JgW);
        bundle.putBoolean("arg_msg_is_vertical", true);
        liveProfileManageDialog.setArguments(bundle);
        liveProfileManageDialog.show(fragmentManager, "LiveProfileManageDialog");
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final ToolWrapperDialog j32(Function0 function0, Function0 function02) {
        if (Intrinsics.LJFF("poll", "poll")) {
            return new ToolWrapperDialog(function0, function02);
        }
        return null;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void jE0(long j, C0IKN c0ikn) {
        this.LLJ.put(j, c0ikn);
        v5(j);
        c0ikn.LIZ();
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final Object p20(DataChannel dataChannel, InterfaceC1364105Vn<? super AgeRestrictionSettings> interfaceC1364105Vn) {
        C758980Tpw c758980Tpw;
        if (dataChannel != null && (c758980Tpw = (C758980Tpw) dataChannel.gg0(C751800TeM.class)) != null) {
            return c758980Tpw.LIZIZ(interfaceC1364105Vn);
        }
        return null;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void qg1(DataChannel dataChannel, String str) {
        Map map;
        C1096480edi c1096480edi = (C1096480edi) ((LinkedHashMap) this.LLILZ).get(dataChannel);
        if (c1096480edi != null && (map = (Map) c1096480edi.LIZ.getValue()) != null) {
            map.remove(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
    @Override // com.bytedance.android.live.function.IRoomFunctionService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean tb(android.content.Context r14, com.bytedance.android.livesdkapi.depend.model.live.Room r15) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.function.RoomFunctionService.tb(android.content.Context, com.bytedance.android.livesdkapi.depend.model.live.Room):boolean");
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final LiveNormalPollEffectWidget ye0(boolean z, RecyclableWidgetManager recyclableWidgetManager) {
        if (z) {
            return (LiveNormalPollEffectWidget) recyclableWidgetManager.getRecyclableWidgetFromCacheOrNew(LiveNormalPollEffectWidget.class, new Integer[]{257}, new Function0<LiveRecyclableWidget>() { // from class: X.0eOD
                public final /* synthetic */ int LL = 257;

                @Override // kotlin.jvm.functions.Function0
                public final LiveRecyclableWidget invoke() {
                    return new LiveNormalPollEffectWidget(this.LL);
                }
            });
        }
        return new LiveNormalPollEffectWidget(257);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object LIZ(com.bytedance.android.livesdk.function.RoomFunctionService r5, com.bytedance.ies.sdk.datachannel.DataChannel r6, X.InterfaceC1364105Vn<? super java.lang.Integer> r7) {
        /*
            boolean r0 = r7 instanceof X.C1096430edd
            if (r0 == 0) goto L47
            r4 = r7
            X.0edd r4 = (X.C1096430edd) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L4d
            X.C155000ia.LIZIZ(r3)
        L22:
            java.lang.Number r3 = (java.lang.Number) r3
            int r0 = r3.intValue()
        L28:
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            return r0
        L2d:
            X.C155000ia.LIZIZ(r3)
            if (r6 == 0) goto L45
            java.lang.Class<X.0TeM> r0 = X.C751800TeM.class
            java.lang.Object r0 = r6.gg0(r0)
            X.0Tpw r0 = (X.C758980Tpw) r0
            if (r0 == 0) goto L45
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LIZJ(r4)
            if (r3 != r2) goto L22
            return r2
        L45:
            r0 = -1
            goto L28
        L47:
            X.0edd r4 = new X.0edd
            r4.<init>(r5, r7)
            goto L12
        L4d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.function.RoomFunctionService.LIZ(com.bytedance.android.livesdk.function.RoomFunctionService, com.bytedance.ies.sdk.datachannel.DataChannel, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object LIZIZ(com.bytedance.android.livesdk.function.RoomFunctionService r5, com.bytedance.ies.sdk.datachannel.DataChannel r6, X.InterfaceC1364105Vn<? super java.lang.Boolean> r7) {
        /*
            boolean r0 = r7 instanceof X.C1096440ede
            if (r0 == 0) goto L54
            r4 = r7
            X.0ede r4 = (X.C1096440ede) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L54
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L3c
            if (r0 != r1) goto L5a
            X.C155000ia.LIZIZ(r3)
        L22:
            X.0Tq9 r3 = (X.EnumC759110Tq9) r3
            if (r3 != 0) goto L28
        L26:
            X.0Tq9 r3 = X.EnumC759110Tq9.UNSET
        L28:
            java.lang.Boolean r2 = r3.toBooleanOrNull()
            if (r2 == 0) goto L3b
            boolean r0 = r2.booleanValue()
            X.0JT6<java.lang.Boolean> r1 = X.InterfaceC1106030et7.z9
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.LIZJ(r0)
        L3b:
            return r2
        L3c:
            X.C155000ia.LIZIZ(r3)
            if (r6 == 0) goto L26
            java.lang.Class<X.0TeM> r0 = X.C751800TeM.class
            java.lang.Object r0 = r6.gg0(r0)
            X.0Tpw r0 = (X.C758980Tpw) r0
            if (r0 == 0) goto L26
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LJI(r4)
            if (r3 != r2) goto L22
            return r2
        L54:
            X.0ede r4 = new X.0ede
            r4.<init>(r5, r7)
            goto L12
        L5a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.function.RoomFunctionService.LIZIZ(com.bytedance.android.livesdk.function.RoomFunctionService, com.bytedance.ies.sdk.datachannel.DataChannel, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object LJ(com.bytedance.android.livesdk.function.RoomFunctionService r5, com.bytedance.ies.sdk.datachannel.DataChannel r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            boolean r0 = r7 instanceof X.C1096450edf
            if (r0 == 0) goto L3d
            r4 = r7
            X.0edf r4 = (X.C1096450edf) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L25
            if (r0 != r1) goto L43
            X.C155000ia.LIZIZ(r3)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r3)
            if (r6 == 0) goto L22
            java.lang.Class<X.0TeM> r0 = X.C751800TeM.class
            java.lang.Object r0 = r6.gg0(r0)
            X.0Tpw r0 = (X.C758980Tpw) r0
            if (r0 == 0) goto L22
            r4.LLILLL = r1
            java.lang.Object r0 = r0.LJIIIIZZ(r4)
            if (r0 != r2) goto L22
            return r2
        L3d:
            X.0edf r4 = new X.0edf
            r4.<init>(r5, r7)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.function.RoomFunctionService.LJ(com.bytedance.android.livesdk.function.RoomFunctionService, com.bytedance.ies.sdk.datachannel.DataChannel, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final Object Av1(DataChannel dataChannel, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        EnumC759110Tq9 enumC759110Tq9;
        C758980Tpw c758980Tpw;
        InterfaceC1106030et7.z9.LIZJ(Boolean.valueOf(z));
        if (z) {
            enumC759110Tq9 = EnumC759110Tq9.ON;
        } else {
            enumC759110Tq9 = EnumC759110Tq9.OFF;
        }
        if (dataChannel != null && (c758980Tpw = (C758980Tpw) dataChannel.gg0(C751800TeM.class)) != null) {
            Object objLJIILL = c758980Tpw.LJIILL(enumC759110Tq9, interfaceC1364105Vn);
            C099R.LJFF();
            return objLJIILL;
        }
        return null;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final Object DY1(AgeRestrictionSettings ageRestrictionSettings, DataChannel dataChannel, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C758980Tpw c758980Tpw;
        if (dataChannel != null && (c758980Tpw = (C758980Tpw) dataChannel.gg0(C751800TeM.class)) != null) {
            Object objLJIIJ = c758980Tpw.LJIIJ(ageRestrictionSettings, interfaceC1364105Vn);
            if (objLJIIJ != C099R.LJFF()) {
                return Unit.LIZ;
            }
            return objLJIIJ;
        }
        return Unit.LIZ;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void Lz2(DataChannel dataChannel, String str, C1103170eoV c1103170eoV) {
        if (dataChannel == null) {
            return;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLILZ;
        Object c1096480edi = linkedHashMap.get(dataChannel);
        if (c1096480edi == null) {
            c1096480edi = new C1096480edi();
            linkedHashMap.put(dataChannel, c1096480edi);
        }
        ((Map) ((C1096480edi) c1096480edi).LIZ.getValue()).put(str, c1103170eoV);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final Object Rb0(CommentSwitchSettings commentSwitchSettings, DataChannel dataChannel, InterfaceC1364105Vn<? super C470590Icr<AnchorSettingsUpdateResponse>> interfaceC1364105Vn) {
        return C751360Tde.LIZ.LIZJ(commentSwitchSettings, dataChannel, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075 A[PHI: r3
      0x0075: PHI (r3v1 long) = (r3v0 long), (r3v3 long) binds: [B:24:0x0072, B:8:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.android.live.function.IRoomFunctionService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void TU(X.C19EG r11, com.bytedance.ies.sdk.datachannel.DataChannel r12, java.lang.String r13) {
        /*
            r10 = this;
            r8 = 0
            if (r12 == 0) goto L70
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel.class
            java.lang.Object r0 = r12.gg0(r0)
            com.bytedance.android.live.broadcast.model.RoomCreateInfo r0 = (com.bytedance.android.live.broadcast.model.RoomCreateInfo) r0
            if (r0 == 0) goto L70
            long r3 = r0.pollOptimizeGroup
        L10:
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel.class
            java.lang.Object r0 = r12.gg0(r0)
            com.bytedance.android.live.broadcast.model.RoomCreateInfo r0 = (com.bytedance.android.live.broadcast.model.RoomCreateInfo) r0
            if (r0 == 0) goto L75
            long r0 = r0.pollTemplateOptimizeGroup
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
        L20:
            com.bytedance.android.livesdk.livesetting.broadcast.LiveVoteTemplateOpUrlSetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveVoteTemplateOpUrlSetting.INSTANCE
            java.lang.String r0 = r0.getUrl()
            X.0TsB r6 = X.C0KYL.LIZ(r0)
            X.C0KYK.LIZ(r6, r12)
            java.lang.String r0 = "enter_from"
            r6.LJJIFFI(r0, r13)
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            java.lang.String r5 = "0"
            java.lang.String r2 = "1"
            if (r0 <= 0) goto L56
            java.lang.String r1 = "poll_optimize_group"
            java.lang.String r0 = java.lang.String.valueOf(r3)
            r6.LJJIFFI(r1, r0)
            java.lang.String r0 = "customizable_poll_auth"
            r6.LJJIFFI(r0, r2)
            if (r7 == 0) goto L50
            java.lang.String r1 = r7.toString()
            if (r1 != 0) goto L51
        L50:
            r1 = r5
        L51:
            java.lang.String r0 = "poll_template_optimize_group"
            r6.LJJIFFI(r0, r1)
        L56:
            com.bytedance.android.livesdk.livesetting.broadcast.SecondPageCodeCacheABSetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.SecondPageCodeCacheABSetting.INSTANCE
            boolean r0 = r0.isMatch()
            if (r0 == 0) goto L5f
            r5 = r2
        L5f:
            java.lang.String r0 = "enable_code_cache"
            r6.LJJIFFI(r0, r5)
            android.net.Uri r0 = r6.LIZ()
            java.lang.String r0 = r0.toString()
            X.C0KYK.LIZIZ(r11, r12, r0)
            return
        L70:
            r3 = 0
            if (r12 == 0) goto L75
            goto L10
        L75:
            r7 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.function.RoomFunctionService.TU(X.19EG, com.bytedance.ies.sdk.datachannel.DataChannel, java.lang.String):void");
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final Object TW(ContentDisclosureSettings contentDisclosureSettings, DataChannel dataChannel, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C758980Tpw c758980Tpw;
        if (dataChannel != null && (c758980Tpw = (C758980Tpw) dataChannel.gg0(C751800TeM.class)) != null) {
            Object objLJIILIIL = c758980Tpw.LJIILIIL(contentDisclosureSettings, interfaceC1364105Vn);
            if (objLJIILIIL != C099R.LJFF()) {
                return Unit.LIZ;
            }
            return objLJIILIIL;
        }
        return Unit.LIZ;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final StreamAdaptionHandler U80(View view, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        return new StreamAdaptionHandler(view, lifecycleOwner, dataChannel);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void l61(FragmentManager fragmentManager, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_anchor", true);
        C786410Ut5.LJJJI("enter_from", str, bundle);
        C786410Ut5.LJJJI("enter_method", str2, bundle);
        C19322110iZ.LIZLLL(fragmentManager, LocationServiceNotionSheet.class, "location_service", null, bundle);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final Object nA(DataChannel dataChannel, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        C758980Tpw c758980Tpw;
        if (dataChannel != null && (c758980Tpw = (C758980Tpw) dataChannel.gg0(C751800TeM.class)) != null) {
            Object objLJIIJJI = c758980Tpw.LJIIJJI(z, interfaceC1364105Vn);
            if (objLJIIJJI != C099R.LJFF()) {
                return Unit.LIZ;
            }
            return objLJIIJJI;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b0 A[PHI: r1
      0x02b0: PHI (r1v8 com.ss.ugc.live.sdk.message.interfaces.IMessageManager) = 
      (r1v20 com.ss.ugc.live.sdk.message.interfaces.IMessageManager)
      (r1v21 com.ss.ugc.live.sdk.message.interfaces.IMessageManager)
     binds: [B:79:0x0291, B:81:0x02ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02f1  */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.01Bz, com.ss.ugc.live.sdk.message.interfaces.OnMessageListener, java.lang.Object] */
    @Override // com.bytedance.android.live.function.IRoomFunctionService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void oe1(androidx.fragment.app.Fragment r27, final com.bytedance.android.livesdkapi.depend.model.live.Room r28, final com.bytedance.ies.sdk.datachannel.DataChannel r29) {
        /*
            Method dump skipped, instruction units count: 817
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.function.RoomFunctionService.oe1(androidx.fragment.app.Fragment, com.bytedance.android.livesdkapi.depend.model.live.Room, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    public static void LIZLLL(Context context, boolean z, Room room, C1106210etP c1106210etP) {
        String str;
        String simpleName;
        String str2;
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0IMI.LIZ(linkedHashMap, room, c1106210etP.LJIL, c1106210etP.LJJ, c1106210etP.LJJI);
        if (z) {
            str = "anchor";
        } else {
            str = "user";
        }
        linkedHashMap.put("user_type", str);
        if (z) {
            String str3 = "1";
            if (Collections.unmodifiableList(c1106210etP.LJJIJL).size() > 0) {
                linkedHashMap.put("top_supporters_cnt", String.valueOf(Collections.unmodifiableList(c1106210etP.LJJIJL).size()));
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_top_supporters", obj);
            if (Collections.unmodifiableList(c1106210etP.LJJIJLIJ).size() > 0) {
                linkedHashMap.put("recently_shared_cnt", String.valueOf(Collections.unmodifiableList(c1106210etP.LJJIJLIJ).size()));
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_recently_shared", str3);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("click_trans_layer");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LIZ();
        C19EG c19egLJ = C500260Jjc.LJ(context);
        if (c19egLJ != null) {
            simpleName = c19egLJ.getClass().getSimpleName();
        } else {
            simpleName = null;
        }
        boolean zLJFF = Intrinsics.LJFF("MainActivity", simpleName);
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_share_panel_show");
        c474500IjALIZ2.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        if (zLJFF) {
            str2 = "preview_press";
        } else {
            str2 = "long_press";
        }
        c474500IjALIZ2.LJJII(str2, "panel_source");
        c474500IjALIZ2.LJJII("self_guide", "is_bubble_enter");
        w.LIZ.getClass();
        c474500IjALIZ2.LJJII(w.LJIJI(), "request_id");
        c474500IjALIZ2.LJJIIZI(linkedHashMap);
        c474500IjALIZ2.LJIL();
        if (z) {
            c474500IjALIZ2.LJJII("camera", "enter_from_merge");
            c474500IjALIZ2.LJJII("live_take_detail", "event_page");
        }
        c474500IjALIZ2.LIZ();
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final Object EW1(LiveThemeAwareFragment liveThemeAwareFragment, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        C19EG c19egLIZIZ;
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        Context context = liveThemeAwareFragment.getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).requestLocationPermissionForHost("global_live", "nearby_live", c19egLIZIZ, liveThemeAwareFragment, new C475030Ik1(str, str2), new C1AUE() { // from class: X.0Ijo
                @Override // X.C1AUE
                public final void LIZ() {
                    if (c2252611DEt.isActive()) {
                        InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = c2252611DEt;
                        Boolean bool = Boolean.TRUE;
                        C189200o6.m2constructorimpl(bool);
                        interfaceC20236714Gf.resumeWith(bool);
                    }
                }

                @Override // X.C1AUE
                public final void LIZIZ() {
                    if (c2252611DEt.isActive()) {
                        InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = c2252611DEt;
                        Boolean bool = Boolean.FALSE;
                        C189200o6.m2constructorimpl(bool);
                        interfaceC20236714Gf.resumeWith(bool);
                    }
                }

                @Override // X.C1AUE
                public final void onCancel(int i) {
                    if (c2252611DEt.isActive()) {
                        InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = c2252611DEt;
                        Boolean bool = Boolean.FALSE;
                        C189200o6.m2constructorimpl(bool);
                        interfaceC20236714Gf.resumeWith(bool);
                    }
                }
            });
        } else if (c2252611DEt.isActive()) {
            C189200o6.m2constructorimpl(false);
            c2252611DEt.resumeWith(false);
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final Fragment cE0(Context context, Room room, C1106210etP c1106210etP, C481330IuB c481330IuB) {
        if (!((IShareService) C1161920gLG.LIZJ(IShareService.class)).I21(room)) {
            return null;
        }
        if (LiveReportViolationPreloadSetting.getEnable()) {
            C759940TrU.LIZ(room.getId(), UserService.getInstance().user().getCurrentUserId(), new InterfaceC760020Trc() { // from class: X.0edl
                @Override // X.InterfaceC760020Trc
                public final void LIZ(C759990TrZ c759990TrZ, boolean z) {
                }
            }, true);
        }
        C19EG c19egLJ = C500260Jjc.LJ(context);
        if (c19egLJ == null) {
            return null;
        }
        C481220Iu0 c481220Iu0 = (C481220Iu0) ((IShareService) C1161920gLG.LIZJ(IShareService.class)).mh();
        c481220Iu0.getClass();
        c1106210etP.LIZIZ();
        Fragment longPressShareDialog2Fragment = c481220Iu0.LIZ.getLongPressShareDialog2Fragment(c19egLJ, c1106210etP, c481330IuB);
        if (longPressShareDialog2Fragment == null) {
            return null;
        }
        LIZLLL(context, true, room, c1106210etP);
        return longPressShareDialog2Fragment;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final boolean je1(Context context, InterfaceC474360Iiw interfaceC474360Iiw, String str, Map<String, String> map) {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            String str2 = LiveRepostGuideFragment._pnsPageId;
            return C474350Iiv.LIZ(supportFragmentManager, interfaceC474360Iiw, str, map);
        }
        return false;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void rV0(LifecycleOwner lifecycleOwner, Room room, DataChannel dataChannel, boolean z) {
        Boolean bool;
        C0IR5 c0ir5;
        long id;
        boolean z2;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        LiveEventInfo liveEventInfo;
        Long l;
        Room room2;
        Room room3;
        boolean zBooleanValue3 = false;
        IMessageManager iMessageManager = null;
        if (room != null) {
            this.LLIZ.put(room.getId(), dataChannel);
            C01GW c01gw = C1088060eQ8.LIZ;
            WeakHandler weakHandler = this.LLILZIL;
            if (weakHandler == null) {
                weakHandler = new WeakHandler(this);
                this.LLILZIL = weakHandler;
            }
            if (dataChannel != null) {
                c0ir5 = (C0IR5) dataChannel.gg0(C1087000eOQ.class);
            } else {
                c0ir5 = null;
            }
            if (c0ir5 != null && (room3 = c0ir5.LIZIZ) != null) {
                id = room3.getId();
            } else {
                id = 0;
            }
            C1088060eQ8.LJ = id;
            C1088060eQ8.LIZJ = dataChannel;
            C1088060eQ8.LJFF = weakHandler;
            if (c0ir5 != null && (room2 = c0ir5.LIZIZ) != null && room2.getOwnerUserId() == UserService.getInstance().user().getCurrentUserId()) {
                z2 = true;
            } else {
                z2 = false;
            }
            C1088060eQ8.LIZLLL = z2;
            InterfaceC1085480eLy interfaceC1085480eLyO41 = ((IBarrageService) C1161920gLG.LIZJ(IBarrageService.class)).O41(C1088060eQ8.LJ);
            if (interfaceC1085480eLyO41 != null) {
                interfaceC1085480eLyO41.LJIIL((C1088070eQ9) C1088060eQ8.LIZ.getValue());
            }
            C786410Ut5.LJLJJI(291, 60000L, weakHandler);
            if (!LiveWidgetMinLoadSettingV3.INSTANCE.enableEventDSC()) {
                C1096420edc c1096420edc = C1096420edc.LL;
                if (dataChannel != null) {
                    Boolean bool2 = (Boolean) dataChannel.gg0(C0TZM.class);
                    if (bool2 != null) {
                        zBooleanValue = bool2.booleanValue();
                    } else {
                        zBooleanValue = true;
                    }
                    Boolean bool3 = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
                    if (bool3 != null) {
                        zBooleanValue2 = bool3.booleanValue();
                    } else {
                        zBooleanValue2 = false;
                    }
                    if (zBooleanValue && !zBooleanValue2) {
                        C1096420edc.LLILLJJLI.put(room.getId(), dataChannel);
                        C1096420edc.LLIZLLLIL = room.getId();
                        C1096420edc.LLILZ.put(room.getId(), 0);
                        dataChannel.BQ2(lifecycleOwner, DrawGuessStatusVisibilityChannel.class, new AwS596S0100000_17(room, 564));
                        dataChannel.BQ2(lifecycleOwner, FrameL2SlotVisibilityChannel.class, new AwS596S0100000_17(room, 565));
                        dataChannel.BQ2(lifecycleOwner, FrameSlotVisibilityChannel.class, new AwS596S0100000_17(room, 566));
                        dataChannel.BQ2(lifecycleOwner, CommentPinWidgetVisibility.class, new AwS596S0100000_17(room, 567));
                        dataChannel.BQ2(lifecycleOwner, PublicScreenNormalPollStateVisibilityChannel.class, new AwS596S0100000_17(room, 568));
                        dataChannel.BQ2(lifecycleOwner, PublicScreenGiftPollStateVisibilityChannel.class, new AwS596S0100000_17(room, 569));
                        dataChannel.BQ2(lifecycleOwner, LiveEndEvent.class, new AwS596S0100000_17(room, 570));
                        dataChannel.BQ2(lifecycleOwner, WarningInfoVisibilityEvent.class, new AwS596S0100000_17(room, 571));
                        dataChannel.BQ2(lifecycleOwner, CustomPollCardVisibility.class, new AwS596S0100000_17(room, 572));
                        dataChannel.BQ2(lifecycleOwner, SubOnlyLiveAudienceStatusChannel.class, new AwS596S0100000_17(room, 558));
                        dataChannel.BQ2(lifecycleOwner, CustomizedPerksCardVisibilityChannel.class, new AwS596S0100000_17(room, 559));
                        dataChannel.BQ2(lifecycleOwner, SubGoalCardVisibilityChannel.class, new AwS596S0100000_17(room, 560));
                        dataChannel.BQ2(lifecycleOwner, LivePinCardVisibilityChannel.class, new AwS596S0100000_17(room, 561));
                        if (!C916790Zxt.LIZ(0)) {
                            dataChannel.BQ2(lifecycleOwner, HighPrioritySlotVisibilityChannel.class, new AwS596S0100000_17(room, 562));
                            dataChannel.BQ2(lifecycleOwner, HighPriorityTooltipVisibilityChannel.class, new AwS596S0100000_17(room, 563));
                        }
                        EventCard eventCard = room.liveEventCard;
                        if (eventCard != null && (liveEventInfo = eventCard.event) != null && (l = liveEventInfo.eventId) != null && l.longValue() > 0) {
                            long id2 = room.getId();
                            C1096490edj c1096490edj = new C1096490edj(room.getId());
                            LiveEventMessage liveEventMessage = new LiveEventMessage();
                            CommonMessageData commonMessageData = new CommonMessageData();
                            liveEventMessage.baseMessage = commonMessageData;
                            commonMessageData.roomId = room.getId();
                            liveEventMessage.actionType = 1;
                            liveEventMessage.card = eventCard;
                            C1096420edc.LIZIZ(id2, C1096490edj.LIZ(c1096490edj, liveEventMessage, false, null, 13));
                            C1096420edc.LLJ.put(room.getId(), C1096420edc.LIZ(room.getId()));
                        }
                        C1548820qPI.LIZLLL("live_event_pin_card_close", c1096420edc);
                        C1151720g4o c1151720g4o = new C1151720g4o(room, 24);
                        C1096420edc.LLILLL.put(room.getId(), c1151720g4o);
                        IMessageManager iMessageManager2 = (IMessageManager) dataChannel.gg0(C776250Uch.class);
                        if (iMessageManager2 != null) {
                            iMessageManager2.addMessageListener(C001A.LIVE_EVENT_MESSAGE.getIntType(), c1151720g4o);
                        }
                    }
                }
            }
            RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
            if (roomAuthStatus != null && !C500260Jjc.LJJJIL(dataChannel) && C500260Jjc.LJIIZILJ(dataChannel)) {
                InterfaceC1106030et7.E4.LJFF(Boolean.valueOf(roomAuthStatus.enableChat));
            }
            if (((LinkedHashMap) this.LLILZ).get(dataChannel) == null) {
                this.LLILZ.put(dataChannel, new C1096480edi());
            }
        }
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.addMessageListener(C001A.ROOM_VERIFY.getIntType(), this);
            iMessageManager.addMessageListener(C001A.SOCIAL.getIntType(), this);
            iMessageManager.addMessageListener(C001A.USER_SEQ.getIntType(), this);
        }
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest() && (C1096290edP.LIZIZ || LiveEffectNotifyMockEnabledSetting.enable())) {
            if (iMessageManager != null) {
                iMessageManager.addMessageListener(C001A.MEMBER.getIntType(), (OnIMMessageListener) C1096290edP.LIZJ.getValue());
            }
            C1096290edP.LIZ = dataChannel;
        }
        LIZJ(room, dataChannel);
        if (this.LLJILJIL == 1 && iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.MEMBER.getIntType(), this);
        }
        if (!z) {
            C1110390f09 c1110390f09 = C1110390f09.LIZ;
            Context context = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context();
            if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) != null) {
                zBooleanValue3 = bool.booleanValue();
            }
            c1110390f09.LIZLLL(context, lifecycleOwner, zBooleanValue3, room, C1114730f79.LIZ());
        }
        C1EOY.LJIIZILJ = this;
        C465520INi.LIZ.TV1(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02da A[PHI: r3
      0x02da: PHI (r3v2 long) = (r3v0 long), (r3v26 long) binds: [B:29:0x0063, B:31:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065 A[PHI: r3
      0x0065: PHI (r3v26 long) = (r3v0 long), (r3v29 long) binds: [B:29:0x0063, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b0  */
    @Override // com.bytedance.android.live.function.IRoomFunctionService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Sc2(java.lang.String r18, X.C19EG r19, com.bytedance.ies.sdk.datachannel.DataChannel r20, boolean r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 733
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.function.RoomFunctionService.Sc2(java.lang.String, X.19EG, com.bytedance.ies.sdk.datachannel.DataChannel, boolean, java.lang.String):void");
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final C783080Uni G82(BaseFragment baseFragment, DataChannel dataChannel, AbstractC781140Uka abstractC781140Uka, View view, Function1 function1, Function0 function0) {
        return new C783080Uni(baseFragment, dataChannel, abstractC781140Uka, view, function1, function0);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final DialogInterface UV1(Context context, boolean z, Room room, C1106210etP c1106210etP, IHostLongPressCallback iHostLongPressCallback, InterfaceC1372610lp5 interfaceC1372610lp5) {
        LiveLongPressDialog liveLongPressDialog = null;
        if (!((IShareService) C1161920gLG.LIZJ(IShareService.class)).I21(room)) {
            if (!z) {
                String str = c1106210etP.LJIL;
                String str2 = c1106210etP.LJJ;
                String str3 = c1106210etP.LJJJJLL;
                ShareFromInfo shareFromInfo = c1106210etP.LJL;
                if (context != null && room != null && (context instanceof C19EG)) {
                    liveLongPressDialog = new LiveLongPressDialog();
                    liveLongPressDialog.LLILZ = !C0IWZ.LJ(str, str2, false);
                    liveLongPressDialog.LLIZ = str;
                    liveLongPressDialog.LLIZLLLIL = str2;
                    liveLongPressDialog.LLJI = str3;
                    liveLongPressDialog.LLILZLL = room;
                    liveLongPressDialog.LLJ = shareFromInfo;
                    liveLongPressDialog.LLILZIL = iHostLongPressCallback;
                    FragmentManager fragmentManagerLJIL = C520010KaN.LJIL(context, false);
                    if (fragmentManagerLJIL != null) {
                        liveLongPressDialog.show(fragmentManagerLJIL, "LiveLongPressDialog");
                    }
                }
                LIZLLL(context, z, room, c1106210etP);
            }
            return liveLongPressDialog;
        }
        if (LiveReportViolationPreloadSetting.getEnable()) {
            C759940TrU.LIZ(room.getId(), UserService.getInstance().user().getCurrentUserId(), new InterfaceC760020Trc() { // from class: X.0edh
                @Override // X.InterfaceC760020Trc
                public final void LIZ(C759990TrZ c759990TrZ, boolean z2) {
                }
            }, true);
        }
        C19EG c19egLJ = C500260Jjc.LJ(context);
        if (c19egLJ == null) {
            return null;
        }
        C481220Iu0 c481220Iu0 = (C481220Iu0) ((IShareService) C1161920gLG.LIZJ(IShareService.class)).mh();
        c481220Iu0.getClass();
        c1106210etP.LIZIZ();
        Dialog longPressShareDialog = c481220Iu0.LIZ.getLongPressShareDialog(c19egLJ, c1106210etP, interfaceC1372610lp5);
        if (longPressShareDialog == null) {
            return null;
        }
        C1107690evn c1107690evn = C464800IKo.LIZ;
        if (!c1107690evn.LJIIJJI()) {
            c1107690evn.LIZ(longPressShareDialog);
            C786410Ut5.B4(longPressShareDialog);
            longPressShareDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: X.0edg
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C464800IKo.LIZ.LJIILLIIL(dialogInterface);
                }
            });
        }
        LIZLLL(context, z, room, c1106210etP);
        return longPressShareDialog;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void YO(View view, C16F5 c16f5, CompoundButton compoundButton, View view2, FragmentManager fragmentManager, C20484615Do c20484615Do, DataChannel dataChannel) {
        C475020Ik0.LIZ(true, view, c16f5, compoundButton, view2, fragmentManager, c20484615Do, dataChannel);
    }
}
