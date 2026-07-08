package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C0UX6;
import X.C1108110ewT;
import X.C1161920gLG;
import X.C781270Ukn;
import X.InterfaceC492450JSx;
import X.InterfaceC493650JXn;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewFansClubWidget;
import com.bytedance.android.livesdk.dataChannel.HasOptInSubData;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.dataChannel.SubInfoResponseChannel;
import com.bytedance.android.livesdk.livesetting.subscription.LivePcsTurnOffSubSetting;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
public class PreviewFansClubWidget extends PreviewToolWidget {
    public final int LLILZLL = R.attr.duz;
    public final int LLIZ = R.attr.exp;
    public final InterfaceC493650JXn LLIZLLLIL;

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int O1() {
        return 2131852344;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolWidget, com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public PreviewFansClubWidget() {
        C781270Ukn.LJJIII().pa();
        this.LLIZLLLIL = C1108110ewT.LIZJ();
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public void C1() {
        super.C1();
        this.dataChannel.gg0(RoomCreateInfoChannel.class);
        if (Y1((RoomCreateInfo) this.dataChannel.gg0(RoomCreateInfoChannel.class))) {
            show();
        } else {
            hide();
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        C0UX6 c0ux6 = C0UX6.FANS_CLUB_ENTRANCE_DIRECT;
        View view = getView();
        RedDotExtensionKt.LJI(view != null ? view.findViewById(R.id.widget_red_dot) : null, this, this, c0ux6, AFwS237S0000000_7.get$arr$(7));
        InterfaceC493650JXn interfaceC493650JXn = this.LLIZLLLIL;
        if (interfaceC493650JXn != null) {
            interfaceC493650JXn.LIZJ(new InterfaceC492450JSx() { // from class: X.0Jj0
                @Override // X.InterfaceC492450JSx
                public final void LIZ(Throwable th) {
                }

                @Override // X.InterfaceC492450JSx
                public final void LIZIZ(GetSubInfoResponse getSubInfoResponse) {
                    boolean z;
                    this.LIZ.dataChannel.zW(SubInfoResponseChannel.class, getSubInfoResponse);
                    DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                    if (getSubInfoResponse != null) {
                        z = getSubInfoResponse.qualification;
                    } else {
                        z = false;
                    }
                    dataChannelGlobal.HQ2(HasOptInSubData.class, Boolean.valueOf(z));
                    if (PreviewFansClubWidget.Y1((RoomCreateInfo) this.LIZ.dataChannel.gg0(RoomCreateInfoChannel.class))) {
                        this.LIZ.show();
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC782830UnJ
    public final boolean LLLII() {
        return B1();
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolWidget
    public final int W1() {
        return this.LLIZ;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolWidget
    public final int X1() {
        return this.LLILZLL;
    }

    public static boolean Y1(RoomCreateInfo roomCreateInfo) {
        RoomCreateInfo.FanClubInfo fanClubInfo;
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isCoin()) {
            return false;
        }
        if (LivePcsTurnOffSubSetting.turnOffSub() && ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isM2()) {
            return false;
        }
        if (roomCreateInfo != null && (fanClubInfo = roomCreateInfo.fanClubInfo) != null && !fanClubInfo.fanClubPermission) {
            return false;
        }
        return ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).pY1(User.subSplitStatus);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public void onClick(View view) {
        ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).c30(this.dataChannel, this.context);
        RedDotExtensionKt.LIZ(C0UX6.FANS_CLUB_ENTRANCE_DIRECT);
    }
}
