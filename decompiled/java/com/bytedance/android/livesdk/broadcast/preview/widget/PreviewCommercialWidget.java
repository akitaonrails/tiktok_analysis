package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C098200Yq;
import X.C0UI2;
import X.C0UKC;
import X.C13LE;
import X.C13LP;
import X.C1697810uHb;
import X.C189200o6;
import X.C2097608Jq;
import X.C749500Tae;
import X.C760180Trs;
import X.C770530UKl;
import X.EnumC756810TmR;
import X.EnumC785140Ur2;
import X.InterfaceC1124060fMC;
import X.InterfaceC770540UKm;
import Y.ARunnableS112S0100000_12;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.broadcast.BroadcastSettingResponse;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.broadcast.PartnershipVideoLivePermission;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.PreviewRevisionSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class PreviewCommercialWidget extends PreviewBaseSlotWidget {
    public final EnumC756810TmR LLJILJIL = EnumC756810TmR.SLOT_BROADCAST_PREVIEW_TOOLBAR;
    public final EnumC785140Ur2 LLJILJILJ = EnumC785140Ur2.AGGREGATE;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void D1() {
        this.LLILLL = false;
        this.LLJILLL = true;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget
    public final void G1() {
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget
    public final boolean L1(boolean z) {
        return false;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget
    public final boolean O1() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget
    public final void Q1(String str) {
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void R1() {
        InterfaceC770540UKm interfaceC770540UKm;
        InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> slotWidgetByBizType;
        InterfaceC770540UKm interfaceC770540UKm2 = this.LLILZ;
        if (interfaceC770540UKm2 == null || interfaceC770540UKm2.getSlotWidgetByBizType("ba_leads_gen") == null || (interfaceC770540UKm = this.LLILZ) == null || (slotWidgetByBizType = interfaceC770540UKm.getSlotWidgetByBizType("ba_leads_gen")) == null) {
            return;
        }
        slotWidgetByBizType.onEvent(Boolean.TRUE);
    }

    public final void T1() {
        IIconSlot.SlotViewModel slotViewModel;
        MutableLiveData<Boolean> mutableLiveData;
        DataChannel dataChannel = this.dataChannel;
        Object objGg0 = dataChannel != null ? dataChannel.gg0(LiveModeChannel.class) : null;
        LiveMode liveMode = LiveMode.VIDEO;
        boolean z = C13LP.LJJJJ(objGg0, C1697810uHb.LJIIJJI(liveMode, LiveMode.THIRD_PARTY)) && this.LLJJI;
        InterfaceC770540UKm interfaceC770540UKm = this.LLILZ;
        if (interfaceC770540UKm != null) {
            interfaceC770540UKm.putData("gamecp_video_live_permissions", Boolean.valueOf(z));
        }
        try {
            Map mapLJ = (Map) this.dataChannel.gg0(C749500Tae.class);
            if (mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.SX0(C749500Tae.class, C2097608Jq.LJ());
            }
            if (Intrinsics.LJFF(mapLJ.get("gp_open_current_promote"), "1") && this.LLJJI && objGg0 == liveMode) {
                InterfaceC770540UKm interfaceC770540UKm2 = this.LLILZ;
                if (interfaceC770540UKm2 != null) {
                    interfaceC770540UKm2.putData("gamecp_gp_open_current_promote", Boolean.TRUE);
                }
                this.LLJJ = true;
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        DataChannel dataChannel3 = this.dataChannel;
        Object objGg02 = dataChannel3 != null ? dataChannel3.gg0(LiveModeChannel.class) : null;
        LiveMode liveMode2 = LiveMode.VIDEO;
        if (!C13LP.LJJJJ(objGg02, C1697810uHb.LJIIJJI(liveMode2, LiveMode.THIRD_PARTY)) || (slotViewModel = this.LLILZLL) == null || (mutableLiveData = slotViewModel.LLJJJIL) == null) {
            return;
        }
        mutableLiveData.setValue(Boolean.valueOf(objGg02 == liveMode2));
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public void C1() {
        super.C1();
        PreviewCommercialWidget previewCommercialWidget = (PreviewCommercialWidget) C0UKC.LJFF(C13LE.LIZ(PreviewCommercialWidget.class));
        if (previewCommercialWidget != null) {
            previewCommercialWidget.R1();
        }
        if (this.LLJILLL && this.LLJJI) {
            T1();
        }
        this.LLJILLL = false;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget, X.InterfaceC1123890fLv
    public final View LJLLI() {
        return getView();
    }

    @Override // X.InterfaceC782830UnJ
    public final boolean LLLII() {
        return B1();
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget
    public final EnumC785140Ur2 H1() {
        return this.LLJILJILJ;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget
    public final EnumC756810TmR J1() {
        return this.LLJILJIL;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget
    public final void P1(BroadcastSettingResponse broadcastSettingResponse) {
        int iLIZLLL;
        RoomCreateInfo roomCreateInfo;
        if (C760180Trs.LIZLLL() != 0) {
            iLIZLLL = C760180Trs.LIZLLL();
        } else if (C760180Trs.LJ()) {
            iLIZLLL = 2;
        } else {
            iLIZLLL = 0;
        }
        InterfaceC770540UKm interfaceC770540UKm = this.LLILZ;
        if (interfaceC770540UKm != null) {
            interfaceC770540UKm.putData("param_live_commercial", Boolean.valueOf(broadcastSettingResponse.liveCommercial));
        }
        InterfaceC770540UKm interfaceC770540UKm2 = this.LLILZ;
        if (interfaceC770540UKm2 != null) {
            interfaceC770540UKm2.putData("param_live_ba_link", Boolean.valueOf(broadcastSettingResponse.liveBALink));
        }
        InterfaceC770540UKm interfaceC770540UKm3 = this.LLILZ;
        if (interfaceC770540UKm3 != null) {
            interfaceC770540UKm3.putData("param_live_ba_leads_gen", Boolean.valueOf(broadcastSettingResponse.liveBaLeadsGen));
        }
        InterfaceC770540UKm interfaceC770540UKm4 = this.LLILZ;
        if (interfaceC770540UKm4 != null) {
            interfaceC770540UKm4.putData("param_live_paid_series", Boolean.valueOf(broadcastSettingResponse.livePaidContent));
        }
        InterfaceC770540UKm interfaceC770540UKm5 = this.LLILZ;
        if (interfaceC770540UKm5 != null) {
            interfaceC770540UKm5.putData("param_live_revision_lib", Integer.valueOf(iLIZLLL));
        }
        InterfaceC770540UKm interfaceC770540UKm6 = this.LLILZ;
        if (interfaceC770540UKm6 != null) {
            interfaceC770540UKm6.putData("param_live_revision_shop_icon_url", PreviewRevisionSetting.INSTANCE.getShopSchema());
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (roomCreateInfo = (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class)) != null) {
            InterfaceC770540UKm interfaceC770540UKm7 = this.LLILZ;
            if (interfaceC770540UKm7 != null) {
                interfaceC770540UKm7.putData("param_create_info_ec_icon_info", roomCreateInfo.goLiveEcIconInfo);
            }
            InterfaceC770540UKm interfaceC770540UKm8 = this.LLILZ;
            if (interfaceC770540UKm8 != null) {
                interfaceC770540UKm8.putData("param_create_info_ttls_live_permission", Boolean.valueOf(roomCreateInfo.hasTtlsLivePermission));
            }
        }
        C0UI2 c0ui2 = (C0UI2) this.dataChannel.gg0(PartnershipVideoLivePermission.class);
        if (c0ui2 != null) {
            S1(c0ui2);
            return;
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 == null) {
            return;
        }
        dataChannel2.EQ2(this, PartnershipVideoLivePermission.class, new AwS591S0100000_12(this, 1059));
    }

    public final void S1(C0UI2 c0ui2) {
        boolean z = c0ui2.LIZ;
        this.LLJJI = z;
        if (z) {
            T1();
            InterfaceC770540UKm interfaceC770540UKm = this.LLILZ;
            if (interfaceC770540UKm != null) {
                interfaceC770540UKm.putData("gamecp_last_video_live_added", Boolean.valueOf(c0ui2.LIZIZ));
            }
            InterfaceC770540UKm interfaceC770540UKm2 = this.LLILZ;
            if (interfaceC770540UKm2 != null) {
                interfaceC770540UKm2.putData("gamecp_video_anchor_info_object", c0ui2.LIZJ);
            }
        }
        N1();
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget, X.InterfaceC1123890fLv
    public final void t1(InterfaceC1124060fMC<?, ?, ?> interfaceC1124060fMC, IIconSlot.SlotViewModel slotViewModel) {
        super.t1(interfaceC1124060fMC, slotViewModel);
        if (this.LLJJ) {
            this.LLJJ = false;
            C770530UKl c770530UKl = this.LLILZIL;
            if (c770530UKl != null) {
                HandlerHook.viewPost(c770530UKl, new ARunnableS112S0100000_12(this, 75));
            }
        }
    }
}
