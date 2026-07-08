package com.bytedance.android.livesdk.widgets;

import X.C1088050eQ7;
import X.C1091400eVW;
import X.C1295960jpS;
import X.C16F5;
import X.C784440Upu;
import Y.ARunnableS117S0100000_17;
import Y.AfS186S0100000_17;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.gift.GiftDialogVisibilityChannel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveQuickChargeWidget extends LiveWidget {
    public C1295960jpS LL;
    public C1295960jpS LLILLJJLI;
    public C16F5 LLILLL;
    public boolean LLILZ;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hka;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        this.LL = (C1295960jpS) findViewById(R.id.sm9);
        this.LLILLJJLI = (C1295960jpS) findViewById(R.id.sm8);
        this.LLILLL = (C16F5) findViewById(R.id.sm7);
        C1295960jpS c1295960jpS = this.LL;
        if (c1295960jpS != null) {
            HandlerHook.viewPost(c1295960jpS, new ARunnableS117S0100000_17(this, 239));
        }
        this.dataChannel.BQ2(this, GiftDialogVisibilityChannel.class, new AwS596S0100000_17(this, 485));
        C784440Upu.LIZ().LIZJ(this, C1088050eQ7.class).LIZJ(new AfS186S0100000_17(this, 135));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C1091400eVW.LIZJ(this.LL, this.LLILLJJLI, this.LLILLL);
    }
}
