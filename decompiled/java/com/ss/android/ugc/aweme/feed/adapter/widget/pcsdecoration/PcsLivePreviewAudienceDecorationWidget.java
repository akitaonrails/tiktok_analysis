package com.ss.android.ugc.aweme.feed.adapter.widget.pcsdecoration;

import X.C001A;
import X.C01GW;
import X.C01TT;
import X.C1085210eLX;
import X.C1145160fuE;
import X.C1161920gLG;
import X.C13LE;
import X.C19719912Dl;
import X.C1ABT;
import X.C1ACA;
import X.C1AKK;
import X.C723850SaN;
import X.C786410Ut5;
import X.EnumC1083620eIy;
import X.EnumC494740Jai;
import X.InterfaceC1097170eep;
import X.InterfaceC390601fU;
import X.InterfaceC781460Ul6;
import Y.AObserverS221S0100000_17;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.setting.LiveDecorationAudienceHideNativeBoard;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreviewPerfOptSetting;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.message.SMBBoardMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.widget.NextLiveData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.pcsdecoration.PcsLivePreviewAudienceDecorationWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class PcsLivePreviewAudienceDecorationWidget extends LiveWatchPreviewWidget {
    public final C01GW LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public View LLJILJIL;
    public final C1085210eLX LLJILJILJ;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0eLX] */
    public PcsLivePreviewAudienceDecorationWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LivePreviewPlayerVM.class);
        this.LLJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, EnumC494740Jai.WIDGET, new AwS561S0100000_17(c19719912DlLIZ, 259), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), WidgetWithoutSyncConfig.INSTANCE.getInitVmWithoutSync());
        this.LLJILJILJ = new OnIMMessageListener() { // from class: X.0eLX
            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final String messageListenerBizTag() {
                return "pcs_audience_decoration";
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final IMListenerType messageListenerType() {
                return IMListenerType.SYNC;
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
            public final void onMessage(IMessage iMessage) {
                C1ACA c1acaZ1;
                LiveRoomStruct liveRoomStruct;
                IPcsService iPcsServiceLJLIIIL;
                InterfaceC781460Ul6 interfaceC781460Ul6ZI2;
                C1AKK liteService;
                IPcsService iPcsServiceLJLIIIL2;
                InterfaceC781460Ul6 interfaceC781460Ul6ZI22;
                long id;
                if ((iMessage instanceof SMBBoardMessage) && (c1acaZ1 = this.LL.z1()) != null && (liveRoomStruct = c1acaZ1.LIZJ) != null) {
                    this.LL.getClass();
                    Room roomLIZ = C2175221ABc.LIZ(liveRoomStruct);
                    if (roomLIZ != null) {
                        PcsLivePreviewAudienceDecorationWidget pcsLivePreviewAudienceDecorationWidget = this.LL;
                        SMBBoardMessage sMBBoardMessage = (SMBBoardMessage) iMessage;
                        Board board = sMBBoardMessage.board;
                        if (sMBBoardMessage.action == 1 && !LiveDecorationAudienceHideNativeBoard.INSTANCE.getValue() && board != null && (liteService = Live.getLiteService()) != null && (iPcsServiceLJLIIIL2 = liteService.LJLIIIL()) != null && (interfaceC781460Ul6ZI22 = iPcsServiceLJLIIIL2.ZI2()) != null) {
                            long id2 = roomLIZ.getId();
                            long j = board.id;
                            int i = board.version;
                            User owner = roomLIZ.getOwner();
                            if (owner != null) {
                                id = owner.getId();
                            } else {
                                id = 0;
                            }
                            interfaceC781460Ul6ZI22.LJFF(i, id2, j, id);
                        }
                        C1AKK liteService2 = Live.getLiteService();
                        if (liteService2 != null && (iPcsServiceLJLIIIL = liteService2.LJLIIIL()) != null && (interfaceC781460Ul6ZI2 = iPcsServiceLJLIIIL.ZI2()) != null) {
                            interfaceC781460Ul6ZI2.LJIIIZ(new C1078550eAn(sMBBoardMessage.action, sMBBoardMessage.board), EnumC1083620eIy.PREVIEW_CARD, String.valueOf(C1ABT.LJIIZILJ(pcsLivePreviewAudienceDecorationWidget.z1())));
                        }
                    }
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void B1() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void H1() {
    }

    public final void P1() {
        NextLiveData nextLiveData;
        IMessageManager iMessageManager;
        this.LLJI = false;
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null && (iMessageManager = c1acaZ1.LJJIIZ) != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this.LLJILJILJ);
        }
        LivePreviewPlayerVM livePreviewPlayerVM = (LivePreviewPlayerVM) this.LLJ.getValue();
        if (livePreviewPlayerVM == null || (nextLiveData = livePreviewPlayerVM.LLJJIJIL) == null) {
            return;
        }
        nextLiveData.removeObservers(this);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hhy;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void M1() {
        View view;
        C19719912Dl c19719912DlLJIIJJI;
        Fragment fragment;
        if (this.LLJIJIL || !R1() || (view = this.LLJILJIL) == null || (c19719912DlLJIIJJI = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).ZI2().LJIIJJI()) == null) {
            return;
        }
        C1ACA c1acaZ1 = z1();
        long jLJIIZILJ = c1acaZ1 != null ? C1ABT.LJIIZILJ(c1acaZ1) : 0L;
        DataChannel dataChannel = this.dataChannel;
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep != null && (fragment = interfaceC1097170eep.getFragment()) != null) {
            C723850SaN.LIZ(fragment, false, null, new C1145160fuE(fragment, jLJIIZILJ, dataChannel, c19719912DlLJIIJJI, view), 3);
        }
        this.LLJIJIL = true;
    }

    public final boolean R1() {
        if (this.LLJILJIL != null) {
            return true;
        }
        View view = this.contentView;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return false;
        }
        View viewLIZLLL = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).ZI2().LIZLLL(viewGroup);
        this.LLJILJIL = viewLIZLLL;
        return viewLIZLLL != null;
    }

    public final void S1() {
        C19719912Dl c19719912DlLJIIJJI;
        Fragment fragment;
        if (this.LLJIJIL && (c19719912DlLJIIJJI = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).ZI2().LJIIJJI()) != null) {
            InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
            if (interfaceC1097170eep != null && (fragment = interfaceC1097170eep.getFragment()) != null) {
                C723850SaN.LJIIIIZZ(fragment, c19719912DlLJIIJJI);
            }
            this.LLJIJIL = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        super.L1();
        P1();
        Q1();
        O1();
        S1();
    }

    public final void N1() {
        IMessageManager iMessageManager;
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null) {
            C1ABT.LJIILL(c1acaZ1);
        }
        C1ACA c1acaZ12 = z1();
        if (c1acaZ12 == null || (iMessageManager = c1acaZ12.LJJIIZ) == null) {
            return;
        }
        iMessageManager.removeMessageListener((OnIMMessageListener) this.LLJILJILJ);
        iMessageManager.addMessageListener(C001A.S_M_B_BOARD_MESSAGE.getIntType(), (OnIMMessageListener) this.LLJILJILJ);
    }

    public final void O1() {
        C1AKK liteService;
        IPcsService iPcsServiceLJLIIIL;
        InterfaceC781460Ul6 interfaceC781460Ul6ZI2;
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null) {
            long jLJIIZILJ = C1ABT.LJIIZILJ(c1acaZ1);
            if (jLJIIZILJ <= 0 || (liteService = Live.getLiteService()) == null || (iPcsServiceLJLIIIL = liteService.LJLIIIL()) == null || (interfaceC781460Ul6ZI2 = iPcsServiceLJLIIIL.ZI2()) == null) {
                return;
            }
            interfaceC781460Ul6ZI2.LJIIJ(EnumC1083620eIy.PREVIEW_CARD, String.valueOf(jLJIIZILJ));
        }
    }

    public final void Q1() {
        InterfaceC390601fU effectBoardService;
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null) {
            long jLJIIZILJ = C1ABT.LJIIZILJ(c1acaZ1);
            if (jLJIIZILJ <= 0 || (effectBoardService = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getEffectBoardService("preview_card", String.valueOf(jLJIIZILJ))) == null) {
                return;
            }
            effectBoardService.LJ();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        ViewGroup viewGroup;
        P1();
        Q1();
        O1();
        S1();
        View view = this.LLJILJIL;
        ViewParent parent = view != null ? view.getParent() : null;
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(this.LLJILJIL, viewGroup);
        }
        this.LLJILJIL = null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        long jLJIIZILJ;
        long j;
        NextLiveData nextLiveData;
        LiveRoomStruct liveRoomStruct;
        super.LJJIJIIJIL(i);
        if (!LivePreviewPerfOptSetting.enablePcsDecorationLazyLoad()) {
            M1();
        }
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null) {
            jLJIIZILJ = C1ABT.LJIIZILJ(c1acaZ1);
        } else {
            jLJIIZILJ = 0;
        }
        C1ACA c1acaZ12 = z1();
        if (c1acaZ12 != null && (liveRoomStruct = c1acaZ12.LIZJ) != null) {
            j = liveRoomStruct.smbBoardId;
        } else {
            j = 0;
        }
        if (jLJIIZILJ > 0) {
            if (j > 0) {
                if (LivePreviewPerfOptSetting.enablePcsDecorationLazyLoad()) {
                    M1();
                }
                N1();
                C01TT.LIZJ(new AwS561S0100000_17(this, 678));
                return;
            }
            LivePreviewPlayerVM livePreviewPlayerVM = (LivePreviewPlayerVM) this.LLJ.getValue();
            if (livePreviewPlayerVM == null || (nextLiveData = livePreviewPlayerVM.LLJJIJIL) == null) {
                return;
            }
            nextLiveData.observe(this, new AObserverS221S0100000_17(this, 60));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        LiveRoomStruct liveRoomStruct;
        super.onLoad(objArr);
        if (!LivePreviewPerfOptSetting.enablePcsDecorationLazyLoad()) {
            R1();
            return;
        }
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 == null || (liveRoomStruct = c1acaZ1.LIZJ) == null || liveRoomStruct.smbBoardId <= 0) {
            return;
        }
        R1();
    }
}
