package com.bytedance.android.livesdk.chatroom.widget.followguide;

import X.AbstractC519380KYm;
import X.C08D5;
import X.C0II9;
import X.C0K9J;
import X.C0KAJ;
import X.C1088240eQQ;
import X.C1102070emj;
import X.C1102130emp;
import X.C1102420enI;
import X.C1107810evz;
import X.C1121670fIL;
import X.C1149000g0Q;
import X.C1161920gLG;
import X.C1324720kZq;
import X.C13LP;
import X.C1697810uHb;
import X.C16F5;
import X.C176600m4;
import X.C19748612Om;
import X.C20441214yg;
import X.C20736316Cj;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C473050Igp;
import X.C494680Jac;
import X.C512940K9s;
import X.C519290KYd;
import X.C519310KYf;
import X.C519360KYk;
import X.C519370KYl;
import X.C786410Ut5;
import X.C916790Zxt;
import X.EnumC512800K9e;
import X.InterfaceC1096630edx;
import X.InterfaceC1097760efm;
import X.InterfaceC1102120emo;
import X.InterfaceC1102160ems;
import X.InterfaceC21462418z0;
import X.InterfaceC519340KYi;
import X.InterfaceC519350KYj;
import Y.ACListenerS142S0100000_7;
import Y.ARunnableS107S0100000_7;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.PollVisibleChannel;
import com.bytedance.android.live.ToolBarShareVisibleChannel;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.gift.FastGiftVisibleChannel;
import com.bytedance.android.live.gift.GiftDialogVisibilityChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestVisibleChannel;
import com.bytedance.android.live.notify.IBusinessAvoidConflictNotifyService;
import com.bytedance.android.live.pincard.event.LivePinCardVisibilityChannel;
import com.bytedance.android.live.publicscreen.api.WarningInfoVisibilityEvent;
import com.bytedance.android.live.uikit.setting.LiveConflictAvoidFollowCapsulePositionOpt;
import com.bytedance.android.live.uikit.setting.LiveConflictAvoidInputAnimOpt;
import com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideBottomCardWidget;
import com.bytedance.android.livesdk.dataChannel.CustomPollCardVisibility;
import com.bytedance.android.livesdk.dataChannel.CustomizedPerksCardVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.HighPrioritySlotVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.HighPriorityTooltipVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LockScreenChannel;
import com.bytedance.android.livesdk.dataChannel.PublicScreenGiftPollStateVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.PublicScreenNewMessageVisible;
import com.bytedance.android.livesdk.dataChannel.PublicScreenNormalPollStateVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.ScreenClearEvent;
import com.bytedance.android.livesdk.dataChannel.SparkOpenChannel;
import com.bytedance.android.livesdk.dataChannel.SubGoalCardVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.event.PartnershipPromoteGameCardShowBooleanChannel;
import com.bytedance.android.livesdk.frequency.setting.LiveNotifyMessageFrequencySetting;
import com.bytedance.android.livesdk.model.message.GuideMessage;
import com.bytedance.android.livesdk.slot.FrameL2SlotVisibilityChannel;
import com.bytedance.android.livesdk.slot.FrameL3SlotVisibilityChannel;
import com.bytedance.android.livesdkapi.avoidance.IBusinessAvoidanceService;
import com.bytedance.android.livesdkapi.depend.event.FollowGuideBottomCardShow;
import com.bytedance.android.livesdkapi.depend.event.FollowGuideBottomCardVisibilityAnimInfo;
import com.bytedance.android.livesdkapi.depend.event.LiveExploreDrawerShowChannel;
import com.bytedance.android.livesdkapi.depend.event.LiveGoalPinCardVisibilityChannel;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyQuota;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.Channel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.IHiddenChangeAwareWidget;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class FollowGuideBottomCardWidget extends FollowGuideAbsWidget implements InterfaceC519350KYj, InterfaceC1102160ems {
    public C1324720kZq LLJILLL;
    public C16F5 LLJJ;
    public LiveIconView LLJJI;
    public long LLJJIII;
    public long LLJJIJI;
    public long LLJJIJIIJIL;
    public long LLJJIJIL;
    public final Set<Long> LLJJJ = new LinkedHashSet();
    public final List<Class<? extends Channel<Boolean>>> LLJJJIL = C1697810uHb.LJIIJJI(KeyboardStatusChannel.class, FastGiftVisibleChannel.class, MultiGuestVisibleChannel.class, PollVisibleChannel.class, LiveExploreDrawerShowChannel.class, FrameL2SlotVisibilityChannel.class, FrameL3SlotVisibilityChannel.class, SubGoalCardVisibilityChannel.class, CustomPollCardVisibility.class, PublicScreenNormalPollStateVisibilityChannel.class, PublicScreenGiftPollStateVisibilityChannel.class, PublicScreenNewMessageVisible.class, WarningInfoVisibilityEvent.class, PartnershipPromoteGameCardShowBooleanChannel.class, LiveGoalPinCardVisibilityChannel.class, CustomizedPerksCardVisibilityChannel.class);
    public final List<Class<? extends Channel<Boolean>>> LLJJJJ = C1697810uHb.LJIIJJI(GiftDialogVisibilityChannel.class, ToolBarShareVisibleChannel.class);
    public final List<Class<? extends Channel<Boolean>>> LLJJJJJIL = C1697810uHb.LJIIJJI(HighPriorityTooltipVisibilityChannel.class, HighPrioritySlotVisibilityChannel.class);
    public final List<String> LLJJJJLIIL;
    public final List<String> LLJJL;
    public final List<String> LLJJLIIIJLLLLLLLZ;
    public final List<String> LLJL;
    public final List<String> LLJLIL;
    public final C519310KYf LLJLILLLLZIIL;

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget
    public final long F1() {
        return 3L;
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget
    public final void H1() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(LockScreenChannel.class), Boolean.TRUE)) {
            L1("LockScreenChannel", false);
            LLIILII(true, false, true, this.LLJLILLLLZIIL, null);
            this.LLILZIL = null;
            M1("others", null);
            return;
        }
        if (C916790Zxt.LIZ(6)) {
            return;
        }
        C519360KYk c519360KYkQD0 = ((IBusinessAvoidanceService) C1161920gLG.LIZJ(IBusinessAvoidanceService.class)).qD0(this.LLJLILLLLZIIL, this.dataChannel);
        if (c519360KYkQD0.LIZ) {
            if (isShowing()) {
                U1();
                return;
            }
            if (C13LP.LJJJJ(c519360KYkQD0.LIZIZ, this.LLJJLIIIJLLLLLLLZ)) {
                this.LLILLL.removeCallbacksAndMessages(this.LLJJLIIIJLLLLLLLZ);
                C08D5.LIZIZ(this.LLILLL, new ARunnableS107S0100000_7(this, 74), this.LLJJLIIIJLLLLLLLZ, 30000L);
                return;
            } else {
                if (this.LLILLL.hasMessages(0, this.LLJJLIIIJLLLLLLLZ)) {
                    return;
                }
                T1(false);
                return;
            }
        }
        String str = c519360KYkQD0.LIZIZ;
        if (str == null) {
            str = "";
        }
        this.LLILZLL = new C519290KYd(str, false, false, 12);
        if (!isShowing()) {
            LLIILII(false, false, false, this.LLJLILLLLZIIL, null);
            L1(c519360KYkQD0.LIZIZ, true);
            return;
        }
        L1(c519360KYkQD0.LIZIZ, false);
        if (!((InterfaceC1097760efm) C1161920gLG.LIZJ(IBusinessAvoidConflictNotifyService.class)).LIZIZ(this.dataChannel, this.LLJJL).LIZ) {
            LLIILII(true, false, false, this.LLJLILLLLZIIL, null);
            this.LLILLL.removeCallbacksAndMessages(this.LLJJLIIIJLLLLLLLZ);
        } else {
            if (!((InterfaceC1097760efm) C1161920gLG.LIZJ(IBusinessAvoidConflictNotifyService.class)).LIZIZ(this.dataChannel, this.LLJJLIIIJLLLLLLLZ).LIZ) {
                LLIILII(true, false, false, this.LLJLILLLLZIIL, null);
                return;
            }
            if (C13LP.LJJJJ(c519360KYkQD0.LIZIZ, this.LLJJJJLIIL)) {
                LLIILII(false, false, false, this.LLJLILLLLZIIL, null);
                V1();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, X.InterfaceC1102150emr
    public final List<String> Q0() {
        C1107810evz c1107810evz = C1107810evz.LIZIZ;
        C1107810evz c1107810evz2 = C1107810evz.LIZIZ;
        C1107810evz c1107810evz3 = C1107810evz.LIZIZ;
        return C1697810uHb.LJIIJJI(C1107810evz.LJJ.LIZ, C1107810evz.LJJIJIL.LIZ, "NORMAL_POLL_STATE", "GIFT_POLL_STATE", C1107810evz.LJJIJL.LIZ, C1107810evz.LJJIJLIJ.LIZ);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget
    public final void S1() {
    }

    @Override // X.InterfaceC1102150emr
    public final int getComponentType() {
        return 6;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hyi;
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget, com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget
    public final C519290KYd C1() {
        C0II9 c0ii9;
        C1088240eQQ c1088240eQQ;
        Class<? extends Channel<Boolean>> next;
        DataChannel dataChannel;
        Iterator<Class<? extends Channel<Boolean>>> it2 = this.LLJJJIL.iterator();
        do {
            if (!it2.hasNext()) {
                DataChannel dataChannel2 = this.dataChannel;
                if (dataChannel2 != null && (c1088240eQQ = (C1088240eQQ) dataChannel2.gg0(LivePinCardVisibilityChannel.class)) != null && c1088240eQQ.LIZIZ) {
                    return new C519290KYd(c1088240eQQ.LIZ.getIdentify(), true, false, 12);
                }
                DataChannel dataChannel3 = this.dataChannel;
                if (dataChannel3 != null && (c0ii9 = (C0II9) dataChannel3.gg0(SubOnlyLiveAudienceStatusChannel.class)) != null && C494680Jac.LJII(c0ii9)) {
                    return new C519290KYd("SubOnlyLiveAudienceStatusChannel", true, false, 12);
                }
                for (Class<? extends Channel<Boolean>> cls : this.LLJJJJJIL) {
                    DataChannel dataChannel4 = this.dataChannel;
                    if (C176600m4.LIZIZ(dataChannel4 != null ? (Boolean) dataChannel4.gg0(cls) : null)) {
                        return new C519290KYd(cls.getSimpleName(), true, true, 8);
                    }
                }
                for (Class<? extends Channel<Boolean>> cls2 : this.LLJJJJ) {
                    DataChannel dataChannel5 = this.dataChannel;
                    if (C176600m4.LIZIZ(dataChannel5 != null ? (Boolean) dataChannel5.gg0(cls2) : null)) {
                        return new C519290KYd(cls2.getSimpleName(), false, false, 12);
                    }
                }
                if (C473050Igp.LIZIZ().LIZJ()) {
                    return new C519290KYd("dialog", false, false, 12);
                }
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                if (C176600m4.LIZIZ((Boolean) dataChannelGlobal.gg0(SparkOpenChannel.class))) {
                    return new C519290KYd("spark", false, false, 12);
                }
                if (C176600m4.LIZIZ((Boolean) dataChannelGlobal.gg0(ScreenClearEvent.class))) {
                    return new C519290KYd("clear_screen", true, false, 12);
                }
                return null;
            }
            next = it2.next();
            dataChannel = this.dataChannel;
        } while (!C176600m4.LIZIZ(dataChannel != null ? (Boolean) dataChannel.gg0(next) : null));
        return new C519290KYd(next.getSimpleName(), true, false, 12);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget
    public final void Q1() {
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null) {
            c16f5.setText(2131844523);
        }
        LiveIconView liveIconView = this.LLJJI;
        if (liveIconView != null) {
            liveIconView.setIcon(C20736316Cj.LJ(R.attr.ejq, this.context));
        }
        V1();
        C786410Ut5.LJLIIL(2000L, this.LLILLL, new ARunnableS107S0100000_7(this, 75));
    }

    public final void X1() {
        if (this.LLJJIII != 0) {
            this.LLJJIJI += SystemClock.uptimeMillis() - this.LLJJIII;
            this.LLJJIII = 0L;
        }
    }

    public final void Y1() {
        if (this.LLJJIJIIJIL != 0) {
            this.LLJJIJIL += SystemClock.uptimeMillis() - this.LLJJIJIIJIL;
            this.LLJJIJIIJIL = 0L;
        }
    }

    @Override // com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, X.InterfaceC1102150emr
    public final C0K9J getUiInfo() {
        return new C0K9J();
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void onHideAnimationStart() {
        DataChannel dataChannel;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.zW(FollowGuideBottomCardShow.class, Boolean.FALSE);
        }
        if (LiveConflictAvoidFollowCapsulePositionOpt.INSTANCE.enable() || (dataChannel = this.dataChannel) == null) {
            return;
        }
        dataChannel.zW(FollowGuideBottomCardVisibilityAnimInfo.class, new C519370KYl(false, true));
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void onShowAnimationStart() {
        DataChannel dataChannel;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.zW(FollowGuideBottomCardShow.class, Boolean.TRUE);
        }
        if (LiveConflictAvoidFollowCapsulePositionOpt.INSTANCE.enable() || (dataChannel = this.dataChannel) == null) {
            return;
        }
        dataChannel.zW(FollowGuideBottomCardVisibilityAnimInfo.class, new C519370KYl(true, true));
    }

    /* JADX WARN: Type inference failed for: r0v60, types: [X.0KYf] */
    public FollowGuideBottomCardWidget() {
        C1107810evz c1107810evz = C1107810evz.LIZIZ;
        C1107810evz c1107810evz2 = C1107810evz.LIZIZ;
        List<String> listLJIILJJIL = C1697810uHb.LJIILJJIL("LIVE_BOTTOM_SHEET");
        LiveConflictAvoidInputAnimOpt liveConflictAvoidInputAnimOpt = LiveConflictAvoidInputAnimOpt.INSTANCE;
        if (liveConflictAvoidInputAnimOpt.enable()) {
            listLJIILJJIL.add(C1107810evz.LJJIIJZLJL.LIZ);
        }
        this.LLJJJJLIIL = listLJIILJJIL;
        C1107810evz c1107810evz3 = C1107810evz.LIZIZ;
        C1107810evz c1107810evz4 = C1107810evz.LIZIZ;
        C1107810evz c1107810evz5 = C1107810evz.LIZIZ;
        C1107810evz c1107810evz6 = C1107810evz.LIZIZ;
        List<String> listLJIILJJIL2 = C1697810uHb.LJIILJJIL("EXPLORE_DRAWER", "LIVE_DIALOG", C1107810evz.LJIJJLI.LIZ, C1107810evz.LJJIJIL.LIZ, "NORMAL_POLL_STATE", "GIFT_POLL_STATE", C1107810evz.LJJIII.LIZ, C1107810evz.LJJIL.LIZ);
        if (!liveConflictAvoidInputAnimOpt.enable()) {
            ListProtector.add(listLJIILJJIL2, 0, C1107810evz.LJJIIJZLJL.LIZ);
        }
        this.LLJJL = listLJIILJJIL2;
        this.LLJJLIIIJLLLLLLLZ = C1697810uHb.LJIIJJI(C1107810evz.LJJIJL.LIZ, C1107810evz.LJJIJLIJ.LIZ);
        C1107810evz c1107810evz7 = C1107810evz.LIZIZ;
        this.LLJL = C1697810uHb.LJIIJJI("LIVE_NON_INPUT_BOTTOM_SHEET", C1107810evz.LJJJJ.LIZ, C1107810evz.LJJJJJ.LIZ);
        ArrayList arrayList = new ArrayList();
        if (liveConflictAvoidInputAnimOpt.enable()) {
            arrayList.add(C1107810evz.LJJIIJZLJL.LIZ);
        }
        this.LLJLIL = arrayList;
        this.LLJLILLLLZIIL = new InterfaceC1096630edx() { // from class: X.0KYf
            @Override // X.InterfaceC1096630edx
            public final boolean LIZIZ() {
                return true;
            }

            @Override // X.InterfaceC1096630edx
            public final int LIZLLL() {
                return 6;
            }

            @Override // X.InterfaceC1096630edx
            public final void LJI() {
            }

            @Override // X.InterfaceC1096630edx
            public final void LIZ() {
                DataChannel dataChannel;
                DataChannel dataChannel2;
                if (this.LIZ.isShowing()) {
                    this.LIZ.U1();
                    FollowGuideBottomCardWidget followGuideBottomCardWidget = this.LIZ;
                    C519290KYd c519290KYd = followGuideBottomCardWidget.LLILZLL;
                    if (c519290KYd != null) {
                        followGuideBottomCardWidget.O1(c519290KYd.LIZ);
                    }
                    C1102070emj c1102070emj = C1102070emj.LIZ;
                    FollowGuideBottomCardWidget followGuideBottomCardWidget2 = this.LIZ;
                    c1102070emj.LJIIJ(followGuideBottomCardWidget2.dataChannel, followGuideBottomCardWidget2, followGuideBottomCardWidget2.LLJ, null);
                } else {
                    this.LIZ.T1(false);
                }
                if (LiveConflictAvoidInputAnimOpt.INSTANCE.enable() && (dataChannel = this.LIZ.dataChannel) != null && Intrinsics.LJFF(dataChannel.gg0(FollowGuideBottomCardShow.class), Boolean.FALSE)) {
                    DataChannel dataChannel3 = this.LIZ.dataChannel;
                    if (dataChannel3 != null) {
                        dataChannel3.zW(FollowGuideBottomCardShow.class, Boolean.TRUE);
                    }
                    if (LiveConflictAvoidFollowCapsulePositionOpt.INSTANCE.enable() || (dataChannel2 = this.LIZ.dataChannel) == null) {
                        return;
                    }
                    dataChannel2.zW(FollowGuideBottomCardVisibilityAnimInfo.class, new C519370KYl(true, false));
                }
            }

            @Override // X.InterfaceC1096630edx
            public final Map<Integer, List<String>> LIZJ() {
                HashMap map = new HashMap();
                C1107810evz c1107810evz8 = C1107810evz.LIZIZ;
                C1107810evz c1107810evz9 = C1107810evz.LIZIZ;
                C1107810evz c1107810evz10 = C1107810evz.LIZIZ;
                map.put(1, C1697810uHb.LJIIJJI("NORMAL_POLL_STATE", "GIFT_POLL_STATE", C1107810evz.LJJIJL.LIZ, C1107810evz.LJJIJLIJ.LIZ, C1107810evz.LJJIL.LIZ));
                return map;
            }

            @Override // X.InterfaceC1096630edx
            public final boolean LJ(boolean z) {
                if (z) {
                    return this.LIZ.isShowing();
                }
                if (this.LIZ.isShowing() && this.LIZ.LLJI) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC1096630edx
            public final boolean LJFF(String str, Object obj) {
                AbstractC519380KYm abstractC519380KYm;
                DataChannel dataChannel;
                this.LIZ.getClass();
                if (!C916790Zxt.LIZ(6)) {
                    C1102070emj c1102070emj = C1102070emj.LIZ;
                    FollowGuideBottomCardWidget followGuideBottomCardWidget = this.LIZ;
                    C1102070emj.LJIJI(c1102070emj, followGuideBottomCardWidget.dataChannel, followGuideBottomCardWidget, followGuideBottomCardWidget.LLJ, this);
                }
                if (!this.LIZ.isShowing()) {
                    return false;
                }
                C1107810evz c1107810evz8 = C1107810evz.LIZIZ;
                if (!Intrinsics.LJFF(str, "LIVE_BOTTOM_SHEET") || !C473050Igp.LIZIZ().LIZJ) {
                    this.LIZ.L1(str, false);
                }
                InterfaceC1102120emo interfaceC1102120emo = this.LIZ.LLJ;
                if (interfaceC1102120emo instanceof AbstractC519380KYm) {
                    abstractC519380KYm = (AbstractC519380KYm) interfaceC1102120emo;
                } else {
                    abstractC519380KYm = null;
                }
                if (abstractC519380KYm != null && abstractC519380KYm.LJIJI()) {
                    this.LIZ.LLIILII(true, false, true, this, C0KAJ.SHORT_REMAIN_TIME);
                } else if (this.LIZ.LLJJJJLIIL.contains(str)) {
                    FollowGuideBottomCardWidget followGuideBottomCardWidget2 = this.LIZ;
                    followGuideBottomCardWidget2.LLILZLL = new C519290KYd(str, false, false, 12);
                    followGuideBottomCardWidget2.LLIILII(false, false, false, this, null);
                    this.LIZ.V1();
                } else if (this.LIZ.LLJJLIIIJLLLLLLLZ.contains(str)) {
                    FollowGuideBottomCardWidget followGuideBottomCardWidget3 = this.LIZ;
                    followGuideBottomCardWidget3.LLILZLL = new C519290KYd(str, true, true, 8);
                    followGuideBottomCardWidget3.LLIILII(true, false, false, this, null);
                } else {
                    FollowGuideBottomCardWidget followGuideBottomCardWidget4 = this.LIZ;
                    followGuideBottomCardWidget4.LLILZLL = new C519290KYd(str, true, false, 12);
                    followGuideBottomCardWidget4.LLIILII(true, false, false, this, null);
                    FollowGuideBottomCardWidget followGuideBottomCardWidget5 = this.LIZ;
                    followGuideBottomCardWidget5.LLILLL.removeCallbacksAndMessages(followGuideBottomCardWidget5.LLJJLIIIJLLLLLLLZ);
                }
                if (((ArrayList) this.LIZ.LLJLIL).contains(str)) {
                    DataChannel dataChannel2 = this.LIZ.dataChannel;
                    if (dataChannel2 != null) {
                        dataChannel2.zW(FollowGuideBottomCardShow.class, Boolean.FALSE);
                    }
                    if (!LiveConflictAvoidFollowCapsulePositionOpt.INSTANCE.enable() && (dataChannel = this.LIZ.dataChannel) != null) {
                        dataChannel.zW(FollowGuideBottomCardVisibilityAnimInfo.class, new C519370KYl(false, false));
                    }
                }
                return true;
            }
        };
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget
    public final Map<String, String> E1() {
        X1();
        Y1();
        return C2097608Jq.LJIIJ(new Pair("duration_ms", String.valueOf(this.LLJJIJIL)), new Pair("show_duration_ms", String.valueOf(this.LLJJIJI)));
    }

    public final void a2() {
        View view = getView();
        if (!(view instanceof ViewGroup) || view == null) {
            return;
        }
        LiveIconView liveIconView = this.LLJJI;
        if (liveIconView != null) {
            C786410Ut5.LLJJIJIL(liveIconView, 8);
        }
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, 8);
        }
    }

    @Override // com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, com.bytedance.ies.sdk.widgets.IHiddenChangeAwareWidget
    public final void onHide() {
        IHiddenChangeAwareWidget.DefaultImpls.onHide(this);
        a2();
        if (this.LLILZIL == null) {
            this.LLJ = null;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void onShowAnimationEnd() {
        ViewGroup viewGroup;
        View view = getView();
        if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null) {
            return;
        }
        LiveIconView liveIconView = this.LLJJI;
        if (liveIconView != null) {
            C786410Ut5.LLJJIJIL(liveIconView, 0);
        }
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, 0);
        }
        C1149000g0Q c1149000g0Q = new C1149000g0Q();
        c1149000g0Q.LJJIIZ(700L);
        C19748612Om.LIZ(viewGroup, c1149000g0Q);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget, com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        if (this.LLJJIII == 0) {
            this.LLJJIII = SystemClock.uptimeMillis();
        }
        View view = getView();
        if (view != null && view.hasWindowFocus() && this.LLJJIJIIJIL == 0) {
            this.LLJJIJIIJIL = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget
    public final long G1(GuideMessage guideMessage) {
        AbstractC519380KYm abstractC519380KYm;
        InterfaceC1102120emo interfaceC1102120emo = this.LLJ;
        if ((interfaceC1102120emo instanceof AbstractC519380KYm) && (abstractC519380KYm = (AbstractC519380KYm) interfaceC1102120emo) != null) {
            return abstractC519380KYm.LJIIZILJ();
        }
        long j = guideMessage.duration;
        if (j >= Mp4ScreenVideoLoadTimeout.CONTROL) {
            return j;
        }
        return Mp4ScreenVideoLoadTimeout.CONTROL;
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget
    public final boolean J1(String str) {
        for (Class<? extends Channel<Boolean>> cls : this.LLJJJJJIL) {
            if (Intrinsics.LJFF(cls.getSimpleName(), str)) {
                if (cls != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1102160ems
    public final void LLFFF(int i) {
        DataChannel dataChannel;
        DataChannel dataChannel2;
        if (isShowing()) {
            U1();
            C519290KYd c519290KYd = this.LLILZLL;
            if (c519290KYd != null) {
                O1(c519290KYd.LIZ);
            }
            C1102070emj.LIZ.LJIIJ(this.dataChannel, this, this.LLJ, null);
        } else {
            T1(false);
        }
        if (LiveConflictAvoidInputAnimOpt.INSTANCE.enable() && (dataChannel = this.dataChannel) != null && Intrinsics.LJFF(dataChannel.gg0(FollowGuideBottomCardShow.class), Boolean.FALSE)) {
            DataChannel dataChannel3 = this.dataChannel;
            if (dataChannel3 != null) {
                dataChannel3.zW(FollowGuideBottomCardShow.class, Boolean.TRUE);
            }
            if (!LiveConflictAvoidFollowCapsulePositionOpt.INSTANCE.enable() && (dataChannel2 = this.dataChannel) != null) {
                dataChannel2.zW(FollowGuideBottomCardVisibilityAnimInfo.class, new C519370KYl(true, false));
            }
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget
    public final InterfaceC1102120emo P1(final GuideMessage guideMessage) {
        return new AbstractC519380KYm(guideMessage) { // from class: X.0KYg
            public final GuideMessage LIZJ;
            public final long LIZLLL;
            public final long LJ;

            @Override // X.InterfaceC1102120emo
            public final boolean LIZJ() {
                return false;
            }

            @Override // X.AbstractC519380KYm, X.InterfaceC1102120emo
            public final boolean LJFF() {
                return true;
            }

            @Override // X.InterfaceC1102120emo
            public final String getBusinessName() {
                return "follow";
            }

            @Override // X.AbstractC519380KYm
            public final long LIZ() {
                FollowGuideBottomCardWidget followGuideBottomCardWidget = this.LJFF;
                GuideMessage guideMessage2 = this.LIZJ;
                followGuideBottomCardWidget.getClass();
                long j = guideMessage2.duration;
                return j < Mp4ScreenVideoLoadTimeout.CONTROL ? Mp4ScreenVideoLoadTimeout.CONTROL : j;
            }

            @Override // X.AbstractC519380KYm, X.InterfaceC1102120emo
            public final C1099880ejC LJIIIZ() {
                View view = this.LJFF.getView();
                return new C1099880ejC(view != null ? view.hasWindowFocus() : false);
            }

            @Override // X.AbstractC519380KYm, X.InterfaceC1102120emo
            public final View LJIILJJIL() {
                View view = this.LJFF.getView();
                if (view != null) {
                    return view.getRootView();
                }
                return null;
            }

            @Override // X.AbstractC519380KYm
            public final long LJIILLIIL() {
                return this.LJFF.LLJIJIL;
            }

            @Override // X.InterfaceC1102120emo
            public final String LJJJ() {
                return String.valueOf(this.LIZJ.getMessageId());
            }

            @Override // X.InterfaceC1102120emo
            public final String getId() {
                return String.valueOf(this.LIZJ.getMessageId());
            }

            @Override // X.InterfaceC1102120emo
            public final InterfaceC1102150emr LJII() {
                return this.LJFF;
            }

            @Override // X.InterfaceC1102120emo
            public final long LJIIJ() {
                return this.LIZLLL;
            }

            @Override // X.AbstractC519380KYm
            public final long LJIJ() {
                return this.LJ;
            }

            {
                long jLIZIZ;
                this.LIZJ = guideMessage;
                CommonMessageData commonMessageData = guideMessage.baseMessage;
                if (commonMessageData != null) {
                    jLIZIZ = commonMessageData.createTime;
                } else {
                    jLIZIZ = C963140bAe.LIZIZ();
                }
                this.LIZLLL = jLIZIZ;
                this.LJ = guideMessage.duration;
            }
        };
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget
    public final void R1(boolean z) {
        long id;
        if (z && LiveNotifyMessageFrequencySetting.INSTANCE.enable()) {
            C20441214yg.LJ("Frequency Control", "AlienationCapsule quota decreased.");
            HashMap<Long, MsgNotifyQuota> map = C1102420enI.LIZ;
            Room room = this.LLILZ;
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            C1102420enI.LIZIZ(6, false, false, "watch", "AlienationFollowCapsule", id);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget
    public final void T1(boolean z) {
        if (LiveNotifyMessageFrequencySetting.INSTANCE.enable()) {
            GuideMessage guideMessage = this.LLILZIL;
            if (guideMessage != null) {
                long messageId = guideMessage.getMessageId();
                if (!this.LLJJJ.contains(Long.valueOf(messageId))) {
                    HashMap<Long, MsgNotifyQuota> map = C1102420enI.LIZ;
                    C512940K9s c512940K9sLIZLLL = C1102420enI.LIZLLL(6, this.dataChannel, "watch", false, false);
                    if (c512940K9sLIZLLL.LIZ) {
                        this.LLJJJ.add(Long.valueOf(messageId));
                        super.T1(true);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(this.LLILZIL);
                        sbLIZ.append(" is added to allow set. Show.");
                        C20441214yg.LJ("Frequency Control", C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                    y1(c512940K9sLIZLLL.LIZIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(this.LLILZIL);
                    sbLIZ2.append(" has been frequency controlled. Not show.");
                    C20441214yg.LJ("Frequency Control", C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                super.T1(false);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(this.LLILZIL);
                sbLIZ3.append(" is in allow set. Show.");
                C20441214yg.LJ("Frequency Control", C2188811AlT.LIZIZ(sbLIZ3));
                return;
            }
            super.T1(false);
            return;
        }
        super.T1(false);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        InterfaceC519340KYi interfaceC519340KYi;
        this.LLJILLL = (C1324720kZq) findViewById(R.id.aza);
        this.LLJJI = (LiveIconView) findViewById(R.id.evh);
        this.LLJJ = (C16F5) findViewById(R.id.ewu);
        KeyEvent.Callback view = getView();
        if ((view instanceof InterfaceC519340KYi) && (interfaceC519340KYi = (InterfaceC519340KYi) view) != null) {
            interfaceC519340KYi.LIZ(this);
        }
        View view2 = getView();
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 43), view2);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget, com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onUnload(RecycleSource recycleSource) {
        super.onUnload(recycleSource);
        X1();
        Y1();
        this.LLILLL.removeCallbacksAndMessages(this.LLJJLIIIJLLLLLLLZ);
        this.LLJJJ.clear();
        C473050Igp.LIZIZ().LIZLLL.removeObservers(this);
        ((IBusinessAvoidanceService) C1161920gLG.LIZJ(IBusinessAvoidanceService.class)).im2(this.LLJLILLLLZIIL, this.dataChannel);
    }

    @Override // X.InterfaceC519350KYj
    public final void onWindowFocusChanged(boolean z) {
        if (z) {
            if (this.LLJJIJIIJIL == 0) {
                this.LLJJIJIIJIL = SystemClock.uptimeMillis();
                return;
            }
            return;
        }
        Y1();
    }

    @Override // com.bytedance.android.livesdk.notify.AnimatableNotifyWidget
    public final void x1(final EnumC512800K9e enumC512800K9e) {
        ViewGroup viewGroup;
        a2();
        View view = getView();
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            C1149000g0Q c1149000g0Q = new C1149000g0Q();
            c1149000g0Q.LJJIIZ(700L);
            c1149000g0Q.LJJIZ(new InterfaceC21462418z0() { // from class: X.0KYh
                @Override // X.InterfaceC21462418z0
                public final void LIZ() {
                }

                @Override // X.InterfaceC21462418z0
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC21462418z0
                public final void LIZJ() {
                }

                @Override // X.InterfaceC21462418z0
                public final void LJFF(AbstractC21460218ye abstractC21460218ye) {
                }

                @Override // X.InterfaceC21462418z0
                public final void LIZLLL(AbstractC21463118z7 abstractC21463118z7) {
                    super/*com.bytedance.android.livesdk.notify.AnimatableNotifyWidget*/.x1(enumC512800K9e);
                }
            });
            C19748612Om.LIZ(viewGroup, c1149000g0Q);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget, com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onLoad(RecycleSource recycleSource, Object[] objArr) {
        ImageModel avatarThumb;
        User owner;
        super.onLoad(recycleSource, objArr);
        super.z1(EnumC512800K9e.OTHERS, false);
        ((IBusinessAvoidanceService) C1161920gLG.LIZJ(IBusinessAvoidanceService.class)).az(this.LLJLILLLLZIIL, this.dataChannel);
        C1324720kZq c1324720kZq = this.LLJILLL;
        Room room = this.LLILZ;
        if (room != null && (owner = room.getOwner()) != null) {
            avatarThumb = owner.getAvatarThumb();
        } else {
            avatarThumb = null;
        }
        C1121670fIL.LJIIL(c1324720kZq, avatarThumb, R.drawable.el9);
        LiveIconView liveIconView = this.LLJJI;
        if (liveIconView != null) {
            C786410Ut5.LLJJIJIL(liveIconView, 8);
        }
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, 8);
        }
        C16F5 c16f52 = this.LLJJ;
        if (c16f52 != null) {
            c16f52.setText(2131841703);
        }
        LiveIconView liveIconView2 = this.LLJJI;
        if (liveIconView2 != null) {
            liveIconView2.setIcon(C20736316Cj.LJ(R.attr.e_6, this.context));
        }
        if (isShowing()) {
            this.LLJJIII = SystemClock.uptimeMillis();
            View view = getView();
            if (view != null && view.hasWindowFocus()) {
                this.LLJJIJIIJIL = SystemClock.uptimeMillis();
            }
        }
    }

    @Override // X.InterfaceC1102160ems
    public final void w0(int i, List<String> list) {
        LLFFF(i);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget, com.bytedance.android.livesdk.notify.AnimatableNotifyWidget
    public final void z1(EnumC512800K9e enumC512800K9e, boolean z) {
        super.z1(enumC512800K9e, z);
        X1();
    }

    @Override // com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, X.InterfaceC512830K9h
    public final void LLIILII(boolean z, boolean z2, boolean z3, InterfaceC1096630edx interfaceC1096630edx, C0KAJ c0kaj) {
        super.LLIILII(z, z2, z3, interfaceC1096630edx, c0kaj);
        if (z3) {
            this.LLILZIL = null;
            M1("others", null);
        }
    }

    @Override // X.InterfaceC1102160ems
    public final void t(int i, int i2, InterfaceC1102120emo interfaceC1102120emo, C1102130emp c1102130emp, boolean z) {
        DataChannel dataChannel;
        List<String> listLIZIZ = c1102130emp.LIZIZ();
        String strLJJLIIIJ = C13LP.LJJLIIIJ(listLIZIZ, ",", null, null, 0, null, null, 62);
        boolean z2 = !this.LLJL.containsAll(listLIZIZ);
        if (!C13LP.LJJL(this.LLJLIL, C13LP.LLIIJI(listLIZIZ)).isEmpty()) {
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.zW(FollowGuideBottomCardShow.class, Boolean.FALSE);
            }
            if (!LiveConflictAvoidFollowCapsulePositionOpt.INSTANCE.enable() && (dataChannel = this.dataChannel) != null) {
                dataChannel.zW(FollowGuideBottomCardVisibilityAnimInfo.class, new C519370KYl(false, false));
            }
        }
        this.LLILZLL = new C519290KYd(strLJJLIIIJ, z2, false);
        if (isShowing()) {
            L1(strLJJLIIIJ, false);
            if (z) {
                z1(EnumC512800K9e.END_LIFECYCLE, false);
            } else if (z2) {
                z1(EnumC512800K9e.CONFLICT_CONTROLLED, false);
                return;
            } else {
                V1();
                return;
            }
        } else {
            if (i == 0 && i2 == 1) {
                L1(strLJJLIIIJ, true);
            }
            if (!z) {
                return;
            }
        }
        this.LLILZIL = null;
        M1("others", null);
    }
}
