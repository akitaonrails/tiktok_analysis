package com.bytedance.android.livesdk.broadcast.preview.widget.livegoal;

import X.C497740JfY;
import X.C786410Ut5;
import Y.ARunnableS112S0100000_12;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.live.effect.api.LiveGoalHighLightEvent;
import com.bytedance.android.live.effect.api.LiveGoalOverlayEvent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewLiveGoalEffectWidget extends PreviewWidget {
    public View LLILZ;
    public View LLILZIL;
    public View LLILZLL;
    public View LLIZ;
    public View LLIZLLLIL;
    public boolean LLJ = true;
    public boolean LLJI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.h6p;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void G1() {
        View view = this.LLILZIL;
        if (view != null) {
            C786410Ut5.T4(view, 1.0f);
        }
        View view2 = this.LLILZLL;
        if (view2 != null) {
            C786410Ut5.T4(view2, 1.0f);
        }
        View view3 = this.LLILZIL;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(0, view3);
        }
        View view4 = this.LLILZLL;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(0, view4);
        }
        this.LLJI = true;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        View view;
        super.C1();
        View view2 = getView();
        this.LLILZ = view2 != null ? view2.findViewById(R.id.iuq) : null;
        View view3 = getView();
        this.LLILZIL = view3 != null ? view3.findViewById(R.id.yc5) : null;
        View view4 = getView();
        this.LLILZLL = view4 != null ? view4.findViewById(R.id.cfj) : null;
        View view5 = this.LLILZIL;
        if (view5 != null) {
            C786410Ut5.T4(view5, 0.0f);
        }
        View view6 = this.LLILZLL;
        if (view6 != null) {
            C786410Ut5.T4(view6, 0.0f);
        }
        View view7 = getView();
        this.LLIZ = view7 != null ? view7.findViewById(R.id.yaj) : null;
        View view8 = getView();
        this.LLIZLLLIL = view8 != null ? view8.findViewById(R.id.cdv) : null;
        View view9 = this.LLILZIL;
        if ((view9 != null ? view9.getHeight() : 0) > ((int) C497740JfY.LIZIZ(130.0f)) || (view = getView()) == null) {
            return;
        }
        HandlerHook.viewPost(view, new ARunnableS112S0100000_12(this, 84));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        DataChannel dataChannel = this.dataChannel;
        dataChannel.BQ2(this, LiveGoalHighLightEvent.class, new AwS591S0100000_12(this, 357));
        dataChannel.BQ2(this, LiveGoalOverlayEvent.class, new AwS591S0100000_12(this, 358));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        View view = getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS112S0100000_12(this, 85));
        }
    }
}
