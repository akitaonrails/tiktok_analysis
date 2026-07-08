package com.bytedance.android.livesdk.broadcast.interaction.function;

import X.C001A;
import X.C0IJT;
import X.C0J1R;
import X.C0KTH;
import X.C0UFI;
import X.C0UO0;
import X.C1133830fbx;
import X.C1161920gLG;
import X.C1548820qPI;
import X.C162100jj;
import X.C19GO;
import X.C20441214yg;
import X.C2188811AlT;
import X.C389001fE;
import X.C474500IjA;
import X.C480460Ism;
import X.C497280Jeo;
import X.C504210Jpz;
import X.C749350TaP;
import X.C766270U4b;
import X.C780870Uk9;
import X.C781270Ukn;
import X.C781890Uln;
import X.C782020Um0;
import X.C782080Um6;
import X.C786410Ut5;
import X.EnumC1102750enp;
import X.EnumC517850KSp;
import X.InterfaceC207238167o;
import Y.AfS4S0100100_12;
import Y.AfS4S0100200_12;
import android.text.Spannable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.api.IMatchViolationEventHelper;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.qa.IQAService;
import com.bytedance.android.livesdk.api.LiveCaptchaCheckApi;
import com.bytedance.android.livesdk.dataChannel.DonationInfoUpdateEvent;
import com.bytedance.android.livesdk.dataChannel.GameLiveGamepadRevokeTips;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.PerceptionMessageChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.event.GamePartnershipEntranceHide;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoal;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoalServerMessage;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterViolationNumFinallyOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveGameCaptchaEnabledSetting;
import com.bytedance.android.livesdk.livesetting.performance.GoLiveMemoryLeakOptSetting;
import com.bytedance.android.livesdk.model.InteractionQuestionInfo;
import com.bytedance.android.livesdk.model.WarningTag;
import com.bytedance.android.livesdk.model.message.AccessControlCaptcha;
import com.bytedance.android.livesdk.model.message.AccessControlMessage;
import com.bytedance.android.livesdk.model.message.DonationInfoMessage;
import com.bytedance.android.livesdk.model.message.PartnershipGameOfflineMessage;
import com.bytedance.android.livesdk.model.message.PartnershipPunishMessage;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.QuestionMessage;
import com.bytedance.android.livesdk.model.message.RemindMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.tunnel.BroadcastTunnelVM;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.LinkedList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class BroadcastMessagePresenter implements OnMessageListener {
    public final BaseFragment LL;
    public C780870Uk9 LLILLJJLI;
    public C782020Um0 LLILLL;
    public final Room LLILZ;
    public final DataChannel LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public Long LLJI = 0L;
    public long LLJIJIL = 0;

    public final C782020Um0 LIZ() {
        if (this.LLILLL == null) {
            this.LLILLL = new C782020Um0(this.LL.getContext(), this.LL, this.LLILZIL);
        }
        return this.LLILLL;
    }

    public final void LIZIZ() {
        if (C497280Jeo.LIZ) {
            BroadcastTunnelVM broadcastTunnelVM = (BroadcastTunnelVM) C0KTH.LIZIZ(BroadcastTunnelVM.class, this.LL);
            if (broadcastTunnelVM != null) {
                broadcastTunnelVM.LL.setValue(EnumC517850KSp.STREAM_ON);
                return;
            }
            return;
        }
        BroadcastTunnelVM broadcastTunnelVM2 = (BroadcastTunnelVM) C0KTH.LIZ(this.LL.getActivity(), BroadcastTunnelVM.class);
        if (broadcastTunnelVM2 != null) {
            broadcastTunnelVM2.LL.setValue(EnumC517850KSp.STREAM_ON);
        } else {
            C20441214yg.LJIIL("BroadcastMessagePresenter", "keepStreamOn: broadcastTunnelVM is null from activity");
        }
    }

    public final void onDestroy() {
        IMessageManager iMessageManager;
        if (this.LLILZ != null && (iMessageManager = C781270Ukn.LJIILLIIL().get(this.LLILZ.getId())) != null) {
            iMessageManager.removeMessageListener(this);
        }
        BaseFragment baseFragment = C504210Jpz.LIZ ? this.LL : null;
        ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).popCaptchaV2(this.LL.getActivity(), "", new InterfaceC207238167o() { // from class: X.0Ulq
            @Override // X.InterfaceC207238167o
            public final void LIZ() {
            }

            @Override // X.InterfaceC207238167o
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC207238167o
            public final void LIZJ() {
            }

            @Override // X.InterfaceC207238167o
            public final void onSuccess() {
            }
        }, baseFragment);
        if (GoLiveMemoryLeakOptSetting.INSTANCE.enable()) {
            ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).popCaptchaV2(this.LL.getActivity(), "", null, baseFragment);
        }
        C782020Um0 c782020Um0LIZ = LIZ();
        c782020Um0LIZ.getClass();
        C1548820qPI.LJIIIIZZ("live_anchor_center_mask_will_appear", c782020Um0LIZ);
        C1548820qPI.LJIIIIZZ("live_anchor_center_mask_will_disappear", c782020Um0LIZ);
        ((LinkedList) c782020Um0LIZ.LLILZ).clear();
    }

    public final void LIZLLL(final Runnable runnable) {
        final Lifecycle lifecycle = this.LL.getLifecycle();
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            runnable.run();
        } else {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.bytedance.android.livesdk.broadcast.interaction.function.BroadcastMessagePresenter.1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_RESUME) {
                        lifecycle.removeObserver(this);
                        runnable.run();
                    } else {
                        if (event != Lifecycle.Event.ON_DESTROY) {
                            return;
                        }
                        lifecycle.removeObserver(this);
                    }
                }
            });
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        Object objValueOf;
        PunishEventInfo punishEventInfo;
        Integer num;
        PerceptionDialogInfo perceptionDialogInfo;
        DataChannel dataChannel;
        Room roomLIZ;
        InteractionQuestionInfo interactionQuestionInfo;
        Room roomLIZ2;
        InteractionQuestionInfo interactionQuestionInfo2;
        Integer num2;
        if (iMessage instanceof RemindMessage) {
            RemindMessage remindMessage = (RemindMessage) iMessage;
            if (remindMessage.getMessageType() == C001A.REMIND && 5 == remindMessage.noticeType) {
                if (this.LLILLJJLI == null) {
                    this.LLILLJJLI = new C780870Uk9(this.LL, this.LLILZ);
                }
                C780870Uk9 c780870Uk9 = this.LLILLJJLI;
                if (c780870Uk9.LJ < 1) {
                    Text text = remindMessage.title;
                    Spannable spannableLJIILIIL = C1133830fbx.LJIILIIL(text, text.defaultPattern);
                    Text text2 = remindMessage.illegalText;
                    Spannable spannableLJIILIIL2 = C1133830fbx.LJIILIIL(text2, text2.defaultPattern);
                    C19GO c19go = new C19GO(c780870Uk9.LIZJ);
                    c19go.LIZLLL = spannableLJIILIIL;
                    c19go.LJIIIIZZ = spannableLJIILIIL2;
                    c19go.LJFF(c780870Uk9.LJI, c780870Uk9.LIZJ.getString(2131851584), false);
                    c19go.LIZLLL(c780870Uk9.LJII, c780870Uk9.LIZJ.getString(2131853433), false);
                    c19go.LJJIIJ = false;
                    C786410Ut5.M4(c19go.LIZ());
                    c780870Uk9.LJ++;
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_change_cover_window_show");
                    c474500IjALIZ.LJJIIZI(c780870Uk9.LIZIZ());
                    c474500IjALIZ.LIZ();
                    return;
                }
                if (!C20441214yg.LIZJ()) {
                    return;
                }
                C20441214yg.LJ("LiveDefaultCoverController", "Reach the upper limit , do not show dialog");
                return;
            }
            return;
        }
        if (iMessage instanceof QuestionMessage) {
            DataChannel dataChannel2 = this.LLILZIL;
            Boolean bool = Boolean.TRUE;
            dataChannel2.SX0(C749350TaP.class, bool);
            QuestionMessage questionMessage = (QuestionMessage) iMessage;
            if (this.LLILZIL.gg0(UserIsAnchorChannel.class) != bool) {
                return;
            }
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_anchor_qa_message");
            c474500IjALIZ2.LJIL();
            c474500IjALIZ2.LJJII(Long.valueOf(questionMessage.question.questionId), "question_id");
            c474500IjALIZ2.LIZ();
            DataChannel dataChannel3 = this.LLILZIL;
            if (C162100jj.LIZJ(dataChannel3) && (roomLIZ = C162100jj.LIZ(dataChannel3)) != null && (interactionQuestionInfo = roomLIZ.interactionQuestion) != null && interactionQuestionInfo.qaEntryType != null) {
                DataChannel dataChannel4 = this.LLILZIL;
                if (!C162100jj.LIZJ(dataChannel4) || (roomLIZ2 = C162100jj.LIZ(dataChannel4)) == null || (interactionQuestionInfo2 = roomLIZ2.interactionQuestion) == null || (num2 = interactionQuestionInfo2.qaEntryType) == null || num2.intValue() != 0) {
                    return;
                }
            }
            ((IQAService) C1161920gLG.LIZJ(IQAService.class)).mj0(this.LLILZIL);
            EnumC1102750enp.INTERACTION_FEATURES.showRedDot(this.LLILZIL);
            return;
        }
        if (iMessage instanceof PerceptionMessage) {
            PerceptionMessage perceptionMessage = (PerceptionMessage) iMessage;
            if (perceptionMessage.getMessageType() != C001A.PERCEPTION_MESSAGE) {
                return;
            }
            PerceptionDialogInfo perceptionDialogInfo2 = perceptionMessage.dialog;
            if (perceptionDialogInfo2 != null && perceptionDialogInfo2.scene == 6) {
                Room room = this.LLILZ;
                if (room != null && perceptionMessage.publicEventInfo != null) {
                    ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).aD2(room.getId(), perceptionMessage.publicEventInfo.punishId);
                }
            } else {
                LIZ().LIZLLL(perceptionMessage);
            }
            LIZ().getClass();
            if (C782020Um0.LIZJ(perceptionMessage)) {
                C782020Um0 c782020Um0LIZ = LIZ();
                c782020Um0LIZ.getClass();
                if (LiveCenterViolationNumFinallyOptSetting.INSTANCE.isEnable() && ((((perceptionDialogInfo = perceptionMessage.dialog) != null && 21 == perceptionDialogInfo.scene) || Intrinsics.LJFF(perceptionMessage.showViolation, Boolean.TRUE)) && (dataChannel = c782020Um0LIZ.LLILLJJLI) != null)) {
                    C782080Um6 c782080Um6 = new C782080Um6(0);
                    c782080Um6.LIZ = Boolean.FALSE;
                    PunishEventInfo punishEventInfo2 = new PunishEventInfo();
                    punishEventInfo2.punishId = CardStruct.IStatusCode.DEFAULT;
                    c782080Um6.LIZJ = punishEventInfo2;
                    dataChannel.zW(PerceptionMessageChannel.class, c782080Um6);
                }
            }
            PunishEventInfo punishEventInfo3 = perceptionMessage.publicEventInfo;
            if (punishEventInfo3 == null) {
                return;
            }
            if (!"match_interrupt".equals(punishEventInfo3.punishType) && !"match_ban".equals(perceptionMessage.publicEventInfo.punishType)) {
                return;
            }
            ((IMatchViolationEventHelper) C1161920gLG.LIZJ(IMatchViolationEventHelper.class)).setMatchOnViolation();
            return;
        }
        if (iMessage instanceof PartnershipPunishMessage) {
            PartnershipPunishMessage partnershipPunishMessage = (PartnershipPunishMessage) iMessage;
            C782020Um0 c782020Um0LIZ2 = LIZ();
            c782020Um0LIZ2.getClass();
            if (partnershipPunishMessage == null || (punishEventInfo = partnershipPunishMessage.punishInfo) == null || (num = punishEventInfo.punishTypeId) == null) {
                return;
            }
            int iIntValue = num.intValue();
            if (iIntValue != 25 && iIntValue != 26) {
                return;
            }
            EnumC1102750enp.ANCHOR_PARTNERSHIP.hide(c782020Um0LIZ2.LLILLJJLI);
            DataChannel dataChannel5 = c782020Um0LIZ2.LLILLJJLI;
            if (dataChannel5 == null) {
                return;
            }
            dataChannel5.zW(GamePartnershipEntranceHide.class, Boolean.TRUE);
            return;
        }
        if (iMessage instanceof PartnershipGameOfflineMessage) {
            C782020Um0 c782020Um0LIZ3 = LIZ();
            c782020Um0LIZ3.getClass();
            List<PartnershipGameOfflineMessage.OfflineGameInfo> list = ((PartnershipGameOfflineMessage) iMessage).offlineGameList;
            if (list == null || list.isEmpty()) {
                return;
            }
            if (((PartnershipGameOfflineMessage.OfflineGameInfo) ListProtector.get(list, 0)).taskListLen <= 0) {
                EnumC1102750enp.ANCHOR_PARTNERSHIP.hide(c782020Um0LIZ3.LLILLJJLI);
            }
            String str = ((PartnershipGameOfflineMessage.OfflineGameInfo) ListProtector.get(list, 0)).toastText;
            C766270U4b.LJIIJJI(str);
            DataChannel dataChannel6 = c782020Um0LIZ3.LLILLJJLI;
            if (dataChannel6 == null) {
                return;
            }
            dataChannel6.zW(GameLiveGamepadRevokeTips.class, new Pair(str, null));
            C389001fE.LIZ("gamePartnershipPunished", null, System.currentTimeMillis(), false);
            return;
        }
        if (iMessage instanceof AccessControlMessage) {
            AccessControlMessage accessControlMessage = (AccessControlMessage) iMessage;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AccessControlMessage received, messageId=");
            sbLIZ.append(iMessage.getMessageId());
            sbLIZ.append(", roomId=");
            Room room2 = this.LLILZ;
            if (room2 != null) {
                objValueOf = Long.valueOf(room2.getId());
            } else {
                objValueOf = "null";
            }
            sbLIZ.append(objValueOf);
            C20441214yg.LIZIZ("BroadcastMessagePresenter", C2188811AlT.LIZIZ(sbLIZ));
            if (accessControlMessage.captcha == null) {
                return;
            }
            Object objGg0 = this.LLILZIL.gg0(LiveModeChannel.class);
            LiveMode liveMode = LiveMode.SCREEN_RECORD;
            if (objGg0 == liveMode && !LiveGameCaptchaEnabledSetting.INSTANCE.isEnabled()) {
                return;
            }
            AccessControlCaptcha accessControlCaptcha = accessControlMessage.captcha;
            long j = accessControlCaptcha.captchaRecordId;
            long j2 = accessControlCaptcha.verifyDurationInSec;
            if (this.LLILZIL.gg0(LiveModeChannel.class) == liveMode) {
                C480460Ism.LIZ().getClass();
                ((LiveCaptchaCheckApi) C480460Ism.LIZLLL(LiveCaptchaCheckApi.class)).getCaptchaCheckResponse(j, this.LLILZ.getId(), false).LJIILIIL(new C0UO0()).LJIILIIL(C0J1R.LIZIZ(this.LL)).LJJLL(new AfS4S0100200_12(this, j, j2, 1), new AfS4S0100100_12(j, this, 2));
                return;
            } else {
                C480460Ism.LIZ().getClass();
                ((LiveCaptchaCheckApi) C480460Ism.LIZLLL(LiveCaptchaCheckApi.class)).getCaptchaCheckResponse(j, this.LLILZ.getId(), false).LJIILIIL(new C0UO0()).LJIILIIL(C0J1R.LIZIZ(this.LL)).LJJLL(new AfS4S0100200_12(this, j, j2, 0), new AfS4S0100100_12(j, this, 1));
                return;
            }
        }
        if (iMessage instanceof LiveStreamGoalServerMessage) {
            LiveStreamGoal liveStreamGoal = ((LiveStreamGoalServerMessage) iMessage).goal;
            if (liveStreamGoal == null) {
                return;
            }
            ((C0UFI) ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectHelper()).LJJ(liveStreamGoal, true);
            return;
        }
        if (iMessage instanceof DonationInfoMessage) {
            this.LLILZIL.LC0(DonationInfoUpdateEvent.class, iMessage);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onMessage received unhandled message type: ");
        sbLIZ2.append(iMessage.getClass().getSimpleName());
        sbLIZ2.append(", messageId=");
        sbLIZ2.append(iMessage.getMessageId());
        C20441214yg.LJIIL("BroadcastMessagePresenter", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public BroadcastMessagePresenter(BaseFragment baseFragment, DataChannel dataChannel) {
        int i;
        this.LL = baseFragment;
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        this.LLILZ = room;
        this.LLILZIL = dataChannel;
        if (room != null) {
            IMessageManager iMessageManager = C781270Ukn.LJIILLIIL().get(room.getId());
            if (iMessageManager != null) {
                iMessageManager.addMessageListener(C001A.REMIND.getIntType(), this);
                iMessageManager.addMessageListener(C001A.QUESTION.getIntType(), this);
                iMessageManager.addMessageListener(C001A.PERCEPTION_MESSAGE.getIntType(), this);
                iMessageManager.addMessageListener(C001A.PARTNERSHIP_PUNISH_MESSAGE.getIntType(), this);
                iMessageManager.addMessageListener(C001A.PARTNERSHIP_GAME_OFFLINE_MESSAGE.getIntType(), this);
                iMessageManager.addMessageListener(C001A.ACCESS_CONTROL_MESSAGE.getIntType(), this);
                iMessageManager.addMessageListener(C001A.STREAM_GOAL_SERVER_MESSAGE.getIntType(), this);
                iMessageManager.addMessageListener(C001A.DONATION_INFO.getIntType(), this);
            }
            WarningTag warningTag = room.warningTag;
            if (warningTag != null && warningTag.text != null) {
                if (warningTag.tagSource == 1) {
                    i = 4;
                } else {
                    i = 3;
                }
                ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).T60(room.getId(), warningTag.text, warningTag.duration, warningTag.punishInfo, warningTag.punishInfo != null ? 6 : i, warningTag.style, warningTag.detailUrl, Integer.valueOf(warningTag.iconType));
            }
        }
    }

    public final void LIZJ(long j, long j2, String str) {
        BaseFragment baseFragment;
        if (C504210Jpz.LIZ) {
            baseFragment = this.LL;
        } else {
            baseFragment = null;
        }
        ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).popCaptchaV2(this.LL.getActivity(), str, new C781890Uln(this, j, str, j2), baseFragment);
    }
}
