package com.bytedance.android.livesdk.widget;

import X.C0IJT;
import X.C0IXQ;
import X.C465900IOu;
import X.C467800IWc;
import X.C474500IjA;
import X.C784440Upu;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class LCCCloseWidget extends LiveWidget {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hzr;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        View view = getView();
        if (view != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 110), view);
        }
    }

    public final void x1() {
        C784440Upu.LIZ().LIZIZ(new C465900IOu(6));
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_exit_liveroom_click", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_10()));
        c474500IjALIZIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZIZ.LJJII(Integer.valueOf(C467800IWc.LJIJ.LJI() ? 1 : 0), C467800IWc.LJIJJLI);
        c474500IjALIZIZ.LJJII(C0IXQ.LIZIZ(), C467800IWc.LJIL);
        c474500IjALIZIZ.LIZ();
    }
}
