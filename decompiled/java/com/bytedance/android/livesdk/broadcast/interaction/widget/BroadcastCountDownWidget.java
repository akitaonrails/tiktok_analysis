package com.bytedance.android.livesdk.broadcast.interaction.widget;

import X.AnonymousClass0956;
import X.C0PEM;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.C343001Uu;
import X.C376790Epx;
import X.C5182020e;
import X.C817503Hh;
import X.InterfaceC357101a5;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes.dex */
public final class BroadcastCountDownWidget extends LiveWidget {
    public final InterfaceC357101a5 LL;

    public BroadcastCountDownWidget() {
        this(null);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.g12;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.widget.Widget
    public final boolean supportBatch() {
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        C376790Epx c376790Epx;
        super.onCreate();
        View view = getView();
        if ((view instanceof C376790Epx) && (c376790Epx = (C376790Epx) view) != null) {
            c376790Epx.setCountDownListener(new C5182020e(this, 75));
            getLifecycle().addObserver(new BroadcastCountDownView$startCountDown$1(c376790Epx));
            c376790Epx.LLILLL = 3;
            AnonymousClass0956 anonymousClass0956 = c376790Epx.LLILLJJLI;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            C817503Hh c817503Hh = C817503Hh.LL;
            C1DFH c1dfh = C0PEM.LIZ;
            c376790Epx.LLILLJJLI = C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C343001Uu(c376790Epx, null), 2);
        }
        show();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
    }

    public BroadcastCountDownWidget(InterfaceC357101a5 interfaceC357101a5) {
        this.LL = interfaceC357101a5;
    }
}
