package com.bytedance.android.livesdk.broadcast.interaction.widget;

import X.C0U9Q;
import X.C0UA3;
import X.C0UD4;
import X.C13LP;
import X.C500260Jjc;
import X.C768460UCm;
import X.C786410Ut5;
import X.InterfaceC768930UEh;
import X.InterfaceC769000UEo;
import Y.ACListenerS147S0100000_12;
import Y.ALAdapterS9S0200000_12;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.LiveBgDialogChannel;
import com.bytedance.android.live.broadcast.api.StickerShortcutPanelChannel;
import com.bytedance.android.live.effect.api.StickerPanelHideEvent;
import com.bytedance.android.live.effect.api.StickerPanelShowEvent;
import com.bytedance.android.live.effect.api.ToShowShortCutPanelPallet;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class ShortCutPanelPalletWidget extends LiveWidget {
    public ViewGroup LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i2b;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator interpolator;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.SX0(C0U9Q.class, Boolean.TRUE);
        }
        View view = getView();
        if (view == null || view.getVisibility() != 8) {
            AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(this, 165);
            View view2 = getView();
            if (view2 == null || (viewPropertyAnimatorAnimate = view2.animate()) == null || (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(0.0f)) == null || (duration = viewPropertyAnimatorAlpha.setDuration(350L)) == null || (interpolator = duration.setInterpolator(new LinearInterpolator())) == null) {
                return;
            }
            interpolator.setListener(new ALAdapterS9S0200000_12(awS556S0100000_12, this, 0));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (this.LLILLJJLI) {
            return;
        }
        InterfaceC769000UEo interfaceC769000UEoLIZIZ = C768460UCm.LIZIZ();
        String str = C0UD4.LIZIZ;
        LiveEffect liveEffect = (LiveEffect) C13LP.LJJJLL(interfaceC769000UEoLIZIZ.qr(str));
        InterfaceC768930UEh interfaceC768930UEh = (InterfaceC768930UEh) this.dataChannel.gg0(C0UA3.class);
        if (interfaceC768930UEh != null) {
            if (!interfaceC768930UEh.LJIIIIZZ(liveEffect)) {
                hide();
                return;
            }
            super.show();
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.SX0(C0U9Q.class, Boolean.FALSE);
            }
            C500260Jjc.LLFFF(this.LL);
            interfaceC768930UEh.LJI(null, str);
            ViewGroup viewGroup = this.LL;
            if (viewGroup != null) {
                interfaceC768930UEh.LJIIIZ(viewGroup, false);
            }
        }
    }

    public final void y1() {
        ViewGroup viewGroup;
        InterfaceC768930UEh interfaceC768930UEh = (InterfaceC768930UEh) this.dataChannel.gg0(C0UA3.class);
        if (interfaceC768930UEh == null || (viewGroup = this.LL) == null) {
            return;
        }
        interfaceC768930UEh.LIZLLL(C0UD4.LIZIZ, viewGroup);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        View view = getView();
        this.LL = view != null ? (ViewGroup) view.findViewById(R.id.q19) : null;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.SX0(C0U9Q.class, Boolean.TRUE);
        }
        super.hide();
        View view2 = getView();
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 132), view2);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.EQ2(this, StickerShortcutPanelChannel.class, new AwS591S0100000_12(this, 186));
            dataChannel2.EQ2(this, StickerPanelShowEvent.class, new AwS591S0100000_12(this, 187));
            dataChannel2.EQ2(this, StickerPanelHideEvent.class, new AwS591S0100000_12(this, 188));
            dataChannel2.EQ2(this, LiveBgDialogChannel.class, new AwS591S0100000_12(this, 189));
            dataChannel2.EQ2(this, ToShowShortCutPanelPallet.class, new AwS591S0100000_12(this, 190));
        }
    }
}
