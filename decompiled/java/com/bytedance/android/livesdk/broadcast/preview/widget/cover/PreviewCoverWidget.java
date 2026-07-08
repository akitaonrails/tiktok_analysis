package com.bytedance.android.livesdk.broadcast.preview.widget.cover;

import X.C01GW;
import X.C0IJT;
import X.C1324720kZq;
import X.C202139147l;
import X.C354201Zc;
import X.C452501pT;
import X.C474500IjA;
import X.C486790J7d;
import X.C751980Tee;
import X.C754410TiZ;
import X.C754900TjM;
import X.C770730ULf;
import Y.ARunnableS112S0100000_12;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.comp.api.game.ForceGameAutoCoverChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import webcast.api.game.CreateInfoResponse;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewCoverWidget extends PreviewWidget {
    public static final /* synthetic */ int LLJIJIL = 0;
    public C754410TiZ LLILZ;
    public LiveMode LLIZ;
    public RoomCreateInfo LLIZLLLIL;
    public CreateInfoResponse.ResponseData LLJ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(68));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(67));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 184));

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i12;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final LiveWidget G1() {
        return (LiveWidget) this.LLILZLL.getValue();
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        if (C770730ULf.LJII(this.dataChannel)) {
            hide();
        } else {
            show();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        LiveMode liveModeLIZJ;
        super.E1();
        C486790J7d.LIZ.post(new ARunnableS112S0100000_12(this, 83), this);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_takepage_component_show");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJJII("cover", "component_name");
        DataChannel dataChannel = this.dataChannel;
        c474500IjALIZ.LJJII((dataChannel == null || (liveModeLIZJ = C751980Tee.LIZJ(dataChannel)) == null) ? null : C354201Zc.LIZ(liveModeLIZJ), "live_type");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C754410TiZ c754410TiZ = this.LLILZ;
        if (c754410TiZ != null) {
            C202139147l c202139147l = c754410TiZ.LIZIZ;
            if (c202139147l != null) {
                c202139147l.LIZ();
                c754410TiZ.LIZIZ = null;
            }
            c754410TiZ.LIZJ = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0077, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r1, r3) != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I1(com.bytedance.android.livesdkapi.depend.model.live.LiveMode r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            com.bytedance.android.livesdk.livesetting.broadcast.GameLiveWhiteListSetCoverEnableSetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.GameLiveWhiteListSetCoverEnableSetting.INSTANCE
            int r0 = r0.getValue()
            if (r0 <= 0) goto L11
            webcast.api.game.CreateInfoResponse$ResponseData r0 = r4.LLJ
            r4.J1(r5, r0)
            return
        L11:
            X.0Tiz r0 = X.EnumC754690Tj1.Companion
            r0.getClass()
            X.0Tj1 r0 = X.C754670Tiz.LIZ(r5)
            r3 = 0
            if (r0 == 0) goto L97
            com.bytedance.android.livesdk.model.Hashtag r2 = r0.getHashtag()
        L21:
            int[] r1 = X.C753210Tgd.LIZ
            int r0 = r5.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L54
            r0 = 2
            if (r1 == r0) goto L5e
            com.bytedance.ies.sdk.widgets.LiveWidget r0 = r4.G1()
            if (r0 == 0) goto L38
            r0.hide()
        L38:
            X.01GW r0 = r4.LLJI
            java.lang.Object r1 = r0.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L48
            r0 = 2131841283(0x7f115103, float:1.931587E38)
            r1.setText(r0)
        L48:
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r4.dataChannel
            if (r2 == 0) goto L53
            java.lang.Class<com.bytedance.android.livesdk.comp.api.game.ForceGameAutoCoverChannel> r1 = com.bytedance.android.livesdk.comp.api.game.ForceGameAutoCoverChannel.class
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.zW(r1, r0)
        L53:
            return
        L54:
            com.bytedance.ies.sdk.widgets.LiveWidget r0 = r4.G1()
            if (r0 == 0) goto L79
            r0.show()
            goto L79
        L5e:
            com.bytedance.ies.sdk.widgets.LiveWidget r0 = r4.G1()
            if (r0 == 0) goto L67
            r0.show()
        L67:
            if (r2 == 0) goto L95
            java.lang.Long r1 = r2.id
        L6b:
            com.bytedance.android.livesdk.model.Hashtag r0 = X.C754700Tj2.LIZ()
            if (r0 == 0) goto L73
            java.lang.Long r3 = r0.id
        L73:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r3)
            if (r0 == 0) goto L38
        L79:
            X.01GW r0 = r4.LLJI
            java.lang.Object r1 = r0.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L89
            r0 = 2131840618(0x7f114e6a, float:1.931452E38)
            r1.setText(r0)
        L89:
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r4.dataChannel
            if (r2 == 0) goto L53
            java.lang.Class<com.bytedance.android.livesdk.comp.api.game.ForceGameAutoCoverChannel> r1 = com.bytedance.android.livesdk.comp.api.game.ForceGameAutoCoverChannel.class
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.zW(r1, r0)
            return
        L95:
            r1 = r3
            goto L6b
        L97:
            r2 = r3
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.cover.PreviewCoverWidget.I1(com.bytedance.android.livesdkapi.depend.model.live.LiveMode):void");
    }

    public final void J1(LiveMode liveMode, CreateInfoResponse.ResponseData responseData) {
        if (liveMode == null || responseData == null) {
            return;
        }
        if (C754900TjM.LIZ(liveMode, responseData)) {
            LiveWidget liveWidgetG1 = G1();
            if (liveWidgetG1 != null) {
                liveWidgetG1.show();
            }
            TextView textView = (TextView) this.LLJI.getValue();
            if (textView != null) {
                textView.setText(2131840618);
            }
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.zW(ForceGameAutoCoverChannel.class, Boolean.TRUE);
                return;
            }
            return;
        }
        LiveWidget liveWidgetG12 = G1();
        if (liveWidgetG12 != null) {
            liveWidgetG12.hide();
        }
        TextView textView2 = (TextView) this.LLJI.getValue();
        if (textView2 != null) {
            textView2.setText(2131841283);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 == null) {
            return;
        }
        dataChannel2.zW(ForceGameAutoCoverChannel.class, Boolean.FALSE);
    }

    public final void H1(C754410TiZ c754410TiZ, int i, ImageModel imageModel, boolean z) {
        C1324720kZq c1324720kZq;
        View view = getView();
        TextView textView = null;
        if (view != null) {
            c1324720kZq = (C1324720kZq) view.findViewById(R.id.mvv);
        } else {
            c1324720kZq = null;
        }
        View view2 = getView();
        if (view2 != null) {
            textView = (TextView) view2.findViewById(R.id.zuu);
        }
        c754410TiZ.LIZJ(i, imageModel, z, c1324720kZq, textView, 102);
    }
}
