package kotlin.jvm.internal;

import X.AbstractC920180a3M;
import X.AbstractC923560a8o;
import X.AbstractC928510aGn;
import X.AbstractC960460b6K;
import X.C00S0;
import X.C08I7;
import X.C098200Yq;
import X.C098J;
import X.C09AY;
import X.C0IDG;
import X.C0J9Y;
import X.C0UTB;
import X.C1101460elk;
import X.C1117360fBO;
import X.C1161920gLG;
import X.C11NJ;
import X.C11PQ;
import X.C13LP;
import X.C15438062q;
import X.C158B;
import X.C1697810uHb;
import X.C1819620xS4;
import X.C189200o6;
import X.C19748512Ol;
import X.C1ACJ;
import X.C20337914i1;
import X.C20441214yg;
import X.C2188811AlT;
import X.C305901Gn;
import X.C497740JfY;
import X.C501440JlW;
import X.C588290N5n;
import X.C603820NmG;
import X.C751910TeX;
import X.C766270U4b;
import X.C915980Zwa;
import X.C916490ZxP;
import X.C917100ZyO;
import X.C917810ZzX;
import X.C920310a3Z;
import X.C920330a3b;
import X.C921180a4y;
import X.C921550a5Z;
import X.C922540a7A;
import X.C923330a8R;
import X.C923340a8S;
import X.C924250a9v;
import X.C924580aAS;
import X.C924700aAe;
import X.C924810aAp;
import X.C925600aC6;
import X.C927240aEk;
import X.C927600aFK;
import X.C928500aGm;
import X.C928710aH7;
import X.C930480aJy;
import X.C930540aK4;
import X.C930930aKh;
import X.C930940aKi;
import X.C932440aN8;
import X.C932810aNj;
import X.C933370aOd;
import X.C934890aR5;
import X.C935380aRs;
import X.C937550aVN;
import X.C937570aVP;
import X.C938050aWB;
import X.C938220aWS;
import X.C938480aWs;
import X.C940020aZM;
import X.C940750aaX;
import X.C941290abP;
import X.C941320abS;
import X.C942060ace;
import X.C942440adG;
import X.C944640ago;
import X.C945130ahb;
import X.C948450amx;
import X.C949390aoT;
import X.C950220apo;
import X.C952390atJ;
import X.C952580atc;
import X.C952740ats;
import X.C953230auf;
import X.C953720avS;
import X.C954060aw0;
import X.C954460awe;
import X.C955390ay9;
import X.C955400ayA;
import X.C956240azW;
import X.C957990b2L;
import X.C958830b3h;
import X.C961510b81;
import X.C969360bKg;
import X.C970310bMD;
import X.C970450bMR;
import X.C970490bMV;
import X.C970560bMc;
import X.C973660bRc;
import X.C975400bUQ;
import X.C980380bcS;
import X.EnumC920540a3w;
import X.EnumC959750b5B;
import X.InterfaceC1102810env;
import X.InterfaceC302401Fe;
import X.InterfaceC665370Q7z;
import X.InterfaceC917640ZzG;
import X.InterfaceC922980a7s;
import X.InterfaceC923400a8Y;
import X.InterfaceC932640aNS;
import X.InterfaceC934710aQn;
import X.InterfaceC937900aVw;
import X.InterfaceC939660aYm;
import X.InterfaceC940060aZQ;
import X.InterfaceC941540abo;
import X.InterfaceC945090ahX;
import X.InterfaceC952240at4;
import X.InterfaceC954180awC;
import X.InterfaceC956530azz;
import X.InterfaceC957070b0r;
import X.InterfaceC960800b6s;
import X.InterfaceC964770bDH;
import Y.AfS151S0200000_15;
import Y.AfS184S0100000_15;
import Y.AfS48S1100000_15;
import android.R;
import android.animation.Animator;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Looper;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.ai.api.pitaya.ILiveClientAIService;
import com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService;
import com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionInternalService;
import com.bytedance.android.live.liveinteract.gamelink.model.GameLinkDataHolder;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.live.liveinteract.match.service.IMatchAICommentaryService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.service.AnchorSettingDistributeFromServerManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.api.ILayoutServerApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.interceptor.FansRequiredInterceptor;
import com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2;
import com.bytedance.android.live.liveinteract.multiguestv3.tool.NetworkStateTipsHelperManager;
import com.bytedance.android.live.liveinteract.multihost.biz.link.view.MultiCoHostWindowManager;
import com.bytedance.android.live.liveinteract.multihost.biz.quickcohost.service.IQuickCoHostService;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.live.liveinteract.multihost.datamanager.MatchSettingRepository;
import com.bytedance.android.live.liveinteract.multihost.event.LiveHostCrossRoomEventHelper;
import com.bytedance.android.live.liveinteract.multilive.model.EnlargeScreenManageParams;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostABInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.GroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InteractAudioVolumeInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinGroupDirectIMModel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinRoomDirectMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUserState;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ListChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionContentInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.P2PGroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcStartResultMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableChannelBasedTrackSupportGroupChannelIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicBizRequestIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicToolbarIconSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestIconInCoHostOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicVoiceChatLayoutConfigV2Setting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestGuestInviteSheetOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestInviteFriendDailyLimitSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLayoutBizViewStyleAudioSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLayoutBizViewStyleGuideSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLayoutBizViewStyleSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestNoticeboardEditorSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TopLiveExitAnimSnapshotRefTypeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostInviteListPerformanceConfigs;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostInviteListPerformanceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostInviteListPreloadConfigs;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostInviteListPreloadSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestBorderViewSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.InteractionSourceTypeDirectBattleWhiteList;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.InteractionSourceTypeWhiteList;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostDataHolderRefactorResetOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostLayoutIdConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeTheStageCountdownSecSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeTheStageEffectPanelIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeTheStageEffectResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchLayoutIdConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchPlaybooksGuidanceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.EnableMicSeatEmojiFeatureSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LivesdkLsWatchLinkmicSettingsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiLiveInviteFriendFreqCtrl;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.SoundWaveEffectOtpSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.model.message.linker.random_linkmic_message.LinkerRandomMatchContent;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.message.IMessageService;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tiktok.kmp.live.socialgamebusinessapi.service.ILiveDanceService;
import com.tts.oecverify.BdTuring;
import java.text.SimpleDateFormat;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS224S0300000_15;
import kotlin.jvm.internal.AwS259S0300000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS55S1300000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS80S1300000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.MgTraceInfo;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.PositionConfig;
import webcast.api.linkmic_multi_guest.LayoutUpdateParams;
import webcast.api.linkmic_multi_guest.SwitchSpotParams;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: loaded from: classes16.dex */
public class AFwS203S0000000_15 extends C09AY implements Function0 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(505);
    public final int $t;

    public static AFwS203S0000000_15 get$arr$(int i) {
        AFwS203S0000000_15 aFwS203S0000000_15 = (AFwS203S0000000_15) arr$.get(i);
        if (aFwS203S0000000_15 != null) {
            return aFwS203S0000000_15;
        }
        arr$.compareAndSet(i, null, new AFwS203S0000000_15(i));
        return (AFwS203S0000000_15) arr$.get(i);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$429(AFwS203S0000000_15 aFwS203S0000000_15) {
        return null;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$503(AFwS203S0000000_15 aFwS203S0000000_15) {
        return "";
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            case 31:
                return invoke$31(this);
            case 32:
                return invoke$32(this);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this);
            case 35:
                return invoke$35(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this);
            case 37:
                return invoke$37(this);
            case 38:
                return invoke$38(this);
            case 39:
                return invoke$39(this);
            case 40:
                return invoke$40(this);
            case 41:
                return invoke$41(this);
            case 42:
                return invoke$42(this);
            case 43:
                return invoke$43(this);
            case 44:
                return invoke$44(this);
            case 45:
                return invoke$45(this);
            case 46:
                return invoke$46(this);
            case 47:
                return invoke$47(this);
            case 48:
                return invoke$48(this);
            case 49:
                return invoke$49(this);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this);
            case 51:
                return invoke$51(this);
            case 52:
                return invoke$52(this);
            case 53:
                return invoke$53(this);
            case 54:
                return invoke$54(this);
            case 55:
                return invoke$55(this);
            case 56:
                return invoke$56(this);
            case 57:
                return invoke$57(this);
            case 58:
                return invoke$58(this);
            case 59:
                return invoke$59(this);
            case 60:
                return invoke$60(this);
            case 61:
                return invoke$61(this);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this);
            case 63:
                return invoke$63(this);
            case 64:
                return invoke$64(this);
            case 65:
                return invoke$65(this);
            case 66:
                return invoke$66(this);
            case 67:
                return invoke$67(this);
            case 68:
                return invoke$68(this);
            case 69:
                return invoke$69(this);
            case 70:
                return invoke$70(this);
            case 71:
                return invoke$71(this);
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                return invoke$72(this);
            case 73:
                return invoke$73(this);
            case 74:
                return invoke$74(this);
            case 75:
                return invoke$75(this);
            case 76:
                return invoke$76(this);
            case 77:
                return invoke$77(this);
            case 78:
                return invoke$78(this);
            case 79:
                return invoke$79(this);
            case 80:
                return invoke$80(this);
            case 81:
                return invoke$81(this);
            case 82:
                return invoke$82(this);
            case 83:
                return invoke$83(this);
            case 84:
                return invoke$84(this);
            case 85:
                return invoke$85(this);
            case 86:
                return invoke$86(this);
            case 87:
                return invoke$87(this);
            case 88:
                return invoke$88(this);
            case 89:
                return invoke$89(this);
            case 90:
                return invoke$90(this);
            case 91:
                return invoke$91(this);
            case 92:
                return invoke$92(this);
            case 93:
                return invoke$93(this);
            case 94:
                return invoke$94(this);
            case 95:
                return invoke$95(this);
            case 96:
                return invoke$96(this);
            case 97:
                return invoke$97(this);
            case 98:
                return invoke$98(this);
            case 99:
                return invoke$99(this);
            case 100:
                return invoke$100(this);
            case 101:
                return invoke$101(this);
            case 102:
                return invoke$102(this);
            case 103:
                return invoke$103(this);
            case 104:
                return invoke$104(this);
            case 105:
                return invoke$105(this);
            case 106:
                return invoke$106(this);
            case 107:
                return invoke$107(this);
            case 108:
                return invoke$108(this);
            case 109:
                return invoke$109(this);
            case 110:
                return invoke$110(this);
            case 111:
                return invoke$111(this);
            case 112:
                return invoke$112(this);
            case 113:
                return invoke$113(this);
            case 114:
                return invoke$114(this);
            case 115:
                return invoke$115(this);
            case 116:
                return invoke$116(this);
            case 117:
                return invoke$117(this);
            case 118:
                return invoke$118(this);
            case 119:
                return invoke$119(this);
            case 120:
                return invoke$120(this);
            case 121:
                return invoke$121(this);
            case 122:
                return invoke$122(this);
            case 123:
                return invoke$123(this);
            case 124:
                return invoke$124(this);
            case 125:
                return invoke$125(this);
            case 126:
                return invoke$126(this);
            case 127:
                return invoke$127(this);
            case 128:
                return invoke$128(this);
            case 129:
                return invoke$129(this);
            case 130:
                return invoke$130(this);
            case 131:
                return invoke$131(this);
            case 132:
                return invoke$132(this);
            case 133:
                return invoke$133(this);
            case 134:
                return invoke$134(this);
            case 135:
                return invoke$135(this);
            case 136:
                return invoke$136(this);
            case 137:
                return invoke$137(this);
            case 138:
                return invoke$138(this);
            case 139:
                return invoke$139(this);
            case 140:
                return invoke$140(this);
            case 141:
                return invoke$141(this);
            case 142:
                return invoke$142(this);
            case 143:
                return invoke$143(this);
            case 144:
                return invoke$144(this);
            case 145:
                return invoke$145(this);
            case 146:
                return invoke$146(this);
            case 147:
                return invoke$147(this);
            case 148:
                return invoke$148(this);
            case 149:
                return invoke$149(this);
            case 150:
                return invoke$150(this);
            case 151:
                return invoke$151(this);
            case 152:
                return invoke$152(this);
            case 153:
                return invoke$153(this);
            case 154:
                return invoke$154(this);
            case 155:
                return invoke$155(this);
            case 156:
                return invoke$156(this);
            case 157:
                return invoke$157(this);
            case 158:
                return invoke$158(this);
            case 159:
                return invoke$159(this);
            case 160:
                return invoke$160(this);
            case 161:
                return invoke$161(this);
            case 162:
                return invoke$162(this);
            case 163:
                return invoke$163(this);
            case 164:
                return invoke$164(this);
            case 165:
                return invoke$165(this);
            case 166:
                return invoke$166(this);
            case 167:
                return invoke$167(this);
            case 168:
                return invoke$168(this);
            case 169:
                return invoke$169(this);
            case 170:
                return invoke$170(this);
            case 171:
                return invoke$171(this);
            case 172:
                return invoke$172(this);
            case 173:
                return invoke$173(this);
            case 174:
                return invoke$174(this);
            case 175:
                return invoke$175(this);
            case 176:
                return invoke$176(this);
            case 177:
                return invoke$177(this);
            case 178:
                return invoke$178(this);
            case 179:
                return invoke$179(this);
            case 180:
                return invoke$180(this);
            case 181:
                return invoke$181(this);
            case 182:
                return invoke$182(this);
            case 183:
                return invoke$183(this);
            case 184:
                return invoke$184(this);
            case 185:
                return invoke$185(this);
            case 186:
                return invoke$186(this);
            case 187:
                return invoke$187(this);
            case 188:
                return invoke$188(this);
            case 189:
                return invoke$189(this);
            case 190:
                return invoke$190(this);
            case 191:
                return invoke$191(this);
            case 192:
                return invoke$192(this);
            case 193:
                return invoke$193(this);
            case 194:
                return invoke$194(this);
            case 195:
                return invoke$195(this);
            case 196:
                return invoke$196(this);
            case 197:
                return invoke$197(this);
            case 198:
                return invoke$198(this);
            case 199:
                return invoke$199(this);
            case 200:
                return invoke$200(this);
            case 201:
                return invoke$201(this);
            case 202:
                return invoke$202(this);
            case 203:
                return invoke$203(this);
            case 204:
                return invoke$204(this);
            case 205:
                return invoke$205(this);
            case 206:
                return invoke$206(this);
            case 207:
                return invoke$207(this);
            case 208:
                return invoke$208(this);
            case 209:
                return invoke$209(this);
            case 210:
                return invoke$210(this);
            case 211:
                return invoke$211(this);
            case 212:
                return invoke$212(this);
            case 213:
                return invoke$213(this);
            case 214:
                return invoke$214(this);
            case 215:
                return invoke$215(this);
            case 216:
                return invoke$216(this);
            case 217:
                return invoke$217(this);
            case 218:
                return invoke$218(this);
            case 219:
                return invoke$219(this);
            case 220:
                return invoke$220(this);
            case 221:
                return invoke$221(this);
            case 222:
                return invoke$222(this);
            case 223:
                return invoke$223(this);
            case 224:
                return invoke$224(this);
            case 225:
                return invoke$225(this);
            case 226:
                return invoke$226(this);
            case 227:
                return invoke$227(this);
            case 228:
                return invoke$228(this);
            case 229:
                return invoke$229(this);
            case 230:
                return invoke$230(this);
            case 231:
                return invoke$231(this);
            case 232:
                return invoke$232(this);
            case 233:
                return invoke$233(this);
            case 234:
                return invoke$234(this);
            case 235:
                return invoke$235(this);
            case 236:
                return invoke$236(this);
            case 237:
                return invoke$237(this);
            case 238:
                return invoke$238(this);
            case 239:
                return invoke$239(this);
            case 240:
                return invoke$240(this);
            case 241:
                return invoke$241(this);
            case 242:
                return invoke$242(this);
            case 243:
                return invoke$243(this);
            case 244:
                return invoke$244(this);
            case 245:
                return invoke$245(this);
            case 246:
                return invoke$246(this);
            case 247:
                return invoke$247(this);
            case 248:
                return invoke$248(this);
            case 249:
                return invoke$249(this);
            case 250:
                return invoke$250(this);
            case 251:
                return invoke$251(this);
            case 252:
                return invoke$252(this);
            case 253:
                return invoke$253(this);
            case 254:
                return invoke$254(this);
            case 255:
                return invoke$255(this);
            case 256:
                return invoke$256(this);
            case 257:
                return invoke$257(this);
            case 258:
                return invoke$258(this);
            case 259:
                return invoke$259(this);
            case 260:
                return invoke$260(this);
            case 261:
                return invoke$261(this);
            case 262:
                return invoke$262(this);
            case 263:
                return invoke$263(this);
            case 264:
                return invoke$264(this);
            case 265:
                return invoke$265(this);
            case 266:
                return invoke$266(this);
            case 267:
                return invoke$267(this);
            case 268:
                return invoke$268(this);
            case 269:
                return invoke$269(this);
            case 270:
                return invoke$270(this);
            case 271:
                return invoke$271(this);
            case 272:
                return invoke$272(this);
            case 273:
                return invoke$273(this);
            case 274:
                return invoke$274(this);
            case 275:
                return invoke$275(this);
            case 276:
                return invoke$276(this);
            case 277:
                return invoke$277(this);
            case 278:
                return invoke$278(this);
            case 279:
                return invoke$279(this);
            case 280:
                return invoke$280(this);
            case 281:
                return invoke$281(this);
            case 282:
                return invoke$282(this);
            case 283:
                return invoke$283(this);
            case 284:
                return invoke$284(this);
            case 285:
                return invoke$285(this);
            case 286:
                return invoke$286(this);
            case 287:
                return invoke$287(this);
            case 288:
                return invoke$288(this);
            case 289:
                return invoke$289(this);
            case 290:
                return invoke$290(this);
            case 291:
                return invoke$291(this);
            case 292:
                return invoke$292(this);
            case 293:
                return invoke$293(this);
            case 294:
                return invoke$294(this);
            case 295:
                return invoke$295(this);
            case 296:
                return invoke$296(this);
            case 297:
                return invoke$297(this);
            case 298:
                return invoke$298(this);
            case 299:
                return invoke$299(this);
            case DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL /* 300 */:
                return invoke$300(this);
            case 301:
                return invoke$301(this);
            case 302:
                return invoke$302(this);
            case 303:
                return invoke$303(this);
            case 304:
                return invoke$304(this);
            case 305:
                return invoke$305(this);
            case 306:
                return invoke$306(this);
            case 307:
                return invoke$307(this);
            case 308:
                return invoke$308(this);
            case 309:
                return invoke$309(this);
            case 310:
                return invoke$310(this);
            case 311:
                return invoke$311(this);
            case 312:
                return invoke$312(this);
            case 313:
                return invoke$313(this);
            case 314:
                return invoke$314(this);
            case 315:
                return invoke$315(this);
            case 316:
                return invoke$316(this);
            case 317:
                return invoke$317(this);
            case 318:
                return invoke$318(this);
            case 319:
                return invoke$319(this);
            case 320:
                return invoke$320(this);
            case 321:
                return invoke$321(this);
            case 322:
                return invoke$322(this);
            case 323:
                return invoke$323(this);
            case 324:
                return invoke$324(this);
            case 325:
                return invoke$325(this);
            case 326:
                return invoke$326(this);
            case 327:
                return invoke$327(this);
            case 328:
                return invoke$328(this);
            case 329:
                return invoke$329(this);
            case 330:
                return invoke$330(this);
            case 331:
                return invoke$331(this);
            case 332:
                return invoke$332(this);
            case 333:
                return invoke$333(this);
            case 334:
                return invoke$334(this);
            case 335:
                return invoke$335(this);
            case 336:
                return invoke$336(this);
            case 337:
                return invoke$337(this);
            case 338:
                return invoke$338(this);
            case 339:
                return invoke$339(this);
            case 340:
                return invoke$340(this);
            case 341:
                return invoke$341(this);
            case 342:
                return invoke$342(this);
            case 343:
                return invoke$343(this);
            case 344:
                return invoke$344(this);
            case 345:
                return invoke$345(this);
            case 346:
                return invoke$346(this);
            case 347:
                return invoke$347(this);
            case 348:
                return invoke$348(this);
            case 349:
                return invoke$349(this);
            case 350:
                return invoke$350(this);
            case 351:
                return invoke$351(this);
            case 352:
                return invoke$352(this);
            case 353:
                return invoke$353(this);
            case 354:
                return invoke$354(this);
            case 355:
                return invoke$355(this);
            case 356:
                return invoke$356(this);
            case 357:
                return invoke$357(this);
            case 358:
                return invoke$358(this);
            case 359:
                return invoke$359(this);
            case 360:
                return invoke$360(this);
            case 361:
                return invoke$361(this);
            case 362:
                return invoke$362(this);
            case 363:
                return invoke$363(this);
            case 364:
                return invoke$364(this);
            case 365:
                return invoke$365(this);
            case 366:
                return invoke$366(this);
            case 367:
                return invoke$367(this);
            case 368:
                return invoke$368(this);
            case 369:
                return invoke$369(this);
            case 370:
                return invoke$370(this);
            case 371:
                return invoke$371(this);
            case 372:
                return invoke$372(this);
            case 373:
                return invoke$373(this);
            case 374:
                return invoke$374(this);
            case 375:
                return invoke$375(this);
            case 376:
                return invoke$376(this);
            case 377:
                return invoke$377(this);
            case 378:
                return invoke$378(this);
            case 379:
                return invoke$379(this);
            case 380:
                return invoke$380(this);
            case 381:
                return invoke$381(this);
            case 382:
                return invoke$382(this);
            case 383:
                return invoke$383(this);
            case 384:
                return invoke$384(this);
            case 385:
                return invoke$385(this);
            case 386:
                return invoke$386(this);
            case 387:
                return invoke$387(this);
            case 388:
                return invoke$388(this);
            case 389:
                return invoke$389(this);
            case 390:
                return invoke$390(this);
            case 391:
                return invoke$391(this);
            case 392:
                return invoke$392(this);
            case 393:
                return invoke$393(this);
            case 394:
                return invoke$394(this);
            case 395:
                return invoke$395(this);
            case 396:
                return invoke$396(this);
            case 397:
                return invoke$397(this);
            case 398:
                return invoke$398(this);
            case 399:
                return invoke$399(this);
            case 400:
                return invoke$400(this);
            case 401:
                return invoke$401(this);
            case 402:
                return invoke$402(this);
            case 403:
                return invoke$403(this);
            case 404:
                return invoke$404(this);
            case 405:
                return invoke$405(this);
            case 406:
                return invoke$406(this);
            case 407:
                return invoke$407(this);
            case 408:
                return invoke$408(this);
            case 409:
                return invoke$409(this);
            case 410:
                return invoke$410(this);
            case 411:
                return invoke$411(this);
            case 412:
                return invoke$412(this);
            case 413:
                return invoke$413(this);
            case 414:
                return invoke$414(this);
            case 415:
                return invoke$415(this);
            case 416:
                return invoke$416(this);
            case 417:
                return invoke$417(this);
            case 418:
                return invoke$418(this);
            case 419:
                return invoke$419(this);
            case 420:
                return invoke$420(this);
            case 421:
                return invoke$421(this);
            case 422:
                return invoke$422(this);
            case 423:
                return invoke$423(this);
            case 424:
                return invoke$424(this);
            case 425:
                return invoke$425(this);
            case 426:
                return invoke$426(this);
            case 427:
                return invoke$427(this);
            case 428:
                return invoke$428(this);
            case 429:
                return invoke$429(this);
            case 430:
                return invoke$430(this);
            case 431:
                return invoke$431(this);
            case 432:
                return invoke$432(this);
            case 433:
                return invoke$433(this);
            case 434:
                return invoke$434(this);
            case 435:
                return invoke$435(this);
            case 436:
                return invoke$436(this);
            case 437:
                return invoke$437(this);
            case 438:
                return invoke$438(this);
            case 439:
                return invoke$439(this);
            case 440:
                return invoke$440(this);
            case 441:
                return invoke$441(this);
            case 442:
                return invoke$442(this);
            case 443:
                return invoke$443(this);
            case 444:
                return invoke$444(this);
            case 445:
                return invoke$445(this);
            case 446:
                return invoke$446(this);
            case 447:
                return invoke$447(this);
            case 448:
                return invoke$448(this);
            case 449:
                return invoke$449(this);
            case 450:
                return invoke$450(this);
            case 451:
                return invoke$451(this);
            case 452:
                return invoke$452(this);
            case 453:
                return invoke$453(this);
            case 454:
                return invoke$454(this);
            case 455:
                return invoke$455(this);
            case 456:
                return invoke$456(this);
            case 457:
                return invoke$457(this);
            case 458:
                return invoke$458(this);
            case 459:
                return invoke$459(this);
            case 460:
                return invoke$460(this);
            case 461:
                return invoke$461(this);
            case 462:
                return invoke$462(this);
            case 463:
                return invoke$463(this);
            case 464:
                return invoke$464(this);
            case 465:
                return invoke$465(this);
            case 466:
                return invoke$466(this);
            case 467:
                return invoke$467(this);
            case 468:
                return invoke$468(this);
            case 469:
                return invoke$469(this);
            case 470:
                return invoke$470(this);
            case 471:
                return invoke$471(this);
            case 472:
                return invoke$472(this);
            case 473:
                return invoke$473(this);
            case 474:
                return invoke$474(this);
            case 475:
                return invoke$475(this);
            case 476:
                return invoke$476(this);
            case 477:
                return invoke$477(this);
            case 478:
                return invoke$478(this);
            case 479:
                return invoke$479(this);
            case 480:
                return invoke$480(this);
            case 481:
                return invoke$481(this);
            case 482:
                return invoke$482(this);
            case 483:
                return invoke$483(this);
            case 484:
                return invoke$484(this);
            case 485:
                return invoke$485(this);
            case 486:
                return invoke$486(this);
            case 487:
                return invoke$487(this);
            case 488:
                return invoke$488(this);
            case 489:
                return invoke$489(this);
            case 490:
                return invoke$490(this);
            case 491:
                return invoke$491(this);
            case 492:
                return invoke$492(this);
            case 493:
                return invoke$493(this);
            case 494:
                return invoke$494(this);
            case 495:
                return invoke$495(this);
            case 496:
                return invoke$496(this);
            case 497:
                return invoke$497(this);
            case 498:
                return invoke$498(this);
            case 499:
                return invoke$499(this);
            case 500:
                return invoke$500(this);
            case 501:
                return invoke$501(this);
            case 502:
                return invoke$502(this);
            case 503:
                return invoke$503(this);
            case 504:
                return invoke$504(this);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS203S0000000_15(int i) {
        super(0);
        this.$t = i;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$0(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$1(AFwS203S0000000_15 aFwS203S0000000_15) {
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLILZLL, 10));
        Iterator<C954460awe> it2 = listLLILZLL.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().LJ));
        }
        return C13LP.LLIIJI(arrayList);
    }

    public static final Object invoke$10(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C1161920gLG.LIZJ(IMultiGuestV3InternalServiceV2.class);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$100(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$101(AFwS203S0000000_15 aFwS203S0000000_15) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(1, C497740JfY.LJFF(R.color.holo_red_dark));
        return gradientDrawable;
    }

    public static final Object invoke$102(AFwS203S0000000_15 aFwS203S0000000_15) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(C497740JfY.LIZIZ(12));
        textPaint.setColor(C497740JfY.LJFF(R.color.holo_green_dark));
        return textPaint;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$103(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$104(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ArrayList();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$105(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$106(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$107(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C949390aoT();
    }

    public static final Object invoke$108(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Keva.getRepo("live-multi_live_avatar");
    }

    public static final Object invoke$109(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C305901Gn();
    }

    public static final Object invoke$11(AFwS203S0000000_15 aFwS203S0000000_15) {
        return LiveCoHostTakeTheStageEffectPanelIdSetting.INSTANCE.getValue();
    }

    public static final Object invoke$110(AFwS203S0000000_15 aFwS203S0000000_15) {
        return ((ILiveDanceService) C1161920gLG.LIZJ(ILiveDanceService.class)).Yo1();
    }

    public static final Object invoke$111(AFwS203S0000000_15 aFwS203S0000000_15) {
        return ((ILiveDanceService) C1161920gLG.LIZJ(ILiveDanceService.class)).Yo1();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$112(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$113(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$114(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$115(AFwS203S0000000_15 aFwS203S0000000_15) {
        C953230auf.LJI.clear();
        C953230auf.LIZ.getClass();
        C953230auf.LIZIZ.clear();
        C953230auf.LIZJ.clear();
        C953230auf.LJ.clear();
        return Unit.LIZ;
    }

    public static final Object invoke$116(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C08I7(MultiGuestNoticeboardEditorSetting.INSTANCE.getHistoryMaxCount() + 10);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$117(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$118(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$119(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$12(AFwS203S0000000_15 aFwS203S0000000_15) {
        return LiveCoHostTakeTheStageEffectResourceIdSetting.INSTANCE.getValue();
    }

    public static final Object invoke$120(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C928710aH7();
    }

    public static final Object invoke$121(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new HashMap();
    }

    public static final Object invoke$122(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new HashMap();
    }

    public static final Object invoke$123(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new Object() { // from class: X.0aPX
        };
    }

    public static final Object invoke$124(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Integer.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).liveId());
    }

    public static final Object invoke$125(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C1819620xS4.LIZ();
    }

    public static final Object invoke$126(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C1819620xS4.LIZ();
    }

    public static final Object invoke$127(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new HashMap();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$128(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$129(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new FansRequiredInterceptor();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$13(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$130(AFwS203S0000000_15 aFwS203S0000000_15) {
        String str;
        C930480aJy.LIZ.getClass();
        Layout layoutLJIILLIIL = C930480aJy.LJIILLIIL();
        if (layoutLJIILLIIL == null || (str = layoutLJIILLIIL.businessType) == null) {
            return "";
        }
        return str;
    }

    public static final Object invoke$131(AFwS203S0000000_15 aFwS203S0000000_15) {
        MultiGuestDataHolder multiGuestDataHolder;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        String strLIZ;
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_DATA_HOLDER");
        if (!(objLJIIIZ instanceof MultiGuestDataHolder) || (multiGuestDataHolder = (MultiGuestDataHolder) objLJIIIZ) == null || (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolder.LIZIZ()) == null || (strLIZ = C916490ZxP.LIZ(multiLiveAnchorPanelSettingsLIZIZ)) == null) {
            return "";
        }
        return strLIZ;
    }

    public static final Object invoke$132(AFwS203S0000000_15 aFwS203S0000000_15) {
        boolean zLJFF;
        if (C930540aK4.LIZJ()) {
            if (C923340a8S.LIZ() != 0) {
                zLJFF = true;
            } else {
                zLJFF = false;
            }
        } else {
            C923330a8R c923330a8R = C923330a8R.LIZ;
            zLJFF = C923330a8R.LJFF();
        }
        return Boolean.valueOf(zLJFF);
    }

    public static final Object invoke$133(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C928500aGm();
    }

    public static final Object invoke$134(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C928500aGm();
    }

    public static final Object invoke$135(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new InterfaceC923400a8Y() { // from class: X.0a8Z
            @Override // X.InterfaceC923400a8Y
            public final void LIZ() {
            }

            @Override // X.InterfaceC923400a8Y
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC923400a8Y
            public final void LIZJ() {
            }

            @Override // X.InterfaceC923400a8Y
            public final void dispose() {
            }
        };
    }

    public static final Object invoke$136(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new AbstractC928510aGn<LinkListUser, LinkMessage>() { // from class: X.0a7r
            @Override // X.InterfaceC921200a50
            public final Object LJFF(String str) {
                LinkListUser next;
                LinkListUser linkListUser;
                synchronized (this) {
                    try {
                        Iterator<LinkListUser> it2 = LJIJJLI().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (TextUtils.equals(str, next.linkMicId)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        linkListUser = next;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return linkListUser;
            }

            @Override // X.InterfaceC921200a50
            public final Object LJII(long j) {
                LinkListUser next;
                LinkListUser linkListUser;
                synchronized (this) {
                    try {
                        Iterator<LinkListUser> it2 = LJIJJLI().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                User user = next.user;
                                if (user != null && user.getId() == j) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        linkListUser = next;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return linkListUser;
            }

            @Override // X.InterfaceC921200a50
            public final int LJIIL(long j) {
                int i;
                LinkListUser next;
                synchronized (this) {
                    try {
                        Iterator<LinkListUser> it2 = LJIJJLI().iterator();
                        while (true) {
                            i = 0;
                            if (it2.hasNext()) {
                                next = it2.next();
                                User user = next.user;
                                if (user != null && user.getId() == j) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        LinkListUser linkListUser = next;
                        if (linkListUser != null) {
                            i = linkListUser.LIZ;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return i;
            }

            @Override // X.InterfaceC921200a50
            public final Object LJIILIIL(long j) {
                LinkListUser next;
                LinkListUser linkListUser;
                synchronized (this) {
                    try {
                        Iterator<LinkListUser> it2 = LJJIII().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                User user = next.user;
                                if (user != null && user.getId() == j) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        linkListUser = next;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return linkListUser;
            }

            @Override // X.InterfaceC921200a50
            public final Object LJIIZILJ(String str) {
                LinkListUser next;
                LinkListUser linkListUser;
                synchronized (this) {
                    try {
                        Iterator<LinkListUser> it2 = LJJIII().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (TextUtils.equals(str, next.linkMicId)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        linkListUser = next;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return linkListUser;
            }

            @Override // X.AbstractC928510aGn
            public final void LJJIJIIJI(LinkMessage linkMessage) {
                long jLongValue;
                LinkMessage linkMessage2 = linkMessage;
                Long lLJIIJ = C930540aK4.LJIIJ();
                if (lLJIIJ != null) {
                    jLongValue = lLJIIJ.longValue();
                } else {
                    jLongValue = 0;
                }
                for (LinkListUser linkListUser : linkMessage2.mListChangeContent.onLineUsers) {
                    linkListUser.LIZ = 2;
                    linkListUser.LIZIZ = jLongValue;
                    LJJIII().add(linkListUser);
                }
                for (LinkListUser linkListUser2 : linkMessage2.mListChangeContent.waitingUsers) {
                    linkListUser2.LIZ = 1;
                    LJIL().add(linkListUser2);
                }
            }
        };
    }

    public static final Object invoke$137(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C928500aGm();
    }

    public static final Object invoke$138(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C955390ay9();
    }

    public static final Object invoke$139(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new MultiCoHostWindowManager();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$14(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$140(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Boolean.TRUE;
    }

    public static final Object invoke$141(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Boolean.TRUE;
    }

    public static final Object invoke$142(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Boolean.TRUE;
    }

    public static final Object invoke$143(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C961510b81();
    }

    public static final Object invoke$144(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new Object() { // from class: X.0b0p
        };
    }

    public static final Object invoke$145(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C941290abP(null, false, 14);
    }

    public static final Object invoke$146(AFwS203S0000000_15 aFwS203S0000000_15) {
        Map mapLJJJ = C955400ayA.LJJJ("cohost_panel");
        if (mapLJJJ != null) {
            C955400ayA.LLIILII("livesdk_connection_preference_entrace_show", mapLJJJ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$147(AFwS203S0000000_15 aFwS203S0000000_15) {
        final IMultiHostService iMultiHostServiceLJII = C915980Zwa.LJII();
        final InterfaceC952240at4 interfaceC952240at4LJI = C915980Zwa.LJI();
        return new InterfaceC957070b0r(iMultiHostServiceLJII, interfaceC952240at4LJI) { // from class: X.0awm
            public final InterfaceC950040apW LIZ;
            public final InterfaceC952240at4 LIZIZ;

            /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x009d  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00a5 A[PHI: r9
              0x00a5: PHI (r9v2 long) = (r9v1 long), (r9v5 long) binds: [B:45:0x00a2, B:22:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.InterfaceC957070b0r
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LIZ(com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupMessage r22) {
                /*
                    r21 = this;
                    com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTeamPairSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTeamPairSetting.INSTANCE
                    boolean r0 = r0.isEnable()
                    java.lang.String r2 = "TeamPairStep3InvitationHandler"
                    r9 = 0
                    if (r0 != 0) goto L11
                    java.lang.String r0 = "LiveMatchTeamPairSetting is not enabled. skip"
                    X.C20441214yg.LJIIIZ(r2, r0)
                    return r9
                L11:
                    r4 = r22
                    com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent r3 = r4.businessContent
                    r0 = 0
                    if (r3 == 0) goto Lac
                    webcast.im.CohostContent r3 = r3.cohostContent
                    if (r3 == 0) goto Lac
                    webcast.im.JoinGroupBizContent r3 = r3.joinGroupBizContent
                    if (r3 == 0) goto Lac
                    webcast.im.JoinGroupMessageExtra r3 = r3.joinGroupMsgExtra
                    if (r3 == 0) goto Lac
                    long r7 = r3.sourceType
                    r5 = 59
                    int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                    r16 = 1
                    if (r3 != 0) goto Lac
                    java.lang.String r3 = "autoAgreeTeamPairInvite"
                    X.C20441214yg.LJIIIZ(r2, r3)
                    tikcast.linkmic.common.GroupPlayer r5 = r4.joinUser
                    if (r5 == 0) goto La0
                    com.bytedance.android.livesdk.model.message.linkcore.Player r3 = r5.user
                    if (r3 == 0) goto La0
                    long r9 = r3.uid
                L3e:
                    com.bytedance.android.livesdk.model.message.linkcore.Player r3 = r5.user
                    if (r3 == 0) goto La5
                    long r7 = r3.roomId
                L44:
                    long r11 = r5.channelId
                L46:
                    com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage r3 = r4.linkLayerMessage
                    webcast.im.JoinGroupContent r3 = r3.joinGroupContent
                    if (r3 == 0) goto L9d
                    tikcast.linkmic.common.GroupChannelAllUser r3 = r3.groupUser
                    if (r3 == 0) goto L9d
                    long r13 = r3.groupChannelId
                L52:
                    com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent r3 = r4.businessContent
                    if (r3 == 0) goto L9b
                    webcast.im.CohostContent r3 = r3.cohostContent
                    if (r3 == 0) goto L9b
                    webcast.im.JoinGroupBizContent r4 = r3.joinGroupBizContent
                L5c:
                    com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinReplyBizContent r3 = new com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinReplyBizContent
                    r15 = 0
                    r6 = 0
                    java.lang.String r5 = ""
                    r3.<init>(r6, r5, r6)
                    if (r4 == 0) goto L6d
                    webcast.im.JoinGroupMessageExtra r4 = r4.joinGroupMsgExtra
                    if (r4 == 0) goto L6d
                    long r0 = r4.sourceType
                L6d:
                    int r4 = (int) r0
                    r3.sourceType = r4
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    java.lang.String r1 = "auto_reply_team_pair_invite"
                    r0.add(r1)
                    r20 = 416(0x1a0, float:5.83E-43)
                    X.0ahj r5 = new X.0ahj
                    r17 = r15
                    r18 = r3
                    r19 = r0
                    r5.<init>(r6, r7, r9, r11, r13, r15, r16, r17, r18, r19, r20)
                    java.lang.String r0 = "send reply request"
                    X.C20441214yg.LIZIZ(r2, r0)
                    r0 = r21
                    X.0apW r2 = r0.LIZ
                    X.0axK r1 = new X.0axK
                    r1.<init>()
                    X.0ZvQ r0 = X.C915260ZvQ.LIZ
                    r2.LLILZIL(r5, r1, r0)
                    return r16
                L9b:
                    r4 = 0
                    goto L5c
                L9d:
                    r13 = 0
                    goto L52
                La0:
                    r9 = 0
                    if (r5 == 0) goto La5
                    goto L3e
                La5:
                    r7 = 0
                    if (r5 != 0) goto L44
                    r11 = 0
                    goto L46
                Lac:
                    java.lang.String r0 = "Not a TeamPair invitation. skip"
                    X.C20441214yg.LJIIIZ(r2, r0)
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C954540awm.LIZ(com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupMessage):boolean");
            }

            {
                this.LIZ = iMultiHostServiceLJII;
                this.LIZIZ = interfaceC952240at4LJI;
            }
        };
    }

    public static final Object invoke$148(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new LiveHostCrossRoomEventHelper();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$149(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$15(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$150(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$151(AFwS203S0000000_15 aFwS203S0000000_15) {
        return LivePitayaEnv.LJIIL();
    }

    public static final Object invoke$152(AFwS203S0000000_15 aFwS203S0000000_15) {
        C766270U4b.LIZLLL(2131854211);
        return Unit.LIZ;
    }

    public static final Object invoke$153(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C938050aWB();
    }

    public static final Object invoke$154(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new LinkedHashMap();
    }

    public static final Object invoke$155(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new LinkedList();
    }

    public static final Object invoke$156(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new LinkedHashMap();
    }

    public static final Object invoke$157(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new LinkedHashMap();
    }

    public static final Object invoke$158(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new InterfaceC964770bDH() { // from class: X.0a5q
            @Override // X.InterfaceC964770bDH
            public final void LIZ(long j, C1AZU c1azu) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJFF(C954780axA c954780axA) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJII(long j, C1AZU c1azu, C969700bLE c969700bLE) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJIIJ(String str, C1AZU c1azu, C2231141CUe c2231141CUe) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJIIJJI(String str, SurfaceView surfaceView) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJIIZILJ(String str, SurfaceView surfaceView) {
            }

            @Override // X.InterfaceC964770bDH
            @InterfaceC1294060jmO
            public final void LJJ(Map<String, String> map) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJI(long j, C1AZU c1azu) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJIFFI(int i, int i2, int i3) {
            }

            @Override // X.InterfaceC964770bDH
            @InterfaceC1294060jmO
            public final void LJJIIJ(List<LinkUser> list, List<LinkUser> list2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJIIZI(String str, String str2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJIJIIJIL(String str, boolean z) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJIL(String str, boolean z) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJIZ(String str, long j) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJ() {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJJ() {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJJJ(String str, float f, float f2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJJJL(int i, C965030bDh c965030bDh) {
            }

            @Override // X.InterfaceC964770bDH
            @InterfaceC1294060jmO
            public final void LJJJJZ(List<LinkUser> list, List<LinkUser> list2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJJZI(C954780axA c954780axA) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJLIIL(JoinGroupDirectIMModel joinGroupDirectIMModel) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJLL(C954780axA c954780axA) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJLZIJ(Map<String, MicPositionContentInfo> map) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJZ(int i, String str) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLIIIJ() {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLIIIJILLIZJL(Avatar avatar, String str) {
            }

            @Override // X.InterfaceC964770bDH
            @InterfaceC1294060jmO
            public final void LJJLIIIJJIZ(String str) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLIIIJLJLI() {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLIL() {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLJLI(C966020bFI c966020bFI, ListChangeMessage listChangeMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLL(int i, int i2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJZZI(C965210bDz c965210bDz) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJL(InterfaceC954180awC interfaceC954180awC, P2PGroupChangeMessage p2PGroupChangeMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLI(InterfaceC954180awC interfaceC954180awC, ReplyInviteGroupMessage replyInviteGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLIIIL(InterfaceC954180awC interfaceC954180awC, InviteGroupMessage inviteGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLILLLLZI(InterfaceC954180awC interfaceC954180awC, DestroyChannelMessage destroyChannelMessage, Integer num, Integer num2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLJI(InterfaceC954180awC interfaceC954180awC, C949400aoU c949400aoU) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLJJI(InterfaceC954180awC interfaceC954180awC, boolean z, LinkCoreError linkCoreError) {
            }

            @Override // X.InterfaceC964770bDH
            public final InterfaceC965500bES LJLJJLL(InterfaceC954180awC interfaceC954180awC) {
                return null;
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLJL(InterfaceC954180awC interfaceC954180awC, RtcStartResultMessage rtcStartResultMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLJLLL(int i, InterfaceC954180awC interfaceC954180awC) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLL(InterfaceC954180awC interfaceC954180awC, PermitApplyGroupMessage permitApplyGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLLILLLL(InterfaceC954180awC interfaceC954180awC) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLLL(InterfaceC954180awC interfaceC954180awC) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLLLL(InterfaceC954180awC interfaceC954180awC, String str) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLLLLLL(InterfaceC954180awC interfaceC954180awC, ReplyInviteMessage replyInviteMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJZI(InterfaceC954180awC interfaceC954180awC, JoinRoomDirectMessage joinRoomDirectMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LL(InterfaceC954180awC interfaceC954180awC, LinkCoreError linkCoreError) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLFZ(InterfaceC954180awC interfaceC954180awC, LeaveGroupMessage leaveGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIII(InterfaceC954180awC interfaceC954180awC, GroupChangeMessage groupChangeMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIIILZ(InterfaceC954180awC interfaceC954180awC, String str) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIIJ(InterfaceC954180awC interfaceC954180awC, ApplyMessage applyMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIIZ(InterfaceC954180awC interfaceC954180awC, int i) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIL(InterfaceC954180awC interfaceC954180awC, DirectJoinMessage directJoinMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIILZL() {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIL(List<LinkUser> list) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLILLIZIL(InterfaceC954180awC interfaceC954180awC, CancelInviteGroupMessage cancelInviteGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLILLJJLI(InterfaceC954180awC interfaceC954180awC, InviteMessage inviteMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIZLLLIL(InterfaceC954180awC interfaceC954180awC, String str, String str2) {
            }

            @Override // X.InterfaceC964770bDH
            @InterfaceC1294060jmO
            public final void LLJI(String str, boolean z, boolean z2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJIJIL(InterfaceC954180awC interfaceC954180awC, CancelApplyMessage cancelApplyMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJJIJIIJIL(InterfaceC954180awC interfaceC954180awC, KickOutMessage kickOutMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJJJJ(InterfaceC954180awC interfaceC954180awC, CreateChannelMessage createChannelMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJJL(InterfaceC954180awC interfaceC954180awC, InviteMessage inviteMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJLLIL(InterfaceC954180awC interfaceC954180awC, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJZ(InterfaceC954180awC interfaceC954180awC, int i, int i2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLL(InterfaceC954180awC interfaceC954180awC, int i, C967130bH5 c967130bH5, String str, CustomLinkMessage customLinkMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLFFI(InterfaceC954180awC interfaceC954180awC, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLII(InterfaceC954180awC interfaceC954180awC, LinkUser linkUser, CustomLinkMessage customLinkMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLIIII(long j, InterfaceC954180awC interfaceC954180awC) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLIIL(InterfaceC954180awC interfaceC954180awC, String str, String str2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLIILIL(InterfaceC954180awC interfaceC954180awC, CancelApplyGroupMessage cancelApplyGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            @InterfaceC1294060jmO
            public final void LLLIL(LinkLayerRTCMessage linkLayerRTCMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLILZJ(InterfaceC954180awC interfaceC954180awC) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLL(InterfaceC954180awC interfaceC954180awC, PermitApplyMessage permitApplyMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLIL(InterfaceC954180awC interfaceC954180awC, CancelInviteMessage cancelInviteMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLIL(InterfaceC954180awC interfaceC954180awC, LeaveMessage leaveMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLJ(InterfaceC954180awC interfaceC954180awC, PermitApplyMessage permitApplyMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLL(InterfaceC954180awC interfaceC954180awC, ReplyInviteMessage replyInviteMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLLLL(List<InteractAudioVolumeInfo> list) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLZZ(InterfaceC954180awC interfaceC954180awC, ApplyGroupMessage applyGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLZ(String str) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJIJJLI(String str, boolean z) {
                C920460a3o.LJFF("voice_chat_guest");
            }
        };
    }

    public static final Object invoke$159(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C922540a7A();
    }

    public static final Object invoke$16(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C944640ago();
    }

    public static final Object invoke$160(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C916490ZxP.LIZJ();
    }

    public static final Object invoke$161(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new FansRequiredInterceptor();
    }

    public static /* bridge */ /* synthetic */ Object invoke$162(AFwS203S0000000_15 aFwS203S0000000_15) {
        return "";
    }

    public static final Object invoke$163(AFwS203S0000000_15 aFwS203S0000000_15) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(SettingsManager.INSTANCE.getIntValue(TopLiveExitAnimSnapshotRefTypeSetting.class));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return 1;
        }
        return c098200Yq;
    }

    public static final Object invoke$164(AFwS203S0000000_15 aFwS203S0000000_15) {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        CoHostInviteListPerformanceConfigs coHostInviteListPerformanceConfigs = CoHostInviteListPerformanceSetting.DEFAULT;
        Object valueSafely = settingsManager.getValueSafely("live_interactive_page_perf_config", coHostInviteListPerformanceConfigs);
        if (valueSafely != null) {
            return valueSafely;
        }
        return coHostInviteListPerformanceConfigs;
    }

    public static final Object invoke$165(AFwS203S0000000_15 aFwS203S0000000_15) {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        CoHostInviteListPreloadConfigs coHostInviteListPreloadConfigs = CoHostInviteListPreloadSetting.DEFAULT;
        Object valueSafely = settingsManager.getValueSafely("live_cohost_list_cache_rivals_config_android", coHostInviteListPreloadConfigs);
        if (valueSafely != null) {
            return valueSafely;
        }
        return coHostInviteListPreloadConfigs;
    }

    public static final Object invoke$166(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue("live_match_playbooks_guidance_enabled", LiveMatchPlaybooksGuidanceSetting.DEFAULT));
    }

    public static final Object invoke$167(AFwS203S0000000_15 aFwS203S0000000_15) {
        Object objFromJson;
        String customOriginalValue = SettingsManager.INSTANCE.getCustomOriginalValue("livesdk_ls_watch_linkmic_settings");
        if (customOriginalValue == null || (objFromJson = GsonProtectorUtils.fromJson(C19748512Ol.LIZIZ, customOriginalValue, new TypeToken<Map<String, ? extends k>>() { // from class: X.00VW
        }.getType())) == null) {
            return LivesdkLsWatchLinkmicSettingsSetting.DEFAULT;
        }
        return objFromJson;
    }

    public static final Object invoke$168(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Boolean.FALSE;
    }

    public static final Object invoke$169(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Boolean.FALSE;
    }

    public static final Object invoke$17(AFwS203S0000000_15 aFwS203S0000000_15) {
        return ((ILiveDanceService) C1161920gLG.LIZJ(ILiveDanceService.class)).Yo1();
    }

    public static final Object invoke$170(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Boolean.FALSE;
    }

    public static final Object invoke$171(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Boolean.FALSE;
    }

    public static final Object invoke$172(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Boolean.FALSE;
    }

    public static final Object invoke$173(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Boolean.FALSE;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$174(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$175(AFwS203S0000000_15 aFwS203S0000000_15) {
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLILZLL, 10));
        Iterator<C954460awe> it2 = listLLILZLL.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().LJ));
        }
        return C13LP.LLIIJI(arrayList);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$176(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$177(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$178(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new NetworkStateTipsHelperManager();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$179(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$18(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Boolean.TRUE;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$180(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$181(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C970560bMc();
    }

    public static final Object invoke$182(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C970490bMV();
    }

    public static final Object invoke$183(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new Object() { // from class: X.0bMi
        };
    }

    public static final Object invoke$184(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C970450bMR();
    }

    public static final Object invoke$185(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new Object() { // from class: X.0bMj
        };
    }

    public static final Object invoke$186(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new Object() { // from class: X.0bMk
        };
    }

    public static final Object invoke$187(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C970310bMD();
    }

    public static final Object invoke$188(AFwS203S0000000_15 aFwS203S0000000_15) {
        C20441214yg.LJ("CompetitionAnchorLauncher", "handleCatchBeanCapsuleGuide checkMatchPermission failed ");
        return Unit.LIZ;
    }

    public static final Object invoke$189(AFwS203S0000000_15 aFwS203S0000000_15) {
        C20441214yg.LJ("CompetitionAnchorLauncher", "show1V1MatchPanel checkMatchPermission failed ");
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$19(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$190(AFwS203S0000000_15 aFwS203S0000000_15) {
        C20441214yg.LJ("CompetitionAnchorLauncher", "handleInitFromCompetitionAction, checkMatchPermission failed ");
        return Unit.LIZ;
    }

    public static final Object invoke$191(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C11NJ();
    }

    public static final Object invoke$192(AFwS203S0000000_15 aFwS203S0000000_15) {
        C20441214yg.LJ("CompetitionAnchorLauncher", "show1V1MatchPanel checkMatchPermission failed ");
        return Unit.LIZ;
    }

    public static final Object invoke$193(AFwS203S0000000_15 aFwS203S0000000_15) {
        C20441214yg.LIZLLL("not set cancel callback");
        return Unit.LIZ;
    }

    public static final Object invoke$194(AFwS203S0000000_15 aFwS203S0000000_15) {
        C20441214yg.LIZLLL("not set cancel callback");
        return Unit.LIZ;
    }

    public static final Object invoke$195(AFwS203S0000000_15 aFwS203S0000000_15) {
        C20441214yg.LJ("CompetitionAnchorLauncher", "showCombinedMatchPanel, checkMatchPermission failed ");
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$196(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$197(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$198(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$199(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$2(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$20(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C1819620xS4.LIZ();
    }

    public static final Object invoke$200(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C920330a3b();
    }

    public static final Object invoke$201(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Boolean.valueOf(LinkMicToolbarIconSetting.INSTANCE.opt());
    }

    public static final /* bridge */ /* synthetic */ Object invoke$202(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$203(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C927600aFK();
    }

    public static final Object invoke$204(AFwS203S0000000_15 aFwS203S0000000_15) {
        C766270U4b.LIZLLL(2131854211);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$205(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$206(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Long.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$207(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new HashMap();
    }

    public static final Object invoke$208(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ArrayList();
    }

    public static final Object invoke$209(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new AbstractC923560a8o<LinkPlayerInfo, MultiLiveGuestInfoList>() { // from class: X.0a7p
            @Override // X.AbstractC923560a8o
            public final void LJFF(MultiLiveGuestInfoList multiLiveGuestInfoList) {
                MultiLiveGuestInfoList multiLiveGuestInfoList2 = multiLiveGuestInfoList;
                for (LinkPlayerInfo linkPlayerInfo : multiLiveGuestInfoList2.onLineUsers) {
                    linkPlayerInfo.LIZ = 2;
                    LJ().add(linkPlayerInfo);
                }
                for (LinkPlayerInfo linkPlayerInfo2 : multiLiveGuestInfoList2.waitingUsers) {
                    linkPlayerInfo2.LIZ = 1;
                    ((List) this.LIZLLL.getValue()).add(linkPlayerInfo2);
                }
            }
        };
    }

    public static final Object invoke$21(AFwS203S0000000_15 aFwS203S0000000_15) {
        C915980Zwa.LJIIIZ().LIZIZ(EnumC959750b5B.TYPE_INVITEE_LIST_DIALOG, null);
        return Unit.LIZ;
    }

    public static final Object invoke$210(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new InterfaceC922980a7s() { // from class: X.0a7t
            @Override // X.InterfaceC922980a7s
            public final void LIZ() {
            }

            @Override // X.InterfaceC922980a7s
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC922980a7s
            public final void LIZJ() {
            }

            @Override // X.InterfaceC922980a7s
            public final void dispose() {
            }
        };
    }

    public static final Object invoke$211(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new AbstractC923560a8o<LinkListUser, LinkMessage>() { // from class: X.0a7q
            @Override // X.AbstractC923560a8o
            public final void LJFF(LinkMessage linkMessage) {
                LinkMessage linkMessage2 = linkMessage;
                for (LinkListUser linkListUser : linkMessage2.mListChangeContent.onLineUsers) {
                    linkListUser.LIZ = 2;
                    LJ().add(linkListUser);
                }
                for (LinkListUser linkListUser2 : linkMessage2.mListChangeContent.waitingUsers) {
                    linkListUser2.LIZ = 1;
                    ((List) this.LIZLLL.getValue()).add(linkListUser2);
                }
            }
        };
    }

    public static final Object invoke$212(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ArrayList();
    }

    public static final Object invoke$213(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ArrayList();
    }

    public static final Object invoke$214(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ArrayList();
    }

    public static final Object invoke$215(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ArrayList();
    }

    public static final Object invoke$216(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ArrayList();
    }

    public static final Object invoke$217(AFwS203S0000000_15 aFwS203S0000000_15) {
        C973660bRc.LIZ.LJLJI(0, false, false, null);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$218(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$219(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new HashMap();
    }

    public static final Object invoke$22(AFwS203S0000000_15 aFwS203S0000000_15) {
        long jMatchNvNLayoutId;
        if (C1ACJ.LIZIZ()) {
            jMatchNvNLayoutId = LiveMatchLayoutIdConfig.INSTANCE.matchNvNCropLayoutId();
        } else {
            jMatchNvNLayoutId = LiveMatchLayoutIdConfig.INSTANCE.matchNvNLayoutId();
        }
        return Long.valueOf(jMatchNvNLayoutId);
    }

    public static final Object invoke$220(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new HashMap();
    }

    public static final Object invoke$221(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new CopyOnWriteArrayList();
    }

    public static final Object invoke$222(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ConcurrentHashMap();
    }

    public static final Object invoke$223(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ConcurrentHashMap();
    }

    public static final Object invoke$224(AFwS203S0000000_15 aFwS203S0000000_15) {
        C975400bUQ.LIZIZ(true);
        return Unit.LIZ;
    }

    public static final Object invoke$225(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C1161920gLG.LIZJ(ILiveCompetitionExternalService.class);
    }

    public static final Object invoke$226(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C1161920gLG.LIZJ(ILiveCompetitionInternalService.class);
    }

    public static final Object invoke$227(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C1161920gLG.LIZJ(IGiftService.class);
    }

    public static final Object invoke$228(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C1161920gLG.LIZJ(IInteractService.class);
    }

    public static final Object invoke$229(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C1161920gLG.LIZJ(IMatchAICommentaryService.class);
    }

    public static final Object invoke$23(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new BDDateFormat("ll-Y");
    }

    public static final Object invoke$230(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C1161920gLG.LIZJ(ILiveMatchService.class);
    }

    public static final Object invoke$231(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new InterfaceC952240at4() { // from class: X.0bAI
            public static final boolean LIZIZ;
            public static final boolean LIZJ;
            public static boolean LIZLLL;
            public static final AbstractSet<InterfaceC915230ZvN> LJ;
            public static final C959210b4J LJFF;
            public static final C0JGG LJI;
            public static final C156800is LJII;
            public static final C962930bAJ LJIIIIZZ;
            public static final MatchSettingRepository LJIIIZ;

            @Override // X.InterfaceC952240at4
            public final InterfaceC955420ayC LIZ() {
                C959210b4J c959210b4J;
                LJIILJJIL(false);
                if (!LIZIZ) {
                    return C978620bZc.LIZ;
                }
                synchronized (this) {
                    c959210b4J = LJFF;
                }
                return c959210b4J;
            }

            @Override // X.InterfaceC952240at4
            public final InterfaceC944340agK LIZJ() {
                C0JGG c0jgg;
                LJIILJJIL(false);
                if (!LIZIZ) {
                    return C470440Icc.LIZ;
                }
                synchronized (this) {
                    c0jgg = LJI;
                }
                return c0jgg;
            }

            @Override // X.InterfaceC952240at4
            public final InterfaceC955780aym LJIIJ() {
                return LJIIJJI(false);
            }

            /* JADX WARN: Removed duplicated region for block: B:42:0x00d7  */
            static {
                /*
                    Method dump skipped, instruction units count: 218
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C962920bAI.<clinit>():void");
            }

            @Override // X.InterfaceC952240at4
            public final void LJII() {
                C156800is c156800is = LJII;
                c156800is.LIZ = null;
                c156800is.LJJIJL(null);
                c156800is.LIZLLL = null;
                c156800is.LJ = null;
                c156800is.LJFF.postValue(null);
                c156800is.LJI = c156800is.LJFF;
                c156800is.LJII = 0L;
                c156800is.LJIIJJI = null;
                c156800is.LJIIL = 0L;
                c156800is.LJJIII(0);
                C962930bAJ c962930bAJ = LJIIIIZZ;
                c962930bAJ.getClass();
                c962930bAJ.LIZ = C13BV.INSTANCE;
                c962930bAJ.LIZIZ = null;
                c962930bAJ.LJIILIIL = false;
                ((LinkedHashMap) c962930bAJ.LIZLLL).clear();
                c962930bAJ.LJ = false;
                MatchSettingRepository matchSettingRepository = LJIIIZ;
                matchSettingRepository.LJFF = null;
                matchSettingRepository.LIZJ = 0L;
                matchSettingRepository.LIZ.postValue(null);
                matchSettingRepository.LIZLLL.postValue(0);
            }

            @Override // X.InterfaceC952240at4
            public final InterfaceC955970az5 LJIIIZ() {
                return LIZIZ ? C959220b4K.LIZ : new InterfaceC955970az5() { // from class: X.0b4L
                    @Override // X.InterfaceC955970az5
                    public final Set<Long> LIZ() {
                        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
                        return LinkCrossRoomDataHolder.LJLLL;
                    }

                    @Override // X.InterfaceC955970az5
                    public final Rect LIZLLL() {
                        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
                        return LinkCrossRoomDataHolder.LJLLJ;
                    }

                    @Override // X.InterfaceC955970az5
                    public final void LJ() {
                        LinkCrossRoomDataHolder.LJLLILLLL = 0L;
                    }

                    @Override // X.InterfaceC955970az5
                    public final Rect LJIIIIZZ() {
                        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
                        return LinkCrossRoomDataHolder.LJLZ;
                    }

                    @Override // X.InterfaceC955970az5
                    public final long LJIIIZ() {
                        return LinkCrossRoomDataHolder.LJLLILLLL;
                    }

                    @Override // X.InterfaceC955970az5
                    public final void LIZIZ(Rect rect) {
                        LinkCrossRoomDataHolder.LJLLJ = rect;
                    }

                    @Override // X.InterfaceC955970az5
                    public final void LJFF(Rect rect) {
                        if (LinkCrossRoomDataHolder.LJLZ == null) {
                            int i = C956370azj.LIZ;
                            int iWidth = rect.width();
                            int i2 = C956370azj.LIZ;
                            if (iWidth <= C956370azj.LIZIZ && i2 <= iWidth) {
                                LinkCrossRoomDataHolder.LJLZ = rect;
                            }
                        }
                    }

                    @Override // X.InterfaceC955970az5
                    public final void LJI(long j) {
                        LinkCrossRoomDataHolder.LJLLL.add(Long.valueOf(j));
                    }

                    @Override // X.InterfaceC955970az5
                    public final CohostABInfo LJII(long j) {
                        return LinkCrossRoomDataHolder.LJLLLLLL.get(Long.valueOf(j));
                    }

                    @Override // X.InterfaceC955970az5
                    public final void LIZJ(long j, CohostABInfo cohostABInfo) {
                        LinkCrossRoomDataHolder.LJLLLLLL.put(Long.valueOf(j), cohostABInfo);
                    }
                };
            }

            public final InterfaceC955420ayC LJIILIIL() {
                C959210b4J c959210b4J;
                if (!LIZIZ) {
                    return C978620bZc.LIZ;
                }
                synchronized (this) {
                    c959210b4J = LJFF;
                }
                return c959210b4J;
            }

            @Override // X.InterfaceC952240at4
            public final InterfaceC975810bV5 LIZLLL() {
                return LJII;
            }

            @Override // X.InterfaceC952240at4
            public final InterfaceC975870bVB LJFF() {
                return LJIIIIZZ;
            }

            @Override // X.InterfaceC952240at4
            public final InterfaceC978510bZR LJI() {
                return LJIIIZ;
            }

            public static void LJIILL(String str) {
                List<Integer> list;
                List<Integer> list2;
                boolean zLJJIIJZLJL = u.LJJIIJZLJL(str, "forceClear_", false);
                if (!zLJJIIJZLJL) {
                    list = LJFF.LJJLJLI;
                    list2 = LJFF.LJJLL;
                } else {
                    list = C13BV.INSTANCE;
                    list2 = C13BV.INSTANCE;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("resetInternal, source=");
                sbLIZ.append(str);
                sbLIZ.append(", anchorData=");
                C959210b4J c959210b4J = LJFF;
                sbLIZ.append(c959210b4J.hashCode());
                sbLIZ.append(", audienceData=");
                C0JGG c0jgg = LJI;
                sbLIZ.append(c0jgg.hashCode());
                C20441214yg.LJ("MultiHostDataRepo", C2188811AlT.LIZIZ(sbLIZ));
                if (LiveCoHostDataHolderRefactorResetOptSetting.INSTANCE.isEnable()) {
                    if (LIZLLL) {
                        c959210b4J.LLLIIIIL(str);
                    } else {
                        c0jgg.LLLIIIIL(str);
                    }
                } else {
                    c959210b4J.LLLIIIIL(str);
                    c0jgg.LLLIIIIL(str);
                }
                if (!zLJJIIJZLJL) {
                    c959210b4J.LJJLJLI = list;
                    c959210b4J.LJJLL = list2;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("resetInternal preserved preference tags source=");
                    sbLIZ2.append(str);
                    sbLIZ2.append(" current=");
                    sbLIZ2.append(list);
                    sbLIZ2.append(" available=");
                    sbLIZ2.append(list2);
                    C20441214yg.LJIIIZ("MultiHostDataRepo", C2188811AlT.LIZIZ(sbLIZ2));
                }
            }

            @Override // X.InterfaceC952240at4
            public final void LIZIZ(String str) {
                if (LIZIZ) {
                    if (LIZJ) {
                        AbstractSet<InterfaceC915230ZvN> abstractSet = LJ;
                        if (abstractSet.size() != 0) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("reset, source=");
                            sbLIZ.append(str);
                            sbLIZ.append(", checkDataActive = true binderSet.size=");
                            sbLIZ.append(abstractSet.size());
                            C20441214yg.LJ("MultiHostDataRepo", C2188811AlT.LIZIZ(sbLIZ));
                            return;
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("reset, source=");
                        sbLIZ2.append(str);
                        sbLIZ2.append(", checkDataActive = false, anchorData=");
                        sbLIZ2.append(LJFF.hashCode());
                        sbLIZ2.append(", audienceData=");
                        sbLIZ2.append(LJI.hashCode());
                        C20441214yg.LJ("MultiHostDataRepo", C2188811AlT.LIZIZ(sbLIZ2));
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("reset_");
                        sbLIZ3.append(str);
                        LJIILL(C2188811AlT.LIZIZ(sbLIZ3));
                        return;
                    }
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("reset_");
                    sbLIZ4.append(str);
                    LJIILL(C2188811AlT.LIZIZ(sbLIZ4));
                    return;
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("reset, source=");
                sbLIZ5.append(str);
                sbLIZ5.append(", isRefactor = false");
                C20441214yg.LJ("MultiHostDataRepo", C2188811AlT.LIZIZ(sbLIZ5));
                LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
                C464550IJp.LIZIZ().LIZJ(str);
            }

            @Override // X.InterfaceC952240at4
            public final boolean LJ(InterfaceC915230ZvN interfaceC915230ZvN) {
                if (!LIZJ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("removeBinder, isRefactor = false, scene=");
                    sbLIZ.append(interfaceC915230ZvN.scene());
                    sbLIZ.append(", hashcode=");
                    sbLIZ.append(interfaceC915230ZvN.hashCode());
                    C20441214yg.LJ("MultiHostDataRepo", C2188811AlT.LIZIZ(sbLIZ));
                    return false;
                }
                AbstractSet<InterfaceC915230ZvN> abstractSet = LJ;
                if (abstractSet.contains(interfaceC915230ZvN)) {
                    abstractSet.remove(interfaceC915230ZvN);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("removeBinder, observer exit, scene=");
                    sbLIZ2.append(interfaceC915230ZvN.scene());
                    sbLIZ2.append(", hashcode=");
                    sbLIZ2.append(interfaceC915230ZvN.hashCode());
                    C20441214yg.LJ("MultiHostDataRepo", C2188811AlT.LIZIZ(sbLIZ2));
                    if (abstractSet.size() == 0) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("removeBinder_scene=");
                        sbLIZ3.append(interfaceC915230ZvN.scene());
                        LJIILL(C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    return true;
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("removeBinder, observer not exit, scene=");
                sbLIZ4.append(interfaceC915230ZvN.scene());
                sbLIZ4.append(", hashcode=");
                sbLIZ4.append(interfaceC915230ZvN.hashCode());
                C20441214yg.LJ("MultiHostDataRepo", C2188811AlT.LIZIZ(sbLIZ4));
                return false;
            }

            @Override // X.InterfaceC952240at4
            public final void LJIIIIZZ(String str) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("forceClear, source=");
                sbLIZ.append(str);
                sbLIZ.append(", binderSet.size=");
                AbstractSet<InterfaceC915230ZvN> abstractSet = LJ;
                sbLIZ.append(abstractSet.size());
                sbLIZ.append(", anchorData=");
                sbLIZ.append(LJFF.hashCode());
                sbLIZ.append(", audienceData=");
                sbLIZ.append(LJI.hashCode());
                C20441214yg.LJIIIZ("MultiHostDataRepo", C2188811AlT.LIZIZ(sbLIZ));
                abstractSet.clear();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("forceClear_");
                sbLIZ2.append(str);
                LJIILL(C2188811AlT.LIZIZ(sbLIZ2));
            }

            @Override // X.InterfaceC952240at4
            public final InterfaceC955780aym LJIIJJI(boolean z) {
                C0JGG c0jgg;
                LJIILJJIL(z);
                if (LIZLLL) {
                    return LJIILIIL();
                }
                if (LIZIZ) {
                    synchronized (this) {
                        c0jgg = LJI;
                    }
                    return c0jgg;
                }
                return C470440Icc.LIZ;
            }

            @Override // X.InterfaceC952240at4
            public final boolean LJIIL(InterfaceC915230ZvN interfaceC915230ZvN) {
                if (!LIZJ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("addBinder, isRefactor = false, scene=");
                    sbLIZ.append(interfaceC915230ZvN.scene());
                    sbLIZ.append(", hashcode=");
                    sbLIZ.append(interfaceC915230ZvN.hashCode());
                    C20441214yg.LJ("MultiHostDataRepo", C2188811AlT.LIZIZ(sbLIZ));
                    return false;
                }
                AbstractSet<InterfaceC915230ZvN> abstractSet = LJ;
                if (!abstractSet.contains(interfaceC915230ZvN)) {
                    abstractSet.add(interfaceC915230ZvN);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("addBinder, observer not exit, scene=");
                    sbLIZ2.append(interfaceC915230ZvN.scene());
                    sbLIZ2.append(", hashcode=");
                    sbLIZ2.append(interfaceC915230ZvN.hashCode());
                    C20441214yg.LJ("MultiHostDataRepo", C2188811AlT.LIZIZ(sbLIZ2));
                    return true;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("addBinder, observer exit, scene=");
                sbLIZ3.append(interfaceC915230ZvN.scene());
                sbLIZ3.append(", hashcode=");
                sbLIZ3.append(interfaceC915230ZvN.hashCode());
                C20441214yg.LJ("MultiHostDataRepo", C2188811AlT.LIZIZ(sbLIZ3));
                return true;
            }

            public final long LJIILJJIL(boolean z) {
                InterfaceC955780aym interfaceC955780aym;
                if (LIZLLL) {
                    if (z) {
                        C20441214yg.LJIIIZ("MultiHostDataRepo", "getChannelId, isAnchor=true, isFromGetChannelId=true");
                        return 0L;
                    }
                    return C915980Zwa.LJII().getChannelId();
                }
                if (LIZIZ) {
                    synchronized (this) {
                        interfaceC955780aym = LJI;
                    }
                } else {
                    interfaceC955780aym = C470440Icc.LIZ;
                }
                return interfaceC955780aym.getChannelId();
            }

            @Override // X.InterfaceC952240at4
            public final void setIsAnchor(boolean z) {
                LIZLLL = z;
            }
        };
    }

    public static final Object invoke$232(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C1161920gLG.LIZJ(IMultiHostService.class);
    }

    public static final Object invoke$233(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C1161920gLG.LIZJ(IMultiGuestV3InternalServiceV2.class);
    }

    public static final Object invoke$234(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C1161920gLG.LIZJ(IQuickCoHostService.class);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$235(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$236(AFwS203S0000000_15 aFwS203S0000000_15) {
        if (C1ACJ.LIZIZ()) {
            return LiveCoHostLayoutIdConfigSetting.INSTANCE.getValue().normalExpandCrop;
        }
        return LiveCoHostLayoutIdConfigSetting.INSTANCE.getValue().normalExpand;
    }

    public static final Object invoke$237(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C952390atJ();
    }

    public static final Object invoke$238(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C11NJ();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$239(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$24(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$240(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$241(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$242(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new LinkedList();
    }

    public static final Object invoke$243(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ArrayList();
    }

    public static final Object invoke$244(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ArrayList();
    }

    public static final Object invoke$245(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ArrayList();
    }

    public static final Object invoke$246(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ArrayList();
    }

    public static final Object invoke$247(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ArrayList();
    }

    public static final Object invoke$248(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ArrayList();
    }

    public static final Object invoke$249(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ArrayList();
    }

    public static final Object invoke$25(AFwS203S0000000_15 aFwS203S0000000_15) {
        final IQuickCoHostService iQuickCoHostServiceLJIIIZ = C915980Zwa.LJIIIZ();
        return new InterfaceC956530azz(iQuickCoHostServiceLJIIIZ) { // from class: X.0b44
            public final IQuickCoHostService LIZ;

            public final void LIZJ() {
                EnumC958840b3i enumC958840b3iLJFF = this.LIZ.LJFF();
                EnumC958900b3o enumC958900b3oK0 = this.LIZ.k0();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("QuickCoHostService type=");
                sbLIZ.append(enumC958840b3iLJFF);
                sbLIZ.append(", status=");
                sbLIZ.append(enumC958900b3oK0);
                C20441214yg.LIZIZ("TeamPairQuickCoHostManagerStateSynchronizer", C2188811AlT.LIZIZ(sbLIZ));
            }

            public final void LIZLLL() {
                IQuickCoHostService iQuickCoHostService = this.LIZ;
                if (!(iQuickCoHostService.Jf() && iQuickCoHostService.LJFF() == EnumC958840b3i.TEAM_PAIR)) {
                    LIZJ();
                    C20441214yg.LJIIL("TeamPairQuickCoHostManagerStateSynchronizer", "QuickCoHostService is not in team pair. Skip the quit operation.");
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("quit quick co-host. exitType=");
                EnumC959580b4u enumC959580b4u = EnumC959580b4u.TEAM_PAIR_SYNC_STATE;
                sbLIZ.append(enumC959580b4u);
                C20441214yg.LJIIIZ("TeamPairQuickCoHostManagerStateSynchronizer", C2188811AlT.LIZIZ(sbLIZ));
                this.LIZ.LIZ(enumC959580b4u, null);
            }

            {
                this.LIZ = iQuickCoHostServiceLJIIIZ;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
            @Override // X.InterfaceC956530azz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage r6) {
                /*
                    r5 = this;
                    int r0 = r6.action
                    r4 = 1
                    if (r0 != r4) goto L2d
                    com.bytedance.android.livesdk.model.message.battle.BattleSetting r0 = r6.battleSetting
                    if (r0 == 0) goto L2d
                    int r2 = r0.inviteType
                    int r1 = r0.scene
                    r0 = 2
                    if (r2 != r0) goto L2d
                    if (r1 != r4) goto L2d
                    r0 = 1
                L13:
                    r1 = 3
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
                    java.lang.String r3 = "TeamPairQuickCoHostManagerStateSynchronizer"
                    if (r0 == 0) goto L56
                    com.bytedance.android.live.liveinteract.multihost.biz.quickcohost.service.IQuickCoHostService r0 = r5.LIZ
                    boolean r0 = r0.Jf()
                    if (r0 == 0) goto L2f
                    r5.LIZJ()
                    java.lang.String r0 = "QuickCoHostService is in quick co-host. Skip the start operation."
                    X.C20441214yg.LJIIL(r3, r0)
                    return
                L2d:
                    r0 = 0
                    goto L13
                L2f:
                    X.0aqo r4 = new X.0aqo
                    X.0b4F r1 = new X.0b4F
                    r1.<init>()
                    r0 = 24
                    r4.<init>(r2, r1, r2, r0)
                    java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "start quick co-host. entranceType="
                    r2.append(r0)
                    X.0b5B r1 = X.EnumC959750b5B.TYPE_TEAM_PAIR_SYNC_STATE
                    r2.append(r1)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
                    X.C20441214yg.LJIIIZ(r3, r0)
                    com.bytedance.android.live.liveinteract.multihost.biz.quickcohost.service.IQuickCoHostService r0 = r5.LIZ
                    r0.LIZIZ(r1, r4)
                    return
                L56:
                    int r0 = r6.action
                    if (r0 != r1) goto L66
                    com.bytedance.android.livesdk.model.message.battle.BattleSetting r0 = r6.battleSetting
                    if (r0 == 0) goto L66
                    int r0 = r0.scene
                    if (r0 != r4) goto L66
                    r5.LIZLLL()
                    return
                L66:
                    java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "unexpected message. id="
                    r2.append(r0)
                    long r0 = r6.getMessageId()
                    r2.append(r0)
                    java.lang.String r0 = ". invite_type="
                    r2.append(r0)
                    com.bytedance.android.livesdk.model.message.battle.BattleSetting r0 = r6.battleSetting
                    if (r0 == 0) goto L90
                    int r0 = r0.inviteType
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                L85:
                    r2.append(r0)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
                    X.C20441214yg.LIZIZ(r3, r0)
                    return
                L90:
                    r0 = 0
                    goto L85
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C959060b44.LIZ(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage):void");
            }

            @Override // X.InterfaceC956530azz
            public final void LIZIZ(C954930axP c954930axP) {
                String str = c954930axP.LIZIZ;
                if (c954930axP.LIZ.size() <= 2 || !Intrinsics.LJFF(str, "im") || !C959920b5S.LIZIZ(c954930axP)) {
                    return;
                }
                C20441214yg.LJIIIZ("TeamPairQuickCoHostManagerStateSynchronizer", "Team pair battle seems started. Try to quit quick co-host.");
                LIZLLL();
            }
        };
    }

    public static final Object invoke$250(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ArrayList();
    }

    public static final Object invoke$251(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new CopyOnWriteArrayList();
    }

    public static final Object invoke$252(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ArrayList();
    }

    public static final Object invoke$253(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ArrayList();
    }

    public static final Object invoke$254(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ArrayList();
    }

    public static final Object invoke$255(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ArrayList();
    }

    public static final Object invoke$256(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new LinkedHashMap();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$257(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$258(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C941290abP(null, false, 14);
    }

    public static final Object invoke$259(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Boolean.TRUE;
    }

    public static final Object invoke$26(AFwS203S0000000_15 aFwS203S0000000_15) {
        final C945130ahb c945130ahb = new C945130ahb();
        final IMultiHostService iMultiHostServiceLJII = C915980Zwa.LJII();
        return new InterfaceC945090ahX(c945130ahb, iMultiHostServiceLJII) { // from class: X.0ahW
            public final C945130ahb LIZ;
            public final InterfaceC950040apW LIZIZ;

            @Override // X.InterfaceC945090ahX
            public final void LIZ(LinkMessage linkMessage) {
                LinkerRandomMatchContent linkerRandomMatchContent;
                long j;
                User user;
                if (linkMessage.messageType == 201 && (linkerRandomMatchContent = linkMessage.randomMatchContent) != null && ((int) linkerRandomMatchContent.sourceType) == 58) {
                    C915980Zwa.LJI().LIZ().LLJJI(C955540ayO.LJJJJLL);
                    LinkerRandomMatchContent linkerRandomMatchContent2 = linkMessage.randomMatchContent;
                    long id = 0;
                    if (linkerRandomMatchContent2 != null) {
                        j = linkerRandomMatchContent2.roomId;
                        user = linkerRandomMatchContent2.user;
                    } else {
                        j = 0;
                        user = null;
                    }
                    final Room room = new Room();
                    room.setId(j);
                    room.setOwner(user);
                    if (user != null) {
                        id = user.getId();
                    }
                    room.setOwnerUserId(id);
                    C955400ayA c955400ayA = C955400ayA.LIZ;
                    C955400ayA.LL(room, EnumC920540a3w.QUICK_LINKMIC.getValue(), null, null, null, null, null, null, null, null, false, 2044);
                    C20441214yg.LIZIZ("TeamPairStep2MatchMessageHandler", "Get TeamPairStep2MatchEvent. Try to join other party's group");
                    this.LIZ.getClass();
                    this.LIZIZ.LJJII(AbstractC945110ahZ.LIZ(linkMessage, ""), new InterfaceC950010apT<C920620a44>() { // from class: X.0a4h
                        @Override // X.InterfaceC950010apT
                        public final void LIZ(C920640a46 c920640a46) {
                            getClass();
                            C20441214yg.LIZIZ("TeamPairStep2MatchMessageHandler", "join group request succeeded");
                            C955400ayA c955400ayA2 = C955400ayA.LIZ;
                            C955400ayA.LLF(room, EnumC920540a3w.QUICK_LINKMIC.getValue(), null, null, null, null, null, false, null, 508);
                        }

                        @Override // X.InterfaceC950010apT
                        public final void LIZIZ(C952350atF c952350atF, Throwable th) {
                            getClass();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("join group request fail. error=");
                            sbLIZ.append(c952350atF);
                            sbLIZ.append(" throwable=");
                            sbLIZ.append(th);
                            C20441214yg.LJ("TeamPairStep2MatchMessageHandler", C2188811AlT.LIZIZ(sbLIZ));
                        }
                    });
                }
            }

            {
                this.LIZ = c945130ahb;
                this.LIZIZ = iMultiHostServiceLJII;
            }
        };
    }

    public static final Object invoke$260(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C11NJ();
    }

    public static final Object invoke$261(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C924250a9v.LIZ();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$262(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$263(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Integer.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).liveId());
    }

    public static final /* bridge */ /* synthetic */ Object invoke$264(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$265(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new JSONObject(MultiGuestLayoutBizViewStyleAudioSetting.INSTANCE.getSettingValue());
    }

    public static final Object invoke$266(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new JSONObject(MultiGuestLayoutBizViewStyleSetting.INSTANCE.getSettingValue());
    }

    public static final Object invoke$267(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new JSONObject(MultiGuestLayoutBizViewStyleGuideSetting.INSTANCE.getSettingValue());
    }

    public static final Object invoke$268(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ArrayList();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$269(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$27(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$270(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$271(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$272(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C924250a9v.LIZ();
    }

    public static final Object invoke$273(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new HashMap();
    }

    public static final Object invoke$274(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new LinkedHashMap();
    }

    public static final Object invoke$275(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new AbstractC920180a3M() { // from class: X.0a3L
            public final C916520ZxS LIZIZ = new C916520ZxS();

            @Override // X.AbstractC920180a3M, X.InterfaceC920200a3O
            public final void LIZLLL(C917100ZyO c917100ZyO) {
                InterfaceC940060aZQ interfaceC940060aZQ;
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                InterfaceC937900aVw interfaceC937900aVwLLIIJLIL = null;
                if (interfaceC954180awCLLJLL != null) {
                    interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL();
                }
                if ((interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) && (interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL) != null) {
                    interfaceC940060aZQ.LIZLLL(c917100ZyO);
                }
            }

            @Override // X.InterfaceC920200a3O
            public final void LJ(InterfaceC920110a3F interfaceC920110a3F) {
                EnlargeScreenManageParams enlargeScreenManageParams = new EnlargeScreenManageParams();
                C914970Zux.LIZ(enlargeScreenManageParams);
                enlargeScreenManageParams.scene = 9;
                C480460Ism.LIZ().getClass();
                C19487311Lz.LIZIZ(((ILayoutServerApi) C480460Ism.LIZLLL(ILayoutServerApi.class)).zoom(enlargeScreenManageParams).LJIILIIL(new C0UO0()), this.LIZ, new AfS184S0100000_15(interfaceC920110a3F, 129), new AfS151S0200000_15(this, interfaceC920110a3F, 34), null, null, 56);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC920180a3M, X.InterfaceC920200a3O
            public final void LIZ(PosIdentity posIdentity, boolean z, boolean z2, InterfaceC920110a3F interfaceC920110a3F) {
                EnlargeScreenManageParams enlargeScreenManageParams = new EnlargeScreenManageParams();
                C914970Zux.LIZ(enlargeScreenManageParams);
                enlargeScreenManageParams.operatedPosition = posIdentity;
                if (z) {
                    if (C940770aaZ.LIZ().getDataSource().LJIJJLI(posIdentity.value)) {
                        C20441214yg.LJ("AnchorLayoutAction", "current spot is already zoomed");
                        return;
                    }
                    List<PosIdentity> listLJIIL = C940770aaZ.LIZ().getDataSource().LJIIL();
                    if (listLJIIL == null) {
                        listLJIIL = C13BV.INSTANCE;
                    }
                    if (listLJIIL.size() > 1) {
                        interfaceC920110a3F.LIZIZ(listLJIIL, new AwS224S0300000_15(enlargeScreenManageParams, this, interfaceC920110a3F, 46));
                        return;
                    }
                    if (listLJIIL.size() == 1 && z2) {
                        enlargeScreenManageParams.replacedPos = C1697810uHb.LJIILJJIL(ListProtector.get(listLJIIL, 0));
                    }
                    enlargeScreenManageParams.scene = 7;
                    LJIILL(interfaceC920110a3F, enlargeScreenManageParams);
                    return;
                }
                C916520ZxS c916520ZxS = this.LIZIZ;
                AwS259S0300000_15 awS259S0300000_15 = new AwS259S0300000_15(enlargeScreenManageParams, this, interfaceC920110a3F, 40);
                c916520ZxS.getClass();
                C916520ZxS.LIZ(awS259S0300000_15);
            }

            @Override // X.InterfaceC920200a3O
            public final void LIZJ(PosIdentity posIdentity, PosIdentity posIdentity2, AwS559S0100000_15 awS559S0100000_15, AwS594S0100000_15 awS594S0100000_15) {
                long id;
                SwitchSpotParams switchSpotParams = new SwitchSpotParams();
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                Room roomLJJLI = C500260Jjc.LJJLI();
                if (roomLJJLI != null) {
                    id = roomLJJLI.getId();
                } else {
                    id = 0;
                }
                switchSpotParams.roomId = id;
                switchSpotParams.channelId = C921180a4y.LJIILL(C915980Zwa.LJIIIIZZ());
                switchSpotParams.fromPos = posIdentity;
                switchSpotParams.toPos = posIdentity2;
                LJIILIIL(switchSpotParams, awS559S0100000_15, awS594S0100000_15);
            }

            @Override // X.InterfaceC920200a3O
            public final void LJFF(int i, int i2, Function1<? super LayoutState, Unit> function1, Function1<? super LinkCoreError, Unit> function12) {
                LayoutUpdateParams layoutUpdateParams = new LayoutUpdateParams();
                AbstractC920180a3M.LJIIIZ(layoutUpdateParams);
                PositionConfig positionConfig = new PositionConfig();
                positionConfig.maxPosition = i2;
                layoutUpdateParams.posConfig = positionConfig;
                layoutUpdateParams.panelLayoutType = i;
                LJIIL(layoutUpdateParams, null, function1, function12);
            }

            @Override // X.InterfaceC920200a3O
            public final void LJII(int i, int i2, Function0<Unit> function0, Function1<? super LinkCoreError, Unit> function1) {
                LayoutUpdateParams layoutUpdateParams = new LayoutUpdateParams();
                AbstractC920180a3M.LJIIIZ(layoutUpdateParams);
                PositionConfig positionConfig = new PositionConfig();
                positionConfig.maxPosition = i2;
                layoutUpdateParams.posConfig = positionConfig;
                layoutUpdateParams.layoutStyle = i;
                LJIIL(layoutUpdateParams, function0, null, function1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC920200a3O
            public final void LJI(String str, boolean z, boolean z2, InterfaceC920110a3F interfaceC920110a3F, C334801Rq c334801Rq) {
                InterfaceC920220a3Q dataSource;
                PosIdentity posIdentityLJIJ;
                MgTraceInfo mgTraceInfoLIZ;
                InterfaceC923120a86 interfaceC923120a86LIZ = C940770aaZ.LIZ();
                if (interfaceC923120a86LIZ != null && (dataSource = interfaceC923120a86LIZ.getDataSource()) != null && (posIdentityLJIJ = dataSource.LJIJ(str)) != null) {
                    EnlargeScreenManageParams enlargeScreenManageParams = new EnlargeScreenManageParams();
                    C914970Zux.LIZ(enlargeScreenManageParams);
                    enlargeScreenManageParams.operatedPosition = posIdentityLJIJ;
                    enlargeScreenManageParams.linkmicId = str;
                    enlargeScreenManageParams.guestUserId = C01HE.LJI(str);
                    if (c334801Rq != null) {
                        mgTraceInfoLIZ = C01IF.LIZ(c334801Rq);
                    } else {
                        mgTraceInfoLIZ = null;
                    }
                    enlargeScreenManageParams.mgTraceInfo = mgTraceInfoLIZ;
                    C920080a3C c920080a3CLJIIJ = AbstractC920180a3M.LJIIJ(interfaceC920110a3F, enlargeScreenManageParams);
                    if (C500260Jjc.LJJIFFI(Boolean.valueOf(C940770aaZ.LIZ().getDataSource().LJIJJLI(str)))) {
                        List<PosIdentity> listLJIIL = C940770aaZ.LIZ().getDataSource().LJIIL();
                        if (listLJIIL == null) {
                            listLJIIL = C13BV.INSTANCE;
                        }
                        if (listLJIIL.size() > 1) {
                            if (interfaceC920110a3F != null) {
                                interfaceC920110a3F.LIZIZ(listLJIIL, new AwS55S1300000_15(enlargeScreenManageParams, this, str, c920080a3CLJIIJ, 2));
                                return;
                            }
                            return;
                        } else {
                            if (listLJIIL.size() == 1 && z2) {
                                enlargeScreenManageParams.replacedPos = C1697810uHb.LJIILJJIL(ListProtector.get(listLJIIL, 0));
                            }
                            enlargeScreenManageParams.scene = 7;
                            LJIILJJIL(str, enlargeScreenManageParams, c920080a3CLJIIJ);
                            return;
                        }
                    }
                    C916520ZxS c916520ZxS = this.LIZIZ;
                    AwS80S1300000_15 awS80S1300000_15 = new AwS80S1300000_15(enlargeScreenManageParams, this, str, c920080a3CLJIIJ, 3);
                    c916520ZxS.getClass();
                    C916520ZxS.LIZ(awS80S1300000_15);
                }
            }
        };
    }

    public static final Object invoke$276(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new AbstractC920180a3M() { // from class: X.0a3J
            public final C920160a3K LIZIZ = new C920160a3K();

            @Override // X.InterfaceC920200a3O
            public final void LJ(InterfaceC920110a3F interfaceC920110a3F) {
                C923330a8R c923330a8R = C923330a8R.LIZ;
                if (C923330a8R.LJFF()) {
                    this.LIZIZ.LJ(interfaceC920110a3F);
                }
            }

            @Override // X.InterfaceC920200a3O
            public final void LIZJ(PosIdentity posIdentity, PosIdentity posIdentity2, AwS559S0100000_15 awS559S0100000_15, AwS594S0100000_15 awS594S0100000_15) {
                C923330a8R c923330a8R = C923330a8R.LIZ;
                if (C923330a8R.LJFF()) {
                    this.LIZIZ.LIZJ(posIdentity, posIdentity2, awS559S0100000_15, awS594S0100000_15);
                }
            }

            @Override // X.InterfaceC920200a3O
            public final void LJFF(int i, int i2, Function1<? super LayoutState, Unit> function1, Function1<? super LinkCoreError, Unit> function12) {
                C923330a8R c923330a8R = C923330a8R.LIZ;
                if (C923330a8R.LJII()) {
                    this.LIZIZ.LJFF(i, i2, function1, function12);
                }
            }

            @Override // X.InterfaceC920200a3O
            public final void LJII(int i, int i2, Function0<Unit> function0, Function1<? super LinkCoreError, Unit> function1) {
                C923330a8R c923330a8R = C923330a8R.LIZ;
                if (C923330a8R.LJII()) {
                    this.LIZIZ.LJII(i, i2, function0, function1);
                }
            }

            @Override // X.InterfaceC920200a3O
            public final void LJI(String str, boolean z, boolean z2, InterfaceC920110a3F interfaceC920110a3F, C334801Rq c334801Rq) {
                C923330a8R c923330a8R = C923330a8R.LIZ;
                if (C923330a8R.LJFF()) {
                    this.LIZIZ.LJI(str, z, z2, interfaceC920110a3F, c334801Rq);
                }
            }
        };
    }

    public static final Object invoke$277(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new AbstractC920180a3M() { // from class: X.0a3I
            public final C920160a3K LIZIZ = new C920160a3K();

            @Override // X.InterfaceC920200a3O
            public final void LJ(InterfaceC920110a3F interfaceC920110a3F) {
                C923330a8R c923330a8R = C923330a8R.LIZ;
                if (C923330a8R.LJFF()) {
                    this.LIZIZ.LJ(interfaceC920110a3F);
                }
            }

            @Override // X.InterfaceC920200a3O
            public final void LIZJ(PosIdentity posIdentity, PosIdentity posIdentity2, AwS559S0100000_15 awS559S0100000_15, AwS594S0100000_15 awS594S0100000_15) {
                C923330a8R c923330a8R = C923330a8R.LIZ;
                if (C923330a8R.LJFF()) {
                    this.LIZIZ.LIZJ(posIdentity, posIdentity2, awS559S0100000_15, awS594S0100000_15);
                }
            }

            @Override // X.InterfaceC920200a3O
            public final void LJFF(int i, int i2, Function1<? super LayoutState, Unit> function1, Function1<? super LinkCoreError, Unit> function12) {
                C923330a8R c923330a8R = C923330a8R.LIZ;
                if (C923330a8R.LJII()) {
                    this.LIZIZ.LJFF(i, i2, function1, function12);
                }
            }

            @Override // X.InterfaceC920200a3O
            public final void LJII(int i, int i2, Function0<Unit> function0, Function1<? super LinkCoreError, Unit> function1) {
                C923330a8R c923330a8R = C923330a8R.LIZ;
                if (C923330a8R.LJII()) {
                    this.LIZIZ.LJII(i, i2, function0, function1);
                }
            }

            @Override // X.InterfaceC920200a3O
            public final void LJI(String str, boolean z, boolean z2, InterfaceC920110a3F interfaceC920110a3F, C334801Rq c334801Rq) {
                PosIdentity next;
                C923330a8R c923330a8R = C923330a8R.LIZ;
                if (C923330a8R.LJFF()) {
                    this.LIZIZ.LJI(str, z, z2, interfaceC920110a3F, c334801Rq);
                    return;
                }
                Iterator<PosIdentity> it2 = C940770aaZ.LIZ().getDataSource().LJIIL().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.LIZJ(str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                PosIdentity posIdentity = next;
                if (posIdentity == null || !Intrinsics.LJFF(str, C01HE.LIZLLL(UserService.getInstance().user().getCurrentUserId()))) {
                    return;
                }
                EnlargeScreenManageParams enlargeScreenManageParams = new EnlargeScreenManageParams();
                C914970Zux.LIZ(enlargeScreenManageParams);
                enlargeScreenManageParams.operateUserId = -1L;
                enlargeScreenManageParams.scene = 8;
                enlargeScreenManageParams.operatedPosition = posIdentity;
                enlargeScreenManageParams.isRejectEnlargeScreen = z ? 1 : 0;
                enlargeScreenManageParams.linkmicId = str;
                C480460Ism.LIZ().getClass();
                this.LIZ.LIZ(((ILayoutServerApi) C480460Ism.LIZLLL(ILayoutServerApi.class)).zoom(enlargeScreenManageParams).LJIILIIL(new C0UO0()).LJJLL(new AfS48S1100000_15(interfaceC920110a3F, str, 2), new AfS48S1100000_15(interfaceC920110a3F, str, 3)));
            }
        };
    }

    public static final Object invoke$278(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C603820NmG(30);
    }

    public static final Object invoke$279(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    public static final /* bridge */ /* synthetic */ Object invoke$28(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$280(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C942060ace() { // from class: X.0aY0
            @Override // X.InterfaceC2181591AZp
            public final void LJIJ(String str, C955230axt c955230axt) {
            }

            @Override // X.InterfaceC2181591AZp
            public final boolean LJIJJLI() {
                return true;
            }
        };
    }

    public static final Object invoke$281(AFwS203S0000000_15 aFwS203S0000000_15) {
        CohostWithGuestBorderViewSetting cohostWithGuestBorderViewSetting = CohostWithGuestBorderViewSetting.INSTANCE;
        if (!cohostWithGuestBorderViewSetting.isEnabled()) {
            return Boolean.FALSE;
        }
        if (C950220apo.LJI()) {
            return Boolean.valueOf(cohostWithGuestBorderViewSetting.getValue().isAnchorEnabled);
        }
        return Boolean.TRUE;
    }

    public static final Object invoke$282(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C0J9Y();
    }

    public static final Object invoke$283(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C11NJ();
    }

    public static final Object invoke$284(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C924250a9v.LIZ();
    }

    public static final Object invoke$285(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C11NJ();
    }

    public static final Object invoke$286(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C924250a9v.LIZ();
    }

    public static final Object invoke$287(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C11NJ();
    }

    public static final Object invoke$288(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C924250a9v.LIZ();
    }

    public static final Object invoke$289(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C944640ago.LLILLJJLI.getValue();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$29(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$290(AFwS203S0000000_15 aFwS203S0000000_15) {
        C948450amx c948450amx = C948450amx.LIZIZ;
        Object objLJIIJJI = c948450amx.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
        if (!(objLJIIJJI instanceof GameLinkDataHolder) || objLJIIJJI == null) {
            GameLinkDataHolder gameLinkDataHolderLIZ = C924250a9v.LIZ();
            c948450amx.LJFF(gameLinkDataHolderLIZ, "MULTI_GUEST_DATA_HOLDER");
            return gameLinkDataHolderLIZ;
        }
        return objLJIIJJI;
    }

    public static final Object invoke$291(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C1161920gLG.LIZJ(IEffectService.class);
    }

    public static final Object invoke$292(AFwS203S0000000_15 aFwS203S0000000_15) {
        String str;
        Long lValueOf;
        RtcUserInfo rtcUserInfoG0;
        HashMap map = new HashMap();
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ == null || (rtcUserInfoG0 = interfaceC954180awCLJIIIZ.G0()) == null || (str = rtcUserInfoG0.linkMicId) == null) {
            str = "";
        }
        map.put("linkmic_id", str);
        if (EnableChannelBasedTrackSupportGroupChannelIdSetting.INSTANCE.isEnable()) {
            IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
            if (iInteractService != null) {
                lValueOf = Long.valueOf(iInteractService.getChannelId());
            } else {
                lValueOf = null;
            }
            map.put("channel_id", String.valueOf(lValueOf));
        }
        return map;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$293(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$294(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$295(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$296(AFwS203S0000000_15 aFwS203S0000000_15) {
        ((ILiveClientAIService) C1161920gLG.LIZJ(ILiveClientAIService.class)).pQ1();
        return C1101460elk.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$297(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$298(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C11NJ();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$299(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$3(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$30(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$300(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$301(AFwS203S0000000_15 aFwS203S0000000_15) {
        C20441214yg.LJIIIZ("MatchOptionViewModel", "onIcyClashSwitch: negativeClick");
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$302(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$303(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$304(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new HashMap();
    }

    public static final Object invoke$305(AFwS203S0000000_15 aFwS203S0000000_15) {
        return DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
    }

    public static final Object invoke$306(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C11NJ();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$307(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$308(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$309(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$31(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$310(AFwS203S0000000_15 aFwS203S0000000_15) {
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLILZLL, 10));
        Iterator<C954460awe> it2 = listLLILZLL.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().LJ));
        }
        return C13LP.LLIIJI(arrayList);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$311(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$312(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$313(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$314(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$315(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$316(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$317(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$318(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$319(AFwS203S0000000_15 aFwS203S0000000_15) {
        InterfaceC960800b6s.LLJJLIIIJLLLLLLLZ.LJFF(Boolean.TRUE);
        return Unit.LIZ;
    }

    public static final Object invoke$32(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C924250a9v.LIZ();
    }

    public static final Object invoke$320(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C924810aAp.LJ();
    }

    public static final Object invoke$321(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C920310a3Z();
    }

    public static final Object invoke$322(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C916490ZxP.LIZJ();
    }

    public static final Object invoke$323(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C922540a7A();
    }

    public static final Object invoke$324(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C921550a5Z();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$325(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$326(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$327(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$328(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$329(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$33(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new GameLinkDataHolder();
    }

    public static final Object invoke$330(AFwS203S0000000_15 aFwS203S0000000_15) {
        C20441214yg.LIZIZ("MultiMatchStateMatching", "switchLayout callback ---");
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$331(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$332(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$333(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$334(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$335(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$336(AFwS203S0000000_15 aFwS203S0000000_15) {
        C766270U4b.LIZLLL(2131854875);
        return Unit.LIZ;
    }

    public static final Object invoke$337(AFwS203S0000000_15 aFwS203S0000000_15) {
        SoundWaveEffectOtpSetting soundWaveEffectOtpSetting = SoundWaveEffectOtpSetting.INSTANCE;
        return new C941320abS(soundWaveEffectOtpSetting.getFPS(), soundWaveEffectOtpSetting.getLowDuration(), soundWaveEffectOtpSetting.getMidDuration(), soundWaveEffectOtpSetting.getHighDuration());
    }

    public static final Object invoke$338(AFwS203S0000000_15 aFwS203S0000000_15) {
        return ((ILiveDanceService) C1161920gLG.LIZJ(ILiveDanceService.class)).Yo1();
    }

    public static final Object invoke$339(AFwS203S0000000_15 aFwS203S0000000_15) {
        C20441214yg.LIZIZ("QuickCoHostStateWaited", "receive quick recommend reply message reply refuse");
        return Unit.LIZ;
    }

    public static final Object invoke$34(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ConcurrentHashMap();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$340(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$341(AFwS203S0000000_15 aFwS203S0000000_15) {
        C20441214yg.LIZIZ("QuickCoHostStateWaited", "[Skip Client Invite Optimization] receive quick pair reply message reply refuse");
        return Unit.LIZ;
    }

    public static final Object invoke$342(AFwS203S0000000_15 aFwS203S0000000_15) {
        C20441214yg.LIZIZ("QuickCoHostStateWaited", "receive quick pair reply message reply refuse");
        return Unit.LIZ;
    }

    public static final Object invoke$343(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C11NJ();
    }

    public static final Object invoke$344(AFwS203S0000000_15 aFwS203S0000000_15) {
        C915980Zwa.LJIIIZ().LIZIZ(EnumC959750b5B.TYPE_GROUP_CHANNEL_ID_CHANGE, null);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$345(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$346(AFwS203S0000000_15 aFwS203S0000000_15) {
        C915980Zwa.LJIIIZ().LIZIZ(EnumC959750b5B.TYPE_GROUP_CHANNEL_ID_CHANGE, null);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$347(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$348(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$349(AFwS203S0000000_15 aFwS203S0000000_15) {
        C955400ayA c955400ayA = C955400ayA.LIZ;
        C955400ayA.LL(new Room(), EnumC920540a3w.QUICK_LINKMIC.getValue(), null, null, null, null, null, null, null, C915980Zwa.LJI().LIZ().LLLFZ(), false, 1532);
        return Unit.LIZ;
    }

    public static final Object invoke$35(AFwS203S0000000_15 aFwS203S0000000_15) {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            return Long.valueOf(room.getOwnerUserId());
        }
        return null;
    }

    public static final Object invoke$350(AFwS203S0000000_15 aFwS203S0000000_15) {
        boolean zLJJLIIJ;
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            zLJJLIIJ = interfaceC954180awCLLJLL.LJJLIIJ();
        } else {
            zLJJLIIJ = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("canInitRtcAdavance = ");
        boolean z = !zLJJLIIJ;
        sbLIZ.append(z);
        sbLIZ.append(", isRtcLocked = ");
        sbLIZ.append(zLJJLIIJ);
        C20441214yg.LJIIIZ("MultiCoHostService", C2188811AlT.LIZIZ(sbLIZ));
        return Boolean.valueOf(z);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$351(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$352(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$353(AFwS203S0000000_15 aFwS203S0000000_15) {
        int i;
        if (C934890aR5.LIZ()) {
            i = com.zhiliaoapp.musically.R.drawable.f67;
        } else {
            i = com.zhiliaoapp.musically.R.drawable.f66;
        }
        return Integer.valueOf(i);
    }

    public static final Object invoke$354(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C1117360fBO();
    }

    public static final Object invoke$355(AFwS203S0000000_15 aFwS203S0000000_15) {
        C1117360fBO c1117360fBO = new C1117360fBO();
        c1117360fBO.LLLI(User.class, new AbstractC960460b6K<User, C933370aOd>() { // from class: X.0aOe
            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new AbstractC960470b6L<User>(C485880J3q.LIZ.LIZJ(com.zhiliaoapp.musically.R.layout.h9x, viewGroup, false)) { // from class: X.0aOd
                    @Override // X.AbstractC960470b6L
                    public final void I5(int i, Object obj) {
                        List urls;
                        C0JBN c0jbnLIZ = C1819620xS4.LIZ();
                        ImageModel avatarThumb = ((User) obj).getAvatarThumb();
                        if (avatarThumb != null) {
                            urls = avatarThumb.getUrls();
                        } else {
                            urls = null;
                        }
                        C1324610kZf c1324610kZfLIZJ = c0jbnLIZ.LIZJ(urls);
                        c1324610kZfLIZJ.LJIILIIL = Boolean.TRUE;
                        c1324610kZfLIZJ.LJIIIZ = com.zhiliaoapp.musically.R.drawable.ela;
                        c1324610kZfLIZJ.LJJI(this.itemView);
                    }
                };
            }
        });
        return c1117360fBO;
    }

    public static final Object invoke$356(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C751910TeX();
    }

    public static final Object invoke$357(AFwS203S0000000_15 aFwS203S0000000_15) {
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        if (!(objLJIIIZ instanceof InterfaceC302401Fe)) {
            return null;
        }
        return objLJIIIZ;
    }

    public static final Object invoke$358(AFwS203S0000000_15 aFwS203S0000000_15) {
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (!(objLJIIIZ instanceof InterfaceC917640ZzG)) {
            return null;
        }
        return objLJIIIZ;
    }

    public static final Object invoke$359(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new HashMap();
    }

    public static final Object invoke$36(AFwS203S0000000_15 aFwS203S0000000_15) {
        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131841160));
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$360(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$361(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$362(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C932810aNj(MultiGuestInviteFriendDailyLimitSetting.INSTANCE.count());
    }

    public static final Object invoke$363(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Boolean.TRUE;
    }

    public static final Object invoke$364(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Boolean.TRUE;
    }

    public static final Object invoke$365(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Boolean.TRUE;
    }

    public static final Object invoke$366(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Boolean.TRUE;
    }

    public static final Object invoke$367(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Boolean.TRUE;
    }

    public static final Object invoke$368(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Boolean.TRUE;
    }

    public static final Object invoke$369(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
    }

    public static final Object invoke$37(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C932440aN8.LIZLLL();
    }

    public static final Object invoke$370(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ArrayList();
    }

    public static final Object invoke$371(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Boolean.valueOf(LinkMicToolbarIconSetting.INSTANCE.opt());
    }

    public static final /* bridge */ /* synthetic */ Object invoke$372(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$373(AFwS203S0000000_15 aFwS203S0000000_15) {
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLILZLL, 10));
        Iterator<C954460awe> it2 = listLLILZLL.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().LJ));
        }
        return C13LP.LLIIJI(arrayList);
    }

    public static final Object invoke$374(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ArrayList();
    }

    public static final Object invoke$375(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C11NJ();
    }

    public static final Object invoke$376(AFwS203S0000000_15 aFwS203S0000000_15) {
        C930480aJy.LJJIJIIJI(2131854875, "ttlive_multiguest_waitlist_limit_reached_toast", "mg_invite_to_waitlist_fail_maximum_number");
        return Unit.LIZ;
    }

    public static final Object invoke$377(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C924810aAp.LJ();
    }

    public static final Object invoke$378(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C920310a3Z();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$379(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$38(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new InterfaceC932640aNS() { // from class: X.0aPL
            @Override // X.InterfaceC932640aNS
            public final void LLJJL(String str) {
            }

            @Override // X.InterfaceC932640aNS
            public final boolean a0() {
                return true;
            }

            @Override // X.InterfaceC932640aNS
            public final long getFollowStatus() {
                return 1L;
            }
        };
    }

    public static final /* bridge */ /* synthetic */ Object invoke$380(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$381(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$382(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$383(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$384(AFwS203S0000000_15 aFwS203S0000000_15) {
        MultiLiveInviteFriendFreqCtrl multiLiveInviteFriendFreqCtrl = MultiLiveInviteFriendFreqCtrl.INSTANCE;
        return new C588290N5n(multiLiveInviteFriendFreqCtrl.getValue().roomWindow.allUsersTimeWindow, multiLiveInviteFriendFreqCtrl.getValue().roomWindow.totalMaxTimes);
    }

    public static final Object invoke$385(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$386(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ViewModelStore();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$387(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$388(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new HashMap();
    }

    public static final Object invoke$389(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C940020aZM();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$39(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$390(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C098J(1);
    }

    public static final Object invoke$391(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C098J(8);
    }

    public static final Object invoke$392(AFwS203S0000000_15 aFwS203S0000000_15) {
        C20337914i1<Boolean> c20337914i1 = InterfaceC934710aQn.zc;
        if (!c20337914i1.LIZIZ().booleanValue()) {
            c20337914i1.LJFF(Boolean.TRUE);
            C930480aJy.LJJIJIIJI(2131854226, "ttlive_multiVibrateForInvitation_viewerScreen_turnOffRouteToast", "");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$393(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C1697810uHb.LJIIJJI("share_bg_plugin", "padding_plugin");
    }

    public static final Object invoke$394(AFwS203S0000000_15 aFwS203S0000000_15) {
        String str;
        String[] strArr = new String[2];
        strArr[0] = "padding_plugin";
        if (EnableMicSeatEmojiFeatureSetting.INSTANCE.isEnable()) {
            str = "mic_seat_emoji_plugin";
        } else {
            str = "";
        }
        strArr[1] = str;
        return C1697810uHb.LJIIJJI(strArr);
    }

    public static final Object invoke$395(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C1697810uHb.LJIIJJI("live_room_business_plugin", "share_bg_plugin", "gift_panel_plugin", "share_revenue_plugin", "state_proxy_plugin", "live_room_window_frame_change_plugin", "agree_apply_guide_plugin", "draw_guess_plugin", "lets_dance_plugin", "play_record_manager_plugin", "sei_write_plugin", "water_mark_plugin");
    }

    public static final Object invoke$396(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C1697810uHb.LJIIJJI("preview_live_business_plugin", "preview_live_gradient_layer_plugin", "preview_live_window_frame_change_plugin");
    }

    public static final Object invoke$397(AFwS203S0000000_15 aFwS203S0000000_15) {
        String str;
        String[] strArr = new String[16];
        strArr[0] = "live_room_business_plugin";
        strArr[1] = "padding_plugin";
        strArr[2] = "share_bg_plugin";
        strArr[3] = "gift_panel_plugin";
        strArr[4] = "share_revenue_plugin";
        strArr[5] = "state_proxy_plugin";
        strArr[6] = "live_room_window_frame_change_plugin";
        strArr[7] = "agree_apply_guide_plugin";
        strArr[8] = "apply_view_manager_plugin";
        strArr[9] = "draw_guess_plugin";
        strArr[10] = "lets_dance_plugin";
        strArr[11] = "play_record_manager_plugin";
        strArr[12] = "sei_write_plugin";
        strArr[13] = "voice_chat_business_plugin";
        strArr[14] = "water_mark_plugin";
        if (EnableMicSeatEmojiFeatureSetting.INSTANCE.isEnable()) {
            str = "mic_seat_emoji_plugin";
        } else {
            str = "";
        }
        strArr[15] = str;
        return C1697810uHb.LJIIJJI(strArr);
    }

    public static final Object invoke$398(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C953720avS();
    }

    public static final Object invoke$399(AFwS203S0000000_15 aFwS203S0000000_15) {
        int intValue = LiveAbLabelSetting.INSTANCE.getIntValue("multi_guest_noticeboard_opt_v1");
        boolean z = true;
        if (intValue != 1 && intValue != 3) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$4(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new HashMap();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$40(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$400(AFwS203S0000000_15 aFwS203S0000000_15) {
        boolean z;
        int intValue = LiveAbLabelSetting.INSTANCE.getIntValue("multi_guest_noticeboard_opt_v1");
        if (intValue != 2 && intValue != 3) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$401(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C920330a3b();
    }

    public static final Object invoke$402(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Long.valueOf(C950220apo.LIZLLL());
    }

    public static final Object invoke$403(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Boolean.valueOf(C930540aK4.LJ());
    }

    public static final Object invoke$404(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Long.valueOf(C950220apo.LIZLLL());
    }

    public static final Object invoke$405(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Long.valueOf(C950220apo.LIZLLL());
    }

    public static final /* bridge */ /* synthetic */ Object invoke$406(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$407(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$408(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$409(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Long.valueOf(C158B.LIZJ() + LiveCoHostTakeTheStageCountdownSecSetting.INSTANCE.getValue());
    }

    public static final /* bridge */ /* synthetic */ Object invoke$41(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$410(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$411(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$412(AFwS203S0000000_15 aFwS203S0000000_15) {
        C925600aC6.LIZ = "story_join_as_guest";
        new C927240aEk("story", "apply").LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$413(AFwS203S0000000_15 aFwS203S0000000_15) {
        C925600aC6.LIZ = "empty_spot_fyp_cover";
        new C927240aEk("uniqueCard", "apply").LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$414(AFwS203S0000000_15 aFwS203S0000000_15) {
        C925600aC6.LJIJJLI("outside_liveroom");
        return Unit.LIZ;
    }

    public static final Object invoke$415(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new MutableLiveData();
    }

    public static final Object invoke$416(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new MutableLiveData();
    }

    public static final Object invoke$417(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new MutableLiveData();
    }

    public static final Object invoke$418(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new MutableLiveData();
    }

    public static final Object invoke$419(AFwS203S0000000_15 aFwS203S0000000_15) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(Boolean.FALSE);
        return mutableLiveData;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$42(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$420(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new MutableLiveData();
    }

    public static final Object invoke$421(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new MutableLiveData(Boolean.TRUE);
    }

    public static final Object invoke$422(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new MutableLiveData();
    }

    public static final Object invoke$423(AFwS203S0000000_15 aFwS203S0000000_15) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(0);
        return mutableLiveData;
    }

    public static final Object invoke$424(AFwS203S0000000_15 aFwS203S0000000_15) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC940060aZQ interfaceC940060aZQ;
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL();
        } else {
            interfaceC937900aVwLLIIJLIL = null;
        }
        if (!(interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) || (interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL) == null) {
            return null;
        }
        return interfaceC940060aZQ.LIZIZ();
    }

    public static final Object invoke$425(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new LinkedHashMap();
    }

    public static final Object invoke$426(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C942440adG();
    }

    public static final Object invoke$427(AFwS203S0000000_15 aFwS203S0000000_15) {
        return ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).get(C950220apo.LIZLLL());
    }

    public static final /* bridge */ /* synthetic */ Object invoke$428(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$43(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$430(AFwS203S0000000_15 aFwS203S0000000_15) {
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Object objGg0 = dataChannelGlobal.gg0(C930940aKi.class);
        if (objGg0 == null) {
            return dataChannelGlobal.gg0(C930930aKh.class);
        }
        return objGg0;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$431(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$432(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$433(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C11NJ();
    }

    public static final Object invoke$434(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C11NJ();
    }

    public static final Object invoke$435(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new HashMap();
    }

    public static final Object invoke$436(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new CopyOnWriteArrayList();
    }

    public static final Object invoke$437(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ConcurrentHashMap();
    }

    public static final Object invoke$438(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new HashMap();
    }

    public static final Object invoke$439(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new HashMap();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$44(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$440(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$441(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$442(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$443(AFwS203S0000000_15 aFwS203S0000000_15) {
        C973660bRc.LIZ.LJLJI(0, false, false, null);
        return Unit.LIZ;
    }

    public static final Object invoke$444(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C11NJ();
    }

    public static final Object invoke$445(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C11NJ();
    }

    public static final Object invoke$446(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new MultiGuestDataHolder();
    }

    public static final Object invoke$447(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new InterfaceC665370Q7z() { // from class: X.0aaT
            public final C01GW LL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1082));

            @Override // X.InterfaceC665370Q7z
            public final Object getHost() {
                return null;
            }

            @Override // X.InterfaceC665370Q7z
            public final String getKey() {
                return "feed_new_layout_fallback_scope";
            }

            @Override // X.InterfaceC665370Q7z
            public final C1554890qZ5 getTree() {
                return (C1554890qZ5) this.LL.getValue();
            }
        };
    }

    public static final Object invoke$448(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C917100ZyO("feed_preview", "");
    }

    public static final Object invoke$449(AFwS203S0000000_15 aFwS203S0000000_15) {
        InterfaceC939660aYm interfaceC939660aYmOz0 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).oz0();
        if (interfaceC939660aYmOz0 != null) {
            return interfaceC939660aYmOz0.LIZ();
        }
        return null;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$45(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$450(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C11NJ();
    }

    public static final Object invoke$451(AFwS203S0000000_15 aFwS203S0000000_15) {
        InterfaceC939660aYm interfaceC939660aYmOz0 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).oz0();
        if (interfaceC939660aYmOz0 != null) {
            return interfaceC939660aYmOz0.LIZ();
        }
        return null;
    }

    public static final Object invoke$452(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_DATA_HOLDER");
    }

    public static final Object invoke$453(AFwS203S0000000_15 aFwS203S0000000_15) {
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Object objGg0 = dataChannelGlobal.gg0(C930940aKi.class);
        if (objGg0 == null) {
            return dataChannelGlobal.gg0(C930930aKh.class);
        }
        return objGg0;
    }

    public static final Object invoke$454(AFwS203S0000000_15 aFwS203S0000000_15) {
        EnumMap enumMap = new EnumMap(LinkUserState.class);
        enumMap.put(LinkUserState.LINKED, new ArrayList());
        enumMap.put(LinkUserState.APPLICANT, new ArrayList());
        enumMap.put(LinkUserState.INVITEE, new ArrayList());
        return enumMap;
    }

    public static final Object invoke$455(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C952580atc();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$456(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$457(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C11NJ();
    }

    public static final Object invoke$458(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C956240azW();
    }

    public static final Object invoke$459(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new LinkedHashMap();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$46(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$460(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$461(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C11NJ();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$462(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$463(AFwS203S0000000_15 aFwS203S0000000_15) {
        return ((ILiveDanceService) C1161920gLG.LIZJ(ILiveDanceService.class)).Yo1();
    }

    public static final Object invoke$464(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C941290abP(null, false, 12);
    }

    public static final Object invoke$465(AFwS203S0000000_15 aFwS203S0000000_15) {
        C11PQ c11pq = new C11PQ();
        c11pq.onNext(Boolean.FALSE);
        return c11pq;
    }

    public static final Object invoke$466(AFwS203S0000000_15 aFwS203S0000000_15) {
        return ((ILiveDanceService) C1161920gLG.LIZJ(ILiveDanceService.class)).Yo1();
    }

    public static final Object invoke$467(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C00S0.LIZIZ();
    }

    public static final Object invoke$468(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new View.OnClickListener() { // from class: X.0Zw5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (C930540aK4.LIZJ()) {
                    C766270U4b.LIZLLL(2131853961);
                }
            }
        };
    }

    public static final Object invoke$469(AFwS203S0000000_15 aFwS203S0000000_15) {
        return ((ILiveDanceService) C1161920gLG.LIZJ(ILiveDanceService.class)).Yo1();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$47(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$470(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C11NJ();
    }

    public static final Object invoke$471(AFwS203S0000000_15 aFwS203S0000000_15) {
        C20441214yg.LJ("MultiLiveAsAnchorListDialogV2", "kickOut all cancel");
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$472(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$473(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$474(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C11NJ();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$475(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$476(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$477(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new HashMap();
    }

    public static final Object invoke$478(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ArrayList();
    }

    public static final Object invoke$479(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C13LP.LJLIL(C957990b2L.LIZIZ(), C13LP.LJLIL(C957990b2L.LIZJ(), C957990b2L.LIZ()));
    }

    public static final /* bridge */ /* synthetic */ Object invoke$48(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$480(AFwS203S0000000_15 aFwS203S0000000_15) {
        List listLJLIL = C13LP.LJLIL(InteractionSourceTypeDirectBattleWhiteList.INSTANCE.getValue().quickPairWhiteList, Collections.singletonList(65));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("quickPairDirectBattleSourceTypeList = ");
        sbLIZ.append(listLJLIL);
        C20441214yg.LJIIIZ("QuickCohostSourceTypeExt", C2188811AlT.LIZIZ(sbLIZ));
        return listLJLIL;
    }

    public static final Object invoke$481(AFwS203S0000000_15 aFwS203S0000000_15) {
        List listLJLIL = C13LP.LJLIL(InteractionSourceTypeWhiteList.INSTANCE.getValue().quickPairWhiteList, C1697810uHb.LJIIJJI(5, 50, 65));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("quickPairSourceTypeList = ");
        sbLIZ.append(listLJLIL);
        C20441214yg.LJIIIZ("QuickCohostSourceTypeExt", C2188811AlT.LIZIZ(sbLIZ));
        return listLJLIL;
    }

    public static final Object invoke$482(AFwS203S0000000_15 aFwS203S0000000_15) {
        List listLJLIL = C13LP.LJLIL(InteractionSourceTypeDirectBattleWhiteList.INSTANCE.getValue().quickRecommendWhiteList, Collections.singletonList(66));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("quickRecommendDirectBattleSourceTypeList = ");
        sbLIZ.append(listLJLIL);
        C20441214yg.LJIIIZ("QuickCohostSourceTypeExt", C2188811AlT.LIZIZ(sbLIZ));
        return listLJLIL;
    }

    public static final Object invoke$483(AFwS203S0000000_15 aFwS203S0000000_15) {
        List listLJLIL = C13LP.LJLIL(InteractionSourceTypeWhiteList.INSTANCE.getValue().quickRecommendDuringCohostWhiteList, C1697810uHb.LJIIJJI(43, 52));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("quickRecommendDuringCohostSourceTypeList = ");
        sbLIZ.append(listLJLIL);
        C20441214yg.LJIIIZ("QuickCohostSourceTypeExt", C2188811AlT.LIZIZ(sbLIZ));
        return listLJLIL;
    }

    public static final Object invoke$484(AFwS203S0000000_15 aFwS203S0000000_15) {
        List listLJLIL = C13LP.LJLIL(InteractionSourceTypeWhiteList.INSTANCE.getValue().quickRecommendWhiteList, C1697810uHb.LJIIJJI(7, 51, 66, 75));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("quickRecommendSourceTypeList = ");
        sbLIZ.append(listLJLIL);
        C20441214yg.LJIIIZ("QuickCohostSourceTypeExt", C2188811AlT.LIZIZ(sbLIZ));
        return listLJLIL;
    }

    public static final Object invoke$485(AFwS203S0000000_15 aFwS203S0000000_15) {
        return String.valueOf(C915980Zwa.LJII().Uh());
    }

    public static final Object invoke$486(AFwS203S0000000_15 aFwS203S0000000_15) {
        return String.valueOf(C915980Zwa.LJII().LJJIIJZLJL().size());
    }

    public static final Object invoke$487(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ConcurrentHashMap();
    }

    public static final Object invoke$488(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ConcurrentHashMap();
    }

    public static final Object invoke$489(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ConcurrentHashMap();
    }

    public static final Object invoke$49(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C980380bcS();
    }

    public static final Object invoke$490(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new HashMap();
    }

    public static final Object invoke$491(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new HashMap();
    }

    public static final Object invoke$492(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new LinkedHashMap();
    }

    public static final Object invoke$493(AFwS203S0000000_15 aFwS203S0000000_15) {
        new C927240aEk("anchorLiveHome", "liveEnd").LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$494(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C969360bKg();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$495(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$496(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Boolean.valueOf(LinkMicToolbarIconSetting.INSTANCE.opt());
    }

    public static final /* bridge */ /* synthetic */ Object invoke$497(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$498(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C11NJ();
    }

    public static final Object invoke$499(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C954060aw0();
    }

    public static final Object invoke$5(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C952740ats();
    }

    public static final Object invoke$50(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$500(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Boolean.TRUE;
    }

    public static final Object invoke$501(AFwS203S0000000_15 aFwS203S0000000_15) {
        return MultiGuestLayoutBizViewStyleAudioSetting.INSTANCE.getSettingValue();
    }

    public static final Object invoke$502(AFwS203S0000000_15 aFwS203S0000000_15) {
        return LivesdkLinkmicVoiceChatLayoutConfigV2Setting.INSTANCE.getValue();
    }

    public static final Object invoke$504(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Boolean.TRUE;
    }

    public static final Object invoke$51(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C501440JlW();
    }

    public static final Object invoke$52(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new InterfaceC1102810env() { // from class: X.0aRu
            public DataChannel LL;

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

            public final Map<String, String> LJFF(String str) {
                Object obj;
                DataChannel dataChannel;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str2 = "1";
                if (!C500260Jjc.LJJIL() && C930540aK4.LIZJ()) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("is_in_live", obj);
                if (C915980Zwa.LIZLLL().yK2(null) == null) {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("is_in_playbook", str2);
                if (C930540aK4.LIZJ() && (dataChannel = this.LL) != null) {
                    C935410aRv.LIZ(dataChannel, str, linkedHashMap);
                }
                return linkedHashMap;
            }

            @Override // X.InterfaceC1102810env
            public final void onClick(View view) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_playbook_entrance_click");
                c474500IjALIZ.LJIJJLI(this.LL);
                c474500IjALIZ.LJJII("multi_live_merge", "enter_from");
                c474500IjALIZ.LJJII("3", "index");
                c474500IjALIZ.LJJIIZI(LJFF("livesdk_anchor_playbook_entrance_click"));
                c474500IjALIZ.LIZ();
                if (C758560TpG.LIZ()) {
                    RedDotExtensionKt.LIZ(C0UX6.RED_DOT_PLAY_AND_TOOL_ENTRANCE);
                }
                DataChannel dataChannel = this.LL;
                if (dataChannel != null) {
                    C927840aFi c927840aFi = C927840aFi.LIZ;
                    AFwS203S0000000_15 aFwS203S0000000_152 = AFwS203S0000000_15.get$arr$(495);
                    c927840aFi.getClass();
                    C927840aFi.LIZIZ(dataChannel, "multi_live_merge", aFwS203S0000000_152);
                }
            }

            @Override // X.InterfaceC1102810env
            public final void LIZIZ(C1099960ejK c1099960ejK, C945840aik c945840aik) {
                C978370bZD c978370bZDLIZLLL;
                View view;
                this.LL = c1099960ejK.LIZJ;
                if (C758560TpG.LIZ()) {
                    RedDotExtensionKt.LJI(c945840aik.findViewById(com.zhiliaoapp.musically.R.id.y7r), null, null, C0UX6.RED_DOT_PLAY_AND_TOOL_ENTRANCE, null);
                }
                if (LiveSdkMultiGuestIconInCoHostOptSetting.INSTANCE.isEnable() && (view = c945840aik.LIZIZ) != null && InterfaceC1106030et7.N8.LIZIZ().booleanValue()) {
                    C1113800f5e c1113800f5e = C1113800f5e.LIZ;
                    C785230UrB c785230UrB = new C785230UrB(view);
                    c785230UrB.LIZLLL(2131854144);
                    c785230UrB.LJFF = 48;
                    c785230UrB.LJIIIIZZ = Mp4ScreenVideoLoadTimeout.CONTROL;
                    c785230UrB.LJIIIZ = true;
                    c785230UrB.LJIILL = new InterfaceC254600ye() { // from class: X.0aRw
                        @Override // X.InterfaceC254600ye
                        public final void onShow() {
                            InterfaceC1106030et7.N8.LJFF(Boolean.FALSE);
                        }
                    };
                    c785230UrB.LJ = new View.OnClickListener() { // from class: X.0aRy
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                        }
                    };
                    c785230UrB.LJIILLIIL = new InterfaceC254900yh() { // from class: X.0aRz
                        @Override // X.InterfaceC254900yh
                        public final void x1(int i) {
                        }
                    };
                    c1113800f5e.LJ(new C785270UrF(c785230UrB), EnumC1120860fH2.ANCHOR_MULTIGUEST_PLAYBOOK_MOVED_TIPS, this.LL);
                }
                InterfaceC774000UXu interfaceC774000UXuG20 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).G20("livesdk_anchor_playbook_entrance_show");
                if (interfaceC774000UXuG20 != null && (c978370bZDLIZLLL = interfaceC774000UXuG20.LIZLLL(this.LL)) != null) {
                    c978370bZDLIZLLL.LIZIZ.LJJII("multi_live_merge", "enter_from");
                    c978370bZDLIZLLL.LIZJ.putAll(LJFF("livesdk_anchor_playbook_entrance_show"));
                    c978370bZDLIZLLL.LIZ();
                }
            }
        };
    }

    public static final Object invoke$53(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C935380aRs();
    }

    public static final Object invoke$54(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new LinkedList();
    }

    public static final Object invoke$55(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C924810aAp.LJ();
    }

    public static final Object invoke$56(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C920310a3Z();
    }

    public static final Object invoke$57(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C916490ZxP.LIZJ();
    }

    public static final Object invoke$58(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C922540a7A();
    }

    public static final Object invoke$59(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C921550a5Z();
    }

    public static final Object invoke$6(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C958830b3h();
    }

    public static final Object invoke$60(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C0IDG(0);
    }

    public static final Object invoke$61(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new AnchorSettingDistributeFromServerManager();
    }

    public static final Object invoke$62(AFwS203S0000000_15 aFwS203S0000000_15) {
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Object objGg0 = dataChannelGlobal.gg0(C930940aKi.class);
        if (objGg0 == null) {
            return dataChannelGlobal.gg0(C930930aKh.class);
        }
        return objGg0;
    }

    public static final Object invoke$63(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Integer.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).liveId());
    }

    public static final Object invoke$64(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C937570aVP();
    }

    public static final Object invoke$65(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ConcurrentHashMap();
    }

    public static final Object invoke$66(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C924580aAS(C930540aK4.LJIIIZ());
    }

    public static final Object invoke$67(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ConcurrentHashMap();
    }

    public static final Object invoke$68(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C920330a3b();
    }

    public static final Object invoke$69(AFwS203S0000000_15 aFwS203S0000000_15) {
        boolean z;
        if (LinkCoreModelKt.currentUserIsAnchor() && LinkMicBizRequestIdSetting.opt()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$7(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$70(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new HashMap();
    }

    public static final Object invoke$71(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new HashMap();
    }

    public static final Object invoke$72(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new HashMap();
    }

    public static final Object invoke$73(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C940750aaX(null);
    }

    public static final Object invoke$74(AFwS203S0000000_15 aFwS203S0000000_15) {
        C11PQ c11pq = new C11PQ();
        c11pq.onNext(C938220aWS.LLJJI);
        return c11pq;
    }

    public static final Object invoke$75(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ArrayList();
    }

    public static final Object invoke$76(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C11NJ();
    }

    public static final Object invoke$77(AFwS203S0000000_15 aFwS203S0000000_15) {
        return MultiGuestV3GuestPresenter.initEffectParamStore$getLayoutSetting().getFirst();
    }

    public static final Object invoke$78(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C920330a3b();
    }

    public static final Object invoke$79(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C922540a7A();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$8(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$80(AFwS203S0000000_15 aFwS203S0000000_15) {
        C20337914i1<Boolean> c20337914i1 = InterfaceC934710aQn.zc;
        if (!c20337914i1.LIZIZ().booleanValue()) {
            c20337914i1.LJFF(Boolean.TRUE);
            C766270U4b.LIZLLL(2131854226);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$81(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Boolean.FALSE;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$82(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$83(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$84(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C924700aAe.LIZIZ;
    }

    public static final Object invoke$85(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ());
    }

    public static final Object invoke$86(AFwS203S0000000_15 aFwS203S0000000_15) {
        return MultiGuestV3GuestPresenter.initEffectParamStore$getLayoutSetting().getSecond();
    }

    public static final Object invoke$87(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C938480aWs();
    }

    public static final Object invoke$88(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C937550aVN();
    }

    public static final Object invoke$89(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C0UTB();
    }

    public static final Object invoke$9(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C1161920gLG.LIZJ(IMultiGuestV3InternalServiceV2.class);
    }

    public static final Object invoke$90(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new FansRequiredInterceptor();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$91(AFwS203S0000000_15 aFwS203S0000000_15) {
        return Unit.LIZ;
    }

    public static final Object invoke$92(AFwS203S0000000_15 aFwS203S0000000_15) {
        boolean z;
        if (MultiGuestGuestInviteSheetOptSetting.isEnable() && !C930540aK4.LJJIJ() && !C917810ZzX.LJII()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$93(AFwS203S0000000_15 aFwS203S0000000_15) {
        return C916490ZxP.LIZJ();
    }

    public static final Object invoke$94(AFwS203S0000000_15 aFwS203S0000000_15) {
        return ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getEchoHelper();
    }

    public static final Object invoke$95(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new C11NJ();
    }

    public static final Object invoke$96(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new HashMap();
    }

    public static final Object invoke$97(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new HashMap();
    }

    public static final Object invoke$98(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new ArrayList();
    }

    public static final Object invoke$99(AFwS203S0000000_15 aFwS203S0000000_15) {
        return new InterfaceC941540abo() { // from class: X.0abq
            public boolean LL;
            public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(478));
            public final C01GW LLILLL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(477));

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // X.InterfaceC941540abo
            public final void release() {
                this.LL = true;
                ((List) this.LLILLJJLI.getValue()).clear();
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                Object next;
                Iterator it2 = ((List) this.LLILLJJLI.getValue()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (((C941550abp) next).LIZ == animator) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C941550abp c941550abp = (C941550abp) next;
                if (c941550abp != null) {
                    InterfaceC941570abr interfaceC941570abr = (InterfaceC941570abr) ((Map) this.LLILLL.getValue()).remove(c941550abp.LIZIZ);
                    if (interfaceC941570abr != null) {
                        interfaceC941570abr.LIZ(c941550abp);
                    }
                    ((List) this.LLILLJJLI.getValue()).remove(c941550abp);
                }
            }

            @Override // X.InterfaceC941540abo
            public final void LJI(C941550abp c941550abp, InterfaceC941570abr interfaceC941570abr) {
                if (this.LL) {
                    interfaceC941570abr.LIZIZ(c941550abp, 3);
                }
                if (c941550abp.LIZ == null) {
                    interfaceC941570abr.LIZIZ(c941550abp, 2);
                    return;
                }
                String str = c941550abp.LIZIZ;
                Iterator it2 = ((List) this.LLILLJJLI.getValue()).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (TextUtils.equals(str, ((C941550abp) next).LIZIZ)) {
                        if (next != null) {
                            interfaceC941570abr.LIZIZ(c941550abp, 1);
                            return;
                        }
                    }
                }
                ((List) this.LLILLJJLI.getValue()).add(c941550abp);
                ((Map) this.LLILLL.getValue()).put(c941550abp.LIZIZ, interfaceC941570abr);
                c941550abp.LIZ.setStartDelay(c941550abp.LIZJ);
                c941550abp.LIZ.removeListener(this);
                c941550abp.LIZ.addListener(this);
                c941550abp.LIZ.start();
            }
        };
    }
}
