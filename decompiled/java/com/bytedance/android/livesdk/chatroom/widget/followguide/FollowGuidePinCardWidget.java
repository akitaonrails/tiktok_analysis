package com.bytedance.android.livesdk.chatroom.widget.followguide;

import X.C0II9;
import X.C0IJT;
import X.C0KVU;
import X.C1081600eFi;
import X.C1088240eQQ;
import X.C1121670fIL;
import X.C1161920gLG;
import X.C1324720kZq;
import X.C1697810uHb;
import X.C16F5;
import X.C16FS;
import X.C176600m4;
import X.C20736316Cj;
import X.C473050Igp;
import X.C474500IjA;
import X.C494680Jac;
import X.C497740JfY;
import X.C519290KYd;
import X.C786410Ut5;
import X.EnumC512800K9e;
import X.EnumC918970a1P;
import Y.ACListenerS142S0100000_7;
import Y.AObserverS211S0100000_7;
import Y.ARunnableS107S0100000_7;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.PollVisibleChannel;
import com.bytedance.android.live.ToolBarShareVisibleChannel;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.FastGiftVisibleChannel;
import com.bytedance.android.live.gift.GiftDialogVisibilityChannel;
import com.bytedance.android.live.gift.GiftGuideWidgetVisibilityChannel;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestVisibleChannel;
import com.bytedance.android.live.pincard.event.LivePinCardVisibilityChannel;
import com.bytedance.android.live.publicscreen.api.WarningInfoVisibilityEvent;
import com.bytedance.android.livesdk.comp.api.game.linkmic.GameLinkGuestNumChannel;
import com.bytedance.android.livesdk.dataChannel.CustomPollCardVisibility;
import com.bytedance.android.livesdk.dataChannel.CustomizedPerksCardVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LockScreenChannel;
import com.bytedance.android.livesdk.dataChannel.PublicScreenGiftPollStateVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.PublicScreenNormalPollStateVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.ScreenClearEvent;
import com.bytedance.android.livesdk.dataChannel.SparkOpenChannel;
import com.bytedance.android.livesdk.dataChannel.SubGoalCardVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.event.PartnershipPromoteGameCardShowBooleanChannel;
import com.bytedance.android.livesdk.slot.FrameL2SlotVisibilityChannel;
import com.bytedance.android.livesdk.slot.FrameL3SlotVisibilityChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.event.FollowGuidePinCardShow;
import com.bytedance.android.livesdkapi.depend.event.LiveExploreDrawerShowChannel;
import com.bytedance.android.livesdkapi.depend.event.LiveGoalPinCardVisibilityChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.Channel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public class FollowGuidePinCardWidget extends FollowGuideAbsWidget {
    public LiveIconView LLJILLL;
    public C1324720kZq LLJJ;
    public C16F5 LLJJI;
    public C16FS LLJJIII;
    public boolean LLJJIJIL;
    public long LLJJIJI = -1;
    public long LLJJIJIIJIL = -1;
    public final List<? extends Class<? extends Channel<Boolean>>> LLJJJ = C1697810uHb.LJIIJJI(KeyboardStatusChannel.class, FastGiftVisibleChannel.class, MultiGuestVisibleChannel.class, PollVisibleChannel.class, LiveExploreDrawerShowChannel.class, FrameL2SlotVisibilityChannel.class, FrameL3SlotVisibilityChannel.class, SubGoalCardVisibilityChannel.class, CustomPollCardVisibility.class, PublicScreenNormalPollStateVisibilityChannel.class, PublicScreenGiftPollStateVisibilityChannel.class, PartnershipPromoteGameCardShowBooleanChannel.class, WarningInfoVisibilityEvent.class, GiftGuideWidgetVisibilityChannel.class, LiveGoalPinCardVisibilityChannel.class, CustomizedPerksCardVisibilityChannel.class);
    public final List<Class<? extends Channel<Boolean>>> LLJJJIL = C1697810uHb.LJIIJJI(GiftDialogVisibilityChannel.class, ToolBarShareVisibleChannel.class);

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget
    public final long F1() {
        return 2L;
    }

    public int getComponentType() {
        return 0;
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget, com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget
    public final C519290KYd C1() {
        Integer num;
        C1081600eFi c1081600eFi;
        EnumC918970a1P enumC918970a1P;
        C0II9 c0ii9;
        C1088240eQQ c1088240eQQ;
        Class<? extends Channel<Boolean>> next;
        DataChannel dataChannel;
        Iterator<? extends Class<? extends Channel<Boolean>>> it2 = this.LLJJJ.iterator();
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
                DataChannel dataChannel4 = this.dataChannel;
                if (dataChannel4 != null && (c1081600eFi = (C1081600eFi) dataChannel4.gg0(MultiLiveRTCLayoutChannel.class)) != null && (((enumC918970a1P = c1081600eFi.LIZ) == EnumC918970a1P.FLOATING && c1081600eFi.LIZIZ > 0) || enumC918970a1P == EnumC918970a1P.FLOATING_FIX)) {
                    return new C519290KYd("MultiLiveRTCLayoutChannel", true, false, 12);
                }
                DataChannel dataChannel5 = this.dataChannel;
                if (dataChannel5 != null && (num = (Integer) dataChannel5.gg0(GameLinkGuestNumChannel.class)) != null && num.intValue() > 0) {
                    return new C519290KYd("GameLinkGuestNumChannel", true, false, 12);
                }
                for (Class<? extends Channel<Boolean>> cls : this.LLJJJIL) {
                    DataChannel dataChannel6 = this.dataChannel;
                    if (C176600m4.LIZIZ(dataChannel6 != null ? (Boolean) dataChannel6.gg0(cls) : null)) {
                        return new C519290KYd(cls.getSimpleName(), false, false, 12);
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
        C16FS c16fs = this.LLJJIII;
        if (c16fs != null) {
            c16fs.setText(2131844523);
        }
        C16FS c16fs2 = this.LLJJIII;
        if (c16fs2 != null) {
            c16fs2.setIcon(C20736316Cj.LJ(R.attr.ejq, this.context));
        }
        V1();
        C786410Ut5.LJLIIL(2000L, this.LLILLL, new ARunnableS107S0100000_7(this, 76));
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget
    public final void S1() {
        Iterator<? extends Class<? extends Channel<Boolean>>> it2 = this.LLJJJ.iterator();
        while (it2.hasNext()) {
            this.dataChannel.BQ2(this, it2.next(), new AwS586S0100000_7(this, 80));
        }
        this.dataChannel.BQ2(this, LockScreenChannel.class, new AwS586S0100000_7(this, 81));
        Iterator<Class<? extends Channel<Boolean>>> it3 = this.LLJJJIL.iterator();
        while (it3.hasNext()) {
            this.dataChannel.BQ2(this, it3.next(), new AwS586S0100000_7(this, 82));
        }
        C473050Igp.LIZIZ().LIZLLL.observe(this, new AObserverS211S0100000_7(this, 1));
        DataChannelGlobal.LLILZ.BQ2(this, this, SparkOpenChannel.class, new AwS586S0100000_7(this, 83));
        DataChannelGlobal.LLILZ.BQ2(this, this, ScreenClearEvent.class, new AwS586S0100000_7(this, 84));
        this.dataChannel.BQ2(this, LivePinCardVisibilityChannel.class, new AwS586S0100000_7(this, 85));
        this.dataChannel.BQ2(this, SubOnlyLiveAudienceStatusChannel.class, new AwS586S0100000_7(this, 86));
        this.dataChannel.BQ2(this, MultiLiveRTCLayoutChannel.class, new AwS586S0100000_7(this, 87));
        this.dataChannel.BQ2(this, GameLinkGuestNumChannel.class, new AwS586S0100000_7(this, 79));
    }

    public final void W1() {
        if (this.LLILZIL != null) {
            H1();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).C22(true);
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void onHideAnimationStart() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(FollowGuidePinCardShow.class, Boolean.FALSE);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void onShowAnimationStart() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(FollowGuidePinCardShow.class, Boolean.TRUE);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget, com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_side_card_show");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJJII("follow_guide", "content");
        c474500IjALIZ.LIZ();
        this.LLJJIJI = SystemClock.uptimeMillis();
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget
    public final void R1(boolean z) {
        this.LLJJIJIL = false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LLJILLL = (LiveIconView) findViewById(R.id.e1g);
        this.LLJJ = (C1324720kZq) findViewById(R.id.bh2);
        this.LLJJI = (C16F5) findViewById(R.id.ewu);
        this.LLJJIII = (C16FS) findViewById(R.id.idt);
        LiveIconView liveIconView = this.LLJILLL;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new ACListenerS142S0100000_7(this, 44));
        }
        C16FS c16fs = this.LLJJIII;
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new ACListenerS142S0100000_7(this, 45));
        }
        View view = getView();
        if (view != null) {
            C786410Ut5.I7(null, view);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget, com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onUnload(RecycleSource recycleSource) {
        super.onUnload(recycleSource);
        if (!this.LLJJIJIL) {
            M1("others", null);
        }
        C473050Igp.LIZIZ().LIZLLL.removeObservers(this);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget
    public final void I1(boolean z, EnumC512800K9e enumC512800K9e) {
        String str;
        z1(enumC512800K9e, false);
        this.LLJJIJIL = true;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_side_card_close");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJJII("follow_guide", "content");
        if (z) {
            str = "close";
        } else {
            str = "auto";
        }
        c474500IjALIZ.LJJII(str, "close_type");
        c474500IjALIZ.LJJII(Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.LLJJIJIIJIL)), "duration");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget, com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onLoad(RecycleSource recycleSource, Object[] objArr) {
        ImageModel avatarThumb;
        User owner;
        super.onLoad(recycleSource, objArr);
        hide();
        this.LLJJIJI = -1L;
        C1324720kZq c1324720kZq = this.LLJJ;
        Room room = this.LLILZ;
        if (room != null && (owner = room.getOwner()) != null) {
            avatarThumb = owner.getAvatarThumb();
        } else {
            avatarThumb = null;
        }
        C1121670fIL.LJIIL(c1324720kZq, avatarThumb, R.drawable.el9);
        C16F5 c16f5 = this.LLJJI;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJJ(2131841705, C0KVU.LIZ(UserService.getInstance().user().LJIJJLI())));
        }
        C16FS c16fs = this.LLJJIII;
        if (c16fs != null) {
            c16fs.setText(2131852435);
        }
        C16FS c16fs2 = this.LLJJIII;
        if (c16fs2 != null) {
            c16fs2.setIcon(C20736316Cj.LJ(R.attr.e_6, this.context));
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget, com.bytedance.android.livesdk.notify.AnimatableNotifyWidget
    public final void z1(EnumC512800K9e enumC512800K9e, boolean z) {
        super.z1(enumC512800K9e, false);
        if (this.LLJJIJI != -1) {
            this.LLJJIJIIJIL += SystemClock.uptimeMillis() - this.LLJJIJI;
            this.LLJJIJI = -1L;
        }
    }
}
