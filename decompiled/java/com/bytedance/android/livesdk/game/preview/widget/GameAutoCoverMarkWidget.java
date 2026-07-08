package com.bytedance.android.livesdk.game.preview.widget;

import X.C01GW;
import X.C452501pT;
import X.C500260Jjc;
import X.C5183020f;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.comp.api.game.ForceGameAutoCoverChannel;
import com.bytedance.android.livesdk.comp.api.game.GameAutoCoverChannel;
import com.bytedance.android.livesdk.dataChannel.BroadcastCoverData;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.GameLiveWhiteListSetCoverEnableSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class GameAutoCoverMarkWidget extends LiveWidget {
    public final C01GW LL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 296));

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hyq;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        View view = getView();
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        View viewFindViewById;
        super.onCreate();
        View view = getView();
        if (view != null && (viewFindViewById = view.findViewById(R.id.y1n)) != null) {
            C786410Ut5.T4(viewFindViewById, 0.1f);
        }
        View view2 = getView();
        if (view2 != null) {
            C786410Ut5.T4(view2, 0.0f);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, RoomCreateInfoChannel.class, new C5183020f(this, 226));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.EQ2(this, BroadcastCoverData.class, new AwS591S0100000_12(this, 970));
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.EQ2(this, GameAutoCoverChannel.class, new AwS591S0100000_12(this, 971));
        }
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            dataChannel4.EQ2(this, ForceGameAutoCoverChannel.class, new AwS591S0100000_12(this, 972));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        View view = getView();
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    public final void x1(boolean z) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        Object objGg0;
        View view;
        View view2;
        if (z && GameLiveWhiteListSetCoverEnableSetting.INSTANCE.getValue() > 0) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel == null || (objGg0 = dataChannel.gg0(LiveModeChannel.class)) == null) {
                objGg0 = LiveMode.VIDEO;
            }
            if ((objGg0 == LiveMode.THIRD_PARTY || objGg0 == LiveMode.SCREEN_RECORD) && (view = getView()) != null && !C500260Jjc.LJJJJIZL(view) && (view2 = getView()) != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
        }
        View view3 = getView();
        if (view3 != null && (viewPropertyAnimatorAnimate2 = view3.animate()) != null) {
            viewPropertyAnimatorAnimate2.cancel();
        }
        float f = 0.0f;
        Float fValueOf = null;
        if (!z) {
            View view4 = getView();
            if (view4 != null) {
                fValueOf = Float.valueOf(view4.getAlpha());
            }
            if (Intrinsics.LIZLLL(fValueOf, 0.0f)) {
                return;
            }
        } else if (z) {
            View view5 = getView();
            if (view5 != null) {
                fValueOf = Float.valueOf(view5.getAlpha());
            }
            if (Intrinsics.LIZLLL(fValueOf, 1.0f)) {
                return;
            }
        }
        View view6 = getView();
        if (view6 != null && (viewPropertyAnimatorAnimate = view6.animate()) != null) {
            if (z) {
                f = 1.0f;
            }
            ViewPropertyAnimator viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(f);
            if (viewPropertyAnimatorAlpha != null && (duration = viewPropertyAnimatorAlpha.setDuration(300L)) != null) {
                duration.start();
            }
        }
    }
}
