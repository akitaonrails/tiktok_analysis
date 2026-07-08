package com.bytedance.android.livesdk.chatroom.widget.followguide;

import X.C1161920gLG;
import X.C473050Igp;
import X.C473410IhP;
import X.C748950TZl;
import X.C748960TZm;
import X.C786410Ut5;
import X.InterfaceC473070Igr;
import Y.ARunnableS107S0100000_7;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.feed.api.TopLiveSkylightVisibilityChannel;
import com.bytedance.android.live.PollVisibleChannel;
import com.bytedance.android.live.ToolBarShareVisibleChannel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.FastGiftClickChannel;
import com.bytedance.android.live.gift.GiftDialogVisibilityChannel;
import com.bytedance.android.live.liveinteract.match.business.event.MvpDialogVisibleChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestVisibleChannel;
import com.bytedance.android.live.room.UserProfileShowingChannel;
import com.bytedance.android.live.wallet.model.ReChargeDialogOnShow;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.dataChannel.SubscribeWebOnShow;
import com.bytedance.android.livesdk.rank.api.OnlineAudienceRankListDialogVisibilityChannel;
import com.bytedance.android.livesdk.rank.api.RankListDialogVisibilityChannel;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class ShareUserFollowGuideDialogWidget extends LiveRecyclableWidget {
    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).clearShareLinkManagerData();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Long l = (Long) this.dataChannel.gg0(C748960TZm.class);
        if (l != null) {
            long jLongValue = l.longValue();
            User shareExternalLinkShareUser = ((IHostShare) C1161920gLG.LIZJ(IHostShare.class)).getShareExternalLinkShareUser(jLongValue);
            if (shareExternalLinkShareUser == null) {
                ((IHostShare) C1161920gLG.LIZJ(IHostShare.class)).registerShareUserInfoListener(jLongValue, new InterfaceC473070Igr() { // from class: X.0IQU
                    @Override // X.InterfaceC473070Igr
                    public final void LIZ(User user) {
                        this.LIZ.x1(user);
                    }
                });
            } else {
                x1(shareExternalLinkShareUser);
            }
        }
    }

    public final void x1(User user) {
        if (this.dataChannel != null && user != null) {
            Long l = user.followStatus;
            if (l == null || l.longValue() != 1) {
                Long l2 = user.followStatus;
                if (l2 != null && l2.longValue() == 2) {
                    return;
                }
                boolean z = ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2().LIZ;
                if (C473050Igp.LIZIZ().LIZJ()) {
                    return;
                }
                Object objGg0 = DataChannelGlobal.LLILZ.gg0(TopLiveSkylightVisibilityChannel.class);
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.LJFF(objGg0, bool) || Intrinsics.LJFF(this.dataChannel.gg0(UserProfileShowingChannel.class), bool) || Intrinsics.LJFF(this.dataChannel.gg0(GiftDialogVisibilityChannel.class), bool) || Intrinsics.LJFF(this.dataChannel.gg0(FastGiftClickChannel.class), bool) || Intrinsics.LJFF(this.dataChannel.gg0(KeyboardStatusChannel.class), bool) || z || Intrinsics.LJFF(this.dataChannel.gg0(ReChargeDialogOnShow.class), bool) || Intrinsics.LJFF(this.dataChannel.gg0(SubscribeWebOnShow.class), bool) || Intrinsics.LJFF(this.dataChannel.gg0(RankListDialogVisibilityChannel.class), bool) || Intrinsics.LJFF(this.dataChannel.gg0(OnlineAudienceRankListDialogVisibilityChannel.class), bool) || Intrinsics.LJFF(this.dataChannel.gg0(MultiGuestVisibleChannel.class), bool) || Intrinsics.LJFF(this.dataChannel.gg0(PollVisibleChannel.class), bool) || Intrinsics.LJFF(this.dataChannel.gg0(ToolBarShareVisibleChannel.class), bool) || Intrinsics.LJFF(this.dataChannel.gg0(MvpDialogVisibleChannel.class), bool)) {
                    return;
                }
                this.dataChannel.SX0(C748950TZl.class, user);
                C786410Ut5.LJLIIL(2000L, C473410IhP.LIZ(), new ARunnableS107S0100000_7(this, 77));
            }
        }
    }
}
