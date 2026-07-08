package com.bytedance.android.livesdk.chatroom.widget;

import X.C01GW;
import X.C452501pT;
import X.C497740JfY;
import X.C786410Ut5;
import Y.ACListenerS152S0100000_17;
import Y.AObjectS392S0100000_17;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.LandscapePinchTimesChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class PinchTimesWidget extends LiveRecyclableWidget {
    public TextView LLILLJJLI;
    public boolean LLILLL;
    public Function0<Unit> LLILZIL;
    public float LL = 1.0f;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 132));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(38));
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(39));

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.gx4;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.LLILZIL = null;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        TextView textView;
        View view = getView();
        ViewGroup.LayoutParams layoutParams = null;
        if (view != null) {
            textView = (TextView) view.findViewById(R.id.qhl);
        } else {
            textView = null;
        }
        this.LLILLJJLI = textView;
        View view2 = getView();
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS152S0100000_17(this, 30), view2);
        }
        View view3 = getView();
        if (view3 != null) {
            layoutParams = view3.getLayoutParams();
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(C497740JfY.LJIJ() / 2);
            View view4 = getView();
            if (view4 != null) {
                C786410Ut5.W5(view4, layoutParams);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, LandscapePinchTimesChannel.class, new AwS596S0100000_17(this, 104));
        }
    }

    public final void x1(String str, AObjectS392S0100000_17 aObjectS392S0100000_17, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        float f;
        if (this.LLILLL != z) {
            View view = getView();
            if (view != null) {
                layoutParams = view.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (z) {
                    f = 104.0f;
                } else {
                    f = 16.0f;
                }
                marginLayoutParams.topMargin = (int) C497740JfY.LIZIZ(f);
                View view2 = getView();
                if (view2 != null) {
                    C786410Ut5.W5(view2, layoutParams);
                }
            }
            if (z) {
                TextView textView = this.LLILLJJLI;
                if (textView != null) {
                    textView.setBackgroundResource(R.drawable.e2h);
                }
            } else {
                TextView textView2 = this.LLILLJJLI;
                if (textView2 != null) {
                    textView2.setBackgroundResource(R.drawable.e2i);
                }
            }
            this.LLILLL = z;
        }
        TextView textView3 = this.LLILLJJLI;
        if (textView3 != null) {
            textView3.setText(str);
        }
        this.LLILZIL = aObjectS392S0100000_17;
    }
}
