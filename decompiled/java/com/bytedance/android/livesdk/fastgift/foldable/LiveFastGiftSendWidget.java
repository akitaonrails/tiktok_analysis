package com.bytedance.android.livesdk.fastgift.foldable;

import X.C1135190fe9;
import X.C1135200feA;
import X.C1135220feC;
import X.C1135230feD;
import X.C1324720kZq;
import X.C16F5;
import X.C786410Ut5;
import Y.ACListenerS152S0100000_17;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.gift.GiftDialogVisibilityChannel;
import com.bytedance.android.livesdk.FastGiftSendWidgetShowEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveFastGiftSendWidget extends LiveRecyclableWidget {
    public C1135230feD LL;
    public boolean LLILLJJLI;
    public C1135220feC LLILLL = new C1135220feC();
    public C1135190fe9 LLILZ;
    public View LLILZIL;
    public C1324720kZq LLILZLL;
    public C16F5 LLIZ;
    public int LLIZLLLIL;
    public int LLJ;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hye;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        this.LL = null;
        this.LLILLL = new C1135220feC();
        C1135190fe9 c1135190fe9 = this.LLILZ;
        if (c1135190fe9 != null) {
            c1135190fe9.setPopupBounds(null);
        }
        View view = this.LLILZIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        super.hide();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        this.LL = null;
        this.LLILLJJLI = false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        C1135190fe9 c1135190fe9;
        View view = getView();
        if (view instanceof C1135190fe9) {
            c1135190fe9 = (C1135190fe9) view;
        } else {
            c1135190fe9 = null;
        }
        this.LLILZ = c1135190fe9;
        if (c1135190fe9 != null) {
            c1135190fe9.setOnOutsideTap(new C1135200feA(this));
            if (!this.LLILLJJLI) {
                this.LLILLJJLI = true;
                this.LLILZIL = c1135190fe9.findViewById(R.id.hph);
                this.LLILZLL = (C1324720kZq) c1135190fe9.findViewById(R.id.hpg);
                this.LLIZ = (C16F5) c1135190fe9.findViewById(R.id.hpf);
                View view2 = this.LLILZIL;
                if (view2 != null) {
                    C786410Ut5.I7(new ACListenerS152S0100000_17(this, 31), view2);
                }
            }
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.CQ2(FastGiftSendWidgetShowEvent.class, this, new AwS596S0100000_17(this, 117));
            dataChannel.BQ2(this, GiftDialogVisibilityChannel.class, new AwS596S0100000_17(this, 118));
        }
        super.hide();
    }
}
