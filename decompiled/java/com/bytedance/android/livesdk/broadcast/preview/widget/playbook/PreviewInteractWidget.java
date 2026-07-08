package com.bytedance.android.livesdk.broadcast.preview.widget.playbook;

import X.C0IJT;
import X.C0JGR;
import X.C0UFE;
import X.C0UX6;
import X.C1113800f5e;
import X.C1161920gLG;
import X.C19322110iZ;
import X.C1AI6;
import X.C20441214yg;
import X.C2188811AlT;
import X.C464790IKn;
import X.C473410IhP;
import X.C474500IjA;
import X.C500260Jjc;
import X.C748880TZe;
import X.C753070TgP;
import X.C760180Trs;
import X.C766270U4b;
import X.C773980UXs;
import X.EnumC1120860fH2;
import X.EnumC785670Urt;
import Y.ARunnableS107S0100000_7;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.gift.GiftService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.broadcast.GiftFeatureChannel;
import com.bytedance.android.livesdk.broadcast.PreviewInteractHasEntranceEvent;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolWidget;
import com.bytedance.android.livesdk.dataChannel.OpenInteractPanelChannel;
import com.bytedance.android.livesdk.dataChannel.OpenViewerWishesSetupChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.gift.ViewerWishesConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.PlaybookEditorUgcSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes13.dex */
public class PreviewInteractWidget extends PreviewToolWidget {
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJILJ;
    public Boolean LLJILLL;
    public Boolean LLJJ;
    public boolean LLJJI;
    public long LLILZLL = -1;
    public final int LLIZ = 2131842196;
    public final int LLIZLLLIL = R.attr.e0e;
    public final int LLJ = R.attr.c9i;
    public boolean LLJILJIL = true;

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onHide() {
        this.LLJILJIL = true;
        if (this.LLJI) {
            C1113800f5e c1113800f5e = C1113800f5e.LIZ;
            C1113800f5e.LIZJ(EnumC1120860fH2.GUIDE_PREVIEW_INTERACT);
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolWidget, com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final boolean Y1() {
        return ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).JF0();
    }

    public final boolean a2() {
        return C753070TgP.LIZ(this.dataChannel) == C0UFE.ON;
    }

    public final void b2() {
        RoomCreateInfo roomCreateInfo;
        RoomCreateInfo.ViewerWishesIconInfo viewerWishesIconInfo;
        C773980UXs c773980UXs;
        if (this.LLJIJIL) {
            return;
        }
        this.LLJIJIL = true;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (c773980UXs = (C773980UXs) dataChannel.gg0(OpenViewerWishesSetupChannel.class)) != null && c773980UXs.LIZ) {
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.zW(OpenViewerWishesSetupChannel.class, c773980UXs);
            }
            if (!ViewerWishesConfig.INSTANCE.getGetValue().anchorEnabled) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Preview Interact Widget campaignName = ");
            sbLIZ.append(c773980UXs.LJ);
            sbLIZ.append(", campaignActivityId = ");
            sbLIZ.append(c773980UXs.LJFF);
            sbLIZ.append(", campaignGiftList = ");
            sbLIZ.append(c773980UXs.LIZLLL);
            sbLIZ.append(" saveType = ");
            sbLIZ.append(c773980UXs.LJI);
            sbLIZ.append(" scene = ");
            sbLIZ.append(c773980UXs.LIZIZ);
            sbLIZ.append(" templateId = ");
            sbLIZ.append(c773980UXs.LJII);
            C20441214yg.LIZIZ("VWSettingsV2", C2188811AlT.LIZIZ(sbLIZ));
            GiftService.LLILLJJLI.showViewerWishesSettingPage(this.dataChannel, new C1AI6(false, Intrinsics.LJFF(a0.LJLIIIL(c773980UXs.LIZIZ).toString(), "campaign_page") ? EnumC785670Urt.CAMPAIGN : EnumC785670Urt.DYNAMIC, c773980UXs.LIZIZ, c773980UXs.LIZLLL, c773980UXs.LJ, c773980UXs.LJFF, c773980UXs.LJI, c773980UXs.LJII, 52), c773980UXs.LIZJ);
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 == null || (roomCreateInfo = (RoomCreateInfo) dataChannel3.gg0(RoomCreateInfoChannel.class)) == null || (viewerWishesIconInfo = roomCreateInfo.viewerWishesIconInfo) == null || !viewerWishesIconInfo.hasUnavailableGifts) {
            return;
        }
        C766270U4b.LIZLLL(2131856977);
    }

    public final void c2() {
        if (C464790IKn.LIZ.LIZIZ(this.LLILZLL)) {
            return;
        }
        FragmentManager fragmentManager = (FragmentManager) this.dataChannel.gg0(C748880TZe.class);
        Bundle bundle = new Bundle();
        bundle.putInt("index", PreviewToolBaseWidget.G1(getView()));
        bundle.putBoolean("has_bubble", this.LLJI);
        bundle.putBoolean("has_poll", C753070TgP.LIZ(this.dataChannel) == C0UFE.ON);
        this.LLILZLL = C19322110iZ.LIZLLL(fragmentManager, PreviewInteractSheet.class, "base_preview_setting_main", null, bundle);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        if (!this.LLJILJILJ) {
            hide();
            return;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(PreviewInteractHasEntranceEvent.class, Boolean.TRUE);
        }
        if (this.LLJILJIL) {
            C760180Trs.LJIIJJI(this.dataChannel, "interact");
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_interaction_panel_show");
            c474500IjALIZ.LJIJJLI(this.dataChannel);
            c474500IjALIZ.LJJII("go_live", "entrance");
            c474500IjALIZ.LIZ();
        }
        this.LLJILJIL = false;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        if (C500260Jjc.LJJJJIZL(getView())) {
            C760180Trs.LJIIJJI(this.dataChannel, "interact");
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        if (Y1() && a2()) {
            d2(true);
            show();
            if (Intrinsics.LJFF(C0JGR.v2.LIZIZ(), Boolean.TRUE)) {
                C473410IhP.LIZJ(new ARunnableS107S0100000_7(this, 156), 1500L);
            }
            if (PlaybookEditorUgcSetting.INSTANCE.isUgcEnable()) {
                C0UX6 c0ux6 = C0UX6.PLAYBOOK_UGC_GO_LIVE_ENTRANCE_DIRECT;
                View view = getView();
                RedDotExtensionKt.LJI(view != null ? view.findViewById(R.id.widget_red_dot) : null, this, this, c0ux6, new AwS586S0100000_7(this, 329));
            }
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 374));
            dataChannel.EQ2(this, GiftFeatureChannel.class, new AwS591S0100000_12(this, 375));
        }
    }

    @Override // X.InterfaceC782830UnJ
    public final boolean LLLII() {
        return B1();
    }

    public final boolean e2() {
        if (Y1() && a2()) {
            return true;
        }
        if (Y1() && this.LLJJI) {
            return true;
        }
        return a2() && this.LLJJI;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int O1() {
        return this.LLIZ;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolWidget
    public final int W1() {
        return this.LLJ;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolWidget
    public final int X1() {
        return this.LLIZLLLIL;
    }

    public final void d2(boolean z) {
        DataChannel dataChannel;
        if (z && !this.LLJILJILJ && (dataChannel = this.dataChannel) != null && Intrinsics.LJFF(dataChannel.gg0(OpenInteractPanelChannel.class), Boolean.TRUE)) {
            c2();
        }
        this.LLJILJILJ = z;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final void onClick(View view) {
        if (C464790IKn.LIZ.LIZIZ(this.LLILZLL)) {
            return;
        }
        c2();
        C760180Trs.LJIIIZ(this.dataChannel, "interact");
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_interaction_entrance_click");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJJII("go_live", "position");
        c474500IjALIZ.LJJII(Boolean.FALSE, "has_red_dot");
        c474500IjALIZ.LIZ();
    }
}
