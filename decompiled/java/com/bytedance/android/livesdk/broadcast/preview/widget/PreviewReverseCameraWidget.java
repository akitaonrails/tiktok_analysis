package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C0IJT;
import X.C0UJY;
import X.C1276840jKc;
import X.C473410IhP;
import X.C474500IjA;
import X.C760180Trs;
import X.C770730ULf;
import X.InterfaceC772190UQv;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.SchemaReverseCameraEvent;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public class PreviewReverseCameraWidget extends PreviewToolBaseWidget {
    public int LLILZLL = 1;
    public final int LLIZ = 2131855746;
    public final int LLIZLLLIL = R.drawable.ekj;

    @Override // X.InterfaceC782830UnJ
    public final boolean LLLII() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final String y1() {
        return "flip_camera";
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer J1() {
        return Integer.valueOf(this.LLIZLLLIL);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public void onShow() {
        C760180Trs.LJIIJJI(this.dataChannel, "flip");
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        DataChannelGlobal.LLILZ.BQ2(this, this, SchemaReverseCameraEvent.class, new AwS591S0100000_12(this, 307));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        DataChannelGlobal.LLILZ.zQ2(this);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int O1() {
        return this.LLIZ;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public void onClick(View view) {
        int iIntValue = InterfaceC772190UQv.c3.LIZ().intValue();
        this.LLILZLL = iIntValue;
        W1(1 - iIntValue, CertProviderManagerKt.findCert("bpea-382", 1476788229));
    }

    public final void W1(int i, Cert cert) {
        this.LLILZLL = i;
        if (i == 1) {
            C1276840jKc.LIZ.getClass();
            C1276840jKc.LJJJLZIJ = 1;
        } else {
            C1276840jKc.LIZ.getClass();
            C1276840jKc.LJJJLZIJ = 2;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("camera_switch");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJIIJJI("live");
        c474500IjALIZ.LJIILL("click");
        c474500IjALIZ.LIZ();
        InterfaceC772190UQv.c3.LJ(Integer.valueOf(this.LLILZLL));
        C0UJY c0ujyLIZ = C770730ULf.LIZ(this.dataChannel);
        if (c0ujyLIZ != null) {
            c0ujyLIZ.LJJIIZ(i, cert);
        }
        C473410IhP.LIZJ(new Runnable() { // from class: X.0UJr
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PreviewReverseCameraWidget@5535.reverseCamera$1");
                try {
                    C768460UCm.LIZIZ().zr(false);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PreviewReverseCameraWidget@5535.reverseCamera$1");
            }
        }, 100L);
    }
}
