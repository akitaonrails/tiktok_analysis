package com.ss.android.ugc.aweme.feed.adapter.widget.billboard;

import X.AnonymousClass0956;
import X.C001A;
import X.C011V;
import X.C0IJT;
import X.C1161920gLG;
import X.C1ABT;
import X.C1ACA;
import X.C1AI1;
import X.C1AI2;
import X.C2176891AHn;
import X.C474500IjA;
import X.InterfaceC2176911AHp;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.billboard.IBillboardService;
import com.bytedance.android.live.gift.GiftService;
import com.bytedance.android.livesdk.model.message.ViewerPicksUpdateMessage;
import com.bytedance.android.livesdk.viewer_picks.model.GiftPickWithScore;
import com.bytedance.android.livesdk.viewer_picks.model.ViewerPickAnchorParam;
import com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksHeaderImage;
import com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.billboard.ViewerWishesFeedWidget;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: loaded from: classes34.dex */
public final class ViewerWishesFeedWidget extends LiveWatchPreviewWidget {
    public InterfaceC2176911AHp LLJ;
    public boolean LLJI;
    public AnonymousClass0956 LLJIJIL;
    public long LLJILJIL = -1;
    public long LLJILJILJ = -1;
    public long LLJILLL = -1;
    public final C2176891AHn LLJJ = new OnIMMessageListener() { // from class: X.1AHn
        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final String messageListenerBizTag() {
            return "Billboard_Preview_ViewerWishes";
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final IMListenerType messageListenerType() {
            return IMListenerType.SYNC;
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
        public final void onMessage(IMessage iMessage) {
            ViewerPicksUpdateMessage viewerPicksUpdateMessage;
            ViewerPicksInfo viewerPicksInfo;
            if ((iMessage instanceof ViewerPicksUpdateMessage) && (viewerPicksInfo = (viewerPicksUpdateMessage = (ViewerPicksUpdateMessage) iMessage).info) != null && viewerPicksInfo.displayMode == 1) {
                int i = viewerPicksUpdateMessage.updateType;
                if (i != 1 && i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            if (this.LL.P1(viewerPicksUpdateMessage)) {
                                return;
                            }
                            this.LL.M1();
                            this.LL.O1();
                        }
                    } else {
                        if (this.LL.P1(viewerPicksUpdateMessage)) {
                            return;
                        }
                        this.LL.M1();
                        ViewerWishesFeedWidget viewerWishesFeedWidget = this.LL;
                        viewerWishesFeedWidget.getClass();
                        viewerWishesFeedWidget.LLJIJIL = C500260Jjc.LJJJJJ(viewerWishesFeedWidget, null, new C783610UoZ(viewerWishesFeedWidget, null), 3);
                    }
                } else {
                    if (this.LL.P1(viewerPicksUpdateMessage)) {
                        return;
                    }
                    this.LL.M1();
                    final ViewerPicksInfo viewerPicksInfo2 = viewerPicksUpdateMessage.info;
                    final ViewerWishesFeedWidget viewerWishesFeedWidget2 = this.LL;
                    if (!viewerWishesFeedWidget2.LLJI && viewerPicksInfo2 != null) {
                        viewerWishesFeedWidget2.LLJI = true;
                        ((IBillboardService) C1161920gLG.LIZJ(IBillboardService.class)).kF1(new AnonymousClass0151() { // from class: X.1AHo
                            @Override // X.AnonymousClass0151
                            public final void LIZIZ(boolean z) {
                            }

                            @Override // X.AnonymousClass0151
                            public final void LIZJ() {
                            }

                            @Override // X.AnonymousClass0151
                            public final boolean LIZLLL() {
                                return true;
                            }

                            @Override // X.AnonymousClass0151
                            public final boolean LJ() {
                                return true;
                            }

                            @Override // X.AnonymousClass0151
                            public final void LJFF() {
                            }

                            @Override // X.AnonymousClass0151
                            public final void LJJJJLI() {
                            }

                            @Override // X.AnonymousClass0151
                            public final void getBizType() {
                            }

                            @Override // X.AnonymousClass0151
                            public final void getBoardId() {
                            }

                            @Override // X.AnonymousClass0151
                            public final void onAttach() {
                            }

                            @Override // X.AnonymousClass0151
                            public final void onDetach() {
                            }

                            @Override // X.AnonymousClass0151
                            public final void onHide() {
                            }

                            @Override // X.AnonymousClass0151
                            public final void onShow() {
                            }

                            @Override // X.AnonymousClass0151
                            public final View LIZ(Context context) {
                                C754520Tik c754520TikLJ;
                                String string;
                                String str;
                                LiveRoomStruct liveRoomStruct;
                                String string2;
                                LiveRoomStruct liveRoomStruct2;
                                InterfaceC2176911AHp interfaceC2176911AHp = viewerWishesFeedWidget2.LLJ;
                                if (interfaceC2176911AHp != null) {
                                    return interfaceC2176911AHp.getView();
                                }
                                InterfaceC949480aoc viewerWishesService = GiftService.LLILLJJLI.getViewerWishesService();
                                if (viewerWishesService != null) {
                                    c754520TikLJ = viewerWishesService.LJ(context);
                                } else {
                                    c754520TikLJ = null;
                                }
                                ViewerWishesFeedWidget viewerWishesFeedWidget3 = viewerWishesFeedWidget2;
                                viewerWishesFeedWidget3.LLJ = c754520TikLJ;
                                viewerWishesFeedWidget3.R1(viewerPicksInfo2);
                                ViewerWishesFeedWidget viewerWishesFeedWidget4 = viewerWishesFeedWidget2;
                                ViewerPicksInfo viewerPicksInfo3 = viewerPicksInfo2;
                                viewerWishesFeedWidget4.getClass();
                                if (viewerPicksInfo3 != null) {
                                    DataChannel dataChannel = viewerWishesFeedWidget4.dataChannel;
                                    C1ACA c1acaZ1 = viewerWishesFeedWidget4.z1();
                                    String str2 = CardStruct.IStatusCode.DEFAULT;
                                    if (c1acaZ1 == null || (liveRoomStruct2 = c1acaZ1.LIZJ) == null || (string = Long.valueOf(liveRoomStruct2.id).toString()) == null) {
                                        string = CardStruct.IStatusCode.DEFAULT;
                                    }
                                    C1ACA c1acaZ12 = viewerWishesFeedWidget4.z1();
                                    if (c1acaZ12 != null && (liveRoomStruct = c1acaZ12.LIZJ) != null && (string2 = Long.valueOf(liveRoomStruct.getAnchorId()).toString()) != null) {
                                        str2 = string2;
                                    }
                                    C1ACA c1acaZ13 = viewerWishesFeedWidget4.z1();
                                    if (c1acaZ13 == null || (str = c1acaZ13.LIZLLL) == null) {
                                        str = "";
                                    }
                                    C1AI0.LJIIJJI(viewerPicksInfo3, dataChannel, false, "live_preview", "new", false, new C2176921AHq(string, str2, str));
                                }
                                if (c754520TikLJ != null) {
                                    c754520TikLJ.getView();
                                    return c754520TikLJ;
                                }
                                return new View(context);
                            }
                        }, C011V.PREVIEW_CARD, Long.valueOf(C1ABT.LJIIZILJ(viewerWishesFeedWidget2.z1())), null);
                    } else {
                        viewerWishesFeedWidget2.R1(viewerPicksInfo2);
                    }
                }
                int i2 = viewerPicksUpdateMessage.updateType;
                if (i2 != 1 && i2 != 2) {
                    if (i2 == 3 || i2 == 4) {
                        this.LL.Q1();
                        return;
                    }
                    return;
                }
                ViewerWishesFeedWidget viewerWishesFeedWidget3 = this.LL;
                if (viewerWishesFeedWidget3.LLJILLL != -1) {
                    return;
                }
                viewerWishesFeedWidget3.LLJILLL = System.currentTimeMillis();
            }
        }
    };

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    public final void M1() {
        AnonymousClass0956 anonymousClass0956 = this.LLJIJIL;
        if (anonymousClass0956 == null || !anonymousClass0956.isActive()) {
            return;
        }
        AnonymousClass0956 anonymousClass09562 = this.LLJIJIL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        this.LLJIJIL = null;
    }

