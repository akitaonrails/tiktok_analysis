package com.ss.android.ugc.aweme.feed.adapter.widget.billboard;

import X.C001A;
import X.C011V;
import X.C01TT;
import X.C1085220eLY;
import X.C1161920gLG;
import X.C1ABT;
import X.C1ACA;
import X.C1AKK;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C497820Jfg;
import X.C786410Ut5;
import X.C814420VxA;
import Y.AObserverS221S0100000_17;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.billboard.IBillboardService;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.android.livesdk.livesetting.gift.LiveViewerWishesBillboardFeedEnableSetting;
import com.bytedance.android.livesdk.model.message.HostBoardMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS561S0100000_17;
import webcast.data.host_board.DisplayPosition;
import webcast.data.host_board.MultiHostBoard;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePreviewBillboardWidget extends LiveWatchPreviewWidget {
    public final C1085220eLY LLJ = new OnIMMessageListener() { // from class: X.0eLY
        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final String messageListenerBizTag() {
            return "Billboard_Preview";
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final IMListenerType messageListenerType() {
            return IMListenerType.SYNC;
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
        public final void onMessage(IMessage iMessage) {
            MultiHostBoard multiHostBoard;
            C1ACA c1acaZ1;
            LiveRoomStruct liveRoomStruct;
            Room roomLIZ;
            C1AKK liteService;
            IBillboardService iBillboardServiceLJJII;
            if ((iMessage instanceof HostBoardMessage) && (multiHostBoard = ((HostBoardMessage) iMessage).board) != null && (c1acaZ1 = this.LL.z1()) != null && (liveRoomStruct = c1acaZ1.LIZJ) != null && (roomLIZ = C2175221ABc.LIZ(liveRoomStruct)) != null && (liteService = Live.getLiteService()) != null && (iBillboardServiceLJJII = liteService.LJJII()) != null) {
                iBillboardServiceLJJII.yw2(multiHostBoard, C011V.PREVIEW_CARD, roomLIZ);
            }
        }
    };
    public final boolean LLJI = LiveViewerWishesBillboardFeedEnableSetting.INSTANCE.enabled();
    public ViewerWishesFeedWidget LLJIJIL;
    public View LLJILJIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dfy;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.LLJILJIL = null;
        if (this.LLJI && N1()) {
            this.subWidgetManager.unload(this.LLJIJIL);
            this.LLJIJIL = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void B1() {
        IMessageManager iMessageManager;
        if (N1()) {
            C1ACA c1acaZ1 = z1();
            if (c1acaZ1 != null) {
                C1ABT.LJIILL(c1acaZ1);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LivePreviewBillboardWidget#onBind: messageManager=");
            C1ACA c1acaZ12 = z1();
            sbLIZ.append(c1acaZ12 != null ? c1acaZ12.LJJIIZ : null);
            C2188811AlT.LIZIZ(sbLIZ);
            C1ACA c1acaZ13 = z1();
            if (c1acaZ13 != null && (iMessageManager = c1acaZ13.LJJIIZ) != null) {
                iMessageManager.addMessageListener(C001A.HOST_BOARD_MESSAGE.getIntType(), (OnIMMessageListener) this.LLJ);
            }
            ((IBillboardService) C1161920gLG.LIZJ(IBillboardService.class)).w71(C011V.PREVIEW_CARD, Long.valueOf(C1ABT.LJIIZILJ(z1()))).observe(this, new AObserverS221S0100000_17(this, 28));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void H1() {
        IBillboardService iBillboardServiceLJJII;
        IMessageManager iMessageManager;
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null && (iMessageManager = c1acaZ1.LJJIIZ) != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this.LLJ);
        }
        C1AKK liteService = Live.getLiteService();
        if (liteService != null && (iBillboardServiceLJJII = liteService.LJJII()) != null) {
            iBillboardServiceLJJII.Kl1(C011V.PREVIEW_CARD, Long.valueOf(C1ABT.LJIIZILJ(z1())));
        }
        C786410Ut5.LJJJJI((ViewGroup) this.contentView);
        this.LLJILJIL = null;
    }

    public final boolean N1() {
        LiveRoomStruct liveRoomStruct;
        C1ACA c1acaZ1 = z1();
        return (c1acaZ1 == null || (liveRoomStruct = c1acaZ1.LIZJ) == null || liveRoomStruct.hostBoardStatus != 1) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void C1(boolean z) {
        if (z) {
            hide();
        } else {
            show();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        super.LJJIJIIJIL(i);
        if (!N1()) {
            return;
        }
        C01TT.LIZIZ(200L, new AwS561S0100000_17(this, 258));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
        if (this.LLJI && N1()) {
            enableSubWidgetManager();
            ViewerWishesFeedWidget viewerWishesFeedWidget = new ViewerWishesFeedWidget();
            this.LLJIJIL = viewerWishesFeedWidget;
            this.subWidgetManager.load(viewerWishesFeedWidget);
        }
    }

    public final void M1(FrameLayout.LayoutParams layoutParams, DisplayPosition displayPosition) {
        int i;
        int iLIZIZ;
        Integer numValueOf;
        if (displayPosition != null && (numValueOf = Integer.valueOf(displayPosition.alignment)) != null) {
            if (numValueOf.intValue() == 0) {
                i = 8388611;
            } else {
                numValueOf.intValue();
                i = 8388613;
            }
        } else {
            i = 8388613;
        }
        layoutParams.gravity = i;
        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        if (displayPosition != null) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Long.valueOf(displayPosition.marginTop)));
        } else {
            iLIZIZ = 0;
        }
        layoutParams.topMargin = iLIZIZ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(126)) + C497820Jfg.LIZJ(this.context);
    }
}
