package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C01GW;
import X.C0IJT;
import X.C0UQX;
import X.C1308910kAL;
import X.C1338270kvh;
import X.C20441214yg;
import X.C2188811AlT;
import X.C292401Bi;
import X.C354201Zc;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C474500IjA;
import X.C754700Tj2;
import X.C760180Trs;
import X.C766270U4b;
import X.C814420VxA;
import X.InterfaceC772390URp;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.GameLandScapeOrientationChannel;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewPagerSelectedGameItem;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public class PreviewChangeOrientationWidget extends PreviewToolBaseWidget {
    public boolean LLILZLL;
    public final C01GW LLIZ;
    public GameTag LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;

    @Override // X.InterfaceC782830UnJ
    public final boolean LLLII() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer J1() {
        return Integer.valueOf(this.LLJI);
    }

    public final void W1() {
        ImageView imageView;
        TextView textView;
        ImageView imageView2;
        TextView textView2;
        if (this.LLILZLL) {
            if (C760180Trs.LJI()) {
                X1(R.raw.icon_rotate_device);
            } else {
                View view = getView();
                if (view != null && (imageView2 = (ImageView) view.findViewById(R.id.widget_icon)) != null) {
                    imageView2.setImageResource(R.drawable.dsz);
                }
            }
            View view2 = getView();
            if (view2 != null && (textView2 = (TextView) view2.findViewById(R.id.z1c)) != null) {
                textView2.setText(2131843913);
            }
        } else {
            if (C760180Trs.LJI()) {
                X1(R.raw.icon_rotate_portrait);
            } else {
                View view3 = getView();
                if (view3 != null && (imageView = (ImageView) view3.findViewById(R.id.widget_icon)) != null) {
                    imageView.setImageResource(R.drawable.dt0);
                }
            }
            View view4 = getView();
            if (view4 != null && (textView = (TextView) view4.findViewById(R.id.z1c)) != null) {
                textView.setText(2131843914);
            }
        }
        InterfaceC772390URp.c.LJFF(Boolean.valueOf(this.LLILZLL));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(GameLandScapeOrientationChannel.class, Boolean.valueOf(this.LLILZLL));
        }
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public void onShow() {
        LiveMode liveMode;
        DataChannel dataChannel = this.dataChannel;
        C0UQX.LJIIIIZZ(this.dataChannel, "show", "landscape_tip_button", (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null) ? "" : C354201Zc.LIZ(liveMode));
    }

    public PreviewChangeOrientationWidget() {
        Boolean boolLIZIZ = InterfaceC772390URp.c.LIZIZ();
        this.LLILZLL = boolLIZIZ != null ? boolLIZIZ.booleanValue() : false;
        this.LLIZ = C292401Bi.LIZ(new AwS556S0100000_12(this, 176));
        this.LLJ = 2131843912;
        this.LLJI = R.drawable.dsz;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        W1();
        this.LLIZLLLIL = C754700Tj2.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreate() selectGameTag = ");
        sbLIZ.append(this.LLIZLLLIL);
        C20441214yg.LJIIIZ("PreviewChangeOrientationWidget", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, PreviewPagerSelectedGameItem.class, new AwS591S0100000_12(this, 260));
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int O1() {
        return this.LLJ;
    }

    public final void X1(int i) {
        ImageView imageView;
        TuxIconView tuxIconView;
        View view = getView();
        if (view != null && (imageView = (ImageView) view.findViewById(R.id.widget_icon)) != null) {
            Integer numLIZJ = null;
            if ((imageView instanceof TuxIconView) && (tuxIconView = (TuxIconView) imageView) != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = i;
                Context context = this.context;
                if (context != null) {
                    numLIZJ = C1308910kAL.LIZJ(R.attr.exp, context);
                }
                c419910GdJ.LIZLLL = numLIZJ;
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                tuxIconView.setTuxIcon(c419910GdJ);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public void onClick(View view) {
        int i;
        GameTag gameTag;
        int i2;
        if (((Boolean) this.LLIZ.getValue()).booleanValue() && (gameTag = this.LLIZLLLIL) != null && (i2 = gameTag.landscape) != 0) {
            Integer numValueOf = Integer.valueOf(i2);
            if (numValueOf != null) {
                if (numValueOf.intValue() == 1) {
                    C766270U4b.LIZLLL(2131841811);
                    return;
                } else {
                    if (numValueOf.intValue() != 2) {
                        return;
                    }
                    C766270U4b.LIZLLL(2131841818);
                    return;
                }
            }
            return;
        }
        boolean z = !this.LLILZLL;
        this.LLILZLL = z;
        Y1(z, true);
        W1();
        if (this.LLILZLL) {
            i = 2131841810;
        } else {
            i = 2131841817;
        }
        C766270U4b.LIZLLL(i);
    }

    public final void Y1(boolean z, boolean z2) {
        String strLIZ;
        String str;
        String str2;
        LiveMode liveMode;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null) {
            strLIZ = C354201Zc.LIZ(liveMode);
        } else {
            strLIZ = "";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_takepage_orientation_click");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJJII(strLIZ, "live_type");
        if (z) {
            str = "landscape";
        } else {
            str = "portrait";
        }
        c474500IjALIZ.LJJII(str, "action_result");
        if (z2) {
            str2 = "click";
        } else {
            str2 = "auto";
        }
        c474500IjALIZ.LJJII(str2, "action_type");
        c474500IjALIZ.LIZ();
    }
}
