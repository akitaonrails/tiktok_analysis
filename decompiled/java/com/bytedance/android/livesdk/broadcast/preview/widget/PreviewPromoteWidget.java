package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C0UX6;
import X.C494680Jac;
import X.C500260Jjc;
import X.C760180Trs;
import X.C770530UKl;
import X.C786410Ut5;
import X.EnumC756810TmR;
import X.EnumC785140Ur2;
import X.InterfaceC770540UKm;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.broadcast.BroadcastSettingResponse;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.dataChannel.PreviewSubOnlyLiveSwitchChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public class PreviewPromoteWidget extends PreviewBaseSlotWidget {
    public final EnumC756810TmR LLJILJIL = EnumC756810TmR.SLOT_BROADCAST_PREVIEW_PROMOTE;
    public final EnumC785140Ur2 LLJILJILJ = EnumC785140Ur2.PRIORITY;
    public String LLJILLL = "";
    public boolean LLJJ;

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget
    public final void G1() {
        RedDotExtensionKt.LIZ(C0UX6.LIVE_BROADCAST_PREVIEW_PROMOTE);
    }

    public final void R1() {
        View redDotView;
        if (C500260Jjc.LJJJI(Boolean.valueOf(this.LLJJ)) && isShowing()) {
            C0UX6 c0ux6 = C0UX6.LIVE_BROADCAST_PREVIEW_PROMOTE;
            RedDotExtensionKt.LJIIJJI(c0ux6, this.LLJILLL);
            C770530UKl c770530UKl = this.LLILZIL;
            RedDotExtensionKt.LJI(c770530UKl != null ? c770530UKl.getRedDotView() : null, this, this, c0ux6, null);
            return;
        }
        C770530UKl c770530UKl2 = this.LLILZIL;
        if (c770530UKl2 == null || (redDotView = c770530UKl2.getRedDotView()) == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, redDotView);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        DataChannelGlobal.LLILZ.BQ2(this, this, PreviewSubOnlyLiveSwitchChannel.class, new AwS591S0100000_12(this, 306));
    }

    @Override // X.InterfaceC782830UnJ
    public final boolean LLLII() {
        return B1();
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public void onShow() {
        MutableLiveData<Boolean> mutableLiveData;
        boolean zLIZJ = C494680Jac.LIZJ();
        if (!zLIZJ) {
            R1();
            return;
        }
        IIconSlot.SlotViewModel slotViewModel = this.LLILZLL;
        if (slotViewModel == null || (mutableLiveData = slotViewModel.LLILZ) == null) {
            return;
        }
        mutableLiveData.setValue(Boolean.valueOf(!zLIZJ));
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
    public final boolean L1(boolean z) {
        this.LLJJ = z;
        R1();
        return true;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget
    public final void P1(BroadcastSettingResponse broadcastSettingResponse) {
        int iLIZLLL;
        if (C760180Trs.LIZLLL() != 0) {
            iLIZLLL = C760180Trs.LIZLLL();
        } else if (C760180Trs.LJ()) {
            iLIZLLL = 2;
        } else {
            iLIZLLL = 0;
        }
        InterfaceC770540UKm interfaceC770540UKm = this.LLILZ;
        if (interfaceC770540UKm != null) {
            interfaceC770540UKm.putData("param_broadcast_preview_promote_bool", Boolean.valueOf(broadcastSettingResponse.showPromote));
        }
        InterfaceC770540UKm interfaceC770540UKm2 = this.LLILZ;
        if (interfaceC770540UKm2 != null) {
            interfaceC770540UKm2.putData("param_broadcast_preview_promote_dot_badge_bool", Boolean.valueOf(broadcastSettingResponse.promoteDotBadge));
        }
        InterfaceC770540UKm interfaceC770540UKm3 = this.LLILZ;
        if (interfaceC770540UKm3 != null) {
            interfaceC770540UKm3.putData("param_broadcast_preview_promote_dot_badge_version_string", broadcastSettingResponse.promoteDotBadgeVersion);
        }
        InterfaceC770540UKm interfaceC770540UKm4 = this.LLILZ;
        if (interfaceC770540UKm4 != null) {
            interfaceC770540UKm4.putData("param_live_revision_lib", Integer.valueOf(iLIZLLL));
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget
    public final void Q1(String str) {
        this.LLJILLL = str;
    }
}
