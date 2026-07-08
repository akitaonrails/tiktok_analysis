package com.bytedance.android.livesdk.broadcast.preview.widget.partnership;

import X.AnonymousClass0130;
import X.C01GU;
import X.C01GW;
import X.C0IJT;
import X.C0IYA;
import X.C0UNN;
import X.C1161920gLG;
import X.C1548820qPI;
import X.C20337914i1;
import X.C2097608Jq;
import X.C262100zr;
import X.C452501pT;
import X.C474500IjA;
import X.C500260Jjc;
import X.C5182020e;
import X.C5183020f;
import X.InterfaceC1106030et7;
import X.InterfaceC1141530foN;
import X.InterfaceC772390URp;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.CommentFeaturePreviewChannel;
import com.bytedance.android.livesdk.broadcast.PartnershipDropsEntranceChannel;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.PreviewGameDropsWidget;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class PreviewGameDropsWidget extends PreviewToolBaseWidget implements InterfaceC1141530foN {
    public boolean LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public final int LLJ = 2131841768;
    public final int LLJI = R.drawable.ex5;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new C5182020e(this, 80));
    public final AnonymousClass0130 LLJILJIL = new C0IYA() { // from class: X.0130
        @Override // X.C0IYA, X.InterfaceC1142670fqD
        public final void LIZLLL(String str, Exception exc) {
            this.LIZ.Y1();
        }

        @Override // X.C0IYA, X.InterfaceC1142670fqD
        public final void LIZJ(int i, int i2, String str) {
            PreviewGameDropsWidget previewGameDropsWidget = this.LIZ;
            previewGameDropsWidget.LLIZLLLIL = 2;
            previewGameDropsWidget.Y1();
            PreviewGameDropsWidget previewGameDropsWidget2 = this.LIZ;
            View view = previewGameDropsWidget2.getView();
            if (view != null) {
                HandlerHook.viewPostDelay(view, new RunnableC514801zW(previewGameDropsWidget2, 8), Mp4ScreenVideoLoadTimeout.CONTROL);
            }
        }
    };

    @Override // X.InterfaceC782830UnJ
    public final boolean LLLII() {
        return false;
    }

    public final Map<String, String> X1() {
        Object objGg0;
        Hashtag hashtag;
        Long l;
        Pair[] pairArr = new Pair[5];
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (objGg0 = dataChannel.gg0(C0UNN.class)) == null) {
            objGg0 = "";
        }
        pairArr[0] = new Pair("enter_from", objGg0);
        pairArr[1] = new Pair("entrance_page", "live_take_page");
        pairArr[2] = new Pair("icon_type", W1());
        DataChannel dataChannel2 = this.dataChannel;
        pairArr[3] = new Pair("game_tag_id", String.valueOf((dataChannel2 == null || (hashtag = (Hashtag) dataChannel2.gg0(HashtagChangedChannel.class)) == null || (l = hashtag.id) == null) ? 0L : l.longValue()));
        pairArr[4] = new Pair("allow_comments", Intrinsics.LJFF(this.dataChannel.gg0(CommentFeaturePreviewChannel.class), Boolean.TRUE) ? "1" : CardStruct.IStatusCode.DEFAULT);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer J1() {
        return Integer.valueOf(this.LLJI);
    }

    public final String W1() {
        String str = this.LLIZLLLIL == 2 ? "new_task" : "normal";
        return (Intrinsics.LJFF(str, "normal") && S1()) ? "red_dot" : str;
    }

    public final void Y1() {
        DataChannel dataChannel = this.dataChannel;
        String strW1 = W1();
        Map mapLJ = C2097608Jq.LJ();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_drops_icon_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII("live_take_page", "event_page");
        c474500IjALIZ.LJJII(strW1, "icon_type");
        c474500IjALIZ.LJJIIZI(mapLJ);
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public void onShow() {
        if (this.LLIZ && this.LLIZLLLIL == 0) {
            C20337914i1<Boolean> c20337914i1 = InterfaceC772390URp.p0;
            if (C500260Jjc.LJJIFFI(c20337914i1.LIZIZ())) {
                U1();
                c20337914i1.LJFF(Boolean.TRUE);
            }
            Y1();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (this.LLIZ) {
            super.show();
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        this.dataChannel.EQ2(this, PartnershipDropsEntranceChannel.class, new C5183020f(this, 99));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C1548820qPI.LJIIIIZZ("signInPartnershipDropsEvent", this);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int O1() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        if (Intrinsics.LJFF(c262100zr.LIZ, "signInPartnershipDropsEvent")) {
            InterfaceC1106030et7.w4.LIZJ(Boolean.TRUE);
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public void onClick(View view) {
        C01GU c01guOK0 = ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).oK0();
        if (!this.LLILZLL && !Intrinsics.LJFF(InterfaceC1106030et7.w4.LIZ(), Boolean.TRUE)) {
            if (c01guOK0 != null) {
                C01GU.LIZJ(this.context, X1());
            }
        } else if (c01guOK0 != null) {
            C01GU.LJ(this.context, X1());
        }
        W1();
        DataChannel dataChannel = this.dataChannel;
        String strW1 = W1();
        Map mapLJ = C2097608Jq.LJ();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_drops_icon_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII("live_take_page", "event_page");
        c474500IjALIZ.LJJII(strW1, "icon_type");
        c474500IjALIZ.LJJIIZI(mapLJ);
        c474500IjALIZ.LIZ();
        H1();
    }
}
