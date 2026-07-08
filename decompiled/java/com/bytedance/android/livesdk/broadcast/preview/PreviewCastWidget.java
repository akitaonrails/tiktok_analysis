package com.bytedance.android.livesdk.broadcast.preview;

import X.C01GW;
import X.C0ULI;
import X.C0UQN;
import X.C0WZX;
import X.C1388190mED;
import X.C1701330uNH;
import X.C19EG;
import X.C2204961BRm;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C504210Jpz;
import X.C520010KaN;
import X.C781270Ukn;
import X.C786410Ut5;
import X.InterfaceC20622815ms;
import X.InterfaceC214902198i;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.dataChannel.LiveCastStateChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class PreviewCastWidget extends PreviewToolBaseWidget {
    public static final /* synthetic */ int LLJI = 0;
    public final int LLILZLL = 2131841784;
    public final int LLIZ = R.drawable.ek_;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 173));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 174));

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
        return Integer.valueOf(this.LLIZ);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.BQ2(this, this, LiveCastStateChannel.class, new AwS591S0100000_12(this, 236));
        W1(Intrinsics.LJFF(dataChannelGlobal.gg0(LiveCastStateChannel.class), Boolean.TRUE));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        DataChannelGlobal.LLILZ.zQ2(this);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int O1() {
        return this.LLILZLL;
    }

    public final void W1(boolean z) {
        int i;
        View view = (View) this.LLIZLLLIL.getValue();
        if (view != null && view.isSelected() == z) {
            return;
        }
        ImageView imageView = (ImageView) this.LLIZLLLIL.getValue();
        if (imageView != null) {
            imageView.setSelected(z);
        }
        TextView textView = (TextView) this.LLJ.getValue();
        if (textView != null) {
            if (z) {
                i = 2131841799;
            } else {
                i = this.LLILZLL;
            }
            textView.setText(C497740JfY.LJIJI(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public void onClick(View view) {
        boolean z;
        C19EG c19egLJ;
        Bundle bundle;
        Fragment fragment;
        if (C0UQN.LIZIZ()) {
            if (C504210Jpz.LIZ) {
                InterfaceC214902198i interfaceC214902198iCreateStartBroadcastFragment = C781270Ukn.LJIIJ().createStartBroadcastFragment(4);
                if (interfaceC214902198iCreateStartBroadcastFragment == 0) {
                    return;
                }
                if (!(interfaceC214902198iCreateStartBroadcastFragment instanceof Fragment) || (fragment = (Fragment) interfaceC214902198iCreateStartBroadcastFragment) == null || (bundle = fragment.getArguments()) == null) {
                    bundle = new Bundle();
                }
                C786410Ut5.LJJJI("screen_cast_type_from", "live_take_page_screen_share", bundle);
                C786410Ut5.LJJJI("request_page", (String) this.dataChannel.gg0(C0ULI.class), bundle);
                InterfaceC20622815ms interfaceC20622815msLIZ = C520010KaN.LIZ(C1388190mED.LIZ(this.context));
                if (interfaceC20622815msLIZ != null) {
                    C520010KaN.LJIIL(interfaceC20622815msLIZ, interfaceC214902198iCreateStartBroadcastFragment, -1, bundle, 0, null, 24);
                }
            } else {
                Context context = this.context;
                if (context != null && (c19egLJ = C500260Jjc.LJ(context)) != null) {
                    Intent intentCreateStartBroadcastIntent = C781270Ukn.LJIIJ().createStartBroadcastIntent(c19egLJ, 4);
                    Bundle bundle2 = new Bundle();
                    C786410Ut5.LJJJI("screen_cast_type_from", "live_take_page_screen_share", bundle2);
                    intentCreateStartBroadcastIntent.putExtras(bundle2);
                    Context context2 = this.context;
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context2, intentCreateStartBroadcastIntent, "Context_startActivity_1");
                    C1701330uNH.LIZ(intentCreateStartBroadcastIntent, context2);
                    C2204961BRm.LJJJJJL(context2, intentCreateStartBroadcastIntent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAft6PXzi9fWG5yDuY9Jclk8MpQ=", null));
                }
            }
        }
        DataChannel dataChannel = this.dataChannel;
        View view2 = (View) this.LLIZLLLIL.getValue();
        if (view2 != null && view2.isSelected()) {
            z = true;
        } else {
            z = false;
        }
        C0UQN.LIZJ(dataChannel, "live_take_page_mobile", true, z);
    }
}
