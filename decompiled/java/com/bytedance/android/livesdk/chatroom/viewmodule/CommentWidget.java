package com.bytedance.android.livesdk.chatroom.viewmodule;

import X.AbstractC1143290frD;
import X.C00VQ;
import X.C01C5;
import X.C0IF2;
import X.C0IJT;
import X.C0IMD;
import X.C0IXW;
import X.C0IZP;
import X.C0J1N;
import X.C0K9Q;
import X.C0KRG;
import X.C0KXJ;
import X.C0KYL;
import X.C0TZM;
import X.C0UQJ;
import X.C1085000eLC;
import X.C1099700eiu;
import X.C1102950eo9;
import X.C1102960eoA;
import X.C1106360ete;
import X.C1110360f06;
import X.C1110530f0N;
import X.C1114360f6Y;
import X.C1114370f6Z;
import X.C1114380f6a;
import X.C1114400f6c;
import X.C1114460f6i;
import X.C1114480f6k;
import X.C1114510f6n;
import X.C1114540f6q;
import X.C1114600f6w;
import X.C1114660f72;
import X.C1114670f73;
import X.C1114720f78;
import X.C1114740f7A;
import X.C1114760f7C;
import X.C1115360f8A;
import X.C1115380f8C;
import X.C1115510f8P;
import X.C1119920fFW;
import X.C1143300frE;
import X.C1148170fz5;
import X.C1151450g4N;
import X.C1161920gLG;
import X.C11NJ;
import X.C11PQ;
import X.C11RD;
import X.C1338270kvh;
import X.C14KS;
import X.C1506330pIl;
import X.C1515210pX5;
import X.C1516680pZS;
import X.C1570050qxX;
import X.C1701940uOG;
import X.C181500mr;
import X.C1834150xpV;
import X.C19475811Ho;
import X.C19EG;
import X.C19GN;
import X.C19GO;
import X.C20337914i1;
import X.C20441214yg;
import X.C20736316Cj;
import X.C2093608Ic;
import X.C2188811AlT;
import X.C2348809Ig;
import X.C235100vV;
import X.C341701Uh;
import X.C446980Hfs;
import X.C473050Igp;
import X.C473130Igx;
import X.C474500IjA;
import X.C492290JSh;
import X.C494680Jac;
import X.C497740JfY;
import X.C498500Jgm;
import X.C500260Jjc;
import X.C501470JlZ;
import X.C501520Jle;
import X.C501540Jlg;
import X.C520890Kbn;
import X.C751500Tds;
import X.C752320TfC;
import X.C753280Tgk;
import X.C753900Thk;
import X.C753910Thl;
import X.C753920Thm;
import X.C755420TkC;
import X.C755520TkM;
import X.C760370TsB;
import X.C766270U4b;
import X.C773780UWy;
import X.C773790UWz;
import X.C776250Uch;
import X.C780690Ujr;
import X.C782110Um9;
import X.C782160UmE;
import X.C782190UmH;
import X.C782200UmI;
import X.C784440Upu;
import X.C785410UrT;
import X.C786410Ut5;
import X.C810670Vr7;
import X.C925000aB8;
import X.C960203pA;
import X.C963910bBt;
import X.DialogC19728412Gs;
import X.DialogInterfaceOnClickListenerC1151650g4h;
import X.DialogInterfaceOnClickListenerC521730Kd9;
import X.EnumC1102750enp;
import X.EnumC1114500f6m;
import X.EnumC1114820f7I;
import X.EnumC584890Mwp;
import X.EnumC760350Ts9;
import X.InterfaceC1106030et7;
import X.InterfaceC1114450f6h;
import X.InterfaceC1114610f6x;
import X.InterfaceC1114770f7D;
import X.InterfaceC1114800f7G;
import X.InterfaceC1115130f7n;
import X.InterfaceC1115280f82;
import X.InterfaceC465670INx;
import X.InterfaceC517340KQq;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnLongClickListenerC1151640g4g;
import Y.ACListenerS152S0100000_17;
import Y.AObjectS119S0000000_17;
import Y.AObjectS350S0100000_7;
import Y.AObjectS360S0100000_17;
import Y.ARunnableS117S0100000_17;
import Y.ARunnableS21S1200000_17;
import Y.ARunnableS22S1100000_17;
import Y.ARunnableS86S0200000_17;
import Y.ARunnableS94S0000000_17;
import Y.AcS497S0100000_17;
import Y.AfS186S0100000_17;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.LiveCommentAu16EligibleSetting;
import com.bytedance.android.live.CommentSendSuccessEvent;
import com.bytedance.android.live.CommentService;
import com.bytedance.android.live.CommentWidgetStyleChangeEvent;
import com.bytedance.android.live.CommentWidgetWidthChangeEvent;
import com.bytedance.android.live.ICommentService;
import com.bytedance.android.live.LiveCommentQuickEmojiSetting;
import com.bytedance.android.live.ShowKeyboardEvent;
import com.bytedance.android.live.UserWannaSendMessageEvent;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.BroadcastEndShowEvent;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.gift.DutyGiftChangedEvent;
import com.bytedance.android.live.gift.GiftDialogHeightChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessCorrectsRoundsChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundEndEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundStartEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.publicscreen.api.ShowReplyDialogEvent;
import com.bytedance.android.live.toolbar.HideShareLeadEvent;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.android.livesdk.chatroom.model.Barrage;
import com.bytedance.android.livesdk.chatroom.model.ChatEmojiListData;
import com.bytedance.android.livesdk.chatroom.model.CopyInfo;
import com.bytedance.android.livesdk.chatroom.model.EmoteChatResult;
import com.bytedance.android.livesdk.chatroom.model.InputAttrs;
import com.bytedance.android.livesdk.chatroom.model.ReplyInfo;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService;
import com.bytedance.android.livesdk.dataChannel.BanTalkEvent;
import com.bytedance.android.livesdk.dataChannel.CommentGuideEvent;
import com.bytedance.android.livesdk.dataChannel.CommentOrMessageData;
import com.bytedance.android.livesdk.dataChannel.DismissInputDialogEvent;
import com.bytedance.android.livesdk.dataChannel.DoSendMessageChannelEvent;
import com.bytedance.android.livesdk.dataChannel.EmoteBaseInformationListChannel;
import com.bytedance.android.livesdk.dataChannel.EmoteBitmapListChannel;
import com.bytedance.android.livesdk.dataChannel.EnigmaCommentEnableChannel;
import com.bytedance.android.livesdk.dataChannel.FirstFrameChannelEvent;
import com.bytedance.android.livesdk.dataChannel.HideInteractionEvent;
import com.bytedance.android.livesdk.dataChannel.InputDialogShowingChannel;
import com.bytedance.android.livesdk.dataChannel.IsFromLandscapeData;
import com.bytedance.android.livesdk.dataChannel.IsFromPortraitData;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.dataChannel.LoadUserAttrSuccess;
import com.bytedance.android.livesdk.dataChannel.OrientationChangedChannel;
import com.bytedance.android.livesdk.dataChannel.PIPStatusData;
import com.bytedance.android.livesdk.dataChannel.PreShowKeyboardEvent;
import com.bytedance.android.livesdk.dataChannel.QuestionCardChangeTextEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SubscribeSubOnlyChatChangeEvent;
import com.bytedance.android.livesdk.dataChannel.SubscribeSubOnlyOnBoardingOpen;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.comment.EnableShowToastCommentBannedSetting;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommentTypeMessageEnterFromSyncSetting;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommunityGuidelineSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveEnableNormalGiftAndBarrageSelfFirstlySetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarUIConfig;
import com.bytedance.android.livesdk.livesetting.other.ToolBarButtonWithTextExperiment;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveWidgetExitRoomOptSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LivePublicScreenChatRethinkSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubOnlyChatConfig;
import com.bytedance.android.livesdk.livesetting.wallet.LiveBalanceTrackingSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveCommentWidgetHotZoneOpt;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreloadInteractionLayerSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchLiveLeaksFixSetting;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.ScreenMessage;
import com.bytedance.android.livesdk.performance.emote.EmoteFixTextHelper;
import com.bytedance.android.livesdk.rethink.LiveRethinkBottomDialog;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.dataChannel.EnterLiveSourceChannel;
import com.bytedance.android.livesdkapi.depend.model.live.EpiphronDecision;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.ServerDataV2Structure;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostGatekeeper;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.android.message.IMessageService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.AnimatableRoomRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LayeredElementConfiguration;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;
import qo2.w;
import webcast.data.UserIdentity;

