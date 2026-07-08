package com.bytedance.android.livesdk.chatroom.widget.followguide;

import X.AbstractC1105780esi;
import X.C0IKG;
import X.C0IKH;
import X.C0TZM;
import X.C1105770esh;
import X.C1105860esq;
import X.C1161920gLG;
import X.C1388190mED;
import X.C1697810uHb;
import X.C176600m4;
import X.C2097608Jq;
import X.C464800IKo;
import X.C473050Igp;
import X.C500260Jjc;
import X.C519290KYd;
import X.C766270U4b;
import X.C785410UrT;
import X.C786410Ut5;
import X.DialogInterfaceOnDismissListenerC1151680g4k;
import X.ViewOnClickListenerC1105840eso;
import Y.ARunnableS117S0100000_17;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.PollVisibleChannel;
import com.bytedance.android.live.ToolBarShareVisibleChannel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.FastGiftVisibleChannel;
import com.bytedance.android.live.gift.GiftDialogVisibilityChannel;
import com.bytedance.android.live.liveinteract.match.business.event.MvpDialogVisibleChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestVisibleChannel;
import com.bytedance.android.live.room.UserProfileShowingChannel;
import com.bytedance.android.live.wallet.model.ReChargeDialogOnShow;
import com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideDialogWidget;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.dataChannel.FullScreenSurveyShowing;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.dataChannel.PIPStatusData;
import com.bytedance.android.livesdk.dataChannel.RemindFollowDialogVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.SubscribeWebOnShow;
import com.bytedance.android.livesdk.model.message.GuideMessage;
import com.bytedance.android.livesdk.rank.api.OnlineAudienceRankListDialogVisibilityChannel;
import com.bytedance.android.livesdk.rank.api.RankListDialogVisibilityChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.event.LiveExploreDrawerShowChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class FollowGuideDialogWidget extends FollowGuideAbsWidget {
    public ViewOnClickListenerC1105840eso LLJILLL;
    public final ARunnableS117S0100000_17 LLJJ = new ARunnableS117S0100000_17(this, 75);
    public final ARunnableS117S0100000_17 LLJJI = new ARunnableS117S0100000_17(this, 74);
    public long LLJJIII = -1;

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget
    public final long F1() {
        return 0L;
    }

    @Override // X.InterfaceC1102150emr
    public final int getComponentType() {
        return 0;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget, com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget
    public final C519290KYd C1() {
        Class cls;
        DataChannel dataChannel;
        if (C176600m4.LIZIZ(Boolean.valueOf(((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2().LIZ))) {
            return new C519290KYd("subscribe", false, false, 12);
        }
        if (C464800IKo.LIZ.LJIIJ(false) || C473050Igp.LIZIZ().LIZJ()) {
            return new C519290KYd("dialog", false, false, 12);
        }
        C0IKH c0ikhLIZJ = C0IKG.LIZJ(this.context.getClass().getSimpleName());
        if (c0ikhLIZJ != null && c0ikhLIZJ.mt()) {
            return new C519290KYd("drawer", false, false, 12);
        }
        Iterator it2 = C1697810uHb.LJIIJJI(UserProfileShowingChannel.class, GiftDialogVisibilityChannel.class, KeyboardStatusChannel.class, RankListDialogVisibilityChannel.class, OnlineAudienceRankListDialogVisibilityChannel.class, FastGiftVisibleChannel.class, MultiGuestVisibleChannel.class, PollVisibleChannel.class, ToolBarShareVisibleChannel.class, MvpDialogVisibleChannel.class, ReChargeDialogOnShow.class, SubscribeWebOnShow.class).iterator();
        do {
            if (!it2.hasNext()) {
                return null;
            }
            cls = (Class) it2.next();
            dataChannel = this.dataChannel;
        } while (!C176600m4.LIZIZ(dataChannel != null ? (Boolean) dataChannel.gg0(cls) : null));
        return new C519290KYd(cls.getSimpleName(), false, false, 12);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget
    public final void H1() {
        ViewOnClickListenerC1105840eso viewOnClickListenerC1105840eso = this.LLJILLL;
        if (viewOnClickListenerC1105840eso == null || !viewOnClickListenerC1105840eso.isShowing()) {
            C519290KYd c519290KYdC1 = C1();
            if (c519290KYdC1 != null) {
                L1(c519290KYdC1.LIZ, true);
            } else {
                C786410Ut5.LJJZZIII(this.LLILLL, this.LLJJ);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget
    public final void Q1() {
        ViewOnClickListenerC1105840eso viewOnClickListenerC1105840eso = this.LLJILLL;
        if (viewOnClickListenerC1105840eso != null) {
            viewOnClickListenerC1105840eso.LLJILJILJ.setText(2131841708);
        }
        C766270U4b.LIZLLL(2131841708);
        Y1(false);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget
    public final void S1() {
        DataChannel dataChannel = this.dataChannel;
        dataChannel.BQ2(this, UserProfileShowingChannel.class, new AwS596S0100000_17(this, 107));
        dataChannel.BQ2(this, GiftDialogVisibilityChannel.class, new AwS596S0100000_17(this, 108));
        dataChannel.BQ2(this, KeyboardStatusChannel.class, new AwS596S0100000_17(this, 109));
        dataChannel.BQ2(this, RankListDialogVisibilityChannel.class, new AwS596S0100000_17(this, 110));
        dataChannel.BQ2(this, OnlineAudienceRankListDialogVisibilityChannel.class, new AwS596S0100000_17(this, 111));
        dataChannel.BQ2(this, FastGiftVisibleChannel.class, new AwS596S0100000_17(this, 112));
        dataChannel.BQ2(this, MultiGuestVisibleChannel.class, new AwS596S0100000_17(this, 113));
        dataChannel.BQ2(this, PollVisibleChannel.class, new AwS596S0100000_17(this, 114));
        dataChannel.BQ2(this, ToolBarShareVisibleChannel.class, new AwS596S0100000_17(this, 115));
        dataChannel.BQ2(this, MvpDialogVisibleChannel.class, new AwS596S0100000_17(this, 105));
        dataChannel.BQ2(this, LiveExploreDrawerShowChannel.class, new AwS596S0100000_17(this, 106));
    }

    public final Map<String, String> W1(boolean z) {
        String str;
        Pair[] pairArr = new Pair[1];
        if (z) {
            str = "close";
        } else {
            str = "auto";
        }
        pairArr[0] = new Pair("close_type", str);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (this.LLJJIII != -1) {
            mapLJIIJ.put("duration", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(SystemClock.uptimeMillis() - this.LLJJIII)));
        }
        return mapLJIIJ;
    }

    public final void X1(Boolean bool) {
        if (C500260Jjc.LJJIFFI(bool) && this.LLILZIL != null) {
            H1();
        }
    }

    public final void Y1(boolean z) {
        User owner;
        if (z) {
            if (this.LLILZIL == null || !UserService.getInstance().user().isLogin()) {
                return;
            }
            Room room = this.LLILZ;
            if ((room == null || (owner = room.getOwner()) == null || !owner.isFollowing()) && isViewValid()) {
                ViewOnClickListenerC1105840eso viewOnClickListenerC1105840eso = this.LLJILLL;
                if (viewOnClickListenerC1105840eso != null && viewOnClickListenerC1105840eso.isShowing()) {
                    return;
                }
                Activity activityLIZ = C1388190mED.LIZ(this.context);
                if (activityLIZ != null && activityLIZ.isFinishing()) {
                    return;
                }
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(PIPStatusData.class), Boolean.TRUE)) {
                    return;
                }
                DataChannel dataChannel2 = this.dataChannel;
                if (dataChannel2 != null && Intrinsics.LJFF(dataChannel2.gg0(FullScreenSurveyShowing.class), Boolean.TRUE)) {
                    return;
                }
                if (this.LLJILLL == null) {
                    ViewOnClickListenerC1105840eso viewOnClickListenerC1105840eso2 = new ViewOnClickListenerC1105840eso(this.context, this.LLILZ, Intrinsics.LJFF(this.dataChannel.gg0(C0TZM.class), Boolean.TRUE));
                    viewOnClickListenerC1105840eso2.LLJJ = this.LLILZIL;
                    viewOnClickListenerC1105840eso2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: X.0esk
                        @Override // android.content.DialogInterface.OnShowListener
                        public final void onShow(DialogInterface dialogInterface) {
                            FollowGuideDialogWidget followGuideDialogWidget = this.LL;
                            if (followGuideDialogWidget.dataChannel != null) {
                                followGuideDialogWidget.LLJJIII = SystemClock.uptimeMillis();
                                this.LL.dataChannel.zW(RemindFollowDialogVisibilityChannel.class, Boolean.TRUE);
                            }
                        }
                    });
                    viewOnClickListenerC1105840eso2.setOnDismissListener(new DialogInterfaceOnDismissListenerC1151680g4k(this, 1));
                    viewOnClickListenerC1105840eso2.LLJJI = new C1105860esq(this, viewOnClickListenerC1105840eso2);
                    this.LLJILLL = viewOnClickListenerC1105840eso2;
                }
                C1105770esh.LIZ().LIZ(new AbstractC1105780esi() { // from class: X.0esp
                    @Override // X.InterfaceC1105760esg
                    public final void call() {
                        ViewOnClickListenerC1105840eso viewOnClickListenerC1105840eso3 = this.LLILLJJLI.LLJILLL;
                        if (viewOnClickListenerC1105840eso3 == null) {
                            return;
                        }
                        viewOnClickListenerC1105840eso3.show();
                        C785410UrT.LIZIZ(viewOnClickListenerC1105840eso3);
                        PopupMonitorServiceImpl.LIZ.getClass();
                        PopupMonitorServiceImpl.LJJJ(viewOnClickListenerC1105840eso3);
                        C816490W1f.LIZ(viewOnClickListenerC1105840eso3);
                        FollowGuideDialogWidget followGuideDialogWidget = this.LLILLJJLI;
                        GuideMessage guideMessage = followGuideDialogWidget.LLILZIL;
                        if (guideMessage != null) {
                            long j = guideMessage.duration;
                            if (j > 0) {
                                followGuideDialogWidget.LLILLL.removeCallbacks(followGuideDialogWidget.LLJJI);
                                FollowGuideDialogWidget followGuideDialogWidget2 = this.LLILLJJLI;
                                C786410Ut5.LJLIIL(j, followGuideDialogWidget2.LLILLL, followGuideDialogWidget2.LLJJI);
                            }
                        }
                        this.LLILLJJLI.N1();
                    }
                });
                return;
            }
            return;
        }
        ViewOnClickListenerC1105840eso viewOnClickListenerC1105840eso3 = this.LLJILLL;
        if (viewOnClickListenerC1105840eso3 != null) {
            viewOnClickListenerC1105840eso3.dismiss();
            C785410UrT.LIZ(viewOnClickListenerC1105840eso3);
        }
        this.LLJILLL = null;
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget, com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onUnload(RecycleSource recycleSource) {
        super.onUnload(recycleSource);
        Y1(false);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget, com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onLoad(RecycleSource recycleSource, Object[] objArr) {
        super.onLoad(recycleSource, objArr);
        this.LLJJIII = -1L;
    }
}
