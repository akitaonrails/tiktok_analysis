package com.bytedance.android.livesdk.game.broadcast.widget;

import X.C11JF;
import X.C1701940uOG;
import X.C19490011Na;
import X.C20736316Cj;
import Y.AfS181S0100000_12;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public final class DualDevicePauseWidget extends LiveRecyclableWidget {
    public long LL;
    public TextView LLILLJJLI;
    public C11JF LLILLL;
    public boolean LLILZ;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.gz0;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C11JF c11jf = this.LLILLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
    }

    public DualDevicePauseWidget(long j) {
        this.LL = j;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        TextView textView;
        View view = getView();
        if (view != null) {
            view.setBackgroundColor(C20736316Cj.LIZIZ(R.attr.c_h, this.context));
        }
        View view2 = getView();
        if (view2 != null) {
            textView = (TextView) view2.findViewById(R.id.zfw);
        } else {
            textView = null;
        }
        this.LLILLJJLI = textView;
        if (this.LL <= 0) {
            this.LL = 300L;
        }
        this.LLILLL = (C11JF) C19490011Na.LIZLLL(1L, this.LL, 0L, 1L, TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS181S0100000_12(this, 163));
    }
}