    public final void O1() {
        ((IBillboardService) C1161920gLG.LIZJ(IBillboardService.class)).rN2("vertical_fixed", C011V.PREVIEW_CARD, Long.valueOf(C1ABT.LJIIZILJ(z1())));
        long j = this.LLJILJIL;
        if (j != -1) {
            this.LLJILJILJ = j;
            this.LLJILJIL = -1L;
        }
        this.LLJI = false;
        this.LLJ = null;
        M1();
    }

    public final void Q1() {
        String string;
        String str;
        LiveRoomStruct liveRoomStruct;
        String string2;
        LiveRoomStruct liveRoomStruct2;
        long j = this.LLJILLL;
        if (j == -1) {
            return;
        }
        C1AI2 c1ai2 = new C1AI2(null, null, null, null, null, "live_preview", null, 0L, j, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, 0, null, 0L, -289, 2097151);
        C1AI1.LIZ(c1ai2, this.dataChannel, false);
        c1ai2.LJJIIJZLJL = C1AI1.LIZJ(1);
        C1ACA c1acaZ1 = z1();
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (c1acaZ1 == null || (liveRoomStruct2 = c1acaZ1.LIZJ) == null || (string = Long.valueOf(liveRoomStruct2.id).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        C1ACA c1acaZ12 = z1();
        if (c1acaZ12 != null && (liveRoomStruct = c1acaZ12.LIZJ) != null && (string2 = Long.valueOf(liveRoomStruct.getAnchorId()).toString()) != null) {
            str2 = string2;
        }
        C1ACA c1acaZ13 = z1();
        if (c1acaZ13 == null || (str = c1acaZ13.LIZLLL) == null) {
            str = "";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_vw_watch_duration");
        if (Intrinsics.LJFF(c1ai2.LJFF, "live_preview")) {
            c474500IjALIZ.LJJII(str2, "anchor_id");
            c474500IjALIZ.LJJII(string, "room_id");
            c474500IjALIZ.LJJII(str, "enter_from_merge");
        } else {
            c474500IjALIZ.LJJII(c1ai2.LJJIIZI, "anchor_id");
            c474500IjALIZ.LJJII(c1ai2.LJJIJ, "room_id");
            w.LIZ.getClass();
            c474500IjALIZ.LJJII(w.LJIIIZ(), "enter_from_merge");
            c474500IjALIZ.LJJII(w.LJIIL(), "enter_method");
            c474500IjALIZ.LJJII(w.LIZLLL(), "action_type");
            c474500IjALIZ.LJJII(w.LJIJI(), "request_id");
        }
        c474500IjALIZ.LJJII(c1ai2.LJJIIJZLJL, "viewer_wishes_live_type");
        c474500IjALIZ.LJJII(Integer.valueOf((int) Math.rint((System.currentTimeMillis() - c1ai2.LJIIIIZZ) / 1000.0f)), "watch_vw_duration");
        c474500IjALIZ.LJJII(c1ai2.LJFF, "event_page");
        c474500IjALIZ.LIZ();
        this.LLJILLL = -1L;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void F1() {
        IMessageManager iMessageManager;
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null) {
            C1ABT.LJIILL(c1acaZ1);
        }
        C1ACA c1acaZ12 = z1();
        if (c1acaZ12 == null || (iMessageManager = c1acaZ12.LJJIIZ) == null) {
            return;
        }
        iMessageManager.addMessageListener(C001A.VIEWER_PICKS_UPDATE_MESSAGE.getIntType(), (OnIMMessageListener) this.LLJJ);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        super.L1();
        N1();
    }

    public final void N1() {
        IMessageManager iMessageManager;
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null && (iMessageManager = c1acaZ1.LJJIIZ) != null) {
            iMessageManager.removeMessageListener(C001A.VIEWER_PICKS_UPDATE_MESSAGE.getIntType(), this.LLJJ);
        }
        if (this.LLJI) {
            Q1();
        }
        ((IBillboardService) C1161920gLG.LIZJ(IBillboardService.class)).rN2("vertical_fixed", C011V.PREVIEW_CARD, Long.valueOf(C1ABT.LJIIZILJ(z1())));
        this.LLJILJIL = -1L;
        this.LLJILJILJ = -1L;
        this.LLJI = false;
        this.LLJ = null;
        M1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJLIIIL(int i) {
        this.LL = false;
        N1();
    }

    public final boolean P1(ViewerPicksUpdateMessage viewerPicksUpdateMessage) {
        ViewerPickAnchorParam viewerPickAnchorParam;
        ViewerPicksInfo viewerPicksInfo = viewerPicksUpdateMessage.info;
        if (viewerPicksInfo == null || (viewerPickAnchorParam = viewerPicksInfo.anchorParam) == null || !viewerPickAnchorParam.integrateVwIntoLiveboard) {
            return true;
        }
        long j = viewerPicksInfo.viewerPicksId;
        if (j == this.LLJILJILJ) {
            return true;
        }
        long j2 = this.LLJILJIL;
        if (j == j2) {
            return false;
        }
        if (j2 != -1) {
            return true;
        }
        this.LLJILJIL = j;
        return false;
    }

    public final void R1(ViewerPicksInfo viewerPicksInfo) {
        List<GiftPickWithScore> arrayList;
        ViewerPicksHeaderImage viewerPicksHeaderImage;
        ImageModel imageModel;
        if (viewerPicksInfo != null && (viewerPicksHeaderImage = viewerPicksInfo.headerImage) != null && (imageModel = viewerPicksHeaderImage.image) != null) {
            InterfaceC2176911AHp interfaceC2176911AHp = this.LLJ;
            if (interfaceC2176911AHp != null) {
                interfaceC2176911AHp.setBanner(imageModel);
            }
        } else {
            InterfaceC2176911AHp interfaceC2176911AHp2 = this.LLJ;
            if (interfaceC2176911AHp2 != null) {
                interfaceC2176911AHp2.LIZ();
            }
        }
        InterfaceC2176911AHp interfaceC2176911AHp3 = this.LLJ;
        if (interfaceC2176911AHp3 != null) {
            if (viewerPicksInfo == null || (arrayList = viewerPicksInfo.giftPickList) == null) {
                arrayList = new ArrayList<>();
            }
            interfaceC2176911AHp3.setGiftList(arrayList);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
    }
}
