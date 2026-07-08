package com.bytedance.android.livesdk.chatroom.widget.survey.widget;

import X.C0II9;
import X.C1088240eQQ;
import X.C1697810uHb;
import X.C176600m4;
import X.C473050Igp;
import X.C494680Jac;
import Y.AObserverS211S0100000_7;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.PollVisibleChannel;
import com.bytedance.android.live.ToolBarShareVisibleChannel;
import com.bytedance.android.live.gift.FastGiftVisibleChannel;
import com.bytedance.android.live.gift.GiftDialogVisibilityChannel;
import com.bytedance.android.live.gift.GiftGuideWidgetVisibilityChannel;
import com.bytedance.android.live.gift.ShowGiftChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessIsCountingDownRoundStart;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestVisibleChannel;
import com.bytedance.android.live.pincard.event.LivePinCardVisibilityChannel;
import com.bytedance.android.live.publicscreen.api.WarningInfoVisibilityEvent;
import com.bytedance.android.livesdk.dataChannel.CommentPinWidgetVisibility;
import com.bytedance.android.livesdk.dataChannel.CustomPollCardVisibility;
import com.bytedance.android.livesdk.dataChannel.CustomizedPerksCardVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.HighPrioritySlotVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.HighPriorityTooltipVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.dataChannel.PublicScreenGiftPollStateVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.PublicScreenHeightInsufficient;
import com.bytedance.android.livesdk.dataChannel.PublicScreenNewMessageVisible;
import com.bytedance.android.livesdk.dataChannel.PublicScreenNormalPollStateVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.SelectPollShowChannel;
import com.bytedance.android.livesdk.dataChannel.SparkOpenChannel;
import com.bytedance.android.livesdk.dataChannel.SubGoalCardVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.event.PartnershipPromoteGameCardShowBooleanChannel;
import com.bytedance.android.livesdk.slot.FrameL2SlotVisibilityChannel;
import com.bytedance.android.livesdk.slot.FrameL3SlotVisibilityChannel;
import com.bytedance.android.livesdkapi.depend.event.FollowGuideBottomCardShow;
import com.bytedance.android.livesdkapi.depend.event.LiveExploreDrawerShowChannel;
import com.bytedance.android.livesdkapi.depend.event.LiveGoalPinCardVisibilityChannel;
import com.bytedance.ies.sdk.datachannel.Channel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public abstract class LightSurveyAvoidWidget extends AnimatableRecyclableWidget {
    public final List<Class<? extends Channel<Boolean>>> LL = C1697810uHb.LJIIJJI(MultiGuestVisibleChannel.class, PollVisibleChannel.class, FrameL2SlotVisibilityChannel.class, FrameL3SlotVisibilityChannel.class, SubGoalCardVisibilityChannel.class, CustomPollCardVisibility.class, PublicScreenNormalPollStateVisibilityChannel.class, PublicScreenGiftPollStateVisibilityChannel.class, PublicScreenNewMessageVisible.class, PartnershipPromoteGameCardShowBooleanChannel.class, LiveGoalPinCardVisibilityChannel.class, CustomizedPerksCardVisibilityChannel.class, FollowGuideBottomCardShow.class, PublicScreenHeightInsufficient.class, CommentPinWidgetVisibility.class, DrawGuessIsCountingDownRoundStart.class, WarningInfoVisibilityEvent.class, KeyboardStatusChannel.class, GiftGuideWidgetVisibilityChannel.class, HighPrioritySlotVisibilityChannel.class, HighPriorityTooltipVisibilityChannel.class);
    public final List<Class<? extends Channel<Boolean>>> LLILLJJLI = C1697810uHb.LJIIJJI(GiftDialogVisibilityChannel.class, ToolBarShareVisibleChannel.class, LiveExploreDrawerShowChannel.class, ShowGiftChannel.class, FastGiftVisibleChannel.class);

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final Boolean x1() {
        C0II9 c0ii9;
        C1088240eQQ c1088240eQQ;
        Integer num;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (num = (Integer) dataChannel.gg0(SelectPollShowChannel.class)) != null && num.intValue() > 0) {
            return Boolean.TRUE;
        }
        for (Class<? extends Channel<Boolean>> cls : this.LL) {
            DataChannel dataChannel2 = this.dataChannel;
            if (C176600m4.LIZIZ(dataChannel2 != null ? (Boolean) dataChannel2.gg0(cls) : null)) {
                return Boolean.TRUE;
            }
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null && (c1088240eQQ = (C1088240eQQ) dataChannel3.gg0(LivePinCardVisibilityChannel.class)) != null && c1088240eQQ.LIZIZ) {
            return Boolean.TRUE;
        }
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null && (c0ii9 = (C0II9) dataChannel4.gg0(SubOnlyLiveAudienceStatusChannel.class)) != null && C494680Jac.LJII(c0ii9)) {
            return Boolean.TRUE;
        }
        for (Class<? extends Channel<Boolean>> cls2 : this.LLILLJJLI) {
            DataChannel dataChannel5 = this.dataChannel;
            if (C176600m4.LIZIZ(dataChannel5 != null ? (Boolean) dataChannel5.gg0(cls2) : null)) {
                return Boolean.FALSE;
            }
        }
        if (C473050Igp.LIZIZ().LIZJ()) {
            return Boolean.FALSE;
        }
        if (C176600m4.LIZIZ((Boolean) DataChannelGlobal.LLILZ.gg0(SparkOpenChannel.class))) {
            return Boolean.FALSE;
        }
        return null;
    }

    @Override // com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public void onUnload(RecycleSource recycleSource) {
        C473050Igp.LIZIZ().LIZLLL.removeObservers(this);
    }

    public final void y1(Function0<Unit> function0) {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, SelectPollShowChannel.class, new AwS586S0100000_7(function0, (Function0<Unit>) 90));
        }
        for (Class<? extends Channel<Boolean>> cls : this.LL) {
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.BQ2(this, cls, new AwS586S0100000_7(function0, (Function0<Unit>) 91));
            }
        }
        for (Class<? extends Channel<Boolean>> cls2 : this.LLILLJJLI) {
            DataChannel dataChannel3 = this.dataChannel;
            if (dataChannel3 != null) {
                dataChannel3.BQ2(this, cls2, new AwS586S0100000_7(function0, (Function0<Unit>) 92));
            }
        }
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null && dataChannel4.gg0(LivePinCardVisibilityChannel.class) != null) {
            function0.invoke();
        }
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null) {
            dataChannel5.BQ2(this, SubOnlyLiveAudienceStatusChannel.class, new AwS586S0100000_7(function0, (Function0<Unit>) 93));
        }
        C473050Igp.LIZIZ().LIZLLL.observe(this, new AObserverS211S0100000_7(function0, 2));
        DataChannelGlobal.LLILZ.BQ2(this, this, SparkOpenChannel.class, new AwS586S0100000_7(function0, (Function0<Unit>) 94));
    }
}
