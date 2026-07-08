package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C0UFE;
import X.C1161920gLG;
import X.C1AI0;
import X.C1AI1;
import X.C1AI2;
import X.C1AI6;
import X.C753070TgP;
import X.C760180Trs;
import X.C766270U4b;
import X.C773980UXs;
import X.EnumC785670Urt;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.gift.GiftService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.broadcast.GiftFeatureChannel;
import com.bytedance.android.livesdk.broadcast.PreviewInteractHasEntranceEvent;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolWidget;
import com.bytedance.android.livesdk.dataChannel.OpenViewerWishesSetupChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.gift.ViewerWishesConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class PreviewViewerWishesWidget extends PreviewToolWidget {
    public final int LLILZLL = 2131856944;
    public final int LLIZ = R.attr.en3;
    public final int LLIZLLLIL = R.attr.c9i;
    public Boolean LLJ;
    public Boolean LLJI;
    public Boolean LLJIJIL;

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolWidget, com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final boolean Y1() {
        Boolean bool = this.LLJIJIL;
        Boolean bool2 = Boolean.TRUE;
        return Intrinsics.LJFF(bool, bool2) && Intrinsics.LJFF(this.LLJI, bool2) && Intrinsics.LJFF(this.LLJ, bool2) && ViewerWishesConfig.INSTANCE.getGetValue().anchorEnabled;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        RoomCreateInfo roomCreateInfo;
        RoomCreateInfo.ViewerWishesIconInfo viewerWishesIconInfo;
        C773980UXs c773980UXs;
        if (!Y1()) {
            hide();
            return;
        }
        C760180Trs.LJIIJJI(this.dataChannel, "viewer_wish");
        C1AI2 c1ai2 = new C1AI2("show", null, "go_live_page", null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, 0, null, 0L, -6, 2097151);
        C1AI1.LIZ(c1ai2, this.dataChannel, true);
        C1AI0.LJIILIIL(c1ai2);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (c773980UXs = (C773980UXs) dataChannel.gg0(OpenViewerWishesSetupChannel.class)) != null && c773980UXs.LIZ) {
            this.dataChannel.zW(OpenViewerWishesSetupChannel.class, null);
            GiftService.LLILLJJLI.showViewerWishesSettingPage(this.dataChannel, new C1AI6(false, EnumC785670Urt.DYNAMIC, c773980UXs.LIZIZ, null, null, null, null, null, 2036), c773980UXs.LIZJ);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 == null || (roomCreateInfo = (RoomCreateInfo) dataChannel2.gg0(RoomCreateInfoChannel.class)) == null || (viewerWishesIconInfo = roomCreateInfo.viewerWishesIconInfo) == null || !viewerWishesIconInfo.hasUnavailableGifts) {
            return;
        }
        C766270U4b.LIZLLL(2131856977);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        boolean z = C753070TgP.LIZ(this.dataChannel) == C0UFE.ON;
        boolean zJF0 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).JF0();
        if (z || zJF0) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.EQ2(this, PreviewInteractHasEntranceEvent.class, new AwS591S0100000_12(this, 336));
            }
        } else {
            this.LLJ = Boolean.TRUE;
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.EQ2(this, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 337));
            dataChannel2.EQ2(this, GiftFeatureChannel.class, new AwS591S0100000_12(this, 338));
        }
    }

    @Override // X.InterfaceC782830UnJ
    public final boolean LLLII() {
        return B1();
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int O1() {
        return this.LLILZLL;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolWidget
    public final int W1() {
        return this.LLIZLLLIL;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolWidget
    public final int X1() {
        return this.LLIZ;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final void onClick(View view) {
        GiftService.LLILLJJLI.showViewerWishesSettingPage(this.dataChannel, new C1AI6(false, EnumC785670Urt.GO_LIVE, null, null, null, null, null, null, 2044), false);
        C1AI2 c1ai2 = new C1AI2("click", null, "go_live_page", null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, 0, null, 0L, -6, 2097151);
        C1AI1.LIZ(c1ai2, this.dataChannel, true);
        C1AI0.LJIILIIL(c1ai2);
        C760180Trs.LJIIIZ(this.dataChannel, "viewer_wish");
    }
}
