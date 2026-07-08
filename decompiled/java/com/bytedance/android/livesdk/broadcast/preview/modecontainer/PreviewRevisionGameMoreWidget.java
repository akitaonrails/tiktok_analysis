package com.bytedance.android.livesdk.broadcast.preview.modecontainer;

import X.C0UQX;
import X.C439101nJ;
import X.C500260Jjc;
import X.InterfaceC1106030et7;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.broadcast.PreviewMoreIsExpandDataGame;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewRevisionGameMoreWidget extends PreviewWidget {
    public ImageView LLILZ;
    public FrameLayout LLILZIL;
    public boolean LLILZLL;
    public Function0<? extends Map<String, Integer>> LLIZ = AFwS199S0000000_12.get$arr$(59);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hkz;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        View viewFindViewById;
        super.E1();
        View view = getView();
        this.LLILZIL = view != null ? (FrameLayout) view.findViewById(R.id.eqx) : null;
        View view2 = getView();
        this.LLILZ = view2 != null ? (ImageView) view2.findViewById(R.id.k24) : null;
        boolean zLJFF = Intrinsics.LJFF(InterfaceC1106030et7.H9.LIZ(), Boolean.TRUE);
        this.LLILZLL = zLJFF;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(PreviewMoreIsExpandDataGame.class, Boolean.valueOf(zLJFF));
        }
        if (this.LLILZLL) {
            ImageView imageView = this.LLILZ;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.f_p);
            }
        } else {
            ImageView imageView2 = this.LLILZ;
            if (imageView2 != null) {
                imageView2.setImageResource(R.drawable.f_o);
            }
        }
        View view3 = getView();
        if (view3 == null || (viewFindViewById = view3.findViewById(R.id.e0x)) == null) {
            return;
        }
        C500260Jjc.LJLIIIL(500L, viewFindViewById, new AwS591S0100000_12(this, 239));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean G1(float r5) {
        /*
            r4 = this;
            kotlin.jvm.functions.Function0<? extends java.util.Map<java.lang.String, java.lang.Integer>> r0 = r4.LLIZ
            java.lang.Object r1 = r0.invoke()
            java.util.Map r1 = (java.util.Map) r1
            r3 = 0
            if (r1 == 0) goto L4b
            java.lang.String r0 = "y"
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Exception -> L3e
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L3e
            if (r0 == 0) goto L28
            int r2 = r0.intValue()     // Catch: java.lang.Exception -> L3e
        L19:
            java.lang.String r0 = "height"
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Exception -> L3e
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L3e
            if (r0 == 0) goto L2c
            int r1 = r0.intValue()     // Catch: java.lang.Exception -> L3e
            goto L2d
        L28:
            r2 = 0
            if (r1 == 0) goto L2c
            goto L19
        L2c:
            r1 = 0
        L2d:
            if (r2 <= 0) goto L4b
            if (r1 <= 0) goto L4b
            float r0 = (float) r2     // Catch: java.lang.Exception -> L3e
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L4b
            int r2 = r2 + r1
            float r0 = (float) r2     // Catch: java.lang.Exception -> L3e
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 > 0) goto L4b
            r0 = 1
            return r0
        L3e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r1 = "PreviewRevisionGameMoreWidget"
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            X.C20441214yg.LJIIIZ(r1, r0)
        L4b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.modecontainer.PreviewRevisionGameMoreWidget.G1(float):boolean");
    }

    public final void onClick(View view) {
        FrameLayout frameLayout = this.LLILZIL;
        if (frameLayout != null) {
            C500260Jjc.LJJZ(C439101nJ.LIZ(16), frameLayout);
        }
        boolean z = !this.LLILZLL;
        this.LLILZLL = z;
        InterfaceC1106030et7.H9.LIZJ(Boolean.valueOf(z));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(PreviewMoreIsExpandDataGame.class, Boolean.valueOf(this.LLILZLL));
        }
        if (this.LLILZLL) {
            ImageView imageView = this.LLILZ;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.f_p);
            }
        } else {
            ImageView imageView2 = this.LLILZ;
            if (imageView2 != null) {
                imageView2.setImageResource(R.drawable.f_o);
            }
        }
        C0UQX.LJIILIIL(0, this.dataChannel, this.LLILZLL);
    }
}
