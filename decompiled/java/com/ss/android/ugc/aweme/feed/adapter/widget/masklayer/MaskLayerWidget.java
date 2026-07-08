package com.ss.android.ugc.aweme.feed.adapter.widget.masklayer;

import X.C01GW;
import X.C13LE;
import X.C1602160rnK;
import X.C19719912Dl;
import X.C1ACA;
import X.C2097608Jq;
import X.C474500IjA;
import X.C488720JEo;
import X.C488790JEv;
import X.C500260Jjc;
import X.C749430TaX;
import X.EnumC494740Jai;
import X.InterfaceC20673515v3;
import X.InterfaceC488740JEq;
import X.InterfaceC488780JEu;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.MaskLayerAndWarningVM;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.MaskLayer;
import com.ss.android.ugc.aweme.feed.model.live.PunishEventInfo;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class MaskLayerWidget extends LiveWatchPreviewWidget {
    public C488790JEv LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;

    public MaskLayerWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MaskLayerAndWarningVM.class);
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(c19719912DlLIZ, 154);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        EnumC494740Jai enumC494740Jai = EnumC494740Jai.WIDGET;
        this.LLJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, enumC494740Jai, awS551S0100000_7, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FeedLiveViewHolderVM.class);
        this.LLJIJIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ2, enumC494740Jai, new AwS551S0100000_7(c19719912DlLIZ2, 155), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.df5;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        String str;
        LiveRoomStruct liveRoomStruct;
        MaskLayer maskLayer;
        C488790JEv c488790JEv = this.LLJ;
        if (c488790JEv != null && !c488790JEv.LLIZ && c488790JEv.getVisibility() == 0) {
            C1ACA c1acaZ1 = z1();
            if ((c1acaZ1 == null || (liveRoomStruct = c1acaZ1.LIZJ) == null || (maskLayer = liveRoomStruct.maskLayer) == null || !maskLayer.isR2OrUnknownMask()) ? false : true) {
                C1ACA c1acaZ12 = z1();
                LiveRoomStruct liveRoomStruct2 = c1acaZ12 != null ? c1acaZ12.LIZJ : null;
                C1ACA c1acaZ13 = z1();
                if (c1acaZ13 == null || (str = c1acaZ13.LIZLLL) == null) {
                    str = "";
                }
                C488720JEo.LIZ(liveRoomStruct2, str, "draw", "draw");
            }
            O1("draw");
        }
        C488790JEv c488790JEv2 = this.LLJ;
        if (c488790JEv2 != null) {
            c488790JEv2.LLIZ = false;
        }
        MaskLayerAndWarningVM maskLayerAndWarningVMN1 = N1();
        if (maskLayerAndWarningVMN1 != null) {
            maskLayerAndWarningVMN1.LLILLL = false;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.SX0(C749430TaX.class, Boolean.FALSE);
        }
    }

    public final void M1() {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        InterfaceC488740JEq interfaceC488740JEqLJJJJLL;
        InterfaceC20673515v3 interfaceC20673515v3K42;
        String str;
        LiveRoomStruct liveRoomStruct;
        MaskLayer maskLayer;
        String str2;
        C488790JEv c488790JEv = this.LLJ;
        if (c488790JEv != null) {
            c488790JEv.LLIZLLLIL = new InterfaceC488780JEu() { // from class: X.0JEt
                @Override // X.InterfaceC488780JEu
                public final void LJ() {
                    DataChannel dataChannel = this.LIZ.dataChannel;
                    if (dataChannel != null) {
                        dataChannel.SX0(C749430TaX.class, Boolean.FALSE);
                    }
                    MaskLayerAndWarningVM maskLayerAndWarningVMN1 = this.LIZ.N1();
                    if (maskLayerAndWarningVMN1 != null) {
                        maskLayerAndWarningVMN1.LLILZ = 200;
                    }
                    C1ACA c1acaZ1 = this.LIZ.z1();
                    if (c1acaZ1 != null) {
                        c1acaZ1.LJII = true;
                    }
                    C766270U4b.LIZLLL(2131843035);
                    FeedLiveViewHolderVM feedLiveViewHolderVM = (FeedLiveViewHolderVM) this.LIZ.LLJIJIL.getValue();
                    if (feedLiveViewHolderVM != null) {
                        feedLiveViewHolderVM.JQ2();
                    }
                    this.LIZ.O1("skip");
                }

                @Override // X.InterfaceC488780JEu
                public final void LJFF() {
                    MaskLayerAndWarningVM maskLayerAndWarningVMN1 = this.LIZ.N1();
                    if (maskLayerAndWarningVMN1 != null) {
                        maskLayerAndWarningVMN1.LLILLL = true;
                    }
                    MaskLayerAndWarningVM maskLayerAndWarningVMN12 = this.LIZ.N1();
                    if (maskLayerAndWarningVMN12 != null) {
                        maskLayerAndWarningVMN12.LLILZ = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
                    }
                    MaskLayerAndWarningVM maskLayerAndWarningVMN13 = this.LIZ.N1();
                    if (maskLayerAndWarningVMN13 != null) {
                        maskLayerAndWarningVMN13.LLILZLL.setValue(Unit.LIZ);
                    }
                    this.LIZ.O1("watch_live");
                    C1ACA c1acaZ1 = this.LIZ.z1();
                    if (c1acaZ1 != null) {
                        c1acaZ1.LJJII = false;
                    }
                }
            };
        }
        boolean zIsR2OrUnknownMask = false;
        if (c488790JEv != null) {
            int visibility = c488790JEv.getVisibility();
            c488790JEv.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c488790JEv);
        }
        C488790JEv c488790JEv2 = this.LLJ;
        String str3 = "homepage_hot";
        if (c488790JEv2 != null) {
            C1ACA c1acaZ1 = z1();
            LiveRoomStruct liveRoomStruct2 = c1acaZ1 != null ? c1acaZ1.LIZJ : null;
            C1ACA c1acaZ12 = z1();
            if (c1acaZ12 == null || (str2 = c1acaZ12.LIZLLL) == null) {
                str2 = "homepage_hot";
            }
            c488790JEv2.LIZ(liveRoomStruct2, str2);
        }
        C1ACA c1acaZ13 = z1();
        if (c1acaZ13 != null && (liveRoomStruct = c1acaZ13.LIZJ) != null && (maskLayer = liveRoomStruct.maskLayer) != null) {
            zIsR2OrUnknownMask = maskLayer.isR2OrUnknownMask();
        }
        if (zIsR2OrUnknownMask) {
            C1ACA c1acaZ14 = z1();
            LiveRoomStruct liveRoomStruct3 = c1acaZ14 != null ? c1acaZ14.LIZJ : null;
            C1ACA c1acaZ15 = z1();
            if (c1acaZ15 != null && (str = c1acaZ15.LIZLLL) != null) {
                str3 = str;
            }
            if (liveRoomStruct3 != null) {
                ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
                if (iLiveOuterService != null && (interfaceC20673515v3K42 = iLiveOuterService.k4()) != null) {
                    interfaceC20673515v3K42.LJJJI(liveRoomStruct3.id, liveRoomStruct3.getAnchorId());
                }
                HashMap map = new HashMap();
                map.put("enter_from_merge", str3);
                map.put("enter_method", "live_cell");
                map.put("action_type", "show");
                ILiveOuterService iLiveOuterService2 = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
                if (iLiveOuterService2 != null && (interfaceC20673515v3K4 = iLiveOuterService2.k4()) != null && (interfaceC488740JEqLJJJJLL = interfaceC20673515v3K4.LJJJJLL("livesdk_mask_layer_show")) != null) {
                    interfaceC488740JEqLJJJJLL.LIZIZ(map);
                    C474500IjA c474500IjALIZJ = interfaceC488740JEqLJJJJLL.LIZJ();
                    if (c474500IjALIZJ != null) {
                        c474500IjALIZJ.LIZ();
                    }
                }
            }
        }
        O1("show");
        MaskLayerAndWarningVM maskLayerAndWarningVMN1 = N1();
        if (maskLayerAndWarningVMN1 != null) {
            maskLayerAndWarningVMN1.LLILLJJLI = true;
        }
        C1ACA c1acaZ16 = z1();
        if (c1acaZ16 != null) {
            c1acaZ16.LJJII = true;
        }
        show();
    }

    public final MaskLayerAndWarningVM N1() {
        return (MaskLayerAndWarningVM) this.LLJI.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null) {
            c1acaZ1.LJJII = false;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        hide();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        C488790JEv c488790JEv = this.LLJ;
        if (c488790JEv != null) {
            c488790JEv.LLIZ = false;
        }
        MaskLayerAndWarningVM maskLayerAndWarningVMN1 = N1();
        if (maskLayerAndWarningVMN1 != null) {
            maskLayerAndWarningVMN1.LLILLL = false;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.SX0(C749430TaX.class, Boolean.FALSE);
        }
    }

    public final void O1(String str) {
        LiveRoomStruct liveRoomStruct;
        MaskLayer maskLayer;
        PunishEventInfo punishEventInfo;
        String uid;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        InterfaceC488740JEq interfaceC488740JEqLJJJJLL;
        LiveRoomStruct liveRoomStruct2;
        LiveRoomStruct liveRoomStruct3;
        User user;
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null && (liveRoomStruct = c1acaZ1.LIZJ) != null && (maskLayer = liveRoomStruct.maskLayer) != null && (punishEventInfo = maskLayer.punish_info) != null) {
            String str2 = punishEventInfo.punishId;
            Object objValueOf = "";
            if (str2 == null) {
                str2 = "";
            }
            String str3 = punishEventInfo.punishType;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = punishEventInfo.punishReason;
            if (str4 == null) {
                str4 = "";
            }
            C1ACA c1acaZ12 = z1();
            if (c1acaZ12 == null || (liveRoomStruct3 = c1acaZ12.LIZJ) == null || (user = liveRoomStruct3.owner) == null || (uid = user.getUid()) == null) {
                uid = "";
            }
            C1ACA c1acaZ13 = z1();
            if (c1acaZ13 != null && (liveRoomStruct2 = c1acaZ13.LIZJ) != null) {
                objValueOf = Long.valueOf(liveRoomStruct2.id);
            }
            String string = objValueOf.toString();
            ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
            if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null && (interfaceC488740JEqLJJJJLL = interfaceC20673515v3K4.LJJJJLL("livesdk_violation_mask_layer")) != null) {
                interfaceC488740JEqLJJJJLL.LIZIZ(C2097608Jq.LJIIIIZZ(new Pair("action_type", str), new Pair("violation_type", str3), new Pair("record_id", str2), new Pair("violation_reason", str4), new Pair("violation_anchor_id", uid), new Pair("violation_room_id", string), new Pair("user_id", ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID())));
                interfaceC488740JEqLJJJJLL.LIZ();
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LLJ = (C488790JEv) findViewById(R.id.htt);
        C500260Jjc.LJLJLJ(this.containerView, true);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
        M1();
    }
}
