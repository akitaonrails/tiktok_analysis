package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C758220Toi;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.dataChannel.VisibleScopeSelectedChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class PreviewDescriptionWidget extends PreviewWidget {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i14;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        G1((C758220Toi) this.dataChannel.gg0(VisibleScopeSelectedChannel.class));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        this.dataChannel.EQ2(this, VisibleScopeSelectedChannel.class, new AwS586S0100000_7(this, 42));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G1(X.C758220Toi r6) {
        /*
            r5 = this;
            android.view.View r2 = r5.getView()
            boolean r0 = r2 instanceof X.C16F5
            r4 = 0
            if (r0 == 0) goto L7c
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L7c
            if (r6 == 0) goto L2e
            int r0 = r6.LIZ
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            if (r4 == 0) goto L2e
            int r0 = r4.intValue()
            if (r0 != 0) goto L2e
            X.C500260Jjc.LJIILIIL(r2)
        L20:
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r5.dataChannel
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r1 = X.C751980Tee.LIZJ(r0)
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.THIRD_PARTY
            if (r1 != r0) goto L2d
            X.C500260Jjc.LJIILIIL(r2)
        L2d:
            return
        L2e:
            r3 = 2131856060(0x7f118abc, float:1.934584E38)
            if (r4 == 0) goto L63
            int r1 = r4.intValue()
            r0 = 3
            if (r1 != r0) goto L41
            X.C500260Jjc.LLFFF(r2)
            r2.setText(r3)
            goto L20
        L41:
            int r1 = r4.intValue()
            r0 = 1
            if (r1 != r0) goto L52
            X.C500260Jjc.LLFFF(r2)
            r0 = 2131856061(0x7f118abd, float:1.9345843E38)
            r2.setText(r0)
            goto L20
        L52:
            int r1 = r4.intValue()
            r0 = 2
            if (r1 != r0) goto L63
            X.C500260Jjc.LLFFF(r2)
            r0 = 2131856062(0x7f118abe, float:1.9345845E38)
            r2.setText(r0)
            goto L20
        L63:
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostAction> r0 = com.bytedance.android.livesdkapi.host.IHostAction.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdkapi.host.IHostAction r0 = (com.bytedance.android.livesdkapi.host.IHostAction) r0
            boolean r0 = r0.isPrivateAccount()
            if (r0 == 0) goto L78
            X.C500260Jjc.LLFFF(r2)
            r2.setText(r3)
            goto L20
        L78:
            X.C500260Jjc.LJIILIIL(r2)
            goto L20
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.PreviewDescriptionWidget.G1(X.0Toi):void");
    }
}
