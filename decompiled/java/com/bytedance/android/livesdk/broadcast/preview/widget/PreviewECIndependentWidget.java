package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C760180Trs;
import X.EnumC756810TmR;
import X.EnumC785140Ur2;
import X.InterfaceC1124060fMC;
import X.InterfaceC770540UKm;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.broadcast.BroadcastSettingResponse;
import com.bytedance.android.live.broadcast.model.GoLiveECIconInfo;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.dataChannel.ECPreviewIndependentHasProduct;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.PreviewRevisionSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: loaded from: classes13.dex */
public class PreviewECIndependentWidget extends PreviewBaseSlotWidget {
    public final EnumC756810TmR LLJILJIL = EnumC756810TmR.SLOT_BROADCAST_PREVIEW_EC_INDEPENDENT;
    public final EnumC785140Ur2 LLJILJILJ = EnumC785140Ur2.PRIORITY;

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void D1() {
        this.LLILLL = false;
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
        return false;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget
    public final void Q1(String str) {
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC782830UnJ
    public final boolean LLLII() {
        return B1();
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public void C1() {
        super.C1();
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
        GoLiveECIconInfo goLiveECIconInfo;
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
            interfaceC770540UKm.putData("param_live_revision_lib", Integer.valueOf(iLIZLLL));
        }
        InterfaceC770540UKm interfaceC770540UKm2 = this.LLILZ;
        if (interfaceC770540UKm2 != null) {
            interfaceC770540UKm2.putData("param_live_revision_shop_icon_url", PreviewRevisionSetting.INSTANCE.getShopSchema());
        }
        InterfaceC770540UKm interfaceC770540UKm3 = this.LLILZ;
        if (interfaceC770540UKm3 != null) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && (roomCreateInfo = (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class)) != null) {
                goLiveECIconInfo = roomCreateInfo.goLiveEcIconInfo;
            } else {
                goLiveECIconInfo = null;
            }
            interfaceC770540UKm3.putData("param_create_info_ec_icon_info", goLiveECIconInfo);
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget, X.InterfaceC1123890fLv
    public final void t1(InterfaceC1124060fMC<?, ?, ?> interfaceC1124060fMC, IIconSlot.SlotViewModel slotViewModel) {
        super.t1(interfaceC1124060fMC, slotViewModel);
        slotViewModel.LLILZLL.observe(this, new Observer() { // from class: X.0Tmc
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                Integer numLJIIJJI = C2095008Iq.LJIIJJI((String) obj);
                boolean z = false;
                if (numLJIIJJI != null && numLJIIJJI.intValue() > 0) {
                    z = true;
                }
                DataChannelGlobal.LLILZ.FQ2(ECPreviewIndependentHasProduct.class, Boolean.valueOf(z));
            }
        });
    }
}
