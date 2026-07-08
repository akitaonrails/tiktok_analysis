package com.bytedance.android.livesdk.widget;

import X.C0IJT;
import X.C197039127h;
import X.C474500IjA;
import X.C475550Ikr;
import X.C497740JfY;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.feed.api.NearbyClearModelChannel;
import com.bytedance.android.livesdk.dataChannel.UserCloseEvent;
import com.bytedance.android.livesdk.livesetting.feed.LiveNearbyTabSetting;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveNearbyReturnBackWidget extends LiveRecyclableWidget {
    public String LL = "slide";

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hf_;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        this.dataChannel.zW(NearbyClearModelChannel.class, new C475550Ikr(false));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        this.LL = "slide";
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_nonearby_goback_show");
        c474500IjALIZ.LJJII("nearby_finish_page", "page_name");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LIZ();
        this.dataChannel.zW(NearbyClearModelChannel.class, new C475550Ikr(true));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        View view = getView();
        if (view != null) {
            C197039127h c197039127h = (C197039127h) view.findViewById(R.id.p4c);
            if (c197039127h != null) {
                c197039127h.LJJJJL(AFwS236S0000000_6.get$arr$(32));
                if (LiveNearbyTabSetting.INSTANCE.enable()) {
                    c197039127h.setText(C497740JfY.LJIJI(2131856831));
                    C786410Ut5.U8(c197039127h, new ACListenerS142S0100000_7(this, 112));
                } else {
                    c197039127h.setText(C497740JfY.LJIJI(2131856830));
                    C786410Ut5.U8(c197039127h, new ACListenerS142S0100000_7(this, 113));
                }
            }
            View viewFindViewById = view.findViewById(R.id.p3y);
            if (viewFindViewById != null) {
                C786410Ut5.I7(new ACListenerS142S0100000_7(this, 114), viewFindViewById);
            }
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 115), view);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        this.dataChannel.BQ2(this, UserCloseEvent.class, new AwS586S0100000_7(this, 191));
    }

    public final void x1(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_nonearby_goback_click");
        c474500IjALIZ.LJJII("nearby_finish_page", "page_name");
        c474500IjALIZ.LJJII(str, "button_name");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LIZ();
    }
}