/* JADX INFO: loaded from: classes18.dex */
public class CommentWidget extends AnimatableRoomRecyclableWidget implements InterfaceC1114450f6h, InterfaceC1114800f7G {
    public static boolean LLLLLJLJLL = true;
    public LinearLayout LL;
    public LiveIconView LLILLJJLI;
    public FrameLayout LLILLL;
    public ViewGroup LLILZLL;
    public LiveIconView LLIZ;
    public TextView LLIZLLLIL;
    public C1106360ete LLJ;
    public View LLJI;
    public TextView LLJIJIL;
    public AnimatorSet LLJILJIL;
    public ValueAnimator LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public boolean LLJJIJI;
    public Room LLJJIJIIJIL;
    public C492290JSh LLJJIJIL;
    public boolean LLJJJ;
    public C19EG LLJJJIL;
    public String LLJJJJ;
    public String LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public C1114360f6Y LLJJLIIIJLLLLLLLZ;
    public C19GN LLJLIL;
    public String LLJZIJLIL;
    public DialogC19728412Gs LLL;
    public LiveDialog LLLF;
    public boolean LLLFF;
    public C1085000eLC LLLFFI;
    public C1085000eLC LLLFZ;
    public C1085000eLC LLLI;
    public long LLLIIIL;
    public long LLLIIL;
    public C19GN LLLIILIL;
    public C1114720f78 LLLIL;
    public boolean LLLILZ;
    public boolean LLLILZJ;
    public boolean LLLILZLLLI;
    public long LLLIZZ;
    public long LLLJ;
    public String LLILZ = "";
    public String LLILZIL = "";
    public boolean LLJJL = true;
    public final C11NJ LLJL = new C11NJ();
    public boolean LLJLILLLLZIIL = false;
    public boolean LLJLL = false;
    public String LLJLLIL = "";
    public String LLJLLL = "";
    public String LLJZ = "";
    public int LLLII = 0;
    public Long LLLIIII = null;
    public String LLLIIIIL = null;
    public boolean LLLJIL = false;
    public boolean LLLJL = false;
    public final C11PQ<Boolean> LLLL = new C11PQ<>();
    public LiveEmojiInputDialogFragment LLLLII = null;
    public boolean LLLLIIIILLL = false;
    public InputAttrs LLLLIIL = new InputAttrs();
    public final ISubscribeService LLLLIILL = (ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class);
    public ChatEmojiListData LLLLIILLL = null;
    public boolean LLLLIL = true;
    public boolean LLLLILI = false;
    public boolean LLLLJ = true;
    public final C1114380f6a LLLLJI = new InterfaceC1115130f7n() { // from class: X.0f6a
        public long LIZ;
        public long LIZIZ;
        public long LIZJ;
        public long LIZLLL;

        @Override // X.InterfaceC1115130f7n
        public final void LIZIZ() {
            if (this.LIZ == 0) {
                this.LIZ = SystemClock.elapsedRealtime();
            }
        }

        @Override // X.InterfaceC1115130f7n
        public final void Mc() {
            JSONObject jSONObject = this.LJ.LLLLIIL.trackInfo;
            if (jSONObject != null) {
                jSONObject.optInt("is_from_goody_bag", 0);
            }
        }

        @Override // X.InterfaceC1115130f7n
        public final void Qc() {
            if (this.LIZIZ == 0) {
                this.LIZIZ = SystemClock.elapsedRealtime();
            }
        }

        @Override // X.InterfaceC1115130f7n
        public final void LIZ() {
            this.LIZJ = SystemClock.elapsedRealtime();
        }

        @Override // X.InterfaceC1115130f7n
        public final void Oc() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.LIZLLL = jElapsedRealtime;
            CommentWidget commentWidget = this.LJ;
            DataChannel dataChannel = commentWidget.dataChannel;
            InputAttrs inputAttrs = commentWidget.LLLLIIL;
            long j = jElapsedRealtime - this.LIZJ;
            if (dataChannel != null) {
                Boolean bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("comment_input", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()));
                c474500IjALIZIZ.LJIJJLI(dataChannel);
                c474500IjALIZIZ.LJJII(dataChannel.gg0(C754000Thu.class), "input_from");
                if (dataChannel.gg0(LiveExtendedScreenStatus.class) == EnumC1083260eIO.SHOW) {
                    c474500IjALIZIZ.LJJII("live_extended_comment_filed", "event_page");
                }
                if (zBooleanValue) {
                    c474500IjALIZIZ.LJJII("more", "click_method");
                }
                c474500IjALIZIZ.LJJII(inputAttrs.mCommentMethod, "method");
                ReplyInfo replyInfo = inputAttrs.replyInfo;
                if (replyInfo != null && replyInfo.replyToId > 0) {
                    c474500IjALIZIZ.LJJII(Long.valueOf(replyInfo.msgId), "reply_message_id");
                    c474500IjALIZIZ.LJJII(Long.valueOf(replyInfo.releaseId), "reply_message_release_id");
                }
                c474500IjALIZIZ.LJJII(Long.valueOf(j), "interact_duration");
                C1114370f6Z.LJIIJ(c474500IjALIZIZ, dataChannel);
                ISendCommentEvent.Sender sender = inputAttrs.sender;
                if (sender != null && sender == ISendCommentEvent.Sender.COMMENT_COMBO_TRAY) {
                    c474500IjALIZIZ.LJJIIZI(sender.getLogArgs());
                }
                c474500IjALIZIZ.LIZ();
            }
        }

        @Override // X.InterfaceC1115130f7n
        public final void Pc(Boolean bool) {
            C1114360f6Y c1114360f6Y = this.LJ.LLJJLIIIJLLLLLLLZ;
            if (c1114360f6Y != null) {
                c1114360f6Y.LLILZ = bool;
            }
        }

        @Override // X.InterfaceC1115130f7n
        public final void Rc(InputAttrs inputAttrs) {
            long j;
            int i;
            String str;
            EmoteFixTextHelper emoteFixTextHelper;
            DataChannel dataChannel = this.LJ.dataChannel;
            if (dataChannel != null) {
                dataChannel.LC0(HideShareLeadEvent.class, Boolean.FALSE);
            }
            View view = this.LJ.contentView;
            C1EOY c1eoy = C1EOY.LIZ;
            HandlerHook.viewPostDelay(view, new ARunnableS94S0000000_17(3), LayeredElementConfiguration.INSTANCE.getAnimationDuration() + 1000);
            if (!TextUtils.isEmpty(this.LJ.LLJZIJLIL) && ((!TextUtils.isEmpty(inputAttrs.input) && inputAttrs.input.contains(this.LJ.LLJZIJLIL)) || ((emoteFixTextHelper = inputAttrs.emoteFixTextHelperForText) != null && !emoteFixTextHelper.textList.isEmpty() && inputAttrs.emoteFixTextHelperForText.LJII().contains(this.LJ.LLJZIJLIL)))) {
                j = this.LJ.LLLLIIL.replyInfo.replyToId;
            } else {
                j = 0;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            CommentWidget commentWidget = this.LJ;
            long j2 = commentWidget.LLLJ;
            int i2 = (int) ((jElapsedRealtime - j2) / 1000);
            DataChannel dataChannel2 = commentWidget.dataChannel;
            long j3 = this.LIZIZ;
            long j4 = j3 - j2;
            long j5 = this.LIZ - j3;
            if (CommentWidget.LLLLLJLJLL) {
                i = 1;
            } else if (commentWidget.LLLLIL) {
                i = 2;
            } else {
                i = 3;
            }
            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("comment_pannel_show_duration", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()));
            c474500IjALIZIZ.LJIJJLI(dataChannel2);
            c474500IjALIZIZ.LJJII(Integer.valueOf(i2), "duration");
            if (j != 0) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZIZ.LJJII(str, "is_message_reply");
            if (j != 0) {
                c474500IjALIZIZ.LJJII(Long.valueOf(j), "reply_user_id");
            }
            C1114370f6Z.LJIIJ(c474500IjALIZIZ, dataChannel2);
            if (j4 >= 0 && j5 >= 0) {
                c474500IjALIZIZ.LJJII(Long.valueOf(j4), "call_show_keyboard_latency");
                c474500IjALIZIZ.LJJII(Long.valueOf(j5), "keyboard_show_latency");
                c474500IjALIZIZ.LJJII(Long.valueOf(j4 + j5), "total_show_latency");
            }
            c474500IjALIZIZ.LJJII(Integer.valueOf(i), "panel_open_type");
            C1114370f6Z.LJIIJJI(c474500IjALIZIZ);
            c474500IjALIZIZ.LIZ();
            DataChannel dataChannel3 = this.LJ.dataChannel;
            if (dataChannel3 != null) {
                dataChannel3.SX0(C755520TkM.class, Boolean.FALSE);
            }
            this.LJ.LLLLIL = false;
            CommentWidget.LLLLLJLJLL = false;
            this.LIZIZ = 0L;
            this.LIZ = 0L;
            this.LIZLLL = 0L;
            this.LIZJ = 0L;
            C473050Igp.LIZIZ().LJFF(false);
            DataChannel dataChannel4 = this.LJ.dataChannel;
            if (dataChannel4 != null) {
                dataChannel4.zW(InputDialogShowingChannel.class, Boolean.FALSE);
            }
            CommentWidget commentWidget2 = this.LJ;
            commentWidget2.LLLLIIIILLL = false;
            commentWidget2.LLLLIIL = inputAttrs;
            commentWidget2.p2();
            CommentWidget commentWidget3 = this.LJ;
            if (commentWidget3.LLLJIL) {
                commentWidget3.n2();
            }
            this.LJ.LLLJIL = false;
            DataChannelGlobal.LLILZ.JQ2(C1148170fz5.class, "");
            this.LJ.LLJZ = "";
            if (WatchLiveLeaksFixSetting.enableLiveDialogLeakFix()) {
                this.LJ.LLLLII = null;
            }
        }

        @Override // X.InterfaceC1115130f7n
        public final void Nc(String str, C1114670f73 c1114670f73) {
            int i;
            String str2;
            if (!TextUtils.isEmpty(this.LJ.LLJZIJLIL) && str.contains(this.LJ.LLJZIJLIL)) {
                i = 1;
            } else {
                i = 0;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            CommentWidget commentWidget = this.LJ;
            DataChannel dataChannel = commentWidget.dataChannel;
            InputAttrs inputAttrs = commentWidget.LLLLIIL;
            long j = jElapsedRealtime - this.LIZLLL;
            if (dataChannel != null) {
                C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_send_button_click", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()));
                c474500IjALIZIZ.LJIJJLI(dataChannel);
                c474500IjALIZIZ.LJJII(Integer.valueOf(i), "is_tag");
                c474500IjALIZIZ.LJJII(Long.valueOf(j), "interact_duration");
                C1114370f6Z.LJIIJ(c474500IjALIZIZ, dataChannel);
                c474500IjALIZIZ.LJJII(inputAttrs.mCommentMethod, "method");
                int i2 = c1114670f73.LIZ;
                if (i2 != -1) {
                    c474500IjALIZIZ.LJJII(Integer.valueOf(i2), "send_button");
                }
                if (c1114670f73.LIZLLL) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                c474500IjALIZIZ.LJJII(str2, "is_whisper");
                c474500IjALIZIZ.LIZ();
            }
        }

        @Override // X.InterfaceC1115130f7n
        public final void Sc(InterfaceC1112060f2q interfaceC1112060f2q, Boolean bool) {
            ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).qu2(interfaceC1112060f2q);
            CommentWidget commentWidget = this.LJ;
            commentWidget.LLJZ = "";
            InputAttrs inputAttrs = commentWidget.LLLLIIL;
            inputAttrs.isQAStrengthen = false;
            C1114370f6Z.LIZJ(commentWidget.dataChannel, inputAttrs.replyInfo, "", "", null, inputAttrs, 0, 0L, bool.booleanValue(), "");
            this.LJ.D1();
            LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = this.LJ.LLLLII;
            if (liveEmojiInputDialogFragment != null) {
                liveEmojiInputDialogFragment.MR();
            }
        }

        @Override // X.InterfaceC1115130f7n
        public final void Tc(String str, String str2, boolean z, int i, C520890Kbn c520890Kbn, C1114670f73 c1114670f73, InterfaceC1114610f6x interfaceC1114610f6x) {
            String strLIZIZ = str;
            CommentWidget commentWidget = this.LJ;
            boolean z2 = commentWidget.LLJJIJI;
            if (!z2 && C494680Jac.LJIIJJI(z2, commentWidget.LLJJIJIIJIL) && !this.LJ.N1()) {
                C766270U4b.LIZLLL(2131841471);
                this.LJ.d2("subscription_error");
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_comment_sub_only_toast");
                c474500IjALIZ.LJIJJLI(this.LJ.dataChannel);
                c474500IjALIZ.LIZ();
                if (this.LJ.J1()) {
                    this.LJ.LLLLII.MR();
                    return;
                }
                return;
            }
            CommentWidget commentWidget2 = this.LJ;
            if (commentWidget2.LLJLL && commentWidget2.LLJJIJIIJIL.commentHasTextEmojiEmote == 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LJ.LLJZ);
                sbLIZ.append(strLIZIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            this.LJ.T1(strLIZIZ, str2, z, false, i, c520890Kbn, c1114670f73, this.LIZJ, interfaceC1114610f6x);
            CommentWidget commentWidget3 = this.LJ;
            commentWidget3.LLJZ = "";
            InputAttrs inputAttrs = commentWidget3.LLLLIIL;
            inputAttrs.isQAStrengthen = false;
            inputAttrs.inputWithEmote = "";
            if (commentWidget3.J1()) {
                this.LJ.LLLLII.MR();
            }
        }
    };
    public final C1114510f6n LLLLL = new C1114510f6n(this);
    public ViewOnLongClickListenerC1151640g4g LLLLLIL = new ViewOnLongClickListenerC1151640g4g(this, 1);
    public ViewOnLongClickListenerC1151640g4g LLLLLILLIL = new ViewOnLongClickListenerC1151640g4g(this, 2);
    public boolean LLLLLJIL = false;

    public static String H1(int i) {
        switch (i) {
            case 4010034:
                return "cg_violation";
            case 4010035:
                return "error";
            case 4010036:
            case 4010050:
            default:
                return "";
            case 4010037:
            case 4010038:
            case 4010039:
            case 4010040:
                return "muted_temp";
            case 4010041:
                return "muted_entire";
            case 4010042:
                return "secret_room";
            case 4010043:
                return "community_flagged_filter";
            case 4010044:
                return "comments_off";
            case 4010045:
                return "blocked";
            case 4010046:
                return "subscription_error";
            case 4010047:
                return "anchor_sensitive_word";
            case 4010048:
                return "spam_filter";
            case 4010049:
                return "emote_error";
            case 4010051:
                return "unkind_filter";
        }
    }

    public final void E1() {
        this.LLLILZ = false;
        p2();
        F1();
        z1(L1());
        if (this.LLILLJJLI != null) {
            C786410Ut5.i5(this.LLILLJJLI, 0.5f);
        }
    }

    public final void W1() {
        this.LLLILZ = true;
        p2();
        F1();
        z1(L1());
        if (!M1() || L1()) {
            if (this.LLILLJJLI != null) {
                C786410Ut5.i5(this.LLILLJJLI, 1.0f);
            }
        } else if (this.LLILLJJLI != null) {
            C786410Ut5.i5(this.LLILLJJLI, 0.5f);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRoomRecyclableWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void B1() {
        ValueAnimator valueAnimator = this.LLJILJILJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.LLJILJILJ = null;
        }
        this.LLJILLL = false;
        TextView textView = this.LLIZLLLIL;
        if (textView != null && this.LLJJ) {
            textView.setGravity(this.LLJJI);
            this.LLIZLLLIL.setTextAlignment(this.LLJJIII);
            this.LLJJ = false;
        }
        TextView textView2 = this.LLIZLLLIL;
        if (textView2 != null) {
            textView2.setText((CharSequence) null);
        }
        p2();
        g2();
    }

    public final void C1() {
        ReplyInfo replyInfo = this.LLLLIIL.replyInfo;
        replyInfo.replyToId = 0L;
        replyInfo.replyUserName = "";
        replyInfo.replyUserSecId = null;
        replyInfo.msgId = 0L;
        replyInfo.releaseId = 0L;
        this.LLJZIJLIL = null;
    }

    public final void F1() {
        C786410Ut5.T4(this.LLJI, 1.0f);
        e2(1.0f);
        boolean z = this.LLJJL;
        this.LLJJL = true;
        if (M1()) {
            X1(z);
        } else {
            h2(8);
            C786410Ut5.LLLFFI(this.LLJ, 0);
        }
    }

    public final boolean J1() {
        return this.LLLLII != null && this.LLLLIIIILLL;
    }

    public final boolean L1() {
        C492290JSh c492290JSh = this.LLJJIJIL;
        return c492290JSh != null && c492290JSh.LIZJ().LIZ;
    }

    public final boolean M1() {
        Room room = this.LLJJIJIIJIL;
        return room != null && this.dataChannel != null && this.LLLILZ && C494680Jac.LJIIJJI(this.LLJJIJI, room);
    }

    public final void a2() {
        EpiphronDecision epiphronDecision;
        Map<String, String> map;
        this.LLJJIJI = ((Boolean) this.dataChannel.gg0(UserIsAnchorChannel.class)).booleanValue();
        q2();
        Room room = this.LLJJIJIIJIL;
        if (room != null && (epiphronDecision = room.decisions) != null && (map = epiphronDecision.dataV2) != null) {
            try {
                ServerDataV2Structure serverDataV2Structure = (ServerDataV2Structure) C2348809Ig.LJII(ServerDataV2Structure.class, map.get("comment_input_placeholder"));
                ServerDataV2Structure serverDataV2Structure2 = (ServerDataV2Structure) C2348809Ig.LJII(ServerDataV2Structure.class, this.LLJJIJIIJIL.decisions.dataV2.get("comment_input_placeholder_inner"));
                if (serverDataV2Structure != null) {
                    this.LLILZ = serverDataV2Structure.value;
                }
                if (serverDataV2Structure2 != null) {
                    this.LLILZIL = serverDataV2Structure2.value;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        B1();
        if (this.LLJJIJIIJIL.getRoomAuthStatus() == null || this.LLJJIJIIJIL.getRoomAuthStatus().isEnableChat()) {
            W1();
            this.dataChannel.zW(CommentOrMessageData.class, Boolean.TRUE);
        } else {
            E1();
        }
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LIZ("ttlive_comment", "CommentWidget onLoad");
        x1();
        this.LLJJLIIIJLLLLLLLZ.attachView(this);
        DataChannelGlobal.LLILZ.BQ2(this, this, EmoteBitmapListChannel.class, new AObjectS119S0000000_17(1));
        DataChannelGlobal.LLILZ.BQ2(this, this, EmoteBaseInformationListChannel.class, new AObjectS119S0000000_17(2));
    }

    public final void g2() {
        if (this.LLIZLLLIL == null || this.LLIZ == null || this.LLJIJIL == null || this.LLJ == null) {
            return;
        }
        int iLIZIZ = C20736316Cj.LIZIZ(R.attr.exc, getContext());
        this.LLIZLLLIL.setTextColor(iLIZIZ);
        this.LLIZ.setIconTint(iLIZIZ);
        this.LLJIJIL.setTextColor(C20736316Cj.LIZIZ(R.attr.es6, getContext()));
        this.LLJ.setBackgroundColor(C20736316Cj.LIZIZ(R.attr.c93, getContext()));
    }

    public final void m2() throws JSONException {
        if (this.LLJJJ) {
            ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).i31("superfan_only_chat", false);
        } else {
            ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2().LIZ(this.context, this.LLJJIJIIJIL, "comment_area", null, null, 0L, 0L);
        }
    }

    public final void n2() {
        if (this.LLLILZ && C1114740f7A.LIZ(this.LLJJIJI)) {
            if (M1()) {
                X1(true);
                return;
            }
            if (!LiveSubOnlyChatConfig.INSTANCE.animationEnable()) {
                h2(8);
                C786410Ut5.LLLFFI(this.LLJ, 0);
                return;
            }
            h2(0);
            C786410Ut5.LLLFFI(this.LLJ, 0);
            AnimatorSet animatorSet = this.LLJILJIL;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.LLJILJIL = new AnimatorSet();
            if (N1()) {
                C786410Ut5.T4(this.LLJI, 0.0f);
                e2(1.0f);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLJ, (Property<C1106360ete, Float>) View.ALPHA, 1.0f, 0.0f);
                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat.setDuration(300L);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LLJI, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat2.setStartDelay(300L);
                objectAnimatorOfFloat2.setDuration(300L);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.LLJI, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
                objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat3.setStartDelay(600L);
                objectAnimatorOfFloat3.setDuration(300L);
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.LLJ, (Property<C1106360ete, Float>) View.ALPHA, 0.0f, 1.0f);
                objectAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat4.setStartDelay(900L);
                objectAnimatorOfFloat4.setDuration(300L);
                this.LLJILJIL.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
            } else {
                C786410Ut5.T4(this.LLJI, 1.0f);
                e2(0.0f);
                ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.LLJI, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
                objectAnimatorOfFloat5.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat5.setDuration(300L);
                ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.LLJ, (Property<C1106360ete, Float>) View.ALPHA, 0.0f, 1.0f);
                objectAnimatorOfFloat6.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat6.setStartDelay(300L);
                objectAnimatorOfFloat6.setDuration(300L);
                this.LLJILJIL.playTogether(objectAnimatorOfFloat5, objectAnimatorOfFloat6);
            }
            this.LLJILJIL.start();
            U1("", false);
        }
    }

    public final void o2() {
        if (this.LLJI == null || this.LLJ == null) {
            return;
        }
        if (!M1()) {
            h2(8);
            C786410Ut5.LLLFFI(this.LLJ, 0);
            return;
        }
        if (!LiveSubOnlyChatConfig.INSTANCE.animationEnable()) {
            h2(8);
            C786410Ut5.LLLFFI(this.LLJ, 0);
            return;
        }
        h2(0);
        C786410Ut5.LLLFFI(this.LLJ, 0);
        AnimatorSet animatorSet = this.LLJILJIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLJILJIL = new AnimatorSet();
        C786410Ut5.T4(this.LLJI, 1.0f);
        e2(0.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLJI, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LLJ, (Property<C1106360ete, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat2.setStartDelay(300L);
        objectAnimatorOfFloat2.setDuration(300L);
        this.LLJILJIL.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.LLJILJIL.start();
        U1("subscribed_not_expired", true);
    }

    public final void p2() {
        Context context;
        String string;
        if (this.LLJJIJI || (context = this.context) == null || this.LLJILLL) {
            return;
        }
        if (this.LLLILZ) {
            InputAttrs inputAttrs = this.LLLLIIL;
            if (inputAttrs.isUserBanned) {
                string = !TextUtils.isEmpty(this.LLILZ) ? this.LLILZ : this.context.getResources().getString(2131842873);
            } else {
                EmoteFixTextHelper emoteFixTextHelper = inputAttrs.emoteFixTextHelperForText;
                string = null;
                if (emoteFixTextHelper != null) {
                    if (emoteFixTextHelper.textList.isEmpty()) {
                        string = "";
                    } else {
                        StringBuilder sb = new StringBuilder();
                        int size = emoteFixTextHelper.textList.size();
                        for (int i = 0; i < size; i++) {
                            EmoteFixTextHelper.EmoteText emoteText = (EmoteFixTextHelper.EmoteText) ListProtector.get(emoteFixTextHelper.textList, i);
                            if (emoteText.state == 0) {
                                sb.append(emoteText.text);
                            }
                        }
                        StringBuilder sb2 = new StringBuilder();
                        C1115360f8A c1115360f8A = C1115380f8C.LIZ;
                        List<C1115510f8P> listLIZJ = C1115380f8C.LIZJ(null, sb);
                        ArrayList arrayList = new ArrayList();
                        for (C1115510f8P c1115510f8P : listLIZJ) {
                            int i2 = c1115510f8P.LIZIZ;
                            for (int i3 = c1115510f8P.LIZ; i3 < i2; i3++) {
                                arrayList.add(Integer.valueOf(i3));
                            }
                        }
                        int length = sb.length();
                        for (int i4 = 0; i4 < length; i4++) {
                            char cCharAt = sb.charAt(i4);
                            if (!C1110360f06.LIZIZ(cCharAt) && !arrayList.contains(Integer.valueOf(i4))) {
                                sb2.append(cCharAt);
                            }
                        }
                        string = sb2.toString();
                    }
                }
                if (TextUtils.isEmpty(string)) {
                    string = this.LLJLILLLLZIIL ? this.context.getResources().getString(2131841386) : this.LLLILZLLLI ? this.context.getResources().getString(2131842933) : !TextUtils.isEmpty(this.LLILZ) ? this.LLILZ : this.context.getResources().getString(2131842873);
                }
            }
        } else {
            string = context.getResources().getString(2131842702);
        }
        this.LLIZLLLIL.setText(string);
    }

    public final void q2() {
        Room room = (Room) this.dataChannel.gg0(RoomChannel.class);
        if (this.LLJJIJIIJIL == room) {
            return;
        }
        this.LLJJIJIIJIL = room;
        C492290JSh c492290JSh = this.LLJJIJIL;
        if (c492290JSh != null) {
            c492290JSh.LIZ();
        }
        ISubscriptionStatusService.LJIIIZ.getClass();
        C492290JSh c492290JShFi2 = C0K9Q.LIZ().fi2(this.LLJJIJIIJIL, this, this);
        this.LLJJIJIL = c492290JShFi2;
        if (c492290JShFi2 != null) {
            c492290JShFi2.LIZIZ(this, new AObjectS360S0100000_17(this, 90));
        }
    }

    public final void x1() {
        if (this.context == null || this.LLIZLLLIL == null || this.LLILLL == null) {
            return;
        }
        if (this.LLJJJJLIIL) {
            if (LiveCommentWidgetHotZoneOpt.INSTANCE.getValue()) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.contentView.getLayoutParams();
                marginLayoutParams.height = (int) C497740JfY.LIZIZ(56.0f);
                C786410Ut5.W5(this.contentView, marginLayoutParams);
            }
            if (LiveToolbarUIConfig.optimizeBackground()) {
                C1106360ete c1106360ete = this.LLJ;
                c1106360ete.setBackgroundColor(C235100vV.LIZ(R.attr.exb, c1106360ete.getContext()));
            } else {
                C1106360ete c1106360ete2 = this.LLJ;
                c1106360ete2.setBackgroundColor(C235100vV.LIZ(R.attr.c8w, c1106360ete2.getContext()));
            }
            this.LLJ.setStrokeWidth(0.0f);
            int iLIZ = C446980Hfs.LIZ(getContext(), R.color.a34);
            this.LLIZLLLIL.setTextColor(iLIZ);
            this.LLIZ.setIconTint(iLIZ);
            int iLIZIZ = C20736316Cj.LIZIZ(R.attr.ez3, this.context);
            if (this.LLJJJ) {
                this.LLJIJIL.setTextColor(iLIZIZ);
                this.LLJIJIL.setText(C497740JfY.LJIJI(2131856582));
            } else {
                this.LLJIJIL.setTextColor(iLIZIZ);
            }
        } else {
            int iLIZIZ2 = C20736316Cj.LIZIZ(R.attr.exc, getContext());
            this.LLIZLLLIL.setTextColor(iLIZIZ2);
            this.LLIZ.setIconTint(iLIZIZ2);
            this.LLJIJIL.setTextColor(C20736316Cj.LIZIZ(R.attr.es6, getContext()));
            this.LLJ.setBackgroundColor(C20736316Cj.LIZIZ(R.attr.c93, getContext()));
            this.LLIZLLLIL.setTextSize(0, C497740JfY.LIZIZ(14.0f));
            this.LLJ.setStrokeWidth(0.0f);
        }
        if (this.LLLILZJ) {
            C1106360ete c1106360ete3 = this.LLJ;
            c1106360ete3.setBackgroundColor(C235100vV.LIZ(R.attr.c8w, c1106360ete3.getContext()));
            this.LLIZLLLIL.setShadowLayer(this.context.getResources().getDimension(R.dimen.aly), this.context.getResources().getDimension(R.dimen.alw), this.context.getResources().getDimension(R.dimen.alx), C446980Hfs.LIZ(this.context, R.color.a35));
        }
        int i = C1102960eoA.LIZ[C1102950eo9.LIZIZ(this.dataChannel).ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            this.LLILLJJLI.setIconAttr(R.attr.czj);
            this.LLILLJJLI.setIconTint(C20736316Cj.LIZIZ(R.attr.exs, getContext()));
            this.LLIZ.setIconAttr(R.attr.dmk);
            this.LLIZ.setIconTint(C20736316Cj.LIZIZ(R.attr.ezt, C1834150xpV.LJII(getContext())));
        }
    }

    public final void D1() {
        if (J1()) {
            this.LLLLII.rS("");
        } else {
            this.LLLLIIL.input = "";
        }
    }

    public final void G1() {
        if (J1() && isViewValid()) {
            this.LLLLII.MR();
            this.LLLLIIL.isCopy = false;
            this.LLLLILI = false;
            this.dataChannel.LC0(PreShowKeyboardEvent.class, Boolean.FALSE);
        }
    }

    @Override // X.InterfaceC1114450f6h
    public final void Kw() {
        C766270U4b.LJFF(2131857057, getContext());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_au16_live_comment_toast");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LIZ();
    }

    public final boolean N1() {
        UserAttr userAttr;
        Map<Integer, Integer> map;
        Integer num;
        if (!L1()) {
            DataChannel dataChannel = this.dataChannel;
            boolean z = dataChannel != null && C01C5.LIZ(dataChannel);
            User userLIZIZ = C0KXJ.LIZIZ();
            boolean z2 = (userLIZIZ == null || (userAttr = userLIZIZ.getUserAttr()) == null || (map = userAttr.adminPermissions) == null || (num = map.get(13)) == null || num.intValue() != 1) ? false : true;
            if (!z || !z2) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return ToolBarButtonWithTextExperiment.hasText() ? R.layout.hr9 : LiveToolbarUIConfig.expandContainer() ? R.layout.hra : R.layout.hr_;
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LIZ("ttlive_comment", "CommentWidget onPause");
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LIZ("ttlive_comment", "CommentWidget onResume");
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRoomRecyclableWidget, com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void onHideAnimationEnd() {
        hide();
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRoomRecyclableWidget, com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void onShowAnimationStart() {
        show();
    }

    @Override // X.InterfaceC1114450f6h
    public final void oo1() {
        isViewValid();
    }

    public static void O1(boolean z) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_comment_emoji_icon");
        c474500IjALIZ.LJIIIIZZ();
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(w.LIZLLL(), "action_type");
        c474500IjALIZ.LJJII(w.LJIJI(), "request_id");
        if (z) {
            str = "show";
        } else {
            str = "click";
        }
        c474500IjALIZ.LJIILL(str);
        c474500IjALIZ.LIZ();
    }

    public final void A1(boolean z) {
        TextView textView;
        if (z && (textView = this.LLIZLLLIL) != null && !this.LLJJ) {
            this.LLJJI = textView.getGravity();
            this.LLJJIII = this.LLIZLLLIL.getTextAlignment();
            this.LLJJ = true;
            this.LLIZLLLIL.setTextAlignment(5);
            this.LLIZLLLIL.setGravity((this.LLJJI & 112) | 8388611);
        }
    }

    @Override // X.InterfaceC1114450f6h
    public final void Ah2(Barrage barrage) {
        if (!isViewValid()) {
            return;
        }
        D1();
        if (TextUtils.isEmpty(barrage.getOrderId())) {
            C766270U4b.LIZLLL(2131853435);
            return;
        }
        ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().Yb1(barrage.getLeftDiamond());
        if (LiveBalanceTrackingSetting.INSTANCE.getValue()) {
            ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().JG(EnumC1114500f6m.COMMENT_WIDGET.getValue(), this.LLLLIIL.requestPage, true);
        }
        if (LiveEnableNormalGiftAndBarrageSelfFirstlySetting.INSTANCE.getValue() && this.LLJJIJIIJIL != null && ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).get(this.LLJJIJIIJIL.getId()) != null && isViewValid()) {
            try {
                C1515210pX5.LIZLLL().getClass();
                C0IMD c0imdLJI = C1515210pX5.LJI(ScreenMessage.class);
                if (c0imdLJI != null) {
                    byte[] bArrDecode = Base64.decode(barrage.getScreenChatMsg(), 0);
                    C1516680pZS c1516680pZS = new C1516680pZS();
                    c1516680pZS.LJIIL(new C1506330pIl(bArrDecode));
                    ScreenMessage screenMessage = (ScreenMessage) c0imdLJI.LIZJ(c1516680pZS);
                    if (screenMessage != null) {
                        screenMessage.isLocalInsertMsg = true;
                        ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).get(this.LLJJIJIIJIL.getId()).insertMessage(screenMessage);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJ("ttlive_msg", e.toString());
            }
        }
        HashMap map = new HashMap();
        try {
            map.put("live_source", this.LLJJJJ);
            if (!TextUtils.isEmpty(this.LLJJIJIIJIL.getSourceType())) {
                map.put("moment_room_source", this.LLJJIJIIJIL.getSourceType());
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("send_barrage");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIIJJI("live_interact");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC1114450f6h
    public final void Fj0(EmoteChatResult emoteChatResult) throws JSONException {
        if (emoteChatResult != null) {
            Q1(emoteChatResult.msgId, null, null, 0, emoteChatResult.user, emoteChatResult.userIdentity, 0, 0L, 0L, null, 0L);
        }
    }

    public final void I1(String str) {
        C760370TsB c760370TsBLIZJ = C0KYL.LIZJ(str);
        c760370TsBLIZJ.LJIIIIZZ("bottom");
        if (((Boolean) this.dataChannel.gg0(C0TZM.class)).booleanValue()) {
            int iLJJI = (int) C497740JfY.LJJI((int) (C497740JfY.LJIILLIIL() * 0.9f));
            EnumC760350Ts9 enumC760350Ts9 = EnumC760350Ts9.DP;
            c760370TsBLIZJ.LJIIIZ(iLJJI, enumC760350Ts9);
            c760370TsBLIZJ.LJJ((int) C497740JfY.LJJI(C497740JfY.LJIIZILJ()), enumC760350Ts9);
        } else {
            EnumC760350Ts9 enumC760350Ts92 = EnumC760350Ts9.DP;
            c760370TsBLIZJ.LJIJI(8, enumC760350Ts92);
            c760370TsBLIZJ.LJIIIZ((int) C497740JfY.LJJI(C497740JfY.LJIILLIIL()), enumC760350Ts92);
            c760370TsBLIZJ.LJJ(395, enumC760350Ts92);
        }
        c760370TsBLIZJ.LJ(-1);
        ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(this.context, c760370TsBLIZJ.LIZ().toString(), null);
    }

    @Override // X.InterfaceC1114450f6h
    public final void Mh1(boolean z) {
        if (this.LLJJIJI) {
            C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.E4;
            if (z != c20337914i1.LIZIZ().booleanValue()) {
                c20337914i1.LJFF(Boolean.valueOf(z));
                C784440Upu.LIZ().LIZIZ(new C751500Tds(z));
                return;
            }
            return;
        }
        if (z) {
            W1();
        } else {
            E1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.0f78] */
    public final void P1(Exception exc) {
        HashMap map;
        String str;
        if (exc instanceof C501470JlZ) {
            C501470JlZ c501470JlZ = (C501470JlZ) exc;
            int errorCode = c501470JlZ.getErrorCode();
            if (50001 == errorCode) {
                C766270U4b.LJIIIZ(this.context, c501470JlZ.getPrompt());
                return;
            }
            if (50004 == errorCode) {
                D1();
                G1();
                C766270U4b.LJIIIZ(this.context, c501470JlZ.getPrompt());
                return;
            }
            if (errorCode == 50019) {
                G1();
                C1114760f7C.LIZ(this.context, "send_message", new InterfaceC1114770f7D() { // from class: X.0f6z
                });
                return;
            }
            if (errorCode == 50015) {
                G1();
                C766270U4b.LJFF(2131841472, this.context);
                d2("comments_off");
                return;
            }
            if (errorCode == 4010021) {
                if (EnableShowToastCommentBannedSetting.INSTANCE.enable() && !TextUtils.isEmpty(c501470JlZ.getPrompt())) {
                    C766270U4b.LJIILIIL(this.LLILLL, c501470JlZ.getPrompt());
                    if (this.LLJJIJI) {
                        map = new HashMap();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(this.LLJJIJIIJIL.author().getId());
                        sbLIZ.append("");
                        map.put("violation_anchor_id", C2188811AlT.LIZIZ(sbLIZ));
                    } else {
                        map = null;
                    }
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_violation_toast");
                    if (this.LLJJIJI) {
                        str = "anchor";
                    } else {
                        str = "user";
                    }
                    c474500IjALIZ.LJJII(str, "user_type");
                    c474500IjALIZ.LJJII("comment_ban", "violation_type");
                    c474500IjALIZ.LJJII("comment", "scene_type");
                    c474500IjALIZ.LJJIIZI(map);
                    c474500IjALIZ.LJIJJLI(this.dataChannel);
                    c474500IjALIZ.LIZ();
                    return;
                }
                if (C2093608Ic.LJ(c501470JlZ.getExtra())) {
                    return;
                }
                try {
                    ((Integer) new JSONObject(c501470JlZ.getExtra()).get("dueDate")).intValue();
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                i2(new Object() { // from class: X.0f78
                });
                return;
            }
            C766270U4b.LJIIIZ(this.context, c501470JlZ.getPrompt());
            return;
        }
        C766270U4b.LIZLLL(2131841867);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("unknown exception ");
        sbLIZ2.append(Log.getStackTraceString(exc));
        C20441214yg.LJ("CommentWidget", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.InterfaceC1114450f6h
    public final void PQ0(boolean z) {
        this.LLLLIIL.canSendDanmu = z;
    }

    public final void R1(C1110530f0N c1110530f0N) {
        j2(c1110530f0N, null, false);
    }

    public final void V1(boolean z) {
        if (!this.LLJJIJI && !this.LLLILZ) {
            C766270U4b.LJFF(2131841472, this.context);
            d2("comments_off_click_intercept");
            return;
        }
        boolean z2 = true;
        if (!this.LLLLJ) {
            if (!((IHostGatekeeper) C1161920gLG.LIZJ(IHostGatekeeper.class)).XA0()) {
                Kw();
                return;
            } else if (!this.LLJJJJLIIL && !((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
                this.dataChannel.SX0(C753910Thl.class, Long.valueOf(this.LLJJIJIIJIL.getId()));
                C784440Upu.LIZ().LIZIZ(new C0IF2(1));
                return;
            } else {
                ((IHostGatekeeper) C1161920gLG.LIZJ(IHostGatekeeper.class)).R31(getContext());
                return;
            }
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(HideShareLeadEvent.class, Boolean.TRUE);
        }
        this.LLLLIIL.requestPage = "live";
        if (z) {
            O1(false);
            if (!this.LLLLL.fu() || this.LLLLL.LIZ.LLJJIJI) {
                z2 = false;
            }
            EnumC1114820f7I enumC1114820f7I = EnumC1114820f7I.Panel;
            enumC1114820f7I.setPanelType("emoji");
            j2(null, enumC1114820f7I, z2);
            LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = this.LLLLII;
            if (liveEmojiInputDialogFragment != null) {
                liveEmojiInputDialogFragment.LLLLIL = new C1114600f6w(this, "liveroom_icon");
                return;
            }
            return;
        }
        if (!this.LLLLL.fu() || this.LLLLL.LIZ.LLJJIJI) {
            z2 = false;
        }
        j2(null, null, z2);
    }

    @Override // X.InterfaceC1114450f6h
    public final void Wr0(ChatMessage chatMessage) {
        if (!isViewValid()) {
            return;
        }
        D1();
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.insertMessage(chatMessage, true);
        }
    }

    public final void X1(boolean z) {
        if (LiveSubOnlyChatConfig.INSTANCE.animationEnable() && z) {
            h2(0);
            C786410Ut5.LLLFFI(this.LLJ, 0);
            AnimatorSet animatorSet = this.LLJILJIL;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.LLJILJIL = new AnimatorSet();
            C786410Ut5.T4(this.LLJI, 0.0f);
            e2(1.0f);
            if (N1()) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLJ, (Property<C1106360ete, Float>) View.ALPHA, 1.0f, 0.0f);
                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat.setDuration(300L);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LLJI, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat2.setStartDelay(300L);
                objectAnimatorOfFloat2.setDuration(300L);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.LLJI, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
                objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat3.setStartDelay(1600L);
                objectAnimatorOfFloat3.setDuration(300L);
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.LLJ, (Property<C1106360ete, Float>) View.ALPHA, 0.0f, 1.0f);
                objectAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat4.setStartDelay(1900L);
                objectAnimatorOfFloat4.setDuration(300L);
                this.LLJILJIL.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
            } else {
                ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.LLJ, (Property<C1106360ete, Float>) View.ALPHA, 1.0f, 0.0f);
                objectAnimatorOfFloat5.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat5.setDuration(300L);
                ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.LLJI, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                objectAnimatorOfFloat6.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat6.setStartDelay(300L);
                objectAnimatorOfFloat6.setDuration(300L);
                this.LLJILJIL.playTogether(objectAnimatorOfFloat5, objectAnimatorOfFloat6);
            }
            this.LLJILJIL.start();
            U1("", false);
            return;
        }
        if (N1()) {
            h2(8);
            C786410Ut5.LLLFFI(this.LLJ, 0);
        } else {
            h2(0);
            C786410Ut5.LLLFFI(this.LLJ, 8);
        }
    }

    @Override // X.InterfaceC1114450f6h
    public final void XG2(Exception exc) {
        P1(exc);
        if ((exc instanceof C501470JlZ) && ((C501520Jle) exc).getErrorCode() == 4010024) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscribe_expire");
            c474500IjALIZ.LJIJJLI(this.dataChannel);
            c474500IjALIZ.LJJII("sub_emote", "click_position");
            c474500IjALIZ.LIZ();
        }
    }

    public final <T> void Y1(Class<T> cls) {
        C784440Upu.LIZ().LJI(this, cls).LIZJ(new AfS186S0100000_17(this, 81));
    }

    public final void c2(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.LLJJIJIIJIL.getId()), "room_id");
        c474500IjALIZ.LIZ();
    }

    public final void d2(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_comment_block_comment_toast_show");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.LLJJIJIIJIL.getId()), "room_id");
        c474500IjALIZ.LJJII(str, "reason");
        c474500IjALIZ.LIZ();
    }

    public final void e2(float f) {
        if (!this.LLLLJ) {
            if (f > 0.5f) {
                f = 0.5f;
            }
            C1106360ete c1106360ete = this.LLJ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1106360ete);
            c1106360ete.setAlpha(f);
        } else {
            C1106360ete c1106360ete2 = this.LLJ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1106360ete2);
            c1106360ete2.setAlpha(f);
        }
        C786410Ut5.W4(this.LL, f);
    }

    public final void h2(int i) {
        C786410Ut5.LJLLLLLL(i, this.LLJI);
    }

    public final void i2(C1114720f78 c1114720f78) {
        if (((Boolean) this.dataChannel.gg0(PIPStatusData.class)).booleanValue()) {
            this.LLLIL = c1114720f78;
            return;
        }
        C19GN c19gn = this.LLLIILIL;
        if (c19gn != null) {
            c19gn.dismiss();
            C785410UrT.LIZ(c19gn);
        }
        String strLJIJI = C497740JfY.LJIJI(2131842536);
        C19GO c19go = new C19GO(getContext());
        c19go.LIZLLL = C497740JfY.LJIJI(2131841096);
        c19go.LJII = strLJIJI;
        c19go.LIZJ(2131843699, new DialogInterfaceOnClickListenerC521730Kd9(this, 2), false);
        c19go.LJ(2131841095, new DialogInterfaceOnClickListenerC521730Kd9(this, 3), false);
        c19go.LJJIIJ = false;
        this.LLLIILIL = c19go.LIZ();
        C473050Igp.LIZIZ().LIZ();
        C786410Ut5.B4(this.LLLIILIL);
    }

    public final void k2(C1085000eLC c1085000eLC) {
        DataChannel dataChannel;
        ARunnableS21S1200000_17 aRunnableS21S1200000_17;
        DialogC19728412Gs dialogC19728412GsLIZ;
        int iLJJJ;
        if (c1085000eLC != null && (dataChannel = this.dataChannel) != null) {
            if (((Boolean) dataChannel.gg0(PIPStatusData.class)).booleanValue()) {
                this.LLLFFI = c1085000eLC;
                return;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_comment_rethink_sw");
            c474500IjALIZ.LJIJJLI(this.dataChannel);
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
            c474500IjALIZ.LJJII(c1085000eLC.LJIIJ, "comment");
            c474500IjALIZ.LJJII(Integer.valueOf(TextUtils.equals(c1085000eLC.LJIIIZ, c1085000eLC.LJIIJ) ? 1 : 0), "resend_same_cmt");
            y1(c474500IjALIZ, c1085000eLC.LJIIZILJ, c1085000eLC.LJIJ);
            c474500IjALIZ.LIZ();
            DialogC19728412Gs dialogC19728412Gs = this.LLL;
            if (dialogC19728412Gs != null) {
                dialogC19728412Gs.dismiss();
                C785410UrT.LIZ(dialogC19728412Gs);
            }
            String value = LiveCommunityGuidelineSetting.INSTANCE.getValue();
            if (!TextUtils.isEmpty(value)) {
                aRunnableS21S1200000_17 = new ARunnableS21S1200000_17(this, value, c1085000eLC, 0);
            } else {
                aRunnableS21S1200000_17 = null;
            }
            Context context = getContext();
            ARunnableS86S0200000_17 aRunnableS86S0200000_17 = new ARunnableS86S0200000_17(this, c1085000eLC, 35);
            ARunnableS86S0200000_17 aRunnableS86S0200000_172 = new ARunnableS86S0200000_17(this, c1085000eLC, 36);
            if (LivePublicScreenChatRethinkSetting.enable()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                String strLJIJI = C497740JfY.LJIJI(2131846526);
                LivePublicScreenChatRethinkSetting livePublicScreenChatRethinkSetting = LivePublicScreenChatRethinkSetting.INSTANCE;
                String strLJIJJ = C497740JfY.LJIJJ(livePublicScreenChatRethinkSetting.getRethinkMsg(), strLJIJI);
                spannableStringBuilder.append((CharSequence) strLJIJJ);
                if (!TextUtils.isEmpty(strLJIJJ) && !TextUtils.isEmpty(strLJIJI) && (iLJJJ = a0.LJJJ(strLJIJJ, strLJIJI, 0, false, 6)) != -1) {
                    C1119920fFW.LJIIIIZZ(spannableStringBuilder, iLJJJ, strLJIJI.length() + iLJJJ, 33, 500);
                    if (aRunnableS21S1200000_17 != null) {
                        C786410Ut5.q2(spannableStringBuilder, new C1151450g4N(aRunnableS21S1200000_17, 1), iLJJJ, strLJIJI.length() + iLJJJ, 33);
                        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C960203pA.LIZ(R.attr.a1h, context)), iLJJJ, strLJIJI.length() + iLJJJ, 33);
                    }
                }
                if (LivePublicScreenChatRethinkSetting.enableV3()) {
                    C1114540f6q c1114540f6q = new C1114540f6q(context);
                    c1114540f6q.LIZ.getResources().getString(livePublicScreenChatRethinkSetting.getRethinkTitle());
                    c1114540f6q.LIZJ = spannableStringBuilder;
                    c1114540f6q.LIZLLL = new AwS596S0100000_17(aRunnableS86S0200000_17, 313);
                    c1114540f6q.LJ = new AwS596S0100000_17(aRunnableS86S0200000_172, 314);
                    dialogC19728412GsLIZ = new LiveRethinkBottomDialog(c1114540f6q.LIZ, c1114540f6q);
                } else {
                    C782110Um9 c782110Um9 = new C782110Um9(context);
                    c782110Um9.LJI(C20736316Cj.LJI(R.attr.eom, context));
                    c782110Um9.LJIIZILJ(livePublicScreenChatRethinkSetting.getRethinkTitle());
                    c782110Um9.LJIIIZ(spannableStringBuilder);
                    c782110Um9.LJIILLIIL = false;
                    c782110Um9.LJIILL = false;
                    C773780UWy c773780UWy = new C773780UWy();
                    C782200UmI c782200UmI = new C782200UmI();
                    c782200UmI.LIZ(2131843992, context);
                    c782200UmI.LIZJ = new AcS497S0100000_17(aRunnableS86S0200000_172, 6);
                    c773780UWy.LIZ(new C0UQJ(c782200UmI));
                    C782190UmH c782190UmH = new C782190UmH();
                    c782190UmH.LIZ(2131843993, context);
                    c782190UmH.LIZIZ = R.style.aka;
                    c782190UmH.LIZJ = new AcS497S0100000_17(aRunnableS86S0200000_17, 7);
                    c773780UWy.LIZ(new C782160UmE(c782190UmH));
                    c782110Um9.LIZLLL(new C773790UWz(c773780UWy));
                    dialogC19728412GsLIZ = c782110Um9.LIZ();
                }
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                String strLJIJI2 = C497740JfY.LJIJI(2131841868);
                String strLJIJJ2 = C497740JfY.LJIJJ(2131843991, strLJIJI2);
                spannableStringBuilder2.append((CharSequence) strLJIJJ2);
                if (!TextUtils.isEmpty(strLJIJJ2) && !TextUtils.isEmpty(strLJIJI2)) {
                    int iLJJJ2 = a0.LJJJ(strLJIJJ2, strLJIJI2, 0, false, 6);
                    if (iLJJJ2 != -1) {
                        C1119920fFW.LJIIIIZZ(spannableStringBuilder2, iLJJJ2, strLJIJI2.length() + iLJJJ2, 33, 500);
                    }
                    if (aRunnableS21S1200000_17 != null) {
                        C786410Ut5.q2(spannableStringBuilder2, new C1151450g4N(aRunnableS21S1200000_17, 0), iLJJJ2, strLJIJI2.length() + iLJJJ2, 33);
                    }
                }
                C19GO c19go = new C19GO(context);
                c19go.LJIIIZ = R.drawable.f_g;
                c19go.LJI(2131843994);
                c19go.LJIIIIZZ = spannableStringBuilder2;
                c19go.LIZJ(2131843993, new DialogInterfaceOnClickListenerC1151650g4h(aRunnableS86S0200000_17, 0), false);
                c19go.LJ(2131843992, new DialogInterfaceOnClickListenerC1151650g4h(aRunnableS86S0200000_172, 1), false);
                c19go.LJJIIJ = false;
                dialogC19728412GsLIZ = c19go.LIZ();
            }
            this.LLL = dialogC19728412GsLIZ;
            C473050Igp.LIZIZ().LIZ();
            this.LLLFF = false;
            C786410Ut5.B4(this.LLL);
        }
    }

    public final void l2(C1085000eLC c1085000eLC) {
        DataChannel dataChannel;
        ARunnableS22S1100000_17 aRunnableS22S1100000_17;
        if (c1085000eLC != null && (dataChannel = this.dataChannel) != null) {
            if (((Boolean) dataChannel.gg0(PIPStatusData.class)).booleanValue()) {
                this.LLLFZ = c1085000eLC;
                return;
            }
            c2("livesdk_comment_rethink_show");
            LiveDialog liveDialog = this.LLLF;
            if (liveDialog != null) {
                liveDialog.dismiss();
                C785410UrT.LIZ(liveDialog);
            }
            String value = LiveCommunityGuidelineSetting.INSTANCE.getValue();
            if (!TextUtils.isEmpty(value)) {
                aRunnableS22S1100000_17 = new ARunnableS22S1100000_17(this, value, 9);
            } else {
                aRunnableS22S1100000_17 = null;
            }
            Context context = getContext();
            ARunnableS117S0100000_17 aRunnableS117S0100000_17 = new ARunnableS117S0100000_17(this, 147);
            ARunnableS86S0200000_17 aRunnableS86S0200000_17 = new ARunnableS86S0200000_17(this, c1085000eLC, 37);
            String strLJIJI = C497740JfY.LJIJI(2131841868);
            String strLJIJJ = C497740JfY.LJIJJ(2131844659, strLJIJI);
            SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) strLJIJJ);
            if (!TextUtils.isEmpty(strLJIJJ) && !TextUtils.isEmpty(strLJIJI)) {
                int iLJJJ = a0.LJJJ(strLJIJJ, strLJIJI, 0, false, 6);
                if (iLJJJ != -1) {
                    C1119920fFW.LJIIIIZZ(spannableStringBuilderAppend, iLJJJ, strLJIJI.length() + iLJJJ, 33, 500);
                }
                if (aRunnableS22S1100000_17 != null) {
                    C786410Ut5.q2(spannableStringBuilderAppend, new C1151450g4N(aRunnableS22S1100000_17, 2), iLJJJ, strLJIJI.length() + iLJJJ, 33);
                }
            }
            C782110Um9 c782110Um9 = new C782110Um9(context);
            c782110Um9.LJI(C20736316Cj.LJI(R.attr.eom, context));
            c782110Um9.LJIIZILJ(2131844662);
            c782110Um9.LJIIIZ(spannableStringBuilderAppend);
            c782110Um9.LJIIJ(2131844660, new AcS497S0100000_17(aRunnableS117S0100000_17, 8));
            c782110Um9.LJIILIIL(2131844661, new AcS497S0100000_17(aRunnableS86S0200000_17, 9));
            LiveDialog liveDialogLIZ = c782110Um9.LIZ();
            this.LLLF = liveDialogLIZ;
            C786410Ut5.B4(liveDialogLIZ);
        }
    }

    public void onEvent(C0KRG c0krg) {
        User user = c0krg.LIZIZ;
        if (user == null) {
            return;
        }
        IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
        String str = c0krg.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(user.getId());
        sbLIZ.append("");
        iHostAction.showNotificationTipDialog(str, C2188811AlT.LIZIZ(sbLIZ), c0krg.LIZJ, user.getSecUid(), c0krg.LIZLLL, this.contentView, "", c0krg.LIZ, true, new InterfaceC517340KQq() { // from class: X.0f6y
            @Override // X.InterfaceC517340KQq
            public final void LIZ(int i) {
            }

            @Override // X.InterfaceC517340KQq
            public final void LIZIZ() {
            }
        });
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public final void onGetRoomInfo(Room room) {
        super.onGetRoomInfo(room);
        a2();
        if (LivePreloadInteractionLayerSetting.INSTANCE.isEnablePreload(this.dataChannel)) {
            C925000aB8 c925000aB8 = C963910bBt.LIZ;
            C963910bBt.LIZIZ = this.LLJJIJIIJIL;
            C963910bBt.LIZJ();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object... objArr) {
        String str;
        q2();
        this.LLJJJJJIL = (String) this.dataChannel.gg0(EnterLiveSourceChannel.class);
        this.LLJJJIL = C500260Jjc.LJ(this.context);
        this.LLJJLIIIJLLLLLLLZ = new C1114360f6Y();
        this.LLILLL = (FrameLayout) findViewById(R.id.i4k);
        this.LLIZLLLIL = (TextView) findViewById(R.id.goj);
        this.LLILZLL = (ViewGroup) findViewById(R.id.gom);
        this.LLIZ = (LiveIconView) findViewById(R.id.gol);
        this.LLJ = (C1106360ete) findViewById(R.id.gok);
        findViewById(R.id.ee4);
        this.LLJI = findViewById(R.id.edq);
        this.LLJIJIL = (TextView) findViewById(R.id.edr);
        int iLIZIZ = (int) C497740JfY.LIZIZ(375.0f);
        if (!this.LLLLL.fu() ? C14KS.LIZLLL() >= iLIZIZ : C14KS.LJFF() >= iLIZIZ) {
            C786410Ut5.LLJJIJIL(this.LLIZ, 0);
            O1(true);
        } else {
            C786410Ut5.LLJJIJIL(this.LLIZ, 8);
        }
        C1570050qxX.LIZ(new ACListenerS152S0100000_17(this, 83), this.LLILLL);
        C1570050qxX.LIZ(new ACListenerS152S0100000_17(this, 84), this.LLIZ);
        if (C810670Vr7.LIZJ(this.LLJJJIL, 0, "feed_live_span").getInt("span_count", 0) > 1) {
            str = "live_small_picture";
        } else {
            str = "live_big_picture";
        }
        this.LLJJJJ = str;
        this.LL = (LinearLayout) findViewById(R.id.nbw);
        this.LLILLJJLI = (LiveIconView) findViewById(R.id.lcn);
        C1570050qxX.LIZ(new ACListenerS152S0100000_17(this, 85), this.LL);
        DataChannel dataChannel = this.dataChannel;
        dataChannel.EQ2(this, FirstFrameChannelEvent.class, new AObjectS360S0100000_17(this, 88));
        dataChannel.EQ2(this, LoadUserAttrSuccess.class, new AObjectS360S0100000_17(this, 89));
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LIZ("ttlive_comment", "CommentWidget onInit");
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onUnload(RecycleSource recycleSource) {
        super.onUnload(recycleSource);
        B1();
        this.LLILZ = "";
        this.LLILZIL = "";
        FrameLayout frameLayout = this.LLILLL;
        if (frameLayout != null) {
            frameLayout.setOnLongClickListener(null);
            this.LLLLLIL = null;
        }
        LinearLayout linearLayout = this.LL;
        if (linearLayout != null) {
            linearLayout.setOnLongClickListener(null);
            this.LLLLLILLIL = null;
        }
        this.LLLLIILLL = null;
        Parcel parcelObtain = Parcel.obtain();
        this.LLLLIIL.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        this.dataChannel.SX0(C1114660f72.class, InputAttrs.CREATOR.createFromParcel(parcelObtain));
        parcelObtain.recycle();
        this.LLJLILLLLZIIL = false;
        this.LLLILZLLLI = false;
        InputAttrs inputAttrs = this.LLLLIIL;
        inputAttrs.requestPage = null;
        inputAttrs.sender = null;
        EmoteFixTextHelper emoteFixTextHelper = inputAttrs.emoteFixTextHelperForText;
        if (emoteFixTextHelper != null) {
            emoteFixTextHelper.textList.clear();
        }
        ICommentService iCommentService = (ICommentService) C1161920gLG.LIZJ(ICommentService.class);
        if (iCommentService instanceof CommentService) {
            ((CommentService) iCommentService).LL.LJIIJ(this.LLJJIJIIJIL.getId());
        }
        this.LLJL.LJ();
        resetAnim();
        this.LLJJLIIIJLLLLLLLZ.detachView();
        D1();
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = this.LLLLII;
        if (liveEmojiInputDialogFragment != null && liveEmojiInputDialogFragment.isAdded()) {
            this.LLLLII.MR();
        }
        this.LLLLIIIILLL = false;
        DialogC19728412Gs dialogC19728412Gs = this.LLL;
        if (dialogC19728412Gs != null) {
            dialogC19728412Gs.dismiss();
            C785410UrT.LIZ(dialogC19728412Gs);
            this.LLL = null;
        }
        C19GN c19gn = this.LLLIILIL;
        if (c19gn != null) {
            c19gn.dismiss();
            C785410UrT.LIZ(c19gn);
            this.LLLIILIL = null;
        }
        this.LLLFFI = null;
        this.LLLFZ = null;
        this.LLLIL = null;
        this.LLLI = null;
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LIZ("ttlive_comment", "CommentWidget onUnload");
        AnimatorSet animatorSet = this.LLJILJIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (this.LL != null) {
            C786410Ut5.W4(this.LL, 1.0f);
            C786410Ut5.LJZL(8, this.LL);
        }
        if (this.LLILLL != null) {
            C786410Ut5.U4(this.LLILLL, 1.0f);
            C786410Ut5.LJZ(0, this.LLILLL);
        }
        DataChannelGlobal.LLILZ.JQ2(C1148170fz5.class, "");
        if (!this.LLJJIJI && (this.LLJJJJLIIL || this.LLLL.LJLZ() == null || !this.LLLL.LJLZ().booleanValue())) {
            C1114370f6Z.LJ(System.currentTimeMillis() - this.LLLIZZ, this.dataChannel);
        }
        C1099700eiu.LIZ = 0;
        C1099700eiu.LIZIZ = null;
        ((LinkedList) C1099700eiu.LIZJ).clear();
    }

    public final void r2(final C1110530f0N c1110530f0N) {
        long id;
        String secUid;
        boolean z;
        if ("fans_club_task".equals(c1110530f0N.LJII)) {
            C1114370f6Z.LIZIZ = c1110530f0N.LJII;
        }
        InputAttrs inputAttrs = this.LLLLIIL;
        inputAttrs.requestPage = c1110530f0N.LJIIIZ;
        inputAttrs.sender = c1110530f0N.LJIIJ;
        String str = (String) this.dataChannel.gg0(C755420TkC.class);
        if (str != null) {
            C1114370f6Z.LIZ = str;
        }
        this.dataChannel.SX0(C755420TkC.class, c1110530f0N.LJII);
        C1();
        ReplyInfo replyInfo = this.LLLLIIL.replyInfo;
        User user = c1110530f0N.LIZLLL;
        if (user == null) {
            id = 0;
        } else {
            id = user.getId();
        }
        replyInfo.replyToId = id;
        ReplyInfo replyInfo2 = this.LLLLIIL.replyInfo;
        User user2 = c1110530f0N.LIZLLL;
        if (user2 == null) {
            secUid = null;
        } else {
            secUid = user2.getSecUid();
        }
        replyInfo2.replyUserSecId = secUid;
        ReplyInfo replyInfo3 = this.LLLLIIL.replyInfo;
        replyInfo3.msgId = c1110530f0N.LJIIL;
        replyInfo3.releaseId = c1110530f0N.LJIILIIL;
        String str2 = "";
        if (c1110530f0N.LIZ == 1) {
            replyInfo3.replyUserName = C341701Uh.LIZ("@%s", c1110530f0N.LIZIZ);
            ReplyInfo replyInfo4 = this.LLLLIIL.replyInfo;
            User user3 = c1110530f0N.LIZLLL;
            if (user3 != null && user3.isAnchorMarked) {
                z = true;
            } else {
                z = false;
            }
            replyInfo4.replyIsAnchorMarked = z;
        } else {
            replyInfo3.replyUserName = "";
        }
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = this.LLLLII;
        if (liveEmojiInputDialogFragment != null) {
            ReplyInfo replyInfo5 = this.LLLLIIL.replyInfo;
            InputAttrs inputAttrsOR = liveEmojiInputDialogFragment.OR();
            if (inputAttrsOR != null) {
                inputAttrsOR.replyInfo = replyInfo5;
            }
        }
        int i = c1110530f0N.LIZ;
        if (i == 1) {
            if (!isViewValid()) {
                return;
            }
            String strLIZ = c1110530f0N.LIZIZ;
            if (c1110530f0N.LJIIIIZZ) {
                this.LLJLL = false;
                strLIZ = C341701Uh.LIZ("@%s ", strLIZ);
            } else {
                this.LLJLL = true;
            }
            if (this.LLJLL && this.LLJJIJIIJIL.commentHasTextEmojiEmote != 0) {
                InputAttrs inputAttrs2 = this.LLLLIIL;
                inputAttrs2.isQAStrengthen = true;
                inputAttrs2.inputWithEmote = this.LLJZ;
            }
            this.LLJZIJLIL = C341701Uh.LIZ("@%s", c1110530f0N.LIZIZ);
            if (J1()) {
                this.LLLLII.rS(strLIZ);
                this.LLLLII.uS(this.LLLLIIL.replyInfo.replyUserName);
                LiveEmojiInputDialogFragment liveEmojiInputDialogFragment2 = this.LLLLII;
                String strLIZIZ = c1110530f0N.LJ;
                if (strLIZIZ == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c1110530f0N.LIZIZ);
                    sbLIZ.append(": ");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                liveEmojiInputDialogFragment2.sS(strLIZIZ, c1110530f0N.LJFF, c1110530f0N.LJI);
                return;
            }
            InputAttrs inputAttrs3 = this.LLLLIIL;
            inputAttrs3.input = strLIZ;
            inputAttrs3.content = c1110530f0N.LJFF;
            String strLIZIZ2 = c1110530f0N.LJ;
            if (strLIZIZ2 == null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(c1110530f0N.LIZIZ);
                sbLIZ2.append(": ");
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            }
            inputAttrs3.atName = strLIZIZ2;
            this.LLLLIIL.atEmoteWithIndexList = c1110530f0N.LJI;
            R1(c1110530f0N);
            return;
        }
        if (i == 2) {
            HandlerHook.viewPostDelay(this.LLILLL, new ARunnableS86S0200000_17(c1110530f0N, this, 16), 500L);
            return;
        }
        if (i == 3) {
            if (!isViewValid()) {
                return;
            }
            if (LiveCommentTypeMessageEnterFromSyncSetting.getValue() && !TextUtils.isEmpty(c1110530f0N.LJII)) {
                DataChannelGlobal.LLILZ.JQ2(C1148170fz5.class, c1110530f0N.LJII);
            }
            if (J1()) {
                List<EmoteWithIndex> list = c1110530f0N.LJI;
                if (list != null && !list.isEmpty()) {
                    this.LLLLIIL.emoteFixTextHelperForText.LJIIIZ(c1110530f0N.LJFF, c1110530f0N.LJI);
                    return;
                } else {
                    this.LLLLII.rS(c1110530f0N.LIZIZ);
                    return;
                }
            }
            List<EmoteWithIndex> list2 = c1110530f0N.LJI;
            if (list2 != null && !list2.isEmpty()) {
                InputAttrs inputAttrs4 = this.LLLLIIL;
                if (inputAttrs4.emoteFixTextHelperForText == null) {
                    inputAttrs4.emoteFixTextHelperForText = new EmoteFixTextHelper();
                }
                EmoteFixTextHelper emoteFixTextHelper = this.LLLLIIL.emoteFixTextHelperForText;
                emoteFixTextHelper.inputScene = EnumC584890Mwp.COMMENT;
                emoteFixTextHelper.LJIIIZ(c1110530f0N.LJFF, c1110530f0N.LJI);
            } else {
                this.LLLLIIL.input = c1110530f0N.LIZIZ;
            }
            R1(c1110530f0N);
            return;
        }
        if (i == 4) {
            if (!TextUtils.isEmpty(c1110530f0N.LJII)) {
                DataChannelGlobal.LLILZ.JQ2(C1148170fz5.class, c1110530f0N.LJII);
            }
            EnumC1114820f7I enumC1114820f7I = EnumC1114820f7I.Panel;
            enumC1114820f7I.setPanelType("emote");
            j2(c1110530f0N, enumC1114820f7I, false);
            LiveEmojiInputDialogFragment liveEmojiInputDialogFragment3 = this.LLLLII;
            if (liveEmojiInputDialogFragment3 != null) {
                liveEmojiInputDialogFragment3.LLLLIL = new InterfaceC1115280f82() { // from class: X.0f6r
                    @Override // X.InterfaceC1115280f82
                    public final void LIZ() {
                        EmoteModel emoteModel = c1110530f0N.LJIIJJI;
                        if (emoteModel == null || emoteModel.emoteScene != 1) {
                            LiveEmojiInputDialogFragment liveEmojiInputDialogFragment4 = this.LIZIZ.LLLLII;
                            liveEmojiInputDialogFragment4.iS();
                            liveEmojiInputDialogFragment4.LLJL.setIconAttr(R.attr.cjo);
                        }
                        this.LIZIZ.LLLLII.UR(c1110530f0N.LJIIJJI);
                    }
                };
                return;
            }
            return;
        }
        if (i == 5) {
            if (!TextUtils.isEmpty(c1110530f0N.LJII)) {
                DataChannelGlobal.LLILZ.JQ2(C1148170fz5.class, c1110530f0N.LJII);
            }
            EnumC1114820f7I enumC1114820f7I2 = EnumC1114820f7I.Panel;
            enumC1114820f7I2.setPanelType("emote");
            j2(c1110530f0N, enumC1114820f7I2, false);
            LiveEmojiInputDialogFragment liveEmojiInputDialogFragment4 = this.LLLLII;
            if (liveEmojiInputDialogFragment4 != null) {
                liveEmojiInputDialogFragment4.LLLLIL = new InterfaceC1115280f82() { // from class: X.0f6u
                    @Override // X.InterfaceC1115280f82
                    public final void LIZ() {
                        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment5 = this.LIZ.LLLLII;
                        liveEmojiInputDialogFragment5.iS();
                        liveEmojiInputDialogFragment5.LLJL.setIconAttr(R.attr.cjo);
                    }
                };
                return;
            }
            return;
        }
        if (i == 6) {
            if (!TextUtils.isEmpty(c1110530f0N.LJII)) {
                DataChannelGlobal.LLILZ.JQ2(C1148170fz5.class, c1110530f0N.LJII);
            }
            EnumC1114820f7I enumC1114820f7I3 = EnumC1114820f7I.Panel;
            enumC1114820f7I3.setPanelType("emoji");
            j2(null, enumC1114820f7I3, false);
            LiveEmojiInputDialogFragment liveEmojiInputDialogFragment5 = this.LLLLII;
            if (liveEmojiInputDialogFragment5 != null) {
                liveEmojiInputDialogFragment5.LLLLIL = new C1114600f6w(this, str2);
                return;
            }
            return;
        }
        if (i == 8) {
            if (!isViewValid()) {
                return;
            }
            this.LLLLIIL.starlingKey = c1110530f0N.LJIILLIIL;
            if (J1()) {
                this.LLLLII.rS(c1110530f0N.LIZIZ);
                return;
            } else {
                this.LLLLIIL.input = c1110530f0N.LIZIZ;
                R1(c1110530f0N);
                return;
            }
        }
        if (i == 9) {
            this.LLLLIIL.isCopy = true;
            this.LLLLILI = true;
            if (J1()) {
                CopyInfo copyInfo = this.LLLLIIL.copyInfo;
                copyInfo.content = c1110530f0N.LJFF;
                copyInfo.emoteModelList = c1110530f0N.LJI;
                LiveEmojiInputDialogFragment liveEmojiInputDialogFragment6 = this.LLLLII;
                if (liveEmojiInputDialogFragment6.isAdded() && !liveEmojiInputDialogFragment6.LLJILLL) {
                    InputAttrs inputAttrsOR2 = liveEmojiInputDialogFragment6.OR();
                    if (inputAttrsOR2 != null) {
                        inputAttrsOR2.copyInfo = copyInfo;
                    }
                    liveEmojiInputDialogFragment6.bS();
                    liveEmojiInputDialogFragment6.oS();
                    liveEmojiInputDialogFragment6.aS();
                    return;
                }
                return;
            }
            InputAttrs inputAttrs5 = this.LLLLIIL;
            if (inputAttrs5.emoteFixTextHelperForText == null) {
                inputAttrs5.emoteFixTextHelperForText = new EmoteFixTextHelper();
            }
            EmoteFixTextHelper emoteFixTextHelper2 = this.LLLLIIL.emoteFixTextHelperForText;
            emoteFixTextHelper2.inputScene = EnumC584890Mwp.COMMENT;
            emoteFixTextHelper2.LJIIIZ(c1110530f0N.LJFF, c1110530f0N.LJI);
            R1(c1110530f0N);
            return;
        }
        if (!TextUtils.isEmpty(c1110530f0N.LJII)) {
            DataChannelGlobal.LLILZ.JQ2(C1148170fz5.class, c1110530f0N.LJII);
        }
        R1(c1110530f0N);
    }

    @Override // X.InterfaceC1114450f6h
    public final void wX0(Exception exc) {
        if (exc instanceof C501470JlZ) {
            C501470JlZ c501470JlZ = (C501470JlZ) exc;
            int errorCode = c501470JlZ.getErrorCode();
            if (50001 == errorCode) {
                C766270U4b.LJIIIZ(this.context, c501470JlZ.getPrompt());
                return;
            }
            if (50004 != errorCode && 50014 != errorCode && 80074 != errorCode) {
                if (errorCode == 50019) {
                    G1();
                    C1114760f7C.LIZ(this.context, "send_barrage", new InterfaceC1114770f7D() { // from class: X.0f70
                    });
                    return;
                } else {
                    C501540Jlg.LIZJ(getContext(), c501470JlZ);
                    return;
                }
            }
            D1();
            G1();
            C766270U4b.LJIIIZ(this.context, c501470JlZ.getPrompt());
            return;
        }
        C766270U4b.LJFF(2131853435, this.context);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unknown exception ");
        sbLIZ.append(exc.toString());
        C20441214yg.LIZIZ("CommentWidget", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void z1(boolean z) {
        if (M1() && !z) {
            C498500Jgm.LJ("sub_only_comment_limit", null);
        }
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_comment_area_mode", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
        String connectionType = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getConnectionType();
        String str = "normal";
        if (TextUtils.equals(connectionType, "normal")) {
            Room room = this.LLJJIJIIJIL;
            if (room != null) {
                c474500IjALIZIZ.LJJII(C00VQ.LIZ(room), "connection_type");
            }
        } else {
            c474500IjALIZIZ.LJJII(connectionType, "connection_type");
        }
        if (M1()) {
            str = "sub_only";
        }
        c474500IjALIZIZ.LJJII(str, "mode");
        c474500IjALIZIZ.LJJII(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).oE2(), "core_connection_type");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZIZ.LJIJ())) {
            c474500IjALIZIZ.LJIJJLI(this.dataChannel);
            c474500IjALIZIZ.LIZ();
            return;
        }
        c474500IjALIZIZ.LJJIJLIJ();
        c474500IjALIZIZ.LJIIIIZZ();
        w.LIZ.getClass();
        c474500IjALIZIZ.LJIILJJIL(w.LJIILIIL());
        c474500IjALIZIZ.LJJII(w.LJJII(), "video_id");
        c474500IjALIZIZ.LJJII(w.LJIJI(), "request_id");
        c474500IjALIZIZ.LJJII(w.LIZLLL(), "action_type");
        c474500IjALIZIZ.LJJII(w.LJIILIIL(), "event_page");
        c474500IjALIZIZ.LJJIJL();
    }

    public void onEvent(C751500Tds c751500Tds) {
        if (!this.LLJJIJI) {
            return;
        }
        if (c751500Tds.LIZ) {
            W1();
        } else {
            E1();
        }
    }

    public void onEvent(C1110530f0N c1110530f0N) {
        r2(c1110530f0N);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U1(java.lang.String r6, boolean r7) {
        /*
            r5 = this;
            double r0 = com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting.getSAMPLE_0()
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "livesdk_subscription_sub_only_comment_show"
            X.0IjA r4 = X.C0IJT.LIZIZ(r0, r1)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r5.dataChannel
            r4.LJIJJLI(r0)
            boolean r0 = r5.LLJJIJI
            if (r0 == 0) goto L58
            java.lang.String r1 = "anchor"
        L19:
            java.lang.String r0 = "user_type"
            r4.LJJII(r1, r0)
            if (r7 != 0) goto L43
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r5.LLJJIJIIJIL
            r2 = 0
            if (r3 == 0) goto L55
            com.bytedance.android.live.base.model.user.User r0 = r3.getOwner()
            if (r0 == 0) goto L51
            boolean r1 = r0.isSubscribed()
        L2f:
            com.bytedance.android.live.base.model.user.User r0 = r3.getOwner()
            if (r0 == 0) goto L3f
            com.bytedance.android.live.base.model.user.SubscribeInfo r0 = r0.getSubscribeInfo()
            if (r0 == 0) goto L3f
            boolean r2 = r0.isInGracePeriod()
        L3f:
            if (r1 == 0) goto L4c
            java.lang.String r6 = "subscribed_not_expired"
        L43:
            java.lang.String r0 = "subscribe_state"
            r4.LJJII(r6, r0)
            r4.LIZ()
            return
        L4c:
            if (r2 == 0) goto L55
            java.lang.String r6 = "subscribed_expired_grace_period"
            goto L43
        L51:
            r1 = 0
            if (r3 == 0) goto L3f
            goto L2f
        L55:
            java.lang.String r6 = "not_subscribed"
            goto L43
        L58:
            java.lang.String r1 = "user"
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget.U1(java.lang.String, boolean):void");
    }

    @Override // X.InterfaceC1114450f6h
    public final void ea0(C1114480f6k c1114480f6k, Exception exc) {
        Long l;
        if (exc instanceof C501470JlZ) {
            C501470JlZ c501470JlZ = (C501470JlZ) exc;
            int errorCode = c501470JlZ.getErrorCode();
            String str = null;
            Pair<Long, String> pairB2 = b2(c1114480f6k.LIZIZ(), null, c501470JlZ);
            if (errorCode != 4010020) {
                switch (errorCode) {
                    case 4010034:
                        C766270U4b.LIZLLL(2131844657);
                        d2("cg_violation");
                        break;
                    case 4010035:
                        C766270U4b.LIZLLL(2131844658);
                        d2("error");
                        break;
                    case 4010036:
                        DataChannel dataChannel = this.dataChannel;
                        if (dataChannel != null) {
                            l2(new C1085000eLC((String) dataChannel.gg0(C753900Thk.class), c1114480f6k.LIZIZ(), c1114480f6k.LJI(), c1114480f6k.LJ(), c1114480f6k.LIZLLL(), c1114480f6k.LJFF(), c1114480f6k.LIZ(), c1114480f6k.LIZJ(), null, null));
                        }
                        break;
                    default:
                        P1(exc);
                        if (H1(errorCode).length() != 0) {
                            d2(H1(errorCode));
                        }
                        break;
                }
            } else {
                DataChannel dataChannel2 = this.dataChannel;
                if (dataChannel2 != null) {
                    String str2 = (String) dataChannel2.gg0(C753900Thk.class);
                    String strLIZIZ = c1114480f6k.LIZIZ();
                    String strLJI = c1114480f6k.LJI();
                    boolean zLJ = c1114480f6k.LJ();
                    int iLIZLLL = c1114480f6k.LIZLLL();
                    ISendCommentEvent.Sender senderLJFF = c1114480f6k.LJFF();
                    Map<String, Object> mapLIZ = c1114480f6k.LIZ();
                    C1114670f73 c1114670f73LIZJ = c1114480f6k.LIZJ();
                    if (pairB2 == null) {
                        l = null;
                    } else {
                        l = (Long) pairB2.first;
                        str = (String) pairB2.second;
                    }
                    k2(new C1085000eLC(str2, strLIZIZ, strLJI, zLJ, iLIZLLL, senderLJFF, mapLIZ, c1114670f73LIZJ, l, str));
                }
            }
        } else {
            P1(exc);
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.SX0(C753900Thk.class, c1114480f6k.LIZIZ());
        }
    }

    public final void f2(final String str, boolean z) {
        final boolean zLJJ;
        TextView textView = this.LLIZLLLIL;
        if (textView == null) {
            return;
        }
        if (textView.getLayoutDirection() == 1) {
            zLJJ = true;
        } else {
            zLJJ = C497740JfY.LJJ();
        }
        if (!z) {
            A1(zLJJ);
            this.LLIZLLLIL.setText(str);
            return;
        }
        A1(zLJJ);
        this.LLIZLLLIL.setText("");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, str.length());
        this.LLJILJILJ = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(1500L);
        this.LLJILJILJ.setInterpolator(new LinearInterpolator());
        this.LLJILJILJ.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0KV3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i;
                int currentTextColor;
                CommentWidget commentWidget = this.LL;
                String str2 = str;
                boolean z2 = zLJJ;
                commentWidget.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView textView2 = commentWidget.LLIZLLLIL;
                int length = str2.length();
                int iMin = Math.min((int) fFloatValue, length);
                float f = fFloatValue - iMin;
                CharSequence charSequence = str2;
                if (iMin < length) {
                    int iMin2 = Math.min(iMin + 1, length);
                    int i2 = 0;
                    if (z2) {
                        i = length - iMin2;
                    } else {
                        i = 0;
                        length = iMin2;
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2, i, length);
                    TextView textView3 = commentWidget.LLIZLLLIL;
                    if (textView3 != null) {
                        currentTextColor = textView3.getCurrentTextColor();
                    } else {
                        currentTextColor = -1;
                    }
                    int iMin3 = Math.min(255, Math.max(0, (int) (f * 255.0f)));
                    if (!z2) {
                        i2 = (iMin2 - 1) - i;
                    }
                    C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(Color.argb(iMin3, Color.red(currentTextColor), Color.green(currentTextColor), Color.blue(currentTextColor))), i2, i2 + 1, 33);
                    charSequence = spannableStringBuilder;
                }
                textView2.setText(charSequence);
            }
        });
        this.LLJILJILJ.addListener(new AnimatorListenerAdapter() { // from class: X.0eJh
            public boolean LL;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                this.LL = true;
                CommentWidget commentWidget = this.LLILLL;
                commentWidget.LLJILLL = false;
                commentWidget.LLJILJILJ = null;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                CommentWidget commentWidget = this.LLILLL;
                commentWidget.LLJILLL = false;
                commentWidget.LLJILJILJ = null;
                if (!this.LL) {
                    commentWidget.f2(str, false);
                }
            }
        });
        this.LLJILJILJ.start();
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public void onLoad(RecycleSource recycleSource, Object[] objArr) throws JSONException {
        boolean zEquals;
        Long l;
        Long l2;
        Room room;
        List<String> list;
        if (LiveCommentAu16EligibleSetting.INSTANCE.getValue()) {
            boolean zF20 = ((IHostGatekeeper) C1161920gLG.LIZJ(IHostGatekeeper.class)).F20();
            this.LLLLJ = zF20;
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.SX0(C753280Tgk.class, Boolean.valueOf(zF20));
            }
        }
        C20441214yg.LIZIZ("LiveCommentEligible", String.valueOf(this.LLLLJ));
        this.LLJJJ = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Kw0(this.dataChannel);
        Map<String, Object> map = C1338270kvh.LIZ;
        Y1(C1110530f0N.class);
        Y1(C751500Tds.class);
        Y1(C0KRG.class);
        if (this.LLJJIJIIJIL != null && this.LLILLL != null) {
            this.LLJJIJI = ((Boolean) this.dataChannel.gg0(UserIsAnchorChannel.class)).booleanValue();
            InputAttrs inputAttrs = (InputAttrs) this.dataChannel.gg0(C1114660f72.class);
            this.LLLLIL = ((Boolean) this.dataChannel.gg0(C755520TkM.class)).booleanValue();
            if (inputAttrs != null) {
                this.LLLLIIL = inputAttrs;
                p2();
            } else {
                C1();
            }
            this.LLLLIIL.isBroadcaster = this.LLJJIJI;
            q2();
            this.LLJJL = !((Boolean) this.dataChannel.gg0(OrientationChangedChannel.class)).booleanValue();
            ICommentService iCommentService = (ICommentService) C1161920gLG.LIZJ(ICommentService.class);
            if (iCommentService instanceof CommentService) {
                ((CommentService) iCommentService).LL.LJIIIZ(this.LLJJIJIIJIL.getId(), this);
            }
            this.LLJJJJLIIL = ((Boolean) this.dataChannel.gg0(C0TZM.class)).booleanValue();
            this.LLJJJJJIL = (String) this.dataChannel.gg0(EnterLiveSourceChannel.class);
            this.LLJJJIL = C500260Jjc.LJ(this.context);
            Boolean bool = Boolean.TRUE;
            this.LLLILZJ = bool.equals(this.dataChannel.gg0(C780690Ujr.class));
            a2();
            DataChannel dataChannel2 = this.dataChannel;
            dataChannel2.BQ2(this, UserWannaSendMessageEvent.class, new AObjectS360S0100000_17(this, 91));
            dataChannel2.BQ2(this, DoSendMessageChannelEvent.class, new AObjectS360S0100000_17(this, 101));
            dataChannel2.BQ2(this, BanTalkEvent.class, new AObjectS360S0100000_17(this, 103));
            dataChannel2.EQ2(this, DutyGiftChangedEvent.class, new AObjectS360S0100000_17(this, 104));
            dataChannel2.BQ2(this, DismissInputDialogEvent.class, new AObjectS360S0100000_17(this, 105));
            dataChannel2.BQ2(this, HideInteractionEvent.class, new AObjectS360S0100000_17(this, 106));
            dataChannel2.BQ2(this, BroadcastEndShowEvent.class, new AObjectS360S0100000_17(this, 107));
            dataChannel2.BQ2(this, PIPStatusData.class, new AObjectS360S0100000_17(this, 85));
            dataChannel2.BQ2(this, QuestionCardChangeTextEvent.class, new AObjectS360S0100000_17(this, 86));
            dataChannel2.BQ2(this, SubscribeSubOnlyChatChangeEvent.class, new AObjectS360S0100000_17(this, 87));
            dataChannel2.BQ2(this, SubscribeSubOnlyOnBoardingOpen.class, new AObjectS360S0100000_17(this, 92));
            dataChannel2.BQ2(this, GiftDialogHeightChannel.class, new AObjectS360S0100000_17(this, 93));
            dataChannel2.BQ2(this, CommentWidgetWidthChangeEvent.class, new AObjectS360S0100000_17(this, 94));
            dataChannel2.BQ2(this, ShowReplyDialogEvent.class, new AObjectS360S0100000_17(this, 95));
            if (this.LLJJIJI) {
                EnumC1102750enp.COMMENT.load(this.dataChannel, new C752320TfC(this.context));
            } else {
                DataChannel dataChannel3 = this.dataChannel;
                dataChannel3.EQ2(this, DrawGuessRoundStartEvent.class, new AObjectS360S0100000_17(this, 96));
                dataChannel3.BQ2(this, DrawGuessRoundEndEvent.class, new AObjectS360S0100000_17(this, 97));
                dataChannel3.BQ2(this, DrawGuessCorrectsRoundsChannel.class, new AObjectS360S0100000_17(this, 99));
            }
            C1143300frE.LJIIJJI().getClass();
            AbstractC1143290frD.LIZ("ttlive_comment", "CommentWidget onLoad");
            x1();
            if (!this.LLJJJJLIIL) {
                this.LLJL.LIZ(((C0J1N) new C19475811Ho(this.LLLL.LJJIFFI()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(this))).LIZJ(new AfS186S0100000_17(this, 79)));
                this.LLJL.LIZ(((C0J1N) C784440Upu.LIZ().LJ(C473130Igx.class).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(this))).LIZJ(new AfS186S0100000_17(this, 80)));
            }
            if (this.LLJJJJLIIL || !InterfaceC465670INx.LJLILLLLZI.LIZIZ().booleanValue()) {
                DataChannel dataChannel4 = this.dataChannel;
                boolean z = this.LLLILZ;
                if (dataChannel4 != null) {
                    zEquals = bool.equals(dataChannel4.gg0(EnigmaCommentEnableChannel.class));
                } else {
                    zEquals = false;
                }
                C1114370f6Z.LJFF(z, zEquals, dataChannel4);
            }
            this.LLLIZZ = System.currentTimeMillis();
            DataChannelGlobal.LLILZ.BQ2(this, this, ShowKeyboardEvent.class, new AObjectS360S0100000_17(this, 100));
            if (!this.LLJJIJI && this.LLJJJJLIIL && LiveCommentQuickEmojiSetting.showQuickEmoji((Room) this.dataChannel.gg0(RoomChannel.class)) && (room = this.LLJJIJIIJIL) != null && (list = room.emojiList) != null && list.size() > 0) {
                ChatEmojiListData chatEmojiListData = new ChatEmojiListData();
                this.LLLLIILLL = chatEmojiListData;
                chatEmojiListData.emojiList = this.LLJJIJIIJIL.emojiList;
            }
            if (this.LLJJIJIIJIL != null && (l2 = (Long) this.dataChannel.gg0(C753910Thl.class)) != null && l2.longValue() == this.LLJJIJIIJIL.getId()) {
                ((IHostGatekeeper) C1161920gLG.LIZJ(IHostGatekeeper.class)).R31(getContext());
                this.dataChannel.SX0(C753910Thl.class, null);
            }
            if (this.LLJJIJIIJIL != null && (l = (Long) this.dataChannel.gg0(C753920Thm.class)) != null && l.longValue() == this.LLJJIJIIJIL.getId()) {
                m2();
                this.dataChannel.SX0(C753920Thm.class, null);
            }
        }
        C0IZP.LIZJ(this.LLJJIJIIJIL, "comment");
        if (this.LLJJJJLIIL) {
            this.dataChannel.EQ2(this, CommentWidgetStyleChangeEvent.class, new AObjectS350S0100000_7(this, 74));
        }
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null && (!this.LLJJJJLIIL || !Boolean.TRUE.equals(dataChannel5.gg0(IsFromLandscapeData.class)))) {
            if (!this.LLJJJJLIIL && Boolean.TRUE.equals(this.dataChannel.gg0(IsFromPortraitData.class))) {
                View view = getView();
                if (view != null) {
                    C786410Ut5.LJLLLLLL(8, view);
                    C20441214yg.LJIIIZ("Portrait2LandscapeAnimationInit", "set CommentWidget invisible");
                }
            } else {
                show();
            }
        }
        if (!this.LLLLJ) {
            e2(0.5f);
            this.LLILLL.setOnLongClickListener(null);
            this.LL.setOnLongClickListener(null);
        } else {
            e2(1.0f);
            this.LLILLL.setOnLongClickListener(this.LLLLLIL);
            this.LL.setOnLongClickListener(this.LLLLLILLIL);
        }
        this.LLIZLLLIL.setTextDirection(1);
        DataChannel dataChannel6 = this.dataChannel;
        if (dataChannel6 != null) {
            dataChannel6.BQ2(this, CommentGuideEvent.class, new AObjectS360S0100000_17(this, 98));
        }
    }

    @Override // X.InterfaceC1114800f7G
    public final void y(List list, ISendCommentEvent.Sender sender) {
        C1114360f6Y c1114360f6Y = this.LLJJLIIIJLLLLLLLZ;
        if (c1114360f6Y == null) {
            return;
        }
        C1114460f6i c1114460f6i = new C1114460f6i(list, sender, Collections.emptyMap());
        if (c1114360f6Y.LLILLL != null) {
            ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Jf0(c1114360f6Y.LLILLJJLI.getId(), C181500mr.LIZIZ(c1114360f6Y.LLILLJJLI.getId(), list, -System.currentTimeMillis(), UserService.getInstance().user().getCurrentUser(), null), true, new C1114400f6c(c1114360f6Y, c1114460f6i));
        }
        G1();
    }

    public static void y1(C474500IjA c474500IjA, Long l, String str) {
        c474500IjA.LJJII(l, "msg_id");
        c474500IjA.LJJII(str, "trigger");
        c474500IjA.LJJII(Integer.valueOf(LivePublicScreenChatRethinkSetting.getRethinkVersion()), "version");
    }

    public final Pair<Long, String> b2(String str, Long l, C501470JlZ c501470JlZ) {
        boolean z;
        Pair<Long, String> pair;
        Long l2;
        int errorCode;
        int i = 0;
        if (c501470JlZ != null && (c501470JlZ.getErrorCode() == 4010020 || this.LLLI != null)) {
            z = true;
        } else {
            z = false;
        }
        String str2 = null;
        if (z && !C2093608Ic.LJ(c501470JlZ.getExtra())) {
            try {
                JSONObject jSONObject = new JSONObject(c501470JlZ.getExtra());
                pair = new Pair<>(Long.valueOf(JSONObjectProtectorUtils.getLong(jSONObject, "msg_id")), JSONObjectProtectorUtils.getString(jSONObject, "punish_trigger"));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                pair = null;
            }
        } else {
            pair = null;
        }
        if (this.LLLI != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_comment_rethink_send_after_edit_ck");
            c474500IjALIZ.LJIJJLI(this.dataChannel);
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
            c474500IjALIZ.LJJII(this.LLLI.LJIIJ, "comment_hit_model");
            c474500IjALIZ.LJJII(str, "comment_resend");
            Object obj = l;
            if (pair != null) {
                obj = pair.first;
            }
            c474500IjALIZ.LJJII(obj, "resend_msg_id");
            if (c501470JlZ == null) {
                errorCode = 0;
            } else {
                errorCode = c501470JlZ.getErrorCode();
            }
            c474500IjALIZ.LJJII(Integer.valueOf(errorCode), "resend_error_code");
            int i2 = this.LLLII + 1;
            this.LLLII = i2;
            c474500IjALIZ.LJJII(Integer.valueOf(i2), "post_attempts");
            c474500IjALIZ.LJJII(Long.valueOf(this.LLLIIL - this.LLLIIIL), "edit_duration");
            y1(c474500IjALIZ, this.LLLIIII, this.LLLIIIIL);
            c474500IjALIZ.LIZ();
            this.LLLI = null;
            if (c501470JlZ != null) {
                i = this.LLLII;
            }
            this.LLLII = i;
        }
        if (pair == null) {
            l2 = null;
        } else {
            l2 = (Long) pair.first;
        }
        this.LLLIIII = l2;
        if (pair != null) {
            str2 = (String) pair.second;
        }
        this.LLLIIIIL = str2;
        return pair;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0364 A[Catch: NullPointerException -> 0x03d1, IllegalStateException -> 0x03ef, TRY_ENTER, TryCatch #3 {IllegalStateException -> 0x03ef, NullPointerException -> 0x03d1, blocks: (B:164:0x0364, B:168:0x0379, B:170:0x0388, B:172:0x038e, B:173:0x0396, B:175:0x03ad, B:177:0x03b7, B:179:0x03bb, B:181:0x03bf, B:182:0x03c2, B:165:0x036e, B:167:0x0372), top: B:219:0x036e }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0388 A[Catch: NullPointerException -> 0x03d1, IllegalStateException -> 0x03ef, TryCatch #3 {IllegalStateException -> 0x03ef, NullPointerException -> 0x03d1, blocks: (B:164:0x0364, B:168:0x0379, B:170:0x0388, B:172:0x038e, B:173:0x0396, B:175:0x03ad, B:177:0x03b7, B:179:0x03bb, B:181:0x03bf, B:182:0x03c2, B:165:0x036e, B:167:0x0372), top: B:219:0x036e }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x036e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j2(X.C1110530f0N r12, X.EnumC1114820f7I r13, boolean r14) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget.j2(X.0f0N, X.0f7I, boolean):void");
    }

    @Override // X.InterfaceC1114800f7G
    public final void LJJLIIIJILLIZJL(String str, String str2, int i, ISendCommentEvent.Sender sender) {
        S1(str, str2, false, false, i, sender, null, null, 0L, null);
        G1();
    }

    @Override // X.InterfaceC1114450f6h
    public final void HE1(ChatMessage chatMessage, C1114480f6k c1114480f6k, int i, long j, long j2) throws JSONException {
        int size;
        Room room;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.SX0(C753900Thk.class, chatMessage.content);
        }
        List<EmoteWithIndex> list = chatMessage.f314emotes;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        long j3 = chatMessage.chatId;
        String str = chatMessage.content;
        Q1(j3, str, c1114480f6k, C1110360f06.LIZ(size, str), chatMessage.userInfo, chatMessage.userIdentity, i, j, size, chatMessage.f314emotes, j2);
        if (TextUtils.isEmpty(this.LLJZIJLIL) || TextUtils.isEmpty(chatMessage.content) || !chatMessage.content.contains(this.LLJZIJLIL)) {
            C1();
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && C0IXW.LJFF(dataChannel2) && (room = this.LLJJIJIIJIL) != null && room.author() != null) {
            HashMap map = new HashMap();
            map.put("anchor_id", String.valueOf(this.LLJJIJIIJIL.author().getId()));
            map.put("room_id", String.valueOf(this.LLJJIJIIJIL.getId()));
            C0IXW c0ixw = C0IXW.LIZ;
            C0IXW.LIZ("live_ad", "live_comment", null, map);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0828  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0838  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x083b  */
    @Override // X.InterfaceC1114450f6h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C474500IjA xy1(java.lang.String r29, X.C1114480f6k r30, int r31, com.bytedance.android.live.base.model.user.User r32, long r33, java.util.List<com.bytedance.android.live.base.model.emoji.EmoteWithIndex> r35, long r36) {
        /*
            Method dump skipped, instruction units count: 2163
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget.xy1(java.lang.String, X.0f6k, int, com.bytedance.android.live.base.model.user.User, long, java.util.List, long):X.0IjA");
    }

    public final void T1(String str, String str2, boolean z, boolean z2, int i, C520890Kbn c520890Kbn, C1114670f73 c1114670f73, long j, InterfaceC1114610f6x interfaceC1114610f6x) {
        ISendCommentEvent.Sender sender;
        ISendCommentEvent.Sender sender2 = ISendCommentEvent.Sender.COMMENTWIDGET;
        InputAttrs inputAttrs = this.LLLLIIL;
        if (inputAttrs == null || (sender = inputAttrs.sender) == null) {
            sender = sender2;
        }
        S1(str, str2, z, z2, i, sender, c520890Kbn, c1114670f73, j, interfaceC1114610f6x);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x029f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S1(java.lang.String r35, java.lang.String r36, boolean r37, boolean r38, int r39, com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent.Sender r40, X.C520890Kbn r41, X.C1114670f73 r42, long r43, X.InterfaceC1114610f6x r45) {
        /*
            Method dump skipped, instruction units count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget.S1(java.lang.String, java.lang.String, boolean, boolean, int, com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent$Sender, X.0Kbn, X.0f73, long, X.0f6x):void");
    }

    public final void Q1(long j, String str, C1114480f6k c1114480f6k, int i, User user, UserIdentity userIdentity, int i2, long j2, long j3, List<EmoteWithIndex> list, long j4) throws JSONException {
        b2(str, Long.valueOf(j), null);
        if (this.LLJJIJI) {
            DataChannel dataChannel = this.dataChannel;
            InputAttrs inputAttrs = this.LLLLIIL;
            C1114370f6Z.LIZJ(dataChannel, inputAttrs.replyInfo, this.LLJLLL, this.LLJLLIL, c1114480f6k, inputAttrs, i2, j2, false, str);
            return;
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.FQ2(CommentSendSuccessEvent.class);
        }
        if (!LiveWidgetExitRoomOptSetting.INSTANCE.enableComment()) {
            C1114370f6Z.LIZLLL(j, userIdentity, i2, j2, xy1(str, c1114480f6k, i, user, j3, list, j4), str, j3);
        }
        this.LLJLL = false;
        C1();
    }
}
